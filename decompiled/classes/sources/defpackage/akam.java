package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akam implements defpackage.akab {
    private static final j$.time.Duration c = j$.time.Duration.ofMinutes(5);
    private static final j$.time.Duration d = j$.time.Duration.ofHours(1);
    private static final defpackage.ahyj e = new defpackage.ahyj(" ");
    private final android.content.Context g;
    private final defpackage.akae h;
    private final defpackage.akcg j;
    private final android.os.Handler k;
    private final defpackage.akaw l;
    private final java.util.concurrent.atomic.AtomicReference f = new java.util.concurrent.atomic.AtomicReference();
    private final defpackage.ajct i = new defpackage.ajbn();
    public final java.util.Map a = new java.util.HashMap();
    public final java.util.Map b = new java.util.HashMap();

    public akam(android.content.Context context, defpackage.akae akaeVar, android.os.Handler handler, defpackage.akcg akcgVar, defpackage.akaw akawVar) {
        this.g = context.getApplicationContext();
        this.h = akaeVar;
        this.j = akcgVar;
        this.k = handler;
        this.l = akawVar;
    }

    private final android.accounts.Account g(ajzy ajzyVar) {
        defpackage.ahvr.cc(true, "AuthContext has an obfuscated gaia id, but %s does not support it. The TikTok GoogleAuthClientTokenProvider flag must be rolled out with the app-level token provider flag.", this.h.getClass().getName());
        return new android.accounts.Account(ajzyVar.b, "com.google");
    }

    private static final java.lang.String h(java.util.Set set) {
        return "oauth2:".concat(e.b(set));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // defpackage.akab
    public final ulw a(ajzy ajzyVar, java.lang.String str, java.util.Set set) throws defpackage.akac {
        defpackage.ajcq ajcrVar;
        ?? r6;
        akal akalVar = new akal(g(ajzyVar), h(set));
        java.util.Map map = this.b;
        synchronized (map) {
            ajcrVar = (defpackage.ajcq) map.get(akalVar);
            r6 = 0;
            if (ajcrVar == null) {
                ajcrVar = new defpackage.ajcr((java.util.concurrent.Callable) new wwx(this, str, akalVar, 16, (char[]) null));
                ajcrVar.c(new agrz(this, akalVar, 16, (byte[]) null), this.i);
                map.put(akalVar, ajcrVar);
                r6 = ajcrVar;
            }
        }
        if (r6 != 0) {
            r6.run();
        }
        try {
            return (ulw) ajcrVar.get();
        } catch (java.util.concurrent.ExecutionException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof defpackage.akac) {
                throw ((defpackage.akac) cause);
            }
            throw new defpackage.akac("Failed to refresh token", cause);
        }
    }

    @Override // defpackage.akab
    public final ulw b(ajzy ajzyVar, java.util.Set set) throws defpackage.akac {
        ulw ulwVarE;
        android.accounts.Account accountG = g(ajzyVar);
        try {
            defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1492, "AuthContextManagerImpl#getAuthToken");
            try {
                akal akalVar = new akal(accountG, h(set));
                synchronized (this.a) {
                    ulwVarE = e(akalVar);
                }
                ahoqVarW.close();
                return ulwVarE;
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (defpackage.akac e2) {
            throw e2;
        } catch (java.lang.Throwable th3) {
            throw new defpackage.akac("Failed to get auth token", th3);
        }
    }

    @Override // defpackage.akab
    public final /* synthetic */ ulw c(ajzy ajzyVar, java.util.Set set) {
        defpackage.aooh.f(ajzyVar, "context");
        defpackage.aooh.f(set, "oauthScopes");
        return a(ajzyVar, null, set);
    }

    public final void d(java.lang.String str) {
        this.h.a(str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [j$.time.temporal.Temporal, java.lang.Object] */
    public final ulw e(akal akalVar) {
        ulw ulwVar = (ulw) this.a.get(akalVar);
        if (ulwVar != null) {
            ?? r1 = ulwVar.b;
            if (r1 == 0) {
                aljf aljfVarD = this.j.d();
                if (aljfVarD != null && aljfVarD.c()) {
                    ahix ahixVarB = aljfVarD.b();
                    defpackage.aogc aogcVar = (defpackage.aogc) aljfVarD.a;
                    ((defpackage.afip) ahixVarB.f.eZ()).b(1L, aogcVar.b, aogcVar.p());
                }
                if (j$.time.Duration.between((j$.time.temporal.Temporal) ulwVar.a, j$.time.Instant.now()).compareTo(d.minus(c)) < 0) {
                    return ulwVar;
                }
            } else if (j$.time.Duration.between(j$.time.Instant.now(), (j$.time.temporal.Temporal) r1).compareTo(c) > 0) {
                return ulwVar;
            }
            d((java.lang.String) ulwVar.c);
        }
        return f(akalVar);
    }

    public final ulw f(akal akalVar) throws java.lang.Exception {
        defpackage.akcg akcgVar = this.j;
        akcgVar.a("attempt");
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            if (this.l.j()) {
                java.util.concurrent.atomic.AtomicReference atomicReference = this.f;
                if (defpackage.anty.aq(atomicReference, new akak(this))) {
                    aa$.ExternalSyntheticApiModelOutline0.m(android.accounts.AccountManager.get(this.g), (android.accounts.OnAccountsUpdateListener) atomicReference.get(), this.k, false, new java.lang.String[]{"com.google"});
                }
            }
            ulw ulwVarB = this.h.b(akalVar.a, akalVar.b);
            this.a.put(akalVar, ulwVarB);
            akcgVar.a("success");
            akcgVar.b(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
            return ulwVarB;
        } catch (java.lang.Exception e2) {
            defpackage.akcg akcgVar2 = this.j;
            akcgVar2.a("failure");
            akcgVar2.b(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
            throw e2;
        }
    }
}
