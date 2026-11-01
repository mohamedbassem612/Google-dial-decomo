package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rap {
    public static final aimz a = aimz.i("com/android/dialer/incall/voice/service/VoiceController");
    private final defpackage.pqm A;
    private final zzx B;
    public final zmq c;
    public final android.app.KeyguardManager d;
    public final zms e;
    public final java.util.Map f;
    public final mba g;
    public final agsm h;
    public final java.util.Map i;
    public final defpackage.rak j;
    public final ajct k;
    public defpackage.rce l;
    public int m;
    public int n;
    public final defpackage.znk o;
    public final zpz p;
    public final defpackage.qbe q;
    public final zpm r;
    public final defpackage.pqo s;
    public final defpackage.qcr t;
    public final zzx u;
    public final tkl w;
    private final defpackage.zmo x;
    private final java.lang.String y;
    private final aoin z;
    public final pya b = new defpackage.ram(this, 0);
    public final ahda v = new ahda();

    public rap(ajct ajctVar, agsm agsmVar, zmq zmqVar, zms zmsVar, defpackage.pqm pqmVar, zpz zpzVar, android.app.KeyguardManager keyguardManager, defpackage.zmo zmoVar, defpackage.qbe qbeVar, defpackage.qcr qcrVar, zzx zzxVar, java.util.Map map, java.util.Map map2, mba mbaVar, zpm zpmVar, defpackage.rak rakVar, tkl tklVar, defpackage.pqo pqoVar, java.lang.String str, zzx zzxVar2, aoin aoinVar) {
        defpackage.rce rceVar = defpackage.rcf.a;
        this.l = defpackage.rcf.a;
        this.m = 0;
        this.n = 0;
        this.o = new defpackage.pva(this, 3);
        this.k = ajctVar;
        this.h = agsmVar;
        this.c = zmqVar;
        this.e = zmsVar;
        this.A = pqmVar;
        this.p = zpzVar;
        this.d = keyguardManager;
        this.x = zmoVar;
        this.q = qbeVar;
        this.s = pqoVar;
        this.t = qcrVar;
        this.B = zzxVar;
        this.f = map;
        this.i = map2;
        this.g = mbaVar;
        this.r = zpmVar;
        this.j = rakVar;
        this.w = tklVar;
        this.y = str;
        this.u = zzxVar2;
        this.z = aoinVar;
    }

    public final ajcq a() {
        return this.v.g(new raj(this, 5), this.k);
    }

    public final void b() {
        agsm.i(682, this.A.f(), "Failed to disconnect.", new java.lang.Object[0]);
    }

    public final void c(defpackage.qtr qtrVar) {
        ahoq ahoqVarW = ahvr.W(683, "VoiceController_displayMultibindingProvidedBottomSheetFragment");
        try {
            h(new defpackage.pmw(this, qtrVar, 20));
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d() {
        h(new defpackage.qsu(this, 6));
    }

    public final void e(qbc qbcVar) {
        this.q.a(qbcVar);
    }

    public final void f(defpackage.qug qugVar) {
        aoin aoinVar = (aoin) this.B.k().get(qugVar);
        if (aoinVar != null) {
            ((defpackage.qtx) aoinVar.a()).a();
        } else {
            this.g.a(mcd.w);
            throw new java.lang.IllegalStateException(java.lang.String.format("Listener for %s not injected to CallScopeComponent.", qugVar.name()));
        }
    }

    public final void g() {
        this.m = 0;
        this.n = 0;
        defpackage.rak rakVar = this.j;
        ajcq ajcqVarH = ahvr.H(rakVar.b(), new defpackage.qgx(this, 12), this.k);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        agsm agsmVar = this.h;
        agsmVar.g(ajcqVarH, 5L, timeUnit);
        agsmVar.g(rakVar.f.g(new raj(rakVar, 2), rakVar.d), 5L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public final void h(java.lang.Runnable runnable) {
        this.h.g(this.v.g(new raj(runnable, 3), this.k), 5L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public final void i() {
        j(defpackage.qtr.AUDIO_ROUTE_SELECTOR);
    }

    public final void j(defpackage.qtr qtrVar) {
        ahoq ahoqVarW = ahvr.W(684, "VoiceController_toggleMultibindingProvidedBottomSheet");
        try {
            h(new defpackage.pmw(this, qtrVar, 19));
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void k() {
        this.x.c();
    }

    public final void l() {
        if (((java.lang.Boolean) this.z.a()).booleanValue()) {
            this.e.f();
        } else {
            this.p.a(ajcm.a);
        }
    }

    public final ajcq m(defpackage.qtr qtrVar, int i) {
        java.lang.Object obj;
        d();
        j$.util.Optional optionalE = this.r.e(this.y);
        defpackage.qkv qkvVar = new defpackage.qkv(qtrVar, 10);
        if (true == optionalE.isPresent()) {
            java.lang.Object obj2 = optionalE.get();
            optionalE = j$.util.Optional.ofNullable((defpackage.qts) ((defpackage.rao) ((defpackage.apqr) obj2).a(defpackage.rao.class)).bZ().get(qkvVar.a));
        }
        defpackage.alke alkeVar = new defpackage.alke(i, 1);
        if (true == optionalE.isPresent()) {
            optionalE = j$.util.Optional.ofNullable(((defpackage.qts) optionalE.get()).h(alkeVar.a));
        }
        idb idbVar = new idb(qtrVar, 9);
        if (true != optionalE.isPresent()) {
            a.b().l("com/android/dialer/incall/voice/service/VoiceController", "onMultibindingProvidedBottomSheetFragmentHidden", 346, "VoiceController.java").y("Listener for key %s not injected to CallScopeComponent.", idbVar.a);
            obj = ajcm.a;
        } else {
            obj = optionalE.get();
        }
        return (ajcq) obj;
    }

    public final void n(int i) {
        h(new eyd(this, i, 6));
    }
}
