package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fgr {
    public final defpackage.fio a;
    public final defpackage.etx b = new defpackage.etx(32);
    public defpackage.fgq c;
    public defpackage.fgq d;
    public defpackage.fgq e;
    public long f;

    public fgr(defpackage.fio fioVar) {
        this.a = fioVar;
        defpackage.fgq fgqVar = new defpackage.fgq(0L);
        this.c = fgqVar;
        this.d = fgqVar;
        this.e = fgqVar;
    }

    public static defpackage.fgq b(defpackage.fgq fgqVar, defpackage.ewu ewuVar, defpackage.fgs fgsVar, defpackage.etx etxVar) {
        if (ewuVar.dL(1073741824)) {
            long j = fgsVar.b;
            int iS = 1;
            etxVar.M(1);
            defpackage.fgq fgqVarI = i(fgqVar, j, etxVar.b, 1);
            long j2 = j + 1;
            byte b = etxVar.b[0];
            int i = b & 128;
            int i2 = b & 127;
            defpackage.ewq ewqVar = ewuVar.c;
            byte[] bArr = ewqVar.a;
            if (bArr == null) {
                ewqVar.a = new byte[16];
            } else {
                java.util.Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            fgqVar = i(fgqVarI, j2, ewqVar.a, i2);
            long j3 = j2 + ((long) i2);
            if (z) {
                etxVar.M(2);
                fgqVar = i(fgqVar, j3, etxVar.b, 2);
                j3 += 2;
                iS = etxVar.s();
            }
            int[] iArr = ewqVar.d;
            if (iArr == null || iArr.length < iS) {
                iArr = new int[iS];
            }
            int[] iArr2 = ewqVar.e;
            if (iArr2 == null || iArr2.length < iS) {
                iArr2 = new int[iS];
            }
            if (z) {
                int i3 = iS * 6;
                etxVar.M(i3);
                fgqVar = i(fgqVar, j3, etxVar.b, i3);
                j3 += (long) i3;
                etxVar.Q(0);
                for (int i4 = 0; i4 < iS; i4++) {
                    iArr[i4] = etxVar.s();
                    iArr2[i4] = etxVar.q();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = fgsVar.a - ((int) (j3 - fgsVar.b));
            }
            defpackage.fmj fmjVar = fgsVar.c;
            java.lang.String str = eum.a;
            byte[] bArr2 = fmjVar.b;
            byte[] bArr3 = ewqVar.a;
            int i5 = fmjVar.a;
            int i6 = fmjVar.c;
            int i7 = fmjVar.d;
            ewqVar.f = iS;
            ewqVar.d = iArr;
            ewqVar.e = iArr2;
            ewqVar.b = bArr2;
            ewqVar.c = i5;
            ewqVar.g = i6;
            ewqVar.h = i7;
            android.media.MediaCodec.CryptoInfo cryptoInfo = ewqVar.i;
            cryptoInfo.numSubSamples = iS;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            android.media.MediaCodec.CryptoInfo.Pattern pattern = ewqVar.j;
            fh$.ExternalSyntheticApiModelOutline0.m(pattern, i6, i7);
            fh$.ExternalSyntheticApiModelOutline0.m(cryptoInfo, pattern);
            long j4 = fgsVar.b;
            int i8 = (int) (j3 - j4);
            fgsVar.b = j4 + ((long) i8);
            fgsVar.a -= i8;
        }
        if (!ewuVar.dL(268435456)) {
            ewuVar.d(fgsVar.a);
            return h(fgqVar, fgsVar.b, ewuVar.d, fgsVar.a);
        }
        etxVar.M(4);
        defpackage.fgq fgqVarI2 = i(fgqVar, fgsVar.b, etxVar.b, 4);
        int iQ = etxVar.q();
        fgsVar.b += 4;
        fgsVar.a -= 4;
        ewuVar.d(iQ);
        defpackage.fgq fgqVarH = h(fgqVarI2, fgsVar.b, ewuVar.d, iQ);
        fgsVar.b += (long) iQ;
        int i9 = fgsVar.a - iQ;
        fgsVar.a = i9;
        ewuVar.f(i9);
        return h(fgqVarH, fgsVar.b, ewuVar.g, fgsVar.a);
    }

    private static defpackage.fgq g(defpackage.fgq fgqVar, long j) {
        while (j >= fgqVar.b) {
            fgqVar = fgqVar.c;
        }
        return fgqVar;
    }

    private static defpackage.fgq h(defpackage.fgq fgqVar, long j, java.nio.ByteBuffer byteBuffer, int i) {
        defpackage.fgq fgqVarG = g(fgqVar, j);
        while (i > 0) {
            int iMin = java.lang.Math.min(i, (int) (fgqVarG.b - j));
            byteBuffer.put((byte[]) fgqVarG.d.b, fgqVarG.a(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == fgqVarG.b) {
                fgqVarG = fgqVarG.c;
            }
        }
        return fgqVarG;
    }

    private static defpackage.fgq i(defpackage.fgq fgqVar, long j, byte[] bArr, int i) {
        defpackage.fgq fgqVarG = g(fgqVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = java.lang.Math.min(i2, (int) (fgqVarG.b - j));
            java.lang.System.arraycopy(fgqVarG.d.b, fgqVarG.a(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == fgqVarG.b) {
                fgqVarG = fgqVarG.c;
            }
        }
        return fgqVarG;
    }

    public final int a(int i) {
        defpackage.fgq fgqVar = this.e;
        if (fgqVar.d == null) {
            amwp amwpVarC = this.a.c();
            defpackage.fgq fgqVar2 = new defpackage.fgq(this.e.b);
            fgqVar.d = amwpVarC;
            fgqVar.c = fgqVar2;
        }
        return java.lang.Math.min(i, (int) (this.e.b - this.f));
    }

    public final void c(defpackage.fgq fgqVar) {
        if (fgqVar.d != null) {
            this.a.b(fgqVar);
            fgqVar.b();
        }
    }

    public final void d(long j) {
        defpackage.fgq fgqVar;
        if (j != -1) {
            while (true) {
                fgqVar = this.c;
                if (j < fgqVar.b) {
                    break;
                }
                this.a.d(fgqVar.d);
                this.c = this.c.b();
            }
            if (this.d.a < fgqVar.a) {
                this.d = fgqVar;
            }
        }
    }

    public final void e(long j) {
        ahvr.bM(j <= this.f);
        this.f = j;
        if (j != 0) {
            defpackage.fgq fgqVar = this.c;
            if (j != fgqVar.a) {
                while (this.f > fgqVar.b) {
                    fgqVar = fgqVar.c;
                }
                defpackage.fgq fgqVar2 = fgqVar.c;
                ahvr.ci(fgqVar2);
                c(fgqVar2);
                fgqVar.c = new defpackage.fgq(fgqVar.b);
                this.e = this.f == fgqVar.b ? fgqVar.c : fgqVar;
                if (this.d == fgqVar2) {
                    this.d = fgqVar.c;
                    return;
                }
                return;
            }
        }
        c(this.c);
        defpackage.fgq fgqVar3 = new defpackage.fgq(this.f);
        this.c = fgqVar3;
        this.d = fgqVar3;
        this.e = fgqVar3;
    }

    public final void f(int i) {
        long j = this.f + ((long) i);
        this.f = j;
        defpackage.fgq fgqVar = this.e;
        if (j == fgqVar.b) {
            this.e = fgqVar.c;
        }
    }
}
