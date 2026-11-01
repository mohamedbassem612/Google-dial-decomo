package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qyo extends amzm {
    private final amzg b;
    private final amzg c;

    public qyo(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.qyo.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aify<defpackage.qxp> aifyVar = (aify) list.get(0);
        java.lang.String str = (java.lang.String) list.get(1);
        aooh.f(aifyVar, "culdesacCategoriesEligibleForDisplay");
        aooh.f(str, "callIdString");
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aifyVar, 10));
        for (defpackage.qxp qxpVar : aifyVar) {
            akzx akzxVarM = defpackage.qyl.a.m();
            aooh.f(akzxVarM, "builder");
            aooh.c(qxpVar);
            aooh.f(qxpVar, "value");
            akzxVarM.u();
            defpackage.qyl qylVar = (defpackage.qyl) akzxVarM.b;
            j$.util.Objects.requireNonNull(qxpVar);
            qylVar.c = qxpVar;
            qylVar.b |= 1;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            arrayList.add((defpackage.qyl) aladVarP);
        }
        akzx akzxVarM2 = defpackage.qyr.a.m();
        aooh.f(akzxVarM2, "builder");
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.qyr) akzxVarM2.b).b);
        aooh.e(listUnmodifiableList, "getCategoryButtonsList(...)");
        new alct(listUnmodifiableList);
        akzxVarM2.u();
        defpackage.qyr qyrVar = (defpackage.qyr) akzxVarM2.b;
        alat alatVar = qyrVar.b;
        if (!alatVar.c()) {
            qyrVar.b = alad.J(alatVar);
        }
        akyl.i(arrayList, qyrVar.b);
        aooh.f(str, "value");
        akzxVarM2.u();
        defpackage.qyr qyrVar2 = (defpackage.qyr) akzxVarM2.b;
        j$.util.Objects.requireNonNull(str);
        qyrVar2.c = str;
        alad aladVarP2 = akzxVarM2.p();
        aooh.e(aladVarP2, "build(...)");
        return aiql.z((defpackage.qyr) aladVarP2);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
