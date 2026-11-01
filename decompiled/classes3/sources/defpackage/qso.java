package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qso {
    public static final aimz a = aimz.i("com/android/dialer/incall/video/ui/PreviewPositioner");
    public final defpackage.qsr b;
    public int d;
    public int e;
    public boolean f;
    private final ems i;
    private final ajwr j;
    public final android.graphics.Rect c = new android.graphics.Rect();
    public defpackage.qqp g = defpackage.qqp.a().a();
    public j$.util.Optional h = j$.util.Optional.empty();

    public qso(defpackage.qsr qsrVar, ems emsVar, ajwr ajwrVar) {
        this.b = qsrVar;
        this.i = emsVar;
        this.j = ajwrVar;
    }

    public static android.util.Size c(android.view.View view) {
        dtv layoutParams = view.findViewById(2131429425).getLayoutParams();
        return new android.util.Size(layoutParams.width + ((view.findViewById(2131429411).getLayoutParams().width - view.findViewById(2131429416).getLayoutParams().width) << 1), layoutParams.height);
    }

    public final float a(float f, android.util.Size size) {
        return -((this.d - size.getWidth()) - f);
    }

    public final android.graphics.PointF b(android.view.View view) {
        android.util.Size sizeC = c(view);
        int i = this.g.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        float height = 0.0f;
        float width = (i2 == 0 || i2 != 1) ? 0.0f : this.d - sizeC.getWidth();
        if (this.f) {
            int width2 = sizeC.getWidth() - this.b.dX().getDimensionPixelSize(2131167953);
            int i3 = this.g.a;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            float f = width2;
            if (i4 == 0) {
                width -= f;
            } else if (i4 == 1) {
                width += f;
            }
        }
        if (k()) {
            width = a(width, sizeC);
        }
        defpackage.qsr qsrVar = this.b;
        int dimensionPixelOffset = qsrVar.dX().getDimensionPixelOffset(2131167955);
        int i5 = this.g.b;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        if (i6 == 0) {
            height = dimensionPixelOffset;
        } else if (i6 == 1) {
            height = (qsrVar.N().findViewById(2131429413).getHeight() - dimensionPixelOffset) - sizeC.getHeight();
        }
        return new android.graphics.PointF(width, height);
    }

    public final android.view.View d() {
        int i = this.g.a;
        defpackage.qsr qsrVar = this.b;
        return i == 2 ? qsrVar.N().findViewById(2131429411) : qsrVar.N().findViewById(2131429412);
    }

    public final android.view.View e() {
        int i = this.g.a;
        defpackage.qsr qsrVar = this.b;
        return i == 2 ? qsrVar.N().findViewById(2131429412) : qsrVar.N().findViewById(2131429411);
    }

    public final android.view.View f() {
        return this.b.N().findViewById(2131429414);
    }

    public final void g() {
        android.view.View viewF = f();
        android.graphics.PointF pointFB = b(viewF);
        android.animation.TimeInterpolator timeInterpolatorBq = wsc.bq(viewF.getContext(), defpackage.urq.EASING_STANDARD_DECELERATE);
        j$.util.Optional optional = this.h;
        if (true == optional.isPresent()) {
            ((android.view.ViewPropertyAnimator) optional.get()).cancel();
        }
        android.view.ViewPropertyAnimator listener = viewF.animate().translationX(pointFB.x).translationY(pointFB.y).setInterpolator(timeInterpolatorBq).setDuration(wsc.bp(viewF.getContext(), defpackage.urp.DURATION_MEDIUM_2)).setListener(hrz.a(this.i, new defpackage.oxr(this, 12)));
        listener.start();
        this.h = j$.util.Optional.of(listener);
    }

    public final void h() {
        defpackage.qsr qsrVar = this.b;
        android.graphics.Insets insetsM$1 = baa$.ExternalSyntheticApiModelOutline1.m$1(baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m(qsrVar.H().getWindowManager())), baa$.ExternalSyntheticApiModelOutline1.m$2());
        int iM = da$.ExternalSyntheticApiModelOutline0.m(insetsM$1) + da$.ExternalSyntheticApiModelOutline0.m$2(insetsM$1);
        int iM$1 = da$.ExternalSyntheticApiModelOutline0.m$1(insetsM$1) + da$.ExternalSyntheticApiModelOutline0.m$3(insetsM$1);
        android.graphics.Rect rectM = baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m(qsrVar.H().getWindowManager()));
        this.e = rectM.height() - iM;
        this.d = rectM.width() - iM$1;
    }

    public final void i(android.view.View view, android.graphics.PointF pointF) {
        j$.util.Optional optional = this.h;
        if (true == optional.isPresent()) {
            ((android.view.ViewPropertyAnimator) optional.get()).cancel();
        }
        this.h = j$.util.Optional.empty();
        view.setTranslationX(pointF.x);
        view.setTranslationY(pointF.y);
    }

    public final void j() {
        android.view.View viewD = d();
        android.view.View viewE = e();
        if (this.f) {
            viewE.setVisibility(4);
            viewD.setVisibility(0);
            viewD.setContentDescription(this.b.Y(2132020800));
            this.j.g(viewD, new defpackage.qsn(false));
            return;
        }
        viewD.setVisibility(4);
        viewE.setVisibility(0);
        viewE.setContentDescription(this.b.Y(2132020795));
        this.j.g(viewE, new defpackage.qsn(true));
    }

    public final boolean k() {
        return this.b.dX().getConfiguration().getLayoutDirection() == 1;
    }
}
