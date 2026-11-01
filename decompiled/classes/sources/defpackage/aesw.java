package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aesw {
    public int a;
    public boolean b;
    public byte c;
    public int d;
    public java.lang.Object e;

    public aesw() {
        this.e = defpackage.ahwt.a;
    }

    public final defpackage.aesx a() {
        int i;
        if (this.c == 63 && (i = this.d) != 0) {
            return new defpackage.aesx(i, this.a, (defpackage.ahyn) this.e, this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.c & 2) == 0) {
            sb.append(" forceGcBeforeRecordMemory");
        }
        if ((this.c & 4) == 0) {
            sb.append(" captureDebugMetrics");
        }
        if ((this.c & 8) == 0) {
            sb.append(" captureMemoryInfo");
        }
        if ((this.c & 16) == 0) {
            sb.append(" recordMemoryPeriodically");
        }
        if ((this.c & 32) == 0) {
            sb.append(" randomizePeriodicMemoryMetricStartTime");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ajcu, java.lang.Object] */
    public final defpackage.aens b() {
        if (this.c == 7) {
            defpackage.aens aensVar = new defpackage.aens(this.e, this.a, this.d, this.b);
            defpackage.ahvr.ca(aensVar.c > 0, "Thread pool size must be less than or equal to %s", 2);
            return aensVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" primesMetricExecutorPriority");
        }
        if ((this.c & 2) == 0) {
            sb.append(" primesMetricExecutorPoolSize");
        }
        if ((this.c & 4) == 0) {
            sb.append(" enableDeferredTasks");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c() {
        this.b = true;
        this.c = (byte) (this.c | 4);
    }

    public aesw(byte[] bArr) {
    }
}
