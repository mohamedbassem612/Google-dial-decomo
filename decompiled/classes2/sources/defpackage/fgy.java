package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fgy extends defpackage.fhi {
    public final java.util.List e;

    public fgy(defpackage.ffw ffwVar) {
        super(ffwVar);
        this.e = new java.util.ArrayList();
    }

    @Override // defpackage.fhi, defpackage.ffw
    public final defpackage.ffs A(defpackage.ffu ffuVar, defpackage.fio fioVar, long j) {
        defpackage.fhe fheVar = new defpackage.fhe(super.A(ffuVar, fioVar, j), 0L);
        this.e.add(fheVar);
        return fheVar;
    }

    @Override // defpackage.fhi, defpackage.ffw
    public final void E(defpackage.ffs ffsVar) {
        defpackage.fhe fheVar = (defpackage.fhe) ffsVar;
        this.e.remove(fheVar);
        super.E(fheVar.a);
    }
}
