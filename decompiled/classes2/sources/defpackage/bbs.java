package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bbs implements aonp {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ bbs(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r0v1, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [cmw, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) throws aois, aoiq {
        long jM;
        int i = this.$cid;
        if (i == 0) {
            defpackage.bbx bbxVar = (defpackage.bbx) obj;
            ((java.lang.Integer) obj2).intValue();
            cav cavVar = (cav) obj3;
            int iIntValue = ((java.lang.Integer) obj4).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != cavVar.B(bbxVar) ? 2 : 4;
            }
            if (cavVar.H((iIntValue & 131) != 130, iIntValue & 1)) {
                this.a.a(bbxVar, cavVar, java.lang.Integer.valueOf(iIntValue & 14));
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        if (i == 1) {
            java.lang.Float f = (java.lang.Float) obj2;
            f.floatValue();
            java.lang.Float f2 = (java.lang.Float) obj4;
            f2.floatValue();
            this.a.a(f, (cpm) obj3, f2);
            return aojh.a;
        }
        if (i == 2) {
            defpackage.bkl bklVar = (defpackage.bkl) obj;
            boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
            int iIntValue2 = ((java.lang.Integer) obj3).intValue();
            ((java.lang.Boolean) obj4).booleanValue();
            boolean z = ((defpackage.bko) this.a).c;
            if (zBooleanValue) {
                return z ? bklVar.c(iIntValue2, 0) : bklVar.c(iIntValue2, bklVar.a());
            }
            return z ? bklVar.c(bklVar.a(), iIntValue2) : bklVar.c(0, iIntValue2);
        }
        if (i == 3) {
            boolean zBooleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
            ((java.lang.Integer) obj3).intValue();
            boolean zBooleanValue3 = ((java.lang.Boolean) obj4).booleanValue();
            defpackage.bko bkoVarF = ((defpackage.bke) obj).f();
            if (bkoVarF == null) {
                return null;
            }
            java.lang.Object obj5 = this.a;
            if (zBooleanValue2) {
                return zBooleanValue3 ? new defpackage.bko(((defpackage.bko) obj5).a, bkoVarF.a, true) : new defpackage.bko(((defpackage.bko) obj5).a, bkoVarF.b, false);
            }
            return zBooleanValue3 ? new defpackage.bko(bkoVarF.b, ((defpackage.bko) obj5).b, true) : new defpackage.bko(bkoVarF.a, ((defpackage.bko) obj5).b, false);
        }
        if (i == 4) {
            boolean zBooleanValue4 = ((java.lang.Boolean) obj).booleanValue();
            cxi cxiVar = (cxi) obj2;
            defpackage.bks bksVar = (defpackage.bks) obj4;
            long jH = cxiVar.h();
            cpn cpnVar = new cpn(0.0f, 0.0f, (int) (jH >> 32), (int) (jH & 4294967295L));
            long jFloatToRawIntBits = ((cpm) obj3).a;
            if (!defpackage.blx.c(cpnVar, jFloatToRawIntBits)) {
                float fIntBitsToFloat = cpnVar.b;
                int i2 = (int) (jFloatToRawIntBits >> 32);
                if (java.lang.Float.intBitsToFloat(i2) >= fIntBitsToFloat) {
                    fIntBitsToFloat = cpnVar.d;
                    if (java.lang.Float.intBitsToFloat(i2) <= fIntBitsToFloat) {
                        fIntBitsToFloat = java.lang.Float.intBitsToFloat(i2);
                    }
                }
                float fIntBitsToFloat2 = cpnVar.c;
                int i3 = (int) (jFloatToRawIntBits & 4294967295L);
                if (java.lang.Float.intBitsToFloat(i3) >= fIntBitsToFloat2) {
                    fIntBitsToFloat2 = cpnVar.e;
                    if (java.lang.Float.intBitsToFloat(i3) <= fIntBitsToFloat2) {
                        fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i3);
                    }
                }
                jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
            }
            defpackage.blw blwVar = (defpackage.blw) this.a;
            long jA = blwVar.a(cxiVar, jFloatToRawIntBits);
            if ((9223372034707292159L & jA) != 9205357640488583168L) {
                blwVar.s(zBooleanValue4);
                blwVar.h = null;
                blwVar.D(jA, 9205357640488583168L, false, bksVar);
                blwVar.d.a();
                blwVar.u(false);
                blwVar.i = true;
            }
            return aojh.a;
        }
        if (i == 5) {
            rth rthVar = (rtj) obj2;
            cav cavVar2 = (cav) obj3;
            int iIntValue3 = ((java.lang.Integer) obj4).intValue();
            aooh.f((aer) obj, "$this$AnimatedContent");
            aooh.f(rthVar, "data");
            if ((iIntValue3 & 48) == 0) {
                iIntValue3 |= true != ((iIntValue3 & 64) == 0 ? cavVar2.B(rthVar) : cavVar2.D(rthVar)) ? 16 : 32;
            }
            if (cavVar2.H((iIntValue3 & 145) != 144, iIntValue3 & 1)) {
                int iAZ = pez.aZ(rthVar);
                if (iAZ == 0) {
                    java.lang.Object obj6 = this.a;
                    cavVar2.u(-591299412);
                    rth rthVar2 = rthVar;
                    aooh.f(rthVar2, "dataSource");
                    qhr qhrVar = ((rtp) obj6).l;
                    aehj.bt(pez.aV(rthVar2, (android.content.Context) qhrVar.a, new qji(qhrVar, 16)), den.ba(den.aZ(cmw.c, 12.0f, 0.0f), 0.0f, 8.0f, 0.0f, 0.0f), aehj.bi(den.ak(cavVar2).G, den.am(cavVar2).e, cavVar2, 10), cavVar2, 48);
                } else {
                    if (iAZ != 1) {
                        cavVar2.u(-591301472);
                        cavVar2.o();
                        throw new aois();
                    }
                    cavVar2.u(-1149737809);
                }
                cavVar2.o();
            } else {
                cavVar2.s();
            }
            return aojh.a;
        }
        ablb ablbVar = (ablb) obj2;
        cav cavVar3 = (cav) obj3;
        int iIntValue4 = ((java.lang.Integer) obj4).intValue();
        aooh.f(ablbVar, "uiData");
        if ((iIntValue4 & 48) == 0) {
            iIntValue4 |= true == cavVar3.B(ablbVar) ? 32 : 16;
        }
        if (cavVar3.H((iIntValue4 & 145) != 144, iIntValue4 & 1)) {
            int i4 = iIntValue4 & 112;
            java.lang.Object objG = cavVar3.g();
            if (i4 == 32 || objG == cau.a) {
                objG = new abiy(4);
                cavVar3.w(objG);
            }
            cmw cmwVarX = den.x(dig.b((cmw) this.a, false, (aonj) objG), "AlertCard");
            boolean z2 = ablbVar.h;
            bgc bgcVarB = bge.b(32.0f);
            if (z2) {
                cavVar3.u(-1504075778);
                cavVar3.o();
                jM = cfd.M(0);
            } else {
                cavVar3.u(-1503996697);
                int i5 = ablbVar.i;
                cavVar3.u(1614060073);
                jM = abts.F(cavVar3).u;
                cavVar3.o();
                cavVar3.o();
            }
            aaoo.ai(cmwVarX, bgcVarB, aaoo.aj(jM, den.ak(cavVar3).q, cavVar3, 12), (bnx) null, cfo.j(-1033165885, new abkx(ablbVar, 2), cavVar3), cavVar3, 196608);
        } else {
            cavVar3.s();
        }
        return aojh.a;
    }
}
