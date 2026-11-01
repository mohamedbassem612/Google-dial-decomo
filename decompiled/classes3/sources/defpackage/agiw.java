package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agiw {
    public final java.lang.String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final int j;
    public final float k;
    public final float l;

    public agiw(java.lang.String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i, float f9, float f10) {
        aooh.f(str, "id");
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = i;
        this.k = f9;
        this.l = f10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agiw) {
            defpackage.agiw agiwVar = (defpackage.agiw) obj;
            if (aooh.n(this.a, agiwVar.a) && java.lang.Float.compare(this.b, agiwVar.b) == 0 && java.lang.Float.compare(this.c, agiwVar.c) == 0 && java.lang.Float.compare(this.d, agiwVar.d) == 0 && java.lang.Float.compare(this.e, agiwVar.e) == 0 && java.lang.Float.compare(this.f, agiwVar.f) == 0 && java.lang.Float.compare(this.g, agiwVar.g) == 0 && java.lang.Float.compare(this.h, agiwVar.h) == 0 && java.lang.Float.compare(this.i, agiwVar.i) == 0 && this.j == agiwVar.j && java.lang.Float.compare(this.k, agiwVar.k) == 0 && java.lang.Float.compare(this.l, agiwVar.l) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.a.hashCode() * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + java.lang.Float.floatToIntBits(this.h)) * 31) + java.lang.Float.floatToIntBits(this.i)) * 31) + this.j) * 31) + java.lang.Float.floatToIntBits(this.k)) * 31) + java.lang.Float.floatToIntBits(this.l);
    }

    public final java.lang.String toString() {
        return "BorderLightConfig(id=" + this.a + ", topBlurRadius=" + this.b + ", bottomBlurRadius=" + this.c + ", topIntensity=" + this.d + ", bottomIntensity=" + this.e + ", strokeWidth=" + this.f + ", distortionSpeed=" + this.g + ", distortionFrequency=" + this.h + ", distortionAmplitude=" + this.i + ", color=" + this.j + ", alpha=" + this.k + ", hdrBoost=" + this.l + ')';
    }

    public agiw() {
        this(null);
    }

    public /* synthetic */ agiw(byte[] bArr) {
        this("", 30.2f, 4.4f, 0.06967213f, 0.47950816f, 3.0f, 0.0f, 0.0f, 0.0f, -2462251, 1.0f, 1.0f);
    }
}
