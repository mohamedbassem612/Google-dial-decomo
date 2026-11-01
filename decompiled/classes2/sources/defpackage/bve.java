package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bve implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ bve(long j, crd crdVar, ayy ayyVar, dpq dpqVar, aono aonoVar, int i) {
        this.$cid = i;
        this.a = j;
        this.b = crdVar;
        this.c = ayyVar;
        this.d = dpqVar;
        this.e = aonoVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [crd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ayy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [awa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [ayy, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        cmw cmwVar;
        int i = this.$cid;
        if (i == 0) {
            cav cavVar = (cav) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            int i2 = iIntValue & 3;
            int i3 = iIntValue & 1;
            defpackage.bvf bvfVar = defpackage.bvf.a;
            if (cavVar.H(i2 != 2, i3)) {
                den.af(this.a, den.an(cavVar).m, cfo.j(802238160, new defpackage.bit((crd) this.b, (ayy) this.c, (dpq) this.d, (aono) this.e, 5), cavVar), cavVar, 384);
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        if (i != 1) {
            cav cavVar2 = (cav) obj;
            int iIntValue2 = ((java.lang.Integer) obj2).intValue();
            if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                long j = this.a;
                java.lang.Object obj3 = this.d;
                ?? r2 = this.c;
                ?? r3 = this.e;
                pok pokVar = ((poj) this.b).c;
                if (pokVar == null || r3.length() <= 0) {
                    cavVar2.u(-1622893966);
                    cmw cmwVarAZ = den.aZ(azm.d((cmw) r2, 1.0f), 24.0f, 0.0f);
                    if (r3.length() > 0) {
                        cmwVarAZ = cmwVarAZ.a(den.x(cmw.c, "contact_grid_middle_row"));
                    }
                    abts.M((java.lang.String) r3, (defpackage.abms) obj3, cmwVarAZ, new dot(3), j, 0, cavVar2, 0);
                    cavVar2.o();
                } else {
                    cavVar2.u(-1623289557);
                    pez.U((java.lang.String) r3, pokVar.a, (defpackage.abms) obj3, den.x(den.aZ(azm.d((cmw) r2, 1.0f), 24.0f, 0.0f), "contact_grid_middle_row"), new dot(3), j, 0, 0.0f, 0.0f, dfa.f(2132018126, cavVar2), 0L, cavVar2, 0, 0);
                    cavVar2.o();
                }
            } else {
                cavVar2.s();
            }
            return aojh.a;
        }
        cav cavVar3 = (cav) obj;
        int iIntValue3 = ((java.lang.Integer) obj2).intValue();
        int i4 = iIntValue3 & 3;
        int i5 = iIntValue3 & 1;
        boc bocVar = boq.a;
        if (cavVar3.H(i4 != 2, i5)) {
            ?? r4 = this.c;
            ?? r8 = this.b;
            cmw cmwVar2 = cmw.c;
            cmw cmwVarAX = den.aX(azm.m(sl.d(cmwVar2), 0.0f, 32.0f, 1), (ayy) r8);
            cmn cmnVar = cmh.n;
            cye cyeVarA = azh.a((awa) r4, cmnVar, cavVar3, 48);
            int iM = anty.M(cavVar3.a());
            cje cjeVarM = cavVar3.M();
            cmw cmwVarM = cfo.m(cavVar3, cmwVarAX);
            aomy aomyVar = dam.a;
            cavVar3.L();
            cavVar3.v();
            if (cavVar3.F()) {
                cavVar3.j(aomyVar);
            } else {
                cavVar3.x();
            }
            ?? r14 = this.d;
            aonn aonnVar = dam.e;
            cev.c(cavVar3, cyeVarA, aonnVar);
            aonn aonnVar2 = dam.d;
            cev.c(cavVar3, cjeVarM, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar3 = dam.f;
            cev.c(cavVar3, numValueOf, aonnVar3);
            aonj aonjVar = dam.g;
            cev.b(cavVar3, aonjVar);
            aonn aonnVar4 = dam.c;
            cev.c(cavVar3, cmwVarM, aonnVar4);
            azk azkVar = azk.a;
            if (r14 != 0) {
                cavVar3.u(1939929592);
                cye cyeVarB = awo.b(cmh.e, false);
                int iM2 = anty.M(cavVar3.a());
                cje cjeVarM2 = cavVar3.M();
                cmw cmwVarM2 = cfo.m(cavVar3, cmwVar2);
                cavVar3.L();
                cavVar3.v();
                if (cavVar3.F()) {
                    cavVar3.j(aomyVar);
                } else {
                    cavVar3.x();
                }
                long j2 = this.a;
                cev.c(cavVar3, cyeVarB, aonnVar);
                cev.c(cavVar3, cjeVarM2, aonnVar2);
                cev.c(cavVar3, java.lang.Integer.valueOf(iM2), aonnVar3);
                cev.b(cavVar3, aonjVar);
                cev.c(cavVar3, cmwVarM2, aonnVar4);
                aonn aonnVarE = boq.e((aonn) r14, j2, cavVar3);
                if (aonnVarE != null) {
                    cavVar3.u(1511530583);
                    aonnVarE.a(cavVar3, 0);
                    cavVar3.o();
                } else {
                    cavVar3.u(1511607463);
                    cavVar3.o();
                }
                cavVar3.n();
                cavVar3.o();
                cmwVar = cmwVar2;
            } else {
                cavVar3.u(1940381975);
                cmwVar = cmwVar2;
                den.aR(azm.k(cmwVar, 0.0f), cavVar3);
                cavVar3.o();
            }
            cmw cmwVarA = azkVar.a(cmwVar, 1.0f, true);
            cye cyeVarA2 = azh.a(awi.a, cmnVar, cavVar3, 54);
            int iM3 = anty.M(cavVar3.a());
            cje cjeVarM3 = cavVar3.M();
            cmw cmwVarM3 = cfo.m(cavVar3, cmwVarA);
            cavVar3.L();
            cavVar3.v();
            if (cavVar3.F()) {
                cavVar3.j(aomyVar);
            } else {
                cavVar3.x();
            }
            ?? r0 = this.e;
            cev.c(cavVar3, cyeVarA2, aonnVar);
            cev.c(cavVar3, cjeVarM3, aonnVar2);
            cev.c(cavVar3, java.lang.Integer.valueOf(iM3), aonnVar3);
            cev.b(cavVar3, aonjVar);
            cev.c(cavVar3, cmwVarM3, aonnVar4);
            r0.a(cavVar3, 0);
            cavVar3.n();
            cavVar3.u(1941196407);
            den.aR(azm.k(cmwVar, 0.0f), cavVar3);
            cavVar3.o();
            cavVar3.n();
        } else {
            cavVar3.s();
        }
        return aojh.a;
    }

    public /* synthetic */ bve(ayy ayyVar, awa awaVar, aonn aonnVar, long j, aonn aonnVar2, int i) {
        this.$cid = i;
        this.b = ayyVar;
        this.c = awaVar;
        this.d = aonnVar;
        this.a = j;
        this.e = aonnVar2;
    }

    public /* synthetic */ bve(poj pojVar, java.lang.String str, cmw cmwVar, defpackage.abms abmsVar, long j, int i) {
        this.$cid = i;
        this.b = pojVar;
        this.e = str;
        this.c = cmwVar;
        this.d = abmsVar;
        this.a = j;
    }
}
