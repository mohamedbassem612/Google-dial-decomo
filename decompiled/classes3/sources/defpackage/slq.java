package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class slq {
    public final java.lang.Integer a;
    public final defpackage.sko b;
    public final boolean c;

    public slq(java.lang.Integer num, defpackage.sko skoVar, boolean z) {
        this.a = num;
        this.b = skoVar;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.slq) {
            defpackage.slq slqVar = (defpackage.slq) obj;
            if (aooh.n(this.a, slqVar.a) && aooh.n(this.b, slqVar.b) && this.c == slqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        defpackage.sko skoVar = this.b;
        return (((iHashCode * 31) + (skoVar != null ? skoVar.hashCode() : 0)) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "FontMenuUiData(selectedFontColorArgb=" + this.a + ", selectedFontStyle=" + this.b + ", isCustomTypographySelected=" + this.c + ')';
    }
}
