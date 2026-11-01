package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jlv {
    public final afqz a;
    public final int b;
    public final int c;
    public final defpackage.jmu d;
    public final int e;
    public final defpackage.jlp f;
    private final java.util.List g;

    public jlv(afqz afqzVar, int i, java.util.List list, int i2, defpackage.jmu jmuVar, int i3, defpackage.jlp jlpVar) {
        aooh.f(list, "scamSelectorResIds");
        this.a = afqzVar;
        this.b = i;
        this.g = list;
        this.c = i2;
        this.d = jmuVar;
        this.e = i3;
        this.f = jlpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jlv) {
            defpackage.jlv jlvVar = (defpackage.jlv) obj;
            if (aooh.n(this.a, jlvVar.a) && this.b == jlvVar.b && aooh.n(this.g, jlvVar.g) && this.c == jlvVar.c && this.d == jlvVar.d && this.e == jlvVar.e && aooh.n(this.f, jlvVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() * 31) + this.b) * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d.hashCode();
        defpackage.jlp jlpVar = this.f;
        return (((iHashCode * 31) + this.e) * 31) + (jlpVar == null ? 0 : jlpVar.hashCode());
    }

    public final java.lang.String toString() {
        return "CreateDialogMetadata(fragment=" + this.a + ", titleResId=" + this.b + ", scamSelectorResIds=" + this.g + ", progressIndicator=" + this.c + ", questionKey=" + this.d + ", questionIndex=" + this.e + ", uiState=" + this.f + ')';
    }
}
