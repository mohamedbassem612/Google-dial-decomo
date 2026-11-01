package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
abstract class aoeq implements java.lang.Runnable {
    final /* synthetic */ defpackage.aoer b;

    public aoeq(defpackage.aoer aoerVar) {
        j$.util.Objects.requireNonNull(aoerVar);
        this.b = aoerVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.b.f == null) {
                throw new java.io.IOException("Unable to perform write due to unavailable sink.");
            }
            a();
        } catch (java.lang.Exception e) {
            this.b.c.e(e);
        }
    }
}
