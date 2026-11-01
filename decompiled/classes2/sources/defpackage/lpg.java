package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lpg {
    public final java.lang.String a;
    public final java.lang.String b;

    public lpg(java.lang.String str, java.lang.String str2) {
        aooh.f(str, "contactName");
        aooh.f(str2, "lookUpKey");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lpg) {
            defpackage.lpg lpgVar = (defpackage.lpg) obj;
            if (aooh.n(this.a, lpgVar.a) && aooh.n(this.b, lpgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "DialerMonogramUiData(contactName=" + this.a + ", lookUpKey=" + this.b + ')';
    }
}
