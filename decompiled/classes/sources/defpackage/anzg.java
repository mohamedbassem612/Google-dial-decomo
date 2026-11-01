package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anzg extends defpackage.anor implements defpackage.annr {
    public final defpackage.anzf A;
    public final java.util.concurrent.atomic.AtomicBoolean B;
    public boolean C;
    public boolean D;
    public volatile boolean E;
    public final defpackage.anvd F;
    public final defpackage.anve G;
    public final defpackage.anvg H;
    public final defpackage.anmd I;
    public final defpackage.anno J;
    public final defpackage.anzd K;
    public defpackage.anzs L;
    public final defpackage.anzs M;
    public boolean N;
    public final boolean O;
    public final long P;
    public final long Q;
    public final boolean R;
    public final defpackage.anxt S;
    public final defpackage.anys T;
    public final defpackage.anpm U;
    public int V;
    public final defpackage.zzx W;
    private final defpackage.aodt Y;
    private final defpackage.anpw Z;
    private final defpackage.anpq aa;
    private final defpackage.anop ab;
    private final defpackage.aobb ac;
    private final defpackage.aoag ad;
    private final defpackage.anyw ae;
    private final defpackage.anyw af;
    private final long ag;
    private final defpackage.anmc ah;
    private final java.util.concurrent.CountDownLatch ai;
    private final defpackage.anzt aj;
    private final defpackage.aobe ak;
    private final defpackage.aooc al;
    public final defpackage.anns h;
    public final java.lang.String i;
    public final defpackage.anvv j;
    public final defpackage.anze k;
    public final java.util.concurrent.Executor l;
    public final defpackage.aodo m;
    public final defpackage.anrc n;
    public final defpackage.anmy o;
    public final defpackage.anwd p;
    public final java.util.List q;
    public final java.lang.String r;
    public defpackage.anpv s;
    public boolean t;
    public anyy u;
    public boolean v;
    public final java.util.Set w;
    public java.util.Collection x;
    public final java.lang.Object y;
    public final defpackage.anwn z;
    static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.anzg.class.getName());
    static final defpackage.anqw b = defpackage.anqw.l.f("Channel shutdownNow invoked");
    static final defpackage.anqw c = defpackage.anqw.l.f("Channel shutdown invoked");
    static final defpackage.anqw d = defpackage.anqw.l.f("Subchannel shutdown invoked");
    public static final defpackage.anzs e = new defpackage.anzs(null, new java.util.HashMap(), new java.util.HashMap(), null, null, null);
    public static final defpackage.annp f = new defpackage.anyn();
    public static final defpackage.anog g = new defpackage.anyp();
    public static final defpackage.ajsz X = new defpackage.anyr();

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean, int] */
    public anzg(defpackage.anzn anznVar, defpackage.anvv anvvVar, defpackage.aodt aodtVar, defpackage.anpw anpwVar, defpackage.aoag aoagVar, defpackage.ahzi ahziVar, java.util.List list, defpackage.aodo aodoVar) {
        defpackage.aobb aobbVar;
        defpackage.anrc anrcVar = new defpackage.anrc(new defpackage.anyq(this));
        this.n = anrcVar;
        this.p = new defpackage.anwd();
        this.w = new java.util.HashSet(16, 0.75f);
        this.y = new java.lang.Object();
        this.A = new defpackage.anzf(this);
        this.B = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.ai = new java.util.concurrent.CountDownLatch(1);
        this.V = 1;
        this.L = e;
        this.N = false;
        this.W = new defpackage.zzx((char[]) null, (byte[]) null, (byte[]) null);
        defpackage.ajsz ajszVar = defpackage.anmw.b;
        this.aj = new defpackage.anyv(this);
        this.S = new defpackage.anyx(this);
        this.T = new defpackage.anys(this);
        defpackage.aooc aoocVar = anznVar.A;
        this.al = aoocVar;
        java.lang.String str = anznVar.k;
        if (str == null) {
            throw new java.lang.NullPointerException("target");
        }
        this.i = str;
        defpackage.anns annsVar = new defpackage.anns("Channel", str, defpackage.anns.a.incrementAndGet());
        this.h = annsVar;
        if (aodoVar == null) {
            throw new java.lang.NullPointerException("timeProvider");
        }
        this.m = aodoVar;
        defpackage.aoag aoagVar2 = anznVar.f;
        if (aoagVar2 == null) {
            throw new java.lang.NullPointerException("executorPool");
        }
        this.ad = aoagVar2;
        ?? A = aoagVar2.a();
        if (A == 0) {
            throw new java.lang.NullPointerException("executor");
        }
        this.l = A;
        if (anvvVar instanceof defpackage.aobb) {
            aobbVar = (defpackage.aobb) anvvVar;
            this.ac = aobbVar;
        } else {
            defpackage.aobb aobbVar2 = new defpackage.aobb(anvvVar);
            this.ac = aobbVar2;
            aobbVar = aobbVar2;
        }
        defpackage.aoag aoagVar3 = anznVar.g;
        if (aoagVar3 == null) {
            throw new java.lang.NullPointerException("offloadExecutorPool");
        }
        defpackage.anyw anywVar = new defpackage.anyw(aoagVar3);
        this.af = anywVar;
        defpackage.anvc anvcVar = new defpackage.anvc(aobbVar, anywVar);
        this.j = anvcVar;
        defpackage.anze anzeVar = new defpackage.anze(anvcVar.c());
        this.k = anzeVar;
        defpackage.anvg anvgVar = new defpackage.anvg(annsVar, aodoVar.a(), "Channel for '" + str + '\'');
        this.H = anvgVar;
        defpackage.anvf anvfVar = new defpackage.anvf(anvgVar, aodoVar);
        this.I = anvfVar;
        defpackage.anqi anqiVar = defpackage.anxo.m;
        this.R = true;
        defpackage.anuz anuzVar = new defpackage.anuz(defpackage.anoq.b());
        this.ab = anuzVar;
        this.Y = aodtVar;
        this.Z = anpwVar;
        defpackage.anpu anpuVar = new defpackage.anpu(true, (defpackage.anop) anuzVar);
        defpackage.aoae aoaeVar = new defpackage.aoae(anznVar.x, defpackage.anpl.a());
        this.U = aoaeVar;
        defpackage.anpo anpoVar = new defpackage.anpo();
        anznVar.z.a();
        anpoVar.a = 443;
        anqiVar.getClass();
        anpoVar.b = anqiVar;
        anpoVar.c = anrcVar;
        anpoVar.e = anzeVar;
        anpoVar.d = anpuVar;
        anpoVar.f = anvfVar;
        anpoVar.g = anywVar;
        anpoVar.h = aoaeVar;
        anpoVar.i = anznVar.i;
        if (aoocVar == null) {
            throw new java.lang.NullPointerException("channelConfigurator");
        }
        java.util.IdentityHashMap identityHashMap = anznVar.l;
        if (identityHashMap != null) {
            for (java.util.Map.Entry entry : identityHashMap.entrySet()) {
                defpackage.anpp anppVar = (defpackage.anpp) entry.getKey();
                java.lang.Object value = entry.getValue();
                if (anppVar == null) {
                    throw new java.lang.NullPointerException("key");
                }
                if (value == null) {
                    throw new java.lang.NullPointerException("value");
                }
                if (anpoVar.j == null) {
                    anpoVar.j = new java.util.IdentityHashMap();
                }
                anpoVar.j.put(anppVar, value);
            }
        }
        defpackage.anpq anpqVar = new defpackage.anpq(anpoVar);
        this.aa = anpqVar;
        this.s = m(aodtVar, anpwVar, anpqVar);
        this.ae = new defpackage.anyw(aoagVar);
        defpackage.anwn anwnVar = new defpackage.anwn(this.l, this.n);
        this.z = anwnVar;
        defpackage.anzt anztVar = this.aj;
        anwnVar.f = anztVar;
        anwnVar.c = new defpackage.ahjn(anwnVar, anztVar, 12);
        anwnVar.d = new defpackage.ahjn(anwnVar, anztVar, 13, (byte[]) null);
        anwnVar.e = new defpackage.ahjn(anwnVar, anztVar, 14, (char[]) null);
        this.M = null;
        this.O = true;
        defpackage.anzd anzdVar = new defpackage.anzd(this, this.s.a());
        this.K = anzdVar;
        this.ah = defpackage.ajsz.ds(anzdVar, list);
        this.q = new java.util.ArrayList(anznVar.j);
        if (ahziVar == null) {
            throw new java.lang.NullPointerException("stopwatchSupplier");
        }
        long j = anznVar.q;
        if (j == -1) {
            this.ag = -1L;
        } else {
            defpackage.ahvr.bQ(((j > defpackage.anzn.c ? 1 : (j == defpackage.anzn.c ? 0 : -1)) ^ (-1)) >>> 31, "invalid idleTimeoutMillis %s", j);
            this.ag = anznVar.q;
        }
        this.ak = new defpackage.aobe(new defpackage.ahjn(this, 15), this.n, this.j.c(), new defpackage.ahzh());
        defpackage.anmy anmyVar = anznVar.o;
        if (anmyVar == null) {
            throw new java.lang.NullPointerException("decompressorRegistry");
        }
        this.o = anmyVar;
        if (anznVar.p == null) {
            throw new java.lang.NullPointerException("compressorRegistry");
        }
        this.r = anznVar.m;
        this.Q = 16777216L;
        this.P = 1048576L;
        defpackage.anyo anyoVar = new defpackage.anyo(this, aodoVar);
        this.F = anyoVar;
        this.G = anyoVar.a();
        defpackage.anno annoVar = anznVar.r;
        annoVar.getClass();
        this.J = annoVar;
        defpackage.anno.b(annoVar.d, this);
    }

    static defpackage.anpv m(defpackage.aodt aodtVar, defpackage.anpw anpwVar, defpackage.anpq anpqVar) {
        defpackage.anpv anpvVarA = aodtVar.a(anpwVar, anpqVar);
        if (anpvVarA == null) {
            throw new java.lang.IllegalArgumentException("cannot create a NameResolver for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(aodtVar))));
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = anpqVar.e;
        if (scheduledExecutorService != null) {
            return new defpackage.aoby(anpvVarA, new defpackage.anva(scheduledExecutorService, anpqVar.c));
        }
        throw new java.lang.IllegalStateException("ScheduledExecutorService not set in Builder");
    }

    @Override // defpackage.anmc
    public final java.lang.String a() {
        return this.ah.a();
    }

    @Override // defpackage.anmc
    public final defpackage.ajsz b(anpk anpkVar, defpackage.anmb anmbVar) {
        return this.ah.b(anpkVar, anmbVar);
    }

    @Override // defpackage.anny
    public final defpackage.anns c() {
        return this.h;
    }

    public final java.util.concurrent.Executor e(defpackage.anmb anmbVar) {
        java.util.concurrent.Executor executor = anmbVar.c;
        return executor == null ? this.l : executor;
    }

    public final void f(boolean z) {
        java.util.concurrent.ScheduledFuture scheduledFuture;
        defpackage.aobe aobeVar = this.ak;
        aobeVar.e = false;
        if (!z || (scheduledFuture = aobeVar.f) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        aobeVar.f = null;
    }

    public final void g() {
        this.n.c();
        if (this.B.get() || this.v) {
            return;
        }
        if (this.S.a.isEmpty()) {
            j();
        } else {
            f(false);
        }
        if (this.u == null) {
            this.I.a(2, "Exiting idle mode");
            anyy anyyVar = new anyy(this);
            anyyVar.a = new anuy((defpackage.anuz) this.ab, anyyVar);
            this.u = anyyVar;
            this.p.a(defpackage.anmm.a);
            this.s.d(new anyz(this, anyyVar, this.s));
            this.t = true;
        }
    }

    public final void h() {
        if (this.C) {
            for (anyh anyhVar : this.w) {
                defpackage.anqw anqwVar = b;
                anyhVar.h(anqwVar);
                anyhVar.g.execute(new defpackage.anxz(anyhVar, anqwVar, 0));
            }
        }
    }

    public final void i() {
        if (!this.E && this.B.get() && this.w.isEmpty()) {
            this.I.a(2, "Terminated");
            defpackage.anno.c(this.J.d, this);
            this.ad.b(this.l);
            this.ae.b();
            this.af.b();
            this.j.close();
            this.E = true;
            this.ai.countDown();
        }
    }

    public final void j() {
        long j = this.ag;
        if (j != -1) {
            defpackage.aobe aobeVar = this.ak;
            long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j);
            long jA = aobeVar.a() + nanos;
            aobeVar.e = true;
            if (jA - aobeVar.d < 0 || aobeVar.f == null) {
                java.util.concurrent.ScheduledFuture scheduledFuture = aobeVar.f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                aobeVar.f = aobeVar.a.schedule((java.lang.Runnable) new aobd(aobeVar, 2, (byte[]) null), nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
            }
            aobeVar.d = jA;
        }
    }

    public final void k(boolean z) {
        this.n.c();
        if (z) {
            defpackage.ahvr.bZ(this.t, "nameResolver is not started");
            defpackage.ahvr.bZ(this.u != null, "lbHelper is null");
        }
        defpackage.anpv anpvVar = this.s;
        if (anpvVar != null) {
            anpvVar.c();
            this.t = false;
            if (z) {
                this.s = m(this.Y, this.Z, this.aa);
            } else {
                this.s = null;
            }
        }
        anyy anyyVar = this.u;
        if (anyyVar != null) {
            anyyVar.a.d();
            this.u = null;
        }
    }

    public final void l(anol anolVar) {
        this.z.a(anolVar);
    }

    @Override // defpackage.anor
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void d() {
        this.I.a(1, "shutdown() called");
        if (this.B.compareAndSet(false, true)) {
            defpackage.anrc anrcVar = this.n;
            anrcVar.execute(new anwo(this, 14, (byte[]) null));
            defpackage.anzd anzdVar = this.K;
            anzdVar.c.n.execute(new anwo(anzdVar, 17));
            anrcVar.execute(new anwo(this, 13));
        }
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVar = new defpackage.ahym(getClass().getSimpleName());
        ahymVar.f("logId", this.h.b);
        ahymVar.b("target", this.i);
        return ahymVar.toString();
    }
}
