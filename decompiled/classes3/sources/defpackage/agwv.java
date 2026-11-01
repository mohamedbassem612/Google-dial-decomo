package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agwv extends defpackage.agwm {
    public final java.lang.Object a;
    public final defpackage.agwx b;

    public agwv(java.lang.Object obj, defpackage.agwx agwxVar) {
        this.a = obj;
        this.b = agwxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agwv) {
            defpackage.agwv agwvVar = (defpackage.agwv) obj;
            if (aooh.n(this.a, agwvVar.a) && aooh.n(this.b, agwvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        defpackage.agwx agwxVar = this.b;
        return (iHashCode * 31) + (agwxVar != null ? agwxVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Rereading(staleResponse=" + this.a + ", cause=" + this.b + ')';
    }
}
