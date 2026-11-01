package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jhd {
    public final java.lang.String a;
    public final java.lang.String b;

    public jhd(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jhd) {
            defpackage.jhd jhdVar = (defpackage.jhd) obj;
            if (aooh.n(this.a, jhdVar.a) && aooh.n(this.b, jhdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "LocaleDetails(country=" + this.a + ", language=" + this.b + ')';
    }
}
