package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aoyw extends defpackage.aozs implements defpackage.aoyq, defpackage.aoxb, defpackage.apaj {
    public java.lang.Object[] a;
    public long b;
    public long c;
    private final int f;
    private final int g;
    private int h;
    private int i;
    private final int j;

    public aoyw(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.j = i3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[Catch: all -> 0x0132, TryCatch #0 {, blocks: (B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00a0, B:38:0x00a3, B:40:0x00b0, B:41:0x00b4), top: B:85:0x0085, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0097 A[Catch: all -> 0x0132, TryCatch #0 {, blocks: (B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00a0, B:38:0x00a3, B:40:0x00b0, B:41:0x00b4), top: B:85:0x0085, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[Catch: all -> 0x0132, TryCatch #0 {, blocks: (B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00a0, B:38:0x00a3, B:40:0x00b0, B:41:0x00b4), top: B:85:0x0085, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0 A[Catch: all -> 0x0132, TryCatch #0 {, blocks: (B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00a0, B:38:0x00a3, B:40:0x00b0, B:41:0x00b4), top: B:85:0x0085, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca A[Catch: all -> 0x0135, TryCatch #1 {all -> 0x0135, blocks: (B:16:0x003f, B:30:0x0082, B:31:0x0084, B:43:0x00c5, B:44:0x00c6, B:46:0x00ca, B:48:0x00ce, B:49:0x00d3, B:50:0x00d6, B:52:0x00da, B:53:0x00f0, B:58:0x0104, B:59:0x0105, B:63:0x010f, B:65:0x0114, B:69:0x011a, B:70:0x011b, B:72:0x011e, B:73:0x0121, B:77:0x0133, B:78:0x0134, B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00a0, B:38:0x00a3, B:40:0x00b0, B:41:0x00b4, B:54:0x00f1, B:56:0x00fc, B:57:0x00ff), top: B:87:0x003f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce A[Catch: all -> 0x0135, TryCatch #1 {all -> 0x0135, blocks: (B:16:0x003f, B:30:0x0082, B:31:0x0084, B:43:0x00c5, B:44:0x00c6, B:46:0x00ca, B:48:0x00ce, B:49:0x00d3, B:50:0x00d6, B:52:0x00da, B:53:0x00f0, B:58:0x0104, B:59:0x0105, B:63:0x010f, B:65:0x0114, B:69:0x011a, B:70:0x011b, B:72:0x011e, B:73:0x0121, B:77:0x0133, B:78:0x0134, B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00a0, B:38:0x00a3, B:40:0x00b0, B:41:0x00b4, B:54:0x00f1, B:56:0x00fc, B:57:0x00ff), top: B:87:0x003f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc A[Catch: all -> 0x0119, TryCatch #3 {, blocks: (B:54:0x00f1, B:56:0x00fc, B:57:0x00ff), top: B:90:0x00f1, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ff A[Catch: all -> 0x0119, TRY_LEAVE, TryCatch #3 {, blocks: (B:54:0x00f1, B:56:0x00fc, B:57:0x00ff), top: B:90:0x00f1, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0114 A[Catch: all -> 0x0135, TryCatch #1 {all -> 0x0135, blocks: (B:16:0x003f, B:30:0x0082, B:31:0x0084, B:43:0x00c5, B:44:0x00c6, B:46:0x00ca, B:48:0x00ce, B:49:0x00d3, B:50:0x00d6, B:52:0x00da, B:53:0x00f0, B:58:0x0104, B:59:0x0105, B:63:0x010f, B:65:0x0114, B:69:0x011a, B:70:0x011b, B:72:0x011e, B:73:0x0121, B:77:0x0133, B:78:0x0134, B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00a0, B:38:0x00a3, B:40:0x00b0, B:41:0x00b4, B:54:0x00f1, B:56:0x00fc, B:57:0x00ff), top: B:87:0x003f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x011e A[Catch: all -> 0x0135, TryCatch #1 {all -> 0x0135, blocks: (B:16:0x003f, B:30:0x0082, B:31:0x0084, B:43:0x00c5, B:44:0x00c6, B:46:0x00ca, B:48:0x00ce, B:49:0x00d3, B:50:0x00d6, B:52:0x00da, B:53:0x00f0, B:58:0x0104, B:59:0x0105, B:63:0x010f, B:65:0x0114, B:69:0x011a, B:70:0x011b, B:72:0x011e, B:73:0x0121, B:77:0x0133, B:78:0x0134, B:32:0x0085, B:34:0x0092, B:35:0x0097, B:37:0x00a0, B:38:0x00a3, B:40:0x00b0, B:41:0x00b4, B:54:0x00f1, B:56:0x00fc, B:57:0x00ff), top: B:87:0x003f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:85:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0131 A[EDGE_INSN: B:96:0x0131->B:75:0x0131 BREAK  A[LOOP:0: B:30:0x0082->B:98:0x0082], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (((defpackage.aozn) r0).b(r3) != r4) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r1v0, types: [aoyw, aozs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object g(defpackage.aoyw r17, defpackage.aoxi r18, defpackage.aoln r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoyw.g(aoyw, aoxi, aoln):java.lang.Object");
    }

    private final int o() {
        return this.h + this.i;
    }

    private final long p() {
        return f() + ((long) this.h);
    }

    private final long q() {
        return f() + ((long) this.h) + ((long) this.i);
    }

    private final long r(defpackage.aoyy aoyyVar) {
        long j = aoyyVar.a;
        if (j < p()) {
            return j;
        }
        if (this.g > 0 || j > f() || this.i == 0) {
            return -1L;
        }
        return j;
    }

    private final void s() {
        defpackage.aozu[] aozuVarArr;
        java.lang.Object[] objArr = this.a;
        if (objArr == null) {
            defpackage.aooh.g();
        }
        objArr[((int) f()) & (objArr.length - 1)] = null;
        this.h--;
        long jF = f() + 1;
        if (this.b < jF) {
            this.b = jF;
        }
        if (this.c < jF) {
            if (this.e != 0 && (aozuVarArr = this.d) != null) {
                for (defpackage.aozu aozuVar : aozuVarArr) {
                    if (aozuVar != null) {
                        defpackage.aoyy aoyyVar = (defpackage.aoyy) aozuVar;
                        long j = aoyyVar.a;
                        if (j >= 0 && j < jF) {
                            aoyyVar.a = jF;
                        }
                    }
                }
            }
            this.c = jF;
        }
        boolean z = defpackage.aosu.a;
    }

    private final void t(java.lang.Object obj) {
        int iO = o();
        java.lang.Object[] objArrW = this.a;
        if (objArrW == null) {
            objArrW = w(null, 0, 2);
        } else {
            int length = objArrW.length;
            if (iO >= length) {
                objArrW = w(objArrW, iO, length << 1);
            }
        }
        objArrW[((int) (f() + ((long) iO))) & (objArrW.length - 1)] = obj;
    }

    private final void u(long j, long j2, long j3, long j4) {
        long jMin = java.lang.Math.min(j2, j);
        boolean z = defpackage.aosu.a;
        for (long jF = f(); jF < jMin; jF++) {
            java.lang.Object[] objArr = this.a;
            if (objArr == null) {
                defpackage.aooh.g();
            }
            objArr[((int) jF) & (objArr.length - 1)] = null;
        }
        this.b = j;
        this.c = j2;
        this.h = (int) (j3 - jMin);
        this.i = (int) (j4 - j3);
    }

    private final boolean v(java.lang.Object obj) {
        if (this.e == 0) {
            boolean z = defpackage.aosu.a;
            int i = this.f;
            if (i == 0) {
                return true;
            }
            t(obj);
            int i2 = this.h + 1;
            this.h = i2;
            if (i2 > i) {
                s();
            }
            this.c = f() + ((long) this.h);
            return true;
        }
        int i3 = this.h;
        int i4 = this.g;
        if (i3 >= i4 && this.c <= this.b) {
            int i5 = this.j;
            if (i5 == 0) {
                throw null;
            }
            int i6 = i5 - 1;
            if (i6 == 0) {
                return false;
            }
            if (i6 != 1) {
                throw new defpackage.aois();
            }
        }
        t(obj);
        int i7 = this.h + 1;
        this.h = i7;
        if (i7 > i4) {
            s();
        }
        if (e() <= this.f) {
            return true;
        }
        u(this.b + 1, this.c, p(), q());
        return true;
    }

    private final java.lang.Object[] w(java.lang.Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new java.lang.IllegalStateException("Buffer size overflow");
        }
        java.lang.Object[] objArr2 = new java.lang.Object[i2];
        this.a = objArr2;
        if (objArr != null) {
            long jF = f();
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (int) (((long) i3) + jF);
                objArr2[i4 & (i2 - 1)] = objArr[(objArr.length - 1) & i4];
            }
        }
        return objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [aoln[]] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    private final defpackage.aoln[] x(defpackage.aoln[] aolnVarArr) {
        defpackage.aozu[] aozuVarArr;
        defpackage.aoyy aoyyVar;
        defpackage.aoln aolnVar;
        if (this.e != 0 && (aozuVarArr = this.d) != null) {
            int length = aolnVarArr.length;
            int i = 0;
            aolnVarArr = aolnVarArr;
            while (i < aozuVarArr.length) {
                defpackage.aozu aozuVar = aozuVarArr[i];
                if (aozuVar != null && (aolnVar = (aoyyVar = (defpackage.aoyy) aozuVar).b) != null && r(aoyyVar) >= 0) {
                    int length2 = aolnVarArr.length;
                    if (length >= length2) {
                        aolnVarArr = aolnVarArr;
                        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf((java.lang.Object[]) aolnVarArr, java.lang.Math.max(2, length2 << 1));
                        defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
                        aolnVarArr = objArrCopyOf;
                    }
                    aolnVarArr = aolnVarArr;
                    ((defpackage.aoln[]) aolnVarArr)[length] = aolnVar;
                    aoyyVar.b = null;
                    length++;
                }
                i++;
                aolnVarArr = aolnVarArr;
            }
        }
        return (defpackage.aoln[]) aolnVarArr;
    }

    @Override // defpackage.aoyq, defpackage.aoxi
    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.aoyw aoywVar;
        java.lang.Throwable th;
        defpackage.aoln[] aolnVarArrX;
        defpackage.aoyu aoyuVar;
        if (d(obj)) {
            return defpackage.aojh.a;
        }
        defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(aolnVar), 1);
        aoscVar.z();
        defpackage.aoln[] aolnVarArrX2 = defpackage.aozt.a;
        synchronized (this) {
            try {
                if (v(obj)) {
                    try {
                        aoscVar.w(defpackage.aojh.a);
                        aolnVarArrX = x(aolnVarArrX2);
                        aoyuVar = null;
                        aoywVar = this;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        aoywVar = this;
                        throw th;
                    }
                } else {
                    aoywVar = this;
                    try {
                        aoyuVar = new defpackage.aoyu(aoywVar, f() + ((long) o()), obj, aoscVar);
                        aoywVar.t(aoyuVar);
                        aoywVar.i++;
                        if (aoywVar.g == 0) {
                            aolnVarArrX2 = aoywVar.x(aolnVarArrX2);
                        }
                        aolnVarArrX = aolnVarArrX2;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aoyuVar != null) {
                    aoscVar.A(new defpackage.aorz(aoyuVar, 2));
                }
                for (defpackage.aoln aolnVar2 : aolnVarArrX) {
                    if (aolnVar2 != null) {
                        aolnVar2.w(defpackage.aojh.a);
                    }
                }
                java.lang.Object objK = aoscVar.k();
                defpackage.aolu aoluVar = defpackage.aolu.a;
                if (objK == aoluVar && aolnVar == null) {
                    defpackage.aooh.i("frame");
                }
                if (objK != aoluVar) {
                    objK = defpackage.aojh.a;
                }
                return objK != aoluVar ? defpackage.aojh.a : objK;
            } catch (java.lang.Throwable th4) {
                th = th4;
                aoywVar = this;
            }
        }
    }

    @Override // defpackage.aoyq
    public final boolean d(java.lang.Object obj) {
        int i;
        boolean z;
        defpackage.aoln[] aolnVarArrX = defpackage.aozt.a;
        synchronized (this) {
            if (v(obj)) {
                aolnVarArrX = x(aolnVarArrX);
                z = true;
            } else {
                z = false;
            }
        }
        for (defpackage.aoln aolnVar : aolnVarArrX) {
            if (aolnVar != null) {
                aolnVar.w(defpackage.aojh.a);
            }
        }
        return z;
    }

    public final int e() {
        return (int) ((f() + ((long) this.h)) - this.b);
    }

    public final long f() {
        return java.lang.Math.min(this.c, this.b);
    }

    @Override // defpackage.apaj
    public final defpackage.aoxh fL(defpackage.aolr aolrVar, int i, int i2) {
        return defpackage.aoyx.a(this, aolrVar, i, i2);
    }

    @Override // defpackage.aoyt, defpackage.aoxh
    public final java.lang.Object fM(defpackage.aoxi aoxiVar, defpackage.aoln aolnVar) {
        return g(this, aoxiVar, aolnVar);
    }

    @Override // defpackage.aoyq
    public final void fN() throws java.lang.Throwable {
        defpackage.aoyw aoywVar;
        synchronized (this) {
            try {
                aoywVar = this;
                try {
                    aoywVar.u(p(), this.c, p(), q());
                } catch (java.lang.Throwable th) {
                    th = th;
                    java.lang.Throwable th2 = th;
                    throw th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                aoywVar = this;
            }
        }
    }

    protected final java.lang.Object h() {
        java.lang.Object[] objArr = this.a;
        if (objArr == null) {
            defpackage.aooh.g();
        }
        return objArr[((int) ((this.b + ((long) e())) - 1)) & (objArr.length - 1)];
    }

    @Override // defpackage.aozs
    public final /* synthetic */ defpackage.aozu i() {
        return new defpackage.aoyy();
    }

    public final void j() {
        if (this.g != 0 || this.i > 1) {
            java.lang.Object[] objArr = this.a;
            if (objArr == null) {
                defpackage.aooh.g();
            }
            while (this.i > 0) {
                long jF = f() + ((long) o());
                int length = objArr.length - 1;
                if (objArr[((int) (jF - 1)) & length] != defpackage.aoyx.a) {
                    return;
                }
                this.i--;
                objArr[((int) (f() + ((long) o()))) & length] = null;
            }
        }
    }

    public final defpackage.aoln[] k(long j) {
        long j2;
        int i;
        long j3;
        defpackage.aozu[] aozuVarArr;
        boolean z = defpackage.aosu.a;
        if (j <= this.c) {
            long jF = f();
            long j4 = ((long) this.h) + jF;
            int i2 = this.g;
            if (i2 == 0 && this.i > 0) {
                j4++;
            }
            int i3 = 0;
            if (this.e != 0 && (aozuVarArr = this.d) != null) {
                for (defpackage.aozu aozuVar : aozuVarArr) {
                    if (aozuVar != null) {
                        long j5 = ((defpackage.aoyy) aozuVar).a;
                        if (j5 >= 0 && j5 < j4) {
                            j4 = j5;
                        }
                    }
                }
            }
            if (j4 > this.c) {
                long jP = p();
                int i4 = this.e;
                int iMin = this.i;
                if (i4 > 0) {
                    iMin = java.lang.Math.min(iMin, i2 - ((int) (jP - j4)));
                }
                defpackage.aoln[] aolnVarArr = defpackage.aozt.a;
                long j6 = ((long) this.i) + jP;
                if (iMin > 0) {
                    aolnVarArr = new defpackage.aoln[iMin];
                    java.lang.Object[] objArr = this.a;
                    if (objArr == null) {
                        defpackage.aooh.g();
                    }
                    j3 = 1;
                    long j7 = jP;
                    while (true) {
                        if (jP >= j6) {
                            j2 = j4;
                            i = i2;
                            jP = j7;
                            break;
                        }
                        j2 = j4;
                        int length = objArr.length - 1;
                        int i5 = ((int) jP) & length;
                        java.lang.Object obj = objArr[i5];
                        defpackage.apcm apcmVar = defpackage.aoyx.a;
                        if (obj != apcmVar) {
                            if (obj == null) {
                                defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            }
                            int i6 = i3 + 1;
                            defpackage.aoyu aoyuVar = (defpackage.aoyu) obj;
                            i = i2;
                            aolnVarArr[i3] = aoyuVar.d;
                            objArr[i5] = apcmVar;
                            objArr[((int) j7) & length] = aoyuVar.c;
                            long j8 = j7 + 1;
                            if (i6 >= iMin) {
                                jP = j8;
                                break;
                            }
                            i3 = i6;
                            j7 = j8;
                        } else {
                            i = i2;
                        }
                        jP++;
                        j4 = j2;
                        i2 = i;
                    }
                } else {
                    j2 = j4;
                    i = i2;
                    j3 = 1;
                }
                defpackage.aoln[] aolnVarArr2 = aolnVarArr;
                long jMax = java.lang.Math.max(this.b, java.lang.Math.max(jF, jP - ((long) this.f)));
                if (i == 0 && jMax < j6) {
                    java.lang.Object[] objArr2 = this.a;
                    if (objArr2 == null) {
                        defpackage.aooh.g();
                    }
                    if (defpackage.aooh.n(objArr2[((int) jMax) & (objArr2.length - 1)], defpackage.aoyx.a)) {
                        jP += j3;
                        jMax += j3;
                    }
                }
                long j9 = jP;
                u(jMax, this.e == 0 ? j9 : j2, j9, j6);
                j();
                return aolnVarArr2.length == 0 ? aolnVarArr2 : x(aolnVarArr2);
            }
        }
        return defpackage.aozt.a;
    }

    @Override // defpackage.aozs
    public final /* bridge */ /* synthetic */ defpackage.aozu[] l() {
        return new defpackage.aoyy[2];
    }
}
