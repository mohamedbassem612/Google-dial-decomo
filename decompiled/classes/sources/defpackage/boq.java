package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class boq {
    public static final defpackage.boc a;

    static {
        float f = defpackage.bvj.a;
        float f2 = defpackage.bvj.a;
        a = new defpackage.boc(f2, f2);
    }

    public static /* synthetic */ defpackage.aojh a(long j, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        if (cavVar.H((i & 3) != 2, i & 1)) {
            defpackage.den.ab(defpackage.boy.a.b(new defpackage.cqg(j)), aonnVar, cavVar, 8);
        } else {
            cavVar.s();
        }
        return defpackage.aojh.a;
    }

    public static final void b(defpackage.aomy aomyVar, defpackage.aonn aonnVar, defpackage.cmw cmwVar, boolean z, defpackage.aonn aonnVar2, defpackage.crd crdVar, bod bodVar, bof bofVar, defpackage.amu amuVar, defpackage.awa awaVar, defpackage.ayy ayyVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.aonn aonnVar3;
        defpackage.cmw cmwVar2;
        bof bofVar2;
        defpackage.amu amuVar2;
        defpackage.awa awaVar2;
        int i4;
        int i5 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-696418916);
        if (i5 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            aonnVar3 = aonnVar;
            i3 |= true != cavVarB.D(aonnVar3) ? 16 : 32;
        } else {
            aonnVar3 = aonnVar;
        }
        if ((i & 384) == 0) {
            cmwVar2 = cmwVar;
            i3 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
        } else {
            cmwVar2 = cmwVar;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.C(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.D(aonnVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.D(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != cavVarB.B(crdVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != cavVarB.B(bodVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            bofVar2 = bofVar;
            i3 |= true != cavVarB.B(bofVar2) ? 33554432 : 67108864;
        } else {
            bofVar2 = bofVar;
        }
        if ((805306368 & i) == 0) {
            amuVar2 = amuVar;
            i3 |= true != cavVarB.B(amuVar2) ? 268435456 : 536870912;
        } else {
            amuVar2 = amuVar;
        }
        if ((i2 & 6) == 0) {
            awaVar2 = awaVar;
            i4 = i2 | (true != cavVarB.B(awaVar2) ? 2 : 4);
        } else {
            awaVar2 = awaVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.B(ayyVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != cavVarB.B(null) ? 128 : 256;
        }
        if (cavVarB.H(((306783379 & i3) == 306783378 && (i4 & 147) == 146) ? false : true, i3 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            defpackage.dkz dkzVarB = defpackage.bwp.b(9, cavVarB);
            long jA = bodVar.a(z);
            int i6 = bna.a;
            int i7 = i3 >> 6;
            int i8 = i3 << 3;
            int i9 = i3 >> 3;
            int i10 = i3 << 6;
            int i11 = i3 >> 24;
            int i12 = i4 << 9;
            int i13 = (i7 & 14) | (i8 & 112) | (i9 & 896) | (i10 & 7168) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10);
            defpackage.cmw cmwVar3 = cmwVar2;
            h(cmwVar3, aomyVar, z, aonnVar3, dkzVarB, jA, aonnVar2, crdVar, bodVar, bofVar2, amuVar2, awaVar2, ayyVar, cavVarB, i13 | (i10 & 1879048192), (i11 & 14) | 384 | (i11 & 112) | (i12 & 7168) | (57344 & i12) | (i12 & 458752));
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bby(aomyVar, aonnVar, cmwVar, z, aonnVar2, crdVar, bodVar, bofVar, amuVar, awaVar, ayyVar, i, i2, 2);
        }
    }

    public static final void c(boolean z, defpackage.aomy aomyVar, defpackage.aonn aonnVar, defpackage.cmw cmwVar, boolean z2, defpackage.aonn aonnVar2, defpackage.aonn aonnVar3, defpackage.crd crdVar, defpackage.bte bteVar, defpackage.btg btgVar, defpackage.amu amuVar, defpackage.awa awaVar, defpackage.ayy ayyVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.aomy aomyVar2;
        defpackage.aonn aonnVar4;
        defpackage.cmw cmwVar2;
        defpackage.aonn aonnVar5;
        defpackage.crd crdVar2;
        defpackage.bte bteVar2;
        defpackage.btg btgVar2;
        defpackage.amu amuVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        defpackage.cav cavVar2;
        int i8 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1511159815);
        if (i8 == 0) {
            i3 = (true != cavVarB.C(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            aomyVar2 = aomyVar;
            i3 |= true != cavVarB.D(aomyVar2) ? 16 : 32;
        } else {
            aomyVar2 = aomyVar;
        }
        if ((i & 384) == 0) {
            aonnVar4 = aonnVar;
            i3 |= true != cavVarB.D(aonnVar4) ? 128 : 256;
        } else {
            aonnVar4 = aonnVar;
        }
        if ((i & 3072) == 0) {
            cmwVar2 = cmwVar;
            i3 |= true != cavVarB.B(cmwVar2) ? 1024 : 2048;
        } else {
            cmwVar2 = cmwVar;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.C(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.D(aonnVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            aonnVar5 = aonnVar3;
            i3 |= true != cavVarB.D(aonnVar5) ? 524288 : 1048576;
        } else {
            aonnVar5 = aonnVar3;
        }
        if ((i & 12582912) == 0) {
            crdVar2 = crdVar;
            i3 |= true != cavVarB.B(crdVar2) ? 4194304 : 8388608;
        } else {
            crdVar2 = crdVar;
        }
        if ((100663296 & i) == 0) {
            bteVar2 = bteVar;
            i3 |= true != cavVarB.B(bteVar2) ? 33554432 : 67108864;
        } else {
            bteVar2 = bteVar;
        }
        if ((805306368 & i) == 0) {
            btgVar2 = btgVar;
            i3 |= true != cavVarB.B(btgVar2) ? 268435456 : 536870912;
        } else {
            btgVar2 = btgVar;
        }
        if ((i2 & 6) == 0) {
            amuVar2 = amuVar;
            i4 = i2 | (true != cavVarB.B(amuVar2) ? 2 : 4);
        } else {
            amuVar2 = amuVar;
            i4 = i2;
        }
        int i9 = i4;
        if ((i2 & 48) == 0) {
            i5 = i9 | (true != cavVarB.B(awaVar) ? 16 : 32);
        } else {
            i5 = i9;
        }
        if ((i2 & 384) == 0) {
            i6 = i5 | (true != cavVarB.B(ayyVar) ? 128 : 256);
        } else {
            i6 = i5;
        }
        int i10 = i6;
        if ((i2 & 3072) == 0) {
            i7 = i10 | (true != cavVarB.B(null) ? 1024 : 2048);
        } else {
            i7 = i10;
        }
        if (cavVarB.H(((i3 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true, i3 & 1)) {
            int i11 = i7;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            int i12 = defpackage.bwp.a;
            defpackage.dkz dkzVarA = defpackage.bwp.a(((defpackage.bqv) cavVarB.e(defpackage.bqx.a)).b, 9);
            int i13 = defpackage.bpm.a;
            int i14 = (i3 & 14) | 12582912;
            int i15 = i3 >> 6;
            int i16 = i3 << 3;
            int i17 = i3 >> 3;
            int i18 = i3 << 6;
            int i19 = i3 >> 24;
            int i20 = i11 << 6;
            int i21 = i11 << 9;
            cavVar2 = cavVarB;
            int i22 = i14 | (i15 & 112) | (i16 & 896) | (i17 & 7168) | (i18 & 57344) | (i16 & 3670016) | (i18 & 234881024);
            defpackage.cmw cmwVar3 = cmwVar2;
            j(z, cmwVar3, aomyVar2, z2, aonnVar4, dkzVarA, aonnVar2, aonnVar5, crdVar2, bteVar2, btgVar2, amuVar2, awaVar, ayyVar, cavVar2, i22 | (i18 & 1879048192), (i19 & 14) | 3072 | (i19 & 112) | (i20 & 896) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016));
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bol(z, aomyVar, aonnVar, cmwVar, z2, aonnVar2, aonnVar3, crdVar, bteVar, btgVar, amuVar, awaVar, ayyVar, i, i2);
        }
    }

    public static final void d(defpackage.aomy aomyVar, defpackage.aonn aonnVar, defpackage.cmw cmwVar, boolean z, defpackage.aonn aonnVar2, defpackage.crd crdVar, bod bodVar, bof bofVar, defpackage.amu amuVar, defpackage.awa awaVar, defpackage.ayy ayyVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.aonn aonnVar3;
        defpackage.cmw cmwVar2;
        defpackage.aonn aonnVar4;
        defpackage.crd crdVar2;
        defpackage.amu amuVar2;
        defpackage.awa awaVar2;
        defpackage.ayy ayyVar2;
        int i4;
        int i5 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1651051734);
        if (i5 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            aonnVar3 = aonnVar;
            i3 |= true != cavVarB.D(aonnVar3) ? 16 : 32;
        } else {
            aonnVar3 = aonnVar;
        }
        if ((i & 384) == 0) {
            cmwVar2 = cmwVar;
            i3 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
        } else {
            cmwVar2 = cmwVar;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.C(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            aonnVar4 = aonnVar2;
            i3 |= true != cavVarB.D(aonnVar4) ? 8192 : 16384;
        } else {
            aonnVar4 = aonnVar2;
        }
        if ((196608 & i) == 0) {
            crdVar2 = crdVar;
            i3 |= true != cavVarB.B(crdVar2) ? 65536 : 131072;
        } else {
            crdVar2 = crdVar;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != cavVarB.B(bodVar) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i3 |= true != cavVarB.B(bofVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            amuVar2 = amuVar;
            i3 |= true != cavVarB.B(amuVar2) ? 33554432 : 67108864;
        } else {
            amuVar2 = amuVar;
        }
        if ((805306368 & i) == 0) {
            awaVar2 = awaVar;
            i3 |= true != cavVarB.B(awaVar2) ? 268435456 : 536870912;
        } else {
            awaVar2 = awaVar;
        }
        if ((i2 & 6) == 0) {
            ayyVar2 = ayyVar;
            i4 = i2 | (true != cavVarB.B(ayyVar2) ? 2 : 4);
        } else {
            ayyVar2 = ayyVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.B(null) ? 16 : 32;
        }
        if (cavVarB.H(((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true, i3 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            defpackage.dkz dkzVarB = defpackage.bwp.b(9, cavVarB);
            int i6 = i3;
            long jA = bodVar.a(z);
            float f = defpackage.bvj.a;
            int i7 = ((i6 >> 6) & 14) | 12582912;
            int i8 = i6 << 3;
            int i9 = i6 >> 3;
            int i10 = i6 << 6;
            int i11 = i6 << 9;
            int i12 = i6 >> 21;
            int i13 = i4 << 12;
            int i14 = i7 | (i8 & 112) | (i9 & 896) | (i10 & 7168) | (i10 & 3670016) | (i11 & 234881024);
            defpackage.aonn aonnVar5 = aonnVar3;
            defpackage.crd crdVar3 = crdVar2;
            defpackage.awa awaVar3 = awaVar2;
            defpackage.aonn aonnVar6 = aonnVar4;
            defpackage.cmw cmwVar3 = cmwVar2;
            defpackage.amu amuVar3 = amuVar2;
            h(cmwVar3, aomyVar, z, aonnVar5, dkzVarB, jA, aonnVar6, crdVar3, bodVar, bofVar, amuVar3, awaVar3, ayyVar2, cavVarB, i14 | (i11 & 1879048192), (i12 & 14) | 384 | (i12 & 112) | ((i6 >> 18) & 7168) | (i13 & 57344) | (i13 & 458752));
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bby(aomyVar, aonnVar, cmwVar, z, aonnVar2, crdVar, bodVar, bofVar, amuVar, awaVar, ayyVar, i, i2, 3);
        }
    }

    public static final defpackage.aonn e(defpackage.aonn aonnVar, long j, defpackage.cav cavVar) {
        if (aonnVar == null) {
            cavVar.u(1575598419);
            cavVar.o();
            return null;
        }
        cavVar.u(1575370973);
        defpackage.cja cjaVarJ = defpackage.cfo.j(-237350650, new bok(j, aonnVar, 0), cavVar);
        cavVar.o();
        return cjaVarJ;
    }

    public static final defpackage.cer f(java.lang.Object obj, defpackage.cav cavVar) {
        java.lang.Object objG = cavVar.g();
        if (objG == defpackage.cau.a) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, defpackage.cdu.c);
            cavVar.w(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        defpackage.ccp ccpVar = (defpackage.ccp) objG;
        if (obj != null) {
            ccpVar.b(obj);
        }
        return ccpVar;
    }

    public static final void g(final defpackage.aonn aonnVar, defpackage.dkz dkzVar, long j, defpackage.aonn aonnVar2, final defpackage.aonn aonnVar3, final long j2, final long j3, final defpackage.awa awaVar, final defpackage.ayy ayyVar, final defpackage.ajl ajlVar, final defpackage.ajl ajlVar2, final defpackage.ajl ajlVar3, final defpackage.ajl ajlVar4, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.aonn aonnVar4;
        int i4;
        defpackage.cav cavVar2;
        int i5 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1255048750);
        if (i5 == 0) {
            i3 = (true != cavVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(dkzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.A(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            aonnVar4 = aonnVar2;
            i3 |= true != cavVarB.D(aonnVar4) ? 1024 : 2048;
        } else {
            aonnVar4 = aonnVar2;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.D(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.D(aonnVar3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != cavVarB.A(j2) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i3 |= true != cavVarB.A(j3) ? 4194304 : 8388608;
        }
        if ((i & 100663296) == 0) {
            i3 |= true != cavVarB.y(32.0f) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            i3 |= true != cavVarB.B(awaVar) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = (true != cavVarB.B(ayyVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true == ((i2 & 64) == 0 ? cavVarB.B(ajlVar) : cavVarB.D(ajlVar)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= true == ((i2 & 512) == 0 ? cavVarB.B(ajlVar2) : cavVarB.D(ajlVar2)) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true == ((i2 & 4096) == 0 ? cavVarB.B(ajlVar3) : cavVarB.D(ajlVar3)) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true == ((32768 & i2) == 0 ? cavVarB.B(ajlVar4) : cavVarB.D(ajlVar4)) ? 16384 : 8192;
        }
        if (cavVarB.H(((306783379 & i3) == 306783378 && (i4 & 9363) == 9362) ? false : true, i3 & 1)) {
            cavVar2 = cavVarB;
            final defpackage.aonn aonnVar5 = aonnVar4;
            defpackage.den.ac(new defpackage.cdj[]{defpackage.boy.a.b(new defpackage.cqg(j)), defpackage.bvt.a.b(dkzVar)}, defpackage.cfo.j(-881676654, new defpackage.aonn() { // from class: bog
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.cav cavVar3 = (defpackage.cav) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    int i6 = iIntValue & 3;
                    int i7 = iIntValue & 1;
                    defpackage.boc bocVar = defpackage.boq.a;
                    if (cavVar3.H(i6 != 2, i7)) {
                        defpackage.awa awaVar2 = awaVar;
                        defpackage.ayy ayyVar2 = ayyVar;
                        defpackage.cmt cmtVar = defpackage.cmw.c;
                        defpackage.cmw cmwVarA = defpackage.azm.m(defpackage.azm.l(cmtVar, Float.NaN, 1000.0f), 0.0f, 32.0f, 1).a(new defpackage.azb(ayyVar2));
                        defpackage.cmn cmnVar = defpackage.cmh.n;
                        defpackage.cye cyeVarA = defpackage.azh.a(awaVar2, cmnVar, cavVar3, 48);
                        long jA = cavVar3.a();
                        long j4 = jA ^ (jA >>> 32);
                        defpackage.cje cjeVarM = cavVar3.M();
                        defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar3, cmwVarA);
                        defpackage.aomy aomyVar = defpackage.dam.a;
                        cavVar3.L();
                        cavVar3.v();
                        if (cavVar3.F()) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.aonn aonnVar6 = defpackage.dam.e;
                        defpackage.cev.c(cavVar3, cyeVarA, aonnVar6);
                        defpackage.aonn aonnVar7 = defpackage.dam.d;
                        defpackage.cev.c(cavVar3, cjeVarM, aonnVar7);
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf((int) j4);
                        defpackage.aonn aonnVar8 = defpackage.dam.f;
                        defpackage.cev.c(cavVar3, numValueOf, aonnVar8);
                        defpackage.aonj aonjVar = defpackage.dam.g;
                        defpackage.aojh aojhVar = defpackage.aojh.a;
                        cavVar3.i(aojhVar, new defpackage.bae(aonjVar, 7));
                        defpackage.aonn aonnVar9 = defpackage.dam.c;
                        defpackage.cev.c(cavVar3, cmwVarM, aonnVar9);
                        defpackage.azk azkVar = defpackage.azk.a;
                        defpackage.cmj cmjVar = defpackage.cmh.a;
                        defpackage.cye cyeVarB = defpackage.awo.b(cmjVar, false);
                        long jA2 = cavVar3.a();
                        long j5 = jA2 ^ (jA2 >>> 32);
                        defpackage.cje cjeVarM2 = cavVar3.M();
                        defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVar3, cmtVar);
                        cavVar3.L();
                        cavVar3.v();
                        if (cavVar3.F()) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        final defpackage.aonn aonnVar10 = aonnVar5;
                        defpackage.cev.c(cavVar3, cyeVarB, aonnVar6);
                        defpackage.cev.c(cavVar3, cjeVarM2, aonnVar7);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j5), aonnVar8);
                        cavVar3.i(aojhVar, new defpackage.bae(aonjVar, 7));
                        defpackage.cev.c(cavVar3, cmwVarM2, aonnVar9);
                        boolean z = aonnVar10 != null;
                        final long j6 = j2;
                        defpackage.ajl ajlVar5 = ajlVar2;
                        defpackage.ajl ajlVar6 = ajlVar4;
                        defpackage.ajl ajlVar7 = ajlVar;
                        defpackage.ajl ajlVar8 = ajlVar3;
                        defpackage.cmi cmiVar = defpackage.cmh.j;
                        final int i8 = 1;
                        defpackage.den.bD(azkVar, z, null, defpackage.aga.a(ajlVar8, defpackage.aga.t(cmiVar), true, new defpackage.afz(new defpackage.afv(6), 1)).a(defpackage.aga.n(ajlVar7, 2)), defpackage.aga.e(ajlVar6, defpackage.aga.t(cmiVar), true, new defpackage.afz(new defpackage.afv(7), 0)).a(defpackage.aga.o(ajlVar5, 2)), null, defpackage.cfo.j(-181659180, new defpackage.aono() { // from class: bom
                            @Override // defpackage.aono
                            public final java.lang.Object a(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                                defpackage.cja cjaVarJ;
                                if (i8 != 0) {
                                    defpackage.cav cavVar4 = (defpackage.cav) obj4;
                                    int iIntValue2 = ((java.lang.Integer) obj5).intValue();
                                    int i9 = iIntValue2 & 17;
                                    int i10 = iIntValue2 & 1;
                                    defpackage.boc bocVar2 = defpackage.boq.a;
                                    if (cavVar4.H(i9 != 16, i10)) {
                                        defpackage.cer cerVarF = defpackage.boq.f(defpackage.boq.e(aonnVar10, j6, cavVar4), cavVar4);
                                        defpackage.cmj cmjVar2 = defpackage.cmh.e;
                                        defpackage.cmt cmtVar2 = defpackage.cmw.c;
                                        defpackage.cye cyeVarB2 = defpackage.awo.b(cmjVar2, false);
                                        int iM = defpackage.anty.M(cavVar4.a());
                                        defpackage.cje cjeVarM3 = cavVar4.M();
                                        defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVar4, cmtVar2);
                                        defpackage.aomy aomyVar2 = defpackage.dam.a;
                                        cavVar4.L();
                                        cavVar4.v();
                                        if (cavVar4.F()) {
                                            cavVar4.j(aomyVar2);
                                        } else {
                                            cavVar4.x();
                                        }
                                        defpackage.cev.c(cavVar4, cyeVarB2, defpackage.dam.e);
                                        defpackage.cev.c(cavVar4, cjeVarM3, defpackage.dam.d);
                                        defpackage.cev.c(cavVar4, java.lang.Integer.valueOf(iM), defpackage.dam.f);
                                        defpackage.cev.b(cavVar4, defpackage.dam.g);
                                        defpackage.cev.c(cavVar4, cmwVarM3, defpackage.dam.c);
                                        defpackage.aonn aonnVar11 = (defpackage.aonn) cerVarF.a();
                                        if (aonnVar11 == null) {
                                            cavVar4.u(2094511935);
                                        } else {
                                            cavVar4.u(1037396226);
                                            aonnVar11.a(cavVar4, 0);
                                        }
                                        cavVar4.o();
                                        cavVar4.n();
                                    } else {
                                        cavVar4.s();
                                    }
                                    return defpackage.aojh.a;
                                }
                                defpackage.cav cavVar5 = (defpackage.cav) obj4;
                                int iIntValue3 = ((java.lang.Integer) obj5).intValue();
                                int i11 = iIntValue3 & 17;
                                int i12 = iIntValue3 & 1;
                                defpackage.boc bocVar3 = defpackage.boq.a;
                                if (cavVar5.H(i11 != 16, i12)) {
                                    defpackage.aonn aonnVar12 = aonnVar10;
                                    if (aonnVar12 != null) {
                                        long j7 = j6;
                                        cavVar5.u(-1219075416);
                                        cjaVarJ = defpackage.cfo.j(-566924201, new bok(j7, aonnVar12, 1), cavVar5);
                                        cavVar5.o();
                                    } else {
                                        cavVar5.u(-1218883371);
                                        cavVar5.o();
                                        cjaVarJ = null;
                                    }
                                    defpackage.cer cerVarF2 = defpackage.boq.f(cjaVarJ, cavVar5);
                                    defpackage.cmj cmjVar3 = defpackage.cmh.e;
                                    defpackage.cmt cmtVar3 = defpackage.cmw.c;
                                    defpackage.cye cyeVarB3 = defpackage.awo.b(cmjVar3, false);
                                    int iM2 = defpackage.anty.M(cavVar5.a());
                                    defpackage.cje cjeVarM4 = cavVar5.M();
                                    defpackage.cmw cmwVarM4 = defpackage.cfo.m(cavVar5, cmtVar3);
                                    defpackage.aomy aomyVar3 = defpackage.dam.a;
                                    cavVar5.L();
                                    cavVar5.v();
                                    if (cavVar5.F()) {
                                        cavVar5.j(aomyVar3);
                                    } else {
                                        cavVar5.x();
                                    }
                                    defpackage.cev.c(cavVar5, cyeVarB3, defpackage.dam.e);
                                    defpackage.cev.c(cavVar5, cjeVarM4, defpackage.dam.d);
                                    defpackage.cev.c(cavVar5, java.lang.Integer.valueOf(iM2), defpackage.dam.f);
                                    defpackage.cev.b(cavVar5, defpackage.dam.g);
                                    defpackage.cev.c(cavVar5, cmwVarM4, defpackage.dam.c);
                                    defpackage.aonn aonnVar13 = (defpackage.aonn) cerVarF2.a();
                                    if (aonnVar13 == null) {
                                        cavVar5.u(-657207800);
                                    } else {
                                        cavVar5.u(671536409);
                                        aonnVar13.a(cavVar5, 0);
                                    }
                                    cavVar5.o();
                                    cavVar5.n();
                                } else {
                                    cavVar5.s();
                                }
                                return defpackage.aojh.a;
                            }
                        }, cavVar3), cavVar3, 1572870);
                        if (aonnVar10 == null) {
                            cavVar3.u(-37113233);
                            defpackage.den.aR(defpackage.azm.k(cmtVar, 0.0f), cavVar3);
                            cavVar3.o();
                        } else {
                            cavVar3.u(-37029626);
                            cavVar3.o();
                        }
                        cavVar3.n();
                        defpackage.cmw cmwVarA2 = azkVar.a(cmtVar, 1.0f, false);
                        defpackage.cye cyeVarA2 = defpackage.azh.a(defpackage.awi.a, cmnVar, cavVar3, 54);
                        long jA3 = cavVar3.a();
                        long j7 = jA3 ^ (jA3 >>> 32);
                        defpackage.cje cjeVarM3 = cavVar3.M();
                        defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVar3, cmwVarA2);
                        cavVar3.L();
                        cavVar3.v();
                        if (cavVar3.F()) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.aonn aonnVar11 = aonnVar;
                        defpackage.cev.c(cavVar3, cyeVarA2, aonnVar6);
                        defpackage.cev.c(cavVar3, cjeVarM3, aonnVar7);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j7), aonnVar8);
                        cavVar3.i(aojhVar, new defpackage.bae(aonjVar, 7));
                        defpackage.cev.c(cavVar3, cmwVarM3, aonnVar9);
                        aonnVar11.a(cavVar3, 0);
                        cavVar3.n();
                        defpackage.cye cyeVarB2 = defpackage.awo.b(cmjVar, false);
                        long jA4 = cavVar3.a();
                        long j8 = jA4 ^ (jA4 >>> 32);
                        defpackage.cje cjeVarM4 = cavVar3.M();
                        defpackage.cmw cmwVarM4 = defpackage.cfo.m(cavVar3, cmtVar);
                        cavVar3.L();
                        cavVar3.v();
                        if (cavVar3.F()) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        final long j9 = j3;
                        final defpackage.aonn aonnVar12 = aonnVar3;
                        defpackage.cev.c(cavVar3, cyeVarB2, aonnVar6);
                        defpackage.cev.c(cavVar3, cjeVarM4, aonnVar7);
                        defpackage.cev.c(cavVar3, java.lang.Integer.valueOf((int) j8), aonnVar8);
                        cavVar3.i(aojhVar, new defpackage.bae(aonjVar, 7));
                        defpackage.cev.c(cavVar3, cmwVarM4, aonnVar9);
                        boolean z2 = aonnVar12 != null;
                        defpackage.cmi cmiVar2 = defpackage.cmh.l;
                        final int i9 = 0;
                        defpackage.den.bD(azkVar, z2, null, defpackage.aga.a(ajlVar8, defpackage.aga.t(cmiVar2), true, new defpackage.afz(new defpackage.afv(6), 1)).a(defpackage.aga.n(ajlVar7, 2)), defpackage.aga.e(ajlVar6, defpackage.aga.t(cmiVar2), true, new defpackage.afz(new defpackage.afv(7), 0)).a(defpackage.aga.o(ajlVar5, 2)), null, defpackage.cfo.j(-1090690805, new defpackage.aono() { // from class: bom
                            @Override // defpackage.aono
                            public final java.lang.Object a(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                                defpackage.cja cjaVarJ;
                                if (i9 != 0) {
                                    defpackage.cav cavVar4 = (defpackage.cav) obj4;
                                    int iIntValue2 = ((java.lang.Integer) obj5).intValue();
                                    int i10 = iIntValue2 & 17;
                                    int i11 = iIntValue2 & 1;
                                    defpackage.boc bocVar2 = defpackage.boq.a;
                                    if (cavVar4.H(i10 != 16, i11)) {
                                        defpackage.cer cerVarF = defpackage.boq.f(defpackage.boq.e(aonnVar12, j9, cavVar4), cavVar4);
                                        defpackage.cmj cmjVar2 = defpackage.cmh.e;
                                        defpackage.cmt cmtVar2 = defpackage.cmw.c;
                                        defpackage.cye cyeVarB3 = defpackage.awo.b(cmjVar2, false);
                                        int iM = defpackage.anty.M(cavVar4.a());
                                        defpackage.cje cjeVarM5 = cavVar4.M();
                                        defpackage.cmw cmwVarM5 = defpackage.cfo.m(cavVar4, cmtVar2);
                                        defpackage.aomy aomyVar2 = defpackage.dam.a;
                                        cavVar4.L();
                                        cavVar4.v();
                                        if (cavVar4.F()) {
                                            cavVar4.j(aomyVar2);
                                        } else {
                                            cavVar4.x();
                                        }
                                        defpackage.cev.c(cavVar4, cyeVarB3, defpackage.dam.e);
                                        defpackage.cev.c(cavVar4, cjeVarM5, defpackage.dam.d);
                                        defpackage.cev.c(cavVar4, java.lang.Integer.valueOf(iM), defpackage.dam.f);
                                        defpackage.cev.b(cavVar4, defpackage.dam.g);
                                        defpackage.cev.c(cavVar4, cmwVarM5, defpackage.dam.c);
                                        defpackage.aonn aonnVar13 = (defpackage.aonn) cerVarF.a();
                                        if (aonnVar13 == null) {
                                            cavVar4.u(2094511935);
                                        } else {
                                            cavVar4.u(1037396226);
                                            aonnVar13.a(cavVar4, 0);
                                        }
                                        cavVar4.o();
                                        cavVar4.n();
                                    } else {
                                        cavVar4.s();
                                    }
                                    return defpackage.aojh.a;
                                }
                                defpackage.cav cavVar5 = (defpackage.cav) obj4;
                                int iIntValue3 = ((java.lang.Integer) obj5).intValue();
                                int i12 = iIntValue3 & 17;
                                int i13 = iIntValue3 & 1;
                                defpackage.boc bocVar3 = defpackage.boq.a;
                                if (cavVar5.H(i12 != 16, i13)) {
                                    defpackage.aonn aonnVar14 = aonnVar12;
                                    if (aonnVar14 != null) {
                                        long j10 = j9;
                                        cavVar5.u(-1219075416);
                                        cjaVarJ = defpackage.cfo.j(-566924201, new bok(j10, aonnVar14, 1), cavVar5);
                                        cavVar5.o();
                                    } else {
                                        cavVar5.u(-1218883371);
                                        cavVar5.o();
                                        cjaVarJ = null;
                                    }
                                    defpackage.cer cerVarF2 = defpackage.boq.f(cjaVarJ, cavVar5);
                                    defpackage.cmj cmjVar3 = defpackage.cmh.e;
                                    defpackage.cmt cmtVar3 = defpackage.cmw.c;
                                    defpackage.cye cyeVarB4 = defpackage.awo.b(cmjVar3, false);
                                    int iM2 = defpackage.anty.M(cavVar5.a());
                                    defpackage.cje cjeVarM6 = cavVar5.M();
                                    defpackage.cmw cmwVarM6 = defpackage.cfo.m(cavVar5, cmtVar3);
                                    defpackage.aomy aomyVar3 = defpackage.dam.a;
                                    cavVar5.L();
                                    cavVar5.v();
                                    if (cavVar5.F()) {
                                        cavVar5.j(aomyVar3);
                                    } else {
                                        cavVar5.x();
                                    }
                                    defpackage.cev.c(cavVar5, cyeVarB4, defpackage.dam.e);
                                    defpackage.cev.c(cavVar5, cjeVarM6, defpackage.dam.d);
                                    defpackage.cev.c(cavVar5, java.lang.Integer.valueOf(iM2), defpackage.dam.f);
                                    defpackage.cev.b(cavVar5, defpackage.dam.g);
                                    defpackage.cev.c(cavVar5, cmwVarM6, defpackage.dam.c);
                                    defpackage.aonn aonnVar15 = (defpackage.aonn) cerVarF2.a();
                                    if (aonnVar15 == null) {
                                        cavVar5.u(-657207800);
                                    } else {
                                        cavVar5.u(671536409);
                                        aonnVar15.a(cavVar5, 0);
                                    }
                                    cavVar5.o();
                                    cavVar5.n();
                                } else {
                                    cavVar5.s();
                                }
                                return defpackage.aojh.a;
                            }
                        }, cavVar3), cavVar3, 1572870);
                        if (aonnVar12 == null) {
                            cavVar3.u(-1514776840);
                            defpackage.den.aR(defpackage.azm.k(cmtVar, 0.0f), cavVar3);
                            cavVar3.o();
                        } else {
                            cavVar3.u(-1514693233);
                            cavVar3.o();
                        }
                        cavVar3.n();
                        cavVar3.n();
                    } else {
                        cavVar3.s();
                    }
                    return defpackage.aojh.a;
                }
            }, cavVar2), cavVar2, 48);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new boh(aonnVar, dkzVar, j, aonnVar2, aonnVar3, j2, j3, awaVar, ayyVar, ajlVar, ajlVar2, ajlVar3, ajlVar4, i, i2);
        }
    }

    public static final void h(defpackage.cmw cmwVar, defpackage.aomy aomyVar, boolean z, defpackage.aonn aonnVar, defpackage.dkz dkzVar, long j, defpackage.aonn aonnVar2, defpackage.crd crdVar, bod bodVar, bof bofVar, defpackage.amu amuVar, defpackage.awa awaVar, defpackage.ayy ayyVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        int i4;
        defpackage.kaw kawVar;
        defpackage.aii aiiVar;
        defpackage.dpi dpiVar;
        boolean z2;
        defpackage.air airVar;
        int i5 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1954811544);
        if (i5 == 0) {
            i3 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.B(dkzVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i3 |= true != cavVarB.A(j) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i3 |= true != cavVarB.D(aonnVar2) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i3 |= true != cavVarB.D(null) ? 4194304 : 8388608;
        }
        if ((i & 100663296) == 0) {
            i3 |= true != cavVarB.B(crdVar) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            i3 |= true != cavVarB.B(bodVar) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = (true != cavVarB.B(bofVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.B(amuVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != cavVarB.y(32.0f) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true == cavVarB.B(awaVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true == cavVarB.B(ayyVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= true == cavVarB.B(null) ? 131072 : 65536;
        }
        if (cavVarB.H(((i3 & 306783379) == 306783378 && (74899 & i4) == 74898) ? false : true, i3 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVarB.u(329822563);
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = new defpackage.kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar.ab(objR);
            }
            defpackage.kaw kawVar2 = (defpackage.kaw) objR;
            cbtVar.W(false);
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new bpr(1);
                cbtVar.ab(objR2);
            }
            defpackage.cmw cmwVarB = defpackage.dig.b(cmwVar, false, (defpackage.aonj) objR2);
            int i6 = i4;
            long j2 = z ? bodVar.a : bodVar.d;
            if (bofVar == null) {
                cavVarB.u(330097470);
                cbtVar.W(false);
                kawVar = kawVar2;
                airVar = null;
            } else {
                cavVarB.u(1673216291);
                int i7 = i3 >> 6;
                int i8 = i6 << 6;
                java.lang.Object objR3 = cbtVar.R();
                if (objR3 == obj) {
                    objR3 = new androidx.compose.runtime.snapshots.SnapshotStateList();
                    cbtVar.ab(objR3);
                }
                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) objR3;
                java.lang.Object objR4 = cbtVar.R();
                if (objR4 == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);
                    cbtVar.ab(parcelableSnapshotMutableState);
                    objR4 = parcelableSnapshotMutableState;
                }
                int i9 = (i7 & 14) | (i8 & 896);
                defpackage.ccp ccpVar = (defpackage.ccp) objR4;
                boolean zB = cavVarB.B(kawVar2);
                java.lang.Object objR5 = cbtVar.R();
                if (zB || objR5 == obj) {
                    objR5 = new defpackage.bnl(kawVar2, snapshotStateList, (defpackage.aoln) null, 3, (char[]) null);
                    kawVar = kawVar2;
                    cbtVar.ab(objR5);
                } else {
                    kawVar = kawVar2;
                }
                defpackage.cbp.g(kawVar, (defpackage.aonn) objR5, cavVarB);
                defpackage.avj avjVar = (defpackage.avj) defpackage.ajsz.bJ(snapshotStateList);
                float f = (!z || (avjVar instanceof defpackage.avl) || (avjVar instanceof defpackage.avh) || (avjVar instanceof defpackage.avd) || !(avjVar instanceof defpackage.avb)) ? 0.0f : 8.0f;
                java.lang.Object objR6 = cbtVar.R();
                if (objR6 == obj) {
                    objR6 = new defpackage.aii(new defpackage.dpi(f), defpackage.alo.c, null, "Animatable");
                    cbtVar.ab(objR6);
                }
                defpackage.aii aiiVar2 = (defpackage.aii) objR6;
                defpackage.dpi dpiVar2 = new defpackage.dpi(f);
                boolean zD = cavVarB.D(aiiVar2) | cavVarB.y(f) | ((((i9 & 14) ^ 6) > 4 && cavVarB.C(z)) || (i9 & 6) == 4) | cavVarB.D(avjVar);
                java.lang.Object objR7 = cbtVar.R();
                if (zD || objR7 == obj) {
                    aiiVar = aiiVar2;
                    dpiVar = dpiVar2;
                    z2 = false;
                    defpackage.boe boeVar = new defpackage.boe(aiiVar, f, z, avjVar, ccpVar, (defpackage.aoln) null, 0);
                    cbtVar.ab(boeVar);
                    objR7 = boeVar;
                } else {
                    dpiVar = dpiVar2;
                    aiiVar = aiiVar2;
                    z2 = false;
                }
                defpackage.cbp.g(dpiVar, (defpackage.aonn) objR7, cavVarB);
                airVar = aiiVar.b;
                cbtVar.W(z2);
            }
            defpackage.bvo.d(aomyVar, cmwVarB, z, crdVar, j2, 0L, 0.0f, airVar != null ? ((defpackage.dpi) airVar.a()).a : 0.0f, amuVar, kawVar, defpackage.cfo.j(1333593699, new boo(aonnVar, dkzVar, j, aonnVar2, bodVar, z, awaVar, ayyVar), cavVarB), cavVarB, 96);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bop(cmwVar, aomyVar, z, aonnVar, dkzVar, j, aonnVar2, crdVar, bodVar, bofVar, amuVar, awaVar, ayyVar, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x0134  */
    /* JADX WARN: Code duplicated, block: B:97:0x013d  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void i(defpackage.aonn aonnVar, defpackage.dkz dkzVar, long j, defpackage.aonn aonnVar2, long j2, long j3, defpackage.awa awaVar, defpackage.ayy ayyVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.aonn aonnVar3;
        long j4;
        defpackage.awa awaVar2;
        defpackage.ayy ayyVar2;
        int i4;
        int i5;
        boolean z;
        defpackage.cdk cdkVarI;
        int i6 = i & 6;
        defpackage.cav cavVarB = cavVar.b(897958272);
        if (i6 == 0) {
            i3 = (true != cavVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(dkzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.A(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            aonnVar3 = aonnVar2;
            i3 |= true != cavVarB.D(aonnVar3) ? 1024 : 2048;
        } else {
            aonnVar3 = aonnVar2;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.D(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.D(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            j4 = j2;
            i3 |= true != cavVarB.A(j4) ? 524288 : 1048576;
        } else {
            j4 = j2;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != cavVarB.A(j3) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cavVarB.y(32.0f) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            awaVar2 = awaVar;
            i3 |= true != cavVarB.B(awaVar2) ? 268435456 : 536870912;
        } else {
            awaVar2 = awaVar;
        }
        if ((i2 & 6) == 0) {
            ayyVar2 = ayyVar;
            i4 = i2 | (true != cavVarB.B(ayyVar2) ? 2 : 4);
        } else {
            ayyVar2 = ayyVar;
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378) {
            i5 = 2;
            if ((i4 & 3) == 2) {
                z = false;
            }
            if (cavVarB.H(z, i3 & 1)) {
                defpackage.cdj[] cdjVarArr = new defpackage.cdj[i5];
                cdjVarArr[0] = defpackage.boy.a.b(new defpackage.cqg(j));
                cdjVarArr[1] = defpackage.bvt.a.b(dkzVar);
                defpackage.den.ac(cdjVarArr, defpackage.cfo.j(100316352, new bve(ayyVar2, awaVar2, aonnVar3, j4, aonnVar, 1), cavVarB), cavVarB, 48);
            } else {
                cavVarB.s();
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new bon(aonnVar, dkzVar, j, aonnVar2, j2, j3, awaVar, ayyVar, i, i2);
            }
        }
        i5 = 2;
        z = true;
        if (cavVarB.H(z, i3 & 1)) {
            defpackage.cdj[] cdjVarArr2 = new defpackage.cdj[i5];
            cdjVarArr2[0] = defpackage.boy.a.b(new defpackage.cqg(j));
            cdjVarArr2[1] = defpackage.bvt.a.b(dkzVar);
            defpackage.den.ac(cdjVarArr2, defpackage.cfo.j(100316352, new bve(ayyVar2, awaVar2, aonnVar3, j4, aonnVar, 1), cavVarB), cavVarB, 48);
        } else {
            cavVarB.s();
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bon(aonnVar, dkzVar, j, aonnVar2, j2, j3, awaVar, ayyVar, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:184:0x0288  */
    /* JADX WARN: Code duplicated, block: B:185:0x029f  */
    /* JADX WARN: Code duplicated, block: B:197:0x02d5  */
    public static final void j(final boolean z, final defpackage.cmw cmwVar, final defpackage.aomy aomyVar, final boolean z2, final defpackage.aonn aonnVar, final defpackage.dkz dkzVar, final defpackage.aonn aonnVar2, final defpackage.aonn aonnVar3, final defpackage.crd crdVar, final defpackage.bte bteVar, final defpackage.btg btgVar, final defpackage.amu amuVar, final defpackage.awa awaVar, final defpackage.ayy ayyVar, defpackage.cav cavVar, final int i, final int i2) {
        int i3;
        defpackage.aonn aonnVar4;
        int i4;
        int i5;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        float f;
        float f2;
        java.lang.Object objR;
        defpackage.aii aiiVar;
        boolean zD;
        java.lang.Object objR2;
        defpackage.air airVar;
        int i6 = i & 6;
        defpackage.cav cavVarB = cavVar.b(400616238);
        if (i6 == 0) {
            i3 = (true != cavVarB.C(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.D(aomyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.C(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i3 |= true != cavVarB.B(dkzVar) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            aonnVar4 = aonnVar2;
            i3 |= true != cavVarB.D(aonnVar4) ? 524288 : 1048576;
        } else {
            aonnVar4 = aonnVar2;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != cavVarB.D(null) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cavVarB.D(aonnVar3) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cavVarB.B(crdVar) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = (true != cavVarB.B(bteVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.B(btgVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != cavVarB.B(amuVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            int i7 = i4;
            z3 = true;
            i5 = i7 | (true == cavVarB.y(32.0f) ? 2048 : 1024);
        } else {
            i5 = i4;
            z3 = true;
        }
        if ((i2 & 24576) == 0) {
            i5 |= z3 == cavVarB.B(awaVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= z3 != cavVarB.B(ayyVar) ? 65536 : 131072;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= z3 != cavVarB.B(null) ? 524288 : 1048576;
        }
        if (cavVarB.H(((i3 & 306783379) == 306783378 && (i5 & 599187) == 599186) ? false : true, i3 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVarB.u(-955061811);
            java.lang.Object objR3 = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR3 == obj) {
                objR3 = new defpackage.kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar.ab(objR3);
            }
            defpackage.kaw kawVar = (defpackage.kaw) objR3;
            cbtVar.W(false);
            java.lang.Object objR4 = cbtVar.R();
            if (objR4 == obj) {
                objR4 = new defpackage.aln(16);
                cbtVar.ab(objR4);
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.dig.a;
            defpackage.cmw cmwVarA = cmwVar.a(new defpackage.dhs(false, (defpackage.aonj) objR4));
            if (z2) {
                if (z) {
                    j = bteVar.i;
                } else {
                    long j2 = bteVar.a;
                    j = 0;
                }
            } else if (z) {
                j = bteVar.j;
            } else {
                long j3 = bteVar.e;
                j = 0;
            }
            long j4 = j;
            if (btgVar == null) {
                cavVarB.u(-954746232);
                cbtVar.W(false);
                kawVar = kawVar;
                airVar = null;
            } else {
                cavVarB.u(-1554818919);
                int i8 = i3 >> 9;
                int i9 = i5 << 3;
                java.lang.Object objR5 = cbtVar.R();
                if (objR5 == obj) {
                    objR5 = new androidx.compose.runtime.snapshots.SnapshotStateList();
                    cbtVar.ab(objR5);
                }
                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) objR5;
                java.lang.Object objR6 = cbtVar.R();
                if (objR6 == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);
                    cbtVar.ab(parcelableSnapshotMutableState);
                    objR6 = parcelableSnapshotMutableState;
                }
                int i10 = (i8 & 14) | (i9 & 896);
                defpackage.ccp ccpVar = (defpackage.ccp) objR6;
                boolean zB = cavVarB.B(kawVar);
                java.lang.Object objR7 = cbtVar.R();
                if (zB || objR7 == obj) {
                    z4 = true;
                    objR7 = new defpackage.bur(kawVar, snapshotStateList, (defpackage.aoln) null, 1);
                    cbtVar.ab(objR7);
                } else {
                    z4 = true;
                }
                defpackage.cbp.g(kawVar, (defpackage.aonn) objR7, cavVarB);
                defpackage.avj avjVar = (defpackage.avj) defpackage.ajsz.bJ(snapshotStateList);
                if (z2) {
                    if (!(avjVar instanceof defpackage.avl)) {
                        if (!(avjVar instanceof defpackage.avh)) {
                            f = (!(avjVar instanceof defpackage.avd) && (avjVar instanceof defpackage.avb)) ? 8.0f : 1.0f;
                        }
                        f2 = f;
                        z5 = z4;
                        objR = cbtVar.R();
                        if (objR == obj) {
                            objR = new defpackage.aii(new defpackage.dpi(f2), defpackage.alo.c, null, "Animatable");
                            cbtVar.ab(objR);
                        }
                        aiiVar = (defpackage.aii) objR;
                        defpackage.dpi dpiVar = new defpackage.dpi(f2);
                        zD = cavVarB.D(aiiVar) | cavVarB.y(f2) | ((((i10 & 14) ^ 6) <= 4 && cavVarB.C(z5)) || (i10 & 6) == 4) | cavVarB.D(avjVar);
                        objR2 = cbtVar.R();
                        if (zD || objR2 == obj) {
                            objR2 = new defpackage.btf(aiiVar, f2, z5, avjVar, ccpVar, null);
                            cbtVar.ab(objR2);
                        }
                        defpackage.cbp.g(dpiVar, (defpackage.aonn) objR2, cavVarB);
                        airVar = aiiVar.b;
                        cbtVar.W(false);
                    }
                    z5 = z4;
                } else {
                    z5 = false;
                }
                f2 = 0.0f;
                objR = cbtVar.R();
                if (objR == obj) {
                    objR = new defpackage.aii(new defpackage.dpi(f2), defpackage.alo.c, null, "Animatable");
                    cbtVar.ab(objR);
                }
                aiiVar = (defpackage.aii) objR;
                defpackage.dpi dpiVar2 = new defpackage.dpi(f2);
                zD = cavVarB.D(aiiVar) | cavVarB.y(f2) | ((((i10 & 14) ^ 6) <= 4 && cavVarB.C(z5)) || (i10 & 6) == 4) | cavVarB.D(avjVar);
                objR2 = cbtVar.R();
                if (zD) {
                    objR2 = new defpackage.btf(aiiVar, f2, z5, avjVar, ccpVar, null);
                    cbtVar.ab(objR2);
                } else {
                    objR2 = new defpackage.btf(aiiVar, f2, z5, avjVar, ccpVar, null);
                    cbtVar.ab(objR2);
                }
                defpackage.cbp.g(dpiVar2, (defpackage.aonn) objR2, cavVarB);
                airVar = aiiVar.b;
                cbtVar.W(false);
            }
            final defpackage.aonn aonnVar5 = aonnVar4;
            defpackage.bvo.c(z, aomyVar, cmwVarA, z2, crdVar, j4, airVar != null ? ((defpackage.dpi) airVar.a()).a : 0.0f, amuVar, kawVar, defpackage.cfo.j(-1320468520, new defpackage.aonn() { // from class: boi
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                    long j5;
                    long j6;
                    long j7;
                    defpackage.cav cavVar2 = (defpackage.cav) obj2;
                    int iIntValue = ((java.lang.Integer) obj3).intValue();
                    int i11 = iIntValue & 3;
                    int i12 = iIntValue & 1;
                    defpackage.boc bocVar = defpackage.boq.a;
                    boolean z6 = false;
                    if (cavVar2.H(i11 != 2, i12)) {
                        boolean z7 = z;
                        boolean z8 = z2;
                        defpackage.bte bteVar2 = bteVar;
                        if (z8) {
                            j5 = !z7 ? bteVar2.b : bteVar2.k;
                        } else {
                            j5 = bteVar2.f;
                        }
                        if (z8) {
                            j6 = !z7 ? bteVar2.c : bteVar2.l;
                            z6 = true;
                        } else {
                            j6 = bteVar2.g;
                        }
                        if (z6) {
                            j7 = !z7 ? bteVar2.d : bteVar2.m;
                        } else {
                            j7 = bteVar2.h;
                        }
                        defpackage.ayy ayyVar2 = ayyVar;
                        defpackage.awa awaVar2 = awaVar;
                        defpackage.aonn aonnVar6 = aonnVar3;
                        defpackage.aonn aonnVar7 = aonnVar5;
                        defpackage.dkz dkzVar2 = dkzVar;
                        defpackage.aonn aonnVar8 = aonnVar;
                        defpackage.cbd cbdVar = defpackage.bqx.a;
                        defpackage.boq.g(aonnVar8, dkzVar2, j5, aonnVar7, aonnVar6, j6, j7, awaVar2, ayyVar2, defpackage.den.ah(((defpackage.bqv) cavVar2.e(cbdVar)).d, 5), defpackage.den.ah(((defpackage.bqv) cavVar2.e(cbdVar)).d, 4), defpackage.den.ah(((defpackage.bqv) cavVar2.e(cbdVar)).d, 1), defpackage.den.ah(((defpackage.bqv) cavVar2.e(cbdVar)).d, 3), cavVar2, 0, 0);
                    } else {
                        cavVar2.s();
                    }
                    return defpackage.aojh.a;
                }
            }, cavVarB), cavVarB, 192);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aonn() { // from class: boj
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).intValue();
                    boolean z6 = z;
                    defpackage.cmw cmwVar2 = cmwVar;
                    defpackage.aomy aomyVar2 = aomyVar;
                    boolean z7 = z2;
                    defpackage.aonn aonnVar6 = aonnVar;
                    defpackage.dkz dkzVar2 = dkzVar;
                    defpackage.aonn aonnVar7 = aonnVar2;
                    defpackage.aonn aonnVar8 = aonnVar3;
                    defpackage.crd crdVar2 = crdVar;
                    defpackage.bte bteVar2 = bteVar;
                    int i11 = i;
                    defpackage.btg btgVar2 = btgVar;
                    int i12 = i2;
                    int i13 = i11 | 1;
                    int i14 = i12 & 306783378;
                    int i15 = i13 & 306783378;
                    int i16 = i15 << 1;
                    defpackage.awa awaVar2 = awaVar;
                    int i17 = i12 & 613566756;
                    int i18 = i13 & 613566756;
                    defpackage.ayy ayyVar2 = ayyVar;
                    defpackage.boq.j(z6, cmwVar2, aomyVar2, z7, aonnVar6, dkzVar2, aonnVar7, aonnVar8, crdVar2, bteVar2, btgVar2, amuVar, awaVar2, ayyVar2, (defpackage.cav) obj2, (i13 & (-920350135)) | i15 | (i18 >> 1) | (i16 & i18), (i12 & (-920350135)) | i14 | (i17 >> 1) | ((i14 << 1) & i17));
                    return defpackage.aojh.a;
                }
            };
        }
    }
}
