package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afjm {
    static volatile java.util.concurrent.Executor a;
    private static final java.lang.Object b = new java.lang.Object();

    public static java.util.concurrent.Executor a() {
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    a = new java.util.concurrent.ThreadPoolExecutor(1, 3, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new defpackage.afjl(0));
                    ((java.util.concurrent.ThreadPoolExecutor) a).allowCoreThreadTimeOut(true);
                }
            }
        }
        return a;
    }
}
