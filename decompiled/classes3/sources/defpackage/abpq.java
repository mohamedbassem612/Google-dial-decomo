package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abpq {
    public final float a;
    public final float b;

    public abpq(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abpq) {
            defpackage.abpq abpqVar = (defpackage.abpq) obj;
            if (java.lang.Float.compare(this.a, abpqVar.a) == 0 && java.lang.Float.compare(this.b, abpqVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "DialpadKeyVerticalMeasurements(primaryTextSizePx=" + this.a + ", secondaryTextSizePx=" + this.b + ')';
    }
}
