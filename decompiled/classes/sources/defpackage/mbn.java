package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class mbn {
    public final defpackage.rmx a;
    public final defpackage.qbc b;

    public mbn(defpackage.rmx rmxVar, defpackage.qbc qbcVar) {
        this.a = rmxVar;
        this.b = qbcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mbn) {
            defpackage.mbn mbnVar = (defpackage.mbn) obj;
            if (this.a == mbnVar.a && this.b == mbnVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.qbc qbcVar = this.b;
        return iHashCode + (qbcVar == null ? 0 : qbcVar.hashCode());
    }

    public final java.lang.String toString() {
        return "CuiImpressionTarget(dialerImpression=" + this.a + ", inCallImpression=" + this.b + ')';
    }
}
