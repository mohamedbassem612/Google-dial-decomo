package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rsh implements defpackage.rsl {
    public final defpackage.rsp a;
    public final defpackage.rry b;
    public final defpackage.rrx c;
    public final defpackage.rsa d;

    public rsh(defpackage.rsp rspVar, defpackage.rry rryVar, defpackage.rrx rrxVar, defpackage.rsa rsaVar) {
        this.a = rspVar;
        this.b = rryVar;
        this.c = rrxVar;
        this.d = rsaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rsh) {
            defpackage.rsh rshVar = (defpackage.rsh) obj;
            if (aooh.n(this.a, rshVar.a) && aooh.n(this.b, rshVar.b) && aooh.n(this.c, rshVar.c) && aooh.n(this.d, rshVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "EmphasizedInformationalMarqueeUiModel(title=" + this.a + ", icon=" + this.b + ", body=" + this.c + ", actionButton=" + this.d + ')';
    }
}
