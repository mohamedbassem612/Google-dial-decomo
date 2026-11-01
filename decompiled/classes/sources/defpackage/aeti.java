package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aeti implements defpackage.aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.aoin a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ aeti(defpackage.ahbq ahbqVar, defpackage.aoin aoinVar, defpackage.jdh jdhVar, int i) {
        this.$cid = i;
        this.b = ahbqVar;
        this.a = aoinVar;
        this.c = jdhVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ahzi, java.lang.Object] */
    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        if (this.$cid == 0) {
            int i = defpackage.aetl.f;
            return (defpackage.aesx) (((java.lang.Boolean) this.b.a()).booleanValue() ? this.c.eZ() : this.a.a());
        }
        defpackage.aazt aaztVarJ = ((defpackage.ahbq) this.b).j();
        aaztVarJ.b();
        aaztVarJ.a = "2980497257637671193";
        java.lang.Object objA = this.a.a();
        defpackage.aooh.e(objA, "get(...)");
        aaztVarJ.c = new jdi(((java.lang.Number) objA).longValue(), (defpackage.aoln) null);
        java.lang.Object obj = this.c;
        defpackage.aooh.f(obj, "availability");
        aaztVarJ.b = new defpackage.gbp(obj, 5, (boolean[]) null);
        return aaztVarJ.a();
    }

    public /* synthetic */ aeti(defpackage.aoin aoinVar, defpackage.ahzi ahziVar, defpackage.aoin aoinVar2, int i) {
        this.$cid = i;
        this.b = aoinVar;
        this.c = ahziVar;
        this.a = aoinVar2;
    }
}
