package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apsv {
    int c;
    protected final java.io.Reader k;
    public int d = -1;
    protected int g = 0;
    protected int h = 1;
    protected boolean i = false;
    protected boolean j = false;
    protected int m = 0;
    protected int n = 0;
    int a = 4096;
    int b = 4096;
    protected char[] l = new char[4096];
    protected int[] e = new int[4096];
    protected int[] f = new int[4096];

    public apsv(java.io.Reader reader) {
        this.k = reader;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c0  */
    public final char a() throws java.io.IOException {
        int i = this.n;
        int i2 = 0;
        if (i > 0) {
            this.n = i - 1;
            int i3 = this.d + 1;
            this.d = i3;
            if (i3 == this.a) {
                this.d = 0;
            } else {
                i2 = i3;
            }
            return this.l[i2];
        }
        int i4 = this.d + 1;
        this.d = i4;
        int i5 = this.m;
        if (i4 >= i5) {
            int i6 = this.b;
            if (i5 == i6) {
                int i7 = this.a;
                int i8 = this.c;
                if (i6 == i7) {
                    if (i8 > 2048) {
                        this.m = 0;
                        this.d = 0;
                        this.b = i8;
                    } else if (i8 < 0) {
                        this.m = 0;
                        this.d = 0;
                    } else {
                        e(false);
                    }
                } else if (i6 > i8) {
                    this.b = i7;
                } else if (i8 - i6 < 2048) {
                    e(true);
                } else {
                    this.b = i8;
                }
            }
            try {
                java.io.Reader reader = this.k;
                char[] cArr = this.l;
                int i9 = this.m;
                int i10 = reader.read(cArr, i9, this.b - i9);
                if (i10 == -1) {
                    reader.close();
                    throw new java.io.IOException();
                }
                this.m += i10;
            } catch (java.io.IOException e) {
                this.d--;
                f(0);
                if (this.c == -1) {
                    this.c = this.d;
                }
                throw e;
            }
        }
        char[] cArr2 = this.l;
        int i11 = this.d;
        char c = cArr2[i11];
        int i12 = this.g + 1;
        this.g = i12;
        if (!this.j) {
            if (this.i) {
                this.i = false;
                if (c != '\n') {
                    int i13 = this.h;
                    this.g = 1;
                    this.h = i13 + 1;
                }
                this.e[i11] = this.h;
                this.f[i11] = i12;
                return c;
            }
            if (c != '\t') {
                int i14 = i12 - 1;
                i12 = i14 + (8 - (i14 % 8));
                this.g = i12;
            } else if (c == '\n') {
                if (c == '\r') {
                    this.i = true;
                }
            }
            this.e[i11] = this.h;
            this.f[i11] = i12;
            return c;
            this.j = true;
            this.e[i11] = this.h;
            this.f[i11] = i12;
            return c;
        }
        this.j = false;
        int i15 = this.h;
        this.g = 1;
        this.h = i15 + 1;
        i12 = 1;
        if (c != '\t') {
            int i16 = i12 - 1;
            i12 = i16 + (8 - (i16 % 8));
            this.g = i12;
        } else if (c == '\n') {
            this.j = true;
        } else if (c == '\r') {
            this.i = true;
        }
        this.e[i11] = this.h;
        this.f[i11] = i12;
        return c;
    }

    public final int b() {
        return this.f[this.d];
    }

    public final int c() {
        return this.e[this.d];
    }

    public final java.lang.String d() {
        int i = this.d;
        int i2 = this.c;
        char[] cArr = this.l;
        return i >= i2 ? new java.lang.String(cArr, i2, (i - i2) + 1) : new java.lang.String(cArr, i2, this.a - i2).concat(new java.lang.String(cArr, 0, i + 1));
    }

    protected final void e(boolean z) {
        int i = this.a;
        int i2 = i + 2048;
        char[] cArr = new char[i2];
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        try {
            char[] cArr2 = this.l;
            if (z) {
                int i3 = this.c;
                java.lang.System.arraycopy(cArr2, i3, cArr, 0, i - i3);
                java.lang.System.arraycopy(this.l, 0, cArr, this.a - this.c, this.d);
                this.l = cArr;
                int[] iArr3 = this.e;
                int i4 = this.c;
                java.lang.System.arraycopy(iArr3, i4, iArr, 0, this.a - i4);
                java.lang.System.arraycopy(this.e, 0, iArr, this.a - this.c, this.d);
                this.e = iArr;
                int[] iArr4 = this.f;
                int i5 = this.c;
                java.lang.System.arraycopy(iArr4, i5, iArr2, 0, this.a - i5);
                java.lang.System.arraycopy(this.f, 0, iArr2, this.a - this.c, this.d);
                this.f = iArr2;
                int i6 = this.d + (this.a - this.c);
                this.d = i6;
                this.m = i6;
            } else {
                int i7 = this.c;
                java.lang.System.arraycopy(cArr2, i7, cArr, 0, i - i7);
                this.l = cArr;
                int[] iArr5 = this.e;
                int i8 = this.c;
                java.lang.System.arraycopy(iArr5, i8, iArr, 0, this.a - i8);
                this.e = iArr;
                int[] iArr6 = this.f;
                int i9 = this.c;
                java.lang.System.arraycopy(iArr6, i9, iArr2, 0, this.a - i9);
                this.f = iArr2;
                int i10 = this.d - this.c;
                this.d = i10;
                this.m = i10;
            }
            int i11 = this.a + 2048;
            this.a = i11;
            this.b = i11;
            this.c = 0;
        } catch (java.lang.Throwable th) {
            throw new java.lang.Error(th.getMessage());
        }
    }

    public final void f(int i) {
        this.n += i;
        int i2 = this.d - i;
        this.d = i2;
        if (i2 < 0) {
            this.d = i2 + this.a;
        }
    }

    public final char[] g(int i) {
        char[] cArr = new char[i];
        int i2 = this.d;
        int i3 = i2 + 1;
        char[] cArr2 = this.l;
        if (i3 >= i) {
            java.lang.System.arraycopy(cArr2, (i2 - i) + 1, cArr, 0, i);
        } else {
            int i4 = (i - i2) - 1;
            java.lang.System.arraycopy(cArr2, this.a - i4, cArr, 0, i4);
            char[] cArr3 = this.l;
            int i5 = this.d;
            java.lang.System.arraycopy(cArr3, 0, cArr, (i - i5) - 1, i5 + 1);
        }
        return cArr;
    }
}
