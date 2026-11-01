package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class kln extends defpackage.li {
    final /* synthetic */ defpackage.klo a;
    private boolean b;

    public kln(defpackage.klo kloVar) {
        j$.util.Objects.requireNonNull(kloVar);
        this.a = kloVar;
    }

    @Override // defpackage.li
    public final void g(android.support.v7.widget.RecyclerView recyclerView, int i) {
        if (this.b) {
            if (i == 0) {
                this.b = false;
            }
        } else if (i != 1) {
            this.b = true;
            defpackage.kla klaVar = (defpackage.kla) this.a.z;
            defpackage.hsh hshVar = klaVar.f;
            if (hshVar.isRunning()) {
                hshVar.end();
            }
            defpackage.hsh hshVar2 = klaVar.g;
            if (hshVar2.isRunning()) {
                hshVar2.end();
            }
        }
    }
}
