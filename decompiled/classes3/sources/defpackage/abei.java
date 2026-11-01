package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abei extends aomh implements aonn {
    final /* synthetic */ java.util.List a;
    final /* synthetic */ defpackage.afpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abei(defpackage.afpl afplVar, java.util.List list, aoln aolnVar) {
        super(2, aolnVar);
        this.b = afplVar;
        this.a = list;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0153 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x010a  */
    /* JADX WARN: Code duplicated, block: B:33:0x010d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0111  */
    /* JADX WARN: Code duplicated, block: B:36:0x0114  */
    /* JADX WARN: Code duplicated, block: B:39:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x0130  */
    /* JADX WARN: Code duplicated, block: B:47:0x0138  */
    /* JADX WARN: Code duplicated, block: B:61:0x017f  */
    /* JADX WARN: Type inference failed for: r3v1, types: [aonj, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        int i;
        int i2;
        aoor aoorVar;
        java.util.List list;
        aoor aoorVar2;
        int i3;
        int i4;
        aizg aizgVar;
        int[] iArr;
        aizg aizgVar2;
        int iA;
        int i5;
        int i6;
        int i7;
        int i8;
        int iA2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        aooc.af(obj);
        java.util.List list2 = this.a;
        aooh.f(list2, "items");
        defpackage.afpl afplVar = this.b;
        java.util.List listG = afplVar.G();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : listG) {
            if (((java.lang.Boolean) ((defpackage.abef) obj2).b.b()).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        if (!aooh.n(arrayList, list2)) {
            java.util.List listG2 = afplVar.G();
            ?? r3 = afplVar.a;
            aooh.f(listG2, "oldList");
            aooh.f(list2, "newList");
            aooh.f((java.lang.Object) r3, "key");
            java.util.List listCb = ajsz.cb(listG2);
            aoor aoorVar3 = new aoor();
            int size = listG2.size();
            int size2 = list2.size();
            int i15 = 1;
            int i16 = ((size + size2) + 1) / 2;
            aizg aizgVar3 = new aizg(i16 * 3, (byte[]) null);
            aizg aizgVar4 = new aizg(i16 << 2, (byte[]) null);
            int i17 = 0;
            aizgVar4.f(0, size, 0, size2);
            int i18 = (i16 << 1) + 1;
            int[] iArr2 = new int[i18];
            int[] iArr3 = new int[i18];
            int[] iArr4 = new int[5];
            while (true) {
                i = i17;
                if (aizgVar4.a == 0) {
                    break;
                }
                int iD = aizgVar4.d();
                int iD2 = aizgVar4.d();
                int i19 = i15;
                int iD3 = aizgVar4.d();
                defpackage.afpl afplVar2 = afplVar;
                int iD4 = aizgVar4.d();
                int i20 = iD3 - iD4;
                int i21 = iD - iD2;
                if (i20 <= 0 || i21 <= 0) {
                    list = listCb;
                    aoorVar2 = aoorVar3;
                    i3 = size;
                    i4 = size2;
                    aizgVar = aizgVar4;
                    iArr = iArr4;
                } else {
                    iArr = iArr4;
                    int i22 = ((i20 + i21) + 1) / 2;
                    list = listCb;
                    defpackage.abee.b(iArr2, i19, iD4);
                    defpackage.abee.b(iArr3, i19, iD3);
                    int i23 = i;
                    while (true) {
                        if (i23 < i22) {
                            int i24 = i22;
                            int i25 = -i23;
                            int i26 = i20 - i21;
                            int iAbs = java.lang.Math.abs(i26) & 1;
                            aoorVar2 = aoorVar3;
                            int i27 = i25;
                            while (true) {
                                if (i27 <= i23) {
                                    if (i27 != i25) {
                                        i3 = size;
                                        int i28 = i27 - 1;
                                        if (i27 != i23) {
                                            i4 = size2;
                                            aizgVar2 = aizgVar4;
                                            if (defpackage.abee.a(iArr2, i27 + 1) > defpackage.abee.a(iArr2, i28)) {
                                            }
                                            int i29 = (i9 - iD4) + iD2;
                                            if (i23 != 0) {
                                                i10 = 1;
                                            } else {
                                                i10 = i;
                                            }
                                            if (i9 == iA2) {
                                                i11 = 1;
                                            } else {
                                                i11 = i;
                                            }
                                            int i30 = i29 - i27;
                                            int i31 = iA2;
                                            i12 = i30;
                                            while (i9 < iD3 && i12 < iD && afsq.bv(i9, i12, listG2, (aonj) r3, list2)) {
                                                i9++;
                                                i12++;
                                            }
                                            defpackage.abee.b(iArr2, i27, i9);
                                            i13 = i27;
                                            if (iAbs != 0) {
                                                i14 = i26 - i13;
                                                int i32 = i12;
                                                if (i14 < i25 + 1 && i14 <= i23 - 1 && defpackage.abee.a(iArr3, i14) <= i9) {
                                                    afsq.bx(i31, i30 - (i10 & i11), i9, i32, false, iArr);
                                                }
                                            }
                                            i27 = i13 + 2;
                                            size = i3;
                                            size2 = i4;
                                            aizgVar4 = aizgVar2;
                                        } else {
                                            i4 = size2;
                                            aizgVar2 = aizgVar4;
                                        }
                                        iA2 = defpackage.abee.a(iArr2, i28);
                                        i9 = iA2 + 1;
                                        int i210 = (i9 - iD4) + iD2;
                                        if (i23 != 0) {
                                            i10 = 1;
                                        } else {
                                            i10 = i;
                                        }
                                        if (i9 == iA2) {
                                            i11 = 1;
                                        } else {
                                            i11 = i;
                                        }
                                        int i33 = i210 - i27;
                                        int i34 = iA2;
                                        i12 = i33;
                                        while (i9 < iD3) {
                                            i9++;
                                            i12++;
                                        }
                                        defpackage.abee.b(iArr2, i27, i9);
                                        i13 = i27;
                                        if (iAbs != 0) {
                                            i14 = i26 - i13;
                                            int i35 = i12;
                                            if (i14 < i25 + 1) {
                                                continue;
                                            }
                                        }
                                        i27 = i13 + 2;
                                        size = i3;
                                        size2 = i4;
                                        aizgVar4 = aizgVar2;
                                    } else {
                                        i3 = size;
                                        i4 = size2;
                                        aizgVar2 = aizgVar4;
                                    }
                                    iA2 = defpackage.abee.a(iArr2, i27 + 1);
                                    i9 = iA2;
                                    int i211 = (i9 - iD4) + iD2;
                                    if (i23 != 0) {
                                        i10 = 1;
                                    } else {
                                        i10 = i;
                                    }
                                    if (i9 == iA2) {
                                        i11 = 1;
                                    } else {
                                        i11 = i;
                                    }
                                    int i36 = i211 - i27;
                                    int i37 = iA2;
                                    i12 = i36;
                                    while (i9 < iD3) {
                                        i9++;
                                        i12++;
                                    }
                                    defpackage.abee.b(iArr2, i27, i9);
                                    i13 = i27;
                                    if (iAbs != 0) {
                                        i14 = i26 - i13;
                                        int i38 = i12;
                                        if (i14 < i25 + 1) {
                                            continue;
                                        }
                                    }
                                    i27 = i13 + 2;
                                    size = i3;
                                    size2 = i4;
                                    aizgVar4 = aizgVar2;
                                } else {
                                    i3 = size;
                                    i4 = size2;
                                    aizgVar2 = aizgVar4;
                                    int i39 = i25;
                                    while (true) {
                                        if (i39 <= i23) {
                                            if (i39 != i25) {
                                                int i40 = i39 - 1;
                                                if (i39 == i23 || defpackage.abee.a(iArr3, i39 + 1) >= defpackage.abee.a(iArr3, i40)) {
                                                    iA = defpackage.abee.a(iArr3, i40);
                                                    i5 = iA - 1;
                                                } else {
                                                    iA = defpackage.abee.a(iArr3, i39 + 1);
                                                    i5 = iA;
                                                }
                                            } else {
                                                iA = defpackage.abee.a(iArr3, i39 + 1);
                                                i5 = iA;
                                            }
                                            int i41 = iD - ((iD3 - i5) - i39);
                                            int i42 = i23 != 0 ? 1 : i;
                                            int i43 = i5 == iA ? 1 : i;
                                            int i44 = iA;
                                            int i45 = i41;
                                            while (true) {
                                                if (i5 <= iD4 || i45 <= iD2) {
                                                    i6 = i45;
                                                    i7 = i41;
                                                    break;
                                                }
                                                i6 = i45;
                                                int i46 = i5 - 1;
                                                i7 = i41;
                                                int i47 = i6 - 1;
                                                if (!afsq.bv(i46, i47, listG2, (aonj) r3, list2)) {
                                                    break;
                                                }
                                                i5 = i46;
                                                i45 = i47;
                                                i41 = i7;
                                            }
                                            int i48 = (i26 & 1) ^ 1;
                                            defpackage.abee.b(iArr3, i39, i5);
                                            if (i48 == 0 || (i8 = i26 - i39) < i25 || i8 > i23 || defpackage.abee.a(iArr2, i8) < i5) {
                                                i39 += 2;
                                                aizgVar2 = aizgVar2;
                                            } else {
                                                afsq.bx(i5, i6, i44, i7 + (i42 & i43), true, iArr);
                                            }
                                        } else {
                                            i23++;
                                            aizgVar4 = aizgVar2;
                                            i22 = i24;
                                            aoorVar3 = aoorVar2;
                                            size = i3;
                                            size2 = i4;
                                        }
                                    }
                                }
                                char c = 1;
                                if (java.lang.Math.min(iArr[2] - iArr[i], iArr[3] - iArr[1]) > 0) {
                                    int i49 = iArr[i];
                                    int i50 = iArr[1];
                                    int i51 = iArr[3] - i50;
                                    int iMin = iArr[2] - i49;
                                    if (i51 != iMin) {
                                        iMin = java.lang.Math.min(iMin, i51);
                                        int i52 = iArr[4] != 0 ? 1 : i;
                                        c = 1;
                                        i49 += ((defpackage.abeg.a(iArr) ? 1 : 0) | i52) ^ 1;
                                        i50 += (i52 | (!defpackage.abeg.a(iArr) ? 1 : 0)) ^ 1;
                                    } else {
                                        c = 1;
                                    }
                                    aizgVar3.e(i49, i50, iMin);
                                }
                                aizgVar = aizgVar2;
                                aizgVar.f(iD4, iArr[i], iD2, iArr[c]);
                                aizgVar.f(iArr[2], iD3, iArr[3], iD);
                            }
                        } else {
                            aoorVar2 = aoorVar3;
                            i3 = size;
                            i4 = size2;
                            aizgVar = aizgVar4;
                        }
                    }
                }
                i17 = i;
                aizgVar4 = aizgVar;
                iArr4 = iArr;
                afplVar = afplVar2;
                listCb = list;
                aoorVar3 = aoorVar2;
                size = i3;
                size2 = i4;
                i15 = 1;
            }
            defpackage.afpl afplVar3 = afplVar;
            java.util.List list3 = listCb;
            aoor aoorVar4 = aoorVar3;
            int i53 = size;
            int i54 = size2;
            int i55 = aizgVar3.a;
            if (i55 % 3 != 0) {
                throw new java.lang.IllegalStateException("Array size not a multiple of 3");
            }
            if (i55 > 3) {
                i2 = i;
                aizgVar3.g(i2, i55 - 3);
            } else {
                i2 = i;
            }
            aizgVar3.e(i53, i54, i2);
            int i56 = i2;
            int i57 = i56;
            while (i57 < aizgVar3.a) {
                int i58 = i57 + 2;
                int iC = aizgVar3.c(i57) - aizgVar3.c(i58);
                int iC2 = aizgVar3.c(i57 + 1) - aizgVar3.c(i58);
                int iC3 = aizgVar3.c(i58);
                i57 += 3;
                while (true) {
                    aoorVar = aoorVar4;
                    if (i2 >= iC) {
                        break;
                    }
                    aoorVar.a++;
                    i2++;
                }
                while (i56 < iC2) {
                    list3.add(aoorVar.a + i56, new defpackage.abef(list2.get(i56), new akc(java.lang.Boolean.FALSE)));
                    i56++;
                }
                java.util.List list4 = list3;
                while (iC3 > 0) {
                    iC3--;
                    list4.set(aoorVar.a + i56, new defpackage.abef(list2.get(i56), ((defpackage.abef) listG2.get(i2)).b));
                    i2++;
                    i56++;
                }
                aoorVar4 = aoorVar;
                list3 = list4;
            }
            java.util.List<defpackage.abef> list5 = list3;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(r3.a(it.next()));
            }
            java.util.Set setCf = ajsz.cf(arrayList2);
            for (defpackage.abef abefVar : list5) {
                abefVar.b.f(java.lang.Boolean.valueOf(setCf.contains(r3.a(abefVar.a))));
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(ajsz.bl(list5, 10));
            java.util.Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((defpackage.abef) it2.next()).a);
            }
            java.util.List listG3 = afplVar3.G();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(ajsz.bl(listG3, 10));
            java.util.Iterator it3 = listG3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((defpackage.abef) it3.next()).a);
            }
            if (!aooh.n(arrayList3, arrayList4)) {
                afplVar3.H(list5);
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.abei(this.b, this.a, aolnVar);
    }
}
