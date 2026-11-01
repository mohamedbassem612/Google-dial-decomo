package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lmx {
    public final defpackage.lnm a;
    public final defpackage.lnk b;

    public lmx(defpackage.lnm lnmVar, defpackage.lnk lnkVar) {
        aooh.f(lnmVar, "verdict");
        this.a = lnmVar;
        this.b = lnkVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lmx) {
            defpackage.lmx lmxVar = (defpackage.lmx) obj;
            if (this.a == lmxVar.a && aooh.n(this.b, lmxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.lnk lnkVar = this.b;
        return iHashCode + (lnkVar == null ? 0 : lnkVar.hashCode());
    }

    public final java.lang.String toString() {
        return "AudioBasedScreeningVerdictWithCause(verdict=" + this.a + ", featureCause=" + this.b + ')';
    }
}
