package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class gm extends ft implements android.view.SubMenu {
    public final ft k;
    public final fv l;

    public gm(android.content.Context context, ft ftVar, fv fvVar) {
        super(context);
        this.k = ftVar;
        this.l = fvVar;
    }

    public final boolean A() {
        return this.k.A();
    }

    public final ft a() {
        return this.k.a();
    }

    public final java.lang.String d() {
        int i = this.l.a;
        if (i == 0) {
            return null;
        }
        return a.bj(i, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final android.view.MenuItem getItem() {
        return this.l;
    }

    public final void r(fr frVar) {
        this.k.r(frVar);
    }

    @Override // android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.k.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(int i) {
        super.s(0, (java.lang.CharSequence) null, i, (android.graphics.drawable.Drawable) null, (android.view.View) null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(int i) {
        super.s(i, (java.lang.CharSequence) null, 0, (android.graphics.drawable.Drawable) null, (android.view.View) null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderView(android.view.View view) {
        super.s(0, (java.lang.CharSequence) null, 0, (android.graphics.drawable.Drawable) null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(int i) {
        this.l.setIcon(i);
        return this;
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.k.setQwertyMode(z);
    }

    public final boolean v(fv fvVar) {
        return this.k.v(fvVar);
    }

    public final boolean w(ft ftVar, android.view.MenuItem menuItem) {
        return super.w(ftVar, menuItem) || this.k.w(ftVar, menuItem);
    }

    public final boolean x(fv fvVar) {
        return this.k.x(fvVar);
    }

    public final boolean y() {
        return this.k.y();
    }

    public final boolean z() {
        return this.k.z();
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable drawable) {
        this.l.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        super.s(0, (java.lang.CharSequence) null, 0, drawable, (android.view.View) null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(java.lang.CharSequence charSequence) {
        super.s(0, charSequence, 0, (android.graphics.drawable.Drawable) null, (android.view.View) null);
        return this;
    }
}
