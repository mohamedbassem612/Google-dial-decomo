package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wer implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ wer(java.lang.Object obj, agaf agafVar, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = agafVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int i = this.$cid;
        if (i == 0) {
            int iIntValue = ((java.lang.Integer) ((android.animation.ValueAnimator) this.b).getAnimatedValue()).intValue();
            com.android.dialer.widget.logoview.LogoView logoView = (com.android.dialer.widget.logoview.LogoView) this.a;
            logoView.b = iIntValue;
            logoView.invalidate();
            return;
        }
        if (i == 1) {
            float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = 1.0f - fFloatValue;
            defpackage.wed wedVar = (defpackage.wed) this.a;
            wedVar.f = (wedVar.a * f) + (wedVar.b * fFloatValue);
            android.graphics.Rect rect = wedVar.c;
            float f2 = rect.left;
            android.graphics.Rect rect2 = wedVar.d;
            float f3 = rect2.left * fFloatValue;
            android.graphics.Rect rect3 = wedVar.e;
            rect3.left = (int) ((f2 * f) + f3);
            rect3.top = (int) ((rect.top * f) + (rect2.top * fFloatValue));
            rect3.right = (int) ((rect.right * f) + (rect2.right * fFloatValue));
            rect3.bottom = (int) ((f * rect.bottom) + (fFloatValue * rect2.bottom));
            ((android.view.View) this.b).invalidateOutline();
            return;
        }
        if (i == 2) {
            int iIntValue2 = ((java.lang.Integer) ((android.animation.ValueAnimator) this.b).getAnimatedValue()).intValue();
            com.android.dialer.widget.logoview.LogoView logoView2 = (com.android.dialer.widget.logoview.LogoView) this.a;
            logoView2.c = iIntValue2;
            logoView2.invalidate();
            return;
        }
        if (i == 3) {
            java.lang.String str = defpackage.aekj.a;
            float fFloatValue2 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
            ((agaf) this.b).S(fFloatValue2);
            ((agaf) this.a).S(fFloatValue2);
            return;
        }
        if (i == 4) {
            float fFloatValue3 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
            agaf agafVar = (agaf) this.a;
            agafVar.Q(fFloatValue3);
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) this.b;
            agaf agafVar2 = appBarLayout.i;
            if (agafVar2 instanceof agaf) {
                agafVar2.Q(fFloatValue3);
            }
            java.util.Iterator it = appBarLayout.f.iterator();
            while (it.hasNext()) {
                ((defpackage.rai) it.next()).d(agafVar.x);
            }
            java.util.Iterator it2 = appBarLayout.g.iterator();
            while (it2.hasNext()) {
                ((afpn) it2.next()).a(agafVar.x, fFloatValue3 / appBarLayout.k);
            }
            return;
        }
        if (i != 5) {
            int iIntValue3 = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
            android.graphics.Rect rect4 = (android.graphics.Rect) this.b;
            rect4.right = iIntValue3;
            ((defpackage.afzt) this.a).a.j.setClipBounds(rect4);
            return;
        }
        defpackage.afxn afxnVar = (defpackage.afxn) this.b;
        if (!afxnVar.c(true) || afxnVar.m == 0) {
            return;
        }
        defpackage.afyb afybVar = (defpackage.afyb) this.a;
        if (afybVar.isVisible()) {
            afybVar.invalidateSelf();
        }
    }

    public /* synthetic */ wer(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
