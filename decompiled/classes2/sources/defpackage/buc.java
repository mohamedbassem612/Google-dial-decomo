package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class buc {
    public static final defpackage.buc a = new defpackage.buc();
    private static final cpx b = new cpx((byte[]) null);

    public static final void a(csj csjVar, aso asoVar, long j, long j2, long j3, float f, float f2) {
        cpo cpoVarS;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        long jFloatToRawIntBits = (java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(f2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L);
        if (asoVar == aso.a) {
            cpoVarS = cdh.s(cdh.x(j, (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i2))) & 4294967295L)), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            cpoVarS = cdh.s(cdh.x(j, (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i2))) & 4294967295L)), jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        cpx cpxVar = b;
        cpxVar.q(cpoVarS, 1);
        den.S(csjVar, cpxVar, j3, (den) null, 60);
        cpxVar.l();
    }

    public final void b(final defpackage.bun bunVar, final cmw cmwVar, final defpackage.btw btwVar, final aonn aonnVar, aono aonoVar, final float f, final float f2, cav cavVar, final int i) {
        int i2;
        cav cavVar2;
        final aono aonoVar2;
        aono aonoVar3;
        cav cavVarB = cavVar.b(49984771);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(bunVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(true) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(btwVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 8192 : 16384;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i3 |= true != cavVarB.y(f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != cavVarB.y(f2) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cavVarB.B(this) ? 33554432 : 67108864;
        }
        if (cavVarB.H((38347923 & i3) != 38347922, i3 & 1)) {
            cbt cbtVar = (cbt) cavVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cavVarB.E()) {
                java.lang.Object objR = cbtVar.R();
                if (objR == cau.a) {
                    objR = smd.b;
                    cbtVar.ab(objR);
                }
                aonoVar3 = (aono) objR;
            } else {
                cavVarB.s();
                aonoVar3 = aonoVar;
            }
            cavVarB.l();
            int i4 = i3 << 3;
            cavVar2 = cavVarB;
            c(bunVar, cmwVar, btwVar, aonnVar, aonoVar3, f, f2, cavVar2, (i3 & 14) | 805306416 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024), ((i3 >> 21) & 112) | 6);
            aonoVar2 = aonoVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            aonoVar2 = aonoVar;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: bub
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar3 = (cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.buc bucVar = this.a;
                    defpackage.bun bunVar2 = bunVar;
                    cmw cmwVar2 = cmwVar;
                    defpackage.btw btwVar2 = btwVar;
                    int i5 = i | 1;
                    int i6 = 306783378 & i5;
                    int i7 = 613566756 & i5;
                    bucVar.b(bunVar2, cmwVar2, btwVar2, aonnVar, aonoVar2, f, f2, cavVar3, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 << 1) & i7));
                    return aojh.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0173  */
    /* JADX WARN: Code duplicated, block: B:107:0x0175  */
    /* JADX WARN: Code duplicated, block: B:110:0x017c  */
    /* JADX WARN: Code duplicated, block: B:111:0x017e  */
    /* JADX WARN: Code duplicated, block: B:114:0x019d  */
    /* JADX WARN: Code duplicated, block: B:115:0x019f  */
    /* JADX WARN: Code duplicated, block: B:118:0x01af  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:123:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ec  */
    public final void c(final defpackage.bun bunVar, final cmw cmwVar, final defpackage.btw btwVar, final aonn aonnVar, final aono aonoVar, final float f, final float f2, cav cavVar, final int i, final int i2) {
        int i3;
        int i4;
        cav cavVar2;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean zY;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        java.lang.Object objR;
        cav cavVarB = cavVar.b(133396521);
        if ((i & 6) == 0) {
            i3 = (true != cavVarB.B(bunVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.y(Float.NaN) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.C(true) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.B(btwVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != cavVarB.D(aonoVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != cavVarB.y(f) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cavVarB.y(f2) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cavVarB.C(false) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != cavVarB.C(false) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (cavVarB.H(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            final aso asoVar = bunVar.b;
            final long jB = btwVar.b(false);
            final long jB2 = btwVar.b(true);
            int i6 = i4;
            final long jA = btwVar.a(false);
            final long jA2 = btwVar.a(true);
            java.lang.Object obj = ((kaw) cavVarB.e(bsw.a)).a;
            cmw cmwVarB = asoVar == aso.a ? azm.b(azm.k(cmwVar, 16.0f), 1.0f) : azm.e(azm.d(cmwVar, 1.0f), 16.0f);
            boolean z10 = (i3 & 112) == 32;
            cmt cmtVar = cmw.c;
            boolean z11 = z10;
            boolean z12 = z11 | cavVarB.z(asoVar.ordinal());
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR2 = cbtVar.R();
            if (z12) {
                i5 = i3;
            } else {
                i5 = i3;
                if (objR2 == cau.a) {
                }
                cmw cmwVarA = cmwVarB.a(den.C(cmtVar, (aono) objR2));
                boolean z13 = z11 | cavVarB.z(asoVar.ordinal());
                if ((i5 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                if ((i6 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zA = z13 | z | z2 | cavVarB.A(jB) | cavVarB.A(jB2) | cavVarB.A(jA) | cavVarB.A(jA2);
                if ((i5 & 29360128) == 8388608) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zY = zA | z3 | cavVarB.y(0.0f);
                if ((i5 & 234881024) == 67108864) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i5 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z4;
                if ((i5 & 3670016) == 1048576) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z7;
                if ((i5 & 1879048192) == 536870912) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objR = cbtVar.R();
                if (!(zY | z6 | z5 | z8 | z9) || objR == cau.a) {
                    objR = new aonj() { // from class: btz
                        /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
                        public final java.lang.Object a(java.lang.Object obj2) {
                            float fDl;
                            float fDl2;
                            float fDl3;
                            float f3;
                            long j;
                            float f4;
                            float f5;
                            float f6;
                            long jFloatToRawIntBits;
                            long jFloatToRawIntBits2;
                            int iFloatToRawIntBits;
                            long jFloatToRawIntBits3;
                            long jFloatToRawIntBits4;
                            int iFloatToRawIntBits2;
                            long jFloatToRawIntBits5;
                            long jFloatToRawIntBits6;
                            int iFloatToRawIntBits3;
                            long jFloatToRawIntBits7;
                            csj csjVar = (csj) obj2;
                            defpackage.buc bucVar = defpackage.buc.a;
                            aso asoVar2 = asoVar;
                            if (dpi.c(Float.NaN, Float.NaN)) {
                                fDl = (asoVar2 == aso.a ? java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)) : java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L))) / 2.0f;
                            } else {
                                fDl = csjVar.dl(Float.NaN);
                            }
                            float f7 = f;
                            defpackage.bun bunVar2 = bunVar;
                            bunVar2.b();
                            bunVar2.b();
                            float fDj = csjVar.dj(bunVar2.f());
                            float fDj2 = csjVar.dj(bunVar2.e());
                            float[] fArr = bunVar2.a;
                            float fB = bunVar2.b();
                            float fDi = csjVar.di(fDl);
                            aso asoVar3 = aso.a;
                            boolean z14 = false;
                            boolean z15 = csjVar.p() == dpq.b;
                            boolean z16 = asoVar2 == asoVar3;
                            if (z15 && !z16) {
                                z14 = true;
                            }
                            float fDl4 = csjVar.dl(fDi);
                            long jO = csjVar.o();
                            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (z16 ? jO & 4294967295L : jO >> 32));
                            float f8 = fIntBitsToFloat - fDl4;
                            if (!aooh.k(0.0f, (java.lang.Float) null)) {
                                aooh.k(0.0f, (java.lang.Float) null);
                            }
                            if (!aooh.k(fB, (java.lang.Float) null)) {
                                aooh.k(fB, (java.lang.Float) null);
                            }
                            float f9 = f7 + 0.0f + 0.0f;
                            float f10 = ((fIntBitsToFloat + 0.0f) * fB) + 0.0f;
                            float fDl5 = csjVar.dl(f2);
                            if (z16) {
                                if (dpi.a(0.0f, 0.0f) > 0) {
                                    csjVar.dl(0.0f);
                                    csjVar.dl(0.0f);
                                }
                                if (dpi.a(f9, 0.0f) > 0) {
                                    fDl2 = csjVar.dl(fDj2) / 2.0f;
                                    fDl3 = csjVar.dl(f9);
                                    f3 = fDl2 + fDl3;
                                } else {
                                    f3 = 0.0f;
                                }
                            } else {
                                if (dpi.a(0.0f, 0.0f) > 0) {
                                    csjVar.dl(0.0f);
                                    csjVar.dl(0.0f);
                                }
                                if (dpi.a(f9, 0.0f) > 0) {
                                    fDl2 = csjVar.dl(fDj) / 2.0f;
                                    fDl3 = csjVar.dl(f9);
                                    f3 = fDl2 + fDl3;
                                } else {
                                    f3 = 0.0f;
                                }
                            }
                            float f11 = f10 + f3;
                            csjVar.n();
                            aonn aonnVar2 = aonnVar;
                            long jFloatToRawIntBits8 = 0;
                            if (f10 < (fIntBitsToFloat - f3) - fDl4) {
                                float f12 = true != z14 ? fDl5 : fDl4;
                                float f13 = true != z14 ? fDl4 : fDl5;
                                float f14 = fIntBitsToFloat - f11;
                                if (z16) {
                                    jFloatToRawIntBits3 = ((long) java.lang.Float.floatToRawIntBits(f11)) & 4294967295L;
                                } else {
                                    jFloatToRawIntBits3 = z15 ? 0L : ((long) java.lang.Float.floatToRawIntBits(f11)) << 32;
                                }
                                if (z16) {
                                    j = 4294967295L;
                                    jFloatToRawIntBits5 = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(f14)) & 4294967295L);
                                } else {
                                    j = 4294967295L;
                                    if (z15) {
                                        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)) - f11;
                                        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L));
                                        jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat2);
                                        iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat3);
                                    } else {
                                        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L));
                                        jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(f14);
                                        iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat4);
                                    }
                                    jFloatToRawIntBits5 = (jFloatToRawIntBits4 << 32) | (((long) iFloatToRawIntBits2) & 4294967295L);
                                }
                                f4 = f11;
                                defpackage.buc.a(csjVar, asoVar2, jFloatToRawIntBits3, jFloatToRawIntBits5, jB, f12, f13);
                                if (z16) {
                                    jFloatToRawIntBits7 = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.n() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(f8)) & j);
                                } else {
                                    if (z15) {
                                        float fIntBitsToFloat5 = java.lang.Float.intBitsToFloat((int) (csjVar.n() & j));
                                        jFloatToRawIntBits6 = java.lang.Float.floatToRawIntBits(fDl4);
                                        iFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat5);
                                    } else {
                                        float fIntBitsToFloat6 = java.lang.Float.intBitsToFloat((int) (csjVar.n() & j));
                                        jFloatToRawIntBits6 = java.lang.Float.floatToRawIntBits(f8);
                                        iFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat6);
                                    }
                                    jFloatToRawIntBits7 = (jFloatToRawIntBits6 << 32) | (((long) iFloatToRawIntBits3) & j);
                                }
                                if (aonnVar2 != null) {
                                    aonnVar2.a(csjVar, new cpm(jFloatToRawIntBits7));
                                }
                            } else {
                                j = 4294967295L;
                                f4 = f11;
                            }
                            float f15 = f10 - f3;
                            float f16 = !z14 ? fDl4 : fDl5;
                            float f17 = true != z14 ? fDl5 : fDl4;
                            if (z14) {
                                f6 = f15;
                                f5 = 0.0f;
                            } else {
                                f5 = 0.0f;
                                f6 = f15 + 0.0f;
                            }
                            if (f6 > f16) {
                                if (!z16 && z15) {
                                    jFloatToRawIntBits8 = ((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)) - f15)) << 32;
                                }
                                if (z16) {
                                    jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)));
                                    iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f6);
                                } else {
                                    if (z15) {
                                        float fIntBitsToFloat7 = java.lang.Float.intBitsToFloat((int) (csjVar.o() & j));
                                        jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f15);
                                        iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fIntBitsToFloat7);
                                    } else {
                                        jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.o() & j)))) & j) | (((long) java.lang.Float.floatToRawIntBits(f6)) << 32);
                                    }
                                    defpackage.buc.a(csjVar, asoVar2, jFloatToRawIntBits8, jFloatToRawIntBits, jB2, f16, f17);
                                }
                                jFloatToRawIntBits = (jFloatToRawIntBits2 << 32) | (((long) iFloatToRawIntBits) & j);
                                defpackage.buc.a(csjVar, asoVar2, jFloatToRawIntBits8, jFloatToRawIntBits, jB2, f16, f17);
                            }
                            new aopm(f5, f15);
                            new aopm(f15, f4);
                            return aojh.a;
                        }
                    };
                    cbtVar.ab(objR);
                }
                cavVar2 = cavVarB;
                defpackage.yt.a(cmwVarA, (aonj) objR, cavVar2, 0);
            }
            objR2 = new defpackage.ant(asoVar, 8);
            cbtVar.ab(objR2);
            cmw cmwVarA2 = cmwVarB.a(den.C(cmtVar, (aono) objR2));
            boolean z14 = z11 | cavVarB.z(asoVar.ordinal());
            if ((i5 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            if ((i6 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zA2 = z14 | z | z2 | cavVarB.A(jB) | cavVarB.A(jB2) | cavVarB.A(jA) | cavVarB.A(jA2);
            if ((i5 & 29360128) == 8388608) {
                z3 = true;
            } else {
                z3 = false;
            }
            zY = zA2 | z3 | cavVarB.y(0.0f);
            if ((i5 & 234881024) == 67108864) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i5 & 458752) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z4;
            if ((i5 & 3670016) == 1048576) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z7;
            if ((i5 & 1879048192) == 536870912) {
                z9 = true;
            } else {
                z9 = false;
            }
            objR = cbtVar.R();
            if (!(zY | z6 | z5 | z8) && !z9) {
                objR = new aonj() { // from class: btz
                    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
                    public final java.lang.Object a(java.lang.Object obj2) {
                        float fDl;
                        float fDl2;
                        float fDl3;
                        float f3;
                        long j;
                        float f4;
                        float f5;
                        float f6;
                        long jFloatToRawIntBits;
                        long jFloatToRawIntBits2;
                        int iFloatToRawIntBits;
                        long jFloatToRawIntBits3;
                        long jFloatToRawIntBits4;
                        int iFloatToRawIntBits2;
                        long jFloatToRawIntBits5;
                        long jFloatToRawIntBits6;
                        int iFloatToRawIntBits3;
                        long jFloatToRawIntBits7;
                        csj csjVar = (csj) obj2;
                        defpackage.buc bucVar = defpackage.buc.a;
                        aso asoVar2 = asoVar;
                        if (dpi.c(Float.NaN, Float.NaN)) {
                            fDl = (asoVar2 == aso.a ? java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)) : java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L))) / 2.0f;
                        } else {
                            fDl = csjVar.dl(Float.NaN);
                        }
                        float f7 = f;
                        defpackage.bun bunVar2 = bunVar;
                        bunVar2.b();
                        bunVar2.b();
                        float fDj = csjVar.dj(bunVar2.f());
                        float fDj2 = csjVar.dj(bunVar2.e());
                        float[] fArr = bunVar2.a;
                        float fB = bunVar2.b();
                        float fDi = csjVar.di(fDl);
                        aso asoVar3 = aso.a;
                        boolean z15 = false;
                        boolean z16 = csjVar.p() == dpq.b;
                        boolean z17 = asoVar2 == asoVar3;
                        if (z16 && !z17) {
                            z15 = true;
                        }
                        float fDl4 = csjVar.dl(fDi);
                        long jO = csjVar.o();
                        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (z17 ? jO & 4294967295L : jO >> 32));
                        float f8 = fIntBitsToFloat - fDl4;
                        if (!aooh.k(0.0f, (java.lang.Float) null)) {
                            aooh.k(0.0f, (java.lang.Float) null);
                        }
                        if (!aooh.k(fB, (java.lang.Float) null)) {
                            aooh.k(fB, (java.lang.Float) null);
                        }
                        float f9 = f7 + 0.0f + 0.0f;
                        float f10 = ((fIntBitsToFloat + 0.0f) * fB) + 0.0f;
                        float fDl5 = csjVar.dl(f2);
                        if (z17) {
                            if (dpi.a(0.0f, 0.0f) > 0) {
                                csjVar.dl(0.0f);
                                csjVar.dl(0.0f);
                            }
                            if (dpi.a(f9, 0.0f) > 0) {
                                fDl2 = csjVar.dl(fDj2) / 2.0f;
                                fDl3 = csjVar.dl(f9);
                                f3 = fDl2 + fDl3;
                            } else {
                                f3 = 0.0f;
                            }
                        } else {
                            if (dpi.a(0.0f, 0.0f) > 0) {
                                csjVar.dl(0.0f);
                                csjVar.dl(0.0f);
                            }
                            if (dpi.a(f9, 0.0f) > 0) {
                                fDl2 = csjVar.dl(fDj) / 2.0f;
                                fDl3 = csjVar.dl(f9);
                                f3 = fDl2 + fDl3;
                            } else {
                                f3 = 0.0f;
                            }
                        }
                        float f11 = f10 + f3;
                        csjVar.n();
                        aonn aonnVar2 = aonnVar;
                        long jFloatToRawIntBits8 = 0;
                        if (f10 < (fIntBitsToFloat - f3) - fDl4) {
                            float f12 = true != z15 ? fDl5 : fDl4;
                            float f13 = true != z15 ? fDl4 : fDl5;
                            float f14 = fIntBitsToFloat - f11;
                            if (z17) {
                                jFloatToRawIntBits3 = ((long) java.lang.Float.floatToRawIntBits(f11)) & 4294967295L;
                            } else {
                                jFloatToRawIntBits3 = z16 ? 0L : ((long) java.lang.Float.floatToRawIntBits(f11)) << 32;
                            }
                            if (z17) {
                                j = 4294967295L;
                                jFloatToRawIntBits5 = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(f14)) & 4294967295L);
                            } else {
                                j = 4294967295L;
                                if (z16) {
                                    float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)) - f11;
                                    float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L));
                                    jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat2);
                                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat3);
                                } else {
                                    float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L));
                                    jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(f14);
                                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat4);
                                }
                                jFloatToRawIntBits5 = (jFloatToRawIntBits4 << 32) | (((long) iFloatToRawIntBits2) & 4294967295L);
                            }
                            f4 = f11;
                            defpackage.buc.a(csjVar, asoVar2, jFloatToRawIntBits3, jFloatToRawIntBits5, jB, f12, f13);
                            if (z17) {
                                jFloatToRawIntBits7 = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.n() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(f8)) & j);
                            } else {
                                if (z16) {
                                    float fIntBitsToFloat5 = java.lang.Float.intBitsToFloat((int) (csjVar.n() & j));
                                    jFloatToRawIntBits6 = java.lang.Float.floatToRawIntBits(fDl4);
                                    iFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat5);
                                } else {
                                    float fIntBitsToFloat6 = java.lang.Float.intBitsToFloat((int) (csjVar.n() & j));
                                    jFloatToRawIntBits6 = java.lang.Float.floatToRawIntBits(f8);
                                    iFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat6);
                                }
                                jFloatToRawIntBits7 = (jFloatToRawIntBits6 << 32) | (((long) iFloatToRawIntBits3) & j);
                            }
                            if (aonnVar2 != null) {
                                aonnVar2.a(csjVar, new cpm(jFloatToRawIntBits7));
                            }
                        } else {
                            j = 4294967295L;
                            f4 = f11;
                        }
                        float f15 = f10 - f3;
                        float f16 = !z15 ? fDl4 : fDl5;
                        float f17 = true != z15 ? fDl5 : fDl4;
                        if (z15) {
                            f6 = f15;
                            f5 = 0.0f;
                        } else {
                            f5 = 0.0f;
                            f6 = f15 + 0.0f;
                        }
                        if (f6 > f16) {
                            if (!z17 && z16) {
                                jFloatToRawIntBits8 = ((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)) - f15)) << 32;
                            }
                            if (z17) {
                                jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)));
                                iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f6);
                            } else {
                                if (z16) {
                                    float fIntBitsToFloat7 = java.lang.Float.intBitsToFloat((int) (csjVar.o() & j));
                                    jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f15);
                                    iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fIntBitsToFloat7);
                                } else {
                                    jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.o() & j)))) & j) | (((long) java.lang.Float.floatToRawIntBits(f6)) << 32);
                                }
                                defpackage.buc.a(csjVar, asoVar2, jFloatToRawIntBits8, jFloatToRawIntBits, jB2, f16, f17);
                            }
                            jFloatToRawIntBits = (jFloatToRawIntBits2 << 32) | (((long) iFloatToRawIntBits) & j);
                            defpackage.buc.a(csjVar, asoVar2, jFloatToRawIntBits8, jFloatToRawIntBits, jB2, f16, f17);
                        }
                        new aopm(f5, f15);
                        new aopm(f15, f4);
                        return aojh.a;
                    }
                };
                cbtVar.ab(objR);
            } else {
                objR = new aonj() { // from class: btz
                    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
                    public final java.lang.Object a(java.lang.Object obj2) {
                        float fDl;
                        float fDl2;
                        float fDl3;
                        float f3;
                        long j;
                        float f4;
                        float f5;
                        float f6;
                        long jFloatToRawIntBits;
                        long jFloatToRawIntBits2;
                        int iFloatToRawIntBits;
                        long jFloatToRawIntBits3;
                        long jFloatToRawIntBits4;
                        int iFloatToRawIntBits2;
                        long jFloatToRawIntBits5;
                        long jFloatToRawIntBits6;
                        int iFloatToRawIntBits3;
                        long jFloatToRawIntBits7;
                        csj csjVar = (csj) obj2;
                        defpackage.buc bucVar = defpackage.buc.a;
                        aso asoVar2 = asoVar;
                        if (dpi.c(Float.NaN, Float.NaN)) {
                            fDl = (asoVar2 == aso.a ? java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)) : java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L))) / 2.0f;
                        } else {
                            fDl = csjVar.dl(Float.NaN);
                        }
                        float f7 = f;
                        defpackage.bun bunVar2 = bunVar;
                        bunVar2.b();
                        bunVar2.b();
                        float fDj = csjVar.dj(bunVar2.f());
                        float fDj2 = csjVar.dj(bunVar2.e());
                        float[] fArr = bunVar2.a;
                        float fB = bunVar2.b();
                        float fDi = csjVar.di(fDl);
                        aso asoVar3 = aso.a;
                        boolean z15 = false;
                        boolean z16 = csjVar.p() == dpq.b;
                        boolean z17 = asoVar2 == asoVar3;
                        if (z16 && !z17) {
                            z15 = true;
                        }
                        float fDl4 = csjVar.dl(fDi);
                        long jO = csjVar.o();
                        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (z17 ? jO & 4294967295L : jO >> 32));
                        float f8 = fIntBitsToFloat - fDl4;
                        if (!aooh.k(0.0f, (java.lang.Float) null)) {
                            aooh.k(0.0f, (java.lang.Float) null);
                        }
                        if (!aooh.k(fB, (java.lang.Float) null)) {
                            aooh.k(fB, (java.lang.Float) null);
                        }
                        float f9 = f7 + 0.0f + 0.0f;
                        float f10 = ((fIntBitsToFloat + 0.0f) * fB) + 0.0f;
                        float fDl5 = csjVar.dl(f2);
                        if (z17) {
                            if (dpi.a(0.0f, 0.0f) > 0) {
                                csjVar.dl(0.0f);
                                csjVar.dl(0.0f);
                            }
                            if (dpi.a(f9, 0.0f) > 0) {
                                fDl2 = csjVar.dl(fDj2) / 2.0f;
                                fDl3 = csjVar.dl(f9);
                                f3 = fDl2 + fDl3;
                            } else {
                                f3 = 0.0f;
                            }
                        } else {
                            if (dpi.a(0.0f, 0.0f) > 0) {
                                csjVar.dl(0.0f);
                                csjVar.dl(0.0f);
                            }
                            if (dpi.a(f9, 0.0f) > 0) {
                                fDl2 = csjVar.dl(fDj) / 2.0f;
                                fDl3 = csjVar.dl(f9);
                                f3 = fDl2 + fDl3;
                            } else {
                                f3 = 0.0f;
                            }
                        }
                        float f11 = f10 + f3;
                        csjVar.n();
                        aonn aonnVar2 = aonnVar;
                        long jFloatToRawIntBits8 = 0;
                        if (f10 < (fIntBitsToFloat - f3) - fDl4) {
                            float f12 = true != z15 ? fDl5 : fDl4;
                            float f13 = true != z15 ? fDl4 : fDl5;
                            float f14 = fIntBitsToFloat - f11;
                            if (z17) {
                                jFloatToRawIntBits3 = ((long) java.lang.Float.floatToRawIntBits(f11)) & 4294967295L;
                            } else {
                                jFloatToRawIntBits3 = z16 ? 0L : ((long) java.lang.Float.floatToRawIntBits(f11)) << 32;
                            }
                            if (z17) {
                                j = 4294967295L;
                                jFloatToRawIntBits5 = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(f14)) & 4294967295L);
                            } else {
                                j = 4294967295L;
                                if (z16) {
                                    float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)) - f11;
                                    float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L));
                                    jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat2);
                                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat3);
                                } else {
                                    float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L));
                                    jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(f14);
                                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat4);
                                }
                                jFloatToRawIntBits5 = (jFloatToRawIntBits4 << 32) | (((long) iFloatToRawIntBits2) & 4294967295L);
                            }
                            f4 = f11;
                            defpackage.buc.a(csjVar, asoVar2, jFloatToRawIntBits3, jFloatToRawIntBits5, jB, f12, f13);
                            if (z17) {
                                jFloatToRawIntBits7 = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.n() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(f8)) & j);
                            } else {
                                if (z16) {
                                    float fIntBitsToFloat5 = java.lang.Float.intBitsToFloat((int) (csjVar.n() & j));
                                    jFloatToRawIntBits6 = java.lang.Float.floatToRawIntBits(fDl4);
                                    iFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat5);
                                } else {
                                    float fIntBitsToFloat6 = java.lang.Float.intBitsToFloat((int) (csjVar.n() & j));
                                    jFloatToRawIntBits6 = java.lang.Float.floatToRawIntBits(f8);
                                    iFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat6);
                                }
                                jFloatToRawIntBits7 = (jFloatToRawIntBits6 << 32) | (((long) iFloatToRawIntBits3) & j);
                            }
                            if (aonnVar2 != null) {
                                aonnVar2.a(csjVar, new cpm(jFloatToRawIntBits7));
                            }
                        } else {
                            j = 4294967295L;
                            f4 = f11;
                        }
                        float f15 = f10 - f3;
                        float f16 = !z15 ? fDl4 : fDl5;
                        float f17 = true != z15 ? fDl5 : fDl4;
                        if (z15) {
                            f6 = f15;
                            f5 = 0.0f;
                        } else {
                            f5 = 0.0f;
                            f6 = f15 + 0.0f;
                        }
                        if (f6 > f16) {
                            if (!z17 && z16) {
                                jFloatToRawIntBits8 = ((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)) - f15)) << 32;
                            }
                            if (z17) {
                                jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)));
                                iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f6);
                            } else {
                                if (z16) {
                                    float fIntBitsToFloat7 = java.lang.Float.intBitsToFloat((int) (csjVar.o() & j));
                                    jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f15);
                                    iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fIntBitsToFloat7);
                                } else {
                                    jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (csjVar.o() & j)))) & j) | (((long) java.lang.Float.floatToRawIntBits(f6)) << 32);
                                }
                                defpackage.buc.a(csjVar, asoVar2, jFloatToRawIntBits8, jFloatToRawIntBits, jB2, f16, f17);
                            }
                            jFloatToRawIntBits = (jFloatToRawIntBits2 << 32) | (((long) iFloatToRawIntBits) & j);
                            defpackage.buc.a(csjVar, asoVar2, jFloatToRawIntBits8, jFloatToRawIntBits, jB2, f16, f17);
                        }
                        new aopm(f5, f15);
                        new aopm(f15, f4);
                        return aojh.a;
                    }
                };
                cbtVar.ab(objR);
            }
            cavVar2 = cavVarB;
            defpackage.yt.a(cmwVarA2, (aonj) objR, cavVar2, 0);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: bua
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).intValue();
                    defpackage.buc bucVar = this.a;
                    defpackage.bun bunVar2 = bunVar;
                    cmw cmwVar2 = cmwVar;
                    defpackage.btw btwVar2 = btwVar;
                    int i7 = i;
                    aonn aonnVar2 = aonnVar;
                    int i8 = i2;
                    int i9 = i7 | 1;
                    int i10 = i8 & 306783378;
                    int i11 = 306783378 & i9;
                    int i12 = i11 << 1;
                    float f3 = f;
                    int i13 = i8 & 613566756;
                    int i14 = 613566756 & i9;
                    float f4 = f2;
                    bucVar.c(bunVar2, cmwVar2, btwVar2, aonnVar2, aonoVar, f3, f4, (cav) obj2, (i9 & (-920350135)) | i11 | (i14 >> 1) | (i12 & i14), (i8 & (-920350135)) | i10 | (i13 >> 1) | ((i10 << 1) & i13));
                    return aojh.a;
                }
            };
        }
    }

    public final void d(kaw kawVar, cmw cmwVar, defpackage.btw btwVar, long j, cav cavVar, int i) {
        int i2;
        cbt cbtVarB = cavVar.b(-290277409);
        if ((i & 6) == 0) {
            i2 = (true != cbtVarB.B(kawVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.B(btwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.C(true) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.A(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cbtVarB.B(this) ? 65536 : 131072;
        }
        if (cbtVarB.H((74899 & i2) != 74898, i2 & 1)) {
            cbtVarB.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cbtVarB.E()) {
                cbtVarB.s();
            }
            cbtVarB.l();
            int i3 = (i2 & 14) | 48;
            int i4 = i2 << 3;
            e(kawVar, cmwVar, btwVar, j, cbtVarB, i3 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (i4 & 3670016));
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bty(this, kawVar, cmwVar, btwVar, j, i, 0);
        }
    }

    public final void e(kaw kawVar, cmw cmwVar, defpackage.btw btwVar, long j, cav cavVar, int i) {
        int i2;
        cbt cbtVarB = cavVar.b(-949601789);
        if ((i & 6) == 0) {
            i2 = (true != cbtVarB.B(kawVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.C(false) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.B(btwVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.C(true) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cbtVarB.A(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cbtVarB.B(this) ? 524288 : 1048576;
        }
        if (cbtVarB.H((599187 & i2) != 599186, i2 & 1)) {
            cbtVarB.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cbtVarB.E()) {
                cbtVarB.s();
            }
            cbtVarB.l();
            int i3 = i2 >> 3;
            defpackage.bul.d(kawVar, cmwVar, btwVar, j, cbtVarB, (i2 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | ((i2 << 12) & 458752));
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bty(this, kawVar, cmwVar, btwVar, j, i, 2);
        }
    }
}
