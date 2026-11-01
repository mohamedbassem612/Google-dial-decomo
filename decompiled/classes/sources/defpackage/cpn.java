package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cpn {
    public static final defpackage.cpn a = new defpackage.cpn(0.0f, 0.0f, 0.0f, 0.0f);
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public cpn(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public static /* synthetic */ defpackage.cpn j(defpackage.cpn cpnVar, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = cpnVar.b;
        }
        float f4 = (i & 2) != 0 ? cpnVar.c : 0.0f;
        if ((i & 4) != 0) {
            f2 = cpnVar.d;
        }
        if ((i & 8) != 0) {
            f3 = cpnVar.e;
        }
        return new defpackage.cpn(f, f4, f2, f3);
    }

    public final float a() {
        return java.lang.Math.min(java.lang.Math.abs(this.d - this.b), java.lang.Math.abs(this.e - this.c));
    }

    public final long b() {
        float f = this.d;
        float f2 = this.b;
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f2 + ((f - f2) / 2.0f));
        float f3 = this.e;
        float f4 = this.c;
        return (jFloatToRawIntBits << 32) | (((long) java.lang.Float.floatToRawIntBits(f4 + ((f3 - f4) / 2.0f))) & 4294967295L);
    }

    public final long c() {
        return (((long) java.lang.Float.floatToRawIntBits(this.d - this.b)) << 32) | (((long) java.lang.Float.floatToRawIntBits(this.e - this.c)) & 4294967295L);
    }

    public final long d() {
        return (((long) java.lang.Float.floatToRawIntBits(this.b)) << 32) | (((long) java.lang.Float.floatToRawIntBits(this.c)) & 4294967295L);
    }

    public final defpackage.cpn e(defpackage.cpn cpnVar) {
        return new defpackage.cpn(java.lang.Math.max(this.b, cpnVar.b), java.lang.Math.max(this.c, cpnVar.c), java.lang.Math.min(this.d, cpnVar.d), java.lang.Math.min(this.e, cpnVar.e));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cpn) {
            defpackage.cpn cpnVar = (defpackage.cpn) obj;
            if (java.lang.Float.compare(this.b, cpnVar.b) == 0 && java.lang.Float.compare(this.c, cpnVar.c) == 0 && java.lang.Float.compare(this.d, cpnVar.d) == 0 && java.lang.Float.compare(this.e, cpnVar.e) == 0) {
                return true;
            }
        }
        return false;
    }

    public final defpackage.cpn f(float f, float f2) {
        float f3 = this.e;
        float f4 = this.d;
        return new defpackage.cpn(this.b + f, this.c + f2, f4 + f, f3 + f2);
    }

    public final defpackage.cpn g(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new defpackage.cpn(this.b + java.lang.Float.intBitsToFloat(i), this.c + java.lang.Float.intBitsToFloat(i2), this.d + java.lang.Float.intBitsToFloat(i), this.e + java.lang.Float.intBitsToFloat(i2));
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    public final boolean h(long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        int i = (fIntBitsToFloat > this.b ? 1 : (fIntBitsToFloat == this.b ? 0 : -1));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return ((((i ^ (-1)) & (fIntBitsToFloat > this.d ? 1 : (fIntBitsToFloat == this.d ? 0 : -1))) & ((fIntBitsToFloat2 > this.c ? 1 : (fIntBitsToFloat2 == this.c ? 0 : -1)) ^ (-1))) & (fIntBitsToFloat2 > this.e ? 1 : (fIntBitsToFloat2 == this.e ? 0 : -1))) >>> 31;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.b) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final boolean i() {
        return (((this.b > this.d ? 1 : (this.b == this.d ? 0 : -1)) ^ (-1)) | ((this.c > this.e ? 1 : (this.c == this.e ? 0 : -1)) ^ (-1))) >>> 31;
    }

    public final java.lang.String toString() {
        float f = this.e;
        float f2 = this.d;
        float f3 = this.c;
        return "Rect.fromLTRB(" + defpackage.rz.j(this.b) + ", " + defpackage.rz.j(f3) + ", " + defpackage.rz.j(f2) + ", " + defpackage.rz.j(f) + ')';
    }
}
