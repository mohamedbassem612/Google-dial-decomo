package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dh implements defpackage.ex {
    final /* synthetic */ dq a;
    private final defpackage.ex b;

    public dh(dq dqVar, defpackage.ex exVar) {
        this.a = dqVar;
        this.b = exVar;
    }

    @Override // defpackage.ex
    public final void a(defpackage.ey eyVar) {
        defpackage.fa faVar = (defpackage.fa) this.b;
        faVar.a.onDestroyActionMode(faVar.e(eyVar));
        dq dqVar = this.a;
        if (dqVar.s != null) {
            dqVar.l.getDecorView().removeCallbacks(dqVar.t);
        }
        if (dqVar.r != null) {
            dqVar.E();
            defpackage.ni niVarO = dzs.o(dqVar.r);
            niVarO.k(0.0f);
            dqVar.L = niVarO;
            dqVar.L.m(new defpackage.dg(this));
        }
        dqVar.q = null;
        android.view.ViewGroup viewGroup = dqVar.w;
        int i = dzs.a;
        viewGroup.requestApplyInsets();
        dqVar.I();
    }

    @Override // defpackage.ex
    public final boolean b(defpackage.ey eyVar, android.view.MenuItem menuItem) {
        defpackage.fa faVar = (defpackage.fa) this.b;
        return faVar.a.onActionItemClicked(faVar.e(eyVar), new defpackage.ga(faVar.b, menuItem));
    }

    @Override // defpackage.ex
    public final boolean c(defpackage.ey eyVar, android.view.Menu menu) {
        defpackage.fa faVar = (defpackage.fa) this.b;
        return faVar.a.onCreateActionMode(faVar.e(eyVar), faVar.f(menu));
    }

    @Override // defpackage.ex
    public final void d(defpackage.ey eyVar, android.view.Menu menu) {
        android.view.ViewGroup viewGroup = this.a.w;
        int i = dzs.a;
        viewGroup.requestApplyInsets();
        defpackage.fa faVar = (defpackage.fa) this.b;
        faVar.a.onPrepareActionMode(faVar.e(eyVar), faVar.f(menu));
    }
}
