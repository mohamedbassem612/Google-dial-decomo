package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class OptionalDouble {
    public static final j$.util.OptionalDouble c = new j$.util.OptionalDouble();
    public final boolean a;
    public final double b;

    public OptionalDouble() {
        this.a = false;
        this.b = Double.NaN;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.util.OptionalDouble) {
            j$.util.OptionalDouble optionalDouble = (j$.util.OptionalDouble) obj;
            boolean z = optionalDouble.a;
            boolean z2 = this.a;
            if (z2 && z) {
                if (java.lang.Double.compare(this.b, optionalDouble.b) == 0) {
                    return true;
                }
            } else if (z2 == z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(this.b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public double orElse(double d) {
        return this.a ? this.b : d;
    }

    public final java.lang.String toString() {
        if (!this.a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.b + "]";
    }

    public OptionalDouble(double d) {
        this.a = true;
        this.b = d;
    }
}
