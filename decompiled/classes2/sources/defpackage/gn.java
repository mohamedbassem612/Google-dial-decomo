package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gn extends defpackage.gh implements android.view.SubMenu {
    private final defpackage.dwy d;

    public gn(android.content.Context context, defpackage.dwy dwyVar) {
        super(context, dwyVar);
        this.d = dwyVar;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.d.clearHeader();
    }

    @Override // android.view.SubMenu
    public final android.view.MenuItem getItem() {
        return a(this.d.getItem());
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(int i) {
        this.d.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(int i) {
        this.d.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderView(android.view.View view) {
        this.d.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(int i) {
        this.d.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        this.d.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(java.lang.CharSequence charSequence) {
        this.d.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }
}
