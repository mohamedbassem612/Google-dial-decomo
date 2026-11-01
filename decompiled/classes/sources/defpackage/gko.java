package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gko extends defpackage.glp {
    public gko(int i) {
        this.w = i;
    }

    private static float S(gli gliVar, float f) {
        java.lang.Float f2;
        return (gliVar == null || (f2 = (java.lang.Float) gliVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private final android.animation.Animator T(android.view.View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        int i = gll.b;
        fn$.ExternalSyntheticApiModelOutline0.m(view, f);
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) gll.a, f2);
        gkn gknVar = new gkn(view);
        objectAnimatorOfFloat.addListener(gknVar);
        j().D(gknVar);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.glp, defpackage.gkz
    public final void c(gli gliVar) {
        defpackage.glp.R(gliVar);
        java.lang.Float fValueOf = (java.lang.Float) gliVar.b.getTag(2131429318);
        if (fValueOf == null) {
            if (gliVar.b.getVisibility() == 0) {
                android.view.View view = gliVar.b;
                int i = gll.b;
                fValueOf = java.lang.Float.valueOf(fn$.ExternalSyntheticApiModelOutline0.m(view));
            } else {
                fValueOf = java.lang.Float.valueOf(0.0f);
            }
        }
        gliVar.a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // defpackage.gkz
    public final boolean d() {
        return true;
    }

    @Override // defpackage.glp
    public final android.animation.Animator f(android.view.ViewGroup viewGroup, android.view.View view, gli gliVar, gli gliVar2) {
        int i = gll.b;
        android.animation.Animator animatorT = T(view, S(gliVar, 1.0f), 0.0f);
        if (animatorT == null) {
            fn$.ExternalSyntheticApiModelOutline0.m(view, S(gliVar2, 1.0f));
        }
        return animatorT;
    }

    @Override // defpackage.glp
    public final android.animation.Animator g(android.view.ViewGroup viewGroup, android.view.View view, gli gliVar) {
        int i = gll.b;
        return T(view, S(gliVar, 0.0f), 1.0f);
    }
}
