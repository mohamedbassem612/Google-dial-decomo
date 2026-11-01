package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class dbt extends defpackage.czc implements defpackage.dby, defpackage.dcb, defpackage.dcw {
    public static final defpackage.aonj i = new defpackage.ckc(10);
    private defpackage.adw f;
    public defpackage.aonn j;
    public defpackage.aonj k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final defpackage.czb o = new defpackage.cxz(this);
    public defpackage.adw p;
    public defpackage.adw q;
    public yg r;

    protected static final void W(defpackage.dck dckVar) {
        defpackage.dag dagVar;
        defpackage.dck dckVar2 = dckVar.z;
        if (!defpackage.aooh.n(dckVar2 != null ? dckVar2.w : null, dckVar.w)) {
            ((defpackage.dbx) dckVar.ag()).w.e();
            return;
        }
        defpackage.dah dahVarJ = dckVar.ag().j();
        if (dahVarJ == null || (dagVar = ((defpackage.dbx) dahVarJ).w) == null) {
            return;
        }
        dagVar.e();
    }

    private final void dz(defpackage.ady adyVar) {
        int i2;
        defpackage.dbk dbkVar;
        java.lang.Object[] objArr = adyVar.b;
        long[] jArr = adyVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j) < 128 && (dbkVar = (defpackage.dbk) ((ddk) objArr[(i3 << 3) + i5]).get()) != null) {
                        if (dw()) {
                            dbkVar.T(false);
                        } else {
                            dbkVar.V(false);
                        }
                    }
                    j >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // defpackage.dcw
    public boolean B() {
        return M().al();
    }

    public abstract long J();

    public abstract defpackage.cxi K();

    public abstract defpackage.cyf L();

    @Override // defpackage.dby
    public abstract defpackage.dbk M();

    public abstract defpackage.dbt N();

    public abstract defpackage.dbt O();

    /* JADX WARN: Code duplicated, block: B:47:0x010d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0163 A[LOOP:4: B:53:0x0121->B:66:0x0163, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x0166 A[EDGE_INSN: B:86:0x0166->B:67:0x0166 BREAK  A[LOOP:4: B:53:0x0121->B:66:0x0163], SYNTHETIC] */
    public final void P(defpackage.dbk dbkVar, defpackage.czi cziVar) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        java.lang.Object[] objArr;
        char c2;
        long j4;
        int i2;
        java.lang.Object[] objArr2;
        long j5;
        int i3;
        int i4;
        defpackage.adw adwVar = this.f;
        char c3 = 7;
        long j6 = -9187201950435737472L;
        int i5 = 8;
        if (adwVar != null) {
            java.lang.Object[] objArr3 = adwVar.c;
            long[] jArr2 = adwVar.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j7 = 128;
                while (true) {
                    long j8 = jArr2[i6];
                    j2 = 255;
                    if ((((~j8) << c3) & j8 & j6) != j6) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j8 & 255) < j7) {
                                c2 = c3;
                                defpackage.ady adyVar = (defpackage.ady) objArr3[(i6 << 3) + i8];
                                j4 = j6;
                                java.lang.Object[] objArr4 = adyVar.b;
                                long[] jArr3 = adyVar.a;
                                int length2 = jArr3.length - 2;
                                if (length2 >= 0) {
                                    objArr2 = objArr3;
                                    j5 = j7;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        long j9 = jArr3[i9];
                                        jArr2 = jArr2;
                                        j8 = j8;
                                        if ((((~j9) << c2) & j9 & j4) != j4) {
                                            int i11 = 8 - ((~(i9 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j9 & 255) < j5) {
                                                    int i13 = (i9 << 3) + i12;
                                                    defpackage.dbk dbkVar2 = (defpackage.dbk) ((ddk) objArr4[i13]).get();
                                                    i3 = i12;
                                                    if (dbkVar2 != null) {
                                                        boolean zAl = dbkVar2.al();
                                                        i4 = i8;
                                                        if (!zAl) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    adyVar.i(i13);
                                                } else {
                                                    i3 = i12;
                                                    i4 = i8;
                                                }
                                                j9 >>= i10;
                                                i12 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i8 = i8;
                                            i2 = i10;
                                            if (i11 != i2) {
                                                break;
                                            }
                                        } else {
                                            i8 = i8;
                                            i2 = i10;
                                        }
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        i10 = i2;
                                        jArr2 = jArr2;
                                        j8 = j8;
                                        i8 = i8;
                                    }
                                }
                                i5 = i2;
                                j8 >>= i2;
                                c3 = c2;
                                j6 = j4;
                                j7 = j5;
                                objArr3 = objArr2;
                                i8++;
                                jArr2 = jArr2;
                            } else {
                                c2 = c3;
                                j4 = j6;
                            }
                            i2 = i5;
                            objArr2 = objArr3;
                            j5 = j7;
                            i5 = i2;
                            j8 >>= i2;
                            c3 = c2;
                            j6 = j4;
                            j7 = j5;
                            objArr3 = objArr2;
                            i8++;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        c = c3;
                        j = j6;
                        objArr = objArr3;
                        j3 = j7;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                        c = c3;
                        j = j6;
                        objArr = objArr3;
                        j3 = j7;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j6 = j;
                    j7 = j3;
                    objArr3 = objArr;
                    jArr2 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        defpackage.adw adwVar2 = this.f;
        if (adwVar2 != null) {
            long[] jArr4 = adwVar2.a;
            int length3 = jArr4.length - 2;
            if (length3 >= 0) {
                int i14 = 0;
                while (true) {
                    long j10 = jArr4[i14];
                    if ((((~j10) << c) & j10 & j) == j) {
                        if (i14 != length3) {
                            break;
                            break;
                        }
                        i14++;
                    } else {
                        int i15 = 8 - ((~(i14 - length3)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((j10 & j2) < j3) {
                                int i17 = (i14 << 3) + i16;
                                if (((defpackage.ady) adwVar2.c[i17]).b()) {
                                    adwVar2.j(i17);
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i15 != 8) {
                            break;
                        } else if (i14 != length3) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
            }
        }
        defpackage.adw adwVar3 = this.f;
        if (adwVar3 == null) {
            adwVar3 = new defpackage.adw(6);
            this.f = adwVar3;
        }
        java.lang.Object objA = adwVar3.a(cziVar);
        if (objA == null) {
            objA = new defpackage.ady(6);
            adwVar3.n(cziVar, objA);
        }
        ((defpackage.ady) objA).h(new ddk(dbkVar));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:61:0x0109  */
    /* JADX WARN: Code duplicated, block: B:83:0x0114 A[SYNTHETIC] */
    public final void Q(defpackage.cyf cyfVar) {
        long j;
        char c;
        long j2;
        defpackage.adw adwVar;
        long[] jArr;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        int i2;
        long[] jArr2;
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4;
        int i3;
        boolean z;
        long j3;
        if (this.n) {
            return;
        }
        cyfVar.j();
        defpackage.aonn aonnVarH = cyfVar.h();
        defpackage.aonj aonjVarG = cyfVar.g();
        dbq dbqVar = null;
        if (aonnVarH == null) {
            S();
            this.j = null;
            this.k = null;
            return;
        }
        if (aonnVarH != this.j || aonjVarG != this.k) {
            this.j = aonnVarH;
            this.k = aonjVarG;
            S();
            return;
        }
        defpackage.adw adwVar2 = this.q;
        long j4 = 255;
        int i4 = 8;
        if (adwVar2 != null) {
            java.lang.Object[] objArr5 = adwVar2.c;
            long[] jArr3 = adwVar2.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                dbq dbqVar2 = null;
                c = 7;
                int i5 = 0;
                while (true) {
                    long j5 = jArr3[i5];
                    j2 = 128;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j5 & j4) < 128) {
                                j3 = j4;
                                dbq dbqVar3 = (dbq) objArr5[(i5 << 3) + i7];
                                if (true == dbqVar3.a) {
                                    dbqVar2 = dbqVar3;
                                }
                            } else {
                                j3 = j4;
                            }
                            j5 >>= 8;
                            i7++;
                            j4 = j3;
                        }
                        j = j4;
                        if (i6 != 8) {
                            break;
                        }
                    } else {
                        j = j4;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    j4 = j;
                }
                dbqVar = dbqVar2;
            } else {
                j = 255;
                c = 7;
                j2 = 128;
            }
        } else {
            j = 255;
            c = 7;
            j2 = 128;
        }
        if (dbqVar == null) {
            return;
        }
        defpackage.cxi cxiVarK = K();
        long jL = defpackage.dfd.l(cxiVarK.l(0L));
        long jH = cxiVarK.h();
        if ((jL == dbqVar.b && jH == dbqVar.c) || (adwVar = this.q) == null) {
            return;
        }
        java.lang.Object[] objArr6 = adwVar.b;
        java.lang.Object[] objArr7 = adwVar.c;
        long[] jArr4 = adwVar.a;
        int length2 = jArr4.length - 2;
        if (length2 < 0) {
            return;
        }
        long j6 = -9187201950435737472L;
        int i8 = 0;
        while (true) {
            long j7 = jArr4[i8];
            if ((((~j7) << c) & j7 & j6) != j6) {
                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j7 & j) < j2) {
                        int i11 = (i8 << 3) + i10;
                        java.lang.Object obj = objArr6[i11];
                        dbq dbqVar4 = (dbq) objArr7[i11];
                        i3 = i4;
                        defpackage.czi cziVar = (defpackage.czi) obj;
                        jArr2 = jArr4;
                        if (dbqVar4.a) {
                            objArr3 = objArr6;
                            objArr4 = objArr7;
                            z = (dbqVar4.c == jH && dbqVar4.b == jL) ? false : true;
                            dbqVar4.c = jH;
                            dbqVar4.b = jL;
                            dbqVar4.o();
                            if (z) {
                                T(cziVar);
                            }
                        } else {
                            objArr3 = objArr6;
                            objArr4 = objArr7;
                        }
                        dbqVar4.c = jH;
                        dbqVar4.b = jL;
                        dbqVar4.o();
                        if (z) {
                            T(cziVar);
                        }
                    } else {
                        jArr2 = jArr4;
                        objArr3 = objArr6;
                        objArr4 = objArr7;
                        i3 = i4;
                    }
                    j7 >>= i3;
                    i10++;
                    objArr6 = objArr3;
                    i4 = i3;
                    jArr4 = jArr2;
                    objArr7 = objArr4;
                }
                jArr = jArr4;
                objArr = objArr6;
                objArr2 = objArr7;
                i2 = i4;
                if (i9 != i2) {
                    return;
                }
            } else {
                jArr = jArr4;
                objArr = objArr6;
                objArr2 = objArr7;
                i2 = i4;
            }
            if (i8 == length2) {
                return;
            }
            i8++;
            i4 = i2;
            objArr7 = objArr2;
            j6 = -9187201950435737472L;
            objArr6 = objArr;
            jArr4 = jArr;
        }
    }

    public abstract void R();

    /* JADX WARN: Code duplicated, block: B:24:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0070 A[LOOP:1: B:13:0x003e->B:25:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4 A[LOOP:3: B:32:0x0083->B:42:0x00b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0075 A[EDGE_INSN: B:47:0x0075->B:27:0x0075 BREAK  A[LOOP:1: B:13:0x003e->B:25:0x0070], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9 A[EDGE_INSN: B:53:0x00b9->B:43:0x00b9 BREAK  A[LOOP:3: B:32:0x0083->B:42:0x00b4], SYNTHETIC] */
    public final void S() {
        long j;
        defpackage.adq adqVar;
        yg ygVar = this.r;
        if (ygVar != null) {
            int i2 = ygVar.a;
            for (int i3 = 0; i3 < i2; i3++) {
                ((defpackage.czi[]) ygVar.c)[i3] = null;
                ((float[]) ygVar.b)[i3] = Float.NaN;
                ((byte[]) ygVar.d)[i3] = 0;
            }
            ygVar.a = 0;
        }
        defpackage.adw adwVar = this.q;
        long j2 = 255;
        if (adwVar != null) {
            java.lang.Object[] objArr = adwVar.c;
            long[] jArr = adwVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j3 = jArr[i4];
                    j = 128;
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i4 != length) {
                            break;
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((j3 & 255) < 128 && (adqVar = ((dbq) objArr[(i4 << 3) + i6]).e) != null) {
                                adqVar.l();
                            }
                            j3 >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        } else if (i4 != length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            } else {
                j = 128;
            }
        } else {
            j = 128;
        }
        defpackage.adw adwVar2 = this.f;
        if (adwVar2 != null) {
            java.lang.Object[] objArr2 = adwVar2.c;
            long[] jArr2 = adwVar2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i7 = 0;
                while (true) {
                    long j4 = jArr2[i7];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length2)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j4 & j2) < j) {
                                dz((defpackage.ady) objArr2[(i7 << 3) + i9]);
                            }
                            j4 >>= 8;
                            i9++;
                            j2 = 255;
                        }
                        if (i8 != 8) {
                            break;
                        }
                        if (i7 != length2) {
                            break;
                        }
                        i7++;
                        j2 = 255;
                    } else if (i7 != length2) {
                        break;
                        break;
                    } else {
                        i7++;
                        j2 = 255;
                    }
                }
            }
            adwVar2.k();
        }
    }

    public final void T(defpackage.czi cziVar) {
        int iCJ;
        yg ygVar = this.r;
        if (ygVar != null && (iCJ = defpackage.ajsz.cJ((java.lang.Object[]) ygVar.c, cziVar)) >= 0) {
            int i2 = iCJ + 1;
            java.lang.Object[] objArr = (java.lang.Object[]) ygVar.c;
            defpackage.ajsz.dd(objArr, objArr, iCJ, i2, ygVar.a);
            java.lang.Object obj = ygVar.c;
            int i3 = ygVar.a;
            ((defpackage.czi[]) obj)[i3 - 1] = null;
            float[] fArr = (float[]) ygVar.b;
            defpackage.ajsz.da(fArr, fArr, iCJ, i2, i3);
            byte[] bArr = (byte[]) ygVar.d;
            defpackage.ajsz.cZ(bArr, bArr, iCJ, i2, ygVar.a);
            ygVar.a--;
        }
        defpackage.adw adwVar = this.f;
        defpackage.ady adyVar = adwVar != null ? (defpackage.ady) adwVar.a(cziVar) : null;
        if (adyVar != null) {
            dz(adyVar);
            adyVar.d();
        }
        defpackage.adw adwVar2 = this.q;
        dbq dbqVar = adwVar2 != null ? (dbq) adwVar2.a(cziVar) : null;
        defpackage.adq adqVar = dbqVar != null ? dbqVar.e : null;
        if (adqVar != null) {
            while (adqVar.g()) {
                T((defpackage.czi) adqVar.h(adqVar.b - 1));
            }
        }
    }

    @Override // defpackage.dcb
    public final void U(boolean z) {
        defpackage.dbt dbtVarO = O();
        defpackage.dbk dbkVarM = dbtVarO != null ? dbtVarO.M() : null;
        if (defpackage.aooh.n(dbkVarM, M())) {
            this.l = z;
        } else if (dbkVarM != null) {
            if (dbkVarM.av() == 3 || dbkVarM.av() == 4) {
                this.l = z;
            }
        }
    }

    public abstract boolean V();

    @Override // defpackage.dpl
    public final /* synthetic */ float dh(long j) {
        return defpackage.dfd.m(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float di(float f) {
        return (f / a()) + 0.0f;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dj(int i2) {
        return (i2 / a()) + 0.0f;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dk(long j) {
        return defpackage.dfd.o(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dl(float f) {
        return f * a();
    }

    @Override // defpackage.cyj
    public final int dm(defpackage.cwk cwkVar) {
        int iS;
        if (!V() || (iS = s(cwkVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = cwkVar instanceof defpackage.czr;
        long j = this.e;
        return iS + ((int) (z ? j >> 32 : j & 4294967295L));
    }

    @Override // defpackage.dpf
    /* JADX INFO: renamed from: do */
    public final /* synthetic */ int mo1do(long j) {
        return java.lang.Math.round(dk(j));
    }

    @Override // defpackage.dpf
    public final /* synthetic */ int dp(float f) {
        return defpackage.dfd.p(this, f);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dq(long j) {
        return defpackage.dfd.q(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dr(long j) {
        return defpackage.dfd.r(this, j);
    }

    @Override // defpackage.dpl
    public final /* synthetic */ long ds(float f) {
        return defpackage.dfd.n(this, f);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dt(float f) {
        return ds(di(f));
    }

    @Override // defpackage.cyi
    public final /* synthetic */ defpackage.cyf du(int i2, int i3, java.util.Map map, defpackage.aonj aonjVar) {
        return dx(i2, i3, map, aonjVar);
    }

    @Override // defpackage.cyi
    public final defpackage.cyf dv(int i2, int i3, defpackage.aonj aonjVar, defpackage.aonn aonnVar, java.util.Map map, defpackage.aonj aonjVar2) {
        if ((i2 & (-16777216)) != 0 || ((-16777216) & i3) != 0) {
            defpackage.cwh.d(defpackage.a.bA(i3, i2, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new defpackage.dbs(i2, i3, map, aonjVar, aonnVar, aonjVar2, this);
    }

    @Override // defpackage.cxf
    public boolean dw() {
        return false;
    }

    @Override // defpackage.cyi
    public final defpackage.cyf dx(int i2, int i3, java.util.Map map, defpackage.aonj aonjVar) {
        if ((i2 & (-16777216)) != 0 || ((-16777216) & i3) != 0) {
            defpackage.cwh.d(defpackage.a.bA(i3, i2, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new defpackage.dbr(i2, i3, map, aonjVar, this);
    }

    public abstract int s(defpackage.cwk cwkVar);
}
