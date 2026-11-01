package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cuy {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    public cuy(long j, long j2, float f, long j3) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = 0L;
    }

    public final java.lang.String toString() {
        long j = this.d;
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + cpm.c(this.b) + ", scaleFactor=" + this.c + ", panOffset=" + cpm.c(j) + ')';
    }

    public cuy(long j, long j2, float f, long j3, long j4) {
        this(j, j2, f, j3);
        this.e = j4;
    }
}
