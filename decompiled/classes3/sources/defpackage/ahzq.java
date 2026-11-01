package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahzq extends java.lang.RuntimeException {
    private ahzq(java.lang.Exception exc) {
        super("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", exc);
    }

    public static java.lang.Object c(java.util.concurrent.Callable callable) {
        try {
            return callable.call();
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new defpackage.ahzq(e2);
        }
    }

    private static java.lang.ClassCastException e(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        java.lang.ClassCastException classCastException = new java.lang.ClassCastException(java.lang.String.format(str, objArr));
        classCastException.initCause(th);
        return classCastException;
    }

    @java.lang.SafeVarargs
    private static void f(java.lang.String str, java.lang.Class... clsArr) {
        java.lang.Class cls = clsArr[0];
        ahvr.bW(!java.lang.RuntimeException.class.isAssignableFrom(cls), "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", str, cls);
    }

    @Override // java.lang.Throwable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized java.lang.Exception getCause() {
        return (java.lang.Exception) j$.util.Objects.requireNonNull(super.getCause());
    }

    public final java.lang.Exception b(java.lang.Class cls) {
        f("getCause", cls);
        if (cls.isInstance(getCause())) {
            return (java.lang.Exception) cls.cast(getCause());
        }
        throw e(getCause(), "getCause(%s) doesn't match underlying exception", cls);
    }

    public final java.lang.RuntimeException d(java.lang.Class cls) {
        f("rethrow", cls);
        ahzn.b(getCause(), cls);
        throw e(getCause(), "rethrow(%s) doesn't match underlying exception", cls);
    }
}
