package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fcc extends defpackage.esk {
    public boolean d;
    public long e;
    private int f;
    private int g;
    private byte[] i;
    private byte[] l;
    private int h = 0;
    private int j = 0;
    private int k = 0;

    public fcc() {
        byte[] bArr = eum.b;
        this.i = bArr;
        this.l = bArr;
    }

    private final int p(int i) {
        int i2 = this.f;
        return (i / i2) * i2;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    private final int q(int i) {
        int iR = ((r(2000000L) - this.h) * this.f) - (this.i.length >> 1);
        ahvr.bY((boolean) ((iR ^ (-1)) >>> 31));
        return p((int) java.lang.Math.min((i * 0.2f) + 0.5f, iR));
    }

    private final int r(long j) {
        return (int) ((j * ((long) this.b.b)) / 1000000);
    }

    private final void s(boolean z) {
        int i;
        int length;
        int i2 = this.k;
        int length2 = this.i.length;
        if (i2 != length2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (this.h == 0) {
            if (z) {
                t(i2, 3);
                length = i2;
            } else {
                ahvr.bY(i2 >= (length2 >> 1));
                length = this.i.length >> 1;
                t(length, 0);
            }
            i = length;
        } else {
            int i3 = length2 >> 1;
            int i4 = i2 - i3;
            if (z) {
                int iQ = q(i4) + (this.i.length >> 1);
                t(iQ, 2);
                int i5 = i3 + i4;
                i = iQ;
                length = i5;
            } else {
                int iQ2 = q(i4);
                t(iQ2, 1);
                i = iQ2;
                length = i4;
            }
        }
        ahvr.ca(length % this.f == 0, "bytesConsumed is not aligned to frame size: %s", length);
        ahvr.bY(i2 >= i);
        this.k -= length;
        int i6 = this.j + length;
        this.j = i6;
        this.j = i6 % this.i.length;
        int i7 = this.h;
        int i8 = this.f;
        this.h = i7 + (i / i8);
        this.e += (long) ((length - i) / i8);
    }

    private final void t(int i, int i2) {
        if (i != 0) {
            ahvr.bM(this.k >= i);
            int i3 = this.j;
            if (i2 == 2) {
                int i4 = this.k;
                int i5 = i3 + i4;
                byte[] bArr = this.i;
                int length = bArr.length;
                if (i5 <= length) {
                    java.lang.System.arraycopy(bArr, i5 - i, this.l, 0, i);
                } else {
                    int i6 = i4 - (length - i3);
                    byte[] bArr2 = this.l;
                    if (i6 >= i) {
                        java.lang.System.arraycopy(bArr, i6 - i, bArr2, 0, i);
                    } else {
                        int i7 = i - i6;
                        java.lang.System.arraycopy(bArr, length - i7, bArr2, 0, i7);
                        java.lang.System.arraycopy(this.i, 0, this.l, i7, i6);
                    }
                }
            } else {
                int i8 = i3 + i;
                byte[] bArr3 = this.i;
                int length2 = bArr3.length;
                byte[] bArr4 = this.l;
                if (i8 <= length2) {
                    java.lang.System.arraycopy(bArr3, i3, bArr4, 0, i);
                } else {
                    int i9 = length2 - i3;
                    java.lang.System.arraycopy(bArr3, i3, bArr4, 0, i9);
                    java.lang.System.arraycopy(this.i, 0, this.l, i9, i - i9);
                }
            }
            ahvr.bP(i % this.f == 0, "sizeToOutput is not aligned to frame size: %s", i);
            ahvr.bY(this.j < this.i.length);
            byte[] bArr5 = this.l;
            ahvr.bP(i % this.f == 0, "byteOutput size is not aligned to frame size %s", i);
            if (i2 != 3) {
                int i10 = (i / this.f) - 1;
                for (int i11 = 0; i11 < i; i11 += 2) {
                    int i12 = i11 + 1;
                    byte b = bArr5[i12];
                    int i13 = bArr5[i11] & 255;
                    int i14 = b << 8;
                    int i15 = 10;
                    if (i2 == 0) {
                        int i16 = i11 / this.f;
                        if (i10 != 0) {
                            i15 = ((((i16 * 1000) / i10) * (-90)) / 1000) + 100;
                        }
                    } else if (i2 == 2) {
                        i15 = i10 == 0 ? 100 : 10 + ((((i11 / this.f) * 90000) / i10) / 1000);
                    }
                    int i17 = ((i13 | i14) * i15) / 100;
                    if (i17 >= 32767) {
                        bArr5[i11] = -1;
                        bArr5[i12] = 127;
                    } else if (i17 <= -32768) {
                        bArr5[i11] = 0;
                        bArr5[i12] = -128;
                    } else {
                        bArr5[i11] = (byte) (i17 & 255);
                        bArr5[i12] = (byte) (i17 >> 8);
                    }
                }
            }
            k(i).put(bArr5, 0, i).flip();
        }
    }

    private static final boolean u(byte b, byte b2) {
        return java.lang.Math.abs((b2 & 255) | (b << 8)) > 1024;
    }

    @Override // defpackage.esj
    public final void e(java.nio.ByteBuffer byteBuffer) {
        int iLimit;
        int i;
        int iPosition;
        while (byteBuffer.hasRemaining() && !n()) {
            if (this.g != 0) {
                ahvr.bY(this.j < this.i.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (u(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i2 = this.f;
                            iLimit = i2 * (iPosition2 / i2);
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i3 = this.j;
                int i4 = this.k;
                int i5 = i3 + i4;
                int length = this.i.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int iMin = java.lang.Math.min(iPosition3, i);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.i, i5, iMin);
                int i6 = this.k + iMin;
                this.k = i6;
                ahvr.bY(i6 <= this.i.length);
                boolean z = iLimit < iLimit2 && iPosition3 < i;
                s(z);
                if (z) {
                    this.g = 0;
                    this.h = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(java.lang.Math.min(iLimit3, byteBuffer.position() + this.i.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (u(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i7 = this.f;
                            iPosition = ((iLimit4 / i7) * i7) + i7;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.g = 1;
                } else {
                    byteBuffer.limit(java.lang.Math.min(iPosition, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // defpackage.esk, defpackage.esj
    public final boolean g() {
        return super.g() && this.d;
    }

    @Override // defpackage.esk
    protected final defpackage.esf j(defpackage.esf esfVar) throws defpackage.esi {
        if (esfVar.d == 2) {
            return esfVar.b == -1 ? defpackage.esf.a : esfVar;
        }
        throw new defpackage.esi("Unhandled input format:", esfVar);
    }

    @Override // defpackage.esk
    public final void l() {
        if (this.k > 0) {
            s(true);
            this.h = 0;
        }
    }

    @Override // defpackage.esk
    public final void m() {
        this.d = false;
        byte[] bArr = eum.b;
        this.i = bArr;
        this.l = bArr;
    }

    @Override // defpackage.esk
    public final void o() {
        if (g()) {
            this.f = this.b.c << 1;
            int iP = p((r(100000L) * this.f) / 2) << 1;
            if (this.i.length != iP) {
                this.i = new byte[iP];
                this.l = new byte[iP];
            }
        }
        this.g = 0;
        this.e = 0L;
        this.h = 0;
        this.j = 0;
        this.k = 0;
    }
}
