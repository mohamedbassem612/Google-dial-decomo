package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anwd {
    private java.util.ArrayList a = new java.util.ArrayList();
    private volatile defpackage.anmm b = defpackage.anmm.d;

    public final void a(defpackage.anmm anmmVar) {
        defpackage.ahvr.cj(anmmVar, "newState");
        if (this.b == anmmVar || this.b == defpackage.anmm.e) {
            return;
        }
        this.b = anmmVar;
        if (this.a.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = this.a;
        this.a = new java.util.ArrayList();
        if (arrayList.size() > 0) {
            throw null;
        }
    }
}
