package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hry implements android.animation.Animator.AnimatorListener, emj {
    public boolean a;
    private final defpackage.hrw b;
    private boolean c;

    public hry(ems emsVar, defpackage.hrw hrwVar) {
        this.b = hrwVar;
        emsVar.c(this);
    }

    public final void c(emx emxVar) {
        this.c = false;
    }

    public final void fn(emx emxVar) {
        this.c = true;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.function.Consumer] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        if (!this.c) {
            defpackage.hrz.a.b().l("com/android/dialer/animation/LifecycleAwareAnimatorListeners$LifecycleAwareAnimatorListener", "onAnimationCancel", 138, "LifecycleAwareAnimatorListeners.java").v("Not running callback, Fragment not resumed.");
            return;
        }
        this.a = true;
        defpackage.hrw hrwVar = this.b;
        defpackage.hrx hrxVar = new defpackage.hrx(animator, 2);
        j$.util.Optional optional = hrwVar.c;
        if (true == optional.isPresent()) {
            aa$.ExternalSyntheticApiModelOutline1.m((java.util.function.Consumer) optional.get(), hrxVar.a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [hru, java.lang.Object] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (!this.c) {
            defpackage.hrz.a.b().l("com/android/dialer/animation/LifecycleAwareAnimatorListeners$LifecycleAwareAnimatorListener", "onAnimationEnd", 129, "LifecycleAwareAnimatorListeners.java").v("Not running callback, Fragment not resumed.");
            return;
        }
        defpackage.hrw hrwVar = this.b;
        defpackage.hrx hrxVar = new defpackage.hrx(this, 3);
        j$.util.Optional optional = hrwVar.b;
        if (true == optional.isPresent()) {
            optional.get().a(((defpackage.hry) hrxVar.a).a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.function.Consumer] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        if (!this.c) {
            defpackage.hrz.a.b().l("com/android/dialer/animation/LifecycleAwareAnimatorListeners$LifecycleAwareAnimatorListener", "onAnimationRepeat", 148, "LifecycleAwareAnimatorListeners.java").v("Not running callback, Fragment not resumed.");
            return;
        }
        defpackage.hrw hrwVar = this.b;
        defpackage.hrx hrxVar = new defpackage.hrx(animator, 4);
        j$.util.Optional optional = hrwVar.d;
        if (true == optional.isPresent()) {
            aa$.ExternalSyntheticApiModelOutline1.m((java.util.function.Consumer) optional.get(), hrxVar.a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.function.Consumer] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        if (!this.c) {
            defpackage.hrz.a.b().l("com/android/dialer/animation/LifecycleAwareAnimatorListeners$LifecycleAwareAnimatorListener", "onAnimationStart", 119, "LifecycleAwareAnimatorListeners.java").v("Not running callback, Fragment not resumed.");
            return;
        }
        this.a = false;
        defpackage.hrw hrwVar = this.b;
        defpackage.hrx hrxVar = new defpackage.hrx(animator, 0);
        j$.util.Optional optional = hrwVar.a;
        if (true == optional.isPresent()) {
            aa$.ExternalSyntheticApiModelOutline1.m((java.util.function.Consumer) optional.get(), hrxVar.a);
        }
    }

    public final /* synthetic */ void a(emx emxVar) {
    }

    public final /* synthetic */ void b(emx emxVar) {
    }

    public final /* synthetic */ void e(emx emxVar) {
    }

    public final /* synthetic */ void f(emx emxVar) {
    }
}
