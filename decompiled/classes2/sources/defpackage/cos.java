package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class cos implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ cos(int i, int i2, float[] fArr) {
        this.$cid = i2;
        this.a = 3;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.valueOf(((cpg) obj).i(this.a));
            case 1:
                return java.lang.Integer.valueOf(((defpackage.ux) obj).b - this.a);
            case 2:
                return java.lang.Boolean.valueOf(((cpg) obj).h(this.a));
            case 3:
                java.lang.Class cls = deg.a;
                return java.lang.Boolean.valueOf(((cpg) obj).i(this.a));
            case 4:
                java.lang.Class cls2 = deg.a;
                return java.lang.Boolean.valueOf(((cpg) obj).i(this.a));
            case 5:
                skp skpVar = (skp) obj;
                aooh.f(skpVar, "uiModel");
                rze rzeVarI = snl.i(skpVar.p());
                akzx akzxVar = (akzx) rzeVarI.a;
                akzxVar.u();
                skp skpVar2 = akzxVar.b;
                skpVar2.b |= 1;
                skpVar2.c = this.a;
                return rzeVarI.b();
            case 6:
                skp skpVar3 = (skp) obj;
                aooh.f(skpVar3, "uiModel");
                rze rzeVarI2 = snl.i(skpVar3.p());
                rzeVarI2.h(3);
                return rzeVarI2.b();
            case 7:
                skp skpVar4 = (skp) obj;
                aooh.f(skpVar4, "uiModel");
                rze rzeVarI3 = snl.i(skpVar4.p());
                akzx akzxVar2 = (akzx) rzeVarI3.a;
                akzxVar2.u();
                skp skpVar5 = akzxVar2.b;
                skpVar5.s = a.aU(this.a);
                skpVar5.b |= 262144;
                return rzeVarI3.b();
            case 8:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                java.util.List list = sme.a;
                return java.lang.Integer.valueOf(iIntValue * this.a);
            case 9:
                int iIntValue2 = ((java.lang.Integer) obj).intValue();
                java.util.List list2 = sme.a;
                return java.lang.Integer.valueOf((-iIntValue2) * this.a);
            case 10:
                ((java.lang.Integer) obj).intValue();
                return java.lang.Integer.valueOf(this.a);
            case 11:
                ((java.lang.Integer) obj).intValue();
                return java.lang.Integer.valueOf(this.a);
            default:
                gin ginVarA = ((gjh) obj).a("SELECT * FROM ContactScore ORDER BY score DESC LIMIT ?");
                try {
                    ginVarA.h(1, this.a);
                    int iS = dzk.S(ginVarA, "normalizedNumber");
                    int iS2 = dzk.S(ginVarA, "score");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        arrayList.add(new uqs(ginVarA.l(iS) ? null : ginVarA.e(iS), ginVarA.a(iS2)));
                        break;
                    }
                    return arrayList;
                } finally {
                    ginVarA.close();
                }
        }
    }

    public /* synthetic */ cos(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }
}
