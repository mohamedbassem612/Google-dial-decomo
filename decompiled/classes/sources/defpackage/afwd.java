package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afwd extends defpackage.afvs {
    private final float f;
    private final float g;
    private final float h;

    public afwd(android.view.View view) {
        super(view);
        android.content.res.Resources resources = view.getResources();
        this.f = resources.getDimension(2131166262);
        this.g = resources.getDimension(2131166261);
        this.h = resources.getDimension(2131166263);
    }

    public final void e() {
        if (super.b() != null) {
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            android.view.View view = this.a;
            animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_X, 1.0f), android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_Y, 1.0f));
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_Y, 1.0f));
                }
            }
            animatorSet.setDuration(this.d);
            animatorSet.start();
        }
    }

    public final void f(mk mkVar, int i) {
        if (super.d(mkVar) != null) {
            g(mkVar.b, mkVar.c == 0, i);
        }
    }

    public final void g(float f, boolean z, int i) {
        float fA = a(f);
        boolean zH = h(i);
        android.view.View view = this.a;
        int width = view.getWidth();
        float f2 = width;
        int height = view.getHeight();
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 > 0.0f) {
                float f4 = this.f / f2;
                float f5 = this.g / f2;
                float f6 = this.h / f3;
                if (zH) {
                    f2 = 0.0f;
                }
                boolean z2 = z == zH;
                view.setPivotX(f2);
                if (!z2) {
                    f5 = -f4;
                }
                android.animation.TimeInterpolator timeInterpolator = defpackage.afpc.a;
                float f7 = ((f5 + 0.0f) * fA) + 0.0f;
                float f8 = (fA * (f6 + 0.0f)) + 0.0f;
                float f9 = f7 + 1.0f;
                if (java.lang.Float.isNaN(f9)) {
                    return;
                }
                float f10 = 1.0f - f8;
                if (java.lang.Float.isNaN(f10)) {
                    return;
                }
                view.setScaleX(f9);
                view.setScaleY(f10);
                if (view instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        android.view.View childAt = viewGroup.getChildAt(i2);
                        childAt.setPivotX(zH ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                        childAt.setPivotY(-childAt.getTop());
                        float f11 = z2 ? 1.0f - f7 : 1.0f;
                        float f12 = f10 != 0.0f ? (f9 / f10) * f11 : 1.0f;
                        if (!java.lang.Float.isNaN(f11) && !java.lang.Float.isNaN(f12)) {
                            childAt.setScaleX(f11);
                            childAt.setScaleY(f12);
                        }
                    }
                }
            }
        }
    }

    public final boolean h(int i) {
        return (android.view.Gravity.getAbsoluteGravity(i, this.a.getLayoutDirection()) & 3) == 3;
    }
}
