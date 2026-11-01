package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apqa extends appb {
    public final transient byte[][] e;
    public final transient int[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apqa(byte[][] bArr, int[] iArr) {
        super(appb.a.b);
        aooh.f(bArr, "segments");
        this.e = bArr;
        this.f = iArr;
    }

    private final appb u() {
        return new appb(o());
    }

    private final java.lang.Object writeReplace() {
        return u();
    }

    public final byte a(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length;
        int[] iArr = this.f;
        aoov.aV(iArr[length - 1], i, 1L);
        int iQ = defpackage.antw.q(this, i);
        return bArr[iQ][(i - (iQ == 0 ? 0 : iArr[iQ - 1])) + iArr[length + iQ]];
    }

    public final int c() {
        return this.f[this.e.length - 1];
    }

    public final int e(byte[] bArr, int i) {
        aooh.f(bArr, "other");
        return u().e(bArr, i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof appb) {
            appb appbVar = (appb) obj;
            if (appbVar.c() == c() && r(0, appbVar, c())) {
                return true;
            }
        }
        return false;
    }

    public final int f(byte[] bArr, int i) {
        aooh.f(bArr, "other");
        return u().f(bArr, i);
    }

    public final java.lang.String g() {
        return u().g();
    }

    public final java.lang.String h(java.nio.charset.Charset charset) {
        aooh.f(charset, "charset");
        return u().h(charset);
    }

    public final int hashCode() {
        int i = ((appb) this).c;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        ((appb) this).c = i3;
        return i3;
    }

    public final appb j(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(a.bs(i, "beginIndex=", " < 0"));
        }
        if (i2 > c()) {
            throw new java.lang.IllegalArgumentException("endIndex=" + i2 + " > length(" + c() + ')');
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(a.bf(i, i2, "endIndex=", " < beginIndex="));
        }
        if (i == 0 && i2 == c()) {
            return this;
        }
        if (i == i2) {
            return appb.a;
        }
        int iQ = defpackage.antw.q(this, i);
        int iQ2 = defpackage.antw.q(this, i2 - 1);
        byte[][] bArr = this.e;
        byte[][] bArr2 = (byte[][]) ajsz.cA(bArr, iQ, iQ2 + 1);
        int[] iArr = new int[bArr2.length << 1];
        if (iQ <= iQ2) {
            int i4 = iQ;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f;
                iArr[i5] = java.lang.Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iQ2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iQ != 0 ? this.f[iQ - 1] : 0;
        int length = bArr2.length;
        iArr[length] = iArr[length] + (i - i7);
        return new defpackage.apqa(bArr2, iArr);
    }

    public final appb k() {
        return u().k();
    }

    public final boolean l(int i, byte[] bArr, int i2, int i3) {
        int i4;
        aooh.f(bArr, "other");
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int iQ = defpackage.antw.q(this, i);
        while (i < i5) {
            if (iQ == 0) {
                iQ = 0;
                i4 = 0;
            } else {
                i4 = this.f[iQ - 1];
            }
            int[] iArr = this.f;
            int i6 = iArr[iQ] - i4;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + iQ];
            int iMin = java.lang.Math.min(i5, i6 + i4) - i;
            if (!aoov.aW(bArr2[iQ], i7 + (i - i4), bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iQ++;
        }
        return true;
    }

    public final byte[] n() {
        return o();
    }

    public final byte[] o() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ajsz.cZ(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final boolean r(int i, appb appbVar, int i2) {
        int i3;
        aooh.f(appbVar, "other");
        if (i < 0 || i > c() - i2) {
            return false;
        }
        int i4 = i2 + i;
        int iQ = defpackage.antw.q(this, i);
        int i5 = 0;
        while (i < i4) {
            if (iQ == 0) {
                iQ = 0;
                i3 = 0;
            } else {
                i3 = this.f[iQ - 1];
            }
            int[] iArr = this.f;
            int i6 = iArr[iQ] - i3;
            byte[][] bArr = this.e;
            int i7 = iArr[bArr.length + iQ];
            int iMin = java.lang.Math.min(i4, i6 + i3) - i;
            if (!appbVar.l(i5, bArr[iQ], i7 + (i - i3), iMin)) {
                return false;
            }
            i5 += iMin;
            i += iMin;
            iQ++;
        }
        return true;
    }

    public final void t(apoy apoyVar, int i) {
        int i2;
        int iQ = defpackage.antw.q(this, 0);
        int i3 = 0;
        while (i3 < i) {
            if (iQ == 0) {
                iQ = 0;
                i2 = 0;
            } else {
                i2 = this.f[iQ - 1];
            }
            int[] iArr = this.f;
            int i4 = iArr[iQ] - i2;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + iQ];
            int iMin = java.lang.Math.min(i, i4 + i2) - i3;
            int i6 = i5 + (i3 - i2);
            appy appyVar = new appy(bArr[iQ], i6, i6 + iMin, true);
            appy appyVar2 = apoyVar.a;
            if (appyVar2 == null) {
                appyVar.g = appyVar;
                appyVar.f = appyVar.g;
                apoyVar.a = appyVar.f;
            } else {
                appy appyVar3 = appyVar2.g;
                aooh.c(appyVar3);
                appyVar3.d(appyVar);
            }
            i3 += iMin;
            iQ++;
        }
        apoyVar.b += (long) i;
    }

    public final java.lang.String toString() {
        return u().toString();
    }
}
