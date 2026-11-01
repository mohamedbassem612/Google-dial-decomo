package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agrs {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public agrs(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        aooh.f(str, "userId");
        aooh.f(str3, "type");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agrs) {
            defpackage.agrs agrsVar = (defpackage.agrs) obj;
            if (aooh.n(this.a, agrsVar.a) && aooh.n(this.b, agrsVar.b) && aooh.n(this.c, agrsVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "SelectedAccount(userId=" + this.a + ", displayId=" + this.b + ", type=" + this.c + ')';
    }
}
