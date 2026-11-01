package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rpw implements android.view.MenuItem.OnMenuItemClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ rpw(bhd bhdVar, bhm bhmVar, int i) {
        this.$cid = i;
        this.b = bhdVar;
        this.a = bhmVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        if (this.$cid != 0) {
            ((bhf) this.b).d.a(((bhm) this.a).a);
        } else {
            aooh.f(menuItem, "it");
            rqi rqiVar = (rqi) this.a;
            androidx.drawerlayout.widget.DrawerLayout drawerLayoutJ = rqi.j(rqiVar.b.N());
            if (drawerLayoutJ.s()) {
                drawerLayoutJ.v(new defpackage.rqe(rqiVar, (rnz) this.b));
                drawerLayoutJ.p();
            }
        }
        return true;
    }

    public /* synthetic */ rpw(rqi rqiVar, rnz rnzVar, int i) {
        this.$cid = i;
        this.a = rqiVar;
        this.b = rnzVar;
    }
}
