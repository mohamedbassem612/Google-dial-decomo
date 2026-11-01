package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qtd {
    public static final aihd a = aihd.s(defpackage.qmz.BUTTON_MUTE, defpackage.qmz.BUTTON_CAMERA_OFF, defpackage.qmz.BUTTON_DOWNGRADE_TO_AUDIO);
    public static final aimz b = aimz.i("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer");
    private final aoin A;
    private ok C;
    private final defpackage.afpl E;
    public final android.content.Context c;
    public final defpackage.qsr d;
    public final ahpz e;
    public final defpackage.pnb f;
    public final defpackage.qso g;
    public final defpackage.qtm h;
    public final defpackage.qtm i;
    public final android.app.KeyguardManager j;
    public final rlv k;
    public android.view.OrientationEventListener o;
    public ok q;
    public final defpackage.rcm r;
    public final ajwr s;
    public final hgw t;
    private final ems u;
    private final android.view.WindowManager v;
    private final tec w;
    private final urs x;
    private final defpackage.agzc y;
    private final odo z;
    public j$.util.Optional l = j$.util.Optional.empty();
    public j$.util.Optional m = j$.util.Optional.empty();
    public j$.util.Optional n = j$.util.Optional.empty();
    public j$.util.Optional p = j$.util.Optional.empty();
    private final odm B = new defpackage.qsw(this);
    private final oi D = new kse(this, 7);

    public qtd(android.content.Context context, defpackage.qsr qsrVar, ems emsVar, ajwr ajwrVar, defpackage.afpl afplVar, ahpz ahpzVar, android.view.WindowManager windowManager, hgw hgwVar, defpackage.pnb pnbVar, defpackage.rcm rcmVar, defpackage.qso qsoVar, defpackage.qtm qtmVar, defpackage.qtm qtmVar2, tec tecVar, android.app.KeyguardManager keyguardManager, urs ursVar, defpackage.agzc agzcVar, odo odoVar, rlv rlvVar, aoin aoinVar) {
        this.c = context;
        this.d = qsrVar;
        this.u = emsVar;
        this.s = ajwrVar;
        this.E = afplVar;
        this.e = ahpzVar;
        this.v = windowManager;
        this.t = hgwVar;
        this.f = pnbVar;
        this.r = rcmVar;
        this.g = qsoVar;
        this.h = qtmVar;
        this.i = qtmVar2;
        this.j = keyguardManager;
        this.w = tecVar;
        this.x = ursVar;
        this.y = agzcVar;
        this.z = odoVar;
        this.k = rlvVar;
        this.A = aoinVar;
    }

    private static int B(android.view.View view) {
        return view.getHeight() + ((android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    private static int C(android.view.View view) {
        return view.getHeight() + ((android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    private final android.view.View D() {
        return this.d.N().findViewById(2131428372);
    }

    private final android.view.View E() {
        return this.d.N().findViewById(2131429406);
    }

    private final android.view.View F() {
        return this.d.N().findViewById(2131429410);
    }

    private static android.view.ViewPropertyAnimator G(android.view.View view) {
        return view.animate().translationX(0.0f).translationY(0.0f).setInterpolator(wsc.bq(view.getContext(), defpackage.urq.EASING_STANDARD_DECELERATE)).alpha(1.0f);
    }

    private static android.view.ViewPropertyAnimator H(android.view.View view, float f) {
        return view.animate().translationX(0.0f).translationY(f).setInterpolator(wsc.bq(view.getContext(), defpackage.urq.EASING_STANDARD_ACCELERATE)).alpha(0.0f);
    }

    private final void I(android.view.View view, boolean z) {
        int i = true != z ? 8 : 0;
        if (view.getVisibility() != i) {
            view.setAlpha(!z ? 1 : 0);
            view.setVisibility(0);
            android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            ahpz ahpzVar = this.e;
            ems emsVar = this.u;
            qss qssVar = new qss(view, i, 0);
            hrv hrvVar = new hrv();
            hrvVar.b(qssVar);
            viewPropertyAnimatorAnimate.setListener(new defpackage.ahpv(new hry(emsVar, hrvVar.a()), ahpzVar, 652, "setting visibility with animation")).alpha(z ? 1.0f : 0.0f).withEndAction(new eyd(view, i, 5)).start();
        }
    }

    private final boolean J() {
        android.content.Context context = this.c;
        if (defpackage.rhx.c(context)) {
            return false;
        }
        return context.getResources().getBoolean(2131034173);
    }

    public static void o(android.view.TextureView textureView, j$.util.Optional optional) {
        androidx.constraintlayout.widget.ConstraintLayout parent = textureView.getParent();
        parent.removeView(textureView);
        if (optional.isPresent()) {
            if (da$.ExternalSyntheticApiModelOutline1.m((android.graphics.SurfaceTexture) optional.orElseThrow())) {
                a.bI(b.c().m(aioa.b), "surface texture is released", "com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "replaceSurfaceTexture", (char) 1809, "VideoScreenFragmentPeer.java", zct.b);
            } else {
                textureView.setSurfaceTexture((android.graphics.SurfaceTexture) optional.orElseThrow());
            }
        }
        parent.addView(textureView, 0);
    }

    public static void u(android.view.View view, int i, int i2) {
        dtv layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public final android.view.View A(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        defpackage.pnd pndVarA;
        ahoq ahoqVarW = ahvr.W(655, "VideoScreenFragmentPeer_onCreateView");
        try {
            b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "onCreateView", 330, "VideoScreenFragmentPeer.java").v("onCreateView");
            ((ahfw) this.d).a.c(new defpackage.qtb(this));
            android.view.View viewInflate = layoutInflater.inflate(2131624243, viewGroup, false);
            layoutInflater.inflate(true != z() ? 2131624689 : 2131624688, (android.view.ViewGroup) viewInflate.findViewById(2131429423), true);
            this.y.g(2131429405, this.E.aa(defpackage.qsz.class, new defpackage.qam(6)), this.z.a(this.B));
            if (J()) {
                defpackage.pnc pncVar = new defpackage.pnc();
                pncVar.m(j$.util.Optional.of((android.widget.ImageView) viewInflate.findViewById(2131427847)));
                pncVar.d(j$.util.Optional.of((android.widget.ViewAnimator) viewInflate.findViewById(2131427829)));
                pncVar.e(j$.util.Optional.of((android.widget.Chronometer) viewInflate.findViewById(2131427830)));
                pncVar.c(j$.util.Optional.of((android.widget.TextView) viewInflate.findViewById(2131427828)));
                pncVar.h(j$.util.Optional.of((android.widget.LinearLayout) viewInflate.findViewById(2131427839)));
                pndVarA = pncVar.a();
            } else {
                defpackage.pnc pncVar2 = new defpackage.pnc();
                pncVar2.f(j$.util.Optional.of(viewInflate.findViewById(2131428372)));
                pncVar2.k(j$.util.Optional.of((android.widget.TextView) viewInflate.findViewById(2131427844)));
                pncVar2.i(j$.util.Optional.of((android.widget.TextView) viewInflate.findViewById(2131427832)));
                pncVar2.c(j$.util.Optional.of((android.widget.TextView) viewInflate.findViewById(2131427828)));
                j$.util.Optional optionalOf = j$.util.Optional.of((android.widget.TextView) viewInflate.findViewById(2131427837));
                if (optionalOf == null) {
                    throw new java.lang.NullPointerException("Null forwardedNumberTextView");
                }
                pncVar2.a = optionalOf;
                pncVar2.g(j$.util.Optional.ofNullable((android.widget.TextView) viewInflate.findViewById(2131427834)));
                pncVar2.l(j$.util.Optional.of((android.widget.ImageView) viewInflate.findViewById(2131427846)));
                pncVar2.b(j$.util.Optional.empty());
                pncVar2.m(j$.util.Optional.of((android.widget.ImageView) viewInflate.findViewById(2131427847)));
                j$.util.Optional optionalOf2 = j$.util.Optional.of((android.widget.ImageView) viewInflate.findViewById(2131427836));
                if (optionalOf2 == null) {
                    throw new java.lang.NullPointerException("Null forwardIconImageView");
                }
                pncVar2.b = optionalOf2;
                pncVar2.j(j$.util.Optional.of((android.widget.ImageView) viewInflate.findViewById(2131427843)));
                pncVar2.d(j$.util.Optional.of((android.widget.ViewAnimator) viewInflate.findViewById(2131427829)));
                pncVar2.e(j$.util.Optional.of((android.widget.Chronometer) viewInflate.findViewById(2131427830)));
                pncVar2.h(j$.util.Optional.of((android.widget.LinearLayout) viewInflate.findViewById(2131427839)));
                pndVarA = pncVar2.a();
            }
            j$.util.Optional optional = pndVarA.n;
            if (optional.isPresent()) {
                try {
                    ((android.widget.Chronometer) optional.orElseThrow()).setTypeface(dwk.b(((android.widget.Chronometer) optional.orElseThrow()).getContext(), 2131296305));
                } catch (android.content.res.Resources.NotFoundException e) {
                    b.c().i(zct.b).k(e).l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "onCreateView", 406, "VideoScreenFragmentPeer.java").v("font could not be loaded");
                }
            }
            defpackage.pnb pnbVar = this.f;
            pnbVar.g = J();
            pnbVar.j(pndVarA);
            pnbVar.k();
            defpackage.qsr qsrVar = this.d;
            this.C = qsrVar.O(new pa(), this.D);
            u uVar = new u(qsrVar.I());
            defpackage.qqh qqhVar = new defpackage.qqh();
            amxr.g(qqhVar);
            uVar.q(2131428730, qqhVar, (java.lang.String) null);
            uVar.c();
            this.o = new defpackage.qta(this, this.c);
            ahoqVarW.close();
            return viewInflate;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final int a() {
        int rotation = this.v.getDefaultDisplay().getRotation();
        if (z()) {
            try {
                android.view.Display displayM = baa$.ExternalSyntheticApiModelOutline1.m(this.c);
                if (displayM != null) {
                    rotation = displayM.getRotation();
                }
            } catch (java.lang.UnsupportedOperationException e) {
                a.by(b.d(), "Falling back to default display rotation", "com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "getRenderedContentRotationInDegrees", (char) 583, "VideoScreenFragmentPeer.java", e);
            }
        }
        if (rotation == 3) {
            return 270;
        }
        if (rotation == 2) {
            return 180;
        }
        return rotation == 1 ? 90 : 0;
    }

    public final android.util.Size b() {
        android.view.TextureView textureViewD = d();
        return new android.util.Size(textureViewD.getWidth(), textureViewD.getHeight());
    }

    public final android.util.Size c() {
        android.view.TextureView textureViewE = e();
        return new android.util.Size(textureViewE.getWidth(), textureViewE.getHeight());
    }

    public final android.view.TextureView d() {
        return (android.view.TextureView) this.d.N().findViewById(2131429428);
    }

    public final android.view.TextureView e() {
        return (android.view.TextureView) this.d.N().findViewById(2131429425);
    }

    public final android.view.View f() {
        return this.d.N().findViewById(2131429407);
    }

    public final android.widget.ImageView g() {
        return (android.widget.ImageView) this.d.N().findViewById(2131429418);
    }

    public final android.widget.ImageView h() {
        return (android.widget.ImageView) this.d.N().findViewById(2131429415);
    }

    public final android.widget.TextView i() {
        return (android.widget.TextView) this.d.N().findViewById(2131429419);
    }

    public final j$.util.Optional j() {
        return j$.util.Optional.ofNullable(this.d.N().findViewById(2131429420));
    }

    public final j$.util.Optional k() {
        if (!this.l.isPresent()) {
            a.bI(b.d(), "no video model", "com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "getVideoScreenController", (char) 1694, "VideoScreenFragmentPeer.java", zct.b);
            return j$.util.Optional.empty();
        }
        j$.util.Optional optionalAe = this.t.ae((defpackage.qqr) this.l.orElseThrow());
        if (optionalAe.isPresent()) {
            return optionalAe;
        }
        a.bI(b.d(), "video screen controller is not found", "com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "getVideoScreenController", (char) 1700, "VideoScreenFragmentPeer.java", zct.b);
        return optionalAe;
    }

    public final j$.util.Optional l(defpackage.qqr qqrVar) {
        j$.util.Optional optionalAe = this.t.ae(qqrVar);
        if (!optionalAe.isPresent()) {
            a.bI(b.d(), "video screen controller is not found", "com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "getVideoScreenController", (char) 1709, "VideoScreenFragmentPeer.java", zct.b);
        }
        return optionalAe;
    }

    public final void m() {
        b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "enterFullscreenMode", 1331, "VideoScreenFragmentPeer.java").v("enterFullscreenMode");
        urs ursVar = this.x;
        defpackage.qsr qsrVar = this.d;
        ursVar.f(qsrVar);
        aooh.f(qsrVar, "fragment");
        android.view.Window windowA = ursVar.a(qsrVar);
        urs.a.b().l("com/android/dialer/theme/systembars/SystemBars", "hideStatusBar", 42, "SystemBars.kt").v("enter");
        int i = 1;
        ursVar.q(windowA).e(1);
        ursVar.c(qsrVar);
        ursVar.d(qsrVar);
        ursVar.h(qsrVar);
        if (this.l.isPresent()) {
            j$.util.Optional optionalJ = j();
            android.view.View view = (android.view.View) (true != optionalJ.isPresent() ? ((defpackage.qtd) new idb(this, 8).a).d.N().findViewById(2131429387) : optionalJ.get());
            int iB = B(view);
            H(view, iB).withEndAction(ahqx.h(new defpackage.pmw(this, view, 17))).start();
            android.view.View viewE = E();
            H(viewE, (int) (((double) iB) * 0.8d)).withEndAction(new defpackage.qsu(viewE, i)).start();
            android.view.View viewD = D();
            android.view.ViewPropertyAnimator viewPropertyAnimatorH = H(viewD, -C(viewD));
            defpackage.pnb pnbVar = this.f;
            j$.util.Objects.requireNonNull(pnbVar);
            viewPropertyAnimatorH.withEndAction(new defpackage.qsu(pnbVar, 0)).start();
            I(F(), false);
            return;
        }
        if (((aw) qsrVar).Q != null) {
            j$.util.Optional optionalJ2 = j();
            android.view.View view2 = (android.view.View) (true != optionalJ2.isPresent() ? ((defpackage.qtd) new idb(this, 8).a).d.N().findViewById(2131429387) : optionalJ2.get());
            int iB2 = B(view2);
            view2.setTranslationY(iB2);
            view2.setVisibility(4);
            j$.util.Optional optionalJ3 = j();
            if (true == optionalJ3.isPresent()) {
                ((android.view.View) optionalJ3.get()).setVisibility(4);
            }
            f().setVisibility(4);
            android.view.View viewE2 = E();
            viewE2.setTranslationY((int) (((double) iB2) * 0.8d));
            viewE2.setVisibility(4);
            android.view.View viewD2 = D();
            viewD2.setTranslationY(-C(viewD2));
            this.f.e();
            android.view.View viewF = F();
            viewF.setAlpha(0.0f);
            viewF.setVisibility(8);
        }
    }

    public final void n() {
        b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "exitFullscreenMode", 1426, "VideoScreenFragmentPeer.java").v("exitFullscreenMode");
        s();
        j$.util.Optional optionalJ = j();
        android.view.View view = (android.view.View) (true != optionalJ.isPresent() ? ((defpackage.qtd) new idb(this, 8).a).d.N().findViewById(2131429387) : optionalJ.get());
        G(view).withStartAction(ahqx.h(new defpackage.pmw(this, view, 15))).start();
        android.view.View viewE = E();
        G(viewE).withStartAction(new defpackage.pmx(viewE, 19)).start();
        android.view.ViewPropertyAnimator viewPropertyAnimatorG = G(D());
        defpackage.pnb pnbVar = this.f;
        j$.util.Objects.requireNonNull(pnbVar);
        viewPropertyAnimatorG.withStartAction(new defpackage.pmx(pnbVar, 20)).start();
        I(F(), true);
    }

    public final void p() {
        j$.util.Optional optionalK = k();
        defpackage.qmp qmpVar = new defpackage.qmp(this, 20);
        if (true == optionalK.isPresent()) {
            defpackage.qrv qrvVar = (defpackage.qrv) optionalK.get();
            int iA = ((defpackage.qtd) qmpVar.a).a();
            aimz aimzVar = defpackage.qrv.a;
            aimzVar.b().l("com/android/dialer/incall/video/service/VideoScreenController", "reportScreenOrientation", 315, "VideoScreenController.java").w("newRotationDegrees: %d", iA);
            aimzVar.b().l("com/android/dialer/incall/video/service/VideoScreenController", "reportScreenOrientation", 316, "VideoScreenController.java").y("currentRotationDegrees: %s", qrvVar.m.isPresent() ? java.lang.Integer.valueOf(qrvVar.m.getAsInt()) : "empty");
            if (qrvVar.m.equals(j$.util.OptionalInt.of(iA))) {
                aimzVar.b().l("com/android/dialer/incall/video/service/VideoScreenController", "reportScreenOrientation", 320, "VideoScreenController.java").v("current rotation and new rotation match");
                return;
            }
            qrvVar.r.d(iA);
            j$.util.OptionalInt optionalInt = qrvVar.m;
            j$.util.Optional optionalEmpty = !optionalInt.isPresent() ? j$.util.Optional.empty() : j$.util.Optional.of(defpackage.qrv.a(optionalInt.getAsInt()));
            defpackage.qru qruVarA = defpackage.qrv.a(iA);
            boolean zIsPresent = optionalEmpty.isPresent();
            int iOrdinal = qruVarA.ordinal();
            if (iOrdinal == 0) {
                qrvVar.t.a(!zIsPresent ? qbc.bY : qbc.bW);
            } else if (iOrdinal == 1) {
                qrvVar.t.a(!zIsPresent ? qbc.bX : qbc.bV);
            }
            qrvVar.m = j$.util.OptionalInt.of(iA);
            aimzVar.b().l("com/android/dialer/incall/video/service/VideoScreenController", "reportScreenOrientation", 344, "VideoScreenController.java").w("currentRotationDegrees set to: %d", qrvVar.m.getAsInt());
        }
    }

    public final void q() {
        b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "requestCameraPermission", 1552, "VideoScreenFragmentPeer.java").v("requesting camera permission");
        this.C.b("android.permission.CAMERA");
    }

    public final void r() {
        da$.ExternalSyntheticApiModelOutline1.m(this.j, this.d.G(), new defpackage.qsx(this));
    }

    public final void s() {
        defpackage.qsr qsrVar = this.d;
        aooh.f(qsrVar, "fragment");
        urs ursVar = this.x;
        android.view.Window windowA = ursVar.a(qsrVar);
        urs.a.b().l("com/android/dialer/theme/systembars/SystemBars", "showStatusBar", 36, "SystemBars.kt").v("enter");
        ursVar.q(windowA).i(1);
        ursVar.i(qsrVar);
        ursVar.d(qsrVar);
        ursVar.e(qsrVar);
        ursVar.k(qsrVar);
    }

    public final void t(android.view.View view, defpackage.qmy qmyVar, java.lang.String str) {
        view.setOnClickListener(new defpackage.ahpp(this.e, 659, str, new defpackage.qht(qmyVar, 7), 0));
    }

    public final void v() {
        j$.util.Optional optionalK = k();
        defpackage.qst qstVar = new defpackage.qst(this, 7);
        if (true == optionalK.isPresent()) {
            defpackage.qrv qrvVar = (defpackage.qrv) optionalK.get();
            j$.util.Optional optionalOfNullable = ((defpackage.qtd) qstVar.a).l;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.qqr) optionalOfNullable.get()).c));
            }
            qrvVar.j(!((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue());
        }
    }

    public final void w(defpackage.qth qthVar) {
        android.widget.ImageView.ScaleType scaleType;
        j$.util.Optional optionalG = qthVar.g(b());
        if (true == optionalG.isPresent()) {
            defpackage.qtp qtpVar = (defpackage.qtp) optionalG.get();
            int iOrdinal = qtpVar.ordinal();
            if (iOrdinal == 0) {
                scaleType = android.widget.ImageView.ScaleType.FIT_CENTER;
            } else {
                if (iOrdinal != 1) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Unhandled scale type: %s", qtpVar));
                }
                scaleType = android.widget.ImageView.ScaleType.CENTER_CROP;
            }
            optionalG = j$.util.Optional.ofNullable(scaleType);
        }
        defpackage.qst qstVar = new defpackage.qst(this, 2);
        if (true == optionalG.isPresent()) {
            ((defpackage.qtd) qstVar.a).g().setScaleType((android.widget.ImageView.ScaleType) optionalG.get());
        }
    }

    public final void x(boolean z) {
        this.d.N().findViewById(2131429414).setVisibility(true != z ? 8 : 0);
        defpackage.qtm qtmVar = this.h;
        if (z) {
            qtmVar.a();
        } else {
            qtmVar.b();
        }
        b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "updatePreviewVisibility", 1231, "VideoScreenFragmentPeer.java").y("Updated preview visibility to : %b", java.lang.Boolean.valueOf(z));
    }

    public final void y(defpackage.qth qthVar) {
        j$.util.Optional optionalD = qthVar.d(c());
        defpackage.qmp qmpVar = new defpackage.qmp(this, 14);
        if (true == optionalD.isPresent()) {
            ((defpackage.qtq) optionalD.get()).e(((defpackage.qtd) qmpVar.a).e());
        }
        j$.util.Optional optionalC = qthVar.c(b());
        defpackage.qmp qmpVar2 = new defpackage.qmp(this, 15);
        if (true == optionalC.isPresent()) {
            ((defpackage.qtq) optionalC.get()).e(((defpackage.qtd) qmpVar2.a).d());
        }
    }

    public final boolean z() {
        return ((java.lang.Boolean) this.A.a()).booleanValue() && this.w.a(this.c);
    }
}
