package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nmx implements defpackage.nmz {
    public final java.lang.String a;
    public final int b;

    public nmx(java.lang.String str, int i) {
        aooh.f(str, "fallback");
        this.a = str;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nmx) {
            defpackage.nmx nmxVar = (defpackage.nmx) obj;
            if (aooh.n(this.a, nmxVar.a) && this.b == nmxVar.b) {
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FallbackSummary(fallback=");
        sb.append(this.a);
        sb.append(", fallbackReason=");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "NO_CALLER_RESPONSE" : "CALLER_HUNG_UP";
        } else {
            str = "UNKNOWN";
        }
        sb.append((java.lang.Object) str);
        sb.append(')');
        return sb.toString();
    }
}
