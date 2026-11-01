package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gme extends android.graphics.drawable.Drawable.ConstantState {
    private final android.graphics.drawable.Drawable.ConstantState a;

    public gme(android.graphics.drawable.Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        gmf gmfVar = new gmf();
        gmfVar.e = (android.graphics.drawable.VectorDrawable) this.a.newDrawable();
        return gmfVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        gmf gmfVar = new gmf();
        gmfVar.e = (android.graphics.drawable.VectorDrawable) this.a.newDrawable(resources);
        return gmfVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        gmf gmfVar = new gmf();
        gmfVar.e = (android.graphics.drawable.VectorDrawable) this.a.newDrawable(resources, theme);
        return gmfVar;
    }
}
