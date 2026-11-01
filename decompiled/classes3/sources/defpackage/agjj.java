package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agjj {
    public static final int a = -36421;
    public static final defpackage.agjj b;
    public static final defpackage.agjj c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m = -0.75f;
    public final float n = 1.0f;
    public final float o = 0.1f;
    public final float p = 0.00277f;
    public final float q = 0.35f;

    static {
        defpackage.agjj agjjVarA = a(new defpackage.agjj(0.1f, 2.0f, 0.2f, 0.2f, 2.0f, 2.0f, 1.06f, 0.62f, 1.1f), 0.0f, 0.0f, 0.03f, 0.04f, 2.0f, 2.0f, 15875);
        b = agjjVarA;
        c = a(agjjVarA, 0.3f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 15872);
    }

    public agjj(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.j = f7;
        this.k = f8;
        this.l = f9;
    }

    public static /* synthetic */ defpackage.agjj a(defpackage.agjj agjjVar, float f, float f2, float f3, float f4, float f5, float f6, int i) {
        if ((i & 1) != 0) {
            f = agjjVar.d;
        }
        float f7 = f;
        if ((i & 2) != 0) {
            f2 = agjjVar.e;
        }
        float f8 = agjjVar.m;
        float f9 = agjjVar.n;
        float f10 = agjjVar.o;
        float f11 = agjjVar.p;
        float f12 = agjjVar.q;
        return new defpackage.agjj(f7, f2, f3, f4, f5, f6, 0.6f, 0.9f, -1.79f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agjj) {
            defpackage.agjj agjjVar = (defpackage.agjj) obj;
            if (java.lang.Float.compare(this.d, agjjVar.d) == 0 && java.lang.Float.compare(this.e, agjjVar.e) == 0 && java.lang.Float.compare(this.f, agjjVar.f) == 0 && java.lang.Float.compare(this.g, agjjVar.g) == 0 && java.lang.Float.compare(this.h, agjjVar.h) == 0 && java.lang.Float.compare(this.i, agjjVar.i) == 0 && java.lang.Float.compare(this.j, agjjVar.j) == 0 && java.lang.Float.compare(this.k, agjjVar.k) == 0 && java.lang.Float.compare(this.l, agjjVar.l) == 0) {
                float f = agjjVar.m;
                float f2 = agjjVar.n;
                float f3 = agjjVar.o;
                float f4 = agjjVar.p;
                float f5 = agjjVar.q;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((java.lang.Float.floatToIntBits(this.d) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + java.lang.Float.floatToIntBits(this.h)) * 31) + java.lang.Float.floatToIntBits(this.i)) * 31) + java.lang.Float.floatToIntBits(this.j)) * 31) + java.lang.Float.floatToIntBits(this.k)) * 31) + java.lang.Float.floatToIntBits(this.l)) * 31) - 1086324736) * 31) + 1065353216) * 31) + 1036831949) * 31) + 993364195) * 31) + 1051931443;
    }

    public final java.lang.String toString() {
        return "InternalEnergyShaderDotsConfig(blurRadius=" + this.d + ", moveStrength=" + this.e + ", sizeNoiseScaleX=" + this.f + ", sizeNoiseScaleY=" + this.g + ", motionNoiseScaleX=" + this.h + ", motionNoiseScaleY=" + this.i + ", motionNoiseSpeedX=" + this.j + ", motionNoiseSpeedY=" + this.k + ", motionNoiseSpeedZ=" + this.l + ", thresholdMin=-0.75, thresholdMax=1.0, noiseRotationSpeed=0.1, noiseSpatialScale=0.00277, noiseManhattanLimit=0.35)";
    }
}
