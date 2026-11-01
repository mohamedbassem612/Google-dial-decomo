package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class akaz implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public akaz(defpackage.anwk anwkVar, anqw anqwVar, anph anphVar, int i) {
        this.$cid = i;
        this.b = anqwVar;
        this.a = anphVar;
        j$.util.Objects.requireNonNull(anwkVar);
        this.c = anwkVar;
    }

    /* JADX WARN: Type inference failed for: r12v49, types: [anwr, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                ((akbb) this.a).c().dv((java.lang.String) this.b, (java.lang.Throwable) this.c);
                return;
            case 1:
                java.lang.Object obj2 = this.b;
                try {
                    ((ajxd) this.c).h((android.content.Intent) this.a);
                    return;
                } finally {
                    ((zzx) obj2).g((java.lang.Object) null);
                }
            case 2:
                ((akbb) this.a).c().a((anty) this.b, (anph) this.c);
                return;
            case 3:
                ((akbf) this.a).c().dv((java.lang.String) this.b, (java.lang.Throwable) this.c);
                return;
            case 4:
                ((akbf) this.a).c().a((anty) this.b, (anph) this.c);
                return;
            case 5:
                ((akbj) this.a).d.dv((java.lang.String) this.b, (java.lang.Throwable) this.c);
                return;
            case 6:
                ((akbw) this.c).dM((agwm) this.a, (akbt) this.b);
                return;
            case 7:
                akbw akbwVar = (akbw) this.a;
                java.util.Iterator it = akbwVar.b.iterator();
                while (it.hasNext()) {
                    ((ajcq) it.next()).cancel(true);
                }
                ajsz ajszVar = akbwVar.l;
                if (ajszVar != null) {
                    ajszVar.dv((java.lang.String) this.b, (java.lang.Throwable) this.c);
                    return;
                }
                return;
            case 8:
                ((akbw) this.c).dM((agwm) this.a, (akbt) this.b);
                return;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                java.lang.Object obj3 = this.a;
                akbs akbsVar = (akbs) obj3;
                boolean z2 = akbsVar.a;
                java.lang.Object obj4 = this.b;
                java.lang.Object obj5 = this.c;
                if (z2) {
                    return;
                }
                try {
                    ((akbs) obj3).c.a((anqw) obj5, (anph) obj4);
                    return;
                } finally {
                    akbsVar.a = true;
                    akbsVar.b.g.a();
                }
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                akbx akbxVar = (akbx) this.b;
                java.util.Iterator it2 = ((java.util.LinkedHashMap) akbxVar.c).entrySet().iterator();
                while (true) {
                    obj = this.c;
                    if (it2.hasNext()) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                        if (((ajcq) entry.getValue()).isDone()) {
                            it2.remove();
                            akbp akbpVar = (akbp) entry.getKey();
                            try {
                                ((defpackage.akby) obj).j((agwm) this.a, akbpVar, akbpVar.c(), akbxVar);
                            } catch (java.lang.Throwable th) {
                                defpackage.akby akbyVar = (defpackage.akby) obj;
                                akbyVar.d = anqw.d(th);
                                akbyVar.e = new anph();
                                akbyVar.g();
                                akbyVar.c = true;
                                return;
                            }
                        }
                    }
                }
                if (akbxVar.a()) {
                    akbxVar.b--;
                    ((defpackage.akby) obj).f();
                    return;
                }
                return;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                ((akce) this.a).a.a((anqw) this.c, (anph) this.b);
                return;
            case 12:
                ((defpackage.anwl) this.c).g.a((anty) this.a, (anph) this.b);
                return;
            case 13:
                java.lang.Object obj6 = this.c;
                defpackage.anwk anwkVar = (defpackage.anwk) obj6;
                anqw anqwVar = anwkVar.b;
                java.lang.Object anphVar = this.a;
                java.lang.Object obj7 = this.b;
                if (anqwVar != null) {
                    obj7 = anwkVar.b;
                    anphVar = new anph();
                }
                try {
                    ((defpackage.anwk) obj6).d.a((anqw) obj7, (anph) anphVar);
                    return;
                } catch (java.lang.RuntimeException e) {
                    defpackage.anwl.a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.DelayedClientCall$DelayedListener$3", "run", "Exception thrown by onClose() in ClientCall", (java.lang.Throwable) e);
                    return;
                }
            default:
                defpackage.anyf anyfVar = (defpackage.anyf) this.c;
                defpackage.anyh anyhVar = anyfVar.c;
                if (anyhVar.p.a == anmm.e) {
                    return;
                }
                anzu anzuVar = anyhVar.o;
                defpackage.anwc anwcVar = anyfVar.a;
                if (anzuVar == anwcVar) {
                    anyhVar.o = null;
                    defpackage.anye anyeVar = anyhVar.h;
                    anyeVar.c();
                    anyhVar.d(anmm.d);
                    defpackage.aodn aodnVar = anyhVar.s;
                    java.lang.String str = anyhVar.t;
                    java.lang.String strG = defpackage.anyf.g(anyeVar.a());
                    java.lang.String strF = defpackage.anyf.f(anyeVar.a(), defpackage.anna.b);
                    java.lang.String strA = this.b.a();
                    java.lang.String strE = defpackage.anyf.e((defpackage.anqj) anyeVar.a().a(defpackage.anxi.a));
                    defpackage.anqd anqdVar = defpackage.aodn.b;
                    aify aifyVarP = aify.p(str);
                    aify aifyVarR = aify.r(strG, strF, strA);
                    anpm anpmVar = aodnVar.a;
                    anpmVar.a(anqdVar, aifyVarP, aifyVarR);
                    anpmVar.b(defpackage.aodn.e, aify.p(str), aify.r(strE, strG, strF));
                    return;
                }
                if (anyhVar.n == anwcVar) {
                    defpackage.aodn aodnVar2 = anyhVar.s;
                    java.lang.String str2 = anyhVar.t;
                    defpackage.anye anyeVar2 = anyhVar.h;
                    aodnVar2.a.a(defpackage.aodn.d, aify.p(str2), aify.q(defpackage.anyf.g(anyeVar2.a()), defpackage.anyf.f(anyeVar2.a(), defpackage.anna.b)));
                    ahvr.cc(anyhVar.p.a == anmm.a, "Expected state is CONNECTING, actual state is %s", anyhVar.p.a);
                    defpackage.anna annaVar = (defpackage.anna) anyeVar2.a.get(anyeVar2.b);
                    int i = anyeVar2.c + 1;
                    anyeVar2.c = i;
                    if (i >= annaVar.e.size()) {
                        anyeVar2.b++;
                        anyeVar2.c = 0;
                    }
                    if (anyeVar2.b < anyeVar2.a.size()) {
                        anyhVar.i();
                        return;
                    }
                    anyhVar.n = null;
                    anyeVar2.c();
                    java.lang.Object obj8 = this.a;
                    anrc anrcVar = anyhVar.g;
                    anrcVar.c();
                    anqw anqwVar2 = (anqw) obj8;
                    ahvr.bN(!anqwVar2.h(), "The error status must not be OK");
                    anyhVar.e(new defpackage.anmn(anmm.c, anqwVar2));
                    if (anyhVar.e) {
                        return;
                    }
                    if (anyhVar.u == null) {
                        anyhVar.u = new defpackage.anwx();
                    }
                    long jA = anyhVar.u.a() - anyhVar.j.a(java.util.concurrent.TimeUnit.NANOSECONDS);
                    anyhVar.d.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", new java.lang.Object[]{defpackage.anyh.k(anqwVar2), java.lang.Long.valueOf(jA)});
                    ahvr.bZ(anyhVar.v == null, "previous reconnectTask is not done");
                    anyhVar.v = anrcVar.d(new defpackage.anwo(anyhVar, 5), jA, java.util.concurrent.TimeUnit.NANOSECONDS, anyhVar.b);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ akaz(anty antyVar, anqw anqwVar, anph anphVar, int i) {
        this.$cid = i;
        this.a = antyVar;
        this.c = anqwVar;
        this.b = anphVar;
    }

    public /* synthetic */ akaz(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ akaz(ajsz ajszVar, java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = ajszVar;
        this.b = obj;
        this.c = obj2;
    }

    public akaz(defpackage.anyf anyfVar, defpackage.anwr anwrVar, anqw anqwVar, int i) {
        this.$cid = i;
        this.b = anwrVar;
        this.a = anqwVar;
        j$.util.Objects.requireNonNull(anyfVar);
        this.c = anyfVar;
    }
}
