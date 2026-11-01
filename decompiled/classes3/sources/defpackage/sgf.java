package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sgf implements rvd {
    private final /* synthetic */ int $cid;
    public final android.content.Context a;
    public final java.lang.Object b;
    private final java.lang.Object c;

    public sgf(android.content.Context context, sah sahVar, aoss aossVar, int i) {
        this.$cid = i;
        aooh.f(context, "appContext");
        aooh.f(aossVar, "lightweightScope");
        this.a = context;
        this.b = sahVar;
        this.c = aossVar;
    }

    public final android.content.Intent a() {
        if (this.$cid != 0) {
            return afsq.bP();
        }
        throw new java.lang.IllegalStateException("This method is not expected to be called");
    }

    public final aw b() {
        if (this.$cid != 0) {
            return jrr.aW();
        }
        defpackage.sfp sfpVar = new defpackage.sfp();
        amxr.g(sfpVar);
        return sfpVar;
    }

    public final /* synthetic */ aw c(defpackage.rvq rvqVar) {
        return this.$cid != 0 ? jrr.aW() : b();
    }

    public final ajcq d() {
        return this.$cid != 0 ? afsq.bQ() : afsq.cj();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq e() {
        if (this.$cid == 0) {
            return aosv.C(aoov.am((aoss) this.c, 0, new defpackage.sge(this, (aoln) null, 0), 3));
        }
        tcc tccVar = (tcc) this.b;
        return ahvr.H(aosv.F(tccVar.a, 0, new defpackage.sfo(tccVar, (aoln) null, 13), 3), new hup(this, 19), (java.util.concurrent.Executor) this.c);
    }

    public sgf(android.content.Context context, tcc tccVar, ajct ajctVar, int i) {
        this.$cid = i;
        this.a = context;
        this.b = tccVar;
        this.c = ajctVar;
    }
}
