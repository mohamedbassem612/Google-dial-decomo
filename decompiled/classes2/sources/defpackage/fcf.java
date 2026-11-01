package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fcf extends defpackage.esk {
    public long d;
    private int e;
    private int f;
    private boolean g;
    private int h;
    private byte[] i = eum.b;
    private int j;
    private boolean k;

    @Override // defpackage.esk, defpackage.esj
    public final long a(long j) {
        if (this.b.equals(defpackage.esf.a)) {
            return j;
        }
        int i = this.e;
        if (i == 0) {
            if (this.f == 0) {
                return j;
            }
            i = 0;
        }
        return java.lang.Math.max(0L, j - eum.y(this.f + i, this.b.b));
    }

    @Override // defpackage.esk, defpackage.esj
    public final java.nio.ByteBuffer c() {
        int i;
        if (super.h() && (i = this.j) > 0) {
            k(i).put(this.i, 0, this.j).flip();
            this.j = 0;
        }
        return super.c();
    }

    @Override // defpackage.esj
    public final void e(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i != 0) {
            int iMin = java.lang.Math.min(i, this.h);
            this.d += (long) (iMin / this.b.e);
            this.h -= iMin;
            byteBuffer.position(iPosition + iMin);
            int i2 = i - iMin;
            if (i2 != 0) {
                this.k = false;
                int length = this.g ? this.i.length : this.f * this.b.e;
                int iMax = java.lang.Math.max(0, (this.j + i2) - length);
                java.nio.ByteBuffer byteBufferK = k(iMax);
                int iC = eum.c(iMax, 0, this.j);
                byteBufferK.put(this.i, 0, iC);
                int iC2 = eum.c(iMax - iC, 0, i2);
                byteBuffer.limit(byteBuffer.position() + iC2);
                byteBufferK.put(byteBuffer);
                byteBuffer.limit(iLimit);
                int i3 = i2 - iC2;
                int i4 = this.j - iC;
                this.j = i4;
                byte[] bArr = this.i;
                java.lang.System.arraycopy(bArr, iC, bArr, 0, i4);
                byte[] bArrCopyOf = this.i;
                if (bArrCopyOf.length != length) {
                    bArrCopyOf = java.util.Arrays.copyOf(bArrCopyOf, length);
                    this.i = bArrCopyOf;
                }
                byteBuffer.get(bArrCopyOf, this.j, i3);
                this.j += i3;
                byteBufferK.flip();
            }
        }
    }

    @Override // defpackage.esk, defpackage.esj
    public final boolean g() {
        if (super.g()) {
            return (this.e != 0 && (this.g || this.h > 0)) || this.f != 0 || this.j > 0 || n();
        }
        return false;
    }

    @Override // defpackage.esk, defpackage.esj
    public final boolean h() {
        return super.h() && this.j == 0;
    }

    @Override // defpackage.esk
    public final defpackage.esf j(defpackage.esf esfVar) throws defpackage.esi {
        if (!eum.U(esfVar.d)) {
            throw new defpackage.esi("Unhandled input format:", esfVar);
        }
        this.g = true;
        return esfVar;
    }

    @Override // defpackage.esk
    protected final void l() {
        int iMin;
        if (this.k || (iMin = this.j) <= 0) {
            return;
        }
        this.k = true;
        if (!this.g) {
            iMin = java.lang.Math.min(iMin, this.f * this.b.e);
        }
        this.d += (long) (iMin / this.b.e);
        this.j -= iMin;
    }

    @Override // defpackage.esk
    protected final void m() {
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = 0;
        this.i = eum.b;
        this.j = 0;
        this.k = false;
    }

    @Override // defpackage.esk
    protected final void o() {
        if (this.g) {
            this.g = false;
            this.h = this.e * this.b.e;
        }
        this.j = 0;
        this.k = false;
        if (g()) {
            this.i = new byte[this.f * this.b.e];
        } else {
            this.i = eum.b;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public final void p(int i, int i2) {
        ahvr.bM((boolean) ((i ^ (-1)) >>> 31));
        ahvr.bM((boolean) ((i2 ^ (-1)) >>> 31));
        this.e = i;
        this.f = i2;
    }
}
