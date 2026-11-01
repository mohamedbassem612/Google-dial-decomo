package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sib {
    public final long a;
    public final long b;
    public final android.net.Uri c;
    public final java.lang.String d;
    public final java.lang.String e;

    public sib(long j, long j2, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        this.a = j;
        this.b = j2;
        this.c = uri;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sib) {
            defpackage.sib sibVar = (defpackage.sib) obj;
            if (this.a == sibVar.a && this.b == sibVar.b && aooh.n(this.c, sibVar.c) && aooh.n(this.d, sibVar.d) && aooh.n(this.e, sibVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        android.net.Uri uri = this.c;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        long j = this.a;
        long j2 = this.b;
        java.lang.String str = this.d;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iM = (((anty.M(j) * 31) + anty.M(j2)) * 31) + iHashCode;
        java.lang.String str2 = this.e;
        return (((iM * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "PatrickContactData(rawContactId=" + this.a + ", patrickId=" + this.b + ", photoUri=" + this.c + ", displayName=" + this.d + ", lookupKey=" + this.e + ')';
    }
}
