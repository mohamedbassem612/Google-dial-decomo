package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cpo {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        defpackage.cdh.t(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public cpo(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cpo) {
            defpackage.cpo cpoVar = (defpackage.cpo) obj;
            if (java.lang.Float.compare(this.a, cpoVar.a) == 0 && java.lang.Float.compare(this.b, cpoVar.b) == 0 && java.lang.Float.compare(this.c, cpoVar.c) == 0 && java.lang.Float.compare(this.d, cpoVar.d) == 0 && this.e == cpoVar.e && this.f == cpoVar.f && this.g == cpoVar.g && this.h == cpoVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
        long j = this.h;
        long j2 = this.g;
        long j3 = this.f;
        long j4 = this.e;
        return (((((((iFloatToIntBits * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        java.lang.String str = defpackage.rz.j(this.a) + ", " + defpackage.rz.j(this.b) + ", " + defpackage.rz.j(this.c) + ", " + defpackage.rz.j(this.d);
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        long j4 = this.h;
        if (j != j2 || j2 != j3 || j3 != j4) {
            return "RoundRect(rect=" + str + ", topLeft=" + defpackage.cpk.a(j) + ", topRight=" + defpackage.cpk.a(j2) + ", bottomRight=" + defpackage.cpk.a(j3) + ", bottomLeft=" + defpackage.cpk.a(j4) + ')';
        }
        long j5 = j >> 32;
        int i = (int) (j & 4294967295L);
        int i2 = (int) j5;
        if (java.lang.Float.intBitsToFloat(i2) == java.lang.Float.intBitsToFloat(i)) {
            return "RoundRect(rect=" + str + ", radius=" + defpackage.rz.j(java.lang.Float.intBitsToFloat(i2)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + defpackage.rz.j(java.lang.Float.intBitsToFloat(i2)) + ", y=" + defpackage.rz.j(java.lang.Float.intBitsToFloat(i)) + ')';
    }
}
