package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abmv {
    public final java.lang.Integer a;
    public final java.lang.Integer b;
    public final java.lang.Float c;
    public final java.lang.Float d;
    public final java.lang.Float e;
    private final java.lang.Float f;

    public abmv(java.lang.Integer num, java.lang.Integer num2, java.lang.Float f, java.lang.Float f2, java.lang.Float f3) {
        this.a = num;
        this.b = num2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    public final boolean a() {
        java.lang.Integer num;
        java.lang.Float f;
        java.lang.Float f2;
        double dFloatValue;
        int iIntValue;
        int iIntValue2;
        java.lang.Integer num2 = this.a;
        if ((num2 == null || ((iIntValue2 = num2.intValue()) > 0 && iIntValue2 < 1001)) && ((num = this.b) == null || ((iIntValue = num.intValue()) >= -1000 && iIntValue < 1001))) {
            java.lang.Float f3 = this.c;
            if (f3 == null) {
                f = this.d;
                if (f != null) {
                    f2 = this.e;
                    if (f2 != null) {
                        dFloatValue = f2.floatValue();
                        if (dFloatValue >= 0.0d) {
                        }
                    }
                    return true;
                }
                f2 = this.e;
                if (f2 != null) {
                    dFloatValue = f2.floatValue();
                    if (dFloatValue >= 0.0d) {
                    }
                }
                return true;
            }
            float fFloatValue = f3.floatValue();
            if (fFloatValue >= -90.0f && fFloatValue <= 90.0f) {
                f = this.d;
                if (f != null || f.floatValue() > 0.0f) {
                    f2 = this.e;
                    if (f2 != null) {
                        dFloatValue = f2.floatValue();
                        if (dFloatValue >= 0.0d || dFloatValue > 100.0d) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abmv) {
            defpackage.abmv abmvVar = (defpackage.abmv) obj;
            if (aooh.n(this.a, abmvVar.a) && aooh.n(this.b, abmvVar.b) && aooh.n(this.c, abmvVar.c) && aooh.n(this.d, abmvVar.d) && aooh.n(this.e, abmvVar.e)) {
                java.lang.Float f = abmvVar.f;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.b;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int i = iHashCode * 31;
        java.lang.Float f = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (f == null ? 0 : f.hashCode())) * 31;
        java.lang.Float f2 = this.d;
        int iHashCode4 = (iHashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        java.lang.Float f3 = this.e;
        return (iHashCode4 + (f3 != null ? f3.hashCode() : 0)) * 31;
    }

    public final java.lang.String toString() {
        return "FlexFontUiData(weight=" + this.a + ", grade=" + this.b + ", slant=" + this.c + ", width=" + this.d + ", round=" + this.e + ", italic=null)";
    }

    public abmv() {
        this(null, null, null, null, null);
    }
}
