package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fln implements defpackage.fma {
    private final defpackage.flo a;
    private final long b;

    public fln(defpackage.flo floVar, long j) {
        this.a = floVar;
        this.b = j;
    }

    private final defpackage.fmb e(long j, long j2) {
        return new defpackage.fmb((j * 1000000) / ((long) this.a.e), this.b + j2);
    }

    @Override // defpackage.fma
    public final long a() {
        return this.a.a();
    }

    @Override // defpackage.fma
    public final defpackage.fly b(long j) {
        defpackage.flo floVar = this.a;
        ils ilsVar = floVar.k;
        ahvr.ci(ilsVar);
        java.lang.Object obj = ilsVar.b;
        java.lang.Object obj2 = ilsVar.a;
        long[] jArr = (long[]) obj;
        int iAc = eum.ac(jArr, floVar.b(j), false);
        defpackage.fmb fmbVarE = e(iAc == -1 ? 0L : jArr[iAc], iAc != -1 ? ((long[]) obj2)[iAc] : 0L);
        if (fmbVarE.b == j || iAc == jArr.length - 1) {
            return new defpackage.fly(fmbVarE, fmbVarE);
        }
        int i = iAc + 1;
        return new defpackage.fly(fmbVarE, e(jArr[i], ((long[]) obj2)[i]));
    }

    @Override // defpackage.fma
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.fma
    public final boolean d() {
        return true;
    }
}
