package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fwt implements aonp {
    private final /* synthetic */ int $cid;

    public /* synthetic */ fwt(int i) {
        this.$cid = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) throws aois {
        int i;
        int i2 = this.$cid;
        if (i2 == 0) {
            ((java.lang.Integer) obj4).intValue();
            return aojh.a;
        }
        if (i2 == 1) {
            aonp aonpVar = defpackage.bkk.a;
            return new defpackage.bkj((aolr) obj, (android.content.Context) obj2, (defpackage.bkm) obj3, (dnx) obj4);
        }
        int i3 = 14;
        if (i2 == 2) {
            java.lang.String str = (java.lang.String) obj2;
            cav cavVar = (cav) obj3;
            int iIntValue = ((java.lang.Integer) obj4).intValue();
            aooh.f((aer) obj, "$this$AnimatedContent");
            aooh.f(str, "targetName");
            if ((iIntValue & 48) == 0) {
                iIntValue |= true == cavVar.B(str) ? 32 : 16;
            }
            if (cavVar.H((iIntValue & 145) != 144, iIntValue & 1)) {
                abrz.k(str, (cmw) null, den.ak(cavVar).q, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, den.an(cavVar).j, cavVar, (iIntValue >> 3) & 14, 0, 131066);
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        if (i2 == 3) {
            java.lang.String str2 = (java.lang.String) obj2;
            cav cavVar2 = (cav) obj3;
            int iIntValue2 = ((java.lang.Integer) obj4).intValue();
            aooh.f((aer) obj, "$this$AnimatedContent");
            aooh.f(str2, "targetCount");
            if ((iIntValue2 & 48) == 0) {
                iIntValue2 |= true == cavVar2.B(str2) ? 32 : 16;
            }
            if (cavVar2.H((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
                abrz.k(str2, (cmw) null, den.ak(cavVar2).h, dpy.g(80), dnd.b, (dmq) null, 0L, new dot(3), 0L, 0, false, 0, 0, (aonj) null, (dkz) null, cavVar2, ((iIntValue2 >> 3) & 14) | 1597440, 0, 261034);
            } else {
                cavVar2.s();
            }
            return aojh.a;
        }
        if (i2 == 4) {
            defpackage.oid oidVar = (defpackage.oid) obj2;
            cav cavVar3 = (cav) obj3;
            int iIntValue3 = ((java.lang.Integer) obj4).intValue();
            aooh.f((aer) obj, "$this$AnimatedContent");
            aooh.f(oidVar, "uiData");
            if ((iIntValue3 & 48) == 0) {
                iIntValue3 |= true == cavVar3.B(oidVar) ? 32 : 16;
            }
            if (!cavVar3.H((iIntValue3 & 145) != 144, iIntValue3 & 1)) {
                cavVar3.s();
            } else if (oidVar instanceof defpackage.oib) {
                cavVar3.u(908700395);
                aomy aomyVar = ((defpackage.oib) oidVar).a;
                ayy ayyVar = defpackage.acpl.a;
                aaoo.ak(aomyVar, (cmw) null, false, (crd) null, defpackage.acpl.a(0L, 0L, cavVar3, 15), (defpackage.bnm) null, (amu) null, defpackage.acpl.i(), defpackage.ohz.a, cavVar3, 805306368, 366);
                cavVar3.o();
            } else if (aooh.n(oidVar, defpackage.oic.a)) {
                cavVar3.u(-1894445924);
                java.lang.String strF = dfa.f(2132018613, cavVar3);
                cmw cmwVarAY = den.aY(azm.g(cmw.c, 48.0f), 12.0f);
                boolean zB = cavVar3.B(strF);
                java.lang.Object objG = cavVar3.g();
                if (zB || objG == cau.a) {
                    objG = new defpackage.npi(strF, i3);
                    cavVar3.w(objG);
                }
                aaoo.M(dig.b(cmwVarAY, false, (aonj) objG), den.ak(cavVar3).a, 3.0f, 0L, 0, 0.0f, cavVar3, 384, 56);
                cavVar3.o();
            } else {
                if (!aooh.n(oidVar, defpackage.oia.a)) {
                    cavVar3.u(908698936);
                    cavVar3.o();
                    throw new aois();
                }
                cavVar3.u(-1893988519);
                aaoo.W(aehj.aL(defpackage.abja.aD, cavVar3), dfa.f(2132018611, cavVar3), den.aY(azm.g(cmw.c, 48.0f), 10.0f), den.ak(cavVar3).a, cavVar3, 384, 0);
                cavVar3.o();
            }
            return aojh.a;
        }
        if (i2 != 5) {
            abom abomVar = (abom) obj;
            abol abolVar = (abol) obj2;
            cav cavVar4 = (cav) obj3;
            int iIntValue4 = ((java.lang.Integer) obj4).intValue();
            aooh.f(abomVar, "$this$TranscriptionMessageList");
            aooh.f(abolVar, "item");
            if ((iIntValue4 & 6) == 0) {
                i = (true == cavVar4.B(abomVar) ? 4 : 2) | iIntValue4;
            } else {
                i = iIntValue4;
            }
            if ((iIntValue4 & 48) == 0) {
                i |= true == cavVar4.B(abolVar) ? 32 : 16;
            }
            if (cavVar4.H((i & 147) != 146, i & 1)) {
                abts.y(abomVar, abolVar, cavVar4, i & 126);
            } else {
                cavVar4.s();
            }
            return aojh.a;
        }
        defpackage.abhk abhkVar = (defpackage.abhk) obj2;
        cav cavVar5 = (cav) obj3;
        int iIntValue5 = ((java.lang.Integer) obj4).intValue();
        aooh.f((aer) obj, "$this$AnimatedContent");
        aooh.f(abhkVar, "type");
        if ((iIntValue5 & 48) == 0) {
            iIntValue5 |= true == cavVar5.z(abhkVar.ordinal()) ? 32 : 16;
        }
        if (cavVar5.H((iIntValue5 & 145) != 144, iIntValue5 & 1)) {
            int iOrdinal = abhkVar.ordinal();
            if (iOrdinal == 0) {
                cavVar5.u(-110397407);
                aehj.bm(defpackage.abja.bH, den.ak(cavVar5).z, den.ak(cavVar5).x, cavVar5, 6, 0);
                cavVar5.o();
            } else if (iOrdinal == 1) {
                cavVar5.u(-110389243);
                cmt cmtVar = cmw.c;
                cmw cmwVarG = azm.g(den.ba(cmtVar, 0.0f, 0.0f, 12.0f, 0.0f), 28.0f);
                cye cyeVarB = awo.b(cmh.e, false);
                int iM = anty.M(cavVar5.a());
                cje cjeVarM = cavVar5.M();
                cmw cmwVarM = cfo.m(cavVar5, cmwVarG);
                aomy aomyVar2 = dam.a;
                cavVar5.L();
                cavVar5.v();
                if (cavVar5.F()) {
                    cavVar5.j(aomyVar2);
                } else {
                    cavVar5.x();
                }
                cev.c(cavVar5, cyeVarB, dam.e);
                cev.c(cavVar5, cjeVarM, dam.d);
                cev.c(cavVar5, java.lang.Integer.valueOf(iM), dam.f);
                cev.b(cavVar5, dam.g);
                cev.c(cavVar5, cmwVarM, dam.c);
                aaoo.M(azm.p(cmtVar), 0L, 2.0f, 0L, 0, 0.0f, cavVar5, 390, 58);
                cavVar5.n();
                cavVar5.o();
            } else {
                if (iOrdinal != 2) {
                    cavVar5.u(-110398956);
                    cavVar5.o();
                    throw new aois();
                }
                cavVar5.u(-110377700);
                aehj.bm(defpackage.abja.az, 0L, 0L, cavVar5, 6, 6);
                cavVar5.o();
            }
        } else {
            cavVar5.s();
        }
        return aojh.a;
    }
}
