package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agjq {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final float f;
    private final float g;
    private final float h;

    public agjq(float f, float f2, float f3, float f4, int i, float f5) {
        this.g = 0.0f;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.h = 0.0f;
        this.e = i;
        this.f = f5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agjq) {
            defpackage.agjq agjqVar = (defpackage.agjq) obj;
            float f = agjqVar.g;
            if (java.lang.Float.compare(this.a, agjqVar.a) == 0 && java.lang.Float.compare(this.b, agjqVar.b) == 0 && java.lang.Float.compare(this.c, agjqVar.c) == 0 && java.lang.Float.compare(this.d, agjqVar.d) == 0) {
                float f2 = agjqVar.h;
                if (this.e == agjqVar.e && java.lang.Float.compare(this.f, agjqVar.f) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 961) + this.e) * 31) + java.lang.Float.floatToIntBits(this.f);
    }

    public final java.lang.String toString() {
        return "RippleLightConfig(alpha=0.0, expansionSpeed=" + this.a + ", frequency=" + this.b + ", oscillationDistance=" + this.c + ", oscillationSpeed=" + this.d + ", blurRadius=0.0, color=" + this.e + ", hdrBoost=" + this.f + ')';
    }

    public agjq() {
        this(null);
    }

    public /* synthetic */ agjq(byte[] bArr) {
        this(1.0f, 0.01f, 59.0f, 0.81f, -8690713, 1.0f);
    }
}
