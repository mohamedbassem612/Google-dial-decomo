package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class upf implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;

    public /* synthetic */ upf(boolean z, int i) {
        this.$cid = i;
        this.a = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dhg */
    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws org.xmlpull.v1.XmlPullParserException, dhg, java.io.IOException {
        int i = this.$cid;
        if (i == 0) {
            ((java.lang.Integer) obj).intValue();
            uov uovVar = (uow) obj2;
            defpackage.aooh.f(uovVar, "item");
            if (!this.a) {
                return java.lang.Long.valueOf(uovVar.a());
            }
            int iBv = defpackage.wsc.bv(uovVar);
            if (iBv != 0) {
                if (iBv != 1) {
                    throw new defpackage.aois();
                }
                return -1L;
            }
            uov uovVar2 = uovVar;
            long j = uovVar2.a;
            if (j > 0) {
                return java.lang.Long.valueOf(j);
            }
            return "contact_" + uovVar2.b;
        }
        if (i != 1) {
            defpackage.cav cavVar = (defpackage.cav) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                defpackage.abts.w(2131951624, defpackage.den.ak(cavVar).a, defpackage.azm.g(defpackage.cmw.c, 16.0f), Integer.MAX_VALUE, this.a, cavVar, 3456, 0);
            } else {
                cavVar.s();
            }
            return defpackage.aojh.a;
        }
        defpackage.cav cavVar2 = (defpackage.cav) obj;
        int iIntValue2 = ((java.lang.Integer) obj2).intValue();
        if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
            defpackage.awa awaVar = defpackage.awi.a;
            defpackage.cmn cmnVar = defpackage.cmh.n;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarAZ = defpackage.den.aZ(defpackage.azm.f(cmtVar, 48.0f, Float.NaN), 20.0f, 0.0f);
            defpackage.cye cyeVarA = defpackage.azh.a(awaVar, cmnVar, cavVar2, 54);
            int iM = defpackage.anty.M(cavVar2.a());
            defpackage.cje cjeVarM = cavVar2.M();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar2, cmwVarAZ);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVar2.L();
            cavVar2.v();
            if (cavVar2.F()) {
                cavVar2.j(aomyVar);
            } else {
                cavVar2.x();
            }
            boolean z = this.a;
            defpackage.cev.c(cavVar2, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVar2, cjeVarM, defpackage.dam.d);
            defpackage.cev.c(cavVar2, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVar2, defpackage.dam.g);
            defpackage.cev.c(cavVar2, cmwVarM, defpackage.dam.c);
            defpackage.css cssVarK = defpackage.wv.k(2131231469, cavVar2, 0);
            float f = true != z ? 180.0f : 0.0f;
            defpackage.abni abniVar = defpackage.abts.H(cavVar2).a;
            defpackage.cer cerVarB = defpackage.aim.b(f, new defpackage.alm(300, 0, defpackage.abts.H(cavVar2).b.a), null, cavVar2, 0, 28);
            defpackage.abrz.k(defpackage.dfa.f(2132018664, cavVar2), null, defpackage.den.ak(cavVar2).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, defpackage.den.an(cavVar2).m, cavVar2, 0, 0, 131066);
            defpackage.cmw cmwVarG = defpackage.azm.g(cmtVar, 20.0f);
            float fFloatValue = ((java.lang.Number) cerVarB.a()).floatValue();
            if (fFloatValue != 0.0f) {
                cmwVarG = defpackage.cfd.K(cmwVarG, 0.0f, 0.0f, 0.0f, 0.0f, fFloatValue, null, false, 0, 1048319);
            }
            defpackage.aaoo.V(cssVarK, null, cmwVarG, defpackage.den.ak(cavVar2).a, cavVar2, 56, 0);
            cavVar2.n();
        } else {
            cavVar2.s();
        }
        return defpackage.aojh.a;
    }
}
