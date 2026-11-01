package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hhv {
    public static aoxh a(defpackage.hqr hqrVar, aoxh aoxhVar, defpackage.tt ttVar) {
        aooh.f(aoxhVar, "dataFlow");
        aooh.f(ttVar, "carContext");
        return aoyc.a(aoxhVar, new defpackage.hqq(hqrVar, ttVar, (aoln) null, 0));
    }

    public static int b(int i) {
        return i == 1 ? alau.a() : i - 2;
    }

    public static int c(int i) {
        return i == 1 ? alau.a() : i - 2;
    }

    public static int d(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 3;
        }
        return 2;
    }

    public static final /* synthetic */ defpackage.jhw e(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.jhw(akzxVar);
    }

    public static final void f(java.lang.String str, aomy aomyVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        cbt cbtVar;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-1138924559);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cmn cmnVar = cmh.n;
            cmt cmtVar = cmw.c;
            cmw cmwVarD = azm.d(cmtVar, 1.0f);
            cye cyeVarA = azh.a(awi.a, cmnVar, cavVarB, 48);
            cbt cbtVar2 = (cbt) cavVarB;
            int iM = anty.M(cbtVar2.x);
            cje cjeVarAi = cbtVar2.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarD);
            aomy aomyVar2 = dam.a;
            cavVarB.v();
            if (cbtVar2.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA, dam.e);
            cev.c(cavVarB, cjeVarAi, dam.d);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVarB, dam.g);
            cev.c(cavVarB, cmwVarM, dam.c);
            int i4 = i2;
            bvt.b(dfa.g(2132017896, new java.lang.Object[]{str}, cavVarB), azk.a.a(cmtVar, 1.0f, true), 0L, 0L, dnd.g, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, den.an(cavVarB).h, cavVarB, 1572864, 0, 131004);
            den.aR(azm.k(cmtVar, 16.0f), cavVarB);
            csx csxVarAL = aehj.aL(defpackage.abja.aG, cavVarB);
            java.lang.String strF = dfa.f(2132017933, cavVarB);
            cmw cmwVarG = azm.g(cmtVar, 24.0f);
            int i5 = i4 & 112;
            java.lang.Object objR = cbtVar2.R();
            if (i5 == 32 || objR == cau.a) {
                objR = new defpackage.jaj(aomyVar, 5);
                cbtVar = cbtVar2;
                cbtVar.ab(objR);
            } else {
                cbtVar = cbtVar2;
            }
            aaoo.W(csxVarAL, strF, den.bj(cmwVarG, true, (java.lang.String) null, (dib) null, (aomy) objR), den.ak(cavVarB).q, cavVarB, 0, 0);
            cavVar2 = cavVarB;
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(str, aomyVar, i, 15);
        }
    }

    public static final void g(int i, defpackage.abja abjaVar, aomy aomyVar, cmw cmwVar, cav cavVar, int i2) {
        int i3;
        aomy aomyVar2;
        cmw cmwVar2;
        int i4 = i2 & 6;
        cav cavVarB = cavVar.b(-1481493587);
        if (i4 == 0) {
            i3 = (true != cavVarB.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.z(abjaVar.ordinal()) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            aomyVar2 = aomyVar;
            i3 |= true != cavVarB.D(aomyVar2) ? 128 : 256;
        } else {
            aomyVar2 = aomyVar;
        }
        if ((i2 & 3072) == 0) {
            cmwVar2 = cmwVar;
            i3 |= true != cavVarB.B(cmwVar2) ? 1024 : 2048;
        } else {
            cmwVar2 = cmwVar;
        }
        if (cavVarB.H((i3 & 1171) != 1170, i3 & 1)) {
            ayy ayyVar = defpackage.acpl.a;
            int i5 = i3 >> 6;
            aaoo.ak(aomyVar2, cmwVar2, false, (crd) null, defpackage.acpl.a(den.ak(cavVarB).h, den.ak(cavVarB).i, cavVarB, 12), (defpackage.bnm) null, (amu) null, (ayy) null, cfo.j(1088712125, new afnj(abjaVar, i, 1), cavVarB), cavVarB, (i5 & 14) | 805306368 | (i5 & 112), 492);
            cavVarB = cavVarB;
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqg(i, abjaVar, aomyVar, cmwVar, i2, 2);
        }
    }

    public static final void h(final java.lang.String str, cmw cmwVar, final aomy aomyVar, final aomy aomyVar2, final aomy aomyVar3, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-2145879281);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(str) ? 2 : 4) | i;
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
            i2 |= true != cavVarB.D(aomyVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aomyVar3) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            aaoo.ai(den.aY(azm.d(cmwVar, 1.0f), 16.0f), bge.b(24.0f), aaoo.aj(den.ak(cavVarB).p, 0L, cavVarB, 14), (bnx) null, cfo.j(1577956061, new aono() { // from class: jti
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    cav cavVar2 = (cav) obj2;
                    int iIntValue = ((java.lang.Integer) obj3).intValue();
                    aooh.f((awy) obj, "$this$Card");
                    int i4 = iIntValue & 17;
                    if (cavVar2.H(i4 != 16, iIntValue & 1)) {
                        cmt cmtVar = cmw.c;
                        cmw cmwVarAY = den.aY(defpackage.rl.f(azm.d(cmtVar, 1.0f), defpackage.rl.e(cavVar2, 0), true), 16.0f);
                        cye cyeVarA = aww.a(awi.c, cmh.j, cavVar2, 0);
                        int iM = anty.M(cavVar2.a());
                        cje cjeVarM = cavVar2.M();
                        cmw cmwVarM = cfo.m(cavVar2, cmwVarAY);
                        aomy aomyVar4 = dam.a;
                        cavVar2.L();
                        cavVar2.v();
                        if (cavVar2.F()) {
                            cavVar2.j(aomyVar4);
                        } else {
                            cavVar2.x();
                        }
                        aomy aomyVar5 = aomyVar;
                        java.lang.String str2 = str;
                        aonn aonnVar = dam.e;
                        cev.c(cavVar2, cyeVarA, aonnVar);
                        aonn aonnVar2 = dam.d;
                        cev.c(cavVar2, cjeVarM, aonnVar2);
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
                        aonn aonnVar3 = dam.f;
                        cev.c(cavVar2, numValueOf, aonnVar3);
                        aonj aonjVar = dam.g;
                        cev.b(cavVar2, aonjVar);
                        aonn aonnVar4 = dam.c;
                        cev.c(cavVar2, cmwVarM, aonnVar4);
                        defpackage.hhv.f(str2, aomyVar5, cavVar2, 0);
                        den.aR(azm.e(cmtVar, 16.0f), cavVar2);
                        bvt.b(dfa.f(2132017893, cavVar2), (cmw) null, den.ak(cavVar2).s, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, den.an(cavVar2).k, cavVar2, 0, 0, 131066);
                        den.aR(azm.e(cmtVar, 16.0f), cavVar2);
                        cmw cmwVarD = azm.d(cmtVar, 1.0f);
                        cye cyeVarA2 = azh.a(awi.f(8.0f), cmh.m, cavVar2, 6);
                        int iM2 = anty.M(cavVar2.a());
                        cje cjeVarM2 = cavVar2.M();
                        cmw cmwVarM2 = cfo.m(cavVar2, cmwVarD);
                        cavVar2.L();
                        cavVar2.v();
                        if (cavVar2.F()) {
                            cavVar2.j(aomyVar4);
                        } else {
                            cavVar2.x();
                        }
                        cev.c(cavVar2, cyeVarA2, aonnVar);
                        cev.c(cavVar2, cjeVarM2, aonnVar2);
                        cev.c(cavVar2, java.lang.Integer.valueOf(iM2), aonnVar3);
                        cev.b(cavVar2, aonjVar);
                        cev.c(cavVar2, cmwVarM2, aonnVar4);
                        azk azkVar = azk.a;
                        cmw cmwVarA = azkVar.a(cmtVar, 1.0f, true);
                        cmj cmjVar = cmh.a;
                        cye cyeVarB = awo.b(cmjVar, false);
                        int iM3 = anty.M(cavVar2.a());
                        cje cjeVarM3 = cavVar2.M();
                        cmw cmwVarM3 = cfo.m(cavVar2, cmwVarA);
                        cavVar2.L();
                        cavVar2.v();
                        if (cavVar2.F()) {
                            cavVar2.j(aomyVar4);
                        } else {
                            cavVar2.x();
                        }
                        aomy aomyVar6 = aomyVar2;
                        cev.c(cavVar2, cyeVarB, aonnVar);
                        cev.c(cavVar2, cjeVarM3, aonnVar2);
                        cev.c(cavVar2, java.lang.Integer.valueOf(iM3), aonnVar3);
                        cev.b(cavVar2, aonjVar);
                        cev.c(cavVar2, cmwVarM3, aonnVar4);
                        defpackage.hhv.g(2132017894, defpackage.abja.aG, aomyVar6, azm.d(cmtVar, 1.0f), cavVar2, 3120);
                        cavVar2.n();
                        cmw cmwVarA2 = azkVar.a(cmtVar, 1.0f, true);
                        cye cyeVarB2 = awo.b(cmjVar, false);
                        int iM4 = anty.M(cavVar2.a());
                        cje cjeVarM4 = cavVar2.M();
                        cmw cmwVarM4 = cfo.m(cavVar2, cmwVarA2);
                        cavVar2.L();
                        cavVar2.v();
                        if (cavVar2.F()) {
                            cavVar2.j(aomyVar4);
                        } else {
                            cavVar2.x();
                        }
                        aomy aomyVar7 = aomyVar3;
                        cev.c(cavVar2, cyeVarB2, aonnVar);
                        cev.c(cavVar2, cjeVarM4, aonnVar2);
                        cev.c(cavVar2, java.lang.Integer.valueOf(iM4), aonnVar3);
                        cev.b(cavVar2, aonjVar);
                        cev.c(cavVar2, cmwVarM4, aonnVar4);
                        defpackage.hhv.g(2132017895, defpackage.abja.az, aomyVar7, azm.d(cmtVar, 1.0f), cavVar2, 3120);
                        cavVar2.n();
                        cavVar2.n();
                        cavVar2.n();
                    } else {
                        cavVar2.s();
                    }
                    return aojh.a;
                }
            }, cavVarB), cavVarB, 196608);
            cavVarB = cavVarB;
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.alh(str, cmwVar, aomyVar, aomyVar2, aomyVar3, i, 7);
        }
    }

    public static boolean i(rmt rmtVar) {
        return rmtVar == rmt.d || rmtVar == rmt.h;
    }

    public static defpackage.jrz j(kiu kiuVar, int i, int i2) {
        akzx akzxVarM = defpackage.jrz.a.m();
        defpackage.hkd hkdVar = kiuVar.f;
        if (hkdVar == null) {
            hkdVar = defpackage.hkd.a;
        }
        akzxVarM.u();
        defpackage.jrz jrzVar = (defpackage.jrz) akzxVarM.b;
        j$.util.Objects.requireNonNull(hkdVar);
        jrzVar.c = hkdVar;
        jrzVar.b |= 1;
        defpackage.kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = defpackage.kiw.a;
        }
        akzxVarM.u();
        defpackage.jrz jrzVar2 = (defpackage.jrz) akzxVarM.b;
        j$.util.Objects.requireNonNull(kiwVar);
        jrzVar2.d = kiwVar;
        jrzVar2.b |= 2;
        akzxVarM.u();
        defpackage.jrz jrzVar3 = (defpackage.jrz) akzxVarM.b;
        jrzVar3.f = i - 1;
        jrzVar3.b |= 8;
        int i3 = kiuVar.q;
        akzxVarM.u();
        defpackage.jrz jrzVar4 = (defpackage.jrz) akzxVarM.b;
        jrzVar4.b |= 16;
        jrzVar4.g = i3;
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(kiuVar.H);
        akzxVarM.u();
        defpackage.jrz jrzVar5 = (defpackage.jrz) akzxVarM.b;
        jrzVar5.b |= 32;
        jrzVar5.h = millis;
        java.lang.String str = kiuVar.m;
        akzxVarM.u();
        defpackage.jrz jrzVar6 = (defpackage.jrz) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        jrzVar6.b |= 64;
        jrzVar6.i = str;
        java.lang.String str2 = kiuVar.n;
        akzxVarM.u();
        defpackage.jrz jrzVar7 = (defpackage.jrz) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        jrzVar7.b |= 128;
        jrzVar7.j = str2;
        akzxVarM.u();
        defpackage.jrz jrzVar8 = (defpackage.jrz) akzxVarM.b;
        jrzVar8.b |= 256;
        jrzVar8.k = i2;
        return (defpackage.jrz) akzxVarM.p();
    }

    public static final defpackage.jqo k(java.lang.String str) {
        java.lang.String strGroup;
        aooh.f(str, "content");
        java.util.regex.Matcher matcher = defpackage.jqo.a.matcher(str);
        aooh.e(matcher, "matcher(...)");
        if (!matcher.find()) {
            return defpackage.jqo.f;
        }
        java.lang.String strGroup2 = matcher.group(1);
        if (strGroup2 == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        java.util.regex.Matcher matcher2 = defpackage.jqo.b.matcher(strGroup2);
        aooh.e(matcher2, "matcher(...)");
        if (matcher2.find() && (strGroup = matcher2.group(1)) != null) {
            int iHashCode = strGroup.hashCode();
            if (iHashCode != -1281977283) {
                if (iHashCode == -995381136 && strGroup.equals("passed")) {
                    return defpackage.jqo.d;
                }
            } else if (strGroup.equals("failed")) {
                return defpackage.jqo.e;
            }
        }
        return defpackage.jqo.c;
    }

    public static jmd l(android.content.Context context) {
        return (jmd) agab.aH(context, jmd.class);
    }

    public static void m(ajwr ajwrVar, defpackage.jmp jmpVar) {
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427969), new defpackage.jln(jmpVar, 3));
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427971), new defpackage.jln(jmpVar, 4));
    }

    public static final /* synthetic */ defpackage.hgw n(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.hgw(akzxVar);
    }

    public static final /* synthetic */ defpackage.jhw o(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.jhw(akzxVar);
    }

    public static final /* synthetic */ defpackage.ni p(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ni(akzxVar);
    }

    public static final /* synthetic */ defpackage.ni q(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ni(akzxVar);
    }
}
