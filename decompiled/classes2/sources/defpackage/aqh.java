package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aqh extends aomh implements aonn {
    int a;
    final /* synthetic */ aqi b;
    final /* synthetic */ defpackage.auo c;
    final /* synthetic */ aqb d;
    final /* synthetic */ long e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqh(aqi aqiVar, defpackage.auo auoVar, aqb aqbVar, long j, aoln aolnVar) {
        super(2, aolnVar);
        this.b = aqiVar;
        this.c = auoVar;
        this.d = aqbVar;
        this.e = j;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f
            aoss r0 = (aoss) r0
            aolu r1 = aolu.a
            int r2 = r13.a
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L10
            aooc.af(r14)     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            goto L3a
        L10:
            aooc.af(r14)
            aolr r14 = r0.c()
            aoub r11 = aooc.V(r14)
            aqi r7 = r13.b     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            r14 = 1
            r7.h = r14     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            ato r0 = r7.b     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            aoc r2 = defpackage.aoc.a     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            aqg r5 = new aqg     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            auo r6 = r13.c     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            aqb r8 = r13.d     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            long r9 = r13.e     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r11, r12)     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            r13.f = r3     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            r13.a = r14     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            java.lang.Object r14 = r0.i(r2, r5, r13)     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            if (r14 == r1) goto L76
        L3a:
            aqi r14 = r13.b     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            kaw r14 = r14.i     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            java.lang.Object r14 = r14.a     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            r0 = r14
            cfc r0 = (cfc) r0     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            int r0 = r0.b     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            aopq r0 = aooc.C(r4, r0)     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            int r1 = r0.a     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            int r0 = r0.b     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            if (r1 > r0) goto L64
        L4f:
            r2 = r14
            cfc r2 = (cfc) r2     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            java.lang.Object[] r2 = r2.a     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            r2 = r2[r1]     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            aqe r2 = (aqe) r2     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            aosb r2 = r2.b     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            aojh r5 = aojh.a     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            r2.w(r5)     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            if (r1 == r0) goto L64
            int r1 = r1 + 1
            goto L4f
        L64:
            cfc r14 = (cfc) r14     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            r14.g()     // Catch: java.util.concurrent.CancellationException -> L77 java.lang.Throwable -> L7b
            aqi r13 = r13.b
            r13.h = r4
            kaw r14 = r13.i
            r14.ax(r3)
            r13.f = r4
            aojh r1 = aojh.a
        L76:
            return r1
        L77:
            r0 = move-exception
            r14 = r0
            r3 = r14
            throw r3     // Catch: java.lang.Throwable -> L7b
        L7b:
            r0 = move-exception
            r14 = r0
            aqi r13 = r13.b
            r13.h = r4
            kaw r0 = r13.i
            r0.ax(r3)
            r13.f = r4
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqh.b(java.lang.Object):java.lang.Object");
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.aqh aqhVar = new defpackage.aqh(this.b, this.c, this.d, this.e, aolnVar);
        aqhVar.f = obj;
        return aqhVar;
    }
}
