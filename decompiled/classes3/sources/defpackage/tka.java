package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tka extends li {
    final /* synthetic */ defpackage.tkd a;

    public tka(defpackage.tkd tkdVar) {
        j$.util.Objects.requireNonNull(tkdVar);
        this.a = tkdVar;
    }

    public final void g(android.support.v7.widget.RecyclerView recyclerView, int i) {
        if (i == 1) {
            defpackage.tkd tkdVar = this.a;
            if (tkdVar.e.isAcceptingText()) {
                tkdVar.b.o(rmx.jP);
                tkdVar.e.hideSoftInputFromWindow(tkdVar.N().getWindowToken(), 0);
            }
        }
    }
}
