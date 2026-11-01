package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class miz implements defpackage.mjb {
    public final java.util.List a;
    public final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.Long d;

    public miz(java.util.List list, java.lang.String str, java.lang.Long l, java.lang.String str2) {
        aooh.f(list, "buttonModels");
        this.a = list;
        this.c = str;
        this.d = l;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.miz) {
            defpackage.miz mizVar = (defpackage.miz) obj;
            if (aooh.n(this.a, mizVar.a) && aooh.n(this.c, mizVar.c) && aooh.n(this.d, mizVar.d) && aooh.n(this.b, mizVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.c;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31;
        java.lang.String str2 = this.b;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "PreCallDialpadModelKt(buttonModels=" + this.a + ", phoneNumber=" + this.c + ", refreshTimeInMillis=" + this.d + ", lastOutgoingCallNumber=" + this.b + ')';
    }
}
