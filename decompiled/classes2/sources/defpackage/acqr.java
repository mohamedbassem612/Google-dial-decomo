package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class acqr {
    public static final long a = mni.bj(4.0f, 44.0f);
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        mni.bj(44.0f, 4.0f);
        b = 6.0f;
        c = 2.0f;
        d = 4.0f;
    }

    public static final void a(defpackage.bun bunVar, aonj aonjVar, cmw cmwVar, boolean z, defpackage.btw btwVar, kaw kawVar, aono aonoVar, aono aonoVar2, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        boolean z2;
        defpackage.btw btwVar2;
        kaw kawVar2;
        aono aonoVar3;
        aono aonoVar4;
        aooh.f(bunVar, "state");
        aooh.f(aonjVar, "onValueChange");
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-715123443);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(bunVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            cmwVar2 = cmwVar;
            i2 |= true != cbtVarB.B(cmwVar2) ? 128 : 256;
        } else {
            cmwVar2 = cmwVar;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= true != cbtVarB.C(z2) ? 1024 : 2048;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.D((java.lang.Object) null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            btwVar2 = btwVar;
            i2 |= true != cbtVarB.B(btwVar2) ? 65536 : 131072;
        } else {
            btwVar2 = btwVar;
        }
        if ((1572864 & i) == 0) {
            kawVar2 = kawVar;
            i2 |= true != cbtVarB.B(kawVar2) ? 524288 : 1048576;
        } else {
            kawVar2 = kawVar;
        }
        if ((12582912 & i) == 0) {
            aonoVar3 = aonoVar;
            i2 |= true != cbtVarB.D(aonoVar3) ? 4194304 : 8388608;
        } else {
            aonoVar3 = aonoVar;
        }
        if ((100663296 & i) == 0) {
            aonoVar4 = aonoVar2;
            i2 |= true != cbtVarB.D(aonoVar4) ? 33554432 : 67108864;
        } else {
            aonoVar4 = aonoVar2;
        }
        if (cbtVarB.H((38347923 & i2) != 38347922, i2 & 1)) {
            cbtVarB.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cbtVarB.E()) {
                cbtVarB.s();
            }
            cbtVarB.l();
            defpackage.bul.b(bunVar, aonjVar, cmwVar2, z2, btwVar2, kawVar2, aonoVar3, aonoVar4, cbtVarB, i2 & 268435454);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.lpi(bunVar, aonjVar, cmwVar, z, btwVar, kawVar, aonoVar, aonoVar2, i, 3);
        }
    }

    public static final void b(final float f, final aonj aonjVar, final cmw cmwVar, boolean z, final aopm aopmVar, final defpackage.btw btwVar, kaw kawVar, aono aonoVar, aono aonoVar2, cav cavVar, final int i, final int i2) {
        int i3;
        final boolean z2;
        final kaw kawVar2;
        final aono aonoVar3;
        final aono aonoVar4;
        aono aonoVarJ;
        boolean z3;
        aooh.f(aonjVar, "onValueChange");
        int i4 = i & 6;
        cbt cbtVarB = cavVar.b(1835771793);
        if (i4 == 0) {
            i3 = (true != cbtVarB.y(f) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cbtVarB.D(aonjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cbtVarB.B(cmwVar) ? 128 : 256;
        }
        int i5 = i3 | 3072;
        if ((i & 24576) == 0) {
            i5 |= true != cbtVarB.B(aopmVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i5 |= true != cbtVarB.z(0) ? 65536 : 131072;
        }
        int i6 = i5 | 1572864;
        if ((12582912 & i) == 0) {
            i6 |= true != cbtVarB.B(btwVar) ? 4194304 : 8388608;
        }
        int i7 = i2 | 6;
        int i8 = i6 | 905969664;
        if (cbtVarB.H(((306783379 & i8) == 306783378 && (i7 & 3) == 2) ? false : true, i8 & 1)) {
            cbt cbtVar = cbtVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cbtVarB.E()) {
                java.lang.Object objR = cbtVar.R();
                if (objR == cau.a) {
                    objR = new kaw((byte[]) null, (char[]) null, (byte[]) null);
                    cbtVar.ab(objR);
                }
                kaw kawVar3 = (kaw) objR;
                aono aonoVarJ2 = cfo.j(400169153, new defpackage.bli(kawVar3, btwVar, 17), cbtVarB);
                aonoVarJ = cfo.j(2126874540, new abkx(btwVar, 6), cbtVarB);
                kawVar2 = kawVar3;
                aonoVar3 = aonoVarJ2;
                z3 = true;
            } else {
                cbtVarB.s();
                z3 = z;
                kawVar2 = kawVar;
                aonoVarJ = aonoVar2;
                aonoVar3 = aonoVar;
            }
            cbtVarB.l();
            boolean z4 = ((i8 & 458752) == 131072) | ((((i8 & 57344) ^ 24576) > 16384 && cbtVarB.B(aopmVar)) || (i8 & 24576) == 16384);
            java.lang.Object objR2 = cbtVar.R();
            if (z4 || objR2 == cau.a) {
                objR2 = new defpackage.bun(f, aopmVar);
                cbtVar.ab(objR2);
            }
            defpackage.bun bunVar = (defpackage.bun) objR2;
            bunVar.k(f);
            int i9 = i8 >> 6;
            aonoVar4 = aonoVarJ;
            a(bunVar, aonjVar, cmwVar, z3, btwVar, kawVar2, aonoVar3, aonoVar4, cbtVarB, (i8 & 8176) | (i9 & 57344) | (i9 & 458752) | (3670016 & i9) | (i9 & 29360128) | ((i7 << 24) & 234881024));
            z2 = z3;
        } else {
            cbtVarB.s();
            z2 = z;
            kawVar2 = kawVar;
            aonoVar3 = aonoVar;
            aonoVar4 = aonoVar2;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: acqq
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    float f2 = f;
                    aonj aonjVar2 = aonjVar;
                    cmw cmwVar2 = cmwVar;
                    boolean z5 = z2;
                    aopm aopmVar2 = aopmVar;
                    int i10 = i;
                    defpackage.btw btwVar2 = btwVar;
                    int i11 = i2;
                    int i12 = i10 | 1;
                    int i13 = i11 & 306783378;
                    int i14 = 306783378 & i12;
                    int i15 = i14 << 1;
                    aono aonoVar5 = aonoVar3;
                    int i16 = i11 & 613566756;
                    int i17 = i12 & 613566756;
                    aono aonoVar6 = aonoVar4;
                    defpackage.acqr.b(f2, aonjVar2, cmwVar2, z5, aopmVar2, btwVar2, kawVar2, aonoVar5, aonoVar6, (cav) obj, (i12 & (-920350135)) | i14 | (i17 >> 1) | (i15 & i17), (i11 & (-920350135)) | i13 | (i16 >> 1) | ((i13 << 1) & i16));
                    return aojh.a;
                }
            };
        }
    }
}
