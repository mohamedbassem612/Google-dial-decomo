package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zyt {
    private static final java.util.concurrent.locks.Lock c = new java.util.concurrent.locks.ReentrantLock();
    private static defpackage.zyt d;
    public final java.util.concurrent.locks.Lock a = new java.util.concurrent.locks.ReentrantLock();
    public final android.content.SharedPreferences b;

    public zyt(android.content.Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static defpackage.zyt c(android.content.Context context) {
        aais.as(context);
        c.lock();
        try {
            defpackage.zyt zytVar = d;
            if (zytVar == null) {
                zytVar = new defpackage.zyt(context.getApplicationContext());
                d = zytVar;
            }
            return zytVar;
        } finally {
            c.unlock();
        }
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount a() {
        java.lang.String strD;
        java.lang.String strD2 = d("defaultGoogleSignInAccount");
        if (android.text.TextUtils.isEmpty(strD2) || (strD = d(e("googleSignInAccount", strD2))) == null) {
            return null;
        }
        try {
            if (android.text.TextUtils.isEmpty(strD)) {
                return null;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(strD);
            java.lang.String strOptString = jSONObject.optString("photoUrl");
            android.net.Uri uri = !android.text.TextUtils.isEmpty(strOptString) ? android.net.Uri.parse(strOptString) : null;
            long j = java.lang.Long.parseLong(jSONObject.getString("expirationTime"));
            java.util.HashSet hashSet = new java.util.HashSet();
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                hashSet.add(new com.google.android.gms.common.api.Scope(1, jSONArray.getString(i)));
            }
            java.lang.String strOptString2 = jSONObject.optString("id");
            java.lang.String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
            java.lang.String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
            java.lang.String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
            java.lang.String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
            java.lang.String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
            java.lang.Long lValueOf = java.lang.Long.valueOf(j);
            java.lang.String string = jSONObject.getString("obfuscatedIdentifier");
            lValueOf.getClass();
            aais.ap(string);
            com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = new com.google.android.gms.auth.api.signin.GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new java.util.ArrayList(hashSet), strOptString6, strOptString7);
            googleSignInAccount.f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
            return googleSignInAccount;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions b() {
        java.lang.String strD;
        java.lang.String strD2 = d("defaultGoogleSignInAccount");
        if (android.text.TextUtils.isEmpty(strD2) || (strD = d(e("googleSignInOptions", strD2))) == null) {
            return null;
        }
        try {
            com.google.android.gms.common.api.Scope scope = com.google.android.gms.auth.api.signin.GoogleSignInOptions.a;
            if (android.text.TextUtils.isEmpty(strD)) {
                return null;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(strD);
            java.util.HashSet hashSet = new java.util.HashSet();
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("scopes");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                hashSet.add(new com.google.android.gms.common.api.Scope(1, jSONArray.getString(i)));
            }
            java.lang.String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
            return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(3, new java.util.ArrayList(hashSet), !android.text.TextUtils.isEmpty(strOptString) ? new android.accounts.Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new java.util.HashMap(), null);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public final java.lang.String d(java.lang.String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    public final java.lang.String e(java.lang.String str, java.lang.String str2) {
        return str + ':' + str2;
    }

    protected final void f(java.lang.String str, java.lang.String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }
}
