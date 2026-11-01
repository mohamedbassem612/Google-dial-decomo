package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bvr {
    public static final defpackage.aks a = new defpackage.aks(null);

    public static final void a(boolean z, cmw cmwVar, boolean z2, defpackage.bvp bvpVar, cav cavVar, int i) {
        int i2;
        boolean z3;
        boolean z4;
        long j;
        boolean z5;
        long j2;
        long j3;
        long j4;
        boolean z6;
        boolean z7;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-263339167);
        if (i3 == 0) {
            i2 = (true != cbtVarB.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D((java.lang.Object) null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.D((java.lang.Object) null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.C(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cbtVarB.B(bvpVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cbtVarB.B((java.lang.Object) null) ? 524288 : 1048576;
        }
        if (cbtVarB.H((599187 & i2) != 599186, i2 & 1)) {
            cbtVarB.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cbtVarB.E()) {
                cbtVarB.s();
            }
            cbtVarB.l();
            crd crdVarB = btj.b(6, cbtVarB);
            crd crdVarB2 = btj.b(6, cbtVarB);
            if (z2) {
                if (z) {
                    j = bvpVar.a;
                    z5 = true;
                } else {
                    j = bvpVar.e;
                    z5 = false;
                }
            } else if (z) {
                j = bvpVar.i;
                z5 = true;
            } else {
                j = bvpVar.m;
                z5 = false;
            }
            if (z2) {
                j2 = z5 ? bvpVar.d : bvpVar.h;
            } else {
                j2 = z5 ? bvpVar.l : bvpVar.p;
            }
            if (z2) {
                j3 = z5 ? bvpVar.b : bvpVar.f;
            } else {
                j3 = z5 ? bvpVar.j : bvpVar.n;
            }
            if (z2) {
                if (z5) {
                    j4 = bvpVar.c;
                    z6 = true;
                } else {
                    j4 = bvpVar.g;
                    z6 = false;
                }
                z7 = true;
            } else if (z5) {
                j4 = bvpVar.k;
                z7 = false;
                z6 = true;
            } else {
                j4 = bvpVar.o;
                z6 = false;
                z7 = false;
            }
            long j5 = j2;
            long j6 = j4;
            b(cmwVar, z5, z2, crdVarB, crdVarB2, j, j5, j3, j6, cbtVarB, ((i2 >> 6) & 14) | (i2 & 112) | ((i2 << 6) & 896) | ((i2 >> 3) & 7168) | ((i2 << 3) & 57344), (i2 >> 15) & 112);
            z4 = z6;
            z3 = z7;
        } else {
            cbtVarB.s();
            z3 = z2;
            z4 = z;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.lpm(z4, cmwVar, z3, bvpVar, i, 1);
        }
    }

    public static final void b(final cmw cmwVar, final boolean z, final boolean z2, final crd crdVar, final crd crdVar2, final long j, final long j2, final long j3, final long j4, cav cavVar, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        cbt cbtVarB = cavVar.b(366684679);
        if (i6 == 0) {
            i3 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cbtVarB.D((java.lang.Object) null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cbtVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cbtVarB.C(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cbtVarB.D((java.lang.Object) null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cbtVarB.B(crdVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != cbtVarB.B(crdVar2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != cbtVarB.A(j) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i4 = i3 | (true != cbtVarB.A(j2) ? 33554432 : 67108864);
        } else {
            i4 = i3;
        }
        if ((i & 805306368) == 0) {
            i4 |= true != cbtVarB.A(j3) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (true != cbtVarB.A(j4) ? 2 : 4);
        } else {
            i5 = i2;
        }
        int i7 = i4;
        if ((i2 & 48) == 0) {
            i5 |= true == cbtVarB.B((java.lang.Object) null) ? 32 : 16;
        }
        if (cbtVarB.H(((i7 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true, i7 & 1)) {
            cbtVarB.u(1801881012);
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                objR = new kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar.ab(objR);
            }
            kaw kawVar = (kaw) objR;
            cbtVar.W(false);
            cmt cmtVar = cmw.c;
            java.lang.Object obj = ((kaw) cbtVarB.e(bsw.a)).a;
            cmj cmjVar = cmh.e;
            cmw cmwVarA = den.bn(den.bm(azm.q(cmjVar).a(new azl(52.0f, 32.0f, 52.0f, 32.0f, false)), 2.0f, j4, crdVar2), j3, crdVar2).a(cmtVar);
            cye cyeVarB = awo.b(cmh.a, false);
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarA);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            aonn aonnVar = dam.e;
            cev.c(cbtVarB, cyeVarB, aonnVar);
            aonn aonnVar2 = dam.d;
            cev.c(cbtVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar3 = dam.f;
            cev.c(cbtVarB, numValueOf, aonnVar3);
            aonj aonjVar = dam.g;
            cev.b(cbtVarB, aonjVar);
            aonn aonnVar4 = dam.c;
            cev.c(cbtVarB, cmwVarM, aonnVar4);
            cmw cmwVarBn = den.bn(anu.a(awt.a.a(cmtVar, cmh.d).a(new defpackage.bvu(kawVar, z, den.ai(1, cbtVarB))), kawVar, bsw.a(false, 20.0f, (crd) null, true, 220)), j, crdVar);
            cye cyeVarB2 = awo.b(cmjVar, false);
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cbtVarB, cmwVarBn);
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarB2, aonnVar);
            cev.c(cbtVarB, cjeVarAi2, aonnVar2);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            cev.b(cbtVarB, aonjVar);
            cev.c(cbtVarB, cmwVarM2, aonnVar4);
            cbtVarB.u(317283439);
            cbtVar.W(false);
            cbtVar.W(true);
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: bvq
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).intValue();
                    cmw cmwVar2 = cmwVar;
                    boolean z3 = z;
                    boolean z4 = z2;
                    crd crdVar3 = crdVar;
                    crd crdVar4 = crdVar2;
                    int i8 = i;
                    long j5 = j;
                    int i9 = i2;
                    int i10 = i8 | 1;
                    int i11 = i9 & 306783378;
                    int i12 = 306783378 & i10;
                    int i13 = i12 << 1;
                    long j6 = j3;
                    int i14 = i9 & 613566756;
                    int i15 = i10 & 613566756;
                    long j7 = j4;
                    defpackage.bvr.b(cmwVar2, z3, z4, crdVar3, crdVar4, j5, j2, j6, j7, (cav) obj2, (i10 & (-920350135)) | i12 | (i15 >> 1) | (i13 & i15), (i9 & (-920350135)) | i11 | (i14 >> 1) | ((i11 << 1) & i14));
                    return aojh.a;
                }
            };
        }
    }
}
