package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rxc {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public rxc(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rxc) {
            defpackage.rxc rxcVar = (defpackage.rxc) obj;
            java.lang.String str = this.a;
            if (str != null ? str.equals(rxcVar.a) : rxcVar.a == null) {
                java.lang.String str2 = this.b;
                if (str2 != null ? str2.equals(rxcVar.b) : rxcVar.b == null) {
                    java.lang.String str3 = this.c;
                    if (str3 == null) {
                        if (rxcVar.c == null) {
                            return true;
                        }
                    } else if (str3.equals(rxcVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode ^ 1000003;
        java.lang.String str3 = this.c;
        return (((i * 1000003) ^ iHashCode2) * 1000003) ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CequintCallerIdContact{name=" + this.a + ", geolocation=" + this.b + ", photoUri=" + this.c + '}';
    }

    public rxc() {
        throw null;
    }
}
