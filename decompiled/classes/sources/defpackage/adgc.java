package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adgc {
    public final defpackage.aify a;
    public final java.lang.String b;

    public adgc(defpackage.aify aifyVar, java.lang.String str) {
        this.a = aifyVar;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adgc) {
            defpackage.adgc adgcVar = (defpackage.adgc) obj;
            defpackage.aify aifyVar = this.a;
            if (aifyVar != null ? defpackage.ahvr.aP(aifyVar, adgcVar.a) : adgcVar.a == null) {
                java.lang.String str = this.b;
                if (str == null) {
                    if (adgcVar.b == null) {
                        return true;
                    }
                } else if (str.equals(adgcVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.aify aifyVar = this.a;
        int iHashCode = aifyVar == null ? 0 : aifyVar.hashCode();
        java.lang.String str = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CustomValues{downloadUrls=" + java.lang.String.valueOf(this.a) + ", downloadPackingScheme=" + this.b + '}';
    }

    public adgc() {
        throw null;
    }
}
