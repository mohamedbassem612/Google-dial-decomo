package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dx implements fr {
    final /* synthetic */ defpackage.dy a;

    public dx(defpackage.dy dyVar) {
        this.a = dyVar;
    }

    public final void H(ft ftVar) {
        defpackage.dy dyVar = this.a;
        if (dyVar.c.m()) {
            dyVar.a.onPanelClosed(108, ftVar);
            return;
        }
        android.view.Window.Callback callback = dyVar.a;
        if (callback.onPreparePanel(0, null, ftVar)) {
            callback.onMenuOpened(108, ftVar);
        }
    }

    public final boolean L(ft ftVar, android.view.MenuItem menuItem) {
        return false;
    }
}
