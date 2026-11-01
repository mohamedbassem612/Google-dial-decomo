package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afnt implements aonp {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.util.List a;
    final /* synthetic */ cmw b;
    final /* synthetic */ defpackage.afot c;
    final /* synthetic */ aonj d;

    public afnt(java.util.List list, cmw cmwVar, defpackage.afot afotVar, aonj aonjVar, int i) {
        this.$cid = i;
        this.a = list;
        this.b = cmwVar;
        this.c = afotVar;
        this.d = aonjVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i;
        int i2;
        int i3;
        int i4 = this.$cid;
        if (i4 == 0) {
            bbx bbxVar = (bbx) obj;
            int iIntValue = ((java.lang.Number) obj2).intValue();
            cav cavVar = (cav) obj3;
            int iIntValue2 = ((java.lang.Number) obj4).intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (true == cavVar.B(bbxVar) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= true == cavVar.z(iIntValue) ? 32 : 16;
            }
            if (cavVar.H((i & 147) != 146, i & 1)) {
                defpackage.akmc akmcVar = (defpackage.akmc) this.a.get(iIntValue);
                cavVar.u(-1398603417);
                defpackage.afmu.a(258952, cfo.j(1983855488, new defpackage.afnu(this.b, this.c, iIntValue, akmcVar, this.d, 1), cavVar), cavVar, 54);
                cavVar.o();
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        if (i4 != 1) {
            bbx bbxVar2 = (bbx) obj;
            int iIntValue3 = ((java.lang.Number) obj2).intValue();
            cav cavVar2 = (cav) obj3;
            int iIntValue4 = ((java.lang.Number) obj4).intValue();
            if ((iIntValue4 & 6) == 0) {
                i3 = (true == cavVar2.B(bbxVar2) ? 4 : 2) | iIntValue4;
            } else {
                i3 = iIntValue4;
            }
            if ((iIntValue4 & 48) == 0) {
                i3 |= true == cavVar2.z(iIntValue3) ? 32 : 16;
            }
            if (cavVar2.H((i3 & 147) != 146, i3 & 1)) {
                defpackage.aklp aklpVar = (defpackage.aklp) this.a.get(iIntValue3);
                cavVar2.u(-414334259);
                defpackage.afmu.a(89735, cfo.j(1551765089, new defpackage.afnu(this.b, this.c, iIntValue3, aklpVar, this.d, 0), cavVar2), cavVar2, 54);
                cavVar2.o();
            } else {
                cavVar2.s();
            }
            return aojh.a;
        }
        bbx bbxVar3 = (bbx) obj;
        int iIntValue5 = ((java.lang.Number) obj2).intValue();
        cav cavVar3 = (cav) obj3;
        int iIntValue6 = ((java.lang.Number) obj4).intValue();
        if ((iIntValue6 & 6) == 0) {
            i2 = (true == cavVar3.B(bbxVar3) ? 4 : 2) | iIntValue6;
        } else {
            i2 = iIntValue6;
        }
        if ((iIntValue6 & 48) == 0) {
            i2 |= true == cavVar3.z(iIntValue5) ? 32 : 16;
        }
        if (cavVar3.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.akmc akmcVar2 = (defpackage.akmc) this.a.get(iIntValue5);
            cavVar3.u(2083551391);
            defpackage.afmu.a(258953, cfo.j(732320200, new defpackage.afnu(this.b, this.c, iIntValue5, akmcVar2, this.d, 2), cavVar3), cavVar3, 54);
            cavVar3.o();
        } else {
            cavVar3.s();
        }
        return aojh.a;
    }
}
