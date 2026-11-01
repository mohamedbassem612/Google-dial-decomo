package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qki {
    private static final aimz a = aimz.i("com/android/dialer/incall/statusbarnotification/buttonintent/impl/NotificationButtonIntentProcessorImpl");
    private final zpm b;

    public qki(zpm zpmVar) {
        this.b = zpmVar;
    }

    public final ajcq a(android.content.Intent intent) {
        defpackage.qid qidVar;
        int intExtra = intent.getIntExtra("com.android.dialer.incall.statusbarnotification.buttonintentActionValue", 0);
        switch (intExtra) {
            case 0:
                qidVar = defpackage.qid.UNKNOWN;
                break;
            case 1:
                qidVar = defpackage.qid.ANSWER_AS_RTT;
                break;
            case 2:
                qidVar = defpackage.qid.DOBBY_ANSWER;
                break;
            case 3:
                qidVar = defpackage.qid.DOBBY_SCREEN_CALL;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                qidVar = defpackage.qid.DOBBY_HANG_UP;
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                qidVar = defpackage.qid.BEESLY_DECLINE;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                qidVar = defpackage.qid.BEESLY_ANSWER;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                qidVar = defpackage.qid.REVELIO_ANSWER;
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                qidVar = defpackage.qid.REVELIO_VIEW_TRANSCRIPT;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                qidVar = defpackage.qid.REVELIO_HANG_UP;
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                qidVar = defpackage.qid.SHARPIE_DISMISS;
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                qidVar = defpackage.qid.SHARPIE_SEE_WARNING;
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                qidVar = defpackage.qid.ACCEPT_VIDEO_UPGRADE;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                qidVar = defpackage.qid.DECLINE_VIDEO_UPGRADE;
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                qidVar = defpackage.qid.LEGACY_ACCEPT_VIDEO_UPGRADE;
                break;
            case 15:
                qidVar = defpackage.qid.LEGACY_DECLINE_VIDEO_UPGRADE;
                break;
            case 16:
                qidVar = defpackage.qid.GAMING_MODE_ANSWER;
                break;
            default:
                switch (intExtra) {
                    case 18:
                        qidVar = defpackage.qid.ANSWER;
                        break;
                    case 19:
                        qidVar = defpackage.qid.ANSWER_VIDEO;
                        break;
                    case 20:
                        qidVar = defpackage.qid.REJECT;
                        break;
                    case 21:
                        qidVar = defpackage.qid.DISCONNECT;
                        break;
                    case 22:
                        qidVar = defpackage.qid.CALL_SCREEN;
                        break;
                    case 23:
                        qidVar = defpackage.qid.CANCEL_ATLAS;
                        break;
                    case 24:
                        qidVar = defpackage.qid.SPEAKER_ON;
                        break;
                    case 25:
                        qidVar = defpackage.qid.SPEAKER_OFF;
                        break;
                    case 26:
                        qidVar = defpackage.qid.UNHOLD;
                        break;
                    case 27:
                        qidVar = defpackage.qid.MUTE;
                        break;
                    case 28:
                        qidVar = defpackage.qid.UNMUTE;
                        break;
                    case 29:
                        qidVar = defpackage.qid.HEDWIG_FOLLOW_ALONG;
                        break;
                    case 30:
                        qidVar = defpackage.qid.DOBBY_SCREEN_CALL_ANDROID_AUTO;
                        break;
                    default:
                        switch (intExtra) {
                            case 99999:
                                qidVar = defpackage.qid.TEST_HIGHEST_PRIORITY;
                                break;
                            case 100000:
                                qidVar = defpackage.qid.TEST_HIGH_PRIORITY;
                                break;
                            case 100001:
                                qidVar = defpackage.qid.TEST_LOW_PRIORITY;
                                break;
                            case 100002:
                                qidVar = defpackage.qid.TEST_LOWEST_PRIORITY;
                                break;
                            default:
                                qidVar = null;
                                break;
                        }
                        break;
                }
                break;
        }
        if (qidVar == null || qidVar == defpackage.qid.UNKNOWN) {
            a.bI(a.c().m(aioa.b), "intent does not contain valid action", "com/android/dialer/incall/statusbarnotification/buttonintent/impl/NotificationButtonIntentProcessorImpl", "process", ',', "NotificationButtonIntentProcessorImpl.java", zct.b);
            return aiql.z(java.lang.Boolean.FALSE);
        }
        if (!intent.hasExtra("com.android.dialer.incall.statusbarnotification.buttonintentCallId")) {
            a.bI(a.c().m(aioa.b), "intent does not contain call ID extra", "com/android/dialer/incall/statusbarnotification/buttonintent/impl/NotificationButtonIntentProcessorImpl", "process", '5', "NotificationButtonIntentProcessorImpl.java", zct.b);
            return aiql.z(java.lang.Boolean.FALSE);
        }
        defpackage.apqr apqrVar = (defpackage.apqr) this.b.e(intent.getStringExtra("com.android.dialer.incall.statusbarnotification.buttonintentCallId")).orElse((java.lang.Object) null);
        if (apqrVar == null) {
            a.bI(a.c().m(aioa.b), "call scope for the intent's call ID is not present", "com/android/dialer/incall/statusbarnotification/buttonintent/impl/NotificationButtonIntentProcessorImpl", "process", '?', "NotificationButtonIntentProcessorImpl.java", zct.b);
            return aiql.z(java.lang.Boolean.FALSE);
        }
        defpackage.qko qkoVarAl = ((defpackage.qkh) apqrVar.a(defpackage.qkh.class)).al();
        defpackage.qko.a.b().l("com/android/dialer/incall/statusbarnotification/service/StatusBarNotificationController", "onActionButtonClicked", 119, "StatusBarNotificationController.java").y("Action button clicked: %s", qidVar.name());
        aoin aoinVar = (aoin) qkoVarAl.b.get(qidVar);
        if (aoinVar == null) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Click listener for %s not injected to CallScopeComponent", qidVar.name()));
        }
        ((defpackage.qia) aoinVar.a()).a();
        return aiql.z(java.lang.Boolean.TRUE);
    }
}
