package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cvo {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final java.util.List i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public cvo(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, java.util.List list, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = list;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cvo) {
            defpackage.cvo cvoVar = (defpackage.cvo) obj;
            if (this.a == cvoVar.a && this.b == cvoVar.b && this.c == cvoVar.c && this.d == cvoVar.d && this.e == cvoVar.e && java.lang.Float.compare(this.f, cvoVar.f) == 0 && this.g == cvoVar.g && this.h == cvoVar.h && aooh.n(this.i, cvoVar.i) && this.j == cvoVar.j && java.lang.Float.compare(this.k, cvoVar.k) == 0 && this.l == cvoVar.l && this.m == cvoVar.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.e;
        int iFloatToIntBits = java.lang.Float.floatToIntBits(this.f);
        int i = true != z ? 1237 : 1231;
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        int i2 = (((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + i) * 31) + iFloatToIntBits;
        java.util.List list = this.i;
        int iHashCode = (((((i2 * 31) + this.g) * 31) + (true == this.h ? 1231 : 1237)) * 31) + list.hashCode();
        float f = this.k;
        long j5 = this.j;
        int iFloatToIntBits2 = (((iHashCode * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + java.lang.Float.floatToIntBits(f);
        long j6 = this.m;
        long j7 = this.l;
        return (((iFloatToIntBits2 * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final java.lang.String toString() {
        long j = this.m;
        long j2 = this.l;
        long j3 = this.j;
        long j4 = this.d;
        long j5 = this.c;
        return "PointerInputEventData(id=" + cvl.a(this.a) + ", uptime=" + this.b + ", positionOnScreen=" + cpm.c(j5) + ", position=" + cpm.c(j4) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + defpackage.cvu.a(this.g) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + cpm.c(j3) + ", scaleGestureFactor=" + this.k + ", panGestureOffset=" + cpm.c(j2) + ", originalEventPosition=" + cpm.c(j) + ')';
    }
}
