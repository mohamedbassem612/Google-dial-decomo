package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bnd implements aonn {
    public final /* synthetic */ aonn a;
    public final /* synthetic */ float b;
    public final /* synthetic */ defpackage.btt c;
    public final /* synthetic */ aonn d;
    public final /* synthetic */ aomy e;
    public final /* synthetic */ aoss f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ aono h;

    public /* synthetic */ bnd(aonn aonnVar, float f, defpackage.btt bttVar, aonn aonnVar2, aomy aomyVar, aoss aossVar, boolean z, aono aonoVar) {
        this.a = aonnVar;
        this.b = f;
        this.c = bttVar;
        this.d = aonnVar2;
        this.e = aomyVar;
        this.f = aossVar;
        this.g = z;
        this.h = aonoVar;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        aonn aonnVar;
        cav cavVar = (cav) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        int i = iIntValue & 3;
        if (cavVar.H(i != 2, iIntValue & 1)) {
            defpackage.btt bttVar = this.c;
            float f = this.b;
            aonn aonnVar2 = this.a;
            cmt cmtVar = cmw.c;
            cmw cmwVarJ = cfd.J(uu.m(azm.d(cmtVar, 1.0f), (azz) aonnVar2.a(cavVar, 0)), new defpackage.abkr(f, 1));
            int i2 = defpackage.bto.a;
            cmw cmwVarJ2 = cfd.J(cmwVarJ, new defpackage.bru(bttVar, 4));
            cye cyeVarA = aww.a(awi.c, cmh.j, cavVar, 0);
            int iM = anty.M(cavVar.a());
            cje cjeVarM = cavVar.M();
            cmw cmwVarM = cfo.m(cavVar, cmwVarJ2);
            aomy aomyVar = dam.a;
            cavVar.L();
            cavVar.v();
            if (cavVar.F()) {
                cavVar.j(aomyVar);
            } else {
                cavVar.x();
            }
            aonn aonnVar3 = this.d;
            cev.c(cavVar, cyeVarA, dam.e);
            cev.c(cavVar, cjeVarM, dam.d);
            cev.c(cavVar, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVar, dam.g);
            cev.c(cavVar, cmwVarM, dam.c);
            awy awyVar = awy.a;
            if (aonnVar3 != null) {
                aoss aossVar = this.f;
                aomy aomyVar2 = this.e;
                cavVar.u(-444181086);
                java.lang.String strAe = den.ae(2132019206, cavVar);
                java.lang.String strAe2 = den.ae(2132019207, cavVar);
                java.lang.String strAe3 = den.ae(2132019209, cavVar);
                boolean zB = cavVar.B(bttVar) | cavVar.B(aomyVar2) | cavVar.D(aossVar);
                java.lang.Object objG = cavVar.g();
                if (zB || objG == cau.a) {
                    objG = new defpackage.af(bttVar, aomyVar2, aossVar, 4);
                    cavVar.w(objG);
                }
                boolean z = this.g;
                cmw cmwVarBj = den.bj(cmtVar, true, (java.lang.String) null, (dib) null, (aomy) objG);
                boolean zC = cavVar.C(z) | cavVar.B(bttVar) | cavVar.B(strAe2) | cavVar.B(aomyVar2) | cavVar.B(strAe3) | cavVar.D(aossVar) | cavVar.B(strAe);
                java.lang.Object objG2 = cavVar.g();
                if (zC || objG2 == cau.a) {
                    aonnVar = aonnVar3;
                    defpackage.fxn fxnVar = new defpackage.fxn(z, bttVar, strAe2, strAe3, strAe, aomyVar2, aossVar, 1);
                    cavVar.w(fxnVar);
                    objG2 = fxnVar;
                } else {
                    aonnVar = aonnVar3;
                }
                defpackage.bto.a(dig.b(cmwVarBj, true, (aonj) objG2), aonnVar, cavVar, 0);
                cavVar.o();
            } else {
                cavVar.u(-441815104);
                cavVar.o();
            }
            this.h.a(awyVar, cavVar, 6);
            cavVar.n();
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
