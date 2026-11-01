package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afwn extends defpackage.ft {
    private final java.lang.Class k;
    private final int l;
    private final boolean m;

    public afwn(android.content.Context context, java.lang.Class cls, int i, boolean z) {
        super(context);
        this.k = cls;
        this.l = i;
        this.m = z;
    }

    @Override // defpackage.ft, android.view.Menu
    public final android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        if (!this.m) {
            throw new java.lang.UnsupportedOperationException(java.lang.String.valueOf(this.k.getSimpleName()).concat(" does not support submenus"));
        }
        defpackage.fv fvVar = (defpackage.fv) c(i, i2, i3, charSequence);
        gm afwtVar = new afwt(this.a, this, fvVar);
        fvVar.l(afwtVar);
        return afwtVar;
    }

    @Override // defpackage.ft
    public final android.view.MenuItem c(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        int size = size() + 1;
        int i4 = this.l;
        if (size <= i4) {
            u();
            android.view.MenuItem menuItemC = super.c(i, i2, i3, charSequence);
            t();
            return menuItemC;
        }
        java.lang.String simpleName = this.k.getSimpleName();
        throw new java.lang.IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + i4 + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }
}
