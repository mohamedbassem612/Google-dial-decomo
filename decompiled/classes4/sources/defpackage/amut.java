package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amut implements defpackage.amur {
    /* JADX WARN: Code duplicated, block: B:228:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    @Override // defpackage.amur
    public final defpackage.amvb a(java.lang.String str, defpackage.amun amunVar, int i) {
        byte[] bArr;
        int length;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        defpackage.amva amvaVarA;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        if (amunVar != defpackage.amun.a) {
            throw new java.lang.IllegalArgumentException("Can only encode AZTEC, but got ".concat(amunVar.toString()));
        }
        int[] iArr2 = defpackage.amuv.a;
        defpackage.amuw amuwVar = new defpackage.amuw(str.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
        java.util.Collection<defpackage.amuy> collectionSingletonList = java.util.Collections.singletonList(defpackage.amuy.a);
        int i17 = 0;
        while (true) {
            bArr = amuwVar.e;
            length = bArr.length;
            i2 = 32;
            i3 = 3;
            int i18 = 4;
            i4 = 2;
            i5 = 1;
            if (i17 >= length) {
                break;
            }
            int i19 = i17 + 1;
            byte b = i19 < length ? bArr[i19] : (byte) 0;
            byte b2 = bArr[i17];
            if (b2 != 13) {
                if (b2 != 44) {
                    if (b2 != 46) {
                        if (b2 == 58 && b == 32) {
                            i15 = 5;
                        } else {
                            i15 = 0;
                        }
                    } else if (b == 32) {
                        i15 = 3;
                    } else {
                        i15 = 0;
                    }
                } else if (b == 32) {
                    i15 = 4;
                } else {
                    i15 = 0;
                }
            } else if (b == 10) {
                i15 = 2;
            } else {
                i15 = 0;
            }
            if (i15 > 0) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (defpackage.amuy amuyVar : collectionSingletonList) {
                    defpackage.amuy amuyVarB = amuyVar.b(i17);
                    linkedList.add(amuyVarB.c(4, i15));
                    if (amuyVar.b != 4) {
                        linkedList.add(amuyVarB.d(4, i15));
                    }
                    if (i15 != 3) {
                        if (i15 == 4) {
                            i16 = 4;
                        }
                        if (amuyVar.d > 0) {
                            linkedList.add(amuyVar.a(i17).a(i19));
                        }
                    } else {
                        i16 = i15;
                    }
                    linkedList.add(amuyVarB.c(2, 16 - i16).c(2, 1));
                    if (amuyVar.d > 0) {
                        linkedList.add(amuyVar.a(i17).a(i19));
                    }
                }
                collectionSingletonList = defpackage.amuw.a(linkedList);
                i17 = i19;
            } else {
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                for (defpackage.amuy amuyVar2 : collectionSingletonList) {
                    int i20 = bArr[i17] & 255;
                    int[][] iArr3 = defpackage.amuw.c;
                    int i21 = amuyVar2.b;
                    int i22 = iArr3[i21][i20];
                    int i23 = 0;
                    defpackage.amuy amuyVarB2 = null;
                    while (i23 <= i18) {
                        int i24 = iArr3[i23][i20];
                        if (i24 > 0) {
                            if (amuyVarB2 == null) {
                                amuyVarB2 = amuyVar2.b(i17);
                            }
                            boolean z = i22 > 0;
                            if (!z || i23 == i21) {
                                linkedList2.add(amuyVarB2.c(i23, i24));
                            } else if (i23 == 2) {
                                i23 = 2;
                                linkedList2.add(amuyVarB2.c(i23, i24));
                            }
                            if (!z && defpackage.amuw.d[i21][i23] >= 0) {
                                linkedList2.add(amuyVarB2.d(i23, i24));
                            }
                        }
                        i23++;
                        i18 = 4;
                    }
                    if (amuyVar2.d > 0 || iArr3[i21][i20] == 0) {
                        linkedList2.add(amuyVar2.a(i17));
                    }
                    i18 = 4;
                }
                collectionSingletonList = defpackage.amuw.a(linkedList2);
            }
            i17++;
        }
        defpackage.amuy amuyVar3 = (defpackage.amuy) java.util.Collections.min(collectionSingletonList, new cph(amuwVar, 10));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.amuz amuzVar = amuyVar3.b(length).c; amuzVar != null; amuzVar = amuzVar.b) {
            arrayList.add(amuzVar);
        }
        defpackage.amva amvaVar = new defpackage.amva();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((defpackage.amuz) arrayList.get(size)).a(amvaVar, bArr);
        }
        int i25 = amvaVar.b;
        int i26 = ((i25 * 33) / 100) + 11;
        int i27 = i25 + i26;
        int i28 = 0;
        int i29 = 0;
        defpackage.amva amvaVar2 = null;
        while (i28 <= i2) {
            int i30 = i28 <= i3 ? i5 : 0;
            if (i30 != 0) {
                i6 = i28 + 1;
                i7 = i5;
            } else {
                i6 = i28;
                i7 = 0;
            }
            int i31 = ((i5 != i7 ? 112 : 88) + (i6 << 4)) * i6;
            if (i27 > i31) {
                i13 = i5;
                i14 = i3;
            } else {
                if (amvaVar2 == null || i29 != defpackage.amuv.a[i6]) {
                    i29 = defpackage.amuv.a[i6];
                    amvaVar2 = new defpackage.amva();
                    int i32 = amvaVar.b;
                    i8 = i5;
                    int i33 = 0;
                    while (i33 < i32) {
                        int i34 = 0;
                        for (int i35 = 0; i35 < i29; i35++) {
                            int i36 = i33 + i35;
                            if (i36 >= i32 || amvaVar.e(i36)) {
                                i34 |= i8 << ((i29 - 1) - i35);
                            }
                        }
                        int i37 = (i8 << i29) - 2;
                        int i38 = i34 & i37;
                        if (i38 == i37) {
                            amvaVar2.d(i38, i29);
                        } else {
                            if (i38 == 0) {
                                amvaVar2.d(i34 | 1, i29);
                            } else {
                                amvaVar2.d(i34, i29);
                            }
                            i33 += i29;
                        }
                        i33--;
                        i33 += i29;
                    }
                } else {
                    i8 = i5;
                }
                int i39 = i31 - (i31 % i29);
                if ((i7 == 0 || amvaVar2.b <= (i29 << 6)) && amvaVar2.b + i26 <= i39) {
                    defpackage.amva amvaVarA2 = defpackage.amuv.a(amvaVar2, i31, i29);
                    int i40 = (amvaVar2.b / i29) - 1;
                    int i41 = i6 - 1;
                    defpackage.amva amvaVar3 = new defpackage.amva();
                    if (i30 != 0) {
                        amvaVar3.d(i41, i4);
                        amvaVar3.d(i40, 6);
                        amvaVarA = defpackage.amuv.a(amvaVar3, 28, 4);
                        i9 = 11;
                    } else {
                        amvaVar3.d(i41, 5);
                        i9 = 11;
                        amvaVar3.d(i40, 11);
                        amvaVarA = defpackage.amuv.a(amvaVar3, 40, 4);
                    }
                    int i42 = (i28 <= 3 ? i9 : 14) + (i6 << 2);
                    int[] iArr4 = new int[i42];
                    if (i30 != 0) {
                        for (int i43 = 0; i43 < i42; i43++) {
                            iArr4[i43] = i43;
                        }
                        i10 = i42;
                        i11 = i8;
                    } else {
                        int i44 = i42 / 2;
                        i10 = i42 + 1 + (((i44 - 1) / 15) << 1);
                        int i45 = i10 / 2;
                        for (int i46 = 0; i46 < i44; i46++) {
                            int i47 = (i46 / 15) + i46;
                            iArr4[(i44 - i46) - 1] = (i45 - i47) - 1;
                            iArr4[i44 + i46] = i47 + i45 + 1;
                        }
                        i11 = 0;
                    }
                    defpackage.amvb amvbVar = new defpackage.amvb(i10, i10);
                    int i48 = 0;
                    int i49 = 0;
                    while (i48 < i6) {
                        int i50 = (i6 - i48) << i4;
                        int i51 = i8 != i11 ? 12 : 9;
                        int i52 = 0;
                        while (true) {
                            i12 = i50 + i51;
                            if (i52 < i12) {
                                int i53 = 0;
                                while (i53 < i4) {
                                    int i54 = i52 << 1;
                                    int i55 = i4;
                                    if (amvaVarA2.e(i49 + i54 + i53)) {
                                        int i56 = i48 << 1;
                                        iArr = iArr4;
                                        amvbVar.b(iArr4[i56 + i53], iArr[i56 + i52]);
                                    } else {
                                        iArr = iArr4;
                                    }
                                    if (amvaVarA2.e((i12 << 1) + i49 + i54 + i53)) {
                                        int i57 = i48 << 1;
                                        amvbVar.b(iArr[i57 + i52], iArr[((i42 - 1) - i57) - i53]);
                                    }
                                    if (amvaVarA2.e((i12 << 2) + i49 + i54 + i53)) {
                                        int i58 = (i42 - 1) - (i48 << 1);
                                        amvbVar.b(iArr[i58 - i53], iArr[i58 - i52]);
                                    }
                                    if (amvaVarA2.e((i12 * 6) + i49 + i54 + i53)) {
                                        int i59 = i48 << 1;
                                        amvbVar.b(iArr[((i42 - 1) - i59) - i52], iArr[i59 + i53]);
                                    }
                                    i53++;
                                    iArr4 = iArr;
                                    i4 = i55;
                                }
                                i52++;
                            }
                        }
                        i49 += i12 << 3;
                        i48++;
                        i8 = 1;
                    }
                    int i60 = i10 / 2;
                    if (i11 != 0) {
                        for (int i61 = 0; i61 < 7; i61++) {
                            int i62 = (i60 - 3) + i61;
                            if (amvaVarA.e(i61)) {
                                amvbVar.b(i62, i60 - 5);
                            }
                            if (amvaVarA.e(i61 + 7)) {
                                amvbVar.b(i60 + 5, i62);
                            }
                            if (amvaVarA.e(20 - i61)) {
                                amvbVar.b(i62, i60 + 5);
                            }
                            if (amvaVarA.e(27 - i61)) {
                                amvbVar.b(i60 - 5, i62);
                            }
                        }
                        defpackage.amuv.b(amvbVar, i60, 5);
                    } else {
                        for (int i63 = 0; i63 < 10; i63++) {
                            int i64 = (i60 - 5) + i63 + (i63 / 5);
                            if (amvaVarA.e(i63)) {
                                amvbVar.b(i64, i60 - 7);
                            }
                            if (amvaVarA.e(i63 + 10)) {
                                amvbVar.b(i60 + 7, i64);
                            }
                            if (amvaVarA.e(29 - i63)) {
                                amvbVar.b(i64, i60 + 7);
                            }
                            if (amvaVarA.e(39 - i63)) {
                                amvbVar.b(i60 - 7, i64);
                            }
                        }
                        defpackage.amuv.b(amvbVar, i60, 7);
                        int i65 = 0;
                        int i66 = 0;
                        while (i65 < (i42 / 2) - 1) {
                            for (int i67 = i60 & 1; i67 < i10; i67 += 2) {
                                int i68 = i60 - i66;
                                amvbVar.b(i68, i67);
                                int i69 = i60 + i66;
                                amvbVar.b(i69, i67);
                                amvbVar.b(i67, i68);
                                amvbVar.b(i67, i69);
                            }
                            i65 += 15;
                            i66 += 16;
                        }
                    }
                    int i70 = amvbVar.a;
                    int i71 = amvbVar.b;
                    int iMax = java.lang.Math.max(i, i70);
                    int iMax2 = java.lang.Math.max(1, i71);
                    int iMin = java.lang.Math.min(iMax / i70, iMax2 / i71);
                    int i72 = (iMax - (i70 * iMin)) / 2;
                    int i73 = (iMax2 - (i71 * iMin)) / 2;
                    defpackage.amvb amvbVar2 = new defpackage.amvb(iMax, iMax2);
                    int i74 = 0;
                    while (i74 < i71) {
                        int i75 = i72;
                        int i76 = 0;
                        while (i76 < i70) {
                            if (amvbVar.d(i76, i74)) {
                                amvbVar2.c(i75, i73, iMin, iMin);
                            }
                            i76++;
                            i75 += iMin;
                        }
                        i74++;
                        i73 += iMin;
                    }
                    return amvbVar2;
                }
                i13 = i8;
                i14 = 3;
            }
            i28++;
            i3 = i14;
            i5 = i13;
            i2 = 32;
            i4 = i4;
        }
        throw new java.lang.IllegalArgumentException("Data too large for an Aztec code");
    }
}
