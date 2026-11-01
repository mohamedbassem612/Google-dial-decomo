package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hhk {
    public static final androidx.car.app.model.CarIcon a(defpackage.tt ttVar, int i) {
        return new androidx.car.app.model.CarIcon(new defpackage.wj(androidx.core.graphics.drawable.IconCompat.g(ttVar, i)));
    }

    public static /* synthetic */ int b(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj instanceof defpackage.jip) {
            return 0;
        }
        return obj instanceof agtp ? 1 : -2;
    }

    public static void c(defpackage.al alVar, defpackage.jiv jivVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.hwo(jivVar, 14));
        ahvr.d(alVar, ahtf.class, new defpackage.hwo(jivVar, 15));
    }

    public static jiq d(android.content.Context context) {
        return (jiq) agab.aH(context, jiq.class);
    }

    public static final void e(aomy aomyVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        aomy aomyVar2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1273859958);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            aomyVar2 = aomyVar;
            aaoo.aC(aomyVar2, azm.e(cmwVar, 60.0f), true, aaoo.aa(abts.F(cavVarB).n, 0L, cqg.h(abts.F(cavVarB).n, 0.4f), 0L, cavVarB, 10), (kaw) null, (crd) null, defpackage.jhr.a, cavVarB, (i2 & 14) | 1573248, 48);
            cavVar2 = cavVarB;
        } else {
            aomyVar2 = aomyVar;
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(aomyVar2, cmwVar, i, 13, null);
        }
    }

    public static final void f(abko abkoVar, java.lang.String str, java.lang.String str2, aomy aomyVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1082619182);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abkoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(str2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            cmt cmtVar = cmw.c;
            cmw cmwVarD = azm.d(den.aY(cmtVar, 16.0f), 1.0f);
            cye cyeVarA = azh.a(awi.f(12.0f), cmh.n, cavVarB, 54);
            cbt cbtVar = (cbt) cavVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarD);
            aomy aomyVar2 = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            aonn aonnVar = dam.e;
            cev.c(cavVarB, cyeVarA, aonnVar);
            aonn aonnVar2 = dam.d;
            cev.c(cavVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar3 = dam.f;
            cev.c(cavVarB, numValueOf, aonnVar3);
            aonj aonjVar = dam.g;
            cev.b(cavVarB, aonjVar);
            aonn aonnVar4 = dam.c;
            cev.c(cavVarB, cmwVarM, aonnVar4);
            azk azkVar = azk.a;
            int i4 = i2;
            aehj.ao(abkoVar, azm.g(cmtVar, 40.0f), (crd) null, cavVarB, (i4 & 14) | 48, 4);
            cmw cmwVarA = azkVar.a(cmtVar, 1.0f, true);
            cye cyeVarA2 = aww.a(awi.c, cmh.j, cavVarB, 0);
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cavVarB, cmwVarA);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA2, aonnVar);
            cev.c(cavVarB, cjeVarAi2, aonnVar2);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            cev.b(cavVarB, aonjVar);
            cev.c(cavVarB, cmwVarM2, aonnVar4);
            cavVar2 = cavVarB;
            bvt.b(str, azm.d(cmtVar, 1.0f), den.ak(cavVarB).q, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 2, false, 1, 0, (aonj) null, den.an(cavVarB).v, cavVar2, ((i4 >> 3) & 14) | 48, 24960, 110584);
            int i5 = i4 >> 6;
            bvt.b(str2, azm.d(cmtVar, 1.0f), den.ak(cavVar2).s, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 2, false, 1, 0, (aonj) null, den.an(cavVar2).k, cavVar2, (i5 & 14) | 48, 24960, 110584);
            cbtVar.W(true);
            cer cerVarBb = aehj.bb(aomyVar, cavVar2, (i5 & 112) | 6);
            aehj.ba((java.lang.String) cerVarBb.a(), den.x(den.ba(cmtVar, 3.0f, 0.0f, 2.0f, 0.0f), "beesly_chronometer"), den.ak(cavVar2).s, den.an(cavVar2).j, cavVar2, 48);
            cbtVar.W(true);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.biu(abkoVar, str, str2, aomyVar, i, 8);
        }
    }

    public static final void g(defpackage.jhl jhlVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-9198284);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(jhlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            bvo.b(azm.c(cmw.c, 1.0f), (crd) null, den.ak(cavVarB).F, 0L, 0.0f, 0.0f, (amu) null, cfo.j(-1466001799, new defpackage.izk(jhlVar, 9), cavVarB), cavVarB, 122);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ajs(jhlVar, i, 15);
        }
    }

    public static final void h(aomy aomyVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1788973972);
        if (i3 == 0) {
            i2 = (true != cbtVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cbtVarB.H((i4 & 19) != 18, i4 & 1)) {
            cmwVar = cmw.c;
            cmw cmwVarBa = den.ba(defpackage.bac.a(azm.d(cmwVar, 1.0f)), 24.0f, 24.0f, 24.0f, 32.0f);
            cye cyeVarA = azh.a(awi.g(24.0f, cmh.k), cmh.n, cbtVarB, 54);
            cbt cbtVar = cbtVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarBa);
            aomy aomyVar2 = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar2);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarA, dam.e);
            cev.c(cbtVarB, cjeVarAi, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM, dam.c);
            e(aomyVar, azm.d(cmwVar, 0.5f), cbtVarB, (i4 & 14) | 48);
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cmw cmwVar2 = cmwVar;
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(aomyVar, cmwVar2, i, 14, null);
        }
    }

    public static void i(ajwr ajwrVar, defpackage.jjo jjoVar) {
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427969), new defpackage.gr(jjoVar, 12));
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427971), new defpackage.gr(jjoVar, 13));
    }

    public static void j(ajwr ajwrVar, defpackage.jjd jjdVar) {
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427969), new defpackage.gr(jjdVar, 10));
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427971), new defpackage.gr(jjdVar, 11));
    }

    public static final /* synthetic */ defpackage.heq k(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.heq(akzxVar);
    }

    public static final /* synthetic */ defpackage.her l(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.her(akzxVar, (byte[]) null);
    }

    public static final /* synthetic */ defpackage.her m(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.her(akzxVar, (byte[]) null);
    }

    public static final /* synthetic */ defpackage.her n(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.her(akzxVar, (byte[]) null);
    }

    public static final /* synthetic */ defpackage.hgw o(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.hgw(akzxVar);
    }

    public static final /* synthetic */ defpackage.hgw p(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.hgw(akzxVar);
    }
}
