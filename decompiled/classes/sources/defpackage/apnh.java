package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apnh {
    private final int a;
    private long b;
    private long c;

    public apnh(int i) {
        this.a = i;
    }

    public final synchronized long a() {
        return this.b - this.c;
    }

    public final synchronized void b(long j, long j2) {
        try {
            if (j < 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (j2 < 0) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            long j3 = this.b + j;
            this.b = j3;
            long j4 = this.c + j2;
            this.c = j4;
            if (j4 > j3) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final java.lang.String toString() {
        return "WindowCounter(streamId=" + this.a + ", total=" + this.b + ", acknowledged=" + this.c + ", unacknowledged=" + a() + ')';
    }
}
