package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class csq extends css {
    public int a;
    private final long b;
    private final long c;
    private final long d;
    private float e;
    private cqh f;
    private final cpu g;

    public csq(cpu cpuVar, long j) {
        int i;
        this.g = cpuVar;
        this.b = 0L;
        this.c = j;
        this.a = 1;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > cpuVar.c() || i > cpuVar.b()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        this.d = j;
        this.e = 1.0f;
    }

    public final long a() {
        return dpy.l(this.d);
    }

    protected final void b(csj csjVar) {
        den.L(csjVar, this.g, this.c, (java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32))) << 32) | (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L)))) & 4294967295L), this.e, this.f, this.a, 328);
    }

    protected final void c(float f) {
        this.e = f;
    }

    protected final void d(cqh cqhVar) {
        this.f = cqhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.csq) {
            defpackage.csq csqVar = (defpackage.csq) obj;
            if (aooh.n(this.g, csqVar.g)) {
                long j = csqVar.b;
                if (this.c == csqVar.c && this.a == csqVar.a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 961;
        long j = this.c;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.a;
    }

    public final java.lang.String toString() {
        long j = this.c;
        return "BitmapPainter(image=" + this.g + ", srcOffset=" + dpn.e(0L) + ", srcSize=" + dpp.a(j) + ", filterQuality=" + (1 != this.a ? "None" : "Low") + ')';
    }

    public /* synthetic */ csq(cpu cpuVar) {
        this(cpuVar, (((long) cpuVar.c()) << 32) | (((long) cpuVar.b()) & 4294967295L));
    }
}
