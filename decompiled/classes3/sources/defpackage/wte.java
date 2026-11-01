package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wte extends den {
    final /* synthetic */ android.support.v7.widget.RecyclerView a;
    final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton b;
    final /* synthetic */ defpackage.wtk c;

    public wte(defpackage.wtk wtkVar, android.support.v7.widget.RecyclerView recyclerView, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
        this.a = recyclerView;
        this.b = floatingActionButton;
        j$.util.Objects.requireNonNull(wtkVar);
        this.c = wtkVar;
    }

    public final void bL(int i, int i2) {
        if (this.c.I == 2) {
            defpackage.wtk.j(this.a);
        }
    }

    public final void cj(int i, int i2) {
        if (this.c.I == 2) {
            defpackage.wtk.j(this.a);
        } else {
            this.b.e(null, true);
        }
    }
}
