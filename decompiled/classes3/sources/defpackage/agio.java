package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agio extends android.graphics.drawable.LayerDrawable {
    public android.content.res.ColorStateList a;

    public agio(android.graphics.drawable.Drawable drawable) {
        super(new android.graphics.drawable.Drawable[]{drawable});
        this.a = null;
    }

    public static defpackage.agio a(android.graphics.drawable.Drawable drawable) {
        return drawable instanceof defpackage.agio ? (defpackage.agio) drawable : new defpackage.agio(drawable.mutate());
    }

    public final boolean b() {
        android.content.res.ColorStateList colorStateList = this.a;
        if (colorStateList == null) {
            return false;
        }
        setColorFilter(colorStateList.getColorForState(getState(), 0), android.graphics.PorterDuff.Mode.SRC_IN);
        return true;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return super.setState(iArr) || b();
    }
}
