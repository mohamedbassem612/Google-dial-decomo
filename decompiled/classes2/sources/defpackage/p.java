package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class p extends defpackage.s {
    int ag;
    int ah;
    private defpackage.evf at;
    protected final defpackage.l af = new defpackage.l();
    private int am = 0;
    private int an = 0;
    private defpackage.o[] ao = new defpackage.o[4];
    private defpackage.o[] ap = new defpackage.o[4];
    private defpackage.o[] aq = new defpackage.o[4];
    public int ai = 2;
    private final boolean[] ar = new boolean[3];
    private final defpackage.o[] as = new defpackage.o[4];
    public boolean aj = false;
    public boolean ak = false;

    /* JADX WARN: Code duplicated, block: B:92:0x014b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    private final int G(defpackage.l lVar, defpackage.o[] oVarArr, defpackage.o oVar, int i, boolean[] zArr) {
        defpackage.n nVar;
        defpackage.n nVar2;
        boolean z = false;
        zArr[0] = true;
        zArr[1] = false;
        defpackage.o oVar2 = null;
        oVarArr[0] = null;
        oVarArr[2] = null;
        oVarArr[1] = null;
        oVarArr[3] = null;
        int i2 = 8;
        if (i == 0) {
            defpackage.n nVar3 = oVar.i;
            defpackage.n nVar4 = nVar3.b;
            boolean z2 = nVar4 == null || nVar4.a == this;
            oVar.ab = null;
            defpackage.o oVar3 = oVar.K != 8 ? oVar : null;
            defpackage.o oVar4 = oVar;
            int i3 = 0;
            defpackage.o oVar5 = null;
            defpackage.o oVar6 = oVar3;
            while (true) {
                nVar2 = oVar4.k;
                if (nVar2.b == null) {
                    break;
                }
                oVar4.ab = oVar2;
                if (oVar4.K != 8) {
                    if (oVar3 == null) {
                        oVar3 = oVar4;
                    }
                    if (oVar6 != null && oVar6 != oVar4) {
                        oVar6.ab = oVar4;
                    }
                    oVar6 = oVar4;
                } else {
                    defpackage.n nVar5 = oVar4.i;
                    lVar.n(nVar5.f, nVar5.b.f, 0, 5);
                    lVar.n(nVar2.f, nVar5.f, 0, 5);
                }
                if (oVar4.K != 8 && oVar4.ad == 3) {
                    if (oVar4.ae == 3) {
                        zArr[0] = false;
                    }
                    if (oVar4.u <= 0.0f) {
                        zArr[0] = false;
                        int i4 = i3 + 1;
                        defpackage.o[] oVarArr2 = this.ao;
                        int length = oVarArr2.length;
                        if (i4 >= length) {
                            oVarArr2 = (defpackage.o[]) java.util.Arrays.copyOf(oVarArr2, length << 1);
                            this.ao = oVarArr2;
                        }
                        oVarArr2[i3] = oVar4;
                        i3 = i4;
                    }
                }
                defpackage.o oVar7 = nVar2.b.a;
                defpackage.n nVar6 = oVar7.i.b;
                if (nVar6 == null || nVar6.a != oVar4 || oVar7 == oVar4) {
                    break;
                }
                oVar5 = oVar7;
                oVar4 = oVar5;
                oVar2 = null;
            }
            defpackage.n nVar7 = nVar2.b;
            if (nVar7 != null && nVar7.a != this) {
                z2 = false;
            }
            if (nVar3.b == null || oVar5.k.b == null) {
                zArr[1] = true;
            }
            oVar.X = z2;
            oVar5.ab = null;
            oVarArr[0] = oVar;
            oVarArr[2] = oVar3;
            oVarArr[1] = oVar5;
            oVarArr[3] = oVar6;
            return i3;
        }
        defpackage.n nVar8 = oVar.j;
        defpackage.n nVar9 = nVar8.b;
        boolean z3 = nVar9 == null || nVar9.a == this;
        defpackage.o oVar8 = null;
        oVar.ac = null;
        defpackage.o oVar9 = oVar;
        int i5 = 0;
        defpackage.o oVar10 = null;
        defpackage.o oVar11 = oVar.K != 8 ? oVar : null;
        defpackage.o oVar12 = oVar11;
        while (true) {
            nVar = oVar9.l;
            if (nVar.b == null) {
                z = z ? 1 : 0;
                break;
            }
            oVar9.ac = oVar8;
            if (oVar9.K != i2) {
                if (oVar11 == null) {
                    oVar11 = oVar9;
                }
                if (oVar12 != null && oVar12 != oVar9) {
                    oVar12.ac = oVar9;
                }
                oVar12 = oVar9;
            } else {
                defpackage.n nVar10 = oVar9.j;
                lVar.n(nVar10.f, nVar10.b.f, z ? 1 : 0, 5);
                lVar.n(nVar.f, nVar10.f, z ? 1 : 0, 5);
            }
            i2 = 8;
            if (oVar9.K != 8 && oVar9.ae == 3) {
                if (oVar9.ad == 3) {
                    zArr[z ? 1 : 0] = z;
                }
                if (oVar9.u <= 0.0f) {
                    zArr[z ? 1 : 0] = z;
                    int i6 = i5 + 1;
                    defpackage.o[] oVarArr3 = this.ao;
                    int length2 = oVarArr3.length;
                    if (i6 >= length2) {
                        oVarArr3 = (defpackage.o[]) java.util.Arrays.copyOf(oVarArr3, length2 << 1);
                        this.ao = oVarArr3;
                    }
                    oVarArr3[i5] = oVar9;
                    i5 = i6;
                }
            }
            defpackage.o oVar13 = nVar.b.a;
            defpackage.n nVar11 = oVar13.j.b;
            if (nVar11 == null || nVar11.a != oVar9 || oVar13 == oVar9) {
                break;
            }
            oVar10 = oVar13;
            oVar9 = oVar10;
            z = z ? 1 : 0;
            oVar8 = null;
        }
        defpackage.n nVar12 = nVar.b;
        ?? r6 = z3;
        if (nVar12 != null && nVar12.a != this) {
            r6 = z3;
            r6 = z;
        }
        r6 = z3;
        if (nVar8.b == null || oVar10.l.b == null) {
            zArr[1] = true;
        }
        oVar.Y = r6;
        oVar10.ac = null;
        oVarArr[z] = oVar;
        oVarArr[2] = oVar11;
        oVarArr[1] = oVar10;
        oVarArr[3] = oVar12;
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:242:0x0470  */
    /* JADX WARN: Code duplicated, block: B:244:0x0497  */
    /* JADX WARN: Code duplicated, block: B:245:0x049a  */
    /* JADX WARN: Code duplicated, block: B:247:0x049e  */
    /* JADX WARN: Code duplicated, block: B:249:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:250:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:252:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:254:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:255:0x04b3 A[PHI: r4
      0x04b3: PHI (r4v9 o) = (r4v8 o), (r4v20 o) binds: [B:251:0x04a9, B:254:0x04b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:256:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:258:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:260:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:262:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:263:0x04c7 A[PHI: r4
      0x04c7: PHI (r4v13 m) = (r4v12 m), (r4v17 m) binds: [B:259:0x04bd, B:262:0x04c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:264:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:266:0x04cd A[ADDED_TO_REGION] */
    private final void H(defpackage.l lVar) {
        int iG;
        float f;
        float f2;
        defpackage.n nVar;
        float fH;
        defpackage.n nVar2;
        defpackage.o oVar;
        defpackage.o oVar2;
        int i;
        int i2;
        defpackage.n nVar3;
        defpackage.n nVar4;
        defpackage.o oVar3;
        int iA;
        int iA2;
        defpackage.n nVar5;
        defpackage.m mVar;
        defpackage.o oVar4;
        defpackage.m mVar2;
        defpackage.m mVar3;
        defpackage.n nVar6;
        defpackage.n nVar7;
        defpackage.n nVar8;
        int i3;
        defpackage.n nVar9;
        defpackage.n nVar10;
        defpackage.n nVar11;
        defpackage.n nVar12;
        defpackage.o oVar5;
        defpackage.n nVar13;
        defpackage.n nVar14;
        int iA3;
        int i4;
        int i5 = 0;
        while (i5 < this.am) {
            defpackage.o oVar6 = this.aq[i5];
            defpackage.o[] oVarArr = this.as;
            boolean[] zArr = this.ar;
            int iG2 = G(lVar, oVarArr, oVar6, 0, zArr);
            defpackage.p pVar = this;
            defpackage.o[] oVarArr2 = oVarArr;
            defpackage.o oVar7 = oVar6;
            defpackage.o oVar8 = oVarArr2[2];
            if (oVar8 != null) {
                int i6 = 1;
                if (zArr[1]) {
                    int iB = oVar7.b();
                    while (oVar8 != null) {
                        defpackage.n nVar15 = oVar8.i;
                        lVar.h(nVar15.f, iB);
                        defpackage.o oVar9 = oVar8.ab;
                        iB += nVar15.a() + oVar8.h() + oVar8.k.a();
                        oVar8 = oVar9;
                    }
                } else {
                    int i7 = oVar7.V;
                    boolean z = i7 == 0;
                    boolean z2 = i7 == 2;
                    int i8 = pVar.ad;
                    int i9 = pVar.ai;
                    int i10 = 0;
                    int i11 = 3;
                    if ((i9 == 2 || i9 == 8) && zArr[0] && oVar7.X && !z2 && i8 != 2 && i7 == 0) {
                        defpackage.o oVar10 = oVar7;
                        float f3 = 0.0f;
                        int i12 = 0;
                        int iA4 = 0;
                        defpackage.o oVar11 = null;
                        while (oVar10 != null) {
                            if (oVar10.K != 8) {
                                i12++;
                                if (oVar10.ad != 3) {
                                    int iH = iA4 + oVar10.h();
                                    defpackage.n nVar16 = oVar10.i;
                                    int iA5 = iH + (nVar16.b != null ? nVar16.a() : 0);
                                    defpackage.n nVar17 = oVar10.k;
                                    iA4 = iA5 + (nVar17.b != null ? nVar17.a() : 0);
                                } else {
                                    f3 += oVar10.Z;
                                }
                            }
                            defpackage.n nVar18 = oVar10.k.b;
                            defpackage.o oVar12 = nVar18 != null ? nVar18.a : null;
                            if (oVar12 != null && ((nVar2 = oVar12.i.b) == null || nVar2.a != oVar10)) {
                                oVar12 = null;
                            }
                            defpackage.o oVar13 = oVar10;
                            oVar10 = oVar12;
                            oVar11 = oVar13;
                        }
                        int i13 = i12 + 1;
                        if (oVar11 != null) {
                            defpackage.n nVar19 = oVar11.k.b;
                            iG = nVar19 != null ? nVar19.a.w : 0;
                            if (nVar19 != null && nVar19.a == pVar) {
                                iG = pVar.g();
                            }
                        } else {
                            iG = 0;
                        }
                        float f4 = i13;
                        float f5 = iG - iA4;
                        if (iG2 == 0) {
                            f2 = f5 / f4;
                            f = f2;
                        } else {
                            f = f5 / iG2;
                            f2 = 0.0f;
                        }
                        while (oVar7 != null) {
                            defpackage.n nVar20 = oVar7.i;
                            int iA6 = nVar20.b != null ? nVar20.a() : 0;
                            defpackage.n nVar21 = oVar7.k;
                            int iA7 = nVar21.b != null ? nVar21.a() : 0;
                            if (oVar7.K != 8) {
                                float f6 = iA7;
                                float f7 = iA6;
                                float f8 = f2 + f7;
                                lVar.h(nVar20.f, (int) (f8 + 0.5f));
                                if (oVar7.ad == 3) {
                                    fH = (f3 == 0.0f ? f - f7 : ((oVar7.Z * f5) / f3) - f7) - f6;
                                } else {
                                    fH = oVar7.h();
                                }
                                float f9 = f8 + fH;
                                lVar.h(nVar21.f, (int) (f9 + 0.5f));
                                if (iG2 == 0) {
                                    f9 += f;
                                }
                                f2 = f9 + f6;
                            } else {
                                int i14 = (int) ((f2 - (f / 2.0f)) + 0.5f);
                                lVar.h(nVar20.f, i14);
                                lVar.h(nVar21.f, i14);
                            }
                            defpackage.n nVar22 = nVar21.b;
                            defpackage.o oVar14 = nVar22 != null ? nVar22.a : null;
                            oVar7 = (oVar14 == null || (nVar = oVar14.i.b) == null || nVar.a == oVar7) ? oVar14 : null;
                            if (oVar7 == pVar) {
                                oVar7 = null;
                            }
                        }
                    } else {
                        if (iG2 == 0) {
                            oVar = null;
                            oVar2 = null;
                            i = 0;
                        } else if (!z2) {
                            float f10 = 0.0f;
                            defpackage.o oVar15 = null;
                            while (oVar8 != null) {
                                if (oVar8.ad != 3) {
                                    defpackage.n nVar23 = oVar8.i;
                                    int iA8 = nVar23.a();
                                    if (oVar15 != null) {
                                        iA8 += oVar15.k.a();
                                    }
                                    defpackage.n nVar24 = nVar23.b;
                                    lVar.i(nVar23.f, nVar24.f, iA8, nVar24.a.ad == 3 ? 2 : 3);
                                    defpackage.n nVar25 = oVar8.k;
                                    int iA9 = nVar25.a();
                                    defpackage.n nVar26 = nVar25.b.a.i;
                                    defpackage.n nVar27 = nVar26.b;
                                    if (nVar27 != null && nVar27.a == oVar8) {
                                        iA9 += nVar26.a();
                                    }
                                    defpackage.n nVar28 = nVar25.b;
                                    lVar.j(nVar25.f, nVar28.f, -iA9, nVar28.a.ad == 3 ? 2 : 3);
                                    i4 = i10;
                                } else {
                                    f10 += oVar8.Z;
                                    defpackage.n nVar29 = oVar8.k;
                                    if (nVar29.b != null) {
                                        iA3 = nVar29.a();
                                        if (oVar8 != oVarArr2[3]) {
                                            iA3 += nVar29.b.a.i.a();
                                        }
                                    } else {
                                        iA3 = i10;
                                    }
                                    i4 = i10;
                                    lVar.i(nVar29.f, oVar8.i.f, i4, 1);
                                    lVar.j(nVar29.f, nVar29.b.f, -iA3, 1);
                                }
                                defpackage.o oVar16 = oVar8;
                                oVar8 = oVar8.ab;
                                oVar15 = oVar16;
                                i10 = i4;
                            }
                            int i15 = i10;
                            if (iG2 != 1) {
                                int i16 = i15;
                                while (true) {
                                    int i17 = iG2 - 1;
                                    if (i16 >= i17) {
                                        break;
                                    }
                                    defpackage.o[] oVarArr3 = pVar.ao;
                                    defpackage.o oVar17 = oVarArr3[i16];
                                    i16++;
                                    defpackage.o oVar18 = oVarArr3[i16];
                                    defpackage.n nVar30 = oVar17.i;
                                    defpackage.m mVar4 = nVar30.f;
                                    defpackage.n nVar31 = oVar17.k;
                                    int i18 = i6;
                                    defpackage.m mVar5 = nVar31.f;
                                    int i19 = i11;
                                    defpackage.n nVar32 = oVar18.i;
                                    defpackage.m mVar6 = nVar32.f;
                                    int i20 = iG2;
                                    defpackage.n nVar33 = oVar18.k;
                                    int i21 = i5;
                                    defpackage.m mVar7 = nVar33.f;
                                    if (oVar18 == oVarArr2[i19]) {
                                        mVar7 = oVarArr2[i18].k.f;
                                    }
                                    int iA10 = nVar30.a();
                                    defpackage.n nVar34 = nVar30.b;
                                    defpackage.o[] oVarArr4 = oVarArr2;
                                    lVar.i(mVar4, nVar30.b.f, (nVar34 == null || (nVar14 = (nVar13 = nVar34.a.k).b) == null || nVar14.a != oVar17) ? iA10 : iA10 + nVar13.a(), 2);
                                    int iA11 = nVar31.a();
                                    if (nVar31.b != null && (oVar5 = oVar17.ab) != null) {
                                        defpackage.n nVar35 = oVar5.i;
                                        iA11 += nVar35.b != null ? nVar35.a() : 0;
                                    }
                                    lVar.j(mVar5, nVar31.b.f, -iA11, 2);
                                    if (i16 == i17) {
                                        int iA12 = nVar32.a();
                                        defpackage.n nVar36 = nVar32.b;
                                        if (nVar36 != null && (nVar12 = (nVar11 = nVar36.a.k).b) != null && nVar12.a == oVar18) {
                                            iA12 += nVar11.a();
                                        }
                                        lVar.i(mVar6, nVar32.b.f, iA12, 2);
                                        defpackage.n nVar37 = oVar18 == oVarArr4[i19] ? oVarArr4[i18].k : nVar33;
                                        int iA13 = nVar37.a();
                                        defpackage.n nVar38 = nVar37.b;
                                        if (nVar38 != null && (nVar10 = (nVar9 = nVar38.a.i).b) != null && nVar10.a == oVar18) {
                                            iA13 += nVar9.a();
                                        }
                                        i3 = 2;
                                        lVar.j(mVar7, nVar37.b.f, -iA13, 2);
                                    } else {
                                        i3 = 2;
                                    }
                                    int i22 = oVar7.f;
                                    if (i22 > 0) {
                                        lVar.j(mVar5, mVar4, i22, i3);
                                    }
                                    defpackage.j jVarA = lVar.a();
                                    jVarA.f(oVar17.Z, f10, oVar18.Z, mVar4, nVar30.a(), mVar5, nVar31.a(), mVar6, nVar32.a(), mVar7, nVar33.a());
                                    lVar.g(jVarA);
                                    pVar = this;
                                    i6 = i18;
                                    i11 = i19;
                                    iG2 = i20;
                                    i5 = i21;
                                    oVarArr2 = oVarArr4;
                                }
                            } else {
                                defpackage.o oVar19 = pVar.ao[i15];
                                defpackage.n nVar39 = oVar19.i;
                                int iA14 = nVar39.a();
                                defpackage.n nVar40 = nVar39.b;
                                if (nVar40 != null) {
                                    iA14 += nVar40.a();
                                }
                                defpackage.n nVar41 = oVar19.k;
                                int iA15 = nVar41.a();
                                defpackage.n nVar42 = nVar41.b;
                                if (nVar42 != null) {
                                    iA15 += nVar42.a();
                                }
                                defpackage.n nVar43 = oVar7.k;
                                defpackage.m mVar8 = nVar43.b.f;
                                if (oVar19 == oVarArr2[3]) {
                                    mVar8 = oVarArr2[1].k.b.f;
                                }
                                int i23 = -iA15;
                                if (oVar19.c == 1) {
                                    defpackage.n nVar44 = oVar7.i;
                                    lVar.i(nVar44.f, nVar44.b.f, iA14, 1);
                                    lVar.j(nVar43.f, mVar8, i23, 1);
                                    lVar.n(nVar43.f, nVar44.f, oVar7.h(), 2);
                                } else {
                                    lVar.n(nVar39.f, nVar39.b.f, iA14, 1);
                                    lVar.n(nVar41.f, mVar8, i23, 1);
                                }
                            }
                        } else {
                            i = 0;
                            oVar = null;
                            oVar2 = null;
                        }
                        while (oVar8 != null) {
                            defpackage.o oVar20 = oVar8.ab;
                            if (oVar20 == null) {
                                oVar = oVarArr2[i6];
                                i2 = i6;
                            } else {
                                i2 = i;
                            }
                            defpackage.o oVar21 = oVar;
                            if (z2) {
                                defpackage.n nVar45 = oVar8.i;
                                int iA16 = nVar45.a();
                                if (oVar2 != null) {
                                    iA16 += oVar2.k.a();
                                }
                                lVar.i(nVar45.f, nVar45.b.f, iA16, oVar8 != oVar8 ? i11 : i6);
                                int i24 = i11;
                                if (oVar8.ad == i24) {
                                    defpackage.n nVar46 = oVar8.k;
                                    if (oVar8.c == i6) {
                                        lVar.n(nVar46.f, nVar45.f, java.lang.Math.max(oVar8.e, oVar8.h()), i24);
                                    } else {
                                        lVar.i(nVar45.f, nVar45.b.f, nVar45.c, i24);
                                        lVar.j(nVar46.f, nVar45.f, oVar8.e, i24);
                                    }
                                }
                            } else if (z || i2 == 0) {
                                if (z && i2 == 0 && oVar2 == null) {
                                    defpackage.n nVar47 = oVar8.i;
                                    if (nVar47.b == null) {
                                        lVar.h(nVar47.f, oVar8.b());
                                    } else {
                                        lVar.n(nVar47.f, oVar7.i.b.f, nVar47.a(), 5);
                                    }
                                } else {
                                    nVar3 = oVar8.i;
                                    nVar4 = oVar8.k;
                                    oVar3 = oVar2;
                                    iA = nVar3.a();
                                    iA2 = nVar4.a();
                                    lVar.i(nVar3.f, nVar3.b.f, iA, 1);
                                    lVar.j(nVar4.f, nVar4.b.f, -iA2, 1);
                                    nVar5 = nVar3.b;
                                    if (nVar5 != null) {
                                        mVar = nVar5.f;
                                    } else {
                                        mVar = null;
                                    }
                                    if (oVar3 == null) {
                                        nVar8 = oVar7.i.b;
                                        if (nVar8 != null) {
                                            mVar = nVar8.f;
                                        } else {
                                            mVar = null;
                                        }
                                    }
                                    if (oVar20 != null) {
                                        oVar4 = oVar20;
                                    } else {
                                        nVar7 = oVar21.k.b;
                                        if (nVar7 != null) {
                                            oVar20 = nVar7.a;
                                            oVar4 = oVar20;
                                        } else {
                                            oVar4 = null;
                                        }
                                    }
                                    if (oVar4 != null) {
                                        mVar2 = oVar4.i.f;
                                        if (i2 == 0) {
                                            mVar3 = mVar2;
                                        } else {
                                            nVar6 = oVar21.k.b;
                                            if (nVar6 != null) {
                                                mVar2 = nVar6.f;
                                                mVar3 = mVar2;
                                            } else {
                                                mVar3 = null;
                                            }
                                        }
                                        if (mVar != null && mVar3 != null) {
                                            lVar.m(nVar3.f, mVar, iA, 0.5f, mVar3, nVar4.f, iA2);
                                        }
                                    }
                                    oVar20 = oVar4;
                                }
                            } else if (oVar2 != null) {
                                defpackage.n nVar48 = oVar8.k;
                                if (nVar48.b == null) {
                                    lVar.h(nVar48.f, oVar8.b() + oVar8.y);
                                } else {
                                    lVar.n(nVar48.f, oVar21.k.b.f, -nVar48.a(), 5);
                                }
                            } else {
                                oVar2 = null;
                                if (z) {
                                    nVar3 = oVar8.i;
                                    nVar4 = oVar8.k;
                                    oVar3 = oVar2;
                                    iA = nVar3.a();
                                    iA2 = nVar4.a();
                                    lVar.i(nVar3.f, nVar3.b.f, iA, 1);
                                    lVar.j(nVar4.f, nVar4.b.f, -iA2, 1);
                                    nVar5 = nVar3.b;
                                    if (nVar5 != null) {
                                        mVar = nVar5.f;
                                    } else {
                                        mVar = null;
                                    }
                                    if (oVar3 == null) {
                                        nVar8 = oVar7.i.b;
                                        if (nVar8 != null) {
                                            mVar = nVar8.f;
                                        } else {
                                            mVar = null;
                                        }
                                    }
                                    if (oVar20 != null) {
                                        oVar4 = oVar20;
                                    } else {
                                        nVar7 = oVar21.k.b;
                                        if (nVar7 != null) {
                                            oVar20 = nVar7.a;
                                            oVar4 = oVar20;
                                        } else {
                                            oVar4 = null;
                                        }
                                    }
                                    if (oVar4 != null) {
                                        mVar2 = oVar4.i.f;
                                        if (i2 == 0) {
                                            mVar3 = mVar2;
                                        } else {
                                            nVar6 = oVar21.k.b;
                                            if (nVar6 != null) {
                                                mVar2 = nVar6.f;
                                                mVar3 = mVar2;
                                            } else {
                                                mVar3 = null;
                                            }
                                        }
                                        if (mVar != null) {
                                            lVar.m(nVar3.f, mVar, iA, 0.5f, mVar3, nVar4.f, iA2);
                                        }
                                    }
                                    oVar20 = oVar4;
                                } else {
                                    nVar3 = oVar8.i;
                                    nVar4 = oVar8.k;
                                    oVar3 = oVar2;
                                    iA = nVar3.a();
                                    iA2 = nVar4.a();
                                    lVar.i(nVar3.f, nVar3.b.f, iA, 1);
                                    lVar.j(nVar4.f, nVar4.b.f, -iA2, 1);
                                    nVar5 = nVar3.b;
                                    if (nVar5 != null) {
                                        mVar = nVar5.f;
                                    } else {
                                        mVar = null;
                                    }
                                    if (oVar3 == null) {
                                        nVar8 = oVar7.i.b;
                                        if (nVar8 != null) {
                                            mVar = nVar8.f;
                                        } else {
                                            mVar = null;
                                        }
                                    }
                                    if (oVar20 != null) {
                                        oVar4 = oVar20;
                                    } else {
                                        nVar7 = oVar21.k.b;
                                        if (nVar7 != null) {
                                            oVar20 = nVar7.a;
                                            oVar4 = oVar20;
                                        } else {
                                            oVar4 = null;
                                        }
                                    }
                                    if (oVar4 != null) {
                                        mVar2 = oVar4.i.f;
                                        if (i2 == 0) {
                                            mVar3 = mVar2;
                                        } else {
                                            nVar6 = oVar21.k.b;
                                            if (nVar6 != null) {
                                                mVar2 = nVar6.f;
                                                mVar3 = mVar2;
                                            } else {
                                                mVar3 = null;
                                            }
                                        }
                                        if (mVar != null) {
                                            lVar.m(nVar3.f, mVar, iA, 0.5f, mVar3, nVar4.f, iA2);
                                        }
                                    }
                                    oVar20 = oVar4;
                                }
                            }
                            if (1 == i2) {
                                oVar20 = null;
                            }
                            oVar2 = oVar8;
                            i = i2;
                            oVar = oVar21;
                            i6 = 1;
                            i11 = 3;
                            oVar8 = oVar20;
                        }
                        if (z2) {
                            defpackage.n nVar49 = oVar8.i;
                            defpackage.n nVar50 = oVar.k;
                            int iA17 = nVar49.a();
                            int iA18 = nVar50.a();
                            defpackage.n nVar51 = oVar7.i.b;
                            defpackage.m mVar9 = nVar51 != null ? nVar51.f : null;
                            defpackage.n nVar52 = nVar50.b;
                            defpackage.m mVar10 = nVar52 != null ? nVar52.f : null;
                            if (mVar9 != null && mVar10 != null) {
                                lVar.j(nVar50.f, mVar10, -iA18, 1);
                                lVar.m(nVar49.f, mVar9, iA17, oVar7.H, mVar10, nVar50.f, iA18);
                            }
                        }
                    }
                }
                i5 = i5;
            } else {
                i5 = i5;
            }
            i5++;
        }
    }

    final void A(defpackage.o oVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                defpackage.n nVar = oVar.i;
                defpackage.n nVar2 = nVar.b;
                if (nVar2 == null) {
                    break;
                }
                defpackage.o oVar2 = nVar2.a;
                defpackage.n nVar3 = oVar2.k.b;
                if (nVar3 == null || nVar3 != nVar || oVar2 == oVar) {
                    break;
                } else {
                    oVar = oVar2;
                }
            }
            while (true) {
                int i3 = this.am;
                defpackage.o[] oVarArr = this.aq;
                if (i2 >= i3) {
                    int i4 = i3 + 1;
                    int length = oVarArr.length;
                    if (i4 >= length) {
                        oVarArr = (defpackage.o[]) java.util.Arrays.copyOf(oVarArr, length << 1);
                        this.aq = oVarArr;
                    }
                    int i5 = this.am;
                    oVarArr[i5] = oVar;
                    this.am = i5 + 1;
                    return;
                }
                if (oVarArr[i2] == oVar) {
                    return;
                } else {
                    i2++;
                }
            }
        } else {
            while (true) {
                defpackage.n nVar4 = oVar.j;
                defpackage.n nVar5 = nVar4.b;
                if (nVar5 == null) {
                    break;
                }
                defpackage.o oVar3 = nVar5.a;
                defpackage.n nVar6 = oVar3.l.b;
                if (nVar6 == null || nVar6 != nVar4 || oVar3 == oVar) {
                    break;
                } else {
                    oVar = oVar3;
                }
            }
            while (true) {
                int i6 = this.an;
                defpackage.o[] oVarArr2 = this.ap;
                if (i2 >= i6) {
                    int i7 = i6 + 1;
                    int length2 = oVarArr2.length;
                    if (i7 >= length2) {
                        oVarArr2 = (defpackage.o[]) java.util.Arrays.copyOf(oVarArr2, length2 << 1);
                        this.ap = oVarArr2;
                    }
                    int i8 = this.an;
                    oVarArr2[i8] = oVar;
                    this.an = i8 + 1;
                    return;
                }
                if (oVarArr2[i2] == oVar) {
                    return;
                } else {
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0141 A[PHI: r0
      0x0141: PHI (r0v3 int) = (r0v2 int), (r0v2 int), (r0v4 int), (r0v4 int) binds: [B:89:0x00fb, B:91:0x0101, B:108:0x012e, B:112:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    public final void B(defpackage.o oVar, boolean[] zArr) {
        int iA;
        defpackage.o oVar2;
        int iF;
        defpackage.n nVar;
        int iF2;
        boolean z;
        defpackage.n nVar2;
        defpackage.n nVar3;
        defpackage.o oVar3;
        boolean z2 = false;
        i = 0;
        int i = 0;
        z2 = false;
        z2 = false;
        if (oVar.ad == 3 && oVar.ae == 3 && oVar.u > 0.0f) {
            zArr[0] = false;
            return;
        }
        int iF3 = oVar.f();
        if (oVar.ad == 3 && oVar.ae != 3 && oVar.u > 0.0f) {
            zArr[0] = false;
            return;
        }
        oVar.T = true;
        if (oVar instanceof defpackage.q) {
            defpackage.q qVar = (defpackage.q) oVar;
            if (qVar.ai == 1) {
                int i2 = qVar.ag;
                if (i2 != -1) {
                    iA = 0;
                    i = i2;
                } else {
                    int i3 = qVar.ah;
                    if (i3 != -1) {
                        iA = i3;
                    }
                }
            } else {
                i = iF3;
            }
            iA = i;
        } else {
            defpackage.n nVar4 = oVar.k;
            if (nVar4.c() || oVar.i.c()) {
                defpackage.n nVar5 = nVar4.b;
                if (nVar5 != null && (nVar3 = oVar.i.b) != null && (nVar5 == nVar3 || ((oVar3 = nVar5.a) == nVar3.a && oVar3 != oVar.r))) {
                    zArr[0] = false;
                    return;
                }
                defpackage.o oVar4 = null;
                if (nVar5 != null) {
                    iA = nVar4.a() + iF3;
                    oVar2 = nVar5.a;
                    if (!oVar2.s() && !oVar2.T) {
                        B(oVar2, zArr);
                    }
                } else {
                    iA = iF3;
                    oVar2 = null;
                }
                defpackage.n nVar6 = oVar.i;
                defpackage.n nVar7 = nVar6.b;
                if (nVar7 != null) {
                    iF3 += nVar6.a();
                    oVar4 = nVar7.a;
                    if (!oVar4.s() && !oVar4.T) {
                        B(oVar4, zArr);
                    }
                }
                if (nVar4.b != null && !oVar2.s()) {
                    int i4 = nVar4.b.g;
                    if (i4 == 4) {
                        iF2 = oVar2.N - oVar2.f();
                    } else if (i4 == 2) {
                        iF2 = oVar2.N;
                    } else {
                        if (oVar2.Q && (oVar2.i.b == null || oVar2.k.b == null || oVar2.ad == 3)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        oVar.Q = z;
                        if (z && ((nVar2 = oVar2.i.b) == null || nVar2.a != oVar)) {
                            iA += iA - oVar2.N;
                        }
                    }
                    iA += iF2;
                    if (oVar2.Q) {
                        z = true;
                    } else {
                        z = true;
                    }
                    oVar.Q = z;
                    if (z) {
                        iA += iA - oVar2.N;
                    }
                }
                if (nVar6.b == null || oVar4.s()) {
                    i = iF3;
                } else {
                    int i5 = nVar6.b.g;
                    if (i5 == 2) {
                        iF = oVar4.M - oVar4.f();
                    } else if (i5 == 4) {
                        iF = oVar4.M;
                    } else {
                        if (oVar4.P || (oVar4.i.b != null && oVar4.k.b != null && oVar4.ad != 3)) {
                            z2 = true;
                        }
                        oVar.P = z2;
                        if (z2 || ((nVar = oVar4.k.b) != null && nVar.a == oVar)) {
                            i = iF3;
                        } else {
                            i = iF3 + (iF3 - oVar4.M);
                        }
                    }
                    iF3 += iF;
                    if (oVar4.P) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    oVar.P = z2;
                    if (z2) {
                        i = iF3;
                    } else {
                        i = iF3;
                    }
                }
            } else {
                i = iF3 + oVar.w;
                iA = iF3;
            }
        }
        if (oVar.K == 8) {
            int i6 = oVar.s;
            i -= i6;
            iA -= i6;
        }
        oVar.M = i;
        oVar.N = iA;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x016c  */
    /* JADX WARN: Code duplicated, block: B:88:0x011e  */
    public final void C(defpackage.o oVar, boolean[] zArr) {
        int iA;
        defpackage.o oVar2;
        int iE;
        defpackage.n nVar;
        defpackage.n nVar2;
        defpackage.n nVar3;
        int iE2;
        boolean z;
        defpackage.n nVar4;
        defpackage.n nVar5;
        defpackage.n nVar6;
        defpackage.n nVar7;
        defpackage.o oVar3;
        boolean z2 = false;
        i = 0;
        int i = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (oVar.ae == 3 && oVar.ad != 3 && oVar.u > 0.0f) {
            zArr[0] = false;
            return;
        }
        int iE3 = oVar.e();
        oVar.U = true;
        if (oVar instanceof defpackage.q) {
            defpackage.q qVar = (defpackage.q) oVar;
            if (qVar.ai == 0) {
                int i2 = qVar.ag;
                if (i2 != -1) {
                    iA = i2;
                } else {
                    int i3 = qVar.ah;
                    iA = 0;
                    if (i3 != -1) {
                        i = i3;
                    }
                }
            } else {
                i = iE3;
                iA = i;
            }
        } else {
            defpackage.n nVar8 = oVar.m;
            if (nVar8.b == null && oVar.j.b == null && oVar.l.b == null) {
                iA = iE3 + oVar.x;
            } else {
                defpackage.n nVar9 = oVar.l;
                defpackage.n nVar10 = nVar9.b;
                if (nVar10 != null && (nVar7 = oVar.j.b) != null && (nVar10 == nVar7 || ((oVar3 = nVar10.a) == nVar7.a && oVar3 != oVar.r))) {
                    zArr[0] = false;
                    return;
                }
                if (nVar8.c()) {
                    defpackage.o oVar4 = nVar8.b.a;
                    if (!oVar4.U) {
                        C(oVar4, zArr);
                    }
                    int iMax = java.lang.Math.max((oVar4.L - oVar4.t) + iE3, iE3);
                    int iMax2 = java.lang.Math.max((oVar4.O - oVar4.t) + iE3, iE3);
                    if (oVar.K == 8) {
                        int i4 = oVar.t;
                        iMax -= i4;
                        iMax2 -= i4;
                    }
                    oVar.L = iMax;
                    oVar.O = iMax2;
                    return;
                }
                defpackage.n nVar11 = oVar.j;
                defpackage.o oVar5 = null;
                if (nVar11.c()) {
                    oVar2 = nVar11.b.a;
                    iA = nVar11.a() + iE3;
                    if (!oVar2.s() && !oVar2.U) {
                        C(oVar2, zArr);
                    }
                } else {
                    iA = iE3;
                    oVar2 = null;
                }
                if (nVar9.c()) {
                    oVar5 = nVar9.b.a;
                    iE3 += nVar9.a();
                    if (!oVar5.s() && !oVar5.U) {
                        C(oVar5, zArr);
                    }
                }
                if (nVar11.b != null && !oVar2.s()) {
                    int i5 = nVar11.b.g;
                    if (i5 == 3) {
                        iE2 = oVar2.L - oVar2.e();
                    } else if (i5 == 5) {
                        iE2 = oVar2.L;
                    } else {
                        if (oVar2.R && ((nVar5 = oVar2.j.b) == null || nVar5.a == oVar || (nVar6 = oVar2.l.b) == null || nVar6.a == oVar || oVar2.ae == 3)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        oVar.R = z;
                        if (z && ((nVar4 = oVar2.l.b) == null || nVar4.a != oVar)) {
                            iA += iA - oVar2.L;
                        }
                    }
                    iA += iE2;
                    if (oVar2.R) {
                        z = true;
                    } else {
                        z = true;
                    }
                    oVar.R = z;
                    if (z) {
                        iA += iA - oVar2.L;
                    }
                }
                if (nVar9.b != null && !oVar5.s()) {
                    int i6 = nVar9.b.g;
                    if (i6 == 5) {
                        iE = oVar5.O - oVar5.e();
                    } else if (i6 == 3) {
                        iE = oVar5.O;
                    } else {
                        if (oVar5.S || ((nVar2 = oVar5.j.b) != null && nVar2.a != oVar && (nVar3 = oVar5.l.b) != null && nVar3.a != oVar && oVar5.ae != 3)) {
                            z2 = true;
                        }
                        oVar.S = z2;
                        if (!z2 && ((nVar = oVar5.j.b) == null || nVar.a != oVar)) {
                            i = iE3 + (iE3 - oVar5.O);
                        }
                    }
                    iE3 += iE;
                    if (oVar5.S) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    oVar.S = z2;
                    if (!z2) {
                    }
                }
            }
            i = iE3;
        }
        if (oVar.K == 8) {
            int i7 = oVar.t;
            iA -= i7;
            i -= i7;
        }
        oVar.L = iA;
        oVar.O = i;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:141:0x030a A[Catch: Exception -> 0x03bc, TryCatch #3 {Exception -> 0x03bc, blocks: (B:113:0x02af, B:123:0x02c7, B:124:0x02cc, B:129:0x02e1, B:139:0x0306, B:141:0x030a, B:143:0x0319, B:147:0x0328, B:149:0x032c, B:151:0x0336, B:153:0x033e, B:159:0x0358, B:156:0x034a, B:162:0x0367, B:163:0x0378, B:165:0x037c, B:166:0x0386, B:170:0x038e, B:133:0x02ee, B:175:0x03ab, B:177:0x03af, B:167:0x0389), top: B:283:0x02af, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0319 A[Catch: Exception -> 0x03bc, TryCatch #3 {Exception -> 0x03bc, blocks: (B:113:0x02af, B:123:0x02c7, B:124:0x02cc, B:129:0x02e1, B:139:0x0306, B:141:0x030a, B:143:0x0319, B:147:0x0328, B:149:0x032c, B:151:0x0336, B:153:0x033e, B:159:0x0358, B:156:0x034a, B:162:0x0367, B:163:0x0378, B:165:0x037c, B:166:0x0386, B:170:0x038e, B:133:0x02ee, B:175:0x03ab, B:177:0x03af, B:167:0x0389), top: B:283:0x02af, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0324  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v128 */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v19 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v20 */
    /* JADX WARN: Type inference failed for: r25v21 */
    /* JADX WARN: Type inference failed for: r25v22 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v62 */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:146:0x0326
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // defpackage.s
    public final void D() {
        /*
            Method dump skipped, instruction units count: 1471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p.D():void");
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0368  */
    /* JADX WARN: Code duplicated, block: B:132:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:134:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:142:0x040c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x040e  */
    /* JADX WARN: Code duplicated, block: B:151:0x045f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0465  */
    /* JADX WARN: Code duplicated, block: B:155:0x046c  */
    /* JADX WARN: Code duplicated, block: B:156:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:157:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:162:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:164:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:165:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:167:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:168:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:170:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:172:0x051c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0522  */
    /* JADX WARN: Code duplicated, block: B:189:0x0555  */
    /* JADX WARN: Code duplicated, block: B:359:0x07c1 A[PHI: r16
      0x07c1: PHI (r16v6 float) = (r16v5 float), (r16v5 float), (r16v5 float), (r16v5 float), (r16v5 float), (r16v9 float) binds: [B:272:0x06b2, B:274:0x06b6, B:275:0x06b8, B:276:0x06ba, B:277:0x06bc, B:268:0x06a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:458:0x09e3  */
    /* JADX WARN: Code duplicated, block: B:460:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:462:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:464:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:466:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:467:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:470:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:471:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:473:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:474:0x0a21  */
    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    /* JADX WARN: Code duplicated, block: B:480:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:482:0x0a36  */
    /* JADX WARN: Code duplicated, block: B:483:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:484:0x0a5d  */
    /* JADX WARN: Code duplicated, block: B:493:0x0a89 A[DONT_INVERT, PHI: r3
      0x0a89: PHI (r3v17 o) = (r3v15 o), (r3v15 o), (r3v33 o) binds: [B:485:0x0a5e, B:486:0x0a60, B:492:0x0a88] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:494:0x0a8b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:504:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:505:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:507:0x0ae7  */
    /* JADX WARN: Code duplicated, block: B:509:0x0aed  */
    /* JADX WARN: Code duplicated, block: B:510:0x0af0  */
    /* JADX WARN: Code duplicated, block: B:512:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:514:0x0af9  */
    /* JADX WARN: Code duplicated, block: B:515:0x0afd  */
    /* JADX WARN: Code duplicated, block: B:516:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:518:0x0b03  */
    /* JADX WARN: Code duplicated, block: B:520:0x0b09  */
    /* JADX WARN: Code duplicated, block: B:522:0x0b0f  */
    /* JADX WARN: Code duplicated, block: B:523:0x0b12  */
    /* JADX WARN: Code duplicated, block: B:525:0x0b15 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:527:0x0b2c  */
    /* JADX WARN: Code duplicated, block: B:52:0x015c  */
    /* JADX WARN: Code duplicated, block: B:530:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:533:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:535:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:536:0x0b54  */
    /* JADX WARN: Code duplicated, block: B:539:0x0b59  */
    /* JADX WARN: Code duplicated, block: B:540:0x0b5d  */
    /* JADX WARN: Code duplicated, block: B:54:0x015f  */
    /* JADX WARN: Code duplicated, block: B:554:0x0b78 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x0b36 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0198  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x01d2 A[ADDED_TO_REGION] */
    public final boolean E(defpackage.l lVar) {
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        defpackage.n nVar;
        defpackage.n nVar2;
        defpackage.n nVar3;
        defpackage.n nVar4;
        int i5;
        defpackage.q qVar;
        int i6;
        int i7;
        float fD;
        int iD;
        int i8;
        defpackage.n nVar5;
        float fH;
        int iH;
        int i9;
        float f2;
        int iA;
        float f3;
        float f4;
        defpackage.n nVar6;
        defpackage.n nVar7;
        defpackage.o oVar;
        boolean z;
        defpackage.o oVar2;
        defpackage.o oVar3;
        defpackage.n nVar8;
        defpackage.m mVar;
        defpackage.n nVar9;
        defpackage.m mVar2;
        defpackage.o oVar4;
        defpackage.o oVar5;
        boolean z2;
        defpackage.n nVar10;
        defpackage.m mVar3;
        defpackage.o oVar6;
        defpackage.o oVar7;
        defpackage.m mVar4;
        defpackage.n nVar11;
        defpackage.n nVar12;
        defpackage.n nVar13;
        defpackage.n nVar14;
        int iA2;
        int i10;
        defpackage.n nVar15;
        defpackage.n nVar16;
        defpackage.n nVar17;
        defpackage.m mVar5;
        defpackage.m mVar6;
        defpackage.n nVar18;
        int i11;
        defpackage.n nVar19;
        defpackage.n nVar20;
        defpackage.n nVar21;
        defpackage.n nVar22;
        defpackage.o oVar8;
        defpackage.n nVar23;
        defpackage.n nVar24;
        int i12;
        int iA3;
        defpackage.p pVar = this;
        defpackage.l lVar2 = lVar;
        x(lVar);
        java.util.ArrayList arrayList = pVar.al;
        int size = arrayList.size();
        int i13 = pVar.ai;
        int i14 = 4;
        int i15 = 3;
        int i16 = 1;
        int i17 = 2;
        if (i13 == 2 || i13 == 4) {
            int size2 = arrayList.size();
            int i18 = 0;
            while (true) {
                i = -1;
                if (i18 >= size2) {
                    break;
                }
                defpackage.o oVar9 = (defpackage.o) arrayList.get(i18);
                oVar9.a = -1;
                oVar9.b = -1;
                if (oVar9.ad == 3 || oVar9.ae == 3) {
                    oVar9.a = 1;
                    oVar9.b = 1;
                }
                i18++;
            }
            boolean z3 = false;
            int i19 = 0;
            int i20 = 0;
            while (!z3) {
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < size2) {
                    defpackage.o oVar10 = (defpackage.o) arrayList.get(i21);
                    if (oVar10.a != i) {
                        i3 = i17;
                    } else {
                        int i24 = pVar.ad;
                        if (i24 == i17 || (i8 = oVar10.ad) == i15) {
                            oVar10.a = i16;
                        } else if (i24 == i17 || i8 != i14) {
                            defpackage.n nVar25 = oVar10.i;
                            defpackage.n nVar26 = nVar25.b;
                            if (nVar26 == null) {
                                defpackage.n nVar27 = oVar10.k;
                                nVar5 = nVar27.b;
                                if (nVar5 == null && nVar5.a == pVar) {
                                    nVar25.f = lVar2.e(nVar25);
                                    nVar27.f = lVar2.e(nVar27);
                                    int iH2 = pVar.h() - nVar27.a();
                                    int iH3 = iH2 - oVar10.h();
                                    lVar2.h(nVar25.f, iH3);
                                    lVar2.h(nVar27.f, iH2);
                                    i17 = 2;
                                    oVar10.a = 2;
                                    oVar10.k(iH3, iH2);
                                } else if (nVar26 == null && nVar26.a.a == 2) {
                                    defpackage.m mVar7 = nVar26.f;
                                    nVar25.f = lVar2.e(nVar25);
                                    nVar27.f = lVar2.e(nVar27);
                                    int iA4 = (int) (mVar7.d + nVar25.a() + 0.5f);
                                    int iH4 = oVar10.h() + iA4;
                                    lVar2.h(nVar25.f, iA4);
                                    lVar2.h(nVar27.f, iH4);
                                    i17 = 2;
                                    oVar10.a = 2;
                                    oVar10.k(iA4, iH4);
                                } else {
                                    if (nVar5 == null && nVar5.a.a == 2) {
                                        defpackage.m mVar8 = nVar5.f;
                                        nVar25.f = lVar2.e(nVar25);
                                        nVar27.f = lVar2.e(nVar27);
                                        int iA5 = (int) ((mVar8.d - nVar27.a()) + 0.5f);
                                        int iH5 = iA5 - oVar10.h();
                                        lVar2.h(nVar25.f, iH5);
                                        lVar2.h(nVar27.f, iA5);
                                        oVar10.a = 2;
                                        oVar10.k(iH5, iA5);
                                    } else if (nVar26 != null && nVar5 == null) {
                                        if (oVar10 instanceof defpackage.q) {
                                            defpackage.q qVar2 = (defpackage.q) oVar10;
                                            if (qVar2.ai == 1) {
                                                nVar25.f = lVar2.e(nVar25);
                                                nVar27.f = lVar2.e(nVar27);
                                                int i25 = qVar2.ag;
                                                if (i25 != -1) {
                                                    fH = i25;
                                                } else {
                                                    int i26 = qVar2.ah;
                                                    fH = i26 != -1 ? pVar.h() - i26 : qVar2.af * pVar.h();
                                                }
                                                int i27 = (int) (fH + 0.5f);
                                                lVar2.h(nVar25.f, i27);
                                                lVar2.h(nVar27.f, i27);
                                                oVar10.a = 2;
                                                oVar10.b = 2;
                                                oVar10.k(i27, i27);
                                                oVar10.o(0, pVar.d());
                                            }
                                        } else {
                                            nVar25.f = lVar2.e(nVar25);
                                            nVar27.f = lVar2.e(nVar27);
                                            int i28 = oVar10.w;
                                            int iH6 = oVar10.h() + i28;
                                            lVar2.h(nVar25.f, i28);
                                            lVar2.h(nVar27.f, iH6);
                                            i3 = 2;
                                            oVar10.a = 2;
                                        }
                                    }
                                    i3 = 2;
                                }
                            } else {
                                defpackage.n nVar28 = oVar10.k;
                                defpackage.n nVar29 = nVar28.b;
                                if (nVar29 != null) {
                                    if (nVar26.a == pVar && nVar29.a == pVar) {
                                        int iA6 = nVar25.a();
                                        int iA7 = nVar28.a();
                                        if (pVar.ad == i15) {
                                            iH = pVar.h() - iA7;
                                        } else {
                                            iA6 += (int) (((((pVar.h() - iA6) - iA7) - oVar10.h()) * oVar10.H) + 0.5f);
                                            iH = iA6 + oVar10.h();
                                        }
                                        nVar25.f = lVar2.e(nVar25);
                                        nVar28.f = lVar2.e(nVar28);
                                        lVar2.h(nVar25.f, iA6);
                                        lVar2.h(nVar28.f, iH);
                                        oVar10.a = 2;
                                        oVar10.k(iA6, iH);
                                    } else {
                                        oVar10.a = 1;
                                    }
                                } else if (nVar26.a == pVar) {
                                    int iA8 = nVar25.a();
                                    int iH7 = oVar10.h() + iA8;
                                    nVar25.f = lVar2.e(nVar25);
                                    defpackage.n nVar30 = oVar10.k;
                                    nVar30.f = lVar2.e(nVar30);
                                    lVar2.h(nVar25.f, iA8);
                                    lVar2.h(nVar30.f, iH7);
                                    oVar10.a = 2;
                                    oVar10.k(iA8, iH7);
                                } else {
                                    defpackage.n nVar210 = oVar10.k;
                                    nVar5 = nVar210.b;
                                    if (nVar5 == null) {
                                        if (nVar26 == null) {
                                        }
                                        if (nVar5 == null) {
                                            if (nVar26 != null) {
                                            }
                                        } else if (nVar26 != null) {
                                        }
                                    } else {
                                        if (nVar26 == null) {
                                        }
                                        if (nVar5 == null) {
                                            if (nVar26 != null) {
                                            }
                                        } else if (nVar26 != null) {
                                        }
                                    }
                                }
                                i3 = 2;
                            }
                        } else {
                            defpackage.n nVar31 = oVar10.i;
                            nVar31.f = lVar2.e(nVar31);
                            defpackage.n nVar32 = oVar10.k;
                            nVar32.f = lVar2.e(nVar32);
                            int i29 = nVar31.c;
                            int iH8 = pVar.h() - nVar32.c;
                            lVar2.h(nVar31.f, i29);
                            lVar2.h(nVar32.f, iH8);
                            oVar10.k(i29, iH8);
                            oVar10.a = i17;
                        }
                        i3 = i17;
                    }
                    if (oVar10.b == -1) {
                        int i30 = pVar.ae;
                        if (i30 == i3 || (i4 = oVar10.ae) == 3) {
                            oVar10.b = 1;
                        } else if (i30 == i3 || i4 != 4) {
                            defpackage.n nVar33 = oVar10.j;
                            defpackage.n nVar34 = nVar33.b;
                            if (nVar34 == null) {
                                nVar = oVar10.l;
                                nVar2 = nVar.b;
                                if (nVar2 == null && nVar2.a == pVar) {
                                    nVar33.f = lVar2.e(nVar33);
                                    nVar.f = lVar2.e(nVar);
                                    int iD2 = pVar.d() - nVar.a();
                                    int iD3 = iD2 - oVar10.d();
                                    lVar2.h(nVar33.f, iD3);
                                    lVar2.h(nVar.f, iD2);
                                    if (oVar10.C > 0 || oVar10.K == 8) {
                                        defpackage.n nVar35 = oVar10.m;
                                        nVar35.f = lVar2.e(nVar35);
                                        lVar2.h(nVar35.f, oVar10.C + iD3);
                                    }
                                    oVar10.b = 2;
                                    oVar10.o(iD3, iD2);
                                } else if (nVar34 == null && nVar34.a.b == 2) {
                                    defpackage.m mVar9 = nVar34.f;
                                    nVar33.f = lVar2.e(nVar33);
                                    nVar.f = lVar2.e(nVar);
                                    int iA9 = (int) (mVar9.d + nVar33.a() + 0.5f);
                                    int iD4 = oVar10.d() + iA9;
                                    lVar2.h(nVar33.f, iA9);
                                    lVar2.h(nVar.f, iD4);
                                    if (oVar10.C > 0 || oVar10.K == 8) {
                                        defpackage.n nVar36 = oVar10.m;
                                        nVar36.f = lVar2.e(nVar36);
                                        lVar2.h(nVar36.f, oVar10.C + iA9);
                                    }
                                    oVar10.b = 2;
                                    oVar10.o(iA9, iD4);
                                } else if (nVar2 == null && nVar2.a.b == 2) {
                                    defpackage.m mVar10 = nVar2.f;
                                    nVar33.f = lVar2.e(nVar33);
                                    nVar.f = lVar2.e(nVar);
                                    int iA10 = (int) ((mVar10.d - nVar.a()) + 0.5f);
                                    int iD5 = iA10 - oVar10.d();
                                    lVar2.h(nVar33.f, iD5);
                                    lVar2.h(nVar.f, iA10);
                                    if (oVar10.C > 0 || oVar10.K == 8) {
                                        defpackage.n nVar37 = oVar10.m;
                                        nVar37.f = lVar2.e(nVar37);
                                        lVar2.h(nVar37.f, oVar10.C + iD5);
                                    }
                                    oVar10.b = 2;
                                    oVar10.o(iD5, iA10);
                                } else {
                                    nVar3 = oVar10.m;
                                    nVar4 = nVar3.b;
                                    if (nVar4 != null) {
                                        if (nVar4.a.b == 2) {
                                            defpackage.m mVar11 = nVar4.f;
                                            nVar33.f = lVar2.e(nVar33);
                                            nVar.f = lVar2.e(nVar);
                                            int i31 = (int) ((mVar11.d - oVar10.C) + 0.5f);
                                            int iD6 = oVar10.d() + i31;
                                            lVar2.h(nVar33.f, i31);
                                            lVar2.h(nVar.f, iD6);
                                            nVar3.f = lVar2.e(nVar3);
                                            lVar2.h(nVar3.f, oVar10.C + i31);
                                            oVar10.b = 2;
                                            oVar10.o(i31, iD6);
                                        }
                                    } else if (nVar34 == null && nVar2 == null) {
                                        if (oVar10 instanceof defpackage.q) {
                                            qVar = (defpackage.q) oVar10;
                                            if (qVar.ai == 0) {
                                                nVar33.f = lVar2.e(nVar33);
                                                nVar.f = lVar2.e(nVar);
                                                i6 = qVar.ag;
                                                if (i6 != -1) {
                                                    fD = i6;
                                                } else {
                                                    i7 = qVar.ah;
                                                    if (i7 != -1) {
                                                        fD = pVar.d() - i7;
                                                    } else {
                                                        fD = qVar.af * pVar.d();
                                                    }
                                                }
                                                int i32 = (int) (fD + 0.5f);
                                                lVar2.h(nVar33.f, i32);
                                                lVar2.h(nVar.f, i32);
                                                oVar10.b = 2;
                                                oVar10.a = 2;
                                                oVar10.o(i32, i32);
                                                oVar10.k(0, pVar.h());
                                            }
                                        } else {
                                            nVar33.f = lVar2.e(nVar33);
                                            nVar.f = lVar2.e(nVar);
                                            i5 = oVar10.x;
                                            int iD7 = oVar10.d() + i5;
                                            lVar2.h(nVar33.f, i5);
                                            lVar2.h(nVar.f, iD7);
                                            if (oVar10.C <= 0 || oVar10.K == 8) {
                                                nVar3.f = lVar2.e(nVar3);
                                                lVar2.h(nVar3.f, i5 + oVar10.C);
                                            }
                                            oVar10.b = 2;
                                        }
                                    }
                                }
                            } else {
                                defpackage.n nVar38 = oVar10.l;
                                defpackage.n nVar39 = nVar38.b;
                                if (nVar39 != null) {
                                    if (nVar34.a == pVar && nVar39.a == pVar) {
                                        int iA11 = nVar33.a();
                                        int iA12 = nVar38.a();
                                        if (pVar.ae == 3) {
                                            iD = oVar10.d();
                                        } else {
                                            float fD2 = iA11 + ((((pVar.d() - iA11) - iA12) - oVar10.d()) * oVar10.I) + 0.5f;
                                            iD = oVar10.d();
                                            iA11 = (int) fD2;
                                        }
                                        int i33 = iD + iA11;
                                        nVar33.f = lVar2.e(nVar33);
                                        nVar38.f = lVar2.e(nVar38);
                                        lVar2.h(nVar33.f, iA11);
                                        lVar2.h(nVar38.f, i33);
                                        if (oVar10.C > 0 || oVar10.K == 8) {
                                            defpackage.n nVar40 = oVar10.m;
                                            nVar40.f = lVar2.e(nVar40);
                                            lVar2.h(nVar40.f, oVar10.C + iA11);
                                        }
                                        oVar10.b = 2;
                                        oVar10.o(iA11, i33);
                                    } else {
                                        oVar10.b = 1;
                                    }
                                } else if (nVar34.a == pVar) {
                                    int iA13 = nVar33.a();
                                    int iD8 = oVar10.d() + iA13;
                                    nVar33.f = lVar2.e(nVar33);
                                    defpackage.n nVar41 = oVar10.l;
                                    nVar41.f = lVar2.e(nVar41);
                                    lVar2.h(nVar33.f, iA13);
                                    lVar2.h(nVar41.f, iD8);
                                    if (oVar10.C > 0 || oVar10.K == 8) {
                                        defpackage.n nVar42 = oVar10.m;
                                        nVar42.f = lVar2.e(nVar42);
                                        lVar2.h(nVar42.f, oVar10.C + iA13);
                                    }
                                    oVar10.b = 2;
                                    oVar10.o(iA13, iD8);
                                } else {
                                    nVar = oVar10.l;
                                    nVar2 = nVar.b;
                                    if (nVar2 == null) {
                                        if (nVar34 == null) {
                                            if (nVar2 == null) {
                                                nVar3 = oVar10.m;
                                                nVar4 = nVar3.b;
                                                if (nVar4 != null) {
                                                    if (nVar4.a.b == 2) {
                                                        defpackage.m mVar12 = nVar4.f;
                                                        nVar33.f = lVar2.e(nVar33);
                                                        nVar.f = lVar2.e(nVar);
                                                        int i34 = (int) ((mVar12.d - oVar10.C) + 0.5f);
                                                        int iD9 = oVar10.d() + i34;
                                                        lVar2.h(nVar33.f, i34);
                                                        lVar2.h(nVar.f, iD9);
                                                        nVar3.f = lVar2.e(nVar3);
                                                        lVar2.h(nVar3.f, oVar10.C + i34);
                                                        oVar10.b = 2;
                                                        oVar10.o(i34, iD9);
                                                    }
                                                } else if (nVar34 == null) {
                                                    if (oVar10 instanceof defpackage.q) {
                                                        qVar = (defpackage.q) oVar10;
                                                        if (qVar.ai == 0) {
                                                            nVar33.f = lVar2.e(nVar33);
                                                            nVar.f = lVar2.e(nVar);
                                                            i6 = qVar.ag;
                                                            if (i6 != -1) {
                                                                fD = i6;
                                                            } else {
                                                                i7 = qVar.ah;
                                                                if (i7 != -1) {
                                                                    fD = pVar.d() - i7;
                                                                } else {
                                                                    fD = qVar.af * pVar.d();
                                                                }
                                                            }
                                                            int i35 = (int) (fD + 0.5f);
                                                            lVar2.h(nVar33.f, i35);
                                                            lVar2.h(nVar.f, i35);
                                                            oVar10.b = 2;
                                                            oVar10.a = 2;
                                                            oVar10.o(i35, i35);
                                                            oVar10.k(0, pVar.h());
                                                        }
                                                    } else {
                                                        nVar33.f = lVar2.e(nVar33);
                                                        nVar.f = lVar2.e(nVar);
                                                        i5 = oVar10.x;
                                                        int iD10 = oVar10.d() + i5;
                                                        lVar2.h(nVar33.f, i5);
                                                        lVar2.h(nVar.f, iD10);
                                                        if (oVar10.C <= 0) {
                                                            nVar3.f = lVar2.e(nVar3);
                                                            lVar2.h(nVar3.f, i5 + oVar10.C);
                                                        } else {
                                                            nVar3.f = lVar2.e(nVar3);
                                                            lVar2.h(nVar3.f, i5 + oVar10.C);
                                                        }
                                                        oVar10.b = 2;
                                                    }
                                                }
                                            } else {
                                                nVar3 = oVar10.m;
                                                nVar4 = nVar3.b;
                                                if (nVar4 != null) {
                                                    if (nVar4.a.b == 2) {
                                                        defpackage.m mVar13 = nVar4.f;
                                                        nVar33.f = lVar2.e(nVar33);
                                                        nVar.f = lVar2.e(nVar);
                                                        int i36 = (int) ((mVar13.d - oVar10.C) + 0.5f);
                                                        int iD11 = oVar10.d() + i36;
                                                        lVar2.h(nVar33.f, i36);
                                                        lVar2.h(nVar.f, iD11);
                                                        nVar3.f = lVar2.e(nVar3);
                                                        lVar2.h(nVar3.f, oVar10.C + i36);
                                                        oVar10.b = 2;
                                                        oVar10.o(i36, iD11);
                                                    }
                                                } else if (nVar34 == null) {
                                                    if (oVar10 instanceof defpackage.q) {
                                                        qVar = (defpackage.q) oVar10;
                                                        if (qVar.ai == 0) {
                                                            nVar33.f = lVar2.e(nVar33);
                                                            nVar.f = lVar2.e(nVar);
                                                            i6 = qVar.ag;
                                                            if (i6 != -1) {
                                                                fD = i6;
                                                            } else {
                                                                i7 = qVar.ah;
                                                                if (i7 != -1) {
                                                                    fD = pVar.d() - i7;
                                                                } else {
                                                                    fD = qVar.af * pVar.d();
                                                                }
                                                            }
                                                            int i37 = (int) (fD + 0.5f);
                                                            lVar2.h(nVar33.f, i37);
                                                            lVar2.h(nVar.f, i37);
                                                            oVar10.b = 2;
                                                            oVar10.a = 2;
                                                            oVar10.o(i37, i37);
                                                            oVar10.k(0, pVar.h());
                                                        }
                                                    } else {
                                                        nVar33.f = lVar2.e(nVar33);
                                                        nVar.f = lVar2.e(nVar);
                                                        i5 = oVar10.x;
                                                        int iD12 = oVar10.d() + i5;
                                                        lVar2.h(nVar33.f, i5);
                                                        lVar2.h(nVar.f, iD12);
                                                        if (oVar10.C <= 0) {
                                                            nVar3.f = lVar2.e(nVar3);
                                                            lVar2.h(nVar3.f, i5 + oVar10.C);
                                                        } else {
                                                            nVar3.f = lVar2.e(nVar3);
                                                            lVar2.h(nVar3.f, i5 + oVar10.C);
                                                        }
                                                        oVar10.b = 2;
                                                    }
                                                }
                                            }
                                        } else if (nVar2 == null) {
                                            nVar3 = oVar10.m;
                                            nVar4 = nVar3.b;
                                            if (nVar4 != null) {
                                                if (nVar4.a.b == 2) {
                                                    defpackage.m mVar14 = nVar4.f;
                                                    nVar33.f = lVar2.e(nVar33);
                                                    nVar.f = lVar2.e(nVar);
                                                    int i38 = (int) ((mVar14.d - oVar10.C) + 0.5f);
                                                    int iD13 = oVar10.d() + i38;
                                                    lVar2.h(nVar33.f, i38);
                                                    lVar2.h(nVar.f, iD13);
                                                    nVar3.f = lVar2.e(nVar3);
                                                    lVar2.h(nVar3.f, oVar10.C + i38);
                                                    oVar10.b = 2;
                                                    oVar10.o(i38, iD13);
                                                }
                                            } else if (nVar34 == null) {
                                                if (oVar10 instanceof defpackage.q) {
                                                    qVar = (defpackage.q) oVar10;
                                                    if (qVar.ai == 0) {
                                                        nVar33.f = lVar2.e(nVar33);
                                                        nVar.f = lVar2.e(nVar);
                                                        i6 = qVar.ag;
                                                        if (i6 != -1) {
                                                            fD = i6;
                                                        } else {
                                                            i7 = qVar.ah;
                                                            if (i7 != -1) {
                                                                fD = pVar.d() - i7;
                                                            } else {
                                                                fD = qVar.af * pVar.d();
                                                            }
                                                        }
                                                        int i39 = (int) (fD + 0.5f);
                                                        lVar2.h(nVar33.f, i39);
                                                        lVar2.h(nVar.f, i39);
                                                        oVar10.b = 2;
                                                        oVar10.a = 2;
                                                        oVar10.o(i39, i39);
                                                        oVar10.k(0, pVar.h());
                                                    }
                                                } else {
                                                    nVar33.f = lVar2.e(nVar33);
                                                    nVar.f = lVar2.e(nVar);
                                                    i5 = oVar10.x;
                                                    int iD14 = oVar10.d() + i5;
                                                    lVar2.h(nVar33.f, i5);
                                                    lVar2.h(nVar.f, iD14);
                                                    if (oVar10.C <= 0) {
                                                        nVar3.f = lVar2.e(nVar3);
                                                        lVar2.h(nVar3.f, i5 + oVar10.C);
                                                    } else {
                                                        nVar3.f = lVar2.e(nVar3);
                                                        lVar2.h(nVar3.f, i5 + oVar10.C);
                                                    }
                                                    oVar10.b = 2;
                                                }
                                            }
                                        } else {
                                            nVar3 = oVar10.m;
                                            nVar4 = nVar3.b;
                                            if (nVar4 != null) {
                                                if (nVar4.a.b == 2) {
                                                    defpackage.m mVar15 = nVar4.f;
                                                    nVar33.f = lVar2.e(nVar33);
                                                    nVar.f = lVar2.e(nVar);
                                                    int i310 = (int) ((mVar15.d - oVar10.C) + 0.5f);
                                                    int iD15 = oVar10.d() + i310;
                                                    lVar2.h(nVar33.f, i310);
                                                    lVar2.h(nVar.f, iD15);
                                                    nVar3.f = lVar2.e(nVar3);
                                                    lVar2.h(nVar3.f, oVar10.C + i310);
                                                    oVar10.b = 2;
                                                    oVar10.o(i310, iD15);
                                                }
                                            } else if (nVar34 == null) {
                                                if (oVar10 instanceof defpackage.q) {
                                                    qVar = (defpackage.q) oVar10;
                                                    if (qVar.ai == 0) {
                                                        nVar33.f = lVar2.e(nVar33);
                                                        nVar.f = lVar2.e(nVar);
                                                        i6 = qVar.ag;
                                                        if (i6 != -1) {
                                                            fD = i6;
                                                        } else {
                                                            i7 = qVar.ah;
                                                            if (i7 != -1) {
                                                                fD = pVar.d() - i7;
                                                            } else {
                                                                fD = qVar.af * pVar.d();
                                                            }
                                                        }
                                                        int i311 = (int) (fD + 0.5f);
                                                        lVar2.h(nVar33.f, i311);
                                                        lVar2.h(nVar.f, i311);
                                                        oVar10.b = 2;
                                                        oVar10.a = 2;
                                                        oVar10.o(i311, i311);
                                                        oVar10.k(0, pVar.h());
                                                    }
                                                } else {
                                                    nVar33.f = lVar2.e(nVar33);
                                                    nVar.f = lVar2.e(nVar);
                                                    i5 = oVar10.x;
                                                    int iD16 = oVar10.d() + i5;
                                                    lVar2.h(nVar33.f, i5);
                                                    lVar2.h(nVar.f, iD16);
                                                    if (oVar10.C <= 0) {
                                                        nVar3.f = lVar2.e(nVar3);
                                                        lVar2.h(nVar3.f, i5 + oVar10.C);
                                                    } else {
                                                        nVar3.f = lVar2.e(nVar3);
                                                        lVar2.h(nVar3.f, i5 + oVar10.C);
                                                    }
                                                    oVar10.b = 2;
                                                }
                                            }
                                        }
                                    } else if (nVar34 == null) {
                                        if (nVar2 == null) {
                                            nVar3 = oVar10.m;
                                            nVar4 = nVar3.b;
                                            if (nVar4 != null) {
                                                if (nVar4.a.b == 2) {
                                                    defpackage.m mVar16 = nVar4.f;
                                                    nVar33.f = lVar2.e(nVar33);
                                                    nVar.f = lVar2.e(nVar);
                                                    int i312 = (int) ((mVar16.d - oVar10.C) + 0.5f);
                                                    int iD17 = oVar10.d() + i312;
                                                    lVar2.h(nVar33.f, i312);
                                                    lVar2.h(nVar.f, iD17);
                                                    nVar3.f = lVar2.e(nVar3);
                                                    lVar2.h(nVar3.f, oVar10.C + i312);
                                                    oVar10.b = 2;
                                                    oVar10.o(i312, iD17);
                                                }
                                            } else if (nVar34 == null) {
                                                if (oVar10 instanceof defpackage.q) {
                                                    qVar = (defpackage.q) oVar10;
                                                    if (qVar.ai == 0) {
                                                        nVar33.f = lVar2.e(nVar33);
                                                        nVar.f = lVar2.e(nVar);
                                                        i6 = qVar.ag;
                                                        if (i6 != -1) {
                                                            fD = i6;
                                                        } else {
                                                            i7 = qVar.ah;
                                                            if (i7 != -1) {
                                                                fD = pVar.d() - i7;
                                                            } else {
                                                                fD = qVar.af * pVar.d();
                                                            }
                                                        }
                                                        int i313 = (int) (fD + 0.5f);
                                                        lVar2.h(nVar33.f, i313);
                                                        lVar2.h(nVar.f, i313);
                                                        oVar10.b = 2;
                                                        oVar10.a = 2;
                                                        oVar10.o(i313, i313);
                                                        oVar10.k(0, pVar.h());
                                                    }
                                                } else {
                                                    nVar33.f = lVar2.e(nVar33);
                                                    nVar.f = lVar2.e(nVar);
                                                    i5 = oVar10.x;
                                                    int iD18 = oVar10.d() + i5;
                                                    lVar2.h(nVar33.f, i5);
                                                    lVar2.h(nVar.f, iD18);
                                                    if (oVar10.C <= 0) {
                                                        nVar3.f = lVar2.e(nVar3);
                                                        lVar2.h(nVar3.f, i5 + oVar10.C);
                                                    } else {
                                                        nVar3.f = lVar2.e(nVar3);
                                                        lVar2.h(nVar3.f, i5 + oVar10.C);
                                                    }
                                                    oVar10.b = 2;
                                                }
                                            }
                                        } else {
                                            nVar3 = oVar10.m;
                                            nVar4 = nVar3.b;
                                            if (nVar4 != null) {
                                                if (nVar4.a.b == 2) {
                                                    defpackage.m mVar17 = nVar4.f;
                                                    nVar33.f = lVar2.e(nVar33);
                                                    nVar.f = lVar2.e(nVar);
                                                    int i314 = (int) ((mVar17.d - oVar10.C) + 0.5f);
                                                    int iD19 = oVar10.d() + i314;
                                                    lVar2.h(nVar33.f, i314);
                                                    lVar2.h(nVar.f, iD19);
                                                    nVar3.f = lVar2.e(nVar3);
                                                    lVar2.h(nVar3.f, oVar10.C + i314);
                                                    oVar10.b = 2;
                                                    oVar10.o(i314, iD19);
                                                }
                                            } else if (nVar34 == null) {
                                                if (oVar10 instanceof defpackage.q) {
                                                    qVar = (defpackage.q) oVar10;
                                                    if (qVar.ai == 0) {
                                                        nVar33.f = lVar2.e(nVar33);
                                                        nVar.f = lVar2.e(nVar);
                                                        i6 = qVar.ag;
                                                        if (i6 != -1) {
                                                            fD = i6;
                                                        } else {
                                                            i7 = qVar.ah;
                                                            if (i7 != -1) {
                                                                fD = pVar.d() - i7;
                                                            } else {
                                                                fD = qVar.af * pVar.d();
                                                            }
                                                        }
                                                        int i315 = (int) (fD + 0.5f);
                                                        lVar2.h(nVar33.f, i315);
                                                        lVar2.h(nVar.f, i315);
                                                        oVar10.b = 2;
                                                        oVar10.a = 2;
                                                        oVar10.o(i315, i315);
                                                        oVar10.k(0, pVar.h());
                                                    }
                                                } else {
                                                    nVar33.f = lVar2.e(nVar33);
                                                    nVar.f = lVar2.e(nVar);
                                                    i5 = oVar10.x;
                                                    int iD110 = oVar10.d() + i5;
                                                    lVar2.h(nVar33.f, i5);
                                                    lVar2.h(nVar.f, iD110);
                                                    if (oVar10.C <= 0) {
                                                        nVar3.f = lVar2.e(nVar3);
                                                        lVar2.h(nVar3.f, i5 + oVar10.C);
                                                    } else {
                                                        nVar3.f = lVar2.e(nVar3);
                                                        lVar2.h(nVar3.f, i5 + oVar10.C);
                                                    }
                                                    oVar10.b = 2;
                                                }
                                            }
                                        }
                                    } else if (nVar2 == null) {
                                        nVar3 = oVar10.m;
                                        nVar4 = nVar3.b;
                                        if (nVar4 != null) {
                                            if (nVar4.a.b == 2) {
                                                defpackage.m mVar18 = nVar4.f;
                                                nVar33.f = lVar2.e(nVar33);
                                                nVar.f = lVar2.e(nVar);
                                                int i316 = (int) ((mVar18.d - oVar10.C) + 0.5f);
                                                int iD111 = oVar10.d() + i316;
                                                lVar2.h(nVar33.f, i316);
                                                lVar2.h(nVar.f, iD111);
                                                nVar3.f = lVar2.e(nVar3);
                                                lVar2.h(nVar3.f, oVar10.C + i316);
                                                oVar10.b = 2;
                                                oVar10.o(i316, iD111);
                                            }
                                        } else if (nVar34 == null) {
                                            if (oVar10 instanceof defpackage.q) {
                                                qVar = (defpackage.q) oVar10;
                                                if (qVar.ai == 0) {
                                                    nVar33.f = lVar2.e(nVar33);
                                                    nVar.f = lVar2.e(nVar);
                                                    i6 = qVar.ag;
                                                    if (i6 != -1) {
                                                        fD = i6;
                                                    } else {
                                                        i7 = qVar.ah;
                                                        if (i7 != -1) {
                                                            fD = pVar.d() - i7;
                                                        } else {
                                                            fD = qVar.af * pVar.d();
                                                        }
                                                    }
                                                    int i317 = (int) (fD + 0.5f);
                                                    lVar2.h(nVar33.f, i317);
                                                    lVar2.h(nVar.f, i317);
                                                    oVar10.b = 2;
                                                    oVar10.a = 2;
                                                    oVar10.o(i317, i317);
                                                    oVar10.k(0, pVar.h());
                                                }
                                            } else {
                                                nVar33.f = lVar2.e(nVar33);
                                                nVar.f = lVar2.e(nVar);
                                                i5 = oVar10.x;
                                                int iD112 = oVar10.d() + i5;
                                                lVar2.h(nVar33.f, i5);
                                                lVar2.h(nVar.f, iD112);
                                                if (oVar10.C <= 0) {
                                                    nVar3.f = lVar2.e(nVar3);
                                                    lVar2.h(nVar3.f, i5 + oVar10.C);
                                                } else {
                                                    nVar3.f = lVar2.e(nVar3);
                                                    lVar2.h(nVar3.f, i5 + oVar10.C);
                                                }
                                                oVar10.b = 2;
                                            }
                                        }
                                    } else {
                                        nVar3 = oVar10.m;
                                        nVar4 = nVar3.b;
                                        if (nVar4 != null) {
                                            if (nVar4.a.b == 2) {
                                                defpackage.m mVar19 = nVar4.f;
                                                nVar33.f = lVar2.e(nVar33);
                                                nVar.f = lVar2.e(nVar);
                                                int i318 = (int) ((mVar19.d - oVar10.C) + 0.5f);
                                                int iD113 = oVar10.d() + i318;
                                                lVar2.h(nVar33.f, i318);
                                                lVar2.h(nVar.f, iD113);
                                                nVar3.f = lVar2.e(nVar3);
                                                lVar2.h(nVar3.f, oVar10.C + i318);
                                                oVar10.b = 2;
                                                oVar10.o(i318, iD113);
                                            }
                                        } else if (nVar34 == null) {
                                            if (oVar10 instanceof defpackage.q) {
                                                qVar = (defpackage.q) oVar10;
                                                if (qVar.ai == 0) {
                                                    nVar33.f = lVar2.e(nVar33);
                                                    nVar.f = lVar2.e(nVar);
                                                    i6 = qVar.ag;
                                                    if (i6 != -1) {
                                                        fD = i6;
                                                    } else {
                                                        i7 = qVar.ah;
                                                        if (i7 != -1) {
                                                            fD = pVar.d() - i7;
                                                        } else {
                                                            fD = qVar.af * pVar.d();
                                                        }
                                                    }
                                                    int i319 = (int) (fD + 0.5f);
                                                    lVar2.h(nVar33.f, i319);
                                                    lVar2.h(nVar.f, i319);
                                                    oVar10.b = 2;
                                                    oVar10.a = 2;
                                                    oVar10.o(i319, i319);
                                                    oVar10.k(0, pVar.h());
                                                }
                                            } else {
                                                nVar33.f = lVar2.e(nVar33);
                                                nVar.f = lVar2.e(nVar);
                                                i5 = oVar10.x;
                                                int iD114 = oVar10.d() + i5;
                                                lVar2.h(nVar33.f, i5);
                                                lVar2.h(nVar.f, iD114);
                                                if (oVar10.C <= 0) {
                                                    nVar3.f = lVar2.e(nVar3);
                                                    lVar2.h(nVar3.f, i5 + oVar10.C);
                                                } else {
                                                    nVar3.f = lVar2.e(nVar3);
                                                    lVar2.h(nVar3.f, i5 + oVar10.C);
                                                }
                                                oVar10.b = 2;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            defpackage.n nVar43 = oVar10.j;
                            nVar43.f = lVar2.e(nVar43);
                            defpackage.n nVar44 = oVar10.l;
                            nVar44.f = lVar2.e(nVar44);
                            int i40 = nVar43.c;
                            int iD20 = pVar.d() - nVar44.c;
                            lVar2.h(nVar43.f, i40);
                            lVar2.h(nVar44.f, iD20);
                            if (oVar10.C > 0 || oVar10.K == 8) {
                                defpackage.n nVar45 = oVar10.m;
                                nVar45.f = lVar2.e(nVar45);
                                lVar2.h(nVar45.f, oVar10.C + i40);
                            }
                            oVar10.o(i40, iD20);
                            oVar10.b = 2;
                        }
                    }
                    if (oVar10.b == -1) {
                        i23++;
                    }
                    if (oVar10.a == -1) {
                        i22++;
                    }
                    i21++;
                    i14 = 4;
                    i = -1;
                    i15 = 3;
                    i16 = 1;
                    i17 = 2;
                }
                if (i23 == 0) {
                    if (i22 != 0) {
                        i2 = 0;
                    } else {
                        z3 = true;
                    }
                    i20 = i22;
                    i19 = i23;
                    i14 = 4;
                    i = -1;
                    i15 = 3;
                    i16 = 1;
                    i17 = 2;
                } else {
                    i2 = i23;
                }
                if (i19 == i2 && i20 == i22) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i20 = i22;
                i19 = i23;
                i14 = 4;
                i = -1;
                i15 = 3;
                i16 = 1;
                i17 = 2;
            }
            f = 0.5f;
            int i41 = 0;
            int i42 = 0;
            for (int i43 = 0; i43 < size2; i43++) {
                defpackage.o oVar11 = (defpackage.o) arrayList.get(i43);
                int i44 = oVar11.a;
                if (i44 == 1 || i44 == -1) {
                    i41++;
                }
                int i45 = oVar11.b;
                if (i45 == 1 || i45 == -1) {
                    i42++;
                }
            }
            if (i41 == 0 && i42 == 0) {
                return false;
            }
            i16 = 0;
        } else {
            f = 0.5f;
        }
        for (int i46 = 0; i46 < size; i46++) {
            defpackage.o oVar12 = (defpackage.o) arrayList.get(i46);
            if (oVar12 instanceof defpackage.p) {
                int i47 = oVar12.ad;
                int i48 = oVar12.ae;
                if (i47 == 2) {
                    oVar12.v(1);
                    i47 = 2;
                }
                if (i48 == 2) {
                    oVar12.w(1);
                    i48 = 2;
                }
                oVar12.x(lVar2);
                if (i47 == 2) {
                    oVar12.v(2);
                }
                if (i48 == 2) {
                    oVar12.w(2);
                }
            } else {
                int i49 = 2;
                if (i16 != 0) {
                    if (pVar.ad != 2) {
                        if (oVar12.ad == 4) {
                            defpackage.n nVar46 = oVar12.i;
                            nVar46.f = lVar2.e(nVar46);
                            defpackage.n nVar47 = oVar12.k;
                            nVar47.f = lVar2.e(nVar47);
                            int i50 = nVar46.c;
                            int iH9 = pVar.h() - nVar47.c;
                            lVar2.h(nVar46.f, i50);
                            lVar2.h(nVar47.f, iH9);
                            oVar12.k(i50, iH9);
                            i49 = 2;
                            oVar12.a = 2;
                        } else {
                            i49 = 2;
                        }
                    }
                    if (pVar.ae != i49 && oVar12.ae == 4) {
                        defpackage.n nVar48 = oVar12.j;
                        nVar48.f = lVar2.e(nVar48);
                        defpackage.n nVar49 = oVar12.l;
                        nVar49.f = lVar2.e(nVar49);
                        int i51 = nVar48.c;
                        int iD21 = pVar.d() - nVar49.c;
                        lVar2.h(nVar48.f, i51);
                        lVar2.h(nVar49.f, iD21);
                        if (oVar12.C > 0 || oVar12.K == 8) {
                            defpackage.n nVar50 = oVar12.m;
                            nVar50.f = lVar2.e(nVar50);
                            lVar2.h(nVar50.f, oVar12.C + i51);
                        }
                        oVar12.o(i51, iD21);
                        oVar12.b = 2;
                    }
                }
                oVar12.x(lVar2);
            }
        }
        if (pVar.am > 0) {
            H(lVar);
        }
        if (pVar.an > 0) {
            int i52 = 0;
            while (i52 < pVar.an) {
                defpackage.o oVar13 = pVar.ap[i52];
                defpackage.o[] oVarArr = pVar.as;
                boolean[] zArr = pVar.ar;
                int iG = pVar.G(lVar2, oVarArr, oVar13, 1, zArr);
                defpackage.p pVar2 = pVar;
                defpackage.l lVar3 = lVar2;
                defpackage.o oVar14 = oVar13;
                defpackage.o oVar15 = oVarArr[2];
                if (oVar15 == null) {
                    i9 = i52;
                } else {
                    if (zArr[1]) {
                        int iC = oVar14.c();
                        while (oVar15 != null) {
                            defpackage.n nVar51 = oVar15.j;
                            lVar3.h(nVar51.f, iC);
                            defpackage.o oVar16 = oVar15.ac;
                            iC += nVar51.a() + oVar15.d() + oVar15.l.a();
                            oVar15 = oVar16;
                        }
                    } else {
                        int i53 = oVar14.W;
                        boolean z4 = i53 == 0;
                        boolean z5 = i53 == 2;
                        int i54 = pVar2.ae;
                        int i55 = pVar2.ai;
                        if (i55 != 2) {
                            f2 = 0.0f;
                            if (i55 != 8) {
                                if (iG == 0 && !z5) {
                                    float f5 = f2;
                                    defpackage.o oVar17 = null;
                                    while (oVar15 != null) {
                                        if (oVar15.ae != 3) {
                                            defpackage.n nVar52 = oVar15.j;
                                            int iA14 = nVar52.a();
                                            if (oVar17 != null) {
                                                iA14 += oVar17.l.a();
                                            }
                                            defpackage.n nVar53 = nVar52.b;
                                            lVar3.i(nVar52.f, nVar53.f, iA14, nVar53.a.ae == 3 ? 2 : 3);
                                            defpackage.n nVar54 = oVar15.l;
                                            int iA15 = nVar54.a();
                                            defpackage.n nVar55 = nVar54.b.a.j;
                                            defpackage.n nVar56 = nVar55.b;
                                            if (nVar56 != null && nVar56.a == oVar15) {
                                                iA15 += nVar55.a();
                                            }
                                            defpackage.n nVar57 = nVar54.b;
                                            lVar3.j(nVar54.f, nVar57.f, -iA15, nVar57.a.ae == 3 ? 2 : 3);
                                        } else {
                                            f5 += oVar15.aa;
                                            defpackage.n nVar58 = oVar15.l;
                                            if (nVar58.b != null) {
                                                iA3 = nVar58.a();
                                                if (oVar15 != oVarArr[3]) {
                                                    iA3 += nVar58.b.a.j.a();
                                                }
                                            } else {
                                                iA3 = 0;
                                            }
                                            lVar3.i(nVar58.f, oVar15.j.f, 0, 1);
                                            lVar3.j(nVar58.f, nVar58.b.f, -iA3, 1);
                                        }
                                        oVar17 = oVar15;
                                        oVar15 = oVar15.ac;
                                    }
                                    if (iG != 1) {
                                        int i56 = 0;
                                        while (true) {
                                            int i57 = iG - 1;
                                            if (i56 >= i57) {
                                                break;
                                            }
                                            defpackage.o[] oVarArr2 = pVar2.ao;
                                            defpackage.o oVar18 = oVarArr2[i56];
                                            i56++;
                                            defpackage.o oVar19 = oVarArr2[i56];
                                            defpackage.n nVar59 = oVar18.j;
                                            defpackage.m mVar20 = nVar59.f;
                                            defpackage.n nVar60 = oVar18.l;
                                            defpackage.m mVar21 = nVar60.f;
                                            defpackage.n nVar61 = oVar19.j;
                                            defpackage.m mVar22 = nVar61.f;
                                            int i58 = iG;
                                            defpackage.n nVar62 = oVar19.l;
                                            int i59 = i52;
                                            defpackage.m mVar23 = nVar62.f;
                                            if (oVar19 == oVarArr[3]) {
                                                mVar23 = oVarArr[1].l.f;
                                            }
                                            int iA16 = nVar59.a();
                                            defpackage.n nVar63 = nVar59.b;
                                            lVar3.i(mVar20, nVar59.b.f, (nVar63 == null || (nVar24 = (nVar23 = nVar63.a.l).b) == null || nVar24.a != oVar18) ? iA16 : iA16 + nVar23.a(), 2);
                                            int iA17 = nVar60.a();
                                            if (nVar60.b != null && (oVar8 = oVar18.ac) != null) {
                                                defpackage.n nVar64 = oVar8.j;
                                                iA17 += nVar64.b != null ? nVar64.a() : 0;
                                            }
                                            lVar3.j(mVar21, nVar60.b.f, -iA17, 2);
                                            if (i56 == i57) {
                                                int iA18 = nVar61.a();
                                                defpackage.n nVar65 = nVar61.b;
                                                if (nVar65 != null && (nVar22 = (nVar21 = nVar65.a.l).b) != null && nVar22.a == oVar19) {
                                                    iA18 += nVar21.a();
                                                }
                                                lVar3.i(mVar22, nVar61.b.f, iA18, 2);
                                                defpackage.n nVar66 = oVar19 == oVarArr[3] ? oVarArr[1].l : nVar62;
                                                int iA19 = nVar66.a();
                                                defpackage.n nVar67 = nVar66.b;
                                                if (nVar67 != null && (nVar20 = (nVar19 = nVar67.a.j).b) != null && nVar20.a == oVar19) {
                                                    iA19 += nVar19.a();
                                                }
                                                i11 = 2;
                                                lVar3.j(mVar23, nVar66.b.f, -iA19, 2);
                                            } else {
                                                i11 = 2;
                                            }
                                            int i60 = oVar14.h;
                                            if (i60 > 0) {
                                                lVar3.j(mVar21, mVar20, i60, i11);
                                            }
                                            defpackage.j jVarA = lVar3.a();
                                            jVarA.f(oVar18.aa, f5, oVar19.aa, mVar20, nVar59.a(), mVar21, nVar60.a(), mVar22, nVar61.a(), mVar23, nVar62.a());
                                            lVar3.g(jVarA);
                                            pVar2 = this;
                                            iG = i58;
                                            i52 = i59;
                                        }
                                    } else {
                                        defpackage.o oVar20 = pVar2.ao[0];
                                        defpackage.n nVar68 = oVar20.j;
                                        int iA20 = nVar68.a();
                                        defpackage.n nVar69 = nVar68.b;
                                        if (nVar69 != null) {
                                            iA20 += nVar69.a();
                                        }
                                        defpackage.n nVar70 = oVar20.l;
                                        int iA21 = nVar70.a();
                                        defpackage.n nVar71 = nVar70.b;
                                        if (nVar71 != null) {
                                            iA21 += nVar71.a();
                                        }
                                        defpackage.n nVar72 = oVar14.l;
                                        defpackage.m mVar24 = nVar72.b.f;
                                        if (oVar20 == oVarArr[3]) {
                                            i12 = 1;
                                            mVar24 = oVarArr[1].l.b.f;
                                        } else {
                                            i12 = 1;
                                        }
                                        int i61 = -iA21;
                                        if (oVar20.d == i12) {
                                            defpackage.n nVar73 = oVar14.j;
                                            lVar3.i(nVar73.f, nVar73.b.f, iA20, i12);
                                            lVar3.j(nVar72.f, mVar24, i61, i12);
                                            lVar3.n(nVar72.f, nVar73.f, oVar14.d(), 2);
                                        } else {
                                            lVar3.n(nVar68.f, nVar68.b.f, iA20, i12);
                                            lVar3.n(nVar70.f, mVar24, i61, i12);
                                        }
                                    }
                                } else {
                                    i9 = i52;
                                    oVar = oVar15;
                                    z = false;
                                    oVar2 = null;
                                    oVar3 = null;
                                    while (oVar != null) {
                                        oVar4 = oVar.ac;
                                        if (oVar4 == null) {
                                            oVar2 = oVarArr[1];
                                            z = true;
                                        }
                                        if (z5) {
                                            nVar14 = oVar.j;
                                            iA2 = nVar14.a();
                                            if (oVar3 != null) {
                                                iA2 += oVar3.l.a();
                                            }
                                            if (oVar15 != oVar) {
                                                i10 = 3;
                                            } else {
                                                i10 = 1;
                                            }
                                            nVar15 = nVar14.b;
                                            if (nVar15 != null) {
                                                mVar6 = nVar14.f;
                                                mVar5 = nVar15.f;
                                            } else {
                                                nVar16 = oVar.m;
                                                nVar17 = nVar16.b;
                                                if (nVar17 != null) {
                                                    defpackage.m mVar25 = nVar16.f;
                                                    defpackage.m mVar26 = nVar17.f;
                                                    iA2 -= nVar14.a();
                                                    mVar6 = mVar25;
                                                    mVar5 = mVar26;
                                                } else {
                                                    mVar5 = null;
                                                    mVar6 = null;
                                                }
                                            }
                                            if (mVar6 != null && mVar5 != null) {
                                                lVar3.i(mVar6, mVar5, iA2, i10);
                                            }
                                            if (oVar.ae == 3) {
                                                nVar18 = oVar.l;
                                                if (oVar.d == 1) {
                                                    lVar3.n(nVar18.f, nVar14.f, java.lang.Math.max(oVar.g, oVar.d()), 3);
                                                } else {
                                                    lVar3.i(nVar14.f, nVar14.b.f, nVar14.c, 3);
                                                    lVar3.j(nVar18.f, nVar14.f, oVar.g, 3);
                                                }
                                            }
                                        } else {
                                            if (z4 && z) {
                                                if (oVar3 != null) {
                                                    defpackage.n nVar74 = oVar.l;
                                                    if (nVar74.b == null) {
                                                        lVar3.h(nVar74.f, oVar.c() + oVar.z);
                                                    } else {
                                                        lVar3.n(nVar74.f, oVar2.l.b.f, -nVar74.a(), 5);
                                                    }
                                                } else {
                                                    oVar3 = null;
                                                    if (z4) {
                                                    }
                                                    defpackage.n nVar75 = oVar.j;
                                                    defpackage.n nVar76 = oVar.l;
                                                    oVar5 = oVar3;
                                                    int iA22 = nVar75.a();
                                                    int iA23 = nVar76.a();
                                                    z2 = z;
                                                    lVar3.i(nVar75.f, nVar75.b.f, iA22, 1);
                                                    lVar3.j(nVar76.f, nVar76.b.f, -iA23, 1);
                                                    nVar10 = nVar75.b;
                                                    if (nVar10 != null) {
                                                        mVar3 = nVar10.f;
                                                    } else {
                                                        mVar3 = null;
                                                    }
                                                    if (oVar5 == null) {
                                                        nVar13 = oVar14.j.b;
                                                        if (nVar13 != null) {
                                                            mVar3 = nVar13.f;
                                                        } else {
                                                            mVar3 = null;
                                                        }
                                                    }
                                                    if (oVar4 == null) {
                                                        nVar12 = oVar2.l.b;
                                                        if (nVar12 != null) {
                                                            oVar6 = nVar12.a;
                                                        } else {
                                                            oVar6 = null;
                                                        }
                                                    } else {
                                                        oVar6 = oVar4;
                                                    }
                                                    if (oVar6 != null) {
                                                        mVar4 = oVar6.j.f;
                                                        if (z2) {
                                                            nVar11 = oVar2.l.b;
                                                            if (nVar11 != null) {
                                                                mVar4 = nVar11.f;
                                                            } else {
                                                                mVar4 = null;
                                                            }
                                                        }
                                                        if (mVar3 != null) {
                                                            oVar7 = oVar2;
                                                        } else {
                                                            oVar7 = oVar2;
                                                        }
                                                    } else {
                                                        oVar7 = oVar2;
                                                    }
                                                    oVar4 = oVar6;
                                                }
                                            } else if (z4 && !z && oVar3 == null) {
                                                defpackage.n nVar77 = oVar.j;
                                                if (nVar77.b == null) {
                                                    lVar3.h(nVar77.f, oVar.c());
                                                } else {
                                                    lVar3.n(nVar77.f, oVar14.j.b.f, nVar77.a(), 5);
                                                }
                                            } else {
                                                defpackage.n nVar78 = oVar.j;
                                                defpackage.n nVar79 = oVar.l;
                                                oVar5 = oVar3;
                                                int iA24 = nVar78.a();
                                                int iA25 = nVar79.a();
                                                z2 = z;
                                                lVar3.i(nVar78.f, nVar78.b.f, iA24, 1);
                                                lVar3.j(nVar79.f, nVar79.b.f, -iA25, 1);
                                                nVar10 = nVar78.b;
                                                if (nVar10 != null) {
                                                    mVar3 = nVar10.f;
                                                } else {
                                                    mVar3 = null;
                                                }
                                                if (oVar5 == null) {
                                                    nVar13 = oVar14.j.b;
                                                    if (nVar13 != null) {
                                                        mVar3 = nVar13.f;
                                                    } else {
                                                        mVar3 = null;
                                                    }
                                                }
                                                if (oVar4 == null) {
                                                    nVar12 = oVar2.l.b;
                                                    if (nVar12 != null) {
                                                        oVar6 = nVar12.a;
                                                    } else {
                                                        oVar6 = null;
                                                    }
                                                } else {
                                                    oVar6 = oVar4;
                                                }
                                                if (oVar6 != null) {
                                                    mVar4 = oVar6.j.f;
                                                    if (z2) {
                                                        nVar11 = oVar2.l.b;
                                                        if (nVar11 != null) {
                                                            mVar4 = nVar11.f;
                                                        } else {
                                                            mVar4 = null;
                                                        }
                                                    }
                                                    if (mVar3 != null || mVar4 == null) {
                                                        oVar7 = oVar2;
                                                    } else {
                                                        oVar7 = oVar2;
                                                        lVar3.m(nVar78.f, mVar3, iA24, 0.5f, mVar4, nVar79.f, iA25);
                                                    }
                                                } else {
                                                    oVar7 = oVar2;
                                                }
                                                oVar4 = oVar6;
                                            }
                                            if (true == z2) {
                                                oVar4 = null;
                                            }
                                            z = z2;
                                            oVar2 = oVar7;
                                            oVar3 = oVar;
                                            oVar = oVar4;
                                        }
                                        oVar7 = oVar2;
                                        oVar = oVar;
                                        z2 = z;
                                        if (true == z2) {
                                            oVar4 = null;
                                        }
                                        z = z2;
                                        oVar2 = oVar7;
                                        oVar3 = oVar;
                                        oVar = oVar4;
                                    }
                                    if (z5) {
                                        defpackage.n nVar80 = oVar15.j;
                                        defpackage.n nVar81 = oVar2.l;
                                        int iA26 = nVar80.a();
                                        int iA27 = nVar81.a();
                                        nVar8 = oVar14.j.b;
                                        if (nVar8 != null) {
                                            mVar = nVar8.f;
                                        } else {
                                            mVar = null;
                                        }
                                        nVar9 = nVar81.b;
                                        if (nVar9 != null) {
                                            mVar2 = nVar9.f;
                                        } else {
                                            mVar2 = null;
                                        }
                                        if (mVar == null && mVar2 != null) {
                                            lVar3.j(nVar81.f, mVar2, -iA27, 1);
                                            lVar3.m(nVar80.f, mVar, iA26, oVar14.I, mVar2, nVar81.f, iA27);
                                        }
                                    }
                                }
                            }
                        } else {
                            f2 = 0.0f;
                        }
                        if (zArr[0] && oVar14.Y && !z5 && i54 != 2 && i53 == 0) {
                            defpackage.o oVar21 = oVar14;
                            float f6 = f2;
                            int iA28 = 0;
                            defpackage.o oVar22 = null;
                            int i62 = 0;
                            while (oVar21 != null) {
                                if (oVar21.K != 8) {
                                    i62++;
                                    if (oVar21.ae != 3) {
                                        int iD22 = iA28 + oVar21.d();
                                        defpackage.n nVar82 = oVar21.j;
                                        int iA29 = iD22 + (nVar82.b != null ? nVar82.a() : 0);
                                        defpackage.n nVar83 = oVar21.l;
                                        iA28 = iA29 + (nVar83.b != null ? nVar83.a() : 0);
                                    } else {
                                        f6 += oVar21.aa;
                                    }
                                }
                                defpackage.n nVar84 = oVar21.l.b;
                                defpackage.o oVar23 = nVar84 != null ? nVar84.a : null;
                                if (oVar23 != null && ((nVar7 = oVar23.j.b) == null || nVar7.a != oVar21)) {
                                    oVar23 = null;
                                }
                                defpackage.o oVar24 = oVar21;
                                oVar21 = oVar23;
                                oVar22 = oVar24;
                            }
                            int i63 = i62 + 1;
                            if (oVar22 != null) {
                                defpackage.n nVar85 = oVar22.l.b;
                                iA = (nVar85 == null || nVar85.a != pVar2) ? nVar85 != null ? nVar85.a.w : 0 : pVar2.a();
                            } else {
                                iA = 0;
                            }
                            float f7 = i63;
                            float f8 = iA - iA28;
                            if (iG == 0) {
                                f4 = f8 / f7;
                                f3 = f4;
                            } else {
                                f3 = f8 / iG;
                                f4 = f2;
                            }
                            while (oVar14 != null) {
                                defpackage.n nVar86 = oVar14.j;
                                int iA30 = nVar86.b != null ? nVar86.a() : 0;
                                defpackage.n nVar87 = oVar14.l;
                                int iA31 = nVar87.b != null ? nVar87.a() : 0;
                                if (oVar14.K != 8) {
                                    float f9 = iA31;
                                    float f10 = iA30;
                                    float f11 = f4 + f10;
                                    lVar3.h(nVar86.f, (int) (f11 + f));
                                    float fD3 = f11 + (oVar14.ae == 3 ? (f6 == f2 ? f3 - f10 : ((oVar14.aa * f8) / f6) - f10) - f9 : oVar14.d());
                                    lVar3.h(nVar87.f, (int) (fD3 + f));
                                    if (iG == 0) {
                                        fD3 += f3;
                                    }
                                    f4 = fD3 + f9;
                                } else {
                                    int i64 = (int) ((f4 - (f3 / 2.0f)) + f);
                                    lVar3.h(nVar86.f, i64);
                                    lVar3.h(nVar87.f, i64);
                                }
                                defpackage.n nVar88 = nVar87.b;
                                defpackage.o oVar25 = nVar88 != null ? nVar88.a : null;
                                oVar14 = (oVar25 == null || (nVar6 = oVar25.j.b) == null || nVar6.a == oVar14) ? oVar25 : null;
                                if (oVar14 == pVar2) {
                                    oVar14 = null;
                                }
                            }
                        } else {
                            if (iG == 0) {
                            }
                            i9 = i52;
                            oVar = oVar15;
                            z = false;
                            oVar2 = null;
                            oVar3 = null;
                            while (oVar != null) {
                                oVar4 = oVar.ac;
                                if (oVar4 == null) {
                                    oVar2 = oVarArr[1];
                                    z = true;
                                }
                                if (z5) {
                                    nVar14 = oVar.j;
                                    iA2 = nVar14.a();
                                    if (oVar3 != null) {
                                        iA2 += oVar3.l.a();
                                    }
                                    if (oVar15 != oVar) {
                                        i10 = 3;
                                    } else {
                                        i10 = 1;
                                    }
                                    nVar15 = nVar14.b;
                                    if (nVar15 != null) {
                                        mVar6 = nVar14.f;
                                        mVar5 = nVar15.f;
                                    } else {
                                        nVar16 = oVar.m;
                                        nVar17 = nVar16.b;
                                        if (nVar17 != null) {
                                            defpackage.m mVar27 = nVar16.f;
                                            defpackage.m mVar28 = nVar17.f;
                                            iA2 -= nVar14.a();
                                            mVar6 = mVar27;
                                            mVar5 = mVar28;
                                        } else {
                                            mVar5 = null;
                                            mVar6 = null;
                                        }
                                    }
                                    if (mVar6 != null) {
                                        lVar3.i(mVar6, mVar5, iA2, i10);
                                    }
                                    if (oVar.ae == 3) {
                                        nVar18 = oVar.l;
                                        if (oVar.d == 1) {
                                            lVar3.n(nVar18.f, nVar14.f, java.lang.Math.max(oVar.g, oVar.d()), 3);
                                        } else {
                                            lVar3.i(nVar14.f, nVar14.b.f, nVar14.c, 3);
                                            lVar3.j(nVar18.f, nVar14.f, oVar.g, 3);
                                        }
                                    }
                                } else {
                                    if (z4) {
                                        if (z4) {
                                        }
                                        defpackage.n nVar710 = oVar.j;
                                        defpackage.n nVar711 = oVar.l;
                                        oVar5 = oVar3;
                                        int iA210 = nVar710.a();
                                        int iA211 = nVar711.a();
                                        z2 = z;
                                        lVar3.i(nVar710.f, nVar710.b.f, iA210, 1);
                                        lVar3.j(nVar711.f, nVar711.b.f, -iA211, 1);
                                        nVar10 = nVar710.b;
                                        if (nVar10 != null) {
                                            mVar3 = nVar10.f;
                                        } else {
                                            mVar3 = null;
                                        }
                                        if (oVar5 == null) {
                                            nVar13 = oVar14.j.b;
                                            if (nVar13 != null) {
                                                mVar3 = nVar13.f;
                                            } else {
                                                mVar3 = null;
                                            }
                                        }
                                        if (oVar4 == null) {
                                            nVar12 = oVar2.l.b;
                                            if (nVar12 != null) {
                                                oVar6 = nVar12.a;
                                            } else {
                                                oVar6 = null;
                                            }
                                        } else {
                                            oVar6 = oVar4;
                                        }
                                        if (oVar6 != null) {
                                            mVar4 = oVar6.j.f;
                                            if (z2) {
                                                nVar11 = oVar2.l.b;
                                                if (nVar11 != null) {
                                                    mVar4 = nVar11.f;
                                                } else {
                                                    mVar4 = null;
                                                }
                                            }
                                            if (mVar3 != null) {
                                                oVar7 = oVar2;
                                            } else {
                                                oVar7 = oVar2;
                                            }
                                        } else {
                                            oVar7 = oVar2;
                                        }
                                        oVar4 = oVar6;
                                    } else {
                                        if (z4) {
                                        }
                                        defpackage.n nVar712 = oVar.j;
                                        defpackage.n nVar713 = oVar.l;
                                        oVar5 = oVar3;
                                        int iA212 = nVar712.a();
                                        int iA213 = nVar713.a();
                                        z2 = z;
                                        lVar3.i(nVar712.f, nVar712.b.f, iA212, 1);
                                        lVar3.j(nVar713.f, nVar713.b.f, -iA213, 1);
                                        nVar10 = nVar712.b;
                                        if (nVar10 != null) {
                                            mVar3 = nVar10.f;
                                        } else {
                                            mVar3 = null;
                                        }
                                        if (oVar5 == null) {
                                            nVar13 = oVar14.j.b;
                                            if (nVar13 != null) {
                                                mVar3 = nVar13.f;
                                            } else {
                                                mVar3 = null;
                                            }
                                        }
                                        if (oVar4 == null) {
                                            nVar12 = oVar2.l.b;
                                            if (nVar12 != null) {
                                                oVar6 = nVar12.a;
                                            } else {
                                                oVar6 = null;
                                            }
                                        } else {
                                            oVar6 = oVar4;
                                        }
                                        if (oVar6 != null) {
                                            mVar4 = oVar6.j.f;
                                            if (z2) {
                                                nVar11 = oVar2.l.b;
                                                if (nVar11 != null) {
                                                    mVar4 = nVar11.f;
                                                } else {
                                                    mVar4 = null;
                                                }
                                            }
                                            if (mVar3 != null) {
                                                oVar7 = oVar2;
                                            } else {
                                                oVar7 = oVar2;
                                            }
                                        } else {
                                            oVar7 = oVar2;
                                        }
                                        oVar4 = oVar6;
                                    }
                                    if (true == z2) {
                                        oVar4 = null;
                                    }
                                    z = z2;
                                    oVar2 = oVar7;
                                    oVar3 = oVar;
                                    oVar = oVar4;
                                }
                                oVar7 = oVar2;
                                oVar = oVar;
                                z2 = z;
                                if (true == z2) {
                                    oVar4 = null;
                                }
                                z = z2;
                                oVar2 = oVar7;
                                oVar3 = oVar;
                                oVar = oVar4;
                            }
                            if (z5) {
                                defpackage.n nVar89 = oVar15.j;
                                defpackage.n nVar810 = oVar2.l;
                                int iA214 = nVar89.a();
                                int iA215 = nVar810.a();
                                nVar8 = oVar14.j.b;
                                if (nVar8 != null) {
                                    mVar = nVar8.f;
                                } else {
                                    mVar = null;
                                }
                                nVar9 = nVar810.b;
                                if (nVar9 != null) {
                                    mVar2 = nVar9.f;
                                } else {
                                    mVar2 = null;
                                }
                                if (mVar == null) {
                                }
                            }
                        }
                    }
                    i9 = i52;
                }
                i52 = i9 + 1;
                pVar = this;
                lVar2 = lVar;
            }
        }
        return true;
    }

    @Override // defpackage.s, defpackage.o
    public final void i() {
        this.af.l();
        super.i();
    }
}
