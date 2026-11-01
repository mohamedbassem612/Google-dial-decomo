package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class afnr implements defpackage.aono {
    private final /* synthetic */ int $cid;
    final /* synthetic */ int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    public afnr(defpackage.aonr aonrVar, defpackage.nf nfVar, int i, java.lang.Object obj, int i2) {
        this.$cid = i2;
        this.c = aonrVar;
        this.b = nfVar;
        this.a = i;
        this.d = obj;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [aonr, java.lang.Object] */
    @Override // defpackage.aono
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (this.$cid != 0) {
            java.lang.Boolean bool = (java.lang.Boolean) obj;
            boolean zBooleanValue = bool.booleanValue();
            defpackage.cav cavVar = (defpackage.cav) obj2;
            int iIntValue = ((java.lang.Number) obj3).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true == cavVar.C(zBooleanValue) ? 4 : 2;
            }
            if (cavVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
                this.c.a(this.b, java.lang.Integer.valueOf(this.a), this.d, bool, cavVar, java.lang.Integer.valueOf((iIntValue << 9) & 7168));
            } else {
                cavVar.s();
            }
            return defpackage.aojh.a;
        }
        afpl afplVar = (afpl) obj;
        defpackage.cav cavVar2 = (defpackage.cav) obj2;
        int iIntValue2 = ((java.lang.Number) obj3).intValue();
        defpackage.aooh.f(afplVar, "$this$VisualElement");
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= true == ((iIntValue2 & 8) == 0 ? cavVar2.B(afplVar) : cavVar2.D(afplVar)) ? 4 : 2;
        }
        if (cavVar2.H((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
            defpackage.cmw cmwVarX = defpackage.den.x(this.b, "cluster-" + this.a);
            java.lang.Object obj4 = this.c;
            boolean zB = cavVar2.B(obj4);
            java.lang.Object objG = cavVar2.g();
            if (zB || objG == defpackage.cau.a) {
                objG = new defpackage.abli(obj4, 7);
                cavVar2.w(objG);
            }
            afny.k(cmwVarX, (aklp) this.d, afplVar.b((defpackage.aonj) objG), cavVar2, 0);
        } else {
            cavVar2.s();
        }
        return defpackage.aojh.a;
    }

    public afnr(defpackage.cmw cmwVar, int i, defpackage.aonj aonjVar, aklp aklpVar, int i2) {
        this.$cid = i2;
        this.b = cmwVar;
        this.a = i;
        this.c = aonjVar;
        this.d = aklpVar;
    }
}
