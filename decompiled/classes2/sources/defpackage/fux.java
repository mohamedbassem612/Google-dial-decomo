package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fux implements defpackage.fus {
    final /* synthetic */ defpackage.fuz a;
    private final defpackage.etv b;

    public fux(defpackage.fuz fuzVar) {
        j$.util.Objects.requireNonNull(fuzVar);
        this.a = fuzVar;
        this.b = new defpackage.etv(new byte[4]);
    }

    @Override // defpackage.fus
    public final void a(defpackage.etx etxVar) {
        if (etxVar.n() != 0 || (etxVar.n() & 128) == 0) {
            return;
        }
        etxVar.R(6);
        int iD = etxVar.d() / 4;
        for (int i = 0; i < iD; i++) {
            defpackage.etv etvVar = this.b;
            etxVar.J(etvVar, 4);
            int iD2 = etvVar.d(16);
            etvVar.n(3);
            if (iD2 == 0) {
                etvVar.n(13);
            } else {
                int iD3 = etvVar.d(13);
                defpackage.fuz fuzVar = this.a;
                android.util.SparseArray sparseArray = fuzVar.b;
                if (sparseArray.get(iD3) == null) {
                    sparseArray.put(iD3, new defpackage.fut(new defpackage.fuy(fuzVar, iD3)));
                    fuzVar.f++;
                }
            }
        }
        this.a.b.remove(0);
    }

    @Override // defpackage.fus
    public final void b(defpackage.euk eukVar, defpackage.fll fllVar, defpackage.fvb fvbVar) {
    }
}
