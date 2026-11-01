package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fpd {
    public byte[] P;
    public defpackage.fml W;
    public boolean Y;
    public boolean Z;
    public boolean a;
    public boolean aa;
    public defpackage.fmk ad;
    public defpackage.eqg ae;
    public int af;
    public java.lang.String b;
    public java.lang.String c;
    public int d;
    public long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public byte[] k;
    public defpackage.fmj l;
    public byte[] m;
    public androidx.media3.common.DrmInitData n;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = 0;
    public int u = -1;
    public float v = 0.0f;
    public float w = 0.0f;
    public float x = 0.0f;
    public byte[] y = null;
    public int z = -1;
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public int D = 1000;
    public int E = 200;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public float N = -1.0f;
    public float O = -1.0f;
    public int Q = 1;
    public int R = -1;
    public int S = -1;
    public int T = 8000;
    public long U = 0;
    public long V = 0;
    public boolean X = false;
    public boolean ab = true;
    public java.lang.String ac = "eng";

    public static android.util.Pair a(defpackage.etx etxVar) throws defpackage.era {
        try {
            etxVar.R(16);
            long jU = etxVar.u();
            if (jU == 1482049860) {
                return new android.util.Pair("video/divx", null);
            }
            if (jU == 859189832) {
                return new android.util.Pair("video/3gpp", null);
            }
            if (jU != 826496599) {
                defpackage.etr.f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new android.util.Pair("video/x-unknown", null);
            }
            int i = etxVar.c + 20;
            byte[] bArr = etxVar.b;
            while (true) {
                int length = bArr.length;
                if (i >= length - 4) {
                    throw new defpackage.era("Failed to find FourCC VC1 initialization data", null, true, 1);
                }
                int i2 = i + 1;
                if (bArr[i] == 0 && bArr[i2] == 0 && bArr[i + 2] == 1 && bArr[i + 3] == 15) {
                    return new android.util.Pair("video/wvc1", java.util.Collections.singletonList(java.util.Arrays.copyOfRange(bArr, i, length)));
                }
                i = i2;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new defpackage.era("Error parsing FourCC private data", null, true, 1);
        }
    }

    public static java.util.List b(byte[] bArr) throws defpackage.era {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw new defpackage.era("Error parsing vorbis codec private", null, true, 1);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                int i5 = bArr[i4];
                i4++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i3 += 255;
            }
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i4];
                i4++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i4] != 1) {
                throw new defpackage.era("Error parsing vorbis codec private", null, true, 1);
            }
            byte[] bArr2 = new byte[i6];
            java.lang.System.arraycopy(bArr, i4, bArr2, 0, i6);
            int i10 = i4 + i6;
            if (bArr[i10] != 3) {
                throw new defpackage.era("Error parsing vorbis codec private", null, true, 1);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw new defpackage.era("Error parsing vorbis codec private", null, true, 1);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            java.lang.System.arraycopy(bArr, i11, bArr3, 0, length);
            java.util.ArrayList arrayList = new java.util.ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new defpackage.era("Error parsing vorbis codec private", null, true, 1);
        }
    }

    public final void c() {
        ahvr.ci(this.ad);
    }

    public final boolean d(defpackage.etx etxVar) throws defpackage.era {
        try {
            int iL = etxVar.l();
            if (iL == 1) {
                return true;
            }
            if (iL == 65534) {
                etxVar.Q(20);
                int iK = etxVar.k();
                if (defpackage.esv.h(iK, this.Q)) {
                    this.S = defpackage.esv.g(iK);
                }
                long jV = etxVar.v();
                java.util.UUID uuid = defpackage.fpe.b;
                if (jV == uuid.getMostSignificantBits() && etxVar.v() == uuid.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new defpackage.era("Error parsing MS/ACM codec private", null, true, 1);
        }
    }

    public final byte[] e(java.lang.String str) throws defpackage.era {
        byte[] bArr = this.m;
        if (bArr != null) {
            return bArr;
        }
        throw new defpackage.era("Missing CodecPrivate for codec ".concat(java.lang.String.valueOf(str)), null, true, 1);
    }
}
