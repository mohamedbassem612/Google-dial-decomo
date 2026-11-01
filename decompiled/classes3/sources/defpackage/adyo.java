package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class adyo {
    public final java.lang.String a;
    public final long b;
    public final java.lang.Long c;

    public adyo(java.lang.String str, long j, java.lang.Long l) {
        aooh.f(str, "token");
        this.a = str;
        this.b = j;
        this.c = l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.adyo) {
            defpackage.adyo adyoVar = (defpackage.adyo) obj;
            if (aooh.n(this.a, adyoVar.a) && this.b == adyoVar.b && aooh.n(this.c, adyoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.Long l = this.c;
        return ((iHashCode + anty.M(this.b)) * 31) + (l == null ? 0 : l.hashCode());
    }

    public final java.lang.String toString() {
        return "AuthToken(token=" + this.a + ", authTimeMillis=" + this.b + ", expirationTimeSecs=" + this.c + ')';
    }
}
