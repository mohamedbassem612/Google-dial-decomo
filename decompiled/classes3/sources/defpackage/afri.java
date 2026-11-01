package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afri implements android.view.MenuItem.OnMenuItemClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ afri(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, oqx] */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        if (this.$cid != 0) {
            aooh.f(menuItem, "it");
            menuItem.getActionView();
            this.a.e();
        } else {
            ((android.widget.Button) this.a).performClick();
        }
        return true;
    }
}
