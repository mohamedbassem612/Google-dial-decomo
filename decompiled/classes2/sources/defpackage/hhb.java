package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hhb {
    public static final void A(android.content.Context context) {
        aooh.f(context, "context");
    }

    public static void a(afqz afqzVar, defpackage.ifg ifgVar) {
        ahvr.d(afqzVar, defpackage.iff.class, new defpackage.hwo(ifgVar, 2));
    }

    public static final void b(android.view.View view) {
        android.widget.ImageButton imageButton = (android.widget.ImageButton) view.findViewById(2131428687);
        android.widget.ImageButton imageButton2 = (android.widget.ImageButton) view.findViewById(2131428694);
        android.widget.ImageButton imageButton3 = (android.widget.ImageButton) view.findViewById(2131428689);
        imageButton.setBackgroundResource(2131230912);
        imageButton2.setBackgroundResource(2131230912);
        imageButton3.setBackgroundResource(2131230912);
    }

    public static final /* synthetic */ defpackage.heq c(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.heq(akzxVar);
    }

    public static final float d(android.view.View view) {
        aooh.f(view, "view");
        return view.getResources().getDimensionPixelSize(2131165348);
    }

    public static void e(defpackage.al alVar, defpackage.iyp iypVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.iya(3));
        ahvr.d(alVar, ahtf.class, new defpackage.hwo(iypVar, 12));
    }

    public static void f(defpackage.al alVar) {
        ahvr.d(alVar, ahtf.class, new defpackage.iya(2));
    }

    public static void g(aw awVar, defpackage.iyi iyiVar) {
        ahvr.e(awVar, defpackage.iyt.class, new defpackage.hwo(iyiVar, 10));
        ahvr.e(awVar, defpackage.iyw.class, new defpackage.hwo(iyiVar, 11));
    }

    public static final defpackage.iyc h() {
        defpackage.iyc iycVar = new defpackage.iyc();
        amxr.g(iycVar);
        return iycVar;
    }

    public static void i(defpackage.al alVar, defpackage.ixz ixzVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.iya(0));
        ahvr.d(alVar, ahtf.class, new defpackage.hwo(ixzVar, 9));
    }

    public static /* synthetic */ void j(ld ldVar) {
        aooh.f(ldVar, "holder");
        android.view.View view = ldVar.a;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    public static final /* synthetic */ defpackage.heq k(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.heq(akzxVar);
    }

    public static final /* synthetic */ defpackage.heq l(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.heq(akzxVar);
    }

    public static final /* synthetic */ defpackage.her m(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.her(akzxVar, (byte[]) null);
    }

    public static void n(aw awVar, defpackage.kwo kwoVar) {
        ahvr.e(awVar, defpackage.ieh.class, new defpackage.kwp(kwoVar, 1));
        ahvr.e(awVar, kuk.class, new defpackage.kwp(kwoVar, 0));
    }

    public static void o(defpackage.al alVar, defpackage.kvt kvtVar) {
        ahvr.d(alVar, ahtf.class, new defpackage.jui(kvtVar, 18));
    }

    public static final defpackage.kvr p(java.lang.String str, long j) {
        aooh.f(str, "callRecordingFilePath");
        akzx akzxVarM = defpackage.kvs.a.m();
        aooh.f(akzxVarM, "builder");
        aooh.f(str, "value");
        akzxVarM.u();
        defpackage.kvs kvsVar = (defpackage.kvs) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        kvsVar.b |= 1;
        kvsVar.c = str;
        akzxVarM.u();
        defpackage.kvs kvsVar2 = (defpackage.kvs) akzxVarM.b;
        kvsVar2.b |= 2;
        kvsVar2.d = j;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        defpackage.kvr kvrVar = new defpackage.kvr();
        amxr.g(kvrVar);
        ahgl.b(kvrVar, (defpackage.kvs) aladVarP);
        return kvrVar;
    }

    public static final boolean q(kiu kiuVar) {
        kui kuiVar = kiuVar.E;
        if (kuiVar == null) {
            kuiVar = kui.a;
        }
        java.lang.String str = kuiVar.c;
        aooh.e(str, "getCallRecordingFilePath(...)");
        return str.length() > 0;
    }

    public static void r(defpackage.al alVar, defpackage.kts ktsVar) {
        ahvr.d(alVar, ahtf.class, new defpackage.jui(ktsVar, 17));
    }

    public static final void s(defpackage.kte kteVar, crd crdVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        crd crdVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-368412539);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != cavVarB.B(kteVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            crdVar2 = crdVar;
            i2 |= true != cavVarB.B(crdVar2) ? 16 : 32;
        } else {
            crdVar2 = crdVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            cmw cmwVarAZ = den.aZ(den.bj(den.bp(cfd.K(cmwVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, crdVar2, true, 0, 1042431), den.ak(cavVarB).p), true, (java.lang.String) null, (dib) null, kteVar.c), 0.0f, 8.0f);
            long jM = cfd.M(0);
            int i5 = defpackage.acpz.a;
            aaoo.U(cfo.j(741567335, new defpackage.kmh(kteVar, i4), cavVarB), cmwVarAZ, (aonn) null, cfo.j(594398179, new defpackage.kmh(kteVar, 3), cavVarB), (aonn) null, defpackage.acpz.a(jM, cavVarB, 510), cavVarB, 24582, 428);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kko((java.lang.Object) kteVar, (java.lang.Object) crdVar, cmwVar, i, 12);
        }
    }

    public static final void t(defpackage.ktf ktfVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1621163194);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ktfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cmw cmwVarBj = den.bj(cmwVar, true, (java.lang.String) null, (dib) null, ktfVar.c);
            long jM = cfd.M(0);
            int i5 = defpackage.acpz.a;
            aaoo.U(cfo.j(-53657572, new defpackage.kmh(ktfVar, i4), cavVarB), cmwVarBj, (aonn) null, cfo.j(920489880, new defpackage.kmh(ktfVar, 5), cavVarB), (aonn) null, defpackage.acpz.a(jM, cavVarB, 510), cavVarB, 24582, 428);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kcv(ktfVar, cmwVar, i, 8);
        }
    }

    public static final void u(defpackage.ktc ktcVar, cmw cmwVar, aomy aomyVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        cmw cmwVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-310786773);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ktcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.D(aomyVar) ? 128 : 256;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            cmw cmwVar3 = cmw.c;
            defpackage.btu btuVar = defpackage.btu.a;
            java.util.Set setCW = ajsz.cW(new defpackage.btu[]{btuVar, defpackage.btu.b});
            int i5 = defpackage.bto.a;
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = new defpackage.bpr(18);
                cbtVar.ab(objR);
            }
            defpackage.btt bttVarB = defpackage.bto.b(setCW, (aonj) objR, btuVar, cavVarB, 390, 56);
            int i6 = i4 & 896;
            aojh aojhVar = aojh.a;
            java.lang.Object objR2 = cbtVar.R();
            if (i6 == 256 || objR2 == obj) {
                objR2 = new defpackage.jrb(aomyVar, (aoln) null, 10);
                cbtVar.ab(objR2);
            }
            cbp.g(aojhVar, (aonn) objR2, cavVarB);
            cavVar2 = cavVarB;
            aaoo.O(ktcVar.a, cmwVar3, bttVarB, 0.0f, false, (crd) null, 0L, 0L, 0.0f, 0L, (aonn) null, (aonn) null, (defpackage.brt) null, cfo.j(-1405721203, new defpackage.ant(ktcVar, 17), cavVarB), cavVar2, i4 & 112, 3072, 8184);
            cmwVar2 = cmwVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kko((java.lang.Object) ktcVar, cmwVar2, (java.lang.Object) aomyVar, i, 13);
        }
    }

    public static final void v(defpackage.ktc ktcVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(290321148);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(ktcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cbtVarB.H((i4 & 19) != 18, i4 & 1)) {
            cmwVar = cmw.c;
            cmw cmwVarBa = den.ba(den.aZ(defpackage.rl.f(uu.m(cmwVar, new defpackage.ayn(uu.i(cbtVarB), 47)), defpackage.rl.e(cbtVarB, 0), true), 24.0f, 0.0f), 0.0f, 0.0f, 0.0f, 24.0f);
            cye cyeVarA = aww.a(awi.c, cmh.k, cbtVarB, 48);
            cbt cbtVar = cbtVarB;
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
            defpackage.ktd ktdVar = ktcVar.d;
            if (ktdVar == null) {
                cbtVarB.u(1785630111);
            } else {
                cbtVarB.u(1785630112);
                w(ktdVar, null, cbtVarB, 0);
            }
            cbtVar.W(false);
            java.util.List list = ktcVar.b;
            if (list.isEmpty()) {
                cbtVarB.u(1785805820);
                cbtVar.W(false);
            } else {
                cbtVarB.u(1785734706);
                x(list, null, cbtVarB, 0);
                cbtVar.W(false);
            }
            java.util.List list2 = ktcVar.c;
            if (list2.isEmpty()) {
                cbtVarB.u(1785929820);
                cbtVar.W(false);
            } else {
                cbtVarB.u(1785854862);
                y(list2, null, cbtVarB, 0);
                cbtVar.W(false);
            }
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kcv(ktcVar, cmwVar, i, 10);
        }
    }

    public static final void w(defpackage.ktd ktdVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        int i3;
        cmw cmwVar2;
        int i4 = i & 6;
        cav cavVarB = cavVar.b(1154627536);
        if (i4 == 0) {
            i2 = i | (true != cavVarB.B(ktdVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if (cavVarB.H((i5 & 19) != 18, i5 & 1)) {
            cmwVar2 = cmw.c;
            cmw cmwVarBa = den.ba(azm.d(cmwVar2, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f);
            cmi cmiVar = cmh.k;
            cye cyeVarA = aww.a(awi.f(8.0f), cmiVar, cavVarB, 54);
            cbt cbtVar = (cbt) cavVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarBa);
            aomy aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
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
            abko abkoVar = ktdVar.a;
            cavVarB.u(-230161349);
            aehj.ao(abkoVar, den.x(azm.g(cmwVar2, 66.0f), "CallOptionHeaderLogo"), (crd) null, cavVarB, 48, 4);
            cbtVar.W(false);
            cmw cmwVarD = azm.d(cmwVar2, 1.0f);
            cye cyeVarA2 = azh.a(awi.g(8.0f, cmiVar), cmh.n, cavVarB, 54);
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cavVarB, cmwVarD);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA2, aonnVar);
            cev.c(cavVarB, cjeVarAi2, aonnVar2);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            cev.b(cavVarB, aonjVar);
            cev.c(cavVarB, cmwVarM2, aonnVar4);
            i3 = 6;
            abrz.k(ktdVar.b, azk.a.a(den.x(cmwVar2, "CallOptionHeaderBusinessName"), 1.0f, false), den.ak(cavVarB).q, 0L, (dnd) null, (dmq) null, 0L, new dot(3), 0L, 2, false, 1, 0, (aonj) null, den.an(cavVarB).g, cavVarB, 0, 24960, 109560);
            cavVarB = cavVarB;
            cavVarB.u(-851235385);
            aehj.aj(den.x(azm.g(cmwVar2, 20.0f), "CallOptionHeaderVerifiedIcon"), cavVarB, 6);
            cbtVar.W(false);
            cbtVar.W(true);
            cbtVar.W(true);
        } else {
            i3 = 6;
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kcv(ktdVar, cmwVar2, i, i3);
        }
    }

    public static final void x(java.util.List list, cmw cmwVar, cav cavVar, int i) {
        int i2 = i & 6;
        cbt cbtVarB = cavVar.b(108118224);
        int i3 = (i2 == 0 ? (true != ((i & 8) == 0 ? cbtVarB.B(list) : cbtVarB.D(list)) ? 2 : 4) | i : i) | 48;
        if (cbtVarB.H((i3 & 19) != 18, i3 & 1)) {
            cmwVar = cmw.c;
            cmw cmwVarBa = den.ba(azm.d(cmwVar, 1.0f), 0.0f, 0.0f, 0.0f, 12.0f);
            cye cyeVarA = aww.a(awi.c, cmh.j, cbtVarB, 0);
            cbt cbtVar = cbtVarB;
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
            cbtVarB.u(444516120);
            defpackage.abjp abjpVar = defpackage.abjp.Top;
            aooh.f(list, "data");
            int i4 = 0;
            for (java.lang.Object obj : aehj.ax(list, defpackage.abjo.a)) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    ajsz.bh();
                }
                aoiu aoiuVar = (aoiu) obj;
                s((defpackage.kte) aoiuVar.a, aehj.ay((defpackage.abjp) aoiuVar.b), azm.d(cmwVar, 1.0f), cbtVarB, 384);
                if (i4 < ((aokv) list).b - 1) {
                    cbtVarB.u(475240812);
                    den.aR(den.x(azm.e(azm.d(cmwVar, 1.0f), 2.0f), "CallOptionSpacer"), cbtVarB);
                    cbtVar.W(false);
                } else {
                    cbtVarB.u(475387845);
                    cbtVar.W(false);
                }
                i4 = i5;
            }
            cbtVar.W(false);
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kcv(list, cmwVar, i, 7);
        }
    }

    public static final void y(java.util.List list, cmw cmwVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(628339906);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cbtVarB.B(list) : cbtVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cbtVarB.H((i4 & 19) != 18, i4 & 1)) {
            cmwVar = cmw.c;
            cmw cmwVarD = azm.d(cmwVar, 1.0f);
            cye cyeVarA = aww.a(awi.f(2.0f), cmh.j, cbtVarB, 6);
            cbt cbtVar = cbtVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarD);
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
            cbtVarB.u(170243778);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                t((defpackage.ktf) it.next(), azm.d(cmwVar, 1.0f), cbtVarB, 48);
            }
            cbtVar.W(false);
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kcv(list, cmwVar, i, 9);
        }
    }

    public static /* synthetic */ java.lang.String z(int i) {
        if (i == 1) {
            return "GOOGLE_CALENDAR";
        }
        if (i == 2) {
            return "GENERIC_CALENDAR_APP";
        }
        if (i != 3) {
            return i != 4 ? "GOOGLE_DIALER" : "GENERIC_CONTACTS_APP";
        }
        return "GENERIC_REMINDER_APP";
    }
}
