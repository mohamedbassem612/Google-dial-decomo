package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ci extends defpackage.cj {
    private final defpackage.bt j;

    /* JADX WARN: Illegal instructions before constructor call */
    public ci(int i, int i2, defpackage.bt btVar) {
        defpackage.aw awVar = btVar.a;
        defpackage.aooh.e(awVar, "getFragment(...)");
        super(i, i2, awVar);
        this.j = btVar;
    }

    @Override // defpackage.cj
    public final void a() {
        super.a();
        this.a.t = false;
        this.j.e();
    }

    @Override // defpackage.cj
    public final void b() {
        if (this.e) {
            return;
        }
        super.b();
        int i = this.i;
        if (i != 2) {
            if (i == 3) {
                defpackage.aw awVar = this.j.a;
                defpackage.aooh.e(awVar, "getFragment(...)");
                android.view.View viewN = awVar.N();
                if (defpackage.bo.Z(2)) {
                    android.util.Log.v("FragmentManager", "Clearing focus " + viewN.findFocus() + " on view " + viewN + " for Fragment " + awVar);
                }
                viewN.clearFocus();
                return;
            }
            return;
        }
        defpackage.bt btVar = this.j;
        defpackage.aw awVar2 = btVar.a;
        defpackage.aooh.e(awVar2, "getFragment(...)");
        android.view.View viewFindFocus = awVar2.Q.findFocus();
        if (viewFindFocus != null) {
            awVar2.ax(viewFindFocus);
            if (defpackage.bo.Z(2)) {
                android.util.Log.v("FragmentManager", defpackage.a.bi(awVar2, viewFindFocus, "requestFocus: Saved focused view ", " for Fragment "));
            }
        }
        android.view.View viewN2 = this.a.N();
        if (viewN2.getParent() == null) {
            if (defpackage.bo.Z(2)) {
                android.util.Log.v("FragmentManager", defpackage.a.bl(viewN2, awVar2, "Adding fragment ", " view ", " to container in onStart"));
            }
            btVar.b();
            viewN2.setAlpha(0.0f);
        }
        if (viewN2.getAlpha() == 0.0f && viewN2.getVisibility() == 0) {
            if (defpackage.bo.Z(2)) {
                android.util.Log.v("FragmentManager", defpackage.a.bg(viewN2, "Making view ", " INVISIBLE in onStart"));
            }
            viewN2.setVisibility(4);
        }
        viewN2.setAlpha(awVar2.u());
        if (defpackage.bo.Z(2)) {
            android.util.Log.v("FragmentManager", "Setting view alpha to " + awVar2.u() + " in onStart");
        }
    }
}
