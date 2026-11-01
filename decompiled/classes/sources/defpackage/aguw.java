package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aguw {
    public final defpackage.agux a;
    public final defpackage.ahyn b;

    public aguw(defpackage.agux aguxVar, defpackage.ahyn ahynVar) {
        if (aguxVar == null) {
            throw new java.lang.NullPointerException("Null repeatInterval");
        }
        this.a = aguxVar;
        this.b = ahynVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aguw) {
            defpackage.aguw aguwVar = (defpackage.aguw) obj;
            if (this.a.equals(aguwVar.a) && this.b.equals(aguwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        return "PeriodicWorkSpec{repeatInterval=" + this.a.toString() + ", flexInterval=Optional.absent()}";
    }

    public aguw() {
        throw null;
    }
}
