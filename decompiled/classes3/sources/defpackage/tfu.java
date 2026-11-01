package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tfu implements defpackage.tfz {
    public final defpackage.tfj a;
    public final defpackage.abvz b;

    public tfu(defpackage.tfj tfjVar, defpackage.abvz abvzVar) {
        this.a = tfjVar;
        this.b = abvzVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tfu) {
            defpackage.tfu tfuVar = (defpackage.tfu) obj;
            if (aooh.n(this.a, tfuVar.a) && aooh.n(this.b, tfuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.abvz abvzVar = this.b;
        return iHashCode + (abvzVar == null ? 0 : abvzVar.hashCode());
    }

    public final java.lang.String toString() {
        return "RttCall(actionContext=" + this.a + ", calleeId=" + this.b + ')';
    }
}
