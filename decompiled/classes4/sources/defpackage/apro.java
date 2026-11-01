package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apro extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    private static final int[] a = new int[256];
    private final java.io.InputStream c;
    private boolean i;
    private final defpackage.aprr j;
    private final byte[] b = new byte[1];
    private int f = 0;
    private int g = 0;
    private boolean h = false;
    private final byte[] d = new byte[1536];
    private final defpackage.aptw e = new defpackage.aptw(512);

    static {
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            a[i2] = -1;
        }
        while (true) {
            byte[] bArr = defpackage.aprp.a;
            int length = bArr.length;
            if (i >= 64) {
                return;
            }
            a[bArr[i] & 255] = i;
            i++;
        }
    }

    public apro(java.io.InputStream inputStream, defpackage.aprr aprrVar) {
        this.c = inputStream;
        this.j = aprrVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    private final int a(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3;
        int i4;
        defpackage.aptw aptwVar = this.e;
        int i5 = aptwVar.b;
        if (i5 > 0) {
            int iMin = java.lang.Math.min(i5, i2);
            java.lang.System.arraycopy(aptwVar.a, 0, bArr, i, iMin);
            aptwVar.f(iMin);
            i3 = iMin + i;
        } else {
            i3 = i;
        }
        if (this.i) {
            if (i3 == i) {
                break loop0;
            }
            return -1;
            i4 = i3;
        } else {
            int i6 = 0;
            int i7 = 0;
            loop0: while (true) {
                i4 = i + i2;
                if (i3 < i4) {
                    while (true) {
                        if (this.f == this.g) {
                            java.io.InputStream inputStream = this.c;
                            byte[] bArr2 = this.d;
                            int length = bArr2.length;
                            int i8 = inputStream.read(bArr2, 0, 1536);
                            if (i8 == -1) {
                                this.i = true;
                                if (i6 != 0 && this.j.b()) {
                                    throw new java.io.IOException("Unexpected end of BASE64 stream");
                                }
                                if (i3 == i) {
                                    break loop0;
                                }
                                return -1;
                            }
                            if (i8 > 0) {
                                this.f = 0;
                                this.g = i8;
                            }
                        } else {
                            while (true) {
                                int i9 = this.f;
                                if (i9 >= this.g || i3 >= i4) {
                                    break;
                                }
                                byte[] bArr3 = this.d;
                                this.f = i9 + 1;
                                int i10 = bArr3[i9] & 255;
                                if (i10 == 61) {
                                    this.i = true;
                                    if (i6 != 2) {
                                        if (i6 != 3) {
                                            if (!this.j.b()) {
                                                break loop0;
                                            }
                                            throw new java.io.IOException("Unexpected padding character");
                                        }
                                        byte b = (byte) ((i7 >>> 2) & 255);
                                        byte b2 = (byte) (i7 >>> 10);
                                        if (i3 >= i4 - 1) {
                                            if (i3 >= i4) {
                                                aptwVar.b(b2);
                                                aptwVar.b(b);
                                                break loop0;
                                            }
                                            i4 = i3 + 1;
                                            bArr[i3] = b2;
                                            aptwVar.b(b);
                                        } else {
                                            bArr[i3] = b2;
                                            i4 = i3 + 2;
                                            bArr[i3 + 1] = b;
                                        }
                                    } else {
                                        byte b3 = (byte) (i7 >>> 4);
                                        if (i3 >= i4) {
                                            aptwVar.b(b3);
                                            break loop0;
                                        }
                                        i4 = i3 + 1;
                                        bArr[i3] = b3;
                                    }
                                } else {
                                    int i11 = a[i10];
                                    if (i11 >= 0) {
                                        i6++;
                                        i7 = (i7 << 6) | i11;
                                        if (i6 == 4) {
                                            byte b4 = (byte) i7;
                                            byte b5 = (byte) (i7 >>> 8);
                                            byte b6 = (byte) (i7 >>> 16);
                                            if (i3 < i4 - 2) {
                                                bArr[i3] = b6;
                                                int i12 = i3 + 2;
                                                bArr[i3 + 1] = b5;
                                                i3 += 3;
                                                bArr[i12] = b4;
                                                i6 = 0;
                                            } else if (i3 < i4 - 1) {
                                                bArr[i3] = b6;
                                                bArr[i3 + 1] = b5;
                                                aptwVar.b(b4);
                                            } else if (i3 < i4) {
                                                bArr[i3] = b6;
                                                aptwVar.b(b5);
                                                aptwVar.b(b4);
                                            } else {
                                                aptwVar.b(b6);
                                                aptwVar.b(b5);
                                                aptwVar.b(b4);
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else if (i10 != 13 && i10 != 10 && i10 != 32 && this.j.b()) {
                                        throw new java.io.IOException("Unexpected base64 byte");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i4 = i3;
        }
        return i4 - i;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.h) {
            return;
        }
        this.h = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.h) {
            throw new java.io.IOException("Stream has been closed");
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        return a(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws java.io.IOException {
        if (!this.h) {
            bArr.getClass();
            int length = bArr.length;
            if (length != 0) {
                return a(bArr, 0, length);
            }
            return 0;
        }
        throw new java.io.IOException("Stream has been closed");
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        byte[] bArr;
        int iA;
        if (!this.h) {
            do {
                bArr = this.b;
                iA = a(bArr, 0, 1);
                if (iA == -1) {
                    return -1;
                }
            } while (iA != 1);
            return bArr[0] & 255;
        }
        throw new java.io.IOException("Stream has been closed");
    }
}
