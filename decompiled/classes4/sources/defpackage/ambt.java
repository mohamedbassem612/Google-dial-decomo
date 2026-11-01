package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ambt {
    public final int a;
    public final int b;

    public ambt(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ambt) {
            defpackage.ambt ambtVar = (defpackage.ambt) obj;
            if (this.a == ambtVar.a && this.b == ambtVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final java.lang.String toString() {
        return "StartAndEndIndex{start=" + this.a + ", end=" + this.b + '}';
    }

    public ambt() {
        throw null;
    }
}
