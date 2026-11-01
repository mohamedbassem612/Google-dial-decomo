package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lr implements defpackage.fr {
    private final /* synthetic */ int $cid;
    final /* synthetic */ android.view.ViewGroup a;

    public lr(android.view.ViewGroup viewGroup, int i) {
        this.$cid = i;
        this.a = viewGroup;
    }

    @Override // defpackage.fr
    public final void H(defpackage.ft ftVar) {
        int i = this.$cid;
        android.view.ViewGroup viewGroup = this.a;
        if (i != 0) {
            defpackage.fr frVar = ((android.support.v7.widget.ActionMenuView) viewGroup).d;
            if (frVar != null) {
                frVar.H(ftVar);
                return;
            }
            return;
        }
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) viewGroup;
        if (!toolbar.a.m()) {
            toolbar.A.bq(ftVar);
        }
        defpackage.fr frVar2 = toolbar.y;
        if (frVar2 != null) {
            frVar2.H(ftVar);
        }
    }

    @Override // defpackage.fr
    public final boolean L(defpackage.ft ftVar, android.view.MenuItem menuItem) {
        defpackage.apnt apntVar;
        defpackage.lv lvVar;
        if (this.$cid == 0 || (apntVar = ((android.support.v7.widget.ActionMenuView) this.a).e) == null) {
            return false;
        }
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) apntVar.a;
        return toolbar.A.br(menuItem) || ((lvVar = toolbar.u) != null && lvVar.a(menuItem));
    }
}
