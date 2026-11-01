package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class knk {
    public final int a;
    public final int b;

    public knk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.knk) {
            defpackage.knk knkVar = (defpackage.knk) obj;
            if (this.a == knkVar.a && this.b == knkVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final java.lang.String toString() {
        return "AnchorPoint{x=" + this.a + ", y=" + this.b + '}';
    }

    public knk() {
        throw null;
    }
}
