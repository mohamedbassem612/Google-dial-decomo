package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fsl implements defpackage.frt {
    private static final byte[] a = {0, 7, 8, 15};
    private static final byte[] b = {0, 119, -120, -1};
    private static final byte[] c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final android.graphics.Paint d;
    private final android.graphics.Paint e;
    private final android.graphics.Canvas f;
    private final defpackage.fsk g;
    private android.graphics.Bitmap h;
    private final defpackage.fso i;
    private final defpackage.adss j;

    public fsl(java.util.List list) {
        defpackage.etx etxVar = new defpackage.etx((byte[]) list.get(0));
        int iS = etxVar.s();
        int iS2 = etxVar.s();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.e = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f = new android.graphics.Canvas();
        this.i = new defpackage.fso(719, 575, 0, 719, 0, 575, null);
        this.j = new defpackage.adss(0, f(), g(), h());
        this.g = new defpackage.fsk(iS, iS2);
    }

    private static void d(byte[] bArr, int[] iArr, int i, int i2, int i3, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int iD;
        int iD2;
        int iD3;
        int i4;
        int iD4;
        int iD5;
        int i5;
        int i6;
        int iD6;
        int i7;
        android.graphics.Paint paint2 = paint;
        defpackage.etv etvVar = new defpackage.etv(bArr);
        int i8 = i2;
        int i9 = i3;
        byte[] bArrE = null;
        byte[] bArrE2 = null;
        byte[] bArrE3 = null;
        while (etvVar.a() != 0) {
            int iD7 = etvVar.d(8);
            if (iD7 != 240) {
                int i10 = 4;
                int i11 = 1;
                int i12 = 2;
                switch (iD7) {
                    case 16:
                        if (i == 3) {
                            if (bArrE == null) {
                                bArr3 = b;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrE;
                            }
                        } else if (i != 2) {
                            bArr2 = null;
                        } else if (bArrE3 == null) {
                            bArr3 = a;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrE3;
                        }
                        boolean z = false;
                        while (true) {
                            int iD8 = etvVar.d(2);
                            if (iD8 != 0) {
                                iD = iD8;
                                z = z;
                                iD2 = 1;
                            } else {
                                if (etvVar.p()) {
                                    iD3 = etvVar.d(3) + 3;
                                    iD = etvVar.d(2);
                                } else {
                                    if (etvVar.p()) {
                                        iD2 = 1;
                                    } else {
                                        int iD9 = etvVar.d(2);
                                        if (iD9 == 0) {
                                            z = true;
                                        } else if (iD9 == 1) {
                                            iD2 = 2;
                                        } else if (iD9 == 2) {
                                            z = z;
                                            iD2 = etvVar.d(4) + 12;
                                            iD = etvVar.d(2);
                                        } else if (iD9 != 3) {
                                            z = z;
                                        } else {
                                            iD3 = etvVar.d(8) + 29;
                                            iD = etvVar.d(2);
                                        }
                                        iD = 0;
                                        iD2 = 0;
                                    }
                                    iD = 0;
                                }
                                iD2 = iD3;
                                z = z;
                            }
                            if (iD2 != 0 && paint2 != null) {
                                int i13 = i9 + 1;
                                float f = i9;
                                if (bArr2 != 0) {
                                    iD = bArr2[iD];
                                }
                                paint2.setColor(iArr[iD]);
                                canvas.drawRect(i8, f, i8 + iD2, i13, paint2);
                            }
                            i8 += iD2;
                            if (z) {
                                etvVar.h();
                            } else {
                                paint2 = paint;
                                z = z;
                            }
                            break;
                        }
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        byte[] bArr4 = i == 3 ? bArrE2 == null ? c : bArrE2 : null;
                        boolean z2 = false;
                        while (true) {
                            int iD10 = etvVar.d(i10);
                            if (iD10 != 0) {
                                z2 = z2;
                                i4 = 1;
                            } else if (etvVar.p()) {
                                if (etvVar.p()) {
                                    int iD11 = etvVar.d(i12);
                                    if (iD11 == 0) {
                                        i4 = 1;
                                    } else if (iD11 == 1) {
                                        i4 = i12;
                                    } else if (iD11 == i12) {
                                        iD4 = etvVar.d(i10) + 9;
                                        iD5 = etvVar.d(i10);
                                    } else if (iD11 != 3) {
                                        z2 = z2;
                                        iD10 = 0;
                                        i4 = 0;
                                    } else {
                                        iD4 = etvVar.d(8) + 25;
                                        iD5 = etvVar.d(i10);
                                    }
                                    iD10 = 0;
                                } else {
                                    iD4 = etvVar.d(i12) + i10;
                                    iD5 = etvVar.d(i10);
                                }
                                i4 = iD4;
                                z2 = z2;
                                iD10 = iD5;
                            } else {
                                int iD12 = etvVar.d(3);
                                if (iD12 != 0) {
                                    i4 = iD12 + 2;
                                    iD10 = 0;
                                } else {
                                    z2 = true;
                                    iD10 = 0;
                                    i4 = 0;
                                }
                            }
                            if (i4 == 0 || paint2 == null) {
                                i5 = i12;
                            } else {
                                int i14 = i9 + 1;
                                float f2 = i9;
                                if (bArr4 != 0) {
                                    iD10 = bArr4[iD10];
                                }
                                paint2.setColor(iArr[iD10]);
                                i5 = 2;
                                canvas.drawRect(i8, f2, i8 + i4, i14, paint2);
                            }
                            i8 += i4;
                            if (z2) {
                                etvVar.h();
                                continue;
                            } else {
                                i12 = i5;
                                z2 = z2;
                                i10 = 4;
                            }
                            break;
                        }
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        int i15 = i8;
                        int i16 = 0;
                        while (true) {
                            int iD13 = etvVar.d(8);
                            if (iD13 != 0) {
                                i6 = i16;
                                iD6 = i11;
                            } else if (etvVar.p()) {
                                i6 = i16;
                                iD6 = etvVar.d(7);
                                iD13 = etvVar.d(8);
                            } else {
                                int iD14 = etvVar.d(7);
                                if (iD14 != 0) {
                                    i6 = i16;
                                    iD6 = iD14;
                                    iD13 = 0;
                                } else {
                                    i6 = i11;
                                    iD13 = 0;
                                    iD6 = 0;
                                }
                            }
                            if (iD6 == 0 || paint2 == null) {
                                i7 = i11;
                            } else {
                                paint2.setColor(iArr[iD13]);
                                i7 = i11;
                                canvas.drawRect(i15, i9, i15 + iD6, i9 + 1, paint2);
                            }
                            i15 += iD6;
                            if (i6 != 0) {
                                i8 = i15;
                                continue;
                            } else {
                                i11 = i7;
                                i16 = i6;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iD7) {
                            case 32:
                                bArrE3 = e(4, 4, etvVar);
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                bArrE = e(4, 8, etvVar);
                                break;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                bArrE2 = e(16, 8, etvVar);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            } else {
                i9 += 2;
                i8 = i2;
            }
            paint2 = paint;
        }
    }

    private static byte[] e(int i, int i2, defpackage.etv etvVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) etvVar.d(i2);
        }
        return bArr;
    }

    private static int[] f() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = ((1 != i4 ? 0 : 255) << 16) | (-16777216) | ((i3 != 0 ? 255 : 0) << 8) | (i2 == 0 ? 0 : 255);
            } else {
                iArr[i] = ((1 != i4 ? 0 : 127) << 16) | (-16777216) | ((i3 != 0 ? 127 : 0) << 8) | (i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] h() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = ((1 != (i & 1) ? 0 : 255) << 16) | 1056964608 | (((i & 2) != 0 ? 255 : 0) << 8) | ((i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = (((1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0)) << 16) | (-16777216) | ((((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0)) << 8) | (((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = (((1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0)) << 16) | 2130706432 | ((((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0)) << 8) | (((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = ((((1 != (i & 1) ? 0 : 43) + 127) + ((i & 16) != 0 ? 85 : 0)) << 16) | (-16777216) | (((((i & 2) != 0 ? 43 : 0) + 127) + ((i & 32) != 0 ? 85 : 0)) << 8) | (((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = (((1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0)) << 16) | (-16777216) | ((((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0)) << 8) | (((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static defpackage.hds i(defpackage.etv etvVar) {
        byte[] bArr;
        int iD = etvVar.d(16);
        etvVar.n(4);
        int iD2 = etvVar.d(2);
        boolean zP = etvVar.p();
        etvVar.n(1);
        byte[] bArr2 = eum.b;
        if (iD2 != 1) {
            if (iD2 == 0) {
                int iD3 = etvVar.d(16);
                int iD4 = etvVar.d(16);
                if (iD3 > 0) {
                    bArr2 = new byte[iD3];
                    etvVar.r(bArr2, iD3);
                }
                if (iD4 > 0) {
                    bArr = new byte[iD4];
                    etvVar.r(bArr, iD4);
                }
            }
            return new defpackage.hds(iD, zP, bArr2, bArr);
        }
        etvVar.n(etvVar.d(8) << 4);
        bArr = bArr2;
        return new defpackage.hds(iD, zP, bArr2, bArr);
    }

    private static defpackage.adss j(defpackage.etv etvVar, int i) {
        int[] iArr;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int i2 = 8;
        int iD5 = etvVar.d(8);
        etvVar.n(8);
        int[] iArrF = f();
        int[] iArrG = g();
        int[] iArrH = h();
        int i3 = i - 2;
        while (i3 > 0) {
            int iD6 = etvVar.d(i2);
            int iD7 = etvVar.d(i2);
            if ((iD7 & 128) != 0) {
                iArr = iArrF;
            } else {
                iArr = (iD7 & 64) != 0 ? iArrG : iArrH;
            }
            if ((iD7 & 1) != 0) {
                iD3 = etvVar.d(i2);
                iD4 = etvVar.d(i2);
                iD = etvVar.d(i2);
                iD2 = etvVar.d(i2);
                i3 -= 6;
            } else {
                int iD8 = etvVar.d(6) << 2;
                int iD9 = etvVar.d(4) << 4;
                i3 -= 4;
                iD = etvVar.d(4) << 4;
                iD2 = etvVar.d(2) << 6;
                iD3 = iD8;
                iD4 = iD9;
            }
            if (iD3 == 0) {
                iD2 = 255;
                iD4 = 0;
                iD = 0;
            }
            int i4 = i2;
            double d = iD3;
            double d2 = iD4 - 128;
            int[] iArr2 = iArr;
            double d3 = iD - 128;
            iArr2[iD6] = (((byte) (255 - (iD2 & 255))) << 24) | (eum.c((int) (d + (1.402d * d2)), 0, 255) << 16) | (eum.c((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | eum.c((int) (d + (d3 * 1.772d)), 0, 255);
            i2 = i4;
            iD5 = iD5;
        }
        return new defpackage.adss(iD5, iArrF, iArrG, iArrH);
    }

    @Override // defpackage.frt
    public final /* synthetic */ defpackage.frj a(byte[] bArr, int i, int i2) {
        return defpackage.fsu.a(this, bArr, i2);
    }

    @Override // defpackage.frt
    public final void b(byte[] bArr, int i, int i2, defpackage.frs frsVar, java.util.function.Consumer consumer) {
        boolean z;
        defpackage.frf frfVar;
        android.graphics.Canvas canvas;
        android.graphics.Canvas canvas2;
        int i3;
        defpackage.fsj fsjVar;
        int iD;
        int iD2;
        int i4;
        int iD3;
        defpackage.etv etvVar = new defpackage.etv(bArr, i + i2);
        etvVar.l(i);
        while (true) {
            z = true;
            if (etvVar.a() >= 48 && etvVar.d(8) == 15) {
                defpackage.fsk fskVar = this.g;
                int iD4 = etvVar.d(8);
                int i5 = 16;
                int iD5 = etvVar.d(16);
                int iD6 = etvVar.d(16);
                int iB = etvVar.b() + iD6;
                if ((iD6 << 3) > etvVar.a()) {
                    defpackage.etr.f("DvbParser", "Data field length exceeds limit");
                    etvVar.n(etvVar.a());
                } else {
                    switch (iD4) {
                        case 16:
                            if (iD5 == fskVar.a) {
                                defpackage.fsi fsiVar = fskVar.h;
                                etvVar.d(8);
                                int iD7 = etvVar.d(4);
                                int iD8 = etvVar.d(2);
                                etvVar.n(2);
                                android.util.SparseArray sparseArray = new android.util.SparseArray();
                                for (int i6 = iD6 - 2; i6 > 0; i6 -= 6) {
                                    int iD9 = etvVar.d(8);
                                    etvVar.n(8);
                                    sparseArray.put(iD9, new defpackage.fsx(etvVar.d(16), etvVar.d(16), null));
                                }
                                defpackage.fsi fsiVar2 = new defpackage.fsi(iD7, iD8, sparseArray);
                                if (fsiVar2.b != 0) {
                                    fskVar.h = fsiVar2;
                                    fskVar.c.clear();
                                    fskVar.d.clear();
                                    fskVar.e.clear();
                                } else if (fsiVar != null) {
                                    if (fsiVar.a != fsiVar2.a) {
                                        fskVar.h = fsiVar2;
                                    }
                                }
                            }
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            defpackage.fsi fsiVar3 = fskVar.h;
                            if (iD5 == fskVar.a && fsiVar3 != null) {
                                int iD10 = etvVar.d(8);
                                etvVar.n(4);
                                boolean zP = etvVar.p();
                                etvVar.n(3);
                                int iD11 = etvVar.d(16);
                                int iD12 = etvVar.d(16);
                                etvVar.d(3);
                                int iD13 = etvVar.d(3);
                                etvVar.n(2);
                                int iD14 = etvVar.d(8);
                                int iD15 = etvVar.d(8);
                                int iD16 = etvVar.d(4);
                                int iD17 = etvVar.d(2);
                                etvVar.n(2);
                                int i7 = iD6 - 10;
                                android.util.SparseArray sparseArray2 = new android.util.SparseArray();
                                while (i7 > 0) {
                                    int iD18 = etvVar.d(i5);
                                    int iD19 = etvVar.d(2);
                                    etvVar.d(2);
                                    int iD20 = etvVar.d(12);
                                    etvVar.n(4);
                                    int iD21 = etvVar.d(12);
                                    int i8 = i7 - 6;
                                    if (iD19 == 1 || iD19 == 2) {
                                        etvVar.d(8);
                                        etvVar.d(8);
                                        i7 -= 8;
                                    } else {
                                        i7 = i8;
                                    }
                                    sparseArray2.put(iD18, new defpackage.fsx(iD20, iD21, null));
                                    i5 = 16;
                                }
                                defpackage.fsj fsjVar2 = new defpackage.fsj(iD10, zP, iD11, iD12, iD13, iD14, iD15, iD16, iD17, sparseArray2);
                                if (fsiVar3.b == 0 && (fsjVar = (defpackage.fsj) fskVar.c.get(fsjVar2.a)) != null) {
                                    int i9 = 0;
                                    while (true) {
                                        android.util.SparseArray sparseArray3 = fsjVar.j;
                                        if (i9 < sparseArray3.size()) {
                                            fsjVar2.j.put(sparseArray3.keyAt(i9), (defpackage.fsx) sparseArray3.valueAt(i9));
                                            i9++;
                                        }
                                    }
                                }
                                fskVar.c.put(fsjVar2.a, fsjVar2);
                            }
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            if (iD5 == fskVar.a) {
                                defpackage.adss adssVarJ = j(etvVar, iD6);
                                fskVar.d.put(adssVarJ.a, adssVarJ);
                            } else if (iD5 == fskVar.b) {
                                defpackage.adss adssVarJ2 = j(etvVar, iD6);
                                fskVar.f.put(adssVarJ2.a, adssVarJ2);
                            }
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            if (iD5 == fskVar.a) {
                                defpackage.hds hdsVarI = i(etvVar);
                                fskVar.e.put(hdsVarI.b, hdsVarI);
                            } else if (iD5 == fskVar.b) {
                                defpackage.hds hdsVarI2 = i(etvVar);
                                fskVar.g.put(hdsVarI2.b, hdsVarI2);
                            }
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                            if (iD5 == fskVar.a) {
                                etvVar.n(4);
                                boolean zP2 = etvVar.p();
                                etvVar.n(3);
                                int iD22 = etvVar.d(16);
                                int iD23 = etvVar.d(16);
                                if (zP2) {
                                    int iD24 = etvVar.d(16);
                                    iD = etvVar.d(16);
                                    iD3 = etvVar.d(16);
                                    iD2 = etvVar.d(16);
                                    i4 = iD24;
                                } else {
                                    iD = iD22;
                                    iD2 = iD23;
                                    i4 = 0;
                                    iD3 = 0;
                                }
                                fskVar.i = new defpackage.fso(iD22, iD23, i4, iD, iD3, iD2, null);
                            }
                            break;
                    }
                    etvVar.o(iB - etvVar.b());
                }
            }
        }
        defpackage.fsk fskVar2 = this.g;
        defpackage.fsi fsiVar4 = fskVar2.h;
        if (fsiVar4 == null) {
            frfVar = new defpackage.frf(aike.a, -9223372036854775807L, -9223372036854775807L);
        } else {
            defpackage.fso fsoVar = fskVar2.i;
            if (fsoVar == null) {
                fsoVar = this.i;
            }
            android.graphics.Bitmap bitmap = this.h;
            if (bitmap == null || fsoVar.e + 1 != bitmap.getWidth() || fsoVar.c + 1 != this.h.getHeight()) {
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(fsoVar.e + 1, fsoVar.c + 1, android.graphics.Bitmap.Config.ARGB_8888);
                this.h = bitmapCreateBitmap;
                this.f.setBitmap(bitmapCreateBitmap);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.Object obj = fsiVar4.c;
            int i10 = 0;
            while (true) {
                android.util.SparseArray sparseArray4 = (android.util.SparseArray) obj;
                if (i10 < sparseArray4.size()) {
                    android.graphics.Canvas canvas3 = this.f;
                    canvas3.save();
                    defpackage.fsx fsxVar = (defpackage.fsx) sparseArray4.valueAt(i10);
                    defpackage.fsj fsjVar3 = (defpackage.fsj) fskVar2.c.get(sparseArray4.keyAt(i10));
                    int i11 = fsxVar.b + fsoVar.f;
                    int i12 = fsxVar.a + fsoVar.d;
                    int i13 = fsjVar3.c;
                    int i14 = i11 + i13;
                    int iMin = java.lang.Math.min(i14, fsoVar.a);
                    boolean z2 = z;
                    int i15 = fsjVar3.d;
                    int i16 = i12 + i15;
                    canvas3.clipRect(i11, i12, iMin, java.lang.Math.min(i16, fsoVar.b));
                    android.util.SparseArray sparseArray5 = fskVar2.d;
                    int i17 = fsjVar3.f;
                    defpackage.adss adssVar = (defpackage.adss) sparseArray5.get(i17);
                    if (adssVar == null && (adssVar = (defpackage.adss) fskVar2.f.get(i17)) == null) {
                        adssVar = this.j;
                    }
                    android.util.SparseArray sparseArray6 = fsjVar3.j;
                    java.lang.Object obj2 = obj;
                    int i18 = i10;
                    int i19 = 0;
                    while (i19 < sparseArray6.size()) {
                        int iKeyAt = sparseArray6.keyAt(i19);
                        int i20 = i19;
                        defpackage.fsx fsxVar2 = (defpackage.fsx) sparseArray6.valueAt(i19);
                        android.util.SparseArray sparseArray7 = sparseArray6;
                        defpackage.hds hdsVar = (defpackage.hds) fskVar2.e.get(iKeyAt);
                        if (hdsVar == null) {
                            hdsVar = (defpackage.hds) fskVar2.g.get(iKeyAt);
                        }
                        if (hdsVar != null) {
                            android.graphics.Paint paint = hdsVar.a ? null : this.d;
                            i3 = i11;
                            int i21 = fsjVar3.e;
                            int i22 = fsxVar2.b + i3;
                            int i23 = fsxVar2.a + i12;
                            int[] iArr = (int[]) (i21 == 3 ? adssVar.d : i21 == 2 ? adssVar.b : adssVar.c);
                            canvas2 = canvas3;
                            d((byte[]) hdsVar.c, iArr, i21, i22, i23, paint, canvas2);
                            d((byte[]) hdsVar.d, iArr, i21, i22, i23 + 1, paint, canvas2);
                        } else {
                            canvas2 = canvas3;
                            i3 = i11;
                        }
                        i12 = i12;
                        i13 = i13;
                        i19 = i20 + 1;
                        i11 = i3;
                        i14 = i14;
                        canvas3 = canvas2;
                        sparseArray6 = sparseArray7;
                        fskVar2 = fskVar2;
                        arrayList = arrayList;
                    }
                    defpackage.fsk fskVar3 = fskVar2;
                    java.util.ArrayList arrayList2 = arrayList;
                    android.graphics.Canvas canvas4 = canvas3;
                    int i24 = i12;
                    int i25 = i11;
                    int i26 = i13;
                    int i27 = i14;
                    float f = i24;
                    float f2 = i25;
                    if (fsjVar3.b) {
                        int i28 = fsjVar3.e;
                        int i29 = i28 == 3 ? ((int[]) adssVar.d)[fsjVar3.g] : i28 == 2 ? ((int[]) adssVar.b)[fsjVar3.h] : ((int[]) adssVar.c)[fsjVar3.i];
                        android.graphics.Paint paint2 = this.e;
                        paint2.setColor(i29);
                        canvas = canvas4;
                        canvas.drawRect(f2, f, i27, i16, paint2);
                    } else {
                        canvas = canvas4;
                    }
                    defpackage.esr esrVar = new defpackage.esr();
                    esrVar.b(android.graphics.Bitmap.createBitmap(this.h, i25, i24, i26, i15));
                    float f3 = fsoVar.e;
                    esrVar.e = f2 / f3;
                    esrVar.f = 0;
                    float f4 = fsoVar.c;
                    esrVar.c(f / f4, 0);
                    esrVar.d = 0;
                    esrVar.g = i26 / f3;
                    esrVar.h = i15 / f4;
                    arrayList = arrayList2;
                    arrayList.add(esrVar.a());
                    canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                    canvas.restore();
                    z = z2;
                    i10 = i18 + 1;
                    obj = obj2;
                    fskVar2 = fskVar3;
                } else {
                    frfVar = new defpackage.frf(arrayList, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        aa$.ExternalSyntheticApiModelOutline1.m(consumer, frfVar);
    }

    @Override // defpackage.frt
    public final void c() {
        defpackage.fsk fskVar = this.g;
        fskVar.c.clear();
        fskVar.d.clear();
        fskVar.e.clear();
        fskVar.f.clear();
        fskVar.g.clear();
        fskVar.i = null;
        fskVar.h = null;
    }
}
