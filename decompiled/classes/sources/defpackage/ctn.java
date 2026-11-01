package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ctn extends defpackage.cts {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ctn(float f, float f2, float f3, float f4) {
        super(false, true);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ctn) {
            defpackage.ctn ctnVar = (defpackage.ctn) obj;
            if (java.lang.Float.compare(this.a, ctnVar.a) == 0 && java.lang.Float.compare(this.b, ctnVar.b) == 0 && java.lang.Float.compare(this.c, ctnVar.c) == 0 && java.lang.Float.compare(this.d, ctnVar.d) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "RelativeQuadTo(dx1=" + this.a + ", dy1=" + this.b + ", dx2=" + this.c + ", dy2=" + this.d + ')';
    }
}
