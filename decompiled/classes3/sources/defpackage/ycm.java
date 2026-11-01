package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ycm implements defpackage.xxe {
    private final android.graphics.drawable.AnimatedImageDrawable a;

    public ycm(android.graphics.drawable.AnimatedImageDrawable animatedImageDrawable) {
        this.a = animatedImageDrawable;
    }

    @Override // defpackage.xxe
    public final int a() {
        android.graphics.drawable.AnimatedImageDrawable animatedImageDrawable = this.a;
        return ((animatedImageDrawable.getIntrinsicWidth() * animatedImageDrawable.getIntrinsicHeight()) * defpackage.ygc.b(android.graphics.Bitmap.Config.ARGB_8888)) << 1;
    }

    @Override // defpackage.xxe
    public final java.lang.Class b() {
        return android.graphics.drawable.Drawable.class;
    }

    @Override // defpackage.xxe
    public final /* synthetic */ java.lang.Object c() {
        return this.a;
    }

    @Override // defpackage.xxe
    public final void e() {
        android.graphics.drawable.AnimatedImageDrawable animatedImageDrawable = this.a;
        animatedImageDrawable.stop();
        animatedImageDrawable.clearAnimationCallbacks();
    }
}
