package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class maf {
    public final defpackage.kip a;
    public final java.lang.String b;
    public final abwd c;

    public maf(defpackage.kip kipVar, java.lang.String str, abwd abwdVar) {
        aooh.f(kipVar, "callDetails");
        this.a = kipVar;
        this.b = str;
        this.c = abwdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.maf) {
            defpackage.maf mafVar = (defpackage.maf) obj;
            if (aooh.n(this.a, mafVar.a) && aooh.n(this.b, mafVar.b) && aooh.n(this.c, mafVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        abwd abwdVar = this.c;
        return iHashCode2 + (abwdVar != null ? abwdVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CallDetailsRawData(callDetails=" + this.a + ", primaryText=" + this.b + ", photoInfo=" + this.c + ')';
    }
}
