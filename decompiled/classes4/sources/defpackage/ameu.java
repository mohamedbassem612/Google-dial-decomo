package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ameu {
    public final int a;
    public final int b;

    public ameu(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean a(int i) {
        return i >= this.a && i < this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ameu) {
            defpackage.ameu ameuVar = (defpackage.ameu) obj;
            if (this.a == ameuVar.a && this.b == ameuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final java.lang.String toString() {
        return "WordSpan{start=" + this.a + ", end=" + this.b + '}';
    }

    public ameu() {
        throw null;
    }
}
