package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hrt extends android.graphics.drawable.Animatable2.AnimationCallback {
    final /* synthetic */ android.widget.TextView a;
    final /* synthetic */ android.text.SpannableString b;
    final /* synthetic */ android.graphics.drawable.AnimatedVectorDrawable c;

    public hrt(android.widget.TextView textView, android.text.SpannableString spannableString, android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable) {
        this.a = textView;
        this.b = spannableString;
        this.c = animatedVectorDrawable;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
        if (aooh.n(android.os.Build.FINGERPRINT, "robolectric")) {
            return;
        }
        this.a.setText(this.b);
        this.c.start();
    }
}
