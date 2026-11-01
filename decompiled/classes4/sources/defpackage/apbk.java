package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apbk {
    public static final java.util.Collection a;

    static {
        kotlinx.coroutines.CoroutineExceptionHandler.class.getClassLoader();
        a = aooc.k(aooc.f(java.util.Collections.singletonList(kotlinx.coroutines.android.AndroidExceptionPreHandler.class.getDeclaredConstructor(null).newInstance(null)).iterator()));
    }

    public static final void a(java.lang.Throwable th) {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        try {
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        } catch (java.lang.Throwable unused) {
        }
    }
}
