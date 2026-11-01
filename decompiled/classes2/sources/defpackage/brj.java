package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class brj {
    public static final /* synthetic */ int a = 0;
    private static final ayy b = den.bb(4.0f, 2);
    private static final ayy c = new azc(4.0f, 2.0f, 4.0f, 2.0f);

    static {
        ((java.lang.Boolean) bsi.a.a()).booleanValue();
    }

    public static final void a(aonn aonnVar, cmw cmwVar, aonn aonnVar2, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(888023637);
        if (i3 == 0) {
            i2 = (true != cbtVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aonnVar2) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            cye cyeVarA = aww.a(awi.c, cmh.j, cbtVarB, 0);
            cbt cbtVar = cbtVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVar);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarA, dam.e);
            cev.c(cbtVarB, cjeVarAi, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM, dam.c);
            bvt.a(den.an(cbtVarB).m, aonnVar2, cbtVarB, (i2 >> 3) & 112);
            bvt.a(den.an(cbtVarB).k, aonnVar, cbtVarB, (i2 << 3) & 112);
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aoz((java.lang.Object) aonnVar, (java.lang.Object) cmwVar, (java.lang.Object) aonnVar2, i, 9, (byte[]) null);
        }
    }

    public static final void b(aono aonoVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1482876964);
        if (i3 == 0) {
            i2 = (true != cbtVarB.D(aonoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cbtVarB.H((i2 & 3) != 2, i2 & 1)) {
            cmw cmwVarM = azm.m(cmw.c, 20.0f, 0.0f, 2);
            int i4 = i2 << 9;
            cye cyeVarB = awo.b(cmh.a, false);
            cbt cbtVar = cbtVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cbtVarB, cmwVarM);
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
            cev.c(cbtVarB, cmwVarM2, dam.c);
            aonoVar.a(awt.a, cbtVarB, java.lang.Integer.valueOf((((i4 & 7168) >> 6) & 112) | 6));
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ajs(aonoVar, i, 7);
        }
    }

    public static final void c(aomy aomyVar, aonn aonnVar, crd crdVar, cmw cmwVar, aonn aonnVar2, aonn aonnVar3, boolean z, defpackage.brb brbVar, awa awaVar, ayy ayyVar, cav cavVar, int i, int i2) {
        int i3;
        aonn aonnVar4;
        boolean z2;
        awa awaVar2;
        ayy ayyVar2;
        int i4;
        cav cavVar2;
        int i5 = i & 6;
        cav cavVarB = cavVar.b(-1867764795);
        if (i5 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.B(crdVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            aonnVar4 = aonnVar2;
            i3 |= true != cavVarB.D(aonnVar4) ? 8192 : 16384;
        } else {
            aonnVar4 = aonnVar2;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.D((java.lang.Object) null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != cavVarB.D(aonnVar3) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            z2 = z;
            i3 |= true != cavVarB.C(z2) ? 4194304 : 8388608;
        } else {
            z2 = z;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cavVarB.B(brbVar) ? 33554432 : 67108864;
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
        int i6 = i3;
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.B((java.lang.Object) null) ? 16 : 32;
        }
        if (cavVarB.H(((i6 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true, i6 & 1)) {
            cbt cbtVar = (cbt) cavVarB;
            cavVar2 = cavVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVar2.E()) {
                cavVar2.s();
            }
            cavVar2.l();
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                objR = new defpackage.bpr(6);
                cbtVar.ab(objR);
            }
            cmw cmwVarB = dig.b(cmwVar, false, (aonj) objR);
            defpackage.drs drsVar = defpackage.bra.a;
            bti btiVarAm = den.am(cavVar2);
            defpackage.brc brcVar = btiVarAm.j;
            if (brcVar == null) {
                brcVar = new defpackage.brc(btj.a(btiVarAm, 4), btj.a(btiVarAm, 12));
                btiVarAm.j = brcVar;
            }
            int i7 = i6 << 3;
            int i8 = i4 << 6;
            boolean z3 = z2;
            e(aomyVar, aonnVar, cmwVarB, aonnVar3, aonnVar4, z3, brbVar, new defpackage.brc(defpackage.brc.a(crdVar, new defpackage.bll(brcVar, 15)), defpackage.brc.a(null, new defpackage.bll(brcVar, 16))), awaVar2, ayyVar2, cavVar2, (i7 & 112) | 1572870 | (i7 & 896) | ((i6 >> 6) & 57344) | (458752 & i7) | ((i6 << 6) & 29360128) | (234881024 & i7) | (i7 & 1879048192), ((i6 >> 24) & 112) | (i8 & 896) | (i8 & 7168));
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.brf(aomyVar, aonnVar, crdVar, cmwVar, aonnVar2, aonnVar3, z, brbVar, awaVar, ayyVar, i, i2, 1);
        }
    }

    public static final void d(aonn aonnVar, aomy aomyVar, cmw cmwVar, aonn aonnVar2, boolean z, defpackage.brb brbVar, ayy ayyVar, cav cavVar, int i) {
        int i2;
        aomy aomyVar2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1325192924);
        if (i3 == 0) {
            i2 = (true != cbtVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            aomyVar2 = aomyVar;
            i2 |= true != cbtVarB.D(aomyVar2) ? 16 : 32;
        } else {
            aomyVar2 = aomyVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.D(aonnVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.D((java.lang.Object) null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cbtVarB.C(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cbtVarB.B(brbVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cbtVarB.B(ayyVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != cbtVarB.B((java.lang.Object) null) ? 33554432 : 67108864;
        }
        if (cbtVarB.H((38347923 & i2) != 38347922, i2 & 1)) {
            cmw cmwVarAX = den.aX(azm.j(azm.d(den.ca(cmwVar, (kaw) null, bsw.a(true, 0.0f, (crd) null, false, 254), z, (dib) null, aomyVar2), 1.0f), 112.0f, 48.0f, 280.0f, Float.NaN), ayyVar);
            cye cyeVarA = azh.a(awi.a, cmh.n, cbtVarB, 48);
            cbt cbtVar = cbtVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarAX);
            aomy aomyVar3 = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar3);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarA, dam.e);
            cev.c(cbtVarB, cjeVarAi, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM, dam.c);
            bvt.a(den.an(cbtVarB).m, cfo.j(865999929, new pbv(aonnVar2, brbVar, z, azk.a, aonnVar, 1), cbtVarB), cbtVarB, 48);
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bmp(aonnVar, aomyVar, cmwVar, aonnVar2, z, brbVar, ayyVar, i, 7);
        }
    }

    public static final void e(aomy aomyVar, aonn aonnVar, cmw cmwVar, aonn aonnVar2, aonn aonnVar3, boolean z, defpackage.brb brbVar, defpackage.brc brcVar, awa awaVar, ayy ayyVar, cav cavVar, int i, int i2) {
        int i3;
        aonn aonnVar4;
        cmw cmwVar2;
        aonn aonnVar5;
        int i4;
        ayy ayyVar2;
        cav cavVar2;
        cav cavVarB = cavVar.b(-498972414);
        if ((i & 6) == 0) {
            i3 = (true != cavVarB.C(false) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aomyVar) ? 16 : 32;
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
            aonnVar5 = aonnVar2;
            i3 |= true != cavVarB.D(aonnVar5) ? 8192 : 16384;
        } else {
            aonnVar5 = aonnVar2;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.D(aonnVar3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != cavVarB.D((java.lang.Object) null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != cavVarB.D((java.lang.Object) null) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cavVarB.C(z) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cavVarB.B(brbVar) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != cavVarB.B(brcVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.B(awaVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            ayyVar2 = ayyVar;
            i4 |= true != cavVarB.B(ayyVar2) ? 128 : 256;
        } else {
            ayyVar2 = ayyVar;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true == cavVarB.B((java.lang.Object) null) ? 2048 : 1024;
        }
        if (cavVarB.H(((306783379 & i3) == 306783378 && (i4 & 1171) == 1170) ? false : true, i3 & 1)) {
            long j = z ? brbVar.c : brbVar.d;
            long jA = brbVar.a(z);
            long jB = brbVar.b(z);
            long j2 = j;
            cavVar2 = cavVarB;
            aonn aonnVar6 = aonnVar4;
            f(aomyVar, aonnVar6, cmwVar2, aonnVar5, aonnVar3, z, j2, jA, jB, z ? brbVar.a : brbVar.b, brcVar, awaVar, ayyVar2, cavVar2, i3 & 268435454, (i4 << 9) & 4193280);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.brf(aomyVar, aonnVar, cmwVar, aonnVar2, aonnVar3, z, brbVar, brcVar, awaVar, ayyVar, i, i2, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:142:0x0200  */
    /* JADX WARN: Code duplicated, block: B:143:0x0223  */
    public static final void f(final aomy aomyVar, final aonn aonnVar, final cmw cmwVar, final aonn aonnVar2, final aonn aonnVar3, final boolean z, final long j, final long j2, final long j3, final long j4, final defpackage.brc brcVar, final awa awaVar, final ayy ayyVar, cav cavVar, final int i, final int i2) {
        int i3;
        int i4;
        cav cavVar2;
        boolean z2;
        crd crdVar;
        awa awaVarA;
        int i5 = i & 6;
        cav cavVarB = cavVar.b(741160768);
        if (i5 == 0) {
            i3 = (true != cavVarB.C(false) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.D(aonnVar2) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i3 |= true != cavVarB.D(aonnVar3) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i3 |= true != cavVarB.D((java.lang.Object) null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != cavVarB.D((java.lang.Object) null) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cavVarB.C(z) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cavVarB.A(j) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = (true != cavVarB.A(j2) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.A(j3) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true == cavVarB.A(j4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true == cavVarB.B(brcVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true == cavVarB.B(awaVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= true == cavVarB.B(ayyVar) ? 131072 : 65536;
        }
        int i6 = i4;
        if ((i2 & 1572864) == 0) {
            i6 |= true != cavVarB.B((java.lang.Object) null) ? 524288 : 1048576;
        }
        if (cavVarB.H(((i3 & 306783379) == 306783378 && (i6 & 599187) == 599186) ? false : true, i3 & 1)) {
            cavVarB.u(-505725701);
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                objR = new kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar.ab(objR);
            }
            kaw kawVar = (kaw) objR;
            cbtVar.W(false);
            final ajl ajlVarAi = den.ai(1, cavVarB);
            final ajl ajlVarAi2 = den.ai(4, cavVarB);
            ajl ajlVarAi3 = den.ai(1, cavVarB);
            cer cerVarA = defpackage.ahp.a(j, den.ai(4, cavVarB), cavVarB, (i3 >> 27) & 14, 12);
            cavVarB.u(1804150103);
            crd crdVarQ = brcVar.a;
            if (crdVarQ instanceof bgc) {
                crd crdVar2 = brcVar.b;
                if (crdVar2 instanceof bgc) {
                    cavVarB.u(215284099);
                    z2 = false;
                    cbtVar.Z(-1378528456, cavVarB.f(crdVarQ, crdVar2), 0, (java.lang.Object) null);
                    aooh.d(crdVarQ, "null cannot be cast to non-null type androidx.compose.foundation.shape.RoundedCornerShape");
                    crdVarQ = defpackage.ro.q((bgc) crdVarQ, ajlVarAi3, cavVarB);
                    cbtVar.W(false);
                    cbtVar.W(false);
                } else if (crdVarQ instanceof bfx) {
                    crdVar = brcVar.b;
                    if (crdVar instanceof bfx) {
                        cavVarB.u(215469541);
                        z2 = false;
                        cbtVar.Z(-1378522474, cavVarB.f(crdVarQ, crdVar), 0, (java.lang.Object) null);
                        aooh.d(crdVarQ, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
                        crdVarQ = defpackage.ro.q((bfx) crdVarQ, ajlVarAi3, cavVarB);
                        cbtVar.W(false);
                        cbtVar.W(false);
                    } else {
                        z2 = false;
                        cavVarB.u(215598315);
                        cbtVar.W(false);
                    }
                } else {
                    z2 = false;
                    cavVarB.u(215598315);
                    cbtVar.W(false);
                }
            } else if (crdVarQ instanceof bfx) {
                crdVar = brcVar.b;
                if (crdVar instanceof bfx) {
                    cavVarB.u(215469541);
                    z2 = false;
                    cbtVar.Z(-1378522474, cavVarB.f(crdVarQ, crdVar), 0, (java.lang.Object) null);
                    aooh.d(crdVarQ, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
                    crdVarQ = defpackage.ro.q((bfx) crdVarQ, ajlVarAi3, cavVarB);
                    cbtVar.W(false);
                    cbtVar.W(false);
                } else {
                    z2 = false;
                    cavVarB.u(215598315);
                    cbtVar.W(false);
                }
            } else {
                z2 = false;
                cavVarB.u(215598315);
                cbtVar.W(false);
            }
            cbtVar.W(z2);
            crd crdVar3 = crdVarQ;
            final boolean z3 = aonnVar3 == null ? z2 : true;
            if (awaVar instanceof defpackage.bqz) {
                defpackage.drs drsVar = defpackage.bra.a;
                awaVarA = defpackage.bra.a(z3, z2);
            } else {
                awaVarA = awaVar;
            }
            cavVar2 = cavVarB;
            final awa awaVar2 = awaVarA;
            bvo.c(false, aomyVar, den.aX(azm.d(cmwVar, 1.0f), aonnVar2 != null ? c : b), z, crdVar3, a.F(cerVarA), 0.0f, (amu) null, kawVar, cfo.j(-680322218, new aonn() { // from class: brh
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar3 = (cav) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    int i7 = iIntValue & 3;
                    int i8 = iIntValue & 1;
                    int i9 = defpackage.brj.a;
                    if (cavVar3.H(i7 != 2, i8)) {
                        final aonn aonnVar4 = aonnVar;
                        final aonn aonnVar5 = aonnVar2;
                        final aonn aonnVar6 = aonnVar3;
                        final long j5 = j3;
                        final long j6 = j2;
                        final boolean z4 = z3;
                        final awa awaVar3 = awaVar2;
                        final ayy ayyVar2 = ayyVar;
                        bvt.a(den.an(cavVar3).m, cfo.j(48767109, new aonn() { // from class: brd
                            public final java.lang.Object a(java.lang.Object obj3, java.lang.Object obj4) {
                                cav cavVar4 = (cav) obj3;
                                int iIntValue2 = ((java.lang.Integer) obj4).intValue();
                                int i10 = iIntValue2 & 3;
                                int i11 = iIntValue2 & 1;
                                int i12 = defpackage.brj.a;
                                if (cavVar4.H(i10 != 2, i11)) {
                                    awa awaVar4 = awaVar3;
                                    cmw cmwVarAX = den.aX(azm.j(cmw.c, 112.0f, 44.0f, 280.0f, Float.NaN), ayyVar2);
                                    cye cyeVarA = azh.a(awaVar4, cmh.n, cavVar4, 48);
                                    int iM = anty.M(cavVar4.a());
                                    cje cjeVarM = cavVar4.M();
                                    cmw cmwVarM = cfo.m(cavVar4, cmwVarAX);
                                    aomy aomyVar2 = dam.a;
                                    cavVar4.L();
                                    cavVar4.v();
                                    if (cavVar4.F()) {
                                        cavVar4.j(aomyVar2);
                                    } else {
                                        cavVar4.x();
                                    }
                                    boolean z5 = z4;
                                    cev.c(cavVar4, cyeVarA, dam.e);
                                    cev.c(cavVar4, cjeVarM, dam.d);
                                    cev.c(cavVar4, java.lang.Integer.valueOf(iM), dam.f);
                                    cev.b(cavVar4, dam.g);
                                    cev.c(cavVar4, cmwVarM, dam.c);
                                    if (z5) {
                                        aonn aonnVar7 = aonnVar6;
                                        long j7 = j6;
                                        cavVar4.u(1095555178);
                                        den.ab(boy.a.b(new cqg(j7)), cfo.j(1187981798, new brg(aonnVar7, 0), cavVar4), cavVar4, 56);
                                        cavVar4.o();
                                    } else {
                                        cavVar4.u(1097145633);
                                        cavVar4.o();
                                    }
                                    aonn aonnVar8 = aonnVar4;
                                    den.ab(boy.a.b(new cqg(j5)), cfo.j(1225266913, new defpackage.awu(aonnVar5, aonnVar8, 14), cavVar4), cavVar4, 56);
                                    cavVar4.u(1098315201);
                                    cavVar4.o();
                                    cavVar4.n();
                                } else {
                                    cavVar4.s();
                                }
                                return aojh.a;
                            }
                        }, cavVar3), cavVar3, 48);
                    } else {
                        cavVar3.s();
                    }
                    return aojh.a;
                }
            }, cavVar2), cavVar2, 960);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: bri
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    aomy aomyVar2 = aomyVar;
                    aonn aonnVar4 = aonnVar;
                    cmw cmwVar2 = cmwVar;
                    aonn aonnVar5 = aonnVar2;
                    aonn aonnVar6 = aonnVar3;
                    boolean z4 = z;
                    long j5 = j;
                    long j6 = j2;
                    long j7 = j3;
                    int i7 = i;
                    long j8 = j4;
                    int i8 = i2;
                    int i9 = i7 | 1;
                    int i10 = i8 & 306783378;
                    int i11 = i9 & 306783378;
                    int i12 = i11 << 1;
                    awa awaVar3 = awaVar;
                    int i13 = i8 & 613566756;
                    int i14 = i9 & 613566756;
                    ayy ayyVar2 = ayyVar;
                    defpackage.brj.f(aomyVar2, aonnVar4, cmwVar2, aonnVar5, aonnVar6, z4, j5, j6, j7, j8, brcVar, awaVar3, ayyVar2, (cav) obj, (i9 & (-920350135)) | i11 | (i14 >> 1) | (i12 & i14), (i8 & (-920350135)) | i10 | (i13 >> 1) | ((i10 << 1) & i13));
                    return aojh.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [ajl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v31, types: [ajl, java.lang.Object] */
    public static final void g(final cmw cmwVar, final akc akcVar, final aomy aomyVar, final defpackage.aon aonVar, final crd crdVar, final long j, final float f, final aono aonoVar, cav cavVar, final int i) {
        int i2;
        aono aonoVar2;
        java.lang.Object objF;
        cbt cbtVar;
        java.lang.Object objF2;
        cbt cbtVar2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1278879194);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cbtVarB.B(akcVar) : cbtVarB.D(akcVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aomyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.B(aonVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.B(crdVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cbtVarB.A(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cbtVarB.y(0.0f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cbtVarB.y(f) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != cbtVarB.B((java.lang.Object) null) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            aonoVar2 = aonoVar;
            i2 |= true != cbtVarB.D(aonoVar2) ? 268435456 : 536870912;
        } else {
            aonoVar2 = aonoVar;
        }
        if (cbtVarB.H((306783379 & i2) != 306783378, i2 & 1)) {
            alg algVarC = alk.c(akcVar, cbtVarB, ((((i2 >> 3) & 14) | 48) & 14) | 48);
            ajl ajlVarAi = den.ai(1, cbtVarB);
            ajl ajlVarAi2 = den.ai(4, cbtVarB);
            defpackage.ant antVar = new defpackage.ant(ajlVarAi, 5);
            nf nfVar = alo.a;
            if (algVarC.C()) {
                ajlVarAi2 = ajlVarAi2;
                cbtVarB.u(1666827533);
                cbtVarB.W(false);
                objF = algVarC.f();
            } else {
                cbtVarB.u(1666573488);
                boolean zB = cbtVarB.B(algVarC);
                cbt cbtVar3 = cbtVarB;
                objF = cbtVar3.R();
                if (zB || objF == cau.a) {
                    cko ckoVarG = cfd.g();
                    aonj aonjVarI = ckoVarG != null ? ckoVarG.i() : null;
                    cko ckoVarH = cfd.h(ckoVarG);
                    try {
                        java.lang.Object objF3 = algVarC.f();
                        cfd.i(ckoVarG, ckoVarH, aonjVarI);
                        cbtVar3.ab(objF3);
                        objF = objF3;
                    } catch (java.lang.Throwable th) {
                        cfd.i(ckoVarG, ckoVarH, aonjVarI);
                        throw th;
                    }
                }
                cbtVar3.W(false);
            }
            boolean zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
            cbtVarB.u(-904349302);
            float f2 = true != zBooleanValue ? 0.8f : 1.0f;
            cbt cbtVar4 = cbtVarB;
            cbtVar4.W(false);
            java.lang.Float fValueOf = java.lang.Float.valueOf(f2);
            boolean zB2 = cbtVarB.B(algVarC);
            java.lang.Object objR = cbtVar4.R();
            if (zB2 || objR == cau.a) {
                defpackage.bll bllVar = new defpackage.bll(algVarC, 17);
                ajxw ajxwVar = ceo.a;
                objR = new cbk(bllVar, (cen) null);
                cbtVar4.ab(objR);
            }
            boolean zBooleanValue2 = ((java.lang.Boolean) ((cer) objR).a()).booleanValue();
            cbtVarB.u(-904349302);
            float f3 = true != zBooleanValue2 ? 0.8f : 1.0f;
            cbtVar4.W(false);
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(f3);
            boolean zB3 = cbtVarB.B(algVarC);
            java.lang.Object objR2 = cbtVar4.R();
            if (zB3 || objR2 == cau.a) {
                defpackage.bmx bmxVar = new defpackage.bmx(algVarC, 2);
                ajxw ajxwVar2 = ceo.a;
                objR2 = new cbk(bmxVar, (cen) null);
                cbtVar4.ab(objR2);
            }
            boolean z = false;
            cer cerVarE = alk.e(algVarC, fValueOf, fValueOf2, (ajl) antVar.a(((cer) objR2).a(), cbtVarB, 0), nfVar, cbtVarB, 0);
            defpackage.ant antVar2 = new defpackage.ant(ajlVarAi2, 6);
            nf nfVar2 = alo.a;
            if (algVarC.C()) {
                cbtVar = cbtVar4;
                cbtVarB.u(1666827533);
                cbtVar.W(false);
                objF2 = algVarC.f();
            } else {
                cbtVarB.u(1666573488);
                boolean zB4 = cbtVarB.B(algVarC);
                objF2 = cbtVar4.R();
                if (zB4 || objF2 == cau.a) {
                    cko ckoVarG2 = cfd.g();
                    aonj aonjVarI2 = ckoVarG2 != null ? ckoVarG2.i() : null;
                    cko ckoVarH2 = cfd.h(ckoVarG2);
                    try {
                        java.lang.Object objF4 = algVarC.f();
                        cfd.i(ckoVarG2, ckoVarH2, aonjVarI2);
                        cbtVar2 = cbtVar4;
                        cbtVar2.ab(objF4);
                        objF2 = objF4;
                        z = false;
                    } catch (java.lang.Throwable th2) {
                        cfd.i(ckoVarG2, ckoVarH2, aonjVarI2);
                        throw th2;
                    }
                } else {
                    cbtVar2 = cbtVar4;
                }
                cbtVar2.W(z);
                cbtVar = cbtVar2;
            }
            boolean zBooleanValue3 = ((java.lang.Boolean) objF2).booleanValue();
            cbtVarB.u(2062693622);
            float f4 = true != zBooleanValue3 ? 0.0f : 1.0f;
            cbtVar.W(z);
            java.lang.Float fValueOf3 = java.lang.Float.valueOf(f4);
            boolean zB5 = cbtVarB.B(algVarC);
            java.lang.Object objR3 = cbtVar.R();
            if (zB5 || objR3 == cau.a) {
                defpackage.bll bllVar2 = new defpackage.bll(algVarC, 18);
                ajxw ajxwVar3 = ceo.a;
                objR3 = new cbk(bllVar2, (cen) null);
                cbtVar.ab(objR3);
            }
            boolean zBooleanValue4 = ((java.lang.Boolean) ((cer) objR3).a()).booleanValue();
            cbtVarB.u(2062693622);
            float f5 = true != zBooleanValue4 ? 0.0f : 1.0f;
            cbtVar.W(false);
            java.lang.Float fValueOf4 = java.lang.Float.valueOf(f5);
            boolean zB6 = cbtVarB.B(algVarC);
            java.lang.Object objR4 = cbtVar.R();
            if (zB6 || objR4 == cau.a) {
                defpackage.bmx bmxVar2 = new defpackage.bmx(algVarC, 3);
                ajxw ajxwVar4 = ceo.a;
                cbk cbkVar = new cbk(bmxVar2, (cen) null);
                cbtVar.ab(cbkVar);
                objR4 = cbkVar;
            }
            cer cerVarE2 = alk.e(algVarC, fValueOf3, fValueOf4, (ajl) antVar2.a(((cer) objR4).a(), cbtVarB, 0), nfVar2, cbtVarB, 0);
            boolean zBooleanValue5 = ((java.lang.Boolean) cbtVarB.e(defpackage.dfy.a)).booleanValue();
            cmt cmtVar = cmw.c;
            boolean zC = cbtVarB.C(zBooleanValue5) | cbtVarB.B(cerVarE) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && cbtVarB.D(akcVar))) | cbtVarB.B(cerVarE2);
            boolean z2 = (i2 & 896) == 256;
            java.lang.Object objR5 = cbtVar.R();
            if ((zC | z2) || objR5 == cau.a) {
                objR5 = new defpackage.fxq(zBooleanValue5, akcVar, aomyVar, cerVarE, cerVarE2, 1);
                cbtVar.ab(objR5);
            }
            bvo.b(cfd.J(cmtVar, (aonj) objR5), crdVar, j, 0L, 0.0f, f, (amu) null, cfo.j(-816027071, new defpackage.ata((java.lang.Object) cmwVar, (java.lang.Object) aonVar, (java.lang.Object) aonoVar2, 5, (byte[]) null), cbtVarB), cbtVarB, 8);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: bre
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar2 = (cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    cmw cmwVar2 = cmwVar;
                    akc akcVar2 = akcVar;
                    aomy aomyVar2 = aomyVar;
                    defpackage.aon aonVar2 = aonVar;
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    int i6 = 613566756 & i4;
                    defpackage.brj.g(cmwVar2, akcVar2, aomyVar2, aonVar2, crdVar, j, f, aonoVar, cavVar2, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 << 1) & i6));
                    return aojh.a;
                }
            };
        }
    }
}
