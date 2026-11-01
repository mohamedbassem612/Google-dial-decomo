package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fz implements android.view.MenuItem.OnMenuItemClickListener {
    final /* synthetic */ defpackage.ga a;
    private final android.view.MenuItem.OnMenuItemClickListener b;

    public fz(defpackage.ga gaVar, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = gaVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
