package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agjs {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public agjs(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agjs) {
            defpackage.agjs agjsVar = (defpackage.agjs) obj;
            if (java.lang.Float.compare(this.a, agjsVar.a) == 0 && java.lang.Float.compare(this.b, agjsVar.b) == 0 && java.lang.Float.compare(this.c, agjsVar.c) == 0 && java.lang.Float.compare(this.d, agjsVar.d) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "SpotLightConfig(topRadius=" + this.a + ", bottomRadius=" + this.b + ", alpha=" + this.c + ", hdrBoost=" + this.d + ')';
    }

    public agjs() {
        this(0.0f, 64.0f, 1.0f, 1.0f);
    }
}
