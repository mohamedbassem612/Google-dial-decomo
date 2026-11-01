package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pby {
    public final int a;
    public final java.lang.Integer b;

    public pby(int i, java.lang.Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pby) {
            defpackage.pby pbyVar = (defpackage.pby) obj;
            if (this.a == pbyVar.a && aooh.n(this.b, pbyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer num = this.b;
        return (this.a * 31) + (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        return "LegalDisclaimerRowUiData(textRes=" + this.a + ", iconRes=" + this.b + ')';
    }
}
