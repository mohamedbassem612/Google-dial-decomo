package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ev {
    private static final java.util.Comparator a = new cph(1);

    /* JADX WARN: Code duplicated, block: B:19:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:43:0x0112  */
    /* JADX WARN: Code duplicated, block: B:56:0x0158  */
    public static defpackage.es a(defpackage.er erVar) {
        int i;
        int i2;
        defpackage.eu euVar;
        defpackage.ahoz ahozVar;
        defpackage.eu euVar2;
        int i3;
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
        int iB = erVar.b();
        int iA = erVar.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(new defpackage.et(iB, iA));
        int i15 = iB + iA;
        int i16 = 1;
        int i17 = (((i15 + 1) / 2) << 1) + 1;
        int[] iArr = new int[i17];
        int[] iArr2 = new int[i17];
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        while (!arrayList2.isEmpty()) {
            defpackage.et etVar = (defpackage.et) arrayList2.remove(arrayList2.size() - 1);
            if (etVar.b() > 0 && etVar.a() > 0) {
                int i18 = i17 >> 1;
                int iB2 = ((etVar.b() + etVar.a()) + i16) / 2;
                int i19 = i18 + 1;
                iArr[i19] = etVar.a;
                iArr2[i19] = etVar.b;
                int i20 = 0;
                while (true) {
                    if (i20 >= iB2) {
                        i = i17;
                        i2 = i16;
                        euVar = null;
                        break;
                    }
                    int i21 = -i20;
                    int iAbs = java.lang.Math.abs(etVar.b() - etVar.a()) % 2;
                    int iB3 = etVar.b() - etVar.a();
                    int i22 = i21;
                    while (true) {
                        if (i22 > i20) {
                            i = i17;
                            i18 = i18;
                            iB2 = iB2;
                            euVar = null;
                            break;
                        }
                        if (i22 != i21) {
                            int i23 = (i22 - 1) + i18;
                            if (i22 == i20 || iArr[i22 + 1 + i18] <= iArr[i23]) {
                                i9 = iArr[i23];
                                i10 = i9 + 1;
                            } else {
                                i9 = iArr[i22 + 1 + i18];
                                i10 = i9;
                            }
                        } else {
                            i9 = iArr[i22 + 1 + i18];
                            i10 = i9;
                        }
                        i = i17;
                        int i24 = (etVar.c + (i10 - etVar.a)) - i22;
                        if (i20 != 0) {
                            if (i10 != i9) {
                                i11 = i20;
                            } else {
                                i18 = i18;
                                i10 = i10;
                                i12 = i24 - 1;
                                i22 = i22;
                                iB2 = iB2;
                                i11 = i20;
                            }
                            while (i10 < etVar.b && i24 < etVar.d && erVar.e(i10, i24)) {
                                i10++;
                                i24++;
                            }
                            iArr[i22 + i18] = i10;
                            if (iAbs == 1) {
                                i14 = iB3 - i22;
                                i13 = iAbs;
                                if (i14 >= (-i11) + 1 && i14 <= i11 - 1 && iArr2[i14 + i18] <= i10) {
                                    euVar = new defpackage.eu();
                                    euVar.a = i9;
                                    euVar.b = i12;
                                    euVar.c = i10;
                                    euVar.d = i24;
                                    euVar.e = false;
                                    break;
                                }
                            } else {
                                i13 = iAbs;
                            }
                            i22 += 2;
                            i17 = i;
                            i18 = i18;
                            iB2 = iB2;
                            iAbs = i13;
                        } else {
                            i11 = 0;
                        }
                        i12 = i24;
                        while (i10 < etVar.b) {
                            i10++;
                            i24++;
                        }
                        iArr[i22 + i18] = i10;
                        if (iAbs == 1) {
                            i14 = iB3 - i22;
                            i13 = iAbs;
                            if (i14 >= (-i11) + 1) {
                                continue;
                            }
                        } else {
                            i13 = iAbs;
                        }
                        i22 += 2;
                        i17 = i;
                        i18 = i18;
                        iB2 = iB2;
                        iAbs = i13;
                    }
                    if (euVar != null) {
                        i2 = 1;
                        break;
                    }
                    int iB4 = etVar.b() - etVar.a();
                    int iB5 = etVar.b() - etVar.a();
                    int i25 = i21;
                    while (true) {
                        if (i25 > i20) {
                            i2 = 1;
                            euVar2 = null;
                            break;
                        }
                        if (i25 != i21) {
                            int i26 = (i25 - 1) + i18;
                            if (i25 == i20 || iArr2[i25 + 1 + i18] >= iArr2[i26]) {
                                i3 = iArr2[i26];
                                i4 = i3 - 1;
                            } else {
                                i3 = iArr2[i25 + 1 + i18];
                                i4 = i3;
                            }
                        } else {
                            i3 = iArr2[i25 + 1 + i18];
                            i4 = i3;
                        }
                        int i27 = etVar.d - ((etVar.b - i4) - i25);
                        if (i20 == 0) {
                            i5 = i27;
                            i6 = 0;
                        } else if (i4 != i3) {
                            i6 = i20;
                            i5 = i27;
                        } else {
                            i5 = i27 + 1;
                            i6 = i20;
                        }
                        while (true) {
                            if (i4 > etVar.a && i27 > etVar.c) {
                                int i28 = i4 - 1;
                                i7 = i25;
                                int i29 = i27 - 1;
                                if (!erVar.e(i28, i29)) {
                                    break;
                                }
                                i4 = i28;
                                i27 = i29;
                                i25 = i7;
                            } else {
                                i7 = i25;
                                break;
                            }
                        }
                        int i30 = iB4 % 2;
                        iArr2[i7 + i18] = i4;
                        if (i30 == 0 && (i8 = iB5 - i7) >= (-i6) && i8 <= i6 && iArr[i8 + i18] >= i4) {
                            euVar2 = new defpackage.eu();
                            euVar2.a = i4;
                            euVar2.b = i27;
                            euVar2.c = i3;
                            euVar2.d = i5;
                            i2 = 1;
                            euVar2.e = true;
                            break;
                        }
                        i25 = i7 + 2;
                        iB4 = iB4;
                        iB5 = iB5;
                    }
                    if (euVar2 != null) {
                        euVar = euVar2;
                        break;
                    }
                    i20++;
                    i16 = i2;
                    i17 = i;
                    i18 = i18;
                    iB2 = iB2;
                }
            } else {
                i = i17;
                i2 = i16;
                euVar = null;
                break;
            }
            if (euVar != null) {
                if (euVar.a() > 0) {
                    int i31 = euVar.d;
                    int i32 = euVar.b;
                    int i33 = i31 - i32;
                    int i34 = euVar.c;
                    int i35 = euVar.a;
                    int i36 = i34 - i35;
                    if (i33 == i36) {
                        ahozVar = new defpackage.ahoz(i35, i32, i36, null, null, null);
                    } else if (euVar.e) {
                        ahozVar = new defpackage.ahoz(i35, i32, euVar.a(), null, null, null);
                    } else {
                        ahozVar = i33 > i36 ? new defpackage.ahoz(i35, i32 + 1, euVar.a(), null, null, null) : new defpackage.ahoz(i35 + 1, i32, euVar.a(), null, null, null);
                    }
                    arrayList.add(ahozVar);
                }
                defpackage.et etVar2 = arrayList3.isEmpty() ? new defpackage.et() : (defpackage.et) arrayList3.remove(arrayList3.size() - 1);
                etVar2.a = etVar.a;
                etVar2.c = etVar.c;
                etVar2.b = euVar.a;
                etVar2.d = euVar.b;
                arrayList2.add(etVar2);
                int i37 = etVar.b;
                int i38 = etVar.d;
                etVar.a = euVar.c;
                etVar.c = euVar.d;
                arrayList2.add(etVar);
            } else {
                arrayList3.add(etVar);
            }
            i16 = i2;
            i17 = i;
        }
        java.util.Collections.sort(arrayList, a);
        return new defpackage.es(erVar, arrayList, iArr, iArr2);
    }
}
