package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akao implements defpackage.akae {
    private final j$.util.Optional a;
    private final android.content.Context b;
    private final defpackage.akaw c;

    public akao(j$.util.Optional optional, android.content.Context context, defpackage.akaw akawVar) {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1495, "GoogleGmsCoreTokenProviderImpl#<init>", defpackage.ahot.a, true);
        try {
            this.a = optional;
            this.b = context;
            this.c = akawVar;
            ahoqVarX.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akae
    public final void a(java.lang.String str) throws defpackage.akac {
        try {
            defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1496, "GoogleGmsCoreTokenProviderImpl#clearToken");
            try {
                android.content.Context context = this.b;
                long jC = this.c.c();
                java.lang.String str2 = defpackage.zwk.a;
                defpackage.zwq.e(context, str, jC);
                ahoqVarW.close();
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (defpackage.zwj e) {
            throw new defpackage.akac(e);
        }
    }

    @Override // defpackage.akae
    public final ulw b(android.accounts.Account account, java.lang.String str) throws defpackage.akac {
        try {
            defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1497, "GoogleGmsCoreTokenProviderImpl#getTokenWithDetails");
            try {
                defpackage.akaw akawVar = this.c;
                com.google.android.gms.auth.TokenData tokenDataA = defpackage.zwk.a(this.b, account, str, null, akawVar.c(), akawVar.p() ? (java.util.concurrent.Executor) this.a.orElse((java.lang.Object) null) : null);
                java.lang.String str2 = tokenDataA.b;
                j$.time.Instant instantNow = j$.time.Instant.now();
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(tokenDataA.c);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(j$.time.Instant.ofEpochSecond(((java.lang.Long) optionalOfNullable.get()).longValue()));
                }
                ulw ulwVar = new ulw(str2, instantNow, (j$.time.Instant) optionalOfNullable.orElse((java.lang.Object) null));
                ahoqVarW.close();
                return ulwVar;
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (defpackage.zwj e) {
            throw new defpackage.akac(e);
        }
    }
}
