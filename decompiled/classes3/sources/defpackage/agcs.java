package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agcs extends defpackage.agdg {
    public android.widget.EditText a;
    private final int b;
    private final int c;
    private final android.animation.TimeInterpolator d;
    private final android.animation.TimeInterpolator i;
    private final android.view.View.OnClickListener j;
    private final android.view.View.OnFocusChangeListener k;
    private android.animation.AnimatorSet l;
    private android.animation.ValueAnimator m;

    public agcs(defpackage.agdf agdfVar) {
        super(agdfVar);
        this.j = new defpackage.afrh(this, 5);
        this.k = new defpackage.agcy(this, 1);
        this.b = agab.u(agdfVar.getContext(), 2130970064, 100);
        this.c = agab.u(agdfVar.getContext(), 2130970064, 150);
        this.d = agab.C(agdfVar.getContext(), 2130970073, afpc.a);
        this.i = agab.C(agdfVar.getContext(), 2130970071, afpc.d);
    }

    private final android.animation.ValueAnimator m(float... fArr) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.d);
        valueAnimatorOfFloat.setDuration(this.b);
        valueAnimatorOfFloat.addUpdateListener(new defpackage.afzo(this, 6));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.agdg
    public final int a() {
        return 2132018025;
    }

    @Override // defpackage.agdg
    public final int b() {
        return 2131231862;
    }

    @Override // defpackage.agdg
    public final android.view.View.OnClickListener c() {
        return this.j;
    }

    @Override // defpackage.agdg
    public final android.view.View.OnFocusChangeListener d() {
        return this.k;
    }

    @Override // defpackage.agdg
    public final android.view.View.OnFocusChangeListener e() {
        return this.k;
    }

    public final void f(boolean z) {
        boolean zS = this.f.s();
        android.animation.AnimatorSet animatorSet = this.l;
        if (!z) {
            animatorSet.cancel();
            this.m.start();
            if (zS) {
                return;
            }
            this.m.end();
            return;
        }
        if (animatorSet.isRunning()) {
            return;
        }
        this.m.cancel();
        this.l.start();
        if (zS) {
            this.l.end();
        }
    }

    @Override // defpackage.agdg
    public final void g(android.widget.EditText editText) {
        this.a = editText;
        this.e.j(k());
    }

    @Override // defpackage.agdg
    public final void h(boolean z) {
        if (this.f.h != null) {
            f(z);
        }
    }

    @Override // defpackage.agdg
    public final void i() {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.i);
        valueAnimatorOfFloat.setDuration(this.c);
        valueAnimatorOfFloat.addUpdateListener(new defpackage.afzo(this, 7));
        android.animation.ValueAnimator valueAnimatorM = m(0.0f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorM);
        this.l.addListener(new defpackage.agcq(this));
        android.animation.ValueAnimator valueAnimatorM2 = m(1.0f, 0.0f);
        this.m = valueAnimatorM2;
        valueAnimatorM2.addListener(new defpackage.agcr(this));
    }

    @Override // defpackage.agdg
    public final void j() {
        android.widget.EditText editText = this.a;
        if (editText != null) {
            editText.post(new defpackage.aflt(this, 19));
        }
    }

    public final boolean k() {
        android.widget.EditText editText = this.a;
        if (editText == null) {
            return false;
        }
        boolean z = editText.hasFocus() || this.h.hasFocus();
        int length = this.a.getText().length();
        java.lang.CharSequence charSequence = this.f.h;
        if (z) {
            return length > 0 || charSequence != null;
        }
        return false;
    }

    @Override // defpackage.agdg
    public final void l() {
        if (this.f.h == null) {
            f(k());
        }
    }
}
