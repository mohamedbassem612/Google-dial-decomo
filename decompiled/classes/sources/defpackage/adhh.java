package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adhh {
    private volatile boolean a;

    public final void a() {
        if (java.lang.Thread.interrupted() || this.a) {
            throw new java.util.concurrent.CancellationException();
        }
    }

    public final void b() {
        this.a = true;
    }
}
