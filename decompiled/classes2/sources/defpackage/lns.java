package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lns {
    public final java.lang.String a;
    public final java.lang.String b;
    public final long c;
    public final android.net.Uri d;
    public final android.net.Uri e;
    public final long f;
    public final boolean g;

    public lns(java.lang.String str, java.lang.String str2, long j, android.net.Uri uri, android.net.Uri uri2, long j2, boolean z) {
        aooh.f(str2, "name");
        aooh.f(uri, "contactUri");
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = uri;
        this.e = uri2;
        this.f = j2;
        this.g = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lns) {
            defpackage.lns lnsVar = (defpackage.lns) obj;
            if (aooh.n(this.a, lnsVar.a) && aooh.n(this.b, lnsVar.b) && this.c == lnsVar.c && aooh.n(this.d, lnsVar.d) && aooh.n(this.e, lnsVar.e) && this.f == lnsVar.f && this.g == lnsVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.M(this.c)) * 31) + this.d.hashCode();
        android.net.Uri uri = this.e;
        return (((((iHashCode * 31) + (uri == null ? 0 : uri.hashCode())) * 31) + anty.M(this.f)) * 31) + anty.L(this.g);
    }

    public final java.lang.String toString() {
        return "ContactsEntry(header=" + this.a + ", name=" + this.b + ", contactId=" + this.c + ", contactUri=" + this.d + ", photoUri=" + this.e + ", photoId=" + this.f + ", showHeader=" + this.g + ')';
    }
}
