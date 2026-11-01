package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dje {
    public int a;
    private final java.lang.Object b;
    private final int c;
    private final java.lang.String d;

    public dje(java.lang.Object obj, int i, int i2, java.lang.String str) {
        this.b = obj;
        this.c = i;
        this.a = i2;
        this.d = str;
    }

    public final djg a(int i) {
        int i2 = this.a;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (i == Integer.MIN_VALUE) {
            defpackage.dnv.c("Item.end should be set first");
        }
        return new djg(this.b, this.c, i, this.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dje) {
            defpackage.dje djeVar = (defpackage.dje) obj;
            if (aooh.n(this.b, djeVar.b) && this.c == djeVar.c && this.a == djeVar.a && aooh.n(this.d, djeVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.b;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.c) * 31) + this.a) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "MutableRange(item=" + this.b + ", start=" + this.c + ", end=" + this.a + ", tag=" + this.d + ')';
    }
}
