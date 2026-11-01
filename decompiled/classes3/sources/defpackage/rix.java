package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rix implements aauh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ rix(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, rio] */
    public final void a(java.lang.Exception exc) {
        com.google.android.gms.common.ConnectionResult connectionResult;
        switch (this.$cid) {
            case 0:
                rjb.a.b().k(exc).l("com/android/dialer/joyball/impl/consenttransfer/JoyballConsentStatusNotifier", "updateConsentValue$<anonymous>", 74, "JoyballConsentStatusNotifier.kt").y("Failed to update consent for %s", this.a.e());
                break;
            case 1:
                oac.a.c().k(exc).i(zct.b).l("com/android/dialer/emergencycalling/calllocation/service/EmergencyLocationUpdater", "requestLocationUpdates$<anonymous>$<anonymous>", 141, "EmergencyLocationUpdater.kt").v("onFailure");
                oac oacVar = (oac) this.a;
                oacVar.k.i((java.lang.String) null).a(mcd.ae);
                zjv.i(oacVar.f, mgv.eF, (java.util.List) null, (mhc) null, 0, 30);
                break;
            case 2:
                ((defpackage.aaks) this.a).l.s(3);
                break;
            case 3:
                ((defpackage.aaks) this.a).l.s(5);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((defpackage.aaks) this.a).l.s(5);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((defpackage.aaks) this.a).l.s(3);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                if ((exc instanceof aacw) && (connectionResult = ((aacw) exc).a.i) != null && connectionResult.c == 24) {
                    ((defpackage.aapp) this.a).c.set(android.os.SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int i = defpackage.abtj.a;
                android.util.Log.w("CBVerifier", java.lang.String.format("Fail to register phenotypeflags for %s. %s", this.a, exc));
                break;
            default:
                int i2 = defpackage.abtj.a;
                android.util.Log.w("CBVerifier", java.lang.String.format("Committing phenotypeflags for %s failed. %s", this.a, exc));
                break;
        }
    }
}
