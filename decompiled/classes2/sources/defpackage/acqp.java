package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class acqp {
    public static final defpackage.acqp a = new defpackage.acqp();

    public final void a(final defpackage.bun bunVar, cmw cmwVar, final defpackage.btw btwVar, aonn aonnVar, float f, float f2, cav cavVar, final int i) {
        int i2;
        final cmw cmwVar2;
        final aonn aonnVar2;
        final float f3;
        final float f4;
        aonn aonnVar3;
        aooh.f(bunVar, "sliderState");
        cav cavVarB = cavVar.b(-376000574);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(bunVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.C(true) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.B(btwVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        int i4 = i3 | 1769472;
        if ((12582912 & i) == 0) {
            i4 |= true != cavVarB.B(this) ? 4194304 : 8388608;
        }
        if (cavVarB.H((4793491 & i4) != 4793490, i4 & 1)) {
            int i5 = (-57345) & i4;
            cbt cbtVar = (cbt) cavVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cavVarB.E()) {
                boolean z2 = (i4 & 896) == 256;
                int i6 = (i4 & 7168) ^ 3072;
                cmw cmwVar3 = cmw.c;
                if ((i6 <= 2048 || !cavVarB.B(btwVar)) && (i4 & 3072) != 2048) {
                    z = false;
                }
                boolean z3 = z2 | z;
                java.lang.Object objR = cbtVar.R();
                if (z3 || objR == cau.a) {
                    objR = new abkv(btwVar, 9);
                    cbtVar.ab(objR);
                }
                f3 = defpackage.acqr.b;
                f4 = defpackage.acqr.c;
                cmwVar = cmwVar3;
                aonnVar3 = (aonn) objR;
            } else {
                cavVarB.s();
                aonnVar3 = aonnVar;
                f3 = f;
                f4 = f2;
            }
            cavVarB.l();
            int i7 = i5 << 3;
            int i8 = (i4 & 14) | 100663296 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (3670016 & i7) | (i7 & 29360128);
            cmw cmwVar4 = cmwVar;
            defpackage.buc.a.b(bunVar, cmwVar4, btwVar, aonnVar3, null, f3, f4, cavVarB, i8);
            cmwVar2 = cmwVar4;
            aonnVar2 = aonnVar3;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
            aonnVar2 = aonnVar;
            f3 = f;
            f4 = f2;
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: acqo
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar2 = (cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.acqp acqpVar = this.a;
                    defpackage.bun bunVar2 = bunVar;
                    cmw cmwVar5 = cmwVar2;
                    int i9 = i | 1;
                    int i10 = 306783378 & i9;
                    int i11 = 613566756 & i9;
                    acqpVar.a(bunVar2, cmwVar5, btwVar, aonnVar2, f3, f4, cavVar2, (i9 & (-920350135)) | i10 | (i11 >> 1) | ((i10 << 1) & i11));
                    return aojh.a;
                }
            };
        }
    }

    public final void b(kaw kawVar, cmw cmwVar, defpackage.btw btwVar, long j, cav cavVar, int i) {
        int i2;
        defpackage.btw btwVar2;
        cmw cmwVar2;
        long j2;
        cmw cmwVar3;
        long j3;
        aooh.f(kawVar, "interactionSource");
        cav cavVarB = cavVar.b(1538905591);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(kawVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            btwVar2 = btwVar;
            i3 |= true != cavVarB.B(btwVar2) ? 128 : 256;
        } else {
            btwVar2 = btwVar;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.C(true) ? 1024 : 2048;
        }
        int i4 = i3 | 24576;
        if ((i & 196608) == 0) {
            i4 |= true != cavVarB.B(this) ? 65536 : 131072;
        }
        if (cavVarB.H((74899 & i4) != 74898, i4 & 1)) {
            ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cavVarB.E()) {
                cmwVar3 = cmw.c;
                j3 = defpackage.acqr.a;
            } else {
                cavVarB.s();
                cmwVar3 = cmwVar;
                j3 = j;
            }
            cavVarB.l();
            int i5 = i4 & 7168;
            defpackage.buc.a.d(kawVar, cmwVar3, btwVar2, j3, cavVarB, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | i5 | (i4 & 57344));
            cmwVar2 = cmwVar3;
            j2 = j3;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
            j2 = j;
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bty(this, kawVar, cmwVar2, btwVar, j2, i, 3);
        }
    }
}
