package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class teg implements olu {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    private final java.lang.Object b;

    public teg(agze agzeVar, aoss aossVar, int i) {
        this.$cid = i;
        aooh.f(agzeVar, "flippablesCallScopePsdCache");
        aooh.f(aossVar, "lightweightScope");
        this.a = agzeVar;
        this.b = aossVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a() {
        if (this.$cid != 0) {
            return ahvr.H(((defpackage.kxk) aooc.ar(((defpackage.afpl) this.a).Y(), defpackage.kxk.class)).K(), new kwz(11), (java.util.concurrent.Executor) this.b);
        }
        return aosv.F((aoss) this.b, 0, new defpackage.sfo(this, (aoln) null, 15), 3);
    }

    public teg(defpackage.afpl afplVar, ajct ajctVar, int i) {
        this.$cid = i;
        this.a = afplVar;
        this.b = ajctVar;
    }
}
