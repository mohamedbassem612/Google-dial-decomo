package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajvv {
    public static final java.util.concurrent.Executor a = new defpackage.so(6);

    public static java.util.concurrent.ExecutorService a() {
        return new java.util.concurrent.ThreadPoolExecutor(0, 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new defpackage.aaiv("firebase-iid-executor"));
    }
}
