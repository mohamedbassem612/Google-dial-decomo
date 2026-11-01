package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lmi extends defpackage.li {
    final /* synthetic */ android.support.v7.widget.LinearLayoutManager a;
    final /* synthetic */ defpackage.lmk b;

    public lmi(defpackage.lmk lmkVar, android.support.v7.widget.LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
        j$.util.Objects.requireNonNull(lmkVar);
        this.b = lmkVar;
    }

    @Override // defpackage.li
    public final void a(android.support.v7.widget.RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        android.support.v7.widget.LinearLayoutManager linearLayoutManager = this.a;
        defpackage.lmk lmkVar = this.b;
        int iN = linearLayoutManager.N();
        defpackage.lmb lmbVar = lmkVar.e;
        boolean z = iN == lmbVar.a() + (-1);
        lmkVar.l = z && !recyclerView.canScrollVertically(1);
        lmbVar.j = z;
    }

    @Override // defpackage.li
    public final void g(android.support.v7.widget.RecyclerView recyclerView, int i) {
        this.b.m = i == 1;
    }
}
