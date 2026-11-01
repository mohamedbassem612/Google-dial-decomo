package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class abqt extends java.lang.Exception {
    public abqt(java.lang.Thread thread, java.lang.Throwable th) {
        java.lang.Object blocker = java.util.concurrent.locks.LockSupport.getBlocker(thread);
        java.lang.Thread.State state = thread.getState();
        java.lang.String strValueOf = java.lang.String.valueOf(thread);
        java.lang.String strConcat = state == null ? "" : " in state ".concat(state.toString());
        java.lang.String strConcat2 = blocker == null ? "" : " blocked on ".concat(blocker.toString());
        java.lang.Thread threadB = b(blocker);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(strValueOf);
        sb.append(strConcat);
        sb.append(strConcat2);
        sb.append(threadB != null ? " (see cause for owner state)" : "");
        java.lang.String string = sb.toString();
        java.lang.StackTraceElement[] stackTrace = thread.getStackTrace();
        java.lang.Thread threadB2 = b(java.util.concurrent.locks.LockSupport.getBlocker(thread));
        th = threadB2 != null ? a(threadB2, th) : th;
        super(string);
        if (th != null) {
            initCause(th);
        }
        setStackTrace(stackTrace);
    }

    public static defpackage.abqt a(java.lang.Thread thread, java.lang.Throwable th) {
        java.lang.String name = thread.getName();
        if (name.startsWith("Lite")) {
            return new defpackage.abqs(thread, th);
        }
        if (name.startsWith("BG")) {
            return new defpackage.abqq(thread, th);
        }
        return name.startsWith("Blocking") ? new defpackage.abqr(thread, th) : new defpackage.abqt(thread, th);
    }

    static java.lang.Thread b(java.lang.Object obj) {
        if (!(obj instanceof java.util.concurrent.locks.AbstractOwnableSynchronizer)) {
            return null;
        }
        try {
            java.lang.reflect.Method declaredMethod = java.util.concurrent.locks.AbstractOwnableSynchronizer.class.getDeclaredMethod("getExclusiveOwnerThread", null);
            declaredMethod.setAccessible(true);
            return (java.lang.Thread) declaredMethod.invoke(obj, null);
        } catch (java.lang.ClassCastException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable fillInStackTrace() {
        return this;
    }
}
