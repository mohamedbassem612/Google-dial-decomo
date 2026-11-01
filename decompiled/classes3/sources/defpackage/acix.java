package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acix {
    public final defpackage.amml a;
    public final defpackage.amml b;
    public final defpackage.amml c;

    public acix(defpackage.amml ammlVar, defpackage.amml ammlVar2, defpackage.amml ammlVar3) {
        aooh.f(ammlVar, "backgroundColor");
        aooh.f(ammlVar2, "titleColor");
        aooh.f(ammlVar3, "bodyColor");
        this.a = ammlVar;
        this.b = ammlVar2;
        this.c = ammlVar3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.acix) {
            defpackage.acix acixVar = (defpackage.acix) obj;
            if (aooh.n(this.a, acixVar.a) && aooh.n(this.b, acixVar.b) && aooh.n(this.c, acixVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "PromotionDataColors(backgroundColor=" + this.a + ", titleColor=" + this.b + ", bodyColor=" + this.c + ')';
    }
}
