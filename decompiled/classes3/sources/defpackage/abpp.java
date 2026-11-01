package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abpp {
    public final float a;
    public final int b;
    public final float c;
    public final int d;

    public abpp(float f, int i, float f2, int i2) {
        this.a = f;
        this.b = i;
        this.c = f2;
        this.d = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abpp) {
            defpackage.abpp abppVar = (defpackage.abpp) obj;
            if (java.lang.Float.compare(this.a, abppVar.a) == 0 && this.b == abppVar.b && java.lang.Float.compare(this.c, abppVar.c) == 0 && this.d == abppVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + this.b) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + this.d;
    }

    public final java.lang.String toString() {
        return "DialpadKeyHorizontalMeasurements(primaryTextSizePx=" + this.a + ", primaryTextWidth=" + this.b + ", secondaryTextSizePx=" + this.c + ", secondaryTextWidth=" + this.d + ')';
    }
}
