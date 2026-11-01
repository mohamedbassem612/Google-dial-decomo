package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afnu implements aono {
    private final /* synthetic */ int $cid;
    final /* synthetic */ cmw a;
    final /* synthetic */ defpackage.afot b;
    final /* synthetic */ int c;
    final /* synthetic */ aonj d;
    final /* synthetic */ alad e;

    public afnu(cmw cmwVar, defpackage.afot afotVar, int i, alad aladVar, aonj aonjVar, int i2) {
        this.$cid = i2;
        this.a = cmwVar;
        this.b = afotVar;
        this.c = i;
        this.e = aladVar;
        this.d = aonjVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.afpl afplVar = (defpackage.afpl) obj;
            cav cavVar = (cav) obj2;
            int iIntValue = ((java.lang.Number) obj3).intValue();
            aooh.f(afplVar, "$this$VisualElement");
            if ((iIntValue & 6) == 0) {
                iIntValue |= true == ((iIntValue & 8) == 0 ? cavVar.B(afplVar) : cavVar.D(afplVar)) ? 4 : 2;
            }
            if (cavVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
                cmw cmwVar = this.a;
                defpackage.afot afotVar = this.b;
                cmw cmwVarX = den.x(cmwVar, afotVar.c + '-' + this.c);
                alad aladVar = this.e;
                aonj aonjVar = this.d;
                boolean zB = cavVar.B(aonjVar);
                java.lang.Object objG = cavVar.g();
                if (zB || objG == cau.a) {
                    objG = new abli(aonjVar, 13);
                    cavVar.w(objG);
                }
                defpackage.afny.k(cmwVarX, (defpackage.aklp) aladVar, afplVar.b((aonj) objG), cavVar, 0);
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        if (i != 1) {
            defpackage.afpl afplVar2 = (defpackage.afpl) obj;
            cav cavVar2 = (cav) obj2;
            int iIntValue2 = ((java.lang.Number) obj3).intValue();
            aooh.f(afplVar2, "$this$VisualElement");
            if ((iIntValue2 & 6) == 0) {
                iIntValue2 |= true == ((iIntValue2 & 8) == 0 ? cavVar2.B(afplVar2) : cavVar2.D(afplVar2)) ? 4 : 2;
            }
            if (cavVar2.H((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                cmw cmwVar2 = this.a;
                defpackage.afot afotVar2 = this.b;
                cmw cmwVarX2 = den.x(cmwVar2, afotVar2.c + '-' + this.c);
                alad aladVar2 = this.e;
                aonj aonjVar2 = this.d;
                boolean zB2 = cavVar2.B(aonjVar2);
                java.lang.Object objG2 = cavVar2.g();
                if (zB2 || objG2 == cau.a) {
                    objG2 = new abli(aonjVar2, 14);
                    cavVar2.w(objG2);
                }
                defpackage.afny.l(cmwVarX2, (defpackage.akmc) aladVar2, afplVar2.b((aonj) objG2), cavVar2, 0);
            } else {
                cavVar2.s();
            }
            return aojh.a;
        }
        defpackage.afpl afplVar3 = (defpackage.afpl) obj;
        cav cavVar3 = (cav) obj2;
        int iIntValue3 = ((java.lang.Number) obj3).intValue();
        aooh.f(afplVar3, "$this$VisualElement");
        if ((iIntValue3 & 6) == 0) {
            iIntValue3 |= true == ((iIntValue3 & 8) == 0 ? cavVar3.B(afplVar3) : cavVar3.D(afplVar3)) ? 4 : 2;
        }
        if (cavVar3.H((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
            cmw cmwVar3 = this.a;
            defpackage.afot afotVar3 = this.b;
            cmw cmwVarX3 = den.x(cmwVar3, afotVar3.c + '-' + this.c);
            alad aladVar3 = this.e;
            aonj aonjVar3 = this.d;
            boolean zB3 = cavVar3.B(aonjVar3);
            java.lang.Object objG3 = cavVar3.g();
            if (zB3 || objG3 == cau.a) {
                objG3 = new abli(aonjVar3, 12);
                cavVar3.w(objG3);
            }
            defpackage.afny.l(cmwVarX3, (defpackage.akmc) aladVar3, afplVar3.b((aonj) objG3), cavVar3, 0);
        } else {
            cavVar3.s();
        }
        return aojh.a;
    }
}
