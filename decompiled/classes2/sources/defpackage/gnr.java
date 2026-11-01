package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gnr extends defpackage.gns {
    public final float a;
    public final float b;

    public gnr(float f, float f2) {
        this.a = f;
        this.b = f2;
        double d = f;
        if (d <= 0.0d || d >= 1.0d) {
            throw new java.lang.IllegalArgumentException("minRatio must be in the interval (0.0, 1.0)");
        }
        double d2 = f2;
        if (d2 <= 0.0d || d2 >= 1.0d) {
            throw new java.lang.IllegalArgumentException("maxRatio must be in the interval (0.0, 1.0)");
        }
        if (f > f2) {
            throw new java.lang.IllegalArgumentException("minRatio must be less than or equal to maxRatio");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gnr) {
            defpackage.gnr gnrVar = (defpackage.gnr) obj;
            if (this.a == gnrVar.a && this.b == gnrVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "SplitRatioDragRange[" + this.a + ", " + this.b + ']';
    }
}
