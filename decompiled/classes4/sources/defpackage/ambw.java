package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ambw {
    public final int a;
    public final int b;

    public ambw(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ambw) {
            defpackage.ambw ambwVar = (defpackage.ambw) obj;
            if (this.a == ambwVar.a && this.b == ambwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final java.lang.String toString() {
        return "MinAndMax{min=" + this.a + ", max=" + this.b + '}';
    }

    public ambw() {
        throw null;
    }
}
