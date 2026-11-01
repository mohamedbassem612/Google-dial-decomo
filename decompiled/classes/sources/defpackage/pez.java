package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class pez {
    public pez(java.lang.String str, afpl afplVar) {
        defpackage.aooh.f(str, "uniqueCallId");
        defpackage.aooh.f(afplVar, "inCallProductionComponentBuilder");
    }

    public static float A(defpackage.dpq dpqVar) {
        int iOrdinal = dpqVar.ordinal();
        if (iOrdinal == 0) {
            return 0.25f;
        }
        if (iOrdinal == 1) {
            return 0.75f;
        }
        throw new defpackage.aois();
    }

    public static float B(defpackage.dpq dpqVar) {
        int iOrdinal = dpqVar.ordinal();
        if (iOrdinal == 0) {
            return 1.0f;
        }
        if (iOrdinal == 1) {
            return -1.0f;
        }
        throw new defpackage.aois();
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [ajl, java.lang.Object] */
    public static void C(pne pneVar, defpackage.cav cavVar, int i) {
        int i2;
        java.lang.Object objF;
        pne pneVar2 = pneVar;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1721490511);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != cavVarB.B(pneVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.dpq dpqVar = (defpackage.dpq) cavVarB.e(defpackage.dfo.j);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            boolean z = pneVar2 != null;
            defpackage.ccp ccpVar = (defpackage.ccp) objR;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
            boolean zC = cavVarB.C(z);
            java.lang.Object objR2 = cbtVar.R();
            if (zC || objR2 == obj) {
                objR2 = new jbu(z, ccpVar, (defpackage.aoln) null, 10);
                cbtVar.ab(objR2);
            }
            defpackage.cbp.g(boolValueOf, (defpackage.aonn) objR2, cavVarB);
            defpackage.alg algVarD = defpackage.alk.d(java.lang.Boolean.valueOf(defpackage.a.C(ccpVar)), cavVarB, 0);
            java.lang.Object objR3 = cbtVar.R();
            if (objR3 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(pneVar2, defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState2);
                objR3 = parcelableSnapshotMutableState2;
            }
            defpackage.ccp ccpVar2 = (defpackage.ccp) objR3;
            if (pneVar2 != null) {
                ccpVar2.b(pneVar2);
            } else {
                pneVar2 = null;
            }
            defpackage.bry bryVarAl = defpackage.den.al(cavVarB);
            defpackage.ped pedVar = new defpackage.ped(bryVarAl, i4);
            defpackage.nf nfVar = defpackage.alo.a;
            if (algVarD.C()) {
                cavVarB.u(1666827533);
                cbtVar.W(false);
                objF = algVarD.f();
            } else {
                cavVarB.u(1666573488);
                boolean zB = cavVarB.B(algVarD);
                objF = cbtVar.R();
                if (zB || objF == obj) {
                    defpackage.cko ckoVarG = defpackage.cfd.g();
                    defpackage.aonj aonjVarI = ckoVarG != null ? ckoVarG.i() : null;
                    defpackage.cko ckoVarH = defpackage.cfd.h(ckoVarG);
                    try {
                        java.lang.Object objF2 = algVarD.f();
                        defpackage.cfd.i(ckoVarG, ckoVarH, aonjVarI);
                        cbtVar.ab(objF2);
                        objF = objF2;
                    } catch (java.lang.Throwable th) {
                        defpackage.cfd.i(ckoVarG, ckoVarH, aonjVarI);
                        throw th;
                    }
                }
                cbtVar.W(false);
            }
            boolean zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
            cavVarB.u(-1084002388);
            float f = true != zBooleanValue ? 45.0f : 0.0f;
            cbtVar.W(false);
            java.lang.Float fValueOf = java.lang.Float.valueOf(f);
            boolean zB2 = cavVarB.B(algVarD);
            java.lang.Object objR4 = cbtVar.R();
            if (zB2 || objR4 == defpackage.cau.a) {
                pqf pqfVar = new pqf(algVarD, 0);
                defpackage.ajxw ajxwVar = defpackage.ceo.a;
                defpackage.cbk cbkVar = new defpackage.cbk(pqfVar, null);
                cbtVar.ab(cbkVar);
                objR4 = cbkVar;
            }
            boolean zBooleanValue2 = ((java.lang.Boolean) ((defpackage.cer) objR4).a()).booleanValue();
            cavVarB.u(-1084002388);
            float f2 = true != zBooleanValue2 ? 45.0f : 0.0f;
            cbtVar.W(false);
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(f2);
            boolean zB3 = cavVarB.B(algVarD);
            java.lang.Object objR5 = cbtVar.R();
            if (zB3 || objR5 == defpackage.cau.a) {
                bmx bmxVar = new bmx(algVarD, 11);
                defpackage.ajxw ajxwVar2 = defpackage.ceo.a;
                objR5 = new defpackage.cbk(bmxVar, null);
                cbtVar.ab(objR5);
            }
            defpackage.cer cerVarE = defpackage.alk.e(algVarD, fValueOf, fValueOf2, pedVar.a(((defpackage.cer) objR5).a(), cavVarB, 0), nfVar, cavVarB, 0);
            boolean z2 = cavVarB.z(dpqVar.ordinal());
            java.lang.Object objR6 = cbtVar.R();
            if (z2 || objR6 == defpackage.cau.a) {
                defpackage.crg crgVar = new defpackage.crg(defpackage.mni.bj(A(dpqVar), 1.0f));
                cbtVar.ab(crgVar);
                objR6 = crgVar;
            }
            long j = ((defpackage.crg) objR6).a;
            java.lang.Object objR7 = cbtVar.R();
            if (objR7 == defpackage.cau.a) {
                objR7 = new pmu(15);
                cbtVar.ab(objR7);
            }
            defpackage.den.by(algVarD, (defpackage.aonj) objR7, null, defpackage.aga.j(bryVarAl.b(), 0.0f, j, 2), defpackage.aga.k(bryVarAl.b(), 0.0f, j, 2), defpackage.cfo.j(-692539752, new pqd(ccpVar2, j, cerVarE), cavVarB), cavVarB, 196656, 2);
            cavVarB = cavVarB;
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kmg(pneVar2, i, 18);
        }
    }

    public static void D(pne pneVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-32250953);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(pneVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.bvo.b(cmwVar, pqc.a, defpackage.den.ak(cavVarB).h, 0L, 0.0f, 2.0f, null, defpackage.cfo.j(-761888644, new ntw(pneVar, 19), cavVarB), cavVarB, 88);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(pneVar, cmwVar, i, 0);
        }
    }

    public static void E(java.util.List list, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cdk cdkVarI;
        kmg kmgVar;
        defpackage.cav cavVarB = cavVar.b(-1325285784);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            if (list.isEmpty()) {
                cdkVarI = cavVarB.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    kmgVar = new kmg(list, i, 14);
                }
            } else {
                defpackage.awb awbVarF = defpackage.awi.f(8.0f);
                defpackage.cmt cmtVar = defpackage.cmw.c;
                defpackage.cye cyeVarA = defpackage.azh.a(awbVarF, defpackage.cmh.m, cavVarB, 6);
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                int iM = defpackage.anty.M(cbtVar.x);
                defpackage.cje cjeVarAi = cbtVar.ai();
                defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmtVar);
                defpackage.aomy aomyVar = defpackage.dam.a;
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar);
                } else {
                    cavVarB.x();
                }
                defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
                defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
                defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
                defpackage.cev.b(cavVarB, defpackage.dam.g);
                defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
                cavVarB.u(-1902769545);
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    pmr pmrVar = (pmr) it.next();
                    java.lang.Integer num = pmrVar.c;
                    android.graphics.drawable.Drawable drawable = pmrVar.d;
                    if (num != null) {
                        cavVarB.u(1143816606);
                        defpackage.aaoo.V(defpackage.wv.k(num.intValue(), cavVarB, 0), pmrVar.b, defpackage.den.x(defpackage.ru.o(cmtVar, pmrVar.e), "contact_grid_call_technology_icon"), defpackage.den.ak(cavVarB).s, cavVarB, 8, 0);
                        cbtVar.W(false);
                    } else if (drawable != null) {
                        cavVarB.u(1144137735);
                        defpackage.aaoo.X(new defpackage.cpu(dvg.e(drawable)), pmrVar.b, defpackage.den.x(defpackage.ru.o(cmtVar, pmrVar.e), "contact_grid_call_technology_icon"), defpackage.den.ak(cavVarB).s, cavVarB, 0);
                        cbtVar.W(false);
                    } else {
                        cavVarB.u(1144644182);
                        cbtVar.W(false);
                    }
                }
                cbtVar.W(false);
                cbtVar.W(true);
            }
            cdkVarI.c = kmgVar;
        }
        cavVarB.s();
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            kmgVar = new kmg(list, i, 15);
            cdkVarI.c = kmgVar;
        }
    }

    public static void F(java.util.List list, defpackage.cav cavVar, int i) {
        int i2;
        boolean z;
        defpackage.cbt cbtVar;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-698545646);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        boolean z2 = false;
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                png pngVar = (png) it.next();
                cavVarB.u(-1256674521);
                if (pngVar.c == 5) {
                    cavVarB.u(-1256666678);
                    S((pngVar.c == 5 ? ((java.lang.Integer) pngVar.d).intValue() : z2 ? 1 : 0) == true ? 1 : 0, null, defpackage.dfa.f(pngVar.g, cavVarB), 0, false, cavVarB, 0);
                    defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
                    cbtVar2.W(z2);
                    cbtVar2.W(z2);
                } else {
                    cavVarB.u(-1256507152);
                    defpackage.cbt cbtVar3 = (defpackage.cbt) cavVarB;
                    cbtVar3.W(z2);
                    if (pngVar.c == 7) {
                        cavVarB.u(-1256465860);
                        defpackage.aaoo.V(defpackage.wv.k(pngVar.c == 7 ? ((java.lang.Integer) pngVar.d).intValue() : z2 ? 1 : 0, cavVarB, z2 ? 1 : 0), defpackage.dfa.f(pngVar.g, cavVarB), defpackage.den.x(defpackage.azm.g(defpackage.cmw.c, 20.0f), "contact_grid_feature_indicator"), defpackage.den.ak(cavVarB).s, cavVarB, 392, 0);
                        cbtVar3.W(z2);
                        cbtVar3.W(z2);
                    } else {
                        cavVarB.u(-1256169872);
                        cbtVar3.W(z2);
                        android.graphics.drawable.Drawable drawable = ((android.content.Context) cavVarB.e(defpackage.dep.b)).getDrawable(pngVar.c == 2 ? ((java.lang.Integer) pngVar.d).intValue() : z2 ? 1 : 0);
                        if (drawable != null) {
                            cavVarB.u(-1256057683);
                            defpackage.cpu cpuVar = new defpackage.cpu(dvg.e(drawable));
                            java.lang.String strF = defpackage.dfa.f(pngVar.g, cavVarB);
                            defpackage.cmw cmwVarX = defpackage.den.x(defpackage.cmw.c, "contact_grid_feature_indicator");
                            defpackage.cmj cmjVar = defpackage.cmh.e;
                            cwy cwyVar = defpackage.cwx.b;
                            boolean zB = cavVarB.B(cpuVar);
                            java.lang.Object objR = cbtVar3.R();
                            if (zB || objR == defpackage.cau.a) {
                                csq csqVar = new csq(cpuVar, (((long) cpuVar.c()) << 32) | (((long) cpuVar.b()) & 4294967295L));
                                csqVar.a = 1;
                                cbtVar = cbtVar3;
                                cbtVar.ab(csqVar);
                                objR = csqVar;
                            } else {
                                cbtVar = cbtVar3;
                            }
                            defpackage.cav cavVar2 = cavVarB;
                            defpackage.rd.f((csq) objR, strF, cmwVarX, cmjVar, cwyVar, 1.0f, cavVar2, 392, 0);
                            cavVarB = cavVar2;
                            z = false;
                            cbtVar.W(false);
                        } else {
                            z = z2 ? 1 : 0;
                            cbtVar = cbtVar3;
                            cavVarB.u(-1255685776);
                            cbtVar.W(z);
                        }
                        cbtVar.W(z);
                        z2 = z;
                    }
                }
            }
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kmg(list, i, 17);
        }
    }

    public static void G(defpackage.cav cavVar, int i) {
        defpackage.cav cavVarB = cavVar.b(998624051);
        if (cavVarB.H(i != 0, i & 1)) {
            defpackage.rd.g(defpackage.wv.i(2131232025, cavVarB, 6), defpackage.dfa.f(2132018103, cavVarB), defpackage.den.x(defpackage.azm.g(defpackage.cmw.c, 16.0f), "forwarded_icon"), cavVarB, 384);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new peb(i, 4);
        }
    }

    public static void H(pne pneVar, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1134391635);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(pneVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if (!cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cavVarB.s();
        } else if (z) {
            cavVarB.u(-1858380117);
            defpackage.abny.c(new mts(4), null, null, null, null, null, null, null, false, null, null, 0, defpackage.cfo.j(831363948, new ntw(pneVar, 18), cavVarB), cavVarB, 0, 384, 4094);
            cavVarB = cavVarB;
            ((defpackage.cbt) cavVarB).W(false);
        } else {
            cavVarB.u(-1858270625);
            C(pneVar, cavVarB, i2 & 14);
            ((defpackage.cbt) cavVarB).W(false);
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new oa(pneVar, z, i, 8);
        }
    }

    public static void I(defpackage.cav cavVar, int i) {
        defpackage.cav cavVarB = cavVar.b(1051874556);
        if (cavVarB.H(i != 0, i & 1)) {
            defpackage.rd.g(defpackage.wv.i(2131232012, cavVarB, 6), defpackage.dfa.f(2132018133, cavVarB), defpackage.den.x(defpackage.azm.g(defpackage.cmw.c, 16.0f), "work_icon"), cavVarB, 384);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new peb(i, 3);
        }
    }

    public static void J(pqa pqaVar, boolean z, boolean z2, defpackage.cav cavVar, int i) {
        int i2;
        pqa pqaVar2;
        boolean z3;
        boolean z4;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-909824832);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(pqaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(z2) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            pom pomVar = pqaVar.a;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            defpackage.ccp ccpVar = (defpackage.ccp) objR;
            if (pomVar != null) {
                ccpVar.b(pomVar);
            }
            pom pomVar2 = (pom) ccpVar.a();
            if (pomVar2 == null) {
                defpackage.cdk cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new ppz(pqaVar, z, z2, i, 1);
                    return;
                }
                return;
            }
            pqaVar2 = pqaVar;
            z3 = z;
            z4 = z2;
            defpackage.afsq.bC(pqb.c, defpackage.cfo.j(-431461058, new ppy(pqaVar2, pomVar2, z3, z4), cavVarB), cavVarB, 390);
        } else {
            pqaVar2 = pqaVar;
            z3 = z;
            z4 = z2;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI2 = cavVarB.I();
        if (cdkVarI2 != null) {
            cdkVarI2.c = new ppz(pqaVar2, z3, z4, i, 0);
        }
    }

    public static void K(pqa pqaVar, pom pomVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        if (i != 0) {
            cmwVar = defpackage.cmw.c;
        }
        O(pomVar, cmwVar, pqaVar.c, pqaVar.d, pqaVar.e, cavVar, 0);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    public static void L(pom pomVar, boolean z, boolean z2, defpackage.pps ppsVar, defpackage.cav cavVar) {
        float fJ;
        float f;
        defpackage.cmt cmtVar = defpackage.cmw.c;
        java.lang.Object objA = ppsVar.hG().a();
        defpackage.aooh.e(objA, "get(...)");
        boolean zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
        cavVar.u(-796194095);
        pzp pzpVar = pomVar.p;
        float f2 = 28.0f;
        if (zBooleanValue && pzpVar == pzp.d) {
            cavVar.u(1686365519);
            float fJ2 = defpackage.wv.j(2131165513, cavVar);
            if (z2) {
                f2 = 4.0f;
            } else if (!z) {
                f2 = 40.0f;
            }
            f = fJ2 + f2 + 0.0f;
            cavVar.o();
        } else {
            cavVar.u(1686644209);
            cavVar.o();
            if (pzpVar == pzp.d) {
                cavVar.u(1686826737);
                fJ = defpackage.wv.j(2131165514, cavVar);
                cavVar.o();
            } else {
                cavVar.u(1686894751);
                cavVar.o();
                fJ = 0.0f;
            }
            if (z2) {
                f2 = 4.0f;
            } else if (pzpVar != null) {
                pqb pqbVar = pqb.a;
                if (pzpVar.ordinal() == 3) {
                    f2 = 56.0f;
                } else if (!z) {
                    f2 = 40.0f;
                }
            } else if (!z) {
                f2 = 40.0f;
            }
            f = fJ + f2 + 0.0f;
        }
        cavVar.o();
        defpackage.den.aR(defpackage.azm.e(cmtVar, f), cavVar);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x0160  */
    public static void M(poj pojVar, defpackage.cmw cmwVar, boolean z, pqb pqbVar, defpackage.cav cavVar, int i) throws java.io.IOException {
        pqb pqbVar2;
        int i2;
        boolean zMatches;
        int i3;
        abmv abmvVar;
        defpackage.cqg cqgVar;
        long j;
        abms abmsVar;
        pmo pmoVar;
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-2082162943);
        int i5 = i4 == 0 ? (true != cavVarB.D(pojVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i5 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i5 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i5 |= true != cavVarB.z(pqbVar.ordinal()) ? 1024 : 2048;
        }
        if (cavVarB.H((i5 & 1171) != 1170, i5 & 1)) {
            java.lang.CharSequence charSequence = pojVar.a;
            pmp pmpVar = pojVar.b;
            if (charSequence == null) {
                zMatches = false;
                i2 = 2;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int length = charSequence.length();
                for (int i6 = 0; i6 < length; i6++) {
                    char cCharAt = charSequence.charAt(i6);
                    if (java.lang.Character.getType(cCharAt) != 16) {
                        sb.append(cCharAt);
                    }
                }
                i2 = 2;
                zMatches = android.util.Patterns.PHONE.matcher(sb).matches();
            }
            java.lang.String strP = charSequence == null ? "" : zMatches ? defpackage.aoov.P(charSequence.toString(), ' ', (char) 160) : charSequence.toString();
            defpackage.dkz dkzVar = defpackage.den.an(cavVarB).q;
            if (pmpVar == null) {
                i3 = 16;
                abmvVar = null;
            } else {
                if ((pmpVar.b & 2) != 0) {
                    pmoVar = pmpVar.d;
                    if (pmoVar == null) {
                        pmoVar = pmo.a;
                    }
                } else {
                    pmoVar = null;
                }
                if (pmoVar != null) {
                    i3 = 16;
                    abmvVar = new abmv(java.lang.Integer.valueOf(pmoVar.e), java.lang.Integer.valueOf(pmoVar.f), java.lang.Float.valueOf(pmoVar.c), java.lang.Float.valueOf(pmoVar.d), java.lang.Float.valueOf(pmoVar.g));
                    if (true != abmvVar.a()) {
                    }
                } else {
                    i3 = 16;
                }
                abmvVar = null;
            }
            defpackage.dkz dkzVarZ = abmvVar != null ? defpackage.dkz.z(dkzVar, 0L, 0L, null, null, defpackage.abts.L(abmvVar), null, 0L, 0L, null, 0, 0L, null, null, 0, 0, 16777183) : dkzVar;
            if (pmpVar == null) {
                cqgVar = null;
            } else {
                amml ammlVar = pmpVar.c;
                if (ammlVar == null) {
                    ammlVar = amml.a;
                }
                if (ammlVar != null) {
                    float f = ammlVar.c;
                    float f2 = ammlVar.e;
                    float f3 = ammlVar.d;
                    akzv akzvVar = ammlVar.f;
                    if (akzvVar == null) {
                        akzvVar = akzv.a;
                    }
                    defpackage.cqg cqgVar2 = new defpackage.cqg(defpackage.cfd.R(f, f3, f2, akzvVar.b, null, 16));
                    if (defpackage.anty.ah(cqgVar2.a, defpackage.cfd.M(0))) {
                        cqgVar = null;
                    } else {
                        cqgVar = cqgVar2;
                    }
                } else {
                    cqgVar = null;
                }
            }
            if (cqgVar == null) {
                cavVarB.u(496209162);
                j = defpackage.den.ak(cavVarB).q;
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(496205163);
                ((defpackage.cbt) cavVarB).W(false);
                j = cqgVar.a;
            }
            long j2 = j;
            pqbVar2 = pqbVar;
            int i7 = (pqbVar2 == pqb.b || z) ? 1 : i2;
            int iOrdinal = pqbVar2.ordinal();
            if (iOrdinal == 0) {
                abmsVar = new abms(dkzVarZ, defpackage.dpy.g(i3), i7, true != zMatches ? 1 : i2);
            } else {
                if (iOrdinal != 1) {
                    throw new defpackage.aois();
                }
                abmsVar = new abms(dkzVarZ, defpackage.dpy.g(i3), i7, 2);
            }
            defpackage.afsq.bB((((defpackage.dpf) cavVarB.e(defpackage.dfo.e)).dh(dkzVar.g()) * i7) + 0.0f, defpackage.cfo.j(1660639283, new bve(pojVar, strP, cmwVar, abmsVar, j2, 2), cavVarB), cavVarB, 48);
        } else {
            pqbVar2 = pqbVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppv(pojVar, cmwVar, z, pqbVar2, i, 0);
        }
    }

    public static void N(poj pojVar, defpackage.cmw cmwVar, boolean z, pqb pqbVar, defpackage.cav cavVar, int i) throws java.io.IOException {
        int i2;
        poj pojVar2;
        defpackage.cmw cmwVar2;
        boolean z2;
        pqb pqbVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(582635692);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(pojVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.z(pqbVar.ordinal()) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            pojVar2 = pojVar;
            cmwVar2 = cmwVar;
            z2 = z;
            pqbVar2 = pqbVar;
            M(pojVar2, cmwVar2, z2, pqbVar2, cavVarB, i2 & 8190);
        } else {
            pojVar2 = pojVar;
            cmwVar2 = cmwVar;
            z2 = z;
            pqbVar2 = pqbVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppv(pojVar2, cmwVar2, z2, pqbVar2, i, 2);
        }
    }

    public static void O(pom pomVar, defpackage.cmw cmwVar, defpackage.aomy aomyVar, qty qtyVar, defpackage.aonj aonjVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aonj aonjVar2;
        qty qtyVar2;
        boolean z;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1094888214);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(pomVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(qtyVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            int i4 = i2 >> 3;
            int i5 = i2 & 14;
            defpackage.cmw cmwVarX = defpackage.den.x(cmwVar, "contact_grid_top_section");
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarX);
            defpackage.aomy aomyVar2 = defpackage.dam.a;
            cavVarB.v();
            int i6 = i2;
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            int i7 = i5 | (i4 & 112);
            defpackage.aonn aonnVar = defpackage.dam.e;
            defpackage.cev.c(cavVarB, cyeVarB, aonnVar);
            defpackage.aonn aonnVar2 = defpackage.dam.d;
            defpackage.cev.c(cavVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            defpackage.aonn aonnVar3 = defpackage.dam.f;
            defpackage.cev.c(cavVarB, numValueOf, aonnVar3);
            defpackage.aonj aonjVar3 = defpackage.dam.g;
            defpackage.cev.b(cavVarB, aonjVar3);
            defpackage.aonn aonnVar4 = defpackage.dam.c;
            defpackage.cev.c(cavVarB, cmwVarM, aonnVar4);
            if (qtyVar == null) {
                cavVarB.u(-1326097386);
                P(pomVar, aomyVar, defpackage.den.aZ(defpackage.cmw.c, 12.0f, 0.0f), cavVarB, i7);
                cbtVar.W(false);
                aonjVar2 = aonjVar;
                z = true;
                qtyVar2 = qtyVar;
            } else {
                cavVarB.u(-1325859182);
                defpackage.cmt cmtVar = defpackage.cmw.c;
                defpackage.cmw cmwVarAZ = defpackage.den.aZ(defpackage.azm.d(cmtVar, 1.0f), 4.0f, 0.0f);
                defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.g, defpackage.cmh.n, cavVarB, 54);
                int iM2 = defpackage.anty.M(cbtVar.x);
                defpackage.cje cjeVarAi2 = cbtVar.ai();
                defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarAZ);
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar2);
                } else {
                    cavVarB.x();
                }
                defpackage.cev.c(cavVarB, cyeVarA, aonnVar);
                defpackage.cev.c(cavVarB, cjeVarAi2, aonnVar2);
                defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
                defpackage.cev.b(cavVarB, aonjVar3);
                defpackage.cev.c(cavVarB, cmwVarM2, aonnVar4);
                defpackage.awo.c(defpackage.azm.g(cmtVar, 48.0f), cavVarB, 0);
                P(pomVar, aomyVar, defpackage.den.aZ(cmtVar, 12.0f, 0.0f), cavVarB, i7);
                qtyVar2 = qtyVar;
                aonjVar2 = aonjVar;
                T(qtyVar2, aonjVar2, null, cavVarB, (i6 >> 9) & 126);
                z = true;
                cbtVar.W(true);
                cbtVar.W(false);
            }
            cbtVar.W(z);
        } else {
            aonjVar2 = aonjVar;
            qtyVar2 = qtyVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new alh(pomVar, cmwVar, aomyVar, qtyVar2, aonjVar2, i, 13);
        }
    }

    public static void P(pom pomVar, defpackage.aomy aomyVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        boolean z;
        defpackage.cbt cbtVar;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1638104173);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(pomVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.cmw cmwVarX = defpackage.den.x(cmwVar, "contact_grid_top_row");
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.f(8.0f), defpackage.cmh.n, cavVarB, 54);
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar2.x);
            defpackage.cje cjeVarAi = cbtVar2.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarX);
            defpackage.aomy aomyVar2 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar2.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            E(pomVar.k, cavVarB, 0);
            F(pomVar.o, cavVarB, 0);
            pol polVar = pomVar.d;
            java.lang.CharSequence charSequence = pomVar.g;
            if (polVar.d) {
                cavVarB.u(-1489857481);
                defpackage.aehj.ba((java.lang.String) defpackage.aehj.bb(aomyVar, cavVarB, (i2 & 112) | 6).a(), defpackage.den.x(defpackage.cmw.c, "contact_grid_chronometer"), defpackage.den.ak(cavVarB).s, defpackage.abts.I(cavVarB).a, cavVarB, 48);
                cbtVar2.W(false);
                cavVar2 = cavVarB;
                z = true;
                cbtVar = cbtVar2;
            } else {
                cavVarB.u(-1489505662);
                defpackage.dji djiVarCa = charSequence != null ? defpackage.mni.ca(charSequence) : defpackage.mni.ca("");
                defpackage.dkz dkzVar = defpackage.abts.I(cavVarB).a;
                long j = defpackage.den.ak(cavVarB).s;
                defpackage.cmw cmwVarAP = defpackage.cmw.c;
                if (charSequence == null) {
                    cmwVarAP = defpackage.aehj.aP(cmwVarAP);
                }
                cavVar2 = cavVarB;
                z = true;
                cbtVar = cbtVar2;
                defpackage.abrz.l(djiVarCa, cmwVarAP, j, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, dkzVar, cavVar2, 0, 24960, 241656);
                cbtVar.W(false);
            }
            cbtVar.W(z);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppx(pomVar, aomyVar, cmwVar, i, 0);
        }
    }

    public static void Q(pom pomVar, defpackage.cmw cmwVar, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        defpackage.dji djiVarCa;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-635826921);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(pomVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarAZ = defpackage.den.aZ(defpackage.den.x(cmtVar, "contact_grid_bottom_row"), 12.0f, 0.0f);
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.f(8.0f), defpackage.cmh.n, cavVarB, 54);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarAZ);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            pog pogVar = pomVar.f;
            boolean z2 = pogVar.d;
            defpackage.azk azkVar = defpackage.azk.a;
            if (z2) {
                cavVarB.u(-1380345737);
                I(cavVarB, 0);
                cbtVar.W(false);
            } else {
                cavVarB.u(-1380322673);
                cbtVar.W(false);
            }
            if (pogVar.e) {
                cavVarB.u(-1380275150);
                G(cavVarB, 0);
                cbtVar.W(false);
            } else {
                cavVarB.u(-1380247281);
                cbtVar.W(false);
            }
            java.lang.CharSequence charSequence = pomVar.h;
            java.lang.String string = "";
            if (!z) {
                if (charSequence != null) {
                    string = charSequence.toString();
                } else {
                    charSequence = null;
                }
                djiVarCa = defpackage.mni.ca(string);
            } else if (charSequence != null) {
                djiVarCa = defpackage.mni.ca(charSequence);
            } else {
                djiVarCa = defpackage.mni.ca("");
                charSequence = null;
            }
            defpackage.dkz dkzVar = defpackage.abts.I(cavVarB).a;
            long j = defpackage.den.ak(cavVarB).s;
            defpackage.cmw cmwVarA = azkVar.a(cmtVar, 1.0f, false);
            cavVar2 = cavVarB;
            cmwVar = cmtVar;
            defpackage.abrz.l(djiVarCa, charSequence == null ? cmwVarA.a(defpackage.aehj.aP(cmtVar)) : cmwVarA.a(defpackage.den.x(cmtVar, "contact_grid_bottom_row_label")), j, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, dkzVar, cavVar2, 0, 24960, 241656);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cmw cmwVar2 = cmwVar;
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bsq(pomVar, cmwVar2, z, i, 13, null);
        }
    }

    public static void R(pmn pmnVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1736625643);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(pmnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (!cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            cavVarB.s();
            defpackage.cdk cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new pqe(pmnVar, cmwVar, i, 1);
                return;
            }
            return;
        }
        defpackage.cmt cmtVar = defpackage.cmw.c;
        if (pmnVar != null) {
            throw null;
        }
        defpackage.cdk cdkVarI2 = cavVarB.I();
        if (cdkVarI2 != null) {
            cdkVarI2.c = new kmg(cmtVar, i, 16);
        }
    }

    public static void S(int i, defpackage.cmw cmwVar, java.lang.String str, int i2, boolean z, defpackage.cav cavVar, int i3) {
        int i4;
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        int i5;
        boolean z2;
        int i6 = i3 & 6;
        defpackage.cav cavVarB = cavVar.b(274534005);
        if (i6 == 0) {
            i4 = (true != cavVarB.z(i) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != cavVarB.B(str) ? 128 : 256;
        }
        int i7 = i4 | 27648;
        if (cavVarB.H((i7 & 9347) != 9346, i7 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            cavVar2 = cavVarB;
            hgt.q(defpackage.hcq.d(new hcj(i), cavVarB).b(), defpackage.afsq.bE(defpackage.den.x(cmtVar, "contact_grid_feature_indicator"), str, null), false, false, (hch) null, 0.0f, Integer.MAX_VALUE, 0, (hsj) null, (defpackage.cmj) null, (cwy) null, false, 0, cavVar2, (i7 << 9) & 3670016, 0, 0, 2097068);
            cmwVar2 = cmtVar;
            z2 = true;
            i5 = Integer.MAX_VALUE;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
            i5 = i2;
            z2 = z;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppw(i, cmwVar2, str, i5, z2, i3);
        }
    }

    public static void T(qty qtyVar, defpackage.aonj aonjVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1445481806);
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(qtyVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarAY = defpackage.den.aY(defpackage.azm.g(defpackage.den.x(cmtVar, "partner_app_button"), 48.0f), 4.0f);
            bpw bpwVarAa = defpackage.aaoo.aa(defpackage.den.ak(cavVarB).H, defpackage.den.ak(cavVarB).q, 0L, 0L, cavVarB, 12);
            boolean z = qtyVar.g;
            boolean z2 = (i4 & 112) == 32;
            boolean z3 = (i4 & 14) == 4;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if ((z2 | z3) || objR == defpackage.cau.a) {
                objR = new ksu(aonjVar, qtyVar, 13, (byte[]) null);
                cbtVar.ab(objR);
            }
            defpackage.aaoo.aC((defpackage.aomy) objR, cmwVarAY, z, bpwVarAa, null, null, defpackage.cfo.j(-1169140396, new ntw(qtyVar, 17), cavVarB), cavVarB, 1572864, 48);
            cavVarB = cavVarB;
            cmwVar2 = cmtVar;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppx(qtyVar, aonjVar, cmwVar2, i, 1);
        }
    }

    public static void U(java.lang.String str, abja abjaVar, abms abmsVar, defpackage.cmw cmwVar, defpackage.dot dotVar, long j, int i, float f, float f2, java.lang.String str2, long j2, defpackage.cav cavVar, int i2, int i3) {
        java.lang.String str3;
        int i4;
        abms abmsVar2;
        defpackage.dot dotVar2;
        long j3;
        int i5;
        float f3;
        float f4;
        long j4;
        long j5;
        float f5;
        float f6;
        int i6;
        int i7 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(766204809);
        boolean z = true;
        if (i7 == 0) {
            str3 = str;
            i4 = (true != cavVarB.B(str3) ? 2 : 4) | i2;
        } else {
            str3 = str;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.z(abjaVar.ordinal()) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            abmsVar2 = abmsVar;
            i4 |= true != cavVarB.B(abmsVar2) ? 128 : 256;
        } else {
            abmsVar2 = abmsVar;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != cavVarB.B(cmwVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            dotVar2 = dotVar;
            i4 |= true != cavVarB.B(dotVar2) ? 8192 : 16384;
        } else {
            dotVar2 = dotVar;
        }
        if ((196608 & i2) == 0) {
            j3 = j;
            i4 |= true != cavVarB.A(j3) ? 65536 : 131072;
        } else {
            j3 = j;
        }
        int i8 = i4 | 114819072;
        if ((805306368 & i2) == 0) {
            i8 |= true != cavVarB.B(str2) ? 268435456 : 536870912;
        }
        int i9 = (i3 & 6) == 0 ? i3 | 2 : i3;
        if ((306783379 & i8) == 306783378 && (i9 & 3) == 2) {
            z = false;
        }
        if (cavVarB.H(z, i8 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i2 & 1) == 0 || cavVarB.E()) {
                j5 = defpackage.den.ak(cavVarB).a;
                f5 = 8.0f;
                f6 = 24.0f;
                i6 = 2;
            } else {
                cavVarB.s();
                i6 = i;
                f6 = f;
                f5 = f2;
                j5 = j2;
            }
            cavVarB.l();
            defpackage.rz.f(cmwVar, null, defpackage.cfo.j(529969139, new ppt(str3, abmsVar2, f5, f6, j3, dotVar2, i6, abjaVar, str2, j5), cavVarB), cavVarB, ((i8 >> 9) & 14) | 3072);
            f4 = f5;
            f3 = f6;
            i5 = i6;
            j4 = j5;
        } else {
            cavVarB.s();
            i5 = i;
            f3 = f;
            f4 = f2;
            j4 = j2;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppu(str, abjaVar, abmsVar, cmwVar, dotVar, j, i5, f3, f4, str2, j4, i2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.CharSequence V(java.lang.String str, j$.util.Optional optional) {
        pnh pnhVar = new pnh(str, 7);
        if (true == optional.isPresent()) {
            optional = j$.util.Optional.ofNullable(android.text.TextUtils.concat(pnhVar.a, "  ·  ", (java.lang.CharSequence) optional.get()));
        }
        return (java.lang.CharSequence) optional.orElse(str);
    }

    public static java.lang.CharSequence W(android.content.Context context, int i, java.lang.String str, j$.util.Optional optional) {
        java.lang.String string = context.getString(i, str);
        if (!optional.isPresent()) {
            return string;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(string);
        int iIndexOf = string.indexOf(str);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(((java.lang.Integer) optional.orElseThrow()).intValue()), iIndexOf, str.length() + iIndexOf, 17);
        return spannableString;
    }

    public static java.lang.CharSequence X(java.lang.String str, j$.util.Optional optional, boolean z) {
        if (!z || !optional.isPresent()) {
            return str;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(((java.lang.Integer) optional.orElseThrow()).intValue()), 0, str.length(), 17);
        return spannableString;
    }

    public static void Y(android.text.SpannableString spannableString, java.lang.String str, int i) {
        int iIndexOf = spannableString.toString().indexOf(str);
        if (iIndexOf != -1) {
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(i), iIndexOf, str.length() + iIndexOf, 17);
        } else {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ppg.a.b()).g(1, java.util.concurrent.TimeUnit.SECONDS)).l("com/android/dialer/incall/contactgrid/dataservice/ContactGridTopRowProducerModule", "highlightTextInString", 519, "ContactGridTopRowProducerModule.java")).I("Unable to find %s in string, not applying %s highlighting.", "SIM label", "SIM label");
        }
    }

    public static java.lang.CharSequence Z(android.content.Context context) {
        defpackage.aooh.f(context, "appContext");
        return aq(context, context.getString(2132019033));
    }

    public static zki a(pey peyVar) {
        defpackage.aooh.f(peyVar, "callBackgroundPhoneEvent");
        int iAf = defpackage.a.af(peyVar.c);
        if (iAf == 0 || iAf != 3) {
            return null;
        }
        zoe zoeVarCo = defpackage.aehj.co(zki.a.m());
        zoeVarCo.k();
        zoe zoeVarCn = defpackage.aehj.cn(zkh.a.m());
        defpackage.akzx akzxVarM = zkv.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        zoe zoeVarCp = defpackage.aehj.cp(zjd.a.m());
        zoeVarCp.o(zjc.c);
        zoe zoeVarCq = defpackage.aehj.cq(zjb.a.m());
        java.lang.String str = peyVar.d;
        defpackage.aooh.e(str, "getSyntheticCallId(...)");
        defpackage.aooh.f(str, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) zoeVarCq.a;
        akzxVar.u();
        zjb zjbVar = akzxVar.b;
        j$.util.Objects.requireNonNull(str);
        zjbVar.b |= 4;
        zjbVar.e = str;
        zoeVarCp.n(zoeVarCq.p());
        zjd zjdVarM = zoeVarCp.m();
        defpackage.aooh.f(zjdVarM, "value");
        akzxVarM.u();
        zkv zkvVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(zjdVarM);
        zkvVar.e = zjdVarM;
        zkvVar.b |= 1;
        defpackage.akzx akzxVarM2 = zku.a.m();
        defpackage.aooh.f(akzxVarM2, "builder");
        java.lang.String str2 = peyVar.e;
        defpackage.aooh.e(str2, "getImageId(...)");
        defpackage.aooh.f(str2, "value");
        akzxVarM2.u();
        zku zkuVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(str2);
        zkuVar.b |= 1;
        zkuVar.c = str2;
        zku zkuVarP = akzxVarM2.r();
        defpackage.aooh.e(zkuVarP, "build(...)");
        zku zkuVar2 = zkuVarP;
        defpackage.aooh.f(zkuVar2, "value");
        akzxVarM.u();
        zkv zkvVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(zkuVar2);
        zkvVar2.d = zkuVar2;
        zkvVar2.c = 2;
        zkv zkvVarP = akzxVarM.r();
        defpackage.aooh.e(zkvVarP, "build(...)");
        zkv zkvVar3 = zkvVarP;
        defpackage.aooh.f(zkvVar3, "value");
        defpackage.akzx akzxVar2 = (defpackage.akzx) zoeVarCn.a;
        akzxVar2.u();
        zkh zkhVar = akzxVar2.b;
        j$.util.Objects.requireNonNull(zkvVar3);
        zkhVar.c = zkvVar3;
        zkhVar.b = 8;
        zoeVarCo.j(zoeVarCn.h());
        return zoeVarCo.i();
    }

    public static java.lang.String aA() {
        return defpackage.dwz.c() ? okp.a("EVENT_DISPLAY_EMERGENCY_MESSAGE") : "android.telephony.event.DISPLAY_EMERGENCY_MESSAGE";
    }

    public static defpackage.okc aB(android.content.Context context) {
        return (defpackage.okc) defpackage.agab.aH(context, defpackage.okc.class);
    }

    public static void aC(oid oidVar, defpackage.cav cavVar, int i) {
        int i2;
        oid oidVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1139430772);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(oidVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.bry bryVarAl = defpackage.den.al(cavVarB);
            defpackage.cmj cmjVar = defpackage.cmh.f;
            boolean zB = cavVarB.B(bryVarAl);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == defpackage.cau.a) {
                objR = new npi(bryVarAl, 15);
                cbtVar.ab(objR);
            }
            defpackage.aonj aonjVar = (defpackage.aonj) objR;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == defpackage.cau.a) {
                objR2 = new mws(17);
                cbtVar.ab(objR2);
            }
            oidVar2 = oidVar;
            defpackage.uu.a(oidVar2, null, aonjVar, cmjVar, null, (defpackage.aonj) objR2, ohz.b, cavVarB, (i2 & 14) | 1772544, 18);
        } else {
            oidVar2 = oidVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kmg(oidVar2, i, 9);
        }
    }

    public static void aD(oie oieVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-41907384);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(oieVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarD = defpackage.azm.d(cmtVar, 1.0f);
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.h, false);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarD);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.aaoo.ai(defpackage.azm.d(defpackage.den.aZ(cmtVar, 16.0f, 12.0f), 1.0f), defpackage.den.am(cavVarB).e, defpackage.aaoo.aj(defpackage.den.ak(cavVarB).G, 0L, cavVarB, 14), null, defpackage.cfo.j(854826320, new ant(oieVar, 19), cavVarB), cavVarB, 196614);
            cavVarB = cavVarB;
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kmg(oieVar, i, 8);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void aE(defpackage.aw awVar, oby obyVar) throws afeb {
        defpackage.ahvr.e(awVar, pdb.class, new lyu(obyVar, 3));
        defpackage.ahvr.e(awVar, pgh.class, new lyu(obyVar, 4));
        defpackage.ahvr.e(awVar, pyr.class, new lyu(obyVar, 5));
    }

    public static android.widget.ImageView aF(android.view.View view) {
        android.view.View viewFindViewById = view.findViewById(2131428204);
        defpackage.aooh.e(viewFindViewById, "findViewById(...)");
        return (android.widget.ImageView) viewFindViewById;
    }

    public static android.widget.TextView aG(android.view.View view) {
        android.view.View viewFindViewById = view.findViewById(2131428130);
        defpackage.aooh.e(viewFindViewById, "findViewById(...)");
        return (android.widget.TextView) viewFindViewById;
    }

    public static android.widget.TextView aH(android.view.View view) {
        android.view.View viewFindViewById = view.findViewById(2131428206);
        defpackage.aooh.e(viewFindViewById, "findViewById(...)");
        return (android.widget.TextView) viewFindViewById;
    }

    public static com.google.android.material.imageview.ShapeableImageView aI(android.view.View view) {
        com.google.android.material.imageview.ShapeableImageView shapeableImageViewFindViewById = view.findViewById(2131428128);
        defpackage.aooh.e(shapeableImageViewFindViewById, "findViewById(...)");
        return shapeableImageViewFindViewById;
    }

    public static com.google.android.material.imageview.ShapeableImageView aJ(android.view.View view) {
        com.google.android.material.imageview.ShapeableImageView shapeableImageViewFindViewById = view.findViewById(2131428203);
        defpackage.aooh.e(shapeableImageViewFindViewById, "findViewById(...)");
        return shapeableImageViewFindViewById;
    }

    public static boolean aK(obf obfVar, obf obfVar2) {
        obi obiVarB = null;
        if (defpackage.aooh.n(obfVar.g, obfVar2 != null ? obfVar2.g : null)) {
            obi obiVarB2 = obi.b(obfVar.o);
            if (obiVarB2 == null) {
                obiVarB2 = obi.a;
            }
            if (obfVar2 != null && (obiVarB = obi.b(obfVar2.o)) == null) {
                obiVarB = obi.a;
            }
            if (obiVarB2 == obiVarB) {
                return true;
            }
        }
        return false;
    }

    public static nzp aL(obg obgVar) {
        obf obfVar = (obf) obgVar;
        if ((obfVar.b & 8192) == 0) {
            return null;
        }
        nzp nzpVar = obfVar.q;
        return nzpVar == null ? nzp.a : nzpVar;
    }

    public static /* synthetic */ heq aM(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new heq(akzxVar);
    }

    public static /* synthetic */ heq aN(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new heq(akzxVar);
    }

    public static /* synthetic */ heq aO(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new heq(akzxVar);
    }

    public static /* synthetic */ heq aP(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new heq(akzxVar);
    }

    public static /* synthetic */ heq aQ(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new heq(akzxVar);
    }

    public static defpackage.aonj aR(defpackage.ruc rucVar, defpackage.aenj aenjVar, defpackage.aenj aenjVar2, defpackage.aonj aonjVar) {
        defpackage.aeun aeunVar;
        defpackage.aooh.f(rucVar, "<this>");
        j$.util.Optional optionalA = rucVar.a();
        defpackage.aooh.e(optionalA, "startLocalTimer(...)");
        defpackage.aeun aeunVar2 = (defpackage.aeun) defpackage.aooh.q(optionalA);
        if (aenjVar2 != null) {
            j$.util.Optional optionalA2 = rucVar.a();
            defpackage.aooh.e(optionalA2, "startLocalTimer(...)");
            aeunVar = (defpackage.aeun) defpackage.aooh.q(optionalA2);
        } else {
            aeunVar = null;
        }
        defpackage.aeun aeunVar3 = aeunVar;
        return (aeunVar2 == null && aeunVar3 == null) ? aonjVar : new rud(new defpackage.aoop(), aenjVar, aeunVar2, rucVar, aenjVar2, aeunVar3, aonjVar, (defpackage.aoln) null);
    }

    public static /* synthetic */ ryg aS(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new ryg(akzxVar);
    }

    public static /* synthetic */ ryg aT(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new ryg(akzxVar);
    }

    public static /* synthetic */ ryg aU(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new ryg(akzxVar);
    }

    public static abia aV(rth rthVar, android.content.Context context, defpackage.aonj aonjVar) {
        defpackage.aooh.f(rthVar, "dataSource");
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aonjVar, "onDismiss");
        defpackage.rrz rrzVar = rthVar.a;
        defpackage.rsd rsdVarB = rrzVar.b();
        defpackage.ovt ovtVar = new defpackage.ovt((java.lang.Object) rrzVar, 4, (int[]) null);
        j$.util.Objects.checkIndex(0, 6);
        rsi rsiVar = rthVar.b;
        if (rsiVar instanceof rsi) {
            rsi rsiVar2 = rsiVar;
            java.lang.String strCs = cs(rsiVar2.a.a, context);
            rsc rscVar = rsiVar2.d;
            j$.util.Objects.checkIndex(0, 3);
            return new abht(strCs, cs(rsiVar2.b.a, context), new abhi(rscVar.a), cp(rsiVar2.c, rsdVarB, context, aonjVar), new obp(rsdVarB, ovtVar, aonjVar, 9, (char[]) null), new abhv((byte[]) null));
        }
        if (rsiVar instanceof rsk) {
            rsk rskVar = (rsk) rsiVar;
            return new abhx(new abhw(rskVar.b.a), cs(rskVar.a.a, context), cs(rskVar.c.a, context), cp(rskVar.d, rsdVarB, context, aonjVar), new obp(rsdVarB, ovtVar, aonjVar, 7, (char[]) null), new defpackage.uoq(14), new abhv((byte[]) null));
        }
        if (!(rsiVar instanceof rsh)) {
            if (rsiVar instanceof rsg) {
                throw null;
            }
            if (!(rsiVar instanceof rsj)) {
                throw new defpackage.aois();
            }
            throw null;
        }
        rsh rshVar = (rsh) rsiVar;
        java.lang.String strCs2 = cs(rshVar.a.a, context);
        rry rryVar = rshVar.b;
        return new abhs(rryVar.a, strCs2, cs(rshVar.c.a, context), cp(rshVar.d, rsdVarB, context, aonjVar), new obp(rsdVarB, ovtVar, aonjVar, 8, (char[]) null), new abhv((byte[]) null));
    }

    public static void aW(defpackage.rsd rsdVar, defpackage.aomy aomyVar, defpackage.aonj aonjVar) {
        aomyVar.a();
        aonjVar.a(rsdVar);
    }

    public static defpackage.rsd aX(defpackage.ccp ccpVar) {
        return (defpackage.rsd) ccpVar.a();
    }

    public static void aY(rtj rtjVar, defpackage.aomy aomyVar, final defpackage.aonj aonjVar, defpackage.aonj aonjVar2, defpackage.aomy aomyVar2, defpackage.aomy aomyVar3, final defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        defpackage.ccp ccpVar;
        defpackage.cbt cbtVar;
        defpackage.aooh.f(rtjVar, "marqueeLoadResult");
        defpackage.aooh.f(aomyVar, "onCreated");
        defpackage.aooh.f(aonjVar, "onDismiss");
        defpackage.aooh.f(aonjVar2, "onMarqueeShown");
        defpackage.aooh.f(aomyVar2, "onMarqueeDismissed");
        defpackage.aooh.f(aomyVar3, "onMarqueeNoData");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-809130201);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(rtjVar) : cavVarB.D(rtjVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aonjVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aomyVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.D(aomyVar3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 524288 : 1048576;
        }
        if (cavVarB.H((599187 & i2) != 599186, i2 & 1)) {
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar2.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = defpackage.cbp.a(defpackage.aols.a, cavVarB);
                cbtVar2.ab(objR);
            }
            defpackage.aoss aossVar = (defpackage.aoss) objR;
            java.lang.Object objR2 = cbtVar2.R();
            if (objR2 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(rtjVar, defpackage.cdu.c);
                cbtVar2.ab(parcelableSnapshotMutableState);
                objR2 = parcelableSnapshotMutableState;
            }
            defpackage.ccp ccpVar2 = (defpackage.ccp) objR2;
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object objR3 = cbtVar2.R();
            if (objR3 == obj) {
                objR3 = new defpackage.jaf(15);
                cbtVar2.ab(objR3);
            }
            defpackage.ccp ccpVar3 = (defpackage.ccp) defpackage.cfd.m(objArr, (defpackage.aomy) objR3, cavVarB, 48);
            java.lang.Object[] objArr2 = new java.lang.Object[0];
            java.lang.Object objR4 = cbtVar2.R();
            if (objR4 == obj) {
                objR4 = new defpackage.jaf(16);
                cbtVar2.ab(objR4);
            }
            defpackage.ccp ccpVar4 = (defpackage.ccp) defpackage.cfd.m(objArr2, (defpackage.aomy) objR4, cavVarB, 48);
            defpackage.aojh aojhVar = defpackage.aojh.a;
            boolean zB = cavVarB.B(ccpVar4) | ((i2 & 112) == 32);
            java.lang.Object objR5 = cbtVar2.R();
            if (zB || objR5 == obj) {
                objR5 = new defpackage.roz(aomyVar, ccpVar4, (defpackage.aoln) null, 3);
                cbtVar2.ab(objR5);
            }
            defpackage.cbp.g(aojhVar, (defpackage.aonn) objR5, cavVarB);
            boolean zB2 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && cavVarB.D(rtjVar))) | ((458752 & i2) == 131072) | cavVarB.B(ccpVar3) | cavVarB.D(aossVar);
            boolean z = (i2 & 7168) == 2048;
            boolean z2 = (i2 & 57344) == 16384;
            java.lang.Object objR6 = cbtVar2.R();
            if (((zB2 | z) || z2) || objR6 == obj) {
                ccpVar = ccpVar2;
                cbtVar = cbtVar2;
                objR6 = new defpackage.rts(rtjVar, aomyVar3, aossVar, aonjVar2, aomyVar2, ccpVar3, ccpVar, null);
                cbtVar.ab(objR6);
            } else {
                cbtVar = cbtVar2;
                ccpVar = ccpVar2;
            }
            defpackage.cbp.g(rtjVar, (defpackage.aonn) objR6, cavVarB);
            rtj rtjVar2 = (rtj) ccpVar.a();
            java.lang.Object objR7 = cbtVar.R();
            if (objR7 == obj) {
                objR7 = new defpackage.qks(18);
                cbtVar.ab(objR7);
            }
            cavVar2 = cavVarB;
            defpackage.uu.a(rtjVar2, null, (defpackage.aonj) objR7, null, null, null, defpackage.cfo.j(1682459431, new defpackage.aonp() { // from class: rtr
                @Override // defpackage.aonp
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    rth rthVar = (rtj) obj3;
                    defpackage.cav cavVar3 = (defpackage.cav) obj4;
                    int iIntValue = ((java.lang.Integer) obj5).intValue();
                    defpackage.aooh.f((defpackage.aer) obj2, "$this$AnimatedContent");
                    defpackage.aooh.f(rthVar, "data");
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= true != ((iIntValue & 64) == 0 ? cavVar3.B(rthVar) : cavVar3.D(rthVar)) ? 16 : 32;
                    }
                    if (cavVar3.H((iIntValue & 145) != 144, iIntValue & 1)) {
                        int iAZ = defpackage.pez.aZ(rthVar);
                        if (iAZ == 0) {
                            defpackage.cmw cmwVar2 = cmwVar;
                            defpackage.aonj aonjVar3 = aonjVar;
                            cavVar3.u(1935812826);
                            defpackage.aehj.bt(defpackage.pez.aV(rthVar, (android.content.Context) cavVar3.e(defpackage.dep.b), aonjVar3), defpackage.den.ba(defpackage.den.aZ(cmwVar2, 12.0f, 0.0f), 0.0f, 8.0f, 0.0f, 0.0f), defpackage.aehj.bi(defpackage.den.ak(cavVar3).G, defpackage.den.am(cavVar3).e, cavVar3, 10), cavVar3, 0);
                        } else {
                            if (iAZ != 1) {
                                cavVar3.u(1935811126);
                                cavVar3.o();
                                throw new defpackage.aois();
                            }
                            cavVar3.u(-118671867);
                        }
                        cavVar3.o();
                    } else {
                        cavVar3.s();
                    }
                    return defpackage.aojh.a;
                }
            }, cavVarB), cavVar2, 1573248, 58);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ciy(rtjVar, aomyVar, aonjVar, aonjVar2, aomyVar2, aomyVar3, cmwVar, i, 3);
        }
    }

    public static /* synthetic */ int aZ(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof rth) {
            return 0;
        }
        return obj instanceof defpackage.rti ? 1 : -2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void aa(al alVar, pmh pmhVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtf.class, new pmi(pmhVar, 0));
    }

    public static int ab(int i) {
        return i == 1 ? defpackage.alau.a() : i - 2;
    }

    public static int ac(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 10001 ? 0 : 10003;
        }
        return 3;
    }

    public static int ad(int i) {
        return i == 1 ? defpackage.alau.a() : i - 2;
    }

    public static defpackage.ajcq ae(defpackage.mgu mguVar, defpackage.ajcq ajcqVar) {
        return (defpackage.ajcq) new mgt(mguVar, ajcqVar).b(mfy.bp).f();
    }

    public static boolean af(android.os.Bundle bundle) {
        return bundle != null && bundle != android.os.Bundle.EMPTY && bundle.containsKey("android.telecom.extra.ANSWERING_DROPS_FG_CALL") && bundle.getBoolean("android.telecom.extra.ANSWERING_DROPS_FG_CALL");
    }

    public static j$.util.Optional ag(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) ? j$.util.Optional.of(str) : j$.util.Optional.empty();
    }

    public static /* synthetic */ oyx ah(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new oyx(akzxVar, (byte[]) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void ai(afqz afqzVar, pbh pbhVar) throws afeb {
        defpackage.ahvr.d(afqzVar, pbg.class, new lyu(pbhVar, 12));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void aj(al alVar, pay payVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new lyu(payVar, 10));
        defpackage.ahvr.d(alVar, ahtf.class, new lyu(payVar, 11));
    }

    public static void ak(abgx abgxVar, defpackage.cmw cmwVar, java.lang.String str, defpackage.cav cavVar, int i) {
        int i2;
        abgx abgxVar2;
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        defpackage.cmt cmtVar;
        int i3;
        defpackage.aojh aojhVar;
        defpackage.cbt cbtVar;
        boolean z;
        int i4;
        int i5 = i & 6;
        defpackage.cav cavVarB = cavVar.b(665162027);
        if (i5 == 0) {
            i2 = (true != cavVarB.B(abgxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(str) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 131) != 130, i2 & 1)) {
            defpackage.cmt cmtVar2 = defpackage.cmw.c;
            defpackage.cmw cmwVarC = defpackage.azm.c(cmtVar2, 1.0f);
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.k, cavVarB, 48);
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar2.x);
            defpackage.cje cjeVarAi = cbtVar2.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarC);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar2.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.cmw cmwVarD = defpackage.azm.d(defpackage.awy.b(cmtVar2, 1.0f, true), 1.0f);
            int i6 = i2 & 14;
            defpackage.aojh aojhVar2 = defpackage.aojh.a;
            java.lang.Object objR = cbtVar2.R();
            if (i6 == 4 || objR == defpackage.cau.a) {
                objR = new bil(abgxVar, 10);
                cbtVar2.ab(objR);
            }
            defpackage.den.aR(defpackage.den.x(defpackage.cvy.a(cmwVarD, aojhVar2, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR), "space_above_answer_method"), cavVarB);
            if (str != null) {
                cavVarB.u(1680642442);
                cmtVar = cmtVar2;
                aojhVar = aojhVar2;
                cbtVar = cbtVar2;
                i3 = i6;
                z = false;
                defpackage.bvt.b(str, defpackage.den.x(defpackage.den.ba(cmtVar2, 0.0f, 0.0f, 0.0f, 16.0f), "incoming_will_disconnect_text"), defpackage.den.ak(cavVarB).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, defpackage.den.an(cavVarB).k, cavVarB, ((i2 >> 6) & 14) | 48, 0, 131064);
                cavVar2 = cavVarB;
                cbtVar.W(false);
            } else {
                cavVar2 = cavVarB;
                cmtVar = cmtVar2;
                i3 = i6;
                aojhVar = aojhVar2;
                cbtVar = cbtVar2;
                z = false;
                cavVar2.u(1680897293);
                cbtVar.W(false);
            }
            java.lang.Object objR2 = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR2 == obj) {
                i4 = 4;
                objR2 = new oou(4);
                cbtVar.ab(objR2);
            } else {
                i4 = 4;
            }
            cmwVar2 = cmtVar;
            abgxVar2 = abgxVar;
            int i7 = i3;
            defpackage.afsq.bj(abgxVar2, defpackage.azm.d(defpackage.den.aZ(defpackage.den.x(defpackage.dig.b(cmwVar2, z, (defpackage.aonj) objR2), "answer_method_box"), 16.0f, 0.0f), 1.0f), cavVar2, i7);
            defpackage.cmw cmwVarD2 = defpackage.azm.d(defpackage.azm.e(cmwVar2, defpackage.wv.j(2131166178, cavVar2)), 1.0f);
            java.lang.Object objR3 = cbtVar.R();
            if (i7 == i4 || objR3 == obj) {
                objR3 = new bil(abgxVar2, 11);
                cbtVar.ab(objR3);
            }
            defpackage.den.aR(defpackage.den.x(defpackage.cvy.a(cmwVarD2, aojhVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR3), "space_below_answer_method"), cavVar2);
            cbtVar.W(true);
        } else {
            abgxVar2 = abgxVar;
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kko(abgxVar2, cmwVar2, str, i, 20);
        }
    }

    public static oze al(own ownVar) {
        defpackage.aooh.f(ownVar, "answerMethodModel");
        java.lang.String str = ownVar.a;
        defpackage.aooh.e(str, "callId(...)");
        return new oze(str);
    }

    public static oza am(own ownVar) {
        defpackage.aooh.f(ownVar, "answerMethodModel");
        java.lang.String str = ownVar.a;
        defpackage.aooh.e(str, "callId(...)");
        return new oza(str);
    }

    public static oyz an(own ownVar) {
        defpackage.aooh.f(ownVar, "answerMethodModel");
        java.lang.String str = ownVar.a;
        defpackage.aooh.e(str, "callId(...)");
        return new oyz(str);
    }

    public static otc ao() {
        otc otcVar = new otc();
        otcVar.c(false);
        short s = otcVar.d;
        otcVar.a = qit.a;
        otcVar.d = (short) (s | 48);
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        defpackage.aooh.e(optionalEmpty, "empty(...)");
        ap(otcVar, optionalEmpty);
        j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
        defpackage.aooh.e(optionalEmpty2, "empty(...)");
        defpackage.aooh.f(optionalEmpty2, "callId");
        otcVar.c = (java.lang.String) defpackage.aooh.q(optionalEmpty2);
        otcVar.d = (short) (otcVar.d | 128);
        j$.util.Optional optionalEmpty3 = j$.util.Optional.empty();
        defpackage.aooh.e(optionalEmpty3, "empty(...)");
        otcVar.f(optionalEmpty3);
        return otcVar;
    }

    public static void ap(otc otcVar, j$.util.Optional optional) {
        defpackage.aooh.f(optional, "calleeId");
        otcVar.b = (abvz) defpackage.aooh.q(optional);
        otcVar.d = (short) (otcVar.d | 64);
    }

    public static java.lang.CharSequence aq(android.content.Context context, java.lang.CharSequence charSequence) {
        java.lang.String strGroup;
        pei peiVar = new pei(context, 1);
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(\\*[0-9][0-9][\\- \\.]*)?".concat(java.lang.String.valueOf(android.util.Patterns.PHONE.pattern()))).matcher(charSequence.toString());
        int i = 0;
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (i < iStart) {
                spannableStringBuilder.append(charSequence.subSequence(i, iStart));
            }
            java.lang.String str = "";
            if (matcher.groupCount() > 0 && (strGroup = matcher.group(1)) != null) {
                str = strGroup;
            }
            spannableStringBuilder.append(android.text.TextUtils.concat("\u202a", str, (java.lang.CharSequence) aa$.ExternalSyntheticApiModelOutline1.m(peiVar, charSequence.subSequence(iStart + str.length(), iEnd)), "\u202c"));
            i = iEnd;
        }
        if (i < charSequence.length()) {
            spannableStringBuilder.append(charSequence.subSequence(i, charSequence.length()));
        }
        return new android.text.SpannedString(spannableStringBuilder);
    }

    public static defpackage.ore ar(android.content.Context context) {
        return (defpackage.ore) defpackage.agab.aH(context, defpackage.ore.class);
    }

    public static defpackage.orb as(android.content.Context context) {
        return (defpackage.orb) defpackage.agab.aH(context, defpackage.orb.class);
    }

    public static defpackage.oqw at(android.content.Context context) {
        return (defpackage.oqw) defpackage.agab.aH(context, defpackage.oqw.class);
    }

    public static int au(abwd abwdVar) {
        defpackage.aooh.f(abwdVar, "photoInfo");
        if (abwdVar.j) {
            return 1;
        }
        if (abwdVar.k) {
            return 2;
        }
        if (abwdVar.i) {
            return 3;
        }
        if (abwdVar.h) {
            return 4;
        }
        if (abwdVar.n) {
            return 5;
        }
        if (abwdVar.q) {
            return 6;
        }
        java.lang.String str = abwdVar.e;
        defpackage.aooh.e(str, "getPhotoUri(...)");
        if (str.length() > 0) {
            return 7;
        }
        return abwdVar.f != 0 ? 8 : 9;
    }

    public static android.net.Uri av(abwd abwdVar) {
        if (abwdVar.d.isEmpty() || abwdVar.i) {
            return null;
        }
        vaa vaaVar = new vaa((android.net.Uri) null);
        vaaVar.Z(abwdVar.c.isEmpty() ? abwdVar.d : abwdVar.c, 20);
        vaaVar.aa(abwdVar.d, (java.lang.Integer) null);
        if ((abwdVar.b & 32768) != 0) {
            abvq abvqVar = abwdVar.p;
            if (abvqVar == null) {
                abvqVar = abvq.a;
            }
            vaaVar.Y(abvqVar);
        }
        return vaaVar.W();
    }

    public static afaw aw(android.net.Uri uri) {
        defpackage.aooh.f(uri, "<this>");
        if (defpackage.aooh.n(uri.getAuthority(), "com.google.android.dialer.files")) {
            afaw afawVar = afaw.b;
            defpackage.aooh.c(afawVar);
            return afawVar;
        }
        afaw afawVar2 = afaw.a;
        defpackage.aooh.c(afawVar2);
        return afawVar2;
    }

    public static /* synthetic */ java.lang.String ax(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i != 2) {
            return i != 3 ? "VIDEO_CALL_INTRO" : "REVELIO";
        }
        return "CALL_SCREEN";
    }

    public static java.lang.String ay() {
        return defpackage.dwz.c() ? okp.a("EXTRA_EMERGENCY_CALL_TO_SATELLITE_HANDOVER_TYPE") : "android.telephony.extra.EMERGENCY_CALL_TO_SATELLITE_HANDOVER_TYPE";
    }

    public static java.lang.String az() {
        return defpackage.dwz.c() ? okp.a("EXTRA_EMERGENCY_CALL_TO_SATELLITE_LAUNCH_INTENT") : "android.telephony.extra.EMERGENCY_CALL_TO_SATELLITE_LAUNCH_INTENT";
    }

    public static defpackage.ajcq b(defpackage.ajcq ajcqVar) {
        defpackage.ajcq ajcqVarA = defpackage.aiql.A(ajcqVar);
        defpackage.aooh.e(ajcqVarA, "nonCancellationPropagating(...)");
        return ajcqVarA;
    }

    public static /* synthetic */ rhx bA(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new rhx(akzxVar);
    }

    public static /* synthetic */ rhx bB(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new rhx(akzxVar);
    }

    public static void bC(qzm qzmVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1030112041);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(qzmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.mni.cs(qzmVar.a, qzmVar.c, qzmVar.b, defpackage.den.x(cmwVar, "more_menu_sheet"), qzmVar.e, false, defpackage.cfo.j(1941611884, new defpackage.qyh(qzmVar, cmwVar, 3, null), cavVarB), cavVarB, 1572864, 32);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(qzmVar, cmwVar, i, 11);
        }
    }

    public static void bD(defpackage.cmw cmwVar, java.lang.String str, defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-36391440);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.cmw cmwVarE = defpackage.azm.e(defpackage.den.x(cmwVar, "culdesac_button"), defpackage.wv.j(2131165529, cavVarB));
            defpackage.ayy ayyVar = acpl.a;
            defpackage.aaoo.ak(aomyVar, cmwVarE, false, null, acpl.a(defpackage.den.ak(cavVarB).p, defpackage.den.ak(cavVarB).q, cavVarB, 12), null, null, new defpackage.azc(16.0f, 0.0f, 8.0f, 0.0f), defpackage.cfo.j(1396531680, new defpackage.ped(str, 3), cavVarB), cavVarB, ((i2 >> 6) & 14) | 817889280, 364);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppx(cmwVar, str, aomyVar, i, 4, (byte[]) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:41:0x0130  */
    /* JADX WARN: Code duplicated, block: B:42:0x0134  */
    /* JADX WARN: Code duplicated, block: B:46:0x015c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0167  */
    /* JADX WARN: Code duplicated, block: B:51:0x0171  */
    /* JADX WARN: Code duplicated, block: B:54:0x0178  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:64:0x020a  */
    /* JADX WARN: Code duplicated, block: B:65:0x020c  */
    /* JADX WARN: Code duplicated, block: B:70:0x021e  */
    public static void bE(qyz qyzVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        defpackage.cdk cdkVarI;
        pqe pqeVar;
        defpackage.cmj cmjVar;
        defpackage.cbt cbtVar;
        defpackage.aomy aomyVar;
        defpackage.cmt cmtVar;
        defpackage.azk azkVar;
        qxp qxpVar;
        qtr qtrVarB;
        qtr qtrVar;
        defpackage.cmt cmtVar2;
        defpackage.cbt cbtVar2;
        qxp qxpVar2;
        boolean z;
        boolean z2;
        java.lang.Object objR;
        qyz qyzVar2 = qyzVar;
        int i2 = i & 6;
        defpackage.cav cavVarB = cavVar.b(2086907751);
        int i3 = i2 == 0 ? (true != cavVarB.B(qyzVar2) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        int i4 = i3;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            java.util.List<qyl> list = qyzVar2.a;
            if (list.isEmpty()) {
                cdkVarI = cavVarB.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    pqeVar = new pqe(qyzVar2, cmwVar, i, 9);
                }
            } else {
                float fJ = defpackage.wv.j(2131165533, cavVarB);
                gnk gnkVar = ro.t(cavVarB).a;
                defpackage.cmw cmwVarD = defpackage.azm.d(cmwVar, 1.0f);
                if (gnkVar.a()) {
                    cavVarB.u(-94736398);
                    ((defpackage.cbt) cavVarB).W(false);
                } else {
                    cavVarB.u(-280150717);
                    int i5 = ((android.content.res.Configuration) cavVarB.e(defpackage.dep.a)).orientation;
                    ((defpackage.cbt) cavVarB).W(false);
                    if (i5 == 2) {
                        cmjVar = defpackage.cmh.h;
                    }
                    defpackage.cye cyeVarB = defpackage.awo.b(cmjVar, false);
                    cbtVar = (defpackage.cbt) cavVarB;
                    int iM = defpackage.anty.M(cbtVar.x);
                    defpackage.cje cjeVarAi = cbtVar.ai();
                    defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarD);
                    aomyVar = defpackage.dam.a;
                    cavVarB.v();
                    if (cbtVar.w) {
                        cavVarB.j(aomyVar);
                    } else {
                        cavVarB.x();
                    }
                    defpackage.aonn aonnVar = defpackage.dam.e;
                    defpackage.cev.c(cavVarB, cyeVarB, aonnVar);
                    defpackage.aonn aonnVar2 = defpackage.dam.d;
                    defpackage.cev.c(cavVarB, cjeVarAi, aonnVar2);
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
                    defpackage.aonn aonnVar3 = defpackage.dam.f;
                    defpackage.cev.c(cavVarB, numValueOf, aonnVar3);
                    defpackage.aonj aonjVar = defpackage.dam.g;
                    defpackage.cev.b(cavVarB, aonjVar);
                    defpackage.aonn aonnVar4 = defpackage.dam.c;
                    defpackage.cev.c(cavVarB, cmwVarM, aonnVar4);
                    boolean z3 = !qyzVar2.c;
                    cmtVar = defpackage.cmw.c;
                    defpackage.cmw cmwVarX = defpackage.den.x(defpackage.uu.m(defpackage.uu.k(defpackage.den.aZ(defpackage.den.ba(defpackage.aehj.aR(cmtVar, z3, cavVarB), 0.0f, fJ, 0.0f, 0.0f), 26.0f, 0.0f), defpackage.den.bc(26.0f, fJ, 26.0f, 0.0f, 8)), defpackage.uu.f(cavVarB)), "culdesac_row");
                    defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.f(8.0f), defpackage.cmh.m, cavVarB, 6);
                    int iM2 = defpackage.anty.M(cbtVar.x);
                    defpackage.cje cjeVarAi2 = cbtVar.ai();
                    defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarX);
                    cavVarB.v();
                    if (cbtVar.w) {
                        cavVarB.j(aomyVar);
                    } else {
                        cavVarB.x();
                    }
                    defpackage.cev.c(cavVarB, cyeVarA, aonnVar);
                    defpackage.cev.c(cavVarB, cjeVarAi2, aonnVar2);
                    defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
                    defpackage.cev.b(cavVarB, aonjVar);
                    defpackage.cev.c(cavVarB, cmwVarM2, aonnVar4);
                    azkVar = defpackage.azk.a;
                    cavVarB.u(-436077896);
                    for (qyl qylVar : list) {
                        qxpVar = qylVar.c;
                        if (qxpVar == null) {
                            qxpVar = qxp.a;
                        }
                        qtrVarB = qtr.b(qxpVar.f);
                        if (qtrVarB == null) {
                            qtrVarB = qtr.a;
                        }
                        qtrVar = qtrVarB;
                        if (qtrVar == qtr.e) {
                            cavVarB.u(-436068267);
                            defpackage.cmw cmwVarA = azkVar.a(cmtVar, 1.0f, true);
                            defpackage.cja cjaVarJ = defpackage.cfo.j(-1388674708, new bit(azkVar, qylVar, qyzVar, qtrVar, 9), cavVarB);
                            cmtVar2 = cmtVar;
                            cbtVar2 = cbtVar;
                            defpackage.aaoo.az("call_assist_category_id", cmwVarA, true, cjaVarJ, cavVarB, 3462, 0);
                            cbtVar2.W(false);
                        } else {
                            cmtVar2 = cmtVar;
                            cbtVar2 = cbtVar;
                            if (qtrVar == qtr.b) {
                                cavVarB.u(-436049425);
                                defpackage.cmw cmwVarA2 = azkVar.a(cmtVar2, 1.0f, true);
                                defpackage.cja cjaVarJ2 = defpackage.cfo.j(-1447429661, new bit(azkVar, qylVar, qyzVar, qtrVar, 10), cavVarB);
                                cbtVar2 = cbtVar2;
                                cmtVar2 = cmtVar2;
                                defpackage.aaoo.az("sonic_category_id", cmwVarA2, true, cjaVarJ2, cavVarB, 3462, 0);
                                cbtVar2.W(false);
                            } else {
                                cavVarB.u(-436035754);
                                defpackage.cmw cmwVarA3 = azkVar.a(cmtVar2, 1.0f, true);
                                qxpVar2 = qylVar.c;
                                if (qxpVar2 == null) {
                                    qxpVar2 = qxp.a;
                                }
                                java.lang.String str = qxpVar2.d;
                                defpackage.aooh.e(str, "getLabel(...)");
                                if ((i4 & 14) == 4) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                z2 = z | cavVarB.z(qtrVar.k);
                                objR = cbtVar2.R();
                                if (z2 || objR == defpackage.cau.a) {
                                    objR = new ksu(qyzVar, qtrVar, 20, (byte[]) null);
                                    cbtVar2.ab(objR);
                                }
                                bD(cmwVarA3, str, (defpackage.aomy) objR, cavVarB, 0);
                                cbtVar2.W(false);
                            }
                        }
                        cbtVar = cbtVar2;
                        cmtVar = cmtVar2;
                    }
                    qyzVar2 = qyzVar;
                    defpackage.cbt cbtVar3 = cbtVar;
                    cbtVar3.W(false);
                    cbtVar3.W(true);
                    cbtVar3.W(true);
                }
                cmjVar = defpackage.cmh.e;
                defpackage.cye cyeVarB2 = defpackage.awo.b(cmjVar, false);
                cbtVar = (defpackage.cbt) cavVarB;
                int iM3 = defpackage.anty.M(cbtVar.x);
                defpackage.cje cjeVarAi3 = cbtVar.ai();
                defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVarB, cmwVarD);
                aomyVar = defpackage.dam.a;
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar);
                } else {
                    cavVarB.x();
                }
                defpackage.aonn aonnVar5 = defpackage.dam.e;
                defpackage.cev.c(cavVarB, cyeVarB2, aonnVar5);
                defpackage.aonn aonnVar6 = defpackage.dam.d;
                defpackage.cev.c(cavVarB, cjeVarAi3, aonnVar6);
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iM3);
                defpackage.aonn aonnVar7 = defpackage.dam.f;
                defpackage.cev.c(cavVarB, numValueOf2, aonnVar7);
                defpackage.aonj aonjVar2 = defpackage.dam.g;
                defpackage.cev.b(cavVarB, aonjVar2);
                defpackage.aonn aonnVar8 = defpackage.dam.c;
                defpackage.cev.c(cavVarB, cmwVarM3, aonnVar8);
                boolean z4 = !qyzVar2.c;
                cmtVar = defpackage.cmw.c;
                defpackage.cmw cmwVarX2 = defpackage.den.x(defpackage.uu.m(defpackage.uu.k(defpackage.den.aZ(defpackage.den.ba(defpackage.aehj.aR(cmtVar, z4, cavVarB), 0.0f, fJ, 0.0f, 0.0f), 26.0f, 0.0f), defpackage.den.bc(26.0f, fJ, 26.0f, 0.0f, 8)), defpackage.uu.f(cavVarB)), "culdesac_row");
                defpackage.cye cyeVarA2 = defpackage.azh.a(defpackage.awi.f(8.0f), defpackage.cmh.m, cavVarB, 6);
                int iM4 = defpackage.anty.M(cbtVar.x);
                defpackage.cje cjeVarAi4 = cbtVar.ai();
                defpackage.cmw cmwVarM4 = defpackage.cfo.m(cavVarB, cmwVarX2);
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar);
                } else {
                    cavVarB.x();
                }
                defpackage.cev.c(cavVarB, cyeVarA2, aonnVar5);
                defpackage.cev.c(cavVarB, cjeVarAi4, aonnVar6);
                defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM4), aonnVar7);
                defpackage.cev.b(cavVarB, aonjVar2);
                defpackage.cev.c(cavVarB, cmwVarM4, aonnVar8);
                azkVar = defpackage.azk.a;
                cavVarB.u(-436077896);
                while (r6.hasNext()) {
                    qxpVar = qylVar.c;
                    if (qxpVar == null) {
                        qxpVar = qxp.a;
                    }
                    qtrVarB = qtr.b(qxpVar.f);
                    if (qtrVarB == null) {
                        qtrVarB = qtr.a;
                    }
                    qtrVar = qtrVarB;
                    if (qtrVar == qtr.e) {
                        cavVarB.u(-436068267);
                        defpackage.cmw cmwVarA4 = azkVar.a(cmtVar, 1.0f, true);
                        defpackage.cja cjaVarJ3 = defpackage.cfo.j(-1388674708, new bit(azkVar, qylVar, qyzVar, qtrVar, 9), cavVarB);
                        cmtVar2 = cmtVar;
                        cbtVar2 = cbtVar;
                        defpackage.aaoo.az("call_assist_category_id", cmwVarA4, true, cjaVarJ3, cavVarB, 3462, 0);
                        cbtVar2.W(false);
                    } else {
                        cmtVar2 = cmtVar;
                        cbtVar2 = cbtVar;
                        if (qtrVar == qtr.b) {
                            cavVarB.u(-436049425);
                            defpackage.cmw cmwVarA5 = azkVar.a(cmtVar2, 1.0f, true);
                            defpackage.cja cjaVarJ4 = defpackage.cfo.j(-1447429661, new bit(azkVar, qylVar, qyzVar, qtrVar, 10), cavVarB);
                            cbtVar2 = cbtVar2;
                            cmtVar2 = cmtVar2;
                            defpackage.aaoo.az("sonic_category_id", cmwVarA5, true, cjaVarJ4, cavVarB, 3462, 0);
                            cbtVar2.W(false);
                        } else {
                            cavVarB.u(-436035754);
                            defpackage.cmw cmwVarA6 = azkVar.a(cmtVar2, 1.0f, true);
                            qxpVar2 = qylVar.c;
                            if (qxpVar2 == null) {
                                qxpVar2 = qxp.a;
                            }
                            java.lang.String str2 = qxpVar2.d;
                            defpackage.aooh.e(str2, "getLabel(...)");
                            if ((i4 & 14) == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z2 = z | cavVarB.z(qtrVar.k);
                            objR = cbtVar2.R();
                            if (z2) {
                                objR = new ksu(qyzVar, qtrVar, 20, (byte[]) null);
                                cbtVar2.ab(objR);
                            } else {
                                objR = new ksu(qyzVar, qtrVar, 20, (byte[]) null);
                                cbtVar2.ab(objR);
                            }
                            bD(cmwVarA6, str2, (defpackage.aomy) objR, cavVarB, 0);
                            cbtVar2.W(false);
                        }
                    }
                    cbtVar = cbtVar2;
                    cmtVar = cmtVar2;
                }
                qyzVar2 = qyzVar;
                defpackage.cbt cbtVar4 = cbtVar;
                cbtVar4.W(false);
                cbtVar4.W(true);
                cbtVar4.W(true);
            }
            cdkVarI.c = pqeVar;
        }
        cavVarB.s();
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            pqeVar = new pqe(qyzVar2, cmwVar, i, 10);
            cdkVarI.c = pqeVar;
        }
    }

    public static void bF(java.util.List list, defpackage.aonj aonjVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1179716990);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            cmwVar2 = cmwVar;
            i2 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
        } else {
            cmwVar2 = cmwVar;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.cmw cmwVarX = defpackage.den.x(defpackage.azm.d(defpackage.cfd.K(cmwVar2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, defpackage.den.am(cavVarB).e, true, 0, 1042431), 1.0f), "call_assist_body");
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.f(2.0f), defpackage.cmh.j, cavVarB, 6);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarX);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            cavVarB.u(1556677922);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                bJ((quf) it.next(), aonjVar, null, cavVarB, i2 & 112);
            }
            cbtVar.W(false);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppx(list, aonjVar, cmwVar, i, 3);
        }
    }

    public static void bG(qye qyeVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1069977013);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(qyeVar) : cavVarB.D(qyeVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (!cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cmwVar2 = cmwVar;
            cavVarB.s();
        } else {
            if (qyeVar.d.isEmpty()) {
                defpackage.cdk cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new pqe(qyeVar, cmwVar, i, 7);
                    return;
                }
                return;
            }
            cmwVar2 = cmwVar;
            defpackage.mni.cs(qyeVar.a, qyeVar.c, qyeVar.b, cmwVar2, qyeVar.f, true, defpackage.cfo.j(-1778518510, new qxy(qyeVar, 2), cavVarB), cavVarB, ((i2 << 6) & 7168) | 1769472, 0);
        }
        defpackage.cdk cdkVarI2 = cavVarB.I();
        if (cdkVarI2 != null) {
            cdkVarI2.c = new pqe(qyeVar, cmwVar2, i, 8);
        }
    }

    public static void bH(quf qufVar, defpackage.cmw cmwVar, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1369680648);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(qufVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.cmw cmwVarA = !z ? cmwVar.a(defpackage.ru.o(defpackage.cmw.c, 0.38f)) : cmwVar;
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.e, defpackage.cmh.j, cavVarB, 6);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarA);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            cavVar2 = cavVarB;
            java.lang.String str = qufVar.g;
            defpackage.aooh.e(str, "getLabel(...)");
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.bvt.b(str, defpackage.azm.o(cmtVar, null, 3), 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, defpackage.den.an(cavVar2).i, cavVar2, 48, 24960, 110588);
            java.lang.String str2 = qufVar.h;
            defpackage.aooh.e(str2, "getDescription(...)");
            defpackage.bvt.b(str2, defpackage.azm.o(cmtVar, null, 3), 0L, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, defpackage.den.an(cavVar2).k, cavVar2, 48, 24960, 110588);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bsq(qufVar, cmwVar, z, i, 16, null);
        }
    }

    public static void bI(int i, java.lang.String str, long j, defpackage.cmw cmwVar, defpackage.cav cavVar, int i2) {
        int i3;
        long j2;
        defpackage.cav cavVar2;
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(-858530074);
        if (i4 == 0) {
            i3 = (true != cavVarB.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            j2 = j;
            i3 |= true != cavVarB.A(j2) ? 128 : 256;
        } else {
            j2 = j;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 1024 : 2048;
        }
        if (cavVarB.H((i3 & 1171) != 1170, i3 & 1)) {
            cavVar2 = cavVarB;
            hgt.q(defpackage.hcq.d(new hcj(i), cavVarB).b(), defpackage.afsq.bE(cmwVar, str, null), false, false, (hch) null, 0.0f, Integer.MAX_VALUE, 0, hgt.I(new defpackage.izg[]{hgt.H(gzx.K, new had(defpackage.cfd.L(j2)), new java.lang.String[]{"**"}, cavVarB)}, cavVarB), (defpackage.cmj) null, (cwy) null, false, 0, cavVar2, 1572864, 0, 0, 2088892);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new qyg(i, str, j, cmwVar, i2, 0);
        }
    }

    public static void bJ(quf qufVar, defpackage.aonj aonjVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(2050921310);
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(qufVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        int i5 = 0;
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            boolean z = (i4 & 112) == 32;
            int i6 = i4 & 14;
            boolean z2 = i6 == 4;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if ((z | z2) || objR == defpackage.cau.a) {
                objR = new ksu(aonjVar, qufVar, 19, (byte[]) null);
                cbtVar.ab(objR);
            }
            defpackage.aomy aomyVar = (defpackage.aomy) objR;
            defpackage.cmw cmwVarX = defpackage.den.x(cmtVar, "call_assist_feature_button");
            java.lang.Object objR2 = cbtVar.R();
            if (i6 == 4 || objR2 == defpackage.cau.a) {
                objR2 = new qji(qufVar, 11);
                cbtVar.ab(objR2);
            }
            cavVar2 = cavVarB;
            defpackage.bvo.d(aomyVar, defpackage.dig.b(cmwVarX, false, (defpackage.aonj) objR2), qufVar.i, defpackage.den.am(cavVarB).a, defpackage.den.ak(cavVarB).p, 0L, 0.0f, 0.0f, null, null, defpackage.cfo.j(-2089499799, new defpackage.qyh(qufVar, aonjVar, i5), cavVarB), cavVar2, 992);
            cmwVar2 = cmtVar;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppx(qufVar, aonjVar, cmwVar2, i, 2);
        }
    }

    public static void bK(qug qugVar, defpackage.aonj aonjVar, defpackage.cmw cmwVar, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(828231858);
        if (i3 == 0) {
            i2 = (true != cavVarB.z(qugVar.H) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != cavVarB.C(z) ? 1024 : 2048;
        }
        if (cavVarB.H((i4 & 1171) != 1170, i4 & 1)) {
            boolean z2 = (i4 & 112) == 32;
            boolean z3 = (i4 & 14) == 4;
            cmwVar2 = defpackage.cmw.c;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if ((z2 | z3) || objR == defpackage.cau.a) {
                objR = new ksu(aonjVar, qugVar, 18, (byte[]) null);
                cbtVar.ab(objR);
            }
            defpackage.aaoo.ak((defpackage.aomy) objR, defpackage.den.x(cmwVar2, "call_assist_stop_feature_text"), z, null, null, null, null, null, qyk.a, cavVarB, ((i4 >> 3) & 896) | 805306368, 504);
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppv(qugVar, aonjVar, cmwVar2, z, i, 3);
        }
    }

    public static void bL(qxn qxnVar, boolean z, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        boolean z2;
        float f;
        boolean z3;
        defpackage.cmw cmwVarA;
        boolean z4;
        int i3;
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(377835088);
        if (i4 == 0) {
            i2 = (true != cavVarB.B(qxnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.cer cerVarA = defpackage.aim.a(16.0f, null, cavVarB, 6, 14);
            boolean z5 = qxnVar.c;
            float f2 = true != z5 ? 24.0f : 4.0f;
            defpackage.cmw cmwVarBn = defpackage.den.bn(defpackage.azm.d(cmwVar, 1.0f), defpackage.den.ak(cavVarB).G, defpackage.bge.c(32.0f, 32.0f, 0.0f, 0.0f));
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarBn);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.aonn aonnVar = defpackage.dam.e;
            defpackage.cev.c(cavVarB, cyeVarB, aonnVar);
            defpackage.aonn aonnVar2 = defpackage.dam.d;
            defpackage.cev.c(cavVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            defpackage.aonn aonnVar3 = defpackage.dam.f;
            defpackage.cev.c(cavVarB, numValueOf, aonnVar3);
            defpackage.aonj aonjVar = defpackage.dam.g;
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.aonn aonnVar4 = defpackage.dam.c;
            defpackage.cev.c(cavVarB, cmwVarM, aonnVar4);
            defpackage.awt awtVar = defpackage.awt.a;
            float f3 = z5 ? 12.0f : ((defpackage.dpi) cerVarA.a()).a;
            cavVarB.u(-1503566432);
            if (z5) {
                z3 = false;
                f = 16.0f;
            } else {
                if (cr(ro.t(cavVarB).a, cavVarB)) {
                    f = 28.0f;
                } else {
                    f = z ? 44.0f : 48.0f;
                }
                z3 = false;
            }
            cbtVar.W(z3);
            defpackage.cmj cmjVar = z ? defpackage.cmh.b : defpackage.cmh.e;
            cavVarB.u(-1503533752);
            cavVarB.u(-1503547870);
            boolean z6 = !qxnVar.e;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarBa = defpackage.den.ba(defpackage.den.aZ(awtVar.a(defpackage.aehj.aR(cmtVar, z6, cavVarB), cmjVar), f2, 0.0f), 0.0f, f3, 0.0f, f);
            if (z) {
                cmwVarA = cmwVarBa.a(defpackage.uu.m(cmtVar, defpackage.uu.g(cavVarB)));
                z4 = true;
            } else {
                cmwVarA = cmwVarBa;
                z4 = false;
            }
            cbtVar.W(false);
            defpackage.cmw cmwVarK = defpackage.uu.k(cmwVarA, new defpackage.azc(f2, f3, f2, f));
            if (cr(ro.t(cavVarB).a, cavVarB)) {
                cmwVarK = cmwVarK.a(defpackage.uu.m(cmtVar, new azr(defpackage.uu.f(cavVarB), defpackage.uu.j(cavVarB))));
            }
            cbtVar.W(false);
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.k, cavVarB, 48);
            int iM2 = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi2 = cbtVar.ai();
            defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarK);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, aonnVar);
            defpackage.cev.c(cavVarB, cjeVarAi2, aonnVar2);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.cev.c(cavVarB, cmwVarM2, aonnVar4);
            if (qxnVar.d) {
                cavVarB.u(-1691937545);
                bR(qxnVar.b, defpackage.azm.d(cmtVar, 1.0f), cavVarB, 48);
                i3 = 0;
                cbtVar.W(false);
            } else {
                i3 = 0;
                cavVarB.u(-1691846002);
                cbtVar.W(false);
            }
            defpackage.aooh.f(cmtVar, "<this>");
            bS(qxnVar.a, defpackage.den.C(cmtVar, new defpackage.bmq(9)), cavVarB, i3);
            cbtVar.W(true);
            cbtVar.W(true);
            z2 = z4;
        } else {
            cavVarB.s();
            z2 = z;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bsq((java.lang.Object) qxnVar, z2, cmwVar, i, 15);
        }
    }

    public static java.lang.Boolean bM(defpackage.ccp ccpVar) {
        return (java.lang.Boolean) ccpVar.a();
    }

    public static void bN(qxm qxmVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1073192132);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(qxmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            int i4 = i2 & 14;
            if (qxmVar.j) {
                cavVarB.u(-269635348);
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR = cbtVar.R();
                java.lang.Object obj = defpackage.cau.a;
                if (objR == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);
                    cbtVar.ab(parcelableSnapshotMutableState);
                    objR = parcelableSnapshotMutableState;
                }
                defpackage.ccp ccpVar = (defpackage.ccp) objR;
                boolean zB = cavVarB.B(qxmVar.h);
                java.lang.Object objR2 = cbtVar.R();
                if (zB || objR2 == obj) {
                    objR2 = new ksu(qxmVar, ccpVar, 16, (byte[]) null);
                    cbtVar.ab(objR2);
                }
                boolean zBooleanValue = qxmVar.f;
                defpackage.aomy aomyVar = (defpackage.aomy) objR2;
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zBooleanValue);
                java.lang.Object objR3 = cbtVar.R();
                if (objR3 == obj) {
                    objR3 = new pbw(ccpVar, (defpackage.aoln) null, 10);
                    cbtVar.ab(objR3);
                }
                defpackage.cbp.g(boolValueOf, (defpackage.aonn) objR3, cavVarB);
                java.lang.Boolean boolBM = bM(ccpVar);
                java.lang.Object objR4 = cbtVar.R();
                if (i4 == 4 || objR4 == obj) {
                    objR4 = new ohh(qxmVar, ccpVar, (defpackage.aoln) null, 17);
                    cbtVar.ab(objR4);
                }
                defpackage.cbp.g(boolBM, (defpackage.aonn) objR4, cavVarB);
                java.lang.Boolean boolBM2 = bM(ccpVar);
                if (boolBM2 != null) {
                    zBooleanValue = boolBM2.booleanValue();
                }
                bO(qxmVar, zBooleanValue, aomyVar, cavVarB, i4);
                cbtVar.W(false);
            } else {
                cavVarB.u(-268778818);
                bO(qxmVar, qxmVar.f, qxmVar.h, cavVarB, i4);
                ((defpackage.cbt) cavVarB).W(false);
            }
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kmg(qxmVar, i, 19);
        }
    }

    public static void bO(qxm qxmVar, boolean z, defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        boolean z2;
        defpackage.dpi dpiVar;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1251235740);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(qxmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.bgc bgcVarA = defpackage.bge.a(((java.lang.Number) defpackage.aim.c(java.lang.Integer.valueOf(true != z ? 50 : 25), defpackage.alo.b, defpackage.aim.a, null, "IntAnimation", cavVarB, 0, 8).a()).intValue());
            if (ro.t(cavVarB).a.a()) {
                cavVarB.u(-2045538689);
                ((defpackage.cbt) cavVarB).W(false);
                z2 = false;
            } else {
                cavVarB.u(903846166);
                boolean z3 = ((android.content.res.Configuration) cavVarB.e(defpackage.dep.a)).orientation == 2;
                ((defpackage.cbt) cavVarB).W(false);
                z2 = z3;
            }
            if (z2) {
                dpiVar = new defpackage.dpi(48.0f);
            } else {
                dpiVar = !qxmVar.i ? new defpackage.dpi(68.0f) : null;
            }
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarD = defpackage.azm.d(cmtVar, 1.0f);
            if (dpiVar != null) {
                cmwVarD = cmwVarD.a(defpackage.azm.e(cmtVar, dpiVar.a));
            }
            defpackage.cmw cmwVarX = defpackage.den.x(defpackage.azm.a(cmwVarD, 48.0f, 48.0f), "fixed_button__button");
            int i4 = i2 & 14;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (i4 == 4 || objR == defpackage.cau.a) {
                objR = new qji(qxmVar, 8);
                cbtVar.ab(objR);
            }
            defpackage.cmw cmwVarB = defpackage.dig.b(cmwVarX, false, (defpackage.aonj) objR);
            boolean z4 = qxmVar.g;
            long j = defpackage.den.ak(cavVarB).p;
            long j2 = defpackage.den.ak(cavVarB).q;
            long j3 = defpackage.den.ak(cavVarB).i;
            long j4 = defpackage.den.ak(cavVarB).g;
            long jH = defpackage.cqg.h(defpackage.abrz.t(17, cavVarB), 0.1f);
            int i5 = i2;
            long jH2 = defpackage.cqg.h(defpackage.abrz.t(17, cavVarB), 0.38f);
            defpackage.bor borVarAk = defpackage.den.ak(cavVarB);
            bqa bqaVar = borVarAk.af;
            if (bqaVar == null) {
                bqaVar = new bqa(defpackage.bos.b(borVarAk, 31), defpackage.bos.b(borVarAk, 14), defpackage.cqg.h(defpackage.bos.b(borVarAk, 17), 0.1f), defpackage.cqg.h(defpackage.bos.b(borVarAk, 17), 0.38f), defpackage.bos.b(borVarAk, 30), defpackage.bos.b(borVarAk, 13));
                borVarAk.af = bqaVar;
            }
            if (j == 16) {
                j = bqaVar.a;
            }
            long j5 = j;
            if (j2 == 16) {
                j2 = bqaVar.b;
            }
            bqa bqaVar2 = new bqa(j5, j2, jH != 16 ? jH : bqaVar.c, jH2 != 16 ? jH2 : bqaVar.d, j3 != 16 ? j3 : bqaVar.e, j4 != 16 ? j4 : bqaVar.f);
            int i6 = i5 & 896;
            java.lang.Object objR2 = cbtVar.R();
            if (i6 == 256 || objR2 == defpackage.cau.a) {
                objR2 = new qji(aomyVar, 9);
                cbtVar.ab(objR2);
            }
            defpackage.aaoo.Y(z, (defpackage.aonj) objR2, cmwVarB, z4, bqaVar2, bgcVarA, defpackage.cfo.j(797515177, new lpn(qxmVar, z2, 5), cavVarB), cavVarB, ((i5 >> 3) & 14) | 12582912);
            cavVar2 = cavVarB;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bsq(qxmVar, z, aomyVar, i, 14);
        }
    }

    public static void bP(qxm qxmVar, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        float f;
        float f2;
        boolean z2 = z;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-148718610);
        boolean z3 = true;
        if (i3 == 0) {
            i2 = (true != cavVarB.B(qxmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z2) ? 16 : 32;
        }
        if (!cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cavVarB.s();
        } else if (qxmVar.b) {
            cavVarB.u(1930301001);
            defpackage.cmn cmnVar = defpackage.cmh.n;
            defpackage.awb awbVarF = defpackage.awi.f(-4.0f);
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cye cyeVarA = defpackage.azh.a(awbVarF, cmnVar, cavVarB, 54);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmtVar);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            boolean z4 = qxmVar.i;
            if (z4) {
                f2 = 16.0f;
            } else if (z2) {
                z2 = true;
                f2 = 24.0f;
            } else {
                f2 = 28.0f;
                z2 = false;
            }
            defpackage.aaoo.W(defpackage.wv.i(qxmVar.a, cavVarB, 6), qxmVar.d, defpackage.den.x(defpackage.azm.g(cmtVar, f2), "fixed_button__icon"), 0L, cavVarB, 0, 8);
            abja abjaVar = qxmVar.f ? abja.bJ : abja.bI;
            defpackage.aaoo.W(defpackage.aehj.aL(abjaVar, cavVarB), null, defpackage.aehj.aJ(defpackage.den.x(defpackage.azm.g(cmtVar, z4 ? 16.0f : 24.0f), "fixed_button__expand_icon"), abjaVar), 0L, cavVarB, 0, 8);
            cbtVar.W(true);
            cbtVar.W(false);
        } else {
            cavVarB.u(1931353978);
            boolean z5 = qxmVar.i;
            defpackage.cmt cmtVar2 = defpackage.cmw.c;
            if (z5) {
                z3 = z2;
                f = 16.0f;
            } else if (z2) {
                f = 24.0f;
            } else {
                f = 32.0f;
                z3 = false;
            }
            defpackage.aaoo.W(defpackage.wv.i(qxmVar.a, cavVarB, 6), qxmVar.d, defpackage.den.x(defpackage.azm.g(cmtVar2, f), "fixed_button__icon"), 0L, cavVarB, 0, 8);
            ((defpackage.cbt) cavVarB).W(false);
            z2 = z3;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new oa(qxmVar, z2, i, 9);
        }
    }

    public static void bQ(qxm qxmVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        defpackage.cbt cbtVar;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(2083014972);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(qxmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            boolean z = qxmVar.i;
            defpackage.cmw cmwVarA = z ? cmwVar.a(defpackage.azm.e(defpackage.cmw.c, 60.0f)) : cmwVar;
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.k, cavVarB, 48);
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar2.x);
            defpackage.cje cjeVarAi = cbtVar2.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarA);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar2.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            bN(qxmVar, cavVarB, i2 & 14);
            if (z) {
                cavVarB.u(1033733253);
                defpackage.den.aR(defpackage.azm.e(defpackage.cmw.c, 4.0f), cavVarB);
                cbtVar2.W(false);
                cavVar2 = cavVarB;
                cbtVar = cbtVar2;
            } else {
                cavVarB.u(1033805111);
                cavVar2 = cavVarB;
                cbtVar = cbtVar2;
                defpackage.abrz.k(qxmVar.c, defpackage.afsq.bD(defpackage.den.ba(defpackage.cmw.c, 4.0f, 4.0f, 4.0f, 4.0f)), defpackage.den.ak(cavVar2).s, 0L, null, null, 0L, new defpackage.dot(3), 0L, 2, false, 2, 2, null, defpackage.dkz.z(defpackage.den.an(cavVar2).k, 0L, 0L, null, null, null, null, 0L, 0L, null, 0, defpackage.dpy.e(1.1d), null, null, 131587, 1, 10354687), cavVar2, 0, 221568, 76792);
                cbtVar.W(false);
            }
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(qxmVar, cmwVar, i, 5);
        }
    }

    public static void bR(java.util.List list, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aooh.f(list, "buttons");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1983479252);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.cmw cmwVarX = defpackage.den.x(cmwVar, "fixed_button__button_bar");
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.f(8.0f), defpackage.cmh.m, cavVarB, 0);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarX);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.azk azkVar = defpackage.azk.a;
            cavVarB.u(2025017010);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                bQ((qxm) it.next(), azkVar.a(defpackage.cmw.c, 1.0f, true), cavVarB, 0);
            }
            cbtVar.W(false);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(list, cmwVar, i, 6);
        }
    }

    public static void bS(qxl qxlVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.dpi dpiVar;
        float f;
        defpackage.aomy aomyVar;
        defpackage.aooh.f(qxlVar, "uiData");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(646648373);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(qxlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cavVarB.u(-1341167122);
            boolean z = qxlVar.d;
            float f2 = 56.0f;
            if (z) {
                dpiVar = new defpackage.dpi(56.0f);
                f = 16.0f;
            } else {
                if (ro.t(cavVarB).a.a()) {
                    cavVarB.u(-1202569268);
                    ((defpackage.cbt) cavVarB).W(false);
                } else {
                    cavVarB.u(2039417385);
                    int i4 = ((android.content.res.Configuration) cavVarB.e(defpackage.dep.a)).orientation;
                    ((defpackage.cbt) cavVarB).W(false);
                    dpiVar = i4 == 2 ? new defpackage.dpi(192.0f) : null;
                    f = 32.0f;
                }
                f2 = 72.0f;
                f = 32.0f;
            }
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.W(false);
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = new defpackage.qks(6);
                cbtVar.ab(objR);
            }
            defpackage.cmw cmwVarA = defpackage.azm.e(defpackage.dig.b(cmwVar, false, (defpackage.aonj) objR), f2).a(dpiVar != null ? defpackage.azm.k(defpackage.cmw.c, dpiVar.a) : defpackage.azm.d(defpackage.cmw.c, 1.0f));
            defpackage.cmw cmwVarA2 = z ? cmwVarA.a(defpackage.den.aZ(defpackage.cmw.c, 0.0f, 4.0f)) : cmwVarA.a(defpackage.azm.e(defpackage.cmw.c, 72.0f));
            boolean z2 = qxlVar.a;
            defpackage.cmw cmwVarX = defpackage.den.x(cmwVarA2, "end_call_fab_test_tag");
            if (!z2) {
                cmwVarX = cmwVarX.a(defpackage.ru.o(defpackage.cmw.c, 0.38f));
            }
            defpackage.bgc bgcVar = defpackage.bge.a;
            long j = defpackage.abts.F(cavVarB).s;
            long j2 = defpackage.abts.F(cavVarB).t;
            bpn bpnVar = new bpn(0.0f, 0.0f, 0.0f, 0.0f);
            if (z2) {
                cavVarB.u(1374868301);
                cbtVar.W(false);
                aomyVar = qxlVar.b;
            } else {
                cavVarB.u(1374905625);
                java.lang.Object objR2 = cbtVar.R();
                if (objR2 == obj) {
                    objR2 = new defpackage.jaf(13);
                    cbtVar.ab(objR2);
                }
                aomyVar = (defpackage.aomy) objR2;
                cbtVar.W(false);
            }
            defpackage.aaoo.ad(aomyVar, cmwVarX, bgcVar, j, j2, bpnVar, defpackage.cfo.j(1212274359, new abmd(f, qxlVar, 1), cavVarB), cavVarB, 12582912, 64);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(qxlVar, cmwVar, i, 3);
        }
    }

    public static void bT(java.lang.String str, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        java.lang.String str2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1797606672);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            str2 = str;
            cmwVar2 = cmwVar;
            defpackage.aaoo.W(defpackage.aehj.aL(abja.ag, cavVarB), str2, cmwVar2, 0L, cavVarB, (i2 << 3) & 1008, 8);
        } else {
            str2 = str;
            cmwVar2 = cmwVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(str2, cmwVar2, i, 4);
        }
    }

    public static void bU(qvc qvcVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVarL;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-398030026);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != cavVarB.B(qvcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if (cavVarB.H((i5 & 19) != 18, i5 & 1)) {
            boolean z = qvcVar.f;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            byte[] bArr = null;
            if (z) {
                cavVarB.u(692377260);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(692319600);
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                int i6 = i5 & 14;
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR = cbtVar.R();
                if (i6 == 4 || objR == defpackage.cau.a) {
                    objR = new pbw(qvcVar, (defpackage.aoln) null, 9);
                    cbtVar.ab(objR);
                }
                defpackage.cbp.g(bool, (defpackage.aonn) objR, cavVarB);
                cbtVar.W(false);
            }
            java.lang.String str = qvcVar.a;
            java.lang.String str2 = qvcVar.c;
            defpackage.aomy aomyVar = qvcVar.b;
            cavVarB.u(-254754128);
            if (ro.t(cavVarB).a.a()) {
                cavVarB.u(1882074844);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(1307638041);
                int i7 = ((android.content.res.Configuration) cavVarB.e(defpackage.dep.a)).orientation;
                ((defpackage.cbt) cavVarB).W(false);
                if (i7 == 2) {
                    cmwVarL = defpackage.uu.l(cmtVar, new ayn(defpackage.uu.f(cavVarB), 9));
                }
                ((defpackage.cbt) cavVarB).W(false);
                defpackage.mni.cs(str, str2, aomyVar, cmwVarL, qvcVar.g, false, defpackage.cfo.j(1713711699, new defpackage.qyh(qvcVar, cmtVar, i4, bArr), cavVarB), cavVarB, 1572864, 32);
                cmwVar = cmtVar;
            }
            cmwVarL = cmtVar;
            ((defpackage.cbt) cavVarB).W(false);
            defpackage.mni.cs(str, str2, aomyVar, cmwVarL, qvcVar.g, false, defpackage.cfo.j(1713711699, new defpackage.qyh(qvcVar, cmtVar, i4, bArr), cavVarB), cavVarB, 1572864, 32);
            cmwVar = cmtVar;
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(qvcVar, cmwVar, i, 2);
        }
    }

    public static qum bV(defpackage.zzx zzxVar, quo quoVar) {
        return qum.a(((quq) ((defpackage.aoin) zzxVar.k().get(quoVar)).a()).b().b);
    }

    public static void bW(qug qugVar, quh quhVar) {
        defpackage.aooh.f(qugVar, "voiceButtonKey");
        switch (qugVar.ordinal()) {
            case 0:
                quhVar.a(qugVar, "Clicked unknown voice button");
                return;
            case 1:
                quhVar.a(qugVar, "Clicked More Button");
                return;
            case 2:
                quhVar.a(qugVar, "Clicked Audio Route Button");
                return;
            case 3:
                quhVar.a(qugVar, "Clicked Mute Button");
                return;
            case 4:
                quhVar.a(qugVar, "Clicked Dialpad Button");
                return;
            case 5:
                quhVar.a(qugVar, "Clicked Merge Button");
                return;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                quhVar.a(qugVar, "Clicked Add Call Button");
                return;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                quhVar.a(qugVar, "Clicked Upgrade To Rtt Button");
                return;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                quhVar.a(qugVar, "Clicked Swap Sim Button");
                return;
            case 9:
                quhVar.a(qugVar, "Clicked Manage Conference Button");
                return;
            case 10:
                quhVar.a(qugVar, "Clicked Upgrade To Carrier Video Button");
                return;
            case 11:
                quhVar.a(qugVar, "Clicked Upgrade to Duo Video Button");
                return;
            case 12:
                quhVar.a(qugVar, "Clicked Record Button");
                return;
            case 13:
                quhVar.a(qugVar, "Clicked Swap Button");
                return;
            case 14:
                quhVar.a(qugVar, "Clicked Hold Button");
                return;
            case 15:
                quhVar.a(qugVar, "Clicked Unhold Button");
                return;
            case 16:
                quhVar.a(qugVar, "Clicked Call Transfer Consultative Button");
                return;
            case 17:
                quhVar.a(qugVar, "Clicked Upgrade To Transmission Only Video Button");
                return;
            case 18:
                quhVar.a(qugVar, "Clicked Select Upgrade Video Type Button");
                return;
            case 19:
                quhVar.a(qugVar, "Clicked Sonic Button");
                return;
            case 20:
                quhVar.a(qugVar, "Clicked Fermat Button");
                return;
            case 21:
                quhVar.a(qugVar, "Clicked Atlas Button");
                return;
            case 22:
                quhVar.a(qugVar, "Clicked Xatu Button");
                return;
            case 23:
                quhVar.a(qugVar, "Clicked Sharpie Button");
                return;
            case 24:
                quhVar.a(qugVar, "Clicked Nautilus Button");
                return;
            case 25:
                quhVar.a(qugVar, "Clicked Beacon Button");
                return;
            case 26:
                quhVar.a(qugVar, "Clicked Debug Button");
                return;
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                return;
            default:
                throw new defpackage.aois();
        }
    }

    public static int bX(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 10000 ? 0 : 10001;
        }
        return 2;
    }

    public static int bY(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 3) {
            return i != 6 ? 0 : 2;
        }
        return 1;
    }

    public static int bZ(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 5 ? 0 : 2;
        }
        return 1;
    }

    public static /* synthetic */ java.lang.String ba(int i) {
        if (i == 2) {
            return "SEARCH_MODE_INVALID";
        }
        if (i != 3) {
            return i != 4 ? "UNRECOGNIZED" : "SEARCH_MODE_DIALPAD";
        }
        return "SEARCH_MODE_SEARCH_BAR";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void bb(defpackage.aw awVar, rri rriVar) throws afeb {
        defpackage.ahvr.e(awVar, defpackage.mlb.class, new rcn(rriVar, 19));
        defpackage.ahvr.e(awVar, defpackage.mlc.class, new rcn(rriVar, 20));
        defpackage.ahvr.e(awVar, defpackage.mld.class, new iya(18));
        defpackage.ahvr.e(awVar, rrg.class, new rrj(rriVar, 1));
        defpackage.ahvr.e(awVar, tjr.class, new rrj(rriVar, 0));
    }

    public static rrf bc(rqv rqvVar) {
        defpackage.aooh.f(rqvVar, "args");
        rrf rrfVar = new rrf();
        defpackage.amxr.g(rrfVar);
        defpackage.ahgl.b(rrfVar, rqvVar);
        return rrfVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void bd(defpackage.aw awVar, rqz rqzVar) throws afeb {
        defpackage.ahvr.e(awVar, defpackage.mlb.class, new rcn(rqzVar, 15));
        defpackage.ahvr.e(awVar, defpackage.mlc.class, new rcn(rqzVar, 16));
        defpackage.ahvr.e(awVar, defpackage.mld.class, new iya(17));
        defpackage.ahvr.e(awVar, rqx.class, new rcn(rqzVar, 17));
        defpackage.ahvr.e(awVar, tjr.class, new rcn(rqzVar, 18));
    }

    public static rqu be(rqv rqvVar) {
        defpackage.aooh.f(rqvVar, "args");
        rqu rquVar = new rqu();
        defpackage.amxr.g(rquVar);
        defpackage.ahgl.b(rquVar, rqvVar);
        return rquVar;
    }

    public static void bf(java.lang.String str, defpackage.akzx akzxVar) {
        defpackage.aooh.f(str, "value");
        akzxVar.u();
        defpackage.rpd rpdVar = (defpackage.rpd) akzxVar.b;
        defpackage.rpd rpdVar2 = defpackage.rpd.a;
        j$.util.Objects.requireNonNull(str);
        rpdVar.b |= 1;
        rpdVar.d = str;
    }

    public static aiyi bg(amre amreVar) {
        int i;
        defpackage.aooh.f(amreVar, "<this>");
        defpackage.akzx akzxVarM = aiyi.a.m();
        defpackage.aooh.e(akzxVarM, "newBuilder(...)");
        int iAQ = defpackage.a.aQ(amreVar.c);
        if (iAQ == 0) {
            iAQ = 1;
        }
        int i2 = iAQ - 1;
        if (i2 != 0) {
            i = i2 != 1 ? 3 : 2;
        } else {
            i = 1;
        }
        akzxVarM.u();
        aiyi aiyiVar = akzxVarM.b;
        aiyiVar.c = i - 1;
        aiyiVar.b |= 1;
        tbe tbeVarB = tbe.b(amreVar.d);
        if (tbeVarB == null) {
            tbeVarB = tbe.a;
        }
        int iCq = cq(tbeVarB);
        akzxVarM.u();
        aiyi aiyiVar2 = akzxVarM.b;
        aiyiVar2.d = iCq - 1;
        aiyiVar2.b |= 2;
        tbe tbeVarB2 = tbe.b(amreVar.e);
        if (tbeVarB2 == null) {
            tbeVarB2 = tbe.a;
        }
        int iCq2 = cq(tbeVarB2);
        akzxVarM.u();
        aiyi aiyiVar3 = akzxVarM.b;
        aiyiVar3.e = iCq2 - 1;
        aiyiVar3.b |= 4;
        tbe tbeVarB3 = tbe.b(amreVar.f);
        if (tbeVarB3 == null) {
            tbeVarB3 = tbe.a;
        }
        int iCq3 = cq(tbeVarB3);
        akzxVarM.u();
        aiyi aiyiVar4 = akzxVarM.b;
        aiyiVar4.f = iCq3 - 1;
        aiyiVar4.b |= 8;
        tbe tbeVarB4 = tbe.b(amreVar.g);
        if (tbeVarB4 == null) {
            tbeVarB4 = tbe.a;
        }
        int iCq4 = cq(tbeVarB4);
        akzxVarM.u();
        aiyi aiyiVar5 = akzxVarM.b;
        aiyiVar5.g = iCq4 - 1;
        aiyiVar5.b |= 16;
        aiyi aiyiVarP = akzxVarM.r();
        defpackage.aooh.e(aiyiVarP, "build(...)");
        return aiyiVarP;
    }

    public static long bh(long j) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        return calendar.getTimeInMillis();
    }

    public static boolean bi(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        long j = rnr.a;
        defpackage.ahvr.ci(str);
        defpackage.ahvr.ci(sharedPreferences);
        java.util.Set<java.lang.String> stringSet = sharedPreferences.getStringSet("RATE_LIMITER_PREFS", new defpackage.acc(0));
        defpackage.acc accVar = new defpackage.acc(0);
        for (java.lang.String str2 : stringSet) {
            if (java.lang.System.currentTimeMillis() - java.lang.Long.parseLong(rnr.b(str2)[1]) <= rnr.a) {
                accVar.add(str2);
            }
        }
        if (accVar.c < 1000) {
            defpackage.acb acbVar = new defpackage.acb(accVar);
            while (acbVar.hasNext()) {
                if (str.equals(rnr.b((java.lang.String) acbVar.next())[0])) {
                    rnr.a(accVar, sharedPreferences);
                }
            }
            accVar.add(str + '_' + java.lang.System.currentTimeMillis());
            rnr.a(accVar, sharedPreferences);
            return false;
        }
        rnr.a(accVar, sharedPreferences);
        return true;
    }

    public static java.lang.String bj(java.util.List list) {
        java.lang.String strM = da$.ExternalSyntheticApiModelOutline1.m(da$.ExternalSyntheticApiModelOutline1.m(java.util.Locale.getDefault()), list);
        defpackage.aooh.e(strM, "format(...)");
        return strM;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void bk(al alVar, ric ricVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new rcn(ricVar, 13));
        defpackage.ahvr.d(alVar, ahtf.class, new rcn(ricVar, 14));
    }

    public static defpackage.rhn bl(android.content.Context context) {
        return (defpackage.rhn) defpackage.agab.aH(context, defpackage.rhn.class);
    }

    public static /* synthetic */ java.lang.String bm(int i) {
        return i != 1 ? "COUNTDOWN_TEXT" : "TEXT_RES";
    }

    public static /* synthetic */ java.lang.String bn(int i) {
        if (i == 1) {
            return "NORMAL";
        }
        if (i != 2) {
            return i != 3 ? "null" : "CONNECTING";
        }
        return "HIGHLIGHTED";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void bo(defpackage.aw awVar, rgi rgiVar) throws afeb {
        defpackage.ahvr.e(awVar, rfm.class, new rcn(rgiVar, 11));
        defpackage.ahvr.e(awVar, rfw.class, new rcn(rgiVar, 12));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void bp(al alVar, rgc rgcVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new rcn(rgcVar, 9));
        defpackage.ahvr.d(alVar, ahtf.class, new rcn(rgcVar, 10));
    }

    public static ret bq(rer rerVar) {
        j$.util.Objects.requireNonNull(rerVar);
        return new rel(rerVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void br(defpackage.aw awVar, rdk rdkVar) throws afeb {
        defpackage.ahvr.e(awVar, pyr.class, new rcn(rdkVar, 3));
        defpackage.ahvr.e(awVar, raf.class, new rcn(rdkVar, 4));
        defpackage.ahvr.e(awVar, rcv.class, new rcn(rdkVar, 5));
        defpackage.ahvr.e(awVar, rdm.class, new rcn(rdkVar, 6));
        defpackage.ahvr.e(awVar, rdt.class, new rcn(rdkVar, 7));
        defpackage.ahvr.e(awVar, rdu.class, new rcn(rdkVar, 8));
    }

    public static /* synthetic */ hgw bs(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new hgw(akzxVar);
    }

    public static /* synthetic */ hgw bt(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new hgw(akzxVar);
    }

    public static /* synthetic */ hgw bu(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new hgw(akzxVar);
    }

    public static /* synthetic */ hgw bv(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new hgw(akzxVar);
    }

    public static /* synthetic */ hgw bw(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new hgw(akzxVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void bx(al alVar, rcr rcrVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtf.class, new rcn(rcrVar, 2));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void by(al alVar, rcm rcmVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtf.class, new rcn(rcmVar, 0));
    }

    public static /* synthetic */ int bz(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 4);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof qzs) {
            return 0;
        }
        if (obj instanceof qzq) {
            return 1;
        }
        return obj instanceof qzr ? 2 : -2;
    }

    public static pdu c(pdx pdxVar) {
        pdv pdvVar = (pdv) pdxVar;
        int i = pdvVar.b;
        if (i == 2) {
            return i == 2 ? (pdu) pdvVar.c : pdu.a;
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void ca(al alVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new iya(15));
        defpackage.ahvr.d(alVar, ahtf.class, new iya(16));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void cb(al alVar, qsd qsdVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtf.class, new pmi(qsdVar, 14));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void cc(al alVar, qsa qsaVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtf.class, new pmi(qsaVar, 13));
    }

    public static /* synthetic */ java.lang.String cd(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "BOTTOM";
        }
        return "TOP";
    }

    public static /* synthetic */ java.lang.String ce(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "RIGHT";
        }
        return "LEFT";
    }

    public static /* synthetic */ her cf(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new her(akzxVar, (byte[]) null);
    }

    public static /* synthetic */ her cg(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new her(akzxVar, (byte[]) null);
    }

    public static /* synthetic */ hgw ch(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new hgw(akzxVar);
    }

    public static /* synthetic */ hgw ci(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new hgw(akzxVar);
    }

    public static /* synthetic */ hgw cj(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new hgw(akzxVar);
    }

    public static /* synthetic */ hgw ck(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new hgw(akzxVar);
    }

    public static /* synthetic */ hgw cl(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new hgw(akzxVar);
    }

    public static /* synthetic */ her cm(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new her(akzxVar, (byte[]) null);
    }

    public static /* synthetic */ hgw cn(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new hgw(akzxVar);
    }

    public static void co(defpackage.pez pezVar, java.lang.String str, defpackage.cmw cmwVar, boolean z, boolean z2, defpackage.cav cavVar, int i) {
        int i2;
        java.lang.String str2;
        defpackage.cmw cmwVar2;
        long j;
        long j2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-235712287);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(pezVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.C(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.C(z2) ? 8192 : 16384;
        }
        if (!cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            str2 = str;
            cmwVar2 = cmwVar;
            cavVarB.s();
        } else {
            if (pezVar == null) {
                cavVarB.u(166976014);
                defpackage.den.aR(cmwVar, cavVarB);
                ((defpackage.cbt) cavVarB).W(false);
                defpackage.cdk cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new lpm(str, cmwVar, z, z2, i, 3);
                    return;
                }
                return;
            }
            str2 = str;
            cmwVar2 = cmwVar;
            cavVarB.u(167055777);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.W(false);
            if (z2 && z) {
                cavVarB.u(167113127);
                j = defpackage.den.ak(cavVarB).h;
                cbtVar.W(false);
            } else {
                cavVarB.u(167176553);
                j = defpackage.den.ak(cavVarB).F;
                cbtVar.W(false);
            }
            if (z2 && z) {
                cavVarB.u(167276869);
                j2 = defpackage.den.ak(cavVarB).i;
                cbtVar.W(false);
            } else {
                cavVarB.u(167342217);
                j2 = defpackage.den.ak(cavVarB).s;
                cbtVar.W(false);
            }
            defpackage.bry bryVarAl = defpackage.den.al(cavVarB);
            defpackage.cmw cmwVarBn = defpackage.den.bn(cmwVar2, j, defpackage.den.am(cavVarB).d);
            if (!z) {
                cmwVarBn = cmwVarBn.a(defpackage.ru.o(defpackage.cmw.c, 0.38f));
            }
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.e, false);
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarBn);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            boolean zB = cavVarB.B(bryVarAl);
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == defpackage.cau.a) {
                objR = new qji(bryVarAl, 10);
                cbtVar.ab(objR);
            }
            defpackage.uu.a(pezVar, null, (defpackage.aonj) objR, null, null, null, defpackage.cfo.j(-1338017056, new qyf(str2, j2), cavVarB), cavVarB, (i2 & 14) | 1572864, 58);
            cbtVar.W(true);
        }
        defpackage.cdk cdkVarI2 = cavVarB.I();
        if (cdkVarI2 != null) {
            cdkVarI2.c = new smh(pezVar, str2, cmwVar2, z, z2, i, 1);
        }
    }

    private static abhh cp(rsa rsaVar, defpackage.rsd rsdVar, android.content.Context context, defpackage.aonj aonjVar) {
        return new abhh(cs(rsaVar.b, context), new obp(aonjVar, rsdVar, rsaVar, 6, (byte[]) null));
    }

    private static int cq(tbe tbeVar) {
        int iOrdinal = tbeVar.ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 1 : 4;
        }
        return 3;
    }

    private static boolean cr(gnk gnkVar, defpackage.cav cavVar) {
        if (gnkVar.a()) {
            cavVar.u(660979453);
            ((defpackage.cbt) cavVar).W(false);
            return false;
        }
        cavVar.u(-2056888104);
        boolean z = ((android.content.res.Configuration) cavVar.e(defpackage.dep.a)).orientation == 2;
        ((defpackage.cbt) cavVar).W(false);
        return z;
    }

    private static java.lang.String cs(defpackage.pez pezVar, android.content.Context context) {
        j$.util.Objects.checkIndex(0, 3);
        if (pezVar instanceof rsf) {
            return ((rsf) pezVar).a;
        }
        if (!(pezVar instanceof rse)) {
            throw new defpackage.aois();
        }
        rse rseVar = (rse) pezVar;
        java.lang.Object obj = rseVar.b;
        java.lang.String string = obj != null ? context.getString(rseVar.a, obj) : context.getString(rseVar.a);
        defpackage.aooh.c(string);
        return string;
    }

    public static boolean d(pdv pdvVar) {
        return (pdvVar.b == 3 && ((java.lang.Boolean) pdvVar.c).booleanValue()) || pdvVar.b == 2;
    }

    public static /* synthetic */ oyx e(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new oyx(akzxVar, (byte[]) null);
    }

    public static /* synthetic */ oyx f(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new oyx(akzxVar, (byte[]) null);
    }

    public static void g(pdt pdtVar, defpackage.cmw cmwVar, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        float f;
        float f2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(361048489);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(pdtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            float f3 = true != z ? 1.0f : 0.0f;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cer cerVarB = defpackage.aim.b(f3, null, null, cavVarB, 0, 30);
            int i5 = ((i4 >> 6) & 14) | 48;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = defpackage.aij.a(0.0f);
                cbtVar.ab(objR);
            }
            defpackage.aii aiiVar = (defpackage.aii) objR;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
            boolean zD = cavVarB.D(aiiVar) | ((((i5 & 14) ^ 6) > 4 && cavVarB.C(z)) || (i5 & 6) == 4);
            java.lang.Object objR2 = cbtVar.R();
            if (zD || objR2 == obj) {
                objR2 = new abgn(aiiVar, z, (defpackage.aoln) null, 2);
                cbtVar.ab(objR2);
            }
            defpackage.cbp.e(aiiVar, boolValueOf, 32000, (defpackage.aonn) objR2, cavVarB);
            defpackage.air airVar = aiiVar.b;
            java.lang.Float fValueOf = java.lang.Float.valueOf(0.92f);
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(1.0f);
            defpackage.aoiu aoiuVar = new defpackage.aoiu(fValueOf, fValueOf2);
            defpackage.aoiu aoiuVar2 = new defpackage.aoiu(java.lang.Float.valueOf(0.3f), fValueOf2);
            defpackage.aooh.f(cerVarB, "morphProgress");
            defpackage.aoiu aoiuVar3 = new defpackage.aoiu(fValueOf2, fValueOf2);
            java.lang.Number number = (java.lang.Number) aoiuVar.a;
            float fFloatValue = number.floatValue();
            java.lang.Number number2 = (java.lang.Number) aoiuVar3.a;
            float fFloatValue2 = number2.floatValue();
            java.lang.Number number3 = (java.lang.Number) aoiuVar2.a;
            boolean zY = cavVarB.y(fFloatValue) | cavVarB.y(fFloatValue2) | cavVarB.y(number3.floatValue());
            java.lang.Object objR3 = cbtVar.R();
            if (zY || objR3 == obj) {
                objR3 = defpackage.abts.O(number.floatValue(), number2.floatValue(), number3.floatValue());
                cbtVar.ab(objR3);
            }
            ely elyVar = (ely) objR3;
            java.lang.Number number4 = (java.lang.Number) aoiuVar.b;
            float fFloatValue3 = number4.floatValue();
            java.lang.Number number5 = (java.lang.Number) aoiuVar3.b;
            float fFloatValue4 = number5.floatValue();
            java.lang.Number number6 = (java.lang.Number) aoiuVar2.b;
            boolean zY2 = cavVarB.y(fFloatValue3) | cavVarB.y(fFloatValue4) | cavVarB.y(number6.floatValue());
            java.lang.Object objR4 = cbtVar.R();
            if (zY2 || objR4 == obj) {
                objR4 = defpackage.abts.O(number4.floatValue(), number5.floatValue(), number6.floatValue());
                cbtVar.ab(objR4);
            }
            ely elyVar2 = (ely) objR4;
            boolean zB = cavVarB.B(elyVar) | cavVarB.B(elyVar2);
            java.lang.Object objR5 = cbtVar.R();
            if (zB || objR5 == obj) {
                objR5 = new defpackage.izg(elyVar, elyVar2);
                cbtVar.ab(objR5);
            }
            defpackage.izg izgVar = (defpackage.izg) objR5;
            boolean zB2 = cavVarB.B(izgVar) | cavVarB.B(cerVarB) | cavVarB.B(airVar);
            java.lang.Object objR6 = cbtVar.R();
            if (zB2 || objR6 == obj) {
                ajx ajxVar = new ajx(aoiuVar, cerVarB, izgVar, airVar, 11);
                defpackage.ajxw ajxwVar = defpackage.ceo.a;
                objR6 = new defpackage.cbk(ajxVar, null);
                cbtVar.ab(objR6);
            }
            defpackage.cer cerVar = (defpackage.cer) objR6;
            int i6 = pdtVar.b - 1;
            if (i6 != 0) {
                f = i6 != 1 ? 0.65f : 0.55f;
            } else {
                f = 0.45f;
            }
            if (i6 != 0) {
                f2 = i6 != 1 ? 240.0f : 160.0f;
            } else {
                f2 = 80.0f;
            }
            defpackage.cmw cmwVarB = defpackage.azm.b(defpackage.den.x(cmtVar, "monogram_test_tag"), f + 0.1f + 0.1f);
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.k, cavVarB, 48);
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarB);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.aonn aonnVar = defpackage.dam.e;
            defpackage.cev.c(cavVarB, cyeVarA, aonnVar);
            defpackage.aonn aonnVar2 = defpackage.dam.d;
            defpackage.cev.c(cavVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            defpackage.aonn aonnVar3 = defpackage.dam.f;
            defpackage.cev.c(cavVarB, numValueOf, aonnVar3);
            defpackage.aonj aonjVar = defpackage.dam.g;
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.aonn aonnVar4 = defpackage.dam.c;
            defpackage.cev.c(cavVarB, cmwVarM, aonnVar4);
            defpackage.den.aR(defpackage.awy.b(cmtVar, 0.1f, true), cavVarB);
            defpackage.cmw cmwVarB2 = defpackage.awy.b(cmtVar, f, true);
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.e, false);
            int iM2 = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi2 = cbtVar.ai();
            defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarB2);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, aonnVar);
            defpackage.cev.c(cavVarB, cjeVarAi2, aonnVar2);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.cev.c(cavVarB, cmwVarM2, aonnVar4);
            defpackage.aehj.ao(pdtVar.a, defpackage.azm.f(cmtVar, Float.NaN, f2), (defpackage.crd) cerVar.a(), cavVarB, 0, 0);
            cbtVar.W(true);
            defpackage.den.aR(defpackage.awy.b(cmtVar, 0.1f, true), cavVarB);
            cbtVar.W(true);
            cmwVar2 = cmtVar;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bsq(pdtVar, cmwVar2, z, i, 12, null);
        }
    }

    public static pdo h() {
        pdo pdoVar = new pdo();
        defpackage.amxr.g(pdoVar);
        return pdoVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void i(afqz afqzVar, pdd pddVar) throws afeb {
        defpackage.ahvr.d(afqzVar, pcz.class, new lyu(pddVar, 19));
    }

    public static pcy j() {
        oyx oyxVarS = s(pcu.a.m());
        oyxVarS.k(false);
        return pcy.aX(oyxVarS.j());
    }

    public static zmv k(zmw zmwVar, android.content.Context context, defpackage.zms zmsVar) {
        j$.util.Optional optionalOf;
        zmu zmuVar = new zmu();
        zmuVar.a = zmwVar;
        int iOrdinal = zmwVar.ordinal();
        if (iOrdinal == 0) {
            optionalOf = j$.util.Optional.of(context.getString(2132017467));
        } else if (iOrdinal == 1) {
            optionalOf = j$.util.Optional.of(context.getString(2132017465));
        } else if (iOrdinal == 2) {
            optionalOf = j$.util.Optional.of(context.getString(2132017466));
        } else {
            if (iOrdinal != 3) {
                throw new java.lang.IllegalArgumentException("Audio route (" + zmwVar.name() + ") does not support generic device name.");
            }
            optionalOf = j$.util.Optional.of(context.getString(2132017470));
        }
        defpackage.aooh.c(optionalOf);
        zmuVar.c(optionalOf);
        zmuVar.d(j$.util.Optional.of(java.lang.Boolean.valueOf(zmsVar.a() == zmwVar)));
        return zmuVar.a();
    }

    public static void l(java.lang.Integer num, int i, defpackage.cav cavVar, int i2) {
        int i3;
        int i4;
        int i5;
        defpackage.cja cjaVarJ;
        int i6 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(-433358906);
        if (i6 == 0) {
            i3 = (true != cavVarB.B(num) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.z(i) ? 16 : 32;
        }
        if (cavVarB.H((i3 & 19) != 18, i3 & 1)) {
            java.lang.String strF = defpackage.dfa.f(i, cavVarB);
            defpackage.cmt cmtVar = defpackage.cmw.c;
            boolean zB = cavVarB.B(strF);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == defpackage.cau.a) {
                objR = new opy(strF, 7);
                cbtVar.ab(objR);
            }
            defpackage.cmw cmwVarA = defpackage.dig.a(cmtVar, (defpackage.aonj) objR);
            defpackage.bgc bgcVar = defpackage.bge.a;
            defpackage.ayy ayyVar = acqv.a;
            long jH = defpackage.cqg.h(defpackage.den.ak(cavVarB).r, 0.16f);
            long j = defpackage.den.ak(cavVarB).q;
            long jT = defpackage.abrz.t(25, cavVarB);
            long jH2 = defpackage.cqg.h(defpackage.abrz.t(17, cavVarB), 0.38f);
            long jH3 = defpackage.cqg.h(defpackage.abrz.t(17, cavVarB), 0.38f);
            float f = defpackage.bvj.a;
            defpackage.bor borVarAk = defpackage.den.ak(cavVarB);
            defpackage.boc bocVar = defpackage.boq.a;
            bod bodVar = borVarAk.aa;
            if (bodVar == null) {
                bodVar = new bod(defpackage.cfd.M(0), defpackage.bos.b(borVarAk, 18), defpackage.bos.b(borVarAk, 25), defpackage.cfd.S(), defpackage.cfd.M(0), defpackage.cqg.h(defpackage.bos.b(borVarAk, 17), 0.38f), defpackage.cqg.h(defpackage.bos.b(borVarAk, 17), 0.38f), defpackage.cfd.S());
                borVarAk.aa = bodVar;
            }
            bod bodVarB = bodVar.b(jH, j, jT, defpackage.cfd.S(), defpackage.cfd.M(0), jH2, jH3, defpackage.cfd.S());
            long jM = defpackage.cfd.M(0);
            defpackage.cqg.h(defpackage.abrz.t(17, cavVarB), 0.12f);
            defpackage.amu amuVarBl = defpackage.den.bl(1.0f, jM);
            if (num != null) {
                cavVarB.u(477157950);
                cjaVarJ = defpackage.cfo.j(-1743719704, new ntw(num, 13), cavVarB);
                i5 = 0;
                cbtVar.W(false);
            } else {
                i5 = 0;
                cavVarB.u(477224166);
                cbtVar.W(false);
                cjaVarJ = null;
            }
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == defpackage.cau.a) {
                objR2 = new defpackage.jaf(11);
                cbtVar.ab(objR2);
            }
            defpackage.cja cjaVarJ2 = defpackage.cfo.j(1470651400, new ntw(strF, 14), cavVarB);
            i4 = i5;
            defpackage.abrz.x((defpackage.aomy) objR2, cjaVarJ2, cmwVarA, false, cjaVarJ, bgcVar, bodVarB, null, amuVarBl, null, null, cavVarB, 54, 0);
        } else {
            i4 = 0;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pbt(num, i, i2, i4);
        }
    }

    public static void m(int i, defpackage.cav cavVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(1033061904);
        if (i4 == 0) {
            i3 = (true != cavVarB.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (cavVarB.H((i3 & 3) != 2, i3 & 1)) {
            defpackage.aaoo.W(defpackage.wv.i(i, cavVarB, ((i3 << 3) & 112) | 6), null, defpackage.den.x(defpackage.azm.g(defpackage.cmw.c, 18.0f), "legal_disclaimer_chip_icon"), defpackage.den.ak(cavVarB).s, cavVarB, 384, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pec(i, i2, 1);
        }
    }

    public static void n(ouj oujVar, java.lang.String str, java.lang.String str2, defpackage.aonj aonjVar, defpackage.aonj aonjVar2, boolean z, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        java.lang.String str3;
        boolean z2;
        defpackage.aono aonoVar2;
        defpackage.cav cavVar2;
        defpackage.cdk cdkVarI;
        defpackage.bmp bmpVar;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1225388272);
        if (i3 == 0) {
            i2 = (true != cavVarB.z(oujVar.n) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= true != cavVarB.B(str3) ? 16 : 32;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(str2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aonjVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            z2 = z;
            i2 |= true != cavVarB.C(z2) ? 65536 : 131072;
        } else {
            z2 = z;
        }
        if ((1572864 & i) == 0) {
            aonoVar2 = aonoVar;
            i2 |= true != cavVarB.D(aonoVar2) ? 524288 : 1048576;
        } else {
            aonoVar2 = aonoVar;
        }
        if (cavVarB.H((599187 & i2) != 599186, i2 & 1)) {
            int i4 = i2 >> 6;
            boolean z3 = (i2 & 57344) == 16384;
            boolean z4 = (i2 & 14) == 4;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if ((z3 | z4) || objR == defpackage.cau.a) {
                objR = new ofa(aonjVar2, oujVar, (defpackage.aoln) null, 16);
                cbtVar.ab(objR);
            }
            defpackage.cbp.g(oujVar, (defpackage.aonn) objR, cavVarB);
            if (str2 != null) {
                cavVarB.u(-1679594623);
                defpackage.aaoo.az(str2, null, false, defpackage.cfo.j(635004542, new pbv(oujVar, str3, aonjVar, z2, aonoVar2, 0), cavVarB), cavVarB, (i4 & 14) | 3072, 6);
                cbtVar.W(false);
                cdkVarI = cavVarB.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    bmpVar = new defpackage.bmp(oujVar, str, str2, aonjVar, aonjVar2, z, aonoVar, i, 9);
                }
            } else {
                cavVarB.u(-1679240014);
                cbtVar.W(false);
                o(oujVar, str, aonjVar, z, aonoVar, cavVarB, (i2 & 126) | ((i2 >> 3) & 896) | (i4 & 7168) | (i4 & 57344));
                cavVar2 = cavVarB;
            }
            cdkVarI.c = bmpVar;
        }
        cavVar2 = cavVarB;
        cavVar2.s();
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            bmpVar = new defpackage.bmp(oujVar, str, str2, aonjVar, aonjVar2, z, aonoVar, i, 10);
            cdkVarI.c = bmpVar;
        }
    }

    public static void o(ouj oujVar, java.lang.String str, defpackage.aonj aonjVar, boolean z, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1214426010);
        if (i3 == 0) {
            i2 = (true != cavVarB.z(oujVar.n) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.C(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            float f = true != z ? 16.0f : 8.0f;
            defpackage.ayy ayyVar = acpl.a;
            defpackage.bni bniVarB = acpl.b(defpackage.den.ak(cavVarB).D, cavVarB, 14);
            defpackage.azc azcVar = new defpackage.azc(16.0f, f, 16.0f, f);
            defpackage.cmw cmwVarX = defpackage.den.x(defpackage.cmw.c, "answer_chip");
            int i4 = i2 & 112;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (i4 == 32 || objR == defpackage.cau.a) {
                objR = new opy(str, 9);
                cbtVar.ab(objR);
            }
            defpackage.cmw cmwVarB = defpackage.dig.b(cmwVarX, false, (defpackage.aonj) objR);
            boolean z2 = (i2 & 896) == 256;
            boolean z3 = (i2 & 14) == 4;
            java.lang.Object objR2 = cbtVar.R();
            if ((z2 | z3) || objR2 == defpackage.cau.a) {
                objR2 = new ksu(aonjVar, oujVar, 12, (byte[]) null);
                cbtVar.ab(objR2);
            }
            cavVar2 = cavVarB;
            defpackage.aaoo.ak((defpackage.aomy) objR2, cmwVarB, false, null, bniVarB, null, null, azcVar, aonoVar, cavVar2, (i2 << 15) & 1879048192, 364);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pbu(oujVar, str, aonjVar, z, aonoVar, i, 0);
        }
    }

    public static void p(pby pbyVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3;
        defpackage.cmw cmwVar2;
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1276790016);
        if (i4 == 0) {
            i2 = (true != cavVarB.B(pbyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if (cavVarB.H((i5 & 19) != 18, i5 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.awb awbVarF = defpackage.awi.f(8.0f);
            defpackage.cmn cmnVar = defpackage.cmh.n;
            defpackage.ayy ayyVarBb = defpackage.den.bb(24.0f, 2);
            int i6 = i5 & 14;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (i6 == 4 || objR == defpackage.cau.a) {
                objR = new opy(pbyVar, 8);
                cbtVar.ab(objR);
            }
            int i7 = ((i5 >> 3) & 14) | 221568;
            i3 = 18;
            cmwVar2 = cmtVar;
            defpackage.den.aN(cmwVar2, null, ayyVarBb, awbVarF, cmnVar, null, false, null, null, (defpackage.aonj) objR, cavVarB, i7, 0, 970);
        } else {
            i3 = 18;
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kcv(pbyVar, cmwVar2, i, i3);
        }
    }

    public static void q(pbx pbxVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        defpackage.cdk cdkVarI;
        kcv kcvVar;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1736885073);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(pbxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            defpackage.aonj aonjVar = pbxVar.b;
            java.util.List list = pbxVar.a;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            if (list.isEmpty()) {
                cdkVarI = cavVarB.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    kcvVar = new kcv(pbxVar, cmtVar, i, 19);
                }
            } else {
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                int i5 = i4 & 14;
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR = cbtVar.R();
                if (i5 == 4 || objR == defpackage.cau.a) {
                    objR = new pbw(pbxVar, (defpackage.aoln) null, 0);
                    cbtVar.ab(objR);
                }
                defpackage.cbp.g(bool, (defpackage.aonn) objR, cavVarB);
                defpackage.awb awbVarF = defpackage.awi.f(8.0f);
                defpackage.cmn cmnVar = defpackage.cmh.n;
                defpackage.ayy ayyVarBb = defpackage.den.bb(24.0f, 2);
                boolean zD = cavVarB.D(list) | cavVarB.B(aonjVar);
                boolean z = i5 == 4;
                java.lang.Object objR2 = cbtVar.R();
                if ((zD | z) || objR2 == defpackage.cau.a) {
                    mkm mkmVar = new mkm(list, aonjVar, pbxVar, 2, (byte[]) null);
                    cbtVar.ab(mkmVar);
                    objR2 = mkmVar;
                }
                cavVar2 = cavVarB;
                cmwVar2 = cmtVar;
                defpackage.den.aN(cmwVar2, null, ayyVarBb, awbVarF, cmnVar, null, false, null, null, (defpackage.aonj) objR2, cavVar2, ((i4 >> 3) & 14) | 221568, 0, 970);
            }
            cdkVarI.c = kcvVar;
        }
        cavVar2 = cavVarB;
        cavVar2.s();
        cmwVar2 = cmwVar;
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            kcvVar = new kcv(pbxVar, cmwVar2, i, 20);
            cdkVarI.c = kcvVar;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void r(defpackage.aw awVar, pbp pbpVar) throws afeb {
        defpackage.ahvr.e(awVar, oyz.class, new lyu(pbpVar, 13));
        defpackage.ahvr.e(awVar, oza.class, new lyu(pbpVar, 14));
        defpackage.ahvr.e(awVar, ozb.class, new lyu(pbpVar, 15));
        defpackage.ahvr.e(awVar, ozc.class, new lyu(pbpVar, 16));
        defpackage.ahvr.e(awVar, ozd.class, new lyu(pbpVar, 17));
        defpackage.ahvr.e(awVar, oze.class, new lyu(pbpVar, 18));
    }

    public static /* synthetic */ oyx s(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new oyx(akzxVar, (byte[]) null);
    }

    public static /* synthetic */ oyx t(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new oyx(akzxVar, (byte[]) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void u(defpackage.aw awVar, qnv qnvVar) throws afeb {
        defpackage.ahvr.e(awVar, oza.class, new pmi(qnvVar, 10));
        defpackage.ahvr.e(awVar, ozb.class, new pmi(qnvVar, 11));
        defpackage.ahvr.e(awVar, oze.class, new pmi(qnvVar, 12));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void v(al alVar, qhr qhrVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new iya(14));
        defpackage.ahvr.d(alVar, ahtf.class, new pmi(qhrVar, 9));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void w(defpackage.aw awVar, qhj qhjVar) throws afeb {
        defpackage.ahvr.e(awVar, pyr.class, new pmi(qhjVar, 6));
        defpackage.ahvr.e(awVar, qhq.class, new pmi(qhjVar, 7));
        defpackage.ahvr.e(awVar, qhu.class, new pmi(qhjVar, 8));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void x(al alVar, qcw qcwVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new pmi(qcwVar, 4));
        defpackage.ahvr.d(alVar, ahtf.class, new pmi(qcwVar, 5));
    }

    public static /* synthetic */ boolean y(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, qbw qbwVar) {
        return ((java.lang.Boolean) aoinVar.a()).booleanValue() || ((java.lang.Boolean) aoinVar2.a()).booleanValue() || qbwVar.a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void z(al alVar, pxt pxtVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new pmi(pxtVar, 2));
        defpackage.ahvr.d(alVar, ahtf.class, new pmi(pxtVar, 3));
    }

    public pez() {
    }

    public pez(short[] sArr) {
    }

    public pez(char[] cArr) {
        new android.util.SparseArray();
        new java.util.ArrayList();
    }
}
