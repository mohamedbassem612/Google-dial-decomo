package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bnq implements defpackage.cyk {
    public final cmn a;
    private final awa b;
    private final defpackage.bsh c;

    public bnq(defpackage.bsh bshVar, awa awaVar, cmn cmnVar) {
        this.c = bshVar;
        this.b = awaVar;
        this.a = cmnVar;
    }

    @Override // defpackage.cyk
    public final /* synthetic */ int a(cxf cxfVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.List list2 = (java.util.List) list.get(i2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new defpackage.dcm((cxe) list2.get(i3), 2, 2, 1));
            }
            arrayList.add(arrayList2);
        }
        return e(new defpackage.cxh(cxfVar, cxfVar.p()), arrayList, dpe.c(0, i, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY)).b();
    }

    @Override // defpackage.cyk
    public final /* synthetic */ int b(cxf cxfVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.List list2 = (java.util.List) list.get(i2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new defpackage.dcm((cxe) list2.get(i3), 2, 1, 1));
            }
            arrayList.add(arrayList2);
        }
        return e(new defpackage.cxh(cxfVar, cxfVar.p()), arrayList, dpe.c(0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, i)).c();
    }

    @Override // defpackage.cyk
    public final /* synthetic */ int c(cxf cxfVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.List list2 = (java.util.List) list.get(i2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new defpackage.dcm((cxe) list2.get(i3), 1, 2, 1));
            }
            arrayList.add(arrayList2);
        }
        return e(new defpackage.cxh(cxfVar, cxfVar.p()), arrayList, dpe.c(0, i, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY)).b();
    }

    @Override // defpackage.cyk
    public final /* synthetic */ int d(cxf cxfVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.List list2 = (java.util.List) list.get(i2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(new defpackage.dcm((cxe) list2.get(i3), 1, 1, 1));
            }
            arrayList.add(arrayList2);
        }
        return e(new defpackage.cxh(cxfVar, cxfVar.p()), arrayList, dpe.c(0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, i)).c();
    }

    @Override // defpackage.cyk
    public final cyf e(cyi cyiVar, java.util.List list, long j) {
        int i;
        defpackage.bsh bshVar;
        float f;
        int i2;
        long j2;
        java.lang.Integer numValueOf;
        int i3;
        java.util.ArrayList arrayList;
        int i4;
        int[] iArrCopyOfRange;
        java.lang.Object obj;
        java.util.ArrayList arrayList2;
        int iMin;
        int i5 = 0;
        final java.util.List list2 = (java.util.List) list.get(0);
        java.util.List list3 = (java.util.List) list.get(1);
        int size = list2.size();
        defpackage.bsh bshVar2 = this.c;
        bshVar2.c(size);
        awa awaVar = this.b;
        int iDp = cyiVar.dp(((defpackage.awd) awaVar).a);
        long j3 = iDp;
        int size2 = list2.size();
        final java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int[] iArr = new int[size2];
        dpd[] dpdVarArr = new dpd[size2];
        int size3 = list2.size();
        defpackage.bns[] bnsVarArr = new defpackage.bns[size3];
        while (i5 < size3) {
            java.lang.Object objG = ((cyd) list2.get(i5)).g();
            int i6 = i5;
            defpackage.bns bnsVar = objG instanceof defpackage.bns ? (defpackage.bns) objG : null;
            if (bnsVar == null) {
                bnsVar = new defpackage.bns(null);
            }
            bnsVarArr[i6] = bnsVar;
            i5 = i6 + 1;
        }
        int size4 = list2.size();
        aii[] aiiVarArr = new aii[size4];
        int i7 = 0;
        while (i7 < size4) {
            int i8 = i7;
            aiiVarArr[i8] = bnsVarArr[i8].b;
            i7 = i8 + 1;
        }
        int iD = dpd.d(j);
        int iB = dpd.b(j);
        float f2 = 0.0f;
        int i9 = 0;
        int i10 = 0;
        int iMin2 = 0;
        while (i9 < size2) {
            int i11 = i9;
            cyd cydVar = (cyd) list2.get(i9);
            float fQ = rd.q(rd.r(cydVar));
            if (fQ > 0.0f) {
                f2 += fQ;
                i10++;
            } else {
                int iD2 = cydVar.d(dpd.a(j));
                dpdVarArr[i11] = new dpd(dpd.k(j, 0, aooc.t(iD2, 0), 0, 0, 12));
                iArr[i11] = iD2;
                iMin2 += iD2 + java.lang.Math.min(iDp, aooc.t((iB - iMin2) - iD2, 0));
            }
            i9 = i11 + 1;
            awaVar = awaVar;
        }
        awa awaVar2 = awaVar;
        if (i10 == 0) {
            i = iDp;
        } else {
            long j4 = j3 * ((long) (i10 - 1));
            int i12 = iDp;
            long jX = aooc.x(((long) ((iB != Integer.MAX_VALUE ? iB : iD) - iMin2)) - j4, 0L);
            float f3 = jX / f2;
            for (int i13 = 0; i13 < size2; i13++) {
                jX -= (long) java.lang.Math.round(rd.q(rd.r((cyd) list2.get(i13))) * f3);
            }
            int i14 = 0;
            int iW = 0;
            while (i14 < size2) {
                long j5 = jX;
                int i15 = iB - iMin2;
                if (dpdVarArr[i14] == null) {
                    float fQ2 = rd.q(rd.r((cyd) list2.get(i14)));
                    int iSignum = java.lang.Long.signum(j5);
                    f = f3;
                    i2 = i14;
                    j2 = j5 - ((long) iSignum);
                    int iMax = java.lang.Math.max(0, java.lang.Math.round(fQ2 * f) + iSignum);
                    bshVar = bshVar2;
                    dpdVarArr[i2] = new dpd(dpd.k(j, iMax != Integer.MAX_VALUE ? iMax : 0, iMax, 0, 0, 12));
                    iArr[i2] = iMax;
                    iW += iMax;
                } else {
                    bshVar = bshVar2;
                    f = f3;
                    i2 = i14;
                    j2 = j5;
                }
                iW = aooc.w((int) (((long) iW) + j4), 0, i15);
                i14 = i2 + 1;
                jX = j2;
                i12 = i12;
                f3 = f;
                bshVar2 = bshVar;
            }
            i = i12;
        }
        defpackage.bsh bshVar3 = bshVar2;
        aoor aoorVar = new aoor();
        int size5 = list2.size();
        int[] iArr2 = new int[size5];
        for (int i16 = 0; i16 < size5; i16++) {
            dpd dpdVar = dpdVarArr[i16];
            iArr2[i16] = dpd.b(dpdVar != null ? dpdVar.a : j);
        }
        int iCM = ajsz.cM(iArr2) + ((list2.size() - 1) * i);
        if (iCM <= iB) {
            i3 = size5;
            arrayList = null;
        } else {
            if (!list3.isEmpty()) {
                numValueOf = java.lang.Integer.valueOf(((cyd) list3.get(0)).d(dpd.a(j)));
                int iAZ = ajsz.aZ(list3);
                if (iAZ > 0) {
                    int i17 = 1;
                    while (true) {
                        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((cyd) list3.get(i17)).d(dpd.a(j)));
                        if (numValueOf2.compareTo(numValueOf) > 0) {
                            numValueOf = numValueOf2;
                        }
                        if (i17 == iAZ) {
                            break;
                        }
                        i17++;
                    }
                }
            } else {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            int i18 = iB - iIntValue;
            int i19 = iIntValue;
            i3 = 0;
            while (i3 < size5) {
                int i20 = iArr2[i3];
                if (i20 > i18) {
                    break;
                }
                i19 += i20;
                aoorVar.a += i20;
                i18 -= i20 + i;
                i3++;
            }
            int i21 = i * i3;
            int i22 = i19 + i21;
            aoorVar.a += i21;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(list3.size());
            int size6 = list3.size();
            int i23 = 0;
            while (i23 < size6) {
                arrayList4.add(((cyd) list3.get(i23)).v(dpd.k(j, 0, i18 + iIntValue, 0, 0, 13)));
                i23++;
                aoorVar = aoorVar;
                list3 = list3;
                i18 = i18;
            }
            iCM = i22;
            arrayList = arrayList4;
        }
        final aoor aoorVar2 = aoorVar;
        bshVar3.d(i3);
        if (list2.size() > 1) {
            int i24 = 0;
            while (i24 < i3) {
                if (((java.lang.Number) aiiVarArr[i24].d()).floatValue() == 0.0f) {
                    arrayList2 = arrayList;
                } else {
                    if (i24 <= 0 || i24 >= i3 - 1) {
                        arrayList2 = arrayList;
                        if (i24 == 0) {
                            iMin = java.lang.Math.min(aopc.i(((java.lang.Number) aiiVarArr[0].d()).floatValue() * java.lang.Math.min(iArr2[0] * 0.15f, cyiVar.dl(bnsVarArr[1].c))), iArr2[1]);
                            iArr2[1] = iArr2[1] - iMin;
                        } else {
                            int i25 = i24 - 1;
                            iMin = java.lang.Math.min(aopc.i(((java.lang.Number) aiiVarArr[i24].d()).floatValue() * java.lang.Math.min(iArr2[i24] * 0.15f, cyiVar.dl(bnsVarArr[i25].c))), iArr2[i25]);
                            iArr2[i25] = iArr2[i25] - iMin;
                        }
                    } else {
                        int i26 = i24 - 1;
                        int i27 = i24 + 1;
                        arrayList2 = arrayList;
                        int i28 = aopc.i(((java.lang.Number) aiiVarArr[i24].d()).floatValue() * java.lang.Math.min((iArr2[i24] * 0.15f) / 2.0f, java.lang.Math.min(cyiVar.dl(bnsVarArr[i26].c), cyiVar.dl(bnsVarArr[i27].c))));
                        int iMin3 = java.lang.Math.min(i28, iArr2[i26]);
                        int iMin4 = java.lang.Math.min(i28, iArr2[i27]);
                        iArr2[i26] = iArr2[i26] - iMin3;
                        iArr2[i27] = iArr2[i27] - iMin4;
                        iMin = iMin3 + iMin4;
                    }
                    iArr2[i24] = iArr2[i24] + iMin;
                }
                i24++;
                arrayList = arrayList2;
            }
        }
        final java.util.ArrayList arrayList5 = arrayList;
        for (int i29 = 0; i29 < i3; i29++) {
            cyd cydVar2 = (cyd) list2.get(i29);
            dpd dpdVar2 = dpdVarArr[i29];
            long j6 = dpdVar2 != null ? dpdVar2.a : j;
            int i30 = iArr2[i29];
            arrayList3.add(cydVar2.v(dpd.k(j6, i30, i30, 0, 0, 12)));
        }
        int iMax2 = java.lang.Math.max(aooc.t(iCM, 0), iD);
        final int[] iArr3 = new int[i3];
        aopq aopqVar = new aopq(0, i3 - 1);
        if (aopqVar.d()) {
            iArrCopyOfRange = new int[0];
            i4 = 1;
        } else {
            int iIntValue2 = aopqVar.c().intValue();
            i4 = 1;
            int iIntValue3 = aopqVar.b().intValue() + 1;
            ajsz.ct(iIntValue3, size5);
            iArrCopyOfRange = java.util.Arrays.copyOfRange(iArr2, iIntValue2, iIntValue3);
            aooh.e(iArrCopyOfRange, "copyOfRange(...)");
        }
        awaVar2.b(cyiVar, iMax2, iArrCopyOfRange, cyiVar.p(), iArr3);
        if (arrayList3.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList3.get(0);
            int i31 = ((czc) obj).b;
            int iAZ2 = ajsz.aZ(arrayList3);
            if (iAZ2 > 0) {
                java.lang.Object obj2 = obj;
                int i32 = i4;
                while (true) {
                    java.lang.Object obj3 = arrayList3.get(i32);
                    int i33 = ((czc) obj3).b;
                    if (i31 < i33) {
                        obj2 = obj3;
                        i31 = i33;
                    }
                    if (i32 == iAZ2) {
                        break;
                    }
                    i32++;
                }
                obj = obj2;
            }
        }
        czc czcVar = (czc) obj;
        final int iC = czcVar != null ? czcVar.b : dpd.c(j);
        return den.z(cyiVar, iMax2, iC, new aonj() { // from class: bnp
            public final java.lang.Object a(java.lang.Object obj4) {
                defpackage.bnq bnqVar;
                int i34;
                java.util.List list4 = arrayList3;
                czb czbVar = (czb) obj4;
                int size7 = list4.size();
                int i35 = 0;
                while (true) {
                    bnqVar = this;
                    i34 = iC;
                    if (i35 >= size7) {
                        break;
                    }
                    java.lang.Object objG2 = ((cyd) list2.get(i35)).g();
                    if (objG2 instanceof defpackage.bns) {
                    }
                    czbVar.s((czc) list4.get(i35), iArr3[i35], bnqVar.a.a(((czc) list4.get(i35)).b, i34), 0.0f);
                    i35++;
                }
                java.util.List list5 = arrayList5;
                if (list5 != null) {
                    int size8 = list5.size();
                    for (int i36 = 0; i36 < size8; i36++) {
                        aoor aoorVar3 = aoorVar2;
                        czc czcVar2 = (czc) list5.get(i36);
                        czbVar.u(czcVar2, aoorVar3.a, bnqVar.a.a(czcVar2.b, i34), 0.0f);
                    }
                }
                return aojh.a;
            }
        });
    }
}
