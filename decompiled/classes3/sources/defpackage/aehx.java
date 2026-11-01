package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aehx extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.aehz a;

    public aehx(defpackage.aehz aehzVar) {
        j$.util.Objects.requireNonNull(aehzVar);
        this.a = aehzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.aehz aehzVar = this.a;
        aehzVar.d = null;
        aehzVar.e = null;
        defpackage.aelt aeltVar = aehzVar.c;
        if (aeltVar != null) {
            com.google.android.libraries.onegoogle.account.disc.BadgeFrameLayout badgeFrameLayout = aehzVar.a;
            badgeFrameLayout.d(aeltVar);
            badgeFrameLayout.b(aehzVar.c);
        }
    }
}
