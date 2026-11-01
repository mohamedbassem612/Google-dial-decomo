package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aizg {
    public int a;
    public java.lang.Object b;

    public aizg(int i) {
        this.a = 0;
        this.b = new int[i];
    }

    private final void l(int i, int i2) {
        int[] iArr = (int[]) this.b;
        afsq.by(iArr, i, i2);
        afsq.by(iArr, i + 1, i2 + 1);
        afsq.by(iArr, i + 2, i2 + 2);
    }

    private final int[] m(int[] iArr) {
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length << 1);
        aooh.e(iArrCopyOf, "copyOf(...)");
        this.b = iArrCopyOf;
        return iArrCopyOf;
    }

    public final defpackage.aizh a() {
        if (this.a == 0) {
            return defpackage.aizh.a;
        }
        return new defpackage.aizh((int[]) this.b, this.a);
    }

    public final void b(int i) {
        int i2 = this.a + 1;
        int[] iArr = (int[]) this.b;
        int length = iArr.length;
        if (i2 > length) {
            this.b = java.util.Arrays.copyOf(iArr, defpackage.ajee.o(length, i2));
        }
        java.lang.Object obj = this.b;
        int i3 = this.a;
        ((int[]) obj)[i3] = i;
        this.a = i3 + 1;
    }

    public final int c(int i) {
        return ((int[]) this.b)[i];
    }

    public final int d() {
        java.lang.Object obj = this.b;
        int i = this.a - 1;
        this.a = i;
        return ((int[]) obj)[i];
    }

    public final void e(int i, int i2, int i3) {
        int i4 = this.a;
        int i5 = i4 + 3;
        java.lang.Object objM = this.b;
        int[] iArr = (int[]) objM;
        if (i5 >= iArr.length) {
            objM = m(iArr);
        }
        int[] iArr2 = (int[]) objM;
        iArr2[i4] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.a = i5;
    }

    public final void f(int i, int i2, int i3, int i4) {
        int i5 = this.a;
        int i6 = i5 + 4;
        java.lang.Object objM = this.b;
        int[] iArr = (int[]) objM;
        if (i6 >= iArr.length) {
            objM = m(iArr);
        }
        int[] iArr2 = (int[]) objM;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.a = i6;
    }

    public final void g(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = (int[]) this.b;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    l(i3, i4);
                }
            }
            l(i3 + 3, i2);
            g(i, i3);
            g(i3 + 6, i2);
        }
    }

    public final void h() {
        this.b = null;
        this.a = 0;
    }

    public final long i(int i) {
        if (i >= 0 && i < this.a) {
            return ((long[]) this.b)[i];
        }
        throw new java.lang.IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.a);
    }

    public final void j(long j) {
        int i = this.a;
        long[] jArr = (long[]) this.b;
        if (i == jArr.length) {
            this.b = java.util.Arrays.copyOf(jArr, i << 1);
        }
        java.lang.Object obj = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        ((long[]) obj)[i2] = j;
    }

    public final void k(long[] jArr) {
        int i = this.a;
        int length = jArr.length;
        int i2 = i + length;
        long[] jArr2 = (long[]) this.b;
        int length2 = jArr2.length;
        if (i2 > length2) {
            this.b = java.util.Arrays.copyOf(jArr2, java.lang.Math.max(length2 << 1, i2));
        }
        java.lang.System.arraycopy(jArr, 0, this.b, this.a, length);
        this.a = i2;
    }

    public aizg(int i, byte[] bArr) {
        this.b = new int[i];
    }

    public aizg(int i, char[] cArr) {
        this.b = new long[i];
    }
}
