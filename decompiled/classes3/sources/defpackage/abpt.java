package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abpt extends android.view.ViewOutlineProvider {
    final /* synthetic */ defpackage.abpu a;

    public abpt(defpackage.abpu abpuVar) {
        this.a = abpuVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        aooh.f(view, "view");
        aooh.f(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        outline.setRoundRect(0, 0, width, height, (java.lang.Math.min(width, height) * this.a.b) / 2.0f);
    }
}
