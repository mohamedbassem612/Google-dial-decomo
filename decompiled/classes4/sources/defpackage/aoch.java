package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoch implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;
    private final java.lang.Object b;

    public aoch(ajcq ajcqVar, aosb aosbVar, int i) {
        this.$cid = i;
        aooh.f(ajcqVar, "futureToObserve");
        this.a = ajcqVar;
        this.b = aosbVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aosb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ajcq, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aoln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [aosb, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        ?? r1 = this.a;
        if (i == 0) {
            ((defpackage.anmo) r1).j((java.lang.Throwable) this.b);
        } else {
            if (r1.isCancelled()) {
                this.b.g((java.lang.Throwable) null);
                return;
            }
            try {
                ?? r0 = this.b;
                int i2 = dsc.c;
                r0.w(a.h((java.util.concurrent.Future) r1));
            } catch (java.util.concurrent.ExecutionException e) {
                this.b.w(aooc.ae(yt.h(e)));
            }
        }
    }

    public aoch(defpackage.anmo anmoVar, java.lang.Throwable th, int i) {
        this.$cid = i;
        this.a = anmoVar;
        this.b = th;
    }
}
