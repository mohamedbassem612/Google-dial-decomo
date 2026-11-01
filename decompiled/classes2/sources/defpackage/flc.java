package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class flc implements defpackage.flk {
    public final long a;
    public long b;
    public int d;
    public int e;
    private final defpackage.epz g;
    public byte[] c = new byte[65536];
    private final byte[] f = new byte[4096];

    static {
        defpackage.equ.b("media3.extractor");
    }

    public flc(defpackage.epz epzVar, long j, long j2) {
        this.g = epzVar;
        this.b = j;
        this.a = j2;
    }

    private final int q(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        if (i3 == 0) {
            return 0;
        }
        int iMin = java.lang.Math.min(i3, i2);
        java.lang.System.arraycopy(this.c, 0, bArr, i, iMin);
        t(iMin);
        return iMin;
    }

    private final int r(int i) {
        int iMin = java.lang.Math.min(this.e, i);
        t(iMin);
        return iMin;
    }

    private final void s(int i) {
        if (i != -1) {
            this.b += (long) i;
        }
    }

    private final void t(int i) {
        int i2 = this.e - i;
        this.e = i2;
        this.d = 0;
        byte[] bArr = this.c;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        this.c = bArr2;
    }

    @Override // defpackage.flk, defpackage.epz
    public final int a(byte[] bArr, int i, int i2) {
        defpackage.flc flcVar;
        int iQ = q(bArr, i, i2);
        if (iQ == 0) {
            int iB = b(bArr, i, i2, 0, true);
            flcVar = this;
            iQ = iB;
        } else {
            flcVar = this;
        }
        flcVar.s(iQ);
        return iQ;
    }

    public final int b(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (java.lang.Thread.interrupted()) {
            throw new java.io.InterruptedIOException();
        }
        int iA = this.g.a(bArr, i + i3, i2 - i3);
        if (iA != -1) {
            return i3 + iA;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    @Override // defpackage.flk
    public final int c(int i) {
        defpackage.flc flcVar;
        int iR = r(i);
        if (iR == 0) {
            int iB = b(this.f, 0, java.lang.Math.min(i, 4096), 0, true);
            flcVar = this;
            iR = iB;
        } else {
            flcVar = this;
        }
        flcVar.s(iR);
        return iR;
    }

    @Override // defpackage.flk
    public final long d() {
        return this.a;
    }

    @Override // defpackage.flk
    public final long e() {
        return this.b + ((long) this.d);
    }

    @Override // defpackage.flk
    public final long f() {
        return this.b;
    }

    @Override // defpackage.flk
    public final void g(int i) {
        m(i, false);
    }

    public final void h(int i) {
        int i2 = this.d + i;
        int length = this.c.length;
        if (i2 > length) {
            this.c = java.util.Arrays.copyOf(this.c, eum.c(length << 1, 65536 + i2, i2 + 524288));
        }
    }

    @Override // defpackage.flk
    public final void i(byte[] bArr, int i, int i2) {
        n(bArr, i, i2, false);
    }

    @Override // defpackage.flk
    public final void j(byte[] bArr, int i, int i2) {
        o(bArr, i, i2, false);
    }

    @Override // defpackage.flk
    public final void k() {
        this.d = 0;
    }

    @Override // defpackage.flk
    public final void l(int i) {
        p(i, false);
    }

    @Override // defpackage.flk
    public final boolean m(int i, boolean z) {
        h(i);
        int iB = this.e - this.d;
        while (iB < i) {
            defpackage.flc flcVar = this;
            int i2 = i;
            boolean z2 = z;
            iB = flcVar.b(this.c, this.d, i2, iB, z2);
            if (iB == -1) {
                return false;
            }
            flcVar.e = flcVar.d + iB;
            this = flcVar;
            i = i2;
            z = z2;
        }
        this.d += i;
        return true;
    }

    @Override // defpackage.flk
    public final boolean n(byte[] bArr, int i, int i2, boolean z) {
        if (!m(i2, z)) {
            return false;
        }
        java.lang.System.arraycopy(this.c, this.d - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.flk
    public final boolean o(byte[] bArr, int i, int i2, boolean z) {
        int iQ = q(bArr, i, i2);
        while (iQ < i2 && iQ != -1) {
            iQ = b(bArr, i, i2, iQ, z);
        }
        s(iQ);
        return iQ != -1;
    }

    @Override // defpackage.flk
    public final void p(int i, boolean z) {
        int iR = r(i);
        while (iR < i && iR != -1) {
            iR = b(this.f, -iR, java.lang.Math.min(i, iR + 4096), iR, z);
        }
        s(iR);
    }
}
