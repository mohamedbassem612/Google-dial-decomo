package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cqs extends crb implements cqq {
    private final java.util.List a;
    private final java.util.List b;
    private final long c;
    private final long d;
    private final int e = 0;

    public cqs(java.util.List list, java.util.List list2, long j, long j2) {
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = j2;
    }

    public final android.graphics.Shader b(long j) {
        long j2 = this.c;
        int i = (int) (j2 >> 32);
        if (java.lang.Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
        long j3 = this.d;
        int i3 = (int) (j3 >> 32);
        if (java.lang.Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat(i4);
        return defpackage.cpy.c((java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), this.a, this.b, 0);
    }

    public final java.lang.Object c(java.lang.Object obj, float f) {
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cqs) {
            defpackage.cqs cqsVar = (defpackage.cqs) obj;
            if (aooh.n(this.a, cqsVar.a) && aooh.n(this.b, cqsVar.b) && this.c == cqsVar.c && this.d == cqsVar.d) {
                int i = cqsVar.e;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.util.List list = this.b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        long j = this.c;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        return (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        long j = this.c;
        java.lang.String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + cpm.c(j) + ", ";
        } else {
            str = "";
        }
        long j2 = this.d;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + cpm.c(j2) + ", ";
        }
        return "LinearGradient(colors=" + this.a + ", stops=" + this.b + ", " + str + str2 + "tileMode=Clamp)";
    }
}
