package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vm {
    public int a;
    public java.lang.Object b;

    public vm(int i, byte[] bArr) {
        this.a = 0;
        this.b = new long[i];
    }

    private final void k(int i, int i2) {
        int[] iArr = (int[]) this.b;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = iArr[i4];
        int i6 = i2 + 1;
        iArr[i4] = iArr[i6];
        iArr[i6] = i5;
        int i7 = i + 2;
        int i8 = iArr[i7];
        int i9 = i2 + 2;
        iArr[i7] = iArr[i9];
        iArr[i9] = i8;
    }

    private final int[] l(int[] iArr) {
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length << 1);
        defpackage.aooh.e(iArrCopyOf, "copyOf(...)");
        this.b = iArrCopyOf;
        return iArrCopyOf;
    }

    public final int a(int i) {
        return ((int[]) this.b)[i];
    }

    public final int b() {
        java.lang.Object obj = this.b;
        int i = this.a - 1;
        this.a = i;
        return ((int[]) obj)[i];
    }

    public final void c(int i, int i2, int i3) {
        int i4 = this.a;
        int i5 = i4 + 3;
        java.lang.Object objL = this.b;
        int[] iArr = (int[]) objL;
        if (i5 >= iArr.length) {
            objL = l(iArr);
        }
        int[] iArr2 = (int[]) objL;
        iArr2[i4] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.a = i5;
    }

    public final void d(int i, int i2, int i3, int i4) {
        int i5 = this.a;
        int i6 = i5 + 4;
        java.lang.Object objL = this.b;
        int[] iArr = (int[]) objL;
        if (i6 >= iArr.length) {
            objL = l(iArr);
        }
        int[] iArr2 = (int[]) objL;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.a = i6;
    }

    public final void e(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = (int[]) this.b;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    k(i3, i4);
                }
            }
            k(i3 + 3, i2);
            e(i, i3);
            e(i3 + 6, i2);
        }
    }

    public final boolean f(long j) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.b)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final void g(long j) {
        if (f(j)) {
            return;
        }
        int i = this.a;
        java.lang.Object objCopyOf = this.b;
        long[] jArr = (long[]) objCopyOf;
        int length = jArr.length;
        if (i >= length) {
            objCopyOf = java.util.Arrays.copyOf(jArr, java.lang.Math.max(i + 1, length << 1));
            defpackage.aooh.e(objCopyOf, "copyOf(...)");
            this.b = objCopyOf;
        }
        ((long[]) objCopyOf)[i] = j;
        if (i >= this.a) {
            this.a = i + 1;
        }
    }

    public final void h(long j) {
        int i = this.a;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.b)[i2]) {
                int i3 = this.a - 1;
                while (i2 < i3) {
                    int i4 = i2 + 1;
                    long[] jArr = (long[]) this.b;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.a--;
                return;
            }
            i2++;
        }
    }

    public final aizi i() {
        if (this.a == 0) {
            return aizi.a;
        }
        return new aizi((long[]) this.b, this.a);
    }

    public final void j(long j) {
        int i = this.a + 1;
        long[] jArr = (long[]) this.b;
        int length = jArr.length;
        if (i > length) {
            this.b = java.util.Arrays.copyOf(jArr, ajee.o(length, i));
        }
        java.lang.Object obj = this.b;
        int i2 = this.a;
        ((long[]) obj)[i2] = j;
        this.a = i2 + 1;
    }

    public vm() {
        this.a = 1;
    }

    public vm(byte[] bArr) {
        this.b = new long[2];
    }

    public vm(int i) {
        this.b = new int[i];
    }
}
