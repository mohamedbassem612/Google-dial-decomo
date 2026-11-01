package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mac {
    public final defpackage.mae a;
    public final defpackage.mae b;
    public final defpackage.maa c;
    public final boolean d;

    public mac(defpackage.mae maeVar, defpackage.mae maeVar2, defpackage.maa maaVar, boolean z) {
        this.a = maeVar;
        this.b = maeVar2;
        this.c = maaVar;
        this.d = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mac) {
            defpackage.mac macVar = (defpackage.mac) obj;
            if (aooh.n(this.a, macVar.a) && aooh.n(this.b, macVar.b) && aooh.n(this.c, macVar.c) && this.d == macVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.mae maeVar = this.b;
        int iHashCode2 = (iHashCode + (maeVar == null ? 0 : maeVar.hashCode())) * 31;
        defpackage.maa maaVar = this.c;
        return ((iHashCode2 + (maaVar != null ? maaVar.hashCode() : 0)) * 31) + anty.L(this.d);
    }

    public final java.lang.String toString() {
        return "CallDetailsFeatureIntegrationData(text=" + this.a + ", secondaryText=" + this.b + ", icon=" + this.c + ", isClickable=" + this.d + ')';
    }
}
