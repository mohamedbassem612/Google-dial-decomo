package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fkb {
    private long a;
    private long b;
    private double c;
    private android.util.Range d;

    public fkb() {
        android.util.Range range = new android.util.Range(java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(1.0d));
        this.d = range;
        this.c = ((java.lang.Double) range.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final long a(long j) {
        long j2 = this.a;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.b + ((j - j2) * this.c));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public final void b(long j, long j2) {
        double dDoubleValue;
        ahvr.bM(j != -9223372036854775807L);
        ahvr.bM(j2 != -9223372036854775807L);
        long j3 = this.a;
        if (j3 != -9223372036854775807L) {
            long j4 = this.b;
            if (j4 == -9223372036854775807L || j == j3) {
                dDoubleValue = ((java.lang.Double) this.d.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j2 - j4) / (j - j3);
            }
        } else {
            dDoubleValue = ((java.lang.Double) this.d.getUpper()).doubleValue();
        }
        this.c = (this.c * 0.800000011920929d) + (((java.lang.Double) this.d.clamp(java.lang.Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d);
        this.a = j;
        this.b = j2;
    }

    public final void c() {
        this.c = ((java.lang.Double) this.d.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void d(float f) {
        ahvr.bM(f > 0.0f);
        this.d = new android.util.Range(java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(1.0d / ((double) f)));
        c();
    }
}
