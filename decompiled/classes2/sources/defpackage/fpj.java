package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fpj implements defpackage.flj {
    public boolean a;
    private final int b;
    private final defpackage.etx c;
    private final defpackage.flv d;
    private final defpackage.fls e;
    private final defpackage.fmk f;
    private defpackage.fll g;
    private defpackage.fmk h;
    private defpackage.fmk i;
    private int j;
    private defpackage.eqy k;
    private defpackage.eqy l;
    private long m;
    private long n;
    private long o;
    private long p;
    private int q;
    private defpackage.fpm r;
    private final defpackage.vk s;

    public fpj(int i) {
        this.b = i;
        this.c = new defpackage.etx(10);
        this.d = new defpackage.flv();
        this.e = new defpackage.fls();
        this.m = -9223372036854775807L;
        this.s = new defpackage.vk((byte[]) null, (byte[]) null);
        defpackage.flg flgVar = new defpackage.flg();
        this.f = flgVar;
        this.i = flgVar;
        this.p = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0228  */
    /* JADX WARN: Code duplicated, block: B:102:0x0232  */
    /* JADX WARN: Code duplicated, block: B:104:0x0236  */
    /* JADX WARN: Code duplicated, block: B:110:0x026a  */
    /* JADX WARN: Code duplicated, block: B:111:0x026d  */
    /* JADX WARN: Code duplicated, block: B:113:0x027d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0290  */
    /* JADX WARN: Code duplicated, block: B:117:0x0294  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:185:0x0454  */
    /* JADX WARN: Code duplicated, block: B:187:0x045d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:189:0x045f  */
    /* JADX WARN: Code duplicated, block: B:202:0x04bf A[PHI: r2
      0x04bf: PHI (r2v6 int) = (r2v5 int), (r2v15 int) binds: [B:184:0x0452, B:197:0x04a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:204:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:206:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:62:0x015b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0163  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:68:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0172  */
    /* JADX WARN: Code duplicated, block: B:72:0x0179  */
    /* JADX WARN: Code duplicated, block: B:74:0x0180 A[LOOP:2: B:73:0x017e->B:74:0x0180, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0195  */
    /* JADX WARN: Code duplicated, block: B:79:0x019b  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:97:0x0210  */
    private final int h(defpackage.flk flkVar) throws java.lang.Throwable {
        java.lang.Throwable th;
        int i;
        int i2;
        int iA;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iQ;
        long jW;
        long[] jArr;
        defpackage.fpl fplVar;
        int i8;
        int i9;
        long j;
        defpackage.flv flvVar;
        defpackage.fls flsVar;
        long j2;
        boolean z;
        defpackage.eqy eqyVar;
        long j3;
        long j4;
        long j5;
        long jR;
        long j6;
        long j7;
        int iS;
        defpackage.fpm fpgVar;
        long j8;
        long jR2;
        long j9;
        long jMin;
        float fIntBitsToFloat;
        defpackage.fpk fpkVarA;
        defpackage.fpk fpkVarA2;
        int i10;
        long[] jArr2;
        int i11;
        defpackage.fpm fpmVarJ;
        defpackage.fom fomVar;
        char c;
        long jW2;
        int iN;
        if (this.j == 0) {
            try {
                n(flkVar, false);
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        if (this.r != null) {
            th = null;
            long j10 = this.o;
            if (j10 != 0) {
                defpackage.flc flcVar = (defpackage.flc) flkVar;
                long j11 = flcVar.b;
                if (j11 < j10) {
                    i = 0;
                    flcVar.p((int) (j10 - j11), false);
                }
            }
            i2 = this.q;
            if (i2 == 0) {
                iA = this.i.a(flkVar, i2, true);
                i3 = -1;
                if (iA != -1) {
                    i4 = this.q - iA;
                    this.q = i4;
                    if (i4 <= 0) {
                        defpackage.fmk fmkVar = this.i;
                        long jI = i(this.n);
                        defpackage.flv flvVar2 = this.d;
                        fmkVar.d(jI, 1, flvVar2.c, 0, null);
                        this.n += (long) flvVar2.g;
                        i3 = 0;
                        this.q = 0;
                    }
                }
                return i3;
            }
            flkVar.k();
            if (m(flkVar)) {
                return -1;
            }
            defpackage.etx etxVar = this.c;
            etxVar.Q(i);
            i5 = etxVar.i();
            if (!l(i5, this.j) && defpackage.flw.a(i5) != -1) {
                defpackage.flv flvVar3 = this.d;
                flvVar3.a(i5);
                if (this.m == -9223372036854775807L) {
                    this.m = this.r.h(((defpackage.flc) flkVar).b);
                }
                i2 = flvVar3.c;
                this.q = i2;
                this.p = ((defpackage.flc) flkVar).b + ((long) i2);
                defpackage.fpm fpmVar = this.r;
                if (fpmVar instanceof defpackage.fph) {
                    i(this.n + ((long) flvVar3.g));
                    throw th;
                }
                iA = this.i.a(flkVar, i2, true);
                i3 = -1;
                if (iA != -1) {
                    i4 = this.q - iA;
                    this.q = i4;
                    if (i4 <= 0) {
                        defpackage.fmk fmkVar2 = this.i;
                        long jI2 = i(this.n);
                        defpackage.flv flvVar4 = this.d;
                        fmkVar2.d(jI2, 1, flvVar4.c, 0, null);
                        this.n += (long) flvVar4.g;
                        i3 = 0;
                        this.q = 0;
                    }
                }
                return i3;
            }
            ((defpackage.flc) flkVar).p(1, false);
            this.j = 0;
            return 0;
        }
        defpackage.flv flvVar5 = this.d;
        defpackage.etx etxVar2 = new defpackage.etx(flvVar5.c);
        defpackage.flc flcVar2 = (defpackage.flc) flkVar;
        flcVar2.n(etxVar2.b, 0, flvVar5.c, false);
        int i12 = 21;
        if ((flvVar5.a & 1) != 0) {
            if (flvVar5.e != 1) {
                i12 = 36;
            }
        } else if (flvVar5.e == 1) {
            i12 = 13;
        }
        th = null;
        if (etxVar2.d >= i12 + 4) {
            etxVar2.Q(i12);
            i6 = etxVar2.i();
            if (i6 != 1483304551) {
                if (i6 == 1231971951) {
                    i6 = 1231971951;
                } else if (etxVar2.d >= 40) {
                    etxVar2.Q(36);
                    if (etxVar2.i() == 1447187017) {
                        i6 = 1447187017;
                    } else {
                        i6 = 0;
                    }
                } else {
                    i6 = 0;
                }
            }
        } else if (etxVar2.d >= 40) {
            etxVar2.Q(36);
            if (etxVar2.i() == 1447187017) {
                i6 = 1447187017;
            } else {
                i6 = 0;
            }
        } else {
            i6 = 0;
        }
        if (i6 == 1231971951) {
            i7 = etxVar2.i();
            if ((i7 & 1) != 0) {
                iQ = etxVar2.q();
            } else {
                iQ = -1;
            }
            if ((i7 & 2) != 0) {
                jW = etxVar2.w();
            } else {
                jW = -1;
            }
            if ((i7 & 4) == 4) {
                jArr2 = new long[100];
                i11 = 0;
                for (i10 = 100; i11 < i10; i10 = 100) {
                    long[] jArr3 = jArr2;
                    jArr3[i11] = etxVar2.n();
                    i11++;
                    jArr2 = jArr3;
                }
                jArr = jArr2;
            } else {
                jArr = null;
            }
            if ((i7 & 8) != 0) {
                etxVar2.R(4);
            }
            if (etxVar2.d() >= 24) {
                etxVar2.R(11);
                fIntBitsToFloat = java.lang.Float.intBitsToFloat(etxVar2.i());
                int iS2 = etxVar2.s();
                int iS3 = etxVar2.s();
                fpkVarA = defpackage.fpk.a(iS2);
                fpkVarA2 = defpackage.fpk.a(iS3);
                if (fIntBitsToFloat > 0.0f && fpkVarA == null && fpkVarA2 == null) {
                    fplVar = null;
                } else {
                    fplVar = new defpackage.fpl(fIntBitsToFloat, fpkVarA, fpkVarA2);
                }
                etxVar2.R(2);
                int iP = etxVar2.p();
                i9 = iP >> 12;
                i8 = iP & 4095;
            } else {
                fplVar = null;
                i8 = -1;
                i9 = -1;
            }
            j = iQ;
            flvVar = new defpackage.flv(flvVar5);
            flsVar = this.e;
            if (!flsVar.a() && i9 != -1) {
                flsVar.a = i9;
                flsVar.b = i8;
            }
            if (fplVar != null) {
                z = false;
                j2 = -9223372036854775807L;
                eqyVar = new defpackage.eqy(-9223372036854775807L, fplVar);
            } else {
                j2 = -9223372036854775807L;
                z = false;
                eqyVar = null;
            }
            this.l = eqyVar;
            j3 = flcVar2.b;
            flcVar2.p(flvVar5.c, z);
            if (i6 == 1483304551) {
                j8 = flcVar2.a;
                jR2 = defpackage.fsu.r(flvVar, j, i9, i8);
                if (jR2 != j2) {
                    if (jW != -1) {
                        if (j8 != -1 || j3 + jW == j8) {
                            jMin = jW;
                        } else {
                            long j12 = j8 - j3;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data size mismatch between stream (");
                            sb.append(j12);
                            sb.append(") and Xing frame (");
                            long j13 = jW;
                            sb.append(j13);
                            sb.append("), using smaller value.");
                            defpackage.etr.e("XingSeeker", sb.toString());
                            jMin = java.lang.Math.min(j13, j12);
                        }
                        j9 = jMin;
                    } else {
                        j9 = -1;
                    }
                    fpgVar = new defpackage.fpo(j3, flvVar.c, jR2, j9, jArr);
                } else {
                    j4 = jW;
                    j4 = jW;
                    fpgVar = null;
                }
            } else {
                j5 = flcVar2.a;
                jR = defpackage.fsu.r(flvVar, j, i9, i8);
                if (jR != -9223372036854775807L) {
                    j4 = jW;
                    j4 = jW;
                    fpgVar = null;
                } else {
                    if (j4 != -1) {
                        j4 = jW;
                        j5 = j3 + j4;
                        j6 = j4 - ((long) flvVar.c);
                    } else if (j5 != -1) {
                        j4 = jW;
                        j6 = (j5 - j3) - ((long) flvVar.c);
                    } else {
                        j4 = jW;
                        j4 = jW;
                        fpgVar = null;
                    }
                    j7 = j5;
                    iS = defpackage.fsu.s(j6, jR);
                    if (iS != -2147483647) {
                        fpgVar = new defpackage.fpg(j7, j3 + ((long) flvVar.c), iS, aiql.P(aiql.ag(j6, j, java.math.RoundingMode.HALF_UP)), false, true, jR);
                    } else {
                        j4 = jW;
                        j4 = jW;
                        fpgVar = null;
                    }
                }
            }
        } else if (i6 != 1447187017) {
            if (i6 != 1483304551) {
                flkVar.k();
            } else {
                i7 = etxVar2.i();
                if ((i7 & 1) != 0) {
                    iQ = etxVar2.q();
                } else {
                    iQ = -1;
                }
                if ((i7 & 2) != 0) {
                    jW = etxVar2.w();
                } else {
                    jW = -1;
                }
                if ((i7 & 4) == 4) {
                    jArr2 = new long[100];
                    i11 = 0;
                    while (i11 < i10) {
                        long[] jArr4 = jArr2;
                        jArr4[i11] = etxVar2.n();
                        i11++;
                        jArr2 = jArr4;
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                if ((i7 & 8) != 0) {
                    etxVar2.R(4);
                }
                if (etxVar2.d() >= 24) {
                    etxVar2.R(11);
                    fIntBitsToFloat = java.lang.Float.intBitsToFloat(etxVar2.i());
                    int iS4 = etxVar2.s();
                    int iS5 = etxVar2.s();
                    fpkVarA = defpackage.fpk.a(iS4);
                    fpkVarA2 = defpackage.fpk.a(iS5);
                    if (fIntBitsToFloat > 0.0f) {
                        fplVar = new defpackage.fpl(fIntBitsToFloat, fpkVarA, fpkVarA2);
                    } else {
                        fplVar = new defpackage.fpl(fIntBitsToFloat, fpkVarA, fpkVarA2);
                    }
                    etxVar2.R(2);
                    int iP2 = etxVar2.p();
                    i9 = iP2 >> 12;
                    i8 = iP2 & 4095;
                } else {
                    fplVar = null;
                    i8 = -1;
                    i9 = -1;
                }
                j = iQ;
                flvVar = new defpackage.flv(flvVar5);
                flsVar = this.e;
                if (!flsVar.a()) {
                    flsVar.a = i9;
                    flsVar.b = i8;
                }
                if (fplVar != null) {
                    z = false;
                    j2 = -9223372036854775807L;
                    eqyVar = new defpackage.eqy(-9223372036854775807L, fplVar);
                } else {
                    j2 = -9223372036854775807L;
                    z = false;
                    eqyVar = null;
                }
                this.l = eqyVar;
                j3 = flcVar2.b;
                flcVar2.p(flvVar5.c, z);
                if (i6 == 1483304551) {
                    j8 = flcVar2.a;
                    jR2 = defpackage.fsu.r(flvVar, j, i9, i8);
                    if (jR2 != j2) {
                        if (jW != -1) {
                            if (j8 != -1) {
                                jMin = jW;
                            } else {
                                jMin = jW;
                            }
                            j9 = jMin;
                        } else {
                            j9 = -1;
                        }
                        fpgVar = new defpackage.fpo(j3, flvVar.c, jR2, j9, jArr);
                    }
                } else {
                    j5 = flcVar2.a;
                    jR = defpackage.fsu.r(flvVar, j, i9, i8);
                    if (jR != -9223372036854775807L) {
                        if (j4 != -1) {
                            j4 = jW;
                            j5 = j3 + j4;
                            j6 = j4 - ((long) flvVar.c);
                        } else if (j5 != -1) {
                            j4 = jW;
                            j6 = (j5 - j3) - ((long) flvVar.c);
                        }
                        j7 = j5;
                        iS = defpackage.fsu.s(j6, jR);
                        if (iS != -2147483647) {
                            fpgVar = new defpackage.fpg(j7, j3 + ((long) flvVar.c), iS, aiql.P(aiql.ag(j6, j, java.math.RoundingMode.HALF_UP)), false, true, jR);
                        }
                    }
                }
            }
            j4 = jW;
            j4 = jW;
            fpgVar = null;
        } else {
            long j14 = flcVar2.a;
            long j15 = flcVar2.b;
            etxVar2.R(6);
            int i13 = etxVar2.i();
            long j16 = j15 + ((long) flvVar5.c);
            long j17 = i13;
            int i14 = etxVar2.i();
            if (i14 <= 0) {
                fpgVar = null;
                break;
            }
            long jY = eum.y((((long) i14) * ((long) flvVar5.g)) - 1, flvVar5.d);
            int iS6 = etxVar2.s();
            int iS7 = etxVar2.s();
            int iS8 = etxVar2.s();
            etxVar2.R(2);
            long j18 = j15 + ((long) flvVar5.c);
            long[] jArr5 = new long[iS6];
            long[] jArr6 = new long[iS6];
            int i15 = 0;
            while (true) {
                long[] jArr7 = jArr5;
                long[] jArr8 = jArr6;
                if (i15 >= iS6) {
                    long jMax = j16 + j17;
                    if (j14 != -1 && j14 != jMax) {
                        defpackage.etr.f("VbriSeeker", "VBRI data size mismatch: " + j14 + ", " + jMax);
                    }
                    if (jMax != j18) {
                        defpackage.etr.f("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + jMax + ", " + j18 + "\nSeeking will be inaccurate.");
                        jMax = java.lang.Math.max(jMax, j18);
                    }
                    fpgVar = new defpackage.fpn(jArr7, jArr8, jY, j16, jMax);
                    break;
                }
                jArr7[i15] = (((long) i15) * jY) / ((long) iS6);
                jArr8[i15] = j18;
                if (iS8 == 1) {
                    iN = etxVar2.n();
                } else if (iS8 == 2) {
                    iN = etxVar2.s();
                } else if (iS8 == 3) {
                    iN = etxVar2.p();
                } else {
                    if (iS8 != 4) {
                        fpgVar = null;
                        break;
                    }
                    iN = etxVar2.q();
                }
                j18 += ((long) iN) * ((long) iS7);
                i15++;
                jArr5 = jArr7;
                jArr6 = jArr8;
                iS8 = iS8;
            }
            flcVar2.p(flvVar5.c, false);
        }
        defpackage.eqy eqyVar2 = this.k;
        long j19 = flcVar2.b;
        if (eqyVar2 == null || (fomVar = (defpackage.fom) eqyVar2.c(defpackage.fom.class, defpackage.ahyr.a)) == null) {
            fpmVarJ = null;
        } else {
            defpackage.foo fooVar = (defpackage.foo) eqyVar2.c(defpackage.foo.class, new defpackage.evz(4));
            if (fooVar == null) {
                jW2 = -9223372036854775807L;
                c = 0;
            } else {
                c = 0;
                jW2 = eum.w(java.lang.Long.parseLong((java.lang.String) fooVar.b.get(0)));
            }
            int[] iArr = fomVar.d;
            int length = iArr.length;
            int i16 = length + 1;
            long[] jArr9 = new long[i16];
            long[] jArr10 = new long[i16];
            jArr9[c] = j19;
            jArr10[c] = 0;
            long j20 = j19;
            long j21 = 0;
            int i17 = 1;
            while (i17 <= length) {
                int i18 = i17 - 1;
                int i19 = i17;
                j20 += (long) (fomVar.b + iArr[i18]);
                j21 += (long) (fomVar.c + fomVar.e[i18]);
                jArr9[i19] = j20;
                jArr10[i19] = j21;
                i17 = i19 + 1;
                iArr = iArr;
            }
            fpmVarJ = new defpackage.fpi(jArr9, jArr10, jW2);
        }
        if (this.a) {
            fpmVarJ = new defpackage.flz(-9223372036854775807L, 0L);
        } else {
            if (fpmVarJ == null) {
                if (fpgVar == null) {
                    fpgVar = j(flkVar);
                }
                fpmVarJ = fpgVar;
            }
            if (!(fpmVarJ instanceof defpackage.fpg) && !fpmVarJ.d() && this.b != 0) {
                long jA = fpmVarJ.a();
                long jF = fpmVarJ.f() != -1 ? fpmVarJ.f() : flcVar2.a;
                if (jA == -9223372036854775807L || jF == -1) {
                    fpmVarJ = j(flkVar);
                } else {
                    long jG = fpmVarJ.g() != -1 ? fpmVarJ.g() : 0L;
                    int iS9 = defpackage.fsu.s(jF - jG, jA);
                    fpmVarJ = iS9 == -2147483647 ? j(flkVar) : new defpackage.fpg(jF, jG, iS9, -1, false, true, jA);
                }
            }
        }
        this.r = fpmVarJ;
        defpackage.fmk fmkVar3 = this.h;
        fpmVarJ.a();
        fmkVar3.z();
        this.g.y(this.r);
        defpackage.eqy eqyVarE = this.k;
        defpackage.eqy eqyVar3 = this.l;
        if (eqyVarE == null) {
            eqyVarE = eqyVar3;
        } else if (eqyVar3 != null) {
            eqyVarE = eqyVarE.e(eqyVar3);
        }
        defpackage.eqf eqfVar = new defpackage.eqf();
        eqfVar.a("audio/mpeg");
        eqfVar.c(flvVar5.b);
        eqfVar.o = 4096;
        eqfVar.F = flvVar5.e;
        eqfVar.H = flvVar5.d;
        defpackage.fls flsVar2 = this.e;
        eqfVar.J = flsVar2.a;
        eqfVar.K = flsVar2.b;
        eqfVar.k = eqyVarE;
        if (this.r.e() != -2147483647) {
            eqfVar.h = this.r.e();
        }
        this.i.p(new defpackage.eqg(eqfVar));
        this.o = flcVar2.b;
        i = 0;
        i2 = this.q;
        if (i2 == 0) {
            iA = this.i.a(flkVar, i2, true);
            i3 = -1;
            if (iA != -1) {
                i4 = this.q - iA;
                this.q = i4;
                if (i4 <= 0) {
                    defpackage.fmk fmkVar4 = this.i;
                    long jI3 = i(this.n);
                    defpackage.flv flvVar6 = this.d;
                    fmkVar4.d(jI3, 1, flvVar6.c, 0, null);
                    this.n += (long) flvVar6.g;
                    i3 = 0;
                    this.q = 0;
                }
            }
            return i3;
        }
        flkVar.k();
        if (m(flkVar)) {
            return -1;
        }
        defpackage.etx etxVar3 = this.c;
        etxVar3.Q(i);
        i5 = etxVar3.i();
        if (!l(i5, this.j)) {
        }
        ((defpackage.flc) flkVar).p(1, false);
        this.j = 0;
        return 0;
    }

    private final long i(long j) {
        return this.m + ((j * 1000000) / ((long) this.d.d));
    }

    private final defpackage.fpm j(defpackage.flk flkVar) {
        defpackage.etx etxVar = this.c;
        defpackage.flc flcVar = (defpackage.flc) flkVar;
        flcVar.n(etxVar.b, 0, 4, false);
        etxVar.Q(0);
        defpackage.flv flvVar = this.d;
        flvVar.a(etxVar.i());
        return new defpackage.fpg(flcVar.a, flcVar.b, flvVar.f, flvVar.c, false, true, -9223372036854775807L);
    }

    private final void k() {
        defpackage.fpm fpmVar = this.r;
        if ((fpmVar instanceof defpackage.fpg) && fpmVar.d()) {
            long j = this.p;
            if (j == -1 || j == this.r.f()) {
                return;
            }
            defpackage.fpg fpgVar = (defpackage.fpg) this.r;
            this.r = new defpackage.fpg(this.p, fpgVar.a, fpgVar.c, fpgVar.b, fpgVar.e, false, fpgVar.f);
            defpackage.fll fllVar = this.g;
            ahvr.ci(fllVar);
            fllVar.y(this.r);
            ahvr.ci(this.h);
            this.r.a();
        }
    }

    private static boolean l(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean m(defpackage.flk flkVar) {
        defpackage.fpm fpmVar = this.r;
        if (fpmVar != null) {
            long jF = fpmVar.f();
            if (jF != -1 && flkVar.e() > jF - 4) {
                return true;
            }
        }
        try {
            return !flkVar.n(this.c.b, 0, 4, true);
        } catch (java.io.EOFException unused) {
            return true;
        }
    }

    private final boolean n(defpackage.flk flkVar, boolean z) throws java.io.EOFException {
        int iE;
        int i;
        int iA;
        flkVar.k();
        defpackage.flc flcVar = (defpackage.flc) flkVar;
        if (flcVar.b == 0) {
            defpackage.eqy eqyVarS = this.s.S(flkVar, null, 131072);
            this.k = eqyVarS;
            if (eqyVarS != null) {
                this.e.b(eqyVarS);
            }
            iE = (int) flkVar.e();
            if (!z) {
                flcVar.p(iE, false);
            }
            i = 0;
        } else {
            iE = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (m(flkVar)) {
                if (i2 > 0) {
                    break;
                }
                k();
                throw new java.io.EOFException();
            }
            defpackage.etx etxVar = this.c;
            etxVar.Q(0);
            int i4 = etxVar.i();
            if ((i == 0 || l(i4, i)) && (iA = defpackage.flw.a(i4)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.d.a(i4);
                    i = i4;
                }
                flcVar.m(iA - 4, false);
            } else {
                int i5 = i3 + 1;
                if (i3 == 131072) {
                    if (z) {
                        return false;
                    }
                    k();
                    throw new java.io.EOFException();
                }
                if (z) {
                    flkVar.k();
                    flcVar.m(iE + i5, false);
                } else {
                    flcVar.p(1, false);
                }
                i2 = 0;
                i3 = i5;
                i = 0;
            }
        }
        if (z) {
            flcVar.p(iE + i3, false);
        } else {
            flkVar.k();
        }
        this.j = i;
        return true;
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        this.g = fllVar;
        defpackage.fmk fmkVarR = fllVar.r(0, 1);
        this.h = fmkVarR;
        this.i = fmkVarR;
        this.g.s();
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        this.j = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.q = 0;
        this.p = -1L;
        defpackage.fpm fpmVar = this.r;
        if (fpmVar instanceof defpackage.fph) {
            throw null;
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        return n(flkVar, true);
    }

    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) throws java.lang.Throwable {
        ahvr.ci(this.h);
        java.lang.String str = eum.a;
        int iH = h(flkVar);
        if (iH == -1 && (this.r instanceof defpackage.fph)) {
            long j = this.n - 1;
            long jI = -9223372036854775807L;
            if (j >= 0) {
                defpackage.fls flsVar = this.e;
                if (flsVar.a()) {
                    j = (j - ((long) flsVar.a)) - ((long) flsVar.b);
                }
                if (j >= 0) {
                    jI = i(j);
                }
            }
            if (this.r.a() != jI) {
                throw null;
            }
        }
        return iH;
    }

    @Override // defpackage.flj
    public final void c() {
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }

    public fpj() {
        throw null;
    }
}
