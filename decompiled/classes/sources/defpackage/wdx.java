package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wdx {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/widget/bubble/impl/BubbleImpl");
    private final defpackage.rlv A;
    public final android.content.Context d;
    public final defpackage.urg e;
    public final defpackage.ajct f;
    public android.view.WindowManager.LayoutParams i;
    public android.view.WindowManager.LayoutParams j;
    public wdj k;
    public int m;
    public int n;
    android.animation.AnimatorSet p;
    public android.animation.AnimatorSet q;
    public android.animation.AnimatorSet r;
    public android.animation.AnimatorSet s;
    public boolean u;
    public final defpackage.tkl z;
    public defpackage.ahzi b = defpackage.ahvr.bI(new wdn(this, 1));
    public final defpackage.ahzi c = defpackage.ahvr.bI(new wdn(this, 2));
    public final defpackage.ahzi g = defpackage.ahvr.bI(new wdn(this, 3));
    public final defpackage.ahzi h = defpackage.ahvr.bI(new wdn(this, 4));
    private final defpackage.ahzi B = defpackage.ahvr.bI(new wdn(this, 5));
    public j$.util.Optional l = j$.util.Optional.empty();
    int y = 1;
    public defpackage.ahzi o = defpackage.ahvr.bI(new wdn(this, 6));
    public int t = -1;
    public defpackage.ahzi v = defpackage.ahvr.bI(new wdn(this, 7));
    final defpackage.ahzi w = defpackage.ahvr.bI(new wdn(this, 8));
    public defpackage.ahzi x = defpackage.ahvr.bI(new wdn(this, 9));

    public wdx(android.content.Context context, defpackage.rlv rlvVar, defpackage.urg urgVar, defpackage.ajct ajctVar, defpackage.tkl tklVar) {
        this.d = context;
        this.A = rlvVar;
        this.e = urgVar;
        this.f = ajctVar;
        this.z = tklVar;
    }

    private final android.animation.ValueAnimator o(int i, int i2, int i3, float f) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.setInterpolator(defpackage.wsc.bq((android.content.Context) this.b.eZ(), urq.d));
        valueAnimatorOfFloat.addUpdateListener(new wdl(this, f, i3, i));
        return valueAnimatorOfFloat;
    }

    private final android.animation.ValueAnimator p(int i, int i2) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(i, i2);
        valueAnimatorOfFloat.setInterpolator(defpackage.wsc.bq((android.content.Context) this.b.eZ(), urq.d));
        valueAnimatorOfFloat.addUpdateListener(new mh(this, 10, (byte[]) null));
        return valueAnimatorOfFloat;
    }

    private final wed q(android.view.View view) {
        int measuredWidth = m() ? view.getMeasuredWidth() : 0;
        android.graphics.Rect rect = new android.graphics.Rect(measuredWidth, 0, measuredWidth, 0);
        android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        float dimension = ((android.content.Context) this.b.eZ()).getResources().getDimension(2131165384);
        return new wed(dimension, dimension, rect, rect2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0052 A[PHI: r0 r4
      0x0052: PHI (r0v3 android.graphics.drawable.Drawable) = (r0v2 android.graphics.drawable.Drawable), (r0v18 android.graphics.drawable.Drawable) binds: [B:8:0x003f, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r4v1 android.graphics.drawable.Drawable) = (r4v0 android.graphics.drawable.Drawable), (r4v12 android.graphics.drawable.Drawable) binds: [B:8:0x003f, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    private final void r(wdh wdhVar, com.android.dialer.widget.bubble.impl.CheckableButton checkableButton) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        int dimensionPixelSize;
        int layoutDirectionFromLocale = android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault());
        int dimensionPixelSize2 = ((android.content.Context) this.b.eZ()).getResources().getDimensionPixelSize(2131165374);
        if (layoutDirectionFromLocale == 1) {
            drawable = wdhVar.b;
            drawable2 = wdhVar.a;
            if (drawable != null) {
                dimensionPixelSize = dimensionPixelSize2;
                dimensionPixelSize2 = ((android.content.Context) this.b.eZ()).getResources().getDimensionPixelSize(2131165375);
            } else {
                dimensionPixelSize = dimensionPixelSize2;
            }
        } else {
            drawable = wdhVar.a;
            drawable2 = wdhVar.b;
            if (drawable2 != null) {
                dimensionPixelSize = ((android.content.Context) this.b.eZ()).getResources().getDimensionPixelSize(2131165375);
            } else {
                dimensionPixelSize = dimensionPixelSize2;
            }
        }
        checkableButton.setPadding(dimensionPixelSize2, 0, dimensionPixelSize, 0);
        checkableButton.setCompoundDrawablesWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, drawable2, (android.graphics.drawable.Drawable) null);
        boolean zIsEnabled = checkableButton.isEnabled();
        boolean z = wdhVar.h;
        if (zIsEnabled != z) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "configureButton", 829, "BubbleImpl.java")).K("button enabled: %b %s", z, checkableButton);
        }
        checkableButton.setChecked(wdhVar.g);
        defpackage.dzs.i(checkableButton, new wdy(checkableButton, wdhVar.f));
        checkableButton.setEnabled(z);
        java.lang.String str = wdhVar.d;
        if (str != null) {
            checkableButton.setText(str);
            checkableButton.setContentDescription(android.text.TextUtils.concat(((android.content.Context) this.b.eZ()).getText(wdhVar.c), " ", str));
        } else {
            int i = wdhVar.c;
            checkableButton.setText(i);
            checkableButton.setContentDescription(((android.content.Context) this.b.eZ()).getString(i));
        }
        checkableButton.setOnClickListener(new wgf(this, wdhVar, 1, (byte[]) null));
    }

    private final void s() {
        java.lang.Object drawable = ((wdw) this.o.eZ()).c.getDrawable();
        if (drawable instanceof android.graphics.drawable.Animatable) {
            if (n()) {
                ((android.graphics.drawable.Animatable) drawable).start();
            } else {
                ((android.graphics.drawable.Animatable) drawable).stop();
            }
        }
    }

    final android.view.View a() {
        return ((wdw) this.o.eZ()).b;
    }

    public final void b(int i, boolean z) {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "collapse", 302, "BubbleImpl.java")).v("collapse");
        if (this.m != 2) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "collapse", 304, "BubbleImpl.java")).w("no collapse now. visibility: %d", this.m);
            return;
        }
        int i2 = this.y;
        if (i2 == 1 || i2 == 2) {
            defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "collapse", 308, "BubbleImpl.java");
            int i3 = this.y;
            java.lang.String strAe = defpackage.wsc.ae(i3);
            if (i3 == 0) {
                throw null;
            }
            aimwVar.y("no collapse now. expandState: %s", strAe);
            return;
        }
        if (this.n == 0) {
            this.n = i;
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "collapse", 315, "BubbleImpl.java")).w("endAction: %d", this.n);
        j(((android.content.Context) this.b.eZ()).getString(2132017157));
        if (this.y == 4) {
            this.s.removeAllListeners();
            this.s.cancel();
            this.s = null;
            c();
            return;
        }
        ((wdu) this.x.eZ()).b.setVisibility(4);
        ((wdw) this.o.eZ()).a(false);
        ((wdu) this.x.eZ()).a(false);
        int width = ((wdu) this.x.eZ()).a.getWidth() - ((wdw) this.o.eZ()).b.getWidth();
        int i4 = this.t;
        int i5 = width / 2;
        float f = 0.0f;
        if (i4 != -1 && z) {
            f = (i4 - this.i.y) / i5;
        }
        android.animation.ValueAnimator valueAnimatorO = o(this.i.x, this.i.x - i5, this.i.y, f);
        android.animation.ValueAnimator valueAnimatorA = q(((wdu) this.x.eZ()).c).a(((wdu) this.x.eZ()).c, true);
        defpackage.ahzi ahziVar = this.B;
        valueAnimatorA.setInterpolator((android.animation.TimeInterpolator) ahziVar.eZ());
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(((wdu) this.x.eZ()).c, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator((android.animation.TimeInterpolator) ahziVar.eZ());
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.p = animatorSet;
        animatorSet.setDuration(defpackage.wsc.bp((android.content.Context) this.b.eZ(), urp.d));
        if (this.t == -1) {
            this.p.playTogether(valueAnimatorA, objectAnimatorOfFloat, valueAnimatorO);
        } else {
            this.p.playTogether(valueAnimatorA, objectAnimatorOfFloat, valueAnimatorO, p(this.j.y, (this.j.y + this.t) - this.i.y));
            this.t = -1;
        }
        this.p.addListener(new wdp(this));
        this.p.start();
    }

    public final void c() {
        this.y = 1;
        this.p = null;
        ((wdw) this.o.eZ()).a(true);
        ((wdu) this.x.eZ()).a.setVisibility(4);
        if (!"removed".equals(((wdu) this.x.eZ()).a.getTag())) {
            ((android.view.WindowManager) this.g.eZ()).removeView(((wdu) this.x.eZ()).a);
            ((wdu) this.x.eZ()).a.setTag("removed");
        }
        if (this.n == 1) {
            f();
            this.n = 0;
        }
    }

    public final void d() {
        this.q = null;
        ((wdk) this.w.eZ()).a();
        ((wdw) this.o.eZ()).b.setVisibility(4);
        java.lang.Object tag = ((wdw) this.o.eZ()).b.getTag();
        defpackage.aimz aimzVar = a;
        if (tag != "removed") {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "defaultAfterHidingAnimation", 922, "BubbleImpl.java")).y("removeView: %s", ((wdw) this.o.eZ()).b.toString());
            ((android.view.WindowManager) this.g.eZ()).removeView(((wdw) this.o.eZ()).b);
            ((wdw) this.o.eZ()).b.setTag("removed");
        } else {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "defaultAfterHidingAnimation", 927, "BubbleImpl.java")).y("view already removed: %s", a().toString());
        }
        this.m = 0;
        s();
    }

    public final void e() {
        android.graphics.Rect rect = new android.graphics.Rect();
        a().getDrawingRect(rect);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rect);
        fn$.ExternalSyntheticApiModelOutline0.m(a(), arrayList);
        try {
            android.view.View.class.getMethod("setSystemGestureExclusionRects", java.util.List.class).invoke(a(), arrayList);
        } catch (java.lang.ReflectiveOperationException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "excludeRectangleForGestureAction", (char) 765, "BubbleImpl.java")).v("No such method or underlying method throws an exception or is inaccessible ");
        }
    }

    public final void f() {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "hide", 670, "BubbleImpl.java")).v("hide");
        int i = this.m;
        if (i == 0 || i == 3) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "hide", 672, "BubbleImpl.java")).w("already hidden, visibility: %d", this.m);
            return;
        }
        ((wdw) this.o.eZ()).a(false);
        if (this.m == 1) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "hide", 680, "BubbleImpl.java")).v("cancel previous enter animation");
            this.r.removeAllListeners();
            this.r.cancel();
            this.r = null;
            d();
            return;
        }
        if (this.p != null) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "hide", 690, "BubbleImpl.java")).v("set collapse end action to hide");
            this.n = 1;
            return;
        }
        int i2 = this.y;
        if (i2 == 4 || i2 == 3) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "hide", 696, "BubbleImpl.java")).v("going to collapse");
            b(1, false);
            return;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(((wdw) this.o.eZ()).b, "scaleX", 0.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(((wdw) this.o.eZ()).b, "scaleY", 0.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(((wdw) this.o.eZ()).d, "alpha", 0.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat4 = android.animation.ObjectAnimator.ofFloat(((wdw) this.o.eZ()).c, "alpha", 0.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.q = animatorSet;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        this.q.setInterpolator(new android.view.animation.AnticipateInterpolator());
        this.q.setDuration(defpackage.wsc.bp((android.content.Context) this.b.eZ(), urp.e));
        this.q.addListener(new wdr(this));
        this.q.start();
    }

    public final void g(defpackage.rmw rmwVar) {
        this.A.n(rmwVar);
    }

    final void h() {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "onMoveFinish", 616, "BubbleImpl.java")).v("onMoveFinish");
        ((wdw) this.o.eZ()).d.animate().translationZ(0.0f);
        ((wdk) this.w.eZ()).a();
        e();
    }

    final void i() {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "primaryButtonClick", 623, "BubbleImpl.java")).v("primaryButtonClick");
        if (this.m != 2) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "primaryButtonClick", 625, "BubbleImpl.java")).w("no click allowed. visibility: %d", this.m);
            return;
        }
        int i = this.y;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    g(defpackage.rmw.BUBBLE_V2_CLICK_TO_COLLAPSE);
                    b(0, true);
                    return;
                } else if (i2 != 3) {
                    return;
                }
            }
            defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "primaryButtonClick", 633, "BubbleImpl.java");
            int i3 = this.y;
            java.lang.String strAe = defpackage.wsc.ae(i3);
            if (i3 == 0) {
                throw null;
            }
            aimwVar.y("no click allowed. expandState: %s", strAe);
            return;
        }
        g(defpackage.rmw.BUBBLE_V2_CLICK_TO_EXPAND);
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl", "expand", 197, "BubbleImpl.java")).v("expand");
        this.b = defpackage.ahvr.bI(new wdn(this, 1));
        this.x = defpackage.ahvr.bI(new wdn(this, 10));
        l();
        defpackage.ahvr.bZ(this.y == 1, "bubble should be collpased to expand");
        j(((android.content.Context) this.b.eZ()).getString(2132017156));
        if (this.j == null) {
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(2038, 262688, -3);
            this.j = layoutParams;
            layoutParams.height = -2;
            this.j.width = -2;
        }
        this.j.gravity = this.i.gravity;
        this.j.x = this.i.x;
        this.j.y = this.i.y + ((wdw) this.o.eZ()).b.getHeight() + ((android.content.Context) this.b.eZ()).getResources().getDimensionPixelSize(2131165389);
        ((wdu) this.x.eZ()).a.setVisibility(0);
        ((wdu) this.x.eZ()).a.setTag(null);
        ((android.view.WindowManager) this.g.eZ()).addView(((wdu) this.x.eZ()).a, this.j);
        wdu wduVar = (wdu) this.x.eZ();
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcherM = ae$.ExternalSyntheticApiModelOutline0.m(wduVar.a);
            if (onBackInvokedDispatcherM == null) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).i(defpackage.zct.b)).l("com/android/dialer/widget/bubble/impl/BubbleImpl$MenuViewHolder", "registerOnBackInvokedCallback", (char) 1195, "BubbleImpl.java")).v("Null onBackInvokedDispatcher, can't handle onBackInvoked events");
            } else {
                ae$.ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcherM, 1000000, new ls(wduVar, 4));
            }
        } else {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/widget/bubble/impl/BubbleImpl$MenuViewHolder", "registerOnBackInvokedCallback", 1201, "BubbleImpl.java")).v("Below Android T OnBackPressed");
            wduVar.a.b = new aprf(wduVar);
        }
        ((wdu) this.x.eZ()).b.setVisibility(4);
        ((wdw) this.o.eZ()).a(false);
        ((wdu) this.x.eZ()).a.measure(0, 0);
        wdw wdwVar = (wdw) this.o.eZ();
        int measuredHeight = ((wdu) this.x.eZ()).a.getMeasuredHeight();
        web webVar = wdwVar.a;
        int iA = webVar.g - ((int) webVar.m.a(webVar.c.i));
        int i4 = iA >= measuredHeight ? 0 : measuredHeight - iA;
        if (i4 != 0) {
            this.t = this.i.y;
        }
        int measuredWidth = (((wdu) this.x.eZ()).a.getMeasuredWidth() - ((wdw) this.o.eZ()).b.getWidth()) / 2;
        android.animation.ValueAnimator valueAnimatorO = o(this.i.x, this.i.x + measuredWidth, this.i.y, (-i4) / measuredWidth);
        android.animation.ValueAnimator valueAnimatorA = q(((wdu) this.x.eZ()).c).a(((wdu) this.x.eZ()).c, false);
        defpackage.ahzi ahziVar = this.B;
        valueAnimatorA.setInterpolator((android.animation.TimeInterpolator) ahziVar.eZ());
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(((wdu) this.x.eZ()).c, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator((android.animation.TimeInterpolator) ahziVar.eZ());
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.s = animatorSet;
        if (i4 == 0) {
            animatorSet.playTogether(valueAnimatorA, objectAnimatorOfFloat, valueAnimatorO);
        } else {
            this.s.playTogether(valueAnimatorA, objectAnimatorOfFloat, valueAnimatorO, p(this.j.y, this.j.y - i4));
        }
        this.s.setDuration(defpackage.wsc.bp((android.content.Context) this.b.eZ(), urp.d));
        this.s.addListener(new wdo(this));
        this.s.start();
    }

    public final void j(java.lang.String str) {
        ((wdw) this.o.eZ()).b.setAccessibilityDelegate(new wds(this, str));
    }

    public final void k() {
        this.v = defpackage.ahvr.bI(new wdn(this, 7));
        ((wdw) this.o.eZ()).d.setBackground(this.k.c);
        ((wdw) this.o.eZ()).c.setImageIcon(this.k.b);
        s();
        l();
        b(0, true);
    }

    public final void l() {
        r((wdh) this.k.e.get(0), ((wdu) this.x.eZ()).d);
        r((wdh) this.k.e.get(1), ((wdu) this.x.eZ()).e);
        r((wdh) this.k.e.get(2), ((wdu) this.x.eZ()).f);
        r((wdh) this.k.e.get(3), ((wdu) this.x.eZ()).g);
    }

    public final boolean m() {
        return (this.i.gravity & 8388613) == 8388613;
    }

    public final boolean n() {
        int i = this.m;
        return i == 2 || i == 1 || i == 3;
    }
}
