package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class oli implements android.animation.ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ defpackage.oll a;
    private int b;

    public oli(defpackage.oll ollVar) {
        j$.util.Objects.requireNonNull(ollVar);
        this.a = ollVar;
        this.b = 0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int iIntValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = iIntValue - this.b;
        androidx.viewpager.widget.ViewPager viewPager = this.a.c;
        if (!viewPager.n) {
            throw new java.lang.IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (viewPager.c != null) {
            float f = i;
            viewPager.i += f;
            float scrollX = viewPager.getScrollX();
            float fB = viewPager.b();
            float f2 = viewPager.e * fB;
            float f3 = viewPager.f * fB;
            java.util.ArrayList arrayList = viewPager.b;
            defpackage.gmm gmmVar = (defpackage.gmm) arrayList.get(0);
            defpackage.gmm gmmVar2 = (defpackage.gmm) arrayList.get(arrayList.size() - 1);
            if (gmmVar.b != 0) {
                f2 = gmmVar.e * fB;
            }
            if (gmmVar2.b != viewPager.c.i() - 1) {
                f3 = gmmVar2.e * fB;
            }
            float f4 = scrollX - f;
            if (f4 >= f2) {
                f2 = f4 <= f3 ? f4 : f3;
            }
            int i2 = (int) f2;
            viewPager.i += f2 - i2;
            viewPager.scrollTo(i2, viewPager.getScrollY());
            viewPager.u(i2);
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(viewPager.o, android.os.SystemClock.uptimeMillis(), 2, viewPager.i, 0.0f, 0);
            viewPager.l.addMovement(motionEventObtain);
            motionEventObtain.recycle();
        }
        this.b = iIntValue;
    }
}
