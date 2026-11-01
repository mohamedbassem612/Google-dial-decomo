package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zfc {
    public final java.lang.String a;
    public final long b;

    public zfc(java.lang.String str, long j) {
        aooh.f(str, "e164PhoneNumber");
        this.a = str;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zfc) {
            defpackage.zfc zfcVar = (defpackage.zfc) obj;
            if (aooh.n(this.a, zfcVar.a) && this.b == zfcVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.M(this.b);
    }

    public final java.lang.String toString() {
        return "DialerHasRcsEntity(e164PhoneNumber=" + this.a + ", timestampMillis=" + this.b + ')';
    }
}
