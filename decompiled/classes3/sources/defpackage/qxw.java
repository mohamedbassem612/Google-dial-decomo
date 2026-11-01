package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qxw {
    public final defpackage.qxo a;
    public final defpackage.reo b;

    public qxw(defpackage.qxo qxoVar, defpackage.reo reoVar) {
        aooh.f(qxoVar, "categoryMenuUiModel");
        this.a = qxoVar;
        this.b = reoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qxw) {
            defpackage.qxw qxwVar = (defpackage.qxw) obj;
            if (aooh.n(this.a, qxwVar.a) && aooh.n(this.b, qxwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.reo reoVar = this.b;
        return iHashCode + (reoVar == null ? 0 : reoVar.hashCode());
    }

    public final java.lang.String toString() {
        return "CallAssistUiModel(categoryMenuUiModel=" + this.a + ", errorDialog=" + this.b + ')';
    }
}
