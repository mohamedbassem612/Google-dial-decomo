package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tfw implements defpackage.tfz {
    public final defpackage.tfj a;
    public final boolean b;

    public tfw(defpackage.tfj tfjVar, boolean z) {
        this.a = tfjVar;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tfw) {
            defpackage.tfw tfwVar = (defpackage.tfw) obj;
            if (aooh.n(this.a, tfwVar.a) && this.b == tfwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "Carrier(actionContext=" + this.a + ", isWifi=" + this.b + ')';
    }
}
