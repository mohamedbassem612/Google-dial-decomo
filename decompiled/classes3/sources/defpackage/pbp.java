package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pbp {
    public static final aimz a = aimz.i("com/android/dialer/incall/answer/ui/AnswerFragmentPeer");
    public final odm A;
    public final agtk B;
    public final defpackage.ppb C;
    public final defpackage.oyx D;
    public final zzx E;
    public final zzx F;
    public final gpd G;
    public final gpd H;
    public final zzx I;
    public final defpackage.oyx J;
    public final aais K;
    public final defpackage.afpl L;
    public final ipc M;
    private final defpackage.qhz N;
    private final zpm O;
    public final az b;
    public final defpackage.pbj c;
    public final agtj d;
    public final defpackage.oyl e;
    public final urs f;
    public final defpackage.agzc g;
    public final odo h;
    public final defpackage.oxm i;
    public final rlv j;
    public final tec k;
    public final zmq l;
    public final zms m;
    public final aoin n;
    public final aoin o;
    public final aoin p;
    public final ahpz q;
    public final aoin r;
    public final aoin s;
    public final aoin t;
    public final aoin u;
    public final aoin v;
    public final ccp w;
    public final ccp x;
    public defpackage.oue y;
    public defpackage.our z;

    public pbp(az azVar, defpackage.pbj pbjVar, agtj agtjVar, defpackage.afpl afplVar, defpackage.oyx oyxVar, defpackage.oyl oylVar, zzx zzxVar, gpd gpdVar, zpm zpmVar, urs ursVar, defpackage.agzc agzcVar, odo odoVar, defpackage.oxm oxmVar, rlv rlvVar, ipc ipcVar, tec tecVar, gpd gpdVar2, zmq zmqVar, zms zmsVar, zzx zzxVar2, zzx zzxVar3, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aais aaisVar, hwv hwvVar, ahpz ahpzVar, defpackage.oyx oyxVar2, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6, aoin aoinVar7, aoin aoinVar8, defpackage.qhz qhzVar) {
        aooh.f(azVar, "activity");
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(oylVar, "tidePodsAnswerMethod");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(zpmVar, "callScopes");
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(zmsVar, "audioModeProvider");
        aooh.f(aoinVar, "enableUnifiedExpresso");
        aooh.f(aoinVar2, "enablePreserveSimNameColor");
        aooh.f(aoinVar3, "enableContactGridAdjustment");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(aoinVar5, "enableIncomingCallConstraintLayoutFix");
        aooh.f(aoinVar6, "enableIncomingCallLandscape");
        aooh.f(aoinVar7, "enableAnswerEdgeToEdge");
        aooh.f(aoinVar8, "enableFlippablesQuickResponses");
        this.b = azVar;
        this.c = pbjVar;
        this.d = agtjVar;
        this.L = afplVar;
        this.D = oyxVar;
        this.e = oylVar;
        this.I = zzxVar;
        this.H = gpdVar;
        this.O = zpmVar;
        this.f = ursVar;
        this.g = agzcVar;
        this.h = odoVar;
        this.i = oxmVar;
        this.j = rlvVar;
        this.M = ipcVar;
        this.k = tecVar;
        this.G = gpdVar2;
        this.l = zmqVar;
        this.m = zmsVar;
        this.E = zzxVar2;
        this.F = zzxVar3;
        this.n = aoinVar;
        this.o = aoinVar2;
        this.p = aoinVar3;
        this.K = aaisVar;
        this.q = ahpzVar;
        this.J = oyxVar2;
        this.r = aoinVar4;
        this.s = aoinVar5;
        this.t = aoinVar6;
        this.u = aoinVar7;
        this.v = aoinVar8;
        this.N = qhzVar;
        cdu cduVar = cdu.c;
        this.w = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        this.x = new androidx.compose.runtime.ParcelableSnapshotMutableState(aokc.a, cduVar);
        this.A = new defpackage.pbn(this);
        this.B = new defpackage.pbm(this);
        this.C = hwvVar.o(defpackage.pzp.ANSWER_SCREEN);
        a.b().l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer", "<init>", 236, "AnswerFragmentPeer.kt").v("enter");
        qhzVar.g(((ahfw) pbjVar).a, new mtr(this, 19));
    }

    public final android.view.View a() {
        return this.c.N().findViewById(2131427787);
    }

    public final defpackage.pac b() {
        return (defpackage.pac) this.w.a();
    }

    public final zas c() {
        java.lang.String strD;
        defpackage.pac pacVarB = b();
        if (pacVarB == null || (strD = pacVarB.b) == null) {
            strD = d();
        }
        return this.H.i(strD);
    }

    public final java.lang.String d() {
        j$.util.Optional optionalH = this.O.h();
        aooh.e(optionalH, "getPrimaryCallScope(...)");
        defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalH);
        if (apqrVar != null) {
            return (java.lang.String) apqrVar.b;
        }
        return null;
    }

    public final java.util.List e() {
        return (java.util.List) this.x.a();
    }

    public final void f(defpackage.pdv pdvVar, boolean z, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-48745437);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(pdvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(this) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            a.b().l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer", "ColorBackground", 784, "AnswerFragmentPeer.kt").v("Setting call background color.");
            if (z) {
                cbtVarB.u(-476199194);
                i(cfo.j(-997010567, new ntw(pdvVar, 12), cbtVarB), cbtVarB, ((i2 >> 3) & 112) | 6);
                cbtVarB.W(false);
            } else {
                cbtVarB.u(-476105760);
                defpackage.pef.a(pdvVar.b == 1 ? ((java.lang.Integer) pdvVar.c).intValue() : 0, cbtVarB, 0);
                cbtVarB.W(false);
            }
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bsq(this, pdvVar, z, i, 11);
        }
    }

    public final void g(defpackage.pdv pdvVar, boolean z, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(1857916955);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(pdvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(this) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            a.b().l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer", "ImageBackground", 763, "AnswerFragmentPeer.kt").v("Setting call background image.");
            cja cjaVarJ = cfo.j(-830946870, new dqv(this, pdvVar, 19, (byte[]) null), cbtVarB);
            if (z) {
                cbtVarB.u(-38993777);
                i(cjaVarJ, cbtVarB, ((i2 >> 3) & 112) | 6);
                cbtVarB.W(false);
            } else {
                cbtVarB.u(-38932924);
                cjaVarJ.a(cbtVarB, 6);
                cbtVarB.W(false);
            }
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bsq(this, pdvVar, z, i, 10);
        }
    }

    public final void h(boolean z, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(1595596971);
        if (i3 == 0) {
            i2 = (true != cbtVarB.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cbtVarB.H((i2 & 3) != 2, i2 & 1)) {
            a.b().l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer", "SpamBackground", 753, "AnswerFragmentPeer.kt").v("Showing spam gradient.");
            if (z) {
                cbtVarB.u(2026424556);
                defpackage.pef.d(cbtVarB, 0);
                cbtVarB.W(false);
            } else {
                cbtVarB.u(2026472885);
                defpackage.pef.c(cbtVarB, 0);
                cbtVarB.W(false);
            }
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new oa(this, z, i, 7);
        }
    }

    public final void i(aonn aonnVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(1140196757);
        if (i3 == 0) {
            i2 = i | (true != cbtVarB.D(aonnVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (cbtVarB.H((i2 & 3) != 2, i2 & 1)) {
            cmt cmtVar = cmw.c;
            cmw cmwVarC = azm.c(cmtVar, 1.0f);
            cmj cmjVar = cmh.a;
            cye cyeVarB = awo.b(cmjVar, false);
            cbt cbtVar = cbtVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarC);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            aonn aonnVar2 = dam.e;
            cev.c(cbtVarB, cyeVarB, aonnVar2);
            aonn aonnVar3 = dam.d;
            cev.c(cbtVarB, cjeVarAi, aonnVar3);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar4 = dam.f;
            cev.c(cbtVarB, numValueOf, aonnVar4);
            aonj aonjVar = dam.g;
            cev.b(cbtVarB, aonjVar);
            aonn aonnVar5 = dam.c;
            cev.c(cbtVarB, cmwVarM, aonnVar5);
            cmw cmwVarX = den.x(cfd.K(azm.d(azm.b(cmtVar, 1.0f), 0.5f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (crd) null, true, 0, 1044479), "start_column_background");
            cye cyeVarB2 = awo.b(cmjVar, false);
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cbtVarB, cmwVarX);
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarB2, aonnVar2);
            cev.c(cbtVarB, cjeVarAi2, aonnVar3);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM2), aonnVar4);
            cev.b(cbtVarB, aonjVar);
            cev.c(cbtVarB, cmwVarM2, aonnVar5);
            aonnVar.a(cbtVarB, java.lang.Integer.valueOf(i2 & 14));
            cbtVar.W(true);
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kcv(this, aonnVar, i, 17, (byte[]) null);
        }
    }

    public final void j(android.view.View view, android.view.animation.Animation.AnimationListener animationListener) {
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(wsc.bp(this.c.z(), defpackage.urp.DURATION_MEDIUM_3));
        scaleAnimation.setInterpolator(new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        if (animationListener != null) {
            scaleAnimation.setAnimationListener(animationListener);
        }
        view.startAnimation(scaleAnimation);
    }

    public final void k(defpackage.pac pacVar) {
        defpackage.pbj pbjVar = this.c;
        if (((aw) pbjVar).Q == null) {
            a.b().l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer", "setSystemUiFlags", 867, "AnswerFragmentPeer.kt").v("fragment not initialized and cannot handle view changes");
            return;
        }
        aoin aoinVar = this.u;
        if (!((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            urs ursVar = this.f;
            ursVar.c(pbjVar);
            ursVar.h(pbjVar);
        }
        if (pacVar == null) {
            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                return;
            }
            a.b().l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer", "setSystemUiFlags", 878, "AnswerFragmentPeer.kt").v("setting HIDE_NAVIGATION and IMMERSIVE_STICKY.");
            return;
        }
        if (!((java.lang.Boolean) aoinVar.a()).booleanValue() && pacVar.f) {
            if (this.b.isInMultiWindowMode() || this.k.a(pbjVar.A())) {
                this.f.b(pbjVar);
            } else {
                this.f.j(pbjVar);
            }
        }
        if (pacVar.e == defpackage.pab.b) {
            this.f.f(pbjVar);
        }
    }

    public final void l(int i, defpackage.ouo ouoVar, android.view.ViewGroup viewGroup) {
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(this.c.A(), (android.util.AttributeSet) null, 0, 6, (aooc) null);
        if (((java.lang.Boolean) this.r.a()).booleanValue()) {
            composeView.k(dgi.a);
        }
        viewGroup.addView((android.view.View) composeView, 0);
        composeView.setVisibility(0);
        composeView.a(new cja(976154678, true, new kcv(this, i, ouoVar, 16)));
        j(composeView, null);
    }

    public final ogg m() {
        ahei aheiVarD = this.c.I().d(2131428379);
        if (aheiVarD != null && (aheiVarD instanceof ahei)) {
            ahei aheiVar = aheiVarD;
            if (aheiVar.y() instanceof ogg) {
                return (ogg) aheiVar.y();
            }
        }
        return null;
    }

    public final defpackage.wjc n(defpackage.pac pacVar) {
        if (pacVar == null) {
            return null;
        }
        j$.util.Optional optionalA = this.D.a(pacVar.b);
        aooh.e(optionalA, "forModel(...)");
        return (defpackage.wjc) aooh.q(optionalA);
    }
}
