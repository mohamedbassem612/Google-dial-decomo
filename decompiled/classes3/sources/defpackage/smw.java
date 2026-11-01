package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class smw {
    private static final aimz a = aimz.i("com/android/dialer/patrick/onboarding/ui/impl/DynamicTextColors");
    private final android.content.Context b;

    public smw(android.content.Context context) {
        aooh.f(context, "appContext");
        this.b = context;
    }

    public final long a(defpackage.abjl abjlVar, android.net.Uri uri, long j, int i, int i2, defpackage.amml ammlVar, boolean z, double d) {
        defpackage.amml ammlVar2;
        int i3;
        char c;
        java.lang.Double dValueOf;
        double d2;
        double d3;
        java.lang.Double d4;
        double d5;
        java.lang.Double d6;
        aooh.f(abjlVar, "data");
        aooh.f(ammlVar, "currentColor");
        try {
            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) + i;
            float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + i2;
            long jFloatToRawIntBits = ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32;
            long jFloatToRawIntBits2 = ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
            android.content.Context context = this.b;
            int i4 = context.getResources().getDisplayMetrics().heightPixels;
            long jFloatToRawIntBits3 = ((long) java.lang.Float.floatToRawIntBits(context.getResources().getDisplayMetrics().widthPixels)) << 32;
            long jFloatToRawIntBits4 = ((long) java.lang.Float.floatToRawIntBits(i4)) & 4294967295L;
            android.graphics.Bitmap bitmapM = ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(context.getContentResolver(), uri));
            aooh.e(bitmapM, "decodeBitmap(...)");
            int i5 = 1;
            android.graphics.Bitmap bitmapCopy = bitmapM.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
            try {
                long j2 = jFloatToRawIntBits3 | jFloatToRawIntBits4;
                long jFloatToRawIntBits5 = (((long) java.lang.Float.floatToRawIntBits(bitmapCopy.getHeight())) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(bitmapCopy.getWidth())) << 32);
                long jAC = aehj.aC(abjlVar, jFloatToRawIntBits5, j2, j);
                long jAC2 = aehj.aC(abjlVar, jFloatToRawIntBits5, j2, jFloatToRawIntBits | jFloatToRawIntBits2);
                int i6 = (int) (jAC >> 32);
                int i7 = (int) (jAC & 4294967295L);
                int iIntBitsToFloat = (int) (java.lang.Float.intBitsToFloat((int) (jAC2 >> 32)) - java.lang.Float.intBitsToFloat(i6));
                int iIntBitsToFloat2 = (int) (java.lang.Float.intBitsToFloat((int) (jAC2 & 4294967295L)) - java.lang.Float.intBitsToFloat(i7));
                int i8 = iIntBitsToFloat * iIntBitsToFloat2;
                int[] iArr = new int[i8];
                bitmapCopy.getPixels(iArr, 0, iIntBitsToFloat, (int) java.lang.Float.intBitsToFloat(i6), (int) java.lang.Float.intBitsToFloat(i7), iIntBitsToFloat, iIntBitsToFloat2);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (int i9 = 0; i9 < i8; i9++) {
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(iArr[i9]);
                    java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(numValueOf);
                    linkedHashMap.put(numValueOf, java.lang.Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                }
                int[] iArr2 = new int[35937];
                int[] iArr3 = new int[35937];
                int[] iArr4 = new int[35937];
                int[] iArr5 = new int[35937];
                double[] dArr = new double[35937];
                for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                    int iIntValue = ((java.lang.Integer) entry.getKey()).intValue();
                    int iIntValue2 = ((java.lang.Integer) entry.getValue()).intValue();
                    double[][] dArr2 = defpackage.amnb.a;
                    int i10 = iIntValue >> 16;
                    int i11 = iIntValue >> 8;
                    int i12 = iIntValue & 255;
                    int i13 = i10 & 255;
                    int i14 = (i13 >> 3) + 1;
                    int i15 = i11 & 255;
                    int i16 = (i15 >> 3) + 1;
                    int i17 = (i14 << 10) + (i14 << 6) + i14 + (i16 << 5) + i16 + (i12 >> 3) + 1;
                    iArr2[i17] = iArr2[i17] + iIntValue2;
                    iArr3[i17] = iArr3[i17] + (i13 * iIntValue2);
                    iArr4[i17] = iArr4[i17] + (i15 * iIntValue2);
                    iArr5[i17] = iArr5[i17] + (i12 * iIntValue2);
                    dArr[i17] = dArr[i17] + ((double) (iIntValue2 * ((i13 * i13) + (i15 * i15) + (i12 * i12))));
                }
                int i18 = 1;
                while (i18 < 33) {
                    int[] iArr6 = new int[33];
                    int[] iArr7 = new int[33];
                    int[] iArr8 = new int[33];
                    int[] iArr9 = new int[33];
                    double[] dArr3 = new double[33];
                    while (i5 < 33) {
                        double d7 = 0.0d;
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 0;
                        int i22 = 0;
                        int i23 = i18;
                        for (int i24 = 1; i24 < 33; i24++) {
                            int i25 = i5 << 5;
                            int i26 = (i23 << 10) + (i23 << 6) + i23 + i25 + i5 + i24;
                            i19 += iArr2[i26];
                            i20 += iArr3[i26];
                            i21 += iArr4[i26];
                            i22 += iArr5[i26];
                            d7 += dArr[i26];
                            int i27 = iArr6[i24] + i19;
                            iArr6[i24] = i27;
                            int i28 = iArr7[i24] + i20;
                            iArr7[i24] = i28;
                            int i29 = iArr8[i24] + i21;
                            iArr8[i24] = i29;
                            int i30 = iArr9[i24] + i22;
                            iArr9[i24] = i30;
                            double d8 = dArr3[i24] + d7;
                            dArr3[i24] = d8;
                            int i31 = i23 - 1;
                            int i32 = (i31 << 10) + (i31 << 6) + i31 + i25 + i5 + i24;
                            iArr2[i26] = iArr2[i32] + i27;
                            iArr3[i26] = iArr3[i32] + i28;
                            iArr4[i26] = iArr4[i32] + i29;
                            iArr5[i26] = iArr5[i32] + i30;
                            dArr[i26] = dArr[i32] + d8;
                        }
                        i5++;
                        i18 = i23;
                    }
                    i18++;
                    i5 = 1;
                }
                double d9 = 0.0d;
                int i33 = 0;
                ammz[] ammzVarArr = new ammz[i5];
                ammz ammzVar = new ammz();
                ammzVarArr[0] = ammzVar;
                ammzVar.b = 32;
                ammzVar.d = 32;
                ammzVar.f = 32;
                java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList();
                ammz ammzVar2 = ammzVarArr[0];
                int iY = akky.y(ammzVar2, iArr2);
                int i34 = -16777216;
                if (iY > 0) {
                    arrayList.add(java.lang.Integer.valueOf((((akky.y(ammzVar2, iArr3) / iY) & 255) << 16) | (-16777216) | (((akky.y(ammzVar2, iArr4) / iY) & 255) << 8) | ((akky.y(ammzVar2, iArr5) / iY) & 255)));
                }
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                for (java.lang.Integer num2 : arrayList) {
                    num2.intValue();
                    linkedHashMap2.put(num2, 0);
                }
                java.util.Set setKeySet = linkedHashMap2.keySet();
                int size = setKeySet.size();
                int[] iArr10 = new int[size];
                java.util.Iterator it = setKeySet.iterator();
                int i35 = 0;
                while (it.hasNext()) {
                    iArr10[i35] = ((java.lang.Integer) it.next()).intValue();
                    i35++;
                }
                java.util.Random random = new java.util.Random(272008L);
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                double[][] dArr4 = new double[i8][];
                int[] iArr11 = new int[i8];
                int i36 = 0;
                for (int i37 = 0; i37 < i8; i37++) {
                    int i38 = iArr[i37];
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i38);
                    java.lang.Integer num3 = (java.lang.Integer) linkedHashMap3.get(numValueOf2);
                    if (num3 == null) {
                        dArr4[i36] = akky.E(i38);
                        iArr11[i36] = i38;
                        i36++;
                        linkedHashMap3.put(numValueOf2, 1);
                    } else {
                        linkedHashMap3.put(numValueOf2, java.lang.Integer.valueOf(num3.intValue() + 1));
                    }
                }
                int[] iArr12 = new int[i36];
                for (int i39 = 0; i39 < i36; i39++) {
                    iArr12[i39] = ((java.lang.Integer) linkedHashMap3.get(java.lang.Integer.valueOf(iArr11[i39]))).intValue();
                }
                int iMin = java.lang.Math.min(1, i36);
                if (size != 0) {
                    iMin = java.lang.Math.min(iMin, size);
                }
                double[][] dArr5 = new double[iMin][];
                int i40 = 0;
                for (int i41 = 0; i41 < size; i41++) {
                    dArr5[i41] = akky.E(iArr10[i41]);
                    i40++;
                }
                int i42 = iMin - i40;
                if (i42 > 0) {
                    for (int i43 = 0; i43 < i42; i43++) {
                    }
                }
                int[] iArr13 = new int[i36];
                for (int i44 = 0; i44 < i36; i44++) {
                    iArr13[i44] = random.nextInt(iMin);
                }
                int[][] iArr14 = new int[iMin][];
                for (int i45 = 0; i45 < iMin; i45++) {
                    iArr14[i45] = new int[iMin];
                }
                defpackage.ammy[][] ammyVarArr = new defpackage.ammy[iMin][];
                for (int i46 = 0; i46 < iMin; i46++) {
                    ammyVarArr[i46] = new defpackage.ammy[iMin];
                    for (int i47 = 0; i47 < iMin; i47++) {
                        ammyVarArr[i46][i47] = new defpackage.ammy();
                    }
                }
                int[] iArr15 = new int[iMin];
                int i48 = 0;
                while (true) {
                    if (i48 >= 10) {
                        i3 = i34;
                        c = 2;
                        break;
                    }
                    int i49 = i33;
                    while (i49 < iMin) {
                        int i50 = i49 + 1;
                        int i51 = i34;
                        int i52 = i50;
                        while (i52 < iMin) {
                            double D = akky.D(dArr5[i49], dArr5[i52]);
                            int[][] iArr16 = iArr14;
                            defpackage.ammy ammyVar = ammyVarArr[i52][i49];
                            ammyVar.b = D;
                            ammyVar.a = i49;
                            defpackage.ammy ammyVar2 = ammyVarArr[i49][i52];
                            ammyVar2.b = D;
                            ammyVar2.a = i52;
                            i52++;
                            iArr14 = iArr16;
                        }
                        int[][] iArr17 = iArr14;
                        java.util.Arrays.sort(ammyVarArr[i49]);
                        for (int i53 = i33; i53 < iMin; i53++) {
                            iArr17[i49][i53] = ammyVarArr[i49][i53].a;
                        }
                        i34 = i51;
                        i49 = i50;
                        iArr14 = iArr17;
                    }
                    int[][] iArr18 = iArr14;
                    i3 = i34;
                    c = 2;
                    int i54 = i33;
                    int i55 = i54;
                    while (i54 < i36) {
                        double[] dArr6 = dArr4[i54];
                        int i56 = iArr13[i54];
                        double D2 = akky.D(dArr6, dArr5[i56]);
                        int i57 = i54;
                        int i58 = i33;
                        int[] iArr19 = iArr13;
                        double d10 = D2;
                        int i59 = -1;
                        while (i58 < iMin) {
                            int i60 = i58;
                            int[] iArr20 = iArr12;
                            defpackage.ammy[][] ammyVarArr2 = ammyVarArr;
                            if (ammyVarArr[i56][i60].b < 4.0d * D2) {
                                double D3 = akky.D(dArr6, dArr5[i60]);
                                if (D3 < d10) {
                                    d10 = D3;
                                    i59 = i60;
                                }
                            }
                            i58 = i60 + 1;
                            iArr12 = iArr20;
                            ammyVarArr = ammyVarArr2;
                        }
                        int[] iArr21 = iArr12;
                        defpackage.ammy[][] ammyVarArr3 = ammyVarArr;
                        if (i59 != -1 && java.lang.Math.abs(java.lang.Math.sqrt(d10) - java.lang.Math.sqrt(D2)) > 3.0d) {
                            i55++;
                            iArr19[i57] = i59;
                        }
                        i54 = i57 + 1;
                        iArr13 = iArr19;
                        iArr12 = iArr21;
                        ammyVarArr = ammyVarArr3;
                    }
                    int[] iArr22 = iArr13;
                    int[] iArr23 = iArr12;
                    defpackage.ammy[][] ammyVarArr4 = ammyVarArr;
                    if (i55 == 0) {
                        if (i48 != 0) {
                            break;
                        }
                        i48 = i33;
                    }
                    double[] dArr7 = new double[iMin];
                    double[] dArr8 = new double[iMin];
                    double[] dArr9 = new double[iMin];
                    java.util.Arrays.fill(iArr15, i33);
                    int i61 = 0;
                    while (i61 < i36) {
                        int i62 = iArr22[i61];
                        double[] dArr10 = dArr4[i61];
                        int i63 = iArr23[i61];
                        iArr15[i62] = iArr15[i62] + i63;
                        double d11 = dArr7[i62];
                        double[] dArr11 = dArr7;
                        double[] dArr12 = dArr8;
                        double d12 = i63;
                        dArr11[i62] = d11 + (dArr10[0] * d12);
                        dArr12[i62] = dArr12[i62] + (dArr10[1] * d12);
                        dArr9[i62] = dArr9[i62] + (dArr10[2] * d12);
                        i61++;
                        dArr7 = dArr11;
                        dArr8 = dArr12;
                    }
                    double[] dArr13 = dArr7;
                    double[] dArr14 = dArr8;
                    for (int i64 = 0; i64 < iMin; i64++) {
                        int i65 = iArr15[i64];
                        if (i65 == 0) {
                            dArr5[i64] = new double[]{0.0d, 0.0d, 0.0d};
                        } else {
                            double d13 = i65;
                            double d14 = dArr13[i64] / d13;
                            double d15 = dArr14[i64] / d13;
                            double d16 = dArr9[i64] / d13;
                            double[] dArr15 = dArr5[i64];
                            dArr15[0] = d14;
                            dArr15[1] = d15;
                            dArr15[2] = d16;
                        }
                    }
                    i48++;
                    i34 = i3;
                    iArr14 = iArr18;
                    iArr13 = iArr22;
                    iArr12 = iArr23;
                    ammyVarArr = ammyVarArr4;
                    i33 = 0;
                }
                java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
                for (int i66 = 0; i66 < iMin; i66++) {
                    int i67 = iArr15[i66];
                    if (i67 != 0) {
                        double[] dArr16 = dArr5[i66];
                        double d17 = dArr16[0];
                        double d18 = dArr16[1];
                        double d19 = dArr16[c];
                        double[] dArr17 = defpackage.amnb.c;
                        double d20 = (d17 + 16.0d) / 116.0d;
                        double d21 = d20 - (d19 / 200.0d);
                        double dG = anar.g((d18 / 500.0d) + d20);
                        double dG2 = anar.g(d20);
                        double dG3 = anar.g(d21);
                        double d22 = dG * dArr17[0];
                        double d23 = dG2 * dArr17[1];
                        double d24 = dG3 * dArr17[c];
                        double[][] dArr18 = defpackage.amnb.b;
                        double[] dArr19 = dArr18[0];
                        double d25 = (dArr19[0] * d22) + (dArr19[1] * d23) + (dArr19[c] * d24);
                        double[] dArr20 = dArr18[1];
                        double d26 = (dArr20[0] * d22) + (dArr20[1] * d23) + (dArr20[c] * d24);
                        double[] dArr21 = dArr18[c];
                        java.lang.Integer numValueOf3 = java.lang.Integer.valueOf((a.aE(d25) << 16) | i3 | (a.aE(d26) << 8) | a.aE((dArr21[0] * d22) + (dArr21[1] * d23) + (dArr21[c] * d24)));
                        if (!linkedHashMap4.containsKey(numValueOf3)) {
                            linkedHashMap4.put(numValueOf3, java.lang.Integer.valueOf(i67));
                        }
                    }
                }
                java.lang.Object objBD = ajsz.bD(linkedHashMap4.keySet());
                aooh.e(objBD, "first(...)");
                int iIntValue3 = ((java.lang.Number) objBD).intValue();
                aooh.f(ammlVar, "color");
                akzv akzvVar = ammlVar.f;
                if (akzvVar == null) {
                    akzvVar = akzv.a;
                }
                defpackage.afsj afsjVar = new defpackage.afsj(cfd.L(cfd.M(((aopc.i(akzvVar.b * 255.0f) & 255) << 24) | ((aopc.i(ammlVar.c * 255.0f) & 255) << 16) | ((aopc.i(ammlVar.d * 255.0f) & 255) << 8) | (aopc.i(ammlVar.e * 255.0f) & 255))));
                defpackage.afsj afsjVar2 = new defpackage.afsj(iIntValue3);
                if (z) {
                    d2 = afsjVar2.a;
                    d3 = afsjVar2.b;
                    dValueOf = null;
                } else {
                    double d27 = afsjVar.a;
                    double d28 = afsjVar.b;
                    dValueOf = java.lang.Double.valueOf(afsjVar.c);
                    d2 = d27;
                    d3 = d28;
                }
                double dB = defpackage.amnb.b((iIntValue3 >> 16) & 255);
                double dB2 = defpackage.amnb.b((iIntValue3 >> 8) & 255);
                double dB3 = defpackage.amnb.b(iIntValue3 & 255);
                double[] dArr22 = new double[3];
                dArr22[0] = dB;
                dArr22[1] = dB2;
                dArr22[c] = dB3;
                double dA = (defpackage.amnb.a(anty.aC(dArr22, defpackage.amnb.a)[1] / 100.0d) * 116.0d) - 16.0d;
                double dE = afsq.e(dA, d);
                double dF = afsq.f(dA, d);
                double d29 = d;
                while (true) {
                    if (d29 > d9) {
                        d4 = dValueOf;
                        double d30 = d29 - 0.5d;
                        if (d30 <= d9) {
                            dE = d4 != null ? d4.doubleValue() : java.lang.Math.max(d9, afsq.e(dA, d));
                        } else {
                            double d31 = d9;
                            if (dE == -1.0d && dF == -1.0d) {
                                dE = afsq.e(dA, d30);
                                dF = afsq.f(dA, d30);
                                d9 = d31;
                                d29 = d30;
                                dValueOf = d4;
                            } else {
                                d29 = d30;
                            }
                        }
                        d5 = dE;
                        return cfd.M(defpackage.afsj.a(d2, d3, d5).d);
                    }
                    d4 = dValueOf;
                    if (d4 != null) {
                        double dG4 = anar.g((d4.doubleValue() + 16.0d) / 116.0d) * 100.0d;
                        double dG5 = anar.g((dA + 16.0d) / 116.0d) * 100.0d;
                        double dMax = java.lang.Math.max(dG5, dG4);
                        double d32 = 5.0d + dMax;
                        if (dMax == dG4) {
                            dG4 = dG5;
                        }
                        if (d32 / (dG4 + 5.0d) >= d29) {
                            dE = d4.doubleValue();
                        } else {
                            d6 = d4;
                        }
                        d5 = dE;
                        return cfd.M(defpackage.afsj.a(d2, d3, d5).d);
                    }
                    d6 = null;
                    if (dE != -1.0d && dF != -1.0d && d6 != null) {
                        if (java.lang.Math.abs(d6.doubleValue() - dE) >= java.lang.Math.abs(d6.doubleValue() - dF)) {
                            d5 = dF;
                        }
                        return cfd.M(defpackage.afsj.a(d2, d3, d5).d);
                    }
                    dE = java.lang.Math.max(dE, dF);
                    d5 = dE;
                    return cfd.M(defpackage.afsj.a(d2, d3, d5).d);
                }
            } catch (java.lang.Exception e) {
                e = e;
                ammlVar2 = ammlVar;
                a.c().k(e).l("com/android/dialer/patrick/onboarding/ui/impl/DynamicTextColors", "updateContactNameColor", 68, "DynamicTextColors.kt").v("Error getting background color");
                float f = ammlVar2.c;
                float f2 = ammlVar2.d;
                float f3 = ammlVar2.e;
                akzv akzvVar2 = ammlVar2.f;
                if (akzvVar2 == null) {
                    akzvVar2 = akzv.a;
                }
                return cfd.R(f, f2, f3, akzvVar2.b, (crn) null, 16);
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            ammlVar2 = ammlVar;
        }
    }
}
