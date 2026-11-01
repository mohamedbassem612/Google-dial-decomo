package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fuz implements defpackage.flj {
    public final java.util.List a;
    public final android.util.SparseArray b;
    public final android.util.SparseBooleanArray c;
    public final android.util.SparseBooleanArray d;
    public defpackage.fll e;
    public int f;
    public boolean g;
    public int h;
    public final defpackage.vk i;
    private final int j;
    private final defpackage.etx k = new defpackage.etx(new byte[9400], 0);
    private final android.util.SparseIntArray l;
    private final defpackage.frr m;
    private final defpackage.fuw n;
    private boolean o;
    private boolean p;
    private int q;
    private defpackage.fkz r;

    public fuz(int i, defpackage.frr frrVar, defpackage.euk eukVar, defpackage.vk vkVar) {
        this.i = vkVar;
        this.j = i;
        this.m = frrVar;
        this.a = java.util.Collections.singletonList(eukVar);
        android.util.SparseBooleanArray sparseBooleanArray = new android.util.SparseBooleanArray();
        this.c = sparseBooleanArray;
        this.d = new android.util.SparseBooleanArray();
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.b = sparseArray;
        this.l = new android.util.SparseIntArray();
        this.n = new defpackage.fuw();
        this.e = defpackage.fll.w;
        this.h = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        android.util.SparseArray sparseArray2 = new android.util.SparseArray();
        int size = sparseArray2.size();
        int i2 = 0;
        while (true) {
            android.util.SparseArray sparseArray3 = this.b;
            if (i2 >= size) {
                sparseArray3.put(0, new defpackage.fut(new defpackage.fux(this)));
                return;
            } else {
                sparseArray3.put(sparseArray2.keyAt(i2), (defpackage.fvc) sparseArray2.valueAt(i2));
                i2++;
            }
        }
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        if (this.j == 0) {
            fllVar = new defpackage.fru(fllVar, this.m);
        }
        this.e = fllVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // defpackage.flj
    public final void d(long j, long j2) {
        defpackage.fkz fkzVar;
        java.util.List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.euk eukVar = (defpackage.euk) list.get(i);
            if (eukVar.f() != -9223372036854775807L) {
                long jD = eukVar.d();
                if (jD != -9223372036854775807L && jD != 0 && jD != j2) {
                    eukVar.i(j2);
                }
            } else {
                eukVar.i(j2);
            }
        }
        if (j2 != 0 && (fkzVar = this.r) != null) {
            fkzVar.a(j2);
        }
        this.k.M(0);
        this.l.clear();
        int i2 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.b;
            if (i2 >= sparseArray.size()) {
                this.q = 0;
                return;
            } else {
                ((defpackage.fvc) sparseArray.valueAt(i2)).c();
                i2++;
            }
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        byte[] bArr = this.k.b;
        defpackage.flc flcVar = (defpackage.flc) flkVar;
        flcVar.n(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    flcVar.p(i, false);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:102:0x01bc A[PHI: r7
      0x01bc: PHI (r7v6 int) = (r7v5 int), (r7v7 int) binds: [B:101:0x01ba, B:99:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x01c7 A[LOOP:3: B:86:0x0188->B:104:0x01c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:119:0x0200  */
    /* JADX WARN: Code duplicated, block: B:122:0x020b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0214  */
    /* JADX WARN: Code duplicated, block: B:125:0x0217  */
    /* JADX WARN: Code duplicated, block: B:126:0x021b  */
    /* JADX WARN: Code duplicated, block: B:128:0x022a  */
    /* JADX WARN: Code duplicated, block: B:129:0x022e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0236  */
    /* JADX WARN: Code duplicated, block: B:133:0x023b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0247  */
    /* JADX WARN: Code duplicated, block: B:136:0x0249  */
    /* JADX WARN: Code duplicated, block: B:140:0x0253  */
    /* JADX WARN: Code duplicated, block: B:143:0x025d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0269  */
    /* JADX WARN: Code duplicated, block: B:164:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x00ee A[EDGE_INSN: B:167:0x00ee->B:59:0x00ee BREAK  A[LOOP:4: B:91:0x019a->B:103:0x01c4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0179  */
    /* JADX WARN: Code duplicated, block: B:84:0x017f  */
    /* JADX WARN: Code duplicated, block: B:88:0x018f  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b7  */
    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) {
        defpackage.etx etxVar;
        byte[] bArr;
        int i;
        int i2;
        int iAc;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        defpackage.fvc fvcVar;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        int i13;
        int iA;
        int i14;
        android.util.SparseArray sparseArray;
        defpackage.fvc fvcVar2;
        defpackage.fuo fuoVar;
        int i15;
        int i16;
        int iD;
        long j;
        long jAd;
        long j2;
        boolean z2 = this.g;
        defpackage.flc flcVar = (defpackage.flc) flkVar;
        long j3 = flcVar.a;
        int i17 = 0;
        if (z2) {
            if (j3 != -1) {
                defpackage.fuw fuwVar = this.n;
                if (!fuwVar.c) {
                    int i18 = this.h;
                    if (i18 <= 0) {
                        fuwVar.a(flkVar);
                    } else if (!fuwVar.e) {
                        int iMin = (int) java.lang.Math.min(112800L, j3);
                        long j4 = j3 - ((long) iMin);
                        if (flcVar.b != j4) {
                            aesqVar.a = j4;
                            return 1;
                        }
                        defpackage.etx etxVar2 = fuwVar.b;
                        etxVar2.M(iMin);
                        flkVar.k();
                        flcVar.n(etxVar2.b, 0, iMin, false);
                        int i19 = etxVar2.c;
                        int i20 = etxVar2.d;
                        int i21 = i20 - 188;
                        while (true) {
                            if (i21 < i19) {
                                j2 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr2 = etxVar2.b;
                            int i22 = 0;
                            for (int i23 = -4; i23 <= 4; i23++) {
                                int i24 = (i23 * 188) + i21;
                                if (i24 >= i19 && i24 < i20 && bArr2[i24] == 71) {
                                    i22++;
                                    if (i22 == 5) {
                                        long jAd2 = defpackage.hgt.ad(etxVar2, i21, i18);
                                        if (jAd2 == -9223372036854775807L) {
                                            break;
                                        }
                                        j2 = jAd2;
                                        break;
                                    }
                                } else {
                                    i22 = 0;
                                }
                            }
                            i21--;
                        }
                        fuwVar.g = j2;
                        fuwVar.e = true;
                    } else if (fuwVar.g == -9223372036854775807L) {
                        fuwVar.a(flkVar);
                    } else if (fuwVar.d) {
                        long j5 = fuwVar.f;
                        if (j5 == -9223372036854775807L) {
                            fuwVar.a(flkVar);
                        } else {
                            defpackage.euk eukVar = fuwVar.a;
                            fuwVar.h = eukVar.c(fuwVar.g) - eukVar.b(j5);
                            fuwVar.a(flkVar);
                        }
                    } else {
                        int iMin2 = (int) java.lang.Math.min(112800L, j3);
                        if (flcVar.b != 0) {
                            aesqVar.a = 0L;
                            return 1;
                        }
                        defpackage.etx etxVar3 = fuwVar.b;
                        etxVar3.M(iMin2);
                        flkVar.k();
                        flcVar.n(etxVar3.b, 0, iMin2, false);
                        int i25 = etxVar3.c;
                        int i26 = etxVar3.d;
                        while (true) {
                            if (i25 >= i26) {
                                jAd = -9223372036854775807L;
                                break;
                            }
                            if (etxVar3.b[i25] == 71) {
                                jAd = defpackage.hgt.ad(etxVar3, i25, i18);
                                if (jAd != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i25++;
                        }
                        fuwVar.f = jAd;
                        fuwVar.d = true;
                    }
                }
            }
            if (this.o) {
                j = 0;
            } else {
                this.o = true;
                defpackage.fuw fuwVar2 = this.n;
                long j6 = fuwVar2.h;
                if (j6 != -9223372036854775807L) {
                    defpackage.euk eukVar2 = fuwVar2.a;
                    j = 0;
                    defpackage.fkz fkzVar = new defpackage.fkz(new defpackage.fku(), new defpackage.fuv(this.h, eukVar2), j6, j6 + 1, 0L, j3, 188L, 940);
                    this.r = fkzVar;
                    this.e.y(fkzVar.a);
                } else {
                    j = 0;
                    this.e.y(new defpackage.flz(-9223372036854775807L, 0L));
                }
            }
            if (this.p) {
                this.p = false;
                d(j, j);
                if (flcVar.b != j) {
                    aesqVar.a = j;
                    return 1;
                }
            }
            defpackage.fkz fkzVar2 = this.r;
            if (fkzVar2 != null && fkzVar2.b()) {
                return fkzVar2.f(flkVar, aesqVar);
            }
            etxVar = this.k;
            bArr = etxVar.b;
            if (9400 - etxVar.c < 188) {
                iD = etxVar.d();
                if (iD > 0) {
                    java.lang.System.arraycopy(bArr, etxVar.c, bArr, 0, iD);
                }
                etxVar.O(bArr, iD);
            }
            while (true) {
                i17 = -1;
                if (etxVar.d() < 188) {
                    i = etxVar.c;
                    i2 = etxVar.d;
                    iAc = defpackage.hgt.ac(etxVar.b, i, i2);
                    etxVar.Q(iAc);
                    i3 = iAc + 188;
                    if (i3 > i2) {
                        this.q += iAc - i;
                    } else {
                        this.q = 0;
                    }
                    i4 = etxVar.d;
                    if (i3 <= i4) {
                        return 0;
                    }
                    i5 = etxVar.i();
                    if ((8388608 & i5) != 0) {
                        etxVar.Q(i3);
                        return 0;
                    }
                    if ((4194304 & i5) != 0) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    i7 = i5 & 32;
                    i8 = (i5 >> 8) & 8191;
                    if ((i5 & 16) != 0) {
                        fvcVar = (defpackage.fvc) this.b.get(i8);
                    } else {
                        fvcVar = null;
                    }
                    if (fvcVar == null) {
                        etxVar.Q(i3);
                        return 0;
                    }
                    i9 = i5 & 15;
                    android.util.SparseIntArray sparseIntArray = this.l;
                    i10 = sparseIntArray.get(i8, i9 - 1);
                    sparseIntArray.put(i8, i9);
                    if (i10 == i9) {
                        etxVar.Q(i3);
                        return 0;
                    }
                    if (i9 != ((i10 + 1) & 15)) {
                        fvcVar.c();
                    }
                    if (i7 != 0) {
                        int iN = etxVar.n();
                        if ((etxVar.n() & 64) != 0) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        i6 |= i12;
                        etxVar.R(iN - 1);
                    }
                    z = this.g;
                    if (!z) {
                        i11 = 0;
                        if (!this.d.get(i8, false)) {
                        }
                        if (!z) {
                            this.p = true;
                        }
                        etxVar.Q(i3);
                        return i11;
                    }
                    i11 = 0;
                    etxVar.P(i3);
                    fvcVar.a(etxVar, i6);
                    etxVar.P(i4);
                    if (!z) {
                        this.p = true;
                    }
                    etxVar.Q(i3);
                    return i11;
                }
                i13 = etxVar.d;
                iA = flkVar.a(bArr, i13, 9400 - i13);
                if (iA == -1) {
                    i14 = 0;
                    while (true) {
                        sparseArray = this.b;
                        if (i14 < sparseArray.size()) {
                            break;
                            break;
                        }
                        fvcVar2 = (defpackage.fvc) sparseArray.valueAt(i14);
                        if (!(fvcVar2 instanceof defpackage.fuo)) {
                            fuoVar = (defpackage.fuo) fvcVar2;
                            i15 = fuoVar.a;
                            if (i15 == 3) {
                                i16 = 1;
                                if (i15 == 1) {
                                    fuoVar.a(new defpackage.etx(), i16);
                                }
                            } else if (fuoVar.b == -1) {
                                i16 = 1;
                                fuoVar.a(new defpackage.etx(), i16);
                            }
                        }
                        i14++;
                    }
                } else {
                    etxVar.P(i13 + iA);
                }
            }
        } else {
            etxVar = this.k;
            bArr = etxVar.b;
            if (9400 - etxVar.c < 188) {
                iD = etxVar.d();
                if (iD > 0) {
                    java.lang.System.arraycopy(bArr, etxVar.c, bArr, 0, iD);
                }
                etxVar.O(bArr, iD);
            }
            while (true) {
                i17 = -1;
                if (etxVar.d() < 188) {
                    i = etxVar.c;
                    i2 = etxVar.d;
                    iAc = defpackage.hgt.ac(etxVar.b, i, i2);
                    etxVar.Q(iAc);
                    i3 = iAc + 188;
                    if (i3 > i2) {
                        this.q += iAc - i;
                    } else {
                        this.q = 0;
                    }
                    i4 = etxVar.d;
                    if (i3 <= i4) {
                        return 0;
                    }
                    i5 = etxVar.i();
                    if ((8388608 & i5) != 0) {
                        etxVar.Q(i3);
                        return 0;
                    }
                    if ((4194304 & i5) != 0) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    i7 = i5 & 32;
                    i8 = (i5 >> 8) & 8191;
                    if ((i5 & 16) != 0) {
                        fvcVar = (defpackage.fvc) this.b.get(i8);
                    } else {
                        fvcVar = null;
                    }
                    if (fvcVar == null) {
                        etxVar.Q(i3);
                        return 0;
                    }
                    i9 = i5 & 15;
                    android.util.SparseIntArray sparseIntArray2 = this.l;
                    i10 = sparseIntArray2.get(i8, i9 - 1);
                    sparseIntArray2.put(i8, i9);
                    if (i10 == i9) {
                        etxVar.Q(i3);
                        return 0;
                    }
                    if (i9 != ((i10 + 1) & 15)) {
                        fvcVar.c();
                    }
                    if (i7 != 0) {
                        int iN2 = etxVar.n();
                        if ((etxVar.n() & 64) != 0) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        i6 |= i12;
                        etxVar.R(iN2 - 1);
                    }
                    z = this.g;
                    if (!z) {
                        i11 = 0;
                        if (!this.d.get(i8, false)) {
                        }
                        if (!z && this.g && j3 != -1) {
                            this.p = true;
                        }
                        etxVar.Q(i3);
                        return i11;
                    }
                    i11 = 0;
                    etxVar.P(i3);
                    fvcVar.a(etxVar, i6);
                    etxVar.P(i4);
                    if (!z) {
                        this.p = true;
                    }
                    etxVar.Q(i3);
                    return i11;
                }
                i13 = etxVar.d;
                iA = flkVar.a(bArr, i13, 9400 - i13);
                if (iA == -1) {
                    i14 = 0;
                    while (true) {
                        sparseArray = this.b;
                        if (i14 < sparseArray.size()) {
                            break;
                        }
                        fvcVar2 = (defpackage.fvc) sparseArray.valueAt(i14);
                        if (!(fvcVar2 instanceof defpackage.fuo)) {
                            fuoVar = (defpackage.fuo) fvcVar2;
                            i15 = fuoVar.a;
                            if (i15 == 3) {
                                i16 = 1;
                                if (i15 == 1) {
                                    fuoVar.a(new defpackage.etx(), i16);
                                }
                            } else if (fuoVar.b == -1) {
                                i16 = 1;
                                fuoVar.a(new defpackage.etx(), i16);
                            }
                        }
                        i14++;
                    }
                } else {
                    etxVar.P(i13 + iA);
                }
            }
        }
        return i17;
    }

    @Override // defpackage.flj
    public final void c() {
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }
}
