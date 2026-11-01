package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ctg extends cts {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ctg(float f, float f2, float f3, float f4) {
        super(true, false);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ctg) {
            defpackage.ctg ctgVar = (defpackage.ctg) obj;
            if (java.lang.Float.compare(this.a, ctgVar.a) == 0 && java.lang.Float.compare(this.b, ctgVar.b) == 0 && java.lang.Float.compare(this.c, ctgVar.c) == 0 && java.lang.Float.compare(this.d, ctgVar.d) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "ReflectiveCurveTo(x1=" + this.a + ", y1=" + this.b + ", x2=" + this.c + ", y2=" + this.d + ')';
    }
}
