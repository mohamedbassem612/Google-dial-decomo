package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wip implements oqk {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    private final java.lang.Object b;

    public wip(aoss aossVar, defpackage.rju rjuVar, int i) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        this.b = aossVar;
        this.a = rjuVar;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v3, types: [aoss, java.lang.Object] */
    public final ajcq a() {
        if (this.$cid != 0) {
            return aosv.F((aoss) this.b, 0, new defpackage.ryc(this, (aoln) null, 4), 3);
        }
        defpackage.wpx wpxVar = (defpackage.wpx) this.a;
        ajcq ajcqVarB = wpxVar.b();
        ajcq ajcqVarC = wpxVar.c();
        ajcq ajcqVarA = wpxVar.a();
        return ahvr.ak(new ajcq[]{ajcqVarB, ajcqVarC, ajcqVarA}).o(new defpackage.tbb((java.lang.Object) ajcqVarB, ajcqVarC, ajcqVarA, 20), (java.util.concurrent.Executor) this.b);
    }

    public wip(defpackage.wpx wpxVar, ajct ajctVar, int i) {
        this.$cid = i;
        this.a = wpxVar;
        this.b = ajctVar;
    }
}
