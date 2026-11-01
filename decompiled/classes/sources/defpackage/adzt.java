package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adzt implements defpackage.adzq {
    private static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    private final android.content.Context b;
    private final defpackage.aduu c;

    public adzt(android.content.Context context, defpackage.aduu aduuVar, defpackage.agab agabVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (aduuVar == null) {
            defpackage.aooh.i("gnpConfig");
        }
        if (agabVar == null) {
            defpackage.aooh.i("firebaseApi");
        }
        this.b = context;
        this.c = aduuVar;
    }

    private final android.content.SharedPreferences d() {
        android.content.SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0);
        defpackage.aooh.e(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    private final com.google.firebase.iid.FirebaseInstanceId e() {
        com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId = com.google.firebase.iid.FirebaseInstanceId.getInstance(defpackage.adyi.a(this.b, this.c));
        defpackage.aooh.e(firebaseInstanceId, "getFirebaseInstanceId(...)");
        return firebaseInstanceId;
    }

    private final synchronized void f(java.lang.String str) {
        android.content.SharedPreferences.Editor editorEdit = d().edit();
        defpackage.aooh.c(editorEdit);
        editorEdit.putString("reg_id", str);
        editorEdit.apply();
    }

    @Override // defpackage.adzq
    public final synchronized defpackage.adtz a() {
        adzs adzsVar;
        defpackage.afec.b();
        java.lang.String str = this.c.b;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Project ID must not be null when trying to reset registration token");
        }
        try {
            com.google.firebase.iid.FirebaseInstanceId firebaseInstanceIdE = e();
            com.google.firebase.iid.FirebaseInstanceId.d(firebaseInstanceIdE.b);
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                throw new java.io.IOException("MAIN_THREAD");
            }
            java.lang.String strB = firebaseInstanceIdE.b();
            defpackage.ajyz ajyzVar = firebaseInstanceIdE.e;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("delete", "1");
            firebaseInstanceIdE.a(defpackage.ajyz.b(ajyzVar.c(strB, str, bundle)));
            com.google.firebase.iid.FirebaseInstanceId.f.j(firebaseInstanceIdE.c(), str);
            f(null);
            try {
                c();
            } catch (defpackage.adzr e) {
                ((defpackage.aiob) ((defpackage.aiob) a.d()).k(e)).v("Exception thrown when trying to get token after deletion.");
                adzsVar = new adzs(e, defpackage.adty.aG, true);
                return adzsVar;
            }
        } catch (java.lang.Throwable th) {
            ((defpackage.aiob) ((defpackage.aiob) a.d()).k(th)).v("Exception thrown when trying to delete token.");
            adzsVar = new adzs(th, defpackage.adty.aF, false);
        }
        return new defpackage.adub(defpackage.aojh.a);
    }

    @Override // defpackage.adzq
    public final synchronized java.lang.String b() {
        return d().getString("reg_id", null);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.adzq
    public final synchronized java.lang.String c() {
        ?? r0;
        defpackage.afec.b();
        final java.lang.String str = this.c.b;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Project ID must not be null when trying to get registration token");
        }
        try {
            final com.google.firebase.iid.FirebaseInstanceId firebaseInstanceIdE = e();
            com.google.firebase.iid.FirebaseInstanceId.d(firebaseInstanceIdE.b);
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                throw new java.io.IOException("MAIN_THREAD");
            }
            r0 = ((defpackage.ajyk) firebaseInstanceIdE.a(defpackage.aazc.s(null).c(firebaseInstanceIdE.a, new defpackage.aaua() { // from class: ajvw
                public final /* synthetic */ java.lang.String c = "*";

                @Override // defpackage.aaua
                public final java.lang.Object a(defpackage.aaum aaumVar) {
                    com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId = firebaseInstanceIdE;
                    java.lang.String strB = firebaseInstanceId.b();
                    defpackage.aogc aogcVar = com.google.firebase.iid.FirebaseInstanceId.f;
                    java.lang.String strC = firebaseInstanceId.c();
                    java.lang.String str2 = str;
                    defpackage.ajwc ajwcVarK = aogcVar.k(strC, str2);
                    if (ajwcVarK != null) {
                        defpackage.ajwa ajwaVar = firebaseInstanceId.c;
                        long j = ajwcVarK.d;
                        java.lang.String strB2 = ajwaVar.b();
                        if (java.lang.System.currentTimeMillis() <= j + defpackage.ajwc.a && strB2.equals(ajwcVarK.c)) {
                            return defpackage.aazc.s(new defpackage.ajyk((java.lang.Object) ajwcVarK.b, (byte[]) null));
                        }
                    }
                    return firebaseInstanceId.g.e(str2, new ajvy(firebaseInstanceId, strB, str2, ajwcVarK));
                }
            }))).b;
            if (r0 == 0 || r0.length() == 0) {
                throw new defpackage.adzr();
            }
            if (!defpackage.aooh.n(r0, b())) {
                f((java.lang.String) r0);
            }
        } catch (java.lang.Throwable th) {
            ((defpackage.aiob) ((defpackage.aiob) a.d()).k(th)).v("Exception when trying to get token from Firebase.");
            throw new defpackage.adzr(th);
        }
        return (java.lang.String) r0;
    }
}
