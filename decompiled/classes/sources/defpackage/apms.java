package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apms implements java.io.Closeable {
    public static final defpackage.apnf a;
    public final defpackage.apmp b;
    public final java.util.Map c = new java.util.LinkedHashMap();
    public final java.lang.String d;
    public int e;
    public int f;
    public boolean g;
    public final defpackage.apkc h;
    public final defpackage.apkb i;
    public final defpackage.apkb j;
    public final defpackage.apkb k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public final defpackage.apnf q;
    public defpackage.apnf r;
    public long s;
    public long t;
    public final defpackage.apna u;
    public final defpackage.apmr v;
    public final java.util.Set w;
    private final defpackage.apnh x;
    private final defpackage.apkd y;

    static {
        defpackage.apnf apnfVar = new defpackage.apnf();
        apnfVar.g(4, 65535);
        apnfVar.g(5, 16384);
        a = apnfVar;
    }

    public apms(defpackage.apmn apmnVar) {
        this.b = apmnVar.c;
        java.lang.String str = apmnVar.b;
        defpackage.apkd apkdVar = null;
        if (str == null) {
            defpackage.aooh.j("connectionName");
            str = null;
        }
        this.d = str;
        this.f = 3;
        defpackage.apkc apkcVar = apmnVar.a;
        this.h = apkcVar;
        this.i = apkcVar.b();
        this.j = apkcVar.b();
        this.k = apkcVar.b();
        defpackage.apnf apnfVar = new defpackage.apnf();
        apnfVar.g(4, 16777216);
        this.q = apnfVar;
        this.r = a;
        this.x = new defpackage.apnh(0);
        this.t = this.r.c();
        defpackage.apkd apkdVar2 = apmnVar.e;
        if (apkdVar2 == null) {
            defpackage.aooh.j("socket");
        } else {
            apkdVar = apkdVar2;
        }
        this.y = apkdVar;
        this.u = new defpackage.apna(apkdVar.c);
        this.v = new defpackage.apmr(this, new defpackage.apmv(apkdVar.b));
        this.w = new java.util.LinkedHashSet();
    }

    public final defpackage.apmz a(int i) {
        defpackage.apmz apmzVar;
        synchronized (this) {
            apmzVar = (defpackage.apmz) this.c.get(java.lang.Integer.valueOf(i));
        }
        return apmzVar;
    }

    public final defpackage.apmz b(int i) {
        defpackage.apmz apmzVar;
        synchronized (this) {
            apmzVar = (defpackage.apmz) this.c.remove(java.lang.Integer.valueOf(i));
            notifyAll();
        }
        return apmzVar;
    }

    public final void c(defpackage.apme apmeVar, defpackage.apme apmeVar2, java.io.IOException iOException) {
        int i;
        java.lang.Object[] array;
        java.util.TimeZone timeZone = defpackage.apjx.a;
        try {
            f(apmeVar);
        } catch (java.io.IOException unused) {
        }
        synchronized (this) {
            java.util.Map map = this.c;
            if (map.isEmpty()) {
                array = null;
            } else {
                array = map.values().toArray(new defpackage.apmz[0]);
                map.clear();
            }
        }
        defpackage.apmz[] apmzVarArr = (defpackage.apmz[]) array;
        if (apmzVarArr != null) {
            for (defpackage.apmz apmzVar : apmzVarArr) {
                try {
                    apmzVar.g(apmeVar2, iOException);
                } catch (java.io.IOException unused2) {
                }
            }
        }
        try {
            this.u.close();
        } catch (java.io.IOException unused3) {
        }
        try {
            ((defpackage.apqm) this.y.a).a.close();
        } catch (java.io.IOException unused4) {
        }
        this.i.b();
        this.j.b();
        this.k.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c(defpackage.apme.NO_ERROR, defpackage.apme.CANCEL, null);
    }

    public final void d(java.io.IOException iOException) {
        defpackage.apme apmeVar = defpackage.apme.PROTOCOL_ERROR;
        c(apmeVar, apmeVar, iOException);
    }

    public final void e() {
        this.u.b();
    }

    public final void f(defpackage.apme apmeVar) {
        synchronized (this.u) {
            synchronized (this) {
                if (!this.g) {
                    this.g = true;
                    int i = this.e;
                    defpackage.apna apnaVar = this.u;
                    int i2 = defpackage.apjv.a;
                    synchronized (apnaVar) {
                        if (apnaVar.e) {
                            throw new java.io.IOException("closed");
                        }
                        apnaVar.c(0, 8, 7, 0);
                        defpackage.apoz apozVar = apnaVar.b;
                        apozVar.Q(i);
                        apozVar.Q(apmeVar.o);
                        apozVar.flush();
                    }
                }
            }
        }
    }

    public final void g(long j) {
        synchronized (this) {
            defpackage.apnh apnhVar = this.x;
            apnhVar.b(j, 0L);
            long jA = apnhVar.a();
            if (jA >= this.q.c() / 2) {
                l(0, jA);
                apnhVar.b(0L, jA);
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r10, boolean r11, defpackage.apoy r12, long r13) {
        /*
            r9 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L5f
        L7:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L64
            monitor-enter(r9)
        Lc:
            long r4 = r9.s     // Catch: java.lang.InterruptedException -> L4f java.lang.Throwable -> L5c
            long r6 = r9.t     // Catch: java.lang.InterruptedException -> L4f java.lang.Throwable -> L5c
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L2c
            java.util.Map r2 = r9.c     // Catch: java.lang.InterruptedException -> L4f java.lang.Throwable -> L5c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.InterruptedException -> L4f java.lang.Throwable -> L5c
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.InterruptedException -> L4f java.lang.Throwable -> L5c
            if (r2 == 0) goto L24
            r9.wait()     // Catch: java.lang.InterruptedException -> L4f java.lang.Throwable -> L5c
            goto Lc
        L24:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.InterruptedException -> L4f java.lang.Throwable -> L5c
            java.lang.String r11 = "stream closed"
            r10.<init>(r11)     // Catch: java.lang.InterruptedException -> L4f java.lang.Throwable -> L5c
            throw r10     // Catch: java.lang.InterruptedException -> L4f java.lang.Throwable -> L5c
        L2c:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r13, r6)     // Catch: java.lang.Throwable -> L5c
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L5c
            apna r4 = r9.u     // Catch: java.lang.Throwable -> L5c
            int r5 = r4.d     // Catch: java.lang.Throwable -> L5c
            int r2 = java.lang.Math.min(r2, r5)     // Catch: java.lang.Throwable -> L5c
            long r5 = r9.s     // Catch: java.lang.Throwable -> L5c
            long r7 = (long) r2     // Catch: java.lang.Throwable -> L5c
            long r5 = r5 + r7
            r9.s = r5     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r9)
            long r13 = r13 - r7
            if (r11 == 0) goto L4a
            int r5 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r5 != 0) goto L4a
            r5 = 1
            goto L4b
        L4a:
            r5 = r3
        L4b:
            r4.a(r5, r10, r12, r2)
            goto L7
        L4f:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5c
            r10.interrupt()     // Catch: java.lang.Throwable -> L5c
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L5c
            r10.<init>()     // Catch: java.lang.Throwable -> L5c
            throw r10     // Catch: java.lang.Throwable -> L5c
        L5c:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L5f:
            apna r9 = r9.u
            r9.a(r11, r10, r12, r3)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apms.h(int, boolean, apoy, long):void");
    }

    public final void i(boolean z, int i, int i2) {
        try {
            defpackage.apna apnaVar = this.u;
            synchronized (apnaVar) {
                if (apnaVar.e) {
                    throw new java.io.IOException("closed");
                }
                apnaVar.c(0, 8, 6, z ? 1 : 0);
                defpackage.apoz apozVar = apnaVar.b;
                apozVar.Q(i);
                apozVar.Q(i2);
                apozVar.flush();
            }
        } catch (java.io.IOException e) {
            d(e);
        }
    }

    public final void j(int i, defpackage.apme apmeVar) {
        this.u.d(i, apmeVar);
    }

    public final void k(int i, defpackage.apme apmeVar) {
        this.i.e(this.d + '[' + i + "] writeSynReset", new defpackage.agsd(this, i, apmeVar, 6));
    }

    public final void l(int i, long j) {
        this.i.e(this.d + '[' + i + "] windowUpdate", new apmm(this, i, j));
    }
}
