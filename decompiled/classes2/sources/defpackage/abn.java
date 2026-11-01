package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abn {
    private static final android.os.Handler a = new android.os.Handler(android.os.Looper.getMainLooper());

    public static void a() {
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("Not running on main thread when it is required to");
        }
    }

    public static void b(java.lang.Runnable runnable) {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }
}
