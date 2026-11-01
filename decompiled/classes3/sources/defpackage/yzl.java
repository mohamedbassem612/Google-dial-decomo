package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yzl implements defpackage.yzp {
    public final int a;
    private final java.lang.String b;
    private final defpackage.yza c;

    public yzl(int i, java.lang.String str, defpackage.yza yzaVar) {
        aooh.f(str, "errorMessage");
        aooh.f(yzaVar, "record");
        this.a = i;
        this.b = str;
        this.c = yzaVar;
    }

    @Override // defpackage.yzp
    public final defpackage.yza a() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.yzl) {
            defpackage.yzl yzlVar = (defpackage.yzl) obj;
            if (this.a == yzlVar.a && aooh.n(this.b, yzlVar.b) && aooh.n(this.c, yzlVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.c.a;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(failureReason=");
        switch (this.a) {
            case 2:
                str = "ALREADY_QUERYING";
                break;
            case 3:
                str = "AICORE_FEATURE_UNAVAILABLE";
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                str = "AICORE_FEATURE_NOT_DOWNLOADED";
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                str = "SUMMARIZATION_SERVICE_UNAVAILABLE";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                str = "LLM_SERVICE_UNAVAILABLE";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                str = "FAILED_TO_PREPARE_INFERENCE_ENGINE";
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                str = "AICORE_UNKNOWN";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                str = "AICORE_BAD_INPUT";
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                str = "AICORE_INTERNAL_ERROR";
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                str = "AICORE_CANCELLED";
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                str = "AICORE_NOT_AVAILABLE";
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                str = "AICORE_BUSY";
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                str = "AICORE_SAFETY_ERROR";
                break;
            case 15:
                str = "AICORE_DEADLINE_EXCEEDED";
                break;
            case 16:
                str = "AICORE_UNAUTHENTICATED";
                break;
            case 17:
                str = "AICORE_QUOTA_EXCEEDED";
                break;
            case 18:
                str = "AICORE_SUSPENDED";
                break;
            case 19:
                str = "AICORE_IPC_ERROR";
                break;
            case 20:
                str = "AICORE_NOT_SUPPORTED";
                break;
            case 21:
                str = "AICORE_PERMISSION_DENIED";
                break;
            case 22:
                str = "AICORE_RESOURCE_EXHAUSTED";
                break;
            case 23:
                str = "AICORE_TURN_FINISHED";
                break;
            case 24:
                str = "AICORE_INTERNAL_ERROR_MODEL_LOAD_FAILED";
                break;
            case 25:
                str = "AICORE_BACKGROUND_USE_BLOCKED";
                break;
            default:
                str = "AICORE_OTHER";
                break;
        }
        sb.append((java.lang.Object) str);
        sb.append(", errorMessage=");
        sb.append(this.b);
        sb.append(", record=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
