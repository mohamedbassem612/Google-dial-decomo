package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class anwq implements defpackage.anvp {
    private final java.lang.String a;
    private volatile boolean b;
    private defpackage.anvr c;
    private anqw d;
    public defpackage.anvp f;
    private defpackage.anwp g;
    private long h;
    private long i;
    private java.util.List e = new java.util.ArrayList();
    private java.util.List j = new java.util.ArrayList();

    public anwq(java.lang.String str) {
        this.a = str;
    }

    private final void p(java.lang.Runnable runnable) {
        ahvr.bZ(this.c != null, "May only be called after start");
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.e.add(runnable);
            }
        }
    }

    private final void q(defpackage.anvr anvrVar) {
        java.util.Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        this.j = null;
        this.f.m(anvrVar);
    }

    private final void r(defpackage.anvp anvpVar) {
        defpackage.anvp anvpVar2 = this.f;
        ahvr.cc(anvpVar2 == null, "realStream already set to %s", anvpVar2);
        this.f = anvpVar;
        this.i = java.lang.System.nanoTime();
    }

    @Override // defpackage.anvp
    public final defpackage.anlw a() {
        throw null;
    }

    @Override // defpackage.anvp
    public void b(defpackage.anxu anxuVar) {
        synchronized (this) {
            if (this.c == null) {
                return;
            }
            defpackage.anvp anvpVar = this.f;
            java.lang.String str = this.a;
            if (anvpVar != null) {
                anxuVar.b(str + "_delay", (this.i - this.h) + "ns");
                this.f.b(anxuVar);
            } else {
                anxuVar.b(str + "_delay", (java.lang.System.nanoTime() - this.h) + "ns");
                anxuVar.a("was_still_waiting");
            }
        }
    }

    @Override // defpackage.anvp
    public void c(anqw anqwVar) {
        boolean z = true;
        ahvr.bZ(this.c != null, "May only be called after start");
        ahvr.cj(anqwVar, "reason");
        synchronized (this) {
            if (this.f == null) {
                r(defpackage.aoaf.a);
                this.d = anqwVar;
                z = false;
            }
        }
        if (z) {
            p(new defpackage.alvh(this, anqwVar, 15));
            return;
        }
        u();
        s();
        this.c.a(anqwVar, defpackage.anvq.a, new anph());
    }

    @Override // defpackage.aodk
    public final void d() {
        ahvr.bZ(this.c != null, "May only be called after start");
        if (this.b) {
            this.f.d();
        } else {
            p(new defpackage.anwo(this, 0));
        }
    }

    @Override // defpackage.anvp
    public final void e() {
        ahvr.bZ(this.c != null, "May only be called after start");
        p(new defpackage.anwo(this, 2, (char[]) null));
    }

    @Override // defpackage.aodk
    public final void f() {
        ahvr.bZ(this.c == null, "May only be called before start");
        this.j.add(new defpackage.alvr(this, 20));
    }

    @Override // defpackage.aodk
    public final void g(int i) {
        ahvr.bZ(this.c != null, "May only be called after start");
        if (this.b) {
            this.f.g(i);
        } else {
            p(new defpackage.akbd(this, i, 6));
        }
    }

    @Override // defpackage.aodk
    public final void h(anmj anmjVar) {
        ahvr.bZ(this.c == null, "May only be called before start");
        this.j.add(new defpackage.alvh(this, anmjVar, 11));
    }

    @Override // defpackage.anvp
    public final void i(anmw anmwVar) {
        ahvr.bZ(this.c == null, "May only be called before start");
        this.j.add(new defpackage.alvh(this, anmwVar, 13));
    }

    @Override // defpackage.anvp
    public final void j(anmy anmyVar) {
        ahvr.bZ(this.c == null, "May only be called before start");
        ahvr.cj(anmyVar, "decompressorRegistry");
        this.j.add(new defpackage.alvh(this, anmyVar, 12));
    }

    @Override // defpackage.anvp
    public final void k(int i) {
        ahvr.bZ(this.c == null, "May only be called before start");
        this.j.add(new defpackage.akbd(this, i, 7, (byte[]) null));
    }

    @Override // defpackage.anvp
    public final void l(int i) {
        ahvr.bZ(this.c == null, "May only be called before start");
        this.j.add(new defpackage.akbd(this, i, 8, (char[]) null));
    }

    @Override // defpackage.anvp
    public final void m(defpackage.anvr anvrVar) {
        anqw anqwVar;
        boolean z;
        ahvr.bZ(this.c == null, "already started");
        synchronized (this) {
            anqwVar = this.d;
            z = this.b;
            if (!z) {
                defpackage.anwp anwpVar = new defpackage.anwp(anvrVar);
                this.g = anwpVar;
                anvrVar = anwpVar;
            }
            this.c = anvrVar;
            this.h = java.lang.System.nanoTime();
        }
        if (anqwVar != null) {
            anvrVar.a(anqwVar, defpackage.anvq.a, new anph());
        } else if (z) {
            q(anvrVar);
        }
    }

    @Override // defpackage.aodk
    public final void n(java.io.InputStream inputStream) {
        ahvr.bZ(this.c != null, "May only be called after start");
        if (this.b) {
            this.f.n(inputStream);
        } else {
            p(new defpackage.alvh(this, inputStream, 14));
        }
    }

    @Override // defpackage.aodk
    public final boolean o() {
        if (this.b) {
            return this.f.o();
        }
        return false;
    }

    public final java.lang.Runnable t(defpackage.anvp anvpVar) {
        synchronized (this) {
            if (this.f != null) {
                return null;
            }
            ahvr.cj(anvpVar, "stream");
            r(anvpVar);
            defpackage.anvr anvrVar = this.c;
            if (anvrVar == null) {
                this.e = null;
                this.b = true;
            }
            if (anvrVar == null) {
                return null;
            }
            q(anvrVar);
            return new defpackage.anwo(this, 1, (byte[]) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[Catch: all -> 0x004d, TryCatch #1 {, blocks: (B:11:0x001f, B:13:0x0027, B:14:0x002b, B:16:0x002d, B:17:0x0031), top: B:41:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[LOOP:3: B:19:0x0036->B:21:0x003c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r5)
            java.util.List r1 = r5.e     // Catch: java.lang.Throwable -> L70
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L50
            r0 = 0
            r5.e = r0     // Catch: java.lang.Throwable -> L70
            r1 = 1
            r5.b = r1     // Catch: java.lang.Throwable -> L70
            anwp r2 = r5.g     // Catch: java.lang.Throwable -> L70
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L4f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r3 = r2.c     // Catch: java.lang.Throwable -> L4d
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L2d
            r2.c = r0     // Catch: java.lang.Throwable -> L4d
            r2.b = r1     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            goto L4f
        L2d:
            java.util.List r3 = r2.c     // Catch: java.lang.Throwable -> L4d
            r2.c = r5     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r5 = r3.iterator()
        L36:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L46
            java.lang.Object r4 = r5.next()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r4.run()
            goto L36
        L46:
            r3.clear()
            r5 = r3
            goto L1e
        L4b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            throw r5
        L4d:
            r5 = move-exception
            goto L4b
        L4f:
            return
        L50:
            java.util.List r1 = r5.e     // Catch: java.lang.Throwable -> L70
            r5.e = r0     // Catch: java.lang.Throwable -> L70
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L70
            java.util.Iterator r0 = r1.iterator()
        L59:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L59
        L69:
            r1.clear()
            r0 = r1
            goto L5
        L6e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L70
            throw r0
        L70:
            r0 = move-exception
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anwq.u():void");
    }

    protected void s() {
    }
}
