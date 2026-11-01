package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bew implements defpackage.bcv {
    public int[] a;
    public int[] b;
    private final defpackage.bdn c;
    private float d;
    private int e;
    private boolean f;
    private int g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int[] k;
    private int[] l;
    private int[] m;
    private boolean n;
    private int o;
    private final defpackage.aco p;
    private final defpackage.acq q;
    private final defpackage.acj r;
    private final defpackage.aco s;

    public bew(defpackage.bdn bdnVar) {
        this.c = bdnVar;
        defpackage.aco acoVar = defpackage.acp.a;
        this.p = new defpackage.aco(6);
        int[] iArr = defpackage.acr.a;
        this.q = new defpackage.acq(6);
        int i = defpackage.ack.a;
        this.r = new defpackage.acj(6);
        this.s = new defpackage.aco(6);
        this.e = -1;
        java.lang.Integer num = 1;
        int iMax = java.lang.Math.max(1, num.intValue());
        this.g = iMax;
        int[] iArr2 = new int[iMax];
        for (int i2 = 0; i2 < iMax; i2++) {
            iArr2[i2] = Integer.MAX_VALUE;
        }
        this.a = iArr2;
        int i3 = this.g;
        int[] iArr3 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr3[i4] = Integer.MIN_VALUE;
        }
        this.b = iArr3;
        int i5 = this.g;
        this.h = new int[i5];
        this.i = new int[i5];
        this.j = new int[i5];
        this.k = new int[i5];
        this.l = new int[i5];
        this.m = new int[i5];
    }

    private final int f() {
        return this.a.length;
    }

    private final int g(defpackage.bcw bcwVar, int i, boolean z, int i2) {
        java.util.List list;
        java.util.List list2;
        defpackage.aco acoVar = this.s;
        if (acoVar.b(i2)) {
            java.lang.Object objA = acoVar.a(i2);
            if (objA == null) {
                defpackage.aooh.g();
            }
            return ((defpackage.bcx) objA).b;
        }
        defpackage.aco acoVar2 = this.p;
        int i3 = 0;
        if (!acoVar2.b(i2)) {
            acoVar2.g(i2, bcwVar.t(i2, new bvg(this, bcwVar, i, i2, 1)));
            if (z && (list = (java.util.List) acoVar2.a(i2)) != null) {
                int size = list.size();
                while (i3 < size) {
                    ((ben) list.get(i3)).b();
                    i3++;
                }
            }
        } else if (z && (list2 = (java.util.List) acoVar2.a(i2)) != null) {
            int size2 = list2.size();
            while (i3 < size2) {
                ((ben) list2.get(i3)).b();
                i3++;
            }
        }
        return -1;
    }

    private final defpackage.bcx h(int i, int i2, java.lang.Object obj) {
        defpackage.bcx bcxVar = (defpackage.bcx) this.s.a(i);
        if (bcxVar == null) {
            return new defpackage.bcx(obj, i2);
        }
        bcxVar.b = i2;
        bcxVar.a = obj;
        return bcxVar;
    }

    private final void i() {
        java.lang.Integer num = 1;
        if (this.g != java.lang.Math.max(1, num.intValue())) {
            c();
            this.n = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00a0 A[EDGE_INSN: B:106:0x00a0->B:37:0x00a0 BREAK  A[LOOP:2: B:23:0x006c->B:36:0x009d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00df A[EDGE_INSN: B:113:0x00df->B:54:0x00df BREAK  A[LOOP:4: B:40:0x00ac->B:53:0x00dc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[LOOP:0: B:5:0x001d->B:18:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009d A[LOOP:2: B:23:0x006c->B:36:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc A[LOOP:4: B:40:0x00ac->B:53:0x00dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0060 A[EDGE_INSN: B:99:0x0060->B:20:0x0060 BREAK  A[LOOP:0: B:5:0x001d->B:18:0x0054], SYNTHETIC] */
    private final void j(int i, int i2) {
        long j;
        char c;
        long j2;
        int[] iArr;
        long[] jArr;
        defpackage.aco acoVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        defpackage.acq acqVar = this.q;
        acqVar.b();
        defpackage.aco acoVar2 = this.p;
        int[] iArr2 = acoVar2.b;
        long[] jArr2 = acoVar2.a;
        int length = jArr2.length - 2;
        int i8 = 8;
        if (length >= 0) {
            int i9 = 0;
            j = 255;
            while (true) {
                long j3 = jArr2[i9];
                c = 7;
                j2 = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i9 != length) {
                        break;
                        break;
                    }
                    i9++;
                } else {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((j3 & 255) < 128 && i <= (i7 = iArr2[(i9 << 3) + i11]) && i7 <= i2) {
                            acqVar.d(i7);
                        }
                        j3 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    } else if (i9 != length) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
        }
        defpackage.acj acjVar = this.r;
        int[] iArr3 = acjVar.b;
        long[] jArr3 = acjVar.a;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i12 = 0;
            while (true) {
                long j4 = jArr3[i12];
                if ((((~j4) << c) & j4 & j2) == j2) {
                    if (i12 != length2) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j4 & j) < 128 && i <= (i6 = iArr3[(i12 << 3) + i14]) && i6 <= i2) {
                            acqVar.d(i6);
                        }
                        j4 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 != length2) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        defpackage.aco acoVar3 = this.s;
        int[] iArr4 = acoVar3.b;
        long[] jArr4 = acoVar3.a;
        int length3 = jArr4.length - 2;
        if (length3 >= 0) {
            int i15 = 0;
            while (true) {
                long j5 = jArr4[i15];
                if ((((~j5) << c) & j5 & j2) == j2) {
                    if (i15 != length3) {
                        break;
                        break;
                    }
                    i15++;
                } else {
                    int i16 = 8 - ((~(i15 - length3)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j5 & j) < 128 && i <= (i5 = iArr4[(i15 << 3) + i17]) && i5 <= i2) {
                            acqVar.d(i5);
                        }
                        j5 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    } else if (i15 != length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        int[] iArr5 = acqVar.b;
        long[] jArr5 = acqVar.a;
        int length4 = jArr5.length - 2;
        if (length4 < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            long j6 = jArr5[i18];
            if ((((~j6) << c) & j6 & j2) != j2) {
                int i19 = 8 - ((~(i18 - length4)) >>> 31);
                int i20 = 0;
                while (i20 < i19) {
                    if ((j6 & j) < 128) {
                        int i21 = iArr5[(i18 << 3) + i20];
                        java.util.List list = (java.util.List) acoVar2.d(i21);
                        if (list != null) {
                            int size = list.size();
                            for (int i22 = 0; i22 < size; i22++) {
                                ((ben) list.get(i22)).a();
                            }
                        }
                        int iA = acjVar.a(i21);
                        if (iA >= 0) {
                            acjVar.e--;
                            long[] jArr6 = acjVar.a;
                            int i23 = iA >> 3;
                            int i24 = (iA & 7) << 3;
                            long j7 = jArr6[i23] >>> i24;
                            long j8 = jArr6[i23 + 1] << (64 - i24);
                            int i25 = (iA - 8) & acjVar.d;
                            int i26 = i25 >> 3;
                            long j9 = jArr6[i26];
                            int i27 = (i25 & 7) << 3;
                            long j10 = (j9 >>> i27) | ((jArr6[i26 + 1] << (64 - i27)) & ((-i27) >> 63));
                            long j11 = j10 & ((~j10) << 6) & j2;
                            long j12 = j7 | (j8 & ((-i24) >> 63));
                            long j13 = j12 & ((~j12) << 6) & j2;
                            int iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j13) + java.lang.Long.numberOfLeadingZeros(j11);
                            int i28 = acjVar.d;
                            long j14 = jArr6[i23] & (~(j << i24));
                            int i29 = (j13 != 0 ? 1 : 0) & (j11 != 0 ? 1 : 0) & ((iNumberOfTrailingZeros >>> 3) < 8 ? 1 : 0);
                            long j15 = j14 | ((1 != i29 ? 254L : 128L) << i24);
                            jArr6[i23] = j15;
                            jArr6[(((iA - 7) & i28) + (i28 & 7)) >> 3] = j15;
                            acjVar.f += i29;
                        }
                        acoVar3.d(i21);
                        i4 = 8;
                    } else {
                        iArr5 = iArr5;
                        jArr5 = jArr5;
                        length4 = length4;
                        acoVar2 = acoVar2;
                        i4 = i8;
                    }
                    j6 >>= i4;
                    i20++;
                    length4 = length4;
                    i8 = i4;
                    iArr5 = iArr5;
                    jArr5 = jArr5;
                    acoVar2 = acoVar2;
                }
                iArr = iArr5;
                jArr = jArr5;
                int i30 = length4;
                acoVar = acoVar2;
                i3 = i8;
                if (i19 != i3) {
                    return;
                } else {
                    length4 = i30;
                }
            } else {
                iArr = iArr5;
                jArr = jArr5;
                acoVar = acoVar2;
                i3 = i8;
            }
            if (i18 == length4) {
                return;
            }
            i18++;
            i8 = i3;
            iArr5 = iArr;
            jArr5 = jArr;
            acoVar2 = acoVar;
        }
    }

    private final void k(int i, int i2, int i3) {
        f();
        this.b[i] = i2;
        int[] iArr = this.i;
        iArr[i] = iArr[i] - i3;
    }

    private final void l(int i, int i2, int i3) {
        f();
        this.a[i] = i2;
        int[] iArr = this.h;
        iArr[i] = iArr[i] - i3;
    }

    @Override // defpackage.bcv
    public final void a(defpackage.bcw bcwVar, float f) {
        i();
        if (bcwVar.p()) {
            bcwVar.d();
            bcwVar.j();
            this.o = bcwVar.e();
            int iE = bcwVar.e();
            if (f <= 0.0f) {
                bcwVar.l(this.j);
                bcwVar.o(this.l);
                int iF = f();
                for (int i = 0; i < iF; i++) {
                    this.h[i] = -this.l[i];
                    this.a[i] = this.j[i];
                }
                while (true) {
                    int iAI = defpackage.den.aI(this.h);
                    if (iAI == -1) {
                        break;
                    }
                    int[] iArr = this.h;
                    if (iArr[iAI] <= 0) {
                        break;
                    }
                    int iS = bcwVar.s(this.a[iAI]);
                    if (iS == -1) {
                        iArr[iAI] = 0;
                    } else {
                        defpackage.aco acoVar = this.s;
                        if (acoVar.b(iS)) {
                            java.lang.Object objA = acoVar.a(iS);
                            if (objA == null) {
                                defpackage.aooh.g();
                            }
                            l(iAI, iS, ((defpackage.bcx) objA).b);
                        } else {
                            this.h[iAI] = 0;
                        }
                    }
                }
                j(0, defpackage.ajsz.cL(this.a) - 1);
            } else {
                int i2 = iE - 1;
                bcwVar.m(this.k);
                bcwVar.n(this.m);
                int iF2 = f();
                for (int i3 = 0; i3 < iF2; i3++) {
                    this.i[i3] = -this.m[i3];
                    this.b[i3] = this.k[i3];
                }
                while (true) {
                    int iAI2 = defpackage.den.aI(this.i);
                    if (iAI2 == -1 || this.i[iAI2] <= 0) {
                        break;
                    }
                    int i4 = this.b[iAI2];
                    int iR = bcwVar.r(i4);
                    if (iR == -1 || bcwVar.i(i4) >= i2) {
                        this.i[iAI2] = 0;
                    } else {
                        defpackage.aco acoVar2 = this.s;
                        if (acoVar2.b(iR)) {
                            java.lang.Object objA2 = acoVar2.a(iR);
                            if (objA2 == null) {
                                defpackage.aooh.g();
                            }
                            k(iAI2, iR, ((defpackage.bcx) objA2).b);
                        } else {
                            this.i[iAI2] = 0;
                        }
                    }
                }
                j(defpackage.ajsz.cK(this.b) + 1, i2);
            }
        }
        if (bcwVar.p()) {
            int iA = bcwVar.j() != null ? this.c.a(bcwVar.d()) : 0;
            float fSignum = java.lang.Math.signum(f);
            float fSignum2 = java.lang.Math.signum(this.d);
            if (f <= 0.0f) {
                bcwVar.m(this.k);
                bcwVar.n(this.m);
                int iF3 = f();
                for (int i5 = 0; i5 < iF3; i5++) {
                    int i6 = iA - this.m[i5];
                    if (fSignum != fSignum2 || this.n) {
                        this.b[i5] = this.k[i5];
                        this.i[i5] = i6;
                    } else {
                        int[] iArr2 = this.i;
                        int i7 = iArr2[i5] + defpackage.aopc.i(java.lang.Math.abs(f));
                        if (i7 <= i6) {
                            i6 = i7;
                        }
                        iArr2[i5] = i6;
                    }
                }
                while (true) {
                    int iAI3 = defpackage.den.aI(this.i);
                    if (iAI3 == -1 || this.i[iAI3] <= 0) {
                        break;
                    }
                    int i8 = bcwVar.i(this.b[iAI3]);
                    if (i8 != -1 && i8 < this.o - 1) {
                        int iR2 = bcwVar.r(this.b[iAI3]);
                        int iG = g(bcwVar, iAI3, iR2 == bcwVar.r(this.k[iAI3]) && f != 0.0f && java.lang.Math.abs(f) >= ((float) this.m[iAI3]), iR2);
                        if (iG == -1) {
                            break;
                        } else {
                            k(iAI3, iR2, iG);
                        }
                    } else {
                        this.i[iAI3] = 0;
                    }
                }
            } else {
                bcwVar.l(this.j);
                bcwVar.o(this.l);
                int iF4 = f();
                for (int i9 = 0; i9 < iF4; i9++) {
                    int i10 = iA - this.l[i9];
                    if (fSignum != fSignum2 || this.n) {
                        this.h[i9] = i10;
                        this.a[i9] = this.j[i9];
                    } else {
                        int[] iArr3 = this.h;
                        int i11 = iArr3[i9] + defpackage.aopc.i(java.lang.Math.abs(f));
                        if (i11 <= i10) {
                            i10 = i11;
                        }
                        iArr3[i9] = i10;
                    }
                }
                while (true) {
                    int iAI4 = defpackage.den.aI(this.h);
                    if (iAI4 == -1) {
                        break;
                    }
                    int[] iArr4 = this.h;
                    if (iArr4[iAI4] <= 0) {
                        break;
                    }
                    int i12 = this.a[iAI4];
                    if (i12 > 0) {
                        int iS2 = bcwVar.s(i12);
                        int iG2 = g(bcwVar, iAI4, iS2 == bcwVar.s(this.j[iAI4]) && f != 0.0f && java.lang.Math.abs(f) >= ((float) this.l[iAI4]), iS2);
                        if (iG2 == -1) {
                            break;
                        } else {
                            l(iAI4, iS2, iG2);
                        }
                    } else {
                        iArr4[iAI4] = 0;
                    }
                }
            }
        }
        this.d = f;
    }

    @Override // defpackage.bcv
    public final void b(defpackage.bcw bcwVar) {
        int[] iArr;
        int[] iArr2;
        i();
        if (!this.f) {
            this.f = true;
        }
        int i = this.e;
        if (i != -1 && i != bcwVar.e()) {
            this.n = true;
            if (bcwVar.p()) {
                int iB = bcwVar.b();
                int iF = f();
                for (int i2 = 0; i2 < iF; i2++) {
                    int[] iArr3 = this.a;
                    int i3 = iArr3[i2];
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    iArr3[i2] = i3;
                    if (iB != -1) {
                        int[] iArr4 = this.b;
                        int i4 = iArr4[i2];
                        if (i4 > iB) {
                            i4 = iB;
                        }
                        iArr4[i2] = i4;
                    }
                }
                if (this.d <= 0.0f) {
                    j(bcwVar.c() + 1, this.o - 1);
                } else {
                    j(0, bcwVar.a() - 1);
                }
            }
        }
        this.o = bcwVar.e();
        if (bcwVar.p()) {
            int iH = bcwVar.h();
            for (int i5 = 0; i5 < iH; i5++) {
                int iF2 = bcwVar.f(i5);
                java.lang.Object objK = bcwVar.k(i5);
                int iG = bcwVar.g(i5);
                if (iF2 != -1) {
                    defpackage.aco acoVar = this.s;
                    if (acoVar.b(iF2)) {
                        java.lang.Object objA = acoVar.a(iF2);
                        if (objA == null) {
                            defpackage.aooh.g();
                        }
                        int i6 = ((defpackage.bcx) objA).b;
                        java.lang.Object objA2 = acoVar.a(iF2);
                        if (objA2 == null) {
                            defpackage.aooh.g();
                        }
                        java.lang.Object obj = ((defpackage.bcx) objA2).a;
                        if (i6 != iG || (obj != defpackage.bcx.c && !defpackage.aooh.n(obj, objK))) {
                            this.n = true;
                        }
                    }
                    acoVar.g(iF2, h(iF2, iG, objK));
                    int[] iArr5 = this.a;
                    iArr5[0] = java.lang.Math.min(iArr5[0], iF2);
                    int[] iArr6 = this.b;
                    iArr6[0] = java.lang.Math.max(iArr6[0], iF2);
                    java.util.List list = (java.util.List) this.p.d(iF2);
                    if (list != null) {
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ((ben) list.get(i7)).a();
                        }
                    }
                }
            }
            if (this.n) {
                defpackage.bdn bdnVar = this.c;
                float f = this.d;
                if (bcwVar.p()) {
                    int iA = bcwVar.j() != null ? bdnVar.a(bcwVar.d()) : 0;
                    if (f <= 0.0f) {
                        bcwVar.m(this.k);
                        bcwVar.n(this.m);
                        int iF3 = f();
                        int i8 = 0;
                        while (true) {
                            iArr2 = this.b;
                            if (i8 >= iF3) {
                                break;
                            }
                            iArr2[i8] = this.k[i8];
                            this.i[i8] = iA - this.m[i8];
                            i8++;
                        }
                        j(defpackage.ajsz.cK(iArr2) + 1, this.o - 1);
                    } else {
                        bcwVar.l(this.j);
                        bcwVar.o(this.l);
                        int iF4 = f();
                        int i9 = 0;
                        while (true) {
                            iArr = this.a;
                            if (i9 >= iF4) {
                                break;
                            }
                            iArr[i9] = this.j[i9];
                            this.h[i9] = iA - this.l[i9];
                            i9++;
                        }
                        j(0, defpackage.ajsz.cL(iArr) - 1);
                    }
                }
                this.n = false;
            }
        } else {
            c();
        }
        this.e = bcwVar.e();
    }

    @Override // defpackage.bcv
    public final void c() {
        int i;
        java.lang.Integer num = 1;
        int iMax = java.lang.Math.max(1, num.intValue());
        this.g = iMax;
        int[] iArr = this.a;
        int length = iArr.length;
        if (length != iMax) {
            int[] iArr2 = new int[iMax];
            for (int i2 = 0; i2 < iMax; i2++) {
                iArr2[i2] = Integer.MAX_VALUE;
            }
            this.a = iArr2;
            int[] iArr3 = new int[iMax];
            for (int i3 = 0; i3 < iMax; i3++) {
                iArr3[i3] = Integer.MIN_VALUE;
            }
            this.b = iArr3;
            this.h = new int[iMax];
            this.i = new int[iMax];
            this.j = new int[iMax];
            this.k = new int[iMax];
            this.l = new int[iMax];
            this.m = new int[iMax];
        } else {
            if (iArr == null) {
                defpackage.aooh.i("<this>");
            }
            java.util.Arrays.fill(iArr, 0, length, Integer.MAX_VALUE);
            int[] iArr4 = this.b;
            int length2 = iArr4.length;
            if (iArr4 == null) {
                defpackage.aooh.i("<this>");
            }
            java.util.Arrays.fill(iArr4, 0, length2, Integer.MIN_VALUE);
            int[] iArr5 = this.h;
            int length3 = iArr5.length;
            if (iArr5 == null) {
                defpackage.aooh.i("<this>");
            }
            java.util.Arrays.fill(iArr5, 0, length3, 0);
            int[] iArr6 = this.i;
            int length4 = iArr6.length;
            if (iArr6 == null) {
                defpackage.aooh.i("<this>");
            }
            java.util.Arrays.fill(iArr6, 0, length4, 0);
        }
        this.n = false;
        this.r.b();
        this.s.f();
        defpackage.aco acoVar = this.p;
        long[] jArr = acoVar.a;
        int length5 = jArr.length - 2;
        if (length5 < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = i4 - length5;
                int i6 = 0;
                while (true) {
                    i = 8 - ((~i5) >>> 31);
                    if (i6 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i7 = (i4 << 3) + i6;
                        int i8 = acoVar.b[i7];
                        java.util.List list = (java.util.List) acoVar.c[i7];
                        int size = list.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            ((ben) list.get(i9)).a();
                        }
                        acoVar.e(i7);
                    }
                    j >>= 8;
                    i6++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i4 == length5) {
                return;
            } else {
                i4++;
            }
        }
    }

    @Override // defpackage.bcv
    public final boolean d() {
        i();
        int iF = f();
        for (int i = 0; i < iF; i++) {
            if (this.a[i] == Integer.MAX_VALUE || this.b[i] == Integer.MIN_VALUE) {
                return false;
            }
        }
        return true;
    }

    public final void e(defpackage.bcw bcwVar, int i, int i2, int i3) {
        int iS;
        int i4;
        defpackage.bcx bcxVarH = h(i2, i3, defpackage.bcx.c);
        defpackage.aco acoVar = this.s;
        acoVar.g(i2, bcxVarH);
        if (i2 > this.b[i]) {
            k(i, i2, i3);
        } else if (i2 < this.a[i]) {
            l(i, i2, i3);
        }
        defpackage.aoor aoorVar = new defpackage.aoor();
        aoorVar.a = -1;
        if (java.lang.Math.signum(this.d) <= 0.0f) {
            while (true) {
                int iAI = defpackage.den.aI(this.i);
                aoorVar.a = iAI;
                if (iAI == -1 || this.i[iAI] <= 0) {
                    i4 = -1;
                } else {
                    iS = bcwVar.r(this.b[iAI]);
                    int i5 = bcwVar.i(iS);
                    if (i5 == -1 || i5 >= this.o) {
                        this.i[aoorVar.a] = 0;
                    } else {
                        i4 = iS;
                    }
                }
            }
        } else {
            while (true) {
                int iAI2 = defpackage.den.aI(this.h);
                aoorVar.a = iAI2;
                if (iAI2 != -1) {
                    int[] iArr = this.h;
                    if (iArr[iAI2] > 0) {
                        int i6 = this.a[iAI2];
                        if (i6 <= 0) {
                            iArr[iAI2] = 0;
                        } else {
                            iS = bcwVar.s(i6);
                            if (bcwVar.i(iS) == -1) {
                                this.h[aoorVar.a] = 0;
                            } else {
                                i4 = iS;
                            }
                        }
                    }
                }
                i4 = -1;
            }
        }
        if (i4 >= 0) {
            defpackage.aco acoVar2 = this.p;
            if (acoVar2.b(i4) || acoVar.b(i4)) {
                return;
            }
            acoVar2.g(i4, bcwVar.t(i4, new ahcr(this, bcwVar, aoorVar, i4, 1)));
        }
    }
}
