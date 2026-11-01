package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fla implements defpackage.fma {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public fla(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.fma
    public final long a() {
        return this.f;
    }

    @Override // defpackage.fma
    public final defpackage.fly b(long j) {
        long[] jArr = this.e;
        int iAc = eum.ac(jArr, j, true);
        long j2 = jArr[iAc];
        long[] jArr2 = this.c;
        defpackage.fmb fmbVar = new defpackage.fmb(j2, jArr2[iAc]);
        if (fmbVar.b >= j || iAc == this.a - 1) {
            return new defpackage.fly(fmbVar, fmbVar);
        }
        int i = iAc + 1;
        return new defpackage.fly(fmbVar, new defpackage.fmb(jArr[i], jArr2[i]));
    }

    @Override // defpackage.fma
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.fma
    public final boolean d() {
        return true;
    }

    public final java.lang.String toString() {
        long[] jArr = this.d;
        long[] jArr2 = this.e;
        long[] jArr3 = this.c;
        return "ChunkIndex(length=" + this.a + ", sizes=" + java.util.Arrays.toString(this.b) + ", offsets=" + java.util.Arrays.toString(jArr3) + ", timeUs=" + java.util.Arrays.toString(jArr2) + ", durationsUs=" + java.util.Arrays.toString(jArr) + ')';
    }
}
