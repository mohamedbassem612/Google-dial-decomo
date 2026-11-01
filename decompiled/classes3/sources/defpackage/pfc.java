package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pfc implements ahyc {
    public final /* synthetic */ pff a;

    public final java.lang.Object apply(java.lang.Object obj) {
        pff pffVar = this.a;
        ahzi ahziVar = pffVar.b;
        j$.util.Optional optional = (j$.util.Optional) obj;
        if (!((j$.util.Optional) ahziVar.eZ()).isPresent()) {
            pff.a.b().l("com/android/dialer/incall/bubble/dialerbubble/DialerBubbleController", "onCallGraphUpdated", 92, "DialerBubbleController.java").v("can't show/update bubble, bubble feature not present");
            return null;
        }
        if (!pffVar.f.isPresent() && optional.isPresent()) {
            pffVar.e.n(rmw.kT);
        }
        pffVar.f = optional;
        wdx wdxVar = (wdx) ((j$.util.Optional) ahziVar.eZ()).orElseThrow();
        if (((defpackage.pfh) pffVar.f.orElseThrow()).c) {
            defpackage.wdj wdjVar = (defpackage.wdj) ((defpackage.pfh) pffVar.f.orElseThrow()).d.orElseThrow();
            j$.util.Optional optionalB = pffVar.b();
            if (true == optionalB.isPresent()) {
                defpackage.pgf pgfVar = (defpackage.pgf) optionalB.get();
                if (!pgfVar.h) {
                    pgfVar.j.a(qbc.cQ);
                    pgfVar.h = true;
                }
            }
            if (wdxVar.n()) {
                java.util.List list = wdjVar.e;
                defpackage.wdi wdiVar = new defpackage.wdi(wdxVar.k);
                wdiVar.b(list);
                wdxVar.k = wdiVar.a();
                wdxVar.l();
                android.graphics.drawable.Drawable drawable = wdjVar.c;
                if (!drawable.equals(wdxVar.k.c)) {
                    defpackage.wdi wdiVar2 = new defpackage.wdi(wdxVar.k);
                    wdiVar2.e = drawable;
                    wdxVar.k = wdiVar2.a();
                    ((defpackage.wdw) wdxVar.o.eZ()).d.setBackground(wdxVar.k.c);
                }
            } else {
                wdxVar.k = wdjVar;
                wdxVar.k();
                wdxVar.l = j$.util.Optional.of(pffVar);
                if (wdxVar.n == 1) {
                    wdxVar.n = 0;
                }
                int i = wdxVar.m;
                if (i == 2 || i == 1) {
                    wdx.a.b().l("com/android/dialer/widget/bubble/impl/BubbleImpl", "show", 423, "BubbleImpl.java").w("already showing, visibility: %d", wdxVar.m);
                } else {
                    aimz aimzVar = wdx.a;
                    aimzVar.b().l("com/android/dialer/widget/bubble/impl/BubbleImpl", "show", 427, "BubbleImpl.java").v("going to show");
                    wdxVar.g(rmw.gB);
                    int layoutDirectionFromLocale = android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault());
                    android.view.WindowManager.LayoutParams layoutParams = wdxVar.i;
                    if (layoutParams == null) {
                        int i2 = layoutDirectionFromLocale != 1 ? 8388611 : 8388613;
                        wdxVar.i = new android.view.WindowManager.LayoutParams(2038, 262696, -3);
                        wdxVar.i.gravity = i2 | 48;
                        wdxVar.i.y = wdxVar.k.d;
                        wdxVar.i.height = -2;
                        wdxVar.i.width = -2;
                    } else if (wdxVar.u) {
                        layoutParams.gravity = (layoutDirectionFromLocale != 1 ? 8388611 : 8388613) | 48;
                        wdxVar.i.y = wdxVar.k.d;
                    }
                    wdxVar.i.x = ((java.lang.Integer) wdxVar.h.eZ()).intValue();
                    wdxVar.u = false;
                    if (wdxVar.q != null) {
                        aimzVar.b().l("com/android/dialer/widget/bubble/impl/BubbleImpl", "show", 453, "BubbleImpl.java").v("cancel previous exit animation");
                        wdxVar.q.removeAllListeners();
                        wdxVar.q.cancel();
                        wdxVar.q = null;
                    } else {
                        wdxVar.v = ahvr.bI(new defpackage.wdn(wdxVar, 7));
                        wdxVar.o = ahvr.bI(new defpackage.wdn(wdxVar, 0));
                        ((defpackage.wdw) wdxVar.o.eZ()).c.setX(wdxVar.m() ? 0.0f : ((java.lang.Integer) wdxVar.v.eZ()).intValue());
                        ((defpackage.wdw) wdxVar.o.eZ()).c.setTranslationX(wdxVar.m() ? -((java.lang.Integer) wdxVar.v.eZ()).intValue() : 0.0f);
                        wdxVar.j(((android.content.Context) wdxVar.b.eZ()).getString(2132017157));
                        ((android.view.WindowManager) wdxVar.g.eZ()).addView(((defpackage.wdw) wdxVar.o.eZ()).b, wdxVar.i);
                        ((defpackage.wdw) wdxVar.o.eZ()).b.setVisibility(0);
                        ((defpackage.wdw) wdxVar.o.eZ()).b.setScaleX(0.0f);
                        ((defpackage.wdw) wdxVar.o.eZ()).b.setScaleY(0.0f);
                        ((defpackage.wdw) wdxVar.o.eZ()).d.setAlpha(0.0f);
                        ((defpackage.wdw) wdxVar.o.eZ()).c.setAlpha(0.0f);
                    }
                    defpackage.wdw wdwVar = (defpackage.wdw) wdxVar.o.eZ();
                    wdwVar.a = new defpackage.web(wdwVar.b, wdwVar.e);
                    ((defpackage.wdw) wdxVar.o.eZ()).a(true);
                    wdxVar.m = 1;
                    wdxVar.k();
                    android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(((defpackage.wdw) wdxVar.o.eZ()).b, "scaleX", 1.0f);
                    android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(((defpackage.wdw) wdxVar.o.eZ()).b, "scaleY", 1.0f);
                    android.animation.ObjectAnimator objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(((defpackage.wdw) wdxVar.o.eZ()).d, "alpha", 1.0f);
                    android.animation.ObjectAnimator objectAnimatorOfFloat4 = android.animation.ObjectAnimator.ofFloat(((defpackage.wdw) wdxVar.o.eZ()).c, "alpha", 1.0f);
                    wdxVar.r = new android.animation.AnimatorSet();
                    wdxVar.r.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                    wdxVar.r.setInterpolator(new android.view.animation.OvershootInterpolator());
                    wdxVar.r.addListener(new defpackage.wdq(wdxVar));
                    wdxVar.r.start();
                }
            }
        } else if (wdxVar.n()) {
            wdxVar.f();
            j$.util.Optional optionalB2 = pffVar.b();
            if (true == optionalB2.isPresent()) {
                ((defpackage.pgf) optionalB2.get()).j.a(qbc.cR);
            }
        }
        pffVar.i++;
        pffVar.g = false;
        if (pffVar.h) {
            pffVar.h = false;
            pffVar.a();
        }
        return null;
    }
}
