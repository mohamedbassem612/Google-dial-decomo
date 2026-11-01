package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akan implements defpackage.akae {
    private static final defpackage.aimz b = defpackage.aimz.i("com/google/frameworks/client/data/android/auth/impl/FallbackGoogleTokenProvider");
    public final defpackage.akaw a;
    private final defpackage.akae c;
    private final defpackage.aoir d;
    private final defpackage.aoir e;

    public akan(j$.util.Optional optional, android.content.Context context, defpackage.aazc aazcVar, defpackage.akaw akawVar, defpackage.akae akaeVar) {
        if (optional == null) {
            defpackage.aooh.i("blockingExecutor");
        }
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        this.a = akawVar;
        this.c = akaeVar;
        this.d = new defpackage.aoiy(new defpackage.bev(context, this, 18, null));
        this.e = new defpackage.aoiy(new defpackage.acik(this, 10));
    }

    private final akai c() {
        return (akai) this.d.a();
    }

    private final boolean d() {
        return ((java.lang.Boolean) this.e.a()).booleanValue();
    }

    @Override // defpackage.akae
    public final void a(java.lang.String str) throws java.io.IOException {
        defpackage.aooh.f(str, "token");
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1493, "FallbackGoogleTokenProvider#clearToken");
        try {
            try {
                this.c.a(str);
            } catch (java.io.IOException e) {
                if (d()) {
                    ((defpackage.aimw) ((defpackage.aimw) b.d()).k(e).l("com/google/frameworks/client/data/android/auth/impl/FallbackGoogleTokenProvider", "clearToken$<anonymous>", 65, "FallbackGoogleTokenProvider.kt")).v("Failed to clear token from GMS Core, falling back to AccountManager");
                }
                c().a(str);
            }
            defpackage.ajsz.ak(ahoqVarW, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.akae
    public final ulw b(android.accounts.Account account, java.lang.String str) throws java.io.IOException {
        ulw ulwVarB;
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1494, "FallbackGoogleTokenProvider#getTokenWithDetails");
        try {
            try {
                ulwVarB = this.c.b(account, str);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.ajsz.ak(ahoqVarW, th);
                    throw th2;
                }
            }
        } catch (java.io.IOException e) {
            if (d()) {
                ((defpackage.aimw) ((defpackage.aimw) b.d()).k(e).l("com/google/frameworks/client/data/android/auth/impl/FallbackGoogleTokenProvider", "getTokenWithDetails$<anonymous>", 47, "FallbackGoogleTokenProvider.kt")).v("Failed to get token from GMS Core, falling back to AccountManager");
            }
            ulwVarB = c().b(account, str);
        }
        defpackage.ajsz.ak(ahoqVarW, null);
        return ulwVarB;
    }
}
