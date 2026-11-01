package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class slo {
    public final defpackage.slp a;
    public final boolean b;
    public final aonj c;

    public slo(defpackage.slp slpVar, boolean z, aonj aonjVar) {
        aooh.f(slpVar, "fontColor");
        this.a = slpVar;
        this.b = z;
        this.c = aonjVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.slo) {
            defpackage.slo sloVar = (defpackage.slo) obj;
            if (aooh.n(this.a, sloVar.a) && this.b == sloVar.b && aooh.n(this.c, sloVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + anty.L(this.b)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "FontColorOptionUiData(fontColor=" + this.a + ", isSelected=" + this.b + ", onClick=" + this.c + ')';
    }
}
