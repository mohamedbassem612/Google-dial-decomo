package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rsi implements defpackage.rsl {
    public final defpackage.rsp a;
    public final defpackage.rrx b;
    public final defpackage.rsa c;
    public final pez d;

    public rsi(defpackage.rsp rspVar, pez pezVar, defpackage.rrx rrxVar, defpackage.rsa rsaVar) {
        this.a = rspVar;
        this.d = pezVar;
        this.b = rrxVar;
        this.c = rsaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rsi) {
            defpackage.rsi rsiVar = (defpackage.rsi) obj;
            if (aooh.n(this.a, rsiVar.a) && aooh.n(this.d, rsiVar.d) && aooh.n(this.b, rsiVar.b) && aooh.n(this.c, rsiVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        pez pezVar = this.d;
        return ((((iHashCode + ((defpackage.rsc) pezVar).a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "EmphasizedPromotionalMarqueeUiModel(title=" + this.a + ", image=" + this.d + ", body=" + this.b + ", actionButton=" + this.c + ')';
    }
}
