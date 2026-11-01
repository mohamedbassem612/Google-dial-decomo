package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeij {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public aeij(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aeij) {
            defpackage.aeij aeijVar = (defpackage.aeij) obj;
            if (this.a == aeijVar.a && this.b == aeijVar.b && this.c == aeijVar.c && this.d == aeijVar.d && this.e == aeijVar.e && this.f == aeijVar.f && this.g == aeijVar.g && this.h == aeijVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h;
    }

    public final java.lang.String toString() {
        return "RingUtilsDimensions(ogApdMinAvatarSizeForLargeRing=" + this.a + ", ogApdMinAvatarSizeForLegacyLargeRing=" + this.b + ", ogApdLargeRingWidth=" + this.c + ", ogApdLegacyLargeRingWidth=" + this.d + ", ogApdSmallRingWidth=" + this.e + ", ogApdLegacyLargeRingGap=" + this.f + ", ogApdLargeRingGap=" + this.g + ", ogApdSmallRingGap=" + this.h + ')';
    }
}
