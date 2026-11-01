package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agjm {
    public final java.util.List a;
    public final float b;
    public final float c;
    public final ajp d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final ajb k;
    public final float l;
    public final float m;
    private final java.lang.Float n;
    private final java.lang.Float o;
    private final boolean p;

    public /* synthetic */ agjm(byte[] bArr) {
        this(ajsz.bb(new defpackage.agjr[]{new defpackage.agjr(defpackage.agjr.a), new defpackage.agjr(defpackage.agjr.b), new defpackage.agjr(defpackage.agjr.c), new defpackage.agjr(defpackage.agjr.d)}), 90.0f, 0.3f, new ajp(0.5f, 200.0f, 0.01f), 1.15f, 360.0f, 20.0f, 3.0f, 22.0f, 2.5f, new ajb(0.4f, 0.0f, 0.2f, 1.0f), 27.0f, 1.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agjm) {
            defpackage.agjm agjmVar = (defpackage.agjm) obj;
            if (aooh.n(this.a, agjmVar.a) && java.lang.Float.compare(this.b, agjmVar.b) == 0 && java.lang.Float.compare(this.c, agjmVar.c) == 0 && aooh.n(this.d, agjmVar.d) && java.lang.Float.compare(this.e, agjmVar.e) == 0 && java.lang.Float.compare(this.f, agjmVar.f) == 0 && java.lang.Float.compare(this.g, agjmVar.g) == 0 && java.lang.Float.compare(this.h, agjmVar.h) == 0 && java.lang.Float.compare(this.i, agjmVar.i) == 0 && java.lang.Float.compare(this.j, agjmVar.j) == 0 && aooh.n(this.k, agjmVar.k) && java.lang.Float.compare(this.l, agjmVar.l) == 0 && java.lang.Float.compare(this.m, agjmVar.m) == 0) {
                java.lang.Float f = agjmVar.n;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    java.lang.Float f2 = agjmVar.o;
                    if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                        boolean z = agjmVar.p;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((this.a.hashCode() * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + this.d.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + java.lang.Float.floatToIntBits(this.h)) * 31) + java.lang.Float.floatToIntBits(this.i)) * 31) + java.lang.Float.floatToIntBits(this.j)) * 31) + this.k.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.l)) * 31) + java.lang.Float.floatToIntBits(this.m)) * 29791) + 1237;
    }

    public final java.lang.String toString() {
        return "LoaderConfig(shapes=" + this.a + ", morphAngle=" + this.b + ", morphDuration=" + this.c + ", rotationMorphSpring=" + this.d + ", stepInterval=" + this.e + ", rotationAngle=" + this.f + ", rotationDuration=" + this.g + ", energyRotationDuration=" + this.h + ", yFloatAmount=" + this.i + ", yFloatDuration=" + this.j + ", yFloatCubicBezier=" + this.k + ", backgroundBlurAmount=" + this.l + ", backgroundBlurAlpha=" + this.m + ", finalHeight=null, finalWidth=null, shouldScale=false)";
    }

    public agjm(java.util.List list, float f, float f2, ajp ajpVar, float f3, float f4, float f5, float f6, float f7, float f8, ajb ajbVar, float f9, float f10) {
        aooh.f(list, "shapes");
        aooh.f(ajpVar, "rotationMorphSpring");
        aooh.f(ajbVar, "yFloatCubicBezier");
        this.a = list;
        this.b = f;
        this.c = f2;
        this.d = ajpVar;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = f8;
        this.k = ajbVar;
        this.l = f9;
        this.m = f10;
        this.n = null;
        this.o = null;
        this.p = false;
    }

    public agjm() {
        this(null);
    }
}
