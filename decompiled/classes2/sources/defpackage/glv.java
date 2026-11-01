package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class glv extends android.graphics.drawable.Drawable.ConstantState {
    private final android.graphics.drawable.Drawable.ConstantState a;

    public glv(android.graphics.drawable.Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, glw] */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        ?? glwVar = new defpackage.glw(null);
        ((defpackage.glw) glwVar).e = this.a.newDrawable();
        ((defpackage.glw) glwVar).e.setCallback(glwVar.d);
        return glwVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, glw] */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        ?? glwVar = new defpackage.glw(null);
        ((defpackage.glw) glwVar).e = this.a.newDrawable(resources);
        ((defpackage.glw) glwVar).e.setCallback(glwVar.d);
        return glwVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, glw] */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        ?? glwVar = new defpackage.glw(null);
        ((defpackage.glw) glwVar).e = this.a.newDrawable(resources, theme);
        ((defpackage.glw) glwVar).e.setCallback(glwVar.d);
        return glwVar;
    }
}
