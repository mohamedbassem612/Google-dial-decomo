package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dpx implements defpackage.dpv {
    private final float[] a;
    private final float[] b;

    public dpx(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length) {
            throw new java.lang.IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.dpv
    public final float a(float f) {
        return defpackage.dpy.d(f, this.b, this.a);
    }

    @Override // defpackage.dpv
    public final float b(float f) {
        return defpackage.dpy.d(f, this.a, this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.dpx)) {
            defpackage.dpx dpxVar = (defpackage.dpx) obj;
            if (java.util.Arrays.equals(this.a, dpxVar.a) && java.util.Arrays.equals(this.b, dpxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.util.Arrays.hashCode(this.a) * 31) + java.util.Arrays.hashCode(this.b);
    }

    public final java.lang.String toString() {
        java.lang.String string = java.util.Arrays.toString(this.a);
        defpackage.aooh.e(string, "toString(...)");
        java.lang.String string2 = java.util.Arrays.toString(this.b);
        defpackage.aooh.e(string2, "toString(...)");
        return "FontScaleConverter{fromSpValues=" + string + ", toDpValues=" + string2 + '}';
    }
}
