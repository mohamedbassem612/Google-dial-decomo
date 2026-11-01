package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uch {
    public final java.lang.String a;
    public final java.lang.String b;
    public final boolean c;
    public final aomy d;
    public final aomy e;
    public final java.util.List f;
    public final boolean g;
    public final boolean h;

    public uch(java.lang.String str, java.lang.String str2, boolean z, aomy aomyVar, aomy aomyVar2, java.util.List list, boolean z2, boolean z3) {
        aooh.f(str, "title");
        aooh.f(str2, "closeContentDescription");
        aooh.f(aomyVar, "onClose");
        aooh.f(aomyVar2, "onGridShown");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = aomyVar;
        this.e = aomyVar2;
        this.f = list;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.uch) {
            defpackage.uch uchVar = (defpackage.uch) obj;
            if (aooh.n(this.a, uchVar.a) && aooh.n(this.b, uchVar.b) && this.c == uchVar.c && aooh.n(this.d, uchVar.d) && aooh.n(this.e, uchVar.e) && aooh.n(this.f, uchVar.f) && this.g == uchVar.g && this.h == uchVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.L(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + anty.L(this.g)) * 31) + anty.L(this.h);
    }

    public final java.lang.String toString() {
        return "SonicGridUiData(title=" + this.a + ", closeContentDescription=" + this.b + ", enabled=" + this.c + ", onClose=" + this.d + ", onGridShown=" + this.e + ", gridItems=" + this.f + ", isDefaultValue=" + this.g + ", useTwoColumnLayout=" + this.h + ')';
    }
}
