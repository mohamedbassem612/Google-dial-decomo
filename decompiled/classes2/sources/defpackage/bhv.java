package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bhv extends android.view.ActionMode.Callback2 implements android.view.ActionMode.Callback {
    private final defpackage.bhm a;

    public bhv(defpackage.bhm bhmVar) {
        this.a = bhmVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        this.a.a(menu);
        return menu.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bhi, java.lang.Object] */
    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(android.view.ActionMode actionMode) {
        this.a.a.a();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aomy, java.lang.Object] */
    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(android.view.ActionMode actionMode, android.view.View view, android.graphics.Rect rect) {
        cpn cpnVar = (cpn) this.a.c.a();
        rect.set(java.lang.Math.round(cpnVar.b), java.lang.Math.round(cpnVar.c), java.lang.Math.round(cpnVar.d), java.lang.Math.round(cpnVar.e));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        return this.a.a(menu);
    }
}
