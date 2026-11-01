package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hfd implements defpackage.hfw {
    private int a;

    public hfd(int i) {
        this.a = i;
    }

    @Override // defpackage.hfw
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.hfz hfzVar, float f) {
        int i;
        float[] fArrCopyOf;
        int iArgb;
        int i2;
        float f2;
        int iArgb2;
        float f3;
        float f4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iP = hfzVar.p();
        int i3 = 1;
        if (iP == 1) {
            hfzVar.g();
        }
        while (hfzVar.n()) {
            arrayList.add(java.lang.Float.valueOf((float) hfzVar.a()));
        }
        if (arrayList.size() == 4 && ((java.lang.Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, java.lang.Float.valueOf(0.0f));
            arrayList.add(java.lang.Float.valueOf(1.0f));
            arrayList.add((java.lang.Float) arrayList.get(1));
            arrayList.add((java.lang.Float) arrayList.get(2));
            arrayList.add((java.lang.Float) arrayList.get(3));
            this.a = 2;
        }
        if (iP == 1) {
            hfzVar.i();
        }
        int size = this.a;
        if (size == -1) {
            size = arrayList.size() / 4;
            this.a = size;
        }
        float[] fArr = new float[size];
        int[] iArr = new int[size];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = this.a << 2;
            if (i4 >= i) {
                break;
            }
            int i7 = i4 / 4;
            double dFloatValue = ((java.lang.Float) arrayList.get(i4)).floatValue();
            int i8 = i4 % 4;
            if (i8 == 0) {
                float f5 = (float) dFloatValue;
                if (i7 <= 0 || fArr[i7 - 1] < f5) {
                    fArr[i7] = f5;
                } else {
                    fArr[i7] = f5 + 0.01f;
                }
            } else if (i8 == 1) {
                i5 = (int) (dFloatValue * 255.0d);
            } else if (i8 == 2) {
                i6 = (int) (dFloatValue * 255.0d);
            } else if (i8 == 3) {
                iArr[i7] = android.graphics.Color.argb(255, i5, i6, (int) (dFloatValue * 255.0d));
            }
            i4++;
        }
        defpackage.hdp hdpVar = new defpackage.hdp(fArr, iArr);
        if (arrayList.size() <= i) {
            return hdpVar;
        }
        float[] fArr2 = hdpVar.a;
        int[] iArr2 = hdpVar.b;
        int size2 = (arrayList.size() - i) / 2;
        float[] fArr3 = new float[size2];
        float[] fArr4 = new float[size2];
        int i9 = 0;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr3[i9] = ((java.lang.Float) arrayList.get(i)).floatValue();
            } else {
                fArr4[i9] = ((java.lang.Float) arrayList.get(i)).floatValue();
                i9++;
            }
            i++;
        }
        int length = fArr2.length;
        if (length == 0) {
            fArrCopyOf = fArr3;
        } else if (size2 == 0) {
            fArrCopyOf = fArr2;
        } else {
            int i10 = length + size2;
            fArrCopyOf = new float[i10];
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                float f6 = i12 < fArr2.length ? fArr2[i12] : Float.NaN;
                float f7 = i13 < size2 ? fArr3[i13] : Float.NaN;
                if (java.lang.Float.isNaN(f7) || f6 < f7) {
                    fArrCopyOf[i14] = f6;
                    i12++;
                } else {
                    i13++;
                    if (java.lang.Float.isNaN(f6) || f7 < f6) {
                        fArrCopyOf[i14] = f7;
                    } else {
                        i12++;
                        fArrCopyOf[i14] = f6;
                        i11++;
                    }
                }
            }
            if (i11 != 0) {
                fArrCopyOf = java.util.Arrays.copyOf(fArrCopyOf, i10 - i11);
            }
        }
        int length2 = fArrCopyOf.length;
        int[] iArr3 = new int[length2];
        int i15 = 0;
        while (i15 < length2) {
            float f8 = fArrCopyOf[i15];
            int iBinarySearch = java.util.Arrays.binarySearch(fArr2, f8);
            int iBinarySearch2 = java.util.Arrays.binarySearch(fArr3, f8);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f9 = fArr4[iBinarySearch2];
                if (iArr2.length < 2 || f8 == fArr2[0]) {
                    iArgb = iArr2[0];
                } else {
                    int i16 = 1;
                    while (true) {
                        int length3 = fArr2.length;
                        if (i16 >= length3) {
                            throw new java.lang.IllegalArgumentException("Unreachable code.");
                        }
                        i2 = length3 - 1;
                        f2 = fArr2[i16];
                        if (f2 >= f8 || i16 == i2) {
                            break;
                        }
                        i16++;
                    }
                    int i17 = (int) (f9 * 255.0f);
                    if (i16 != i2 || f8 < f2) {
                        int i18 = i16 - 1;
                        float f10 = fArr2[i18];
                        int iA = defpackage.hgt.a((f8 - f10) / (f2 - f10), iArr2[i18], iArr2[i16]);
                        iArgb = android.graphics.Color.argb(i17, android.graphics.Color.red(iA), android.graphics.Color.green(iA), android.graphics.Color.blue(iA));
                    } else {
                        iArgb = android.graphics.Color.argb(i17, android.graphics.Color.red(iArr2[i16]), android.graphics.Color.green(iArr2[i16]), android.graphics.Color.blue(iArr2[i16]));
                    }
                }
                iArr3[i15] = iArgb;
            } else {
                int i19 = iArr2[iBinarySearch];
                if (size2 < 2 || f8 <= fArr3[0]) {
                    iArgb2 = android.graphics.Color.argb((int) (fArr4[0] * 255.0f), android.graphics.Color.red(i19), android.graphics.Color.green(i19), android.graphics.Color.blue(i19));
                } else {
                    int i20 = i3;
                    while (true) {
                        if (i20 >= size2) {
                            throw new java.lang.IllegalArgumentException("Unreachable code.");
                        }
                        f3 = fArr3[i20];
                        if (f3 >= f8 || i20 == size2 - 1) {
                            break;
                        }
                        i20++;
                    }
                    if (f3 <= f8) {
                        f4 = fArr4[i20];
                    } else {
                        int i21 = i20 - 1;
                        float f11 = fArr3[i21];
                        float f12 = f3 - f11;
                        float f13 = f8 - f11;
                        float f14 = fArr4[i21];
                        float f15 = fArr4[i20];
                        int i22 = defpackage.hgh.a;
                        f4 = f14 + ((f13 / f12) * (f15 - f14));
                    }
                    iArgb2 = android.graphics.Color.argb((int) (f4 * 255.0f), android.graphics.Color.red(i19), android.graphics.Color.green(i19), android.graphics.Color.blue(i19));
                }
                iArr3[i15] = iArgb2;
            }
            i15++;
            i3 = 1;
        }
        return new defpackage.hdp(fArrCopyOf, iArr3);
    }
}
