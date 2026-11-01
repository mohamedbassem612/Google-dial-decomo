package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fy implements android.view.MenuItem.OnActionExpandListener {
    final /* synthetic */ defpackage.ga a;
    private final android.view.MenuItem.OnActionExpandListener b;

    public fy(defpackage.ga gaVar, android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a = gaVar;
        this.b = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(android.view.MenuItem menuItem) {
        return this.b.onMenuItemActionCollapse(this.a.a(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(android.view.MenuItem menuItem) {
        return this.b.onMenuItemActionExpand(this.a.a(menuItem));
    }
}
