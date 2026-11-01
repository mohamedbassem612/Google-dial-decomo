package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class syf implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ syf(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return java.lang.Integer.valueOf(((lgj) obj) == lgj.c ? 1 : 2);
            case 1:
                return null;
            case 2:
                return j$.util.Optional.of((java.lang.CharSequence) obj);
            case 3:
                return ((defpackage.qin) obj).a();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((lgj) obj) == lgj.c ? j$.util.Optional.of("phone_default") : j$.util.Optional.of("phone_incoming_call");
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((defpackage.qin) obj).c;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return j$.util.Optional.of((defpackage.qjd) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "evaluateCallerSpamStatusResult", 373, "RevelioController.java").y("callSentToUser: %b", (java.lang.Boolean) obj);
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                return java.lang.Boolean.valueOf(optional.isPresent() && ((defpackage.tan) optional.orElseThrow()).e);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "startScreeningTimeout", 343, "RevelioController.java").y("After screening timeout, attemptSendCallToUser returned: %b", bool);
                return bool;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                if (((j$.util.Optional) obj).isPresent()) {
                    return j$.util.Optional.of(defpackage.oue.REVELIO_SUMMARY);
                }
                defpackage.szu.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioProducerModule", "produceRevelioSummaryCenterFragmentCandidateKey", 110, "RevelioProducerModule.java").v("Revelio summary is not present.");
                return j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return (defpackage.tal) aooc.ar((hkl) obj, defpackage.tal.class);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return afsq.bU((java.lang.Boolean) obj);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                tbf tbfVar = (tbf) obj;
                boolean zA = defpackage.tbg.a(tbfVar);
                boolean z = ((tbfVar.b & 2) == 0 || tbfVar.d) ? false : true;
                boolean z2 = (zA || z) ? false : true;
                aimw aimwVarL = com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat.g.b().l("com/android/dialer/revelio/impl/tidepods/impl/settings/TidepodsCallerActionPreferenceCompat", "updateAudioStoragePreference", 196, "TidepodsCallerActionPreferenceCompat.java");
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z2);
                aimwVarL.M("enabling audio storage pref: %b, any caller type set to screening: %b, user has toggled audio setting: %b", boolValueOf, java.lang.Boolean.valueOf(zA), java.lang.Boolean.valueOf(z));
                return boolValueOf;
            case 15:
                return java.lang.Boolean.valueOf(((tbf) obj).d);
            case 16:
                defpackage.tbe tbeVarB = defpackage.tbe.b(((tbf) obj).e);
                return tbeVarB == null ? defpackage.tbe.NOT_SET_BY_USER : tbeVarB;
            case 17:
                defpackage.tbe tbeVarB2 = defpackage.tbe.b(((tbf) obj).f);
                return tbeVarB2 == null ? defpackage.tbe.NOT_SET_BY_USER : tbeVarB2;
            case 18:
                defpackage.tbe tbeVarB3 = defpackage.tbe.b(((tbf) obj).h);
                return tbeVarB3 == null ? defpackage.tbe.NOT_SET_BY_USER : tbeVarB3;
            case 19:
                defpackage.tbe tbeVarB4 = defpackage.tbe.b(((tbf) obj).g);
                return tbeVarB4 == null ? defpackage.tbe.NOT_SET_BY_USER : tbeVarB4;
            default:
                return java.lang.Boolean.valueOf(((tbf) obj).i);
        }
    }
}
