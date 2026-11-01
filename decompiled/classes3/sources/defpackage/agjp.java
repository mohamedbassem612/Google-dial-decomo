package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agjp {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;

    public agjp(float f, float f2, float f3, float f4) {
        this.e = 0.0f;
        this.a = f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agjp) {
            defpackage.agjp agjpVar = (defpackage.agjp) obj;
            float f = agjpVar.e;
            if (java.lang.Float.compare(this.a, agjpVar.a) == 0) {
                float f2 = agjpVar.f;
                float f3 = agjpVar.g;
                float f4 = agjpVar.h;
                if (java.lang.Float.compare(this.b, agjpVar.b) == 0 && java.lang.Float.compare(this.c, agjpVar.c) == 0 && java.lang.Float.compare(this.d, agjpVar.d) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 923521) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "RimLightConfig(startBlurRadius=0.0, endBlurRadius=" + this.a + ", distortionSpeed=0.0, distortionFrequency=0.0, distortionAmplitude=0.0, rimWidth=" + this.b + ", alpha=" + this.c + ", hdrBoost=" + this.d + ')';
    }

    public agjp() {
        this(23.6f, 32.0f, 1.0f, 1.0f);
    }
}
