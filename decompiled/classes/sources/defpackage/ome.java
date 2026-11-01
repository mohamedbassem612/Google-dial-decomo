package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ome implements defpackage.ahlb {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    public final java.lang.Object b;

    public ome(defpackage.aoss aossVar, defpackage.jbm jbmVar, int i) {
        this.$cid = i;
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(jbmVar, "beeslySettings");
        this.b = aossVar;
        this.a = jbmVar;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [aoss, java.lang.Object] */
    @Override // defpackage.ahlb
    public final defpackage.ajcq a() {
        if (this.$cid != 0) {
            return defpackage.aosv.F(this.b, 0, new defpackage.icp(this, (defpackage.aoln) null, 15), 3);
        }
        return ((defpackage.aogc) this.a).bl(new defpackage.jsd(this, 16));
    }

    public ome(defpackage.aogc aogcVar, defpackage.rlv rlvVar, int i) {
        this.$cid = i;
        this.a = aogcVar;
        this.b = rlvVar;
    }
}
