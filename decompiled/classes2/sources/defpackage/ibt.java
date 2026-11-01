package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ibt {
    public static final aimz a = aimz.i("com/android/dialer/audio/impl/tidepods/DedupingFlowController");
    public final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final ajas d;
    private final ajct e;

    public ibt(ajas ajasVar, ajct ajctVar) {
        this.d = ajasVar;
        this.e = ajctVar;
    }

    public final void a() {
        if (this.b.getAndSet(true)) {
            this.c.set(true);
            return;
        }
        try {
            ahvr.J(this.d.a(), new pgr(this, 1), this.e);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException(e);
        }
    }
}
