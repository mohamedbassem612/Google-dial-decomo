package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akaa implements defpackage.akbp {
    public static final anpc b;
    public static final anpc c;
    public static final anpc d;
    private static final anpc k;
    private static final anpc l;
    public defpackage.ajzy e;
    public akab f;
    public java.util.Set g;
    public akaw h;
    public defpackage.ulw i;
    private java.util.concurrent.Executor m;
    private final ahyn n;
    private final aigf o;
    private ajcq p;
    private defpackage.akbp q;
    private boolean r = false;
    private boolean s = false;
    private static final aimz j = aimz.i("com/google/frameworks/client/data/android/auth/AuthContextInterceptor");
    public static final anma a = new anma("com.google.frameworks.client.data.android.auth.AuthContextInterceptor", java.lang.Boolean.FALSE);

    static {
        anoz anozVar = anph.b;
        int i = anpc.d;
        b = new anoy("AuthContextInterceptor-RETRIABLE_OAUTH_ERROR", anozVar);
        c = new anoy("AuthContextInterceptor-RETRIED_WITH_FORCED_REAUTH", anph.b);
        d = new anoy("AuthContextInterceptor-IS_REMOTE_UNAUTHENTICATED", anph.b);
        k = new anoy("Authorization", anph.b);
        l = new anoy("X-Auth-Time", anph.b);
    }

    public akaa(ahyn ahynVar, aigf aigfVar) {
        this.n = ahynVar;
        this.o = aigfVar;
    }

    private static final boolean k(anqt anqtVar) {
        return anqtVar.equals(anqt.q) || anqtVar.equals(anqt.h);
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcc a() {
        return defpackage.akcc.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd b() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd c() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcc d() {
        return defpackage.akcc.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd e() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd f() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final defpackage.akcc g(defpackage.aljf aljfVar) {
        defpackage.akbp akbpVar = this.q;
        if (akbpVar != null) {
            return akbpVar.g(aljfVar);
        }
        try {
            this.i = (defpackage.ulw) aiql.H(this.p);
            java.lang.Object obj = aljfVar.d;
            anpc anpcVar = k;
            ahvr.bZ(!((anph) obj).i(anpcVar), "Already attached auth token");
            ((anph) obj).h(anpcVar, a.bx((java.lang.String) this.i.c, "Bearer "));
            ((anph) obj).h(l, java.lang.Long.toString(((j$.time.Instant) this.i.a).toEpochMilli()));
            return defpackage.akcc.a;
        } catch (java.util.concurrent.ExecutionException e) {
            java.lang.Throwable cause = e.getCause();
            anph anphVar = new anph();
            if (!(cause instanceof akac)) {
                return defpackage.akcc.b(anqw.d(cause), new anph());
            }
            if (!(cause.getCause() instanceof java.io.IOException)) {
                anqt anqtVar = anqt.q;
                java.util.List list = anqw.a;
                return defpackage.akcc.b(anqtVar.a().e(cause.getCause()), anphVar);
            }
            java.lang.String message = cause.getCause().getMessage();
            if (this.h.d()) {
                if (message != null) {
                    java.lang.Throwable cause2 = cause.getCause();
                    if (defpackage.zyu.NETWORK_ERROR.b(cause2.getMessage())) {
                        a.by(j.c(), "IOException from AuthContextManager - NetworkError", "com/google/frameworks/client/data/android/auth/AuthContextInterceptor", "logGmsIoException", (char) 311, "AuthContextInterceptor.java", cause2);
                    } else if (defpackage.zyu.SERVICE_UNAVAILABLE.b(cause2.getMessage())) {
                        a.by(j.c(), "IOException from AuthContextManager - ServiceUnavailable", "com/google/frameworks/client/data/android/auth/AuthContextInterceptor", "logGmsIoException", (char) 315, "AuthContextInterceptor.java", cause2);
                    } else if (defpackage.zyu.INTNERNAL_ERROR.b(cause2.getMessage())) {
                        a.by(j.c(), "IOException from AuthContextManager - InternalError", "com/google/frameworks/client/data/android/auth/AuthContextInterceptor", "logGmsIoException", (char) 319, "AuthContextInterceptor.java", cause2);
                    } else {
                        boolean zB = defpackage.zyu.AUTH_SECURITY_ERROR.b(cause2.getMessage());
                        aimz aimzVar = j;
                        if (zB) {
                            a.by(aimzVar.c(), "IOException from AuthContextManager - AuthSecurityError", "com/google/frameworks/client/data/android/auth/AuthContextInterceptor", "logGmsIoException", (char) 323, "AuthContextInterceptor.java", cause2);
                        } else {
                            a.by(aimzVar.c(), "IOException from AuthContextManager - Unknown message", "com/google/frameworks/client/data/android/auth/AuthContextInterceptor", "logGmsIoException", (char) 326, "AuthContextInterceptor.java", cause2);
                        }
                    }
                } else {
                    a.by(j.c(), "IOException from AuthContextManager - no message", "com/google/frameworks/client/data/android/auth/AuthContextInterceptor", "continueRequestHeaderProcessing", (char) 237, "AuthContextInterceptor.java", cause);
                }
            }
            anqt anqtVar2 = anqt.o;
            java.util.List list2 = anqw.a;
            return defpackage.akcc.b(anqtVar2.a().e(cause.getCause()), new anph());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    @Override // defpackage.akbp
    public final defpackage.akcc h(defpackage.aljf aljfVar) {
        anma anmaVar = a;
        anmb anmbVar = (anmb) aljfVar.a;
        this.s = ((java.lang.Boolean) anmbVar.f(anmaVar)).booleanValue();
        defpackage.ajzy ajzyVar = (defpackage.ajzy) anmbVar.f(defpackage.ajzy.a);
        ahvr.cj(ajzyVar, "Using AuthContextStrategy, but did not set AuthContext");
        this.e = ajzyVar;
        akaw akawVar = (akaw) anmbVar.f(defpackage.akax.a);
        ahvr.ci(akawVar);
        this.h = akawVar;
        anma anmaVar2 = defpackage.ajyy.a;
        this.m = ((ajyx) anmbVar.f(anmaVar2)).e;
        java.lang.String str = this.e.c;
        aigf aigfVar = this.o;
        boolean zContainsKey = aigfVar.containsKey(str);
        defpackage.ajzy ajzyVar2 = this.e;
        if (zContainsKey) {
            defpackage.ulw ulwVar = (defpackage.ulw) aigfVar.get(ajzyVar2.c);
            java.lang.Object obj = ulwVar.a;
            defpackage.akaj akajVar = new defpackage.akaj((apnt) ((ahys) ulwVar.b).a);
            this.q = akajVar;
            return akajVar.h(aljfVar);
        }
        java.lang.String str2 = ajzyVar2.c;
        boolean z = false;
        if (!str2.equals("incognito") && !str2.equals("pseudonymous")) {
            z = true;
        }
        ahvr.bZ(z, "Used non-google account without enabling API Key fallback");
        akab akabVar = ((ajyx) anmbVar.f(anmaVar2)).g;
        this.f = akabVar;
        defpackage.ajzy ajzyVar3 = this.e;
        this.r = true;
        ahyn ahynVar = this.n;
        this.g = ahynVar.f() ? ahynVar.b() : ((ajzs) anmbVar.f(ajzs.a)).b();
        ahoq ahoqVarW = ahvr.W(1486, "AuthContextInterceptor#tokenFuture");
        try {
            java.lang.Runnable ajcrVar = new ajcr(ahqx.i(new defpackage.ajzz(this, aljfVar, akabVar, ajzyVar3, 0)));
            ahoqVarW.a(ajcrVar);
            this.m.execute(ajcrVar);
            this.p = ajcrVar;
            defpackage.akcc akccVarC = defpackage.akcc.c(ajcrVar);
            ahoqVarW.close();
            return akccVarC;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.akbp
    public final defpackage.akcd i(apjb apjbVar) {
        java.lang.Object obj = apjbVar.a;
        anqt anqtVar = anqt.q;
        anqt anqtVar2 = ((anqw) obj).o;
        if (anqtVar2.equals(anqtVar) && this.r && this.i != null) {
            ((anph) apjbVar.b).h(d, "");
        }
        if (k(anqtVar2) && this.r) {
            ((anph) apjbVar.b).h(b, "");
        }
        if (this.s) {
            ((anph) apjbVar.b).h(c, "");
        }
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final defpackage.akcd j(apjb apjbVar) {
        if (!this.h.f() || !k(((anqw) apjbVar.a).o) || !this.r) {
            return i(apjbVar);
        }
        ahoq ahoqVarW = ahvr.W(1487, "AuthContextInterceptor#retryTokenFuture");
        try {
            java.lang.Runnable ajcrVar = new ajcr(ahqx.i(new agqr(this, 6)));
            ahoqVarW.a(ajcrVar);
            ahoqVarW.close();
            this.m.execute(ajcrVar);
            return new defpackage.akcd(3, ajcrVar);
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
