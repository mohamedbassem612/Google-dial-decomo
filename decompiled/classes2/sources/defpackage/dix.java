package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dix {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final float[] e;
    private final long f;
    private final dao g;

    public dix(long j, long j2, long j3, long j4, long j5, float[] fArr, dao daoVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.f = j5;
        this.e = fArr;
        this.g = daoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.dix dixVar = (defpackage.dix) obj;
            if (this.a == dixVar.a && this.b == dixVar.b && this.f == dixVar.f && this.c == dixVar.c && this.d == dixVar.d) {
                float[] fArr = this.e;
                float[] fArr2 = dixVar.e;
                if (fArr != null ? !(fArr2 == null || !aooh.n(fArr, fArr2)) : fArr2 == null) {
                    if (aooh.n(this.g, dixVar.g)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.e;
        int iHashCode = fArr != null ? java.util.Arrays.hashCode(fArr) : 0;
        long j = this.d;
        long j2 = this.c;
        long j3 = this.f;
        long j4 = this.b;
        long j5 = this.a;
        return (((((((((((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode) * 31) + this.g.hashCode();
    }
}
