package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bhu {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.drs b = new defpackage.drs(true, true, 1002, 1536);

    public static final void a(defpackage.bhi bhiVar, defpackage.bhe bheVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(1904307118);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cbtVarB.B(bhiVar) : cbtVarB.D(bhiVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cbtVarB.B(bheVar) : cbtVarB.D(bheVar)) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            cbtVarB.u(-1009482584);
            android.content.Context context = (android.content.Context) cbtVarB.e(dep.b);
            cbt cbtVar = cbtVarB;
            cbtVar.W(false);
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && cbtVarB.D(bheVar));
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !cbtVarB.D(bhiVar))) {
                z = false;
            }
            boolean zD = z2 | z | cbtVarB.D(context);
            java.lang.Object objR = cbtVar.R();
            if (zD || objR == cau.a) {
                objR = new afx(bheVar, context, bhiVar, 5, (short[]) null);
                cbtVar.ab(objR);
            }
            defpackage.apa.c(null, null, (aonj) objR, cbtVarB, 0);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.amv(bhiVar, bheVar, i, 8, null);
        }
    }

    public static final void b(final int i, long j, cav cavVar, final int i2) {
        int i3;
        cqa cqaVar;
        final long j2 = j;
        int i4 = i2 & 6;
        cbt cbtVarB = cavVar.b(-1240244237);
        if (i4 == 0) {
            i3 = i2 | (true != cbtVarB.z(i) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cbtVarB.A(j2) ? 16 : 32;
        }
        if (cbtVarB.H((i3 & 19) != 18, i3 & 1)) {
            android.content.Context context = (android.content.Context) cbtVarB.e(dep.b);
            boolean zB = cbtVarB.B(context) | ((i3 & 14) == 4);
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == cau.a) {
                objR = java.lang.Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                cbtVar.ab(objR);
            }
            int iIntValue = ((java.lang.Number) objR).intValue();
            if (iIntValue == -1) {
                cdk cdkVarI = cbtVarB.I();
                if (cdkVarI != null) {
                    final int i5 = 1;
                    cdkVarI.c = new aonn() { // from class: bht
                        public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                            if (i5 != 0) {
                                ((java.lang.Integer) obj2).intValue();
                                int i6 = i2;
                                long j3 = j2;
                                int i7 = i6 | 1;
                                int i8 = 306783378 & i7;
                                int i9 = 613566756 & i7;
                                defpackage.bhu.b(i, j3, (cav) obj, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 << 1) & i9));
                                return aojh.a;
                            }
                            ((java.lang.Integer) obj2).intValue();
                            int i10 = i2;
                            long j4 = j2;
                            int i11 = i10 | 1;
                            int i12 = 306783378 & i11;
                            int i13 = 613566756 & i11;
                            defpackage.bhu.b(i, j4, (cav) obj, (i11 & (-920350135)) | i12 | (i13 >> 1) | ((i12 << 1) & i13));
                            return aojh.a;
                        }
                    };
                    return;
                }
                return;
            }
            css cssVarK = wv.k(iIntValue, cbtVarB, 0);
            int i6 = i3 & 112;
            java.lang.Object objR2 = cbtVar.R();
            if (i6 == 32 || objR2 == cau.a) {
                if (j2 == 16) {
                    cqaVar = null;
                    j2 = 16;
                } else {
                    cqaVar = new cqa(j2, 5);
                }
                objR2 = cqaVar;
                cbtVar.ab(objR2);
            }
            cmt cmtVar = cmw.c;
            long j3 = defpackage.aoy.a;
            awo.c(ru.j(azm.g(cmtVar, 24.0f), cssVarK, (cmj) null, cwx.b, 0.0f, (cqh) objR2, 22), cbtVarB, 0);
        } else {
            cbtVarB.s();
        }
        final long j4 = j2;
        cdk cdkVarI2 = cbtVarB.I();
        if (cdkVarI2 != null) {
            final int i7 = 0;
            cdkVarI2.c = new aonn() { // from class: bht
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    if (i7 != 0) {
                        ((java.lang.Integer) obj2).intValue();
                        int i8 = i2;
                        long j5 = j4;
                        int i9 = i8 | 1;
                        int i10 = 306783378 & i9;
                        int i11 = 613566756 & i9;
                        defpackage.bhu.b(i, j5, (cav) obj, (i9 & (-920350135)) | i10 | (i11 >> 1) | ((i10 << 1) & i11));
                        return aojh.a;
                    }
                    ((java.lang.Integer) obj2).intValue();
                    int i12 = i2;
                    long j6 = j4;
                    int i13 = i12 | 1;
                    int i14 = 306783378 & i13;
                    int i15 = 613566756 & i13;
                    defpackage.bhu.b(i, j6, (cav) obj, (i13 & (-920350135)) | i14 | (i15 >> 1) | ((i14 << 1) & i15));
                    return aojh.a;
                }
            };
        }
    }

    public static final void c(defpackage.bhi bhiVar, defpackage.biv bivVar, aomy aomyVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-2040393164);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cbtVarB.B(bhiVar) : cbtVarB.D(bhiVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cbtVarB.B(bivVar) : cbtVarB.D(bivVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aomyVar) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && cbtVarB.B(bivVar));
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (z2 || objR == cau.a) {
                objR = new defpackage.bhw(new defpackage.dqs(new defpackage.ny(bivVar, aomyVar, 13), 1));
                cbtVar.ab(objR);
            }
            defpackage.bhw bhwVar = (defpackage.bhw) objR;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !cbtVarB.D(bhiVar))) {
                z = false;
            }
            java.lang.Object objR2 = cbtVar.R();
            int i4 = 3;
            if (z || objR2 == cau.a) {
                objR2 = new defpackage.bhl(bhiVar, i4);
                cbtVar.ab(objR2);
            }
            defpackage.dra.b(bhwVar, (aomy) objR2, b, cfo.j(1315155414, new defpackage.awu(bivVar, bhiVar, i4, null), cbtVarB), cbtVarB, 3456, 0);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aoz(bhiVar, bivVar, aomyVar, i, 6);
        }
    }

    public static final void d(cmw cmwVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        aonn aonnVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1392105195);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cmwVar2 = cmwVar;
            aonnVar2 = aonnVar;
            defpackage.zb.g(cmwVar2, defpackage.bix.a, defpackage.bhs.a, aonnVar2, cavVarB, (i2 & 14) | 384 | ((i2 << 6) & 7168));
        } else {
            cmwVar2 = cmwVar;
            aonnVar2 = aonnVar;
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.amv(cmwVar2, aonnVar2, i, 9);
        }
    }
}
