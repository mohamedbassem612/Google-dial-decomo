package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akai implements akae {
    private final android.accounts.AccountManager a;
    private final akaw b;

    public akai(android.content.Context context, akaw akawVar) {
        ahoq ahoqVarW = ahvr.W(1488, "AccountManagerTokenProvider#<init>");
        try {
            this.a = android.accounts.AccountManager.get(context);
            this.b = akawVar;
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

    public final void a(java.lang.String str) {
        ahoq ahoqVarW = ahvr.W(1489, "AccountManagerTokenProvider#clearToken");
        try {
            this.a.invalidateAuthToken("com.google", str);
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: akac */
    public final defpackage.ulw b(android.accounts.Account account, java.lang.String str) throws akac, java.io.IOException {
        try {
            ahoq ahoqVarW = ahvr.W(1490, "AccountManagerTokenProvider#getTokenWithDetails");
            try {
                android.os.Bundle result = this.a.getAuthToken(account, str, (android.os.Bundle) null, false, (android.accounts.AccountManagerCallback<android.os.Bundle>) null, (android.os.Handler) null).getResult(this.b.b(), java.util.concurrent.TimeUnit.MILLISECONDS);
                java.lang.String string = result.getString("authtoken");
                if (string != null) {
                    long j = result.getLong("android.accounts.expiry");
                    defpackage.ulw ulwVar = new defpackage.ulw(string, j$.time.Instant.now(), j == 0 ? null : j$.time.Instant.ofEpochMilli(j));
                    ahoqVarW.close();
                    return ulwVar;
                }
                java.lang.String string2 = result.getString("errorMessage");
                android.content.Intent intent = (android.content.Intent) result.getParcelable("intent");
                if (intent != null) {
                    throw new akac(new com.google.android.gms.auth.UserRecoverableAuthException(string2, intent, 1));
                }
                int i = result.getInt("errorCode");
                if (i == 1 || i == 3 || i == 4) {
                    throw new java.io.IOException(string2);
                }
                throw new akac(new zwj(string2));
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (android.accounts.AuthenticatorException e) {
            throw new akac(new zwj(e));
        } catch (android.accounts.OperationCanceledException e2) {
            throw new java.io.IOException(e2);
        }
    }
}
