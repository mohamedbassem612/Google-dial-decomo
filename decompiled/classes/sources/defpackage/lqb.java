package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lqb {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    public lqb(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = i12;
        this.m = i13;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lqb) {
            defpackage.lqb lqbVar = (defpackage.lqb) obj;
            if (this.a == lqbVar.a && this.b == lqbVar.b && this.c == lqbVar.c && this.d == lqbVar.d && this.e == lqbVar.e && this.f == lqbVar.f && this.g == lqbVar.g && this.h == lqbVar.h && this.i == lqbVar.i && this.j == lqbVar.j && this.k == lqbVar.k && this.l == lqbVar.l && this.m == lqbVar.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31) + this.m;
    }

    public final java.lang.String toString() {
        return "DialerSurfaceColors(surface=" + this.a + ", onSurface=" + this.b + ", surfaceVariant=" + this.c + ", onSurfaceVariant=" + this.d + ", inverseSurface=" + this.e + ", inverseOnSurface=" + this.f + ", surfaceBright=" + this.g + ", surfaceDim=" + this.h + ", surfaceContainer=" + this.i + ", surfaceContainerHigh=" + this.j + ", surfaceContainerHighest=" + this.k + ", surfaceContainerLow=" + this.l + ", surfaceContainerLowest=" + this.m + ')';
    }
}
