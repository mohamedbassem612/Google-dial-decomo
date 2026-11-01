package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afro extends android.graphics.drawable.InsetDrawable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afro(defpackage.afrp afrpVar, android.graphics.drawable.Drawable drawable, int i, int i2, int i3, int i4) {
        super(drawable, i, i2, i3, i4);
        j$.util.Objects.requireNonNull(afrpVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect rect) {
        return false;
    }
}
