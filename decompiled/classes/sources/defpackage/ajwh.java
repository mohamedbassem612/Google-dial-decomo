package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajwh implements defpackage.ajwi {
    public static final java.lang.Object a = new java.lang.Object();
    public final defpackage.ajtc b;
    public final defpackage.ajwu c;
    public final defpackage.ajwr d;
    public final defpackage.ajwp e;
    private final defpackage.ajuc f;
    private final java.lang.Object g;
    private final java.util.concurrent.ExecutorService h;
    private final java.util.concurrent.Executor i;
    private java.lang.String j;
    private final java.util.Set k;
    private final java.util.List l;

    static {
        new defpackage.ajwg();
    }

    public ajwh(defpackage.ajtc ajtcVar, defpackage.ajwe ajweVar, java.util.concurrent.ExecutorService executorService, java.util.concurrent.Executor executor) {
        defpackage.ajwu ajwuVar = new defpackage.ajwu(ajtcVar.a(), ajweVar);
        defpackage.ajwr ajwrVar = new defpackage.ajwr(ajtcVar);
        defpackage.ajwp ajwpVarB = defpackage.ajwp.b();
        defpackage.ajuc ajucVar = new defpackage.ajuc(new defpackage.ajtu(ajtcVar, 2));
        int i = defpackage.ajwn.a;
        this.g = new java.lang.Object();
        this.k = new java.util.HashSet();
        this.l = new java.util.ArrayList();
        this.b = ajtcVar;
        this.c = ajwuVar;
        this.d = ajwrVar;
        this.e = ajwpVarB;
        this.f = ajucVar;
        this.h = executorService;
        this.i = executor;
    }

    private final synchronized java.lang.String n() {
        return this.j;
    }

    private final void o(defpackage.ajwo ajwoVar) {
        synchronized (this.g) {
            this.l.add(ajwoVar);
        }
    }

    private final void p() {
        defpackage.aais.aq(d(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        defpackage.aais.aq(e(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        defpackage.aais.aq(c(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        java.lang.String strD = d();
        long j = defpackage.ajwp.a;
        defpackage.aais.aj(strD.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        defpackage.aais.aj(defpackage.ajwp.b.matcher(c()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // defpackage.ajwi
    public final defpackage.aaum a() {
        p();
        java.lang.String strN = n();
        if (strN != null) {
            return defpackage.aazc.s(strN);
        }
        defpackage.zzx zzxVar = new defpackage.zzx((char[]) null);
        o(new defpackage.ajwl(zzxVar));
        java.lang.Object obj = zzxVar.a;
        this.h.execute(new defpackage.ahjn(this, 9));
        return (defpackage.aaum) obj;
    }

    public final ajwq b() {
        return (ajwq) this.f.a();
    }

    final java.lang.String c() {
        return this.b.c().a;
    }

    final java.lang.String d() {
        return this.b.c().b;
    }

    final java.lang.String e() {
        return this.b.c().d;
    }

    @Override // defpackage.ajwi
    public final void f() {
        this.d.b().delete();
    }

    public final void g(java.lang.Exception exc) {
        synchronized (this.g) {
            java.util.Iterator it = this.l.iterator();
            while (it.hasNext()) {
                if (((defpackage.ajwo) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void h(defpackage.ajwt ajwtVar) {
        synchronized (this.g) {
            java.util.Iterator it = this.l.iterator();
            while (it.hasNext()) {
                if (((defpackage.ajwo) it.next()).b(ajwtVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void i(java.lang.String str) {
        this.j = str;
    }

    public final synchronized void j(defpackage.ajwt ajwtVar, defpackage.ajwt ajwtVar2) {
        java.util.Set set = this.k;
        if (set.size() != 0 && !android.text.TextUtils.equals(ajwtVar.a, ajwtVar2.a)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                java.lang.Object obj = ((aprf) it.next()).a;
                if (((com.google.firebase.messaging.FirebaseMessaging) obj).a() != null) {
                    if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                        android.util.Log.d("FirebaseMessaging", "FID Change detected! Triggering re-sync");
                    }
                    ((com.google.firebase.messaging.FirebaseMessaging) obj).e();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0066 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, blocks: (B:5:0x000d, B:7:0x0019, B:9:0x0025, B:51:0x0077, B:52:0x007b, B:11:0x002b, B:13:0x0030, B:14:0x0036, B:35:0x0060, B:37:0x0066, B:48:0x0074, B:15:0x0037, B:19:0x0042, B:21:0x0044, B:22:0x0046, B:33:0x005e, B:40:0x006c, B:44:0x0070), top: B:68:0x000d, outer: #3, inners: #2 }] */
    public final void k() {
        defpackage.ajwt ajwtVarA;
        java.lang.String strA;
        java.lang.String string;
        synchronized (a) {
            defpackage.ajtc ajtcVar = this.b;
            defpackage.apni apniVarS = defpackage.apni.s(ajtcVar.a());
            try {
                ajwtVarA = this.d.a();
                if (ajwtVarA.c()) {
                    if ((ajtcVar.e().equals("CHIME_ANDROID_SDK") || ajtcVar.i()) && ajwtVarA.g == 1) {
                        ajwq ajwqVarB = b();
                        android.content.SharedPreferences sharedPreferences = ajwqVarB.b;
                        synchronized (sharedPreferences) {
                            try {
                                synchronized (sharedPreferences) {
                                    try {
                                        strA = null;
                                        string = sharedPreferences.getString("|S|id", null);
                                    } catch (java.lang.Throwable th) {
                                        throw th;
                                    }
                                }
                                if (android.text.TextUtils.isEmpty(string)) {
                                    string = defpackage.ajwn.a();
                                }
                            } catch (java.lang.Throwable th2) {
                                throw th2;
                            }
                        }
                        if (string == null) {
                            android.content.SharedPreferences sharedPreferences2 = ajwqVarB.b;
                            synchronized (sharedPreferences2) {
                                java.lang.String string2 = sharedPreferences2.getString("|S||P|", null);
                                if (string2 != null) {
                                    java.security.PublicKey publicKeyB = ajwqVarB.b(string2);
                                    if (publicKeyB != null) {
                                        strA = ajwq.a(publicKeyB);
                                    }
                                }
                            }
                            string = strA;
                        }
                        if (android.text.TextUtils.isEmpty(string)) {
                            string = defpackage.ajwn.a();
                        }
                    } else {
                        string = defpackage.ajwn.a();
                    }
                    defpackage.ajwr ajwrVar = this.d;
                    defpackage.ajws ajwsVar = new defpackage.ajws(ajwtVarA);
                    ajwsVar.a = string;
                    ajwsVar.c(3);
                    ajwtVarA = ajwsVar.a();
                    ajwrVar.c(ajwtVarA);
                }
                if (apniVarS != null) {
                    apniVarS.d();
                }
            } catch (java.lang.Throwable th3) {
                if (apniVarS != null) {
                    apniVarS.d();
                }
                throw th3;
            }
        }
        h(ajwtVarA);
        this.i.execute(new java.lang.Runnable() { // from class: ajwf
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.ajwt ajwtVarA2;
                java.lang.String string3;
                defpackage.ajwt ajwtVarA3;
                java.lang.Object obj = defpackage.ajwh.a;
                defpackage.ajwh ajwhVar = this.a;
                synchronized (obj) {
                    defpackage.apni apniVarS2 = defpackage.apni.s(ajwhVar.b.a());
                    try {
                        ajwtVarA2 = ajwhVar.d.a();
                        if (apniVarS2 != null) {
                            apniVarS2.d();
                        }
                    } catch (java.lang.Throwable th4) {
                        if (apniVarS2 != null) {
                            apniVarS2.d();
                        }
                        throw th4;
                    }
                }
                try {
                    if (ajwtVarA2.b() || ajwtVarA2.e()) {
                        java.lang.String str = ajwtVarA2.a;
                        if (str == null || str.length() != 11) {
                            string3 = null;
                            break;
                        }
                        ajwq ajwqVarB2 = ajwhVar.b();
                        android.content.SharedPreferences sharedPreferences3 = ajwqVarB2.b;
                        synchronized (sharedPreferences3) {
                            try {
                                java.lang.String[] strArr = ajwq.a;
                                int i = 0;
                                while (true) {
                                    if (i >= 4) {
                                        string3 = null;
                                        break;
                                    }
                                    java.lang.String str2 = strArr[i];
                                    string3 = sharedPreferences3.getString("|T|" + ajwqVarB2.c + '|' + str2, null);
                                    if (string3 != null && !string3.isEmpty()) {
                                        if (string3.startsWith("{")) {
                                            try {
                                                string3 = new org.json.JSONObject(string3).getString("token");
                                            } catch (org.json.JSONException unused) {
                                                string3 = null;
                                            }
                                        }
                                        break;
                                    }
                                    i++;
                                }
                            } catch (java.lang.Throwable th5) {
                                throw th5;
                            }
                        }
                        defpackage.ajwu ajwuVar = ajwhVar.c;
                        ajwhVar.c();
                        java.lang.String str3 = ajwtVarA2.a;
                        ajwhVar.e();
                        ajwhVar.d();
                        ajwv ajwvVarB = ajwuVar.b(str3, string3);
                        int i2 = ajwvVarB.d;
                        int i3 = i2 - 1;
                        if (i2 == 0) {
                            throw null;
                        }
                        if (i3 == 0) {
                            java.lang.String str4 = ajwvVarB.a;
                            java.lang.String str5 = ajwvVarB.b;
                            long jA = ajwhVar.e.a();
                            ajwy ajwyVar = ajwvVarB.c;
                            java.lang.String str6 = ajwyVar.a;
                            long j = ajwyVar.b;
                            defpackage.ajws ajwsVar2 = new defpackage.ajws(ajwtVarA2);
                            ajwsVar2.a = str4;
                            ajwsVar2.c(4);
                            ajwsVar2.b = str6;
                            ajwsVar2.c = str5;
                            ajwsVar2.b(j);
                            ajwsVar2.d(jA);
                            ajwtVarA3 = ajwsVar2.a();
                        } else {
                            if (i3 != 1) {
                                throw new defpackage.ajwj("Firebase Installations Service is unavailable. Please try again later.");
                            }
                            ajwtVarA3 = ajwtVarA2.f();
                        }
                    } else {
                        defpackage.ajwp ajwpVar = ajwhVar.e;
                        if (!ajwpVar.c(ajwtVarA2)) {
                            return;
                        }
                        defpackage.ajwu ajwuVar2 = ajwhVar.c;
                        ajwhVar.c();
                        java.lang.String str7 = ajwtVarA2.a;
                        ajwhVar.e();
                        ajwy ajwyVarC = ajwuVar2.c(str7, ajwtVarA2.c);
                        int i4 = ajwyVarC.c;
                        int i5 = i4 - 1;
                        if (i4 == 0) {
                            throw null;
                        }
                        if (i5 == 0) {
                            java.lang.String str8 = ajwyVarC.a;
                            long j2 = ajwyVarC.b;
                            long jA2 = ajwpVar.a();
                            defpackage.ajws ajwsVar3 = new defpackage.ajws(ajwtVarA2);
                            ajwsVar3.b = str8;
                            ajwsVar3.b(j2);
                            ajwsVar3.d(jA2);
                            ajwtVarA3 = ajwsVar3.a();
                        } else if (i5 == 1) {
                            ajwtVarA3 = ajwtVarA2.f();
                        } else {
                            if (i5 != 2) {
                                throw new defpackage.ajwj("Firebase Installations Service is unavailable. Please try again later.");
                            }
                            ajwhVar.i(null);
                            defpackage.ajws ajwsVar4 = new defpackage.ajws(ajwtVarA2);
                            ajwsVar4.c(2);
                            ajwtVarA3 = ajwsVar4.a();
                        }
                    }
                    synchronized (defpackage.ajwh.a) {
                        defpackage.apni apniVarS3 = defpackage.apni.s(ajwhVar.b.a());
                        try {
                            ajwhVar.d.c(ajwtVarA3);
                            if (apniVarS3 != null) {
                                apniVarS3.d();
                            }
                        } catch (java.lang.Throwable th6) {
                            if (apniVarS3 != null) {
                                apniVarS3.d();
                            }
                            throw th6;
                        }
                    }
                    ajwhVar.j(ajwtVarA2, ajwtVarA3);
                    if (ajwtVarA3.d()) {
                        ajwhVar.i(ajwtVarA3.a);
                    }
                    if (ajwtVarA3.b()) {
                        ajwhVar.g(new defpackage.ajwj());
                    } else if (ajwtVarA3.c()) {
                        ajwhVar.g(new java.io.IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                    } else {
                        ajwhVar.h(ajwtVarA3);
                    }
                } catch (defpackage.ajwj e) {
                    ajwhVar.g(e);
                }
            }
        });
    }

    @Override // defpackage.ajwi
    public final defpackage.aaum l() {
        p();
        defpackage.zzx zzxVar = new defpackage.zzx((char[]) null);
        o(new ajwk(this.e, zzxVar));
        java.lang.Object obj = zzxVar.a;
        this.h.execute(new ahts(this, 8));
        return (defpackage.aaum) obj;
    }

    @Override // defpackage.ajwi
    public final synchronized void m(aprf aprfVar) {
        this.k.add(aprfVar);
        j$.util.Objects.requireNonNull(this);
    }
}
