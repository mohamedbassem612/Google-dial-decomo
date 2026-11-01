package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abnz {
    public final defpackage.dkz a;
    private final defpackage.cer b;
    private final defpackage.dkz c;
    private final defpackage.dkz d;
    private final defpackage.dkz e;
    private final defpackage.dkz f;
    private final defpackage.dkz g;
    private final defpackage.bwo h;

    public abnz(defpackage.cer cerVar, defpackage.dkz dkzVar, defpackage.dkz dkzVar2, defpackage.dkz dkzVar3, defpackage.dkz dkzVar4, defpackage.dkz dkzVar5, defpackage.dkz dkzVar6, defpackage.bwo bwoVar) {
        if (bwoVar == null) {
            defpackage.aooh.i("baseTypography");
        }
        this.b = cerVar;
        this.c = dkzVar;
        this.d = dkzVar2;
        this.e = dkzVar3;
        this.f = dkzVar4;
        this.a = dkzVar5;
        this.g = dkzVar6;
        this.h = bwoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abnz) {
            defpackage.abnz abnzVar = (defpackage.abnz) obj;
            if (defpackage.aooh.n(this.b, abnzVar.b) && defpackage.aooh.n(this.c, abnzVar.c) && defpackage.aooh.n(this.d, abnzVar.d) && defpackage.aooh.n(this.e, abnzVar.e) && defpackage.aooh.n(this.f, abnzVar.f) && defpackage.aooh.n(this.a, abnzVar.a) && defpackage.aooh.n(this.g, abnzVar.g) && defpackage.aooh.n(this.h, abnzVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.a.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final java.lang.String toString() {
        return "AbcTypography(scalableFontFactor=" + this.b + ", bodyBold=" + this.c + ", bodyExtraLarge=" + this.d + ", bodyMediumItalic=" + this.e + ", labelExtraSmall=" + this.f + ", titleMediumLarge=" + this.a + ", titleSmallCondensed=" + this.g + ", baseTypography=" + this.h + ')';
    }
}
