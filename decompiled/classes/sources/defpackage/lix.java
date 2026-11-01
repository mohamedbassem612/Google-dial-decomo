package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class lix implements defpackage.ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ lix(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x021b  */
    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.String lowerCase;
        switch (this.$cid) {
            case 0:
                defpackage.aimz aimzVar = defpackage.ljb.a;
                j$.util.Optional optional = ((lhr) obj).a;
                return true == optional.isPresent() ? j$.util.Optional.ofNullable(((defpackage.akff) optional.get()).q) : optional;
            case 1:
                defpackage.akzm akzmVar = lil.a;
                return null;
            case 2:
                return null;
            case 3:
                return ((lhr) obj).a;
            case 4:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ljs.a.d()).i(defpackage.zct.b)).k((java.lang.Exception) obj)).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "cleanup", 222, "ForkedIncomingCallFlowManager.java")).v("Error while cancelling mute changes");
                return null;
            case 5:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) lju.a.c()).i(defpackage.zct.b)).k((java.io.IOException) obj)).l("com/android/dialer/callscreen/impl/storage/TranscriptSaver", "saveTranscriptWithFeedbackData", 138, "TranscriptSaver.java")).v("failed to save call screen session metrics");
                return j$.util.Optional.empty();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.valueOf(((defpackage.tcp) obj).equals(defpackage.tcp.ALWAYS_VISIBLE));
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.aimw) ((defpackage.aimw) mji.a.b()).l("com/android/dialer/dialpadview/controller/PreCallDialpadController", "checkMmiCode", 156, "PreCallDialpadController.java")).v("finish processing mmi code result");
                return ((ruh) obj).equals(ruh.c) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (((java.util.List) obj).contains(bool)) {
                    ((defpackage.aimw) ((defpackage.aimw) nwb.a.b()).l("com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveImpl", "isSubscriptionDsdaRegistration", 308, "DualSimDualActiveImpl.java")).v("One of subscriptions uses WLAN.");
                    return bool;
                }
                ((defpackage.aimw) ((defpackage.aimw) nwb.a.b()).l("com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveImpl", "isSubscriptionDsdaRegistration", 312, "DualSimDualActiveImpl.java")).v("None of subscriptions use WLAN.");
                return java.lang.Boolean.FALSE;
            case 9:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) nwb.a.d()).k((java.util.concurrent.TimeoutException) obj)).i(defpackage.zct.b)).l("com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveImpl", "isRegistrationStateRegistered", 351, "DualSimDualActiveImpl.java")).v("Timeout to get registration state");
                return java.lang.Boolean.FALSE;
            case 10:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) nwb.a.d()).k((java.util.concurrent.TimeoutException) obj)).i(defpackage.zct.b)).l("com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveImpl", "isTransportTypeIwlan", 387, "DualSimDualActiveImpl.java")).v("Timeout to get registration transport type");
                return java.lang.Boolean.FALSE;
            case 11:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((android.telephony.PhoneCapability) optionalOfNullable.get()).getMaxActiveVoiceSubscriptions() == 2));
                }
                return (java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE);
            case 12:
                defpackage.aimz aimzVar2 = defpackage.nyh.a;
                return null;
            case 13:
                defpackage.nwv nwvVarB = defpackage.nwv.b(((defpackage.nwy) obj).c);
                return nwvVarB == null ? defpackage.nwv.UNRECOGNIZED : nwvVarB;
            case 14:
                defpackage.aimz aimzVar3 = defpackage.nyh.a;
                return java.lang.Boolean.valueOf(((java.lang.Integer) obj).intValue() == 3);
            case 15:
                return java.lang.Boolean.valueOf(((defpackage.nwy) obj).e);
            case 16:
                defpackage.aimz aimzVar4 = nzg.a;
                return null;
            case 17:
                return java.lang.Long.valueOf(((nzk) obj).c);
            case 18:
                return new defpackage.gsf();
            case 19:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.nzh.a.c()).i(defpackage.zct.b)).k((java.lang.Exception) obj)).l("com/android/dialer/eligibilityexpansion/EligibilityExpansionDatabaseWorker", "startWork", 60, "EligibilityExpansionDatabaseWorker.java")).v("failed to complete work successfully");
                return new gse();
            default:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                java.util.regex.Pattern pattern = omi.a;
                if (optional2.isPresent()) {
                    java.util.regex.Matcher matcher = omi.a.matcher(((android.telecom.DisconnectCause) optional2.orElseThrow()).toString());
                    if (matcher.find()) {
                        lowerCase = matcher.group(1).toLowerCase(java.util.Locale.ROOT);
                    } else {
                        lowerCase = "";
                    }
                } else {
                    lowerCase = "";
                }
                otm otmVar = new otm((char[]) null);
                otmVar.a = "disconnect_cause";
                otmVar.f(lowerCase);
                return otmVar.e();
        }
    }
}
