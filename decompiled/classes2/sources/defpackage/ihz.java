package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ihz {
    public final defpackage.ihy a;
    public final ifw b;

    public ihz(defpackage.ihy ihyVar, ifw ifwVar) {
        aooh.f(ifwVar, "appliedConfig");
        this.a = ihyVar;
        this.b = ifwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ihz) {
            defpackage.ihz ihzVar = (defpackage.ihz) obj;
            if (aooh.n(this.a, ihzVar.a) && aooh.n(this.b, ihzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "StateToRestore(audioStateBeforeApply=" + this.a + ", appliedConfig=" + this.b + ')';
    }
}
