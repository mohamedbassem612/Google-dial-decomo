package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class evc {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final java.lang.Object c = new java.lang.Object();
    private static int[] d = new int[10];

    public static int a(int i, int i2, int i3, int i4) {
        int i5 = 2;
        if (i2 != 1 && i2 != 2) {
            i5 = 1;
        }
        return i - (i5 * (i3 + i4));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public static int b(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        ahvr.bY((boolean) ((i3 ^ (-1)) >>> 31));
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            i(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            i(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            i(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    i(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static int c(defpackage.eqg eqgVar) {
        java.lang.String strH = h(eqgVar);
        if (j$.util.Objects.equals(strH, "video/avc")) {
            return 1;
        }
        return (j$.util.Objects.equals(strH, "video/hevc") || j$.util.Objects.equals(strH, "video/vvc")) ? 2 : 0;
    }

    public static int d(byte[] bArr, int i, int i2) {
        while (i < i2 - 1) {
            int i3 = 0;
            while (i < i2) {
                int i4 = i + 1;
                int i5 = bArr[i] & 255;
                i3 += i5;
                if (i5 != 255) {
                    int i6 = 0;
                    while (i4 < i2) {
                        int i7 = i4 + 1;
                        int i8 = bArr[i4] & 255;
                        i6 += i8;
                        if (i8 == 255) {
                            i4 = i7;
                        } else {
                            if (i6 < 0 || i6 > i2 - i7) {
                                return -1;
                            }
                            if (i3 == 45 && i6 > 0) {
                                defpackage.etv etvVar = new defpackage.etv(bArr, i7 + i6);
                                etvVar.l(i7 << 3);
                                int i9 = 0;
                                while (etvVar.a() > 0 && !etvVar.p()) {
                                    i9++;
                                }
                                if (i9 <= 31 && etvVar.a() >= i9 + 1) {
                                    etvVar.n(i9);
                                    if (!etvVar.p()) {
                                        if (etvVar.a() < 7) {
                                            continue;
                                        } else {
                                            int iD = etvVar.d(7);
                                            if (iD == 3) {
                                                return 2;
                                            }
                                            if (iD == 4) {
                                                return 1;
                                            }
                                            if (iD == 6) {
                                            }
                                        }
                                    }
                                    return 0;
                                }
                            }
                            i = i6 + i7;
                        }
                    }
                    return -1;
                }
                i = i4;
            }
            return -1;
        }
        return -1;
    }

    public static int e(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    int i5 = i3 + 1;
                    if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                        break;
                    }
                    i3 = i5;
                }
                if (i3 < i) {
                    int[] iArrCopyOf = d;
                    int length = iArrCopyOf.length;
                    if (length <= i4) {
                        iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, length << 1);
                        d = iArrCopyOf;
                    }
                    iArrCopyOf[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = d[i8] - i6;
                java.lang.System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            java.lang.System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }

    public static defpackage.euy f(defpackage.evf evfVar, boolean z, int i, defpackage.euy euyVar) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int[] iArr2 = new int[6];
        if (z) {
            int iA = evfVar.a(2);
            boolean zG = evfVar.g();
            int iA2 = evfVar.a(5);
            int i5 = 0;
            for (int i6 = 0; i6 < 32; i6++) {
                if (evfVar.g()) {
                    i5 |= 1 << i6;
                }
            }
            for (int i7 = 0; i7 < 6; i7++) {
                iArr2[i7] = evfVar.a(8);
            }
            i2 = iA;
            iArr = iArr2;
            i3 = iA2;
            i4 = i5;
            z2 = zG;
        } else if (euyVar != null) {
            int i8 = euyVar.a;
            boolean z3 = euyVar.b;
            int i9 = euyVar.c;
            int i10 = euyVar.d;
            i2 = i8;
            iArr = euyVar.e;
            i3 = i9;
            i4 = i10;
            z2 = z3;
        } else {
            iArr = iArr2;
            i2 = 0;
            z2 = false;
            i3 = 0;
            i4 = 0;
        }
        int iA3 = evfVar.a(8);
        int i11 = 0;
        for (int i12 = 0; i12 < i; i12++) {
            if (evfVar.g()) {
                i11 += 88;
            }
            if (evfVar.g()) {
                i11 += 8;
            }
        }
        evfVar.e(i11);
        if (i > 0) {
            evfVar.e((8 - i) << 1);
        }
        return new defpackage.euy(i2, z2, i3, i4, iArr, iA3);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0185  */
    /* JADX WARN: Code duplicated, block: B:104:0x0189  */
    /* JADX WARN: Code duplicated, block: B:105:0x018f  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01de  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0205  */
    /* JADX WARN: Code duplicated, block: B:136:0x0211  */
    /* JADX WARN: Code duplicated, block: B:138:0x022e  */
    /* JADX WARN: Code duplicated, block: B:143:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:94:0x0163  */
    /* JADX WARN: Code duplicated, block: B:96:0x0169  */
    /* JADX WARN: Code duplicated, block: B:98:0x0173  */
    public static defpackage.evb g(byte[] bArr, int i, int i2) {
        int iB;
        int i3;
        int iB2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iB3;
        int i15;
        float f;
        float f2;
        int i16;
        int i17;
        int i18;
        int i19;
        int iA;
        int iB4;
        int i20;
        boolean zG;
        boolean zG2;
        int i21;
        int iA2;
        int iA3;
        int iA4;
        int i22;
        defpackage.evf evfVar = new defpackage.evf(bArr, i, i2);
        int iA5 = evfVar.a(8);
        int iA6 = evfVar.a(8);
        int iA7 = evfVar.a(8);
        int iB5 = evfVar.b();
        if (iA5 == 100 || iA5 == 110 || iA5 == 122 || iA5 == 244 || iA5 == 44 || iA5 == 83 || iA5 == 86 || iA5 == 118 || iA5 == 128) {
            iB = evfVar.b();
            if (iB == 3) {
                evfVar.g();
                i3 = 3;
            } else {
                i3 = iB;
            }
            iB2 = evfVar.b();
            int iB6 = evfVar.b();
            evfVar.d();
            if (evfVar.g()) {
                if (i3 != 3) {
                    i5 = 8;
                } else {
                    i5 = 12;
                }
                for (i6 = 0; i6 < i5; i6++) {
                    if (!evfVar.g()) {
                        if (i6 < 6) {
                            i7 = 16;
                        } else {
                            i7 = 64;
                        }
                        i8 = 0;
                        i9 = 8;
                        i10 = 8;
                        while (i8 < i7) {
                            if (i9 != 0) {
                                int iB7 = evfVar.b();
                                i12 = iB7 % 2;
                                int i23 = (iB7 + 1) / 2;
                                if (i12 == 0) {
                                    i13 = -1;
                                } else {
                                    i13 = 1;
                                }
                                i11 = ((i10 + (i13 * i23)) + 256) % 256;
                            } else {
                                i11 = 0;
                            }
                            if (i11 != 0) {
                                i10 = i11;
                            }
                            i8++;
                            i9 = i11;
                        }
                    }
                }
            }
            i4 = iB6;
        } else if (iA5 == 138) {
            iA5 = 138;
            iB = evfVar.b();
            if (iB == 3) {
                evfVar.g();
                i3 = 3;
            } else {
                i3 = iB;
            }
            iB2 = evfVar.b();
            int iB8 = evfVar.b();
            evfVar.d();
            if (evfVar.g()) {
                if (i3 != 3) {
                    i5 = 8;
                } else {
                    i5 = 12;
                }
                while (i6 < i5) {
                    if (!evfVar.g()) {
                        if (i6 < 6) {
                            i7 = 16;
                        } else {
                            i7 = 64;
                        }
                        i8 = 0;
                        i9 = 8;
                        i10 = 8;
                        while (i8 < i7) {
                            if (i9 != 0) {
                                int iB9 = evfVar.b();
                                i12 = iB9 % 2;
                                int i24 = (iB9 + 1) / 2;
                                if (i12 == 0) {
                                    i13 = -1;
                                } else {
                                    i13 = 1;
                                }
                                i11 = ((i10 + (i13 * i24)) + 256) % 256;
                            } else {
                                i11 = 0;
                            }
                            if (i11 != 0) {
                                i10 = i11;
                            }
                            i8++;
                            i9 = i11;
                        }
                    }
                }
            }
            i4 = iB8;
        } else {
            iB = 1;
            i4 = 0;
            iB2 = 0;
        }
        evfVar.b();
        int iB10 = evfVar.b();
        if (iB10 == 0) {
            evfVar.b();
        } else if (iB10 == 1) {
            evfVar.g();
            evfVar.b();
            evfVar.b();
            long jB = evfVar.b();
            for (int i25 = 0; i25 < jB; i25++) {
                evfVar.b();
            }
        }
        evfVar.b();
        evfVar.d();
        int iB11 = evfVar.b() + 1;
        int iB12 = evfVar.b() + 1;
        boolean zG3 = evfVar.g();
        int i26 = 2 - (zG3 ? 1 : 0);
        if (!zG3) {
            evfVar.d();
        }
        evfVar.d();
        int i27 = iB11 << 4;
        int i28 = (iB12 * i26) << 4;
        if (evfVar.g()) {
            int iB13 = evfVar.b();
            int iB14 = evfVar.b();
            int iB15 = evfVar.b();
            int iB16 = evfVar.b();
            if (iB == 0) {
                i22 = 1;
            } else {
                i22 = iB == 3 ? 1 : 2;
                i26 *= iB == 1 ? 2 : 1;
            }
            i27 -= (iB13 + iB14) * i22;
            i28 -= (iB15 + iB16) * i26;
        }
        int i29 = i27;
        int i30 = i28;
        if (iA5 != 44 && iA5 != 86 && iA5 != 100 && iA5 != 110 && iA5 != 122) {
            if (iA5 == 244) {
                i14 = 244;
            } else {
                i15 = iA5;
            }
            f = 1.0f;
            if (evfVar.g()) {
                if (evfVar.g()) {
                    iA2 = evfVar.a(8);
                    if (iA2 == 255) {
                        iA3 = evfVar.a(16);
                        iA4 = evfVar.a(16);
                        if (iA3 != 0 && iA4 != 0) {
                            f = iA3 / iA4;
                        }
                    } else if (iA2 < 17) {
                        f = b[iA2];
                    } else {
                        defpackage.etr.f("NalUnitUtil", a.bj(iA2, "Unexpected aspect_ratio_idc value: "));
                    }
                }
                if (evfVar.g()) {
                    evfVar.d();
                }
                if (evfVar.g()) {
                    evfVar.e(3);
                    i21 = true != evfVar.g() ? 2 : 1;
                    if (evfVar.g()) {
                        int iA8 = evfVar.a(8);
                        int iA9 = evfVar.a(8);
                        evfVar.e(8);
                        iA = defpackage.epy.a(iA8);
                        iB4 = defpackage.epy.b(iA9);
                        i20 = i21;
                    } else {
                        i20 = i21;
                        iA = -1;
                        iB4 = -1;
                    }
                } else {
                    iA = -1;
                    iB4 = -1;
                    i20 = -1;
                }
                if (evfVar.g()) {
                    evfVar.b();
                    evfVar.b();
                }
                if (evfVar.g()) {
                    evfVar.e(65);
                }
                zG = evfVar.g();
                if (zG) {
                    n(evfVar);
                }
                zG2 = evfVar.g();
                if (zG2) {
                    n(evfVar);
                }
                if (zG || zG2) {
                    evfVar.d();
                }
                evfVar.d();
                if (evfVar.g()) {
                    evfVar.d();
                    evfVar.b();
                    evfVar.b();
                    evfVar.b();
                    evfVar.b();
                    iB3 = evfVar.b();
                    evfVar.b();
                }
                i17 = iA;
                f2 = f;
                i16 = iB3;
                i18 = i20;
                i19 = iB4;
            } else {
                f2 = 1.0f;
                i16 = iB3;
                i17 = -1;
                i18 = -1;
                i19 = -1;
            }
            return new defpackage.evb(i15, iA6, iA7, iB5, i29, i30, f2, iB2, i4, i17, i18, i19, i16);
        }
        i14 = iA5;
        i15 = i14;
        iB3 = (iA6 & 16) != 0 ? 0 : 16;
        f = 1.0f;
        if (evfVar.g()) {
            if (evfVar.g()) {
                iA2 = evfVar.a(8);
                if (iA2 == 255) {
                    iA3 = evfVar.a(16);
                    iA4 = evfVar.a(16);
                    if (iA3 != 0) {
                        f = iA3 / iA4;
                    }
                } else if (iA2 < 17) {
                    f = b[iA2];
                } else {
                    defpackage.etr.f("NalUnitUtil", a.bj(iA2, "Unexpected aspect_ratio_idc value: "));
                }
            }
            if (evfVar.g()) {
                evfVar.d();
            }
            if (evfVar.g()) {
                evfVar.e(3);
                if (true != evfVar.g()) {
                }
                if (evfVar.g()) {
                    int iA10 = evfVar.a(8);
                    int iA11 = evfVar.a(8);
                    evfVar.e(8);
                    iA = defpackage.epy.a(iA10);
                    iB4 = defpackage.epy.b(iA11);
                    i20 = i21;
                } else {
                    i20 = i21;
                    iA = -1;
                    iB4 = -1;
                }
            } else {
                iA = -1;
                iB4 = -1;
                i20 = -1;
            }
            if (evfVar.g()) {
                evfVar.b();
                evfVar.b();
            }
            if (evfVar.g()) {
                evfVar.e(65);
            }
            zG = evfVar.g();
            if (zG) {
                n(evfVar);
            }
            zG2 = evfVar.g();
            if (zG2) {
                n(evfVar);
            }
            if (zG) {
                evfVar.d();
            } else {
                evfVar.d();
            }
            evfVar.d();
            if (evfVar.g()) {
                evfVar.d();
                evfVar.b();
                evfVar.b();
                evfVar.b();
                evfVar.b();
                iB3 = evfVar.b();
                evfVar.b();
            }
            i17 = iA;
            f2 = f;
            i16 = iB3;
            i18 = i20;
            i19 = iB4;
        } else {
            f2 = 1.0f;
            i16 = iB3;
            i17 = -1;
            i18 = -1;
            i19 = -1;
        }
        return new defpackage.evb(i15, iA6, iA7, iB5, i29, i30, f2, iB2, i4, i17, i18, i19, i16);
    }

    public static java.lang.String h(defpackage.eqg eqgVar) {
        java.lang.String str;
        java.lang.String str2 = eqgVar.p;
        if (!j$.util.Objects.equals(str2, "video/dolby-vision") || (str = eqgVar.k) == null) {
            return str2;
        }
        if (str.startsWith("dva1") || str.startsWith("dvav")) {
            return "video/avc";
        }
        return (str.startsWith("dvh1") || str.startsWith("dvhe")) ? "video/hevc" : str2;
    }

    public static void i(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean j(byte[] bArr, int i, defpackage.eqg eqgVar) {
        int i2;
        java.lang.String str = eqgVar.p;
        if (j$.util.Objects.equals(str, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i2 = b2 & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (j$.util.Objects.equals(str, "video/hevc")) {
            defpackage.ahoz ahozVarL = l(new defpackage.evf(bArr, 4, i + 4));
            int i3 = ahozVarL.b;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && ahozVarL.c == eqgVar.G - 1) {
                return false;
            }
        }
        return true;
    }

    public static absu k(byte[] bArr, int i) {
        defpackage.evf evfVar = new defpackage.evf(bArr, 4, i);
        int iB = evfVar.b();
        evfVar.b();
        evfVar.d();
        evfVar.g();
        return new absu(iB);
    }

    public static defpackage.ahoz l(defpackage.evf evfVar) {
        evfVar.d();
        return new defpackage.ahoz(evfVar.a(6), evfVar.a(6), evfVar.a(3) - 1, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:197:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    public static defpackage.eva m(byte[] bArr, int i, int i2, defpackage.jyn jynVar) {
        int i3;
        boolean z;
        int i4;
        int iA;
        int i5;
        int i6;
        int i7;
        int iB;
        int iB2;
        int i8;
        int i9;
        int iMax;
        float f;
        int i10;
        int i11;
        int i12;
        int iA2;
        int iB3;
        int i13;
        java.lang.Object obj;
        int i14;
        java.lang.Object obj2;
        defpackage.ahoz ahozVarL = l(new defpackage.evf(bArr, i, i2));
        defpackage.evf evfVar = new defpackage.evf(bArr, i + 2, i2);
        int i15 = 4;
        evfVar.e(4);
        int iA3 = evfVar.a(3);
        int i16 = ahozVarL.a;
        if (i16 == 0 || iA3 != 7) {
            i3 = iA3;
            z = false;
        } else {
            z = true;
            i3 = 7;
        }
        if (jynVar != null) {
            aify aifyVar = (aify) jynVar.c;
            if (aifyVar.isEmpty()) {
                i4 = 0;
            } else {
                i4 = ((defpackage.fsx) aifyVar.get(java.lang.Math.min(i16, aifyVar.size() - 1))).b;
            }
        } else {
            i4 = 0;
        }
        defpackage.euy euyVarF = null;
        if (!z) {
            evfVar.d();
            euyVarF = f(evfVar, true, i3, null);
        } else if (jynVar != null) {
            ils ilsVar = (ils) jynVar.d;
            int i17 = ((int[]) ilsVar.b)[i4];
            aify aifyVar2 = (aify) ilsVar.a;
            if (aifyVar2.size() > i17) {
                euyVarF = (defpackage.euy) aifyVar2.get(i17);
            }
        }
        evfVar.b();
        if (z) {
            int iA4 = evfVar.g() ? evfVar.a(8) : -1;
            if (jynVar == null || (obj2 = jynVar.b) == null) {
                iB = 0;
                iB2 = 0;
                i9 = 0;
                i7 = 0;
                i8 = 0;
                i6 = 0;
            } else {
                if (iA4 == -1) {
                    iA4 = ((int[]) ((ils) obj2).a)[i4];
                }
                if (iA4 != -1) {
                    aify aifyVar3 = (aify) ((ils) obj2).b;
                    if (aifyVar3.size() > iA4) {
                        defpackage.euz euzVar = (defpackage.euz) aifyVar3.get(iA4);
                        int i18 = euzVar.a;
                        i9 = euzVar.d;
                        i7 = euzVar.e;
                        iB = euzVar.b;
                        iB2 = euzVar.c;
                        i8 = i9;
                        i6 = i7;
                    } else {
                        iB = 0;
                        iB2 = 0;
                        i9 = 0;
                        i7 = 0;
                        i8 = 0;
                        i6 = 0;
                    }
                } else {
                    iB = 0;
                    iB2 = 0;
                    i9 = 0;
                    i7 = 0;
                    i8 = 0;
                    i6 = 0;
                }
            }
        } else {
            int iB4 = evfVar.b();
            if (iB4 == 3) {
                evfVar.d();
                iB4 = 3;
            }
            int iB5 = evfVar.b();
            int iB6 = evfVar.b();
            if (evfVar.g()) {
                int iB7 = evfVar.b();
                int iB8 = evfVar.b();
                int iB9 = evfVar.b();
                int iB10 = evfVar.b();
                iA = a(iB5, iB4, iB7, iB8);
                i5 = iB6 - ((iB4 == 1 ? 2 : 1) * (iB9 + iB10));
            } else {
                iA = iB5;
                i5 = iB6;
            }
            i6 = iB6;
            i7 = i5;
            iB = evfVar.b();
            iB2 = evfVar.b();
            i8 = iB5;
            i9 = iA;
        }
        int iB11 = evfVar.b();
        if (z) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i19 = true != evfVar.g() ? i3 : 0; i19 <= i3; i19++) {
                evfVar.b();
                iMax = java.lang.Math.max(evfVar.b(), iMax);
                evfVar.b();
            }
        }
        evfVar.b();
        evfVar.b();
        evfVar.b();
        evfVar.b();
        evfVar.b();
        evfVar.b();
        if (evfVar.g()) {
            int i20 = 6;
            if (z && evfVar.g()) {
                evfVar.e(6);
            } else if (evfVar.g()) {
                int i21 = 0;
                while (i21 < i15) {
                    int i22 = 0;
                    while (i22 < i20) {
                        if (evfVar.g()) {
                            int iMin = java.lang.Math.min(64, 1 << ((i21 << 1) + 4));
                            if (i21 > 1) {
                                evfVar.b();
                            }
                            for (int i23 = 0; i23 < iMin; i23++) {
                                evfVar.b();
                            }
                        } else {
                            evfVar.b();
                        }
                        i22 += i21 == 3 ? 3 : 1;
                        i20 = 6;
                    }
                    i21++;
                    i15 = 4;
                    i20 = 6;
                }
            }
        }
        evfVar.e(2);
        if (evfVar.g()) {
            evfVar.e(8);
            evfVar.b();
            evfVar.b();
            evfVar.d();
        }
        int iB12 = evfVar.b();
        int i24 = 0;
        int[] iArrCopyOf = new int[0];
        int[] iArr = new int[0];
        int i25 = -1;
        int i26 = -1;
        while (i24 < iB12) {
            if (i24 == 0 || !evfVar.g()) {
                int iB13 = evfVar.b();
                int iB14 = evfVar.b();
                int[] iArr2 = new int[iB13];
                int i27 = 0;
                while (i27 < iB13) {
                    iArr2[i27] = (i27 > 0 ? iArr2[i27 - 1] : 0) - (evfVar.b() + 1);
                    evfVar.d();
                    i27++;
                }
                int[] iArr3 = new int[iB14];
                int i28 = 0;
                while (i28 < iB14) {
                    iArr3[i28] = (i28 > 0 ? iArr3[i28 - 1] : 0) + evfVar.b() + 1;
                    evfVar.d();
                    i28++;
                }
                i26 = iB13;
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i25 = iB14;
            } else {
                int i29 = i26 + i25;
                boolean zG = evfVar.g();
                int iB15 = evfVar.b() + 1;
                int i30 = 1 - ((zG ? 1 : 0) << 1);
                int i31 = i29 + 1;
                boolean[] zArr = new boolean[i31];
                for (int i32 = 0; i32 <= i29; i32++) {
                    if (evfVar.g()) {
                        zArr[i32] = true;
                    } else {
                        zArr[i32] = evfVar.g();
                    }
                }
                int i33 = i25 - 1;
                int[] iArr4 = new int[i31];
                int[] iArr5 = new int[i31];
                int i34 = 0;
                while (true) {
                    i14 = i30 * iB15;
                    if (i33 < 0) {
                        break;
                    }
                    int i35 = iArrCopyOf[i33] + i14;
                    if (i35 < 0 && zArr[i26 + i33]) {
                        iArr4[i34] = i35;
                        i34++;
                    }
                    i33--;
                }
                if (i14 < 0 && zArr[i29]) {
                    iArr4[i34] = i14;
                    i34++;
                }
                int i36 = i34;
                for (int i37 = 0; i37 < i26; i37++) {
                    int i38 = iArr[i37] + i14;
                    if (i38 < 0 && zArr[i37]) {
                        iArr4[i36] = i38;
                        i36++;
                    }
                }
                int[] iArrCopyOf2 = java.util.Arrays.copyOf(iArr4, i36);
                int i39 = 0;
                for (int i40 = i26 - 1; i40 >= 0; i40--) {
                    int i41 = iArr[i40] + i14;
                    if (i41 > 0 && zArr[i40]) {
                        iArr5[i39] = i41;
                        i39++;
                    }
                }
                if (i14 > 0 && zArr[i29]) {
                    iArr5[i39] = i14;
                    i39++;
                }
                iArr = iArrCopyOf2;
                int i42 = i39;
                for (int i43 = 0; i43 < i25; i43++) {
                    int i44 = iArrCopyOf[i43] + i14;
                    if (i44 > 0 && zArr[i26 + i43]) {
                        iArr5[i42] = i44;
                        i42++;
                    }
                }
                iArrCopyOf = java.util.Arrays.copyOf(iArr5, i42);
                i26 = i36;
                i25 = i42;
            }
            i24++;
            iB12 = iB12;
            iMax = iMax;
            i4 = i4;
        }
        int i45 = i4;
        int i46 = iMax;
        if (evfVar.g()) {
            int iB16 = evfVar.b();
            for (int i47 = 0; i47 < iB16; i47++) {
                evfVar.e(iB11 + 5);
            }
        }
        evfVar.e(2);
        float f2 = 1.0f;
        if (evfVar.g()) {
            if (evfVar.g()) {
                int iA5 = evfVar.a(8);
                if (iA5 == 255) {
                    int iA6 = evfVar.a(16);
                    int iA7 = evfVar.a(16);
                    if (iA6 != 0 && iA7 != 0) {
                        f2 = iA6 / iA7;
                    }
                } else if (iA5 < 17) {
                    f2 = b[iA5];
                } else {
                    defpackage.etr.f("NalUnitUtil", a.bj(iA5, "Unexpected aspect_ratio_idc value: "));
                }
            }
            if (evfVar.g()) {
                evfVar.d();
            }
            if (evfVar.g()) {
                evfVar.e(3);
                i13 = true != evfVar.g() ? 2 : 1;
                if (evfVar.g()) {
                    int iA8 = evfVar.a(8);
                    int iA9 = evfVar.a(8);
                    evfVar.e(8);
                    iA2 = defpackage.epy.a(iA8);
                    iB3 = defpackage.epy.b(iA9);
                } else {
                    iA2 = -1;
                    iB3 = -1;
                }
            } else if (jynVar == null || (obj = jynVar.a) == null) {
                iA2 = -1;
                iB3 = -1;
                i13 = -1;
            } else {
                ils ilsVar2 = (ils) obj;
                int i48 = ((int[]) ilsVar2.a)[i45];
                aify aifyVar4 = (aify) ilsVar2.b;
                if (aifyVar4.size() > i48) {
                    defpackage.ahoz ahozVar = (defpackage.ahoz) aifyVar4.get(i48);
                    int i49 = ahozVar.b;
                    int i50 = ahozVar.a;
                    iB3 = ahozVar.c;
                    iA2 = i49;
                    i13 = i50;
                } else {
                    iA2 = -1;
                    iB3 = -1;
                    i13 = -1;
                }
            }
            if (evfVar.g()) {
                evfVar.b();
                evfVar.b();
            }
            evfVar.d();
            if (evfVar.g()) {
                i7 <<= 1;
            }
            i10 = iA2;
            i12 = iB3;
            f = f2;
            i11 = i13;
        } else {
            f = 1.0f;
            i10 = -1;
            i11 = -1;
            i12 = -1;
        }
        return new defpackage.eva(i3, euyVarF, iB, iB2, i9, i7, i8, i6, f, i46, i10, i11, i12);
    }

    private static void n(defpackage.evf evfVar) {
        int iB = evfVar.b() + 1;
        evfVar.e(8);
        for (int i = 0; i < iB; i++) {
            evfVar.b();
            evfVar.b();
            evfVar.d();
        }
        evfVar.e(20);
    }
}
