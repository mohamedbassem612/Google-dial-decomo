package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acwz {
    public final defpackage.ahyn a;
    public final defpackage.ahyn b;

    public acwz(defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2) {
        this.a = ahynVar;
        this.b = ahynVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acwz) {
            defpackage.acwz acwzVar = (defpackage.acwz) obj;
            if (this.a.equals(acwzVar.a) && this.b.equals(acwzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        defpackage.ahyn ahynVar = this.b;
        return "SchedulingParams{constraintOverridesMapOptional=" + java.lang.String.valueOf(this.a) + ", flexInterval=" + java.lang.String.valueOf(ahynVar) + '}';
    }

    public acwz() {
        throw null;
    }
}
