package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xua {
    public final int a;
    public final int b;

    public xua(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!defpackage.ygc.k(i)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (!defpackage.ygc.k(i2)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xua) {
            defpackage.xua xuaVar = (defpackage.xua) obj;
            if (this.a == xuaVar.a && this.b == xuaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
