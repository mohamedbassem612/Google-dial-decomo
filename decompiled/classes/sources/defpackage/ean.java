package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class ean extends defpackage.eam {
    private defpackage.dwn g;

    public ean(defpackage.eax eaxVar, defpackage.ean eanVar) {
        super(eaxVar, eanVar);
        this.g = null;
        this.g = eanVar.g;
    }

    @Override // defpackage.eau
    public final defpackage.dwn w() {
        defpackage.dwn dwnVar = this.g;
        if (dwnVar != null) {
            return dwnVar;
        }
        android.view.WindowInsets windowInsets = this.a;
        defpackage.dwn dwnVarD = defpackage.dwn.d(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.g = dwnVarD;
        return dwnVarD;
    }

    @Override // defpackage.eau
    public defpackage.eax x() {
        return defpackage.eax.q(this.a.consumeStableInsets(), null);
    }

    @Override // defpackage.eau
    public defpackage.eax y() {
        return defpackage.eax.q(this.a.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.eau
    public boolean z() {
        return this.a.isConsumed();
    }

    public ean(defpackage.eax eaxVar, android.view.WindowInsets windowInsets) {
        super(eaxVar, windowInsets);
        this.g = null;
    }
}
