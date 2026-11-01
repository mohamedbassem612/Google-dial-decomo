package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agjn {
    public final float a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;

    public /* synthetic */ agjn(byte[] bArr) {
        this(64.0f, 32.0f, -13367269, 1.0f, 1.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agjn) {
            defpackage.agjn agjnVar = (defpackage.agjn) obj;
            if (java.lang.Float.compare(this.a, agjnVar.a) == 0 && java.lang.Float.compare(this.b, agjnVar.b) == 0 && this.c == agjnVar.c && java.lang.Float.compare(this.d, agjnVar.d) == 0 && java.lang.Float.compare(this.e, agjnVar.e) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e);
    }

    public final java.lang.String toString() {
        return "PanelConfig(topBlurRadius=" + this.a + ", bottomBlurRadius=" + this.b + ", color=" + this.c + ", alpha=" + this.d + ", hdrBoost=" + this.e + ')';
    }

    public agjn(float f, float f2, int i, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = f3;
        this.e = f4;
    }

    public agjn() {
        this(null);
    }
}
