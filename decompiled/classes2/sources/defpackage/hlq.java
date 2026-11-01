package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hlq implements defpackage.hls {
    public final java.lang.String a;

    public hlq(java.lang.String str) {
        aooh.f(str, "rawPhoneNumber");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.hlq) && aooh.n(this.a, ((defpackage.hlq) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "RawPhoneNumber(rawPhoneNumber=" + this.a + ')';
    }
}
