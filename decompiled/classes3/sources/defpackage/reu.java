package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class reu {
    public final int a;
    public final int b;

    public reu(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.reu) {
            defpackage.reu reuVar = (defpackage.reu) obj;
            if (this.a == reuVar.a && this.b == reuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final java.lang.String toString() {
        return "PromoText{titleTextRes=" + this.a + ", bodyTextRes=" + this.b + '}';
    }

    public reu() {
        throw null;
    }
}
