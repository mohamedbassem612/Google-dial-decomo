package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gfq {
    public final long[] b;
    public final boolean[] c;
    public volatile boolean d;
    public volatile boolean f;
    public final java.util.concurrent.locks.ReentrantLock a = new java.util.concurrent.locks.ReentrantLock();
    public final java.util.concurrent.locks.ReentrantLock e = new java.util.concurrent.locks.ReentrantLock();

    public gfq(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
    }
}
