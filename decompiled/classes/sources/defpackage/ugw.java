package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ugw implements defpackage.aoin {
    public final /* synthetic */ defpackage.oko a;
    public final /* synthetic */ defpackage.aoin b;
    public final /* synthetic */ defpackage.ugu c;
    public final /* synthetic */ defpackage.ahbq d;

    public /* synthetic */ ugw(defpackage.ahbq ahbqVar, defpackage.oko okoVar, defpackage.aoin aoinVar, defpackage.ugu uguVar) {
        this.d = ahbqVar;
        this.a = okoVar;
        this.b = aoinVar;
        this.c = uguVar;
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        defpackage.aazt aaztVarJ = this.d.j();
        aaztVarJ.b();
        aaztVarJ.a = "14093167251235428823";
        java.lang.Object objA = this.b.a();
        defpackage.aooh.e(objA, "get(...)");
        aaztVarJ.c = new defpackage.ugx(this.a, ((java.lang.Number) objA).longValue(), null);
        defpackage.ugu uguVar = this.c;
        defpackage.aooh.f(uguVar, "availability");
        aaztVarJ.b = new defpackage.dsm((java.lang.Object) uguVar, 7, (byte[][]) null);
        return aaztVarJ.a();
    }
}
