package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class akfs {
    public final java.lang.String a;
    public final java.lang.Integer b;

    public akfs(java.lang.String str, java.lang.Integer num) {
        this.a = str;
        this.b = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.akfs) {
            defpackage.akfs akfsVar = (defpackage.akfs) obj;
            if (this.a.equals(akfsVar.a)) {
                java.lang.Integer num = this.b;
                if (num == null) {
                    if (akfsVar.b == null) {
                        return true;
                    }
                } else if (num.equals(akfsVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.Integer num = this.b;
        return (iHashCode * 1000003) ^ (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        return "PhoneContext{rawContext=" + this.a + ", countryCode=" + this.b + '}';
    }

    public akfs() {
        throw null;
    }
}
