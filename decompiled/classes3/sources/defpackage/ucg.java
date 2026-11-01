package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ucg {
    public final int a;
    public final java.lang.String b;
    public final aomy c;
    private final defpackage.uab d;

    public ucg(defpackage.uab uabVar, int i, java.lang.String str, aomy aomyVar) {
        aooh.f(str, "contentDescription");
        aooh.f(aomyVar, "onClick");
        this.d = uabVar;
        this.a = i;
        this.b = str;
        this.c = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ucg) {
            defpackage.ucg ucgVar = (defpackage.ucg) obj;
            if (this.d == ucgVar.d && this.a == ucgVar.a && aooh.n(this.b, ucgVar.b) && aooh.n(this.c, ucgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.d.hashCode() * 31) + this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "SonicGridItemData(key=" + this.d + ", emojiDrawableId=" + this.a + ", contentDescription=" + this.b + ", onClick=" + this.c + ')';
    }
}
