package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hrz {
    public static final aimz a = aimz.i("com/android/dialer/animation/LifecycleAwareAnimatorListeners");

    public static android.animation.Animator.AnimatorListener a(ems emsVar, defpackage.hru hruVar) {
        defpackage.hrv hrvVar = new defpackage.hrv();
        hrvVar.c(hruVar);
        return new defpackage.hry(emsVar, hrvVar.a());
    }

    public static android.animation.Animator.AnimatorListener b(ems emsVar, java.util.function.Consumer consumer) {
        defpackage.hrv hrvVar = new defpackage.hrv();
        hrvVar.a = j$.util.Optional.of(consumer);
        return new defpackage.hry(emsVar, hrvVar.a());
    }

    public static android.animation.Animator.AnimatorListener c(ems emsVar, java.util.function.Consumer consumer) {
        defpackage.hrv hrvVar = new defpackage.hrv();
        hrvVar.d(consumer);
        return new defpackage.hry(emsVar, hrvVar.a());
    }
}
