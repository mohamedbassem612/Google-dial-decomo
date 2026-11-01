package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class lf extends defpackage.dye {
    final android.support.v7.widget.RecyclerView a;
    public final defpackage.le b;

    public lf(android.support.v7.widget.RecyclerView recyclerView) {
        this.a = recyclerView;
        defpackage.dye dyeVarJ = j();
        if (dyeVarJ == null || !(dyeVarJ instanceof defpackage.le)) {
            this.b = new defpackage.le(this);
        } else {
            this.b = (defpackage.le) dyeVarJ;
        }
    }

    @Override // defpackage.dye
    public void b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        defpackage.kp kpVar;
        super.b(view, accessibilityEvent);
        if (!(view instanceof android.support.v7.widget.RecyclerView) || k() || (kpVar = ((android.support.v7.widget.RecyclerView) view).n) == null) {
            return;
        }
        kpVar.aa(accessibilityEvent);
    }

    @Override // defpackage.dye
    public void c(android.view.View view, ebd ebdVar) {
        defpackage.kp kpVar;
        super.c(view, ebdVar);
        if (k() || (kpVar = this.a.n) == null) {
            return;
        }
        android.support.v7.widget.RecyclerView recyclerView = kpVar.s;
        kpVar.eI(recyclerView.e, recyclerView.L, ebdVar);
    }

    @Override // defpackage.dye
    public final boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        defpackage.kp kpVar;
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (k() || (kpVar = this.a.n) == null) {
            return false;
        }
        return kpVar.eL(i, bundle);
    }

    public defpackage.dye j() {
        return this.b;
    }

    final boolean k() {
        return this.a.ak();
    }
}
