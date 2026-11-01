package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afrr extends gls {
    final /* synthetic */ defpackage.afrt b;

    public afrr(defpackage.afrt afrtVar) {
        j$.util.Objects.requireNonNull(afrtVar);
        this.b = afrtVar;
    }

    public final void b(android.graphics.drawable.Drawable drawable) {
        android.content.res.ColorStateList colorStateList = this.b.b;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    public final void c(android.graphics.drawable.Drawable drawable) {
        defpackage.afrt afrtVar = this.b;
        android.content.res.ColorStateList colorStateList = afrtVar.b;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(afrtVar.d, colorStateList.getDefaultColor()));
        }
    }
}
