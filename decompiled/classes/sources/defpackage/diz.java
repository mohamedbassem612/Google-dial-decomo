package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class diz {
    public defpackage.diy a;
    public long b;
    public long c;
    public long d;
    public long e;
    public float[] f;
    public final defpackage.aco g;

    public diz() {
        defpackage.aco acoVar = defpackage.acp.a;
        this.g = new defpackage.aco(6);
        this.b = -1L;
        this.c = 0L;
        this.d = 0L;
    }

    public static final void b(defpackage.diy diyVar, long j, long j2, float[] fArr, long j3) {
        long j4 = diyVar.e;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            diyVar.e = j3;
            diyVar.a(diyVar.c, diyVar.d, j, j2, fArr);
        }
    }

    public final boolean a(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (j2 == this.c) {
            z = false;
        } else {
            this.c = j2;
            z = true;
        }
        if (j != this.d) {
            this.d = j;
            z = true;
        }
        if (fArr != null) {
            this.f = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.e) {
            return z;
        }
        this.e = j3;
        return true;
    }
}
