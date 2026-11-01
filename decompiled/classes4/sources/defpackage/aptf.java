package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aptf extends defpackage.apta {
    public boolean a;
    public boolean b;
    public boolean c;
    public final defpackage.apsy d;
    public int e;
    private final byte[] f;
    private final boolean g;
    private int h;
    private boolean i;
    private int j;

    public aptf(defpackage.apsy apsyVar, java.lang.String str, boolean z) throws java.io.IOException {
        super(apsyVar);
        byte[] bArr = apsyVar.a;
        int length = bArr.length;
        int length2 = str.length() << 1;
        length2 = length2 < 4096 ? 4096 : length2;
        if (length2 > length) {
            byte[] bArr2 = new byte[length2];
            int iA = apsyVar.a();
            if (iA > 0) {
                int i = apsyVar.b;
                java.lang.System.arraycopy(bArr, i, bArr2, i, iA);
            }
            apsyVar.a = bArr2;
        }
        this.d = apsyVar;
        this.a = false;
        this.h = -1;
        this.i = false;
        this.j = 0;
        this.b = false;
        this.e = -1;
        this.c = false;
        this.g = false;
        byte[] bArr3 = new byte[str.length() + 2];
        this.f = bArr3;
        bArr3[0] = 45;
        bArr3[1] = 45;
        for (int i2 = 0; i2 < str.length(); i2++) {
            this.f[i2 + 2] = (byte) str.charAt(i2);
        }
        b();
    }

    private final int b() throws java.io.IOException {
        int iC;
        byte[] bArr;
        int i;
        int length;
        byte[] bArr2;
        if (this.a) {
            return -1;
        }
        if (g()) {
            iC = 0;
        } else {
            iC = this.d.c();
            if (iC == -1) {
                this.a = true;
            }
        }
        defpackage.apsy apsyVar = this.d;
        int length2 = apsyVar.b;
        while (true) {
            bArr = this.f;
            int i2 = apsyVar.c;
            int i3 = i2 - length2;
            if (bArr == null) {
                throw new java.lang.IllegalArgumentException("Pattern may not be null");
            }
            if (length2 < apsyVar.b || i3 < 0 || length2 + i3 > i2) {
                throw new java.lang.IndexOutOfBoundsException("looking for " + length2 + '(' + i3 + ") in " + apsyVar.b + '/' + apsyVar.c);
            }
            if (i3 < bArr.length) {
                i = -1;
                break;
            }
            int[] iArr = new int[256];
            for (int i4 = 0; i4 < 256; i4++) {
                iArr[i4] = bArr.length + 1;
            }
            int i5 = 0;
            while (true) {
                int length3 = bArr.length;
                if (i5 >= length3) {
                    break;
                }
                iArr[bArr[i5] & 255] = length3 - i5;
                i5++;
            }
            int i6 = 0;
            while (true) {
                if (i6 <= i3 - bArr.length) {
                    i = length2 + i6;
                    int i7 = 0;
                    while (true) {
                        length = bArr.length;
                        if (i7 >= length) {
                            break;
                        }
                        bArr2 = apsyVar.a;
                        if (bArr2[i + i7] != bArr[i7]) {
                            break;
                        }
                        i7++;
                    }
                    int i8 = i + length;
                    if (i8 < bArr2.length) {
                        i6 += iArr[bArr2[i8] & 255];
                    }
                }
                i = -1;
                break;
            }
            if (i == -1) {
                break;
            }
            if (i == apsyVar.b || apsyVar.b(i - 1) == 10) {
                int length4 = bArr.length + i;
                if (apsyVar.c - length4 <= 0) {
                    break;
                }
                int iB = apsyVar.b(length4);
                if (aodc.v((char) iB) || iB == 45) {
                    break;
                }
            }
            length2 = i + bArr.length;
        }
        if (i != -1) {
            this.h = i;
            this.i = true;
            this.j = bArr.length;
            int i9 = i - apsyVar.b;
            if (i9 >= 0 && this.e == -1) {
                this.e = i9;
            }
            if (i9 > 0 && apsyVar.b(i - 1) == 10) {
                this.j++;
                this.h--;
            }
            if (i9 > 1 && apsyVar.b(this.h - 1) == 13) {
                this.j++;
                this.h--;
            }
        } else {
            this.h = this.a ? apsyVar.c : apsyVar.c - (bArr.length + 2);
        }
        return iC;
    }

    private final void c() throws java.io.IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        defpackage.apsy apsyVar = this.d;
        apsyVar.g(this.j);
        boolean z = true;
        while (true) {
            if (apsyVar.a() > 1) {
                int iB = apsyVar.b(apsyVar.b);
                int iB2 = apsyVar.b(apsyVar.b + 1);
                if (z && iB == 45) {
                    if (iB2 == 45) {
                        this.b = true;
                        apsyVar.g(2);
                        z = false;
                    } else {
                        iB = 45;
                    }
                }
                if (iB == 13) {
                    if (iB2 == 10) {
                        apsyVar.g(2);
                        return;
                    }
                } else if (iB == 10) {
                    apsyVar.g(1);
                    return;
                }
                apsyVar.g(1);
            } else if (this.a) {
                return;
            } else {
                b();
            }
        }
    }

    private final boolean f() {
        return this.a || this.i;
    }

    private final boolean g() {
        int i = this.h;
        defpackage.apsy apsyVar = this.d;
        return i > apsyVar.b && i <= apsyVar.c;
    }

    public final boolean a() throws java.io.IOException {
        if (this.c) {
            return false;
        }
        if (!f() || g()) {
            return true;
        }
        c();
        e();
        return false;
    }

    @Override // defpackage.apta
    public final int d(defpackage.aptw aptwVar) throws java.io.IOException {
        boolean z;
        if (!a()) {
            return -1;
        }
        boolean z2 = false;
        int i = 0;
        int iB = 0;
        while (!z2) {
            if (!g()) {
                iB = b();
                if (f() && !g()) {
                    c();
                    e();
                    iB = -1;
                    break;
                }
            }
            int i2 = this.h;
            defpackage.apsy apsyVar = this.d;
            int i3 = apsyVar.b;
            int i4 = i2 - i3;
            int iF = apsyVar.f(i3, i4);
            if (iF != -1) {
                i4 = (iF + 1) - apsyVar.b;
                z = true;
            } else {
                z = false;
            }
            if (i4 > 0) {
                aptwVar.c(apsyVar.a, apsyVar.b, i4);
                apsyVar.g(i4);
                i += i4;
            }
            z2 = z;
        }
        if (i == 0) {
            return iB != -1 ? 0 : -1;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        while (a()) {
            if (g()) {
                int i3 = this.h;
                defpackage.apsy apsyVar = this.d;
                return apsyVar.read(bArr, i, java.lang.Math.min(i2, i3 - apsyVar.b));
            }
            b();
        }
        return -1;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MimeBoundaryInputStream, boundary ");
        for (byte b : this.f) {
            sb.append((char) b);
        }
        return sb.toString();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        while (a()) {
            if (g()) {
                return this.d.read();
            }
            b();
        }
        return -1;
    }

    private final void e() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
