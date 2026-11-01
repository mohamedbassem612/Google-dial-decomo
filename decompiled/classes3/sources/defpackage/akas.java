package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akas {
    public final java.lang.String a;

    public akas(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null host");
        }
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.akas) && this.a.equals(((defpackage.akas) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 443) * 1000003) ^ 443;
    }

    public final java.lang.String toString() {
        return "QuicHint{host=" + this.a + ", port=443, alternatePort=443}";
    }

    public akas() {
        throw null;
    }
}
