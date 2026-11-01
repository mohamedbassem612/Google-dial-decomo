package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aftw extends android.view.ViewOutlineProvider {
    final /* synthetic */ com.google.android.material.imageview.ShapeableImageView a;
    private final android.graphics.Rect b;

    public aftw(com.google.android.material.imageview.ShapeableImageView shapeableImageView) {
        j$.util.Objects.requireNonNull(shapeableImageView);
        this.a = shapeableImageView;
        this.b = new android.graphics.Rect();
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.google.android.material.imageview.ShapeableImageView shapeableImageView = this.a;
        if (shapeableImageView.c != null) {
            if (shapeableImageView.b == null) {
                shapeableImageView.b = new agaf(shapeableImageView.c);
            }
            android.graphics.RectF rectF = shapeableImageView.a;
            android.graphics.Rect rect = this.b;
            rectF.round(rect);
            shapeableImageView.b.setBounds(rect);
            shapeableImageView.b.getOutline(outline);
        }
    }
}
