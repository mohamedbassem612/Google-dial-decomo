package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class glr extends android.graphics.drawable.Animatable2.AnimationCallback {
    final /* synthetic */ defpackage.gls a;

    public glr(defpackage.gls glsVar) {
        this.a = glsVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
        this.a.b(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(android.graphics.drawable.Drawable drawable) {
        this.a.c(drawable);
    }
}
