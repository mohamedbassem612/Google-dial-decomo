package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mh implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public mh(oyf oyfVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(oyfVar);
        this.a = oyfVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        switch (this.$cid) {
            case 0:
                ((defpackage.mi) this.a).p = valueAnimator.getAnimatedFraction();
                break;
            case 1:
                float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f;
                defpackage.jh jhVar = (defpackage.jh) this.a;
                int i = (int) fFloatValue;
                jhVar.b.setAlpha(i);
                jhVar.c.setAlpha(i);
                jhVar.d();
                break;
            case 2:
                ((android.view.View) ((defpackage.ee) ((rai) this.a).a).c.getParent()).invalidate();
                break;
            case 3:
                defpackage.gzs gzsVar = (defpackage.gzs) this.a;
                if (!gzsVar.u()) {
                    defpackage.heg hegVar = gzsVar.j;
                    if (hegVar != null) {
                        hegVar.m(gzsVar.c.c());
                    }
                } else {
                    gzsVar.invalidateSelf();
                }
                break;
            case 4:
                final float fFloatValue2 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                defpackage.hsh hshVar = (defpackage.hsh) this.a;
                j$.util.Optional optionalOfNullable = hshVar.b;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((emy) optionalOfNullable.get()).d);
                }
                emq emqVar = (emq) optionalOfNullable.orElse((java.lang.Object) null);
                if (emqVar == null || emqVar.a(emq.c)) {
                    j$.util.Collection.-EL.removeIf(hshVar.c, new java.util.function.Predicate() { // from class: hsa
                        @Override // java.util.function.Predicate
                        public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
                            return j$.util.function.Predicate.-CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final /* synthetic */ java.util.function.Predicate negate() {
                            return j$.util.function.Predicate.-CC.$default$negate(this);
                        }

                        @Override // java.util.function.Predicate
                        public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
                            return j$.util.function.Predicate.-CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(java.lang.Object obj) {
                            return ((defpackage.hsg) obj).a(fFloatValue2);
                        }
                    });
                } else {
                    defpackage.hsh.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/animation/ProgressAnimator", "apply", 221, "ProgressAnimator.java").y("Lifecycle state is: %s. Ignored and clear animators.", emqVar);
                    hshVar.c.clear();
                }
                break;
            case 5:
                java.lang.Object obj = this.a;
                try {
                    int iIntValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (((defpackage.mjo) obj).c.b() != null) {
                        ((defpackage.mjo) obj).c.b().getBackground().setTint(iIntValue);
                    }
                } catch (java.lang.RuntimeException unused) {
                    valueAnimator.cancel();
                    return;
                }
                break;
            case 6:
                ((oyf) this.a).c(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                aooh.f(valueAnimator, "p0");
                oym oymVar = ((oyp) this.a).b;
                if (((aw) oymVar).Q != null) {
                    java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
                    aooh.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    ahvr.i(new ozb(((java.lang.Float) animatedValue).floatValue()), oymVar);
                }
                break;
            case 8:
                oyr oyrVar = ((oyu) this.a).c;
                if (((aw) oyrVar).Q != null) {
                    ahvr.i(new ozb(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue()), oyrVar);
                }
                break;
            case 9:
                int i2 = rdy.a;
                aooh.f(valueAnimator, "valueAnimator");
                java.lang.Object animatedValue2 = valueAnimator.getAnimatedValue();
                aooh.d(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                ((android.view.View) this.a).setTranslationY(((java.lang.Float) animatedValue2).floatValue());
                break;
            case 10:
                java.lang.Object obj2 = this.a;
                wdx wdxVar = (wdx) obj2;
                int i3 = wdxVar.m;
                if (i3 != 0 && i3 != 3) {
                    wdxVar.j.y = (int) ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                    try {
                        ((android.view.WindowManager) ((wdx) obj2).g.eZ()).updateViewLayout(((wdu) ((wdx) obj2).x.eZ()).a, ((wdx) obj2).j);
                    } catch (java.lang.IllegalArgumentException e) {
                        a.bq(wdx.a.c(), "Root view not found", "com/android/dialer/widget/bubble/impl/BubbleImpl", "createMenuMoveAnimator", (char) 1032, "BubbleImpl.java", e, zct.b);
                        return;
                    }
                    break;
                }
                break;
            case 11:
                aooh.f(valueAnimator, "it");
                java.lang.Object animatedValue3 = valueAnimator.getAnimatedValue();
                aooh.d(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                j$.util.Collection.-EL.removeIf(((aboy) this.a).a, new abdh(new defpackage.abkr(((java.lang.Float) animatedValue3).floatValue(), 2), 4));
                break;
            case 12:
                aooh.f(valueAnimator, "it");
                java.lang.Object animatedValue4 = valueAnimator.getAnimatedValue();
                aooh.d(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                ((abpu) this.a).b(((java.lang.Float) animatedValue4).floatValue());
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.String str = aekj.a;
                ((com.google.android.material.card.MaterialCardView) this.a).g(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                float fFloatValue3 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                afrp afrpVar = (afrp) this.a;
                afrpVar.k.setAlpha((int) (255.0f * fFloatValue3));
                afrpVar.u = fFloatValue3;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ((com.google.android.material.internal.ClippableRoundedCornerLayout) this.a).b((float[]) valueAnimator.getAnimatedValue());
                break;
            case 16:
                ((androidx.drawerlayout.widget.DrawerLayout) this.a).k(dwm.h(-1728053248, afpc.b(defpackage.afwh.a, 0, valueAnimator.getAnimatedFraction())));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int i4 = defpackage.afxd.w;
                ((android.view.View) this.a).setTranslationX((1.0f - valueAnimator.getAnimatedFraction()) * (-30.0f));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                afyb afybVar = (afyb) this.a;
                afybVar.b.e = afybVar.e.getInterpolation(afybVar.d.getAnimatedFraction());
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                int i5 = afzu.x;
                ((defpackage.eh) this.a).b(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int i6 = afzu.x;
                ((afud) this.a).a(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ mh(java.lang.Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }

    public mh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
