package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ywp implements defpackage.ywr {
    public final int a;

    public ywp(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ywp) && this.a == ((defpackage.ywp) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NotMet(reason=");
        switch (this.a) {
            case 1:
                str = "EMERGENCY_CALL_OR_CALLBACK";
                break;
            case 2:
                str = "VIDEO_CALL";
                break;
            case 3:
                str = "CONFERENCE_CALL";
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                str = "RTT_CALL";
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                str = "CALL_TO_OR_FROM_CONTACT";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                str = "GLOBAL_SHARPIE_SETTING_DISABLED";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                str = "INVALID_CALL_STATE";
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                str = "INCOMING_STIR_SHAKEN_VERIFIED_CALL_WITH_NON_SPAM_SCOOBY_VERDICT";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                str = "VOICEMAIL_NUMBER";
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                str = "OUTGOING_CALL";
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                str = "BUSINESS_CALL";
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                str = "PREVIOUSLY_CONNECTED_CALL";
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                str = "SIM_COUNTRY_NOT_SUPPORTED";
                break;
            default:
                str = "DISABLED_BY_CALL_INFO_LOOKUP_API";
                break;
        }
        sb.append((java.lang.Object) str);
        sb.append(')');
        return sb.toString();
    }
}
