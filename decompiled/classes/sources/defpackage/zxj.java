package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zxj {
    private static final defpackage.aimz a = defpackage.aimz.i("com/google/android/gms/auth/aang/migration/MigrationUtils");

    public static zww a(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zww zwwVarA = com.google.android.gms.auth.aang.GetTokenRequest.a();
        zwwVarA.b = str;
        zwwVarA.e(true);
        if (str2.startsWith("oauth2:")) {
            zwwVarA.c = defpackage.aify.p(str2.replaceFirst("^oauth2:", ""));
        } else if (str2.startsWith("weblogin:")) {
            zwwVarA.d = defpackage.aify.p(str2.replaceFirst("^weblogin:", ""));
        } else if (str2.startsWith("audience:server:client_id:")) {
            zwwVarA.f = defpackage.aify.p(str2.substring(26));
        } else {
            zwwVarA.e = defpackage.aify.p(str2);
        }
        java.lang.String string = bundle.getString("delegatee_user_id");
        if (string != null) {
            int i = bundle.getInt("delegation_type", 0);
            zwwVarA.g = string;
            zwwVarA.c(i);
        }
        java.lang.String string2 = bundle.getString(defpackage.zwk.a);
        if (string2 != null) {
            zwwVarA.h = string2;
        }
        zwwVarA.d(bundle.getBoolean("suppressProgressScreen"));
        android.net.Network network = (android.net.Network) defpackage.dpe.t(bundle, "networkToUse", android.net.Network.class);
        if (network != null) {
            zwwVarA.i = network;
        }
        return zwwVarA;
    }

    public static zww b(android.accounts.Account account, java.lang.String str, defpackage.zwx zwxVar, android.os.Bundle bundle) throws java.io.IOException {
        com.google.android.gms.auth.aang.GoogleAccount googleAccount;
        try {
            zwv zwvVarA = com.google.android.gms.auth.aang.GetAccountsRequest.a();
            zwvVarA.b(account.type);
            java.util.Iterator it = ((com.google.android.gms.auth.aang.GetAccountsResponse) defpackage.aazc.t(zwxVar.b(zwvVarA.a()))).a.iterator();
            do {
                if (!it.hasNext()) {
                    googleAccount = null;
                    break;
                }
                googleAccount = (com.google.android.gms.auth.aang.GoogleAccount) it.next();
            } while (!googleAccount.c.equals(account.name));
            if (googleAccount == null) {
                throw new java.io.IOException("Account not found: ".concat(java.lang.String.valueOf(account.name)));
            }
            zww zwwVarA = com.google.android.gms.auth.aang.GetTokenRequest.a();
            zwwVarA.a = googleAccount;
            zwwVarA.e(true);
            if (str.startsWith("oauth2:")) {
                zwwVarA.c = defpackage.aify.p(str.replaceFirst("^oauth2:", ""));
            } else if (str.startsWith("weblogin:")) {
                zwwVarA.d = defpackage.aify.p(str.replaceFirst("^weblogin:", ""));
            } else if (str.startsWith("audience:server:client_id:")) {
                zwwVarA.f = defpackage.aify.p(str.substring(26));
            } else {
                zwwVarA.e = defpackage.aify.p(str);
            }
            java.lang.String string = bundle.getString("delegatee_user_id");
            if (string != null) {
                int i = bundle.getInt("delegation_type", 0);
                zwwVarA.g = string;
                zwwVarA.c(i);
            }
            java.lang.String string2 = bundle.getString(defpackage.zwk.a);
            if (string2 != null) {
                zwwVarA.h = string2;
            }
            zwwVarA.d(bundle.getBoolean("suppressProgressScreen"));
            android.net.Network network = (android.net.Network) defpackage.dpe.t(bundle, "networkToUse", android.net.Network.class);
            if (network != null) {
                zwwVarA.i = network;
            }
            return zwwVarA;
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.IOException("Fetching accounts was interrupted", e);
        } catch (java.util.concurrent.ExecutionException e2) {
            throw new java.io.IOException("Account not found: ".concat(java.lang.String.valueOf(account.name)), e2);
        }
    }

    public static void c(java.util.concurrent.ExecutionException executionException, java.lang.String str) {
        if (defpackage.andi.c() && (executionException.getCause() instanceof defpackage.aacw)) {
            defpackage.aacw aacwVar = (defpackage.aacw) executionException.getCause();
            if (aacwVar.a() == 17 || aacwVar.a() == 22) {
                return;
            }
            if (defpackage.andi.a.eZ().i() && aacwVar != null) {
                int iA = aacwVar.a();
                if (iA != 7 && iA != 20 && iA != 21) {
                    switch (iA) {
                    }
                }
                throw new java.io.IOException(aacwVar);
            }
        }
        if (executionException.getCause() instanceof com.google.android.gms.auth.UserRecoverableAuthException) {
            throw executionException.getCause();
        }
        if (executionException.getCause() instanceof zwy) {
            throw new com.google.android.gms.auth.UserRecoverableAuthException(executionException.getCause().getMessage(), defpackage.aehj.cd(executionException.getCause().a.h), 1);
        }
        if (executionException.getCause() instanceof defpackage.zwj) {
            throw ((defpackage.zwj) executionException.getCause());
        }
        if (executionException.getCause() instanceof zwu) {
            throw new defpackage.zwj(executionException.getCause().getMessage(), executionException.getCause());
        }
        if (executionException.getCause() instanceof java.io.IOException) {
            throw ((java.io.IOException) executionException.getCause());
        }
        if (!(executionException.getCause() instanceof zws)) {
            throw new defpackage.zwj(str, executionException);
        }
        throw executionException.getCause();
    }

    public static boolean d(java.lang.String str) {
        defpackage.andi andiVar = defpackage.andi.a;
        if (andiVar.eZ().e()) {
            defpackage.alat alatVar = andiVar.eZ().b().b;
            if (!alatVar.contains(str) || alatVar.contains("-".concat(java.lang.String.valueOf(str)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(java.lang.String str, defpackage.zwx zwxVar, android.content.Context context) {
        defpackage.aabx aabxVar = defpackage.aabx.a;
        defpackage.andi andiVar = defpackage.andi.a;
        boolean z = false;
        if (!andiVar.eZ().f() || andiVar.eZ().a().b.contains(str)) {
            ((defpackage.aimw) ((defpackage.aimw) a.b().j(aaio.a, 343)).l("com/google/android/gms/auth/aang/migration/MigrationUtils", "shouldUseGoogleAuthClientForGetToken1p", 124, "MigrationUtils.java")).y("Using GoogleAuthUtil for getToken for 1p app: %s", str);
        } else {
            if (!defpackage.andi.c()) {
                try {
                    defpackage.aazc.t(andiVar.eZ().j() ? aabxVar.c(defpackage.ajbm.INSTANCE, zwxVar, new defpackage.aadf[0]) : aabxVar.b(zwxVar, new defpackage.aadf[0]));
                    z = true;
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                    if (e instanceof java.lang.InterruptedException) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                }
            } else if (aabxVar.l(context, 234200000) == 0) {
                z = true;
            }
            ((defpackage.aimw) ((defpackage.aimw) a.b().j(aaio.a, 343)).l("com/google/android/gms/auth/aang/migration/MigrationUtils", "shouldUseGoogleAuthClientForGetToken1p", 150, "MigrationUtils.java")).I("Using %s for getToken for 1p app: %s", true != z ? "GoogleAuthUtil" : "GoogleAuthClient", str);
        }
        return z;
    }

    public static android.accounts.Account[] f(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.auth.aang.GoogleAccount googleAccount = (com.google.android.gms.auth.aang.GoogleAccount) it.next();
            arrayList.add(new android.accounts.Account(googleAccount.c, googleAccount.b));
        }
        return (android.accounts.Account[]) arrayList.toArray(new android.accounts.Account[0]);
    }
}
