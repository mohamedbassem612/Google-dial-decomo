package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class euk {
    private long a;
    private long b;
    private long c;
    private final java.lang.ThreadLocal d = new java.lang.ThreadLocal();

    public euk(long j) {
        i(j);
    }

    public static long g(long j) {
        return eum.z(j, 1000000L, 90000L);
    }

    public static long h(long j) {
        return eum.z(j, 90000L, 1000000L);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x002a, please report this as an issue */
    public final synchronized long a(long j) {
        long j2;
        j2 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (!j()) {
                long jLongValue = this.a;
                if (jLongValue == 9223372036854775806L) {
                    java.lang.Long l = (java.lang.Long) this.d.get();
                    if (l != null) {
                        jLongValue = l.longValue();
                    }
                }
                this.b = jLongValue - j;
                notifyAll();
            }
            this.c = j;
            j2 = this.b + j;
        }
        return j2;
    }

    public final synchronized long b(long j) {
        long jA;
        jA = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                long jH = h(j2);
                long j3 = (4294967296L + jH) / 8589934592L;
                long j4 = (((-1) + j3) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (java.lang.Math.abs(j4 - jH) < java.lang.Math.abs(j - jH)) {
                    j = j4;
                }
            }
            jA = a(g(j));
        }
        return jA;
    }

    public final synchronized long c(long j) {
        long jA;
        jA = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                long jH = h(j2);
                long j3 = jH / 8589934592L;
                java.lang.Long.signum(j3);
                long j4 = (j3 * 8589934592L) + j;
                j += (j3 + 1) * 8589934592L;
                if (j4 >= jH) {
                    j = j4;
                }
            }
            jA = a(g(j));
        }
        return jA;
    }

    public final synchronized long d() {
        long j = this.a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long e() {
        long j;
        j = this.c;
        return j != -9223372036854775807L ? j + this.b : d();
    }

    public final synchronized long f() {
        return this.b;
    }

    public final synchronized void i(long j) {
        this.a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
        this.d.remove();
    }

    public final synchronized boolean j() {
        return this.b != -9223372036854775807L;
    }
}
