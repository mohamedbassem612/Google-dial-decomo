package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahcr implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ ahcr(ajsy ajsyVar, java.lang.String str, int i, ahct ahctVar, int i2) {
        this.$cid = i2;
        this.b = ajsyVar;
        this.c = str;
        this.a = i;
        this.d = ahctVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [bcw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.Set] */
    public final java.lang.Object a(java.lang.Object obj) {
        akzc akzcVar;
        if (this.$cid != 0) {
            ((bew) this.b).e((bcw) this.d, ((aoor) this.c).a, this.a, ((java.lang.Integer) obj).intValue());
            return aojh.a;
        }
        byte[] bArrD = (byte[]) obj;
        java.lang.Object obj2 = this.b;
        if (bArrD == null) {
            bArrD = null;
            if (obj2 != null && (akzcVar = ((ajsy) obj2).k) != null) {
                bArrD = akzcVar.D();
            }
        }
        java.lang.Object obj3 = this.d;
        int i = this.a;
        java.lang.Object obj4 = this.c;
        akzx akzxVarM = ajsy.a.m();
        akzxVarM.u();
        ajsy ajsyVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(obj4);
        ajsyVar.b |= 1;
        ajsyVar.g = (java.lang.String) obj4;
        akzxVarM.u();
        ajsy ajsyVar2 = akzxVarM.b;
        ajsyVar2.c = 2;
        ajsyVar2.d = java.lang.Integer.valueOf(i);
        java.util.List listCU = ajsz.cU(ahct.d((java.util.Set) ((ahct) obj3).e, (ajsy) obj2));
        akzxVarM.u();
        ajsy ajsyVar3 = akzxVarM.b;
        alat alatVar = ajsyVar3.i;
        if (!alatVar.c()) {
            ajsyVar3.i = alad.J(alatVar);
        }
        akyl.i(listCU, ajsyVar3.i);
        if (bArrD != null) {
            akzc akzcVarU = akzc.u(bArrD);
            akzxVarM.u();
            ajsy ajsyVar4 = akzxVarM.b;
            j$.util.Objects.requireNonNull(akzcVarU);
            ajsyVar4.b |= 4;
            ajsyVar4.k = akzcVarU;
        }
        return akzxVarM.p();
    }

    public /* synthetic */ ahcr(bew bewVar, bcw bcwVar, aoor aoorVar, int i, int i2) {
        this.$cid = i2;
        this.b = bewVar;
        this.d = bcwVar;
        this.c = aoorVar;
        this.a = i;
    }
}
