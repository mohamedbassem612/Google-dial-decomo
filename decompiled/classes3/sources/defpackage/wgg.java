package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wgg {
    public final int a;
    public final int b;

    public wgg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.wgg) {
            defpackage.wgg wggVar = (defpackage.wgg) obj;
            if (this.a == wggVar.a && this.b == wggVar.b) {
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

    public wgg() {
        throw null;
    }
}
