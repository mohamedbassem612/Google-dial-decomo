package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kv extends defpackage.den {
    final /* synthetic */ android.support.v7.widget.RecyclerView a;

    public kv(android.support.v7.widget.RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.den
    public final void ch() {
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        recyclerView.t(null);
        recyclerView.L.f = true;
        recyclerView.R(true);
        if (recyclerView.g.k()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.den
    public final void ci(int i, int i2, java.lang.Object obj) {
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        recyclerView.t(null);
        defpackage.hg hgVar = recyclerView.g;
        if (i2 > 0) {
            java.util.ArrayList arrayList = hgVar.a;
            arrayList.add(hgVar.b(4, i, i2, obj));
            hgVar.c |= 4;
            if (arrayList.size() == 1) {
                f();
            }
        }
    }

    @Override // defpackage.den
    public final void cj(int i, int i2) {
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        recyclerView.t(null);
        defpackage.hg hgVar = recyclerView.g;
        if (i2 > 0) {
            java.util.ArrayList arrayList = hgVar.a;
            arrayList.add(hgVar.b(1, i, i2, null));
            hgVar.c |= 1;
            if (arrayList.size() == 1) {
                f();
            }
        }
    }

    @Override // defpackage.den
    public final void d(int i, int i2) {
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        recyclerView.t(null);
        defpackage.hg hgVar = recyclerView.g;
        if (i2 > 0) {
            java.util.ArrayList arrayList = hgVar.a;
            arrayList.add(hgVar.b(2, i, i2, null));
            hgVar.c |= 2;
            if (arrayList.size() == 1) {
                f();
            }
        }
    }

    @Override // defpackage.den
    public final void e() {
        defpackage.kh khVar;
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        if (recyclerView.f == null || (khVar = recyclerView.m) == null || !khVar.s()) {
            return;
        }
        recyclerView.requestLayout();
    }

    final void f() {
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        if (!recyclerView.r || !recyclerView.q) {
            recyclerView.w = true;
            recyclerView.requestLayout();
        } else {
            java.lang.Runnable runnable = recyclerView.j;
            int i = defpackage.dzs.a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    @Override // defpackage.den
    public final void g(int i, int i2) {
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        recyclerView.t(null);
        defpackage.hg hgVar = recyclerView.g;
        if (i != i2) {
            java.util.ArrayList arrayList = hgVar.a;
            arrayList.add(hgVar.b(8, i, i2, null));
            hgVar.c |= 8;
            if (arrayList.size() == 1) {
                f();
            }
        }
    }
}
