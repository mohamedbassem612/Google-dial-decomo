package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aciv {
    public final java.lang.String a;
    public final defpackage.amml b;
    public final defpackage.amml c;
    public final aomy d;

    public aciv(java.lang.String str, defpackage.amml ammlVar, defpackage.amml ammlVar2, aomy aomyVar) {
        aooh.f(str, "text");
        aooh.f(ammlVar, "lightThemeTextColor");
        aooh.f(ammlVar2, "darkThemeTextColor");
        this.a = str;
        this.b = ammlVar;
        this.c = ammlVar2;
        this.d = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aciv) {
            defpackage.aciv acivVar = (defpackage.aciv) obj;
            if (aooh.n(this.a, acivVar.a) && aooh.n(this.b, acivVar.b) && aooh.n(this.c, acivVar.c) && aooh.n(this.d, acivVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "PromotionAction(text=" + this.a + ", lightThemeTextColor=" + this.b + ", darkThemeTextColor=" + this.c + ", onClick=" + this.d + ')';
    }
}
