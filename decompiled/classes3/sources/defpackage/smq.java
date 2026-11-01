package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class smq {
    public final defpackage.smm a;
    public final defpackage.smm b;

    public smq(defpackage.smm smmVar, defpackage.smm smmVar2) {
        this.a = smmVar;
        this.b = smmVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.smq) {
            defpackage.smq smqVar = (defpackage.smq) obj;
            if (aooh.n(this.a, smqVar.a) && aooh.n(this.b, smqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.smm smmVar = this.b;
        return iHashCode + (smmVar == null ? 0 : smmVar.hashCode());
    }

    public final java.lang.String toString() {
        return "TopBarUiData(back=" + this.a + ", confirm=" + this.b + ')';
    }
}
