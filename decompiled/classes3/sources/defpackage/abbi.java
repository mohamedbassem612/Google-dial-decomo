package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abbi {
    public final java.lang.String a;
    public final int b;

    public abbi(java.lang.String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abbi) {
            defpackage.abbi abbiVar = (defpackage.abbi) obj;
            if (aooh.n(this.a, abbiVar.a) && this.b == abbiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Verdict(pv=");
        sb.append(this.a);
        sb.append(", action=");
        switch (this.b) {
            case 1:
                str = "NONE";
                break;
            case 2:
                str = "WARN";
                break;
            case 3:
                str = "HIDE";
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                str = "UNKNOWN";
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                str = "NOT_AVAILABLE";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                str = "DELETE";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                str = "RETRY";
                break;
            default:
                str = "PAUSE_REQUESTS";
                break;
        }
        sb.append((java.lang.Object) str);
        sb.append(')');
        return sb.toString();
    }

    public abbi() {
        this("UNKNOWN", 4);
    }
}
