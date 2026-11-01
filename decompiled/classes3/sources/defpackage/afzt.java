package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afzt implements defpackage.afzn {
    public final /* synthetic */ defpackage.afzu a;

    public afzt(defpackage.afzu afzuVar) {
        j$.util.Objects.requireNonNull(afzuVar);
        this.a = afzuVar;
    }

    private final int g(android.view.View view) {
        int marginEnd = ((android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        defpackage.afzu afzuVar = this.a;
        int iB = afzuVar.b(afzuVar.q);
        return agab.L(afzuVar.q) ? iB - marginEnd : ((iB + afzuVar.q.getWidth()) + marginEnd) - afzuVar.a.getWidth();
    }

    private final int h() {
        defpackage.afzu afzuVar = this.a;
        android.widget.FrameLayout frameLayout = afzuVar.e;
        return (afzuVar.c(afzuVar.q) + (afzuVar.q.getHeight() / 2)) - (frameLayout.getTop() + (frameLayout.getHeight() / 2));
    }

    private final android.animation.Animator i(boolean z, android.view.View view) {
        defpackage.afzu afzuVar = this.a;
        android.widget.TextView textView = afzuVar.q.C;
        if (android.text.TextUtils.isEmpty(textView.getText()) || z) {
            textView = afzuVar.q.B;
        }
        int iB = afzuVar.b(textView) - afzuVar.b(view);
        if (agab.L(afzuVar.q)) {
            iB += textView.getWidth() - view.getWidth();
        }
        return k(z, view, iB, h());
    }

    private final android.animation.AnimatorSet j(boolean z) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        defpackage.afzu afzuVar = this.a;
        android.support.v7.widget.Toolbar toolbar = afzuVar.f;
        android.widget.ImageButton imageButtonB = afvm.b(toolbar);
        if (imageButtonB != null) {
            android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(afzuVar.a(afvm.b(afzuVar.q), imageButtonB), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(defpackage.afuk.b(imageButtonB));
            android.animation.ValueAnimator valueAnimatorOfFloat2 = android.animation.ValueAnimator.ofFloat(h(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(defpackage.afuk.c(imageButtonB));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        }
        android.view.View viewA = afvm.a(toolbar);
        if (viewA != null) {
            android.animation.ValueAnimator valueAnimatorOfFloat3 = android.animation.ValueAnimator.ofFloat(afzuVar.a(afvm.a(afzuVar.q), viewA), 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(defpackage.afuk.b(viewA));
            android.animation.ValueAnimator valueAnimatorOfFloat4 = android.animation.ValueAnimator.ofFloat(h(), 0.0f);
            valueAnimatorOfFloat4.addUpdateListener(defpackage.afuk.c(viewA));
            animatorSet.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        }
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(defpackage.afva.a(z, afpc.b));
        return animatorSet;
    }

    private static final android.animation.Animator k(boolean z, android.view.View view, int i, int i2) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(i, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(defpackage.afuk.b(view));
        android.animation.ValueAnimator valueAnimatorOfFloat2 = android.animation.ValueAnimator.ofFloat(i2, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(defpackage.afuk.c(view));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(defpackage.afva.a(z, afpc.b));
        return animatorSet;
    }

    @Override // defpackage.afzn
    public final android.animation.AnimatorSet a(boolean z) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        defpackage.afzu afzuVar = this.a;
        if (afzuVar.p == null) {
            animatorSet.playTogether(j(z));
        }
        android.animation.Animator[] animatorArr = new android.animation.Animator[10];
        android.animation.TimeInterpolator timeInterpolator = z ? afpc.a : afpc.b;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(true != z ? 250L : 300L);
        valueAnimatorOfFloat.setStartDelay(true != z ? 0L : 100L);
        valueAnimatorOfFloat.setInterpolator(defpackage.afva.a(z, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(defpackage.afuk.a(afzuVar.b));
        animatorArr[0] = valueAnimatorOfFloat;
        long j = true != z ? 250L : 300L;
        defpackage.afwb afwbVar = afzuVar.o;
        android.graphics.Rect rectM = afwbVar.g;
        android.graphics.Rect rectF = afwbVar.h;
        if (rectM == null) {
            rectM = agab.M(afzuVar.a);
        }
        if (rectF == null) {
            rectF = agab.F(afzuVar.c, afzuVar.q);
        }
        final android.graphics.Rect rect = new android.graphics.Rect(rectF);
        final float fE = afzuVar.q.E();
        float[] fArr = afzuVar.c.b;
        float[] fArrI = afwbVar.i();
        int i = 6;
        final float[] fArr2 = {java.lang.Math.max(fArr[0], fArrI[0]), java.lang.Math.max(fArr[1], fArrI[1]), java.lang.Math.max(fArr[2], fArrI[2]), java.lang.Math.max(fArr[3], fArrI[3]), java.lang.Math.max(fArr[4], fArrI[4]), java.lang.Math.max(fArr[5], fArrI[5]), java.lang.Math.max(fArr[6], fArrI[6]), java.lang.Math.max(fArr[7], fArrI[7])};
        android.animation.ValueAnimator valueAnimatorOfObject = android.animation.ValueAnimator.ofObject(new defpackage.afuz(rect), rectF, rectM);
        valueAnimatorOfObject.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: afzs
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                float[] fArr3 = fArr2;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f = fArr3[0];
                android.animation.TimeInterpolator timeInterpolator2 = afpc.a;
                float f2 = fE;
                float[] fArr4 = {((f - f2) * animatedFraction) + f2, ((fArr3[1] - f2) * animatedFraction) + f2, ((fArr3[2] - f2) * animatedFraction) + f2, ((fArr3[3] - f2) * animatedFraction) + f2, ((fArr3[4] - f2) * animatedFraction) + f2, ((fArr3[5] - f2) * animatedFraction) + f2, f2 + ((fArr3[6] - f2) * animatedFraction), f2 + (animatedFraction * (fArr3[7] - f2))};
                android.graphics.Rect rect2 = rect;
                this.a.a.c.a(rect2.left, rect2.top, rect2.right, rect2.bottom, fArr4);
            }
        });
        valueAnimatorOfObject.setDuration(j);
        android.animation.TimeInterpolator timeInterpolator2 = afpc.b;
        valueAnimatorOfObject.setInterpolator(defpackage.afva.a(z, timeInterpolator2));
        animatorArr[1] = valueAnimatorOfObject;
        animatorArr[2] = afzuVar.d(z);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        android.animation.Animator[] animatorArr2 = new android.animation.Animator[3];
        android.animation.ValueAnimator valueAnimatorOfFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(true != z ? 83L : 150L);
        valueAnimatorOfFloat2.setStartDelay(true != z ? 0L : 75L);
        android.animation.TimeInterpolator timeInterpolator3 = afpc.a;
        valueAnimatorOfFloat2.setInterpolator(defpackage.afva.a(z, timeInterpolator3));
        android.view.View view = afzuVar.k;
        com.google.android.material.internal.TouchObserverFrameLayout touchObserverFrameLayout = afzuVar.l;
        valueAnimatorOfFloat2.addUpdateListener(defpackage.afuk.a(view, touchObserverFrameLayout));
        animatorArr2[0] = valueAnimatorOfFloat2;
        android.animation.ValueAnimator valueAnimatorOfFloat3 = android.animation.ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat3.setDuration(j);
        valueAnimatorOfFloat3.setInterpolator(defpackage.afva.a(z, timeInterpolator2));
        valueAnimatorOfFloat3.addUpdateListener(defpackage.afuk.c(view));
        animatorArr2[1] = valueAnimatorOfFloat3;
        android.animation.ValueAnimator valueAnimatorOfFloat4 = android.animation.ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat4.setDuration(j);
        valueAnimatorOfFloat4.setInterpolator(defpackage.afva.a(z, timeInterpolator2));
        valueAnimatorOfFloat4.addUpdateListener(new defpackage.afuk(new defpackage.afui(0), touchObserverFrameLayout));
        animatorArr2[2] = valueAnimatorOfFloat4;
        animatorSet2.playTogether(animatorArr2);
        animatorArr[3] = animatorSet2;
        android.view.View view2 = afzuVar.d;
        animatorArr[4] = k(z, view2, g(view2), h());
        android.view.View view3 = afzuVar.g;
        animatorArr[5] = k(z, view3, g(view3) - (afzuVar.q.getPaddingEnd() - view3.getPaddingEnd()), h());
        android.animation.ValueAnimator valueAnimatorOfFloat5 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat5.setDuration(j);
        valueAnimatorOfFloat5.setInterpolator(defpackage.afva.a(z, timeInterpolator2));
        if (afzuVar.a.q) {
            valueAnimatorOfFloat5.addUpdateListener(new defpackage.afue(afvm.a(view3), afvm.a(afzuVar.f)));
        }
        animatorArr[6] = valueAnimatorOfFloat5;
        android.widget.EditText editText = afzuVar.j;
        animatorArr[7] = i(z, editText);
        animatorArr[8] = i(z, afzuVar.h);
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        if (afzuVar.q != null && !android.text.TextUtils.equals(editText.getText(), afzuVar.q.H())) {
            android.animation.ValueAnimator valueAnimatorOfFloat6 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat6.addUpdateListener(new defpackage.afzo(this, 4));
            animatorSet3.playTogether(valueAnimatorOfFloat6);
        }
        if (afzuVar.q != null && android.text.TextUtils.equals(editText.getText(), afzuVar.q.H())) {
            android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, editText.getWidth(), editText.getHeight());
            android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(afzuVar.q.B.getWidth(), editText.getWidth());
            valueAnimatorOfInt.addUpdateListener(new defpackage.wer(this, rect2, i));
            animatorSet3.playTogether(valueAnimatorOfInt);
        }
        animatorSet3.setDuration(j);
        animatorSet3.setInterpolator(defpackage.afva.a(z, timeInterpolator3));
        animatorArr[9] = animatorSet3;
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    @Override // defpackage.afzn
    public final java.util.List b(boolean z) {
        return new java.util.ArrayList();
    }

    @Override // defpackage.afzn
    public final void c(boolean z) {
        float f = true != z ? 0.0f : 1.0f;
        defpackage.afzu afzuVar = this.a;
        afzuVar.l(f);
        android.widget.EditText editText = afzuVar.j;
        editText.setAlpha(1.0f);
        com.google.android.material.search.SearchBar searchBar = afzuVar.q;
        if (searchBar != null) {
            searchBar.B.setAlpha(1.0f);
        }
        editText.setClipBounds(null);
        com.google.android.material.internal.ClippableRoundedCornerLayout clippableRoundedCornerLayout = afzuVar.c;
        clippableRoundedCornerLayout.a = null;
        clippableRoundedCornerLayout.b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        clippableRoundedCornerLayout.invalidate();
        if (z) {
            return;
        }
        afzuVar.o.i = null;
    }

    @Override // defpackage.afzn
    public final void d(boolean z) {
        this.a.l(true != z ? 1.0f : 0.0f);
    }

    @Override // defpackage.afzn
    public final void e() {
        defpackage.afzu afzuVar = this.a;
        android.support.v7.widget.Toolbar toolbar = afzuVar.g;
        android.view.Menu menuF = toolbar.f();
        if (menuF != null) {
            menuF.clear();
        }
        if (!afzuVar.m()) {
            toolbar.setVisibility(8);
            return;
        }
        toolbar.o(afzuVar.q.G);
        defpackage.afzu.n(toolbar);
        toolbar.setVisibility(0);
    }

    @Override // defpackage.afzn
    public final void f() {
        j(false).start();
    }
}
