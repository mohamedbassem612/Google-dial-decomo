package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajwz {
    public final boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public ajwz(android.content.Context context, java.lang.String str) {
        android.content.Context contextM = aa$.ExternalSyntheticApiModelOutline1.m(context);
        this.b = contextM;
        android.content.SharedPreferences sharedPreferences = contextM.getSharedPreferences("com.google.firebase.common.prefs:".concat(str), 0);
        this.c = sharedPreferences;
        boolean z = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                android.content.Context context2 = contextM;
                android.content.pm.PackageManager packageManager = contextM.getPackageManager();
                if (packageManager != null) {
                    android.content.Context context3 = contextM;
                    android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(contextM.getPackageName(), 128);
                    if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                        z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                    }
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        this.a = z;
    }

    public final synchronized boolean a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ajcu, java.lang.Object] */
    public final synchronized adrt b(int i, adrn adrnVar) {
        try {
            if (i == 0) {
                throw null;
            }
            adrnVar.m.isPresent();
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return new adsa(adrnVar, (defpackage.adrw) this.c, (defpackage.ajcu) this.b, defpackage.ahwr.a);
    }

    public final adrn c() {
        adrm adrmVar = new adrm();
        adrmVar.d(true);
        short s = adrmVar.j;
        adrmVar.e = 256000;
        adrmVar.j = (short) (s | 1664);
        defpackage.aify aifyVar = defpackage.aike.a;
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null audioEffects");
        }
        adrmVar.h = aifyVar;
        adrmVar.g = -1L;
        short s2 = adrmVar.j;
        adrmVar.c = 1;
        adrmVar.b = 250;
        adrmVar.j = (short) (s2 | 2073);
        adrmVar.c(8000);
        adrmVar.a = 16;
        adrmVar.j = (short) (adrmVar.j | 98);
        adrmVar.d = "en";
        adrmVar.f = j$.util.Optional.of(new defpackage.aesg());
        adrm adrmVar2 = new adrm(adrmVar.a());
        adrmVar2.d(this.a);
        return adrmVar2.a();
    }

    public ajwz(java.lang.Object obj, java.lang.Object obj2, boolean z) {
        this.c = obj;
        this.b = obj2;
        this.a = z;
    }
}
