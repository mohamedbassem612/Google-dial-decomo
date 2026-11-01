package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kg implements defpackage.dyn {
    final /* synthetic */ android.support.v7.widget.RecyclerView a;

    public kg(android.support.v7.widget.RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.dyn
    public final float a() {
        float f;
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        if (recyclerView.n.ai()) {
            f = recyclerView.H;
        } else {
            if (!recyclerView.n.ah()) {
                return 0.0f;
            }
            f = recyclerView.G;
        }
        return -f;
    }

    @Override // defpackage.dyn
    public final void b() {
        this.a.ag();
    }

    @Override // defpackage.dyn
    public final boolean c(float f) {
        int i;
        int i2;
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        if (recyclerView.n.ai()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.n.ah()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        recyclerView.ag();
        return recyclerView.aj(i, i2, 0, Integer.MAX_VALUE);
    }
}
