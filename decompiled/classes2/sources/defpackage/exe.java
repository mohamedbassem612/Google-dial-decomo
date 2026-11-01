package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class exe {
    public final long a;
    public final long b;
    public long c = -9223372036854775807L;
    private long n = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long f = -9223372036854775807L;
    public float i = 0.97f;
    public float h = 1.03f;
    public float j = 1.0f;
    public long k = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long l = -9223372036854775807L;
    public long m = -9223372036854775807L;

    public exe(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long c(long j, long j2) {
        return (long) ((j * 0.999f) + (j2 * 9.999871E-4f));
    }

    public final void a() {
        long j;
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            j = this.n;
            if (j == -9223372036854775807L) {
                long j3 = this.e;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.f;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.d != j) {
            this.d = j;
            this.g = j;
            this.l = -9223372036854775807L;
            this.m = -9223372036854775807L;
            this.k = -9223372036854775807L;
        }
    }

    public final void b(long j) {
        this.n = j;
        a();
    }
}
