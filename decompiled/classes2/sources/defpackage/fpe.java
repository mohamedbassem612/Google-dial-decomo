package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fpe implements defpackage.flj {
    public static final java.util.Map c;
    private final defpackage.fpf D;
    private final android.util.SparseArray E;
    private final android.util.LongSparseArray F;
    private final boolean G;
    private final boolean H;
    private final boolean I;
    private final defpackage.frr J;
    private final defpackage.etx K;
    private final defpackage.etx L;
    private final defpackage.etx M;
    private final defpackage.etx N;
    private final defpackage.etx O;
    private final defpackage.etx P;
    private final defpackage.etx Q;
    private final defpackage.etx R;
    private final defpackage.etx S;
    private final defpackage.etx T;
    private java.nio.ByteBuffer U;
    private long V;
    private boolean W;
    private final android.util.SparseArray X;
    private int Y;
    private boolean Z;
    private long aa;
    private long ab;
    private long ac;
    private boolean ad;
    private int ae;
    private long af;
    private int ag;
    private int ah;
    private int[] ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private int as;
    private byte at;
    private boolean au;
    private defpackage.fll av;
    private final defpackage.foz aw;
    public long d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public final java.util.ArrayDeque i;
    public defpackage.fpd j;
    public boolean k;
    public int l;
    public long m;
    public boolean n;
    public long o;
    public int p;
    public long q;
    public long r;
    public long s;
    public boolean t;
    public boolean u;
    public long v;
    public long w;
    public int x;
    public boolean y;
    public long z;
    private static final byte[] A = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a = eum.Z("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] B = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] C = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final java.util.UUID b = new java.util.UUID(72057594037932032L, -9223371306706625679L);

    static {
        java.util.HashMap map = new java.util.HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        c = j$.util.DesugarCollections.unmodifiableMap(map);
    }

    public fpe(defpackage.frr frrVar, int i) {
        defpackage.foz fozVar = new defpackage.foz();
        this.e = -1L;
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.V = -9223372036854775807L;
        this.o = -9223372036854775807L;
        this.p = -1;
        this.q = -1L;
        this.r = -1L;
        this.Y = -1;
        this.aa = -1L;
        this.ab = -1L;
        this.s = -1L;
        this.ac = -1L;
        this.v = -9223372036854775807L;
        this.aw = fozVar;
        fozVar.g = new rai(this);
        this.J = frrVar;
        this.X = new android.util.SparseArray();
        this.G = 1 == ((i & 1) ^ 1);
        this.I = (i & 2) == 0;
        this.H = true;
        this.D = new defpackage.fpf();
        this.F = new android.util.LongSparseArray();
        this.i = new java.util.ArrayDeque();
        this.E = new android.util.SparseArray();
        this.M = new defpackage.etx(4);
        this.N = new defpackage.etx(java.nio.ByteBuffer.allocate(4).putInt(-1).array());
        this.O = new defpackage.etx(4);
        this.K = new defpackage.etx(defpackage.evc.a);
        this.L = new defpackage.etx(4);
        this.P = new defpackage.etx();
        this.Q = new defpackage.etx();
        this.R = new defpackage.etx(8);
        this.S = new defpackage.etx();
        this.T = new defpackage.etx();
        this.ai = new int[1];
        this.W = true;
    }

    private final int p() {
        int i = this.an;
        v();
        return i;
    }

    private final int q(defpackage.flk flkVar, defpackage.fpd fpdVar, int i, boolean z) throws defpackage.era {
        int i2;
        java.lang.String str = fpdVar.c;
        if ("S_TEXT/UTF8".equals(str)) {
            x(flkVar, A, i);
            return p();
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            x(flkVar, B, i);
            return p();
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            x(flkVar, C, i);
            return p();
        }
        if (fpdVar.X) {
            ahvr.ci(fpdVar.ae);
            fpdVar.ae = defpackage.fli.d(flkVar, i, fpdVar.ae);
            fpdVar.ad.p(fpdVar.ae);
            fpdVar.X = false;
            t();
        }
        defpackage.fmk fmkVar = fpdVar.ad;
        if (!this.ap) {
            if (fpdVar.j) {
                this.al &= -1073741825;
                if (!this.aq) {
                    defpackage.etx etxVar = this.M;
                    ((defpackage.flc) flkVar).o(etxVar.b, 0, 1, false);
                    this.am++;
                    byte b2 = etxVar.b[0];
                    if ((b2 & 128) == 128) {
                        throw new defpackage.era("Extension bit is set in signal byte", null, true, 1);
                    }
                    this.at = b2;
                    this.aq = true;
                }
                byte b3 = this.at;
                if ((b3 & 1) == 1) {
                    int i3 = b3 & 2;
                    this.al |= 1073741824;
                    if (!this.au) {
                        defpackage.etx etxVar2 = this.R;
                        ((defpackage.flc) flkVar).o(etxVar2.b, 0, 8, false);
                        this.am += 8;
                        this.au = true;
                        defpackage.etx etxVar3 = this.M;
                        etxVar3.b[0] = (byte) ((i3 != 2 ? 0 : 128) | 8);
                        etxVar3.Q(0);
                        fmkVar.c(etxVar3, 1, 1);
                        this.an++;
                        etxVar2.Q(0);
                        fmkVar.c(etxVar2, 8, 1);
                        this.an += 8;
                    }
                    if (i3 == 2) {
                        if (!this.ar) {
                            defpackage.etx etxVar4 = this.M;
                            ((defpackage.flc) flkVar).o(etxVar4.b, 0, 1, false);
                            this.am++;
                            etxVar4.Q(0);
                            this.as = etxVar4.n();
                            this.ar = true;
                        }
                        int i4 = this.as << 2;
                        defpackage.etx etxVar5 = this.M;
                        etxVar5.M(i4);
                        ((defpackage.flc) flkVar).o(etxVar5.b, 0, i4, false);
                        this.am += i4;
                        int i5 = (this.as >> 1) + 1;
                        int i6 = (i5 * 6) + 2;
                        java.nio.ByteBuffer byteBuffer = this.U;
                        if (byteBuffer == null || byteBuffer.capacity() < i6) {
                            this.U = java.nio.ByteBuffer.allocate(i6);
                        }
                        this.U.position(0);
                        this.U.putShort((short) i5);
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            i2 = this.as;
                            if (i7 >= i2) {
                                break;
                            }
                            int iQ = etxVar5.q();
                            int i9 = iQ - i8;
                            int i10 = i7 % 2;
                            java.nio.ByteBuffer byteBuffer2 = this.U;
                            if (i10 == 0) {
                                byteBuffer2.putShort((short) i9);
                            } else {
                                byteBuffer2.putInt(i9);
                            }
                            i7++;
                            i8 = iQ;
                        }
                        int i11 = (i - this.am) - i8;
                        int i12 = i2 & 1;
                        java.nio.ByteBuffer byteBuffer3 = this.U;
                        if (i12 == 1) {
                            byteBuffer3.putInt(i11);
                        } else {
                            byteBuffer3.putShort((short) i11);
                            this.U.putInt(0);
                        }
                        defpackage.etx etxVar6 = this.S;
                        etxVar6.O(this.U.array(), i6);
                        fmkVar.c(etxVar6, i6, 1);
                        this.an += i6;
                    }
                }
            } else {
                byte[] bArr = fpdVar.k;
                if (bArr != null) {
                    this.P.O(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(fpdVar.c) ? fpdVar.h > 0 : z) {
                this.al |= 268435456;
                this.T.M(0);
                int i13 = (this.P.d + i) - this.am;
                defpackage.etx etxVar7 = this.M;
                etxVar7.M(4);
                byte[] bArr2 = etxVar7.b;
                bArr2[0] = (byte) ((i13 >> 24) & 255);
                bArr2[1] = (byte) ((i13 >> 16) & 255);
                bArr2[2] = (byte) ((i13 >> 8) & 255);
                bArr2[3] = (byte) (i13 & 255);
                fmkVar.c(etxVar7, 4, 2);
                this.an += 4;
            }
            this.ap = true;
        }
        defpackage.etx etxVar8 = this.P;
        int i14 = etxVar8.d;
        int i15 = i + i14;
        java.lang.String str2 = fpdVar.c;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (fpdVar.W != null) {
                ahvr.bY(i14 == 0);
                fpdVar.W.d(flkVar);
            }
            while (true) {
                int i16 = this.am;
                if (i16 >= i15) {
                    break;
                }
                int iR = r(flkVar, fmkVar, i15 - i16);
                this.am += iR;
                this.an += iR;
            }
        } else {
            defpackage.etx etxVar9 = this.L;
            byte[] bArr3 = etxVar9.b;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i17 = fpdVar.af;
            int i18 = 4 - i17;
            while (this.am < i15) {
                int i19 = this.ao;
                if (i19 == 0) {
                    int iMin = java.lang.Math.min(i17, etxVar8.d());
                    ((defpackage.flc) flkVar).o(bArr3, i18 + iMin, i17 - iMin, false);
                    if (iMin > 0) {
                        etxVar8.L(bArr3, i18, iMin);
                    }
                    this.am += i17;
                    etxVar9.Q(0);
                    this.ao = etxVar9.q();
                    defpackage.etx etxVar10 = this.K;
                    etxVar10.Q(0);
                    fmkVar.b(etxVar10, 4);
                    this.an += 4;
                } else {
                    int iR2 = r(flkVar, fmkVar, i19);
                    this.am += iR2;
                    this.an += iR2;
                    this.ao -= iR2;
                }
            }
        }
        if ("A_VORBIS".equals(fpdVar.c)) {
            defpackage.etx etxVar11 = this.N;
            etxVar11.Q(0);
            fmkVar.b(etxVar11, 4);
            this.an += 4;
        }
        return p();
    }

    private final int r(defpackage.flk flkVar, defpackage.fmk fmkVar, int i) {
        defpackage.etx etxVar = this.P;
        int iD = etxVar.d();
        if (iD <= 0) {
            return fmkVar.a(flkVar, i, false);
        }
        int iMin = java.lang.Math.min(i, iD);
        fmkVar.b(etxVar, iMin);
        return iMin;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[LOOP:0: B:36:0x00a8->B:41:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        r2 = y(r11, "%01d:%02d:%02d:%02d", 10000);
        r3 = 21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s(defpackage.fpd r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpe.s(fpd, long, int, int, int):void");
    }

    private final void t() {
        if (!this.W) {
            return;
        }
        if (this.s != -1 && !this.u) {
            return;
        }
        int i = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.E;
            if (i >= sparseArray.size()) {
                defpackage.fll fllVar = this.av;
                ahvr.ci(fllVar);
                fllVar.s();
                this.W = false;
                return;
            }
            if (((defpackage.fpd) sparseArray.valueAt(i)).X) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void u(defpackage.flk flkVar, int i) {
        defpackage.etx etxVar = this.M;
        if (etxVar.d < i) {
            if (etxVar.e() < i) {
                etxVar.H(java.lang.Math.max(etxVar.e() << 1, i));
            }
            byte[] bArr = etxVar.b;
            int i2 = etxVar.d;
            ((defpackage.flc) flkVar).o(bArr, i2, i - i2, false);
            etxVar.P(i);
        }
    }

    private final void v() {
        this.am = 0;
        this.an = 0;
        this.ao = 0;
        this.ap = false;
        this.aq = false;
        this.ar = false;
        this.as = 0;
        this.at = (byte) 0;
        this.au = false;
        this.P.M(0);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    private final void w(defpackage.fpd fpdVar) {
        long j;
        char c2;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        boolean z;
        defpackage.eqy eqyVarD;
        long j8 = 0;
        int i = 0;
        if (fpdVar.Y) {
            j = 0;
        } else {
            android.util.LongSparseArray longSparseArray = this.F;
            if (longSparseArray.size() != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList(longSparseArray.size());
                int i2 = 0;
                while (i2 < longSparseArray.size()) {
                    defpackage.fpa fpaVar = (defpackage.fpa) longSparseArray.valueAt(i2);
                    long j9 = fpaVar.e;
                    if (j9 == j8 || j9 == fpdVar.e) {
                        arrayList.add(new defpackage.fnn(eum.x(fpaVar.b), eum.x(fpaVar.c), fpaVar.d, fpaVar.f != null ? new defpackage.eqi(fpaVar.g, fpaVar.f) : null));
                    } else {
                        j8 = j8;
                    }
                    i2++;
                    j8 = j8;
                }
                j = j8;
                if (!arrayList.isEmpty()) {
                    defpackage.eqg eqgVar = fpdVar.ae;
                    ahvr.ci(eqgVar);
                    defpackage.eqf eqfVar = new defpackage.eqf(eqgVar);
                    defpackage.eqy eqyVar = fpdVar.ae.l;
                    eqfVar.k = eqyVar != null ? eqyVar.d((defpackage.eqx[]) arrayList.toArray(new defpackage.fnm[0])) : new defpackage.eqy(arrayList);
                    fpdVar.ae = new defpackage.eqg(eqfVar);
                    fpdVar.Y = true;
                }
            } else {
                j = 0;
            }
        }
        android.util.SparseArray sparseArray = this.X;
        long j10 = this.V;
        long j11 = this.e;
        long j12 = this.d;
        if (fpdVar.f == 2) {
            java.util.List list = (java.util.List) sparseArray.get(fpdVar.d);
            if (fpdVar.Z || list == null || list.isEmpty()) {
                return;
            }
            if (list.isEmpty()) {
                c2 = 0;
                j3 = -9223372036854775807L;
                j2 = -9223372036854775807L;
            } else {
                int iMin = java.lang.Math.min(list.size(), 20);
                double d = 0.0d;
                c2 = 0;
                int i3 = -1;
                j2 = -9223372036854775807L;
                while (i < iMin) {
                    defpackage.fpb fpbVar = (defpackage.fpb) list.get(i);
                    long j13 = j11;
                    long j14 = fpbVar.a;
                    if (j14 > 10000000) {
                        break;
                    }
                    int i4 = i + 1;
                    if (i < list.size() - 1) {
                        defpackage.fpb fpbVar2 = (defpackage.fpb) list.get(i4);
                        j4 = j10;
                        j5 = fpbVar2.b + fpbVar2.c;
                        j6 = fpbVar.b + fpbVar.c;
                        j7 = fpbVar2.a - j14;
                    } else {
                        j4 = j10;
                        j5 = j13 + j12;
                        j6 = fpbVar.b + fpbVar.c;
                        j7 = j4 - j14;
                    }
                    long j15 = j5 - j6;
                    if (j7 > j) {
                        double d2 = j15 / j7;
                        if (d2 > d) {
                            d = d2;
                            i3 = i;
                        }
                    }
                    iMin = iMin;
                    i = i4;
                    j11 = j13;
                    j10 = j4;
                }
                j3 = i3 == -1 ? -9223372036854775807L : ((defpackage.fpb) list.get(i3)).a;
            }
            if (j3 != j2) {
                defpackage.eqg eqgVar2 = fpdVar.ae;
                ahvr.ci(eqgVar2);
                defpackage.fns fnsVar = new defpackage.fns(j3);
                defpackage.eqy eqyVar2 = eqgVar2.l;
                if (eqyVar2 == null) {
                    z = true;
                    defpackage.eqx[] eqxVarArr = new defpackage.eqx[1];
                    eqxVarArr[c2] = fnsVar;
                    eqyVarD = new defpackage.eqy(j2, eqxVarArr);
                } else {
                    z = true;
                    defpackage.eqx[] eqxVarArr2 = new defpackage.eqx[1];
                    eqxVarArr2[c2] = fnsVar;
                    eqyVarD = eqyVar2.d(eqxVarArr2);
                }
                defpackage.eqf eqfVar2 = new defpackage.eqf(fpdVar.ae);
                eqfVar2.k = eqyVarD;
                fpdVar.ae = new defpackage.eqg(eqfVar2);
                fpdVar.Z = z;
            }
        }
    }

    private final void x(defpackage.flk flkVar, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        defpackage.etx etxVar = this.Q;
        if (etxVar.e() < i2) {
            etxVar.N(java.util.Arrays.copyOf(bArr, i2 + i));
        } else {
            java.lang.System.arraycopy(bArr, 0, etxVar.b, 0, length);
        }
        ((defpackage.flc) flkVar).o(etxVar.b, length, i, false);
        etxVar.Q(0);
        etxVar.P(i2);
    }

    private static byte[] y(long j, java.lang.String str, long j2) {
        ahvr.bM(j != -9223372036854775807L);
        java.util.Locale locale = java.util.Locale.US;
        int i = (int) (j / 3600000000L);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i2);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        return eum.Z(java.lang.String.format(locale, str, numValueOf, numValueOf2, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    private static int[] z(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[java.lang.Math.max(length << 1, i)];
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        if (this.I) {
            fllVar = new defpackage.fru(fllVar, this.J);
        }
        this.av = fllVar;
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        this.v = -9223372036854775807L;
        int i = 0;
        this.ae = 0;
        defpackage.foz fozVar = this.aw;
        fozVar.d = 0;
        fozVar.b.clear();
        fozVar.c.d();
        this.D.d();
        v();
        this.i.clear();
        this.n = false;
        this.o = -9223372036854775807L;
        this.p = -1;
        this.q = -1L;
        this.r = -1L;
        if (!this.k) {
            this.X.clear();
        }
        while (true) {
            android.util.SparseArray sparseArray = this.E;
            if (i >= sparseArray.size()) {
                return;
            }
            defpackage.fml fmlVar = ((defpackage.fpd) sparseArray.valueAt(i)).W;
            if (fmlVar != null) {
                fmlVar.b();
            }
            i++;
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        aogy aogyVar = new aogy((byte[]) null, (byte[]) null, (byte[]) null);
        defpackage.flc flcVar = (defpackage.flc) flkVar;
        long j = flcVar.a;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        defpackage.etx etxVar = (defpackage.etx) aogyVar.b;
        flcVar.n(etxVar.b, 0, 4, false);
        aogyVar.a = 4;
        for (long jW = etxVar.w(); jW != 440786851; jW = ((jW << 8) & (-256)) | ((long) (etxVar.b[0] & 255))) {
            int i = (int) j2;
            int i2 = aogyVar.a + 1;
            aogyVar.a = i2;
            if (i2 == i) {
                return false;
            }
            flcVar.n(etxVar.b, 0, 1, false);
        }
        long jM = aogyVar.m(flkVar);
        long j3 = aogyVar.a;
        if (jM == Long.MIN_VALUE) {
            return false;
        }
        long j4 = j3 + jM;
        if (j != -1 && j4 >= j) {
            return false;
        }
        while (true) {
            long j5 = aogyVar.a;
            if (j5 >= j4) {
                return j5 == j4;
            }
            if (aogyVar.m(flkVar) == Long.MIN_VALUE) {
                return false;
            }
            long jM2 = aogyVar.m(flkVar);
            if (jM2 < 0) {
                return false;
            }
            if (jM2 != 0) {
                int i3 = (int) jM2;
                flcVar.m(i3, false);
                aogyVar.a += i3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:267:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:270:0x0407  */
    /* JADX WARN: Code duplicated, block: B:272:0x040d  */
    /* JADX WARN: Code duplicated, block: B:273:0x0411  */
    /* JADX WARN: Code duplicated, block: B:275:0x0419  */
    /* JADX WARN: Code duplicated, block: B:276:0x041d  */
    /* JADX WARN: Code duplicated, block: B:278:0x0425  */
    /* JADX WARN: Code duplicated, block: B:279:0x0429  */
    /* JADX WARN: Code duplicated, block: B:281:0x0431  */
    /* JADX WARN: Code duplicated, block: B:282:0x0435  */
    /* JADX WARN: Code duplicated, block: B:284:0x043d  */
    /* JADX WARN: Code duplicated, block: B:285:0x0440  */
    /* JADX WARN: Code duplicated, block: B:287:0x0448  */
    /* JADX WARN: Code duplicated, block: B:288:0x044c  */
    /* JADX WARN: Code duplicated, block: B:290:0x0454  */
    /* JADX WARN: Code duplicated, block: B:291:0x0458  */
    /* JADX WARN: Code duplicated, block: B:293:0x0460  */
    /* JADX WARN: Code duplicated, block: B:294:0x0464  */
    /* JADX WARN: Code duplicated, block: B:296:0x046c  */
    /* JADX WARN: Code duplicated, block: B:297:0x0470  */
    /* JADX WARN: Code duplicated, block: B:299:0x0478  */
    /* JADX WARN: Code duplicated, block: B:300:0x047c  */
    /* JADX WARN: Code duplicated, block: B:302:0x0484  */
    /* JADX WARN: Code duplicated, block: B:303:0x0488  */
    /* JADX WARN: Code duplicated, block: B:305:0x0490  */
    /* JADX WARN: Code duplicated, block: B:306:0x0494  */
    /* JADX WARN: Code duplicated, block: B:308:0x049c  */
    /* JADX WARN: Code duplicated, block: B:309:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:311:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:312:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:314:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:315:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:317:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:318:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:320:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:321:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:323:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:324:0x04da  */
    /* JADX WARN: Code duplicated, block: B:326:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:327:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:329:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:330:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:332:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:333:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:335:0x0505  */
    /* JADX WARN: Code duplicated, block: B:336:0x0509  */
    /* JADX WARN: Code duplicated, block: B:338:0x0511  */
    /* JADX WARN: Code duplicated, block: B:339:0x0515  */
    /* JADX WARN: Code duplicated, block: B:341:0x051d  */
    /* JADX WARN: Code duplicated, block: B:342:0x0521  */
    /* JADX WARN: Code duplicated, block: B:344:0x0529  */
    /* JADX WARN: Code duplicated, block: B:345:0x052c  */
    /* JADX WARN: Code duplicated, block: B:347:0x0534  */
    /* JADX WARN: Code duplicated, block: B:348:0x0537  */
    /* JADX WARN: Code duplicated, block: B:350:0x053f  */
    /* JADX WARN: Code duplicated, block: B:351:0x0542  */
    /* JADX WARN: Code duplicated, block: B:353:0x054a  */
    /* JADX WARN: Code duplicated, block: B:354:0x054d  */
    /* JADX WARN: Code duplicated, block: B:356:0x0555  */
    /* JADX WARN: Code duplicated, block: B:357:0x0558  */
    /* JADX WARN: Code duplicated, block: B:359:0x0560  */
    /* JADX WARN: Code duplicated, block: B:360:0x0563  */
    /* JADX WARN: Code duplicated, block: B:362:0x056b  */
    /* JADX WARN: Code duplicated, block: B:363:0x056e  */
    /* JADX WARN: Code duplicated, block: B:365:0x0576  */
    /* JADX WARN: Code duplicated, block: B:366:0x0579  */
    /* JADX WARN: Code duplicated, block: B:368:0x0581  */
    /* JADX WARN: Code duplicated, block: B:369:0x0584  */
    /* JADX WARN: Code duplicated, block: B:371:0x058c  */
    /* JADX WARN: Code duplicated, block: B:372:0x058e  */
    /* JADX WARN: Code duplicated, block: B:374:0x0596  */
    /* JADX WARN: Code duplicated, block: B:375:0x0598  */
    /* JADX WARN: Code duplicated, block: B:380:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:381:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:382:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:383:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:384:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:385:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:386:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:388:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:389:0x0604  */
    /* JADX WARN: Code duplicated, block: B:391:0x060e  */
    /* JADX WARN: Code duplicated, block: B:392:0x0625  */
    /* JADX WARN: Code duplicated, block: B:394:0x062d  */
    /* JADX WARN: Code duplicated, block: B:396:0x0644 A[PHI: r8
      0x0644: PHI (r8v55 java.lang.String) = 
      (r8v8 java.lang.String)
      (r8v10 java.lang.String)
      (r8v11 java.lang.String)
      (r8v21 java.lang.String)
      (r8v35 java.lang.String)
      (r8v36 java.lang.String)
      (r8v37 java.lang.String)
      (r8v38 java.lang.String)
      (r8v39 java.lang.String)
      (r8v40 java.lang.String)
      (r8v47 java.lang.String)
      (r8v49 java.lang.String)
      (r8v51 java.lang.String)
      (r8v56 java.lang.String)
     binds: [B:450:0x081c, B:440:0x07ed, B:438:0x07e5, B:426:0x0762, B:417:0x06cf, B:416:0x06cb, B:415:0x06c0, B:414:0x06bb, B:413:0x06b8, B:412:0x06b5, B:395:0x0643, B:385:0x05e2, B:383:0x05d1, B:381:0x05c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:399:0x0651  */
    /* JADX WARN: Code duplicated, block: B:401:0x0662  */
    /* JADX WARN: Code duplicated, block: B:403:0x066a  */
    /* JADX WARN: Code duplicated, block: B:404:0x0681 A[PHI: r5
      0x0681: PHI (r5v84 int) = (r5v73 int), (r5v77 int), (r5v81 int), (r5v86 int) binds: [B:402:0x0668, B:393:0x062b, B:390:0x060c, B:387:0x05eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:405:0x0683  */
    /* JADX WARN: Code duplicated, block: B:406:0x0689  */
    /* JADX WARN: Code duplicated, block: B:409:0x069d  */
    /* JADX WARN: Code duplicated, block: B:411:0x06af A[PHI: r5 r7 r8
      0x06af: PHI (r5v65 aify) = (r5v64 aify), (r5v68 aify) binds: [B:410:0x06ad, B:407:0x0699] A[DONT_GENERATE, DONT_INLINE]
      0x06af: PHI (r7v193 int) = (r7v192 int), (r7v196 int) binds: [B:410:0x06ad, B:407:0x0699] A[DONT_GENERATE, DONT_INLINE]
      0x06af: PHI (r8v42 java.lang.String) = (r8v41 java.lang.String), (r8v43 java.lang.String) binds: [B:410:0x06ad, B:407:0x0699] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:412:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:413:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:414:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:415:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:416:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:417:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:418:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:419:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:421:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:422:0x0708  */
    /* JADX WARN: Code duplicated, block: B:425:0x0755  */
    /* JADX WARN: Code duplicated, block: B:426:0x0762  */
    /* JADX WARN: Code duplicated, block: B:427:0x0766  */
    /* JADX WARN: Code duplicated, block: B:428:0x077e A[PHI: r5 r8
      0x077e: PHI (r5v143 aify) = 
      (r5v29 aify)
      (r5v32 aify)
      (r5v36 aify)
      (r5v49 aify)
      (r5v64 aify)
      (r5v68 aify)
      (r5v90 aify)
      (r5v92 aify)
      (r5v146 aify)
     binds: [B:449:0x0818, B:442:0x07f9, B:437:0x07e2, B:427:0x0766, B:410:0x06ad, B:407:0x0699, B:384:0x05d4, B:382:0x05c5, B:380:0x05ae] A[DONT_GENERATE, DONT_INLINE]
      0x077e: PHI (r8v65 java.lang.String) = 
      (r8v9 java.lang.String)
      (r8v10 java.lang.String)
      (r8v12 java.lang.String)
      (r8v20 java.lang.String)
      (r8v41 java.lang.String)
      (r8v43 java.lang.String)
      (r8v50 java.lang.String)
      (r8v52 java.lang.String)
      (r8v67 java.lang.String)
     binds: [B:449:0x0818, B:442:0x07f9, B:437:0x07e2, B:427:0x0766, B:410:0x06ad, B:407:0x0699, B:384:0x05d4, B:382:0x05c5, B:380:0x05ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:430:0x0784  */
    /* JADX WARN: Code duplicated, block: B:432:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:433:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:435:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:436:0x07de  */
    /* JADX WARN: Code duplicated, block: B:438:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:439:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:441:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:444:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:445:0x080e  */
    /* JADX WARN: Code duplicated, block: B:447:0x0812  */
    /* JADX WARN: Code duplicated, block: B:448:0x0814  */
    /* JADX WARN: Code duplicated, block: B:450:0x081c  */
    /* JADX WARN: Code duplicated, block: B:453:0x0824  */
    /* JADX WARN: Code duplicated, block: B:456:0x083e  */
    /* JADX WARN: Code duplicated, block: B:457:0x0841  */
    /* JADX WARN: Code duplicated, block: B:460:0x0850  */
    /* JADX WARN: Code duplicated, block: B:461:0x0860  */
    /* JADX WARN: Code duplicated, block: B:463:0x0866  */
    /* JADX WARN: Code duplicated, block: B:465:0x086a  */
    /* JADX WARN: Code duplicated, block: B:467:0x086f  */
    /* JADX WARN: Code duplicated, block: B:470:0x0877  */
    /* JADX WARN: Code duplicated, block: B:472:0x087c  */
    /* JADX WARN: Code duplicated, block: B:475:0x0883  */
    /* JADX WARN: Code duplicated, block: B:478:0x0898  */
    /* JADX WARN: Code duplicated, block: B:480:0x089d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:481:0x089f  */
    /* JADX WARN: Code duplicated, block: B:482:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:483:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:486:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:487:0x08b3 A[PHI: r9 r10 r11
      0x08b3: PHI (r9v35 int) = (r9v34 int), (r9v50 int), (r9v52 int) binds: [B:479:0x089b, B:486:0x08ad, B:485:0x08a8] A[DONT_GENERATE, DONT_INLINE]
      0x08b3: PHI (r10v25 int) = (r10v23 int), (r10v99 int), (r10v100 int) binds: [B:479:0x089b, B:486:0x08ad, B:485:0x08a8] A[DONT_GENERATE, DONT_INLINE]
      0x08b3: PHI (r11v17 int) = (r11v16 int), (r11v26 int), (r11v16 int) binds: [B:479:0x089b, B:486:0x08ad, B:485:0x08a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:490:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:493:0x08c2 A[PHI: r13
      0x08c2: PHI (r13v19 int) = (r13v18 int), (r13v20 int) binds: [B:489:0x08b9, B:491:0x08bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:495:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:497:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:498:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:499:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:502:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:521:0x098c  */
    /* JADX WARN: Code duplicated, block: B:524:0x0999  */
    /* JADX WARN: Code duplicated, block: B:525:0x09ac  */
    /* JADX WARN: Code duplicated, block: B:528:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:534:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:535:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:537:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:538:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:540:0x09e3  */
    /* JADX WARN: Code duplicated, block: B:545:0x09fa  */
    /* JADX WARN: Code duplicated, block: B:547:0x0a13  */
    /* JADX WARN: Code duplicated, block: B:549:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:563:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:568:0x0a65  */
    /* JADX WARN: Code duplicated, block: B:569:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:641:0x0bce A[LOOP:1: B:6:0x0012->B:641:0x0bce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:650:0x0bff  */
    /* JADX WARN: Code duplicated, block: B:651:0x0c06  */
    /* JADX WARN: Code duplicated, block: B:654:0x0c0e  */
    /* JADX WARN: Code duplicated, block: B:656:0x0c12  */
    /* JADX WARN: Code duplicated, block: B:658:0x0c16  */
    /* JADX WARN: Code duplicated, block: B:660:0x0c1b  */
    /* JADX WARN: Code duplicated, block: B:661:0x0c25  */
    /* JADX WARN: Code duplicated, block: B:662:0x0c2f  */
    /* JADX WARN: Code duplicated, block: B:663:0x0c39  */
    /* JADX WARN: Code duplicated, block: B:664:0x0c42  */
    /* JADX WARN: Code duplicated, block: B:665:0x0c4b  */
    /* JADX WARN: Code duplicated, block: B:666:0x0c54  */
    /* JADX WARN: Code duplicated, block: B:667:0x0c5d  */
    /* JADX WARN: Code duplicated, block: B:668:0x0c66  */
    /* JADX WARN: Code duplicated, block: B:669:0x0c6f  */
    /* JADX WARN: Code duplicated, block: B:670:0x0c78  */
    /* JADX WARN: Code duplicated, block: B:671:0x0c81  */
    /* JADX WARN: Code duplicated, block: B:672:0x0c8a  */
    /* JADX WARN: Code duplicated, block: B:673:0x0c93  */
    /* JADX WARN: Code duplicated, block: B:674:0x0c99  */
    /* JADX WARN: Code duplicated, block: B:680:0x0cbe  */
    /* JADX WARN: Code duplicated, block: B:682:0x0cc1  */
    /* JADX WARN: Code duplicated, block: B:683:0x0cc4  */
    /* JADX WARN: Code duplicated, block: B:685:0x0ccf  */
    /* JADX WARN: Code duplicated, block: B:687:0x0cd5 A[LOOP:11: B:684:0x0ccd->B:687:0x0cd5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:691:0x0ce1  */
    /* JADX WARN: Code duplicated, block: B:693:0x0ce5  */
    /* JADX WARN: Code duplicated, block: B:695:0x0ce9  */
    /* JADX WARN: Code duplicated, block: B:697:0x0ced  */
    /* JADX WARN: Code duplicated, block: B:699:0x0cf1  */
    /* JADX WARN: Code duplicated, block: B:701:0x0cf6  */
    /* JADX WARN: Code duplicated, block: B:702:0x0cff  */
    /* JADX WARN: Code duplicated, block: B:703:0x0d08  */
    /* JADX WARN: Code duplicated, block: B:704:0x0d11  */
    /* JADX WARN: Code duplicated, block: B:712:0x0d3d  */
    /* JADX WARN: Code duplicated, block: B:713:0x0d46  */
    /* JADX WARN: Code duplicated, block: B:719:0x0d67  */
    /* JADX WARN: Code duplicated, block: B:760:0x05a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:0x0d53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:0x0d74 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:0x0bdd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:0x0ca6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:0x0cb5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:0x0d61 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:0x0d82 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:0x0cd7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:830:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:831:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:832:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:833:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:834:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:835:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:836:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:837:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:838:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:839:? A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:388:0x05ed, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:391:0x060e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:394:0x062d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:403:0x066a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v158, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r5v162 */
    /* JADX WARN: Type inference failed for: r5v163, types: [int] */
    /* JADX WARN: Type inference failed for: r5v165 */
    /* JADX WARN: Type inference failed for: r5v166, types: [int] */
    /* JADX WARN: Type inference failed for: r5v169 */
    /* JADX WARN: Type inference failed for: r5v170, types: [int] */
    /* JADX WARN: Type inference failed for: r5v185 */
    /* JADX WARN: Type inference failed for: r5v186 */
    /* JADX WARN: Type inference failed for: r5v187 */
    /* JADX WARN: Type inference failed for: r6v139, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r6v141, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v219 */
    /* JADX WARN: Type inference failed for: r7v220, types: [int] */
    /* JADX WARN: Type inference failed for: r7v238 */
    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) throws defpackage.era {
        boolean z;
        int i;
        rai raiVar;
        int i2;
        java.lang.Object obj;
        int i3;
        boolean z2;
        long j;
        long j2;
        int i4;
        byte[] bArr;
        java.lang.String str;
        int i5;
        int i6;
        long j3;
        int i7;
        long jA;
        double dLongBitsToDouble;
        float f;
        defpackage.flc flcVar;
        int iA;
        int i8;
        java.lang.String str2;
        int i9;
        byte b2;
        aify aifyVarP;
        int i10;
        int i11;
        int i12;
        int i13;
        aify aifyVar;
        java.lang.Object obj2;
        int i14;
        int iO;
        int i15;
        aify aifyVar2;
        java.lang.String str3;
        int i16;
        int i17;
        java.lang.String str4;
        aify aifyVarB;
        int i18;
        int iO2;
        int i19;
        defpackage.eqf eqfVar;
        int i20;
        int i21;
        int i22;
        float f2;
        int i23;
        int i24;
        int i25;
        byte[] bArr2;
        java.lang.String str5;
        int iIntValue;
        int i26;
        int i27;
        int i28;
        int i29;
        java.lang.String str6;
        java.lang.String str7;
        int i30;
        boolean z3 = false;
        this.ad = false;
        while (!this.ad) {
            defpackage.foz fozVar = this.aw;
            ahvr.ci(fozVar.g);
            while (true) {
                java.util.ArrayDeque arrayDeque = fozVar.b;
                ygr ygrVar = (ygr) arrayDeque.peek();
                int i31 = 374648427;
                if (ygrVar == null || ((defpackage.flc) flkVar).b < ygrVar.b) {
                    int i32 = fozVar.d;
                    if (i32 != 0) {
                        z = true;
                        i = -1;
                        if (i32 == 1) {
                        }
                        raiVar = fozVar.g;
                        i2 = fozVar.e;
                        obj = raiVar.a;
                        switch (i2) {
                            case 128:
                            case 143:
                            case 160:
                            case 166:
                            case 174:
                            case 182:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
                            case 16868:
                            case 17849:
                            case 18407:
                            case 19899:
                            case 20532:
                            case 20533:
                            case 21936:
                            case 21968:
                            case 25152:
                            case 28032:
                            case 30113:
                            case 30320:
                            case 272869232:
                            case 290298740:
                            case 357149030:
                            case 374648427:
                            case 408125543:
                            case 440786851:
                            case 475249515:
                            case 524531317:
                                i3 = 1;
                                long j4 = ((defpackage.flc) flkVar).b;
                                arrayDeque.push(new ygr(i2, fozVar.f + j4));
                                fozVar.g.t(fozVar.e, j4, fozVar.f);
                                z2 = false;
                                fozVar.d = 0;
                                i6 = i3;
                                break;
                            case 131:
                            case 136:
                            case 137:
                            case 145:
                            case 146:
                            case 152:
                            case 155:
                            case 159:
                            case 176:
                            case 179:
                            case 186:
                            case 215:
                            case 231:
                            case 238:
                            case 240:
                            case 241:
                            case 247:
                            case 251:
                            case 16871:
                            case 16980:
                            case 17029:
                            case 17143:
                            case 18401:
                            case 18408:
                            case 20529:
                            case 20530:
                            case 21420:
                            case 21432:
                            case 21680:
                            case 21682:
                            case 21690:
                            case 21930:
                            case 21938:
                            case 21945:
                            case 21946:
                            case 21947:
                            case 21948:
                            case 21949:
                            case 21998:
                            case 22186:
                            case 22203:
                            case 25188:
                            case 29636:
                            case 29637:
                            case 30114:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                j = fozVar.f;
                                if (j <= 8) {
                                    throw new defpackage.era(a.bz(j, "Invalid integer size: "), null, true, 1);
                                }
                                raiVar.s(i2, fozVar.a(flkVar, (int) j));
                                z2 = false;
                                fozVar.d = 0;
                                i3 = 1;
                                i6 = 1;
                                break;
                                break;
                            case 133:
                            case 134:
                            case 17026:
                            case 17276:
                            case 21358:
                            case 2274716:
                                j2 = fozVar.f;
                                if (j2 <= 2147483647L) {
                                    throw new defpackage.era(a.bz(j2, "String element size: "), null, true, 1);
                                }
                                i4 = (int) j2;
                                if (i4 == 0) {
                                    str = "";
                                } else {
                                    bArr = new byte[i4];
                                    ((defpackage.flc) flkVar).o(bArr, 0, i4, false);
                                    while (i4 > 0) {
                                        i5 = i4 - 1;
                                        if (bArr[i5] == 0) {
                                            i4 = i5;
                                        } else {
                                            str = new java.lang.String(bArr, 0, i4);
                                        }
                                    }
                                    str = new java.lang.String(bArr, 0, i4);
                                }
                                if (i2 != 133) {
                                    ((defpackage.fpe) obj).i(i2).h = str;
                                } else if (i2 != 134) {
                                    ((defpackage.fpe) obj).j(i2).c = str;
                                } else if (i2 != 17026) {
                                    if ("webm".equals(str) && !"matroska".equals(str)) {
                                        throw new defpackage.era(a.bk(str, "DocType ", " not supported"), null, true, 1);
                                    }
                                    ((defpackage.fpe) obj).h = j$.util.Objects.equals(str, "webm");
                                } else if (i2 != 17276) {
                                    ((defpackage.fpe) obj).i(i2).i = str;
                                } else if (i2 != 21358) {
                                    ((defpackage.fpe) obj).j(i2).b = str;
                                } else if (i2 == 2274716) {
                                    ((defpackage.fpe) obj).j(i2).ac = str;
                                }
                                z2 = false;
                                fozVar.d = 0;
                                i3 = 1;
                                i6 = 1;
                                break;
                                break;
                            case 161:
                            case 163:
                            case 165:
                            case 16877:
                            case 16981:
                            case 18402:
                            case 21419:
                            case 25506:
                            case 30322:
                                z2 = false;
                                ((defpackage.fpe) obj).n(i2, (int) fozVar.f, flkVar);
                                fozVar.d = 0;
                                i3 = 1;
                                i6 = 1;
                                break;
                            case 181:
                            case 17545:
                            case 21969:
                            case 21970:
                            case 21971:
                            case 21972:
                            case 21973:
                            case 21974:
                            case 21975:
                            case 21976:
                            case 21977:
                            case 21978:
                            case 30323:
                            case 30324:
                            case 30325:
                                j3 = fozVar.f;
                                if (j3 == 4 && j3 != 8) {
                                    throw new defpackage.era(a.bz(j3, "Invalid float size: "), null, true, 1);
                                }
                                i7 = (int) j3;
                                jA = fozVar.a(flkVar, i7);
                                if (i7 == 4) {
                                    dLongBitsToDouble = java.lang.Float.intBitsToFloat((int) jA);
                                } else {
                                    dLongBitsToDouble = java.lang.Double.longBitsToDouble(jA);
                                }
                                if (i2 != 181) {
                                    ((defpackage.fpe) obj).j(i2).T = (int) dLongBitsToDouble;
                                } else if (i2 != 17545) {
                                    f = (float) dLongBitsToDouble;
                                    switch (i2) {
                                        case 21969:
                                            ((defpackage.fpe) obj).j(i2).F = f;
                                            break;
                                        case 21970:
                                            ((defpackage.fpe) obj).j(i2).G = f;
                                            break;
                                        case 21971:
                                            ((defpackage.fpe) obj).j(i2).H = f;
                                            break;
                                        case 21972:
                                            ((defpackage.fpe) obj).j(i2).I = f;
                                            break;
                                        case 21973:
                                            ((defpackage.fpe) obj).j(i2).J = f;
                                            break;
                                        case 21974:
                                            ((defpackage.fpe) obj).j(i2).K = f;
                                            break;
                                        case 21975:
                                            ((defpackage.fpe) obj).j(i2).L = f;
                                            break;
                                        case 21976:
                                            ((defpackage.fpe) obj).j(i2).M = f;
                                            break;
                                        case 21977:
                                            ((defpackage.fpe) obj).j(i2).N = f;
                                            break;
                                        case 21978:
                                            ((defpackage.fpe) obj).j(i2).O = f;
                                            break;
                                        default:
                                            switch (i2) {
                                                case 30323:
                                                    ((defpackage.fpe) obj).j(i2).v = f;
                                                    break;
                                                case 30324:
                                                    ((defpackage.fpe) obj).j(i2).w = f;
                                                    break;
                                                case 30325:
                                                    ((defpackage.fpe) obj).j(i2).x = f;
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    ((defpackage.fpe) obj).g = (long) dLongBitsToDouble;
                                }
                                z2 = false;
                                fozVar.d = 0;
                                i3 = 1;
                                i6 = 1;
                                break;
                                break;
                            default:
                                ((defpackage.flc) flkVar).p((int) fozVar.f, false);
                                fozVar.d = 0;
                                z3 = false;
                                break;
                        }
                    } else {
                        int i33 = 4;
                        boolean z4 = false;
                        long jC = fozVar.c.c(flkVar, true, false, 4);
                        if (jC == -2) {
                            flkVar.k();
                            while (true) {
                                byte[] bArr3 = fozVar.a;
                                flcVar = (defpackage.flc) flkVar;
                                flcVar.n(bArr3, z4 ? 1 : 0, i33, z4);
                                iA = defpackage.fpf.a(bArr3[z4 ? 1 : 0]);
                                i = -1;
                                if (iA == -1 || iA > i33) {
                                    i8 = 1;
                                } else {
                                    int iB = (int) defpackage.fpf.b(bArr3, iA, z4);
                                    java.lang.Object obj3 = fozVar.g.a;
                                    if (iB == 357149030 || iB == 272869232 || iB == 524531317 || iB == 475249515) {
                                        i31 = iB;
                                    } else if (iB != 374648427) {
                                        i8 = 1;
                                        z4 = false;
                                    }
                                }
                                flcVar.p(i8, z4);
                                i33 = 4;
                            }
                            flcVar.p(iA, false);
                            jC = i31;
                        } else {
                            i = -1;
                        }
                        z = true;
                        if (jC == -1) {
                            i3 = 1;
                            i6 = 0;
                            z2 = false;
                        } else {
                            fozVar.e = (int) jC;
                            fozVar.d = 1;
                        }
                    }
                    fozVar.f = fozVar.c.c(flkVar, false, z, 8);
                    fozVar.d = 2;
                    raiVar = fozVar.g;
                    i2 = fozVar.e;
                    obj = raiVar.a;
                    switch (i2) {
                        case 128:
                        case 143:
                        case 160:
                        case 166:
                        case 174:
                        case 182:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 17849:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 272869232:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i3 = 1;
                            long j5 = ((defpackage.flc) flkVar).b;
                            arrayDeque.push(new ygr(i2, fozVar.f + j5));
                            fozVar.g.t(fozVar.e, j5, fozVar.f);
                            z2 = false;
                            fozVar.d = 0;
                            i6 = i3;
                            break;
                        case 131:
                        case 136:
                        case 137:
                        case 145:
                        case 146:
                        case 152:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 240:
                        case 241:
                        case 247:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 29636:
                        case 29637:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            j = fozVar.f;
                            if (j <= 8) {
                                throw new defpackage.era(a.bz(j, "Invalid integer size: "), null, true, 1);
                            }
                            raiVar.s(i2, fozVar.a(flkVar, (int) j));
                            z2 = false;
                            fozVar.d = 0;
                            i3 = 1;
                            i6 = 1;
                            break;
                            break;
                        case 133:
                        case 134:
                        case 17026:
                        case 17276:
                        case 21358:
                        case 2274716:
                            j2 = fozVar.f;
                            if (j2 <= 2147483647L) {
                                throw new defpackage.era(a.bz(j2, "String element size: "), null, true, 1);
                            }
                            i4 = (int) j2;
                            if (i4 == 0) {
                                str = "";
                            } else {
                                bArr = new byte[i4];
                                ((defpackage.flc) flkVar).o(bArr, 0, i4, false);
                                while (i4 > 0) {
                                    i5 = i4 - 1;
                                    if (bArr[i5] == 0) {
                                        i4 = i5;
                                    } else {
                                        str = new java.lang.String(bArr, 0, i4);
                                    }
                                }
                                str = new java.lang.String(bArr, 0, i4);
                            }
                            if (i2 != 133) {
                                ((defpackage.fpe) obj).i(i2).h = str;
                            } else if (i2 != 134) {
                                ((defpackage.fpe) obj).j(i2).c = str;
                            } else if (i2 != 17026) {
                                if ("webm".equals(str)) {
                                }
                                ((defpackage.fpe) obj).h = j$.util.Objects.equals(str, "webm");
                                break;
                            } else if (i2 != 17276) {
                                ((defpackage.fpe) obj).i(i2).i = str;
                            } else if (i2 != 21358) {
                                ((defpackage.fpe) obj).j(i2).b = str;
                            } else if (i2 == 2274716) {
                                ((defpackage.fpe) obj).j(i2).ac = str;
                            }
                            z2 = false;
                            fozVar.d = 0;
                            i3 = 1;
                            i6 = 1;
                            break;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            z2 = false;
                            ((defpackage.fpe) obj).n(i2, (int) fozVar.f, flkVar);
                            fozVar.d = 0;
                            i3 = 1;
                            i6 = 1;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            j3 = fozVar.f;
                            if (j3 == 4) {
                            }
                            i7 = (int) j3;
                            jA = fozVar.a(flkVar, i7);
                            if (i7 == 4) {
                                dLongBitsToDouble = java.lang.Float.intBitsToFloat((int) jA);
                            } else {
                                dLongBitsToDouble = java.lang.Double.longBitsToDouble(jA);
                            }
                            if (i2 != 181) {
                                ((defpackage.fpe) obj).j(i2).T = (int) dLongBitsToDouble;
                            } else if (i2 != 17545) {
                                f = (float) dLongBitsToDouble;
                                switch (i2) {
                                    case 21969:
                                        ((defpackage.fpe) obj).j(i2).F = f;
                                        break;
                                    case 21970:
                                        ((defpackage.fpe) obj).j(i2).G = f;
                                        break;
                                    case 21971:
                                        ((defpackage.fpe) obj).j(i2).H = f;
                                        break;
                                    case 21972:
                                        ((defpackage.fpe) obj).j(i2).I = f;
                                        break;
                                    case 21973:
                                        ((defpackage.fpe) obj).j(i2).J = f;
                                        break;
                                    case 21974:
                                        ((defpackage.fpe) obj).j(i2).K = f;
                                        break;
                                    case 21975:
                                        ((defpackage.fpe) obj).j(i2).L = f;
                                        break;
                                    case 21976:
                                        ((defpackage.fpe) obj).j(i2).M = f;
                                        break;
                                    case 21977:
                                        ((defpackage.fpe) obj).j(i2).N = f;
                                        break;
                                    case 21978:
                                        ((defpackage.fpe) obj).j(i2).O = f;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 30323:
                                                ((defpackage.fpe) obj).j(i2).v = f;
                                                break;
                                            case 30324:
                                                ((defpackage.fpe) obj).j(i2).w = f;
                                                break;
                                            case 30325:
                                                ((defpackage.fpe) obj).j(i2).x = f;
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                ((defpackage.fpe) obj).g = (long) dLongBitsToDouble;
                            }
                            z2 = false;
                            fozVar.d = 0;
                            i3 = 1;
                            i6 = 1;
                            break;
                        default:
                            ((defpackage.flc) flkVar).p((int) fozVar.f, false);
                            fozVar.d = 0;
                            z3 = false;
                            break;
                    }
                } else {
                    rai raiVar2 = fozVar.g;
                    int i34 = ((ygr) arrayDeque.pop()).a;
                    defpackage.fpe fpeVar = (defpackage.fpe) raiVar2.a;
                    fpeVar.m();
                    if (i34 != 128) {
                        if (i34 != 160) {
                            if (i34 == 174) {
                                defpackage.fpd fpdVar = fpeVar.j;
                                ahvr.ci(fpdVar);
                                java.lang.String str8 = fpdVar.c;
                                if (str8 == null) {
                                    throw new defpackage.era("CodecId is missing in TrackEntry element", null, true, 1);
                                }
                                switch (str8) {
                                    case "V_MPEG4/ISO/AP":
                                    case "V_MPEG4/ISO/SP":
                                    case "A_MS/ACM":
                                    case "A_TRUEHD":
                                    case "A_VORBIS":
                                    case "A_MPEG/L2":
                                    case "A_MPEG/L3":
                                    case "V_MS/VFW/FOURCC":
                                    case "S_DVBSUB":
                                    case "V_MPEG4/ISO/ASP":
                                    case "V_MPEG4/ISO/AVC":
                                    case "S_VOBSUB":
                                    case "A_DTS/LOSSLESS":
                                    case "A_AAC":
                                    case "A_AC3":
                                    case "A_DTS":
                                    case "V_AV1":
                                    case "V_VP8":
                                    case "V_VP9":
                                    case "S_HDMV/PGS":
                                    case "V_THEORA":
                                    case "A_DTS/EXPRESS":
                                    case "A_PCM/FLOAT/IEEE":
                                    case "A_PCM/INT/BIG":
                                    case "A_PCM/INT/LIT":
                                    case "S_TEXT/ASS":
                                    case "S_TEXT/SSA":
                                    case "V_MPEGH/ISO/HEVC":
                                    case "S_TEXT/WEBVTT":
                                    case "S_TEXT/UTF8":
                                    case "V_MPEG2":
                                    case "A_ALAC":
                                    case "A_EAC3":
                                    case "A_FLAC":
                                    case "A_OPUS":
                                        int i35 = fpdVar.d;
                                        switch (str8) {
                                            case "V_MPEG4/ISO/AP":
                                                b2 = 6;
                                                break;
                                            case "V_MPEG4/ISO/SP":
                                                b2 = 4;
                                                break;
                                            case "A_MS/ACM":
                                                b2 = 24;
                                                break;
                                            case "A_TRUEHD":
                                                b2 = 18;
                                                break;
                                            case "A_VORBIS":
                                                b2 = 11;
                                                break;
                                            case "A_MPEG/L2":
                                                b2 = 14;
                                                break;
                                            case "A_MPEG/L3":
                                                b2 = 15;
                                                break;
                                            case "V_MS/VFW/FOURCC":
                                                b2 = 9;
                                                break;
                                            case "S_DVBSUB":
                                                b2 = 34;
                                                break;
                                            case "V_MPEG4/ISO/ASP":
                                                b2 = 5;
                                                break;
                                            case "V_MPEG4/ISO/AVC":
                                                b2 = 7;
                                                break;
                                            case "S_VOBSUB":
                                                b2 = 32;
                                                break;
                                            case "A_DTS/LOSSLESS":
                                                b2 = 21;
                                                break;
                                            case "A_AAC":
                                                b2 = 13;
                                                break;
                                            case "A_AC3":
                                                b2 = 16;
                                                break;
                                            case "A_DTS":
                                                b2 = 19;
                                                break;
                                            case "V_AV1":
                                                b2 = 2;
                                                break;
                                            case "V_VP8":
                                                b2 = 0;
                                                break;
                                            case "V_VP9":
                                                b2 = 1;
                                                break;
                                            case "S_HDMV/PGS":
                                                b2 = 33;
                                                break;
                                            case "V_THEORA":
                                                b2 = 10;
                                                break;
                                            case "A_DTS/EXPRESS":
                                                b2 = 20;
                                                break;
                                            case "A_PCM/FLOAT/IEEE":
                                                b2 = 27;
                                                break;
                                            case "A_PCM/INT/BIG":
                                                b2 = 26;
                                                break;
                                            case "A_PCM/INT/LIT":
                                                b2 = 25;
                                                break;
                                            case "S_TEXT/ASS":
                                                b2 = 29;
                                                break;
                                            case "S_TEXT/SSA":
                                                b2 = 30;
                                                break;
                                            case "V_MPEGH/ISO/HEVC":
                                                b2 = 8;
                                                break;
                                            case "S_TEXT/WEBVTT":
                                                b2 = 31;
                                                break;
                                            case "S_TEXT/UTF8":
                                                b2 = 28;
                                                break;
                                            case "V_MPEG2":
                                                b2 = 3;
                                                break;
                                            case "A_ALAC":
                                                b2 = 23;
                                                break;
                                            case "A_EAC3":
                                                b2 = 17;
                                                break;
                                            case "A_FLAC":
                                                b2 = 22;
                                                break;
                                            case "A_OPUS":
                                                b2 = 12;
                                                break;
                                            default:
                                                b2 = -1;
                                                break;
                                        }
                                        java.lang.String str9 = "audio/raw";
                                        switch (b2) {
                                            case 0:
                                                str9 = "video/x-vnd.on2.vp8";
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z5 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i36 = (z5 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20 || (i27 = fpdVar.s) == i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        f2 = (fpdVar.p * i21) / (fpdVar.o * i27);
                                                        i22 = -1;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22 && fpdVar.C == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i37 = i11;
                                                    int i38 = i12;
                                                    if (i14 == i22 || (i14 = fpdVar.q) != i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = 8;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f || fpdVar.G == -1.0f || fpdVar.H == -1.0f || fpdVar.I == -1.0f || fpdVar.J == -1.0f || fpdVar.K == -1.0f || fpdVar.L == -1.0f || fpdVar.M == -1.0f || fpdVar.N == -1.0f || fpdVar.O == -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        byte[] bArr4 = new byte[25];
                                                        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.wrap(bArr4).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((fpdVar.F * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((fpdVar.G * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((fpdVar.H * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((fpdVar.I * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((fpdVar.J * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((fpdVar.K * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((fpdVar.L * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((fpdVar.M * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (fpdVar.N + 0.5f));
                                                        byteBufferOrder.putShort((short) (fpdVar.O + 0.5f));
                                                        byteBufferOrder.putShort((short) fpdVar.D);
                                                        byteBufferOrder.putShort((short) fpdVar.E);
                                                        bArr2 = bArr4;
                                                    }
                                                    defpackage.epy epyVar = new defpackage.epy(i23, i38, i37, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0 && java.lang.Float.compare(fpdVar.v, 0.0f) == 0 && java.lang.Float.compare(fpdVar.w, 0.0f) == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0 || java.lang.Float.compare(fpdVar.x, 180.0f) == 0) {
                                                            iIntValue = 180;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -90.0f) == 0) {
                                                            iIntValue = 270;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar;
                                                } else if (!"application/x-subrip".equals(str9) && !"text/x-ssa".equals(str9) && !"text/vtt".equals(str9) && !"application/vobsub".equals(str9) && !"application/pgs".equals(str9) && !"application/dvbsubs".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null && !c.containsKey(str6)) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i36;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case 1:
                                                byte[] bArr5 = fpdVar.m;
                                                if (bArr5 == null) {
                                                    aifyVarP = null;
                                                } else {
                                                    aifyVarP = aify.p(bArr5);
                                                }
                                                str9 = "video/x-vnd.on2.vp9";
                                                aifyVar = aifyVarP;
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z6 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i39 = (z6 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i310 = i11;
                                                    int i311 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar2 = new defpackage.epy(i23, i311, i310, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar2;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i39;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case 2:
                                                byte[] bArr6 = fpdVar.m;
                                                str9 = "video/av01";
                                                if (bArr6 != null) {
                                                    aifyVarP = aify.p(bArr6);
                                                    defpackage.hrr hrrVarA = defpackage.hrr.a(fpdVar.m);
                                                    if (hrrVarA == null) {
                                                        aifyVar = aifyVarP;
                                                        iO = -1;
                                                        i15 = -1;
                                                        i10 = i15;
                                                        i11 = i10;
                                                        i12 = i11;
                                                        i13 = i12;
                                                        i14 = i13;
                                                        obj2 = null;
                                                    } else {
                                                        i10 = hrrVarA.c;
                                                        i11 = hrrVarA.d;
                                                        i12 = hrrVarA.b;
                                                        i13 = hrrVarA.a;
                                                        aifyVar = aifyVarP;
                                                        obj2 = hrrVarA.e;
                                                        i14 = i13;
                                                        iO = -1;
                                                        i15 = -1;
                                                    }
                                                } else {
                                                    iO = -1;
                                                    i15 = -1;
                                                    i10 = i15;
                                                    i11 = i10;
                                                    i12 = i11;
                                                    i13 = i12;
                                                    i14 = i13;
                                                    obj2 = null;
                                                    aifyVar = null;
                                                }
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z7 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i312 = (z7 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i313 = i11;
                                                    int i314 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar3 = new defpackage.epy(i23, i314, i313, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar3;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i312;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case 3:
                                                str9 = "video/mpeg2";
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z8 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i315 = (z8 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i316 = i11;
                                                    int i317 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar4 = new defpackage.epy(i23, i317, i316, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar4;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i315;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                byte[] bArr7 = fpdVar.m;
                                                if (bArr7 == null) {
                                                    aifyVarP = null;
                                                } else {
                                                    aifyVarP = java.util.Collections.singletonList(bArr7);
                                                }
                                                str9 = "video/mp4v-es";
                                                aifyVar = aifyVarP;
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z9 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i318 = (z9 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i319 = i11;
                                                    int i3110 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar5 = new defpackage.epy(i23, i3110, i319, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar5;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i318;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case 7:
                                                defpackage.fks fksVarA = defpackage.fks.a(new defpackage.etx(fpdVar.e(fpdVar.c)));
                                                aifyVar2 = fksVarA.a;
                                                fpdVar.af = fksVarA.b;
                                                str3 = fksVarA.l;
                                                i10 = fksVarA.g;
                                                i11 = fksVarA.i;
                                                i12 = fksVarA.h;
                                                i16 = fksVarA.e;
                                                i17 = fksVarA.f;
                                                str4 = "video/avc";
                                                aifyVar = aifyVar2;
                                                obj2 = str3;
                                                str9 = str4;
                                                i15 = -1;
                                                i14 = i16;
                                                i13 = i17;
                                                iO = -1;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z10 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i3111 = (z10 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i3112 = i11;
                                                    int i3113 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar6 = new defpackage.epy(i23, i3113, i3112, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar6;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i3111;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case 8:
                                                defpackage.flt fltVarA = defpackage.flt.a(new defpackage.etx(fpdVar.e(fpdVar.c)), false, null);
                                                aifyVar2 = fltVarA.a;
                                                fpdVar.af = fltVarA.b;
                                                str3 = fltVarA.n;
                                                i10 = fltVarA.h;
                                                i11 = fltVarA.j;
                                                i12 = fltVarA.i;
                                                i16 = fltVarA.f;
                                                i17 = fltVarA.g;
                                                str4 = "video/hevc";
                                                aifyVar = aifyVar2;
                                                obj2 = str3;
                                                str9 = str4;
                                                i15 = -1;
                                                i14 = i16;
                                                i13 = i17;
                                                iO = -1;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z11 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i3114 = (z11 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i3115 = i11;
                                                    int i3116 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar7 = new defpackage.epy(i23, i3116, i3115, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar7;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i3114;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case 9:
                                                android.util.Pair pairA = defpackage.fpd.a(new defpackage.etx(fpdVar.e(fpdVar.c)));
                                                str9 = (java.lang.String) pairA.first;
                                                aifyVarP = (java.util.List) pairA.second;
                                                aifyVar = aifyVarP;
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z12 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i3117 = (z12 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i3118 = i11;
                                                    int i3119 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar8 = new defpackage.epy(i23, i3119, i3118, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar8;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i3117;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case 10:
                                                str9 = "video/x-unknown";
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z13 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i31110 = (z13 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i31111 = i11;
                                                    int i31112 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar9 = new defpackage.epy(i23, i31112, i31111, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar9;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i31110;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case 11:
                                                aifyVarB = defpackage.fpd.b(fpdVar.e(str8));
                                                i15 = 8192;
                                                str9 = "audio/vorbis";
                                                aifyVar = aifyVarB;
                                                iO = -1;
                                                i10 = -1;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z14 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i31113 = (z14 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i31114 = i11;
                                                    int i31115 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar10 = new defpackage.epy(i23, i31115, i31114, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar10;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i31113;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case 12:
                                                aifyVarB = new java.util.ArrayList(3);
                                                aifyVarB.add(fpdVar.e(fpdVar.c));
                                                aifyVarB.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(fpdVar.U).array());
                                                aifyVarB.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(fpdVar.V).array());
                                                i15 = 5760;
                                                str9 = "audio/opus";
                                                aifyVar = aifyVarB;
                                                iO = -1;
                                                i10 = -1;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z15 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i31116 = (z15 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i31117 = i11;
                                                    int i31118 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar11 = new defpackage.epy(i23, i31118, i31117, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar11;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i31116;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                                aify aifyVarSingletonList = java.util.Collections.singletonList(fpdVar.e(str8));
                                                defpackage.fsi fsiVarA = defpackage.fko.a(fpdVar.m);
                                                fpdVar.T = fsiVarA.a;
                                                fpdVar.Q = fsiVarA.b;
                                                str9 = "audio/mp4a-latm";
                                                aifyVar = aifyVarSingletonList;
                                                obj2 = fsiVarA.c;
                                                iO = -1;
                                                i15 = -1;
                                                i10 = -1;
                                                i11 = -1;
                                                i12 = -1;
                                                i13 = -1;
                                                i14 = -1;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z16 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i31119 = (z16 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i311110 = i11;
                                                    int i311111 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar12 = new defpackage.epy(i23, i311111, i311110, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar12;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i31119;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                                i18 = 4096;
                                                str9 = "audio/mpeg-L2";
                                                i15 = i18;
                                                iO = -1;
                                                i10 = -1;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z17 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i311112 = (z17 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i311113 = i11;
                                                    int i311114 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar13 = new defpackage.epy(i23, i311114, i311113, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar13;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i311112;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                                i18 = 4096;
                                                str9 = "audio/mpeg";
                                                i15 = i18;
                                                iO = -1;
                                                i10 = -1;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z18 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i311115 = (z18 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i311116 = i11;
                                                    int i311117 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar14 = new defpackage.epy(i23, i311117, i311116, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar14;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i311115;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case 16:
                                                str9 = "audio/ac3";
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z19 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i311118 = (z19 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i311119 = i11;
                                                    int i3111110 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar15 = new defpackage.epy(i23, i3111110, i311119, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar15;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i311118;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                                str9 = "audio/eac3";
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z110 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i3111111 = (z110 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i3111112 = i11;
                                                    int i3111113 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar16 = new defpackage.epy(i23, i3111113, i3111112, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar16;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i3111111;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                                fpdVar.W = new defpackage.fml();
                                                str9 = "audio/true-hd";
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z111 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i3111114 = (z111 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i3111115 = i11;
                                                    int i3111116 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar17 = new defpackage.epy(i23, i3111116, i3111115, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar17;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i3111114;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                                fpdVar.X = true;
                                                str9 = "audio/vnd.dts";
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z112 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i3111117 = (z112 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i3111118 = i11;
                                                    int i3111119 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar18 = new defpackage.epy(i23, i3111119, i3111118, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar18;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i3111117;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                                                str9 = "audio/vnd.dts.hd;profile=lbr";
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z113 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i31111110 = (z113 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i31111111 = i11;
                                                    int i31111112 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar19 = new defpackage.epy(i23, i31111112, i31111111, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar19;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i31111110;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                                                str9 = "audio/vnd.dts.hd";
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z114 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i31111113 = (z114 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i31111114 = i11;
                                                    int i31111115 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar110 = new defpackage.epy(i23, i31111115, i31111114, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar110;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i31111113;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                                                aifyVarP = java.util.Collections.singletonList(fpdVar.e(str8));
                                                iO2 = eum.o(fpdVar.R);
                                                str9 = "audio/flac";
                                                if (iO2 != 0) {
                                                    aifyVar = aifyVarP;
                                                    iO = iO2;
                                                    i15 = -1;
                                                } else {
                                                    aifyVar = aifyVarP;
                                                    iO = -1;
                                                    i15 = -1;
                                                }
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z115 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i31111116 = (z115 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i31111117 = i11;
                                                    int i31111118 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar111 = new defpackage.epy(i23, i31111118, i31111117, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar111;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i31111116;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_LEFT /* 23 */:
                                                aifyVarP = java.util.Collections.singletonList(fpdVar.e(str8));
                                                iO2 = eum.o(fpdVar.R);
                                                str9 = "audio/alac";
                                                if (iO2 == 0) {
                                                    aifyVar = aifyVarP;
                                                    iO = -1;
                                                    i15 = -1;
                                                } else {
                                                    aifyVar = aifyVarP;
                                                    iO = iO2;
                                                    i15 = -1;
                                                }
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z116 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i31111119 = (z116 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i311111110 = i11;
                                                    int i311111111 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar112 = new defpackage.epy(i23, i311111111, i311111110, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar112;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i31111119;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                                if (fpdVar.d(new defpackage.etx(fpdVar.e(fpdVar.c)))) {
                                                    iO = eum.o(fpdVar.R);
                                                    if (iO == 0) {
                                                        defpackage.etr.f("MatroskaExtractor", "Unsupported PCM bit depth: " + fpdVar.R + ". Setting mimeType to audio/x-unknown");
                                                    } else {
                                                        i15 = -1;
                                                    }
                                                    i10 = i15;
                                                    i11 = i10;
                                                    i12 = i11;
                                                    i13 = i12;
                                                    i14 = i13;
                                                    obj2 = null;
                                                    aifyVar = null;
                                                    if (fpdVar.P != null) {
                                                        obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                        str9 = "video/dolby-vision";
                                                    }
                                                    boolean z117 = fpdVar.ab;
                                                    if (true != fpdVar.aa) {
                                                        i19 = 0;
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    int i311111112 = (z117 ? 1 : 0) | i19;
                                                    eqfVar = new defpackage.eqf();
                                                    if (defpackage.eqz.f(str9)) {
                                                        eqfVar.F = fpdVar.Q;
                                                        eqfVar.G = fpdVar.S;
                                                        eqfVar.H = fpdVar.T;
                                                        eqfVar.I = iO;
                                                    } else if (defpackage.eqz.i(str9)) {
                                                        if (fpdVar.t == 0) {
                                                            i28 = fpdVar.r;
                                                            i20 = -1;
                                                            if (i28 == -1) {
                                                                i28 = fpdVar.o;
                                                            }
                                                            fpdVar.r = i28;
                                                            i29 = fpdVar.s;
                                                            if (i29 == -1) {
                                                                i29 = fpdVar.p;
                                                            }
                                                            fpdVar.s = i29;
                                                        } else {
                                                            i20 = -1;
                                                        }
                                                        i21 = fpdVar.r;
                                                        if (i21 != i20) {
                                                            i22 = i20;
                                                            f2 = -1.0f;
                                                        } else {
                                                            i22 = i20;
                                                            f2 = -1.0f;
                                                        }
                                                        if (i10 != i22) {
                                                            i23 = i10;
                                                        } else if (i11 != i22) {
                                                            i23 = i22;
                                                        } else {
                                                            if (i12 == i22) {
                                                                i10 = fpdVar.A;
                                                                i11 = fpdVar.B;
                                                                i12 = fpdVar.C;
                                                            } else {
                                                                i10 = fpdVar.A;
                                                                i11 = fpdVar.B;
                                                                i12 = fpdVar.C;
                                                            }
                                                            i23 = i10;
                                                        }
                                                        int i311111113 = i11;
                                                        int i311111114 = i12;
                                                        if (i14 == i22) {
                                                            i24 = i14;
                                                        } else {
                                                            i24 = i14;
                                                        }
                                                        if (i13 == i22) {
                                                            i26 = fpdVar.q;
                                                            if (i26 == i22) {
                                                                i25 = 8;
                                                            } else {
                                                                i25 = i26;
                                                            }
                                                        } else {
                                                            i25 = i13;
                                                        }
                                                        if (fpdVar.F != -1.0f) {
                                                            bArr2 = null;
                                                        } else {
                                                            bArr2 = null;
                                                        }
                                                        defpackage.epy epyVar113 = new defpackage.epy(i23, i311111114, i311111113, bArr2, i24, i25);
                                                        str5 = fpdVar.b;
                                                        if (str5 != null) {
                                                            iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (fpdVar.u == 0) {
                                                            if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        eqfVar.t = fpdVar.o;
                                                        eqfVar.u = fpdVar.p;
                                                        eqfVar.A = f2;
                                                        eqfVar.y = iIntValue;
                                                        eqfVar.B = fpdVar.y;
                                                        eqfVar.C = fpdVar.z;
                                                        eqfVar.D = epyVar113;
                                                    } else if (!"application/x-subrip".equals(str9)) {
                                                        throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                    }
                                                    str6 = fpdVar.b;
                                                    if (str6 != null) {
                                                        eqfVar.b = fpdVar.b;
                                                    }
                                                    eqfVar.b(i35);
                                                    if (true != fpdVar.a) {
                                                        str7 = "video/x-matroska";
                                                    } else {
                                                        str7 = "video/webm";
                                                    }
                                                    eqfVar.a(str7);
                                                    eqfVar.c(str9);
                                                    eqfVar.o = i15;
                                                    eqfVar.d = fpdVar.ac;
                                                    eqfVar.e = i311111112;
                                                    eqfVar.q = aifyVar;
                                                    eqfVar.j = (java.lang.String) obj2;
                                                    eqfVar.r = fpdVar.n;
                                                    fpdVar.ae = new defpackage.eqg(eqfVar);
                                                    fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                    fpeVar.E.put(fpdVar.d, fpdVar);
                                                    i3 = 1;
                                                } else {
                                                    defpackage.etr.f("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                }
                                                str9 = "audio/x-unknown";
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z118 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i311111115 = (z118 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i311111116 = i11;
                                                    int i311111117 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar114 = new defpackage.epy(i23, i311111117, i311111116, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar114;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i311111115;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_LEFT /* 25 */:
                                                iO = eum.o(fpdVar.R);
                                                if (iO == 0) {
                                                    defpackage.etr.f("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + fpdVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    iO = -1;
                                                    i15 = -1;
                                                } else {
                                                    i15 = -1;
                                                }
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z119 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i311111118 = (z119 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i311111119 = i11;
                                                    int i3111111110 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar115 = new defpackage.epy(i23, i3111111110, i311111119, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar115;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i311111118;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                                iO = eum.p(fpdVar.R, java.nio.ByteOrder.BIG_ENDIAN);
                                                if (iO == 0) {
                                                    defpackage.etr.f("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + fpdVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    iO = -1;
                                                    i15 = -1;
                                                } else {
                                                    i15 = -1;
                                                }
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1110 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i3111111111 = (z1110 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i3111111112 = i11;
                                                    int i3111111113 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar116 = new defpackage.epy(i23, i3111111113, i3111111112, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar116;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i3111111111;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                                iO = eum.m(fpdVar.R);
                                                if (iO == 0) {
                                                    defpackage.etr.f("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + fpdVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    iO = -1;
                                                    i15 = -1;
                                                } else {
                                                    i15 = -1;
                                                }
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1111 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i3111111114 = (z1111 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i3111111115 = i11;
                                                    int i3111111116 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar117 = new defpackage.epy(i23, i3111111116, i3111111115, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar117;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i3111111114;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                                str9 = "application/x-subrip";
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1112 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i3111111117 = (z1112 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i3111111118 = i11;
                                                    int i3111111119 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar118 = new defpackage.epy(i23, i3111111119, i3111111118, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar118;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i3111111117;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                            case 30:
                                                aifyVarP = aify.q(a, fpdVar.e(str8));
                                                str9 = "text/x-ssa";
                                                aifyVar = aifyVarP;
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1113 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i31111111110 = (z1113 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i31111111111 = i11;
                                                    int i31111111112 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar119 = new defpackage.epy(i23, i31111111112, i31111111111, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar119;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i31111111110;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case 31:
                                                str9 = "text/vtt";
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1114 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i31111111113 = (z1114 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i31111111114 = i11;
                                                    int i31111111115 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar1110 = new defpackage.epy(i23, i31111111115, i31111111114, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar1110;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i31111111113;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case 32:
                                                aifyVarP = aify.p(fpdVar.e(str8));
                                                str9 = "application/vobsub";
                                                aifyVar = aifyVarP;
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1115 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i31111111116 = (z1115 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i31111111117 = i11;
                                                    int i31111111118 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar1111 = new defpackage.epy(i23, i31111111118, i31111111117, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar1111;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i31111111116;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                                str9 = "application/pgs";
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                aifyVar = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1116 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i31111111119 = (z1116 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i311111111110 = i11;
                                                    int i311111111111 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar1112 = new defpackage.epy(i23, i311111111111, i311111111110, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar1112;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i31111111119;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                                byte[] bArr8 = new byte[4];
                                                java.lang.System.arraycopy(fpdVar.e(str8), 0, bArr8, 0, 4);
                                                aifyVarP = aify.p(bArr8);
                                                str9 = "application/dvbsubs";
                                                aifyVar = aifyVarP;
                                                iO = -1;
                                                i15 = -1;
                                                i10 = i15;
                                                i11 = i10;
                                                i12 = i11;
                                                i13 = i12;
                                                i14 = i13;
                                                obj2 = null;
                                                if (fpdVar.P != null) {
                                                    obj2 = defpackage.oq.l(new defpackage.etx(fpdVar.P)).a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1117 = fpdVar.ab;
                                                if (true != fpdVar.aa) {
                                                    i19 = 0;
                                                } else {
                                                    i19 = 2;
                                                }
                                                int i311111111112 = (z1117 ? 1 : 0) | i19;
                                                eqfVar = new defpackage.eqf();
                                                if (defpackage.eqz.f(str9)) {
                                                    eqfVar.F = fpdVar.Q;
                                                    eqfVar.G = fpdVar.S;
                                                    eqfVar.H = fpdVar.T;
                                                    eqfVar.I = iO;
                                                } else if (defpackage.eqz.i(str9)) {
                                                    if (fpdVar.t == 0) {
                                                        i28 = fpdVar.r;
                                                        i20 = -1;
                                                        if (i28 == -1) {
                                                            i28 = fpdVar.o;
                                                        }
                                                        fpdVar.r = i28;
                                                        i29 = fpdVar.s;
                                                        if (i29 == -1) {
                                                            i29 = fpdVar.p;
                                                        }
                                                        fpdVar.s = i29;
                                                    } else {
                                                        i20 = -1;
                                                    }
                                                    i21 = fpdVar.r;
                                                    if (i21 != i20) {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    } else {
                                                        i22 = i20;
                                                        f2 = -1.0f;
                                                    }
                                                    if (i10 != i22) {
                                                        i23 = i10;
                                                    } else if (i11 != i22) {
                                                        i23 = i22;
                                                    } else {
                                                        if (i12 == i22) {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        } else {
                                                            i10 = fpdVar.A;
                                                            i11 = fpdVar.B;
                                                            i12 = fpdVar.C;
                                                        }
                                                        i23 = i10;
                                                    }
                                                    int i311111111113 = i11;
                                                    int i311111111114 = i12;
                                                    if (i14 == i22) {
                                                        i24 = i14;
                                                    } else {
                                                        i24 = i14;
                                                    }
                                                    if (i13 == i22) {
                                                        i26 = fpdVar.q;
                                                        if (i26 == i22) {
                                                            i25 = 8;
                                                        } else {
                                                            i25 = i26;
                                                        }
                                                    } else {
                                                        i25 = i13;
                                                    }
                                                    if (fpdVar.F != -1.0f) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = null;
                                                    }
                                                    defpackage.epy epyVar1113 = new defpackage.epy(i23, i311111111114, i311111111113, bArr2, i24, i25);
                                                    str5 = fpdVar.b;
                                                    if (str5 != null) {
                                                        iIntValue = ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(c, str5, -1)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (fpdVar.u == 0) {
                                                        if (java.lang.Float.compare(fpdVar.x, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (java.lang.Float.compare(fpdVar.x, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (java.lang.Float.compare(fpdVar.x, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    eqfVar.t = fpdVar.o;
                                                    eqfVar.u = fpdVar.p;
                                                    eqfVar.A = f2;
                                                    eqfVar.y = iIntValue;
                                                    eqfVar.B = fpdVar.y;
                                                    eqfVar.C = fpdVar.z;
                                                    eqfVar.D = epyVar1113;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw new defpackage.era("Unexpected MIME type.", null, true, 1);
                                                }
                                                str6 = fpdVar.b;
                                                if (str6 != null) {
                                                    eqfVar.b = fpdVar.b;
                                                }
                                                eqfVar.b(i35);
                                                if (true != fpdVar.a) {
                                                    str7 = "video/x-matroska";
                                                } else {
                                                    str7 = "video/webm";
                                                }
                                                eqfVar.a(str7);
                                                eqfVar.c(str9);
                                                eqfVar.o = i15;
                                                eqfVar.d = fpdVar.ac;
                                                eqfVar.e = i311111111112;
                                                eqfVar.q = aifyVar;
                                                eqfVar.j = (java.lang.String) obj2;
                                                eqfVar.r = fpdVar.n;
                                                fpdVar.ae = new defpackage.eqg(eqfVar);
                                                fpdVar.ad = fpeVar.av.r(fpdVar.d, fpdVar.f);
                                                fpeVar.E.put(fpdVar.d, fpdVar);
                                                i3 = 1;
                                                break;
                                            default:
                                                throw new defpackage.era("Unrecognized codec identifier.", null, true, 1);
                                        }
                                    default:
                                        i3 = 1;
                                        fpeVar.j = null;
                                        i6 = i3;
                                        z2 = false;
                                        break;
                                }
                            } else {
                                if (i34 == 17849) {
                                    int i40 = 0;
                                    while (true) {
                                        android.util.SparseArray sparseArray = fpeVar.E;
                                        if (i40 < sparseArray.size()) {
                                            fpeVar.w((defpackage.fpd) sparseArray.valueAt(i40));
                                            i40++;
                                        }
                                    }
                                } else {
                                    if (i34 == 19899) {
                                        int i41 = fpeVar.l;
                                        if (i41 != -1) {
                                            long j6 = fpeVar.m;
                                            if (j6 != -1) {
                                                if (i41 == 475249515) {
                                                    fpeVar.aa = j6;
                                                } else if (i41 == 374648427) {
                                                    fpeVar.s = j6;
                                                }
                                            }
                                        }
                                        throw new defpackage.era("Mandatory element SeekID or SeekPosition not found", null, true, 1);
                                    }
                                    if (i34 == 25152) {
                                        fpeVar.l(i34);
                                        defpackage.fpd fpdVar2 = fpeVar.j;
                                        if (fpdVar2.j) {
                                            if (fpdVar2.l == null) {
                                                throw new defpackage.era("Encrypted Track found but ContentEncKeyID was not found", null, true, 1);
                                            }
                                            fpdVar2.n = new androidx.media3.common.DrmInitData(null, true, new androidx.media3.common.DrmInitData.SchemeData(defpackage.epx.a, null, "video/webm", fpeVar.j.l.b));
                                        }
                                    } else if (i34 == 28032) {
                                        fpeVar.l(i34);
                                        defpackage.fpd fpdVar3 = fpeVar.j;
                                        if (fpdVar3.j && fpdVar3.k != null) {
                                            throw new defpackage.era("Combining encryption and compression is not supported", null, true, 1);
                                        }
                                    } else if (i34 == 357149030) {
                                        if (fpeVar.f == -9223372036854775807L) {
                                            fpeVar.f = 1000000L;
                                        }
                                        long j7 = fpeVar.g;
                                        if (j7 != -9223372036854775807L) {
                                            fpeVar.V = fpeVar.h(j7);
                                        }
                                    } else if (i34 != 374648427) {
                                        if (i34 != 475249515) {
                                            if (i34 == 182) {
                                                defpackage.fpa fpaVar = (defpackage.fpa) fpeVar.i.poll();
                                                ahvr.ci(fpaVar);
                                                long j8 = fpaVar.a;
                                                if (j8 != 0) {
                                                    fpeVar.F.put(j8, fpaVar);
                                                }
                                            } else if (i34 == 183 && !fpeVar.k) {
                                                fpeVar.k(i34);
                                                if (fpeVar.o != -9223372036854775807L && (i30 = fpeVar.p) != -1 && fpeVar.q != -1) {
                                                    android.util.SparseArray sparseArray2 = fpeVar.X;
                                                    java.util.List arrayList = (java.util.List) sparseArray2.get(i30);
                                                    if (arrayList == null) {
                                                        arrayList = new java.util.ArrayList();
                                                        sparseArray2.put(fpeVar.p, arrayList);
                                                    }
                                                    arrayList.add(new defpackage.fpb(fpeVar.o, fpeVar.e + fpeVar.q, fpeVar.r));
                                                }
                                            }
                                        } else if (!fpeVar.k) {
                                            ?? r5 = z3;
                                            while (true) {
                                                ?? r6 = fpeVar.X;
                                                if (r5 < r6.size()) {
                                                    if (((java.util.List) r6.valueAt(r5)).isEmpty()) {
                                                        r5++;
                                                    } else if (fpeVar.V != -9223372036854775807L) {
                                                        for (?? r7 = z3; r7 < r6.size(); r7++) {
                                                            java.util.Collections.sort((java.util.List) r6.valueAt(r7));
                                                        }
                                                        fpeVar.av.y(new defpackage.fpc(r6, fpeVar.V, fpeVar.Y, fpeVar.e, fpeVar.d));
                                                    }
                                                }
                                                fpeVar.av.y(new defpackage.flz(fpeVar.V, 0L));
                                            }
                                            fpeVar.k = true;
                                            fpeVar.n = z3;
                                            ?? r8 = z3;
                                            while (true) {
                                                ?? r9 = fpeVar.E;
                                                if (r8 < r9.size()) {
                                                    defpackage.fpd fpdVar4 = (defpackage.fpd) r9.valueAt(r8);
                                                    if (!fpdVar4.X) {
                                                        fpeVar.w(fpdVar4);
                                                        fpdVar4.c();
                                                        defpackage.fmk fmkVar = fpdVar4.ad;
                                                        defpackage.eqg eqgVar = fpdVar4.ae;
                                                        ahvr.ci(eqgVar);
                                                        fmkVar.p(eqgVar);
                                                    }
                                                    r8++;
                                                } else {
                                                    fpeVar.t();
                                                }
                                            }
                                        }
                                        z2 = z3;
                                        i = -1;
                                        i3 = 1;
                                        i6 = i3;
                                    } else {
                                        ?? r10 = fpeVar.E;
                                        if (r10.size() == 0) {
                                            throw new defpackage.era("No valid tracks were found", null, true, 1);
                                        }
                                        boolean z20 = (!fpeVar.G || fpeVar.aa == -1 || fpeVar.k) ? true : z3;
                                        int i42 = -1;
                                        int i43 = -1;
                                        int i44 = -1;
                                        int i45 = -1;
                                        for (?? r11 = z3; r11 < r10.size(); r11++) {
                                            defpackage.fpd fpdVar5 = (defpackage.fpd) r10.valueAt(r11);
                                            int i46 = fpdVar5.f;
                                            if (i46 == 2) {
                                                if (fpdVar5.ab) {
                                                    i42 = fpdVar5.d;
                                                }
                                                if (i43 == -1) {
                                                    i43 = fpdVar5.d;
                                                }
                                            } else if (i46 == 1) {
                                                if (fpdVar5.ab) {
                                                    i44 = fpdVar5.d;
                                                }
                                                if (i45 == -1) {
                                                    i45 = fpdVar5.d;
                                                }
                                            }
                                            if (z20 && !fpdVar5.X) {
                                                fpeVar.w(fpdVar5);
                                                fpdVar5.c();
                                                defpackage.fmk fmkVar2 = fpdVar5.ad;
                                                defpackage.eqg eqgVar2 = fpdVar5.ae;
                                                ahvr.ci(eqgVar2);
                                                fmkVar2.p(eqgVar2);
                                            }
                                        }
                                        if (i42 != -1) {
                                            fpeVar.Y = i42;
                                        } else if (i43 != -1) {
                                            fpeVar.Y = i43;
                                        } else if (i44 != -1) {
                                            fpeVar.Y = i44;
                                        } else if (i45 != -1) {
                                            fpeVar.Y = i45;
                                        } else {
                                            fpeVar.Y = r10.size() > 0 ? ((defpackage.fpd) r10.valueAt(0)).d : -1;
                                        }
                                        fpeVar.u = true;
                                        if (fpeVar.ac != -1) {
                                            fpeVar.o();
                                        }
                                        if (z20) {
                                            fpeVar.t();
                                        }
                                    }
                                }
                                i = -1;
                                i3 = 1;
                                i6 = 1;
                                z2 = false;
                            }
                        } else if (fpeVar.ae == 2) {
                            defpackage.fpd fpdVar6 = (defpackage.fpd) fpeVar.E.get(fpeVar.aj);
                            fpdVar6.c();
                            if (fpeVar.z > 0 && "A_OPUS".equals(fpdVar6.c)) {
                                fpeVar.T.N(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(fpeVar.z).array());
                            }
                            int i47 = 0;
                            for (int i48 = 0; i48 < fpeVar.ah; i48++) {
                                i47 += fpeVar.ai[i48];
                            }
                            int i49 = 0;
                            while (i49 < fpeVar.ah) {
                                long j9 = fpeVar.af + ((long) ((fpdVar6.g * i49) / 1000));
                                int i50 = fpeVar.al;
                                if (i49 == 0) {
                                    if (!fpeVar.y) {
                                        i50 |= 1;
                                    }
                                    i9 = i50;
                                    i49 = 0;
                                } else {
                                    i9 = i50;
                                }
                                int i51 = fpeVar.ai[i49];
                                int i52 = i47 - i51;
                                fpeVar.s(fpdVar6, j9, i9, i51, i52);
                                i49++;
                                i47 = i52;
                            }
                            z2 = false;
                            fpeVar.ae = 0;
                            i3 = 1;
                            i6 = 1;
                        }
                        i = -1;
                    } else {
                        defpackage.fpa fpaVarI = fpeVar.i(i34);
                        if (fpaVarI.f == null && (str2 = fpaVarI.h) != null) {
                            fpaVarI.f = str2;
                            java.lang.String str10 = fpaVarI.i;
                            if (str10 != null) {
                                fpaVarI.g = str10;
                            }
                        }
                    }
                    i3 = 1;
                    i6 = 1;
                    z2 = false;
                    i = -1;
                }
            }
            if (i6 != 0) {
                long j10 = ((defpackage.flc) flkVar).b;
                if (this.t) {
                    this.ac = j10;
                    aesqVar.a = this.s;
                    this.t = z2;
                } else {
                    if (this.u) {
                        long j11 = this.ac;
                        if (j11 != -1) {
                            aesqVar.a = j11;
                            this.ac = -1L;
                        }
                    }
                    if (this.Z) {
                        this.ab = j10;
                        aesqVar.a = this.aa;
                        this.Z = false;
                    } else if (this.k) {
                        long j12 = this.ab;
                        if (j12 != -1) {
                            aesqVar.a = j12;
                            this.ab = -1L;
                        }
                    }
                }
                return i3;
            }
            if (i6 == 0) {
                int i53 = 0;
                while (true) {
                    android.util.SparseArray sparseArray3 = this.E;
                    if (i53 >= sparseArray3.size()) {
                        return i;
                    }
                    defpackage.fpd fpdVar7 = (defpackage.fpd) sparseArray3.valueAt(i53);
                    fpdVar7.c();
                    defpackage.fml fmlVar = fpdVar7.W;
                    if (fmlVar != null) {
                        fmlVar.a(fpdVar7.ad, fpdVar7.l);
                    }
                    i53++;
                }
            } else {
                z3 = false;
            }
        }
        return z3 ? 1 : 0;
    }

    public final long h(long j) throws defpackage.era {
        long j2 = this.f;
        if (j2 != -9223372036854775807L) {
            return eum.z(j, j2, 1000L);
        }
        throw new defpackage.era("Can't scale timecode prior to timecodeScale being set.", null, true, 1);
    }

    public final defpackage.fpa i(int i) throws defpackage.era {
        defpackage.fpa fpaVar = (defpackage.fpa) this.i.peek();
        if (fpaVar != null) {
            return fpaVar;
        }
        throw new defpackage.era(a.bs(i, "Element ", " must be in a ChapterAtom"), null, true, 1);
    }

    public final defpackage.fpd j(int i) throws defpackage.era {
        l(i);
        return this.j;
    }

    public final void k(int i) throws defpackage.era {
        if (!this.n) {
            throw new defpackage.era(a.bs(i, "Element ", " must be in a Cues"), null, true, 1);
        }
    }

    public final void l(int i) throws defpackage.era {
        if (this.j == null) {
            throw new defpackage.era(a.bs(i, "Element ", " must be in a TrackEntry"), null, true, 1);
        }
    }

    public final void m() {
        ahvr.ci(this.av);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x029c  */
    /* JADX WARN: Code duplicated, block: B:114:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ab A[PHI: r1
      0x02ab: PHI (r1v11 int) = (r1v0 int), (r1v17 int) binds: [B:111:0x029a, B:116:0x02a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b2  */
    /* JADX WARN: Multi-variable type inference failed */
    protected final void n(int i, int i2, defpackage.flk flkVar) throws defpackage.era {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14 = i;
        java.lang.Throwable th = null;
        int i15 = 2;
        int i16 = 1;
        int i17 = 0;
        if (i14 != 161 && i14 != 163) {
            if (i14 == 165) {
                if (this.ae == 2) {
                    defpackage.fpd fpdVar = (defpackage.fpd) this.E.get(this.aj);
                    if (this.x != 4 || !"V_VP9".equals(fpdVar.c)) {
                        ((defpackage.flc) flkVar).p(i2, false);
                        return;
                    }
                    defpackage.etx etxVar = this.T;
                    etxVar.M(i2);
                    ((defpackage.flc) flkVar).o(etxVar.b, 0, i2, false);
                    if (this.H || !defpackage.ete.j(etxVar.b, i2)) {
                        return;
                    }
                    etxVar.M(0);
                    return;
                }
                return;
            }
            if (i14 == 16877) {
                defpackage.fpd fpdVarJ = j(i);
                int i18 = fpdVarJ.i;
                if (i18 != 1685485123 && i18 != 1685480259) {
                    ((defpackage.flc) flkVar).p(i2, false);
                    return;
                }
                fpdVarJ.P = new byte[i2];
                ((defpackage.flc) flkVar).o(fpdVarJ.P, 0, i2, false);
                return;
            }
            if (i14 == 16981) {
                l(i);
                defpackage.fpd fpdVar2 = this.j;
                fpdVar2.k = new byte[i2];
                ((defpackage.flc) flkVar).o(fpdVar2.k, 0, i2, false);
                return;
            }
            if (i14 == 18402) {
                byte[] bArr = new byte[i2];
                ((defpackage.flc) flkVar).o(bArr, 0, i2, false);
                j(i).l = new defpackage.fmj(1, bArr, 0, 0);
                return;
            }
            if (i14 == 21419) {
                defpackage.etx etxVar2 = this.O;
                java.util.Arrays.fill(etxVar2.b, (byte) 0);
                ((defpackage.flc) flkVar).o(etxVar2.b, 4 - i2, i2, false);
                etxVar2.Q(0);
                this.l = (int) etxVar2.w();
                return;
            }
            if (i14 == 25506) {
                l(i);
                defpackage.fpd fpdVar3 = this.j;
                fpdVar3.m = new byte[i2];
                ((defpackage.flc) flkVar).o(fpdVar3.m, 0, i2, false);
                return;
            }
            if (i14 != 30322) {
                throw new defpackage.era(a.bj(i14, "Unexpected id: "), null, true, 1);
            }
            l(i);
            defpackage.fpd fpdVar4 = this.j;
            fpdVar4.y = new byte[i2];
            ((defpackage.flc) flkVar).o(fpdVar4.y, 0, i2, false);
            return;
        }
        int i19 = 8;
        if (this.ae == 0) {
            defpackage.fpf fpfVar = this.D;
            this.aj = (int) fpfVar.c(flkVar, false, true, 8);
            this.ak = fpfVar.a;
            this.w = -9223372036854775807L;
            this.ae = 1;
            this.M.M(0);
        }
        defpackage.fpd fpdVar5 = (defpackage.fpd) this.E.get(this.aj);
        if (fpdVar5 == null) {
            ((defpackage.flc) flkVar).p(i2 - this.ak, false);
            this.ae = 0;
            return;
        }
        fpdVar5.c();
        if (this.ae == 1) {
            u(flkVar, 3);
            defpackage.etx etxVar3 = this.M;
            int i20 = (etxVar3.b[2] & 6) >> 1;
            if (i20 == 0) {
                this.ah = 1;
                int[] iArrZ = z(this.ai, 1);
                this.ai = iArrZ;
                iArrZ[0] = (i2 - this.ak) - 3;
            } else {
                u(flkVar, 4);
                int i21 = (etxVar3.b[3] & 255) + 1;
                this.ah = i21;
                int[] iArrZ2 = z(this.ai, i21);
                this.ai = iArrZ2;
                if (i20 == 2) {
                    int i22 = (i2 - this.ak) - 4;
                    int i23 = this.ah;
                    java.util.Arrays.fill(iArrZ2, 0, i23, i22 / i23);
                } else {
                    if (i20 == 1) {
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            i10 = this.ah - 1;
                            iArr = this.ai;
                            if (i24 >= i10) {
                                break;
                            }
                            iArr[i24] = 0;
                            while (true) {
                                i11 = i26 + 1;
                                u(flkVar, i11);
                                int i27 = etxVar3.b[i26] & 255;
                                int[] iArr2 = this.ai;
                                i12 = iArr2[i24] + i27;
                                iArr2[i24] = i12;
                                if (i27 != 255) {
                                    break;
                                } else {
                                    i26 = i11;
                                }
                            }
                            i25 += i12;
                            i24++;
                            i26 = i11;
                        }
                        iArr[i10] = ((i2 - this.ak) - i26) - i25;
                    } else {
                        if (i20 != 3) {
                            throw new defpackage.era("Unexpected lacing value: 2", null, true, 1);
                        }
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 4;
                        while (true) {
                            int i31 = this.ah - 1;
                            i4 = i17;
                            int[] iArr3 = this.ai;
                            if (i28 >= i31) {
                                i5 = i15;
                                i6 = i16;
                                iArr3[i31] = ((i2 - this.ak) - i30) - i29;
                                break;
                            }
                            iArr3[i28] = i4;
                            int i32 = i30 + 1;
                            u(flkVar, i32);
                            if (etxVar3.b[i30] == 0) {
                                boolean z = i16;
                                throw new defpackage.era("No valid varint length mask found", th, z, z ? 1 : 0);
                            }
                            int i33 = i4;
                            while (true) {
                                if (i33 >= i19) {
                                    i7 = i15;
                                    i8 = i19;
                                    j = 0;
                                    i9 = i32;
                                    break;
                                }
                                i8 = i19;
                                int i34 = i16 << (7 - i33);
                                i7 = i15;
                                if ((etxVar3.b[i30] & i34) != 0) {
                                    int i35 = i32 + i33;
                                    u(flkVar, i35);
                                    int i36 = i30 + 1;
                                    j = etxVar3.b[i30] & 255 & (~i34);
                                    int i37 = i36;
                                    while (i37 < i35) {
                                        j = (j << i8) | ((long) (etxVar3.b[i37] & 255));
                                        i37++;
                                        i35 = i35;
                                    }
                                    i9 = i35;
                                    if (i28 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i33 * 7) + 6)) - 1;
                                    break;
                                }
                                i33++;
                                i15 = i7;
                                i19 = i8;
                                i16 = 1;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw new defpackage.era("EBML lacing sample size out of range.", null, true, 1);
                            }
                            int[] iArr4 = this.ai;
                            int i38 = (int) j;
                            if (i28 != 0) {
                                i38 += iArr4[i28 - 1];
                            }
                            iArr4[i28] = i38;
                            i29 += i38;
                            i28++;
                            i17 = i4;
                            i15 = i7;
                            i19 = i8;
                            i30 = i9;
                            th = null;
                            i16 = 1;
                        }
                    }
                    byte[] bArr2 = etxVar3.b;
                    this.af = this.v + h((bArr2[i4] << 8) | (bArr2[i6] & 255));
                    if (fpdVar5.f == i6) {
                        i13 = 1;
                    } else if (i14 == 163) {
                        i13 = i4;
                    } else if ((etxVar3.b[i5] & 128) == 128) {
                        i14 = 163;
                        i13 = 1;
                    } else {
                        i13 = i4;
                        i14 = 163;
                    }
                    this.al = i13;
                    this.ae = i5;
                    this.ag = i4;
                    i3 = 163;
                }
            }
            i5 = 2;
            i4 = 0;
            i6 = 1;
            byte[] bArr3 = etxVar3.b;
            this.af = this.v + h((bArr3[i4] << 8) | (bArr3[i6] & 255));
            if (fpdVar5.f == i6) {
                i13 = 1;
            } else if (i14 == 163) {
                i13 = i4;
            } else if ((etxVar3.b[i5] & 128) == 128) {
                i14 = 163;
                i13 = 1;
            } else {
                i13 = i4;
                i14 = 163;
            }
            this.al = i13;
            this.ae = i5;
            this.ag = i4;
            i3 = 163;
        } else {
            i3 = 163;
        }
        if (i14 == i3) {
            while (true) {
                int i39 = this.ag;
                if (i39 >= this.ah) {
                    this.ae = 0;
                    return;
                }
                int iQ = q(flkVar, fpdVar5, this.ai[i39], false);
                defpackage.fpd fpdVar6 = fpdVar5;
                s(fpdVar6, this.af + ((long) ((this.ag * fpdVar5.g) / 1000)), this.al, iQ, 0);
                this.ag++;
                fpdVar5 = fpdVar6;
            }
        } else {
            while (true) {
                int i40 = this.ag;
                if (i40 >= this.ah) {
                    return;
                }
                int[] iArr5 = this.ai;
                iArr5[i40] = q(flkVar, fpdVar5, iArr5[i40], true);
                this.ag++;
            }
        }
    }

    public final void o() {
        if (this.k) {
            return;
        }
        if (this.G && this.aa != -1) {
            this.Z = true;
            return;
        }
        defpackage.fll fllVar = this.av;
        ahvr.ci(fllVar);
        fllVar.y(new defpackage.flz(this.V, 0L));
        this.k = true;
    }

    @Override // defpackage.flj
    public final void c() {
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }
}
