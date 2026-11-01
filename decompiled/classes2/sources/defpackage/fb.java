package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fb extends android.view.ActionMode {
    final android.content.Context a;
    final defpackage.ey b;

    public fb(android.content.Context context, defpackage.ey eyVar) {
        this.a = context;
        this.b = eyVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.f();
    }

    @Override // android.view.ActionMode
    public final android.view.View getCustomView() {
        return this.b.c();
    }

    @Override // android.view.ActionMode
    public final android.view.Menu getMenu() {
        return new defpackage.gh(this.a, this.b.a());
    }

    @Override // android.view.ActionMode
    public final android.view.MenuInflater getMenuInflater() {
        return this.b.b();
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getSubtitle() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final java.lang.Object getTag() {
        return this.b.d;
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getTitle() {
        return this.b.e();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.e;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.n();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(android.view.View view) {
        this.b.h(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.i(i);
    }

    @Override // android.view.ActionMode
    public final void setTag(java.lang.Object obj) {
        this.b.d = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.k(i);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.m(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(java.lang.CharSequence charSequence) {
        this.b.j(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(java.lang.CharSequence charSequence) {
        this.b.l(charSequence);
    }
}
