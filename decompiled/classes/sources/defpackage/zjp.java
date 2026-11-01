package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zjp {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/dialershared/externals/androidapis/telecom/CachedTelecomManager");
    public final android.telecom.TelecomManager b;
    public final android.content.Context c;
    public final defpackage.ahpz d;
    public final defpackage.aoin e;
    public final defpackage.aoin f;
    public final defpackage.zjm g;
    public final j$.util.concurrent.ConcurrentHashMap h;
    private final defpackage.aoir i;

    public zjp(android.telecom.TelecomManager telecomManager, android.content.Context context, defpackage.ahpz ahpzVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        if (telecomManager == null) {
            defpackage.aooh.i("telecomManager");
        }
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (ahpzVar == null) {
            defpackage.aooh.i("traceCreation");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("enableCacheInvalidationOnPhoneAccountRegistered");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableCachingTelecomGetPhoneAccountV2");
        }
        this.b = telecomManager;
        this.c = context;
        this.d = ahpzVar;
        this.e = aoinVar;
        this.f = aoinVar2;
        this.g = new defpackage.zjm(new defpackage.uob(this, 11));
        this.h = new j$.util.concurrent.ConcurrentHashMap();
        this.i = new defpackage.aoiy(new defpackage.uob(this, 12));
    }

    public final java.lang.String a() {
        c();
        defpackage.zjm zjmVar = this.g;
        java.lang.String str = (java.lang.String) zjmVar.a();
        if (str == null) {
            ((defpackage.aimw) a.b().l("com/google/android/dialershared/externals/androidapis/telecom/CachedTelecomManager", "getDefaultDialerPackage", 57, "CachedTelecomManager.kt")).v("defaultDialerPackage from cache is null. Invalidating the cache.");
            zjmVar.b();
        }
        return str;
    }

    public final void b() {
        this.h.clear();
    }

    public final void c() {
        this.i.a();
    }
}
