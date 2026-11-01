package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agiy {
    public static volatile defpackage.agix a;
    public final java.lang.String b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final defpackage.agjj o;
    private final boolean p;

    static {
        int i = defpackage.agjj.a;
        a = defpackage.agix.a;
    }

    public agiy(java.lang.String str, float f, int i, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, defpackage.agjj agjjVar) {
        aooh.f(str, "mask");
        aooh.f(agjjVar, "internalDotsConfig");
        this.b = str;
        this.c = f;
        this.d = i;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.j = f7;
        this.k = f8;
        this.l = f9;
        this.m = f10;
        this.n = f11;
        this.p = false;
        this.o = agjjVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agiy) {
            defpackage.agiy agiyVar = (defpackage.agiy) obj;
            if (aooh.n(this.b, agiyVar.b) && java.lang.Float.compare(this.c, agiyVar.c) == 0 && this.d == agiyVar.d && java.lang.Float.compare(this.e, agiyVar.e) == 0 && java.lang.Float.compare(this.f, agiyVar.f) == 0 && java.lang.Float.compare(this.g, agiyVar.g) == 0 && java.lang.Float.compare(this.h, agiyVar.h) == 0 && java.lang.Float.compare(this.i, agiyVar.i) == 0 && java.lang.Float.compare(this.j, agiyVar.j) == 0 && java.lang.Float.compare(this.k, agiyVar.k) == 0 && java.lang.Float.compare(this.l, agiyVar.l) == 0 && java.lang.Float.compare(this.m, agiyVar.m) == 0 && java.lang.Float.compare(this.n, agiyVar.n) == 0) {
                boolean z = agiyVar.p;
                if (aooh.n(this.o, agiyVar.o)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((this.b.hashCode() * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + this.d) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + java.lang.Float.floatToIntBits(this.h)) * 31) + java.lang.Float.floatToIntBits(this.i)) * 31) + java.lang.Float.floatToIntBits(this.j)) * 31) + java.lang.Float.floatToIntBits(this.k)) * 31) + java.lang.Float.floatToIntBits(this.l)) * 31) + java.lang.Float.floatToIntBits(this.m)) * 31) + java.lang.Float.floatToIntBits(this.n)) * 31) + 1237) * 31) + this.o.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = this.b;
        if (aooh.n(str2, "return 1;")) {
            str = "None";
        } else if (aooh.n(str2, "return blurredSdfMask;")) {
            str = "Panel";
        } else {
            str = aooh.n(str2, "return smoothstep(100,-100,p.y)*saturate(calculatePulse()*2);") ? "Loader" : "Unknown";
        }
        return "DotsConfig(mask=" + str + ", alpha=" + this.c + ", color=" + this.d + ", yFractGradientWeight=" + this.e + ", waveFrequency=" + this.f + ", waveAmplitude=" + this.g + ", waveSpeed=" + this.h + ", maskInnerStrokeWidth=" + this.i + ", maskOuterStrokeWidth=" + this.j + ", gridSize=" + this.k + ", maxRadius=" + this.l + ", minRadius=" + this.m + ", hdrBoost=" + this.n + ", showMaskOnly=false, internalDotsConfig=" + this.o + ')';
    }

    public agiy() {
        this("return blurredSdfMask;", 1.0f, defpackage.agjj.a, 0.0f, 0.02f, 3.0f, 10.0f, 59.0f, 59.0f, 3.5f, 0.12f, -0.07f, 1.0f, defpackage.agjj.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ agiy(byte[] bArr) {
        int i = defpackage.agjj.a;
        defpackage.agix agixVar = a;
        aooh.f(agixVar, "deviceType");
        this("return blurredSdfMask;", 1.0f, i, 0.0f, 0.02f, 3.0f, 10.0f, 59.0f, 59.0f, 3.5f, 0.12f, -0.07f, 1.0f, defpackage.agmc.J(agixVar));
    }
}
