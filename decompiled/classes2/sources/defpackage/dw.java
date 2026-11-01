package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dw implements gd {
    final /* synthetic */ defpackage.dy a;
    private boolean b;

    public dw(defpackage.dy dyVar) {
        this.a = dyVar;
    }

    public final void a(ft ftVar, boolean z) {
        if (this.b) {
            return;
        }
        this.b = true;
        defpackage.dy dyVar = this.a;
        dyVar.c.d();
        dyVar.a.onPanelClosed(108, ftVar);
        this.b = false;
    }

    public final boolean b(ft ftVar) {
        this.a.a.onMenuOpened(108, ftVar);
        return true;
    }
}
