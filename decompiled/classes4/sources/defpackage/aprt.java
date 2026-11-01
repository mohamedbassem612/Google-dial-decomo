package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aprt extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    private final java.io.InputStream b;
    private final defpackage.aprr j;
    private final byte[] a = new byte[1];
    private int f = 0;
    private int g = 0;
    private boolean h = false;
    private final byte[] e = new byte[2048];
    private final defpackage.aptw c = new defpackage.aptw(512);
    private final defpackage.aptw d = new defpackage.aptw(512);
    private boolean i = false;

    public aprt(java.io.InputStream inputStream, defpackage.aprr aprrVar) {
        this.b = inputStream;
        this.j = aprrVar;
    }

    private final int a() {
        int i = this.f;
        if (i >= this.g) {
            return -1;
        }
        int i2 = i + 1;
        byte b = this.e[i];
        this.f = i2;
        return b & 255;
    }

    private final int b(int i) {
        int i2 = this.f + i;
        if (i2 < this.g) {
            return this.e[i2] & 255;
        }
        return -1;
    }

    private final int c(int i, byte[] bArr, int i2, int i3, boolean z) throws java.io.IOException {
        defpackage.aptw aptwVar;
        int i4;
        if (!z || (i4 = (aptwVar = this.d).b) <= 0) {
            defpackage.aptw aptwVar2 = this.d;
            if (aptwVar2.b > 0 && !z) {
                for (int i5 = 0; i5 < aptwVar2.b; i5++) {
                    aptwVar2.a(i5);
                }
                if (this.j.b()) {
                    throw new java.io.IOException("ignored blanks");
                }
            }
        } else {
            int iMin = java.lang.Math.min(i4, i3 - i2);
            java.lang.System.arraycopy(aptwVar.a, 0, bArr, i2, iMin);
            i2 += iMin;
            int i6 = aptwVar.b - iMin;
            if (i6 > 0) {
                this.c.c(aptwVar.a, iMin, i6);
            }
            aptwVar.d();
        }
        if (i == -1) {
            return i2;
        }
        if (i2 >= i3) {
            this.c.b(i);
            return i2;
        }
        int i7 = i2 + 1;
        bArr[i2] = (byte) i;
        return i7;
    }

    private static final int d(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i = true;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0147 A[PHI: r7
      0x0147: PHI (r7v5 int) = (r7v4 int), (r7v7 int) binds: [B:78:0x0140, B:80:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3;
        defpackage.aprt aprtVar;
        byte[] bArr2;
        int i4;
        if (this.i) {
            throw new java.io.IOException("Stream has been closed");
        }
        int i5 = i + i2;
        defpackage.aptw aptwVar = this.c;
        int i6 = aptwVar.b;
        if (i6 > 0) {
            int iMin = java.lang.Math.min(i6, i5 - i);
            java.lang.System.arraycopy(aptwVar.a, 0, bArr, i, iMin);
            aptwVar.f(iMin);
            i3 = iMin + i;
        } else {
            i3 = i;
        }
        boolean z = false;
        while (i3 < i5) {
            int i7 = this.g;
            int i8 = this.f;
            int i9 = i7 - i8;
            if (i9 < 3) {
                if (i8 < i7) {
                    byte[] bArr3 = this.e;
                    java.lang.System.arraycopy(bArr3, i8, bArr3, 0, i9);
                    i4 = this.g - this.f;
                    this.g = i4;
                    this.f = 0;
                } else {
                    this.g = 0;
                    this.f = 0;
                    i4 = 0;
                }
                byte[] bArr4 = this.e;
                int length = bArr4.length;
                int i10 = 2048 - i4;
                if (i10 <= 0) {
                    z = false;
                } else {
                    int i11 = this.b.read(bArr4, i4, i10);
                    if (i11 > 0) {
                        this.g += i11;
                    }
                    if (i11 == -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            if (this.g - this.f == 0 && z) {
                if (i3 != i) {
                    return i3 - i;
                }
                return -1;
            }
            int iC = i3;
            while (true) {
                int i12 = this.f;
                if (i12 >= this.g || iC >= i5) {
                    aprtVar = this;
                    bArr2 = bArr;
                    break;
                }
                byte[] bArr5 = this.e;
                this.f = i12 + 1;
                int i13 = bArr5[i12] & 255;
                if (!this.h) {
                    aprtVar = this;
                    bArr2 = bArr;
                    if (i13 == 10 && aprtVar.j.b()) {
                        throw new java.io.IOException("Found LF without CR");
                    }
                } else if (i13 == 10) {
                    aprtVar = this;
                    bArr2 = bArr;
                } else {
                    if (this.j.b()) {
                        throw new java.io.IOException("Found CR without LF");
                    }
                    aprtVar = this;
                    bArr2 = bArr;
                    iC = aprtVar.c(13, bArr2, iC, i5, false);
                }
                if (i13 == 13) {
                    aprtVar.h = true;
                } else {
                    aprtVar.h = false;
                    if (i13 == 10) {
                        defpackage.aptw aptwVar2 = aprtVar.d;
                        if (aptwVar2.b == 0 || aptwVar2.a(0) != 61) {
                            int iC2 = aprtVar.c(10, bArr2, aprtVar.c(13, bArr2, iC, i5, false), i5, false);
                            iC = iC2;
                        }
                        aptwVar2.d();
                    } else if (i13 == 61) {
                        int i14 = aprtVar.g;
                        int i15 = aprtVar.f;
                        if (i14 - i15 < 2 && !z) {
                            aprtVar.f = i15 - 1;
                            break;
                        }
                        int iA = aprtVar.a();
                        if (iA == 61) {
                            iC = aprtVar.c(61, bArr2, iC, i5, true);
                            int iB = aprtVar.b(0);
                            int iB2 = aprtVar.b(1);
                            if (iB == 10 || (iB == 13 && iB2 == 10)) {
                                aprtVar.j.b();
                                aprtVar.d.b(61);
                            } else {
                                aprtVar.j.b();
                            }
                        } else if (java.lang.Character.isWhitespace((char) iA)) {
                            int iB3 = aprtVar.b(0);
                            if (iA == 13) {
                                iA = 13;
                                if (iB3 == 10) {
                                    iB3 = 10;
                                } else if (aprtVar.j.b()) {
                                    throw new java.io.IOException("Non-standard soft line break");
                                }
                            } else if (aprtVar.j.b()) {
                                throw new java.io.IOException("Non-standard soft line break");
                            }
                            if (iB3 == 10) {
                                aprtVar.h = iA == 13;
                            }
                            iC = aprtVar.c(-1, bArr2, iC, i5, true);
                            if (iA != 10) {
                                defpackage.aptw aptwVar3 = aprtVar.d;
                                aptwVar3.b(61);
                                aptwVar3.b(iA);
                            }
                        } else {
                            int iA2 = aprtVar.a();
                            int iD = d(iA);
                            int iD2 = d(iA2);
                            if (iD < 0 || iD2 < 0) {
                                aprtVar.j.b();
                                iC = aprtVar.c(iA2, bArr2, aprtVar.c(iA, bArr2, aprtVar.c(61, bArr2, iC, i5, true), i5, false), i5, false);
                            } else {
                                iC = aprtVar.c(iD2 | (iD << 4), bArr2, iC, i5, true);
                            }
                        }
                    } else if (java.lang.Character.isWhitespace(i13)) {
                        aprtVar.d.b(i13);
                    } else {
                        iC = aprtVar.c(i13, bArr2, iC, i5, true);
                    }
                }
                this = aprtVar;
                bArr = bArr2;
            }
            this = aprtVar;
            bArr = bArr2;
            i3 = iC;
        }
        return i5 - i;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        byte[] bArr;
        int i;
        if (!this.i) {
            do {
                bArr = this.a;
                i = read(bArr, 0, 1);
                if (i == -1) {
                    return -1;
                }
            } while (i != 1);
            return bArr[0] & 255;
        }
        throw new java.io.IOException("Stream has been closed");
    }
}
