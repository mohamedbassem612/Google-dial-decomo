package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lyf implements android.view.View.OnScrollChangeListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ android.support.v7.widget.RecyclerView a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ lyf(android.support.v7.widget.RecyclerView recyclerView, whl whlVar, int i) {
        this.$cid = i;
        this.a = recyclerView;
        this.b = whlVar;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
        int i5 = this.$cid;
        if (i5 == 0) {
            aimz aimzVar = defpackage.lyi.a;
            ((com.google.android.material.appbar.AppBarLayout) this.b).o(this.a.canScrollVertically(-1));
            return;
        }
        if (i5 != 1) {
            whl.c(this.a, (whl) this.b);
        } else {
            ((com.google.android.material.appbar.AppBarLayout) this.b).o(!this.a.canScrollVertically(-1));
        }
    }

    public /* synthetic */ lyf(com.google.android.material.appbar.AppBarLayout appBarLayout, android.support.v7.widget.RecyclerView recyclerView, int i) {
        this.$cid = i;
        this.b = appBarLayout;
        this.a = recyclerView;
    }
}
