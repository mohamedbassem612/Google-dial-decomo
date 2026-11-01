package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zyo {
    private static defpackage.zyo b;
    final defpackage.zyt a;

    private zyo(android.content.Context context) {
        defpackage.zyt zytVarC = defpackage.zyt.c(context);
        this.a = zytVarC;
        zytVarC.a();
        zytVarC.b();
    }

    public static synchronized defpackage.zyo a(android.content.Context context) {
        return d(context.getApplicationContext());
    }

    private static synchronized defpackage.zyo d(android.content.Context context) {
        defpackage.zyo zyoVar;
        zyoVar = b;
        if (zyoVar == null) {
            zyoVar = new defpackage.zyo(context);
            b = zyoVar;
        }
        return zyoVar;
    }

    public final synchronized void b() {
        defpackage.zyt zytVar = this.a;
        zytVar.a.lock();
        try {
            zytVar.b.edit().clear().apply();
            zytVar.a.unlock();
        } catch (java.lang.Throwable th) {
            zytVar.a.unlock();
            throw th;
        }
    }

    public final synchronized void c(com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        aais.as(googleSignInOptions);
        defpackage.zyt zytVar = this.a;
        java.lang.String str = googleSignInAccount.h;
        zytVar.f("defaultGoogleSignInAccount", str);
        aais.as(googleSignInOptions);
        java.lang.String strE = zytVar.e("googleSignInAccount", str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str2 = googleSignInAccount.a;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            java.lang.String str3 = googleSignInAccount.b;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            java.lang.String str4 = googleSignInAccount.c;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            java.lang.String str5 = googleSignInAccount.d;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            java.lang.String str6 = googleSignInAccount.j;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            java.lang.String str7 = googleSignInAccount.k;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            android.net.Uri uri = googleSignInAccount.e;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            java.lang.String str8 = googleSignInAccount.f;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.g);
            jSONObject.put("obfuscatedIdentifier", str);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.List list = googleSignInAccount.i;
            com.google.android.gms.common.api.Scope[] scopeArr = (com.google.android.gms.common.api.Scope[]) list.toArray(new com.google.android.gms.common.api.Scope[list.size()]);
            java.util.Arrays.sort(scopeArr, new defpackage.qxq(13));
            for (com.google.android.gms.common.api.Scope scope : scopeArr) {
                jSONArray.put(scope.b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            zytVar.f(strE, jSONObject.toString());
            java.lang.String strE2 = zytVar.e("googleSignInOptions", str);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                java.util.ArrayList arrayList = googleSignInOptions.h;
                java.util.Collections.sort(arrayList, com.google.android.gms.auth.api.signin.GoogleSignInOptions.f);
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((com.google.android.gms.common.api.Scope) it.next()).b);
                }
                jSONObject2.put("scopes", jSONArray2);
                android.accounts.Account account = googleSignInOptions.i;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.j);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.l);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.k);
                java.lang.String str9 = googleSignInOptions.m;
                if (!android.text.TextUtils.isEmpty(str9)) {
                    jSONObject2.put("serverClientId", str9);
                }
                java.lang.String str10 = googleSignInOptions.n;
                if (!android.text.TextUtils.isEmpty(str10)) {
                    jSONObject2.put("hostedDomain", str10);
                }
                zytVar.f(strE2, jSONObject2.toString());
            } catch (org.json.JSONException e) {
                throw new java.lang.RuntimeException(e);
            }
        } catch (org.json.JSONException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }
}
