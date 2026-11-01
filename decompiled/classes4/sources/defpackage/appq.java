package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class appq implements apqd {
    private final appa a;
    private final apoy b;
    private appy c;
    private int d;
    private boolean e;
    private long f;

    public appq(appa appaVar) {
        this.a = appaVar;
        apoy apoyVar = ((appx) appaVar).b;
        this.b = apoyVar;
        appy appyVar = apoyVar.a;
        this.c = appyVar;
        this.d = appyVar != null ? appyVar.b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r8 != r9.b) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(apoy r7, long r8) {
        /*
            r6 = this;
            boolean r8 = r6.e
            if (r8 != 0) goto L59
            appy r8 = r6.c
            if (r8 == 0) goto L1f
            apoy r9 = r6.b
            appy r9 = r9.a
            if (r8 != r9) goto L17
            int r8 = r6.d
            aooh.c(r9)
            int r9 = r9.b
            if (r8 == r9) goto L1f
        L17:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Peek source is invalid because upstream source was used"
            r6.<init>(r7)
            throw r6
        L1f:
            appa r8 = r6.a
            long r0 = r6.f
            r2 = 1
            long r0 = r0 + r2
            boolean r8 = r8.C(r0)
            if (r8 != 0) goto L2f
            r6 = -1
            goto L58
        L2f:
            appy r8 = r6.c
            if (r8 != 0) goto L3f
            apoy r8 = r6.b
            appy r8 = r8.a
            if (r8 == 0) goto L3f
            r6.c = r8
            int r8 = r8.b
            r6.d = r8
        L3f:
            apoy r0 = r6.b
            long r8 = r0.b
            long r1 = r6.f
            long r8 = r8 - r1
            r1 = 8192(0x2000, double:4.0474E-320)
            long r4 = java.lang.Math.min(r1, r8)
            long r2 = r6.f
            r1 = r7
            r0.F(r1, r2, r4)
            long r7 = r6.f
            long r7 = r7 + r4
            r6.f = r7
            r6 = r4
        L58:
            return r6
        L59:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "closed"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.appq.b(apoy, long):long");
    }

    public final void close() {
        this.e = true;
    }

    public final apqf fP() {
        return this.a.fP();
    }
}
