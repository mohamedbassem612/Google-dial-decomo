package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bul {
    public static final czr a = new czr(defpackage.bue.a);

    public static final float a(float f, float f2, float f3) {
        float f4 = f2 - f;
        return aooc.s(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    public static final void b(defpackage.bun bunVar, aonj aonjVar, cmw cmwVar, boolean z, defpackage.btw btwVar, kaw kawVar, aono aonoVar, aono aonoVar2, cav cavVar, int i) {
        int i2;
        aonj aonjVar2;
        cmw cmwVar2;
        boolean z2;
        kaw kawVar2;
        aono aonoVar3;
        aono aonoVar4;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1733864311);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(bunVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            aonjVar2 = aonjVar;
            i2 |= true != cbtVarB.D(aonjVar2) ? 16 : 32;
        } else {
            aonjVar2 = aonjVar;
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
            i2 |= true != cbtVarB.B(btwVar) ? 65536 : 131072;
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
            bunVar.b = aso.b;
            int i4 = i2 >> 3;
            c(cmwVar2, bunVar, z2, aonjVar2, kawVar2, aonoVar3, aonoVar4, cbtVarB, ((i2 >> 6) & 14) | ((i2 << 3) & 112) | (i4 & 896) | ((i2 << 6) & 7168) | (i2 & 57344) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128));
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.lpi(bunVar, aonjVar, cmwVar, z, btwVar, kawVar, aonoVar, aonoVar2, i, 1);
        }
    }

    public static final void c(cmw cmwVar, defpackage.bun bunVar, boolean z, aonj aonjVar, kaw kawVar, aono aonoVar, aono aonoVar2, cav cavVar, int i) {
        int i2;
        aono aonoVar3;
        cer cerVar;
        int i3;
        cbt cbtVar;
        boolean z2;
        int i4;
        int i5;
        cvx cvxVar;
        cmn cmnVar;
        baf bafVarAQ;
        cmw cmwVarA;
        float f;
        float f2;
        kaw kawVar2 = kawVar;
        aono aonoVar4 = aonoVar;
        int i6 = i & 6;
        cbt cbtVarB = cavVar.b(1457062396);
        if (i6 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(bunVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.D(aonjVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.D((java.lang.Object) null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cbtVarB.B(kawVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cbtVarB.D(aonoVar4) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cbtVarB.D(aonoVar2) ? 4194304 : 8388608;
        }
        if (cbtVarB.H((4793491 & i2) != 4793490, i2 & 1)) {
            bunVar.c = cbtVarB.e(dfo.j) == dpq.b;
            int i7 = i2 >> 15;
            cbt cbtVar2 = cbtVarB;
            java.lang.Object objR = cbtVar2.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cdu.c);
                cbtVar2.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            cer cerVar2 = (ccp) objR;
            boolean z3 = (((i7 & 14) ^ 6) > 4 && cbtVarB.B(kawVar2)) || (i7 & 6) == 4;
            java.lang.Object objR2 = cbtVar2.R();
            if (z3 || objR2 == obj) {
                cerVar = cerVar2;
                i3 = i2;
                cbtVar = cbtVar2;
                defpackage.amg amgVar = new defpackage.amg(kawVar, (ccp) cerVar, (aoln) null, 14, (byte[]) null);
                kawVar2 = kawVar;
                cbtVar.ab(amgVar);
                objR2 = amgVar;
            } else {
                i3 = i2;
                cbtVar = cbtVar2;
                cerVar = cerVar2;
            }
            cbp.g(kawVar2, (aonn) objR2, cbtVarB);
            bunVar.d.b(java.lang.Boolean.valueOf(a.y(cerVar)));
            cer cerVar3 = cerVar;
            aso asoVar = bunVar.b;
            if (asoVar == aso.b && bunVar.c) {
                z2 = true;
            } else {
                aso asoVar2 = aso.a;
                z2 = false;
            }
            int i8 = i3 & 112;
            int i9 = i8 | 6;
            int i10 = i3 >> 9;
            int i11 = i3 << 3;
            cvx cvxVar2 = cmw.c;
            boolean z4 = z2;
            cbtVarB.u(761622313);
            if (z) {
                i4 = 57344;
                int i12 = i9 | (i10 & 896);
                cer cerVarG = cdh.g(aonjVar, cbtVarB);
                cer cerVarG2 = cdh.g((java.lang.Object) null, cbtVarB);
                int i13 = i12 | (i11 & 7168) | (i11 & 57344) | (458752 & i11);
                i5 = 32;
                boolean zB = ((((i13 & 896) ^ 384) > 256 && cbtVarB.B(kawVar2)) || (i13 & 384) == 256) | ((((i13 & 112) ^ 48) > 32 && cbtVarB.B(bunVar)) || (i13 & 48) == 32) | cbtVarB.B(cerVarG) | cbtVarB.B(cerVarG2);
                java.lang.Object objR3 = cbtVar.R();
                if (zB || objR3 == obj) {
                    objR3 = new defpackage.buk(kawVar2, bunVar, cerVarG, cerVarG2);
                    cbtVar.ab(objR3);
                }
                cvf cvfVar = cvy.a;
                cvxVar = new cvx(bunVar, kawVar2, (java.lang.Object[]) null, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR3);
                cbtVar.W(false);
            } else {
                i4 = 57344;
                cbtVar.W(false);
                cvxVar = cvxVar2;
                i5 = 32;
            }
            boolean z5 = i8 == i5;
            boolean z6 = (i3 & 7168) == 2048;
            java.lang.Object objR4 = cbtVar.R();
            if ((z5 | z6) || objR4 == obj) {
                objR4 = new bly(bunVar, aonjVar, 12);
                cbtVar.ab(objR4);
            }
            aono aonoVar5 = defpackage.arp.a;
            cer cerVarG3 = cdh.g((aonj) objR4, cbtVarB);
            java.lang.Object objR5 = cbtVar.R();
            if (objR5 == obj) {
                defpackage.aqk aqkVar = new defpackage.aqk(new agb(cerVarG3, 18));
                cbtVar.ab(aqkVar);
                objR5 = aqkVar;
            }
            defpackage.arr arrVar = (defpackage.arr) objR5;
            boolean zL = bunVar.l();
            java.lang.Object objR6 = cbtVar.R();
            if (i8 == i5 || objR6 == obj) {
                objR6 = new defpackage.bug(bunVar, (aoln) null, 0);
                cbtVar.ab(objR6);
            }
            boolean z7 = (i3 & i4) == 16384;
            aono aonoVar6 = (aono) objR6;
            java.lang.Object objR7 = cbtVar.R();
            if ((z5 || z7) || objR7 == obj) {
                cmnVar = null;
                objR7 = new defpackage.bug(bunVar, null, 2, null);
                cbtVar.ab(objR7);
            } else {
                cmnVar = null;
            }
            cmn cmnVar2 = cmnVar;
            cvx cvxVar3 = cvxVar;
            int i14 = i3;
            defpackage.arm armVar = new defpackage.arm(arrVar, asoVar, z, kawVar2, zL, aonoVar6, (aono) objR7, z4);
            aso asoVar3 = aso.a;
            boolean z8 = asoVar != asoVar3;
            if (asoVar == asoVar3) {
                cmwVarA = azm.o(new defpackage.cxk(defpackage.btx.a), cmnVar2, 3);
            } else {
                defpackage.cxk cxkVar = new defpackage.cxk(defpackage.btx.a);
                cmi cmiVar = cmh.k;
                if (aooh.n(cmiVar, cmiVar)) {
                    bafVarAQ = azm.a;
                } else {
                    bafVarAQ = aooh.n(cmiVar, cmh.j) ? azm.b : den.aQ(cmiVar);
                }
                cmwVarA = cxkVar.a(bafVarAQ);
            }
            cmw cmwVar2 = cmwVarA;
            java.lang.Object obj2 = ((kaw) cbtVarB.e(bsw.a)).a;
            cbtVarB.u(-1885985690);
            int i15 = 0;
            cbtVar.W(false);
            dpf dpfVar = (dpf) cbtVarB.e(dfo.e);
            cmw cmwVarA2 = bqd.a(cmwVar);
            if (asoVar == asoVar3) {
                f2 = 4.0f;
                f = 16.0f;
            } else {
                f = 4.0f;
                f2 = 16.0f;
            }
            cmw cmwVarA3 = un.i(defpackage.aaf.l(dig.b(azm.n(cmwVarA2, f, f2, 0.0f, 0.0f, 12), false, new defpackage.bud(z, bunVar, aonjVar, i15)).a(bunVar.b == asoVar3 ? defpackage.bxd.b : defpackage.bxd.a), z, kawVar2), new defpackage.buh(z, bunVar, z4, aonjVar, !z8)).a(cvxVar3).a(armVar);
            boolean zC = cbtVarB.C(false) | cbtVarB.B(cerVar3) | cbtVarB.z(asoVar.ordinal()) | z5 | cbtVarB.C(false);
            java.lang.Object objR8 = cbtVar.R();
            if (zC || objR8 == obj) {
                objR8 = new defpackage.dqy(asoVar, bunVar, 1);
                cbtVar.ab(objR8);
            }
            cye cyeVar = (cye) objR8;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarA3);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            aonn aonnVar = dam.e;
            cev.c(cbtVarB, cyeVar, aonnVar);
            aonn aonnVar2 = dam.d;
            cev.c(cbtVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar3 = dam.f;
            cev.c(cbtVarB, numValueOf, aonnVar3);
            aonj aonjVar2 = dam.g;
            cev.b(cbtVarB, aonjVar2);
            aonn aonnVar4 = dam.c;
            cev.c(cbtVarB, cmwVarM, aonnVar4);
            cmw cmwVarA4 = cmwVar2.a(cvxVar2);
            boolean zC2 = cbtVarB.C(false) | cbtVarB.B(cerVar3) | cbtVarB.B(dpfVar);
            java.lang.Object objR9 = cbtVar.R();
            if ((zC2 | z5) || objR9 == obj) {
                objR9 = new defpackage.bru(bunVar, 6);
                cbtVar.ab(objR9);
            }
            cmw cmwVarG = wi.g(cmwVarA4, (aonj) objR9);
            cmj cmjVar = cmh.a;
            cye cyeVarB = awo.b(cmjVar, false);
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cbtVarB, cmwVarG);
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarB, aonnVar);
            cev.c(cbtVarB, cjeVarAi2, aonnVar2);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            cev.b(cbtVarB, aonjVar2);
            cev.c(cbtVarB, cmwVarM2, aonnVar4);
            int i16 = (i14 >> 3) & 14;
            aonoVar4 = aonoVar;
            aonoVar4.a(bunVar, cbtVarB, java.lang.Integer.valueOf(i16 | (i7 & 112)));
            cbtVar.W(true);
            defpackage.cxk cxkVar2 = new defpackage.cxk(defpackage.btx.b);
            cye cyeVarB2 = awo.b(cmjVar, false);
            int iM3 = anty.M(cbtVar.x);
            cje cjeVarAi3 = cbtVar.ai();
            cmw cmwVarM3 = cfo.m(cbtVarB, cxkVar2);
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarB2, aonnVar);
            cev.c(cbtVarB, cjeVarAi3, aonnVar2);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM3), aonnVar3);
            cev.b(cbtVarB, aonjVar2);
            cev.c(cbtVarB, cmwVarM3, aonnVar4);
            aonoVar3 = aonoVar2;
            aonoVar3.a(bunVar, cbtVarB, java.lang.Integer.valueOf(i16 | ((i14 >> 18) & 112)));
            cbtVar.W(true);
            cbtVar.W(true);
        } else {
            aonoVar3 = aonoVar2;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bmp(cmwVar, bunVar, z, aonjVar, kawVar, aonoVar4, aonoVar3, i, 8);
        }
    }

    public static final void d(kaw kawVar, cmw cmwVar, defpackage.btw btwVar, long j, cav cavVar, int i) {
        int i2;
        java.util.Collection collection;
        long jBk;
        cbt cbtVarB = cavVar.b(-1844845435);
        if ((i & 6) == 0) {
            i2 = (true != cbtVarB.B(kawVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.B(btwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.C(true) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.A(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cbtVarB.C(false) ? 65536 : 131072;
        }
        if (cbtVarB.H((74899 & i2) != 74898, i2 & 1)) {
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = new androidx.compose.runtime.snapshots.SnapshotStateList();
                cbtVar.ab(objR);
            }
            int i3 = i2 & 14;
            java.util.Collection collection2 = (androidx.compose.runtime.snapshots.SnapshotStateList) objR;
            java.lang.Object objR2 = cbtVar.R();
            if (i3 == 4 || objR2 == obj) {
                collection = collection2;
                bnl bnlVar = new bnl(kawVar, collection, (aoln) null, 6, (short[]) null);
                cbtVar.ab(bnlVar);
                objR2 = bnlVar;
            } else {
                collection = collection2;
            }
            cbp.g(kawVar, (aonn) objR2, cbtVarB);
            if (collection.isEmpty()) {
                jBk = j;
            } else {
                jBk = mni.bk((dpk.b(j) / 2.0f) + 0.0f, java.lang.Float.intBitsToFloat((int) (4294967295L & j)) + 0.0f);
            }
            cmw cmwVarP = uu.p(azm.h(cmwVar, j).a(new defpackage.ann(kawVar)), cvj.c);
            cye cyeVarB = awo.b(cmh.e, false);
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarP);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarB, dam.e);
            cev.c(cbtVarB, cjeVarAi, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM, dam.c);
            den.aR(den.bn(azm.h(cmw.c, jBk), btwVar.a, btj.b(6, cbtVarB)), cbtVarB);
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bpy(kawVar, cmwVar, btwVar, j, i, 4);
        }
    }
}
