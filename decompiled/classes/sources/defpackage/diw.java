package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class diw {
    public final defpackage.aco a;
    public boolean d;
    public boolean e;
    public java.lang.Object f;
    private final defpackage.dit g;
    private boolean h;
    public final defpackage.diu b = new defpackage.diu();
    public final defpackage.diz c = new defpackage.diz();
    private final defpackage.adq l = new defpackage.adq(16);
    private long i = -1;
    private final defpackage.aomy j = new defpackage.ddw(this, 4);
    private final defpackage.cpl k = new defpackage.cpl();

    public diw(defpackage.aco acoVar, defpackage.dit ditVar) {
        this.a = acoVar;
        this.g = ditVar;
    }

    public static final boolean h(defpackage.dbk dbkVar) {
        return dbkVar.h != -4;
    }

    private final void j(defpackage.dbk dbkVar) {
        int i;
        int iA;
        dbkVar.d = true;
        defpackage.dbx dbxVarN = dbkVar.n();
        int iX = dbxVarN.x();
        float fW = dbxVarN.w();
        defpackage.cpl cplVar = this.k;
        cplVar.d(iX, fW);
        for (defpackage.dck dckVarP = dbkVar.p(); dckVarP != null; dckVarP = dckVarP.A) {
            defpackage.dbk dbkVar2 = dckVarP.w;
            if (dckVarP == dbkVar2.p() && !dbkVar2.d) {
                long jB = b(dbkVar2);
                if (jB != 9223372034707292159L) {
                    cplVar.b((((long) java.lang.Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) java.lang.Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            defpackage.dct dctVar = dckVarP.L;
            if (dctVar != null) {
                float[] fArrK = dctVar.k();
                if (!defpackage.cfd.I(fArrK)) {
                    defpackage.cqt.b(fArrK, cplVar);
                }
            }
            long j = dckVarP.B;
            cplVar.b((((long) java.lang.Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) java.lang.Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L));
        }
        int i2 = (int) cplVar.a;
        int i3 = (int) cplVar.b;
        int i4 = (int) cplVar.c;
        int i5 = (int) cplVar.d;
        int i6 = dbkVar.c;
        if (h(dbkVar)) {
            defpackage.diu diuVar = this.b;
            int iA2 = a(dbkVar);
            long[] jArr = (long[]) diuVar.b;
            jArr[iA2] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
            jArr[iA2 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
            int i7 = iA2 + 2;
            long j2 = jArr[i7];
            jArr[i7] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            defpackage.dbk dbkVarK = dbkVar.k();
            defpackage.diu diuVar2 = this.b;
            if (dbkVarK != null) {
                i = dbkVarK.c;
                iA = a(dbkVarK);
            } else {
                i = -1;
                iA = -4;
            }
            int i8 = iA;
            defpackage.dce dceVar = dbkVar.v;
            dbkVar.h = diuVar2.a(i6, i2, i3, i4, i5, i, i8, dceVar.i(1024), dceVar.i(16), this.c.g.b(i6));
        }
        dbkVar.g = false;
        d();
        defpackage.cfc cfcVarJ = dbkVar.j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i9 = cfcVarJ.b;
        for (int i10 = 0; i10 < i9; i10++) {
            defpackage.dbk dbkVar3 = (defpackage.dbk) objArr[i10];
            if (dbkVar3.am()) {
                j(dbkVar3);
            }
        }
    }

    private final void k(defpackage.dbk dbkVar) {
        if (!dbkVar.d || l(dbkVar.p())) {
            return;
        }
        dbkVar.d = false;
        if (dbkVar.f) {
            dbkVar.e = m(dbkVar);
            dbkVar.au();
        }
        if (dbkVar.e != 9223372034707292159L) {
            defpackage.cfc cfcVarJ = dbkVar.j();
            java.lang.Object[] objArr = cfcVarJ.a;
            int i = cfcVarJ.b;
            for (int i2 = 0; i2 < i; i2++) {
                k((defpackage.dbk) objArr[i2]);
            }
        }
    }

    private static final boolean l(defpackage.dck dckVar) {
        defpackage.dct dctVar = dckVar.L;
        return (dctVar == null || defpackage.cfd.I(dctVar.k())) ? false : true;
    }

    private static final long m(defpackage.dbk dbkVar) {
        defpackage.dck dckVarP = dbkVar.p();
        long jD = 0;
        for (defpackage.dck dckVarO = dbkVar.o(); dckVarO != null && dckVarO != dckVarP; dckVarO = dckVarO.A) {
            if (l(dckVarO)) {
                return 9223372034707292159L;
            }
            jD = defpackage.dpn.d(jD, dckVarO.B);
        }
        return jD;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x0034 A[LOOP:0: B:11:0x0025->B:15:0x0034, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[EDGE_INSN: B:23:0x0038->B:17:0x0038 BREAK  A[LOOP:0: B:11:0x0025->B:15:0x0034], SYNTHETIC] */
    public final int a(defpackage.dbk dbkVar) {
        int i;
        int i2 = dbkVar.h;
        int i3 = -4;
        if (i2 == -4) {
            i2 = -4;
            break;
        }
        defpackage.diu diuVar = this.b;
        int i4 = dbkVar.c & 33554431;
        java.lang.Object obj = diuVar.b;
        if (i2 >= 0 && i2 < diuVar.a - 2) {
            if ((((int) ((long[]) obj)[i2 + 2]) & 33554431) != i4) {
                i = diuVar.a;
                i2 = 0;
                while (true) {
                    if (i2 < i - 2) {
                        i2 = -4;
                        break;
                    }
                    if ((((int) ((long[]) obj)[i2 + 2]) & 33554431) != i4) {
                        break;
                        break;
                    }
                    i2 += 3;
                }
            }
        } else {
            i = diuVar.a;
            i2 = 0;
            while (true) {
                if (i2 < i - 2) {
                    i2 = -4;
                    break;
                }
                if ((((int) ((long[]) obj)[i2 + 2]) & 33554431) != i4) {
                    break;
                }
                i2 += 3;
            }
        }
        if (i2 == -4) {
            defpackage.cwh.c("LayoutNode " + dbkVar.c + " not found in RectList");
        } else {
            i3 = i2;
        }
        dbkVar.h = i3;
        return i3;
    }

    public final long b(defpackage.dbk dbkVar) {
        if (!h(dbkVar)) {
            return 9223372034707292159L;
        }
        defpackage.diu diuVar = this.b;
        long j = ((long[]) diuVar.b)[a(dbkVar)];
        return (((long) ((int) (j >> 32))) << 32) | (((long) ((int) j)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0289 A[ADDED_TO_REGION, LOOP:12: B:102:0x0289->B:103:0x028b, LOOP_START, PHI: r1
      0x0289: PHI (r1v9 diy) = (r1v7 diy), (r1v10 diy) binds: [B:101:0x0287, B:103:0x028b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x028b A[LOOP:12: B:102:0x0289->B:103:0x028b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x0238 A[EDGE_INSN: B:121:0x0238->B:81:0x0238 BREAK  A[LOOP:8: B:72:0x0205->B:80:0x0235], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0285 A[EDGE_INSN: B:126:0x0285->B:100:0x0285 BREAK  A[LOOP:9: B:87:0x0252->B:99:0x0282], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0285 A[EDGE_INSN: B:127:0x0285->B:100:0x0285 BREAK  A[LOOP:9: B:87:0x0252->B:99:0x0282], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b8 A[ADDED_TO_REGION, LOOP:7: B:67:0x01b8->B:68:0x01ba, LOOP_START, PHI: r1
      0x01b8: PHI (r1v14 diy) = (r1v13 diy), (r1v15 diy) binds: [B:66:0x01b6, B:68:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba A[LOOP:7: B:67:0x01b8->B:68:0x01ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:74:0x020d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0246  */
    /* JADX WARN: Code duplicated, block: B:86:0x0251  */
    /* JADX WARN: Code duplicated, block: B:89:0x025e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0268  */
    /* JADX WARN: Code duplicated, block: B:93:0x026e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0277 A[LOOP:11: B:94:0x0275->B:95:0x0277, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0280 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0282 A[LOOP:9: B:87:0x0252->B:99:0x0282, LOOP_END] */
    public final void c() {
        boolean z;
        int i;
        char c;
        long j;
        long j2;
        defpackage.diz dizVar;
        java.lang.Object[] objArr;
        long[] jArr;
        int length;
        defpackage.diy diyVar;
        int i2;
        long j3;
        int i3;
        int i4;
        defpackage.diy diyVar2;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i5;
        int i6;
        long[] jArr2;
        long[] jArr3;
        long j4;
        long j5;
        float[] fArr;
        defpackage.diy diyVar3;
        int i7;
        java.lang.Object[] objArr2;
        long[] jArr4;
        long j6;
        long j7;
        g();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z2 = this.d;
        int i8 = 1;
        boolean z3 = z2 || this.e;
        if (z2) {
            this.d = false;
            defpackage.adq adqVar = this.l;
            java.lang.Object[] objArr3 = adqVar.a;
            int i9 = adqVar.b;
            for (int i10 = 0; i10 < i9; i10++) {
                ((defpackage.aomy) objArr3[i10]).a();
            }
            defpackage.diu diuVar = this.b;
            java.lang.Object obj3 = diuVar.b;
            int i11 = diuVar.a;
            int i12 = 0;
            while (true) {
                long[] jArr5 = (long[]) obj3;
                if (i12 >= jArr5.length - 2 || i12 >= i11) {
                    break;
                }
                long j8 = jArr5[i12 + 2];
                if ((((int) (j8 >> 60)) & i8) != 0) {
                    long j9 = jArr5[i12];
                    long j10 = jArr5[i12 + 1];
                    int i13 = (int) j8;
                    defpackage.diz dizVar2 = this.c;
                    defpackage.diy diyVar4 = (defpackage.diy) dizVar2.g.a(i13 & 33554431);
                    while (true) {
                        defpackage.diy diyVar5 = diyVar4;
                        if (diyVar5 != null) {
                            diyVar4 = diyVar5.b;
                            boolean z4 = z3;
                            long j11 = diyVar5.e;
                            boolean z5 = jCurrentTimeMillis - j11 >= 0 || j11 == Long.MIN_VALUE;
                            diyVar5.c = j9;
                            diyVar5.d = j10;
                            if (z5) {
                                diyVar5.e = jCurrentTimeMillis;
                                j7 = j10;
                                diyVar5.a(j9, j7, dizVar2.c, dizVar2.d, dizVar2.f);
                            } else {
                                j7 = j10;
                            }
                            j10 = j7;
                            z3 = z4;
                        }
                    }
                }
                i12 += 3;
                obj3 = obj3;
                z3 = z3;
                i8 = 1;
            }
            z = z3;
            java.lang.Object obj4 = diuVar.b;
            int i14 = diuVar.a;
            int i15 = 0;
            while (true) {
                long[] jArr6 = (long[]) obj4;
                if (i15 >= jArr6.length - 2 || i15 >= i14) {
                    break;
                }
                int i16 = i15 + 2;
                jArr6[i16] = jArr6[i16] & (-1152921504606846977L);
                i15 += 3;
            }
        } else {
            z = z3;
        }
        long j12 = -9187201950435737472L;
        if (this.e) {
            this.e = false;
            defpackage.diz dizVar3 = this.c;
            defpackage.aco acoVar = dizVar3.g;
            long j13 = dizVar3.c;
            long j14 = dizVar3.d;
            float[] fArr2 = dizVar3.f;
            java.lang.Object[] objArr4 = acoVar.c;
            long[] jArr7 = acoVar.a;
            int i17 = 8;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i18 = 0;
                char c2 = 7;
                j = 128;
                while (true) {
                    long j15 = jArr7[i18];
                    j2 = 255;
                    if ((((~j15) << c2) & j15 & j12) != j12) {
                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                        int i20 = 0;
                        while (i20 < i19) {
                            if ((j15 & 255) < 128) {
                                defpackage.diy diyVar6 = (defpackage.diy) objArr4[(i18 << 3) + i20];
                                while (diyVar6 != null) {
                                    long j16 = j13;
                                    java.lang.Object[] objArr5 = objArr4;
                                    defpackage.diy diyVar7 = diyVar6;
                                    defpackage.diz.b(diyVar7, j16, j14, fArr2, jCurrentTimeMillis);
                                    diyVar6 = diyVar7.b;
                                    objArr4 = objArr5;
                                    length2 = length2;
                                    jArr7 = jArr7;
                                    c2 = c2;
                                    j13 = j16;
                                    i17 = i17;
                                    j12 = j12;
                                }
                            }
                            long j17 = j12;
                            int i21 = i17;
                            j15 >>= i21;
                            i20++;
                            objArr4 = objArr4;
                            length2 = length2;
                            jArr7 = jArr7;
                            c2 = c2;
                            j13 = j13;
                            i17 = i21;
                            j12 = j17;
                        }
                        j12 = j12;
                        i = i17;
                        c = c2;
                        i7 = length2;
                        long j18 = j13;
                        objArr2 = objArr4;
                        jArr4 = jArr7;
                        j6 = j18;
                        if (i19 != i) {
                            break;
                        }
                    } else {
                        j12 = j12;
                        i = i17;
                        c = c2;
                        i7 = length2;
                        long j19 = j13;
                        objArr2 = objArr4;
                        jArr4 = jArr7;
                        j6 = j19;
                    }
                    if (i18 == i7) {
                        break;
                    }
                    i18++;
                    objArr4 = objArr2;
                    long j20 = j6;
                    length2 = i7;
                    jArr7 = jArr4;
                    c2 = c;
                    j13 = j20;
                    i17 = i;
                    j12 = j12;
                }
            } else {
                i = 8;
            }
            if (z) {
                defpackage.diz dizVar4 = this.c;
                j4 = dizVar4.c;
                j5 = dizVar4.d;
                fArr = dizVar4.f;
                diyVar3 = dizVar4.a;
                if (diyVar3 != null) {
                    while (diyVar3 != null) {
                        defpackage.dbk dbkVarA = defpackage.cfo.A(diyVar3.a);
                        long jB = ((defpackage.deg) defpackage.dbn.a(dbkVarA)).o.b(dbkVarA);
                        diyVar3.c = jB;
                        diyVar3.d = (((long) (((int) (jB >> 32)) + dbkVarA.g())) << 32) | (((long) (((int) (jB & 4294967295L)) + dbkVarA.e())) & 4294967295L);
                        defpackage.diz.b(diyVar3, j4, j5, fArr, jCurrentTimeMillis);
                        diyVar3 = diyVar3.b;
                    }
                }
            }
            if (this.h) {
                this.h = false;
                defpackage.diu diuVar2 = this.b;
                obj = diuVar2.b;
                int i22 = diuVar2.a;
                obj2 = diuVar2.c;
                i5 = 0;
                i6 = 0;
                while (true) {
                    jArr2 = (long[]) obj;
                    if (i5 < jArr2.length - 2) {
                        break;
                    }
                    jArr3 = (long[]) obj2;
                    if (i6 >= jArr3.length - 2 || i5 >= i22) {
                        break;
                    }
                    int i23 = i5 + 2;
                    if (jArr2[i23] != defpackage.div.a) {
                        jArr3[i6] = jArr2[i5];
                        jArr3[i6 + 1] = jArr2[i5 + 1];
                        jArr3[i6 + 2] = jArr2[i23];
                        i6 += 3;
                    }
                    i5 += 3;
                }
                diuVar2.a = i6;
                diuVar2.b = obj2;
                diuVar2.c = obj;
            }
            dizVar = this.c;
            if (dizVar.b <= jCurrentTimeMillis) {
                defpackage.aco acoVar2 = dizVar.g;
                objArr = acoVar2.c;
                jArr = acoVar2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i2 = 0;
                    while (true) {
                        j3 = jArr[i2];
                        if ((((~j3) << c) & j3 & j12) != j12) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (i4 = 0; i4 < i3; i4++) {
                                if ((j3 & j2) < j) {
                                    for (diyVar2 = (defpackage.diy) objArr[(i2 << 3) + i4]; diyVar2 != null; diyVar2 = diyVar2.b) {
                                    }
                                }
                                j3 >>= i;
                            }
                            if (i3 == i) {
                                break;
                            } else if (i2 != length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                diyVar = dizVar.a;
                if (diyVar != null) {
                    while (diyVar != null) {
                        diyVar = diyVar.b;
                    }
                }
                dizVar.b = -1L;
            }
        }
        i = 8;
        c = 7;
        j = 128;
        j2 = 255;
        if (z) {
            defpackage.diz dizVar5 = this.c;
            j4 = dizVar5.c;
            j5 = dizVar5.d;
            fArr = dizVar5.f;
            diyVar3 = dizVar5.a;
            if (diyVar3 != null) {
                while (diyVar3 != null) {
                    defpackage.dbk dbkVarA2 = defpackage.cfo.A(diyVar3.a);
                    long jB2 = ((defpackage.deg) defpackage.dbn.a(dbkVarA2)).o.b(dbkVarA2);
                    diyVar3.c = jB2;
                    diyVar3.d = (((long) (((int) (jB2 >> 32)) + dbkVarA2.g())) << 32) | (((long) (((int) (jB2 & 4294967295L)) + dbkVarA2.e())) & 4294967295L);
                    defpackage.diz.b(diyVar3, j4, j5, fArr, jCurrentTimeMillis);
                    diyVar3 = diyVar3.b;
                }
            }
        }
        if (this.h) {
            this.h = false;
            defpackage.diu diuVar3 = this.b;
            obj = diuVar3.b;
            int i24 = diuVar3.a;
            obj2 = diuVar3.c;
            i5 = 0;
            i6 = 0;
            while (true) {
                jArr2 = (long[]) obj;
                if (i5 < jArr2.length - 2) {
                    break;
                    break;
                }
                jArr3 = (long[]) obj2;
                if (i6 >= jArr3.length - 2) {
                    break;
                }
                break;
                break;
                i5 += 3;
            }
            diuVar3.a = i6;
            diuVar3.b = obj2;
            diuVar3.c = obj;
        }
        dizVar = this.c;
        if (dizVar.b <= jCurrentTimeMillis) {
            defpackage.aco acoVar3 = dizVar.g;
            objArr = acoVar3.c;
            jArr = acoVar3.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i2 = 0;
                while (true) {
                    j3 = jArr[i2];
                    if ((((~j3) << c) & j3 & j12) != j12) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        i3 = 8 - ((~(i2 - length)) >>> 31);
                        while (i4 < i3) {
                            if ((j3 & j2) < j) {
                                while (diyVar2 != null) {
                                }
                            }
                            j3 >>= i;
                        }
                        if (i3 == i) {
                            break;
                            break;
                        } else {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
            diyVar = dizVar.a;
            if (diyVar != null) {
                while (diyVar != null) {
                    diyVar = diyVar.b;
                }
            }
            dizVar.b = -1L;
        }
    }

    public final void d() {
        this.d = true;
    }

    public final void e(defpackage.dbk dbkVar) {
        long j;
        int i;
        int i2;
        if (dbkVar.am() && dbkVar.g) {
            defpackage.dbk dbkVarK = dbkVar.k();
            if (dbkVarK == null) {
                j = 0;
            } else if (dbkVarK.d) {
                j = 9223372034707292159L;
            } else {
                if (dbkVarK.f) {
                    dbkVarK.au();
                    dbkVarK.e = m(dbkVarK);
                }
                j = dbkVarK.e;
            }
            defpackage.dck dckVarP = dbkVar.p();
            if (j == 9223372034707292159L || l(dckVarP)) {
                j(dbkVar);
            } else if (dbkVar.d) {
                j(dbkVar);
                k(dbkVar);
            } else {
                long jD = defpackage.dpn.d(j, dckVarP.B);
                defpackage.dbx dbxVarN = dbkVar.n();
                int iX = dbxVarN.x();
                int iW = dbxVarN.w();
                int i3 = (int) (jD >> 32);
                int i4 = (int) (jD & 4294967295L);
                if (h(dbkVar)) {
                    int iA = a(dbkVar);
                    defpackage.diu diuVar = this.b;
                    if (dbkVarK != null) {
                        int iA2 = a(dbkVarK);
                        long[] jArr = (long[]) diuVar.b;
                        long j2 = jArr[iA2];
                        int i5 = (int) j2;
                        int i6 = ((int) (j2 >> 32)) + i3;
                        int i7 = i5 + i4;
                        long j3 = jArr[iA];
                        long j4 = j3 >> 32;
                        int i8 = (int) j3;
                        int i9 = iA + 2;
                        long j5 = jArr[i9];
                        jArr[iA] = (((long) i6) << 32) | (((long) i7) & 4294967295L);
                        jArr[iA + 1] = (((long) (iX + i6)) << 32) | (((long) (iW + i7)) & 4294967295L);
                        jArr[i9] = j5 | (((j5 >> 63) & 1) << 60);
                        int i10 = i7 - i8;
                        int i11 = i6 - ((int) j4);
                        if (i11 != 0) {
                            i2 = i11;
                        } else if (i10 != 0) {
                            i2 = 0;
                        }
                        diuVar.c(j5, iA, i2, i10);
                    } else {
                        int iA3 = a(dbkVar);
                        long[] jArr2 = (long[]) diuVar.b;
                        long j6 = jArr2[iA3];
                        jArr2[iA3] = (((long) i3) << 32) | (((long) i4) & 4294967295L);
                        jArr2[iA3 + 1] = (((long) (iX + i3)) << 32) | (((long) (iW + i4)) & 4294967295L);
                        int i12 = iA3 + 2;
                        long j7 = jArr2[i12];
                        jArr2[i12] = (((j7 >> 63) & 1) << 60) | j7;
                        int i13 = i3 - ((int) (j6 >> 32));
                        int i14 = i4 - ((int) j6);
                        if (i13 != 0) {
                            i = i13;
                        } else if (i14 != 0) {
                            i = 0;
                        }
                        diuVar.c(j7, iA3, i, i14);
                    }
                } else {
                    int i15 = dbkVar.c;
                    defpackage.dce dceVar = dbkVar.v;
                    boolean zI = dceVar.i(1024);
                    boolean zI2 = dceVar.i(16);
                    boolean zB = this.c.g.b(i15);
                    defpackage.diu diuVar2 = this.b;
                    if (dbkVarK != null) {
                        int i16 = dbkVarK.c;
                        int iA4 = a(dbkVarK);
                        int i17 = i15 & 33554431;
                        long[] jArr3 = (long[]) diuVar2.b;
                        if ((((int) jArr3[iA4 + 2]) & 33554431) != (i16 & 33554431)) {
                            defpackage.cwh.c(defpackage.a.bA(i16, i17, "Inserted child ", " without valid parent index or parent ", " not found"));
                        }
                        long j8 = jArr3[iA4];
                        int i18 = ((int) (j8 >> 32)) + i3;
                        int i19 = ((int) j8) + i4;
                        dbkVar.h = diuVar2.a(i17, i18, i19, i18 + iX, i19 + iW, i16, iA4, zI, zI2, zB);
                    } else {
                        dbkVar.h = diuVar2.a(i15, i3, i4, i3 + iX, i4 + iW, -1, -4, zI, zI2, zB);
                    }
                }
            }
            dbkVar.g = false;
            d();
            i();
        }
    }

    public final void f(defpackage.dbk dbkVar) {
        if (h(dbkVar)) {
            defpackage.diu diuVar = this.b;
            int iA = a(dbkVar);
            long[] jArr = (long[]) diuVar.b;
            jArr[iA] = -1;
            jArr[iA + 1] = -1;
            jArr[iA + 2] = defpackage.div.a;
            dbkVar.h = -4;
            dbkVar.g = true;
            d();
            this.h = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    public final void g() {
        ?? r0 = this.f;
        if (r0 != 0) {
            ((defpackage.deg) this.g).removeCallbacks(r0);
            this.f = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Runnable] */
    public final void i() {
        defpackage.diz dizVar = this.c;
        ?? r1 = this.f;
        long j = dizVar.b;
        int i = 1;
        boolean z = false;
        boolean z2 = r1 != 0;
        if (j >= 0) {
            z = z2;
        } else if (z2) {
            return;
        }
        if (this.i == j && z) {
            return;
        }
        if (r1 != 0) {
            ((defpackage.deg) this.g).removeCallbacks(r1);
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long jMax = java.lang.Math.max(j, 16 + jCurrentTimeMillis);
        this.i = jMax;
        defpackage.dit ditVar = this.g;
        defpackage.ddv ddvVar = new defpackage.ddv(this.j, i);
        ((defpackage.deg) ditVar).postDelayed(ddvVar, jMax - jCurrentTimeMillis);
        this.f = ddvVar;
    }
}
