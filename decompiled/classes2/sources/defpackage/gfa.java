package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gfa extends dye {
    final /* synthetic */ defpackage.gfb a;

    public gfa(defpackage.gfb gfbVar) {
        this.a = gfbVar;
    }

    public final void c(android.view.View view, defpackage.ebd ebdVar) {
        defpackage.gfb gfbVar = this.a;
        gfbVar.d.c(view, ebdVar);
        android.support.v7.widget.RecyclerView recyclerView = gfbVar.c;
        int iC = recyclerView.c(view);
        kh khVar = recyclerView.m;
        if (khVar instanceof defpackage.geu) {
            ((defpackage.geu) khVar).w(iC);
        }
    }

    public final boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        return this.a.d.i(view, i, bundle);
    }
}
