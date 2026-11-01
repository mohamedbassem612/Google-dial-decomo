package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wtf extends li {
    final /* synthetic */ defpackage.wtk a;

    public wtf(defpackage.wtk wtkVar) {
        j$.util.Objects.requireNonNull(wtkVar);
        this.a = wtkVar;
    }

    public final void a(android.support.v7.widget.RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.n.N() == recyclerView.m.a() - 1) {
            android.view.View viewN = this.a.e.N();
            int i3 = dzs.a;
            defpackage.wtk.h((com.google.android.material.floatingactionbutton.FloatingActionButton) dzo.b(viewN, 2131428875));
        }
    }

    public final void g(android.support.v7.widget.RecyclerView recyclerView, int i) {
        boolean z = false;
        if (i == 0) {
            android.support.v7.widget.LinearLayoutManager linearLayoutManager = recyclerView.n;
            kh khVar = recyclerView.m;
            if (linearLayoutManager == null || khVar == null || linearLayoutManager.M() == khVar.a() - 1) {
                z = true;
            }
        }
        defpackage.wtk wtkVar = this.a;
        if (wtkVar.I != 3) {
            if (!z) {
                wtkVar.I = 1;
                return;
            }
            wtkVar.I = 2;
        } else if (!z) {
            return;
        }
        android.view.View viewN = wtkVar.e.N();
        int i2 = dzs.a;
        defpackage.wtk.h((com.google.android.material.floatingactionbutton.FloatingActionButton) dzo.b(viewN, 2131428875));
    }
}
