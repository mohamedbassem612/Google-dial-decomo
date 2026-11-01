package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qxl {
    public final boolean a;
    public final aomy b;
    public final java.lang.String c;
    public final boolean d;

    public qxl(boolean z, aomy aomyVar, java.lang.String str, boolean z2) {
        this.a = z;
        this.b = aomyVar;
        this.c = str;
        this.d = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qxl) {
            defpackage.qxl qxlVar = (defpackage.qxl) obj;
            if (this.a == qxlVar.a && aooh.n(this.b, qxlVar.b) && aooh.n(this.c, qxlVar.c) && this.d == qxlVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iL = (anty.L(this.a) * 31) + this.b.hashCode();
        java.lang.String str = this.c;
        return (((iL * 31) + (str == null ? 0 : str.hashCode())) * 31) + anty.L(this.d);
    }

    public final java.lang.String toString() {
        return "EndCallUiData(enabled=" + this.a + ", onClick=" + this.b + ", contentDescription=" + this.c + ", isSmallSecondaryWindow=" + this.d + ')';
    }
}
