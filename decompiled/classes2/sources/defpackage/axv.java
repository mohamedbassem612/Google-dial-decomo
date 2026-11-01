package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class axv implements defpackage.cyk, azf {
    public final defpackage.axe a;
    private final awa c;
    private final awh d;
    private final float e;
    private final float f;
    private final defpackage.axt i;
    private final boolean b = true;
    private final int g = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
    private final int h = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;

    public axv(awa awaVar, awh awhVar, float f, defpackage.axe axeVar, float f2, defpackage.axt axtVar) {
        this.c = awaVar;
        this.d = awhVar;
        this.e = f;
        this.a = axeVar;
        this.f = f2;
        this.i = axtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int k(java.util.List list, int i, int i2, int i3, defpackage.axt axtVar) {
        int iE;
        int iF;
        long jC;
        int iE2;
        int iF2;
        java.util.List list2 = list;
        int i4 = 0;
        if (list2.isEmpty()) {
            jC = defpackage.acl.c(0, 0);
        } else {
            int i5 = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
            long jC2 = dpe.c(0, i, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
            cxe cxeVar = (cxe) ajsz.bH(list2, 0);
            if (cxeVar != null) {
                iE = cxeVar.e(i);
                iF = cxeVar.f(iE);
            } else {
                iE = 0;
                iF = 0;
            }
            int i6 = iE;
            int i7 = iF;
            if (rz.d(list2.size() > 1, 0, defpackage.acl.c(i, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY), cxeVar == null ? null : new defpackage.acl(defpackage.acl.c(iF, iE)), 0, 0, 0, false, false, axtVar, jC2, i2, i3).b) {
                jC = defpackage.acl.c(0, 0);
            } else {
                int size = list2.size();
                int i8 = i;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = i6;
                int i15 = i7;
                int i16 = 0;
                while (i9 < size) {
                    int i17 = i8 - i15;
                    int i18 = i9 + 1;
                    int iMax = java.lang.Math.max(i10, i14);
                    cxe cxeVar2 = (cxe) ajsz.bH(list2, i18);
                    if (cxeVar2 != null) {
                        iE2 = cxeVar2.e(i);
                        iF2 = cxeVar2.f(iE2) + i2;
                    } else {
                        iE2 = i4;
                        iF2 = iE2;
                    }
                    boolean z = i9 + 2 < list2.size() ? 1 : i4;
                    int i19 = i11;
                    int i20 = i12;
                    int i21 = i18 - i16;
                    int i22 = size;
                    long jC3 = defpackage.acl.c(i17, i5);
                    int i23 = iE2;
                    int i24 = iF2;
                    defpackage.axm axmVarD = rz.d(z, i21, jC3, cxeVar2 == null ? null : new defpackage.acl(defpackage.acl.c(iF2, iE2)), i19, i20, iMax, false, false, axtVar, jC2, i2, i3);
                    if (axmVarD.a) {
                        i12 = i20 + iMax + i3;
                        rz.e(axmVarD, axtVar);
                        int i25 = i24 - i2;
                        i11 = i19 + 1;
                        if (axmVarD.b) {
                            i13 = i18;
                            break;
                        }
                        i16 = i18;
                        i8 = i;
                        i15 = i25;
                        i10 = 0;
                    } else {
                        i11 = i19;
                        i10 = iMax;
                        i12 = i20;
                        i8 = i17;
                        i15 = i24;
                    }
                    i9 = i18;
                    i13 = i9;
                    size = i22;
                    i14 = i23;
                    i5 = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
                    i4 = 0;
                    list2 = list;
                }
                jC = defpackage.acl.c(i12 - i3, i13);
            }
        }
        return defpackage.acl.a(jC);
    }

    @Override // defpackage.cyk
    public final int a(cxf cxfVar, java.util.List list, int i) {
        cxe cxeVar;
        cxe cxeVar2;
        java.util.List list2 = (java.util.List) ajsz.bH(list, 1);
        if (list2 != null) {
            cxeVar = (cxe) (list2.isEmpty() ? null : list2.get(0));
        } else {
            cxeVar = null;
        }
        java.util.List list3 = (java.util.List) ajsz.bH(list, 2);
        if (list3 != null) {
            cxeVar2 = (cxe) (list3.isEmpty() ? null : list3.get(0));
        } else {
            cxeVar2 = null;
        }
        defpackage.axt axtVar = this.i;
        axtVar.a(cxeVar, cxeVar2, dpe.c(0, i, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY));
        aokc aokcVar = (java.util.List) (list.isEmpty() ? null : list.get(0));
        if (aokcVar == null) {
            aokcVar = aokc.a;
        }
        return k(aokcVar, i, cxfVar.dp(this.e), cxfVar.dp(this.f), axtVar);
    }

    @Override // defpackage.cyk
    public final int b(cxf cxfVar, java.util.List list, int i) {
        cxe cxeVar;
        cxe cxeVar2;
        java.util.List list2 = (java.util.List) ajsz.bH(list, 1);
        if (list2 != null) {
            cxeVar = (cxe) (list2.isEmpty() ? null : list2.get(0));
        } else {
            cxeVar = null;
        }
        java.util.List list3 = (java.util.List) ajsz.bH(list, 2);
        if (list3 != null) {
            cxeVar2 = (cxe) (list3.isEmpty() ? null : list3.get(0));
        } else {
            cxeVar2 = null;
        }
        this.i.a(cxeVar, cxeVar2, dpe.c(0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, i));
        aokc aokcVar = (java.util.List) (list.isEmpty() ? null : list.get(0));
        if (aokcVar == null) {
            aokcVar = aokc.a;
        }
        int iDp = cxfVar.dp(this.e);
        int size = aokcVar.size();
        int i2 = 0;
        int iMax = 0;
        int iD = 0;
        int i3 = 0;
        while (i2 < size) {
            iD += ((cxe) aokcVar.get(i2)).d(i) + iDp;
            int i4 = i2 + 1;
            if (i4 - i3 == Integer.MAX_VALUE || i4 == aokcVar.size()) {
                iMax = java.lang.Math.max(iMax, iD - iDp);
                i3 = i2;
                iD = 0;
            }
            i2 = i4;
        }
        return iMax;
    }

    @Override // defpackage.cyk
    public final int c(cxf cxfVar, java.util.List list, int i) {
        cxe cxeVar;
        cxe cxeVar2;
        java.util.List list2 = (java.util.List) ajsz.bH(list, 1);
        if (list2 != null) {
            cxeVar = (cxe) (list2.isEmpty() ? null : list2.get(0));
        } else {
            cxeVar = null;
        }
        java.util.List list3 = (java.util.List) ajsz.bH(list, 2);
        if (list3 != null) {
            cxeVar2 = (cxe) (list3.isEmpty() ? null : list3.get(0));
        } else {
            cxeVar2 = null;
        }
        defpackage.axt axtVar = this.i;
        axtVar.a(cxeVar, cxeVar2, dpe.c(0, i, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY));
        aokc aokcVar = (java.util.List) (list.isEmpty() ? null : list.get(0));
        if (aokcVar == null) {
            aokcVar = aokc.a;
        }
        return k(aokcVar, i, cxfVar.dp(this.e), cxfVar.dp(this.f), axtVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cyk
    public final int d(cxf cxfVar, java.util.List list, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        aokc aokcVar;
        defpackage.axt axtVar;
        long jC;
        int i6;
        int i7;
        int i8 = 1;
        java.util.List list2 = (java.util.List) ajsz.bH(list, 1);
        int i9 = 0;
        cxe cxeVar = list2 != null ? (cxe) (list2.isEmpty() ? null : list2.get(0)) : null;
        int i10 = 2;
        java.util.List list3 = (java.util.List) ajsz.bH(list, 2);
        cxe cxeVar2 = list3 != null ? (cxe) (list3.isEmpty() ? null : list3.get(0)) : null;
        defpackage.axt axtVar2 = this.i;
        int i11 = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        axtVar2.a(cxeVar, cxeVar2, dpe.c(0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, i));
        aokc aokcVar2 = (java.util.List) (list.isEmpty() ? null : list.get(0));
        if (aokcVar2 == null) {
            aokcVar2 = aokc.a;
        }
        int iDp = cxfVar.dp(this.e);
        int iDp2 = cxfVar.dp(this.f);
        if (aokcVar2.isEmpty()) {
            return 0;
        }
        int size = aokcVar2.size();
        int[] iArr2 = new int[size];
        int size2 = aokcVar2.size();
        int[] iArr3 = new int[size2];
        int size3 = aokcVar2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            cxe cxeVar3 = (cxe) aokcVar2.get(i12);
            int iF = cxeVar3.f(i);
            iArr2[i12] = iF;
            iArr3[i12] = cxeVar3.e(iF);
        }
        aokcVar2.size();
        aokcVar2.size();
        int i13 = axtVar2.c;
        int iMin = java.lang.Math.min(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, aokcVar2.size());
        int iCM = ajsz.cM(iArr2) + ((aokcVar2.size() - 1) * iDp);
        if (size2 == 0) {
            throw new java.util.NoSuchElementException();
        }
        int i14 = iArr3[0];
        int i15 = size2 - 1;
        if (i15 > 0) {
            int i16 = 1;
            while (true) {
                int i17 = iArr3[i16];
                if (i14 < i17) {
                    i14 = i17;
                }
                if (i16 == i15) {
                    break;
                }
                i16++;
            }
        }
        if (size == 0) {
            throw new java.util.NoSuchElementException();
        }
        int i18 = iArr2[0];
        int i19 = size - 1;
        if (i19 > 0) {
            int i20 = 1;
            while (true) {
                int i21 = iArr2[i20];
                if (i18 < i21) {
                    i18 = i21;
                }
                if (i20 == i19) {
                    break;
                }
                i20++;
            }
        }
        int i22 = iCM;
        while (i18 <= i22 && i14 != i) {
            int i23 = (i18 + i22) / i10;
            if (aokcVar2.isEmpty()) {
                jC = defpackage.acl.c(i9, i9);
                iArr = iArr2;
                aokcVar = aokcVar2;
                i5 = i18;
                axtVar = axtVar2;
                i4 = iMin;
            } else {
                long jC2 = dpe.c(i9, i23, i9, i11);
                cxe cxeVar4 = (cxe) ajsz.bH(aokcVar2, i9);
                if (cxeVar4 != null) {
                    i2 = iArr3[i9];
                    i3 = iArr2[i9];
                } else {
                    i2 = i9;
                    i3 = i2;
                }
                defpackage.axt axtVar3 = axtVar2;
                boolean z = aokcVar2.size() > i8 ? i8 : i9;
                i4 = iMin;
                i5 = i18;
                int i24 = i2;
                int i25 = i3;
                if (rz.d(z, 0, defpackage.acl.c(i23, i11), cxeVar4 == null ? null : new defpackage.acl(defpackage.acl.c(i3, i2)), 0, 0, 0, false, false, axtVar3, jC2, iDp, iDp2).b) {
                    jC = defpackage.acl.c(i9, i9);
                    iArr = iArr2;
                    aokcVar = aokcVar2;
                    axtVar = axtVar3;
                } else {
                    int size4 = aokcVar2.size();
                    int i26 = i24;
                    int i27 = i25;
                    int i28 = i23;
                    int i29 = i9;
                    int i30 = i29;
                    int i31 = i30;
                    int i32 = i31;
                    int i33 = i32;
                    int i34 = i33;
                    while (true) {
                        if (i29 >= size4) {
                            iArr = iArr2;
                            aokcVar = aokcVar2;
                            axtVar = axtVar3;
                            break;
                        }
                        i28 -= i27;
                        int i35 = i29 + 1;
                        int iMax = java.lang.Math.max(i30, i26);
                        cxe cxeVar5 = (cxe) ajsz.bH(aokcVar2, i35);
                        if (cxeVar5 != null) {
                            i6 = iArr3[i35];
                            i7 = iArr2[i35] + iDp;
                        } else {
                            i6 = i9;
                            i7 = i6;
                        }
                        boolean z2 = i29 + 2 < aokcVar2.size();
                        iArr = iArr2;
                        int i36 = i31;
                        aokcVar = aokcVar2;
                        int i37 = i7;
                        int i38 = i6;
                        defpackage.axm axmVarD = rz.d(z2, i35 - i34, defpackage.acl.c(i28, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY), cxeVar5 == null ? null : new defpackage.acl(defpackage.acl.c(i7, i6)), i36, i33, iMax, false, false, axtVar3, jC2, iDp, iDp2);
                        axtVar = axtVar3;
                        if (axmVarD.a) {
                            i33 += iMax + iDp2;
                            rz.e(axmVarD, axtVar);
                            i37 -= iDp;
                            i31 = i36 + 1;
                            if (axmVarD.b) {
                                i32 = i35;
                                break;
                            }
                            i34 = i35;
                            i28 = i23;
                            iMax = 0;
                        } else {
                            i31 = i36;
                        }
                        i27 = i37;
                        aokcVar2 = aokcVar;
                        i32 = i35;
                        size4 = size4;
                        i26 = i38;
                        axtVar3 = axtVar;
                        i30 = iMax;
                        i9 = 0;
                        iArr2 = iArr;
                        i29 = i32;
                    }
                    jC = defpackage.acl.c(i33 - iDp2, i32);
                }
            }
            int iA = defpackage.acl.a(jC);
            if (iA > i || defpackage.acl.b(jC) < i4) {
                i18 = i23 + 1;
                if (i18 > i22) {
                    return i18;
                }
            } else {
                if (iA >= i) {
                    return i23;
                }
                i22 = i23 - 1;
                i18 = i5;
            }
            aokcVar2 = aokcVar;
            i14 = iA;
            iCM = i23;
            iMin = i4;
            axtVar2 = axtVar;
            i8 = 1;
            i9 = 0;
            i10 = 2;
            i11 = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
            iArr2 = iArr;
        }
        return iCM;
    }

    @Override // defpackage.cyk
    public final cyf e(cyi cyiVar, java.util.List list, long j) {
        sl slVar;
        java.lang.Integer numValueOf;
        java.lang.Integer num;
        sl slVar2;
        defpackage.acl aclVar;
        java.lang.Integer numValueOf2;
        java.lang.Integer numValueOf3;
        int i;
        int i2;
        if (!list.isEmpty()) {
            if (dpd.a(j) != 0) {
                if (list.isEmpty()) {
                    throw new java.util.NoSuchElementException("List is empty.");
                }
                java.util.List list2 = (java.util.List) list.get(0);
                if (list2.isEmpty()) {
                    return cyiVar.du(0, 0, aokd.a, new apk(15));
                }
                java.util.List list3 = (java.util.List) ajsz.bH(list, 1);
                cyd cydVar = list3 != null ? (cyd) (list3.isEmpty() ? null : list3.get(0)) : null;
                java.util.List list4 = (java.util.List) ajsz.bH(list, 2);
                cyd cydVar2 = list4 != null ? (cyd) (list4.isEmpty() ? null : list4.get(0)) : null;
                list2.size();
                defpackage.axt axtVar = this.i;
                long jC = dpe.c(dpd.d(j), dpd.b(j), dpd.c(j), dpd.a(j));
                long jC2 = dpe.c((10 & 1) != 0 ? dpd.d(jC) : 0, (10 & 2) != 0 ? dpd.b(jC) : 0, (10 & 4) != 0 ? dpd.c(jC) : 0, dpd.a(jC));
                long jC3 = dpe.c(dpd.d(jC2), dpd.b(jC2), dpd.c(jC2), dpd.a(jC2));
                if (cydVar != null) {
                    sa.h(cydVar, jC3, new defpackage.auj(axtVar, 6));
                    axtVar.a = cydVar;
                }
                if (cydVar2 != null) {
                    sa.h(cydVar2, jC3, new defpackage.auj(axtVar, 7));
                    axtVar.b = cydVar2;
                }
                java.util.Iterator it = list2.iterator();
                float f = this.e;
                float f2 = this.f;
                long jC4 = dpe.c(dpd.d(j), dpd.b(j), dpd.c(j), dpd.a(j));
                cfc cfcVar = new cfc(new cyf[16]);
                int iB = dpd.b(jC4);
                int iD = dpd.d(jC4);
                int iA = dpd.a(jC4);
                aco acoVar = acp.a;
                aco acoVar2 = new aco(6);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                float fCeil = (float) java.lang.Math.ceil(cyiVar.dl(f));
                float fCeil2 = (float) java.lang.Math.ceil(cyiVar.dl(f2));
                long jC5 = dpe.c(0, iB, 0, iA);
                long jC6 = dpe.c((10 & 1) != 0 ? dpd.d(jC5) : 0, (10 & 2) != 0 ? dpd.b(jC5) : 0, (10 & 4) != 0 ? dpd.c(jC5) : 0, dpd.a(jC5));
                long jC7 = dpe.c(dpd.d(jC6), dpd.b(jC6), dpd.c(jC6), dpd.a(jC6));
                aoot aootVar = new aoot();
                if (it instanceof defpackage.axb) {
                    cyiVar.dj(iB);
                    cyiVar.dj(iA);
                    slVar = new sl();
                } else {
                    slVar = null;
                }
                cyd cydVarI = !it.hasNext() ? null : sa.i(it, slVar);
                defpackage.acl aclVar2 = cydVarI != null ? new defpackage.acl(sa.h(cydVarI, jC7, new defpackage.auj(aootVar, 4))) : null;
                if (aclVar2 != null) {
                    java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(defpackage.acl.a(aclVar2.a));
                    numValueOf = java.lang.Integer.valueOf(defpackage.acl.b(aclVar2.a));
                    num = numValueOf4;
                } else {
                    numValueOf = null;
                    num = null;
                }
                int i3 = (int) fCeil2;
                int i4 = (int) fCeil;
                defpackage.acl aclVar3 = aclVar2;
                acm acmVar = new acm(16);
                acm acmVar2 = new acm(16);
                int[] iArr = acr.a;
                java.lang.Integer num2 = numValueOf;
                acq acqVar = new acq(6);
                defpackage.axm axmVarD = rz.d(it.hasNext(), 0, defpackage.acl.c(iB, iA), aclVar3, 0, 0, 0, false, false, axtVar, jC4, i4, i3);
                java.lang.Integer numValueOf5 = num;
                if (axmVarD.b) {
                    rz.e(axmVarD, axtVar);
                }
                cyd cydVar3 = cydVarI;
                defpackage.axt axtVar2 = axtVar;
                int i5 = iB;
                int i6 = iD;
                defpackage.axm axmVar = axmVarD;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                java.lang.Integer num3 = num2;
                int i13 = iA;
                while (!axmVar.b && cydVar3 != null) {
                    if (numValueOf5 == null) {
                        aooh.g();
                    }
                    int iIntValue = numValueOf5.intValue();
                    if (num3 == null) {
                        aooh.g();
                    }
                    int i14 = i9 + iIntValue;
                    acq acqVar2 = acqVar;
                    int iMax = java.lang.Math.max(i7, num3.intValue());
                    int i15 = i5 - iIntValue;
                    arrayList.add(cydVar3);
                    acoVar2.g(i8, aootVar.a);
                    java.lang.Object objG = cydVar3.g();
                    if (objG instanceof azg) {
                    }
                    int i16 = i8 + 1;
                    int i17 = i16 - i12;
                    boolean z = i17 < Integer.MAX_VALUE;
                    if (slVar != null) {
                        if (z) {
                            int i18 = i15 - i4;
                            i = i18 < 0 ? 0 : i18;
                        } else {
                            i = iB;
                        }
                        cyiVar.dj(i);
                        if (z) {
                            i2 = i13;
                        } else {
                            i2 = (i13 - iMax) - i3;
                            if (i2 < 0) {
                                i2 = 0;
                            }
                        }
                        cyiVar.dj(i2);
                    } else {
                        i17 = i17;
                    }
                    cyd cydVarI2 = !it.hasNext() ? null : sa.i(it, slVar);
                    aootVar.a = null;
                    if (cydVarI2 != null) {
                        slVar2 = slVar;
                        aclVar = new defpackage.acl(sa.h(cydVarI2, jC7, new defpackage.auj(aootVar, 5)));
                    } else {
                        slVar2 = slVar;
                        aclVar = null;
                    }
                    if (aclVar != null) {
                        numValueOf3 = java.lang.Integer.valueOf(defpackage.acl.a(aclVar.a) + i4);
                        numValueOf2 = java.lang.Integer.valueOf(defpackage.acl.b(aclVar.a));
                    } else {
                        numValueOf2 = null;
                        numValueOf3 = null;
                    }
                    int i19 = i6;
                    defpackage.axm axmVarD2 = rz.d(it.hasNext(), i17, defpackage.acl.c(i15, i13), aclVar == null ? null : new defpackage.acl(defpackage.acl.c(numValueOf3.intValue(), numValueOf2.intValue())), i10, i11, iMax, false, false, axtVar2, jC4, i4, i3);
                    defpackage.axt axtVar3 = axtVar2;
                    if (axmVarD2.a) {
                        int iMin = java.lang.Math.min(java.lang.Math.max(i19, i14), iB);
                        int i20 = i11 + iMax;
                        rz.e(axmVarD2, axtVar3);
                        acmVar2.f(iMax);
                        int i21 = (iA - i20) - i3;
                        acmVar.f(i16);
                        i10++;
                        i11 = i20 + i3;
                        i12 = i16;
                        i6 = iMin;
                        numValueOf5 = numValueOf3 != null ? java.lang.Integer.valueOf(numValueOf3.intValue() - i4) : null;
                        i5 = iB;
                        i13 = i21;
                        i7 = 0;
                        i9 = 0;
                    } else {
                        i9 = i14;
                        i6 = i19;
                        i5 = i15;
                        numValueOf5 = numValueOf3;
                        i13 = i13;
                        i7 = iMax;
                    }
                    axmVar = axmVarD2;
                    i8 = i16;
                    axtVar2 = axtVar3;
                    num3 = numValueOf2;
                    acqVar = acqVar2;
                    it = it;
                    slVar = slVar2;
                    jC7 = jC7;
                    aootVar = aootVar;
                    cydVar3 = cydVarI2;
                }
                acq acqVar3 = acqVar;
                int i22 = i6;
                int size = arrayList.size();
                czc[] czcVarArr = new czc[size];
                for (int i23 = 0; i23 < size; i23++) {
                    czcVarArr[i23] = (czc) acoVar2.a(i23);
                }
                int i24 = acmVar.b;
                int[] iArr2 = new int[i24];
                int[] iArr3 = new int[i24];
                defpackage.axr axrVar = new defpackage.axr(cyiVar);
                int[] iArr4 = acmVar.a;
                int iMax2 = i22;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                while (i26 < i24) {
                    int i28 = iArr4[i26];
                    int iA2 = acmVar2.a(i26);
                    acq acqVar4 = acqVar3;
                    if (!acqVar4.a(i26)) {
                        iA2 = dpd.a(jC5) == Integer.MAX_VALUE ? Integer.MAX_VALUE : dpd.a(jC5) - i27;
                    }
                    acqVar3 = acqVar4;
                    cyf cyfVarAS = den.aS(this, iMax2, dpd.c(jC5), dpd.b(jC5), iA2, i4, axrVar, arrayList, czcVarArr, i25, i28, iArr2, i26);
                    int iC = cyfVarAS.c();
                    int iB2 = cyfVarAS.b();
                    iArr3[i26] = iB2;
                    i27 += iB2;
                    iMax2 = java.lang.Math.max(iMax2, iC);
                    cfcVar.n(cyfVarAS);
                    i26++;
                    i25 = i28;
                    i24 = i24;
                    acmVar2 = acmVar2;
                    iArr4 = iArr4;
                }
                if (cfcVar.b == 0) {
                    iMax2 = 0;
                    i27 = 0;
                }
                awh awhVar = this.d;
                int iDp = cyiVar.dp(awhVar.a()) * (cfcVar.b - 1);
                int iC2 = dpd.c(jC4);
                int iA3 = dpd.a(jC4);
                int i29 = i27 + iDp;
                if (i29 >= iC2) {
                    iC2 = i29;
                }
                if (iC2 <= iA3) {
                    iA3 = iC2;
                }
                awhVar.c(cyiVar, iA3, iArr3, iArr2);
                int iD2 = dpd.d(jC4);
                int iB3 = dpd.b(jC4);
                defpackage.auj aujVar = new defpackage.auj(cfcVar, 3);
                if (iMax2 < iD2) {
                    iMax2 = iD2;
                }
                if (iMax2 <= iB3) {
                    iB3 = iMax2;
                }
                return cyiVar.du(iB3, iA3, aokd.a, aujVar);
            }
            int i30 = this.i.c;
        }
        return cyiVar.du(0, 0, aokd.a, new apk(14));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.axv) {
            defpackage.axv axvVar = (defpackage.axv) obj;
            boolean z = axvVar.b;
            if (aooh.n(this.c, axvVar.c) && aooh.n(this.d, axvVar.d) && java.lang.Float.compare(this.e, axvVar.e) == 0 && aooh.n(this.a, axvVar.a) && java.lang.Float.compare(this.f, axvVar.f) == 0) {
                int i = axvVar.g;
                int i2 = axvVar.h;
                if (aooh.n(this.i, axvVar.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final /* synthetic */ int f(czc czcVar) {
        return czcVar.w();
    }

    public final /* synthetic */ int g(czc czcVar) {
        return czcVar.x();
    }

    public final /* synthetic */ void h(int i, int[] iArr, int[] iArr2, cyi cyiVar) {
        this.c.b(cyiVar, i, iArr, cyiVar.p(), iArr2);
    }

    public final int hashCode() {
        return ((((((((((((((this.c.hashCode() + 38161) * 31) + this.d.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + this.a.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) * 31) + androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) * 31) + 1922;
    }

    public final /* synthetic */ long i(int i, int i2, int i3, boolean z) {
        return azh.b(z, i, i2, i3);
    }

    public final /* synthetic */ cyf j(final czc[] czcVarArr, cyi cyiVar, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final dpq dpqVar = dpq.a;
        return cyiVar.du(i, i2, aokd.a, new aonj() { // from class: axu
            public final java.lang.Object a(java.lang.Object obj) {
                defpackage.axe axeVar;
                int[] iArr3 = iArr2;
                czb czbVar = (czb) obj;
                int i6 = iArr3 != null ? iArr3[i3] : 0;
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    czc czcVar = czcVarArr[i8];
                    if (czcVar == null) {
                        aooh.g();
                    }
                    azg azgVarAU = den.aU(czcVar);
                    if (azgVarAU == null || (axeVar = azgVarAU.c) == null) {
                        axeVar = this.a;
                    }
                    czbVar.s(czcVar, iArr[i8 - i7], axeVar.a(i2, czcVar.w(), dpqVar) + i6, 0.0f);
                }
                return aojh.a;
            }
        });
    }

    public final java.lang.String toString() {
        float f = this.f;
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.c + ", verticalArrangement=" + this.d + ", mainAxisSpacing=" + dpi.b(this.e) + ", crossAxisAlignment=" + this.a + ", crossAxisArrangementSpacing=" + dpi.b(f) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.i + ')';
    }
}
