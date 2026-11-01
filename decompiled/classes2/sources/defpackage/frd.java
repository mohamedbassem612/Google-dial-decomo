package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class frd extends defpackage.frc {
    private int a;
    private boolean q;
    private defpackage.fvh r;
    private defpackage.jyn s;
    private defpackage.oq t;

    @Override // defpackage.frc
    protected final long a(defpackage.etx etxVar) {
        if ((etxVar.b[0] & 1) == 1) {
            return -1L;
        }
        defpackage.jyn jynVar = this.s;
        ahvr.ci(jynVar);
        int i = etxVar.b[0] >> 1;
        xhk[] xhkVarArr = (xhk[]) jynVar.c;
        boolean z = xhkVarArr[i & (255 >>> (8 - defpackage.hgu.az(xhkVarArr.length - 1)))].a;
        java.lang.Object obj = jynVar.b;
        int i2 = z ? ((defpackage.fvh) obj).a : ((defpackage.fvh) obj).g;
        int i3 = this.q ? (this.a + i2) / 4 : 0;
        int iE = etxVar.e();
        int i4 = etxVar.d + 4;
        if (iE < i4) {
            etxVar.N(java.util.Arrays.copyOf(etxVar.b, i4));
        } else {
            etxVar.P(i4);
        }
        long j = i3;
        byte[] bArr = etxVar.b;
        int i5 = etxVar.d;
        bArr[i5 - 4] = (byte) (j & 255);
        bArr[i5 - 3] = (byte) ((j >>> 8) & 255);
        bArr[i5 - 2] = (byte) ((j >>> 16) & 255);
        bArr[i5 - 1] = (byte) ((j >>> 24) & 255);
        this.q = true;
        this.a = i2;
        return j;
    }

    @Override // defpackage.frc
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.s = null;
            this.r = null;
            this.t = null;
        }
        this.a = 0;
        this.q = false;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0365  */
    @Override // defpackage.frc
    protected final boolean c(defpackage.etx etxVar, long j, defpackage.hiz hizVar) throws defpackage.era {
        defpackage.jyn jynVar;
        if (this.s != null) {
            ahvr.ci(hizVar.b);
            return false;
        }
        defpackage.fvh fvhVar = this.r;
        int i = 4;
        boolean z = true;
        if (fvhVar != null) {
            defpackage.oq oqVar = this.t;
            if (oqVar == null) {
                this.t = defpackage.hgu.aE(etxVar, true, true);
            } else {
                int i2 = etxVar.d;
                byte[] bArr = new byte[i2];
                java.lang.System.arraycopy(etxVar.b, 0, bArr, 0, i2);
                int i3 = fvhVar.c;
                int i4 = 5;
                defpackage.hgu.aA(5, etxVar, false);
                int iN = etxVar.n() + 1;
                defpackage.evj evjVar = new defpackage.evj(etxVar.b);
                int i5 = 3;
                evjVar.b(etxVar.c << 3);
                int i6 = 0;
                while (true) {
                    int i7 = 2;
                    int i8 = i5;
                    int i9 = 16;
                    if (i6 >= iN) {
                        boolean z2 = z;
                        int i10 = 6;
                        int iA = evjVar.a(6) + (z2 ? 1 : 0);
                        for (int i11 = 0; i11 < iA; i11++) {
                            if (evjVar.a(16) != 0) {
                                throw new defpackage.era("placeholder of time domain transforms not zeroed out", null, z2, z2 ? 1 : 0);
                            }
                        }
                        int iA2 = evjVar.a(6) + (z2 ? 1 : 0);
                        int i12 = 0;
                        while (i12 < iA2) {
                            int iA3 = evjVar.a(i9);
                            if (iA3 == 0) {
                                int i13 = 8;
                                evjVar.b(8);
                                evjVar.b(16);
                                evjVar.b(16);
                                evjVar.b(6);
                                evjVar.b(8);
                                int iA4 = evjVar.a(4) + (z2 ? 1 : 0);
                                int i14 = 0;
                                while (i14 < iA4) {
                                    evjVar.b(i13);
                                    i14++;
                                    i13 = 8;
                                }
                            } else {
                                if (iA3 != z2) {
                                    throw new defpackage.era(a.bj(iA3, "floor type greater than 1 not decodable: "), null, true, 1);
                                }
                                int iA5 = evjVar.a(5);
                                int[] iArr = new int[iA5];
                                int i15 = -1;
                                for (int i16 = 0; i16 < iA5; i16++) {
                                    int iA6 = evjVar.a(4);
                                    iArr[i16] = iA6;
                                    if (iA6 > i15) {
                                        i15 = iA6;
                                    }
                                }
                                int i17 = i15 + 1;
                                int[] iArr2 = new int[i17];
                                int i18 = 0;
                                while (i18 < i17) {
                                    iArr2[i18] = evjVar.a(i8) + 1;
                                    int iA7 = evjVar.a(i7);
                                    if (iA7 > 0) {
                                        evjVar.b(8);
                                    }
                                    int i19 = i17;
                                    int i20 = 0;
                                    for (int i21 = 1; i20 < (i21 << iA7); i21 = 1) {
                                        evjVar.b(8);
                                        i20++;
                                    }
                                    i18++;
                                    i17 = i19;
                                    i8 = 3;
                                    i7 = 2;
                                }
                                evjVar.b(i7);
                                int iA8 = evjVar.a(4);
                                int i22 = 0;
                                int i23 = 0;
                                for (int i24 = 0; i24 < iA5; i24++) {
                                    i22 += iArr2[iArr[i24]];
                                    while (i23 < i22) {
                                        evjVar.b(iA8);
                                        i23++;
                                    }
                                }
                            }
                            i12++;
                            i8 = 3;
                            i10 = 6;
                            i7 = 2;
                            z2 = true;
                            i9 = 16;
                        }
                        int i25 = i10;
                        int i26 = 1;
                        int iA9 = evjVar.a(i25) + 1;
                        int i27 = 0;
                        while (i27 < iA9) {
                            if (evjVar.a(16) > 2) {
                                throw new defpackage.era("residueType greater than 2 is not decodable", null, true, 1);
                            }
                            evjVar.b(24);
                            evjVar.b(24);
                            evjVar.b(24);
                            int iA10 = evjVar.a(i25) + 1;
                            evjVar.b(8);
                            int[] iArr3 = new int[iA10];
                            for (int i28 = 0; i28 < iA10; i28++) {
                                iArr3[i28] = ((evjVar.c() ? evjVar.a(5) : 0) << 3) + evjVar.a(3);
                            }
                            for (int i29 = 0; i29 < iA10; i29++) {
                                for (int i30 = 0; i30 < 8; i30++) {
                                    if ((iArr3[i29] & (1 << i30)) != 0) {
                                        evjVar.b(8);
                                    }
                                }
                            }
                            i27++;
                            i25 = 6;
                            i26 = 1;
                        }
                        int iA11 = evjVar.a(i25) + i26;
                        for (int i31 = 0; i31 < iA11; i31++) {
                            int iA12 = evjVar.a(16);
                            if (iA12 != 0) {
                                defpackage.etr.c("VorbisUtil", a.bj(iA12, "mapping type other than 0 not supported: "));
                            } else {
                                int iA13 = evjVar.c() ? evjVar.a(4) + 1 : 1;
                                if (evjVar.c()) {
                                    int iA14 = evjVar.a(8) + 1;
                                    for (int i32 = 0; i32 < iA14; i32++) {
                                        int i33 = i3 - 1;
                                        evjVar.b(defpackage.hgu.az(i33));
                                        evjVar.b(defpackage.hgu.az(i33));
                                    }
                                }
                                if (evjVar.a(2) != 0) {
                                    throw new defpackage.era("to reserved bits must be zero after mapping coupling steps", null, true, 1);
                                }
                                if (iA13 > 1) {
                                    for (int i34 = 0; i34 < i3; i34++) {
                                        evjVar.b(4);
                                    }
                                }
                                for (int i35 = 0; i35 < iA13; i35++) {
                                    evjVar.b(8);
                                    evjVar.b(8);
                                    evjVar.b(8);
                                }
                            }
                        }
                        int iA15 = evjVar.a(6) + 1;
                        xhk[] xhkVarArr = new xhk[iA15];
                        for (int i36 = 0; i36 < iA15; i36++) {
                            boolean zC = evjVar.c();
                            evjVar.a(16);
                            evjVar.a(16);
                            evjVar.a(8);
                            xhkVarArr[i36] = new xhk(zC);
                        }
                        if (!evjVar.c()) {
                            throw new defpackage.era("framing bit after modes not set as expected", null, true, 1);
                        }
                        jynVar = new defpackage.jyn(fvhVar, oqVar, bArr, xhkVarArr);
                        break;
                    }
                    if (evjVar.a(24) != 5653314) {
                        throw new defpackage.era("expected code book to start with [0x56, 0x43, 0x42] at " + ((evjVar.a << 3) + evjVar.b), null, true, 1);
                    }
                    int iA16 = evjVar.a(16);
                    int iA17 = evjVar.a(24);
                    if (evjVar.c()) {
                        evjVar.b(i4);
                        for (int iA18 = 0; iA18 < iA17; iA18 += evjVar.a(defpackage.hgu.az(iA17 - iA18))) {
                        }
                    } else {
                        boolean zC2 = evjVar.c();
                        for (int i37 = 0; i37 < iA17; i37++) {
                            if (!zC2) {
                                evjVar.b(i4);
                            } else if (evjVar.c()) {
                                evjVar.b(i4);
                            }
                        }
                    }
                    int iA19 = evjVar.a(i);
                    if (iA19 > 2) {
                        throw new defpackage.era(a.bj(iA19, "lookup type greater than 2 not decodable: "), null, true, 1);
                    }
                    if (iA19 != 1) {
                        if (iA19 != 2) {
                            iN = iN;
                        }
                        i6++;
                        i5 = i8;
                        iN = iN;
                        i = 4;
                        z = true;
                        i4 = 5;
                    } else {
                        i7 = iA19;
                    }
                    evjVar.b(32);
                    evjVar.b(32);
                    int iA20 = evjVar.a(i) + 1;
                    evjVar.b(1);
                    evjVar.b((int) ((i7 == 1 ? iA16 != 0 ? (long) java.lang.Math.floor(java.lang.Math.pow(iA17, 1.0d / ((double) iA16))) : 0L : ((long) iA17) * ((long) iA16)) * ((long) iA20)));
                    i6++;
                    i5 = i8;
                    iN = iN;
                    i = 4;
                    z = true;
                    i4 = 5;
                }
            }
            this.s = jynVar;
            if (jynVar != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                defpackage.fvh fvhVar2 = (defpackage.fvh) jynVar.b;
                arrayList.add(fvhVar2.f);
                arrayList.add(jynVar.d);
                defpackage.eqy eqyVarA = defpackage.fmm.a(aify.o((java.lang.Object[]) ((defpackage.oq) jynVar.a).a));
                defpackage.eqf eqfVar = new defpackage.eqf();
                eqfVar.a("audio/ogg");
                eqfVar.c("audio/vorbis");
                eqfVar.h = fvhVar2.d;
                eqfVar.i = fvhVar2.e;
                eqfVar.F = fvhVar2.c;
                eqfVar.H = fvhVar2.b;
                eqfVar.q = arrayList;
                eqfVar.k = eqyVarA;
                hizVar.b = new defpackage.eqg(eqfVar);
            }
            return true;
        }
        defpackage.hgu.aA(1, etxVar, false);
        etxVar.k();
        int iN2 = etxVar.n();
        int iK = etxVar.k();
        int iJ = etxVar.j();
        int i38 = iJ <= 0 ? -1 : iJ;
        int iJ2 = etxVar.j();
        int i39 = iJ2 <= 0 ? -1 : iJ2;
        etxVar.j();
        int iN3 = etxVar.n();
        int iPow = (int) java.lang.Math.pow(2.0d, iN3 & 15);
        int iPow2 = (int) java.lang.Math.pow(2.0d, (iN3 & 240) >> 4);
        etxVar.n();
        this.r = new defpackage.fvh(iN2, iK, i38, i39, iPow, iPow2, java.util.Arrays.copyOf(etxVar.b, etxVar.d));
        jynVar = null;
        this.s = jynVar;
        if (jynVar != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            defpackage.fvh fvhVar3 = (defpackage.fvh) jynVar.b;
            arrayList2.add(fvhVar3.f);
            arrayList2.add(jynVar.d);
            defpackage.eqy eqyVarA2 = defpackage.fmm.a(aify.o((java.lang.Object[]) ((defpackage.oq) jynVar.a).a));
            defpackage.eqf eqfVar2 = new defpackage.eqf();
            eqfVar2.a("audio/ogg");
            eqfVar2.c("audio/vorbis");
            eqfVar2.h = fvhVar3.d;
            eqfVar2.i = fvhVar3.e;
            eqfVar2.F = fvhVar3.c;
            eqfVar2.H = fvhVar3.b;
            eqfVar2.q = arrayList2;
            eqfVar2.k = eqyVarA2;
            hizVar.b = new defpackage.eqg(eqfVar2);
        }
        return true;
    }

    @Override // defpackage.frc
    protected final void h(long j) {
        super.h(j);
        this.q = j != 0;
        defpackage.fvh fvhVar = this.r;
        this.a = fvhVar != null ? fvhVar.g : 0;
    }
}
