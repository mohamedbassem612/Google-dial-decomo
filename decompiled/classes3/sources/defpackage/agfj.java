package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agfj {
    public static final defpackage.agfj a = new defpackage.agfj(new java.util.concurrent.ThreadPoolExecutor(1, 1, 0L, java.util.concurrent.TimeUnit.SECONDS, (java.util.concurrent.BlockingQueue<java.lang.Runnable>) new java.util.concurrent.ArrayBlockingQueue(50), (java.util.concurrent.ThreadFactory) new eul(2, (byte[]) null)));
    public final java.util.concurrent.Executor b;

    private agfj(java.util.concurrent.Executor executor) {
        this.b = executor;
    }
}
