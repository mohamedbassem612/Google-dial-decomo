package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fru implements defpackage.fll {
    private final defpackage.fll a;
    private final defpackage.frr b;
    private final android.util.SparseArray c = new android.util.SparseArray();
    private boolean d;

    public fru(defpackage.fll fllVar, defpackage.frr frrVar) {
        this.a = fllVar;
        this.b = frrVar;
    }

    @Override // defpackage.fll
    public final defpackage.fmk r(int i, int i2) {
        if (i2 != 3 && i2 != 5) {
            this.d = true;
        }
        if (i2 != 3) {
            return this.a.r(i, i2);
        }
        android.util.SparseArray sparseArray = this.c;
        defpackage.frw frwVar = (defpackage.frw) sparseArray.get(i);
        if (frwVar != null) {
            return frwVar;
        }
        defpackage.frw frwVar2 = new defpackage.frw(this.a.r(i, 3), this.b);
        sparseArray.put(i, frwVar2);
        return frwVar2;
    }

    @Override // defpackage.fll
    public final void s() {
        this.a.s();
        if (!this.d) {
            return;
        }
        int i = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            ((defpackage.frw) sparseArray.valueAt(i)).d = true;
            i++;
        }
    }

    @Override // defpackage.fll
    public final void y(defpackage.fma fmaVar) {
        this.a.y(fmaVar);
    }
}
