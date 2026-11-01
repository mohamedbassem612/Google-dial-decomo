package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rsa {
    public final aomy a;
    public final pez b;

    public rsa(pez pezVar, aomy aomyVar) {
        this.b = pezVar;
        this.a = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rsa) {
            defpackage.rsa rsaVar = (defpackage.rsa) obj;
            if (aooh.n(this.b, rsaVar.b) && aooh.n(this.a, rsaVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "MarqueeButtonData(marqueeText=" + this.b + ", onClick=" + this.a + ')';
    }
}
