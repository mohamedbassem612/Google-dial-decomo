package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajxk {
    public final /* synthetic */ com.google.firebase.messaging.FirebaseMessaging a;
    private final defpackage.ajvo b;
    private boolean c;
    private java.lang.Boolean d;
    private defpackage.apnt e;

    public ajxk(com.google.firebase.messaging.FirebaseMessaging firebaseMessaging, defpackage.ajvo ajvoVar) {
        j$.util.Objects.requireNonNull(firebaseMessaging);
        this.a = firebaseMessaging;
        this.b = ajvoVar;
    }

    final synchronized void a() {
        java.lang.Boolean boolValueOf;
        android.content.pm.ApplicationInfo applicationInfo;
        if (this.c) {
            return;
        }
        android.content.Context contextA = this.a.c.a();
        android.content.SharedPreferences sharedPreferences = contextA.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            boolValueOf = java.lang.Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        } else {
            try {
                android.content.pm.PackageManager packageManager = contextA.getPackageManager();
                boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) ? null : java.lang.Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        this.d = boolValueOf;
        if (boolValueOf == null) {
            defpackage.apnt apntVar = new defpackage.apnt(this);
            this.e = apntVar;
            this.b.b(defpackage.ajsz.class, apntVar);
        }
        this.c = true;
    }

    public final synchronized boolean b() {
        boolean zA;
        a();
        java.lang.Boolean bool = this.d;
        if (bool != null) {
            zA = bool.booleanValue();
        } else {
            defpackage.ajtc ajtcVar = this.a.c;
            ajtcVar.g();
            zA = ((defpackage.ajwz) ajtcVar.e.a()).a();
        }
        return zA;
    }
}
