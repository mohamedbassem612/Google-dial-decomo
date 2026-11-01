package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class snl {
    public snl() {
    }

    public static void A(defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(563040092);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 6;
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.rd.g(defpackage.wv.i(2131230963, cavVarB, 6), null, cmwVar, cavVarB, ((i2 << 6) & 896) | 48);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(cmwVar, i, i4);
        }
    }

    public static void B(sgl sglVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aooh.f(sglVar, "uiData");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(924088923);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(sglVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            cmwVar = defpackage.cmw.c;
            defpackage.bvo.b(defpackage.azm.c(cmwVar, 1.0f), null, defpackage.den.ak(cavVarB).F, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(-1645870432, new rzg(sglVar, 9), cavVarB), cavVarB, 122);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(sglVar, cmwVar, i, 19);
        }
    }

    public static void C(sgl sglVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aooh.f(sglVar, "uiData");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-427826652);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(sglVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            cmwVar = defpackage.cmw.c;
            defpackage.bvo.b(defpackage.azm.c(cmwVar, 1.0f), null, defpackage.den.ak(cavVarB).F, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(-1977990615, new rzg(sglVar, 6), cavVarB), cavVarB, 122);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(sglVar, cmwVar, i, 17);
        }
    }

    public static void D(java.util.List list, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1664547997);
        int i3 = (i2 == 0 ? (true != ((i & 8) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 2 : 4) | i : i) | 48;
        if (cavVarB.H((i3 & 19) != 18, i3 & 1)) {
            cmwVar = defpackage.cmw.c;
            defpackage.cmw cmwVarD = defpackage.azm.d(cmwVar, 1.0f);
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.f(2.0f), defpackage.cmh.j, cavVarB, 6);
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
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            cavVarB.u(1393976243);
            int i4 = 0;
            for (java.lang.Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    defpackage.ajsz.bh();
                }
                sgn sgnVar = (sgn) obj;
                boolean z = i4 == 0;
                z(sgnVar, defpackage.bge.c(r(z), r(z), r(i4 == defpackage.ajsz.aZ(list)), r(i4 == defpackage.ajsz.aZ(list))), cavVarB, 0);
                i4 = i5;
            }
            cbtVar.W(false);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(list, cmwVar, i, 18);
        }
    }

    public static void E(defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2 = i | 6;
        boolean z = (i2 & 3) != 2;
        defpackage.cav cavVarB = cavVar.b(1097327753);
        if (cavVarB.H(z, i2 & 1)) {
            cmwVar = defpackage.cmw.c;
            defpackage.bvo.b(defpackage.den.ba(defpackage.azm.d(cmwVar, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f), defpackage.den.am(cavVarB).d, 0L, 0L, 0.0f, 0.0f, null, sgm.g, cavVarB, 124);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(cmwVar, i, 5);
        }
    }

    public static void F(defpackage.aomy aomyVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-134262348);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            cmwVar2 = defpackage.cmw.c;
            defpackage.cmw cmwVarAZ = defpackage.den.aZ(defpackage.azm.d(cmwVar2, 1.0f), 0.0f, 16.0f);
            int i5 = i4 & 14;
            defpackage.bgc bgcVarA = defpackage.bge.a(50);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (i5 == 4 || objR == defpackage.cau.a) {
                objR = new pqf(aomyVar, 14);
                cbtVar.ab(objR);
            }
            defpackage.aaoo.ak((defpackage.aomy) objR, cmwVarAZ, false, bgcVarA, null, null, null, null, sgm.a, cavVarB, 805306368, 500);
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(aomyVar, cmwVar2, i, 16);
        }
    }

    public static void G(defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1808420728);
        if (i3 == 0) {
            i2 = (true != cavVarB.z(2132019746) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            cavVar2 = cavVarB;
            defpackage.abrz.k(defpackage.dfa.f(2132019746, cavVarB), defpackage.den.aZ(defpackage.azm.d(defpackage.cmw.c, 1.0f), 52.0f, 0.0f), defpackage.den.ak(cavVarB).q, 0L, null, null, 0L, new defpackage.dot(3), 0L, 0, false, 0, 0, null, defpackage.den.an(cavVarB).k, cavVar2, 48, 0, 130040);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new peb(i, 6);
        }
    }

    public static void H(defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2 = i | 6;
        boolean z = (i2 & 3) != 2;
        defpackage.cav cavVarB = cavVar.b(180670474);
        if (cavVarB.H(z, i2 & 1)) {
            cmwVar = defpackage.cmw.c;
            w(defpackage.azm.d(cmwVar, 1.0f), sgm.e, cavVarB, 48, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(cmwVar, i, 8);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void I(al alVar, sgi sgiVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtd.class, new rrj(sgiVar, 3));
        defpackage.ahvr.d(alVar, ahtf.class, new rrj(sgiVar, 4));
    }

    public static spd J(spn spnVar) {
        defpackage.alat alatVar;
        spe speVarA = sns.a(spnVar);
        if (speVarA == null || (alatVar = speVarA.b) == null) {
            return null;
        }
        return (spd) defpackage.ajsz.bG(alatVar);
    }

    public static /* synthetic */ ryg K(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new ryg(akzxVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object L(defpackage.sdg sdgVar, defpackage.aoln aolnVar) throws java.io.IOException {
        sdd sddVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof sdd) {
            sddVar = (sdd) aolnVar;
            int i = sddVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sddVar.b = i - Integer.MIN_VALUE;
            } else {
                sddVar = new sdd(sdgVar, aolnVar);
            }
        } else {
            sddVar = new sdd(sdgVar, aolnVar);
        }
        java.lang.Object obj = sddVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = sddVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!defpackage.ahvr.R(sddVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(779, "WhitePagesDao.getAllWhitePagesDataEntity");
            try {
                sddVar.d = ahoqVarZ;
                sddVar.b = 1;
                java.lang.Object objO = defpackage.dez.o(((defpackage.sdk) sdgVar).a, true, true, new sdi(0), sddVar);
                if (objO != obj2) {
                    obj = objO;
                    ahoqVar = ahoqVarZ;
                }
                return obj2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = sddVar.d;
        try {
            defpackage.aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        obj2 = (java.util.List) obj;
        defpackage.ajsz.ak(ahoqVar, null);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object M(defpackage.sdg sdgVar, java.lang.String str, defpackage.aoln aolnVar) throws java.io.IOException {
        sde sdeVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof sde) {
            sdeVar = (sde) aolnVar;
            int i = sdeVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdeVar.b = i - Integer.MIN_VALUE;
            } else {
                sdeVar = new sde(sdgVar, aolnVar);
            }
        } else {
            sdeVar = new sde(sdgVar, aolnVar);
        }
        java.lang.Object obj = sdeVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = sdeVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!defpackage.ahvr.R(sdeVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(780, "WhitePagesDao.getWhitePagesDataEntity");
            try {
                sdeVar.d = ahoqVarZ;
                sdeVar.b = 1;
                java.lang.Object objO = defpackage.dez.o(((defpackage.sdk) sdgVar).a, true, true, new rzt(str, 5), sdeVar);
                if (objO != obj2) {
                    obj = objO;
                    ahoqVar = ahoqVarZ;
                }
                return obj2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = sdeVar.d;
        try {
            defpackage.aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        obj2 = (java.util.List) obj;
        defpackage.ajsz.ak(ahoqVar, null);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object N(defpackage.sdg sdgVar, sdl sdlVar, defpackage.aoln aolnVar) throws java.io.IOException {
        sdf sdfVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof sdf) {
            sdfVar = (sdf) aolnVar;
            int i = sdfVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdfVar.b = i - Integer.MIN_VALUE;
            } else {
                sdfVar = new sdf(sdgVar, aolnVar);
            }
        } else {
            sdfVar = new sdf(sdgVar, aolnVar);
        }
        java.lang.Object obj = sdfVar.a;
        java.lang.Object l = defpackage.aolu.a;
        int i2 = sdfVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!defpackage.ahvr.R(sdfVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(781, "WhitePagesDao.insertWhitePagesDataEntity");
            try {
                sdfVar.d = ahoqVarZ;
                sdfVar.b = 1;
                if (sdlVar == null) {
                    throw null;
                }
                java.lang.Object objO = defpackage.dez.o(((defpackage.sdk) sdgVar).a, false, true, new sdh((defpackage.sdk) sdgVar, sdlVar), sdfVar);
                if (objO != l) {
                    obj = objO;
                    ahoqVar = ahoqVarZ;
                }
                return l;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = sdfVar.d;
        try {
            defpackage.aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        l = new java.lang.Long(((java.lang.Number) obj).longValue());
        defpackage.ajsz.ak(ahoqVar, null);
        return l;
    }

    public static abxt O(abxt abxtVar, java.lang.String str, java.lang.String str2) {
        defpackage.aooh.f(abxtVar, "<this>");
        defpackage.aooh.f(str, "newImageUri");
        if (str2 == null) {
            ((defpackage.aimw) defpackage.aimz.i("com/android/dialer/patrick/impl/data/PatrickDataExtensionsKt").d().l("com/android/dialer/patrick/impl/data/PatrickDataExtensionsKt", "updateImageUriAndPhotoToken", 49, "PatrickDataExtensions.kt")).v("Photo token is null");
        }
        vqf vqfVarH = abxl.H(abxtVar.L());
        abxp abxpVar = ((defpackage.akzx) vqfVarH.a).b.c;
        if (abxpVar == null) {
            abxpVar = abxp.a;
        }
        defpackage.aooh.e(abxpVar, "getBackdrop(...)");
        vqf vqfVarK = abxl.K(abxpVar.L());
        abxp abxpVar2 = ((defpackage.akzx) vqfVarK.a).b;
        abxs abxsVar = abxpVar2.b == 1 ? (abxs) abxpVar2.c : abxs.a;
        defpackage.aooh.e(abxsVar, "getFullScreenImage(...)");
        vqf vqfVarI = abxl.I(abxsVar.L());
        vqfVarI.P(str);
        if (str2 == null) {
            str2 = "";
        }
        vqfVarI.Q(str2);
        vqfVarK.ac(vqfVarI.O());
        vqfVarH.M(vqfVarK.ab());
        return vqfVarH.L();
    }

    public static afaw P(abxt abxtVar) {
        defpackage.aooh.f(abxtVar, "<this>");
        abxp abxpVar = abxtVar.c;
        if (abxpVar == null) {
            abxpVar = abxp.a;
        }
        java.lang.String str = (abxpVar.b == 1 ? (abxs) abxpVar.c : abxs.a).f;
        defpackage.aooh.e(str, "getImageUri(...)");
        android.net.Uri uri = android.net.Uri.parse(str);
        defpackage.aooh.e(uri, "parse(...)");
        return defpackage.pez.aw(uri);
    }

    public static boolean Q(abxt abxtVar, abxt abxtVar2) {
        abxp abxpVarE;
        abxp abxpVarE2;
        abxs abxsVarG;
        if (abxtVar == null || (abxpVarE = abxl.e(abxtVar)) == null || (abxpVarE2 = abxl.e(abxtVar2)) == null || (abxsVarG = abxl.g(abxpVarE)) == null) {
            return false;
        }
        abxs abxsVar = abxpVarE2.b == 1 ? (abxs) abxpVarE2.c : abxs.a;
        if (!defpackage.aooh.m(java.lang.Float.valueOf(abxsVarG.c), abxsVar != null ? java.lang.Float.valueOf(abxsVar.c) : null)) {
            return false;
        }
        if (!defpackage.aooh.m(java.lang.Float.valueOf(abxsVarG.d), abxsVar != null ? java.lang.Float.valueOf(abxsVar.d) : null)) {
            return false;
        }
        if (!defpackage.aooh.m(java.lang.Float.valueOf(abxsVarG.e), abxsVar != null ? java.lang.Float.valueOf(abxsVar.e) : null)) {
            return false;
        }
        if (!defpackage.aooh.n(abxsVarG.g, abxsVar != null ? abxsVar.g : null)) {
            return false;
        }
        abxr abxrVar = abxtVar.d;
        if (abxrVar == null) {
            abxrVar = abxr.a;
        }
        abxr abxrVar2 = abxtVar2.d;
        if (abxrVar2 == null) {
            abxrVar2 = abxr.a;
        }
        return defpackage.aooh.n(abxrVar, abxrVar2);
    }

    public static abxt R(akmm akmmVar) {
        defpackage.aooh.f(akmmVar, "<this>");
        abxt abxtVarA = sat.a.a(akmmVar);
        defpackage.aooh.e(abxtVarA, "apply(...)");
        return abxtVarA;
    }

    public static void S(rzf rzfVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1110092947);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(rzfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.bvo.b(defpackage.azm.c(defpackage.cmw.c, 1.0f), null, defpackage.den.ak(cavVarB).F, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(1280989832, new rzg(rzfVar, 1), cavVarB), cavVarB, 122);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(rzfVar, i, 3);
        }
    }

    public static void T(defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aooh.f(aonnVar, "content");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1978457550);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.bvo.b(defpackage.azm.c(defpackage.cmw.c, 1.0f), null, defpackage.den.ak(cavVarB).F, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(-1304878131, new rzg(aonnVar, 0), cavVarB), cavVarB, 122);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(aonnVar, i, i4);
        }
    }

    public static void U(rzf rzfVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1086351876);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(rzfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarC = defpackage.azm.c(cmtVar, 1.0f);
            defpackage.cmi cmiVar = defpackage.cmh.k;
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, cmiVar, cavVarB, 48);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarC);
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
            acpg.d(rzh.a, (defpackage.cmw) null, defpackage.cfo.j(2067881749, new qxy(rzfVar, 20), cavVarB), (defpackage.aono) null, cmiVar, 0.0f, 0.0f, (defpackage.azz) null, defpackage.afsq.aQ(defpackage.den.ak(cavVarB).F, cavVarB), cavVarB, 199686, 0);
            defpackage.abrz.k(defpackage.dfa.f(2132017948, cavVarB), defpackage.den.aZ(cmtVar, 40.0f, 12.0f), 0L, 0L, null, null, 0L, new defpackage.dot(3), 0L, 0, false, 0, 0, null, defpackage.den.an(cavVarB).j, cavVarB, 48, 0, 130044);
            cavVarB = cavVarB;
            defpackage.rd.g(defpackage.wv.i(2131230963, cavVarB, 6), defpackage.dfa.f(2132017955, cavVarB), defpackage.azm.i(cmtVar, 258.0f, 334.0f), cavVarB, 384);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(rzfVar, i, 2);
        }
    }

    public static ryt V(defpackage.ccp ccpVar) {
        return (ryt) ccpVar.a();
    }

    public static void W(ryq ryqVar, sfb sfbVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1101642482);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ryqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.z(sfbVar.ordinal()) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            acpg.b((defpackage.cmw) null, defpackage.den.ak(cavVarB).F, 0L, 0.0f, (defpackage.ayy) null, (defpackage.azz) null, defpackage.cfo.j(1842544875, new bli(ryqVar, sfbVar, 4), cavVarB), cavVarB, 12582912);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(ryqVar, sfbVar, i, 14, (byte[]) null);
        }
    }

    public static void X(ryq ryqVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-397198334);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ryqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 0;
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            acpg.d(defpackage.cfo.j(-839778754, new qxy(ryqVar, 12), cavVarB), (defpackage.cmw) null, defpackage.cfo.j(-1985138405, new qxy(ryqVar, 13), cavVarB), (defpackage.aono) null, defpackage.cmh.k, 0.0f, 0.0f, (defpackage.azz) null, defpackage.afsq.aQ(defpackage.den.ak(cavVarB).F, cavVarB), cavVarB, 199686, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(ryqVar, i, i4);
        }
    }

    public static void Y(ryq ryqVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-2107204745);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ryqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            cmwVar = defpackage.cmw.c;
            defpackage.bvo.b(defpackage.azm.c(cmwVar, 1.0f), null, defpackage.den.ak(cavVarB).F, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(-418165316, new qxy(ryqVar, 14), cavVarB), cavVarB, 122);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(ryqVar, cmwVar, i, 13);
        }
    }

    public static void Z(ryq ryqVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1420084863);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ryqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if (cavVarB.H((i5 & 19) != 18, i5 & 1)) {
            cmwVar2 = defpackage.cmw.c;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            defpackage.ccp ccpVar = (defpackage.ccp) objR;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(ryqVar.f, defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState2);
                objR2 = parcelableSnapshotMutableState2;
            }
            defpackage.ccp ccpVar2 = (defpackage.ccp) objR2;
            defpackage.aaoo.K(defpackage.den.aZ(defpackage.azm.c(cmwVar2, 1.0f), 12.0f, 0.0f), defpackage.cfo.j(-1520337339, new qxy(ryqVar, 18), cavVarB), defpackage.cfo.j(-720762810, new defpackage.qyh(ryqVar, ccpVar2, 8, null), cavVarB), null, null, 0, defpackage.den.ak(cavVarB).F, 0L, null, defpackage.cfo.j(-519671536, new defpackage.jai(ryqVar, ccpVar, ccpVar2, i4), cavVarB), cavVarB, 805306800, 440);
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(ryqVar, cmwVar2, i, 12);
        }
    }

    public static java.lang.String a(android.database.Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return aguo.a(cursor, i);
    }

    public static void aA(tfj tfjVar, boolean z, defpackage.aonn aonnVar, defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aonn aonnVar2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(885555739);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(tfjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            aonnVar2 = aonnVar;
            i2 |= true != cavVarB.D(aonnVar2) ? 128 : 256;
        } else {
            aonnVar2 = aonnVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 1024 : 2048;
        }
        int i4 = i2;
        if (cavVarB.H((i4 & 1171) != 1170, i4 & 1)) {
            android.app.Activity activityAL = aL((android.content.Context) cavVarB.e(defpackage.dep.b));
            int i5 = i4 & 7168;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (i5 == 2048 || objR == defpackage.cau.a) {
                objR = new defpackage.sky(aomyVar, 6);
                cbtVar.ab(objR);
            }
            cavVar2 = cavVarB;
            defpackage.aaoo.Q(z, (defpackage.aomy) objR, null, 0L, null, null, null, 0L, 0.0f, defpackage.cfo.j(-1736925632, new defpackage.afd(tfjVar, aomyVar, aonnVar2, activityAL, 4), cavVarB), cavVar2, (i4 >> 3) & 14, 48, 2044);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppv(tfjVar, z, aonnVar, aomyVar, i, 8);
        }
    }

    public static void aB(defpackage.cmw cmwVar, tfk tfkVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aonn aonnVar2;
        abkh abkhVarCr;
        android.app.Activity activity;
        abkp abkpVar;
        defpackage.aoot aootVar;
        int i3;
        java.lang.Object ajxVar;
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-2061022677);
        if (i4 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(tfkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            aonnVar2 = aonnVar;
            i2 |= true != cavVarB.D(aonnVar2) ? 128 : 256;
        } else {
            aonnVar2 = aonnVar;
        }
        int i5 = i2;
        if (cavVarB.H((i5 & 147) != 146, i5 & 1)) {
            android.app.Activity activityAL = aL((android.content.Context) cavVarB.e(defpackage.dep.b));
            java.lang.String str = tfkVar.g;
            if (str == null || defpackage.aoov.H(str)) {
                cavVarB.u(926160207);
                abkhVarCr = defpackage.mni.cr(new lpg(tfkVar.a.c, tfkVar.c), cavVarB);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(926360901);
                ((defpackage.cbt) cavVarB).W(false);
                android.net.Uri uri = android.net.Uri.parse(str);
                defpackage.aooh.e(uri, "parse(...)");
                abkhVarCr = new abkh(uri, (abjz) null, false, 14);
            }
            java.lang.String strG = defpackage.dfa.g(2132018266, new java.lang.Object[]{tfkVar.a}, cavVarB);
            abkp abkpVar2 = new abkp(abkhVarCr, strG);
            defpackage.aoot aootVar2 = new defpackage.aoot();
            aootVar2.a = defpackage.azm.g(defpackage.cmw.c, 40.0f);
            android.net.Uri uri2 = tfkVar.h;
            if (uri2 != null) {
                cavVarB.u(926844191);
                defpackage.cmw cmwVar2 = (defpackage.cmw) aootVar2.a;
                defpackage.dib dibVar = new defpackage.dib(0);
                boolean zD = ((i5 & 896) == 256) | ((i5 & 112) == 32) | cavVarB.D(uri2) | cavVarB.D(activityAL);
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR = cbtVar.R();
                if (zD || objR == defpackage.cau.a) {
                    abkpVar = abkpVar2;
                    aootVar = aootVar2;
                    ajxVar = new ajx(aonnVar2, tfkVar, uri2, activityAL, 7, (byte[]) null);
                    activity = activityAL;
                    cbtVar.ab(ajxVar);
                } else {
                    activity = activityAL;
                    ajxVar = objR;
                    abkpVar = abkpVar2;
                    aootVar = aootVar2;
                }
                defpackage.cmw cmwVarBj = defpackage.den.bj(cmwVar2, true, null, dibVar, (defpackage.aomy) ajxVar);
                boolean zB = cavVarB.B(strG);
                java.lang.Object objR2 = cbtVar.R();
                if (zB || objR2 == defpackage.cau.a) {
                    objR2 = new skx(strG, 19);
                    cbtVar.ab(objR2);
                }
                aootVar.a = defpackage.dig.a(cmwVarBj, (defpackage.aonj) objR2);
                i3 = 0;
                cbtVar.W(false);
            } else {
                activity = activityAL;
                abkpVar = abkpVar2;
                aootVar = aootVar2;
                i3 = 0;
                cavVarB.u(927236279);
                ((defpackage.cbt) cavVarB).W(false);
            }
            long jM = defpackage.cfd.M(i3);
            int i6 = acpz.a;
            defpackage.aaoo.U(defpackage.cfo.j(1369712521, new rzg(tfkVar, 15), cavVarB), cmwVar, defpackage.cfo.j(-28566324, new rzg(tfkVar, 16), cavVarB), defpackage.cfo.j(936996493, new defpackage.qyh(abkpVar, aootVar, 19), cavVarB), defpackage.cfo.j(1902559310, new ata(tfkVar, aonnVar, activity, 18, (char[]) null), cavVarB), acpz.a(jM, cavVarB, 510), cavVarB, ((i5 << 3) & 112) | 224262, 388);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppx(cmwVar, tfkVar, aonnVar, i, 10, (byte[]) null);
        }
    }

    public static void aC(defpackage.cmw cmwVar, ten tenVar, defpackage.aono aonoVar, defpackage.aono aonoVar2, defpackage.aonj aonjVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cbt cbtVar;
        boolean z;
        byte[] bArr;
        boolean z2;
        defpackage.aooh.f(aonoVar, "collapsedView");
        defpackage.aooh.f(aonoVar2, "expandedView");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1671627254);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(tenVar) : cavVarB.D(tenVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aonoVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 8192 : 16384;
        }
        int i4 = i2;
        if (cavVarB.H((i4 & 9363) != 9362, i4 & 1)) {
            thj thjVar = (thj) cavVarB.e(tgb.a);
            java.lang.String str = tenVar.b;
            defpackage.kaw kawVar = (defpackage.kaw) cavVarB.e(defpackage.dfo.h);
            java.lang.String strF = defpackage.dfa.f(2132017190, cavVarB);
            java.lang.String strF2 = defpackage.dfa.f(2132017189, cavVarB);
            java.lang.String strF3 = defpackage.dfa.f(2132017191, cavVarB);
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar2.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.cpm(0L), defpackage.cdu.c);
                cbtVar2.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            defpackage.ccp ccpVar = (defpackage.ccp) objR;
            java.lang.Object objR2 = cbtVar2.R();
            if (objR2 == obj) {
                objR2 = new defpackage.kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar2.ab(objR2);
            }
            defpackage.kaw kawVar2 = (defpackage.kaw) objR2;
            defpackage.cmw cmwVarA = defpackage.anu.a(cmwVar, kawVar2, (defpackage.ans) cavVarB.e(defpackage.anu.a));
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.j, cavVarB, 0);
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
            defpackage.awy awyVar = defpackage.awy.a;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.aojh aojhVar = defpackage.aojh.a;
            java.lang.Object objR3 = cbtVar2.R();
            if (objR3 == obj) {
                objR3 = new bil(ccpVar, 12);
                cbtVar2.ab(objR3);
            }
            defpackage.cmw cmwVarA2 = defpackage.cvy.a(cmtVar, aojhVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR3);
            boolean z3 = tenVar.d;
            if (true != z3) {
                strF2 = strF;
            }
            java.lang.String str2 = aonjVar != null ? strF3 : null;
            defpackage.dib dibVar = new defpackage.dib(0);
            boolean zD = ((57344 & i4) == 16384) | cavVarB.D(kawVar);
            java.lang.Object objR4 = cbtVar2.R();
            if (zD || objR4 == obj) {
                cbtVar = cbtVar2;
                z = z3;
                bArr = null;
                z2 = true;
                obp obpVar = new obp(aonjVar, kawVar, ccpVar, 13, (byte[]) null);
                cbtVar.ab(obpVar);
                objR4 = obpVar;
            } else {
                z = z3;
                cbtVar = cbtVar2;
                bArr = null;
                z2 = true;
            }
            defpackage.aomy aomyVar2 = (defpackage.aomy) objR4;
            boolean zD2 = cavVarB.D(thjVar) | cavVarB.B(r22);
            java.lang.Object objR5 = cbtVar.R();
            if (zD2 || objR5 == obj) {
                objR5 = new qza(thjVar, str, 18, bArr);
                cbtVar.ab(objR5);
            }
            aonoVar.a(cmwVarA2.a(new ana(kawVar2, false, strF2, dibVar, (defpackage.aomy) objR5, str2, aomyVar2)), cavVarB, java.lang.Integer.valueOf((i4 >> 3) & 112));
            defpackage.abni abniVar = defpackage.abts.H(cavVarB).a;
            defpackage.alm almVarBv = defpackage.den.bv(300, 0, defpackage.abts.H(cavVarB).b.a, 2);
            defpackage.cmn cmnVar = defpackage.cmh.m;
            defpackage.agf agfVarI = defpackage.aga.i(almVarBv, cmnVar, 8);
            defpackage.abni abniVar2 = defpackage.abts.H(cavVarB).a;
            defpackage.den.bE(awyVar, z, null, agfVarI, defpackage.aga.m(defpackage.den.bv(300, 0, defpackage.abts.H(cavVarB).b.a, 2), cmnVar, 8), null, defpackage.cfo.j(-1495227928, new defpackage.ped(aonoVar2, 9), cavVarB), cavVarB, 1572870);
            cbtVar.W(z2);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new alh(cmwVar, tenVar, aonoVar, aonoVar2, aonjVar, i, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0264  */
    /* JADX WARN: Code duplicated, block: B:70:0x0268  */
    /* JADX WARN: Code duplicated, block: B:75:0x0298  */
    public static void aD(defpackage.cmw cmwVar, ten tenVar, tfn tfnVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        defpackage.cmw cmwVar2;
        defpackage.cav cavVar2;
        defpackage.aonn aonnVar2;
        defpackage.cmw cmwVar3;
        defpackage.aonn aonnVarCg;
        long j;
        java.lang.Object obj;
        defpackage.ccp ccpVar;
        boolean zB;
        java.lang.Object objR;
        tfn tfnVar2 = tfnVar;
        defpackage.cav cavVarB = cavVar.b(-1004070427);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(tenVar) : cavVarB.D(tenVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(tfnVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                cmwVar3 = defpackage.cmw.c;
                aonnVarCg = aF((android.content.Context) cavVarB.e(defpackage.dep.b)).cg();
            } else {
                cavVarB.s();
                cmwVar3 = cmwVar;
                aonnVarCg = aonnVar;
            }
            cavVarB.l();
            if (defpackage.den.bg(cavVarB)) {
                cavVarB.u(2105191092);
                j = defpackage.den.ak(cavVarB).G;
                cbtVar.W(false);
            } else {
                cavVarB.u(2105142081);
                j = defpackage.den.ak(cavVarB).p;
                cbtVar.W(false);
            }
            boolean z = tenVar.e;
            boolean z2 = tenVar.f;
            boolean zC = cavVarB.C(z) | cavVarB.C(z2);
            java.lang.Object objR2 = cbtVar.R();
            if (zC || objR2 == defpackage.cau.a) {
                objR2 = aM(z, z2);
                cbtVar.ab(objR2);
            }
            defpackage.bgc bgcVar = (defpackage.bgc) objR2;
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object objR3 = cbtVar.R();
            java.lang.Object obj2 = defpackage.cau.a;
            int i3 = 20;
            if (objR3 == obj2) {
                objR3 = new defpackage.jaf(i3);
                cbtVar.ab(objR3);
            }
            defpackage.ccp ccpVar2 = (defpackage.ccp) defpackage.cfd.m(objArr, (defpackage.aomy) objR3, cavVarB, 48);
            java.lang.Object objR4 = cbtVar.R();
            if (objR4 == obj2) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.cpm(0L), defpackage.cdu.c);
                cbtVar = cbtVar;
                cbtVar.ab(parcelableSnapshotMutableState);
                objR4 = parcelableSnapshotMutableState;
            }
            defpackage.ccp ccpVar3 = (defpackage.ccp) objR4;
            java.lang.Object objR5 = cbtVar.R();
            if (objR5 == obj2) {
                objR5 = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
                cbtVar.ab(objR5);
            }
            defpackage.cei ceiVar = (defpackage.cei) objR5;
            defpackage.cmw cmwVarD = defpackage.azm.d(cmwVar3, 1.0f);
            java.lang.Object objR6 = cbtVar.R();
            if (objR6 == obj2) {
                objR6 = new skx(ceiVar, 20);
                cbtVar.ab(objR6);
            }
            defpackage.cmw cmwVarG = defpackage.wi.g(cmwVarD, (defpackage.aonj) objR6);
            defpackage.cmj cmjVar = defpackage.cmh.a;
            defpackage.cye cyeVarB = defpackage.awo.b(cmjVar, false);
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarG);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.aonn aonnVar3 = defpackage.dam.e;
            defpackage.cev.c(cavVarB, cyeVarB, aonnVar3);
            defpackage.aonn aonnVar4 = defpackage.dam.d;
            defpackage.cev.c(cavVarB, cjeVarAi, aonnVar4);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            defpackage.aonn aonnVar5 = defpackage.dam.f;
            defpackage.cev.c(cavVarB, numValueOf, aonnVar5);
            defpackage.aonj aonjVar = defpackage.dam.g;
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.aonn aonnVar6 = defpackage.dam.c;
            defpackage.cev.c(cavVarB, cmwVarM, aonnVar6);
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVar4 = cmwVar3;
            defpackage.cmw cmwVarBn = defpackage.den.bn(defpackage.cfd.K(defpackage.den.aZ(defpackage.azm.d(cmtVar, 1.0f), 12.0f, 0.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, bgcVar, true, 0, 1042431), j, bgcVar);
            defpackage.cja cjaVarJ = defpackage.cfo.j(-1346160841, new bli(tfnVar2, aonnVarCg, 6), cavVarB);
            defpackage.cja cjaVarJ2 = defpackage.cfo.j(-72962240, new bli(tfnVar2, aonnVarCg, 7), cavVarB);
            boolean zB2 = cavVarB.B(ccpVar2);
            java.lang.Object objR7 = cbtVar.R();
            if (zB2) {
                obj = obj2;
            } else {
                obj = obj2;
                if (objR7 != obj) {
                    ccpVar = ccpVar3;
                }
                java.lang.Object obj3 = obj;
                defpackage.ccp ccpVar4 = ccpVar;
                aC(cmwVarBn, tenVar, cjaVarJ, cjaVarJ2, (defpackage.aonj) objR7, cavVarB, (i2 & 112) | 3456);
                defpackage.dpf dpfVar = (defpackage.dpf) cavVarB.e(defpackage.dfo.e);
                defpackage.cmw cmwVarBa = defpackage.den.ba(cmtVar, dpfVar.di(java.lang.Float.intBitsToFloat((int) (aK(ccpVar4) >> 32))), dpfVar.di(java.lang.Float.intBitsToFloat((int) (aK(ccpVar4) & 4294967295L))), 0.0f, 0.0f);
                defpackage.cye cyeVarB2 = defpackage.awo.b(cmjVar, false);
                int iM2 = defpackage.anty.M(cbtVar.x);
                defpackage.cje cjeVarAi2 = cbtVar.ai();
                defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarBa);
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar);
                } else {
                    cavVarB.x();
                }
                defpackage.cev.c(cavVarB, cyeVarB2, aonnVar3);
                defpackage.cev.c(cavVarB, cjeVarAi2, aonnVar4);
                defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar5);
                defpackage.cev.b(cavVarB, aonjVar);
                defpackage.cev.c(cavVarB, cmwVarM2, aonnVar6);
                tfnVar2 = tfnVar;
                tfj tfjVar = tfnVar2.a.f;
                boolean zC2 = defpackage.a.C(ccpVar2);
                zB = cavVarB.B(ccpVar2);
                objR = cbtVar.R();
                if (zB || objR == obj3) {
                    objR = new defpackage.sky(ccpVar2, 5);
                    cbtVar.ab(objR);
                }
                defpackage.aonn aonnVar7 = aonnVarCg;
                aA(tfjVar, zC2, aonnVar7, (defpackage.aomy) objR, cavVarB, 0);
                cbtVar.W(true);
                cbtVar.W(true);
                cavVar2 = cavVarB;
                cmwVar2 = cmwVar4;
                aonnVar2 = aonnVar7;
            }
            ccpVar = ccpVar3;
            objR7 = new slv(ccpVar, ccpVar2, 3, (byte[]) null);
            cbtVar.ab(objR7);
            java.lang.Object obj4 = obj;
            defpackage.ccp ccpVar5 = ccpVar;
            aC(cmwVarBn, tenVar, cjaVarJ, cjaVarJ2, (defpackage.aonj) objR7, cavVarB, (i2 & 112) | 3456);
            defpackage.dpf dpfVar2 = (defpackage.dpf) cavVarB.e(defpackage.dfo.e);
            defpackage.cmw cmwVarBa2 = defpackage.den.ba(cmtVar, dpfVar2.di(java.lang.Float.intBitsToFloat((int) (aK(ccpVar5) >> 32))), dpfVar2.di(java.lang.Float.intBitsToFloat((int) (aK(ccpVar5) & 4294967295L))), 0.0f, 0.0f);
            defpackage.cye cyeVarB3 = defpackage.awo.b(cmjVar, false);
            int iM3 = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi3 = cbtVar.ai();
            defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVarB, cmwVarBa2);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB3, aonnVar3);
            defpackage.cev.c(cavVarB, cjeVarAi3, aonnVar4);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM3), aonnVar5);
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.cev.c(cavVarB, cmwVarM3, aonnVar6);
            tfnVar2 = tfnVar;
            tfj tfjVar2 = tfnVar2.a.f;
            boolean zC3 = defpackage.a.C(ccpVar2);
            zB = cavVarB.B(ccpVar2);
            objR = cbtVar.R();
            if (zB) {
                objR = new defpackage.sky(ccpVar2, 5);
                cbtVar.ab(objR);
            } else {
                objR = new defpackage.sky(ccpVar2, 5);
                cbtVar.ab(objR);
            }
            defpackage.aonn aonnVar8 = aonnVarCg;
            aA(tfjVar2, zC3, aonnVar8, (defpackage.aomy) objR, cavVarB, 0);
            cbtVar.W(true);
            cbtVar.W(true);
            cavVar2 = cavVarB;
            cmwVar2 = cmwVar4;
            aonnVar2 = aonnVar8;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
            cavVar2 = cavVarB;
            aonnVar2 = aonnVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new biu(cmwVar2, tenVar, tfnVar2, aonnVar2, i, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r7v4, types: [cbt] */
    public static void aE(tfi tfiVar, defpackage.bgc bgcVar, defpackage.cmw cmwVar, defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.bgc bgcVar2;
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        long jH;
        ?? r10;
        tfi tfiVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1706572995);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(tfiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(bgcVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != cavVarB.D(aomyVar) ? 1024 : 2048;
        }
        if (cavVarB.H((i4 & 1171) != 1170, i4 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            java.lang.Boolean bool = (java.lang.Boolean) aF((android.content.Context) cavVarB.e(defpackage.dep.b)).hP().a();
            boolean z = tfiVar.e;
            if (z) {
                cavVarB.u(-987921100);
                jH = defpackage.den.ak(cavVarB).q;
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(-987865951);
                jH = defpackage.cqg.h(defpackage.den.ak(cavVarB).q, 0.2f);
                ((defpackage.cbt) cavVarB).W(false);
            }
            long j = jH;
            java.lang.String strF = defpackage.dfa.f(tfiVar.b, cavVarB);
            int i5 = tfiVar.a;
            java.lang.String strF2 = defpackage.dfa.f(i5, cavVarB);
            bgcVar2 = bgcVar;
            defpackage.cmw cmwVarBn = defpackage.den.bn(defpackage.cfd.K(defpackage.den.aZ(defpackage.azm.d(cmtVar, 1.0f), 16.0f, 0.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, bgcVar, true, 0, 1042431), defpackage.den.ak(cavVarB).F, bgcVar2);
            if (z) {
                r10 = 1;
                cmwVarBn = defpackage.den.bj(cmwVarBn, true, null, new defpackage.dib(0), aomyVar);
            } else {
                r10 = 1;
            }
            defpackage.cmw cmwVarM = defpackage.azm.m(defpackage.den.aZ(cmwVarBn, 12.0f, 0.0f), 0.0f, 50.0f, r10);
            ?? r2 = (cavVarB.B(strF) ? 1 : 0) | (cavVarB.B(strF2) ? 1 : 0) | (cavVarB.B(bool) ? 1 : 0);
            ?? r0 = (i4 & 14) == 4 ? r10 : 0;
            ?? r7 = (defpackage.cbt) cavVarB;
            java.lang.Object objR = r7.R();
            if (((r2 == true ? 1 : 0) | r0) != 0 || objR == defpackage.cau.a) {
                defpackage.tfm tfmVar = new defpackage.tfm(strF, strF2, bool, tfiVar, 0);
                tfiVar2 = tfiVar;
                r7.ab(tfmVar);
                objR = tfmVar;
            } else {
                tfiVar2 = tfiVar;
            }
            defpackage.cmw cmwVarA = defpackage.dig.a(cmwVarM, (defpackage.aonj) objR);
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.a, defpackage.cmh.n, cavVarB, 48);
            int iM = defpackage.anty.M(r7.x);
            defpackage.cje cjeVarAi = r7.ai();
            defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarA);
            defpackage.aomy aomyVar2 = defpackage.dam.a;
            cavVarB.v();
            if (r7.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM2, defpackage.dam.c);
            cavVar2 = cavVarB;
            defpackage.aaoo.V(defpackage.wv.k(tfiVar2.c, cavVarB, 0), null, defpackage.azm.g(cmtVar, 24.0f), j, cavVar2, 392, 0);
            defpackage.den.aR(defpackage.azm.k(cmtVar, 12.0f), cavVar2);
            defpackage.abrz.k(defpackage.dfa.f(i5, cavVar2), null, j, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, defpackage.den.an(cavVar2).j, cavVar2, 0, 24960, 110586);
            r7.W(r10);
            cmwVar2 = cmtVar;
        } else {
            bgcVar2 = bgcVar;
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abns(tfiVar, bgcVar2, cmwVar2, aomyVar, i, 1);
        }
    }

    public static defpackage.tfl aF(android.content.Context context) {
        defpackage.aooh.f(context, "context");
        return (defpackage.tfl) defpackage.agab.aH(context, defpackage.tfl.class);
    }

    public static void aG(j$.util.Optional optional) {
        defpackage.aooh.f(optional, "<this>");
        optional.ifPresentOrElse(new oxs(new skk(15), 14), new fvl(8));
    }

    public static /* synthetic */ java.lang.String aH(int i) {
        return i != 1 ? "DIALPAD_SEARCH" : "REGULAR_SEARCH";
    }

    public static defpackage.aenj aI(tev tevVar) {
        return defpackage.aenj.a(new defpackage.aenj("SearchSection."), tevVar.a());
    }

    public static teo aJ(teu teuVar) {
        return teuVar.b().a;
    }

    private static long aK(defpackage.ccp ccpVar) {
        return ((defpackage.cpm) ccpVar.a()).a;
    }

    private static android.app.Activity aL(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
            defpackage.aooh.e(context, "getBaseContext(...)");
        }
        throw new java.lang.IllegalStateException("Context is not an Activity context!");
    }

    private static defpackage.bgc aM(boolean z, boolean z2) {
        float f = true != z2 ? 4.0f : 16.0f;
        float f2 = true == z ? 16.0f : 4.0f;
        return defpackage.bge.c(f2, f2, f, f);
    }

    public static ryi aa(abxt abxtVar) {
        defpackage.aooh.f(abxtVar, "patrickData");
        ryi ryiVar = new ryi();
        defpackage.amxr.g(ryiVar);
        defpackage.ahgl.b(ryiVar, abxtVar);
        return ryiVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void ab(al alVar, rxo rxoVar) throws afeb {
        defpackage.ahvr.d(alVar, ahtf.class, new rrj(rxoVar, 2));
    }

    public static defpackage.rxd ac(android.content.Context context) {
        return (defpackage.rxd) defpackage.agab.aH(context, defpackage.rxd.class);
    }

    public static java.lang.String ad(long j) {
        return defpackage.a.bz(j, "MissedCall_");
    }

    public static void ae(android.content.Context context, dva dvaVar, java.lang.CharSequence charSequence, android.net.Uri uri, android.graphics.Bitmap bitmap, java.lang.CharSequence charSequence2, long j) {
        android.net.Uri uri2;
        java.lang.String strConcat;
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(dvaVar, "notificationBuilder");
        defpackage.aooh.f(charSequence, "contactName");
        dvaVar.r = "missed_call";
        if (uri == null) {
            java.util.Objects.toString(charSequence);
            uri2 = android.net.Uri.parse("tel://".concat(java.lang.String.valueOf(charSequence)));
            defpackage.aooh.e(uri2, "parse(...)");
        } else {
            uri2 = uri;
        }
        dvu dvuVar = new dvu();
        dvuVar.a = charSequence;
        if (uri2 != null) {
            dvuVar.c = uri2.toString();
        }
        if (bitmap != null) {
            dvuVar.b = androidx.core.graphics.drawable.IconCompat.f(bitmap);
        }
        dvv dvvVar = new dvv(dvuVar);
        dvj dvjVar = new dvj(dvvVar);
        dvjVar.d(charSequence2, j, dvvVar);
        dvaVar.o(dvjVar);
        if (uri == null || (strConcat = uri.toString()) == null) {
            java.util.Objects.toString(charSequence);
            strConcat = "tel://".concat(java.lang.String.valueOf(charSequence));
        }
        dvaVar.x = strConcat;
        aaj aajVar = new aaj();
        aajVar.e = context;
        aajVar.d = strConcat;
        dvm.f(charSequence, aajVar);
        dvm.h(dvvVar, aajVar);
        androidx.core.graphics.drawable.IconCompat iconCompat = dvvVar.b;
        if (iconCompat != null) {
            dvm.d(iconCompat, aajVar);
        }
        if (uri == null) {
            java.util.Objects.toString(charSequence);
            uri = android.net.Uri.parse("tel://".concat(java.lang.String.valueOf(charSequence)));
            defpackage.aooh.e(uri, "parse(...)");
        }
        dvm.g(new android.content.Intent("android.intent.action.VIEW", uri), aajVar);
        dvm.c(defpackage.ajsz.aF("android.shortcut.conversation"), aajVar);
        dvm.e(aajVar);
        aaj aajVarB = dvm.b(aajVar);
        dwb.d(context, aajVarB);
        dvaVar.t(aajVarB);
    }

    public static void af(android.content.Context context, android.app.Notification notification) {
        java.lang.String strM;
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(notification, "notification");
        if (!((java.lang.Boolean) ((defpackage.rwe) defpackage.agab.aH(context, defpackage.rwe.class)).m3if().a()).booleanValue() || (strM = rs$.ExternalSyntheticApiModelOutline0.m(notification)) == null) {
            return;
        }
        java.util.List listAY = defpackage.ajsz.aY(strM);
        int i = dwb.a;
        hq$.ExternalSyntheticApiModelOutline1.m(hq$.ExternalSyntheticApiModelOutline1.m(context.getSystemService(hq$.ExternalSyntheticApiModelOutline1.m())), listAY);
        dwb.c(context);
        java.util.Iterator it = dwb.a(context).iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public static defpackage.tkc ag(android.content.Context context) {
        return (defpackage.tkc) defpackage.agab.aH(context, defpackage.tkc.class);
    }

    public static tjj ah() {
        defpackage.aeus aeusVar = new defpackage.aeus(null, null);
        aeusVar.h(2132017295);
        aeusVar.g(2131231981);
        return aeusVar.e();
    }

    public static tjj ai() {
        defpackage.aeus aeusVar = new defpackage.aeus(null, null);
        aeusVar.h(2132019685);
        aeusVar.g(2131231960);
        return aeusVar.e();
    }

    public static tjj aj() {
        defpackage.aeus aeusVar = new defpackage.aeus(null, null);
        aeusVar.h(2132019992);
        aeusVar.g(2131232047);
        return aeusVar.e();
    }

    public static tjj ak(defpackage.wgi wgiVar, boolean z) {
        defpackage.aeus aeusVar = new defpackage.aeus(null, null);
        aeusVar.h(2132020792);
        if (z && wgiVar.d) {
            aeusVar.g(2131231081);
            aeusVar.f(2132020793);
        } else {
            aeusVar.g(2131231080);
        }
        return aeusVar.e();
    }

    public static tjj al(defpackage.wgi wgiVar) {
        defpackage.aeus aeusVar = new defpackage.aeus(null, null);
        aeusVar.h(2132020827);
        if (wgiVar.c) {
            aeusVar.g(2131231083);
            aeusVar.f(2132020828);
        } else {
            aeusVar.g(2131231060);
        }
        return aeusVar.e();
    }

    public static tjj am() {
        defpackage.aeus aeusVar = new defpackage.aeus(null, null);
        aeusVar.h(2132020554);
        aeusVar.g(2131231435);
        return aeusVar.e();
    }

    public static long an(android.view.View view) {
        return defpackage.wsc.bp(view.getContext(), urp.f);
    }

    public static int ao(android.view.View view) {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view.getRootView().getWidth(), 1073741824), 0);
        return view.getMeasuredHeight();
    }

    public static float ap(android.view.View view) {
        return view.getContext().getResources().getDimensionPixelSize(2131167359);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    public static defpackage.kiu aq(defpackage.kiv kivVar, java.lang.String str, defpackage.sso ssoVar) {
        hkd hkdVar;
        java.lang.String str2;
        hkd hkdVar2;
        hkd hkdVar3;
        boolean zEquals;
        akgu akguVarI;
        defpackage.aca acaVar = new defpackage.aca();
        int i = 0;
        while (true) {
            akgu akguVarI2 = null;
            if (i >= kivVar.b.size()) {
                return null;
            }
            defpackage.kiu kiuVar = (defpackage.kiu) kivVar.b.get(i);
            if ((kiuVar.b & 524288) == 0) {
                hkdVar = kiuVar.f;
                if (hkdVar == null) {
                    hkdVar = hkd.a;
                }
                str2 = hkdVar.d;
                if (acaVar.containsKey(str2)) {
                    hkdVar2 = (hkd) acaVar.get(str2);
                } else {
                    hkd hkdVarA = ssoVar.a(str, str2);
                    acaVar.put(str2, hkdVarA);
                    hkdVar2 = hkdVarA;
                }
                hkdVar3 = kiuVar.f;
                if (hkdVar3 == null) {
                    hkdVar3 = hkd.a;
                }
                defpackage.gus.aJ();
                if (!hkdVar2.c.isEmpty() && !hkdVar3.c.isEmpty() && defpackage.sso.b(hkdVar2).equals(defpackage.sso.b(hkdVar3))) {
                    if (!hkdVar2.equals(hkdVar3)) {
                        if (defpackage.sso.e(hkdVar2.c) || defpackage.sso.e(hkdVar3.c)) {
                            zEquals = hkdVar2.c.equals(hkdVar3.c);
                        } else {
                            akfx akfxVarAI = sns.b(ssoVar.a).tb().aI();
                            try {
                                akguVarI = akfxVarAI.i(hkdVar2.c, defpackage.akfg.b(hkdVar2.d));
                            } catch (defpackage.akfp unused) {
                                akguVarI = null;
                            }
                            try {
                                akguVarI2 = akfxVarAI.i(hkdVar3.c, defpackage.akfg.b(hkdVar3.d));
                            } catch (defpackage.akfp unused2) {
                            }
                            if (akguVarI == null || akguVarI2 == null) {
                                zEquals = hkdVar2.c.equals(hkdVar3.c);
                            } else {
                                akfy akfyVarAJ = sns.b(ssoVar.a).tb().aJ();
                                if (akfyVarAJ.a(akguVarI) || akfyVarAJ.a(akguVarI2)) {
                                    zEquals = hkdVar2.c.equals(hkdVar3.c);
                                } else if (hkdVar2.f.equals(hkdVar3.f)) {
                                    int iT = akfxVarAI.t(akguVarI, akguVarI2);
                                    zEquals = true;
                                    if (iT != 3 && iT != 4 && iT != 5) {
                                        zEquals = false;
                                    }
                                } else {
                                    zEquals = false;
                                }
                            }
                        }
                        if (zEquals) {
                        }
                    }
                    return kiuVar;
                }
            } else {
                ucu ucuVar = kiuVar.w;
                if (ucuVar == null) {
                    ucuVar = ucu.a;
                }
                if (defpackage.wsc.bU(ucuVar)) {
                    continue;
                } else {
                    hkdVar = kiuVar.f;
                    if (hkdVar == null) {
                        hkdVar = hkd.a;
                    }
                    str2 = hkdVar.d;
                    if (acaVar.containsKey(str2)) {
                        hkdVar2 = (hkd) acaVar.get(str2);
                    } else {
                        hkd hkdVarA2 = ssoVar.a(str, str2);
                        acaVar.put(str2, hkdVarA2);
                        hkdVar2 = hkdVarA2;
                    }
                    hkdVar3 = kiuVar.f;
                    if (hkdVar3 == null) {
                        hkdVar3 = hkd.a;
                    }
                    defpackage.gus.aJ();
                    if (!hkdVar2.c.isEmpty()) {
                        continue;
                    }
                }
            }
            i++;
        }
    }

    public static defpackage.aify ar(java.util.List list, java.util.List list2, lvp lvpVar) {
        defpackage.aca acaVar = new defpackage.aca();
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            uqi uqiVar = (uqi) it.next();
            acaVar.put(uqiVar.a, java.lang.Double.valueOf(uqiVar.b));
        }
        defpackage.aca acaVar2 = new defpackage.aca();
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            tin tinVar = (tin) it2.next();
            j$.util.Optional optional = tinVar.e;
            if (optional.isPresent() && acaVar.containsKey((java.lang.String) optional.orElseThrow())) {
                acaVar2.put(tinVar, j$.util.Optional.of((java.lang.Double) acaVar.get((java.lang.String) optional.orElseThrow())));
            } else {
                acaVar2.put(tinVar, j$.util.Optional.empty());
            }
        }
        defpackage.aigf aigfVarI = defpackage.aigf.i(acaVar2);
        java.util.Comparator comparatorComparing = j$.util.Comparator.-CC.comparing(new pei(lvpVar, 19), j$.util.Comparator.-CC.nullsLast(java.lang.String.CASE_INSENSITIVE_ORDER));
        java.util.Map map = (java.util.Map) j$.util.Collection.-EL.stream(aigfVarI.keySet()).collect(j$.util.stream.Collectors.partitioningBy(new sqj(5)));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.List list3 = (java.util.List) map.get(bool);
        j$.util.List.-EL.sort(list3, comparatorComparing);
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        java.util.Map map2 = (java.util.Map) j$.util.Collection.-EL.stream((java.util.List) map.get(bool2)).collect(j$.util.stream.Collectors.partitioningBy(new ree(aigfVarI, 5)));
        java.util.List list4 = (java.util.List) map2.get(bool);
        j$.util.List.-EL.sort(list4, j$.util.Comparator.-EL.reversed(j$.util.Comparator.-CC.comparing(new pei(aigfVarI, 20))));
        java.util.Map map3 = (java.util.Map) j$.util.Collection.-EL.stream((java.util.List) map2.get(bool2)).collect(j$.util.stream.Collectors.partitioningBy(new sqj(6)));
        java.util.List list5 = (java.util.List) map3.get(bool);
        j$.util.List.-EL.sort(list5, comparatorComparing);
        java.util.List list6 = (java.util.List) map3.get(bool2);
        j$.util.List.-EL.sort(list6, comparatorComparing);
        defpackage.aift aiftVar = new defpackage.aift(4);
        aiftVar.k(list3);
        aiftVar.k(list4);
        aiftVar.k(list5);
        aiftVar.k(list6);
        return aiftVar.g();
    }

    public static boolean as(tin tinVar) {
        return !tinVar.o.isPresent();
    }

    public static java.lang.String at(tgy tgyVar, long j) {
        return av(tgyVar, java.lang.Long.valueOf(j));
    }

    public static java.lang.String au(tgy tgyVar, java.lang.String str) {
        defpackage.aooh.f(str, "localId");
        return av(tgyVar, str);
    }

    public static java.lang.String av(tgy tgyVar, java.lang.Object obj) {
        defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
        return new defpackage.aooa(tgyVar.getClass()).b() + ':' + obj;
    }

    public static defpackage.aoxh aw(defpackage.aoxh aoxhVar) {
        return defpackage.aoxo.a(new defpackage.edg(aoxhVar, 7));
    }

    public static /* synthetic */ rze ax(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new rze(akzxVar);
    }

    public static tgc ay() {
        tgc tgcVar = new tgc();
        defpackage.amxr.g(tgcVar);
        return tgcVar;
    }

    public static void az(afe afeVar, java.util.List list, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        android.app.Activity activity;
        defpackage.cbt cbtVar;
        tfi tfiVar;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-25100239);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(afeVar) : cavVarB.D(afeVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 16 : 32;
        }
        defpackage.aonn aonnVar2 = aonnVar;
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonnVar2) ? 128 : 256;
        }
        boolean z = false;
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            android.app.Activity activityAL = aL((android.content.Context) cavVarB.e(defpackage.dep.b));
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cbd cbdVar = defpackage.dfo.e;
            defpackage.dpf dpfVar = (defpackage.dpf) cavVarB.e(cbdVar);
            boolean zB = cavVarB.B(dpfVar);
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar2.R();
            if (zB || objR == defpackage.cau.a) {
                objR = java.lang.Integer.valueOf(dpfVar.dp(-20.0f));
                cbtVar2.ab(objR);
            }
            int iIntValue = ((java.lang.Number) objR).intValue();
            defpackage.abni abniVar = defpackage.abts.H(cavVarB).a;
            defpackage.alm almVarBv = defpackage.den.bv(300, 0, defpackage.abts.H(cavVarB).b.e, 2);
            boolean z2 = cavVarB.z(iIntValue);
            java.lang.Object objR2 = cbtVar2.R();
            if (z2 || objR2 == defpackage.cau.a) {
                objR2 = new cos(iIntValue, 10);
                cbtVar2.ab(objR2);
            }
            defpackage.agf agfVarD = defpackage.aga.d(almVarBv, (defpackage.aonj) objR2);
            defpackage.abni abniVar2 = defpackage.abts.H(cavVarB).a;
            defpackage.agf agfVarA = agfVarD.a(defpackage.aga.n(defpackage.den.bv(100, 0, defpackage.abts.H(cavVarB).b.c, 2), 2));
            defpackage.dpf dpfVar2 = (defpackage.dpf) cavVarB.e(cbdVar);
            boolean zB2 = cavVarB.B(dpfVar2);
            java.lang.Object objR3 = cbtVar2.R();
            if (zB2 || objR3 == defpackage.cau.a) {
                objR3 = java.lang.Integer.valueOf(dpfVar2.dp(-20.0f));
                cbtVar2.ab(objR3);
            }
            int iIntValue2 = ((java.lang.Number) objR3).intValue();
            defpackage.abni abniVar3 = defpackage.abts.H(cavVarB).a;
            defpackage.alm almVarBv2 = defpackage.den.bv(300, 0, defpackage.abts.H(cavVarB).b.e, 2);
            boolean z3 = cavVarB.z(iIntValue2);
            java.lang.Object objR4 = cbtVar2.R();
            if (z3 || objR4 == defpackage.cau.a) {
                objR4 = new cos(iIntValue2, 11);
                cbtVar2.ab(objR4);
            }
            defpackage.agg aggVarG = defpackage.aga.g(almVarBv2, (defpackage.aonj) objR4);
            defpackage.abni abniVar4 = defpackage.abts.H(cavVarB).a;
            defpackage.cmw cmwVarBa = defpackage.den.ba(afeVar.b(cmtVar, agfVarA, aggVarG.a(defpackage.aga.o(defpackage.den.bv(100, 0, defpackage.abts.H(cavVarB).b.c, 2), 2))), 0.0f, 0.0f, 0.0f, 16.0f);
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.f(2.0f), defpackage.cmh.j, cavVarB, 6);
            int iM = defpackage.anty.M(cbtVar2.x);
            defpackage.cje cjeVarAi = cbtVar2.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarBa);
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
            cavVarB.u(389358776);
            java.util.Iterator it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                int i5 = i4 + 1;
                tfi tfiVar2 = (tfi) it.next();
                boolean z4 = i4 == 0 ? true : z;
                boolean z5 = i4 == defpackage.ajsz.aZ(list) ? true : z;
                boolean z6 = (i2 & 896) == 256 ? true : z;
                defpackage.bgc bgcVarAM = aM(z4, z5);
                boolean zB3 = z6 | cavVarB.B(tfiVar2) | cavVarB.D(activityAL);
                java.lang.Object objR5 = cbtVar2.R();
                if (zB3 || objR5 == defpackage.cau.a) {
                    activity = activityAL;
                    cbtVar = cbtVar2;
                    tfiVar = tfiVar2;
                    obp obpVar = new obp(aonnVar2, tfiVar, activity, 15, (byte[]) null);
                    cbtVar.ab(obpVar);
                    objR5 = obpVar;
                } else {
                    activity = activityAL;
                    cbtVar = cbtVar2;
                    tfiVar = tfiVar2;
                }
                aE(tfiVar, bgcVarAM, null, (defpackage.aomy) objR5, cavVarB, 0);
                aonnVar2 = aonnVar;
                i4 = i5;
                cbtVar2 = cbtVar;
                z = z;
                activityAL = activity;
            }
            defpackage.cbt cbtVar3 = cbtVar2;
            cbtVar3.W(z);
            cbtVar3.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppx(afeVar, list, aonnVar, i, 11, (byte[]) null);
        }
    }

    public static void b(defpackage.cmw cmwVar, smq smqVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(392399909);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(smqVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.cmw cmwVarX = defpackage.den.x(defpackage.azm.d(defpackage.den.aZ(bac.b(cmwVar), 16.0f, 12.0f), 1.0f), "onboarding_flow_top_bar");
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = new skk(9);
                cbtVar.ab(objR);
            }
            defpackage.cmw cmwVarB = defpackage.dig.b(cmwVarX, false, (defpackage.aonj) objR);
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.g, defpackage.cmh.m, cavVarB, 6);
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
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarX2 = defpackage.den.x(cmtVar, "onboarding_flow_back_button");
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new skk(10);
                cbtVar.ab(objR2);
            }
            e(smqVar.a, defpackage.dig.b(cmwVarX2, false, (defpackage.aonj) objR2), cavVarB, 0);
            defpackage.cmw cmwVarX3 = defpackage.den.x(cmtVar, "onboarding_flow_confirm_button");
            java.lang.Object objR3 = cbtVar.R();
            if (objR3 == obj) {
                objR3 = new skk(11);
                cbtVar.ab(objR3);
            }
            e(smqVar.b, defpackage.dig.b(cmwVarX3, false, (defpackage.aonj) objR3), cavVarB, 0);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.slz(cmwVar, smqVar, i, 4, null);
        }
    }

    public static void c(skf skfVar, smu smuVar, defpackage.aomy aomyVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        java.lang.String strF;
        defpackage.aomy aomyVar2;
        boolean z;
        defpackage.aooh.f(smuVar, "callbacks");
        defpackage.aooh.f(aomyVar, "onSave");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1044447967);
        boolean zG = true;
        if (i3 == 0) {
            i2 = (true != cavVarB.B(skfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(smuVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            int i4 = skfVar.a;
            smm smmVar = null;
            if (i4 > 0 || skfVar.c) {
                cavVarB.u(-1229273790);
                ((defpackage.cbt) cavVarB).W(false);
                strF = null;
            } else {
                cavVarB.u(-1229244030);
                strF = defpackage.dfa.f(2132019733, cavVarB);
                ((defpackage.cbt) cavVarB).W(false);
            }
            boolean zB = cavVarB.B(skfVar) | cavVarB.B(smuVar);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == defpackage.cau.a) {
                objR = new qza(skfVar, smuVar, 16, (byte[]) null);
                cbtVar.ab(objR);
            }
            smm smmVar2 = new smm((defpackage.aomy) objR, true, smn.a, strF);
            cavVarB.u(-936215897);
            if (skfVar.c) {
                cavVarB.u(710043902);
                z = false;
                cbtVar.W(false);
            } else {
                int i5 = 2132019738;
                int i6 = 2132019739;
                if (i4 <= 0) {
                    cavVarB.u(710125711);
                    boolean zB2 = cavVarB.B(smuVar) | cavVarB.B(skfVar);
                    java.lang.Object objR2 = cbtVar.R();
                    if (zB2 || objR2 == defpackage.cau.a) {
                        objR2 = new qza(smuVar, skfVar, 17);
                        cbtVar.ab(objR2);
                    }
                    aomyVar2 = (defpackage.aomy) objR2;
                    zG = g(skfVar.b);
                    cbtVar.W(false);
                } else {
                    cavVarB.u(710504500);
                    cbtVar.W(false);
                    if (!skfVar.i || !skfVar.j) {
                        i5 = 2132019736;
                        i6 = 2132019737;
                    }
                    aomyVar2 = aomyVar;
                }
                smmVar = new smm(aomyVar2, zG, new smo(defpackage.dfa.f(i5, cavVarB)), defpackage.dfa.f(i6, cavVarB));
                z = false;
            }
            cbtVar.W(z);
            b(cmwVar, new smq(smmVar2, smmVar), cavVarB, (i2 >> 9) & 14);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new biu(skfVar, smuVar, aomyVar, cmwVar, i, 19);
        }
    }

    public static void d(boolean z, defpackage.aomy aomyVar, defpackage.cmw cmwVar, java.lang.String str, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aomy aomyVar2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-997308209);
        if (i3 == 0) {
            i2 = (true != cavVarB.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            aomyVar2 = aomyVar;
            i2 |= true != cavVarB.D(aomyVar2) ? 16 : 32;
        } else {
            aomyVar2 = aomyVar;
        }
        if ((i & 384) == 0) {
            cmwVar2 = cmwVar;
            i2 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
        } else {
            cmwVar2 = cmwVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(str) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            int i4 = i2 >> 3;
            defpackage.aaoo.aC(aomyVar2, cmwVar2, z, defpackage.aaoo.Z(cavVarB), null, null, defpackage.cfo.j(1357378157, new rzg(str, 14), cavVarB), cavVarB, (i4 & 14) | 1572864 | (i4 & 112) | ((i2 << 6) & 896), 48);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppv(z, aomyVar, cmwVar, str, i, 7);
        }
    }

    public static void e(smm smmVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1791870925);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(smmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        int i4 = 3;
        if (!cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cmwVar2 = cmwVar;
            cavVarB.s();
        } else {
            if (smmVar == null) {
                cavVarB.u(521900246);
                defpackage.den.aR(defpackage.azm.g(defpackage.cmw.c, 8.0f), cavVarB);
                ((defpackage.cbt) cavVarB).W(false);
                defpackage.cdk cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.ryr(cmwVar, i, 12);
                    return;
                }
                return;
            }
            cavVarB.u(522016527);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.W(false);
            j$.util.Objects.checkIndex(0, 3);
            smo smoVar = smmVar.c;
            if (smoVar instanceof smn) {
                cavVarB.u(522104381);
                cmwVar2 = cmwVar;
                d(smmVar.b, smmVar.a, cmwVar2, smmVar.d, cavVarB, (i2 << 3) & 896);
                cbtVar.W(false);
            } else {
                if (!(smoVar instanceof smo)) {
                    cavVarB.u(293934520);
                    cbtVar.W(false);
                    throw new defpackage.aois();
                }
                cavVarB.u(522321598);
                f(smmVar.b, smoVar.a, smmVar.a, cmwVar, smmVar.d, cavVarB, (i2 << 6) & 7168);
                cmwVar2 = cmwVar;
                cavVarB = cavVarB;
                cbtVar.W(false);
            }
        }
        defpackage.cdk cdkVarI2 = cavVarB.I();
        if (cdkVarI2 != null) {
            cdkVarI2.c = new defpackage.slz(smmVar, cmwVar2, i, i4);
        }
    }

    public static void f(boolean z, java.lang.String str, defpackage.aomy aomyVar, defpackage.cmw cmwVar, java.lang.String str2, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aomy aomyVar2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1732680766);
        if (i3 == 0) {
            i2 = (true != cavVarB.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            aomyVar2 = aomyVar;
            i2 |= true != cavVarB.D(aomyVar2) ? 128 : 256;
        } else {
            aomyVar2 = aomyVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(str2) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            if (str2 != null) {
                cavVarB.u(-1375520785);
                int i4 = 57344 & i2;
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR = cbtVar.R();
                if (i4 == 16384 || objR == defpackage.cau.a) {
                    objR = new skx(str2, 13);
                    cbtVar.ab(objR);
                }
                defpackage.cmw cmwVarB = defpackage.dig.b(cmwVar, false, (defpackage.aonj) objR);
                cbtVar.W(false);
                cmwVar2 = cmwVarB;
            } else {
                cavVarB.u(-1375436310);
                ((defpackage.cbt) cavVarB).W(false);
                cmwVar2 = cmwVar;
            }
            defpackage.ayy ayyVar = acpl.a;
            defpackage.aaoo.al(aomyVar2, cmwVar2, z, null, acpl.b(0L, cavVarB, 15), null, null, defpackage.cfo.j(142883760, new defpackage.ped(str, 8), cavVarB), cavVarB, ((i2 >> 6) & 14) | 805306368 | ((i2 << 6) & 896), 488);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pbu(z, str, aomyVar, cmwVar, str2, i, 2);
        }
    }

    public static boolean g(ske skeVar) {
        skd skdVar = skeVar instanceof skd ? (skd) skeVar : null;
        return (skdVar != null ? skdVar.a : null) != null;
    }

    public static void h(defpackage.cmw cmwVar, defpackage.aonj aonjVar, defpackage.cav cavVar, int i) {
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        defpackage.aonj aonjVar2;
        int i2 = i | 54;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (i2 & 19) != 18;
        defpackage.cav cavVarB = cavVar.b(-950293515);
        if (cavVarB.H(z3, i2 & 1)) {
            cmwVar2 = defpackage.cmw.c;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = new skk(2);
                cbtVar.ab(objR);
            }
            defpackage.aonj aonjVar3 = (defpackage.aonj) objR;
            float f = 1.0f;
            defpackage.cmw cmwVarAZ = defpackage.den.aZ(defpackage.azm.d(cmwVar2, 1.0f), 16.0f, 0.0f);
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.f(12.0f), defpackage.cmh.m, cavVarB, 6);
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
            defpackage.azk azkVar = defpackage.azk.a;
            cavVarB.u(2002579034);
            defpackage.aojl aojlVar = new defpackage.aojl((defpackage.aojo) sln.e);
            while (aojlVar.hasNext()) {
                sln slnVar = (sln) aojlVar.next();
                java.lang.String strF = defpackage.dfa.f(slnVar.g, cavVarB);
                boolean z4 = ((i2 & 112) == 32 ? z : z2) | cavVarB.z(slnVar.ordinal());
                java.lang.Object objR2 = cbtVar.R();
                if (z4 || objR2 == obj) {
                    objR2 = new qza(aonjVar3, slnVar, 12);
                    cbtVar.ab(objR2);
                }
                defpackage.aomy aomyVar2 = (defpackage.aomy) objR2;
                defpackage.cmw cmwVarL = rx.l(azkVar.a(cmwVar2, f, z), f, z2);
                boolean zB = cavVarB.B(strF);
                java.lang.Object objR3 = cbtVar.R();
                if (zB || objR3 == obj) {
                    objR3 = new skx(strF, 4);
                    cbtVar.ab(objR3);
                }
                defpackage.cav cavVar3 = cavVarB;
                defpackage.bvo.d(aomyVar2, defpackage.dig.b(cmwVarL, z2, (defpackage.aonj) objR3), false, defpackage.den.am(cavVarB).d, slnVar.f, 0L, 0.0f, 0.0f, null, null, sli.a, cavVar3, 996);
                obj = obj;
                azkVar = azkVar;
                cavVarB = cavVar3;
                aonjVar3 = aonjVar3;
                aojlVar = aojlVar;
                f = 1.0f;
                z = true;
                z2 = false;
            }
            cavVar2 = cavVarB;
            cbtVar.W(z2);
            cbtVar.W(true);
            aonjVar2 = aonjVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
            aonjVar2 = aonjVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(cmwVar2, aonjVar2, i, 20, (byte[]) null);
        }
    }

    public static /* synthetic */ rze i(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new rze(akzxVar);
    }

    public static /* synthetic */ ryu j(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new ryu(akzxVar, (byte[]) null);
    }

    public static /* synthetic */ ryg k(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new ryg(akzxVar);
    }

    public static abxt l(android.os.Parcel parcel) {
        defpackage.aooh.f(parcel, "parcel");
        byte[] bArrCreateByteArray = parcel.createByteArray();
        if (bArrCreateByteArray == null) {
            abxt abxtVar = abxt.a;
            defpackage.aooh.e(abxtVar, "getDefaultInstance(...)");
            return abxtVar;
        }
        try {
            abxt abxtVarY = defpackage.alad.y(abxt.a, bArrCreateByteArray);
            defpackage.aooh.c(abxtVarY);
            return abxtVarY;
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException("Failed to restore PatrickData from SavedStateHandle parcel. This might indicate proto schema corruption.", e);
        }
    }

    public static void m(abxt abxtVar, android.os.Parcel parcel) {
        defpackage.aooh.f(abxtVar, "<this>");
        defpackage.aooh.f(parcel, "parcel");
        parcel.writeByteArray(abxtVar.i());
    }

    public static /* synthetic */ int n(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof sip) {
            return 0;
        }
        return obj instanceof sio ? 1 : -2;
    }

    public static /* synthetic */ int o(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof defpackage.shg) {
            return 0;
        }
        return obj instanceof shh ? 1 : -2;
    }

    public static /* synthetic */ int p(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof abui) {
            return 0;
        }
        return obj instanceof abuk ? 1 : -2;
    }

    public static /* synthetic */ java.lang.Object q(java.lang.Object obj) {
        android.database.Cursor cursor = ((aguo) obj).a;
        return java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndex("data1")));
    }

    public static float r(boolean z) {
        return z ? 16.0f : 8.0f;
    }

    public static void s(defpackage.cav cavVar, int i) {
        defpackage.cav cavVarB = cavVar.b(788447922);
        if (cavVarB.H(i != 0, i & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarC = defpackage.azm.c(cmtVar, 1.0f);
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.e, false);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarC);
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
            defpackage.aaoo.T(defpackage.afsq.bE(defpackage.azm.g(cmtVar, 60.0f), defpackage.dfa.f(2132017956, cavVarB), null), defpackage.den.ak(cavVarB).c, defpackage.den.ak(cavVarB).b, null, null, cavVarB, 0);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new peb(i, 5);
        }
    }

    public static void t(defpackage.cav cavVar, int i) {
        defpackage.cav cavVarB = cavVar.b(945052414);
        if (cavVarB.H(i != 0, i & 1)) {
            w(defpackage.azm.e(defpackage.azm.d(defpackage.cmw.c, 1.0f), 48.0f), sgm.c, cavVarB, 54, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new peb(i, 7);
        }
    }

    public static void u(sgl sglVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1317196331);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(sglVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            y(2132018098, cavVarB, 0);
            if (sglVar.f) {
                cavVarB.u(1189683181);
                t(cavVarB, 0);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                java.util.List list = sglVar.c;
                if (list.isEmpty()) {
                    cavVarB.u(1189691276);
                    v(sglVar.a, 2132018097, 2132018096, cavVarB, 0);
                    ((defpackage.cbt) cavVarB).W(false);
                } else {
                    cavVarB.u(-1774451566);
                    D(list, null, cavVarB, 0);
                    F(sglVar.a, null, cavVarB, 0);
                    ((defpackage.cbt) cavVarB).W(false);
                }
            }
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(sglVar, i, 9);
        }
    }

    public static void v(defpackage.aomy aomyVar, int i, int i2, defpackage.cav cavVar, int i3) {
        int i4;
        int i5 = i3 & 6;
        defpackage.cav cavVarB = cavVar.b(1434585326);
        if (i5 == 0) {
            i4 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != cavVarB.z(i) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != cavVarB.z(i2) ? 128 : 256;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            w(null, defpackage.cfo.j(-244426016, new pbt(i, i2, aomyVar, 2), cavVarB), cavVarB, 48, 1);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new sgk(aomyVar, i, i2, i3);
        }
    }

    public static void w(defpackage.cmw cmwVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cav cavVarB = cavVar.b(537588659);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (true != cavVarB.B(cmwVar) ? 2 : 4);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if (cavVarB.H((i3 & 19) != 18, i3 & 1)) {
            if (i2 != 0) {
                cmwVar = defpackage.cmw.c;
            }
            defpackage.bvo.b(defpackage.azm.d(cmwVar, 1.0f), defpackage.den.am(cavVarB).d, 0L, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(22156558, new rzg(aonnVar, 5), cavVarB), cavVarB, 124);
        } else {
            cavVarB.s();
        }
        defpackage.cmw cmwVar2 = cmwVar;
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bbu(cmwVar2, aonnVar, i, i2, 5);
        }
    }

    public static void x(sgl sglVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1397603391);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(sglVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            y(2132019443, cavVarB, 0);
            if (sglVar.f) {
                cavVarB.u(1227909657);
                t(cavVarB, 0);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                sgn sgnVar = sglVar.d;
                if (sgnVar != null) {
                    cavVarB.u(1227911899);
                    z(sgnVar, defpackage.bge.b(16.0f), cavVarB, 0);
                    ((defpackage.cbt) cavVarB).W(false);
                } else {
                    cavVarB.u(1227916531);
                    v(sglVar.b, 2132019442, 2132019438, cavVarB, 0);
                    ((defpackage.cbt) cavVarB).W(false);
                }
            }
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(sglVar, i, 7);
        }
    }

    public static void y(int i, defpackage.cav cavVar, int i2) {
        int i3;
        defpackage.cav cavVar2;
        int i4;
        int i5 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(1212122609);
        if (i5 == 0) {
            i3 = (true != cavVarB.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (cavVarB.H((i3 & 3) != 2, i3 & 1)) {
            cavVar2 = cavVarB;
            i4 = 2;
            defpackage.abrz.k(defpackage.dfa.f(i, cavVarB), defpackage.den.aZ(defpackage.cmw.c, 16.0f, 8.0f), defpackage.den.ak(cavVarB).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, defpackage.den.an(cavVarB).i, cavVar2, 48, 0, 131064);
        } else {
            cavVar2 = cavVarB;
            i4 = 2;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pec(i, i2, i4);
        }
    }

    public static void z(sgn sgnVar, defpackage.crd crdVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-2013430793);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(sgnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(crdVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            defpackage.bvo.b(defpackage.azm.d(defpackage.cmw.c, 1.0f), crdVar, defpackage.den.ak(cavVarB).p, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(1551898812, new rzg(sgnVar, 4), cavVarB), cavVarB, 120);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pqe(sgnVar, crdVar, i, 15);
        }
    }

    public snl(char[] cArr, byte[] bArr) {
    }
}
