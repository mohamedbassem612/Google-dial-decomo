package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ju implements android.widget.AbsListView.OnScrollListener {
    final /* synthetic */ defpackage.jv a;

    public ju(defpackage.jv jvVar) {
        this.a = jvVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(android.widget.AbsListView absListView, int i) {
        if (i == 1) {
            defpackage.jv jvVar = this.a;
            if (jvVar.u() || jvVar.p.getContentView() == null) {
                return;
            }
            defpackage.jd jdVar = jvVar.q;
            jvVar.n.removeCallbacks(jdVar);
            jdVar.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(android.widget.AbsListView absListView, int i, int i2, int i3) {
    }
}
