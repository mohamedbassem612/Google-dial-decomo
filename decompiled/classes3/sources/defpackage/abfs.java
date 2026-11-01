package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abfs {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    private final float h;
    private final float i;
    private final float j;
    private final float k;

    public abfs(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.h = f4;
        this.i = f5;
        this.d = f6;
        this.e = f7;
        this.j = f8;
        this.f = f9;
        this.k = f10;
        this.g = f11;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abfs) {
            defpackage.abfs abfsVar = (defpackage.abfs) obj;
            if (dpi.c(this.a, abfsVar.a) && java.lang.Float.compare(this.b, abfsVar.b) == 0 && dpi.c(this.c, abfsVar.c) && java.lang.Float.compare(this.h, abfsVar.h) == 0 && dpi.c(this.i, abfsVar.i) && dpi.c(this.d, abfsVar.d) && dpi.c(this.e, abfsVar.e) && java.lang.Float.compare(this.j, abfsVar.j) == 0 && dpi.c(this.f, abfsVar.f) && java.lang.Float.compare(this.k, abfsVar.k) == 0 && java.lang.Float.compare(this.g, abfsVar.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.h)) * 31) + java.lang.Float.floatToIntBits(this.i)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.j)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.k)) * 31) + java.lang.Float.floatToIntBits(this.g);
    }

    public final java.lang.String toString() {
        float f = this.f;
        float f2 = this.e;
        float f3 = this.d;
        float f4 = this.i;
        float f5 = this.c;
        return "AnswerMethodBounds(trackWidth=" + dpi.b(this.a) + ", trackWidthPx=" + this.b + ", trackHeight=" + dpi.b(f5) + ", trackHeightPx=" + this.h + ", trackEnterOvershoot=" + dpi.b(f4) + ", trackMinWidth=" + dpi.b(f3) + ", puckSize=" + dpi.b(f2) + ", puckSizePx=" + this.j + ", puckPadding=" + dpi.b(f) + ", puckPaddingPx=" + this.k + ", dragBound=" + this.g + ')';
    }
}
