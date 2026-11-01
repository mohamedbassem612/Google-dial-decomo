package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afns implements defpackage.aonp {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.util.List a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    public afns(java.util.List list, java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = list;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [aonr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [cmw, java.lang.Object] */
    @Override // defpackage.aonp
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i;
        int i2;
        int i3;
        int i4 = this.$cid;
        if (i4 == 0) {
            bbx bbxVar = (bbx) obj;
            int iIntValue = ((java.lang.Number) obj2).intValue();
            defpackage.cav cavVar = (defpackage.cav) obj3;
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
                aklp aklpVar = (aklp) this.a.get(iIntValue);
                cavVar.u(-1844238372);
                afmu.a(89735, defpackage.cfo.j(-1322085503, new defpackage.afnr((defpackage.cmw) this.b, iIntValue, (defpackage.aonj) this.c, aklpVar, 0), cavVar), cavVar, 54);
                cavVar.o();
            } else {
                cavVar.s();
            }
            return defpackage.aojh.a;
        }
        if (i4 != 1) {
            bbx bbxVar2 = (bbx) obj;
            int iIntValue3 = ((java.lang.Number) obj2).intValue();
            defpackage.cav cavVar2 = (defpackage.cav) obj3;
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
                akmc akmcVar = (akmc) this.a.get(iIntValue3);
                cavVar2.u(627619845);
                afmu.a(89756, defpackage.cfo.j(-111569617, new afnx((defpackage.cmw) this.b, akmcVar, (defpackage.aonj) this.c), cavVar2), cavVar2, 54);
                cavVar2.o();
            } else {
                cavVar2.s();
            }
            return defpackage.aojh.a;
        }
        defpackage.nf nfVar = (defpackage.nf) obj;
        int iIntValue5 = ((java.lang.Number) obj2).intValue();
        defpackage.cav cavVar3 = (defpackage.cav) obj3;
        int iIntValue6 = ((java.lang.Number) obj4).intValue();
        if ((iIntValue6 & 6) == 0) {
            i2 = (true == cavVar3.B(nfVar) ? 4 : 2) | iIntValue6;
        } else {
            i2 = iIntValue6;
        }
        if ((iIntValue6 & 48) == 0) {
            i2 |= true == cavVar3.z(iIntValue5) ? 32 : 16;
        }
        if (cavVar3.H((i2 & 147) != 146, i2 & 1)) {
            java.lang.Object obj5 = this.a.get(iIntValue5);
            cavVar3.u(255153587);
            defpackage.aehj.aH(nfVar, (defpackage.agii) this.b, iIntValue5, null, defpackage.cfo.j(-1001462911, new defpackage.afnr((defpackage.aonr) this.c, nfVar, iIntValue5, obj5, 1), cavVar3), cavVar3, (i2 & 14) | 199744 | (((i2 & 126) << 3) & 896));
            cavVar3.o();
        } else {
            cavVar3.s();
        }
        return defpackage.aojh.a;
    }
}
