package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class krx {
    public final defpackage.ksj a;
    public final defpackage.ksn b;
    public final defpackage.krp c;
    public final defpackage.krd d;

    public krx(defpackage.ksj ksjVar, defpackage.ksn ksnVar, defpackage.krp krpVar, defpackage.krd krdVar) {
        this.a = ksjVar;
        this.b = ksnVar;
        this.c = krpVar;
        this.d = krdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.krx) {
            defpackage.krx krxVar = (defpackage.krx) obj;
            if (aooh.n(this.a, krxVar.a) && aooh.n(this.b, krxVar.b) && aooh.n(this.c, krxVar.c) && aooh.n(this.d, krxVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        defpackage.krp krpVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (krpVar == null ? 0 : krpVar.hashCode())) * 31;
        defpackage.krd krdVar = this.d;
        return iHashCode2 + (krdVar != null ? krdVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CallNotesUiModel(integrationResources=" + this.a + ", summaryUiState=" + this.b + ", callActionsUiState=" + this.c + ", audioPlayerUiState=" + this.d + ')';
    }
}
