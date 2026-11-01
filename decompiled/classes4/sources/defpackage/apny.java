package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class apny implements defpackage.apnz {
    public final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.CountDownLatch b = new java.util.concurrent.CountDownLatch(1);
    public appb c;
    public appb d;
    public java.io.IOException e;

    @Override // defpackage.apnz
    public final appb a() {
        appb appbVar = this.c;
        if (appbVar != null) {
            return appbVar;
        }
        aooh.j("bytes");
        return null;
    }

    public abstract apqd b();

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0001, code lost:
    
        r2 = new appx(b());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r5 = this;
            r0 = 0
        L1:
            apqd r1 = r5.b()     // Catch: java.lang.Throwable -> L46
            appx r2 = new appx     // Catch: java.lang.Throwable -> L46
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L46
            int r1 = r2.f()     // Catch: java.lang.Throwable -> L3f
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L3f
            appb r1 = r2.s(r3)     // Catch: java.lang.Throwable -> L3f
            int r3 = r2.f()     // Catch: java.lang.Throwable -> L3f
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L3f
            appb r3 = r2.s(r3)     // Catch: java.lang.Throwable -> L3f
            r4 = 0
            ajsz.ak(r2, r4)     // Catch: java.lang.Throwable -> L46
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L46
            aooh.c(r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "<set-?>"
            aooh.f(r1, r2)     // Catch: java.lang.Throwable -> L3c
            r5.c = r1     // Catch: java.lang.Throwable -> L3c
            aooh.c(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "<set-?>"
            aooh.f(r3, r1)     // Catch: java.lang.Throwable -> L3c
            r5.d = r3     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.CountDownLatch r1 = r5.b     // Catch: java.io.IOException -> L4d java.io.InterruptedIOException -> L5a java.lang.Throwable -> L5f
            r1.countDown()     // Catch: java.io.IOException -> L4d java.io.InterruptedIOException -> L5a java.lang.Throwable -> L5f
            goto L50
        L3c:
            r1 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            throw r1     // Catch: java.lang.Throwable -> L46
        L3f:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L41
        L41:
            r3 = move-exception
            ajsz.ak(r2, r1)     // Catch: java.lang.Throwable -> L46
            throw r3     // Catch: java.lang.Throwable -> L46
        L46:
            r1 = move-exception
            java.util.concurrent.CountDownLatch r2 = r5.b     // Catch: java.io.IOException -> L4d java.io.InterruptedIOException -> L5a java.lang.Throwable -> L5f
            r2.countDown()     // Catch: java.io.IOException -> L4d java.io.InterruptedIOException -> L5a java.lang.Throwable -> L5f
            throw r1     // Catch: java.io.IOException -> L4d java.io.InterruptedIOException -> L5a java.lang.Throwable -> L5f
        L4d:
            r1 = move-exception
            r5.e = r1     // Catch: java.lang.Throwable -> L5f
        L50:
            if (r0 == 0) goto L59
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L59:
            return
        L5a:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5f
            r0 = 1
            goto L1
        L5f:
            r5 = move-exception
            if (r0 == 0) goto L69
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L69:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apny.c():void");
    }
}
