package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aciy {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;

    public aciy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.a = i;
        this.b = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.c = i7;
        this.l = i8;
        this.m = i9;
        this.d = i10;
        this.e = i11;
        this.n = i12;
        this.o = i13;
        this.f = i14;
        this.g = i15;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aciy) {
            defpackage.aciy aciyVar = (defpackage.aciy) obj;
            if (this.a == aciyVar.a && this.b == aciyVar.b && this.h == aciyVar.h && this.i == aciyVar.i && this.j == aciyVar.j && this.k == aciyVar.k && this.c == aciyVar.c && this.l == aciyVar.l && this.m == aciyVar.m && this.d == aciyVar.d && this.e == aciyVar.e && this.n == aciyVar.n && this.o == aciyVar.o && this.f == aciyVar.f && this.g == aciyVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((this.a * 31) + this.b) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.c) * 31) + this.l) * 31) + this.m) * 31) + this.d) * 31) + this.e) * 31) + this.n) * 31) + this.o) * 31) + this.f) * 31) + this.g;
    }

    public final java.lang.String toString() {
        return "PaletteColors(primaryColor=" + this.a + ", onPrimaryColor=" + this.b + ", secondaryColor=" + this.h + ", surfaceColor=" + this.i + ", surfaceColor1=" + this.j + ", surfaceColor2=" + this.k + ", surfaceColor3=" + this.c + ", surfaceColor4=" + this.l + ", surfaceColor5=" + this.m + ", onSurfaceColor=" + this.d + ", onSurfaceVariantColor=" + this.e + ", backgroundColor=" + this.n + ", outlineColor=" + this.o + ", onPrimaryContainerColor=" + this.f + ", primaryContainerColor=" + this.g + ')';
    }
}
