package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jvi implements android.view.ViewTreeObserver.OnPreDrawListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public jvi(defpackage.jvk jvkVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(jvkVar);
        this.a = jvkVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.jvf jvfVar = ((defpackage.jvk) this.a).c;
            com.google.android.material.bottomsheet.BottomSheetBehavior.h(jvfVar.c().findViewById(2131427944)).C(jvfVar.N().findViewById(2131427901).getHeight() + jvfVar.c().findViewById(2131428292).getHeight());
            android.view.View viewFindViewById = jvfVar.c().findViewById(2131427900);
            int i2 = ((android.view.ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).bottomMargin;
            int height = jvfVar.c().findViewById(2131428292).getHeight();
            if (i2 != height) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, height);
                viewFindViewById.requestLayout();
                return false;
            }
        } else if (i == 1) {
            ((androidx.coordinatorlayout.widget.CoordinatorLayout) this.a).i(0);
        } else if (i == 2) {
            ((ackr) this.a).a();
        } else if (i != 3) {
            java.lang.Object obj = this.a;
            if (i != 4) {
                agiu agiuVar = (agiu) obj;
                if (agiuVar.a == null || !agiuVar.a().isAttachedToWindow()) {
                    agiu.e.B("Anchor view is not initialized or not attached to window, skipping layout");
                    aomy aomyVar = agiuVar.c;
                    if (aomyVar != null) {
                        aomyVar.a();
                    }
                } else {
                    android.widget.FrameLayout frameLayout = agiuVar.b;
                    int width = frameLayout.getWidth();
                    int height2 = frameLayout.getHeight();
                    int iT = aooc.t(width, height2);
                    if (width != iT || height2 != iT) {
                        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                        layoutParams.width = iT;
                        layoutParams.height = iT;
                        frameLayout.setLayoutParams(layoutParams);
                        return false;
                    }
                    agiuVar.getViewTreeObserver().removeOnPreDrawListener(this);
                    int[] iArr = new int[2];
                    agiuVar.a().getLocationOnScreen(iArr);
                    int width2 = agiuVar.a().getWidth();
                    int height3 = agiuVar.a().getHeight();
                    int[] iArr2 = new int[2];
                    agiuVar.getLocationOnScreen(iArr2);
                    int i3 = iArr[0] - iArr2[0];
                    int i4 = iArr[1] - iArr2[1];
                    float f = width2;
                    float f2 = height3;
                    float f3 = iT;
                    double d = true != ((java.lang.Boolean) agiuVar.d.a()).booleanValue() ? 30.0d : -30.0d;
                    float f4 = f3 / 2.0f;
                    float f5 = f / 2.0f;
                    double radians = java.lang.Math.toRadians(d);
                    double dimension = (f4 - f5) - agiuVar.getResources().getDimension(2131167780);
                    float f6 = i3 + f5;
                    frameLayout.setX((f6 - f4) - ((float) (dimension * java.lang.Math.sin(radians))));
                    float f7 = i4 + (f2 / 2.0f);
                    frameLayout.setY((f7 - f4) + ((float) (dimension * java.lang.Math.cos(radians))));
                    float x = f6 - frameLayout.getX();
                    float y = f7 - frameLayout.getY();
                    android.graphics.drawable.Drawable background = frameLayout.getBackground();
                    defpackage.aggz aggzVar = background instanceof defpackage.aggz ? (defpackage.aggz) background : null;
                    if (aggzVar != null) {
                        aggzVar.d = d;
                        aggzVar.b = x;
                        aggzVar.c = y;
                        aggzVar.e = f5 - agiuVar.a().getPaddingStart();
                        android.graphics.Rect bounds = aggzVar.getBounds();
                        aooh.e(bounds, "getBounds(...)");
                        aggzVar.b(bounds);
                        aggzVar.invalidateSelf();
                    }
                    android.graphics.drawable.Drawable background2 = frameLayout.getBackground();
                    defpackage.aggz aggzVar2 = background2 instanceof defpackage.aggz ? (defpackage.aggz) background2 : null;
                    if (aggzVar2 != null) {
                        frameLayout.setAlpha(1.0f);
                        aggzVar2.a(0.0f);
                        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setDuration(800L);
                        valueAnimatorOfFloat.setInterpolator(new android.view.animation.OvershootInterpolator(0.0f));
                        valueAnimatorOfFloat.addUpdateListener(new afzo(aggzVar2, 11));
                        valueAnimatorOfFloat.start();
                    }
                }
            } else {
                android.widget.ImageView imageView = (android.widget.ImageView) obj;
                imageView.getViewTreeObserver().removeOnPreDrawListener(this);
                if (a.n() && imageView.getDrawable() != null && !(imageView.getDrawable() instanceof android.graphics.drawable.VectorDrawable) && !(imageView.getDrawable() instanceof gmf) && (android.os.Build.TYPE.equals("userdebug") || android.os.Build.TYPE.equals("eng"))) {
                    android.util.Log.w("HeaderAreaStyler", "To achieve scaling icon in SetupDesign lib, should use vector drawable icon from ".concat(java.lang.String.valueOf(imageView.getContext().getPackageName())));
                }
            }
        } else {
            aggf aggfVar = (aggf) this.a;
            if (!aggfVar.y) {
                if (aggfVar.f.getViewTreeObserver().isAlive()) {
                    aggfVar.f.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                aggfVar.A = null;
            } else if (aggfVar.f.getVisibility() != 8) {
                aggfVar.f.setVisibility(8);
                if (aggfVar.f.getRootView() != null) {
                    aggfVar.f.getRootView().requestApplyInsets();
                    return false;
                }
                aggfVar.f.requestApplyInsets();
                return false;
            }
        }
        return true;
    }

    public jvi(android.view.View view, int i) {
        this.$cid = i;
        this.a = view;
    }

    public jvi(ackr ackrVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ackrVar);
        this.a = ackrVar;
    }

    public jvi(aggf aggfVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aggfVar);
        this.a = aggfVar;
    }
}
