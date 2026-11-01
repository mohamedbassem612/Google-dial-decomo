package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cfd {
    public static defpackage.cra a;

    public static final android.graphics.Rect A(defpackage.dpo dpoVar) {
        return new android.graphics.Rect(dpoVar.b, dpoVar.c, dpoVar.d, dpoVar.e);
    }

    public static final defpackage.cpn B(android.graphics.Rect rect) {
        return new defpackage.cpn(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final defpackage.dpo C(android.graphics.Rect rect) {
        return new defpackage.dpo(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final long D(defpackage.cpn cpnVar) {
        return (((long) java.lang.Float.floatToRawIntBits(cpnVar.d - cpnVar.b)) << 32) | (((long) java.lang.Float.floatToRawIntBits(cpnVar.e - cpnVar.c)) & 4294967295L);
    }

    public static final long E(defpackage.cpo cpoVar) {
        float fB = cpoVar.b();
        float fA = cpoVar.a();
        return (((long) java.lang.Float.floatToRawIntBits(fB)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fA)) & 4294967295L);
    }

    public static final long F(defpackage.cpn cpnVar) {
        return (((long) java.lang.Float.floatToRawIntBits(cpnVar.b)) << 32) | (((long) java.lang.Float.floatToRawIntBits(cpnVar.c)) & 4294967295L);
    }

    public static final long G(defpackage.cpo cpoVar) {
        return (((long) java.lang.Float.floatToRawIntBits(cpoVar.a)) << 32) | (((long) java.lang.Float.floatToRawIntBits(cpoVar.b)) & 4294967295L);
    }

    public static /* synthetic */ void H(defpackage.csj csjVar, defpackage.cqx cqxVar, long j, float f, int i) {
        defpackage.cpx cpxVar;
        float f2 = (i & 4) != 0 ? 1.0f : f;
        boolean z = cqxVar instanceof defpackage.cqv;
        defpackage.csl cslVar = defpackage.csl.a;
        if (z) {
            defpackage.cpn cpnVar = ((defpackage.cqv) cqxVar).a;
            csjVar.s(j, F(cpnVar), D(cpnVar), f2, cslVar, null, 3);
            return;
        }
        float f3 = f2;
        if (cqxVar instanceof defpackage.cqw) {
            defpackage.cqw cqwVar = (defpackage.cqw) cqxVar;
            cpxVar = cqwVar.b;
            if (cpxVar == null) {
                defpackage.cpo cpoVar = cqwVar.a;
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cpoVar.h >> 32));
                csjVar.x(j, G(cpoVar), E(cpoVar), (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), cslVar, f3);
                return;
            }
        } else {
            if (!(cqxVar instanceof defpackage.cqu)) {
                throw new defpackage.aois();
            }
            cpxVar = ((defpackage.cqu) cqxVar).a;
        }
        csjVar.B(cpxVar, j, f3, cslVar);
    }

    public static final boolean I(float[] fArr) {
        return fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final defpackage.cmw J(defpackage.cmw cmwVar, defpackage.aonj aonjVar) {
        return cmwVar.a(new defpackage.cqb(aonjVar));
    }

    public static /* synthetic */ defpackage.cmw K(defpackage.cmw cmwVar, float f, float f2, float f3, float f4, float f5, defpackage.crd crdVar, boolean z, int i, int i2) {
        long jBj = (i2 & 1024) != 0 ? defpackage.mni.bj(0.5f, 0.5f) : 0L;
        defpackage.crd crdVar2 = (i2 & 2048) != 0 ? defpackage.cqz.a : crdVar;
        boolean z2 = ((i2 & 4096) == 0) & z;
        long j = (i2 & 16384) != 0 ? -72057594037927936L : 0L;
        long j2 = (32768 & i2) != 0 ? -72057594037927936L : 0L;
        int i3 = ((65536 & i2) == 0 ? 1 : 0) & i;
        int i4 = i2 & 256;
        int i5 = i2 & 32;
        int i6 = i2 & 4;
        int i7 = i2 & 2;
        int i8 = i2 & 1;
        float f6 = (i2 & 512) != 0 ? 8.0f : 0.0f;
        float f7 = i4 != 0 ? 0.0f : f5;
        float f8 = i5 != 0 ? 0.0f : f4;
        float f9 = i6 != 0 ? 1.0f : f3;
        return cmwVar.a(new defpackage.cqn(1 == i8 ? 1.0f : f, i7 != 0 ? 1.0f : f2, f9, f8, f7, f6, jBj, crdVar2, z2, j, j2, i3, defpackage.cqr.a));
    }

    public static final int L(long j) {
        float[] fArr = defpackage.crp.a;
        return (int) (defpackage.cqg.e(j, defpackage.crp.e) >>> 32);
    }

    public static final long M(int i) {
        return ((long) i) << 32;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0163  */
    /* JADX WARN: Code duplicated, block: B:104:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x016b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0173  */
    /* JADX WARN: Code duplicated, block: B:110:0x0178  */
    /* JADX WARN: Code duplicated, block: B:111:0x017a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0180  */
    /* JADX WARN: Code duplicated, block: B:114:0x0187  */
    /* JADX WARN: Code duplicated, block: B:118:0x0192  */
    /* JADX WARN: Code duplicated, block: B:121:0x0198  */
    /* JADX WARN: Code duplicated, block: B:122:0x019b  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0102  */
    /* JADX WARN: Code duplicated, block: B:77:0x0106  */
    /* JADX WARN: Code duplicated, block: B:78:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0118  */
    /* JADX WARN: Code duplicated, block: B:84:0x011e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0121  */
    /* JADX WARN: Code duplicated, block: B:87:0x0127  */
    /* JADX WARN: Code duplicated, block: B:88:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0142  */
    /* JADX WARN: Code duplicated, block: B:95:0x0148  */
    /* JADX WARN: Code duplicated, block: B:98:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x015b  */
    public static final long N(float f, float f2, float f3, float f4, defpackage.crn crnVar) {
        int i;
        int i2;
        short s;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        short s2;
        int i10;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        short s3;
        int i18;
        float f5;
        float f6;
        if (crnVar.f()) {
            float f7 = f4 < 0.0f ? 0.0f : f4;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            float f8 = (f7 * 255.0f) + 0.5f;
            float f9 = f < 0.0f ? 0.0f : f;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i19 = ((int) ((f9 * 255.0f) + 0.5f)) << 16;
            float f10 = f2 < 0.0f ? 0.0f : f2;
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            float f11 = (f10 * 255.0f) + 0.5f;
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            return ((long) ((((((int) f8) << 24) | i19) | (((int) f11) << 8)) | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
        }
        long j = crnVar.b;
        int i20 = crnVar.c;
        if (i20 == -1) {
            defpackage.cqp.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i21 = 0;
        float fB3 = crnVar.b(0);
        float fA3 = crnVar.a(0);
        if (f >= fB3) {
            fB3 = f;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fA3);
        int i22 = iFloatToRawIntBits3 >> 13;
        int i23 = iFloatToRawIntBits3 & 8388607;
        int i24 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i25 = (iFloatToRawIntBits3 >>> 31) << 15;
        if (i24 == 255) {
            i2 = i23 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i24 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else {
                if (i > 0) {
                    int i26 = i22 & 1023;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        s = (short) ((((i << 10) | i26) + 1) | i25);
                    } else {
                        i2 = i26;
                    }
                    fB = crnVar.b(1);
                    fA = crnVar.a(1);
                    if (f2 >= fB) {
                        fB = f2;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fA);
                    i3 = (iFloatToRawIntBits >>> 31) << 15;
                    i4 = (iFloatToRawIntBits >>> 23) & 255;
                    i5 = iFloatToRawIntBits >> 13;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i4 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i4 - 112;
                        if (i7 >= 31) {
                            i9 = 0;
                            i7 = 49;
                        } else {
                            if (i7 <= 0) {
                                i8 = i5 & 1023;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    s2 = (short) ((((i7 << 10) | i8) + 1) | i3);
                                } else {
                                    i9 = i8;
                                }
                                fB2 = crnVar.b(2);
                                fA2 = crnVar.a(2);
                                if (f3 >= fB2) {
                                    fB2 = f3;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fA2);
                                i11 = (iFloatToRawIntBits2 >>> 31) << 15;
                                i12 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i13 = iFloatToRawIntBits2 >> 13;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i12 == 255) {
                                    i17 = i14 != 0 ? 512 : 0;
                                    i21 = 31;
                                } else {
                                    i15 = i12 - 112;
                                    if (i15 >= 31) {
                                        i17 = 0;
                                        i21 = 49;
                                    } else {
                                        if (i15 <= 0) {
                                            i16 = i13 & 1023;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                s3 = (short) ((((i15 << 10) | i16) + 1) | i11);
                                            } else {
                                                i17 = i16;
                                                i21 = i15;
                                            }
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            if (f5 > 1.0f) {
                                                f6 = 1.0f;
                                            } else {
                                                f6 = f5;
                                            }
                                            return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
                                        }
                                        if (i15 >= -10) {
                                            i18 = (i14 | 8388608) >> (1 - i15);
                                            if ((i18 & 4096) != 0) {
                                                i18 += 8192;
                                            }
                                            i17 = i18 >> 13;
                                        } else {
                                            i17 = 0;
                                        }
                                    }
                                }
                                s3 = (short) (i11 | (i21 << 10) | i17);
                                if (f4 >= 0.0f) {
                                }
                                if (f5 > 1.0f) {
                                    f6 = 1.0f;
                                } else {
                                    f6 = f5;
                                }
                                return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
                            }
                            if (i7 >= -10) {
                                i10 = (i6 | 8388608) >> (1 - i7);
                                if ((i10 & 4096) != 0) {
                                    i10 += 8192;
                                }
                                i9 = i10 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    s2 = (short) (i3 | (i7 << 10) | i9);
                    fB2 = crnVar.b(2);
                    fA2 = crnVar.a(2);
                    if (f3 >= fB2) {
                        fB2 = f3;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fA2);
                    i11 = (iFloatToRawIntBits2 >>> 31) << 15;
                    i12 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i13 = iFloatToRawIntBits2 >> 13;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i12 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i21 = 31;
                    } else {
                        i15 = i12 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i21 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i13 & 1023;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    s3 = (short) ((((i15 << 10) | i16) + 1) | i11);
                                } else {
                                    i17 = i16;
                                    i21 = i15;
                                }
                                if (f4 >= 0.0f) {
                                }
                                if (f5 > 1.0f) {
                                    f6 = 1.0f;
                                } else {
                                    f6 = f5;
                                }
                                return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
                            }
                            if (i15 >= -10) {
                                i18 = (i14 | 8388608) >> (1 - i15);
                                if ((i18 & 4096) != 0) {
                                    i18 += 8192;
                                }
                                i17 = i18 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    s3 = (short) (i11 | (i21 << 10) | i17);
                    if (f4 >= 0.0f) {
                    }
                    if (f5 > 1.0f) {
                        f6 = 1.0f;
                    } else {
                        f6 = f5;
                    }
                    return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
                }
                if (i >= -10) {
                    int i27 = (i23 | 8388608) >> (1 - i);
                    if ((i27 & 4096) != 0) {
                        i27 += 8192;
                    }
                    i2 = i27 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        s = (short) (i25 | (i << 10) | i2);
        fB = crnVar.b(1);
        fA = crnVar.a(1);
        if (f2 >= fB) {
            fB = f2;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fA);
        i3 = (iFloatToRawIntBits >>> 31) << 15;
        i4 = (iFloatToRawIntBits >>> 23) & 255;
        i5 = iFloatToRawIntBits >> 13;
        i6 = iFloatToRawIntBits & 8388607;
        if (i4 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i4 - 112;
            if (i7 >= 31) {
                i9 = 0;
                i7 = 49;
            } else {
                if (i7 <= 0) {
                    i8 = i5 & 1023;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        s2 = (short) ((((i7 << 10) | i8) + 1) | i3);
                    } else {
                        i9 = i8;
                    }
                    fB2 = crnVar.b(2);
                    fA2 = crnVar.a(2);
                    if (f3 >= fB2) {
                        fB2 = f3;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fA2);
                    i11 = (iFloatToRawIntBits2 >>> 31) << 15;
                    i12 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i13 = iFloatToRawIntBits2 >> 13;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i12 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i21 = 31;
                    } else {
                        i15 = i12 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i21 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i13 & 1023;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    s3 = (short) ((((i15 << 10) | i16) + 1) | i11);
                                } else {
                                    i17 = i16;
                                    i21 = i15;
                                }
                                if (f4 >= 0.0f) {
                                }
                                if (f5 > 1.0f) {
                                    f6 = 1.0f;
                                } else {
                                    f6 = f5;
                                }
                                return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
                            }
                            if (i15 >= -10) {
                                i18 = (i14 | 8388608) >> (1 - i15);
                                if ((i18 & 4096) != 0) {
                                    i18 += 8192;
                                }
                                i17 = i18 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    s3 = (short) (i11 | (i21 << 10) | i17);
                    if (f4 >= 0.0f) {
                    }
                    if (f5 > 1.0f) {
                        f6 = 1.0f;
                    } else {
                        f6 = f5;
                    }
                    return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
                }
                if (i7 >= -10) {
                    i10 = (i6 | 8388608) >> (1 - i7);
                    if ((i10 & 4096) != 0) {
                        i10 += 8192;
                    }
                    i9 = i10 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        s2 = (short) (i3 | (i7 << 10) | i9);
        fB2 = crnVar.b(2);
        fA2 = crnVar.a(2);
        if (f3 >= fB2) {
            fB2 = f3;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fA2);
        i11 = (iFloatToRawIntBits2 >>> 31) << 15;
        i12 = (iFloatToRawIntBits2 >>> 23) & 255;
        i13 = iFloatToRawIntBits2 >> 13;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i12 == 255) {
            i17 = i14 != 0 ? 512 : 0;
            i21 = 31;
        } else {
            i15 = i12 - 112;
            if (i15 >= 31) {
                i17 = 0;
                i21 = 49;
            } else {
                if (i15 <= 0) {
                    i16 = i13 & 1023;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        s3 = (short) ((((i15 << 10) | i16) + 1) | i11);
                    } else {
                        i17 = i16;
                        i21 = i15;
                    }
                    if (f4 >= 0.0f) {
                    }
                    if (f5 > 1.0f) {
                        f6 = 1.0f;
                    } else {
                        f6 = f5;
                    }
                    return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
                }
                if (i15 >= -10) {
                    i18 = (i14 | 8388608) >> (1 - i15);
                    if ((i18 & 4096) != 0) {
                        i18 += 8192;
                    }
                    i17 = i18 >> 13;
                } else {
                    i17 = 0;
                }
            }
        }
        s3 = (short) (i11 | (i21 << 10) | i17);
        if (f4 >= 0.0f) {
        }
        if (f5 > 1.0f) {
            f6 = 1.0f;
        } else {
            f6 = f5;
        }
        return (((long) i20) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x0108  */
    /* JADX WARN: Code duplicated, block: B:62:0x010b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0111  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    public static final long O(float f, float f2, float f3, float f4, defpackage.crn crnVar) {
        int i;
        int i2;
        short s;
        int iFloatToRawIntBits;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        short s2;
        int i10;
        int iFloatToRawIntBits2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        short s3;
        int i17;
        if (crnVar.f()) {
            return ((long) ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f)))) << 32;
        }
        int iFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(f);
        int i18 = iFloatToRawIntBits3 >> 13;
        int i19 = iFloatToRawIntBits3 & 8388607;
        int i20 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i21 = (iFloatToRawIntBits3 >>> 31) << 15;
        int i22 = 49;
        int i23 = 0;
        if (i20 == 255) {
            i2 = i19 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i20 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else {
                if (i > 0) {
                    int i24 = i18 & 1023;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        s = (short) ((((i << 10) | i24) + 1) | i21);
                    } else {
                        i2 = i24;
                    }
                    iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f2);
                    i3 = (iFloatToRawIntBits >>> 31) << 15;
                    i4 = (iFloatToRawIntBits >>> 23) & 255;
                    i5 = iFloatToRawIntBits >> 13;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i4 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i4 - 112;
                        if (i7 >= 31) {
                            i7 = 49;
                            i9 = 0;
                        } else {
                            if (i7 <= 0) {
                                i8 = i5 & 1023;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    s2 = (short) ((((i7 << 10) | i8) + 1) | i3);
                                } else {
                                    i9 = i8;
                                }
                                iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f3);
                                i11 = (iFloatToRawIntBits2 >>> 31) << 15;
                                i12 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i13 = iFloatToRawIntBits2 >> 13;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i12 == 255) {
                                    i15 = i12 - 112;
                                    if (i15 >= 31) {
                                        if (i15 <= 0) {
                                            i16 = i13 & 1023;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                s3 = (short) ((((i15 << 10) | i16) + 1) | i11);
                                            } else {
                                                i23 = i16;
                                                i22 = i15;
                                            }
                                        } else if (i15 >= -10) {
                                            i17 = (i14 | 8388608) >> (1 - i15);
                                            if ((i17 & 4096) != 0) {
                                                i17 += 8192;
                                            }
                                            i22 = 0;
                                            i23 = i17 >> 13;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                    return ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) crnVar.c) & 63);
                                }
                                i23 = i14 == 0 ? 0 : 512;
                                i22 = 31;
                                s3 = (short) (i11 | (i22 << 10) | i23);
                                return ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) crnVar.c) & 63);
                            }
                            if (i7 >= -10) {
                                i10 = (i6 | 8388608) >> (1 - i7);
                                if ((i10 & 4096) != 0) {
                                    i10 += 8192;
                                }
                                i9 = i10 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    s2 = (short) (i3 | (i7 << 10) | i9);
                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f3);
                    i11 = (iFloatToRawIntBits2 >>> 31) << 15;
                    i12 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i13 = iFloatToRawIntBits2 >> 13;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i12 == 255) {
                        i15 = i12 - 112;
                        if (i15 >= 31) {
                            if (i15 <= 0) {
                                i16 = i13 & 1023;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    s3 = (short) ((((i15 << 10) | i16) + 1) | i11);
                                } else {
                                    i23 = i16;
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        return ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) crnVar.c) & 63);
                    }
                    i23 = i14 == 0 ? 0 : 512;
                    i22 = 31;
                    s3 = (short) (i11 | (i22 << 10) | i23);
                    return ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) crnVar.c) & 63);
                }
                if (i >= -10) {
                    int i25 = (i19 | 8388608) >> (1 - i);
                    if ((i25 & 4096) != 0) {
                        i25 += 8192;
                    }
                    i2 = i25 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        s = (short) (i21 | (i << 10) | i2);
        iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f2);
        i3 = (iFloatToRawIntBits >>> 31) << 15;
        i4 = (iFloatToRawIntBits >>> 23) & 255;
        i5 = iFloatToRawIntBits >> 13;
        i6 = iFloatToRawIntBits & 8388607;
        if (i4 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i4 - 112;
            if (i7 >= 31) {
                i7 = 49;
                i9 = 0;
            } else {
                if (i7 <= 0) {
                    i8 = i5 & 1023;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        s2 = (short) ((((i7 << 10) | i8) + 1) | i3);
                    } else {
                        i9 = i8;
                    }
                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f3);
                    i11 = (iFloatToRawIntBits2 >>> 31) << 15;
                    i12 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i13 = iFloatToRawIntBits2 >> 13;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i12 == 255) {
                        i15 = i12 - 112;
                        if (i15 >= 31) {
                            if (i15 <= 0) {
                                i16 = i13 & 1023;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    s3 = (short) ((((i15 << 10) | i16) + 1) | i11);
                                } else {
                                    i23 = i16;
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        return ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) crnVar.c) & 63);
                    }
                    i23 = i14 == 0 ? 0 : 512;
                    i22 = 31;
                    s3 = (short) (i11 | (i22 << 10) | i23);
                    return ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) crnVar.c) & 63);
                }
                if (i7 >= -10) {
                    i10 = (i6 | 8388608) >> (1 - i7);
                    if ((i10 & 4096) != 0) {
                        i10 += 8192;
                    }
                    i9 = i10 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        s2 = (short) (i3 | (i7 << 10) | i9);
        iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f3);
        i11 = (iFloatToRawIntBits2 >>> 31) << 15;
        i12 = (iFloatToRawIntBits2 >>> 23) & 255;
        i13 = iFloatToRawIntBits2 >> 13;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i12 == 255) {
            i15 = i12 - 112;
            if (i15 >= 31) {
                if (i15 <= 0) {
                    i16 = i13 & 1023;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        s3 = (short) ((((i15 << 10) | i16) + 1) | i11);
                    } else {
                        i23 = i16;
                        i22 = i15;
                    }
                } else if (i15 >= -10) {
                    i17 = (i14 | 8388608) >> (1 - i15);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i22 = 0;
                    i23 = i17 >> 13;
                } else {
                    i22 = 0;
                }
            }
            return ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) crnVar.c) & 63);
        }
        i23 = i14 == 0 ? 0 : 512;
        i22 = 31;
        s3 = (short) (i11 | (i22 << 10) | i23);
        return ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) crnVar.c) & 63);
    }

    public static final long P(long j, long j2) {
        float[] fArr = defpackage.crp.a;
        defpackage.crn[] crnVarArr = defpackage.crp.y;
        int i = (int) (63 & j2);
        long jE = defpackage.cqg.e(j, crnVarArr[i]);
        float fA = defpackage.cqg.a(jE);
        float fD = defpackage.cqg.d(jE);
        float fD2 = defpackage.cqg.d(j2);
        float fA2 = defpackage.cqg.a(j2);
        float f = 1.0f - fA;
        float f2 = (fA2 * f) + fA;
        return O(f2 == 0.0f ? 0.0f : ((fD * fA) + ((fD2 * fA2) * f)) / f2, f2 == 0.0f ? 0.0f : ((defpackage.cqg.c(jE) * fA) + ((defpackage.cqg.c(j2) * fA2) * f)) / f2, f2 != 0.0f ? ((defpackage.cqg.b(jE) * fA) + ((defpackage.cqg.b(j2) * fA2) * f)) / f2 : 0.0f, f2, crnVarArr[i]);
    }

    public static final long Q(long j, long j2, float f) {
        float[] fArr = defpackage.crp.a;
        defpackage.crn crnVar = defpackage.crp.x;
        long jE = defpackage.cqg.e(j, crnVar);
        long jE2 = defpackage.cqg.e(j2, crnVar);
        float fA = defpackage.cqg.a(jE);
        float fD = defpackage.cqg.d(jE);
        float fC = defpackage.cqg.c(jE);
        float fB = defpackage.cqg.b(jE);
        float fA2 = defpackage.cqg.a(jE2);
        float fD2 = defpackage.cqg.d(jE2);
        float fC2 = defpackage.cqg.c(jE2);
        float fB2 = defpackage.cqg.b(jE2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        float f2 = 1.0f - f;
        return defpackage.cqg.e(O((fD * f2) + (fD2 * f), (fC * f2) + (fC2 * f), (fB * f2) + (fB2 * f), (f2 * fA) + (f * fA2), crnVar), defpackage.crp.y[(int) (j2 & 63)]);
    }

    public static /* synthetic */ long R(float f, float f2, float f3, float f4, defpackage.crn crnVar, int i) {
        if ((i & 16) != 0) {
            float[] fArr = defpackage.crp.a;
            crnVar = defpackage.crp.e;
        }
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        return N(f, f2, f3, f4, crnVar);
    }

    public static final long S() {
        float[] fArr = defpackage.crp.a;
        return N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u);
    }

    public static /* synthetic */ defpackage.cqd T(java.util.List list, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 9187343241974906880L;
        }
        long j3 = j2;
        if ((i & 2) != 0) {
            j = 0;
        }
        return new cqs(list, (java.util.List) null, j, j3);
    }

    public static /* synthetic */ defpackage.cqd U(defpackage.aoiu[] aoiuVarArr) {
        defpackage.aoiu[] aoiuVarArr2 = (defpackage.aoiu[]) java.util.Arrays.copyOf(aoiuVarArr, aoiuVarArr.length);
        java.util.ArrayList arrayList = new java.util.ArrayList(aoiuVarArr2.length);
        for (defpackage.aoiu aoiuVar : aoiuVarArr2) {
            arrayList.add(new defpackage.cqg(((defpackage.cqg) aoiuVar.b).a));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(aoiuVarArr2.length);
        for (defpackage.aoiu aoiuVar2 : aoiuVarArr2) {
            arrayList2.add(java.lang.Float.valueOf(((java.lang.Number) aoiuVar2.a).floatValue()));
        }
        return new cqs(arrayList, arrayList2, 0L, 2139095040L);
    }

    public static final defpackage.apnt V(defpackage.aonn aonnVar) {
        defpackage.ckw.l(defpackage.ckw.a);
        synchronized (defpackage.ckw.b) {
            defpackage.ckw.f = defpackage.ajsz.bU(defpackage.ckw.f, aonnVar);
        }
        return new defpackage.apnt(aonnVar);
    }

    private static final void W(int i, int i2) {
        throw new java.lang.IndexOutOfBoundsException(defpackage.a.bA(i2, i, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void X(int i) {
        throw new java.lang.IndexOutOfBoundsException(defpackage.a.bs(i, "fromIndex (", ") is less than 0."));
    }

    private static final void Y(int i, int i2) {
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    private static final void Z(int i, int i2) {
        throw new java.lang.IllegalArgumentException(defpackage.a.bA(i2, i, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }

    public static final void a(java.util.List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            W(i, size);
        }
    }

    public static final void b(java.util.List list, int i, int i2) {
        if (i > i2) {
            Z(i, i2);
        }
        if (i < 0) {
            X(i);
        }
        if (i2 > list.size()) {
            Y(i2, list.size());
        }
    }

    public static final defpackage.cfh c(defpackage.cfh cfhVar) {
        if (true != (cfhVar instanceof defpackage.cfh)) {
            cfhVar = null;
        }
        if (cfhVar != null) {
            return cfhVar;
        }
        defpackage.cax.a("Inconsistent composition");
        throw new defpackage.aoiq();
    }

    public static final java.lang.Object[] d(java.lang.Object[] objArr, int i, java.lang.Object obj, java.lang.Object obj2) {
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[length + 2];
        defpackage.ajsz.dl(objArr, objArr2, 0, i, 6);
        defpackage.ajsz.dd(objArr, objArr2, i + 2, i, length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final java.lang.Object[] e(java.lang.Object[] objArr, int i) {
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[length - 2];
        defpackage.ajsz.dl(objArr, objArr2, 0, i, 6);
        defpackage.ajsz.dd(objArr, objArr2, i, i + 2, length);
        return objArr2;
    }

    public static final java.lang.Object[] f(java.lang.Object[] objArr, int i) {
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[length - 1];
        defpackage.ajsz.dl(objArr, objArr2, 0, i, 6);
        defpackage.ajsz.dd(objArr, objArr2, i, i + 1, length);
        return objArr2;
    }

    public static final defpackage.cko g() {
        return (defpackage.cko) defpackage.ckw.i.i();
    }

    public static final defpackage.cko h(defpackage.cko ckoVar) {
        if (ckoVar instanceof defpackage.clw) {
            defpackage.clw clwVar = (defpackage.clw) ckoVar;
            if (clwVar.n == java.lang.Thread.currentThread().getId()) {
                clwVar.l = null;
                return ckoVar;
            }
        }
        if (ckoVar instanceof defpackage.clx) {
            defpackage.clx clxVar = (defpackage.clx) ckoVar;
            if (clxVar.b == java.lang.Thread.currentThread().getId()) {
                clxVar.a = null;
                return ckoVar;
            }
        }
        defpackage.cko ckoVarA = defpackage.ckw.a(ckoVar, null, false);
        ckoVarA.w();
        return ckoVarA;
    }

    public static final void i(defpackage.cko ckoVar, defpackage.cko ckoVar2, defpackage.aonj aonjVar) {
        if (ckoVar != ckoVar2) {
            defpackage.ckw.i.j(ckoVar);
            ckoVar2.d();
        } else if (ckoVar instanceof defpackage.clw) {
            ((defpackage.clw) ckoVar).l = aonjVar;
        } else if (ckoVar instanceof defpackage.clx) {
            ((defpackage.clx) ckoVar).a = aonjVar;
        } else {
            java.util.Objects.toString(ckoVar);
            throw new java.lang.IllegalStateException("Non-transparent snapshot was reused: ".concat(java.lang.String.valueOf(ckoVar)));
        }
    }

    public static final void j() {
        boolean z;
        synchronized (defpackage.ckw.b) {
            defpackage.ady adyVar = defpackage.ckw.h.g;
            z = false;
            if (adyVar != null && adyVar.c()) {
                z = true;
            }
        }
        if (z) {
            defpackage.ckw.l(defpackage.ckw.a);
        }
    }

    public static final defpackage.ckk k(defpackage.aonj aonjVar, defpackage.aonj aonjVar2) {
        defpackage.ckk ckkVarA;
        defpackage.cko ckoVarB = defpackage.ckw.b();
        defpackage.ckk ckkVar = ckoVarB instanceof defpackage.ckk ? (defpackage.ckk) ckoVarB : null;
        if (ckkVar == null || (ckkVarA = ckkVar.a(aonjVar, aonjVar2)) == null) {
            throw new java.lang.IllegalStateException("Cannot create a mutable snapshot of a read-only snapshot");
        }
        return ckkVarA;
    }

    public static final defpackage.cjt l(defpackage.cav cavVar) {
        java.lang.Object[] objArr = new java.lang.Object[0];
        defpackage.ckb ckbVar = defpackage.cjw.a;
        defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (objR == defpackage.cau.a) {
            objR = new defpackage.cbz(4);
            cbtVar.ab(objR);
        }
        defpackage.cjw cjwVar = (defpackage.cjw) n(objArr, ckbVar, (defpackage.aomy) objR, cavVar, 384);
        cjwVar.c = (defpackage.cjx) cavVar.e(defpackage.cjz.a);
        return cjwVar;
    }

    public static final java.lang.Object m(java.lang.Object[] objArr, defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        return p(java.util.Arrays.copyOf(objArr, objArr.length), defpackage.ckd.a, aomyVar, cavVar, ((i << 6) & 7168) | 384);
    }

    public static final java.lang.Object n(java.lang.Object[] objArr, defpackage.ckb ckbVar, defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        return p(java.util.Arrays.copyOf(objArr, objArr.length), ckbVar, aomyVar, cavVar, (i & 112) | 384 | ((i << 3) & 7168));
    }

    public static final java.lang.String o(java.lang.Object obj) {
        java.util.Objects.toString(obj);
        return obj.toString().concat(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
    }

    public static final java.lang.Object p(java.lang.Object[] objArr, defpackage.ckb ckbVar, defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        java.lang.Object[] objArr2;
        defpackage.ckb ckbVar2;
        final java.lang.Object obj;
        java.lang.Object objA;
        final java.lang.String string = java.lang.Long.toString(cavVar.a(), 36);
        defpackage.aooh.e(string, "toString(...)");
        if (ckbVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        }
        final defpackage.cjx cjxVar = (defpackage.cjx) cavVar.e(defpackage.cjz.a);
        java.lang.Object objG = cavVar.g();
        java.lang.Object obj2 = defpackage.cau.a;
        if (objG == obj2) {
            java.lang.Object objA2 = (cjxVar == null || (objA = cjxVar.a(string)) == null) ? null : ckbVar.a(objA);
            if (objA2 == null) {
                objA2 = aomyVar.a();
            }
            objArr2 = objArr;
            ckbVar2 = ckbVar;
            objG = new defpackage.cjs(ckbVar2, cjxVar, string, objA2, objArr2);
            cavVar.w(objG);
        } else {
            objArr2 = objArr;
            ckbVar2 = ckbVar;
        }
        final defpackage.cjs cjsVar = (defpackage.cjs) objG;
        java.lang.Object objA3 = java.util.Arrays.equals(objArr2, cjsVar.e) ? cjsVar.d : null;
        if (objA3 == null) {
            objA3 = aomyVar.a();
        }
        boolean zD = cavVar.D(cjsVar);
        boolean z = true;
        if ((((i & 112) ^ 48) <= 32 || !cavVar.D(ckbVar2)) && (i & 48) != 32) {
            z = false;
        }
        boolean zD2 = zD | z | cavVar.D(cjxVar) | cavVar.B(string) | cavVar.D(objA3) | cavVar.D(objArr2);
        java.lang.Object objG2 = cavVar.g();
        if (zD2 || objG2 == obj2) {
            final defpackage.ckb ckbVar3 = ckbVar2;
            final java.lang.Object[] objArr3 = objArr2;
            obj = objA3;
            java.lang.Object obj3 = new defpackage.aomy() { // from class: cjr
                @Override // defpackage.aomy
                public final java.lang.Object a() {
                    boolean z2;
                    defpackage.cjs cjsVar2 = cjsVar;
                    defpackage.cjx cjxVar2 = cjsVar2.b;
                    defpackage.cjx cjxVar3 = cjxVar;
                    boolean z3 = true;
                    if (cjxVar2 != cjxVar3) {
                        cjsVar2.b = cjxVar3;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    java.lang.String str = string;
                    if (defpackage.aooh.n(cjsVar2.c, str)) {
                        z3 = z2;
                    } else {
                        cjsVar2.c = str;
                    }
                    java.lang.Object[] objArr4 = objArr3;
                    java.lang.Object obj4 = obj;
                    cjsVar2.a = ckbVar3;
                    cjsVar2.d = obj4;
                    cjsVar2.e = objArr4;
                    defpackage.adkz adkzVar = cjsVar2.f;
                    if (adkzVar != null && z3) {
                        adkzVar.b();
                        cjsVar2.f = null;
                        cjsVar2.a();
                    }
                    return defpackage.aojh.a;
                }
            };
            cavVar.w(obj3);
            objG2 = obj3;
        } else {
            obj = objA3;
        }
        cavVar.r((defpackage.aomy) objG2);
        return obj;
    }

    public static final defpackage.ckb q(defpackage.aonn aonnVar, defpackage.aonj aonjVar) {
        defpackage.bae baeVar = new defpackage.bae(aonnVar, 8);
        defpackage.aoov.f(aonjVar, 1);
        return new defpackage.dko(baeVar, aonjVar, 1);
    }

    public static final double r(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (java.lang.Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static final double s(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? java.lang.Math.pow((d2 * d) + d3, d6) : d * d4;
    }

    public static final defpackage.crn t(defpackage.crn crnVar, defpackage.csd csdVar, defpackage.crl crlVar) {
        if (crnVar.b != 12884901888L) {
            return crnVar;
        }
        if (crnVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        }
        defpackage.csb csbVar = (defpackage.csb) crnVar;
        defpackage.csd csdVar2 = csbVar.d;
        if (u(csdVar2, csdVar)) {
            return crnVar;
        }
        return new defpackage.csb(csbVar.a, csbVar.h, csdVar, x(v(crlVar.c, csdVar2.a(), csdVar.a()), csbVar.i), csbVar.k, csbVar.n, csbVar.e, csbVar.f, csbVar.g, -1);
    }

    public static final boolean u(defpackage.csd csdVar, defpackage.csd csdVar2) {
        if (csdVar != csdVar2) {
            return java.lang.Math.abs(csdVar.a - csdVar2.a) < 0.001f && java.lang.Math.abs(csdVar.b - csdVar2.b) < 0.001f;
        }
        return true;
    }

    public static final float[] v(float[] fArr, float[] fArr2, float[] fArr3) {
        y(fArr, fArr2);
        y(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrW = w(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return x(fArrW, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static final float[] w(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        int length = fArr.length;
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        return new float[]{f10 / f13, f11 / f13, f12 / f13, ((f3 * f8) - (f2 * f9)) / f13, ((f9 * f) - (f3 * f7)) / f13, ((f7 * f2) - (f8 * f)) / f13, ((f2 * f6) - (f3 * f5)) / f13, ((f3 * f4) - (f6 * f)) / f13, ((f * f5) - (f2 * f4)) / f13};
    }

    public static final float[] x(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = fArr[1];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = (f8 * f2) + (f9 * f4) + (f10 * f6);
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f2 * f12) + (f4 * f13) + (f6 * f14);
        float f16 = fArr2[3];
        float f17 = fArr2[4];
        float f18 = fArr2[5];
        float f19 = (f * f16) + (f3 * f17) + (f5 * f18);
        float f20 = (f8 * f16) + (f9 * f17) + (f10 * f18);
        float f21 = (f16 * f12) + (f17 * f13) + (f18 * f14);
        float f22 = fArr2[6];
        float f23 = fArr2[7];
        float f24 = fArr2[8];
        return new float[]{f7, f11, f15, f19, f20, f21, (f * f22) + (f3 * f23) + (f5 * f24), (f8 * f22) + (f9 * f23) + (f10 * f24), (f12 * f22) + (f13 * f23) + (f14 * f24)};
    }

    public static final void y(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static final defpackage.crs z(defpackage.crn crnVar, defpackage.crn crnVar2) {
        crr crsVar;
        if (crnVar == crnVar2) {
            return new defpackage.crq(crnVar);
        }
        if (crnVar.b == 12884901888L && crnVar2.b == 12884901888L) {
            if (crnVar == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            }
            defpackage.csb csbVar = (defpackage.csb) crnVar;
            if (crnVar2 == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            }
            crsVar = new crr(csbVar, (defpackage.csb) crnVar2);
        } else {
            crsVar = new defpackage.crs(crnVar, crnVar2);
        }
        return crsVar;
    }
}
