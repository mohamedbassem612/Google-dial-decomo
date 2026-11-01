package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ivl {
    public final java.lang.String a;
    private final defpackage.ivm b;

    public ivl(defpackage.ivm ivmVar, java.lang.String str) {
        aooh.f(ivmVar, "disclaimerType");
        this.b = ivmVar;
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ivl) {
            defpackage.ivl ivlVar = (defpackage.ivl) obj;
            if (this.b == ivlVar.b && aooh.n(this.a, ivlVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        java.lang.String str = this.a;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "DisclaimerText(disclaimerType=" + this.b + ", text=" + this.a + ')';
    }
}
