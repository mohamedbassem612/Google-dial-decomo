package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aobu implements defpackage.anvp {
    static final anpc a;
    static final anpc b;
    public static final anqw c;
    public static final java.util.Random d;
    public static final boolean e;
    public boolean A;
    final /* synthetic */ defpackage.anpk B;
    final /* synthetic */ anmb C;
    final /* synthetic */ defpackage.anmv D;
    final /* synthetic */ anys E;
    public vqy F;
    public final zzx G;
    private final anph H;
    private anqw I;
    public final defpackage.anpk f;
    public final java.util.concurrent.Executor g;
    public final java.util.concurrent.Executor h;
    public final java.util.concurrent.ScheduledExecutorService i;
    public final defpackage.aobv j;
    public final defpackage.anxp k;
    public final boolean l;
    public final java.lang.Object m;
    public final long n;
    public final long o;
    public final defpackage.aobt p;
    public final defpackage.anxu q;
    public volatile defpackage.aobq r;
    public final java.util.concurrent.atomic.AtomicBoolean s;
    public final java.util.concurrent.atomic.AtomicInteger t;
    public final java.util.concurrent.atomic.AtomicInteger u;
    public long v;
    public defpackage.anvr w;
    public defpackage.aobo x;
    public defpackage.aobo y;
    public long z;

    static {
        anoz anozVar = anph.b;
        int i = anpc.d;
        a = new anoy("grpc-previous-rpc-attempts", anozVar);
        b = new anoy("grpc-retry-pushback-ms", anph.b);
        c = anqw.c.f("Stream thrown away because RetriableStream committed");
        d = new java.util.Random();
        java.nio.charset.Charset charset = anxo.a;
        e = annb.a("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    }

    public aobu(anys anysVar, defpackage.anpk anpkVar, anph anphVar, anmb anmbVar, defpackage.aobv aobvVar, defpackage.anxp anxpVar, defpackage.anmv anmvVar) {
        this.B = anpkVar;
        this.C = anmbVar;
        this.D = anmvVar;
        j$.util.Objects.requireNonNull(anysVar);
        this.E = anysVar;
        anzg anzgVar = anysVar.b;
        zzx zzxVar = anzgVar.W;
        long j = anzgVar.P;
        long j2 = anzgVar.Q;
        java.util.concurrent.Executor executorE = anzgVar.e(anmbVar);
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceC = anzgVar.j.c();
        defpackage.aobt aobtVar = anysVar.a;
        this.h = new anrc(new defpackage.aobf(this));
        this.m = new java.lang.Object();
        this.q = new defpackage.anxu();
        this.r = new defpackage.aobq(new java.util.ArrayList(8), java.util.Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.s = new java.util.concurrent.atomic.AtomicBoolean();
        this.t = new java.util.concurrent.atomic.AtomicInteger();
        this.u = new java.util.concurrent.atomic.AtomicInteger();
        this.f = anpkVar;
        this.G = zzxVar;
        this.n = j;
        this.o = j2;
        this.g = executorE;
        this.i = scheduledExecutorServiceC;
        this.H = anphVar;
        this.j = aobvVar;
        if (aobvVar != null) {
            this.z = aobvVar.b;
        }
        this.k = anxpVar;
        ahvr.bN(aobvVar == null || anxpVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.l = anxpVar != null;
        this.p = aobtVar;
    }

    @Override // defpackage.anvp
    public final defpackage.anlw a() {
        throw null;
    }

    @Override // defpackage.anvp
    public final void b(defpackage.anxu anxuVar) {
        defpackage.aobq aobqVar;
        synchronized (this.m) {
            anxuVar.b("closed", this.q);
            aobqVar = this.r;
        }
        defpackage.aobs aobsVar = aobqVar.f;
        if (aobsVar != null) {
            defpackage.anxu anxuVar2 = new defpackage.anxu();
            aobsVar.a.b(anxuVar2);
            anxuVar.b("committed", anxuVar2);
            return;
        }
        defpackage.anxu anxuVar3 = new defpackage.anxu();
        for (defpackage.aobs aobsVar2 : aobqVar.c) {
            defpackage.anxu anxuVar4 = new defpackage.anxu();
            aobsVar2.a.b(anxuVar4);
            anxuVar3.a(anxuVar4);
        }
        anxuVar.b("open", anxuVar3);
    }

    @Override // defpackage.anvp
    public final void c(anqw anqwVar) {
        defpackage.aobs aobsVar;
        defpackage.aobs aobsVar2 = new defpackage.aobs(0);
        aobsVar2.a = new defpackage.aoaf();
        java.lang.Runnable runnableQ = q(aobsVar2);
        java.lang.Object obj = this.m;
        if (runnableQ != null) {
            synchronized (obj) {
                this.r = this.r.c(aobsVar2);
            }
            runnableQ.run();
            v(anqwVar, defpackage.anvq.a, new anph());
            return;
        }
        synchronized (obj) {
            if (this.r.c.contains(this.r.f)) {
                aobsVar = this.r.f;
            } else {
                this.I = anqwVar;
                aobsVar = null;
            }
            defpackage.aobq aobqVar = this.r;
            this.r = new defpackage.aobq(aobqVar.b, aobqVar.c, aobqVar.d, aobqVar.f, true, aobqVar.a, aobqVar.h, aobqVar.e);
        }
        if (aobsVar != null) {
            aobsVar.a.c(anqwVar);
        }
    }

    @Override // defpackage.aodk
    public final void d() {
        defpackage.aobq aobqVar = this.r;
        if (aobqVar.a) {
            aobqVar.f.a.d();
        } else {
            s(new defpackage.aobi(this, 1, (byte[]) null));
        }
    }

    @Override // defpackage.anvp
    public final void e() {
        s(new defpackage.aobi(this, 0));
    }

    @Override // defpackage.aodk
    public final void f() {
        s(new defpackage.aobi(this, 2, (char[]) null));
    }

    @Override // defpackage.aodk
    public final void g(int i) {
        defpackage.aobq aobqVar = this.r;
        if (aobqVar.a) {
            aobqVar.f.a.g(i);
        } else {
            s(new defpackage.aobj(this, i, 2, (char[]) null));
        }
    }

    @Override // defpackage.aodk
    public final void h(anmj anmjVar) {
        s(new defpackage.aobh(this, anmjVar, 1));
    }

    @Override // defpackage.anvp
    public final void i(anmw anmwVar) {
        s(new defpackage.aobh(this, anmwVar, 0));
    }

    @Override // defpackage.anvp
    public final void j(anmy anmyVar) {
        s(new defpackage.aobh(this, anmyVar, 2));
    }

    @Override // defpackage.anvp
    public final void k(int i) {
        s(new defpackage.aobj(this, i, 1, (byte[]) null));
    }

    @Override // defpackage.anvp
    public final void l(int i) {
        s(new defpackage.aobj(this, i, 0));
    }

    @Override // defpackage.anvp
    public final void m(defpackage.anvr anvrVar) {
        anqw anqwVar;
        defpackage.aobo aoboVar;
        boolean z;
        defpackage.aobt aobtVar;
        this.w = anvrVar;
        anzf anzfVar = this.E.b.A;
        synchronized (anzfVar.a) {
            anqwVar = anzfVar.c;
            aoboVar = null;
            if (anqwVar == null) {
                anzfVar.b.add(this);
                anqwVar = null;
            }
        }
        if (anqwVar != null) {
            c(anqwVar);
            return;
        }
        synchronized (this.m) {
            z = this.r.f != null;
            if (!z) {
                this.r.b.add(new defpackage.aobp(this));
            }
        }
        if (z) {
            x();
            return;
        }
        defpackage.aobs aobsVarP = p(0, false, false);
        if (aobsVarP != null) {
            if (this.l) {
                java.lang.Object obj = this.m;
                synchronized (obj) {
                    this.r = this.r.a(aobsVarP);
                    if (w(this.r) && ((aobtVar = this.p) == null || aobtVar.a())) {
                        aoboVar = new defpackage.aobo(obj);
                        this.y = aoboVar;
                    }
                }
                if (aoboVar != null) {
                    aoboVar.b(this.i.schedule((java.lang.Runnable) new aaed(this, aoboVar, 2), this.k.b, java.util.concurrent.TimeUnit.NANOSECONDS));
                }
            }
            t(aobsVarP);
        }
    }

    @Override // defpackage.aodk
    public final void n(java.io.InputStream inputStream) {
        throw new java.lang.IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.aodk
    public final boolean o() {
        java.util.Iterator it = this.r.c.iterator();
        while (it.hasNext()) {
            if (((defpackage.aobs) it.next()).a.o()) {
                return true;
            }
        }
        return false;
    }

    public final defpackage.aobs p(int i, boolean z, boolean z2) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.u;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        defpackage.aobs aobsVar = new defpackage.aobs(i);
        defpackage.aobl aoblVar = new defpackage.aobl(this, new defpackage.aobn(this, aobsVar));
        anph anphVar = this.H;
        anph anphVar2 = new anph();
        anphVar2.g(anphVar);
        if (i > 0) {
            anphVar2.h(a, java.lang.String.valueOf(i));
        }
        anmb anmbVarH = this.C.h(aoblVar);
        anmg[] anmgVarArrK = anxo.k(anmbVarH, i, z, z2);
        defpackage.anmv anmvVarA = this.D.a();
        try {
            defpackage.anvp anvpVarB = this.E.b.z.b(this.B, anphVar2, anmbVarH, anmgVarArrK);
            this.D.f(anmvVarA);
            aobsVar.a = anvpVarB;
            return aobsVar;
        } catch (java.lang.Throwable th) {
            this.D.f(anmvVarA);
            throw th;
        }
    }

    public final java.lang.Runnable q(defpackage.aobs aobsVar) {
        java.util.List list;
        boolean z;
        java.util.Collection collectionSingleton;
        java.util.concurrent.Future future;
        java.util.concurrent.Future future2;
        synchronized (this.m) {
            if (this.r.f != null) {
                return null;
            }
            java.util.Collection collection = this.r.c;
            defpackage.aobq aobqVar = this.r;
            ahvr.bZ(aobqVar.f == null, "Already committed");
            java.util.List list2 = aobqVar.b;
            if (aobqVar.c.contains(aobsVar)) {
                list = null;
                collectionSingleton = java.util.Collections.singleton(aobsVar);
                z = true;
            } else {
                list = list2;
                z = false;
                collectionSingleton = java.util.Collections.EMPTY_LIST;
            }
            this.r = new defpackage.aobq(list, collectionSingleton, aobqVar.d, aobsVar, aobqVar.g, z, aobqVar.h, aobqVar.e);
            this.G.ac(-this.v);
            defpackage.aobo aoboVar = this.x;
            boolean z2 = aoboVar == null;
            boolean z3 = aoboVar != null ? aoboVar.c : false;
            boolean z4 = !z2;
            if (z2) {
                future = null;
            } else {
                java.util.concurrent.Future futureA = aoboVar.a();
                this.x = null;
                future = futureA;
            }
            defpackage.aobo aoboVar2 = this.y;
            if (aoboVar2 != null) {
                java.util.concurrent.Future futureA2 = aoboVar2.a();
                this.y = null;
                future2 = futureA2;
            } else {
                future2 = null;
            }
            return new defpackage.aobg(this, collection, aobsVar, z4, future, z3, future2);
        }
    }

    public final void r(defpackage.aobs aobsVar) {
        java.lang.Runnable runnableQ = q(aobsVar);
        if (runnableQ != null) {
            this.g.execute(runnableQ);
        }
    }

    public final void s(defpackage.aobm aobmVar) {
        java.util.Collection collection;
        synchronized (this.m) {
            if (!this.r.a) {
                this.r.b.add(aobmVar);
            }
            collection = this.r.c;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            aobmVar.a((defpackage.aobs) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        if (r5 >= r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        r7 = (defpackage.aobm) r3.get(r5);
        r7.a(r10);
        r4 = r4 | (r7 instanceof defpackage.aobp);
        r7 = r9.r;
        r8 = r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
    
        if (r8 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        if (r8 != r10) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
    
        if (r7.g == false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.aobs r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.m
            monitor-enter(r5)
            aobq r6 = r9.r     // Catch: java.lang.Throwable -> La7
            aobs r7 = r6.f     // Catch: java.lang.Throwable -> La7
            if (r7 == 0) goto L12
            if (r7 == r10) goto L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La7
            goto L35
        L12:
            boolean r7 = r6.g     // Catch: java.lang.Throwable -> La7
            if (r7 == 0) goto L18
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La7
            goto L35
        L18:
            java.util.List r7 = r6.b     // Catch: java.lang.Throwable -> La7
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La7
            if (r2 != r8) goto L5a
            aobq r0 = r6.c(r10)     // Catch: java.lang.Throwable -> La7
            r9.r = r0     // Catch: java.lang.Throwable -> La7
            boolean r0 = r9.o()     // Catch: java.lang.Throwable -> La7
            if (r0 != 0) goto L2e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La7
            goto L5f
        L2e:
            aobd r1 = new aobd     // Catch: java.lang.Throwable -> La7
            r0 = 4
            r1.<init>(r9, r0)     // Catch: java.lang.Throwable -> La7
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La7
        L35:
            if (r1 == 0) goto L3d
            java.util.concurrent.Executor r9 = r9.h
            r9.execute(r1)
            goto L5f
        L3d:
            if (r4 != 0) goto L49
            anvp r0 = r10.a
            aobr r1 = new aobr
            r1.<init>(r9, r10)
            r0.m(r1)
        L49:
            anvp r0 = r10.a
            aobq r1 = r9.r
            aobs r1 = r1.f
            if (r1 != r10) goto L54
            anqw r9 = r9.I
            goto L56
        L54:
            anqw r9 = defpackage.aobu.c
        L56:
            r0.c(r9)
            goto L5f
        L5a:
            boolean r6 = r10.b     // Catch: java.lang.Throwable -> La7
            if (r6 == 0) goto L60
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La7
        L5f:
            return
        L60:
            int r6 = r2 + 128
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La7
            int r6 = java.lang.Math.min(r6, r8)     // Catch: java.lang.Throwable -> La7
            if (r3 != 0) goto L76
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La7
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La7
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La7
            goto L80
        L76:
            r3.clear()     // Catch: java.lang.Throwable -> La7
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La7
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La7
        L80:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La7
            int r2 = r3.size()
            r5 = r0
        L86:
            if (r5 >= r2) goto La2
            java.lang.Object r7 = r3.get(r5)
            aobm r7 = (defpackage.aobm) r7
            r7.a(r10)
            boolean r7 = r7 instanceof defpackage.aobp
            r4 = r4 | r7
            aobq r7 = r9.r
            aobs r8 = r7.f
            if (r8 == 0) goto L9c
            if (r8 != r10) goto La2
        L9c:
            boolean r7 = r7.g
            int r5 = r5 + 1
            if (r7 == 0) goto L86
        La2:
            r2 = r6
            goto L5
        La5:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La7
            throw r9
        La7:
            r9 = move-exception
            goto La5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aobu.t(aobs):void");
    }

    public final void u() {
        java.util.concurrent.Future future;
        synchronized (this.m) {
            defpackage.aobo aoboVar = this.y;
            future = null;
            if (aoboVar != null) {
                java.util.concurrent.Future futureA = aoboVar.a();
                this.y = null;
                future = futureA;
            }
            this.r = this.r.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final void v(anqw anqwVar, defpackage.anvq anvqVar, anph anphVar) {
        this.F = new vqy(anqwVar, anvqVar, anphVar);
        if (this.u.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.h.execute(new abb(this, anqwVar, anvqVar, anphVar, 18));
        }
    }

    public final boolean w(defpackage.aobq aobqVar) {
        return aobqVar.f == null && aobqVar.e < this.k.a && !aobqVar.h;
    }

    public final void x() {
        anqw anqwVar;
        anzf anzfVar = this.E.b.A;
        synchronized (anzfVar.a) {
            anzfVar.b.remove(this);
            if (anzfVar.b.isEmpty()) {
                anqwVar = anzfVar.c;
                anzfVar.b = new java.util.HashSet();
            } else {
                anqwVar = null;
            }
        }
        if (anqwVar != null) {
            anzfVar.d.z.q(anqwVar);
        }
    }
}
