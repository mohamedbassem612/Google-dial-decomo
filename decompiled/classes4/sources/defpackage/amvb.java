package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amvb implements java.lang.Cloneable {
    public int a;
    public int b;
    private int c;
    private int[] d;

    public amvb(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new java.lang.IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.a = i;
        this.b = i2;
        int i3 = (i + 31) / 32;
        this.c = i3;
        this.d = new int[i3 * i2];
    }

    public final void a() {
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            this.d[i] = 0;
        }
    }

    public final void b(int i, int i2) {
        int i3 = i2 * this.c;
        int[] iArr = this.d;
        int i4 = i3 + (i / 32);
        iArr[i4] = iArr[i4] | (1 << (i & 31));
    }

    public final void c(int i, int i2, int i3, int i4) {
        int i5;
        if (i2 < 0 || i < 0) {
            throw new java.lang.IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new java.lang.IllegalArgumentException("Height and width must be at least 1");
        }
        int i6 = i4 + i2;
        if (i6 > this.b || (i5 = i3 + i) > this.a) {
            throw new java.lang.IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.c * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.d;
                int i9 = (i8 >> 5) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
        return new defpackage.amvb(this.a, this.b, this.c, (int[]) this.d.clone());
    }

    public final boolean d(int i, int i2) {
        return ((this.d[(i2 * this.c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.amvb)) {
            return false;
        }
        defpackage.amvb amvbVar = (defpackage.amvb) obj;
        return this.a == amvbVar.a && this.b == amvbVar.b && this.c == amvbVar.c && java.util.Arrays.equals(this.d, amvbVar.d);
    }

    public final int hashCode() {
        int i = this.a;
        return (((((((i * 31) + i) * 31) + this.b) * 31) + this.c) * 31) + java.util.Arrays.hashCode(this.d);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.b * (this.a + 1));
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.a; i2++) {
                sb.append(true != d(i2, i) ? "  " : "X ");
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    private amvb(int i, int i2, int i3, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
    }
}
