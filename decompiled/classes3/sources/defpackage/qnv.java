package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qnv {
    public static final aimz a = aimz.i("com/android/dialer/incall/video/answer/ui/VideoAnswerFragmentPeer");
    public final defpackage.qnr b;
    public final agtj c;
    public final ahpz d;
    public final defpackage.pnb e;
    public final defpackage.oyl f;
    public final urs g;
    public final defpackage.qtm h;
    public final defpackage.agzc i;
    public final odo j;
    public defpackage.qnf k;
    public final defpackage.qnu l;
    public final zpm m;
    public final iyh n;
    public final gpd o;
    public final her p;
    public final defpackage.afpl q;
    private final android.view.WindowManager r;
    private final tec s;
    private final mgu t;
    private final aoin u;

    public qnv(defpackage.qnr qnrVar, defpackage.afpl afplVar, agtj agtjVar, ahpz ahpzVar, defpackage.pnb pnbVar, her herVar, defpackage.oyl oylVar, urs ursVar, defpackage.qtm qtmVar, defpackage.agzc agzcVar, odo odoVar, android.view.WindowManager windowManager, tec tecVar, gpd gpdVar, zpm zpmVar, mgu mguVar, aoin aoinVar) {
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(oylVar, "tidePodsAnswerMethod");
        aooh.f(qtmVar, "previewSurfaceTexture");
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(zpmVar, "callScopes");
        aooh.f(mguVar, "recorder");
        aooh.f(aoinVar, "enableFlippablesVideoCalling");
        this.b = qnrVar;
        this.q = afplVar;
        this.c = agtjVar;
        this.d = ahpzVar;
        this.e = pnbVar;
        this.p = herVar;
        this.f = oylVar;
        this.g = ursVar;
        this.h = qtmVar;
        this.i = agzcVar;
        this.j = odoVar;
        this.r = windowManager;
        this.s = tecVar;
        this.o = gpdVar;
        this.m = zpmVar;
        this.t = mguVar;
        this.u = aoinVar;
        this.n = new iyh(this, 20);
        this.l = new defpackage.qnu(this);
    }

    public static final mhc l(android.util.Size size) {
        return gus.az(new mhc[]{gus.au(size.getWidth()), gus.au(size.getHeight())});
    }

    private final int m() {
        android.view.Display displayM;
        if (j()) {
            try {
                android.content.Context contextZ = this.b.z();
                if (contextZ != null && (displayM = baa$.ExternalSyntheticApiModelOutline1.m(contextZ)) != null) {
                    return displayM.getRotation();
                }
            } catch (java.lang.UnsupportedOperationException e) {
                a.d().k(e).l("com/android/dialer/incall/video/answer/ui/VideoAnswerFragmentPeer", "getDisplayRotation", 517, "VideoAnswerFragmentPeer.kt").v("Falling back to default display rotation");
            }
        }
        return this.r.getDefaultDisplay().getRotation();
    }

    private final boolean n() {
        az azVarG = this.b.G();
        if (azVarG != null) {
            return defpackage.rhx.c(azVarG);
        }
        return false;
    }

    public final android.view.TextureView a() {
        android.view.View viewFindViewById = this.b.N().findViewById(2131428407);
        aooh.e(viewFindViewById, "findViewById(...)");
        return (android.view.TextureView) viewFindViewById;
    }

    public final android.view.View b() {
        android.view.View viewFindViewById = this.b.N().findViewById(2131427533);
        aooh.e(viewFindViewById, "findViewById(...)");
        return viewFindViewById;
    }

    public final android.view.View c() {
        android.view.View viewFindViewById = this.b.N().findViewById(2131429424);
        aooh.e(viewFindViewById, "findViewById(...)");
        return viewFindViewById;
    }

    public final defpackage.qnd d() {
        java.lang.String str;
        defpackage.qnf qnfVar = this.k;
        if (qnfVar == null || (str = qnfVar.a) == null) {
            return null;
        }
        j$.util.Optional optionalV = this.p.V(str);
        aooh.e(optionalV, "forCallId(...)");
        return (defpackage.qnd) aooh.q(optionalV);
    }

    public final com.google.android.material.chip.Chip e() {
        java.lang.Object objFindViewById = this.b.N().findViewById(2131429382);
        aooh.e(objFindViewById, "findViewById(...)");
        return (com.google.android.material.chip.Chip) objFindViewById;
    }

    public final com.google.android.material.chip.Chip f() {
        java.lang.Object objFindViewById = this.b.N().findViewById(2131429383);
        aooh.e(objFindViewById, "findViewById(...)");
        return (com.google.android.material.chip.Chip) objFindViewById;
    }

    public final void g() {
        j$.util.Optional optional;
        android.util.Size size;
        defpackage.qnf qnfVar = this.k;
        defpackage.pus pusVar = qnfVar != null ? qnfVar.f : null;
        if (pusVar == null) {
            a.b().l("com/android/dialer/incall/video/answer/ui/VideoAnswerFragmentPeer", "updateLocalVideoScale", 453, "VideoAnswerFragmentPeer.kt").v("camera orientation is empty");
            return;
        }
        defpackage.pux puxVar = qnfVar.e;
        if (puxVar == null || (optional = puxVar.b) == null || (size = (android.util.Size) aooh.q(optional)) == null) {
            return;
        }
        if (pusVar.a() || n() || j()) {
            size = new android.util.Size(size.getHeight(), size.getWidth());
        }
        android.view.TextureView textureViewA = a();
        android.util.Size size2 = new android.util.Size(textureViewA.getWidth(), textureViewA.getHeight());
        mgu mguVar = this.t;
        new mgr(mguVar, size2).b(mgv.z).d(new defpackage.pvu(6));
        new mgr(mguVar, size).b(mgv.H).d(new defpackage.pvu(7));
        int i = 0;
        if (n() || j()) {
            int iM = m();
            if (iM != 0) {
                if (iM == 1) {
                    i = 90;
                } else if (iM == 2) {
                    i = 180;
                } else {
                    if (iM != 3) {
                        throw new java.lang.IllegalStateException(a.bj(iM, "Invalid rotation: "));
                    }
                    i = 270;
                }
            }
            i = -i;
            a.b().l("com/android/dialer/incall/video/answer/ui/VideoAnswerFragmentPeer", "getCameraToDisplayRotationDelta", 545, "VideoAnswerFragmentPeer.kt").w("cameraToDisplayRotationDelta is: %d", i);
        }
        defpackage.qtq qtqVarD = defpackage.qtq.d(size2, size, i);
        new mgr(mguVar, qtqVarD).b(mgv.B).d(new defpackage.pvu(8));
        qtqVarD.e(textureViewA);
    }

    public final void h(android.view.View view) {
        if (j()) {
            float f = view.getResources().getDisplayMetrics().density;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(2131428379);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131429424);
            if (frameLayout == null || textView == null) {
                return;
            }
            if (textView.getParent() != frameLayout) {
                android.view.ViewParent parent = textView.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(textView);
                }
                frameLayout.addView(textView);
            }
            int i = (int) (0.0f * f);
            textView.setPadding(i, i, i, i);
            textView.setCompoundDrawablePadding((int) (f + f));
        }
    }

    public final void i() {
        urs ursVar = this.g;
        defpackage.qnr qnrVar = this.b;
        ursVar.c(qnrVar);
        ursVar.h(qnrVar);
        defpackage.qnf qnfVar = this.k;
        if (qnfVar == null || !qnfVar.b) {
            return;
        }
        if (qnrVar.H().isInMultiWindowMode()) {
            ursVar.b(qnrVar);
        } else {
            ursVar.j(qnrVar);
        }
    }

    public final boolean j() {
        aoin aoinVar = this.u;
        android.content.Context contextZ = this.b.z();
        return ((java.lang.Boolean) aoinVar.a()).booleanValue() && contextZ != null && this.s.a(contextZ);
    }

    public final void k(com.google.android.material.chip.Chip chip, int i, int i2) {
        android.content.Context contextA = this.b.A();
        chip.i(android.content.res.ColorStateList.valueOf(urg.c(contextA, 2130968924)));
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(urg.c(contextA, 2130969058));
        defpackage.afrz afrzVar = chip.c;
        if (afrzVar != null) {
            afrzVar.o(colorStateListValueOf);
        }
        chip.l(contextA.getColorStateList(2131099713));
        chip.j(contextA.getDrawable(i));
        chip.setText(i2);
        chip.setTextColor(urg.c(contextA, 2130969059));
    }
}
