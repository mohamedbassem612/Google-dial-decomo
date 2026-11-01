package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajyz {
    public final java.lang.Object a;
    public final java.lang.Object b;
    private final java.lang.Object c;
    private final java.lang.Object d;
    private final java.lang.Object e;
    private final java.lang.Object f;

    public ajyz(defpackage.ajyx ajyxVar, defpackage.akcg akcgVar, defpackage.akaw akawVar, java.util.List list) {
        if (akcgVar == null) {
            defpackage.aooh.i("streamzWrapper");
        }
        if (list == null) {
            defpackage.aooh.i("debugInterceptors");
        }
        this.a = ajyxVar;
        this.c = akcgVar;
        this.d = akawVar;
        this.b = list;
        this.e = new j$.util.concurrent.ConcurrentHashMap();
        this.f = new j$.util.concurrent.ConcurrentHashMap();
    }

    public static final defpackage.aaum b(defpackage.aaum aaumVar) {
        return aaumVar.b(defpackage.ajvv.a, new aabm(3));
    }

    private final java.lang.String d() {
        try {
            return android.util.Base64.encodeToString(java.security.MessageDigest.getInstance("SHA-1").digest(((defpackage.ajtc) this.d).e().getBytes()), 11);
        } catch (java.security.NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [akaw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [akaw, java.lang.Object] */
    public final defpackage.anmc a(defpackage.ajzt ajztVar) {
        if (ajztVar == null) {
            defpackage.aooh.i("serviceConfig");
        }
        java.lang.String str = ajztVar.a().a;
        defpackage.aooh.e(str, "toString(...)");
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = (j$.util.concurrent.ConcurrentHashMap) this.e;
        defpackage.anmc anmcVar = (defpackage.anmc) concurrentHashMap.get(ajztVar);
        if (anmcVar != null) {
            return anmcVar;
        }
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (j$.util.concurrent.ConcurrentHashMap) this.f;
        defpackage.anmc anmcVarDs = (defpackage.anmc) concurrentHashMap2.get(str);
        int i = 8;
        if (anmcVarDs == null) {
            defpackage.aift aiftVar = new defpackage.aift(4);
            aiftVar.i(new defpackage.akbq(new defpackage.aeur(new defpackage.aeur(this, 7), i), defpackage.albh.class, defpackage.albh.class));
            defpackage.ajyx ajyxVar = (defpackage.ajyx) this.a;
            if (ajyxVar.g == null) {
                aiftVar.i(new akbc());
            } else if (this.d.g()) {
                aiftVar.i(new akbo(1, (byte[]) null));
                aiftVar.i(new defpackage.akbq(new defpackage.aeur(new defpackage.aenh(10), i), defpackage.albh.class, defpackage.albh.class));
            } else {
                aiftVar.i(new defpackage.ahsc(2));
                aiftVar.i(new defpackage.akbq(new defpackage.aeur(new defpackage.akcf(1), i), defpackage.albh.class, defpackage.albh.class));
            }
            if (this.d.l()) {
                aiftVar.i(new akbo(0));
            }
            aiftVar.i(new defpackage.ahsc(3));
            aiftVar.i(new defpackage.akbq(new defpackage.aeur(new defpackage.aeur(this, 5), i), defpackage.albh.class, defpackage.albh.class));
            defpackage.akbn akbnVar = new defpackage.akbn(str, ajyxVar, (defpackage.akcg) this.c);
            java.util.ArrayList arrayList = new java.util.ArrayList(aiftVar.g());
            java.util.Collections.reverse(arrayList);
            anmcVarDs = defpackage.ajsz.ds(akbnVar, arrayList);
            defpackage.anmc anmcVar2 = (defpackage.anmc) concurrentHashMap2.putIfAbsent(str, anmcVarDs);
            if (anmcVar2 != null) {
                anmcVarDs = anmcVar2;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(java.util.Arrays.asList(new defpackage.akbq(new defpackage.aeur(new defpackage.aeur(ajztVar, 6), i), defpackage.albh.class, defpackage.albh.class)));
        java.util.Collections.reverse(arrayList2);
        defpackage.anmc anmcVarDs2 = defpackage.ajsz.ds(anmcVarDs, arrayList2);
        defpackage.anmc anmcVar3 = (defpackage.anmc) concurrentHashMap.putIfAbsent(ajztVar, anmcVarDs2);
        return anmcVar3 != null ? anmcVar3 : anmcVarDs2;
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [ajwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [ajwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [ajwe, java.lang.Object] */
    public final defpackage.aaum c(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        int iB;
        bundle.putString("scope", "*");
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", ((defpackage.ajtc) this.d).c().b);
        defpackage.ajwa ajwaVar = (defpackage.ajwa) this.c;
        bundle.putString("gmsv", java.lang.Integer.toString(ajwaVar.a()));
        bundle.putString("osv", java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ajwaVar.b());
        bundle.putString("app_ver_name", ajwaVar.c());
        bundle.putString("firebase-app-name-hash", d());
        try {
            java.lang.String str3 = ((ajwm) defpackage.aazc.t(this.b.l())).a;
            if (android.text.TextUtils.isEmpty(str3)) {
                android.util.Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            android.util.Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fiid-21.1.1");
        defpackage.ajvt ajvtVar = (defpackage.ajvt) this.e.a();
        defpackage.ajyn ajynVar = (defpackage.ajyn) this.f.a();
        if (ajvtVar != null && ajynVar != null && (iB = ajvtVar.b()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", java.lang.Integer.toString(iB - 1));
            bundle.putString("Firebase-Client", ajynVar.a());
        }
        return ((defpackage.aabo) this.a).b(bundle);
    }

    public ajyz(defpackage.ajtc ajtcVar, defpackage.ajwa ajwaVar, defpackage.aabo aaboVar, defpackage.ajwe ajweVar, defpackage.ajwe ajweVar2, defpackage.ajwi ajwiVar) {
        this.d = ajtcVar;
        this.c = ajwaVar;
        this.a = aaboVar;
        this.f = ajweVar;
        this.e = ajweVar2;
        this.b = ajwiVar;
    }

    public ajyz() {
        throw null;
    }
}
