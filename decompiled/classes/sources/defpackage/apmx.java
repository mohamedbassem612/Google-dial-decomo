package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apmx implements defpackage.apqd {
    public final long a;
    public boolean b;
    public final defpackage.apoy c = new defpackage.apoy();
    public final defpackage.apoy d = new defpackage.apoy();
    public boolean e;
    final /* synthetic */ defpackage.apmz f;

    public apmx(defpackage.apmz apmzVar, long j, boolean z) {
        this.f = apmzVar;
        this.a = j;
        this.b = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: apng */
    /* JADX WARN: Bottom block not found for handler: all -> 0x00aa */
    @Override // defpackage.apqd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.apoy r19, long r20) throws apng {
        /*
            r18 = this;
            r0 = r18
        L2:
            apmz r1 = r0.f
            monitor-enter(r1)
            boolean r2 = r1.l()     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L10
            apmy r3 = r1.i     // Catch: java.lang.Throwable -> Laa
            r3.d()     // Catch: java.lang.Throwable -> Laa
        L10:
            apme r3 = r1.c()     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto L2b
            boolean r3 = r0.b     // Catch: java.lang.Throwable -> La1
            if (r3 != 0) goto L2b
            java.io.IOException r3 = r1.k     // Catch: java.lang.Throwable -> La1
            if (r3 != 0) goto L2c
            apng r3 = new apng     // Catch: java.lang.Throwable -> La1
            apme r5 = r1.c()     // Catch: java.lang.Throwable -> La1
            defpackage.aooh.c(r5)     // Catch: java.lang.Throwable -> La1
            r3.<init>(r5)     // Catch: java.lang.Throwable -> La1
            goto L2c
        L2b:
            r3 = 0
        L2c:
            boolean r5 = r0.e     // Catch: java.lang.Throwable -> La1
            if (r5 != 0) goto L99
            apoy r5 = r0.d     // Catch: java.lang.Throwable -> La1
            long r6 = r5.b     // Catch: java.lang.Throwable -> La1
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r13 = 0
            if (r10 <= 0) goto L70
            r14 = 8192(0x2000, double:4.0474E-320)
            long r6 = java.lang.Math.min(r14, r6)     // Catch: java.lang.Throwable -> La1
            r10 = r19
            long r5 = r5.b(r10, r6)     // Catch: java.lang.Throwable -> La1
            apnh r7 = r1.c     // Catch: java.lang.Throwable -> La1
            r7.b(r5, r8)     // Catch: java.lang.Throwable -> La1
            long r14 = r7.a()     // Catch: java.lang.Throwable -> La1
            if (r3 != 0) goto L6c
            apms r3 = r1.b     // Catch: java.lang.Throwable -> La1
            apnf r4 = r3.q     // Catch: java.lang.Throwable -> La1
            int r4 = r4.c()     // Catch: java.lang.Throwable -> La1
            int r4 = r4 / 2
            r16 = -1
            long r11 = (long) r4     // Catch: java.lang.Throwable -> La1
            int r4 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r4 < 0) goto L7e
            int r4 = r1.a     // Catch: java.lang.Throwable -> La1
            r3.l(r4, r14)     // Catch: java.lang.Throwable -> La1
            r7.b(r8, r14)     // Catch: java.lang.Throwable -> La1
            goto L7e
        L6c:
            r16 = -1
            r4 = r3
            goto L83
        L70:
            r16 = -1
            boolean r4 = r0.b     // Catch: java.lang.Throwable -> La1
            if (r4 != 0) goto L80
            if (r3 != 0) goto L80
            r1.k()     // Catch: java.lang.Throwable -> La1
            r13 = 1
            r5 = r16
        L7e:
            r4 = 0
            goto L83
        L80:
            r4 = r3
            r5 = r16
        L83:
            if (r2 == 0) goto L8a
            apmy r2 = r1.i     // Catch: java.lang.Throwable -> Laa
            r2.b()     // Catch: java.lang.Throwable -> Laa
        L8a:
            monitor-exit(r1)
            if (r13 != 0) goto L2
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L93
            r11 = r5
            goto L97
        L93:
            if (r4 != 0) goto L98
            r11 = r16
        L97:
            return r11
        L98:
            throw r4
        L99:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = "stream closed"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> La1
            throw r0     // Catch: java.lang.Throwable -> La1
        La1:
            r0 = move-exception
            if (r2 == 0) goto La9
            apmy r2 = r1.i     // Catch: java.lang.Throwable -> Laa
            r2.b()     // Catch: java.lang.Throwable -> Laa
        La9:
            throw r0     // Catch: java.lang.Throwable -> Laa
        Laa:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apmx.b(apoy, long):long");
    }

    public final void c(long j) {
        java.util.TimeZone timeZone = defpackage.apjx.a;
        this.f.b.g(j);
    }

    @Override // defpackage.apqd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        defpackage.apmz apmzVar = this.f;
        synchronized (apmzVar) {
            this.e = true;
            defpackage.apoy apoyVar = this.d;
            j = apoyVar.b;
            apoyVar.y();
            apmzVar.notifyAll();
        }
        if (j > 0) {
            c(j);
        }
        this.f.e();
    }

    @Override // defpackage.apqd
    public final defpackage.apqf fP() {
        return this.f.i;
    }
}
