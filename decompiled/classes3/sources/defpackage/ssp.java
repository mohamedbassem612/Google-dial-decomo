package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ssp {
    private final java.lang.String a;
    private final java.lang.String b;

    public ssp(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ssp) {
            defpackage.ssp sspVar = (defpackage.ssp) obj;
            java.lang.String str = this.a;
            if (str != null ? str.equals(sspVar.a) : sspVar.a == null) {
                java.lang.String str2 = this.b;
                if (str2 == null) {
                    if (sspVar.b == null) {
                        return true;
                    }
                } else if (str2.equals(sspVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ParsablePhoneNumber{numberToParse=" + this.a + ", defaultRegion=" + this.b + '}';
    }

    public ssp() {
        throw null;
    }
}
