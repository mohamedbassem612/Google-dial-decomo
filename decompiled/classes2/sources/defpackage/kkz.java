package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kkz implements defpackage.hsf {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ kkz(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.hsf
    public final void a(float f) {
        switch (this.$cid) {
            case 0:
                int i = aopc.i(f);
                java.lang.Object obj = this.a;
                if (i > 0) {
                    ((android.view.View) obj).setVisibility(0);
                } else {
                    ((android.view.View) obj).setVisibility(8);
                }
                ((android.view.View) obj).getLayoutParams().height = i;
                break;
            case 1:
                ((android.view.View) this.a).setAlpha(f);
                break;
            case 2:
                android.view.View view = (android.view.View) this.a;
                view.getLayoutParams().height = (int) f;
                view.requestLayout();
                break;
            case 3:
                ((android.view.View) this.a).setAlpha(f);
                break;
            case 4:
                ((defpackage.lya) this.a).C.o(f, true);
                break;
            case 5:
                android.view.animation.Interpolator interpolator = tji.a;
                ((com.google.android.material.card.MaterialCardView) this.a).getLayoutParams().height = (int) f;
                break;
            case 6:
                android.view.animation.Interpolator interpolator2 = tji.a;
                ((android.widget.LinearLayout) this.a).setAlpha(f);
                break;
            case 7:
                android.view.animation.Interpolator interpolator3 = tji.a;
                ((android.widget.LinearLayout) this.a).setTranslationY(f);
                break;
            case 8:
                android.view.animation.Interpolator interpolator4 = tji.a;
                ((com.google.android.material.card.MaterialCardView) this.a).requestLayout();
                break;
            case 9:
                android.view.animation.Interpolator interpolator5 = tji.a;
                ((com.google.android.material.card.MaterialCardView) this.a).getLayoutParams().height = (int) f;
                break;
            case 10:
                android.view.animation.Interpolator interpolator6 = tji.a;
                ((android.widget.LinearLayout) this.a).setAlpha(f);
                break;
            case 11:
                android.view.animation.Interpolator interpolator7 = tji.a;
                ((android.widget.LinearLayout) this.a).setTranslationY(f);
                break;
            case 12:
                android.view.animation.Interpolator interpolator8 = tji.a;
                ((com.google.android.material.card.MaterialCardView) this.a).requestLayout();
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                android.view.animation.Interpolator interpolator9 = vxt.a;
                ((android.widget.FrameLayout) this.a).setAlpha(f);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                android.view.animation.Interpolator interpolator10 = vxt.a;
                ((android.widget.FrameLayout) this.a).requestLayout();
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                android.view.animation.Interpolator interpolator11 = vxt.a;
                ((android.widget.FrameLayout) this.a).getLayoutParams().height = (int) f;
                break;
            case 16:
                android.view.animation.Interpolator interpolator12 = vxt.a;
                ((android.widget.FrameLayout) this.a).setTranslationY(f);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                android.view.animation.Interpolator interpolator13 = vxt.a;
                android.view.View view2 = (android.view.View) this.a;
                view2.setScaleX(f);
                view2.setScaleY(f);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                android.view.animation.Interpolator interpolator14 = vxt.a;
                ((android.widget.FrameLayout) this.a).requestLayout();
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                android.view.animation.Interpolator interpolator15 = vxt.a;
                ((android.widget.FrameLayout) this.a).setAlpha(f);
                break;
            default:
                android.view.animation.Interpolator interpolator16 = vxt.a;
                ((android.widget.FrameLayout) this.a).getLayoutParams().height = (int) f;
                break;
        }
    }
}
