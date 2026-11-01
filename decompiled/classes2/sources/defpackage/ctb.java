package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ctb extends cts {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ctb(float f, float f2, float f3, float f4, float f5, float f6) {
        super(true, false);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ctb) {
            defpackage.ctb ctbVar = (defpackage.ctb) obj;
            if (java.lang.Float.compare(this.a, ctbVar.a) == 0 && java.lang.Float.compare(this.b, ctbVar.b) == 0 && java.lang.Float.compare(this.c, ctbVar.c) == 0 && java.lang.Float.compare(this.d, ctbVar.d) == 0 && java.lang.Float.compare(this.e, ctbVar.e) == 0 && java.lang.Float.compare(this.f, ctbVar.f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f);
    }

    public final java.lang.String toString() {
        return "CurveTo(x1=" + this.a + ", y1=" + this.b + ", x2=" + this.c + ", y2=" + this.d + ", x3=" + this.e + ", y3=" + this.f + ')';
    }
}
