package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abgz {
    public final java.lang.Object a;
    public final float b;

    public abgz(java.lang.Object obj, float f) {
        this.a = obj;
        this.b = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abgz) {
            defpackage.abgz abgzVar = (defpackage.abgz) obj;
            if (aooh.n(this.a, abgzVar.a) && java.lang.Float.compare(this.b, abgzVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "FlingResult(target=" + this.a + ", progress=" + this.b + ')';
    }
}
