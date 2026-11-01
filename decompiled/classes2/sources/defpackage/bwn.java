package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bwn implements cye {
    public final awh a;
    public final cmi b;
    public final int c;
    private final defpackage.bym d;
    private final float e;
    private final ayy f;

    public bwn(defpackage.bym bymVar, awh awhVar, cmi cmiVar, int i, float f, ayy ayyVar) {
        this.d = bymVar;
        this.a = awhVar;
        this.b = cmiVar;
        this.c = i;
        this.e = f;
        this.f = ayyVar;
    }

    public final int a(cxf cxfVar, java.util.List list, int i) {
        java.lang.Integer numValueOf;
        int iDp = cxfVar.dp(this.e);
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((cxe) list.get(0)).c(i));
            int iAZ = ajsz.aZ(list);
            if (iAZ > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((cxe) list.get(i2)).c(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iAZ) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return java.lang.Math.max(iDp, numValueOf != null ? numValueOf.intValue() : 0);
    }

    public final int b(cxf cxfVar, java.util.List list, int i) {
        int size = list.size();
        int iD = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iD += ((cxe) list.get(i2)).d(i);
        }
        return iD;
    }

    public final int c(cxf cxfVar, java.util.List list, int i) {
        java.lang.Integer numValueOf;
        int iDp = cxfVar.dp(this.e);
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((cxe) list.get(0)).e(i));
            int iAZ = ajsz.aZ(list);
            if (iAZ > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((cxe) list.get(i2)).e(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iAZ) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return java.lang.Math.max(iDp, numValueOf != null ? numValueOf.intValue() : 0);
    }

    public final int d(cxf cxfVar, java.util.List list, int i) {
        int size = list.size();
        int iF = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iF += ((cxe) list.get(i2)).f(i);
        }
        return iF;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    public final cyf e(cyi cyiVar, java.util.List list, final long j) throws aoiq {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cyd cydVar = (cyd) list.get(i);
            if (aooh.n(cwh.j(cydVar), "navigationIcon")) {
                final czc czcVarV = cydVar.v(dpd.k(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    cyd cydVar2 = (cyd) list.get(i2);
                    if (aooh.n(cwh.j(cydVar2), "actionIcons")) {
                        final czc czcVarV2 = cydVar2.v(dpd.k(j, 0, 0, 0, 0, 14));
                        azc azcVar = this.f;
                        int iB = dpd.b(j) == Integer.MAX_VALUE ? dpd.b(j) : aooc.t((((dpd.b(j) - java.lang.Math.max(cyiVar.dp(defpackage.bmz.b), czcVarV.a)) - czcVarV2.a) - cyiVar.dp(den.aW(azcVar, cyiVar.p()))) - cyiVar.dp(den.aV(azcVar, cyiVar.p())), 0);
                        int size3 = list.size();
                        int i3 = 0;
                        while (i3 < size3) {
                            cyd cydVar3 = (cyd) list.get(i3);
                            if (aooh.n(cwh.j(cydVar3), "title")) {
                                final czc czcVarV3 = cydVar3.v(dpd.k(j, 0, iB, 0, 0, 12));
                                cxa cxaVar = cwn.b;
                                final int iDm = czcVarV3.dm(cxaVar) != Integer.MIN_VALUE ? czcVarV3.dm(cxaVar) : 0;
                                this.d.a();
                                int i4 = aopc.i(0.0f);
                                azc azcVar2 = azcVar;
                                float f = azcVar2.a;
                                int iDp = cyiVar.dp(f);
                                float f2 = azcVar2.b;
                                final int iMax = java.lang.Math.max(cyiVar.dp(this.e), czcVarV3.b) + iDp + cyiVar.dp(f2);
                                int iT = dpd.a(j) == Integer.MAX_VALUE ? iMax : aooc.t(i4 + iMax, 0);
                                int iDp2 = cyiVar.dp(f);
                                int iDp3 = cyiVar.dp(f2);
                                final int iDp4 = cyiVar.dp(den.aW(azcVar, cyiVar.p()));
                                final int iDp5 = cyiVar.dp(den.aV(azcVar, cyiVar.p()));
                                final int i5 = (iDp2 + iT) - iDp3;
                                return den.z(cyiVar, dpd.b(j), iT, new aonj() { // from class: bwm
                                    /* JADX WARN: Code duplicated, block: B:11:0x0057  */
                                    /* JADX WARN: Code duplicated, block: B:12:0x005e  */
                                    /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                                    /* JADX WARN: Code duplicated, block: B:16:0x006b  */
                                    /* JADX WARN: Code duplicated, block: B:17:0x0070  */
                                    /* JADX WARN: Code duplicated, block: B:19:0x007d  */
                                    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
                                    public final java.lang.Object a(java.lang.Object obj) {
                                        int iB2;
                                        awh awhVar;
                                        int iMax2;
                                        int i6;
                                        int i7;
                                        int i8;
                                        int i9;
                                        int i10 = i5;
                                        czb czbVar = (czb) obj;
                                        czc czcVar = czcVarV;
                                        int i11 = i10 - czcVar.b;
                                        int i12 = iDp4;
                                        czbVar.u(czcVar, i12, i11 / 2, 0.0f);
                                        int iMax3 = java.lang.Math.max(dfd.p(czbVar, defpackage.bmz.b), czcVar.a);
                                        defpackage.bwn bwnVar = this;
                                        cmi cmiVar = bwnVar.b;
                                        long j2 = j;
                                        czc czcVar2 = czcVarV3;
                                        czc czcVar3 = czcVarV2;
                                        int i13 = czcVar3.a;
                                        int iA = cmiVar.a(czcVar2.a, dpd.b(j2), dpq.a);
                                        if (iA >= iMax3) {
                                            int i14 = czcVar2.a + iA;
                                            if (i14 > dpd.b(j2) - i13) {
                                                iB2 = i12 + ((dpd.b(j2) - i13) - i14);
                                            }
                                            awhVar = bwnVar.a;
                                            if (aooh.n(awhVar, awi.e)) {
                                                iMax2 = (i10 - czcVar2.b) / 2;
                                            } else if (aooh.n(awhVar, awi.d)) {
                                                i6 = bwnVar.c;
                                                if (i6 == 0) {
                                                    iMax2 = i10 - czcVar2.b;
                                                } else {
                                                    i7 = iMax;
                                                    int i15 = iDm;
                                                    int i16 = czcVar2.b;
                                                    i8 = i6 - (i16 - i15);
                                                    i9 = i8 + i16;
                                                    if (i9 > i7) {
                                                        i8 -= i9 - i7;
                                                    }
                                                    iMax2 = (i10 - i16) - java.lang.Math.max(0, i8);
                                                }
                                            } else {
                                                iMax2 = 0;
                                            }
                                            int i17 = iDp5;
                                            czbVar.u(czcVar2, iA, iMax2, 0.0f);
                                            czbVar.u(czcVar3, (dpd.b(j2) - czcVar3.a) - i17, (i10 - czcVar3.b) / 2, 0.0f);
                                            return aojh.a;
                                        }
                                        iB2 = i12 + (iMax3 - iA);
                                        iA += iB2;
                                        awhVar = bwnVar.a;
                                        if (aooh.n(awhVar, awi.e)) {
                                            iMax2 = (i10 - czcVar2.b) / 2;
                                        } else if (aooh.n(awhVar, awi.d)) {
                                            i6 = bwnVar.c;
                                            if (i6 == 0) {
                                                iMax2 = i10 - czcVar2.b;
                                            } else {
                                                i7 = iMax;
                                                int i18 = iDm;
                                                int i19 = czcVar2.b;
                                                i8 = i6 - (i19 - i18);
                                                i9 = i8 + i19;
                                                if (i9 > i7) {
                                                    i8 -= i9 - i7;
                                                }
                                                iMax2 = (i10 - i19) - java.lang.Math.max(0, i8);
                                            }
                                        } else {
                                            iMax2 = 0;
                                        }
                                        int i110 = iDp5;
                                        czbVar.u(czcVar2, iA, iMax2, 0.0f);
                                        czbVar.u(czcVar3, (dpd.b(j2) - czcVar3.a) - i110, (i10 - czcVar3.b) / 2, 0.0f);
                                        return aojh.a;
                                    }
                                });
                            }
                            i3++;
                            this = this;
                        }
                        dpy.a("Collection contains no element matching the predicate.");
                        throw new aoiq();
                    }
                    i2++;
                    this = this;
                }
                dpy.a("Collection contains no element matching the predicate.");
                throw new aoiq();
            }
        }
        dpy.a("Collection contains no element matching the predicate.");
        throw new aoiq();
    }
}
