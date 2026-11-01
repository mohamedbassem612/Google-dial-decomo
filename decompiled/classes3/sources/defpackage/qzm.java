package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qzm {
    public final java.lang.String a;
    public final aomy b;
    public final java.lang.String c;
    public final java.util.List d;
    public final boolean e;

    public qzm(java.lang.String str, aomy aomyVar, java.lang.String str2, java.util.List list, boolean z) {
        aooh.f(str, "titleLabel");
        aooh.f(aomyVar, "onClose");
        aooh.f(str2, "closeButtonDescription");
        this.a = str;
        this.b = aomyVar;
        this.c = str2;
        this.d = list;
        this.e = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qzm) {
            defpackage.qzm qzmVar = (defpackage.qzm) obj;
            if (aooh.n(this.a, qzmVar.a) && aooh.n(this.b, qzmVar.b) && aooh.n(this.c, qzmVar.c) && aooh.n(this.d, qzmVar.d) && this.e == qzmVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + anty.L(this.e);
    }

    public final java.lang.String toString() {
        return "MoreMenuUiData(titleLabel=" + this.a + ", onClose=" + this.b + ", closeButtonDescription=" + this.c + ", listItems=" + this.d + ", useTwoColumnLayout=" + this.e + ')';
    }
}
