package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gyk implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    final java.lang.Object a;
    final java.lang.Object b;

    public gyk(defpackage.ajcq ajcqVar, defpackage.aosb aosbVar, int i) {
        this.$cid = i;
        if (ajcqVar == null) {
            defpackage.aooh.i("futureToObserve");
        }
        this.a = ajcqVar;
        this.b = aosbVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [aoln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [ajcq, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v7, types: [aosb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ajcq, aosb, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v11, types: [aoln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [aosb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [aoln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [aosb, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            try {
                this.b.run();
                java.lang.Object obj = this.a;
                synchronized (((defpackage.gyl) obj).a) {
                    ((defpackage.gyl) obj).a();
                }
                return;
            } catch (java.lang.Throwable th) {
                java.lang.Object obj2 = this.a;
                synchronized (((defpackage.gyl) obj2).a) {
                    ((defpackage.gyl) obj2).a();
                    throw th;
                }
            }
        }
        if (i == 1) {
            ?? r0 = this.a;
            if (r0.isCancelled()) {
                this.b.g(null);
                return;
            }
            try {
                this.b.w(defpackage.gvf.b(r0));
                return;
            } catch (java.util.concurrent.ExecutionException e) {
                ?? r4 = this.b;
                java.lang.Throwable thC = defpackage.gvf.c(e);
                if (thC == null) {
                    defpackage.aooh.i("exception");
                }
                r4.w(new defpackage.aoiv(thC));
                return;
            }
        }
        ?? r1 = this.a;
        if (i == 2) {
            r1.f((defpackage.aosp) this.b, defpackage.aojh.a);
        } else {
            if (r1.isCancelled()) {
                this.b.g(null);
                return;
            }
            try {
                this.b.w(defpackage.a.h(r1));
            } catch (java.util.concurrent.ExecutionException e2) {
                ?? r5 = this.b;
                java.lang.Throwable thE = defpackage.aosv.E(e2);
                if (thE == null) {
                    defpackage.aooh.i("exception");
                }
                r5.w(new defpackage.aoiv(thE));
            }
        }
    }

    public gyk(defpackage.aosp aospVar, defpackage.aosb aosbVar, int i) {
        this.$cid = i;
        this.b = aospVar;
        this.a = aosbVar;
    }

    public gyk(defpackage.gyl gylVar, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.a = gylVar;
        this.b = runnable;
    }

    public gyk(defpackage.ajcq ajcqVar, defpackage.aosb aosbVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = ajcqVar;
        this.b = aosbVar;
    }
}
