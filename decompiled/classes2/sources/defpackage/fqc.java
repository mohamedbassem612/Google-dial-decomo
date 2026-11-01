package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fqc implements defpackage.fmi {
    private final android.util.SparseArray a;
    private final android.util.SparseArray b;
    private final long c;
    private final long d;
    private final int e;

    public fqc(android.util.SparseArray sparseArray, android.util.SparseArray sparseArray2, long j, long j2, int i) {
        this.a = sparseArray;
        this.b = sparseArray2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.fma
    public final long a() {
        return this.c;
    }

    @Override // defpackage.fma
    public final defpackage.fly b(long j) {
        return e(j, this.e);
    }

    @Override // defpackage.fma
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.fma
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fmi
    public final defpackage.fly e(long j, int i) {
        android.util.SparseArray sparseArray = this.a;
        long[] jArr = (long[]) sparseArray.get(i);
        android.util.SparseArray sparseArray2 = this.b;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            int i2 = this.e;
            jArr = (long[]) sparseArray.get(i2);
            jArr2 = (long[]) sparseArray2.get(i2);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j < jArr[0]) {
            defpackage.fmb fmbVar = new defpackage.fmb(0L, this.d);
            return new defpackage.fly(fmbVar, fmbVar);
        }
        int iAc = eum.ac(jArr, j, true);
        defpackage.fmb fmbVar2 = new defpackage.fmb(jArr[iAc], jArr2[iAc]);
        return new defpackage.fly(fmbVar2, fmbVar2);
    }

    @Override // defpackage.fmi
    public final boolean f(int i) {
        return this.a.indexOfKey(i) >= 0;
    }
}
