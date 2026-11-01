package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahps implements android.view.MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ ahpz a;
    public final /* synthetic */ java.lang.String b = "modernized_main_navigation_drawer_menu_item_clicked";
    public final /* synthetic */ android.view.MenuItem.OnMenuItemClickListener c;

    public /* synthetic */ ahps(ahpz ahpzVar, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = ahpzVar;
        this.c = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        aooh.f(menuItem, "menuItem");
        ahpz ahpzVar = this.a;
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.c;
        ahok ahokVarF = ahpzVar.f(750, this.b);
        try {
            boolean zOnMenuItemClick = onMenuItemClickListener.onMenuItemClick(menuItem);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
            return zOnMenuItemClick;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }
}
