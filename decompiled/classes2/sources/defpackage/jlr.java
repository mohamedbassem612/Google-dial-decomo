package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class jlr {
    public jlr() {
    }

    public static void A(cmw cmwVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-244779417);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            cye cyeVarB = awo.b(cmh.e, false);
            cbt cbtVar = (cbt) cavVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVar);
            aomy aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarB, dam.e);
            cev.c(cavVarB, cjeVarAi, dam.d);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVarB, dam.g);
            cev.c(cavVarB, cmwVarM, dam.c);
            cavVar2 = cavVarB;
            bvt.b(dfa.f(2132018185, cavVarB), den.aZ(azm.d(cmw.c, 0.6f), 24.0f, 0.0f), den.ak(cavVarB).s, 0L, (dnd) null, (dmq) null, 0L, new dot(3), 0L, 0, false, 0, 0, (aonj) null, den.an(cavVarB).g, cavVar2, 48, 0, 130040);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ajs(cmwVar, i, 16);
        }
    }

    public static void B(kiu kiuVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1468824797);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(kiuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 16 : 32;
        }
        if (!cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            cbtVarB.s();
        } else if (kiuVar == null) {
            cbtVarB.u(-632603030);
            A(cmwVar, cbtVarB, (i2 >> 3) & 14);
            cbtVarB.W(false);
        } else {
            cbtVarB.u(-632543479);
            z(kiuVar, cmwVar, cbtVarB, i2 & 126);
            cbtVarB.W(false);
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(kiuVar, cmwVar, i, 17, null);
        }
    }

    public static void D(java.util.List list, aonj aonjVar, cmw cmwVar, ayy ayyVar, cav cavVar, int i) {
        int i2;
        java.util.List list2;
        cmw cmwVar2;
        cdk cdkVarI;
        defpackage.biu biuVar;
        aooh.f(list, "chips");
        aooh.f(aonjVar, "onChipClicked");
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-960388303);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cbtVarB.B(list) : cbtVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonjVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != cbtVarB.B(ayyVar) ? 1024 : 2048;
        }
        if (cbtVarB.H((i4 & 1171) != 1170, i4 & 1)) {
            cmw cmwVar3 = cmw.c;
            if (list.isEmpty()) {
                cdkVarI = cbtVarB.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    biuVar = new defpackage.biu(list, aonjVar, cmwVar3, ayyVar, i, 9);
                }
            } else {
                list2 = list;
                cmw cmwVarX = den.x(cmwVar3, "call_log_chip_container");
                int i5 = i4 & 14;
                awb awbVarF = awi.f(8.0f);
                boolean z = i5 == 4 || ((i4 & 8) != 0 && cbtVarB.D(list2));
                boolean z2 = (i4 & 112) == 32;
                cbt cbtVar = cbtVarB;
                java.lang.Object objR = cbtVar.R();
                if ((z | z2) || objR == cau.a) {
                    objR = new defpackage.gwo(list2, aonjVar, 19, null);
                    cbtVar.ab(objR);
                }
                den.aN(cmwVarX, (bbh) null, ayyVar, awbVarF, (cmn) null, (ars) null, false, (amn) null, (bdn) null, (aonj) objR, cbtVarB, ((i4 >> 3) & 896) | 24576, 0, 1002);
                cmwVar2 = cmwVar3;
            }
            cdkVarI.c = biuVar;
        }
        list2 = list;
        cbtVarB.s();
        cmwVar2 = cmwVar;
        cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            biuVar = new defpackage.biu(list2, aonjVar, cmwVar2, ayyVar, i, 10);
            cdkVarI.c = biuVar;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static void E(defpackage.jyh jyhVar, aomy aomyVar, cmw cmwVar, cav cavVar, int i) throws aois {
        int i2;
        cmw cmwVar2;
        java.lang.String strF;
        long j;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1419980346);
        if (i3 == 0) {
            i2 = i | (true != cbtVarB.B(jyhVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aomyVar) ? 16 : 32;
        }
        int i5 = i2 | 384;
        if (cbtVarB.H((i5 & 147) != 146, i5 & 1)) {
            cmw cmwVar3 = cmw.c;
            defpackage.jyd jydVar = jyhVar.a;
            defpackage.jlr jlrVar = jydVar.f;
            int iZ = anty.Z(jlrVar);
            if (iZ == 0) {
                cbtVarB.u(1198494962);
                strF = dfa.f(((defpackage.jyk) jlrVar).a, cbtVarB);
                cbtVarB.W(false);
            } else {
                if (iZ != 1) {
                    cbtVarB.u(1198493019);
                    cbtVarB.W(false);
                    throw new aois();
                }
                cbtVarB.u(1198498128);
                cbtVarB.W(false);
                strF = ((defpackage.jyj) jlrVar).a.toString();
            }
            java.lang.String str = strF;
            if (jydVar.e == 2) {
                cbtVarB.u(-1501173329);
                j = den.ak(cbtVarB).w;
                cbtVarB.W(false);
            } else {
                cbtVarB.u(-1501122613);
                j = den.ak(cbtVarB).q;
                cbtVarB.W(false);
            }
            long j2 = j;
            ayy ayyVar = defpackage.acph.a;
            abrz.w(aomyVar, cfo.j(-1947254717, new defpackage.izk(str, 15), cbtVarB), cmwVar3, false, cfo.j(1430808992, new defpackage.izk(jydVar, i4), cbtVarB), bge.a, defpackage.acph.a(den.ak(cbtVarB).F, den.ak(cbtVarB).q, j2, cbtVarB, 248), (defpackage.bof) null, (amu) null, (awa) null, new azc(12.0f, 6.0f, 4.0f, 6.0f), cbtVarB, ((i5 >> 3) & 14) | 805330992 | (i5 & 896), 0);
            cmwVar2 = cmwVar3;
        } else {
            cbtVarB.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aoz(jyhVar, aomyVar, cmwVar2, i, 16, (short[]) null);
        }
    }

    public static /* synthetic */ defpackage.ni F(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ni(akzxVar);
    }

    private static boolean G(defpackage.kbx kbxVar) {
        return kbxVar.q == 2;
    }

    public static void a(afqz afqzVar, defpackage.jlm jlmVar) {
        ahvr.d(afqzVar, defpackage.jma.class, new defpackage.hwo(jlmVar, 16));
    }

    public static void b(defpackage.al alVar, defpackage.jly jlyVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.hwo(jlyVar, 17));
        ahvr.d(alVar, ahtf.class, new defpackage.hwo(jlyVar, 18));
    }

    public static void c(ajwr ajwrVar, defpackage.jlm jlmVar) {
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131428709), new defpackage.jln(jlmVar, 0));
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131428576), new defpackage.jln(jlmVar, 2));
    }

    public static void d(java.util.List list, cmw cmwVar, cav cavVar, int i) {
        int i2;
        cdk cdkVarI;
        defpackage.kcv kcvVar;
        bgc bgcVarC;
        aooh.f(list, "actions");
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(1767381772);
        int i4 = 2;
        int i5 = 1;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cbtVarB.B(list) : cbtVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 16 : 32;
        }
        int i6 = 0;
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            if (list.isEmpty()) {
                cbtVarB.u(66417322);
                awo.c(den.x(azm.o(azm.d(cmwVar, 1.0f), (cmn) null, 3), "dropdown_actions"), cbtVarB, 0);
                cbtVarB.W(false);
                cdkVarI = cbtVarB.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    kcvVar = new defpackage.kcv(list, cmwVar, i, i5);
                }
            } else {
                cbtVarB.u(66521110);
                cbt cbtVar = cbtVarB;
                cbtVar.W(false);
                cmw cmwVarBa = den.ba(den.x(azm.o(azm.d(cmwVar, 1.0f), (cmn) null, 3), "dropdown_actions"), 16.0f, 0.0f, 16.0f, 18.0f);
                cye cyeVarA = aww.a(awi.f(2.0f), cmh.j, cbtVarB, 0);
                int iM = anty.M(cbtVar.x);
                cje cjeVarAi = cbtVar.ai();
                cmw cmwVarM = cfo.m(cbtVarB, cmwVarBa);
                aomy aomyVar = dam.a;
                cbtVarB.v();
                if (cbtVar.w) {
                    cbtVarB.j(aomyVar);
                } else {
                    cbtVarB.x();
                }
                cev.c(cbtVarB, cyeVarA, dam.e);
                cev.c(cbtVarB, cjeVarAi, dam.d);
                cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
                cev.b(cbtVarB, dam.g);
                cev.c(cbtVarB, cmwVarM, dam.c);
                cbtVarB.u(-240034082);
                java.util.Iterator it = list.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    int i8 = i7 + 1;
                    defpackage.mao maoVar = (defpackage.mao) it.next();
                    if (list.size() == 1) {
                        bgcVarC = bge.b(16.0f);
                    } else if (i7 == 0) {
                        bgcVarC = bge.c(16.0f, 16.0f, 4.0f, 4.0f);
                    } else {
                        bgcVarC = i7 == list.size() + (-1) ? bge.c(4.0f, 4.0f, 16.0f, 16.0f) : bge.b(4.0f);
                    }
                    j$.util.Optional optional = maoVar.f;
                    aooh.e(optional, "growthKitTag(...)");
                    java.lang.String str = (java.lang.String) aooh.q(optional);
                    if (str != null) {
                        cbtVarB.u(1149818623);
                        aaoo.az(str, (cmw) null, false, cfo.j(-519510916, new defpackage.kcv(maoVar, bgcVarC, i7, i6), cbtVarB), cbtVarB, 3072, 6);
                        cbtVar.W(false);
                    } else {
                        cbtVarB.u(1149962835);
                        f(maoVar, bgcVarC, i7, null, cbtVarB, 0);
                        cbtVar.W(false);
                    }
                    i7 = i8;
                }
                cbtVar.W(false);
                cbtVar.W(true);
            }
            cdkVarI.c = kcvVar;
        }
        cbtVarB.s();
        cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            kcvVar = new defpackage.kcv(list, cmwVar, i, i4);
            cdkVarI.c = kcvVar;
        }
    }

    public static long e(long j, boolean z) {
        return !z ? cqg.h(j, 0.2f) : j;
    }

    public static void f(defpackage.mao maoVar, crd crdVar, int i, cmw cmwVar, cav cavVar, int i2) {
        int i3;
        cbt cbtVar;
        cmw cmwVar2;
        cmw cmwVarB;
        cmw cmwVarA;
        defpackage.mao maoVar2 = maoVar;
        int i4 = i2 & 6;
        cbt cbtVarB = cavVar.b(756702549);
        if (i4 == 0) {
            i3 = (true != cbtVarB.D(maoVar2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cbtVarB.B(crdVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cbtVarB.z(i) ? 128 : 256;
        }
        int i5 = i3 | 3072;
        if (cbtVarB.H((i5 & 1171) != 1170, i5 & 1)) {
            cmw cmwVar3 = cmw.c;
            android.content.Context context = (android.content.Context) cbtVarB.e(dep.b);
            j$.util.Optional optional = maoVar2.g;
            aooh.e(optional, "actionPopulatedGrowthKitEvent(...)");
            rmu rmuVar = (rmu) aooh.q(optional);
            if (rmuVar != null) {
                cbtVarB.u(-1357362938);
                boolean zD = cbtVarB.D(context) | cbtVarB.z(rmuVar.W);
                cbt cbtVar2 = cbtVarB;
                java.lang.Object objR = cbtVar2.R();
                if (zD || objR == cau.a) {
                    objR = new defpackage.kdr(context, rmuVar, (aoln) null, 1);
                    cbtVar2.ab(objR);
                }
                cbp.g(maoVar2, (aonn) objR, cbtVarB);
                cbtVar2.W(false);
            } else {
                cbtVarB.u(-1357140947);
                cbtVarB.W(false);
            }
            j$.util.Optional optional2 = maoVar2.b;
            aooh.e(optional2, "contentDescription(...)");
            java.lang.String str = (java.lang.String) aooh.q(optional2);
            if (str != null) {
                cbtVarB.u(-1357008484);
                boolean zB = cbtVarB.B(str);
                cbt cbtVar3 = cbtVarB;
                java.lang.Object objR2 = cbtVar3.R();
                if (zB || objR2 == cau.a) {
                    objR2 = new defpackage.jpi(str, 10);
                    cbtVar3.ab(objR2);
                }
                cmwVarB = dig.b(cmwVar3, false, (aonj) objR2);
                cbtVar3.W(false);
            } else {
                cbtVarB.u(-1356924009);
                cbtVarB.W(false);
                cmwVarB = cmwVar3;
            }
            boolean z = maoVar2.d;
            if (z) {
                cbtVarB.u(-1356447849);
                cbtVarB.W(false);
                cmwVarA = cmwVar3;
            } else {
                cbtVarB.u(-1356564037);
                aojh aojhVar = aojh.a;
                cbt cbtVar4 = cbtVarB;
                java.lang.Object objR3 = cbtVar4.R();
                if (objR3 == cau.a) {
                    objR3 = defpackage.bmy.d;
                    cbtVar4.ab(objR3);
                }
                cmwVarA = cvy.a(cmwVar3, aojhVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR3);
                cbtVar4.W(false);
            }
            android.view.View view = (android.view.View) cbtVarB.e(dep.f);
            j$.util.Optional optional3 = maoVar2.h;
            aooh.e(optional3, "onClickEvent(...)");
            ahth ahthVar = (ahth) aooh.q(optional3);
            long j = den.ak(cbtVarB).F;
            long jE = e(den.ak(cbtVarB).q, z);
            cmw cmwVarA2 = den.x(azm.f(azm.d(cmwVar3, 1.0f), 50.0f, Float.NaN), a.bj(i, "dropdown_action_item_")).a(cmwVarA).a(cmwVarB);
            boolean zD2 = cbtVarB.D(ahthVar) | cbtVarB.D(view) | cbtVarB.D(maoVar2);
            cbt cbtVar5 = cbtVarB;
            java.lang.Object objR4 = cbtVar5.R();
            if (zD2 || objR4 == cau.a) {
                defpackage.af afVar = new defpackage.af(ahthVar, view, maoVar, 18, (short[]) null);
                maoVar2 = maoVar;
                cbtVar5.ab(afVar);
                objR4 = afVar;
            }
            cbtVar = cbtVarB;
            bvo.d((aomy) objR4, cmwVarA2, z, crdVar, j, jE, 0.0f, 0.0f, (amu) null, (kaw) null, cfo.j(-8272342, new defpackage.lpn(maoVar2, z, 1), cbtVarB), cbtVar, 960);
            cmwVar2 = cmwVar3;
        } else {
            cbtVar = cbtVarB;
            cbtVar.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cbtVar.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqg(maoVar2, crdVar, i, cmwVar2, i2, 3);
        }
    }

    public static void g(defpackage.klb klbVar, kcw kcwVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(304950472);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(klbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cbtVarB.B(kcwVar) : cbtVarB.D(kcwVar)) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if (cbtVarB.H((i4 & 147) != 146, i4 & 1)) {
            cmwVar = cmw.c;
            az azVarK = k((android.content.Context) cbtVarB.e(dep.b));
            kiu kiuVar = klbVar.a;
            boolean zB = cbtVarB.B(azVarK) | cbtVarB.B(kiuVar);
            if ((i4 & 112) != 32 && ((i4 & 64) == 0 || !cbtVarB.B(kcwVar))) {
                z = false;
            }
            boolean z2 = zB | z;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (z2 || objR == cau.a) {
                objR = azVarK != null ? defpackage.kno.a(azVarK, kiuVar, kcwVar.b, kcwVar.a) : aokc.a;
                cbtVar.ab(objR);
            }
            java.util.List list = (java.util.List) objR;
            aooh.c(list);
            d(list, cmwVar, cbtVarB, (i4 >> 3) & 112);
        } else {
            cbtVarB.s();
        }
        cmw cmwVar2 = cmwVar;
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kko((java.lang.Object) klbVar, (java.lang.Object) kcwVar, cmwVar2, i, 1);
        }
    }

    public static /* synthetic */ int h(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof defpackage.kcs) {
            return 0;
        }
        return obj instanceof kcr ? 1 : -2;
    }

    public static void i(final kby kbyVar, final aonj aonjVar, final float f, final float f2, cav cavVar, final int i) {
        int i2;
        aooh.f(aonjVar, "eventListener");
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1407498626);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cbtVarB.B(kbyVar) : cbtVarB.D(kbyVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.y(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.y(f2) ? 1024 : 2048;
        }
        if (cbtVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            android.view.View view = (android.view.View) cbtVarB.e(dep.f);
            android.content.Context context = (android.content.Context) cbtVarB.e(dep.b);
            int i4 = i2 & 112;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (i4 == 32 || objR == cau.a) {
                objR = new defpackage.jaj(aonjVar, 6);
                cbtVar.ab(objR);
            }
            ttj.O((aomy) objR, cbtVarB, 0);
            cmw cmwVarBa = den.ba(cmw.c, f, f2, 0.0f, 0.0f);
            cye cyeVarB = awo.b(cmh.a, false);
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarBa);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarB, dam.e);
            cev.c(cbtVarB, cjeVarAi, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM, dam.c);
            java.lang.Object objR2 = cbtVar.R();
            if (i4 == 32 || objR2 == cau.a) {
                objR2 = new defpackage.jaj(aonjVar, 7);
                cbtVar.ab(objR2);
            }
            boolean z = true;
            defpackage.dra.d(null, (aomy) objR2, new defpackage.drs(z, z, 1002, 1536), cfo.j(-1615201125, new defpackage.bit(context, kbyVar, view, aonjVar, 8), cbtVarB), cbtVarB, 27648);
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: kbw
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar2 = (cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    int i5 = i | 1;
                    int i6 = 306783378 & i5;
                    int i7 = 613566756 & i5;
                    defpackage.jlr.i(kbyVar, aonjVar, f, f2, cavVar2, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 << 1) & i7));
                    return aojh.a;
                }
            };
        }
    }

    public static long j(ccp ccpVar) {
        return ((dpp) ccpVar.a()).a;
    }

    public static az k(android.content.Context context) {
        aooh.f(context, "<this>");
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof az) {
                return (az) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
            aooh.e(context, "getBaseContext(...)");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x018b  */
    public static void l(defpackage.kbx kbxVar, aonj aonjVar, cav cavVar, int i) {
        int i2;
        java.lang.String str;
        dib dibVar;
        defpackage.kbh kbhVar;
        abko abkpVar;
        aonj aonjVar2 = aonjVar;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1609724752);
        if (i3 == 0) {
            i2 = i | (true != cbtVarB.B(kbxVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonjVar2) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            lpv lpvVar = (lpv) cbtVarB.e(lpx.a);
            cmt cmtVar = cmw.c;
            cmw cmwVarX = den.x(cmtVar, "call_log_avatar");
            aooh.f(lpvVar, "<this>");
            lpv lpvVar2 = lpv.a;
            cmw cmwVarG = azm.g(cmwVarX, lpvVar == lpvVar2 ? 36.0f : 40.0f);
            defpackage.kbh kbhVar2 = kbxVar.m;
            java.lang.String str2 = kbhVar2.b;
            if (str2 == null) {
                cbtVarB.u(-1999976449);
                cbtVarB.W(false);
                kbhVar = kbhVar2;
            } else {
                cbtVarB.u(-1999976448);
                android.content.Context context = (android.content.Context) cbtVarB.e(dep.b);
                abko abkoVar = kbhVar2.a;
                defpackage.abkp abkpVar2 = abkoVar instanceof defpackage.abkp ? (defpackage.abkp) abkoVar : null;
                if (abkpVar2 == null || (str = abkpVar2.b) == null) {
                    str = kbxVar.b.c;
                }
                java.lang.String str3 = str;
                dib dibVar2 = new dib(0);
                boolean zD = ((i2 & 112) == 32) | cbtVarB.D(context) | cbtVarB.B(str2);
                cbt cbtVar = cbtVarB;
                java.lang.Object objR = cbtVar.R();
                if (zD || objR == cau.a) {
                    dibVar = dibVar2;
                    kbhVar = kbhVar2;
                    aonjVar2 = aonjVar;
                    objR = new defpackage.af(aonjVar2, context, str2, 16, (short[]) null);
                    cbtVar.ab(objR);
                } else {
                    aonjVar2 = aonjVar;
                    kbhVar = kbhVar2;
                    dibVar = dibVar2;
                }
                cmw cmwVarBj = den.bj(cmwVarG, true, (java.lang.String) null, dibVar, (aomy) objR);
                boolean zB = cbtVarB.B(str3);
                java.lang.Object objR2 = cbtVar.R();
                if (zB || objR2 == cau.a) {
                    objR2 = new defpackage.jpi(str3, 7);
                    cbtVar.ab(objR2);
                }
                cmwVarG = dig.a(cmwVarBj, (aonj) objR2);
                cbtVar.W(false);
            }
            aooh.f(lpvVar, "<this>");
            cmw cmwVarAX = den.aX(cmtVar, lpvVar == lpvVar2 ? new azc(0.0f, 6.0f, 0.0f, 0.0f) : new azc(4.0f, 4.0f, 4.0f, 4.0f));
            cye cyeVarB = awo.b(cmh.a, false);
            cbt cbtVar2 = cbtVarB;
            int iM = anty.M(cbtVar2.x);
            cje cjeVarAi = cbtVar2.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarAX);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar2.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarB, dam.e);
            cev.c(cbtVarB, cjeVarAi, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM, dam.c);
            abko abkoVar2 = kbhVar.a;
            if (den.bg(cbtVarB) && (abkoVar2 instanceof defpackage.abkp)) {
                defpackage.abkp abkpVar3 = (defpackage.abkp) abkoVar2;
                if (abkpVar3.a instanceof defpackage.abkg) {
                    abkpVar = new defpackage.abkp(new defpackage.abkg(defpackage.abke.a), abkpVar3.b);
                } else {
                    abkpVar = abkoVar2;
                }
            } else {
                abkpVar = abkoVar2;
            }
            aehj.ao(abkpVar, cmwVarG, (crd) null, cbtVarB, 0, 4);
            cbtVar2.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(kbxVar, aonjVar2, i, 20);
        }
    }

    public static void m(azj azjVar, defpackage.kbx kbxVar, aonj aonjVar, cav cavVar, int i) {
        int i2;
        cdk cdkVarI;
        defpackage.aoz aozVar;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(681086207);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(azjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(kbxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aonjVar) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            lpv lpvVar = (lpv) cbtVarB.e(lpx.a);
            if (kbxVar.n == null) {
                cdkVarI = cbtVarB.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    aozVar = new defpackage.aoz(azjVar, kbxVar, aonjVar, i, 19);
                }
            } else {
                cmw cmwVarB = cmw.c;
                cmw cmwVarX = den.x(azm.g(cmwVarB, 48.0f), "call_button");
                if (lpvVar == lpv.a) {
                    cmwVarB = azjVar.b(cmwVarB, cmh.m);
                }
                cmw cmwVarA = cmwVarX.a(cmwVarB);
                boolean z = (i2 & 896) == 256;
                boolean z2 = (i2 & 112) == 32;
                cbt cbtVar = cbtVarB;
                java.lang.Object objR = cbtVar.R();
                if ((z | z2) || objR == cau.a) {
                    objR = new defpackage.hpc(aonjVar, kbxVar, 18, null);
                    cbtVar.ab(objR);
                }
                aaoo.aC((aomy) objR, cmwVarA, false, (defpackage.bpw) null, (kaw) null, (crd) null, cfo.j(-1259194723, new defpackage.izk(kbxVar, 17), cbtVarB), cbtVarB, 1572864, 60);
            }
            cdkVarI.c = aozVar;
        }
        cbtVarB.s();
        cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            aozVar = new defpackage.aoz(azjVar, kbxVar, aonjVar, i, 20);
            cdkVarI.c = aozVar;
        }
    }

    public static void n(final defpackage.kbg kbgVar, long j, cav cavVar, final int i) {
        int i2;
        final long j2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-1272459968);
        if (i3 == 0) {
            i2 = (true != cavVarB.z(kbgVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.A(j) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            lpv lpvVar = (lpv) cavVarB.e(lpx.a);
            int i4 = kbgVar.e;
            css cssVarK = wv.k(i4, cavVarB, 0);
            cmt cmtVar = cmw.c;
            aooh.f(lpvVar, "<this>");
            aaoo.V(cssVarK, (java.lang.String) null, den.x(azm.g(cmtVar, lpvVar == lpv.a ? 12.0f : 16.0f), a.bj(i4, "call_direction_icon_")), j, cavVarB, ((i2 << 6) & 7168) | 56, 0);
            j2 = j;
        } else {
            j2 = j;
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            final int i5 = 2;
            cdkVarI.c = new aonn() { // from class: bpe
                /* JADX WARN: Type inference failed for: r7v1, types: [cmw, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v14, types: [cmw, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v16, types: [cmw, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v3, types: [cmw, java.lang.Object] */
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    int i6 = i5;
                    if (i6 == 0) {
                        ((java.lang.Integer) obj2).intValue();
                        int i7 = i;
                        long j3 = j2;
                        int i8 = i7 | 1;
                        int i9 = 306783378 & i8;
                        int i10 = 613566756 & i8;
                        rd.l((cmw) kbgVar, j3, (cav) obj, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 << 1) & i10));
                        return aojh.a;
                    }
                    if (i6 == 1) {
                        ((java.lang.Integer) obj2).intValue();
                        int i11 = i;
                        long j4 = j2;
                        int i12 = i11 | 1;
                        int i13 = 306783378 & i12;
                        int i14 = 613566756 & i12;
                        rd.m((cmw) kbgVar, j4, (cav) obj, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 << 1) & i14));
                        return aojh.a;
                    }
                    if (i6 == 2) {
                        ((java.lang.Integer) obj2).intValue();
                        int i15 = i;
                        int i16 = i15 | 1;
                        int i17 = 306783378 & i16;
                        int i18 = 613566756 & i16;
                        defpackage.kbg kbgVar2 = (defpackage.kbg) kbgVar;
                        defpackage.jlr.n(kbgVar2, j2, (cav) obj, (i16 & (-920350135)) | i17 | (i18 >> 1) | ((i17 << 1) & i18));
                        return aojh.a;
                    }
                    if (i6 == 3) {
                        ((java.lang.Integer) obj2).intValue();
                        int i19 = i;
                        int i20 = i19 | 1;
                        int i21 = 306783378 & i20;
                        int i22 = 613566756 & i20;
                        abhw abhwVar = (abhw) kbgVar;
                        aehj.bJ(abhwVar, j2, (cav) obj, (i20 & (-920350135)) | i21 | (i22 >> 1) | ((i21 << 1) & i22));
                        return aojh.a;
                    }
                    if (i6 == 4) {
                        ((java.lang.Integer) obj2).intValue();
                        int i23 = i;
                        int i24 = i23 | 1;
                        int i25 = 306783378 & i24;
                        int i26 = 613566756 & i24;
                        defpackage.abis abisVar = (defpackage.abis) kbgVar;
                        aehj.be(abisVar, j2, (cav) obj, (i24 & (-920350135)) | i25 | (i26 >> 1) | ((i25 << 1) & i26));
                        return aojh.a;
                    }
                    if (i6 != 5) {
                        ((java.lang.Integer) obj2).intValue();
                        int i27 = i;
                        long j5 = j2;
                        int i28 = i27 | 1;
                        int i29 = 306783378 & i28;
                        int i30 = 613566756 & i28;
                        aaoo.af((cmw) kbgVar, j5, (cav) obj, (i28 & (-920350135)) | i29 | (i30 >> 1) | ((i29 << 1) & i30));
                        return aojh.a;
                    }
                    ((java.lang.Integer) obj2).intValue();
                    int i31 = i;
                    long j6 = j2;
                    int i32 = i31 | 1;
                    int i33 = 306783378 & i32;
                    int i34 = 613566756 & i32;
                    aaoo.ag((cmw) kbgVar, j6, (cav) obj, (i32 & (-920350135)) | i33 | (i34 >> 1) | ((i33 << 1) & i34));
                    return aojh.a;
                }
            };
        }
    }

    public static void o(aify aifyVar, boolean z, cav cavVar, int i) {
        int i2;
        aify<defpackage.kie> aifyVarBU;
        java.lang.String strF;
        long jS;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-175441108);
        int i4 = 2;
        int i5 = 1;
        int i6 = i3 == 0 ? (true != cbtVarB.B(aifyVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i6 |= true != cbtVarB.C(z) ? 16 : 32;
        }
        if (cbtVarB.H((i6 & 19) != 18, i6 & 1)) {
            int i7 = 3;
            if (aifyVar.isEmpty()) {
                cdk cdkVarI = cbtVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.oa(aifyVar, z, i, i7);
                    return;
                }
                return;
            }
            int integer = ((android.content.res.Resources) cbtVarB.e(dep.c)).getInteger(2131493002);
            if (aifyVar.size() > integer) {
                aify aifyVarB = aifyVar.b(0, integer - 1);
                aooh.e(aifyVarB, "subList(...)");
                defpackage.jhw jhwVarF = defpackage.hgt.F(defpackage.kie.a.m());
                jhwVarF.u(2131231740);
                jhwVarF.v(2);
                aifyVarBU = ajsz.bU(aifyVarB, jhwVarF.s());
            } else {
                aifyVarBU = aifyVar;
            }
            awb awbVarF = awi.f(4.0f);
            cmn cmnVar = cmh.n;
            cmw cmwVar = cmw.c;
            cye cyeVarA = azh.a(awbVarF, cmnVar, cbtVarB, 54);
            cbt cbtVar = cbtVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVar);
            i2 = 4;
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarA, dam.e);
            cev.c(cbtVarB, cjeVarAi, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM, dam.c);
            cbtVarB.u(-1636899645);
            for (defpackage.kie kieVar : aifyVarBU) {
                css cssVarK = wv.k(kieVar.c, cbtVarB, 0);
                if ((kieVar.b & 4) != 0) {
                    cbtVarB.u(795891756);
                    strF = dfa.f(kieVar.e, cbtVarB);
                    cbtVar.W(false);
                } else {
                    cbtVarB.u(795973596);
                    cbtVar.W(false);
                    strF = null;
                }
                aooh.c(kieVar);
                cbtVarB.u(-2086466627);
                android.content.Context context = (android.content.Context) cbtVarB.e(dep.b);
                if ((kieVar.b & i4) != 0) {
                    int iAN = a.aN(kieVar.d);
                    if (iAN == 0) {
                        iAN = i5;
                    }
                    int i8 = iAN - 1;
                    if (i8 == i5) {
                        jS = z ? cfd.M(urg.c(context, 2130968936)) : cfd.M(urg.c(context, 2130968935));
                    } else if (i8 != i4) {
                        jS = i8 != 3 ? cfd.S() : cfd.M(urg.c(context, 2130969072));
                    } else {
                        jS = cfd.M(urg.c(context, 2130968958));
                    }
                } else {
                    jS = cfd.S();
                }
                cbtVar.W(false);
                aaoo.V(cssVarK, strF, den.x(azm.g(cmwVar, 16.0f), "feature_icon_" + kieVar.c), jS, cbtVarB, 8, 0);
                cbtVar = cbtVar;
                cmwVar = cmwVar;
                i4 = 2;
                i5 = 1;
            }
            cbt cbtVar2 = cbtVar;
            cbtVar2.W(false);
            cbtVar2.W(true);
        } else {
            i2 = 4;
            cbtVarB.s();
        }
        cdk cdkVarI2 = cbtVarB.I();
        if (cdkVarI2 != null) {
            cdkVarI2.c = new defpackage.oa(aifyVar, z, i, i2);
        }
    }

    public static void p(defpackage.kcu kcuVar, aonj aonjVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(673190681);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(kcuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonjVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            android.content.Context context = (android.content.Context) cbtVarB.e(dep.b);
            aify aifyVar = kcuVar.a;
            boolean zD = cbtVarB.D(context) | ((i2 & 112) == 32);
            boolean z = (i2 & 14) == 4;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if ((zD | z) || objR == cau.a) {
                objR = new afx(context, aonjVar, kcuVar, 20, (int[]) null);
                cbtVar.ab(objR);
            }
            D(aifyVar, (aonj) objR, null, den.bc(72.0f, 0.0f, 16.0f, 0.0f, 10), cbtVarB, 0);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(kcuVar, aonjVar, i, 19);
        }
    }

    public static void q(defpackage.klb klbVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(809478821);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(klbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i5 = 19;
        if (cbtVarB.H((i2 & 3) != 2, i2 & 1)) {
            cmw cmwVarX = den.x(den.ba(azm.o(azm.d(cmw.c, 1.0f), (cmn) null, 3), 0.0f, 16.0f, 0.0f, 0.0f), "dropdown_menu");
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = new defpackage.jak(17);
                cbtVar.ab(objR);
            }
            aonj aonjVar = (aonj) objR;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new defpackage.jak(i5);
                cbtVar.ab(objR2);
            }
            aonj aonjVar2 = (aonj) objR2;
            java.lang.Object objR3 = cbtVar.R();
            if (objR3 == obj) {
                objR3 = new defpackage.kbz(i4);
                cbtVar.ab(objR3);
            }
            int i6 = i2 & 14;
            aonj aonjVar3 = (aonj) objR3;
            java.lang.Object objR4 = cbtVar.R();
            if (i6 == 4 || objR4 == obj) {
                objR4 = new defpackage.jpi(klbVar, 8);
                cbtVar.ab(objR4);
            }
            defpackage.dqi.b(aonjVar, cmwVarX, aonjVar2, aonjVar3, (aonj) objR4, cbtVarB, 3462, 0);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ajs(klbVar, i, i5);
        }
    }

    public static void r(defpackage.kbx kbxVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        boolean z;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(922515595);
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(kbxVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            lpv lpvVar = (lpv) cavVarB.e(lpx.a);
            cmt cmtVar = cmw.c;
            cmw cmwVarD = azm.d(cmtVar, 1.0f);
            cye cyeVarA = azh.a(awi.f(6.0f), cmh.n, cavVarB, 54);
            cbt cbtVar = (cbt) cavVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarD);
            aomy aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA, dam.e);
            cev.c(cavVarB, cjeVarAi, dam.d);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVarB, dam.g);
            cev.c(cavVarB, cmwVarM, dam.c);
            azk azkVar = azk.a;
            long j = den.ak(cavVarB).q;
            boolean zG = G(kbxVar);
            aooh.f(lpvVar, "<this>");
            dkz dkzVar = den.an(cavVarB).h;
            dkz dkzVarZ = den.an(cavVarB).j;
            if (zG) {
                dkzVarZ = dkz.z(dkzVar, 0L, 0L, dnd.g, (dmw) null, (dmq) null, (java.lang.String) null, 0L, 0L, (dou) null, 0, 0L, (dki) null, (dos) null, 0, 0, 16777211);
            }
            dkz dkzVarZ2 = dkzVarZ;
            if (lpvVar == lpv.a) {
                dkzVarZ2 = dkz.z(dkzVarZ2, 0L, dpy.g(14), (dnd) null, (dmw) null, (dmq) null, (java.lang.String) null, 0L, 0L, (dou) null, 0, 0L, (dki) null, (dos) null, 0, 0, 16777213);
            }
            dkz dkzVar2 = dkzVarZ2;
            abrz.l(kbxVar.b, den.x(azkVar.a(cmtVar, 1.0f, false), "call_log_primary_text"), j, 0L, 0L, (dot) null, 0L, 2, false, 1, 0, (java.util.Map) null, (aonj) null, dkzVar2, cavVarB, 0, 24960, 241656);
            o(kbxVar.c, G(kbxVar), cavVarB, 0);
            java.lang.Integer num = kbxVar.d;
            if (num == null) {
                cavVarB.u(-1374941590);
                cbtVar.W(false);
                cavVar2 = cavVarB;
                z = true;
            } else {
                cavVarB.u(-1374941589);
                java.lang.String str = java.lang.String.format(java.util.Locale.getDefault(), "(%d)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(num.intValue())}, 1));
                aooh.e(str, "format(...)");
                z = true;
                abrz.k(str, den.x(cmtVar, "call_log_call_count"), j, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, dkzVar2, cavVarB, 48, 0, 131064);
                cavVar2 = cavVarB;
                cbtVar.W(false);
            }
            cbtVar.W(z);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ajs(kbxVar, i, 18);
        }
    }

    public static void s(defpackage.kbx kbxVar, aonj aonjVar, aonj aonjVar2, aonn aonnVar, cav cavVar, int i) {
        int i2;
        java.lang.String strF;
        java.lang.String strF2;
        java.lang.String strF3;
        cmw cmwVarF;
        float f;
        cbt cbtVar;
        defpackage.kbx kbxVar2 = kbxVar;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-647912058);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(kbxVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aonjVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 1024 : 2048;
        }
        int i4 = i2;
        if (cbtVarB.H((i4 & 1171) != 1170, i4 & 1)) {
            lpv lpvVar = (lpv) cbtVarB.e(lpx.a);
            if (lpvVar.ordinal() != 2) {
                cbtVarB.u(2089005048);
                strF = dfa.f(2132017164, cbtVarB);
                cbtVarB.W(false);
            } else {
                cbtVarB.u(2089002968);
                strF = dfa.f(2132017165, cbtVarB);
                cbtVarB.W(false);
            }
            if (lpvVar.ordinal() != 2) {
                cbtVarB.u(1944063285);
                strF2 = dfa.f(2132017190, cbtVarB);
                cbtVarB.W(false);
            } else {
                cbtVarB.u(1944061393);
                strF2 = dfa.f(2132017235, cbtVarB);
                cbtVarB.W(false);
            }
            if (lpvVar.ordinal() != 2) {
                cbtVarB.u(-1237786986);
                strF3 = dfa.f(2132017189, cbtVarB);
                cbtVarB.W(false);
            } else {
                cbtVarB.u(283290747);
                cbtVarB.W(false);
                strF3 = null;
            }
            java.lang.String strF4 = dfa.f(2132017191, cbtVarB);
            aooh.f(lpvVar, "<this>");
            lpv lpvVar2 = lpv.a;
            dpi dpiVar = lpvVar == lpvVar2 ? new dpi(58.0f) : null;
            if (dpiVar != null) {
                cmwVarF = azm.f(cmw.c, dpiVar.a, Float.NaN);
            } else {
                cmwVarF = cmw.c;
            }
            cmt cmtVar = cmw.c;
            cmw cmwVarA = azm.d(cmtVar, 1.0f).a(cmwVarF);
            aooh.f(lpvVar, "<this>");
            cmw cmwVarX = den.x(den.aX(cmwVarA, lpvVar == lpvVar2 ? new azc(12.0f, 6.0f, 6.0f, 4.0f) : new azc(12.0f, 12.0f, 12.0f, 0.0f)), "call_log_header");
            int i5 = i4 & 896;
            cbt cbtVar2 = cbtVarB;
            java.lang.Object objR = cbtVar2.R();
            if (i5 == 256 || objR == cau.a) {
                objR = new defpackage.jpi(aonjVar2, 5);
                cbtVar2.ab(objR);
            }
            cmw cmwVarE = vn.e(cmwVarX, (aonj) objR);
            int i6 = i4 & 7168;
            aojh aojhVar = aojh.a;
            java.lang.Object objR2 = cbtVar2.R();
            if (i6 == 2048 || objR2 == cau.a) {
                objR2 = new defpackage.bil(aonnVar, 9);
                cbtVar2.ab(objR2);
            }
            cmw cmwVarA2 = cvy.a(cmwVarE, aojhVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR2);
            int i7 = i4 & 14;
            boolean zB = (i7 == 4) | cbtVarB.B(strF) | cbtVarB.B(strF3) | cbtVarB.B(strF2) | cbtVarB.B(strF4);
            java.lang.Object objR3 = cbtVar2.R();
            if (zB || objR3 == cau.a) {
                f = 1.0f;
                cbtVar = cbtVar2;
                kbxVar2 = kbxVar;
                defpackage.dqw dqwVar = new defpackage.dqw(kbxVar2, strF, strF3, strF2, strF4, 7);
                cbtVar.ab(dqwVar);
                objR3 = dqwVar;
            } else {
                kbxVar2 = kbxVar;
                f = 1.0f;
                cbtVar = cbtVar2;
            }
            cmw cmwVarB = dig.b(cmwVarA2, false, (aonj) objR3);
            cye cyeVarA = azh.a(awi.a, cmh.n, cbtVarB, 48);
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarB);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            aonn aonnVar2 = dam.e;
            cev.c(cbtVarB, cyeVarA, aonnVar2);
            aonn aonnVar3 = dam.d;
            cev.c(cbtVarB, cjeVarAi, aonnVar3);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar4 = dam.f;
            cev.c(cbtVarB, numValueOf, aonnVar4);
            aonj aonjVar3 = dam.g;
            cev.b(cbtVarB, aonjVar3);
            aonn aonnVar5 = dam.c;
            cev.c(cbtVarB, cmwVarM, aonnVar5);
            azk azkVar = azk.a;
            l(kbxVar2, aonjVar, cbtVarB, i4 & 126);
            cmw cmwVarA3 = azkVar.a(cmtVar, f, true);
            aooh.f(lpvVar, "<this>");
            float f2 = lpvVar == lpvVar2 ? 8.0f : 12.0f;
            aooh.f(lpvVar, "<this>");
            cmw cmwVarBa = den.ba(cmwVarA3, f2, 0.0f, lpvVar == lpvVar2 ? 0.0f : 8.0f, 0.0f);
            java.lang.Object objR4 = cbtVar.R();
            if (objR4 == cau.a) {
                objR4 = new defpackage.jak(18);
                cbtVar.ab(objR4);
            }
            cmw cmwVarB2 = dig.b(cmwVarBa, false, (aonj) objR4);
            cye cyeVarA2 = aww.a(awi.c, cmh.j, cbtVarB, 0);
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cbtVarB, cmwVarB2);
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarA2, aonnVar2);
            cev.c(cbtVarB, cjeVarAi2, aonnVar3);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM2), aonnVar4);
            cev.b(cbtVarB, aonjVar3);
            cev.c(cbtVarB, cmwVarM2, aonnVar5);
            r(kbxVar2, cbtVarB, i7);
            t(kbxVar2, cbtVarB, i7);
            cbtVar.W(true);
            int i8 = i4 << 3;
            m(azkVar, kbxVar2, aonjVar, cbtVarB, (i8 & 112) | 6 | (i8 & 896));
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.biu(kbxVar2, aonjVar, aonjVar2, aonnVar, i, 13);
        }
    }

    public static void t(defpackage.kbx kbxVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        long j;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-411354813);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(kbxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            lpv lpvVar = (lpv) cavVarB.e(lpx.a);
            cmt cmtVar = cmw.c;
            cmw cmwVarD = azm.d(cmtVar, 1.0f);
            cye cyeVarA = azh.a(awi.f(8.0f), cmh.n, cavVarB, 54);
            cbt cbtVar = (cbt) cavVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarD);
            aomy aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA, dam.e);
            cev.c(cavVarB, cjeVarAi, dam.d);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVarB, dam.g);
            cev.c(cavVarB, cmwVarM, dam.c);
            defpackage.kbg kbgVar = kbxVar.e;
            if (kbgVar.ordinal() != 2) {
                cavVarB.u(-716699185);
                j = den.ak(cavVarB).s;
                cbtVar.W(false);
            } else {
                cavVarB.u(-716700732);
                j = den.ak(cavVarB).w;
                cbtVar.W(false);
            }
            dkz dkzVarI = kcq.i(lpvVar, G(kbxVar), cavVarB);
            n(kbgVar, j, cavVarB, 0);
            cavVar2 = cavVarB;
            abrz.l(kbxVar.f, den.x(cmtVar, "call_log_secondary_text"), j, 0L, 0L, (dot) null, 0L, 2, false, 1, 0, (java.util.Map) null, (aonj) null, dkzVarI, cavVar2, 48, 24960, 241656);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ajs(kbxVar, i, 17);
        }
    }

    public static void u(ahj ahjVar, defpackage.kbx kbxVar, defpackage.afe afeVar, aonj aonjVar, cav cavVar, int i) {
        int i2;
        aonj aonjVar2;
        cav cavVar2;
        cdk cdkVarI;
        defpackage.biu biuVar;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1780474938);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ahjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(kbxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? cavVarB.B(afeVar) : cavVarB.D(afeVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 1024 : 2048;
        }
        int i4 = i2;
        if (cavVarB.H((i4 & 1171) != 1170, i4 & 1)) {
            if (((lpv) cavVarB.e(lpx.a)) == lpv.a) {
                cdkVarI = cavVarB.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    biuVar = new defpackage.biu((java.lang.Object) ahjVar, (java.lang.Object) kbxVar, (java.lang.Object) afeVar, aonjVar, i, 11);
                }
            } else {
                aonjVar2 = aonjVar;
                cmt cmtVar = cmw.c;
                cmw cmwVarD = azm.d(cmtVar, 1.0f);
                cye cyeVarA = aww.a(awi.c, cmh.j, cavVarB, 0);
                cbt cbtVar = (cbt) cavVarB;
                int iM = anty.M(cbtVar.x);
                cje cjeVarAi = cbtVar.ai();
                cmw cmwVarM = cfo.m(cavVarB, cmwVarD);
                aomy aomyVar = dam.a;
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar);
                } else {
                    cavVarB.x();
                }
                cev.c(cavVarB, cyeVarA, dam.e);
                cev.c(cavVarB, cjeVarAi, dam.d);
                cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
                cev.b(cavVarB, dam.g);
                cev.c(cavVarB, cmwVarM, dam.c);
                if (kbxVar.h == null) {
                    cavVarB.u(-918422098);
                    cbtVar.W(false);
                } else {
                    cavVarB.u(-918422097);
                    y(kbxVar, den.ba(cmtVar, 72.0f, 0.0f, 58.0f, 0.0f), cavVarB, (i4 >> 3) & 14);
                    cbtVar.W(false);
                }
                if (kbxVar.i == null) {
                    cavVarB.u(-918184731);
                    cbtVar.W(false);
                    cavVar2 = cavVarB;
                } else {
                    cavVarB.u(-918184730);
                    cavVar2 = cavVarB;
                    x(ahjVar, kbxVar, afeVar, den.ba(cmtVar, 72.0f, 4.0f, 58.0f, 0.0f), cavVar2, i4 & 1022);
                    cbtVar.W(false);
                }
                defpackage.kcu kcuVar = kbxVar.j;
                cavVar2.u(-917856812);
                aify aifyVar = kcuVar.a;
                if (aifyVar.isEmpty()) {
                    cavVar2.u(-1095058379);
                    cbtVar.W(false);
                } else {
                    cavVar2.u(-1095114117);
                    den.aR(azm.e(cmtVar, 8.0f), cavVar2);
                    cbtVar.W(false);
                }
                p(kcuVar, aonjVar2, cavVar2, (i4 >> 6) & 112);
                cbtVar.W(false);
                den.aR(azm.e(cmtVar, (aifyVar == null || aifyVar.isEmpty()) ? 16.0f : 8.0f), cavVar2);
                cbtVar.W(true);
            }
            cdkVarI.c = biuVar;
        }
        aonjVar2 = aonjVar;
        cavVar2 = cavVarB;
        cavVar2.s();
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            biuVar = new defpackage.biu((java.lang.Object) ahjVar, (java.lang.Object) kbxVar, (java.lang.Object) afeVar, aonjVar2, i, 12);
            cdkVarI.c = biuVar;
        }
    }

    public static void v(ahj ahjVar, defpackage.kbx kbxVar, defpackage.afe afeVar, cav cavVar, int i) {
        int i2;
        cdk cdkVarI;
        defpackage.aoz aozVar;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-748905215);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(ahjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(kbxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? cbtVarB.B(afeVar) : cbtVarB.D(afeVar)) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            if (((lpv) cbtVarB.e(lpx.a)) == lpv.a) {
                cdkVarI = cbtVarB.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    aozVar = new defpackage.aoz(ahjVar, kbxVar, afeVar, i, 17, (short[]) null);
                }
            } else {
                cmt cmtVar = cmw.c;
                cye cyeVarA = aww.a(awi.c, cmh.j, cbtVarB, 0);
                cbt cbtVar = cbtVarB;
                int iM = anty.M(cbtVar.x);
                cje cjeVarAi = cbtVar.ai();
                cmw cmwVarM = cfo.m(cbtVarB, cmtVar);
                aomy aomyVar = dam.a;
                cbtVarB.v();
                if (cbtVar.w) {
                    cbtVarB.j(aomyVar);
                } else {
                    cbtVarB.x();
                }
                cev.c(cbtVarB, cyeVarA, dam.e);
                cev.c(cbtVarB, cjeVarAi, dam.d);
                cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
                cev.b(cbtVarB, dam.g);
                cev.c(cbtVarB, cmwVarM, dam.c);
                if (kbxVar.i != null) {
                    cbtVarB.u(664466008);
                    x(ahjVar, kbxVar, afeVar, den.ba(cmtVar, 72.0f, 4.0f, 58.0f, 0.0f), cbtVarB, i2 & 1022);
                    cbtVar.W(false);
                } else {
                    cbtVarB.u(664822539);
                    cbtVar.W(false);
                }
                defpackage.klb klbVar = kbxVar.k;
                q(klbVar, cbtVarB, 0);
                g(klbVar, kbxVar.l, null, cbtVarB, 0);
                cbtVar.W(true);
            }
            cdkVarI.c = aozVar;
        }
        cbtVarB.s();
        cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            aozVar = new defpackage.aoz(ahjVar, kbxVar, afeVar, i, 18, (short[]) null);
            cdkVarI.c = aozVar;
        }
    }

    public static void w(final ahj ahjVar, final defpackage.kbx kbxVar, final kby kbyVar, final aonj aonjVar, cmw cmwVar, crd crdVar, cav cavVar, int i) {
        int i2;
        crd crdVar2;
        cav cavVar2;
        long j;
        aooh.f(ahjVar, "<this>");
        aooh.f(aonjVar, "eventListener");
        int i3 = i & 6;
        cav cavVarB = cavVar.b(880780934);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ahjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(kbxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? cavVarB.B(kbyVar) : cavVarB.D(kbyVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            crdVar2 = crdVar;
            i2 |= true != cavVarB.B(crdVar2) ? 65536 : 131072;
        } else {
            crdVar2 = crdVar;
        }
        if (cavVarB.H((74899 & i2) != 74898, i2 & 1)) {
            cbt cbtVar = (cbt) cavVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            final lpv lpvVar = (lpv) cavVarB.e(lpx.a);
            cavVarB.u(321931420);
            if (kbxVar.g && lpvVar == lpv.c) {
                cavVarB.u(1389994238);
                j = den.ak(cavVarB).h;
                cbtVar.W(false);
            } else if (den.bg(cavVarB)) {
                cavVarB.u(1390088540);
                j = den.ak(cavVarB).G;
                cbtVar.W(false);
            } else {
                cavVarB.u(1390157577);
                j = den.ak(cavVarB).p;
                cbtVar.W(false);
            }
            cbtVar.W(false);
            cavVar2 = cavVarB;
            bvo.b(cmwVar.a(den.aZ(azm.d(cmw.c, 1.0f), 12.0f, 0.0f)), crdVar2, j, 0L, 0.0f, 0.0f, (amu) null, cfo.j(-1574514165, new aonn() { // from class: kbv
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cja cjaVarJ;
                    aonj aonjVar2;
                    kiu kiuVar;
                    byte[] bArr;
                    cav cavVar3 = (cav) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    if (cavVar3.H((iIntValue & 3) != 2, iIntValue & 1)) {
                        defpackage.kbx kbxVar2 = kbxVar;
                        java.lang.Object[] objArr = new java.lang.Object[0];
                        java.lang.Object objG = cavVar3.g();
                        java.lang.Object obj3 = cau.a;
                        int i4 = 3;
                        if (objG == obj3) {
                            objG = new jaf(3);
                            cavVar3.w(objG);
                        }
                        ceg cegVar = (ceg) cfd.m(objArr, (aomy) objG, cavVar3, 48);
                        java.lang.Object[] objArr2 = new java.lang.Object[0];
                        java.lang.Object objG2 = cavVar3.g();
                        if (objG2 == obj3) {
                            objG2 = new jaf(4);
                            cavVar3.w(objG2);
                        }
                        ceg cegVar2 = (ceg) cfd.m(objArr2, (aomy) objG2, cavVar3, 48);
                        java.lang.Object objG3 = cavVar3.g();
                        if (objG3 == obj3) {
                            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(new dpp(0L), cdu.c);
                            cavVar3.w(parcelableSnapshotMutableState);
                            objG3 = parcelableSnapshotMutableState;
                        }
                        lpv lpvVar2 = lpvVar;
                        ccp ccpVar = (ccp) objG3;
                        boolean z = kbxVar2.g && lpvVar2 != lpv.c;
                        ahj ahjVar2 = ahjVar;
                        aonj aonjVar3 = aonjVar;
                        if (lpvVar2 == lpv.a) {
                            cavVar3.u(-1012938819);
                            cavVar3.o();
                            cjaVarJ = null;
                        } else {
                            cavVar3.u(-1012904564);
                            cjaVarJ = cfo.j(195312687, new jai(ahjVar2, kbxVar2, aonjVar3, 2), cavVar3);
                            cavVar3.o();
                        }
                        defpackage.klb klbVar = kbxVar2.k;
                        cmw cmwVarD = azm.d(cmw.c, 1.0f);
                        cja cjaVarJ2 = cfo.j(-2100042308, new defpackage.fxd(kbxVar2, aonjVar3, cegVar, cegVar2, ccpVar, 2), cavVar3);
                        cja cjaVarJ3 = cfo.j(1868510505, new defpackage.bli(ahjVar2, kbxVar2, i4), cavVar3);
                        boolean zB = cavVar3.B(aonjVar3);
                        kiu kiuVar2 = klbVar.a;
                        boolean zB2 = zB | cavVar3.B(kiuVar2) | cavVar3.z(lpvVar2.ordinal());
                        java.lang.Object objG4 = cavVar3.g();
                        if (zB2 || objG4 == obj3) {
                            objG4 = new defpackage.af(aonjVar3, kiuVar2, lpvVar2, 15, (short[]) null);
                            aonjVar2 = aonjVar3;
                            kiuVar = kiuVar2;
                            cavVar3.w(objG4);
                        } else {
                            kiuVar = kiuVar2;
                            aonjVar2 = aonjVar3;
                        }
                        aomy aomyVar = (aomy) objG4;
                        boolean zB3 = cavVar3.B(aonjVar2) | cavVar3.B(kbxVar2);
                        java.lang.Object objG5 = cavVar3.g();
                        if (zB3 || objG5 == obj3) {
                            bArr = null;
                            objG5 = new defpackage.hpc(aonjVar2, kbxVar2, 16, null);
                            cavVar3.w(objG5);
                        } else {
                            bArr = null;
                        }
                        aomy aomyVar2 = (aomy) objG5;
                        boolean zB4 = cavVar3.B(aonjVar2) | cavVar3.B(kiuVar);
                        java.lang.Object objG6 = cavVar3.g();
                        if (zB4 || objG6 == obj3) {
                            objG6 = new defpackage.hpc(aonjVar2, kiuVar, 17, bArr);
                            cavVar3.w(objG6);
                        }
                        kby kbyVar2 = kbyVar;
                        mni.cl(cmwVarD, z, cjaVarJ2, cjaVarJ, cjaVarJ3, aomyVar, aomyVar2, (aomy) objG6, cavVar3, 24966);
                        if (kbyVar2 != null) {
                            cavVar3.u(-1012142739);
                            dpf dpfVar = (dpf) cavVar3.e(dfo.e);
                            defpackage.jlr.i(kbyVar2, aonjVar2, dpfVar.di(cegVar.c() * ((int) (defpackage.jlr.j(ccpVar) >> 32))), dpfVar.di(cegVar2.c() * ((int) (defpackage.jlr.j(ccpVar) & 4294967295L))), cavVar3, 8);
                            cavVar3.o();
                        } else {
                            cavVar3.u(-1011764105);
                            cavVar3.o();
                        }
                    } else {
                        cavVar3.s();
                    }
                    return aojh.a;
                }
            }, cavVarB), cavVar2, 120);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.axp(ahjVar, kbxVar, kbyVar, aonjVar, cmwVar, crdVar, i, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [ccp, java.lang.Object] */
    public static void x(final ahj ahjVar, defpackage.kbx kbxVar, defpackage.afe afeVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-404762802);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ahjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(kbxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? cavVarB.B(afeVar) : cavVarB.D(afeVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            dkz dkzVarI = kcq.i((lpv) cavVarB.e(lpx.a), G(kbxVar), cavVarB);
            dji djiVar = kbxVar.i;
            if (djiVar == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            cmw cmwVarD = azm.d(cmwVar, 1.0f);
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = new defpackage.jak(20);
                cbtVar.ab(objR);
            }
            cmw cmwVarB = dig.b(cmwVarD, false, (aonj) objR);
            java.lang.String str = "phone_account_" + kbxVar.a;
            cavVarB.u(800730162);
            defpackage.ahe aheVar = defpackage.ahe.a;
            cavVarB.u(-148945892);
            boolean zB = cavVarB.B(str);
            java.lang.Object objR2 = cbtVar.R();
            if (zB || objR2 == obj) {
                objR2 = new izg(str, aheVar);
                cbtVar.ab(objR2);
            }
            final izg izgVar = (izg) objR2;
            izgVar.a.b(aheVar);
            cbtVar.W(false);
            cbtVar.W(false);
            defpackage.afk afkVar = defpackage.ahf.a;
            final defpackage.afk afkVar2 = defpackage.ahf.a;
            final defpackage.ahg ahgVar = defpackage.ahh.a;
            final den denVar = ahk.b;
            final alg algVarA = afeVar.a();
            final nq nqVar = new nq(15);
            cavVar2 = cavVarB;
            abrz.l(djiVar, den.x(cfo.n(cmwVarB, new aono() { // from class: ahi
                /* JADX WARN: Type inference failed for: r15v13, types: [ccp, java.lang.Object] */
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    alg algVarC;
                    defpackage.agx agxVar;
                    java.lang.Boolean bool;
                    cmw cmwVar2 = (cmw) obj2;
                    cav cavVar3 = (cav) obj3;
                    ((java.lang.Integer) obj4).intValue();
                    cavVar3.u(-1539505585);
                    izg izgVar2 = izgVar;
                    java.lang.Object obj5 = izgVar2.c;
                    cavVar3.t(-1996110823, obj5);
                    java.lang.Object objG = cavVar3.g();
                    ahj ahjVar2 = ahjVar;
                    java.lang.Object obj6 = cau.a;
                    if (objG == obj6) {
                        adw adwVar = ahjVar2.f;
                        java.lang.Object objA = adwVar.a(obj5);
                        if (objA == null) {
                            objA = new defpackage.agx(obj5, ahjVar2);
                            adwVar.n(obj5, objA);
                        }
                        objG = (defpackage.agx) objA;
                        cavVar3.w(objG);
                    }
                    aonj aonjVar = nqVar;
                    alg algVar = algVarA;
                    defpackage.agx agxVar2 = (defpackage.agx) objG;
                    cavVar3.t(-1996107042, algVar);
                    if (algVar != null) {
                        cavVar3.u(-1749734647);
                        boolean zB2 = cavVar3.B(algVar);
                        java.lang.Object objG2 = cavVar3.g();
                        if (zB2 || objG2 == obj6) {
                            objG2 = algVar.f();
                            cavVar3.w(objG2);
                        }
                        if (algVar.C()) {
                            objG2 = algVar.f();
                        }
                        cavVar3.u(-350681326);
                        java.lang.Boolean bool2 = (java.lang.Boolean) aonjVar.a(objG2);
                        bool2.booleanValue();
                        cavVar3.o();
                        java.lang.Object objH = algVar.h();
                        cavVar3.u(-350681326);
                        java.lang.Boolean bool3 = (java.lang.Boolean) aonjVar.a(objH);
                        bool3.booleanValue();
                        cavVar3.o();
                        algVarC = alk.b(algVar, bool2, bool3, cavVar3, 0);
                        if (algVar.C()) {
                            cavVar3.u(782538635);
                            cavVar3.o();
                        } else {
                            cavVar3.u(782386797);
                            java.lang.Object objG3 = algVar.g();
                            if (objG3 == null) {
                                cavVar3.u(782437481);
                                cavVar3.o();
                                bool = null;
                            } else {
                                cavVar3.u(782437482);
                                cavVar3.u(-350681326);
                                bool = (java.lang.Boolean) aonjVar.a(objG3);
                                bool.booleanValue();
                                cavVar3.o();
                                cavVar3.o();
                            }
                            algVarC.y(bool);
                            cavVar3.o();
                        }
                        cavVar3.o();
                    } else {
                        cavVar3.u(-1749488135);
                        boolean z = true;
                        aoov.f(aonjVar, 1);
                        java.lang.Boolean bool4 = (java.lang.Boolean) aonjVar.a(aojh.a);
                        boolean zBooleanValue = bool4.booleanValue();
                        java.lang.Object objG4 = cavVar3.g();
                        if (objG4 == obj6) {
                            if (agxVar2.b().isEmpty()) {
                                z = zBooleanValue;
                            } else if (zBooleanValue) {
                                z = false;
                            }
                            objG4 = new akc(java.lang.Boolean.valueOf(z));
                            cavVar3.w(objG4);
                        }
                        akc akcVar = (akc) objG4;
                        akcVar.f(bool4);
                        algVarC = alk.c(akcVar, cavVar3, 0);
                        cavVar3.o();
                    }
                    defpackage.afk afkVar3 = afkVar2;
                    cavVar3.t(-1996048955, java.lang.Boolean.valueOf(ahjVar2.i()));
                    defpackage.ett ettVarF = alk.f(algVarC, alo.i, cavVar3, 0);
                    cavVar3.m();
                    boolean zB3 = cavVar3.B(algVarC);
                    java.lang.Object objG5 = cavVar3.g();
                    if (zB3 || objG5 == obj6) {
                        defpackage.afg afgVar = new defpackage.afg(ahjVar2, algVarC, ettVarF, afkVar3, agxVar2.f);
                        cavVar3.w(afgVar);
                        objG5 = afgVar;
                    }
                    defpackage.afg afgVar2 = (defpackage.afg) objG5;
                    if (!aooh.n(afgVar2.g(), ettVarF)) {
                        afgVar2.b.b(ettVarF);
                        afgVar2.d(null);
                        afgVar2.d = defpackage.afi.a;
                    }
                    den denVar2 = denVar;
                    defpackage.ahg ahgVar2 = ahgVar;
                    afgVar2.c.b(afkVar3);
                    cavVar3.m();
                    java.lang.Object objG6 = cavVar3.g();
                    if (objG6 == obj6) {
                        agxVar = agxVar2;
                        defpackage.agy agyVar = new defpackage.agy(agxVar, afgVar2, ahgVar2, denVar2, izgVar2);
                        cavVar3.w(agyVar);
                        objG6 = agyVar;
                    } else {
                        agxVar = agxVar2;
                    }
                    defpackage.agy agyVar2 = (defpackage.agy) objG6;
                    izgVar2.b.b(agyVar2);
                    agyVar2.c.b(agxVar);
                    ccp ccpVar = agyVar2.f;
                    java.lang.Boolean bool5 = java.lang.Boolean.TRUE;
                    ccpVar.b(bool5);
                    agyVar2.d.b(afgVar2);
                    agyVar2.e.b(ahgVar2);
                    agyVar2.g.b(denVar2);
                    if (agyVar2.c() != 0.0f) {
                        agyVar2.l.h(0.0f);
                        agyVar2.e().b.h();
                    }
                    agyVar2.b.b(bool5);
                    agyVar2.h.b(izgVar2);
                    cavVar3.m();
                    cmw cmwVarA = cmwVar2.a(new defpackage.agv(agyVar2));
                    cavVar3.o();
                    return cmwVarA;
                }
            }), "call_log_phone_account_text"), den.ak(cavVarB).s, 0L, 0L, (dot) null, 0L, 2, false, 1, 0, (java.util.Map) null, (aonj) null, dkzVarI, cavVar2, 0, 24960, 241656);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.biu(ahjVar, kbxVar, afeVar, cmwVar, i, 14);
        }
    }

    public static void y(defpackage.kbx kbxVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        cbt cbtVar;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(1805541789);
        if (i3 == 0) {
            i2 = i | (true != cbtVarB.B(kbxVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            dkz dkzVarI = kcq.i((lpv) cbtVarB.e(lpx.a), G(kbxVar), cbtVarB);
            cbtVar = cbtVarB;
            dji djiVar = kbxVar.h;
            if (djiVar == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            cmw cmwVarD = azm.d(cmwVar, 1.0f);
            cbt cbtVar2 = cbtVar;
            java.lang.Object objR = cbtVar2.R();
            if (objR == cau.a) {
                objR = new defpackage.jak(i4);
                cbtVar2.ab(objR);
            }
            abrz.l(djiVar, den.x(dig.b(cmwVarD, false, (aonj) objR), "call_log_third_line_text"), den.ak(cbtVar).s, 0L, 0L, (dot) null, 0L, 2, false, 1, 0, (java.util.Map) null, (aonj) null, dkzVarI, cbtVar, 0, 24960, 241656);
        } else {
            cbtVar = cbtVarB;
            cbtVar.s();
        }
        cdk cdkVarI = cbtVar.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(kbxVar, cmwVar, i, 18, null);
        }
    }

    public static void z(kiu kiuVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-156261252);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(kiuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            cbt cbtVar = cbtVarB;
            cbtVar.Z(156795562, java.lang.Long.valueOf(kiuVar.d), 0, (java.lang.Object) null);
            int i4 = i2 & 14;
            java.lang.Object objR = cbtVar.R();
            if (i4 == 4 || objR == cau.a) {
                android.os.Bundle bundle = ((aw) defpackage.lyi.b(kiuVar, true)).m;
                if (bundle == null) {
                    bundle = android.os.Bundle.EMPTY;
                }
                objR = bundle;
                cbtVar.ab(objR);
            }
            android.os.Bundle bundle2 = (android.os.Bundle) objR;
            aooh.c(bundle2);
            cmwVar2 = cmwVar;
            defpackage.aaf.j(defpackage.lyb.class, cmwVar2, null, bundle2, null, null, cbtVarB, i2 & 112);
            cbtVar.W(false);
        } else {
            cmwVar2 = cmwVar;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(kiuVar, cmwVar2, i, 16, null);
        }
    }

    public defpackage.kaq C() {
        throw null;
    }

    public jlr(byte[] bArr) {
    }
}
