package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class yco implements defpackage.xxe, defpackage.xxb {
    protected final android.graphics.drawable.Drawable a;

    public yco(android.graphics.drawable.Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.xxb
    public void d() {
        android.graphics.drawable.Drawable drawable = this.a;
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof defpackage.ycv) {
            ((defpackage.ycv) drawable).a().prepareToDraw();
        }
    }

    @Override // defpackage.xxe
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final android.graphics.drawable.Drawable c() {
        android.graphics.drawable.Drawable drawable = this.a;
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState != null ? constantState.newDrawable() : drawable;
    }
}
