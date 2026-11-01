package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yfe implements defpackage.yfi {
    private final int a;

    public yfe(int i) {
        this.a = i;
    }

    @Override // defpackage.yfi
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, defpackage.yfh yfhVar) {
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
        android.graphics.drawable.Drawable drawableE = yfhVar.e();
        if (drawableE == null) {
            drawableE = new android.graphics.drawable.ColorDrawable(0);
        }
        android.graphics.drawable.TransitionDrawable transitionDrawable = new android.graphics.drawable.TransitionDrawable(new android.graphics.drawable.Drawable[]{drawableE, drawable});
        transitionDrawable.setCrossFadeEnabled(false);
        transitionDrawable.startTransition(this.a);
        yfhVar.n(transitionDrawable);
        return true;
    }
}
