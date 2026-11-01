package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ynj {
    private final int a;
    private final int b;
    private final java.lang.String c;
    private final java.lang.String d;

    public ynj(int i, int i2, java.lang.String str, java.lang.String str2) {
        this.a = i;
        this.b = i2;
        if (str == null) {
            throw new java.lang.NullPointerException("Null uri");
        }
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ynj) {
            defpackage.ynj ynjVar = (defpackage.ynj) obj;
            if (this.a == ynjVar.a && this.b == ynjVar.b && this.c.equals(ynjVar.c)) {
                java.lang.String str = this.d;
                if (str == null) {
                    if (ynjVar.d == null) {
                        return true;
                    }
                } else if (str.equals(ynjVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
        java.lang.String str = this.d;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "CitationSource{startIndex=" + this.a + ", endIndex=" + this.b + ", uri=" + this.c + ", license=" + this.d + '}';
    }

    public ynj() {
        throw null;
    }
}
