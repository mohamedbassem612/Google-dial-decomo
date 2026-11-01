package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afwb extends afvs {
    public float f;
    public android.graphics.Rect g;
    public android.graphics.Rect h;
    public float[] i;
    private final float j;
    private final float k;

    public afwb(android.view.View view) {
        super(view);
        android.content.res.Resources resources = view.getResources();
        this.j = resources.getDimension(2131166260);
        this.k = resources.getDimension(2131166259);
    }

    private static final int j(android.view.WindowInsets windowInsets, int i) {
        android.view.RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    public final android.animation.AnimatorSet e(android.view.View view) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.view.View view2 = this.a;
        animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_X, 1.0f), android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_Y, 1.0f), android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f), android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new defpackage.afwa(this, view));
        return animatorSet;
    }

    public final void f(android.view.View view) {
        if (super.b() != null) {
            android.animation.AnimatorSet animatorSetE = e(view);
            android.view.View view2 = this.a;
            if (view2 instanceof com.google.android.material.internal.ClippableRoundedCornerLayout) {
                com.google.android.material.internal.ClippableRoundedCornerLayout clippableRoundedCornerLayout = (com.google.android.material.internal.ClippableRoundedCornerLayout) view2;
                android.animation.ValueAnimator valueAnimatorOfObject = android.animation.ValueAnimator.ofObject(new defpackage.afvz(), clippableRoundedCornerLayout.b, i());
                valueAnimatorOfObject.addUpdateListener(new mh(clippableRoundedCornerLayout, 15, (byte[]) null));
                animatorSetE.playTogether(valueAnimatorOfObject);
            }
            animatorSetE.setDuration(this.d);
            animatorSetE.start();
            g();
        }
    }

    public final void g() {
        this.f = 0.0f;
        this.g = null;
        this.h = null;
    }

    public final void h(mk mkVar, android.view.View view, float f) {
        if (super.d(mkVar) != null) {
            if (view != null && view.getVisibility() != 4) {
                view.setVisibility(4);
            }
            int i = mkVar.c;
            float f2 = mkVar.b;
            float f3 = mkVar.a;
            float fA = a(f2);
            android.view.View view2 = this.a;
            float width = view2.getWidth();
            float height = view2.getHeight();
            if (width <= 0.0f || height <= 0.0f) {
                return;
            }
            android.animation.TimeInterpolator timeInterpolator = afpc.a;
            float f4 = (-0.100000024f) * fA;
            float f5 = this.j;
            float fMax = ((java.lang.Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - f5) + 0.0f) * fA) + 0.0f;
            int i2 = i != 0 ? -1 : 1;
            float f6 = f4 + 1.0f;
            float fMin = java.lang.Math.min(java.lang.Math.max(0.0f, ((height - (f6 * height)) / 2.0f) - f5), this.k);
            float f7 = f3 - this.f;
            float fAbs = (((java.lang.Math.abs(f7) / height) * (fMin + 0.0f)) + 0.0f) * java.lang.Math.signum(f7);
            if (java.lang.Float.isNaN(f6)) {
                return;
            }
            float f8 = fMax * i2;
            if (java.lang.Float.isNaN(f8) || java.lang.Float.isNaN(fAbs)) {
                return;
            }
            view2.setScaleX(f6);
            view2.setScaleY(f6);
            view2.setTranslationX(f8);
            view2.setTranslationY(fAbs);
            if (view2 instanceof com.google.android.material.internal.ClippableRoundedCornerLayout) {
                float[] fArrI = i();
                float f9 = fArrI[0];
                float f10 = fArrI[1];
                float f11 = fArrI[2];
                float f12 = fArrI[3];
                float f13 = fArrI[4];
                float f14 = fArrI[5];
                float f15 = fArrI[6];
                float f16 = fArrI[7];
                ((com.google.android.material.internal.ClippableRoundedCornerLayout) view2).b(new float[]{f9 + ((f - f9) * fA), f10 + ((f - f10) * fA), f11 + ((f - f11) * fA), f12 + ((f - f12) * fA), f13 + ((f - f13) * fA), f14 + ((f - f14) * fA), f15 + ((f - f15) * fA), f16 + (fA * (f - f16))});
            }
        }
    }

    public final float[] i() {
        float[] fArr;
        android.view.View view;
        android.view.WindowInsets rootWindowInsets;
        int i;
        char c;
        int iJ;
        int iJ2;
        char c2;
        float[] fArr2 = this.i;
        if (fArr2 != null) {
            return fArr2;
        }
        if (android.os.Build.VERSION.SDK_INT < 31 || (rootWindowInsets = (view = this.a).getRootWindowInsets()) == null) {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        } else {
            android.util.DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i4 = iArr[0];
            int i5 = iArr[1];
            int width = view.getWidth();
            int height = view.getHeight();
            if (i4 != 0) {
                i = i4;
                c = 7;
                iJ = 0;
            } else if (i5 == 0) {
                i = 0;
                iJ = j(rootWindowInsets, 0);
                c = 7;
                i5 = 0;
            } else {
                iJ = 0;
                i = 0;
                c = 7;
            }
            int i6 = i + width;
            if (i6 < i2 || i5 != 0) {
                iJ2 = 0;
                c2 = 6;
            } else {
                iJ2 = j(rootWindowInsets, 1);
                c2 = 6;
                i5 = 0;
            }
            int iJ3 = (i6 < i2 || i5 + height < i3) ? 0 : j(rootWindowInsets, 2);
            int iJ4 = (i != 0 || i5 + height < i3) ? 0 : j(rootWindowInsets, 3);
            fArr = new float[8];
            float f = iJ;
            fArr[0] = f;
            fArr[1] = f;
            float f2 = iJ2;
            fArr[2] = f2;
            fArr[3] = f2;
            float f3 = iJ3;
            fArr[4] = f3;
            fArr[5] = f3;
            float f4 = iJ4;
            fArr[c2] = f4;
            fArr[c] = f4;
        }
        this.i = fArr;
        return fArr;
    }
}
