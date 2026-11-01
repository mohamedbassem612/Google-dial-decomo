package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class blw implements cdv {
    public final defpackage.blz a;
    public aonj b;
    public aonj c;
    public final defpackage.coz d;
    public cpm e;
    public cxi f;
    public final ccp g;
    public defpackage.blg h;
    public boolean i;
    public aoss j;
    public final aoir k;
    public boolean l;
    public defpackage.bkj m;
    public final acx n;
    public final vm o;
    public defpackage.wt p;
    public kaw q;
    private final ccp r;
    private final ccp s;
    private final ccp t;
    private final cer u;
    private final ccp v;
    private final ccp w;
    private final ccp x;
    private final ccp y;

    public blw(defpackage.blz blzVar) {
        this.a = blzVar;
        cdu cduVar = cdu.c;
        this.r = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        this.s = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, cduVar);
        this.b = new defpackage.bln(this, 7);
        this.o = new vm();
        this.d = new defpackage.coz();
        this.t = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cduVar);
        aomy aomyVar = new aomy() { // from class: blo
            public final java.lang.Object a() {
                cxi cxiVar;
                cpn cpnVar;
                float f;
                float f2;
                float f3;
                float f4;
                cxi cxiVarG;
                int[] iArr;
                int[] iArr2;
                int i;
                cpn cpnVarJ;
                defpackage.blw blwVar = this.a;
                blwVar.g.a();
                if (blwVar.c() != null && (cxiVar = blwVar.f) != null && cxiVar.u()) {
                    defpackage.blz blzVar2 = blwVar.a;
                    java.util.List listC = blzVar2.c(blwVar.k());
                    java.util.List arrayList = new java.util.ArrayList(listC.size());
                    int size = listC.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        defpackage.bke bkeVar = (defpackage.bke) listC.get(i3);
                        defpackage.bko bkoVar = (defpackage.bko) blzVar2.b().a(bkeVar.a);
                        aoiu aoiuVar = bkoVar != null ? new aoiu(bkeVar, bkoVar) : null;
                        if (aoiuVar != null) {
                            arrayList.add(aoiuVar);
                        }
                    }
                    int size2 = arrayList.size();
                    if (size2 != 0 && size2 != 1) {
                        arrayList = ajsz.bb(new java.lang.Object[]{ajsz.bE(arrayList), ajsz.bI(arrayList)});
                    }
                    if (!arrayList.isEmpty()) {
                        if (arrayList.isEmpty()) {
                            cpnVar = defpackage.blx.a;
                        } else {
                            cpn cpnVar2 = defpackage.blx.a;
                            float f5 = cpnVar2.b;
                            float f6 = cpnVar2.c;
                            float f7 = cpnVar2.d;
                            float f8 = cpnVar2.e;
                            int size3 = arrayList.size();
                            float fMax = f8;
                            int i4 = 0;
                            float fMin = f5;
                            float fMin2 = f6;
                            float fMax2 = f7;
                            while (i4 < size3) {
                                aoiu aoiuVar2 = (aoiu) arrayList.get(i4);
                                int i5 = i2;
                                defpackage.bke bkeVar2 = (defpackage.bke) aoiuVar2.a;
                                defpackage.bko bkoVar2 = (defpackage.bko) aoiuVar2.b;
                                int i6 = bkoVar2.a.a;
                                int i7 = bkoVar2.b.a;
                                if (i6 == i7 || (cxiVarG = bkeVar2.g()) == null) {
                                    f = f8;
                                    f2 = f5;
                                    f3 = f6;
                                    f4 = f7;
                                } else {
                                    f = f8;
                                    int iMin = java.lang.Math.min(i6, i7);
                                    int iMax = java.lang.Math.max(i6, i7) - 1;
                                    if (iMin == iMax) {
                                        iArr = new int[1];
                                        iArr[i5] = iMin;
                                    } else {
                                        int[] iArr3 = new int[2];
                                        iArr3[i5] = iMin;
                                        iArr3[1] = iMax;
                                        iArr = iArr3;
                                    }
                                    float fMin3 = f5;
                                    f2 = fMin3;
                                    float fMin4 = f6;
                                    f3 = fMin4;
                                    float fMax3 = f7;
                                    f4 = fMax3;
                                    int i8 = i5;
                                    float fMax4 = f;
                                    while (i8 < iArr.length) {
                                        int i9 = iArr[i8];
                                        int i10 = i8;
                                        java.lang.Object objA = bkeVar2.b.a();
                                        if (objA == null) {
                                            iArr2 = iArr;
                                        } else {
                                            dkw dkwVar = (dkw) objA;
                                            iArr2 = iArr;
                                            int iA = dkwVar.a.a.a();
                                            if (iA > 0) {
                                                i = i5;
                                                cpnVarJ = dkwVar.j(aooc.w(i9, i, iA - 1));
                                            }
                                            fMin3 = java.lang.Math.min(fMin3, cpnVarJ.b);
                                            fMin4 = java.lang.Math.min(fMin4, cpnVarJ.c);
                                            fMax3 = java.lang.Math.max(fMax3, cpnVarJ.d);
                                            fMax4 = java.lang.Math.max(fMax4, cpnVarJ.e);
                                            i8 = i10 + 1;
                                            i5 = i;
                                            iArr = iArr2;
                                            bkeVar2 = bkeVar2;
                                        }
                                        i = i5;
                                        cpnVarJ = cpn.a;
                                        fMin3 = java.lang.Math.min(fMin3, cpnVarJ.b);
                                        fMin4 = java.lang.Math.min(fMin4, cpnVarJ.c);
                                        fMax3 = java.lang.Math.max(fMax3, cpnVarJ.d);
                                        fMax4 = java.lang.Math.max(fMax4, cpnVarJ.e);
                                        i8 = i10 + 1;
                                        i5 = i;
                                        iArr = iArr2;
                                        bkeVar2 = bkeVar2;
                                    }
                                    long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fMin3);
                                    long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fMin4);
                                    long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fMax3);
                                    long jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(fMax4);
                                    long jI = cxiVar.i(cxiVarG, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L));
                                    long jI2 = cxiVar.i(cxiVarG, (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L));
                                    fMin = java.lang.Math.min(fMin, java.lang.Float.intBitsToFloat((int) (jI >> 32)));
                                    fMin2 = java.lang.Math.min(fMin2, java.lang.Float.intBitsToFloat((int) (jI & 4294967295L)));
                                    fMax2 = java.lang.Math.max(fMax2, java.lang.Float.intBitsToFloat((int) (jI2 >> 32)));
                                    fMax = java.lang.Math.max(fMax, java.lang.Float.intBitsToFloat((int) (jI2 & 4294967295L)));
                                }
                                i4++;
                                f8 = f;
                                arrayList = arrayList;
                                f5 = f2;
                                f6 = f3;
                                f7 = f4;
                                i2 = 0;
                            }
                            cpnVar = new cpn(fMin, fMin2, fMax2, fMax);
                        }
                        if (!aooh.n(cpnVar, defpackage.blx.a)) {
                            cpn cpnVarE = defpackage.blx.b(cxiVar).e(cpnVar);
                            if (cpnVarE.d - cpnVarE.b >= 0.0f && cpnVarE.e - cpnVarE.c >= 0.0f) {
                                cpn cpnVarG = cpnVarE.g(cxiVar.k(0L));
                                return cpn.j(cpnVarG, 0.0f, 0.0f, cpnVarG.e + 100.0f, 7);
                            }
                        }
                    }
                }
                return null;
            }
        };
        ajxw ajxwVar = ceo.a;
        this.u = new cbk(aomyVar, (cen) null);
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableState(aojh.a, cdu.b);
        this.v = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        this.w = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        this.x = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        this.y = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cduVar);
        int i = acy.a;
        this.n = new acx(6);
        int i2 = 4;
        this.k = aooc.ah(3, new defpackage.bll(this, i2));
        blzVar.e = new defpackage.bln(this, 8);
        blzVar.f = new defpackage.bbs(this, i2);
        blzVar.g = new aonr() { // from class: blm
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                cxi cxiVar = (cxi) obj2;
                boolean zBooleanValue2 = ((java.lang.Boolean) obj5).booleanValue();
                long j = ((cpm) obj3).a;
                defpackage.blw blwVar = this.a;
                long jA = blwVar.a(cxiVar, j);
                long jA2 = blwVar.a(cxiVar, ((cpm) obj4).a);
                blwVar.s(zBooleanValue);
                return java.lang.Boolean.valueOf(blwVar.D(jA, jA2, zBooleanValue2, (defpackage.bks) obj6));
            }
        };
        int i3 = 2;
        blzVar.h = new defpackage.bll(this, i3);
        blzVar.i = new defpackage.bln(this, 0);
        blzVar.j = new defpackage.bln(this, i3);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0044 A[LOOP:0: B:5:0x000d->B:16:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0047 A[EDGE_INSN: B:20:0x0047->B:17:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:16:0x0044], SYNTHETIC] */
    private final void F() {
        int i;
        acx acxVar = this.n;
        java.lang.Object[] objArr = acxVar.c;
        long[] jArr = acxVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            ((bek) objArr[(i2 << 3) + i4]).a();
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        acxVar.g();
    }

    public final boolean A() {
        return ((java.lang.Boolean) this.s.a()).booleanValue();
    }

    public final boolean B() {
        defpackage.bko bkoVarC = c();
        if (bkoVarC == null) {
            return false;
        }
        defpackage.bkn bknVar = bkoVarC.b;
        defpackage.bkn bknVar2 = bkoVarC.a;
        if (aooh.n(bknVar2, bknVar)) {
            return false;
        }
        if (bknVar2.b != bknVar.b) {
            defpackage.blz blzVar = this.a;
            java.util.List listC = blzVar.c(k());
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                defpackage.bko bkoVar = (defpackage.bko) blzVar.b().a(((defpackage.bke) listC.get(i)).a);
                if (bkoVar != null) {
                    defpackage.bkn bknVar3 = bkoVar.b;
                    if (bkoVar.a.a != bknVar3.a) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean C() {
        defpackage.bko bkoVarC = c();
        if (bkoVarC == null) {
            return true;
        }
        return aooh.n(bkoVarC.a, bkoVarC.b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    /* JADX WARN: Code duplicated, block: B:71:0x0189  */
    /* JADX WARN: Code duplicated, block: B:73:0x0193  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d7  */
    public final boolean D(long j, long j2, boolean z, defpackage.bks bksVar) throws aoiq {
        defpackage.blg bmcVar;
        cxi cxiVarG;
        int i;
        java.util.List list;
        defpackage.blh blhVar;
        java.lang.Object objA;
        defpackage.blh blhVar2;
        int i2;
        int i3;
        int iM;
        int i4;
        int i5;
        int i6;
        int i7;
        int iK;
        defpackage.bko bkoVar;
        int iL;
        int i8;
        defpackage.bkn bknVar;
        int iK2;
        int iK3;
        defpackage.bko bkoVar2;
        int iL2;
        defpackage.bkn bknVar2;
        p(z ? defpackage.bgp.b : defpackage.bgp.c);
        o(new cpm(j));
        cxi cxiVarK = k();
        defpackage.blz blzVar = this.a;
        java.util.List listC = blzVar.c(cxiVarK);
        int i9 = defpackage.acv.a;
        defpackage.acu acuVar = new defpackage.acu(6);
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            acuVar.c(((defpackage.bke) listC.get(i10)).a, i10);
        }
        long j3 = j2 & 9223372034707292159L;
        defpackage.blh blhVar3 = new defpackage.blh(j, j2, cxiVarK, z, j3 == 9205357640488583168L ? null : c(), j3 == 9205357640488583168L ? null : this.h, new defpackage.bdt(acuVar, 4), !A());
        int size2 = listC.size();
        int i11 = 0;
        while (i11 < size2) {
            defpackage.bke bkeVar = (defpackage.bke) listC.get(i11);
            int iAZ = ajsz.aZ(listC);
            cxi cxiVarG2 = bkeVar.g();
            if (cxiVarG2 == null || (objA = bkeVar.b.a()) == null) {
                i = size2;
                list = listC;
                blhVar = blhVar3;
            } else {
                cxi cxiVar = blhVar3.c;
                long j4 = blhVar3.a;
                long jI = cxiVar.i(cxiVarG2, 0L);
                long jAM = mni.aM(j4, jI);
                defpackage.blg blgVar = blhVar3.f;
                list = listC;
                defpackage.bkl bklVarI = blgVar != null ? blgVar.i(bkeVar.a) : null;
                int i12 = bklVarI != null ? blhVar3.d ? bklVarI.c : bklVarI.d : -1;
                long j5 = blhVar3.b;
                long jAM2 = (j5 & 9223372034707292159L) == 9205357640488583168L ? 9205357640488583168L : mni.aM(j5, jI);
                long j6 = bkeVar.a;
                dkw dkwVar = (dkw) objA;
                long j7 = dkwVar.c;
                cpn cpnVar = new cpn(0.0f, 0.0f, (int) (j7 >> 32), (int) (j7 & 4294967295L));
                int i13 = (int) (jAM >> 32);
                int i14 = java.lang.Float.intBitsToFloat(i13) < cpnVar.b ? 1 : java.lang.Float.intBitsToFloat(i13) > cpnVar.d ? 3 : 2;
                int i15 = (int) (jAM & 4294967295L);
                int i16 = java.lang.Float.intBitsToFloat(i15) < cpnVar.c ? 1 : java.lang.Float.intBitsToFloat(i15) > cpnVar.e ? 3 : 2;
                boolean z2 = blhVar3.d;
                if (z2) {
                    blhVar2 = blhVar3;
                    iM = defpackage.avo.m(blhVar2, i14, i16, j6, false);
                    i7 = iM;
                    i6 = i7;
                    i2 = i14;
                    i4 = i2;
                    i3 = i16;
                    i5 = i3;
                } else {
                    blhVar2 = blhVar3;
                    int iM2 = defpackage.avo.m(blhVar2, i14, i16, j6, true);
                    i2 = i14;
                    i3 = i16;
                    iM = iM2;
                    i4 = iM;
                    i5 = i4;
                    i6 = i3;
                    i7 = i2;
                }
                blhVar = blhVar2;
                i = size2;
                int iJ = defpackage.li.j(i2, i3);
                if (blhVar.h) {
                    int i17 = iM;
                    if ((iJ != 3 || i17 != 3 || i11 == iAZ) && (iJ != 1 || i17 != 1 || blhVar.i.isEmpty())) {
                        int iA = dkwVar.a.a.a();
                        if (z2) {
                            iK3 = defpackage.avo.k(jAM, dkwVar);
                            bkoVar2 = blhVar.e;
                            if (bkoVar2 != null || (bknVar2 = bkoVar2.b) == null) {
                                iL2 = iK3;
                            } else {
                                iL2 = defpackage.avo.l(bknVar2, blhVar.g, j6, iA);
                            }
                            iL = iK3;
                            i8 = iL2;
                        } else {
                            iK = defpackage.avo.k(jAM, dkwVar);
                            bkoVar = blhVar.e;
                            if (bkoVar != null || (bknVar = bkoVar.a) == null) {
                                iL = iK;
                                i8 = iL;
                            } else {
                                i8 = iK;
                                iL = defpackage.avo.l(bknVar, blhVar.g, j6, iA);
                            }
                        }
                        if (i12 != -1) {
                            iK2 = i12;
                        } else if ((jAM2 & 9223372034707292159L) == 9205357640488583168L) {
                            iK2 = -1;
                        } else {
                            iK2 = defpackage.avo.k(jAM2, dkwVar);
                        }
                        int i18 = blhVar.l + 2;
                        blhVar.l = i18;
                        defpackage.bkl bklVar = new defpackage.bkl(j6, i18, iL, i8, iK2, dkwVar);
                        blhVar.j = blhVar.a(blhVar.j, i4, i5);
                        blhVar.k = blhVar.a(blhVar.k, i7, i6);
                        defpackage.acu acuVar2 = blhVar.m;
                        java.util.List list2 = blhVar.i;
                        acuVar2.c(j6, list2.size());
                        list2.add(bklVar);
                    }
                } else {
                    int i19 = iM;
                    if (iJ == 2 || iJ != i19) {
                        int iA2 = dkwVar.a.a.a();
                        if (z2) {
                            iK3 = defpackage.avo.k(jAM, dkwVar);
                            bkoVar2 = blhVar.e;
                            if (bkoVar2 != null) {
                                iL2 = iK3;
                            } else {
                                iL2 = iK3;
                            }
                            iL = iK3;
                            i8 = iL2;
                        } else {
                            iK = defpackage.avo.k(jAM, dkwVar);
                            bkoVar = blhVar.e;
                            if (bkoVar != null) {
                                iL = iK;
                                i8 = iL;
                            } else {
                                iL = iK;
                                i8 = iL;
                            }
                        }
                        if (i12 != -1) {
                            iK2 = i12;
                        } else if ((jAM2 & 9223372034707292159L) == 9205357640488583168L) {
                            iK2 = -1;
                        } else {
                            iK2 = defpackage.avo.k(jAM2, dkwVar);
                        }
                        int i110 = blhVar.l + 2;
                        blhVar.l = i110;
                        defpackage.bkl bklVar2 = new defpackage.bkl(j6, i110, iL, i8, iK2, dkwVar);
                        blhVar.j = blhVar.a(blhVar.j, i4, i5);
                        blhVar.k = blhVar.a(blhVar.k, i7, i6);
                        defpackage.acu acuVar3 = blhVar.m;
                        java.util.List list3 = blhVar.i;
                        acuVar3.c(j6, list3.size());
                        list3.add(bklVar2);
                    }
                }
            }
            i11++;
            blhVar3 = blhVar;
            size2 = i;
            listC = list;
        }
        defpackage.blh blhVar4 = blhVar3;
        int i20 = blhVar4.l + 1;
        java.util.List list4 = blhVar4.i;
        int size3 = list4.size();
        if (size3 == 0) {
            bmcVar = null;
        } else if (size3 != 1) {
            defpackage.acu acuVar4 = blhVar4.m;
            int i21 = blhVar4.j;
            int i22 = i21 == -1 ? i20 : i21;
            int i23 = blhVar4.k;
            bmcVar = new defpackage.bkd(acuVar4, list4, i22, i23 != -1 ? i23 : i20, blhVar4.d, blhVar4.e);
        } else {
            defpackage.bkl bklVar3 = (defpackage.bkl) ajsz.bM(list4);
            int i24 = blhVar4.j;
            int i25 = i24 == -1 ? i20 : i24;
            int i26 = blhVar4.k;
            bmcVar = new defpackage.bmc(blhVar4.d, i25, i26 != -1 ? i26 : i20, blhVar4.e, bklVar3);
        }
        if (bmcVar == null) {
            return false;
        }
        boolean zM = bmcVar.m(this.h);
        if (zM) {
            defpackage.bko bkoVarA = bksVar.a(bmcVar);
            if (!aooh.n(bkoVarA, c())) {
                if (A()) {
                    java.util.List list5 = blzVar.c;
                    int size4 = list5.size();
                    for (int i27 = 0; i27 < size4; i27++) {
                        if (((defpackage.bke) list5.get(i27)).h().a() > 0) {
                            kaw kawVar = this.q;
                            if (kawVar == null) {
                                break;
                            }
                            kawVar.ar(9);
                            break;
                        }
                    }
                }
                blzVar.f(bmcVar.d(bkoVarA));
                this.b.a(bkoVarA);
                this.i = false;
            }
            this.h = bmcVar;
        }
        defpackage.blg blgVar2 = this.h;
        if (blgVar2 != null) {
            defpackage.bkl bklVarE = blgVar2.e();
            defpackage.bke bkeVar2 = (defpackage.bke) blzVar.k.a(bklVarE.a);
            if (bkeVar2 != null && (cxiVarG = bkeVar2.g()) != null) {
                defpackage.bfl bflVar = bkeVar2.d;
                cpm cpmVarD = d();
                if (cpmVarD != null) {
                    long jI2 = cxiVarG.i(k(), cpmVarD.a);
                    aoot aootVar = new aoot();
                    aootVar.a = cdh.x(jI2, 0L);
                    if (A()) {
                        int i28 = blgVar2.l() ? bklVarE.c : bklVarE.d;
                        djy djyVar = bklVarE.f.b;
                        djyVar.d(i28);
                        dka dkaVar = (dka) djyVar.h.get(i28 == djyVar.c().a() ? djyVar.h.size() - 1 : defpackage.xa.f(djyVar.h, i28));
                        cpn cpnVarG = dkaVar.g(dkaVar.g.g(dkaVar.e(i28)));
                        cpn cpnVar2 = (cpn) aootVar.a;
                        aootVar.a = new cpn(java.lang.Math.min(cpnVar2.b, cpnVarG.b), java.lang.Math.min(cpnVar2.c, cpnVarG.c), java.lang.Math.max(cpnVar2.d, cpnVarG.d), java.lang.Math.max(cpnVar2.e, cpnVarG.e));
                    }
                    cpn cpnVar3 = (cpn) aootVar.a;
                    long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(aooc.s(java.lang.Float.intBitsToFloat((int) (jI2 >> 32)), 0.0f, (int) (cxiVarG.h() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(aooc.s(java.lang.Float.intBitsToFloat((int) (jI2 & 4294967295L)), 0.0f, (int) (cxiVarG.h() & 4294967295L)))) & 4294967295L);
                    int i29 = (int) (jFloatToRawIntBits >> 32);
                    int i30 = (int) (jFloatToRawIntBits & 4294967295L);
                    aootVar.a = new cpn(java.lang.Math.min(cpnVar3.b, java.lang.Float.intBitsToFloat(i29)), java.lang.Math.min(cpnVar3.c, java.lang.Float.intBitsToFloat(i30)), java.lang.Math.max(cpnVar3.d, java.lang.Float.intBitsToFloat(i29)), java.lang.Math.max(cpnVar3.e, java.lang.Float.intBitsToFloat(i30)));
                    aoss aossVar = this.j;
                    if (aossVar != null) {
                        aoov.an(aossVar, (aolr) null, 4, new bnl(bflVar, aootVar, (aoln) null, 1), 1);
                    }
                }
            }
        }
        return zM;
    }

    public final defpackage.bke E(defpackage.bkn bknVar) {
        return (defpackage.bke) this.a.k.a(bknVar.b);
    }

    public final long a(cxi cxiVar, long j) {
        cxi cxiVar2 = this.f;
        if (cxiVar2 == null || !cxiVar2.u()) {
            return 9205357640488583168L;
        }
        return k().i(cxiVar, j);
    }

    public final defpackage.bgp b() {
        return (defpackage.bgp) this.x.a();
    }

    public final defpackage.bko c() {
        return (defpackage.bko) this.r.a();
    }

    public final cpm d() {
        return (cpm) this.y.a();
    }

    public final cpm e() {
        return (cpm) this.w.a();
    }

    public final cpm f() {
        return (cpm) this.v.a();
    }

    public final cpn g() {
        return (cpn) this.u.a();
    }

    public final void h() {
        F();
    }

    public final void i() {
        F();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    public final cxi k() throws aoiq {
        cxi cxiVar = this.f;
        if (cxiVar == null) {
            defpackage.avo.a("null coordinates");
            throw new aoiq();
        }
        if (!cxiVar.u()) {
            defpackage.avo.c("unattached coordinates");
        }
        return cxiVar;
    }

    public final aoiu l() {
        int iNextIndex;
        int iC;
        int iA;
        if (c() != null) {
            defpackage.blz blzVar = this.a;
            if (!blzVar.c.isEmpty()) {
                defpackage.djf djfVar = new defpackage.djf(16);
                java.util.List listC = blzVar.c(k());
                java.util.ListIterator listIterator = listC.listIterator(listC.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    defpackage.bko bkoVar = (defpackage.bko) blzVar.b().a(((defpackage.bke) listIterator.previous()).a);
                    if (bkoVar != null) {
                        defpackage.bkn bknVar = bkoVar.b;
                        if (bkoVar.a.a != bknVar.a) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                }
                if (iNextIndex != -1) {
                    int size = listC.size();
                    iC = -1;
                    iA = -1;
                    for (int i = 0; i < size; i++) {
                        defpackage.bke bkeVar = (defpackage.bke) listC.get(i);
                        defpackage.bko bkoVar2 = (defpackage.bko) blzVar.b().a(bkeVar.a);
                        if (bkoVar2 != null) {
                            dji djiVarH = bkeVar.h();
                            defpackage.bkn bknVar2 = bkoVar2.b;
                            long jE = dfd.e(bkoVar2.a.a, bknVar2.a);
                            if (iC == -1) {
                                iC = dky.c(jE);
                                djfVar.h(djiVarH, 0, dky.c(jE));
                            }
                            djfVar.h(djiVarH, dky.c(jE), dky.b(jE));
                            if (i < iNextIndex) {
                                djfVar.j('\n');
                            } else {
                                iA = djfVar.a();
                                djfVar.h(djiVarH, dky.b(jE), djiVarH.a());
                            }
                        }
                    }
                } else {
                    iC = -1;
                    iA = -1;
                }
                dji djiVarC = djfVar.c();
                if (iC != -1 && iA != -1) {
                    return new aoiu(djiVarC, new dky(dfd.e(iC, iA)));
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    public final void m() {
        dji djiVarC;
        aonj aonjVar;
        int iNextIndex;
        if (c() != null) {
            defpackage.blz blzVar = this.a;
            if (blzVar.b().c()) {
                djiVarC = null;
            } else {
                defpackage.djf djfVar = new defpackage.djf(16);
                java.util.List listC = blzVar.c(k());
                java.util.ListIterator listIterator = listC.listIterator(listC.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    defpackage.bko bkoVar = (defpackage.bko) blzVar.b().a(((defpackage.bke) listIterator.previous()).a);
                    if (bkoVar != null) {
                        if (bkoVar.a.a != bkoVar.b.a) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                }
                if (iNextIndex != -1) {
                    int size = listC.size();
                    for (int i = 0; i < size; i++) {
                        defpackage.bke bkeVar = (defpackage.bke) listC.get(i);
                        defpackage.bko bkoVar2 = (defpackage.bko) blzVar.b().a(bkeVar.a);
                        if (bkoVar2 != null) {
                            dji djiVarH = bkeVar.h();
                            long jE = dfd.e(bkoVar2.a.a, bkoVar2.b.a);
                            djfVar.h(djiVarH, dky.c(jE), dky.b(jE));
                            if (i < iNextIndex) {
                                djfVar.j('\n');
                            }
                        }
                    }
                }
                djiVarC = djfVar.c();
            }
        } else {
            djiVarC = null;
        }
        if (djiVarC != null) {
            dji djiVar = djiVarC.a() > 0 ? djiVarC : null;
            if (djiVar == null || (aonjVar = this.c) == null) {
                return;
            }
            aonjVar.a(djiVar);
        }
    }

    public final void n() {
        kaw kawVar;
        this.a.f(acy.a());
        u(false);
        this.h = null;
        if (c() != null) {
            this.b.a((java.lang.Object) null);
            if (!A() || (kawVar = this.q) == null) {
                return;
            }
            kawVar.ar(9);
        }
    }

    public final void o(cpm cpmVar) {
        this.y.b(cpmVar);
    }

    public final void p(defpackage.bgp bgpVar) {
        this.x.b(bgpVar);
    }

    public final void q(cpm cpmVar) {
        this.w.b(cpmVar);
    }

    public final void r(boolean z) {
        this.t.b(java.lang.Boolean.valueOf(z));
    }

    public final void s(boolean z) {
        ccp ccpVar = this.s;
        if (((java.lang.Boolean) ccpVar.a()).booleanValue() != z) {
            ccpVar.b(java.lang.Boolean.valueOf(z));
            x();
        }
    }

    public final void t(defpackage.bko bkoVar) {
        long j;
        char c;
        long j2;
        long j3;
        defpackage.bke bkeVar;
        java.lang.Object objA;
        long j4;
        char c2;
        long j5;
        ccp ccpVar = this.r;
        if (aooh.n(ccpVar.a(), bkoVar)) {
            return;
        }
        ccpVar.b(bkoVar);
        if (bkoVar != null) {
            w();
        }
        acx acxVar = this.n;
        long[] jArr = acxVar.a;
        int length = jArr.length - 2;
        long j6 = 255;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j8 = jArr[i];
                j3 = 128;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j8 & j6) < 128) {
                            j4 = j6;
                            int i4 = (i << 3) + i3;
                            c2 = c3;
                            j5 = j7;
                            long j9 = acxVar.b[i4];
                            bek bekVar = (bek) acxVar.c[i4];
                            if (!this.a.b().b(j9)) {
                                bekVar.a();
                                acxVar.f(i4);
                            }
                        } else {
                            j4 = j6;
                            c2 = c3;
                            j5 = j7;
                        }
                        j8 >>= 8;
                        i3++;
                        c3 = c2;
                        j6 = j4;
                        j7 = j5;
                    }
                    j = j6;
                    c = c3;
                    j2 = j7;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    j = j6;
                    c = c3;
                    j2 = j7;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
                j6 = j;
                j7 = j2;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        defpackage.blz blzVar = this.a;
        acx acxVarB = blzVar.b();
        long[] jArr2 = acxVarB.b;
        java.lang.Object[] objArr = acxVarB.c;
        long[] jArr3 = acxVarB.a;
        int length2 = jArr3.length - 2;
        if (length2 < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j10 = jArr3[i5];
            if ((((~j10) << c) & j10 & j2) != j2) {
                int i6 = 8 - ((~(i5 - length2)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((j10 & j) < j3) {
                        int i8 = (i5 << 3) + i7;
                        long j11 = jArr2[i8];
                        defpackage.bko bkoVar2 = (defpackage.bko) objArr[i8];
                        if (bkoVar2.a.a != bkoVar2.b.a && (bkeVar = (defpackage.bke) blzVar.k.a(j11)) != null && (objA = bkeVar.c.a()) != null && !acxVar.b(j11)) {
                            ((bek) objA).d();
                            acxVar.h(j11, objA);
                        }
                    }
                    j10 >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length2) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final void u(boolean z) {
        this.l = z;
        x();
    }

    public final void v(cpm cpmVar) {
        this.v.b(cpmVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    public final void w() {
        cpm cpmVar;
        defpackage.bkn bknVar;
        defpackage.bkn bknVar2;
        defpackage.bko bkoVarC = c();
        cxi cxiVar = this.f;
        cpm cpmVar2 = null;
        defpackage.bke bkeVarE = (bkoVarC == null || (bknVar2 = bkoVarC.a) == null) ? null : E(bknVar2);
        defpackage.bke bkeVarE2 = (bkoVarC == null || (bknVar = bkoVarC.b) == null) ? null : E(bknVar);
        cxi cxiVarG = bkeVarE != null ? bkeVarE.g() : null;
        cxi cxiVarG2 = bkeVarE2 != null ? bkeVarE2.g() : null;
        if (bkoVarC == null || cxiVar == null || !cxiVar.u() || (cxiVarG == null && cxiVarG2 == null)) {
            v(null);
            q(null);
            return;
        }
        cpn cpnVarB = defpackage.blx.b(cxiVar);
        if (cxiVarG != null) {
            long jE = bkeVarE.e(bkoVarC, true);
            if ((jE & 9223372034707292159L) != 9205357640488583168L) {
                cpmVar = new cpm(cxiVar.i(cxiVarG, jE));
                long j = cpmVar.a;
                if (b() != defpackage.bgp.b && !defpackage.blx.c(cpnVarB, j)) {
                    cpmVar = null;
                }
            } else {
                cpmVar = null;
            }
        } else {
            cpmVar = null;
        }
        v(cpmVar);
        if (cxiVarG2 != null) {
            long jE2 = bkeVarE2.e(bkoVarC, false);
            if ((9223372034707292159L & jE2) != 9205357640488583168L) {
                cpm cpmVar3 = new cpm(cxiVar.i(cxiVarG2, jE2));
                long j2 = cpmVar3.a;
                if (b() == defpackage.bgp.c || defpackage.blx.c(cpnVarB, j2)) {
                    cpmVar2 = cpmVar3;
                }
            }
        }
        q(cpmVar2);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [dan, java.lang.Object] */
    public final void x() {
        defpackage.bip bipVar;
        aoub aoubVar;
        defpackage.biw biwVar;
        if (y()) {
            if (!this.l || !A()) {
                java.lang.Object obj = this.o.b;
                if (obj == null || (aoubVar = (bipVar = (defpackage.bip) obj).d) == null) {
                    return;
                }
                aoubVar.s((java.util.concurrent.CancellationException) null);
                bipVar.d = null;
                return;
            }
            if (g() != null) {
                vm vmVar = this.o;
                if (vmVar.a == 1) {
                    defpackage.avo.d("ToolbarRequester is not initialized.");
                }
                ?? r6 = vmVar.b;
                if (r6 != 0) {
                    cmv cmvVar = (cmv) r6;
                    if (cmvVar.D) {
                        defpackage.bip bipVar2 = (defpackage.bip) r6;
                        aoub aoubVar2 = bipVar2.d;
                        if ((aoubVar2 == null || !aoubVar2.t()) && (biwVar = (defpackage.biw) cfo.G((dan) r6, defpackage.bix.b)) != null) {
                            bipVar2.d = aoov.an(cmvVar.M(), (aolr) null, 4, new defpackage.amg(bipVar2, biwVar, (aoln) null, 20), 1);
                        }
                    }
                }
            }
        }
    }

    public final boolean y() {
        return ((java.lang.Boolean) this.t.a()).booleanValue();
    }

    public final boolean z() {
        return b() != null;
    }

    public final void j() {
    }
}
