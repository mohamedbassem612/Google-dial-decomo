package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class snu {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.Long c;
    private final java.lang.String d;

    public snu(java.lang.String str, java.lang.String str2, java.lang.Long l, java.lang.String str3) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.snu) {
            defpackage.snu snuVar = (defpackage.snu) obj;
            if (aooh.n(this.a, snuVar.a) && aooh.n(this.b, snuVar.b) && aooh.n(this.c, snuVar.c) && aooh.n(this.d, snuVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode * 31;
        java.lang.Long l = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (l == null ? 0 : l.hashCode())) * 31;
        java.lang.String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "RecentCallEntry(phoneNumber=" + this.a + ", cachedE164Number=" + this.b + ", lastCallTimeMillis=" + this.c + ", country=" + this.d + ')';
    }
}
