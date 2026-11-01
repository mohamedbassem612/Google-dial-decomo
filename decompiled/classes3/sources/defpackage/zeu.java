package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zeu {
    public final java.lang.String a;
    public final defpackage.zeh b;
    public final long c;

    public zeu(java.lang.String str, defpackage.zeh zehVar, long j) {
        aooh.f(str, "e164PhoneNumber");
        aooh.f(zehVar, "contactStatus");
        this.a = str;
        this.b = zehVar;
        this.c = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zeu) {
            defpackage.zeu zeuVar = (defpackage.zeu) obj;
            if (aooh.n(this.a, zeuVar.a) && this.b == zeuVar.b && this.c == zeuVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.M(this.c);
    }

    public final java.lang.String toString() {
        return "DialerContactStatusEntity(e164PhoneNumber=" + this.a + ", contactStatus=" + this.b + ", timestampMillis=" + this.c + ')';
    }
}
