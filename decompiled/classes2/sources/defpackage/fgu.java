package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fgu implements defpackage.fmk {
    private int B;
    private defpackage.eqg E;
    private boolean G;
    private final alic H;
    public final defpackage.fgr a;
    public defpackage.fgt d;
    public defpackage.fcs e;
    public int j;
    public int k;
    public int l;
    public boolean r;
    public boolean t;
    public long u;
    public int v;
    private final defpackage.fcx w;
    private defpackage.eqg x;
    public final defpackage.fgs b = new defpackage.fgs();
    public int f = 1000;
    private long[] y = new long[1000];
    public long[] g = new long[1000];
    public long[] i = new long[1000];
    private int[] z = new int[1000];
    public int[] h = new int[1000];
    private defpackage.fmj[] A = new defpackage.fmj[1000];
    public final defpackage.fhc c = new defpackage.fhc(new defpackage.fch(2));
    public long m = Long.MIN_VALUE;
    public long n = Long.MIN_VALUE;
    public long o = Long.MIN_VALUE;
    private boolean D = true;
    public boolean s = true;
    private boolean F = true;
    private long C = Long.MIN_VALUE;
    public int p = -1;
    public int q = -1;

    protected fgu(defpackage.fio fioVar, defpackage.fcx fcxVar, alic alicVar) {
        this.w = fcxVar;
        this.H = alicVar;
        this.a = new defpackage.fgr(fioVar);
    }

    private final int C(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.i[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.z[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.f) {
                i = 0;
            }
        }
        return i3;
    }

    private final synchronized long D() {
        int i = this.j;
        if (i == 0) {
            return -1L;
        }
        return E(i);
    }

    private final long E(int i) {
        this.n = java.lang.Math.max(this.n, m(i));
        this.j -= i;
        int i2 = this.k + i;
        this.k = i2;
        int i3 = this.B + i;
        this.B = i3;
        int i4 = this.f;
        if (i3 >= i4) {
            this.B = i3 - i4;
        }
        int i5 = this.l - i;
        this.l = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.l = 0;
        }
        defpackage.fhc fhcVar = this.c;
        while (true) {
            android.util.SparseArray sparseArray = fhcVar.b;
            if (i6 >= sparseArray.size() - 1) {
                break;
            }
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            aa$.ExternalSyntheticApiModelOutline1.m(fhcVar.c, sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = fhcVar.a;
            if (i8 > 0) {
                fhcVar.a = i8 - 1;
            }
            i6 = i7;
        }
        if (this.j != 0) {
            return this.g[this.B];
        }
        int i9 = this.B;
        if (i9 == 0) {
            i9 = this.f;
        }
        int i10 = i9 - 1;
        return this.g[i10] + ((long) this.h[i10]);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0074 A[Catch: all -> 0x0141, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x001e, B:10:0x0021, B:14:0x0029, B:16:0x0062, B:35:0x00cb, B:37:0x00d4, B:18:0x0074, B:20:0x008f, B:24:0x009a, B:25:0x009f, B:27:0x00a7, B:31:0x00b5, B:33:0x00ba, B:34:0x00c8), top: B:44:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x008f A[Catch: all -> 0x0141, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x001e, B:10:0x0021, B:14:0x0029, B:16:0x0062, B:35:0x00cb, B:37:0x00d4, B:18:0x0074, B:20:0x008f, B:24:0x009a, B:25:0x009f, B:27:0x00a7, B:31:0x00b5, B:33:0x00ba, B:34:0x00c8), top: B:44:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0097  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a7 A[Catch: all -> 0x0141, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x001e, B:10:0x0021, B:14:0x0029, B:16:0x0062, B:35:0x00cb, B:37:0x00d4, B:18:0x0074, B:20:0x008f, B:24:0x009a, B:25:0x009f, B:27:0x00a7, B:31:0x00b5, B:33:0x00ba, B:34:0x00c8), top: B:44:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba A[Catch: all -> 0x0141, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x001e, B:10:0x0021, B:14:0x0029, B:16:0x0062, B:35:0x00cb, B:37:0x00d4, B:18:0x0074, B:20:0x008f, B:24:0x009a, B:25:0x009f, B:27:0x00a7, B:31:0x00b5, B:33:0x00ba, B:34:0x00c8), top: B:44:0x0001 }] */
    private final synchronized void F(long j, int i, long j2, int i2, defpackage.fmj fmjVar) {
        int i3;
        android.util.SparseArray sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        int i4 = this.j;
        if (i4 > 0) {
            int iG = g(i4 - 1);
            ahvr.bM(this.g[iG] + ((long) this.h[iG]) <= j2);
        }
        this.r = (536870912 & i) != 0;
        this.o = java.lang.Math.max(this.o, j);
        I(i(), j, i);
        int iG2 = g(this.j);
        this.i[iG2] = j;
        this.g[iG2] = j2;
        this.h[iG2] = i2;
        this.z[iG2] = i;
        this.A[iG2] = fmjVar;
        this.y[iG2] = 0;
        defpackage.fhc fhcVar = this.c;
        if (fhcVar.c()) {
            defpackage.eqg eqgVar = this.E;
            ahvr.ci(eqgVar);
            defpackage.fcw fcwVarH = this.w.h(this.H, eqgVar);
            i3 = i();
            defpackage.kvt kvtVar = new defpackage.kvt(eqgVar, fcwVarH, (char[]) null);
            if (fhcVar.a == -1) {
                if (fhcVar.b.size() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ahvr.bY(z2);
                fhcVar.a = 0;
            }
            sparseArray = fhcVar.b;
            if (sparseArray.size() > 0) {
                iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                if (i3 >= iKeyAt) {
                    z = true;
                } else {
                    z = false;
                }
                ahvr.bM(z);
                if (iKeyAt == i3) {
                    aa$.ExternalSyntheticApiModelOutline1.m(fhcVar.c, sparseArray.valueAt(sparseArray.size() - 1));
                }
            }
            sparseArray.append(i3, kvtVar);
        } else {
            if (!((defpackage.eqg) ((defpackage.kvt) fhcVar.b()).b).equals(this.E)) {
                defpackage.eqg eqgVar2 = this.E;
                ahvr.ci(eqgVar2);
                defpackage.fcw fcwVarH2 = this.w.h(this.H, eqgVar2);
                i3 = i();
                defpackage.kvt kvtVar2 = new defpackage.kvt(eqgVar2, fcwVarH2, (char[]) null);
                if (fhcVar.a == -1) {
                    if (fhcVar.b.size() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ahvr.bY(z2);
                    fhcVar.a = 0;
                }
                sparseArray = fhcVar.b;
                if (sparseArray.size() > 0) {
                    iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    if (i3 >= iKeyAt) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ahvr.bM(z);
                    if (iKeyAt == i3) {
                        aa$.ExternalSyntheticApiModelOutline1.m(fhcVar.c, sparseArray.valueAt(sparseArray.size() - 1));
                    }
                }
                sparseArray.append(i3, kvtVar2);
            }
        }
        int i5 = this.j + 1;
        this.j = i5;
        int i6 = this.f;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            long[] jArr3 = new long[i7];
            int[] iArr = new int[i7];
            int[] iArr2 = new int[i7];
            defpackage.fmj[] fmjVarArr = new defpackage.fmj[i7];
            int i8 = this.B;
            int i9 = i6 - i8;
            java.lang.System.arraycopy(this.g, i8, jArr2, 0, i9);
            java.lang.System.arraycopy(this.i, this.B, jArr3, 0, i9);
            java.lang.System.arraycopy(this.z, this.B, iArr, 0, i9);
            java.lang.System.arraycopy(this.h, this.B, iArr2, 0, i9);
            java.lang.System.arraycopy(this.A, this.B, fmjVarArr, 0, i9);
            java.lang.System.arraycopy(this.y, this.B, jArr, 0, i9);
            int i10 = this.B;
            java.lang.System.arraycopy(this.g, 0, jArr2, i9, i10);
            java.lang.System.arraycopy(this.i, 0, jArr3, i9, i10);
            java.lang.System.arraycopy(this.z, 0, iArr, i9, i10);
            java.lang.System.arraycopy(this.h, 0, iArr2, i9, i10);
            java.lang.System.arraycopy(this.A, 0, fmjVarArr, i9, i10);
            java.lang.System.arraycopy(this.y, 0, jArr, i9, i10);
            this.g = jArr2;
            this.i = jArr3;
            this.z = iArr;
            this.h = iArr2;
            this.A = fmjVarArr;
            this.y = jArr;
            this.B = 0;
            this.f = i7;
        }
    }

    private final void G(int i, int i2) {
        if (i2 == 0) {
            defpackage.fgr fgrVar = this.a;
            fgrVar.e(fgrVar.f - ((long) i));
        }
    }

    private final synchronized void H() {
        this.l = 0;
        defpackage.fgr fgrVar = this.a;
        fgrVar.d = fgrVar.c;
    }

    private final void I(int i, long j, int i2) {
        int i3;
        long j2 = this.C;
        if (j2 == Long.MIN_VALUE || this.p != -1) {
            return;
        }
        if (j >= j2) {
            int i4 = this.q;
            if (i4 == -1) {
                this.q = i;
                i4 = i;
            }
            int i5 = i - i4;
            int i6 = i2 & 1;
            int i7 = i2 & 536870912;
            defpackage.eqg eqgVar = this.E;
            int i8 = 16;
            if (eqgVar != null && (i3 = eqgVar.r) != -1) {
                i8 = i3;
            }
            if (i5 + 1 < i8 + 1 && i6 == 0 && i7 == 0) {
                return;
            } else {
                this.p = i4;
            }
        }
        this.q = -1;
    }

    private final boolean J() {
        return this.l != this.j;
    }

    private final boolean K() {
        int i;
        return this.p == -1 && (i = this.q) != -1 && e() >= i;
    }

    private final boolean L(int i) {
        defpackage.fcs fcsVar = this.e;
        if (fcsVar == null || fcsVar.a() == 4) {
            return true;
        }
        return (this.z[i] & 1073741824) == 0 && this.e.k();
    }

    private final synchronized boolean M(defpackage.eqg eqgVar) {
        this.D = false;
        if (j$.util.Objects.equals(eqgVar, this.E)) {
            return false;
        }
        defpackage.fhc fhcVar = this.c;
        if (fhcVar.c() || !((defpackage.eqg) ((defpackage.kvt) fhcVar.b()).b).equals(eqgVar)) {
            this.E = eqgVar;
        } else {
            eqgVar = (defpackage.eqg) ((defpackage.kvt) fhcVar.b()).b;
            this.E = eqgVar;
        }
        this.F &= u(eqgVar.p, eqgVar.k);
        this.G = false;
        return true;
    }

    private final void N(defpackage.eqg eqgVar, defpackage.hiz hizVar) {
        defpackage.eqg eqgVar2 = this.x;
        androidx.media3.common.DrmInitData drmInitData = eqgVar2 == null ? null : eqgVar2.t;
        this.x = eqgVar;
        androidx.media3.common.DrmInitData drmInitData2 = eqgVar.t;
        defpackage.fcx fcxVar = this.w;
        hizVar.a = eqgVar.b(fcxVar.a(eqgVar));
        hizVar.b = this.e;
        if (eqgVar2 == null || !j$.util.Objects.equals(drmInitData, drmInitData2)) {
            defpackage.fcs fcsVar = this.e;
            alic alicVar = this.H;
            defpackage.fcs fcsVarF = fcxVar.f(alicVar, eqgVar);
            this.e = fcsVarF;
            hizVar.b = fcsVarF;
            if (fcsVar != null) {
                fcsVar.o(alicVar);
            }
        }
    }

    public static boolean u(java.lang.String str, java.lang.String str2) {
        return defpackage.eqz.b(str) == 1 && defpackage.eqz.e(str, str2);
    }

    public final synchronized void A(int i) {
        int i2;
        int i3;
        H();
        int i4 = this.k;
        if (i >= i4 && i <= this.j + i4 && (((i2 = this.p) == -1 || i < i2) && ((i3 = this.q) == -1 || i < i3))) {
            this.m = Long.MIN_VALUE;
            this.l = i - i4;
        }
    }

    public final synchronized int B(defpackage.hiz hizVar, defpackage.ewu ewuVar, boolean z, boolean z2, defpackage.fgs fgsVar) {
        boolean z3 = false;
        ewuVar.e = false;
        int iE = e();
        int i = this.p;
        if (i != -1 && iE >= i) {
            z3 = true;
        }
        if (!J() || K() || z3) {
            if (z2 || this.r || z3) {
                ewuVar.a = 4;
                ewuVar.f = Long.MIN_VALUE;
                return -4;
            }
            defpackage.eqg eqgVar = this.E;
            if (eqgVar == null || (!z && eqgVar == this.x)) {
                return -3;
            }
            N(eqgVar, hizVar);
            return -5;
        }
        java.lang.Object obj = ((defpackage.kvt) this.c.a(iE)).b;
        if (z || obj != this.x) {
            N((defpackage.eqg) obj, hizVar);
            return -5;
        }
        int iG = g(this.l);
        if (!L(iG)) {
            ewuVar.e = true;
            return -3;
        }
        ewuVar.a = this.z[iG];
        if (this.l == this.j - 1 && (z2 || this.r)) {
            ewuVar.dK(536870912);
        }
        ewuVar.f = this.i[iG];
        fgsVar.a = this.h[iG];
        fgsVar.b = this.g[iG];
        fgsVar.c = this.A[iG];
        return -4;
    }

    @Override // defpackage.fmk
    public final /* synthetic */ int a(defpackage.epz epzVar, int i, boolean z) {
        return f(epzVar, i, z);
    }

    @Override // defpackage.fmk
    public final /* synthetic */ void b(defpackage.etx etxVar, int i) {
        c(etxVar, i, 0);
    }

    @Override // defpackage.fmk
    public final void c(defpackage.etx etxVar, int i, int i2) {
        while (i > 0) {
            defpackage.fgr fgrVar = this.a;
            int iA = fgrVar.a(i);
            defpackage.fgq fgqVar = fgrVar.e;
            etxVar.L((byte[]) fgqVar.d.b, fgqVar.a(fgrVar.f), iA);
            i -= iA;
            fgrVar.f(iA);
        }
    }

    @Override // defpackage.fmk
    public final void d(long j, int i, int i2, int i3, defpackage.fmj fmjVar) {
        if (this.t) {
            if (java.lang.Math.abs(j - this.u) <= 1000) {
                int i4 = this.v;
                if (i4 > 1) {
                    this.v = i4 - 1;
                } else {
                    this.t = false;
                }
                G(i2, i3);
                return;
            }
            if ((i & 1) == 0 || j <= this.o + 1000) {
                G(i2, i3);
                return;
            }
            this.t = false;
        }
        int i5 = i & 1;
        if (this.s) {
            if (i5 == 0) {
                G(i2, i3);
                return;
            }
            this.s = false;
        }
        if (this.F) {
            if (j < this.m) {
                G(i2, i3);
                return;
            } else if (i5 == 0) {
                if (!this.G) {
                    defpackage.etr.f("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.E))));
                    this.G = true;
                }
                i |= 1;
            }
        }
        F(j, i, (this.a.f - ((long) i2)) - ((long) i3), i2, fmjVar);
    }

    public final int e() {
        return this.k + this.l;
    }

    @Override // defpackage.fmk
    public final int f(defpackage.epz epzVar, int i, boolean z) throws java.io.EOFException {
        defpackage.fgr fgrVar = this.a;
        int iA = fgrVar.a(i);
        defpackage.fgq fgqVar = fgrVar.e;
        int iA2 = epzVar.a((byte[]) fgqVar.d.b, fgqVar.a(fgrVar.f), iA);
        if (iA2 != -1) {
            fgrVar.f(iA2);
            return iA2;
        }
        if (z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    public final int g(int i) {
        int i2 = this.B + i;
        int i3 = this.f;
        return i2 >= i3 ? i2 - i3 : i2;
    }

    public final synchronized int h(long j, boolean z) throws java.lang.Throwable {
        java.lang.Throwable th;
        try {
            try {
                int i = this.l;
                int iG = g(i);
                if (!J() || j < this.i[iG]) {
                    return 0;
                }
                if (j <= this.o || !z) {
                    int iC = C(iG, this.j - i, j, true);
                    if (iC != -1) {
                        return iC;
                    }
                    return 0;
                }
                try {
                    return this.j - i;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    public final int i() {
        return this.k + this.j;
    }

    public final synchronized long j() {
        if (this.j == 0) {
            return Long.MIN_VALUE;
        }
        return this.i[this.B];
    }

    public final synchronized long k() {
        return this.o;
    }

    public final synchronized long l() {
        return java.lang.Math.max(this.n, m(this.l));
    }

    public final long m(int i) {
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iG = g(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                jMax = java.lang.Math.max(jMax, this.i[iG]);
                if ((this.z[iG] & 1) != 0) {
                    break;
                }
                iG--;
                if (iG == -1) {
                    iG = this.f - 1;
                }
            }
        }
        return jMax;
    }

    public final synchronized defpackage.eqg n() {
        if (this.D) {
            return null;
        }
        return this.E;
    }

    public final void o() {
        this.a.d(D());
    }

    @Override // defpackage.fmk
    public final void p(defpackage.eqg eqgVar) {
        boolean zM = M(eqgVar);
        defpackage.fgt fgtVar = this.d;
        if (fgtVar == null || !zM) {
            return;
        }
        defpackage.fgm fgmVar = (defpackage.fgm) fgtVar;
        fgmVar.f.post(fgmVar.d);
    }

    public final void q() {
        defpackage.fcs fcsVar = this.e;
        if (fcsVar != null) {
            fcsVar.o(this.H);
            this.e = null;
            this.x = null;
        }
    }

    public final void r(boolean z) {
        defpackage.fhc fhcVar;
        android.util.SparseArray sparseArray;
        defpackage.fgr fgrVar = this.a;
        fgrVar.c(fgrVar.c);
        fgrVar.c.d(0L);
        defpackage.fgq fgqVar = fgrVar.c;
        fgrVar.d = fgqVar;
        fgrVar.e = fgqVar;
        fgrVar.f = 0L;
        fgrVar.a.a();
        int i = 0;
        this.j = 0;
        this.k = 0;
        this.B = 0;
        this.l = 0;
        this.p = -1;
        this.q = -1;
        this.s = true;
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
        this.o = Long.MIN_VALUE;
        this.r = false;
        this.t = false;
        while (true) {
            fhcVar = this.c;
            sparseArray = fhcVar.b;
            if (i >= sparseArray.size()) {
                break;
            }
            aa$.ExternalSyntheticApiModelOutline1.m(fhcVar.c, sparseArray.valueAt(i));
            i++;
        }
        fhcVar.a = -1;
        sparseArray.clear();
        if (z) {
            this.E = null;
            this.D = true;
            this.F = true;
        }
    }

    public final synchronized void s(long j) {
        if (this.C != Long.MIN_VALUE) {
            this.C = Long.MIN_VALUE;
            this.p = -1;
            this.q = -1;
        }
    }

    public final synchronized void t(int i) {
        boolean z = false;
        if (i >= 0) {
            if (this.l + i <= this.j) {
                z = true;
            }
        }
        ahvr.bM(z);
        this.l += i;
    }

    public final synchronized boolean v() {
        return this.r;
    }

    public final synchronized boolean w(boolean z) {
        int iE = e();
        int i = this.p;
        boolean zL = true;
        if (i == -1 || iE < i) {
            if (J() && !K()) {
                zL = ((defpackage.kvt) this.c.a(iE)).b == this.x ? L(g(this.l)) : true;
            } else if (!z && !this.r) {
                defpackage.eqg eqgVar = this.E;
                if (eqgVar == null) {
                    zL = false;
                } else if (eqgVar == this.x) {
                    return false;
                }
            }
            return zL;
        }
        return zL;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    public final synchronized boolean x(long j, boolean z) throws java.lang.Throwable {
        java.lang.Throwable th;
        defpackage.fgu fguVar;
        long j2;
        int iC;
        try {
            try {
                H();
                int iG = g(this.l);
                long j3 = this.C;
                long jMin = this.o;
                if (j3 != Long.MIN_VALUE) {
                    try {
                        jMin = java.lang.Math.min(jMin, j3);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (!J() || j < this.i[iG]) {
                    fguVar = this;
                } else {
                    if (j > jMin) {
                        if (z) {
                            z = true;
                        } else {
                            fguVar = this;
                        }
                    }
                    boolean z2 = this.F;
                    int i = this.j;
                    if (z2) {
                        int i2 = i - this.l;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= i2) {
                                if (!z) {
                                    fguVar = this;
                                    j2 = j;
                                    iC = -1;
                                    break;
                                }
                                fguVar = this;
                                iC = i2;
                                j2 = j;
                                break;
                            }
                            if (this.i[iG] >= j) {
                                fguVar = this;
                                j2 = j;
                                iC = i3;
                                break;
                            }
                            iG++;
                            if (iG == this.f) {
                                iG = 0;
                            }
                            i3++;
                        }
                    } else {
                        int i4 = i - this.l;
                        fguVar = this;
                        j2 = j;
                        iC = fguVar.C(iG, i4, j2, true);
                    }
                    if (iC != -1) {
                        fguVar.m = j2;
                        fguVar.l += iC;
                        return true;
                    }
                }
                return false;
            } catch (java.lang.Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    public final synchronized long y(long j, boolean z) throws java.lang.Throwable {
        java.lang.Throwable th;
        defpackage.fgu fguVar;
        try {
            try {
                int i = this.j;
                if (i != 0) {
                    long[] jArr = this.i;
                    int i2 = this.B;
                    if (j >= jArr[i2]) {
                        if (z) {
                            try {
                                int i3 = this.l;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        fguVar = this;
                        int iC = fguVar.C(i2, i, j, false);
                        if (iC != -1) {
                            long jE = fguVar.E(iC);
                            return jE;
                        }
                    } else {
                        fguVar = this;
                    }
                } else {
                    fguVar = this;
                }
                return -1L;
            } catch (java.lang.Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
        throw th;
    }

    @Override // defpackage.fmk
    public final /* synthetic */ void z() {
    }
}
