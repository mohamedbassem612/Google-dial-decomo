package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aofk implements defpackage.anwc, defpackage.aoes, defpackage.aofu, defpackage.anyj {
    private static final java.util.Map M;
    public static final java.util.logging.Logger a;
    static final boolean b;
    public final java.util.Deque A;
    public final aofz B;
    public defpackage.anyk C;
    public boolean D;
    public long E;
    public long F;
    public final java.lang.Runnable G;
    public final int H;
    public final aodq I;
    public final java.util.Map J;
    final defpackage.annj K;
    int L;
    private final anns N;
    private int O;
    private final defpackage.aocd P;
    private final java.util.concurrent.ScheduledExecutorService Q;
    private final int R;
    private boolean S;
    private boolean T;
    private final anxt U;
    public java.net.Socket c;
    public javax.net.ssl.SSLSession d;
    public final java.net.InetSocketAddress e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.util.Random h = new java.util.Random();
    public final int i;
    public anzt j;
    public defpackage.aoet k;
    public aofv l;
    public final java.lang.Object m;
    public final java.util.Map n;
    public final java.util.concurrent.Executor o;
    public int p;
    public defpackage.aofi q;
    public defpackage.anlw r;
    public anqw s;
    public defpackage.anxs t;
    public boolean u;
    public final javax.net.SocketFactory v;
    public javax.net.ssl.SSLSocketFactory w;
    public javax.net.ssl.HostnameVerifier x;
    public java.net.Socket y;
    public int z;

    static {
        java.util.EnumMap enumMap = new java.util.EnumMap(defpackage.aogl.class);
        enumMap.put(defpackage.aogl.NO_ERROR, anqw.k.f("No error: A GRPC status of OK should have been sent"));
        enumMap.put(defpackage.aogl.PROTOCOL_ERROR, anqw.k.f("Protocol error"));
        enumMap.put(defpackage.aogl.INTERNAL_ERROR, anqw.k.f("Internal error"));
        enumMap.put(defpackage.aogl.FLOW_CONTROL_ERROR, anqw.k.f("Flow control error"));
        enumMap.put(defpackage.aogl.STREAM_CLOSED, anqw.k.f("Stream closed"));
        enumMap.put(defpackage.aogl.FRAME_TOO_LARGE, anqw.k.f("Frame too large"));
        enumMap.put(defpackage.aogl.REFUSED_STREAM, anqw.l.f("Refused stream"));
        enumMap.put(defpackage.aogl.CANCEL, anqw.c.f("Cancelled"));
        enumMap.put(defpackage.aogl.COMPRESSION_ERROR, anqw.k.f("Compression error"));
        enumMap.put(defpackage.aogl.CONNECT_ERROR, anqw.k.f("Connect error"));
        enumMap.put(defpackage.aogl.ENHANCE_YOUR_CALM, anqw.h.f("Enhance your calm"));
        enumMap.put(defpackage.aogl.INADEQUATE_SECURITY, anqw.f.f("Inadequate security"));
        M = j$.util.DesugarCollections.unmodifiableMap(enumMap);
        a = java.util.logging.Logger.getLogger(defpackage.aofk.class.getName());
        java.nio.charset.Charset charset = anxo.a;
        b = annb.a("GRPC_ENABLE_PER_RPC_AUTHORITY_CHECK", false);
        try {
            java.lang.Class.forName("javax.net.ssl.X509ExtendedTrustManager").getMethod("checkServerTrusted", java.security.cert.X509Certificate[].class, java.lang.String.class, java.net.Socket.class);
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
        }
    }

    public aofk(aoez aoezVar, java.net.InetSocketAddress inetSocketAddress, java.lang.String str, java.lang.String str2, defpackage.anlw anlwVar, ahzi ahziVar, defpackage.annj annjVar, java.lang.Runnable runnable) {
        java.lang.Object obj = new java.lang.Object();
        this.m = obj;
        this.n = new java.util.HashMap();
        this.z = 0;
        this.A = new java.util.LinkedList();
        this.J = new defpackage.aofj();
        this.U = new defpackage.aoff(this);
        this.L = 30000;
        ahvr.cj(inetSocketAddress, "address");
        this.e = inetSocketAddress;
        this.f = str;
        this.R = aoezVar.e;
        this.i = aoezVar.f;
        java.util.concurrent.Executor executor = aoezVar.a;
        ahvr.cj(executor, "executor");
        this.o = executor;
        this.P = new defpackage.aocd(aoezVar.a);
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = aoezVar.b;
        ahvr.cj(scheduledExecutorService, "scheduledExecutorService");
        this.Q = scheduledExecutorService;
        this.O = 3;
        this.v = javax.net.SocketFactory.getDefault();
        this.w = aoezVar.c;
        this.x = defpackage.aogb.a;
        aofz aofzVar = aoezVar.d;
        ahvr.cj(aofzVar, "connectionSpec");
        this.B = aofzVar;
        ahvr.cj(ahziVar, "stopwatchFactory");
        this.g = anxo.e("okhttp", str2);
        this.K = annjVar;
        this.G = runnable;
        this.H = aoezVar.g;
        this.I = aoezVar.h.ab();
        this.N = anns.a(getClass(), inetSocketAddress.toString());
        defpackage.anlw anlwVar2 = defpackage.anlw.a;
        defpackage.antt anttVar = new defpackage.antt(defpackage.anlw.a);
        anttVar.c(defpackage.anxi.b, anlwVar);
        this.r = anttVar.a();
        synchronized (obj) {
            j$.util.Objects.requireNonNull(this);
        }
    }

    static anqw g(defpackage.aogl aoglVar) {
        anqw anqwVar = (anqw) M.get(aoglVar);
        if (anqwVar != null) {
            return anqwVar;
        }
        int i = aoglVar.s;
        return anqw.d.f("Unknown http2 error code: " + i);
    }

    public static java.lang.String h(apqd apqdVar) throws java.io.EOFException {
        apoy apoyVar = new apoy();
        while (apqdVar.b(apoyVar, 1L) != -1) {
            if (apoyVar.c(apoyVar.b - 1) == 10) {
                long jI = apoyVar.i((byte) 10, 0L, Long.MAX_VALUE);
                if (jI != -1) {
                    return defpackage.apqh.a(apoyVar, jI);
                }
                apoy apoyVar2 = new apoy();
                apoyVar.F(apoyVar2, 0L, java.lang.Math.min(32L, apoyVar.b));
                throw new java.io.EOFException("\\n not found: limit=" + java.lang.Math.min(apoyVar.b, Long.MAX_VALUE) + " content=" + apoyVar2.r().g() + (char) 8230);
            }
        }
        throw new java.io.EOFException("\\n not found: ".concat(apoyVar.r().g()));
    }

    private final void u() {
        if (this.s == null || !this.n.isEmpty() || !this.A.isEmpty() || this.u) {
            return;
        }
        this.u = true;
        defpackage.anyk anykVar = this.C;
        if (anykVar != null) {
            anykVar.e();
        }
        defpackage.anxs anxsVar = this.t;
        if (anxsVar != null) {
            anqw anqwVarF = f();
            synchronized (anxsVar) {
                if (!anxsVar.d) {
                    anxsVar.d = true;
                    anxsVar.e = anqwVarF;
                    java.util.Map map = anxsVar.c;
                    anxsVar.c = null;
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        defpackage.anxs.b((aprf) entry.getKey(), (java.util.concurrent.Executor) entry.getValue());
                    }
                }
            }
            this.t = null;
        }
        if (!this.S) {
            this.S = true;
            this.k.i(defpackage.aogl.NO_ERROR, new byte[0]);
        }
        this.k.close();
    }

    @Override // defpackage.anyj
    public final void a(anqw anqwVar) {
        q(anqwVar);
        synchronized (this.m) {
            java.util.Iterator it = this.n.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                it.remove();
                ((defpackage.aofe) entry.getValue()).f.l(anqwVar, false, new anph());
                j((defpackage.aofe) entry.getValue());
            }
            java.util.Deque<defpackage.aofe> deque = this.A;
            for (defpackage.aofe aofeVar : deque) {
                aofeVar.f.m(anqwVar, defpackage.anvq.d, true, new anph());
                j(aofeVar);
            }
            deque.clear();
            u();
        }
    }

    public final /* bridge */ /* synthetic */ defpackage.anvp b(defpackage.anpk anpkVar, anph anphVar, anmb anmbVar, anmg[] anmgVarArr) {
        defpackage.aofe aofeVar;
        ahvr.cj(anpkVar, "method");
        ahvr.cj(anphVar, "headers");
        defpackage.aodj aodjVarH = defpackage.aodj.h(anmgVarArr, this.r);
        java.lang.Object obj = this.m;
        synchronized (obj) {
            aofeVar = new defpackage.aofe(anpkVar, anphVar, this.k, this, this.l, obj, this.R, this.i, this.f, this.g, aodjVarH, this.I, anmbVar);
        }
        return aofeVar;
    }

    public final anns c() {
        return this.N;
    }

    public final java.lang.Runnable d(anzt anztVar) {
        this.j = anztVar;
        if (this.D) {
            defpackage.anyk anykVar = new defpackage.anyk(new vqf(this), this.Q, this.E, this.F);
            this.C = anykVar;
            anykVar.d();
        }
        defpackage.aoer aoerVar = new defpackage.aoer(this.P, this);
        defpackage.aoeu aoeuVar = new defpackage.aoeu(aoerVar, new defpackage.aogu(aoov.aK(aoerVar)));
        synchronized (this.m) {
            this.k = new defpackage.aoet(this, aoeuVar);
            this.l = new aofv(this, this.k);
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        java.util.concurrent.CountDownLatch countDownLatch2 = new java.util.concurrent.CountDownLatch(1);
        java.util.concurrent.CyclicBarrier cyclicBarrier = new java.util.concurrent.CyclicBarrier(2);
        this.P.execute(new defpackage.aofh(this, countDownLatch, cyclicBarrier, aoerVar, countDownLatch2));
        this.o.execute(new anxz(this, cyclicBarrier, countDownLatch2, 10));
        try {
            synchronized (this.m) {
                defpackage.aoet aoetVar = this.k;
                try {
                    ((defpackage.aoeu) aoetVar.b).a.b();
                } catch (java.io.IOException e) {
                    aoetVar.a.e(e);
                }
                aogy aogyVar = new aogy();
                aogyVar.d(7, this.i);
                defpackage.aoet aoetVar2 = this.k;
                aoetVar2.c.f(2, aogyVar);
                try {
                    ((defpackage.aoeu) aoetVar2.b).a.g(aogyVar);
                } catch (java.io.IOException e2) {
                    aoetVar2.a.e(e2);
                }
            }
            countDownLatch.countDown();
            this.P.execute(new defpackage.aobd(this, 11));
            return null;
        } catch (java.lang.Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // defpackage.aoes
    public final void e(java.lang.Throwable th) {
        m(0, defpackage.aogl.INTERNAL_ERROR, anqw.l.e(th));
    }

    public final anqw f() {
        anqw anqwVarF;
        synchronized (this.m) {
            anqwVarF = this.s;
            if (anqwVarF == null) {
                anqwVarF = anqw.l.f("Connection closed");
            }
        }
        return anqwVarF;
    }

    final void i(int i, anqw anqwVar, defpackage.anvq anvqVar, boolean z, defpackage.aogl aoglVar, anph anphVar) {
        synchronized (this.m) {
            defpackage.aofe aofeVar = (defpackage.aofe) this.n.remove(java.lang.Integer.valueOf(i));
            if (aofeVar != null) {
                if (aoglVar != null) {
                    this.k.f(i, defpackage.aogl.CANCEL);
                }
                if (anqwVar != null) {
                    defpackage.aofd aofdVar = aofeVar.f;
                    if (anphVar == null) {
                        anphVar = new anph();
                    }
                    aofdVar.m(anqwVar, anvqVar, z, anphVar);
                }
                if (!p()) {
                    u();
                }
                j(aofeVar);
            }
        }
    }

    public final void j(defpackage.aofe aofeVar) {
        if (this.T && this.A.isEmpty() && this.n.isEmpty()) {
            this.T = false;
            defpackage.anyk anykVar = this.C;
            if (anykVar != null) {
                anykVar.c();
            }
        }
        if (aofeVar.u) {
            this.U.c(aofeVar, false);
        }
    }

    public final void k(defpackage.aogl aoglVar, java.lang.String str) {
        m(0, aoglVar, g(aoglVar).b(str));
    }

    public final void l(defpackage.aofe aofeVar) {
        if (!this.T) {
            this.T = true;
            defpackage.anyk anykVar = this.C;
            if (anykVar != null) {
                anykVar.b();
            }
        }
        if (aofeVar.u) {
            this.U.c(aofeVar, true);
        }
    }

    public final void m(int i, defpackage.aogl aoglVar, anqw anqwVar) {
        synchronized (this.m) {
            if (this.s == null) {
                this.s = anqwVar;
                this.j.c(anqwVar, new defpackage.anxh(aoglVar == null ? defpackage.anxm.NO_ERROR : defpackage.anxm.b(aoglVar.s)));
            }
            if (aoglVar != null && !this.S) {
                this.S = true;
                this.k.i(aoglVar, new byte[0]);
            }
            java.util.Iterator it = this.n.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (((java.lang.Integer) entry.getKey()).intValue() > i) {
                    it.remove();
                    ((defpackage.aofe) entry.getValue()).f.m(anqwVar, defpackage.anvq.b, false, new anph());
                    j((defpackage.aofe) entry.getValue());
                }
            }
            java.util.Deque<defpackage.aofe> deque = this.A;
            for (defpackage.aofe aofeVar : deque) {
                aofeVar.f.m(anqwVar, defpackage.anvq.d, true, new anph());
                j(aofeVar);
            }
            deque.clear();
            u();
        }
    }

    public final void n(defpackage.aofe aofeVar) {
        defpackage.aofd aofdVar = aofeVar.f;
        ahvr.bZ(aofdVar.x == -1, "StreamId already assigned");
        this.n.put(java.lang.Integer.valueOf(this.O), aofeVar);
        l(aofeVar);
        int i = this.O;
        ahvr.ca(aofdVar.x == -1, "the stream has been started with id %s", i);
        aofdVar.x = i;
        aofv aofvVar = aofdVar.h;
        int i2 = aofvVar.a;
        if (aofdVar == null) {
            throw new java.lang.NullPointerException("stream");
        }
        aofdVar.w = new defpackage.aoft(aofvVar, i, i2, aofdVar);
        defpackage.aofe aofeVar2 = aofdVar.y;
        aofeVar2.f.d();
        if (aofdVar.u) {
            defpackage.aoet aoetVar = aofdVar.g;
            try {
                ((defpackage.aoeu) aoetVar.b).a.j(false, aofdVar.x, aofdVar.b);
            } catch (java.io.IOException e) {
                aoetVar.a.e(e);
            }
            aofeVar2.d.a();
            aofdVar.b = null;
            apoy apoyVar = aofdVar.c;
            if (apoyVar.b > 0) {
                aofvVar.a(aofdVar.d, aofdVar.w, apoyVar, aofdVar.e);
            }
            aofdVar.u = false;
        }
        if (aofeVar.r() == defpackage.anpj.a || aofeVar.r() == defpackage.anpj.c) {
            boolean z = aofeVar.g;
        } else {
            this.k.d();
        }
        int i3 = this.O;
        if (i3 < 2147483645) {
            this.O = i3 + 2;
        } else {
            this.O = Integer.MAX_VALUE;
            m(Integer.MAX_VALUE, defpackage.aogl.NO_ERROR, anqw.l.f("Stream ids exhausted"));
        }
    }

    final boolean o(int i) {
        boolean z;
        synchronized (this.m) {
            z = false;
            if (i < this.O && (i & 1) == 1) {
                z = true;
            }
        }
        return z;
    }

    public final boolean p() {
        boolean z = false;
        while (true) {
            java.util.Deque deque = this.A;
            if (deque.isEmpty() || this.n.size() >= this.z) {
                break;
            }
            n((defpackage.aofe) deque.poll());
            z = true;
        }
        return z;
    }

    public final void q(anqw anqwVar) {
        synchronized (this.m) {
            if (this.s != null) {
                return;
            }
            this.s = anqwVar;
            this.j.c(anqwVar, defpackage.aodh.SUBCHANNEL_SHUTDOWN);
            u();
        }
    }

    public final void r(anqw anqwVar) {
        defpackage.aodh aodhVar = defpackage.aodh.SUBCHANNEL_SHUTDOWN;
        a(anqwVar);
    }

    @Override // defpackage.aofu
    public final defpackage.aoft[] s() {
        defpackage.aoft[] aoftVarArr;
        synchronized (this.m) {
            java.util.Map map = this.n;
            aoftVarArr = new defpackage.aoft[map.size()];
            java.util.Iterator it = map.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                aoftVarArr[i] = ((defpackage.aofe) it.next()).f.f();
                i++;
            }
        }
        return aoftVarArr;
    }

    @Override // defpackage.anwc
    public final defpackage.anlw t() {
        return this.r;
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.f("logId", this.N.b);
        ahymVarL.b("address", this.e);
        return ahymVarL.toString();
    }
}
