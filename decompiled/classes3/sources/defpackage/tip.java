package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tip {
    public final java.lang.String a;
    private final java.lang.String b;

    public tip(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null nfkd");
        }
        this.b = str;
        this.a = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tip) {
            defpackage.tip tipVar = (defpackage.tip) obj;
            if (this.b.equals(tipVar.b) && this.a.equals(tipVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "NormalizedString{nfkd=" + this.b + ", nfkdWithStrippedDiacriticals=" + this.a + '}';
    }

    public tip() {
        throw null;
    }
}
