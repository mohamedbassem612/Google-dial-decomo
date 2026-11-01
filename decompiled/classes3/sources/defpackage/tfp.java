package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tfp implements defpackage.tfz {
    public final defpackage.tfj a;
    public final java.lang.String b = "";

    public tfp(defpackage.tfj tfjVar) {
        this.a = tfjVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tfp) {
            defpackage.tfp tfpVar = (defpackage.tfp) obj;
            if (aooh.n(this.a, tfpVar.a) && aooh.n(this.b, tfpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AddContact(actionContext=" + this.a + ", nameToPreFill=" + this.b + ')';
    }
}
