package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pef {
    public static final defpackage.pee a = new defpackage.pee();

    public static final void a(final int i, cav cavVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        cav cavVarB = cavVar.b(-550173980);
        if (i4 == 0) {
            i3 = (true != cavVarB.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        final int i5 = 0;
        if (cavVarB.H((i3 & 3) != 2, i3 & 1)) {
            awo.c(den.x(den.bp(azm.c(cmw.c, 1.0f), cfd.M(i)), "color_background_tag"), cavVarB, 0);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: pec
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    int i6 = i5;
                    if (i6 == 0) {
                        ((java.lang.Integer) obj2).intValue();
                        int i7 = i2;
                        int i8 = i7 | 1;
                        int i9 = 306783378 & i8;
                        int i10 = 613566756 & i8;
                        defpackage.pef.a(i, (cav) obj, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 << 1) & i10));
                        return aojh.a;
                    }
                    if (i6 != 1) {
                        ((java.lang.Integer) obj2).intValue();
                        int i11 = i2;
                        int i12 = i11 | 1;
                        int i13 = 306783378 & i12;
                        int i14 = 613566756 & i12;
                        snl.y(i, (cav) obj, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 << 1) & i14));
                        return aojh.a;
                    }
                    ((java.lang.Integer) obj2).intValue();
                    int i15 = i2;
                    int i16 = i15 | 1;
                    int i17 = 306783378 & i16;
                    int i18 = 613566756 & i16;
                    pez.m(i, (cav) obj, (i16 & (-920350135)) | i17 | (i18 >> 1) | ((i17 << 1) & i18));
                    return aojh.a;
                }
            };
        }
    }

    public static final void b(defpackage.peh pehVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1496265518);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(pehVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cbtVarB.H((i2 & 3) != 2, i2 & 1)) {
            aoot aootVar = new aoot();
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(!pehVar.e), cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            aootVar.a = objR;
            cbp.g(aojh.a, new ofa(pehVar, aootVar, (aoln) null, 17), cbtVarB);
            den.bz(((java.lang.Boolean) ((ccp) aootVar.a).a()).booleanValue(), (cmw) null, aga.n(den.bv(150, 0, (ajh) null, 6), 2).a(aga.j(den.bv(1000, 0, new abnj((byte[]) null).e, 2), pehVar.d * 1.25f, 0L, 4)), (agg) null, (java.lang.String) null, cfo.j(-201341526, new ped(pehVar, 0), cbtVarB), cbtVarB, 196608, 26);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kmg(pehVar, i, 13);
        }
    }

    public static final void c(cav cavVar, int i) {
        cbt cbtVarB = cavVar.b(-1136369471);
        if (cbtVarB.H(i != 0, i & 1)) {
            cmw cmwVarX = den.x(azm.c(cmw.c, 1.0f), "gradient_background_tag");
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                objR = new oou(6);
                cbtVar.ab(objR);
            }
            yt.a(cmwVarX, (aonj) objR, cbtVarB, 54);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.peb(i, 2);
        }
    }

    public static final void d(cav cavVar, int i) {
        cbt cbtVarB = cavVar.b(-459171141);
        if (cbtVarB.H(i != 0, i & 1)) {
            cmw cmwVarX = den.x(azm.c(cmw.c, 1.0f), "gradient_background_tag");
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                objR = new oou(5);
                cbtVar.ab(objR);
            }
            yt.a(cmwVarX, (aonj) objR, cbtVarB, 54);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.peb(i, 0);
        }
    }
}
