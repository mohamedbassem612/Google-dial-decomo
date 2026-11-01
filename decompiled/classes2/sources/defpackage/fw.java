package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fw extends dzk implements android.view.ActionProvider.VisibilityListener {
    public static final /* synthetic */ int c = 0;
    public final android.view.ActionProvider a;
    final /* synthetic */ defpackage.ga b;
    private apnt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(defpackage.ga gaVar, android.view.ActionProvider actionProvider) {
        super((byte[]) null);
        this.b = gaVar;
        this.a = actionProvider;
    }

    public final android.view.View a(android.view.MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    public final void b(android.view.SubMenu subMenu) {
        this.a.onPrepareSubMenu(this.b.b(subMenu));
    }

    public final boolean c() {
        return this.a.hasSubMenu();
    }

    public final boolean d() {
        return this.a.isVisible();
    }

    public final boolean e() {
        return this.a.onPerformDefaultAction();
    }

    public final boolean f() {
        return this.a.overridesItemVisibility();
    }

    public final void g(apnt apntVar) {
        this.d = apntVar;
        this.a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        apnt apntVar = this.d;
        if (apntVar != null) {
            ((fv) apntVar.a).j.D();
        }
    }
}
