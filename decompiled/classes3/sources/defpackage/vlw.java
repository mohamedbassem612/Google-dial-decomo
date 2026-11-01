package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vlw {
    public final java.lang.String a;
    public final java.lang.String b;

    public vlw(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null contentType");
        }
        this.a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null contentUrl");
        }
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vlw) {
            defpackage.vlw vlwVar = (defpackage.vlw) obj;
            if (this.a.equals(vlwVar.a) && this.b.equals(vlwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "PayloadPart{contentType=" + this.a + ", contentUrl=" + this.b + '}';
    }

    public vlw() {
        throw null;
    }
}
