package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adar implements defpackage.amyv {
    private final /* synthetic */ int $cid;
    private final defpackage.amyz a;
    private final defpackage.amyz b;
    private final java.lang.Object c;

    public adar(defpackage.adao adaoVar, defpackage.amyz amyzVar, defpackage.amyz amyzVar2, int i) {
        this.$cid = i;
        this.c = adaoVar;
        this.a = amyzVar;
        this.b = amyzVar2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [amyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.aoin, defpackage.aoim
    public final /* synthetic */ java.lang.Object a() {
        if (this.$cid != 0) {
            defpackage.afhf afhfVar = (defpackage.afhf) this.c.a();
            return new defpackage.adbo(afhfVar, (java.util.concurrent.Executor) this.a.a(), defpackage.ahyw.b);
        }
        defpackage.amyz amyzVar = this.b;
        android.content.Context contextA = ((defpackage.adaf) this.a).a();
        defpackage.ahyn ahynVar = (defpackage.ahyn) amyzVar.a();
        java.util.regex.Pattern pattern = defpackage.afej.a;
        defpackage.afei afeiVar = new defpackage.afei(contextA);
        afeiVar.e("mdd_pds_config");
        afeiVar.f(defpackage.abrz.O("LoggingState", ahynVar));
        android.net.Uri uriA = afeiVar.a();
        defpackage.afgo afgoVarA = defpackage.afgp.a();
        afgoVarA.e(uriA);
        afgoVarA.d(defpackage.acwd.a);
        afgoVarA.f(false);
        defpackage.adao adaoVar = (defpackage.adao) this.c;
        defpackage.afgq afgqVarD = defpackage.afgs.d(contextA, adaoVar.b);
        afgqVarD.c = defpackage.abrz.G("gms_icing_mdd_network_usage_monitor", ahynVar);
        afgqVarD.b();
        afgqVarD.e(new defpackage.adbn());
        afgoVarA.b(afgqVarD.a());
        defpackage.afhf afhfVarK = ((defpackage.ahbz) adaoVar.a).k(afgoVarA.a());
        defpackage.aooc.ap(afhfVarK);
        return afhfVarK;
    }

    public adar(defpackage.amyz amyzVar, defpackage.amyz amyzVar2, defpackage.amyz amyzVar3, int i) {
        this.$cid = i;
        this.c = amyzVar;
        this.b = amyzVar2;
        this.a = amyzVar3;
    }
}
