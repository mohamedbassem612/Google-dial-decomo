package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zzl {
    public final int a;
    public final int b;

    public zzl(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static defpackage.zzl a(defpackage.akyi akyiVar, int i) {
        defpackage.akyj akyjVar = (defpackage.akyj) akyiVar;
        int i2 = akyjVar.e;
        j$.util.Optional optional = akyjVar.d;
        optional.isPresent();
        java.lang.String str = akyjVar.b;
        ((java.lang.Integer) optional.get()).intValue();
        return new defpackage.zzl(120559099, i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.zzl) {
            defpackage.zzl zzlVar = (defpackage.zzl) obj;
            if (this.a == zzlVar.a && this.b == zzlVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final java.lang.String toString() {
        return "ComplianceProductData{productId=" + this.a + ", productIdOrigin=" + java.lang.Integer.toString(this.b - 1) + '}';
    }

    public zzl() {
        throw null;
    }
}
