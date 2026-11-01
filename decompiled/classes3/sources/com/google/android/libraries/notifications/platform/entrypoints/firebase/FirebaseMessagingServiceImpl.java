package com.google.android.libraries.notifications.platform.entrypoints.firebase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FirebaseMessagingServiceImpl extends com.google.firebase.messaging.FirebaseMessagingService {
    private static final aiof g = aiof.i("GnpSdk");
    public aduu a;
    public aoin b;
    public aoin c;
    public aduj d;
    public aefv e;

    private final boolean j() {
        if (this.a != null && a().g) {
            return true;
        }
        aefv aefvVar = this.e;
        if (aefvVar == null) {
            aooh.j("phenotypeContextInit");
            aefvVar = null;
        }
        aefvVar.a(getApplicationContext());
        return anft.c();
    }

    public final aduu a() {
        aduu aduuVar = this.a;
        if (aduuVar != null) {
            return aduuVar;
        }
        aooh.j("gnpConfig");
        return null;
    }

    public final aoin b() {
        aoin aoinVar = this.b;
        if (aoinVar != null) {
            return aoinVar;
        }
        aooh.j("gnpFirebaseHandler");
        return null;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c() {
        if (j()) {
            defpackage.adwz adwzVar = (defpackage.adwz) b().a();
            android.content.Context applicationContext = getApplicationContext();
            aooh.e(applicationContext, "getApplicationContext(...)");
            adwzVar.a(applicationContext);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(com.google.firebase.messaging.RemoteMessage remoteMessage) {
        if (j()) {
            aduj adujVar = this.d;
            if (adujVar == null) {
                aooh.j("trace");
                adujVar = null;
            }
            ahpm ahpmVarA = adujVar.a("FirebaseMessagingServiceImpl");
            try {
                defpackage.adwz adwzVar = (defpackage.adwz) b().a();
                android.content.Context applicationContext = getApplicationContext();
                aooh.e(applicationContext, "getApplicationContext(...)");
                if (adwzVar.b(applicationContext, remoteMessage)) {
                    g.b().v("Message handled by GNP Firebase handler.");
                }
                ajsz.ak(ahpmVarA, (java.lang.Throwable) null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(ahpmVarA, th);
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void e(java.lang.String str) {
        aooh.f(str, "token");
        j();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        aoin aoinVar = (aoin) defpackage.adxj.a(getApplicationContext()).ha().get(com.google.android.libraries.notifications.platform.entrypoints.firebase.FirebaseMessagingServiceImpl.class);
        if (aoinVar == null) {
            g.d().v("Failed to inject dependencies.");
            return;
        }
        java.lang.Object objA = aoinVar.a();
        aooh.d(objA, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.internal.inject.Injector<com.google.android.libraries.notifications.platform.entrypoints.firebase.FirebaseMessagingServiceImpl>");
        ((defpackage.adze) objA).a(this);
        if (j()) {
            a();
            android.content.Context applicationContext = getApplicationContext();
            aoin aoinVar2 = this.c;
            if (aoinVar2 == null) {
                aooh.j("firebaseApi");
                aoinVar2 = null;
            }
            adyi.a(applicationContext, a());
        }
    }
}
