package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agzp {
    public final defpackage.agza a;
    public final defpackage.agzu b;

    public agzp(defpackage.agza agzaVar, defpackage.agzu agzuVar) {
        if (agzaVar == null) {
            throw new java.lang.NullPointerException("Null callbacks");
        }
        this.a = agzaVar;
        this.b = agzuVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agzp) {
            defpackage.agzp agzpVar = (defpackage.agzp) obj;
            if (this.a.equals(agzpVar.a) && this.b.equals(agzpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.agzu agzuVar = this.b;
        return "CallbackResult{callbacks=" + this.a.toString() + ", result=" + agzuVar.toString() + '}';
    }

    public agzp() {
        throw null;
    }
}
