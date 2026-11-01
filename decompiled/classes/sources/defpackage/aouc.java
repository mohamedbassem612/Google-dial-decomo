package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aouc extends java.util.concurrent.CancellationException implements defpackage.aosm {
    private final transient defpackage.aoub a;

    public aouc(java.lang.String str, java.lang.Throwable th, defpackage.aoub aoubVar) {
        super(str);
        this.a = aoubVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.aosm
    public final /* bridge */ /* synthetic */ java.lang.Throwable a() {
        if (!defpackage.aosu.a) {
            return null;
        }
        java.lang.String message = getMessage();
        defpackage.aooh.c(message);
        return new defpackage.aouc(message, this, b());
    }

    public final defpackage.aoub b() {
        defpackage.aoub aoubVar = this.a;
        return aoubVar == null ? defpackage.aour.a : aoubVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aouc) {
            defpackage.aouc aoucVar = (defpackage.aouc) obj;
            if (defpackage.aooh.n(aoucVar.getMessage(), getMessage()) && defpackage.aooh.n(aoucVar.b(), b()) && defpackage.aooh.n(aoucVar.getCause(), getCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        if (defpackage.aosu.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        java.lang.String message = getMessage();
        defpackage.aooh.c(message);
        int iHashCode = (message.hashCode() * 31) + b().hashCode();
        java.lang.Throwable cause = getCause();
        return (iHashCode * 31) + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return super.toString() + "; job=" + b();
    }
}
