package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agjk {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public agjk(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agjk) {
            defpackage.agjk agjkVar = (defpackage.agjk) obj;
            if (java.lang.Float.compare(this.a, agjkVar.a) == 0 && java.lang.Float.compare(this.b, agjkVar.b) == 0 && java.lang.Float.compare(this.c, agjkVar.c) == 0 && java.lang.Float.compare(this.d, agjkVar.d) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "RadiiSums(sumTop=" + this.a + ", sumBottom=" + this.b + ", sumLeft=" + this.c + ", sumRight=" + this.d + ')';
    }
}
