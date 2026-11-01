package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeul {
    public float a;
    public defpackage.ahyn b = defpackage.ahwt.a;
    public byte c;
    public int d;
    private int e;

    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    public final defpackage.aeum a() {
        int i;
        if (this.c == 3 && (i = this.d) != 0) {
            defpackage.aeum aeumVar = new defpackage.aeum(i, this.e, this.a, this.b);
            defpackage.ahvr.bZ((aeumVar.a ^ (-1)) >>> 31, "Rate limit per second must be >= 0");
            float f = aeumVar.b;
            defpackage.ahvr.bZ(f > 0.0f && f <= 1.0f, "Sampling Probability shall be > 0 and <= 1");
            return aeumVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.c & 2) == 0) {
            sb.append(" samplingProbability");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.e = i;
        this.c = (byte) (this.c | 1);
    }
}
