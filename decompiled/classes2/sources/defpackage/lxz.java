package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lxz extends android.view.ViewOutlineProvider {
    final /* synthetic */ defpackage.lya a;
    private final float b;

    public lxz(android.view.View view, defpackage.lya lyaVar) {
        this.a = lyaVar;
        this.b = view.getResources().getDimensionPixelSize(2131165730);
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        aooh.f(view, "view");
        aooh.f(outline, "outline");
        float fMin = java.lang.Math.min(1.0f, java.lang.Math.abs(this.a.B.getTranslationX()) / (view.getWidth() / 2.0f)) * this.b;
        if (fMin < 1.0f) {
            fMin = 0.0f;
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), fMin);
    }
}
