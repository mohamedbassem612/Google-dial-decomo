package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tjm implements android.animation.Animator.AnimatorListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public tjm(mjo mjoVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(mjoVar);
        this.a = mjoVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.tjn) this.a).d = false;
            return;
        }
        if (i == 1) {
            try {
                java.lang.Object obj = this.a;
                if (((mjo) obj).c.b() != null) {
                    ((mjo) obj).c.b().getBackground().setTint(((mjo) obj).c.a().getColor(2131099836));
                }
                new android.os.Handler().postDelayed(new lye(this, 2), 1000L);
                return;
            } catch (java.lang.RuntimeException unused) {
                animator.cancel();
                return;
            }
        }
        defpackage.wde wdeVar = (defpackage.wde) this.a;
        if (wdeVar.d()) {
            wdeVar.c = true;
            wdeVar.d = 1;
            return;
        }
        int i2 = wdeVar.d;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 != 1) {
            if (i3 == 3) {
                wdeVar.a.setVisibility(4);
                wdeVar.d = 1;
                return;
            }
            return;
        }
        com.airbnb.lottie.LottieAnimationView lottieAnimationView = wdeVar.a;
        lottieAnimationView.n(10, 89);
        lottieAnimationView.p(-1);
        lottieAnimationView.e();
        wdeVar.d = 3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                try {
                    java.lang.Object obj = this.a;
                    ((mjo) obj).b(wsc.bp(((mjo) obj).c.a(), defpackage.urp.DURATION_SHORT_4));
                    return;
                } catch (java.lang.RuntimeException unused) {
                    animator.cancel();
                    return;
                }
            }
            defpackage.wde wdeVar = (defpackage.wde) this.a;
            if (wdeVar.b) {
                com.airbnb.lottie.LottieAnimationView lottieAnimationView = wdeVar.a;
                lottieAnimationView.n(90, 99);
                lottieAnimationView.p(0);
                wdeVar.d = 4;
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        if (this.$cid == 0) {
            ((defpackage.tjn) this.a).d = true;
        }
    }

    public tjm(defpackage.tjn tjnVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(tjnVar);
        this.a = tjnVar;
    }

    public tjm(defpackage.wde wdeVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(wdeVar);
        this.a = wdeVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
    }
}
