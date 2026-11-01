package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hoe {
    public final defpackage.hol a;
    public final defpackage.hnh b;

    public hoe(defpackage.hol holVar, defpackage.hnh hnhVar) {
        this.a = holVar;
        this.b = hnhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hoe) {
            defpackage.hoe hoeVar = (defpackage.hoe) obj;
            if (aooh.n(this.a, hoeVar.a) && aooh.n(this.b, hoeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.hol holVar = this.a;
        int iHashCode = holVar == null ? 0 : holVar.hashCode();
        defpackage.hnh hnhVar = this.b;
        return (iHashCode * 31) + (hnhVar != null ? hnhVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CarInCallUiState(carVoiceModelData=" + this.a + ", backgroundCallData=" + this.b + ')';
    }
}
