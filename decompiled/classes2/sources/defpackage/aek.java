package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aek {
    public final float a;
    public final float b;

    public aek(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aek) {
            defpackage.aek aekVar = (defpackage.aek) obj;
            if (java.lang.Float.compare(this.a, aekVar.a) == 0 && java.lang.Float.compare(this.b, aekVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "FlingResult(distanceCoefficient=" + this.a + ", velocityCoefficient=" + this.b + ')';
    }
}
