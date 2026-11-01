package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class csz extends cts {
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final float g;

    public csz(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(false, false);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = z2;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.csz) {
            defpackage.csz cszVar = (defpackage.csz) obj;
            if (java.lang.Float.compare(this.a, cszVar.a) == 0 && java.lang.Float.compare(this.b, cszVar.b) == 0 && java.lang.Float.compare(this.c, cszVar.c) == 0 && this.d == cszVar.d && this.e == cszVar.e && java.lang.Float.compare(this.f, cszVar.f) == 0 && java.lang.Float.compare(this.g, cszVar.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + (true == this.d ? 1231 : 1237)) * 31) + (true != this.e ? 1237 : 1231)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.g);
    }

    public final java.lang.String toString() {
        return "ArcTo(horizontalEllipseRadius=" + this.a + ", verticalEllipseRadius=" + this.b + ", theta=" + this.c + ", isMoreThanHalf=" + this.d + ", isPositiveArc=" + this.e + ", arcStartX=" + this.f + ", arcStartY=" + this.g + ')';
    }
}
