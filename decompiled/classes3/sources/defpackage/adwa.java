package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adwa {
    public final defpackage.aksh a;
    public final int b;

    public adwa(defpackage.aksh akshVar, int i) {
        aooh.f(akshVar, "androidPayload");
        this.a = akshVar;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.adwa) {
            defpackage.adwa adwaVar = (defpackage.adwa) obj;
            if (aooh.n(this.a, adwaVar.a) && this.b == adwaVar.b) {
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExtractedPayloadData(androidPayload=");
        sb.append(this.a);
        sb.append(", pushPayloadType=");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "PLACEHOLDER" : "ENCRYPTED";
        } else {
            str = "CLEARTEXT";
        }
        sb.append((java.lang.Object) str);
        sb.append(')');
        return sb.toString();
    }
}
