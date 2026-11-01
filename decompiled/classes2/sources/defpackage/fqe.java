package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fqe implements defpackage.flj {
    private static final byte[] c = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final defpackage.eqg d;
    private long A;
    private defpackage.fqd B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private boolean G;
    private defpackage.fll H;
    private defpackage.fmk[] I;
    private boolean J;
    private boolean K;
    private long L;
    private long M;
    private final defpackage.oq N;
    private final ils O;
    public final int a;
    public defpackage.fmk[] b;
    private final defpackage.frr e;
    private final java.util.List f;
    private final android.util.SparseArray g;
    private final defpackage.etx h;
    private final defpackage.etx i;
    private final defpackage.etx j;
    private final byte[] k;
    private final defpackage.etx l;
    private final defpackage.etx m;
    private final java.util.ArrayDeque n;
    private final java.util.ArrayDeque o;
    private final defpackage.evi p;
    private aify q;
    private int r;
    private int s;
    private long t;
    private int u;
    private defpackage.etx v;
    private long w;
    private int x;
    private long y;
    private long z;

    static {
        defpackage.eqf eqfVar = new defpackage.eqf();
        eqfVar.c("application/x-emsg");
        d = new defpackage.eqg(eqfVar);
    }

    public fqe(defpackage.frr frrVar, int i) {
        aify aifyVar = aike.a;
        this.e = frrVar;
        this.a = i;
        this.f = j$.util.DesugarCollections.unmodifiableList(aifyVar);
        this.O = new ils();
        this.m = new defpackage.etx(16);
        this.h = new defpackage.etx(defpackage.evc.a);
        this.i = new defpackage.etx(6);
        this.j = new defpackage.etx();
        byte[] bArr = new byte[16];
        this.k = bArr;
        this.l = new defpackage.etx(bArr);
        this.n = new java.util.ArrayDeque();
        this.o = new java.util.ArrayDeque();
        this.g = new android.util.SparseArray();
        this.q = aifyVar;
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.H = defpackage.fll.w;
        this.I = new defpackage.fmk[0];
        this.b = new defpackage.fmk[0];
        this.p = new defpackage.evi(new defpackage.fuu(this, 1));
        this.N = new defpackage.oq((short[]) null);
        this.L = -1L;
        this.M = -1L;
    }

    private static android.util.Pair h(defpackage.etx etxVar, long j) throws defpackage.era {
        long jX;
        long jX2;
        etxVar.Q(8);
        int i = etxVar.i();
        int i2 = defpackage.fpz.a;
        etxVar.R(4);
        int i3 = (i >> 24) & 255;
        long jW = etxVar.w();
        if (i3 == 0) {
            jX = etxVar.w();
            jX2 = etxVar.w();
        } else {
            jX = etxVar.x();
            jX2 = etxVar.x();
        }
        long j2 = j + jX2;
        long jZ = eum.z(jX, 1000000L, jW);
        etxVar.R(2);
        int iS = etxVar.s();
        int[] iArr = new int[iS];
        long[] jArr = new long[iS];
        long[] jArr2 = new long[iS];
        long[] jArr3 = new long[iS];
        long j3 = j2;
        long jZ2 = jZ;
        int i4 = 0;
        while (i4 < iS) {
            int i5 = etxVar.i();
            if ((Integer.MIN_VALUE & i5) != 0) {
                throw new defpackage.era("Unhandled indirect reference", null, true, 1);
            }
            long jW2 = etxVar.w();
            iArr[i4] = i5 & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
            jArr[i4] = j3;
            jArr3[i4] = jZ2;
            jX += jW2;
            long[] jArr4 = jArr3;
            jZ2 = eum.z(jX, 1000000L, jW);
            jArr2[i4] = jZ2 - jArr4[i4];
            etxVar.R(4);
            j3 += (long) iArr[i4];
            i4++;
            jArr3 = jArr4;
        }
        return android.util.Pair.create(java.lang.Long.valueOf(jZ), new defpackage.fla(iArr, jArr, jArr2, jArr3));
    }

    private static androidx.media3.common.DrmInitData i(java.util.List list) {
        int size = list.size();
        java.util.ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            defpackage.eut eutVar = (defpackage.eut) list.get(i);
            if (eutVar.d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                byte[] bArr = eutVar.a.b;
                alic alicVarT = defpackage.fsu.t(bArr);
                java.lang.Object obj = alicVarT == null ? null : alicVarT.b;
                if (obj == null) {
                    defpackage.etr.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new androidx.media3.common.DrmInitData.SchemeData((java.util.UUID) obj, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList != null) {
            return new androidx.media3.common.DrmInitData(null, false, (androidx.media3.common.DrmInitData.SchemeData[]) arrayList.toArray(new androidx.media3.common.DrmInitData.SchemeData[0]));
        }
        return null;
    }

    private final void j() {
        this.r = 0;
        this.u = 0;
    }

    private static void k(defpackage.etx etxVar, int i, defpackage.fqp fqpVar) throws defpackage.era {
        etxVar.Q(i + 8);
        int i2 = etxVar.i();
        int i3 = defpackage.fpz.a;
        if ((i2 & 1) != 0) {
            throw new defpackage.era("Overriding TrackEncryptionBox parameters is unsupported.", null, false, 1);
        }
        boolean z = (i2 & 2) != 0;
        int iQ = etxVar.q();
        if (iQ == 0) {
            java.util.Arrays.fill(fqpVar.l, 0, fqpVar.e, false);
            return;
        }
        int i4 = fqpVar.e;
        if (iQ != i4) {
            throw new defpackage.era(a.bf(i4, iQ, "Senc sample count ", " is different from fragment sample count"), null, true, 1);
        }
        java.util.Arrays.fill(fqpVar.l, 0, iQ, z);
        fqpVar.b(etxVar.d());
        defpackage.etx etxVar2 = fqpVar.n;
        etxVar.L(etxVar2.b, 0, etxVar2.d);
        etxVar2.Q(0);
        fqpVar.o = false;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0431  */
    /* JADX WARN: Code duplicated, block: B:161:0x0446 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x0448  */
    /* JADX WARN: Code duplicated, block: B:163:0x0451  */
    /* JADX WARN: Code duplicated, block: B:166:0x045a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0465  */
    /* JADX WARN: Code duplicated, block: B:170:0x046e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0473  */
    /* JADX WARN: Code duplicated, block: B:172:0x0475 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x0477  */
    /* JADX WARN: Code duplicated, block: B:174:0x047c  */
    /* JADX WARN: Code duplicated, block: B:175:0x047e A[PHI: r32
      0x047e: PHI (r32v3 int) = (r5v69 int), (r32v4 int) binds: [B:171:0x0473, B:174:0x047c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:177:0x0482  */
    /* JADX WARN: Code duplicated, block: B:179:0x048d  */
    /* JADX WARN: Code duplicated, block: B:182:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:183:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:186:0x04c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x04c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:189:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:190:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x0168  */
    private final void l(long j) throws defpackage.era {
        defpackage.eqy eqyVar;
        char c2;
        long j2;
        defpackage.eqy eqyVar2;
        int i;
        java.util.List list;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        int i8;
        boolean z;
        int i9;
        defpackage.fqd fqdVar;
        defpackage.fqd fqdVar2;
        int i10;
        int i11;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z2;
        int i12;
        long j3;
        long j4;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long jZ;
        defpackage.fqd fqdVar3;
        boolean z3;
        defpackage.aizi aiziVar;
        int i18;
        while (true) {
            java.util.ArrayDeque arrayDeque = this.n;
            if (arrayDeque.isEmpty() || ((defpackage.eus) arrayDeque.peek()).a != j) {
                break;
            }
            defpackage.eus eusVar = (defpackage.eus) arrayDeque.pop();
            int i19 = eusVar.d;
            int i20 = 12;
            int i21 = 8;
            char c3 = 1;
            if (i19 == 1836019574) {
                androidx.media3.common.DrmInitData drmInitDataI = i(eusVar.b);
                defpackage.eus eusVarA = eusVar.a(1836475768);
                ahvr.ci(eusVarA);
                android.util.SparseArray sparseArray = new android.util.SparseArray();
                java.util.List list2 = eusVarA.b;
                int size = list2.size();
                int i22 = 0;
                long jW = -9223372036854775807L;
                while (i22 < size) {
                    defpackage.eut eutVar = (defpackage.eut) list2.get(i22);
                    int i23 = eutVar.d;
                    if (i23 == 1953654136) {
                        defpackage.etx etxVar = eutVar.a;
                        etxVar.Q(i20);
                        android.util.Pair pairCreate = android.util.Pair.create(java.lang.Integer.valueOf(etxVar.i()), new defpackage.fqa(etxVar.i() - 1, etxVar.i(), etxVar.i(), etxVar.i()));
                        sparseArray.put(((java.lang.Integer) pairCreate.first).intValue(), (defpackage.fqa) pairCreate.second);
                    } else if (i23 == 1835362404) {
                        defpackage.etx etxVar2 = eutVar.a;
                        etxVar2.Q(8);
                        int i24 = etxVar2.i();
                        int i25 = defpackage.fpz.a;
                        jW = ((i24 >> 24) & 255) == 0 ? etxVar2.w() : etxVar2.x();
                    }
                    i22++;
                    i20 = 12;
                }
                defpackage.eus eusVarA2 = eusVar.a(1835365473);
                defpackage.eqy eqyVarB = eusVarA2 != null ? defpackage.fpz.b(eusVarA2) : null;
                defpackage.fls flsVar = new defpackage.fls();
                defpackage.eut eutVarB = eusVar.b(1969517665);
                if (eutVarB != null) {
                    defpackage.eqy eqyVarI = defpackage.fpz.i(eutVarB);
                    flsVar.b(eqyVarI);
                    eqyVar = eqyVarI;
                } else {
                    eqyVar = null;
                }
                defpackage.eut eutVarB2 = eusVar.b(1836476516);
                ahvr.ci(eutVarB2);
                defpackage.eqy eqyVar3 = new defpackage.eqy(-9223372036854775807L, defpackage.fpz.c(eutVarB2.a));
                long j5 = jW;
                java.util.List listH = defpackage.fpz.h(eusVar, flsVar, j5, drmInitDataI, (this.a & 16) != 0, false, new defpackage.etw(5));
                int size2 = listH.size();
                android.util.SparseArray sparseArray2 = this.g;
                if (sparseArray2.size() == 0) {
                    java.lang.String strK = defpackage.fsu.k(listH);
                    int i26 = 0;
                    while (i26 < size2) {
                        defpackage.fqq fqqVar = (defpackage.fqq) listH.get(i26);
                        defpackage.fqn fqnVar = fqqVar.a;
                        if (fqnVar.m) {
                            defpackage.fll fllVar = this.H;
                            c2 = c3;
                            int i27 = fqnVar.b;
                            defpackage.fmk fmkVarR = fllVar.r(i26, i27);
                            if (j5 == -9223372036854775807L && fqnVar.i == null) {
                                j2 = fqnVar.f;
                                if (j2 == -9223372036854775807L) {
                                    j2 = fqnVar.e;
                                }
                            } else {
                                j2 = fqnVar.e;
                            }
                            fmkVarR.z();
                            defpackage.eqg eqgVar = fqnVar.g;
                            eqyVar2 = eqyVar3;
                            defpackage.eqf eqfVar = new defpackage.eqf(eqgVar);
                            eqfVar.a(strK);
                            defpackage.fsu.p(i27, flsVar, eqfVar);
                            defpackage.eqy[] eqyVarArr = new defpackage.eqy[2];
                            eqyVarArr[0] = eqyVar;
                            eqyVarArr[c2] = eqyVar2;
                            defpackage.fsu.q(i27, eqyVarB, eqfVar, eqgVar.l, eqyVarArr);
                            int i28 = fqnVar.a;
                            sparseArray2.put(i28, new defpackage.fqd(fmkVarR, fqqVar, n(sparseArray, i28), new defpackage.eqg(eqfVar)));
                            this.z = java.lang.Math.max(this.z, j2);
                        } else {
                            eqyVar2 = eqyVar3;
                            c2 = c3;
                        }
                        i26++;
                        c3 = c2;
                        flsVar = flsVar;
                        eqyVar3 = eqyVar2;
                        j5 = j5;
                        strK = strK;
                    }
                    this.H.s();
                } else {
                    int i29 = 0;
                    for (int i30 = 0; i30 < size2; i30++) {
                        if (((defpackage.fqq) listH.get(i30)).a.m) {
                            i29++;
                        }
                    }
                    ahvr.bY(sparseArray2.size() == i29);
                    for (int i31 = 0; i31 < size2; i31++) {
                        defpackage.fqq fqqVar2 = (defpackage.fqq) listH.get(i31);
                        defpackage.fqn fqnVar2 = fqqVar2.a;
                        if (fqnVar2.m) {
                            int i32 = fqnVar2.a;
                            ((defpackage.fqd) sparseArray2.get(i32)).e(fqqVar2, n(sparseArray, i32));
                        }
                    }
                }
            } else {
                boolean z4 = true;
                int i33 = 16;
                int i34 = 0;
                if (i19 == 1836019558) {
                    android.util.SparseArray sparseArray3 = this.g;
                    int i35 = this.a;
                    byte[] bArr2 = this.k;
                    java.util.List list3 = eusVar.c;
                    int size3 = list3.size();
                    int i36 = 0;
                    while (i36 < size3) {
                        defpackage.eus eusVar2 = (defpackage.eus) list3.get(i36);
                        if (eusVar2.d == 1953653094) {
                            defpackage.eut eutVarB3 = eusVar2.b(1952868452);
                            ahvr.ci(eutVarB3);
                            defpackage.etx etxVar3 = eutVarB3.a;
                            etxVar3.Q(i21);
                            int i37 = etxVar3.i();
                            int i38 = defpackage.fpz.a;
                            defpackage.fqd fqdVar4 = (defpackage.fqd) sparseArray3.get(etxVar3.i());
                            if (fqdVar4 == null) {
                                fqdVar4 = null;
                            } else {
                                if ((i37 & 1) != 0) {
                                    long jX = etxVar3.x();
                                    defpackage.fqp fqpVar = fqdVar4.b;
                                    fqpVar.b = jX;
                                    fqpVar.c = jX;
                                }
                                defpackage.fqa fqaVar = fqdVar4.e;
                                fqdVar4.b.a = new defpackage.fqa((i37 & 2) != 0 ? etxVar3.i() - 1 : fqaVar.a, (i37 & 8) != 0 ? etxVar3.i() : fqaVar.b, (i37 & 16) != 0 ? etxVar3.i() : fqaVar.c, (i37 & 32) != 0 ? etxVar3.i() : fqaVar.d);
                            }
                            if (fqdVar4 == null) {
                                i = i35;
                                list = list3;
                                i2 = size3;
                                i4 = i36;
                                i5 = i33;
                                i6 = i34;
                                i3 = 8;
                            } else {
                                defpackage.fqp fqpVar2 = fqdVar4.b;
                                long j6 = fqpVar2.p;
                                boolean z5 = fqpVar2.q;
                                fqdVar4.f();
                                fqdVar4.l = z4;
                                defpackage.eut eutVarB4 = eusVar2.b(1952867444);
                                if (eutVarB4 == null || (i35 & 2) != 0) {
                                    fqpVar2.p = j6;
                                    fqpVar2.q = z5;
                                } else {
                                    defpackage.etx etxVar4 = eutVarB4.a;
                                    etxVar4.Q(8);
                                    fqpVar2.p = ((etxVar4.i() >> 24) & 255) == 1 ? etxVar4.v() : etxVar4.w();
                                    fqpVar2.q = true;
                                }
                                java.util.List list4 = eusVar2.b;
                                int size4 = list4.size();
                                i = i35;
                                int i39 = i34;
                                int i40 = i39;
                                int i41 = i40;
                                while (true) {
                                    i7 = 1953658222;
                                    if (i39 >= size4) {
                                        break;
                                    }
                                    java.util.List list5 = list3;
                                    defpackage.eut eutVar2 = (defpackage.eut) list4.get(i39);
                                    int i42 = size3;
                                    if (eutVar2.d == 1953658222) {
                                        defpackage.etx etxVar5 = eutVar2.a;
                                        etxVar5.Q(12);
                                        int iQ = etxVar5.q();
                                        if (iQ > 0) {
                                            i41 += iQ;
                                            i40++;
                                        }
                                    }
                                    i39++;
                                    size3 = i42;
                                    list3 = list5;
                                }
                                list = list3;
                                i2 = size3;
                                int i43 = i34;
                                fqdVar4.h = i43;
                                fqdVar4.g = i43;
                                fqdVar4.f = i43;
                                fqpVar2.d = i40;
                                fqpVar2.e = i41;
                                if (fqpVar2.g.length < i40) {
                                    fqpVar2.f = new long[i40];
                                    fqpVar2.g = new int[i40];
                                }
                                if (fqpVar2.h.length < i41) {
                                    int i44 = (i41 * 125) / 100;
                                    fqpVar2.h = new int[i44];
                                    fqpVar2.i = new long[i44];
                                    fqpVar2.j = new boolean[i44];
                                    fqpVar2.l = new boolean[i44];
                                }
                                int i45 = 0;
                                int i46 = 0;
                                int i47 = 0;
                                while (i45 < size4) {
                                    long jA = 0;
                                    defpackage.eut eutVar3 = (defpackage.eut) list4.get(i45);
                                    if (eutVar3.d == i7) {
                                        int i48 = i46 + 1;
                                        defpackage.etx etxVar6 = eutVar3.a;
                                        etxVar6.Q(8);
                                        int i49 = etxVar6.i();
                                        defpackage.fqn fqnVar3 = fqdVar4.d.a;
                                        int i50 = i46;
                                        defpackage.fqa fqaVar2 = fqpVar2.a;
                                        java.lang.String str = eum.a;
                                        fqpVar2.g[i50] = etxVar6.q();
                                        long[] jArr2 = fqpVar2.f;
                                        int i51 = i47;
                                        long j7 = fqpVar2.b;
                                        jArr2[i50] = j7;
                                        if ((i49 & 1) != 0) {
                                            jArr2[i50] = j7 + ((long) etxVar6.i());
                                        }
                                        boolean z6 = (i49 & 4) != 0;
                                        int i52 = fqaVar2.d;
                                        int i53 = z6 ? etxVar6.i() : i52;
                                        boolean z7 = z6;
                                        int i54 = i49 & 256;
                                        int i55 = i49 & 512;
                                        int i56 = i49 & 1024;
                                        int i57 = i49 & 2048;
                                        defpackage.aizi aiziVar2 = fqnVar3.i;
                                        if (aiziVar2 != null) {
                                            i9 = size4;
                                            if (aiziVar2.b == 1 && (aiziVar = fqnVar3.j) != null) {
                                                if (aiziVar2.a(0) == 0) {
                                                    fqdVar2 = fqdVar4;
                                                    i10 = i52;
                                                    i11 = i53;
                                                } else {
                                                    long jA2 = aiziVar2.a(0);
                                                    i10 = i52;
                                                    i11 = i53;
                                                    fqdVar2 = fqdVar4;
                                                    i18 = eum.z(jA2, 1000000L, fqnVar3.d) + eum.z(aiziVar.a(0), 1000000L, fqnVar3.c) >= fqnVar3.e ? 0 : 0;
                                                }
                                                jA = aiziVar.a(i18);
                                            }
                                            iArr = fqpVar2.h;
                                            jArr = fqpVar2.i;
                                            zArr = fqpVar2.j;
                                            if (fqnVar3.b == 2 || (i & 1) == 0) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                            i12 = i51 + fqpVar2.g[i50];
                                            j3 = fqnVar3.c;
                                            j4 = fqpVar2.p;
                                            i13 = i51;
                                            while (i13 < i12) {
                                                if (i54 != 0) {
                                                    i14 = etxVar6.i();
                                                } else {
                                                    i14 = fqaVar2.b;
                                                }
                                                m(i14);
                                                if (i55 != 0) {
                                                    i15 = etxVar6.i();
                                                } else {
                                                    i15 = fqaVar2.c;
                                                }
                                                m(i15);
                                                if (i56 != 0) {
                                                    i16 = etxVar6.i();
                                                } else if (i13 != 0) {
                                                    i16 = i10;
                                                } else if (z7) {
                                                    i16 = i11;
                                                    i13 = 0;
                                                } else {
                                                    i13 = 0;
                                                    i16 = i10;
                                                }
                                                if (i57 != 0) {
                                                    i17 = etxVar6.i();
                                                } else {
                                                    i17 = 0;
                                                }
                                                defpackage.fqa fqaVar3 = fqaVar2;
                                                jZ = eum.z((((long) i17) + j4) - jA, 1000000L, j3);
                                                jArr[i13] = jZ;
                                                if (fqpVar2.q) {
                                                    fqdVar3 = fqdVar2;
                                                } else {
                                                    fqdVar3 = fqdVar2;
                                                    jArr[i13] = jZ + fqdVar3.d.i;
                                                }
                                                iArr[i13] = i15;
                                                if (((i16 >> 16) & 1) != 0) {
                                                    z3 = false;
                                                } else if (z2) {
                                                    z3 = true;
                                                } else if (i13 == 0) {
                                                    z3 = true;
                                                    i13 = 0;
                                                } else {
                                                    z3 = false;
                                                }
                                                zArr[i13] = z3;
                                                j4 += (long) i14;
                                                fqdVar2 = fqdVar3;
                                                z2 = z2;
                                                i12 = i12;
                                                fqaVar2 = fqaVar3;
                                                i13++;
                                                i10 = i10;
                                            }
                                            fqdVar = fqdVar2;
                                            fqpVar2.p = j4;
                                            i46 = i48;
                                            i47 = i12;
                                        } else {
                                            i9 = size4;
                                        }
                                        fqdVar2 = fqdVar4;
                                        i10 = i52;
                                        i11 = i53;
                                        iArr = fqpVar2.h;
                                        jArr = fqpVar2.i;
                                        zArr = fqpVar2.j;
                                        if (fqnVar3.b == 2) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        i12 = i51 + fqpVar2.g[i50];
                                        j3 = fqnVar3.c;
                                        j4 = fqpVar2.p;
                                        i13 = i51;
                                        while (i13 < i12) {
                                            if (i54 != 0) {
                                                i14 = etxVar6.i();
                                            } else {
                                                i14 = fqaVar2.b;
                                            }
                                            m(i14);
                                            if (i55 != 0) {
                                                i15 = etxVar6.i();
                                            } else {
                                                i15 = fqaVar2.c;
                                            }
                                            m(i15);
                                            if (i56 != 0) {
                                                i16 = etxVar6.i();
                                            } else if (i13 != 0) {
                                                i16 = i10;
                                            } else if (z7) {
                                                i16 = i11;
                                                i13 = 0;
                                            } else {
                                                i13 = 0;
                                                i16 = i10;
                                            }
                                            if (i57 != 0) {
                                                i17 = etxVar6.i();
                                            } else {
                                                i17 = 0;
                                            }
                                            defpackage.fqa fqaVar4 = fqaVar2;
                                            jZ = eum.z((((long) i17) + j4) - jA, 1000000L, j3);
                                            jArr[i13] = jZ;
                                            if (fqpVar2.q) {
                                                fqdVar3 = fqdVar2;
                                                jArr[i13] = jZ + fqdVar3.d.i;
                                            } else {
                                                fqdVar3 = fqdVar2;
                                            }
                                            iArr[i13] = i15;
                                            if (((i16 >> 16) & 1) != 0) {
                                                z3 = false;
                                            } else if (z2) {
                                                z3 = true;
                                            } else if (i13 == 0) {
                                                z3 = true;
                                                i13 = 0;
                                            } else {
                                                z3 = false;
                                            }
                                            zArr[i13] = z3;
                                            j4 += (long) i14;
                                            fqdVar2 = fqdVar3;
                                            z2 = z2;
                                            i12 = i12;
                                            fqaVar2 = fqaVar4;
                                            i13++;
                                            i10 = i10;
                                        }
                                        fqdVar = fqdVar2;
                                        fqpVar2.p = j4;
                                        i46 = i48;
                                        i47 = i12;
                                    } else {
                                        i9 = size4;
                                        fqdVar = fqdVar4;
                                    }
                                    fqdVar4 = fqdVar;
                                    i36 = i36;
                                    size4 = i9;
                                    i45++;
                                    i7 = 1953658222;
                                }
                                i4 = i36;
                                defpackage.fqn fqnVar4 = fqdVar4.d.a;
                                defpackage.fqa fqaVar5 = fqpVar2.a;
                                ahvr.ci(fqaVar5);
                                defpackage.fqo fqoVarA = fqnVar4.a(fqaVar5.a);
                                defpackage.eut eutVarB5 = eusVar2.b(1935763834);
                                if (eutVarB5 != null) {
                                    ahvr.ci(fqoVarA);
                                    defpackage.etx etxVar7 = eutVarB5.a;
                                    etxVar7.Q(8);
                                    if ((etxVar7.i() & 1) == 1) {
                                        etxVar7.R(8);
                                    }
                                    int iN = etxVar7.n();
                                    int iQ2 = etxVar7.q();
                                    int i58 = fqpVar2.e;
                                    if (iQ2 > i58) {
                                        throw new defpackage.era(a.bf(i58, iQ2, "Saiz sample count ", " is greater than fragment sample count"), null, true, 1);
                                    }
                                    int i59 = fqoVarA.d;
                                    if (iN == 0) {
                                        boolean[] zArr2 = fqpVar2.l;
                                        i8 = 0;
                                        for (int i60 = 0; i60 < iQ2; i60++) {
                                            int iN2 = etxVar7.n();
                                            i8 += iN2;
                                            zArr2[i60] = iN2 > i59;
                                        }
                                        z = false;
                                    } else {
                                        boolean z8 = iN > i59;
                                        i8 = iN * iQ2;
                                        z = false;
                                        java.util.Arrays.fill(fqpVar2.l, 0, iQ2, z8);
                                    }
                                    java.util.Arrays.fill(fqpVar2.l, iQ2, fqpVar2.e, z);
                                    if (i8 > 0) {
                                        fqpVar2.b(i8);
                                    }
                                }
                                defpackage.eut eutVarB6 = eusVar2.b(1935763823);
                                if (eutVarB6 != null) {
                                    defpackage.etx etxVar8 = eutVarB6.a;
                                    etxVar8.Q(8);
                                    int i61 = etxVar8.i();
                                    if ((i61 & 1) == 1) {
                                        etxVar8.R(8);
                                    }
                                    int iQ3 = etxVar8.q();
                                    if (iQ3 != 1) {
                                        throw new defpackage.era(a.bj(iQ3, "Unexpected saio entry count: "), null, true, 1);
                                    }
                                    fqpVar2.c += ((i61 >> 24) & 255) == 0 ? etxVar8.w() : etxVar8.x();
                                }
                                defpackage.eut eutVarB7 = eusVar2.b(1936027235);
                                if (eutVarB7 != null) {
                                    k(eutVarB7.a, 0, fqpVar2);
                                }
                                java.lang.String str2 = fqoVarA != null ? fqoVarA.b : null;
                                defpackage.etx etxVar9 = null;
                                defpackage.etx etxVar10 = null;
                                for (int i62 = 0; i62 < list4.size(); i62++) {
                                    defpackage.eut eutVar4 = (defpackage.eut) list4.get(i62);
                                    defpackage.etx etxVar11 = eutVar4.a;
                                    int i63 = eutVar4.d;
                                    if (i63 == 1935828848) {
                                        etxVar11.Q(12);
                                        if (etxVar11.i() == 1936025959) {
                                            etxVar9 = etxVar11;
                                        }
                                    } else if (i63 == 1936158820) {
                                        etxVar11.Q(12);
                                        if (etxVar11.i() == 1936025959) {
                                            etxVar10 = etxVar11;
                                        }
                                    }
                                }
                                if (etxVar9 != null && etxVar10 != null) {
                                    etxVar9.Q(8);
                                    int i64 = etxVar9.i() >> 24;
                                    etxVar9.R(4);
                                    if ((i64 & 255) == 1) {
                                        etxVar9.R(4);
                                    }
                                    if (etxVar9.i() != 1) {
                                        throw new defpackage.era("Entry count in sbgp != 1 (unsupported).", null, false, 1);
                                    }
                                    etxVar10.Q(8);
                                    int i65 = etxVar10.i() >> 24;
                                    etxVar10.R(4);
                                    int i66 = i65 & 255;
                                    long jW2 = i66 > 0 ? etxVar10.w() : 0L;
                                    if (i66 >= 2) {
                                        etxVar10.R(4);
                                    }
                                    if (etxVar10.w() != 1) {
                                        throw new defpackage.era("Entry count in sgpd != 1 (unsupported).", null, false, 1);
                                    }
                                    if (i66 > 0 && jW2 == 0) {
                                        etxVar10.R(4);
                                    }
                                    etxVar10.R(1);
                                    int iN3 = etxVar10.n();
                                    int i67 = (iN3 & 240) >> 4;
                                    int i68 = iN3 & 15;
                                    if (etxVar10.n() == 1) {
                                        int iN4 = etxVar10.n();
                                        int i69 = i33;
                                        byte[] bArr3 = new byte[i69];
                                        etxVar10.L(bArr3, 0, i69);
                                        if (iN4 == 0) {
                                            int iN5 = etxVar10.n();
                                            byte[] bArr4 = new byte[iN5];
                                            etxVar10.L(bArr4, 0, iN5);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        fqpVar2.k = true;
                                        fqpVar2.m = new defpackage.fqo(true, str2, iN4, bArr3, i67, i68, bArr);
                                    }
                                }
                                int size5 = list4.size();
                                for (int i70 = 0; i70 < size5; i70++) {
                                    defpackage.eut eutVar5 = (defpackage.eut) list4.get(i70);
                                    if (eutVar5.d == 1970628964) {
                                        defpackage.etx etxVar12 = eutVar5.a;
                                        etxVar12.Q(8);
                                        etxVar12.L(bArr2, 0, 16);
                                        if (java.util.Arrays.equals(bArr2, c)) {
                                            k(etxVar12, 16, fqpVar2);
                                        }
                                    }
                                }
                                i3 = 8;
                                i6 = 0;
                                i5 = 16;
                            }
                        } else {
                            i = i35;
                            list = list3;
                            i2 = size3;
                            i3 = i21;
                            i4 = i36;
                            i5 = i33;
                            i6 = i34;
                        }
                        i36 = i4 + 1;
                        i21 = i3;
                        i34 = i6;
                        i33 = i5;
                        i35 = i;
                        size3 = i2;
                        list3 = list;
                        z4 = true;
                    }
                    int i71 = i34;
                    androidx.media3.common.DrmInitData drmInitDataI2 = i(eusVar.b);
                    if (drmInitDataI2 != null) {
                        int size6 = sparseArray3.size();
                        for (int i72 = i71; i72 < size6; i72++) {
                            defpackage.fqd fqdVar5 = (defpackage.fqd) sparseArray3.valueAt(i72);
                            defpackage.fqn fqnVar5 = fqdVar5.d.a;
                            defpackage.fqa fqaVar6 = fqdVar5.b.a;
                            java.lang.String str3 = eum.a;
                            defpackage.fqo fqoVarA2 = fqnVar5.a(fqaVar6.a);
                            androidx.media3.common.DrmInitData drmInitDataB = drmInitDataI2.b(fqoVarA2 != null ? fqoVarA2.b : null);
                            defpackage.eqf eqfVar2 = new defpackage.eqf(fqdVar5.k);
                            eqfVar2.r = drmInitDataB;
                            defpackage.eqg eqgVar2 = new defpackage.eqg(eqfVar2);
                            if (fqdVar5.j != null) {
                                fqdVar5.j = eqgVar2;
                            } else {
                                fqdVar5.a.p(eqgVar2);
                            }
                        }
                    }
                    if (this.y != -9223372036854775807L) {
                        int size7 = sparseArray3.size();
                        for (int i73 = i71; i73 < size7; i73++) {
                            defpackage.fqd fqdVar6 = (defpackage.fqd) sparseArray3.valueAt(i73);
                            long j8 = this.y;
                            int i74 = fqdVar6.f;
                            while (true) {
                                defpackage.fqp fqpVar3 = fqdVar6.b;
                                if (i74 >= fqpVar3.e || fqpVar3.a(i74) > j8) {
                                    break;
                                }
                                if (fqpVar3.j[i74]) {
                                    fqdVar6.i = i74;
                                }
                                i74++;
                            }
                        }
                        this.y = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((defpackage.eus) arrayDeque.peek()).c(eusVar);
                }
            }
        }
        j();
    }

    private static void m(int i) throws defpackage.era {
        if (i < 0) {
            throw new defpackage.era(a.bj(i, "Unexpected negative value: "), null, true, 1);
        }
    }

    private static final defpackage.fqa n(android.util.SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (defpackage.fqa) sparseArray.valueAt(0);
        }
        defpackage.fqa fqaVar = (defpackage.fqa) sparseArray.get(i);
        ahvr.ci(fqaVar);
        return fqaVar;
    }

    private final void o(defpackage.fma fmaVar, aesq aesqVar) {
        this.H.y(fmaVar);
        this.J = true;
        aesqVar.a = this.M;
        j();
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return this.q;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        int i;
        int i2 = this.a;
        if ((i2 & 32) == 0) {
            fllVar = new defpackage.fru(fllVar, this.e);
        }
        this.H = fllVar;
        j();
        defpackage.fmk[] fmkVarArr = new defpackage.fmk[2];
        this.I = fmkVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            fmkVarArr[0] = this.H.r(100, 5);
            i = 1;
            i3 = androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        } else {
            i = 0;
        }
        defpackage.fmk[] fmkVarArr2 = (defpackage.fmk[]) eum.aa(this.I, i);
        this.I = fmkVarArr2;
        for (defpackage.fmk fmkVar : fmkVarArr2) {
            fmkVar.p(d);
        }
        java.util.List list = this.f;
        this.b = new defpackage.fmk[list.size()];
        while (i4 < this.b.length) {
            defpackage.fmk fmkVarR = this.H.r(i3, 3);
            fmkVarR.p((defpackage.eqg) list.get(i4));
            this.b[i4] = fmkVarR;
            i4++;
            i3++;
        }
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        android.util.SparseArray sparseArray = this.g;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.fqd) sparseArray.valueAt(i)).f();
        }
        this.o.clear();
        this.x = 0;
        this.p.a.clear();
        this.y = j2;
        this.n.clear();
        this.M = -1L;
        j();
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        defpackage.fme fmeVarA = defpackage.fql.a(flkVar, true);
        this.q = fmeVarA != null ? aify.p(fmeVarA) : aike.a;
        return fmeVarA == null;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x036a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0375  */
    /* JADX WARN: Code duplicated, block: B:167:0x037a  */
    /* JADX WARN: Code duplicated, block: B:169:0x037e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0381  */
    /* JADX WARN: Code duplicated, block: B:173:0x0396  */
    /* JADX WARN: Code duplicated, block: B:175:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:178:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:181:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061 A[PHI: r26
      0x0061: PHI (r26v7 char) = (r26v5 char), (r26v8 char) binds: [B:21:0x005f, B:18:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:257:0x0584  */
    /* JADX WARN: Code duplicated, block: B:259:0x0587  */
    /* JADX WARN: Code duplicated, block: B:260:0x0589  */
    /* JADX WARN: Code duplicated, block: B:372:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:373:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:375:0x08de  */
    /* JADX WARN: Code duplicated, block: B:377:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:379:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:380:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:383:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:386:0x090f  */
    /* JADX WARN: Code duplicated, block: B:395:0x092f  */
    /* JADX WARN: Code duplicated, block: B:397:0x0933  */
    /* JADX WARN: Code duplicated, block: B:398:0x096d  */
    /* JADX WARN: Code duplicated, block: B:400:0x0977  */
    /* JADX WARN: Code duplicated, block: B:408:0x0993  */
    /* JADX WARN: Code duplicated, block: B:414:0x09b8  */
    /* JADX WARN: Code duplicated, block: B:416:0x09c1 A[LOOP:1: B:415:0x09bf->B:416:0x09c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:419:0x09d7  */
    /* JADX WARN: Code duplicated, block: B:421:0x09e5  */
    /* JADX WARN: Code duplicated, block: B:423:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:520:0x0b0a  */
    /* JADX WARN: Code duplicated, block: B:522:0x0b17  */
    /* JADX WARN: Code duplicated, block: B:527:0x0b4c  */
    /* JADX WARN: Code duplicated, block: B:528:0x0b50  */
    /* JADX WARN: Code duplicated, block: B:556:0x08a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x058a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x03be A[EDGE_INSN: B:608:0x03be->B:179:0x03be BREAK  A[LOOP:10: B:171:0x038e->B:612:?], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v53, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) throws defpackage.era {
        boolean z;
        int i;
        defpackage.fqd fqdVar;
        char c2;
        int i2;
        int i3;
        boolean z2;
        int iA;
        int i4;
        defpackage.fqo fqoVarD;
        defpackage.fmj fmjVar;
        long j;
        java.util.ArrayDeque arrayDeque;
        defpackage.fqb fqbVar;
        int i5;
        long j2;
        long j3;
        int i6;
        int i7;
        int iA2;
        int iC;
        java.lang.String strH;
        int iHashCode;
        int iB;
        char c3;
        long jC;
        int i8;
        defpackage.etx etxVar;
        long jW;
        java.lang.String strT;
        long jW2;
        long j4;
        long j5;
        java.lang.String str;
        long j6;
        long j7;
        long j8;
        defpackage.flc flcVar;
        long j9;
        java.util.ArrayDeque arrayDeque2;
        long j10;
        long j11;
        defpackage.flc flcVar2;
        long j12;
        int i9;
        long j13;
        int i10;
        long j14;
        long j15;
        android.util.SparseArray sparseArray;
        int size;
        int i11;
        while (true) {
            int i12 = this.r;
            int i13 = 2;
            int i14 = 8;
            z = true;
            i = 0;
            if (i12 == 0) {
                int i15 = -1;
                if (this.u == 0) {
                    defpackage.etx etxVar2 = this.m;
                    if (flkVar.o(etxVar2.b, 0, 8, true)) {
                        this.u = 8;
                        etxVar2.Q(0);
                        this.t = etxVar2.w();
                        this.s = etxVar2.i();
                        j8 = this.t;
                        if (j8 == 1) {
                            defpackage.etx etxVar3 = this.m;
                            ((defpackage.flc) flkVar).o(etxVar3.b, 8, 8, false);
                            this.u += 8;
                            this.t = etxVar3.x();
                        } else if (j8 == 0) {
                            flcVar = (defpackage.flc) flkVar;
                            j9 = flcVar.a;
                            if (j9 == -1) {
                                arrayDeque2 = this.n;
                                if (arrayDeque2.isEmpty()) {
                                    j9 = -1;
                                } else {
                                    j9 = ((defpackage.eus) arrayDeque2.peek()).a;
                                }
                            }
                            if (j9 != -1) {
                                this.t = (j9 - flcVar.b) + ((long) this.u);
                            }
                        }
                        j10 = this.t;
                        int i16 = this.u;
                        j11 = i16;
                        if (j10 < j11) {
                            if (this.s == 1718773093 || i16 != 8) {
                                throw new defpackage.era("Atom size less than header length (unsupported).", null, false, 1);
                            }
                            this.t = j11;
                            j10 = j11;
                        }
                        if (this.L != -1) {
                            if (this.s == 1936286840) {
                                defpackage.etx etxVar4 = this.l;
                                etxVar4.M((int) j10);
                                java.lang.System.arraycopy(this.m.b, 0, etxVar4.b, 0, 8);
                                ((defpackage.flc) flkVar).o(etxVar4.b, 8, (int) (this.t - ((long) this.u)), false);
                                this.N.h((defpackage.fla) h(new defpackage.eut(1936286840, etxVar4).a, flkVar.e()).second);
                            } else {
                                flkVar.p((int) (j10 - j11), true);
                            }
                            j();
                        } else {
                            flcVar2 = (defpackage.flc) flkVar;
                            j12 = flcVar2.b - j11;
                            i9 = this.s;
                            if ((i9 != 1836019558 || i9 == 1835295092) && !this.J) {
                                j13 = flcVar2.a;
                                if (j13 == -1 && this.M == -1) {
                                    this.M = j12;
                                    aesqVar.a = j13 - 16;
                                    this.r = 5;
                                } else {
                                    this.H.y(new defpackage.flz(this.z, j12));
                                    this.J = true;
                                    if (this.s == 1836019558) {
                                        sparseArray = this.g;
                                        size = sparseArray.size();
                                        for (i11 = 0; i11 < size; i11++) {
                                            defpackage.fqp fqpVar = ((defpackage.fqd) sparseArray.valueAt(i11)).b;
                                            fqpVar.c = j12;
                                            fqpVar.b = j12;
                                        }
                                    }
                                    i10 = this.s;
                                    if (i10 == 1835295092) {
                                        this.B = null;
                                        this.w = j12 + this.t;
                                        this.r = 2;
                                    } else if (i10 != 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227 || i10 == 1835365473 || i10 == 1953654118) {
                                        i15 = 1;
                                        long j16 = flcVar2.b;
                                        j14 = this.t;
                                        long j17 = j16 + j14;
                                        if (j14 != this.u && i10 == 1835365473) {
                                            defpackage.etx etxVar5 = this.l;
                                            etxVar5.M(8);
                                            flcVar2.n(etxVar5.b, 0, 8, false);
                                            defpackage.fpz.f(etxVar5);
                                            flcVar2.p(etxVar5.c, false);
                                            flkVar.k();
                                        }
                                        j15 = j17 - 8;
                                        this.n.push(new defpackage.eus(this.s, j15));
                                        if (this.t == this.u) {
                                            l(j15);
                                        } else {
                                            j();
                                        }
                                    } else if (i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124 || i10 == 1667527523 || i10 == 1919837298) {
                                        if (this.u != 8) {
                                            throw new defpackage.era("Leaf atom defines extended atom size (unsupported).", null, false, 1);
                                        }
                                        if (this.t > 2147483647L) {
                                            throw new defpackage.era("Leaf atom with length > 2147483647 (unsupported).", null, false, 1);
                                        }
                                        defpackage.etx etxVar6 = new defpackage.etx((int) this.t);
                                        java.lang.System.arraycopy(this.m.b, 0, etxVar6.b, 0, 8);
                                        this.v = etxVar6;
                                        i15 = 1;
                                        this.r = 1;
                                    } else {
                                        if (this.t > 2147483647L) {
                                            throw new defpackage.era("Skipping atom with length > 2147483647 (unsupported).", null, false, 1);
                                        }
                                        this.v = null;
                                        i15 = 1;
                                        this.r = 1;
                                    }
                                }
                            } else {
                                if (this.s == 1836019558) {
                                    sparseArray = this.g;
                                    size = sparseArray.size();
                                    while (i11 < size) {
                                        defpackage.fqp fqpVar2 = ((defpackage.fqd) sparseArray.valueAt(i11)).b;
                                        fqpVar2.c = j12;
                                        fqpVar2.b = j12;
                                    }
                                }
                                i10 = this.s;
                                if (i10 == 1835295092) {
                                    this.B = null;
                                    this.w = j12 + this.t;
                                    this.r = 2;
                                } else if (i10 != 1836019574) {
                                    i15 = 1;
                                    long j18 = flcVar2.b;
                                    j14 = this.t;
                                    long j19 = j18 + j14;
                                    if (j14 != this.u) {
                                        defpackage.etx etxVar7 = this.l;
                                        etxVar7.M(8);
                                        flcVar2.n(etxVar7.b, 0, 8, false);
                                        defpackage.fpz.f(etxVar7);
                                        flcVar2.p(etxVar7.c, false);
                                        flkVar.k();
                                    }
                                    j15 = j19 - 8;
                                    this.n.push(new defpackage.eus(this.s, j15));
                                    if (this.t == this.u) {
                                        l(j15);
                                    } else {
                                        j();
                                    }
                                } else {
                                    i15 = 1;
                                    long j110 = flcVar2.b;
                                    j14 = this.t;
                                    long j111 = j110 + j14;
                                    if (j14 != this.u) {
                                        defpackage.etx etxVar8 = this.l;
                                        etxVar8.M(8);
                                        flcVar2.n(etxVar8.b, 0, 8, false);
                                        defpackage.fpz.f(etxVar8);
                                        flcVar2.p(etxVar8.c, false);
                                        flkVar.k();
                                    }
                                    j15 = j111 - 8;
                                    this.n.push(new defpackage.eus(this.s, j15));
                                    if (this.t == this.u) {
                                        l(j15);
                                    } else {
                                        j();
                                    }
                                }
                            }
                            if (this.r == 5) {
                            }
                        }
                        i15 = 1;
                        if (this.r == 5) {
                        }
                    } else {
                        if (this.L != -1) {
                            aesqVar.a = 0L;
                            this.L = -1L;
                            this.H.y(this.N.g());
                            this.K = true;
                            return 1;
                        }
                        this.p.b(0);
                    }
                } else {
                    j8 = this.t;
                    if (j8 == 1) {
                        defpackage.etx etxVar9 = this.m;
                        ((defpackage.flc) flkVar).o(etxVar9.b, 8, 8, false);
                        this.u += 8;
                        this.t = etxVar9.x();
                    } else if (j8 == 0) {
                        flcVar = (defpackage.flc) flkVar;
                        j9 = flcVar.a;
                        if (j9 == -1) {
                            arrayDeque2 = this.n;
                            if (arrayDeque2.isEmpty()) {
                                j9 = ((defpackage.eus) arrayDeque2.peek()).a;
                            } else {
                                j9 = -1;
                            }
                        }
                        if (j9 != -1) {
                            this.t = (j9 - flcVar.b) + ((long) this.u);
                        }
                    }
                    j10 = this.t;
                    int i17 = this.u;
                    j11 = i17;
                    if (j10 < j11) {
                        if (this.s == 1718773093) {
                        }
                        throw new defpackage.era("Atom size less than header length (unsupported).", null, false, 1);
                    }
                    if (this.L != -1) {
                        if (this.s == 1936286840) {
                            defpackage.etx etxVar10 = this.l;
                            etxVar10.M((int) j10);
                            java.lang.System.arraycopy(this.m.b, 0, etxVar10.b, 0, 8);
                            ((defpackage.flc) flkVar).o(etxVar10.b, 8, (int) (this.t - ((long) this.u)), false);
                            this.N.h((defpackage.fla) h(new defpackage.eut(1936286840, etxVar10).a, flkVar.e()).second);
                        } else {
                            flkVar.p((int) (j10 - j11), true);
                        }
                        j();
                    } else {
                        flcVar2 = (defpackage.flc) flkVar;
                        j12 = flcVar2.b - j11;
                        i9 = this.s;
                        if (i9 != 1836019558) {
                            j13 = flcVar2.a;
                            if (j13 == -1) {
                            }
                            this.H.y(new defpackage.flz(this.z, j12));
                            this.J = true;
                            if (this.s == 1836019558) {
                                sparseArray = this.g;
                                size = sparseArray.size();
                                while (i11 < size) {
                                    defpackage.fqp fqpVar3 = ((defpackage.fqd) sparseArray.valueAt(i11)).b;
                                    fqpVar3.c = j12;
                                    fqpVar3.b = j12;
                                }
                            }
                            i10 = this.s;
                            if (i10 == 1835295092) {
                                this.B = null;
                                this.w = j12 + this.t;
                                this.r = 2;
                            } else if (i10 != 1836019574) {
                                i15 = 1;
                                long j112 = flcVar2.b;
                                j14 = this.t;
                                long j113 = j112 + j14;
                                if (j14 != this.u) {
                                    defpackage.etx etxVar11 = this.l;
                                    etxVar11.M(8);
                                    flcVar2.n(etxVar11.b, 0, 8, false);
                                    defpackage.fpz.f(etxVar11);
                                    flcVar2.p(etxVar11.c, false);
                                    flkVar.k();
                                }
                                j15 = j113 - 8;
                                this.n.push(new defpackage.eus(this.s, j15));
                                if (this.t == this.u) {
                                    l(j15);
                                } else {
                                    j();
                                }
                            } else {
                                i15 = 1;
                                long j114 = flcVar2.b;
                                j14 = this.t;
                                long j115 = j114 + j14;
                                if (j14 != this.u) {
                                    defpackage.etx etxVar12 = this.l;
                                    etxVar12.M(8);
                                    flcVar2.n(etxVar12.b, 0, 8, false);
                                    defpackage.fpz.f(etxVar12);
                                    flcVar2.p(etxVar12.c, false);
                                    flkVar.k();
                                }
                                j15 = j115 - 8;
                                this.n.push(new defpackage.eus(this.s, j15));
                                if (this.t == this.u) {
                                    l(j15);
                                } else {
                                    j();
                                }
                            }
                            if (this.r == 5) {
                            }
                        } else {
                            j13 = flcVar2.a;
                            if (j13 == -1) {
                            }
                            this.H.y(new defpackage.flz(this.z, j12));
                            this.J = true;
                            if (this.s == 1836019558) {
                                sparseArray = this.g;
                                size = sparseArray.size();
                                while (i11 < size) {
                                    defpackage.fqp fqpVar4 = ((defpackage.fqd) sparseArray.valueAt(i11)).b;
                                    fqpVar4.c = j12;
                                    fqpVar4.b = j12;
                                }
                            }
                            i10 = this.s;
                            if (i10 == 1835295092) {
                                this.B = null;
                                this.w = j12 + this.t;
                                this.r = 2;
                            } else if (i10 != 1836019574) {
                                i15 = 1;
                                long j116 = flcVar2.b;
                                j14 = this.t;
                                long j117 = j116 + j14;
                                if (j14 != this.u) {
                                    defpackage.etx etxVar13 = this.l;
                                    etxVar13.M(8);
                                    flcVar2.n(etxVar13.b, 0, 8, false);
                                    defpackage.fpz.f(etxVar13);
                                    flcVar2.p(etxVar13.c, false);
                                    flkVar.k();
                                }
                                j15 = j117 - 8;
                                this.n.push(new defpackage.eus(this.s, j15));
                                if (this.t == this.u) {
                                    l(j15);
                                } else {
                                    j();
                                }
                            } else {
                                i15 = 1;
                                long j118 = flcVar2.b;
                                j14 = this.t;
                                long j119 = j118 + j14;
                                if (j14 != this.u) {
                                    defpackage.etx etxVar14 = this.l;
                                    etxVar14.M(8);
                                    flcVar2.n(etxVar14.b, 0, 8, false);
                                    defpackage.fpz.f(etxVar14);
                                    flcVar2.p(etxVar14.c, false);
                                    flkVar.k();
                                }
                                j15 = j119 - 8;
                                this.n.push(new defpackage.eus(this.s, j15));
                                if (this.t == this.u) {
                                    l(j15);
                                } else {
                                    j();
                                }
                            }
                            if (this.r == 5) {
                            }
                        }
                    }
                    i15 = 1;
                    if (this.r == 5) {
                    }
                }
                return i15;
            }
            if (i12 == 1) {
                long j20 = this.t - ((long) this.u);
                defpackage.etx etxVar15 = this.v;
                int i18 = (int) j20;
                if (etxVar15 != null) {
                    defpackage.flc flcVar3 = (defpackage.flc) flkVar;
                    flcVar3.o(etxVar15.b, 8, i18, false);
                    defpackage.eut eutVar = new defpackage.eut(this.s, etxVar15);
                    java.util.ArrayDeque arrayDeque3 = this.n;
                    if (arrayDeque3.isEmpty()) {
                        int i19 = eutVar.d;
                        if (i19 == 1936286840) {
                            android.util.Pair pairH = h(eutVar.a, flcVar3.b);
                            defpackage.oq oqVar = this.N;
                            oqVar.h((defpackage.fla) pairH.second);
                            this.A = ((java.lang.Long) pairH.first).longValue();
                            if (!this.K) {
                                this.H.y(oqVar.a.size() == 1 ? (defpackage.fma) pairH.second : oqVar.g());
                                this.J = true;
                            }
                        } else if (i19 == 1701671783) {
                            defpackage.etx etxVar16 = eutVar.a;
                            if (this.I.length != 0) {
                                etxVar16.Q(8);
                                int i20 = etxVar16.i();
                                int i21 = defpackage.fpz.a;
                                int i22 = (i20 >> 24) & 255;
                                if (i22 == 0) {
                                    strT = etxVar16.T();
                                    ahvr.ci(strT);
                                    java.lang.String strT2 = etxVar16.T();
                                    ahvr.ci(strT2);
                                    long jW3 = etxVar16.w();
                                    long jZ = eum.z(etxVar16.w(), 1000000L, jW3);
                                    long j21 = this.A;
                                    long j22 = j21 != -9223372036854775807L ? j21 + jZ : -9223372036854775807L;
                                    long jZ2 = eum.z(etxVar16.w(), 1000L, jW3);
                                    jW2 = etxVar16.w();
                                    j4 = -9223372036854775807L;
                                    j5 = j22;
                                    str = strT2;
                                    j6 = jZ2;
                                    j7 = jZ;
                                } else if (i22 != 1) {
                                    defpackage.etr.f("FragmentedMp4Extractor", a.bj(i22, "Skipping unsupported emsg version: "));
                                } else {
                                    long jW4 = etxVar16.w();
                                    long jZ3 = eum.z(etxVar16.x(), 1000000L, jW4);
                                    long jZ4 = eum.z(etxVar16.w(), 1000L, jW4);
                                    long jW5 = etxVar16.w();
                                    strT = etxVar16.T();
                                    ahvr.ci(strT);
                                    java.lang.String strT3 = etxVar16.T();
                                    ahvr.ci(strT3);
                                    j4 = -9223372036854775807L;
                                    j5 = jZ3;
                                    j7 = -9223372036854775807L;
                                    jW2 = jW5;
                                    str = strT3;
                                    j6 = jZ4;
                                }
                                java.lang.String str2 = strT;
                                byte[] bArr = new byte[etxVar16.d()];
                                etxVar16.L(bArr, 0, etxVar16.d());
                                long j23 = j7;
                                defpackage.fnv fnvVar = new defpackage.fnv(str2, str, j6, jW2, bArr);
                                ils ilsVar = this.O;
                                java.lang.Object obj = ilsVar.b;
                                ((java.io.ByteArrayOutputStream) obj).reset();
                                try {
                                    java.lang.Object obj2 = ilsVar.a;
                                    ils.j((java.io.DataOutputStream) obj2, fnvVar.a);
                                    ils.j((java.io.DataOutputStream) obj2, fnvVar.b);
                                    ((java.io.DataOutputStream) obj2).writeLong(fnvVar.c);
                                    ((java.io.DataOutputStream) obj2).writeLong(fnvVar.d);
                                    ((java.io.DataOutputStream) obj2).write(fnvVar.e);
                                    ((java.io.DataOutputStream) obj2).flush();
                                    defpackage.etx etxVar17 = new defpackage.etx(((java.io.ByteArrayOutputStream) obj).toByteArray());
                                    int iD = etxVar17.d();
                                    for (defpackage.fmk fmkVar : this.I) {
                                        etxVar17.Q(0);
                                        fmkVar.b(etxVar17, iD);
                                    }
                                    java.util.ArrayDeque arrayDeque4 = this.o;
                                    if (j5 == j4) {
                                        arrayDeque4.addLast(new defpackage.fqb(j23, true, iD));
                                        this.x += iD;
                                    } else if (arrayDeque4.isEmpty()) {
                                        for (defpackage.fmk fmkVar2 : this.I) {
                                            fmkVar2.d(j5, 1, iD, 0, null);
                                        }
                                    } else {
                                        arrayDeque4.addLast(new defpackage.fqb(j5, false, iD));
                                        this.x += iD;
                                    }
                                } catch (java.io.IOException e) {
                                    throw new java.lang.RuntimeException(e);
                                }
                            }
                        }
                    } else {
                        ((defpackage.eus) arrayDeque3.peek()).d(eutVar);
                    }
                } else {
                    ((defpackage.flc) flkVar).p(i18, false);
                }
                l(((defpackage.flc) flkVar).b);
            } else if (i12 != 2) {
                char c4 = 6;
                if (i12 == 5) {
                    defpackage.etx etxVar18 = this.l;
                    etxVar18.M(16);
                    if (flkVar.o(etxVar18.b, 0, 16, true)) {
                        etxVar18.Q(0);
                        int i23 = etxVar18.i();
                        int i24 = etxVar18.i();
                        if (i23 == 16 && i24 == 1835430511) {
                            etxVar18.R(4);
                            long jW6 = etxVar18.w();
                            long j24 = ((defpackage.flc) flkVar).a - jW6;
                            if (jW6 <= 0 || jW6 > 2147483647L || j24 < 0 || j24 < this.M) {
                                o(new defpackage.flz(this.z, this.M), aesqVar);
                            } else {
                                aesqVar.a = j24;
                                this.r = 6;
                            }
                        } else {
                            o(new defpackage.flz(this.z, this.M), aesqVar);
                        }
                    } else {
                        o(new defpackage.flz(this.z, this.M), aesqVar);
                    }
                    int i25 = this.r;
                    if (i25 == 6 || i25 == 0) {
                        return 1;
                    }
                } else if (i12 != 6) {
                    fqdVar = this.B;
                    if (fqdVar != null) {
                        c2 = 6;
                        i2 = 2;
                        break;
                    }
                    android.util.SparseArray sparseArray2 = this.g;
                    int size2 = sparseArray2.size();
                    defpackage.fqd fqdVar2 = null;
                    long j25 = Long.MAX_VALUE;
                    int i26 = 0;
                    while (i26 < size2) {
                        int i27 = i13;
                        defpackage.fqd fqdVar3 = (defpackage.fqd) sparseArray2.valueAt(i26);
                        if (fqdVar3.l) {
                            c3 = c4;
                            if (fqdVar3.h != fqdVar3.b.d) {
                                jC = fqdVar3.c();
                                if (jC < j25) {
                                    fqdVar2 = fqdVar3;
                                    j25 = jC;
                                }
                            }
                        } else {
                            c3 = c4;
                            if (fqdVar3.f != fqdVar3.d.b) {
                                jC = fqdVar3.c();
                                if (jC < j25) {
                                    fqdVar2 = fqdVar3;
                                    j25 = jC;
                                }
                            }
                        }
                        i26++;
                        i13 = i27;
                        c4 = c3;
                    }
                    c2 = c4;
                    i2 = i13;
                    if (fqdVar2 != null) {
                        defpackage.flc flcVar4 = (defpackage.flc) flkVar;
                        int iC2 = (int) (fqdVar2.c() - flcVar4.b);
                        if (iC2 < 0) {
                            defpackage.etr.f("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iC2 = 0;
                        }
                        flcVar4.p(iC2, false);
                        this.B = fqdVar2;
                        fqdVar = fqdVar2;
                        break;
                    }
                    defpackage.flc flcVar5 = (defpackage.flc) flkVar;
                    int i28 = (int) (this.w - flcVar5.b);
                    if (i28 < 0) {
                        throw new defpackage.era("Offset to end of mdat was negative.", null, true, 1);
                    }
                    flcVar5.p(i28, false);
                    j();
                } else {
                    defpackage.flc flcVar6 = (defpackage.flc) flkVar;
                    long j26 = flcVar6.a - flcVar6.b;
                    defpackage.etx etxVar19 = this.l;
                    etxVar19.M(8);
                    if (flkVar.n(etxVar19.b, 0, 8, true)) {
                        etxVar19.Q(0);
                        int i29 = etxVar19.i();
                        if (etxVar19.i() != 1835430497) {
                            o(new defpackage.flz(this.z, this.M), aesqVar);
                        } else {
                            int i30 = (int) j26;
                            defpackage.etx etxVar20 = new defpackage.etx(i30);
                            flcVar6.o(etxVar20.b, 0, i30, false);
                            etxVar20.Q(i29 == 1 ? 16 : 8);
                            android.util.SparseArray sparseArray3 = new android.util.SparseArray();
                            android.util.SparseArray sparseArray4 = new android.util.SparseArray();
                            while (etxVar20.d() >= i14) {
                                int i31 = etxVar20.c;
                                long jW7 = etxVar20.w();
                                int i32 = etxVar20.i();
                                if (jW7 == 1) {
                                    if (etxVar20.d() < i14) {
                                        break;
                                    }
                                    jW7 = etxVar20.v();
                                } else if (jW7 == 0) {
                                    jW7 = ((long) etxVar20.d) - ((long) i31);
                                }
                                int i33 = jW7 == 1 ? 16 : i14;
                                if (jW7 < i33) {
                                    break;
                                }
                                long j27 = i31;
                                long j28 = jW7;
                                if (j28 > ((long) etxVar20.d) - j27) {
                                    break;
                                }
                                if (i32 != 1952871009) {
                                    etxVar = etxVar20;
                                } else if (j28 < i33 + 16) {
                                    etxVar20.Q((int) (j27 + j28));
                                } else {
                                    int i34 = etxVar20.i();
                                    int i35 = defpackage.fpz.a;
                                    int i36 = i34 >> 24;
                                    int i37 = etxVar20.i();
                                    defpackage.fqd fqdVar4 = (defpackage.fqd) this.g.get(i37);
                                    if (fqdVar4 == null) {
                                        etxVar20.Q((int) (j27 + j28));
                                    } else {
                                        int i38 = i36 & 255;
                                        long j29 = fqdVar4.d.a.c;
                                        int i39 = etxVar20.i();
                                        int i40 = i39 >> 4;
                                        int i41 = i39 >> 2;
                                        int i42 = i39 & 3;
                                        defpackage.etx etxVar21 = etxVar20;
                                        long jW8 = etxVar21.w();
                                        int i43 = (i40 & 3) + 1;
                                        int i44 = (i41 & 3) + 1;
                                        int i45 = i42 + 1;
                                        if (((i38 == 1 ? 16L : 8L) + ((long) i43) + ((long) i44) + ((long) i45)) * jW8 > etxVar21.d()) {
                                            etxVar = etxVar21;
                                            etxVar.Q((int) (j27 + j28));
                                        } else {
                                            etxVar = etxVar21;
                                            int i46 = (int) jW8;
                                            long[] jArr = new long[i46];
                                            long[] jArr2 = new long[i46];
                                            int i47 = 0;
                                            while (i47 < i46) {
                                                int i48 = i46;
                                                if (i38 == 1) {
                                                    jW = etxVar.x();
                                                    i38 = 1;
                                                } else {
                                                    jW = etxVar.w();
                                                }
                                                long jX = i38 == 1 ? etxVar.x() : etxVar.w();
                                                etxVar.R(i43 + i44 + i45);
                                                jArr[i47] = eum.z(jW, 1000000L, j29);
                                                jArr2[i47] = jX;
                                                i47++;
                                                i46 = i48;
                                                i38 = i38;
                                            }
                                            sparseArray3.put(i37, jArr);
                                            sparseArray4.put(i37, jArr2);
                                        }
                                        etxVar20 = etxVar;
                                        i14 = 8;
                                    }
                                }
                                etxVar.Q((int) (j27 + j28));
                                etxVar20 = etxVar;
                                i14 = 8;
                            }
                            if (sparseArray3.size() == 0) {
                                o(new defpackage.flz(this.z, this.M), aesqVar);
                            } else {
                                int iKeyAt = -1;
                                int i49 = -1;
                                for (int i50 = 0; i50 < sparseArray3.size(); i50++) {
                                    int iKeyAt2 = sparseArray3.keyAt(i50);
                                    defpackage.fqd fqdVar5 = (defpackage.fqd) this.g.get(iKeyAt2);
                                    if (fqdVar5 != null) {
                                        int i51 = fqdVar5.d.a.b;
                                        if (iKeyAt != -1) {
                                            if (i49 != -1) {
                                                if (i51 == 1) {
                                                    i49 = iKeyAt2;
                                                } else {
                                                    i49 = -1;
                                                }
                                            }
                                        } else if (i51 == 2) {
                                            iKeyAt = iKeyAt2;
                                        } else {
                                            iKeyAt = -1;
                                            if (i49 != -1) {
                                                if (i51 == 1) {
                                                    i49 = iKeyAt2;
                                                } else {
                                                    i49 = -1;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (iKeyAt != -1) {
                                    i8 = iKeyAt;
                                } else if (i49 != -1) {
                                    i8 = i49;
                                } else {
                                    iKeyAt = sparseArray3.keyAt(0);
                                    i8 = iKeyAt;
                                }
                                o(new defpackage.fqc(sparseArray3, sparseArray4, this.z, this.M, i8), aesqVar);
                            }
                        }
                    } else {
                        o(new defpackage.flz(this.z, this.M), aesqVar);
                    }
                    if (this.r == 0) {
                        return 1;
                    }
                }
            } else {
                android.util.SparseArray sparseArray5 = this.g;
                int size3 = sparseArray5.size();
                defpackage.fqd fqdVar6 = null;
                long j30 = Long.MAX_VALUE;
                for (int i52 = 0; i52 < size3; i52++) {
                    defpackage.fqp fqpVar5 = ((defpackage.fqd) sparseArray5.valueAt(i52)).b;
                    if (fqpVar5.o) {
                        long j31 = fqpVar5.c;
                        if (j31 < j30) {
                            fqdVar6 = (defpackage.fqd) sparseArray5.valueAt(i52);
                            j30 = j31;
                        }
                    }
                }
                if (fqdVar6 == null) {
                    this.r = 3;
                } else {
                    defpackage.flc flcVar7 = (defpackage.flc) flkVar;
                    int i53 = (int) (j30 - flcVar7.b);
                    if (i53 < 0) {
                        throw new defpackage.era("Offset to encryption data was negative.", null, true, 1);
                    }
                    flcVar7.p(i53, false);
                    defpackage.fqp fqpVar6 = fqdVar6.b;
                    defpackage.etx etxVar22 = fqpVar6.n;
                    flcVar7.o(etxVar22.b, 0, etxVar22.d, false);
                    etxVar22.Q(0);
                    fqpVar6.o = false;
                }
            }
        }
        if (this.r == 3) {
            this.C = !fqdVar.l ? fqdVar.d.d[fqdVar.f] : fqdVar.b.h[fqdVar.f];
            java.lang.String str3 = fqdVar.d.a.g.p;
            this.F = !(j$.util.Objects.equals(str3, "video/avc") || j$.util.Objects.equals(str3, "video/hevc"));
            if (fqdVar.f < fqdVar.i) {
                ((defpackage.flc) flkVar).p(this.C, false);
                defpackage.fqo fqoVarD2 = fqdVar.d();
                if (fqoVarD2 != null) {
                    defpackage.fqp fqpVar7 = fqdVar.b;
                    defpackage.etx etxVar23 = fqpVar7.n;
                    int i54 = fqoVarD2.d;
                    if (i54 != 0) {
                        etxVar23.R(i54);
                    }
                    if (fqpVar7.c(fqdVar.f)) {
                        etxVar23.R(etxVar23.s() * 6);
                    }
                }
                if (!fqdVar.g()) {
                    this.B = null;
                }
                this.r = 3;
                return 0;
            }
            if (fqdVar.d.a.h == 1) {
                this.C -= 8;
                ((defpackage.flc) flkVar).p(8, false);
            }
            boolean zEquals = "audio/ac4".equals(fqdVar.d.a.g.p);
            int i55 = this.C;
            if (zEquals) {
                this.D = fqdVar.b(i55, 7);
                int i56 = this.C;
                defpackage.etx etxVar24 = this.l;
                defpackage.fkr.b(i56, etxVar24);
                fqdVar.a.b(etxVar24, 7);
                iB = this.D + 7;
                this.D = iB;
            } else {
                iB = fqdVar.b(i55, 0);
                this.D = iB;
            }
            this.C += iB;
            this.r = 4;
            this.E = 0;
        }
        defpackage.fqq fqqVar = fqdVar.d;
        defpackage.fqn fqnVar = fqqVar.a;
        defpackage.fmk fmkVar3 = fqdVar.a;
        long jA = !fqdVar.l ? fqqVar.f[fqdVar.f] : fqdVar.b.a(fqdVar.f);
        int i57 = fqnVar.k;
        if (i57 == 0) {
            i3 = 3;
            if (fqnVar.h == i2) {
                int i58 = this.C - this.D;
                defpackage.etx etxVar25 = this.l;
                etxVar25.M(i58);
                ((defpackage.flc) flkVar).o(etxVar25.b, 0, i58, false);
                if (defpackage.fpz.g(etxVar25, fqnVar.n)) {
                    int iD2 = etxVar25.d();
                    fmkVar3.b(etxVar25, iD2);
                    int i59 = this.D + iD2;
                    this.D = i59;
                    this.C = i59;
                } else {
                    z2 = false;
                }
                iA = fqdVar.a();
                if (!this.F) {
                    iA |= 67108864;
                }
                i4 = iA;
                fqoVarD = fqdVar.d();
                if (fqoVarD != null) {
                    fmjVar = fqoVarD.c;
                } else {
                    fmjVar = null;
                }
                if (z2) {
                    j = jA;
                    fmkVar3.d(j, i4, this.C, 0, fmjVar);
                } else {
                    j = jA;
                }
                while (true) {
                    arrayDeque = this.o;
                    if (!arrayDeque.isEmpty()) {
                        break;
                    }
                    fqbVar = (defpackage.fqb) arrayDeque.removeFirst();
                    int i60 = this.x;
                    i5 = fqbVar.c;
                    this.x = i60 - i5;
                    j2 = fqbVar.a;
                    if (fqbVar.b) {
                        j2 += j;
                    }
                    j3 = j2;
                    for (defpackage.fmk fmkVar4 : this.I) {
                        fmkVar4.d(j3, 1, i5, this.x, null);
                    }
                }
                if (!fqdVar.g()) {
                    this.B = null;
                }
                this.r = i3;
                return 0;
            }
            defpackage.eqg eqgVar = fqdVar.j;
            if (eqgVar != null && defpackage.fli.g(fqnVar.g.p)) {
                fqdVar.k = defpackage.fli.d(flkVar, this.C, fqdVar.k);
                defpackage.eqf eqfVar = new defpackage.eqf(fqdVar.k);
                eqfVar.r = eqgVar.t;
                fmkVar3.p(new defpackage.eqg(eqfVar));
                fqdVar.j = null;
            }
            while (true) {
                int i61 = this.D;
                int i62 = this.C;
                if (i61 >= i62) {
                    break;
                }
                this.D += fmkVar3.a(flkVar, i62 - i61, false);
            }
        } else {
            defpackage.etx etxVar26 = this.i;
            byte[] bArr2 = etxVar26.b;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[i2] = 0;
            i3 = 3;
            int i63 = 4 - i57;
            while (true) {
                boolean z3 = z;
                if (this.D >= this.C) {
                    break;
                }
                int i64 = this.E;
                if (i64 == 0) {
                    if (this.b.length > 0 || !this.F) {
                        iC = defpackage.evc.c(fqnVar.g);
                        if (i57 + iC > this.C - this.D) {
                            iC = 0;
                        }
                    } else {
                        iC = i;
                    }
                    ((defpackage.flc) flkVar).o(bArr2, i63, i57 + iC, false);
                    etxVar26.Q(0);
                    int i65 = etxVar26.i();
                    if (i65 < 0) {
                        throw new defpackage.era("Invalid NAL length", null, z3, z3 ? 1 : 0);
                    }
                    this.E = i65 - iC;
                    defpackage.etx etxVar27 = this.h;
                    etxVar27.Q(0);
                    fmkVar3.b(etxVar27, 4);
                    this.D += 4;
                    this.C += i63;
                    this.G = (this.b.length <= 0 || iC <= 0 || (strH = defpackage.evc.h(fqnVar.g)) == null || ((iHashCode = strH.hashCode()) == -1662541442 ? !(strH.equals("video/hevc") && ((bArr2[4] & 126) >> 1) == 39) : iHashCode == 1331836730 ? !(strH.equals("video/avc") && (bArr2[4] & 31) == c2) : !(iHashCode == 1331856911 && strH.equals("video/vvc") && ((bArr2[5] & 248) >> 3) == 23))) ? false : z3 ? 1 : 0;
                    fmkVar3.b(etxVar26, iC);
                    this.D += iC;
                    if (iC <= 0 || this.F || !defpackage.evc.j(bArr2, iC, fqnVar.g)) {
                        z = z3 ? 1 : 0;
                    } else {
                        z = z3 ? 1 : 0;
                        this.F = z;
                    }
                } else {
                    if (this.G) {
                        defpackage.etx etxVar28 = this.j;
                        etxVar28.M(i64);
                        i7 = i57;
                        ((defpackage.flc) flkVar).o(etxVar28.b, 0, this.E, false);
                        fmkVar3.b(etxVar28, this.E);
                        iA2 = this.E;
                        int iE = defpackage.evc.e(etxVar28.b, etxVar28.d);
                        etxVar28.Q(0);
                        etxVar28.P(iE);
                        int i66 = fqnVar.g.r;
                        defpackage.evi eviVar = this.p;
                        if (i66 == -1) {
                            if (eviVar.b != 0) {
                                eviVar.c(0);
                            }
                        } else if (eviVar.b != i66) {
                            eviVar.c(i66);
                        }
                        defpackage.evi eviVar2 = this.p;
                        eviVar2.a(jA, etxVar28);
                        if ((fqdVar.a() & 4) != 0) {
                            eviVar2.b(0);
                        }
                    } else {
                        i7 = i57;
                        iA2 = fmkVar3.a(flkVar, i64, false);
                    }
                    this.D += iA2;
                    this.E -= iA2;
                    i57 = i7;
                    z = true;
                }
                i = 0;
                c2 = 6;
            }
        }
        z2 = true;
        iA = fqdVar.a();
        if (!this.F) {
            iA |= 67108864;
        }
        i4 = iA;
        fqoVarD = fqdVar.d();
        if (fqoVarD != null) {
            fmjVar = fqoVarD.c;
        } else {
            fmjVar = null;
        }
        if (z2) {
            j = jA;
        } else {
            j = jA;
            fmkVar3.d(j, i4, this.C, 0, fmjVar);
        }
        while (true) {
            arrayDeque = this.o;
            if (!arrayDeque.isEmpty()) {
                break;
                break;
            }
            fqbVar = (defpackage.fqb) arrayDeque.removeFirst();
            int i67 = this.x;
            i5 = fqbVar.c;
            this.x = i67 - i5;
            j2 = fqbVar.a;
            if (fqbVar.b) {
                j2 += j;
            }
            j3 = j2;
            while (i6 < r2) {
                fmkVar4.d(j3, 1, i5, this.x, null);
            }
        }
        if (!fqdVar.g()) {
            this.B = null;
        }
        this.r = i3;
        return 0;
    }

    @Override // defpackage.flj
    public final void c() {
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }
}
