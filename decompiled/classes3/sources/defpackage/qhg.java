package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qhg extends li {
    final /* synthetic */ defpackage.qhj a;

    public qhg(defpackage.qhj qhjVar) {
        j$.util.Objects.requireNonNull(qhjVar);
        this.a = qhjVar;
    }

    public final void a(android.support.v7.widget.RecyclerView recyclerView, int i, int i2) {
        if (i2 < 0) {
            defpackage.qhj qhjVar = this.a;
            if (qhjVar.x) {
                qhjVar.h.hideSoftInputFromWindow(qhjVar.c().getWindowToken(), 0);
            }
        }
    }

    public final void g(android.support.v7.widget.RecyclerView recyclerView, int i) {
        defpackage.qhj qhjVar;
        boolean z = true;
        if (i == 1) {
            qhjVar = this.a;
        } else {
            if (i != 0) {
                return;
            }
            qhjVar = this.a;
            z = false;
        }
        qhjVar.x = z;
    }
}
