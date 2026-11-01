package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class pf {
    private static volatile defpackage.pf a;

    private pf() {
    }

    public static void a() {
        if (a == null) {
            synchronized (defpackage.pf.class) {
                if (a == null) {
                    a = new defpackage.pf();
                }
            }
        }
    }

    public static pj b(java.lang.String str, java.lang.String str2, int i, boolean z, java.util.Set set) {
        if (z && !set.isEmpty()) {
            throw new java.lang.IllegalArgumentException("DocumentIndexingConfig#shouldIndexNestedProperties is required to be false when one or more indexableNestedProperties are provided.");
        }
        return new pj(new sj((java.lang.String) j$.util.Objects.requireNonNull(str), 6, i, (java.lang.String) j$.util.Objects.requireNonNull(str2), (si) null, (se) j$.util.Objects.requireNonNull(new se(z, new java.util.ArrayList(set))), (sg) null, (sh) null, (java.lang.String) j$.util.Objects.requireNonNull(""), (sf) null, false));
    }

    public static float c(defpackage.cra craVar, float f) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (craVar.p >> 32));
        if (java.lang.Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - ((((1.0f - f) * 0.0f) + (f * java.lang.Math.min(craVar.a() * 48.0f, fIntBitsToFloat))) / fIntBitsToFloat);
    }

    public static float d(defpackage.cra craVar, float f) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (craVar.p & 4294967295L));
        if (java.lang.Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - ((((1.0f - f) * 0.0f) + (f * java.lang.Math.min(craVar.a() * 24.0f, fIntBitsToFloat))) / fIntBitsToFloat);
    }

    public static void e(defpackage.cmw cmwVar, btt bttVar, defpackage.aomy aomyVar, float f, boolean z, defpackage.aonn aonnVar, defpackage.aonn aonnVar2, defpackage.crd crdVar, long j, long j2, float f2, defpackage.aono aonoVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.crd crdVar2;
        int i4;
        btt bttVar2;
        defpackage.aoln aolnVar;
        java.lang.Object obj;
        defpackage.cav cavVarB = cavVar.b(57000307);
        if ((i & 6) == 0) {
            i3 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(bttVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.D(aomyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.y(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.C(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.C(true) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != cavVarB.D(aonnVar2) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            crdVar2 = crdVar;
            i3 |= true != cavVarB.B(crdVar2) ? 33554432 : 67108864;
        } else {
            crdVar2 = crdVar;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cavVarB.A(j) ? 268435456 : 536870912;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != cavVarB.A(j2) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.y(f2) ? 16 : 32;
        }
        int i6 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i6 |= true != cavVarB.D(aonoVar) ? 1024 : 2048;
        }
        int i7 = i6;
        if (cavVarB.H(((306783379 & i5) == 306783378 && (i7 & 1171) == 1170) ? false : true, i5 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            defpackage.ajl ajlVarB = defpackage.den.al(cavVarB).b();
            defpackage.ajl ajlVarC = defpackage.den.al(cavVarB).c();
            int i8 = (i5 & 112) ^ 48;
            boolean zD = ((i8 > 32 && cavVarB.B(bttVar)) || (i5 & 48) == 32) | cavVarB.D(ajlVarB) | cavVarB.D(ajlVarC) | cavVarB.D(defpackage.den.al(cavVarB).b());
            java.lang.Object objR = cbtVar.R();
            if (zD || objR == defpackage.cau.a) {
                bttVar2 = bttVar;
                aolnVar = null;
                af afVar = new af(bttVar2, ajlVarB, ajlVarC, 7, (short[]) null);
                cbtVar.ab(afVar);
                objR = afVar;
            } else {
                bttVar2 = bttVar;
                aolnVar = null;
            }
            cavVarB.r((defpackage.aomy) objR);
            java.lang.Object objR2 = cbtVar.R();
            java.lang.Object obj2 = defpackage.cau.a;
            if (objR2 == obj2) {
                objR2 = defpackage.aij.a(0.0f);
                cbtVar.ab(objR2);
            }
            defpackage.aii aiiVar = (defpackage.aii) objR2;
            java.lang.Object objR3 = cbtVar.R();
            if (objR3 == obj2) {
                objR3 = defpackage.cbp.a(defpackage.aols.a, cavVarB);
                cbtVar.ab(objR3);
            }
            defpackage.aoss aossVar = (defpackage.aoss) objR3;
            boolean zD2 = ((i8 > 32 && cavVarB.B(bttVar2)) || (i5 & 48) == 32) | cavVarB.D(aossVar) | cavVarB.D(aiiVar);
            boolean z2 = (i5 & 896) == 256;
            java.lang.Object objR4 = cbtVar.R();
            if ((zD2 || z2) || objR4 == obj2) {
                obj = obj2;
                ajx ajxVar = new ajx(bttVar2, aossVar, aiiVar, aomyVar, 2);
                cbtVar.ab(ajxVar);
                objR4 = ajxVar;
            } else {
                obj = obj2;
            }
            defpackage.aomy aomyVar2 = (defpackage.aomy) objR4;
            boolean zM = bttVar.m();
            boolean zD3 = cavVarB.D(aiiVar) | cavVarB.B(aomyVar2);
            java.lang.Object objR5 = cbtVar.R();
            if (zD3 || objR5 == obj) {
                objR5 = new apw(aomyVar2, aiiVar, aolnVar, 6);
                cbtVar.ab(objR5);
            }
            rq.s(zM, (defpackage.aonn) objR5, cavVarB, 0);
            float fFloatValue = ((java.lang.Number) aiiVar.d()).floatValue();
            int i9 = i5 << 3;
            int i10 = i5 >> 6;
            int i11 = i7 << 24;
            int i12 = i5 >> 15;
            f(fFloatValue, cmwVar, bttVar, aomyVar, f, z, crdVar2, j, j2, f2, aonnVar, aonnVar2, aonoVar, cavVarB, (i9 & 524272) | (3670016 & i10) | (i10 & 29360128) | (234881024 & i11) | (i11 & 1879048192), ((i7 >> 6) & 14) | (i12 & 112) | (i12 & 896) | (i7 & 7168));
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bnf(cmwVar, bttVar, aomyVar, f, z, aonnVar, aonnVar2, crdVar, j, j2, f2, aonoVar, i, i2);
        }
    }

    public static void f(float f, defpackage.cmw cmwVar, btt bttVar, defpackage.aomy aomyVar, float f2, boolean z, defpackage.crd crdVar, long j, long j2, float f3, defpackage.aonn aonnVar, defpackage.aonn aonnVar2, defpackage.aono aonoVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        int i4;
        defpackage.cav cavVar2;
        cur curVar;
        btt bttVar2 = bttVar;
        int i5 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-780255289);
        if (i5 == 0) {
            i3 = (true != cavVarB.y(f) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.B(bttVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.D(aomyVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.y(f2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.C(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != cavVarB.B(crdVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != cavVarB.A(j) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cavVarB.A(j2) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cavVarB.y(f3) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != cavVarB.y(0.0f) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != cavVarB.D(aonnVar2) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true == cavVarB.D(aonoVar) ? 2048 : 1024;
        }
        if (cavVarB.H(((306783379 & i3) == 306783378 && (i4 & 1171) == 1170) ? false : true, i3 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            java.lang.String strAe = defpackage.den.ae(2132019210, cavVarB);
            defpackage.dgk dgkVar = (defpackage.dgk) cavVarB.e(defpackage.dfo.n);
            defpackage.ajl ajlVarB = defpackage.den.al(cavVarB).b();
            defpackage.cbd cbdVar = defpackage.dfo.e;
            defpackage.dpf dpfVar = (defpackage.dpf) cavVarB.e(cbdVar);
            defpackage.aiq aiqVar = api.a;
            apy apyVar = bttVar2.d;
            int i6 = (i3 & 896) ^ 384;
            boolean z2 = (i6 > 256 && cavVarB.B(bttVar2)) || (i3 & 384) == 256;
            java.lang.Object objR = cbtVar.R();
            if (z2 || objR == defpackage.cau.a) {
                objR = new bln(bttVar2, 18);
                cbtVar.ab(objR);
            }
            defpackage.aonj aonjVar = (defpackage.aonj) objR;
            defpackage.dpf dpfVar2 = (defpackage.dpf) cavVarB.e(cbdVar);
            boolean zB = cavVarB.B(dpfVar2) | cavVarB.B(apyVar) | cavVarB.B(aonjVar) | cavVarB.B(ajlVarB);
            java.lang.Object objR2 = cbtVar.R();
            if (zB || objR2 == defpackage.cau.a) {
                auu auuVar = new auu(new apl(apyVar, aonjVar, new mq(dpfVar2, 18)), app.c, ajlVarB);
                cbtVar.ab(auuVar);
                objR2 = auuVar;
            }
            atw atwVar = (atw) objR2;
            boolean zB2 = cavVarB.B(atwVar) | ((i6 > 256 && cavVarB.B(bttVar2)) || (i3 & 384) == 256) | cavVarB.B(dgkVar) | cavVarB.B(dpfVar);
            java.lang.Object objR3 = cbtVar.R();
            if (zB2 || objR3 == defpackage.cau.a) {
                bnh bnhVar = new bnh(dgkVar, bttVar2, dpfVar, atwVar, aomyVar);
                bttVar2 = bttVar2;
                cbtVar.ab(bnhVar);
                objR3 = bnhVar;
            }
            bnh bnhVar2 = (bnh) objR3;
            java.lang.Object objR4 = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR4 == obj) {
                objR4 = defpackage.cbp.a(defpackage.aols.a, cavVarB);
                cbtVar.ab(objR4);
            }
            defpackage.aoss aossVar = (defpackage.aoss) objR4;
            boolean zD = ((i6 > 256 && cavVarB.B(bttVar2)) || (i3 & 384) == 256) | cavVarB.D(aossVar);
            boolean z3 = (i3 & 7168) == 2048;
            java.lang.Object objR5 = cbtVar.R();
            if ((zD | z3) || objR5 == obj) {
                af afVar = new af(bttVar2, aossVar, aomyVar, 5, (byte[]) null);
                cbtVar.ab(afVar);
                objR5 = afVar;
            }
            defpackage.aomy aomyVar2 = (defpackage.aomy) objR5;
            defpackage.cmw cmwVarD = defpackage.azm.d(defpackage.azm.l(cmwVar, Float.NaN, f2), 1.0f);
            if (z) {
                cavVarB.u(1794078282);
                boolean z4 = (i6 > 256 && cavVarB.B(bttVar2)) || (i3 & 384) == 256;
                java.lang.Object objR6 = cbtVar.R();
                if (z4 || objR6 == obj) {
                    defpackage.aso asoVar = defpackage.aso.a;
                    int i7 = bto.a;
                    objR6 = new btn(bttVar2, bnhVar2, asoVar);
                    cbtVar.ab(objR6);
                }
                curVar = new cur((defpackage.cun) objR6, (defpackage.cuq) null);
                cbtVar.W(false);
            } else {
                cavVarB.u(1794093103);
                cbtVar.W(false);
                curVar = defpackage.cmw.c;
            }
            defpackage.cmw cmwVarA = cmwVarD.a(curVar);
            apy apyVar2 = bttVar2.d;
            defpackage.aso asoVar2 = defpackage.aso.a;
            boolean z5 = (i6 > 256 && cavVarB.B(bttVar2)) || (i3 & 384) == 256;
            java.lang.Object objR7 = cbtVar.R();
            if (z5 || objR7 == obj) {
                objR7 = new defpackage.axo(bttVar2, 15);
                cbtVar.ab(objR7);
            }
            defpackage.cmw cmwVarC = app.c(cmwVarA.a(new byg(apyVar2, (defpackage.aonn) objR7, asoVar2)), bttVar2.d, asoVar2, z && bttVar2.c() != btu.a, (defpackage.kaw) null, bnhVar2);
            boolean zB3 = cavVarB.B(strAe);
            java.lang.Object objR8 = cbtVar.R();
            if (zB3 || objR8 == obj) {
                objR8 = new bln(strAe, 19);
                cbtVar.ab(objR8);
            }
            defpackage.cmw cmwVarJ = defpackage.cfd.J(defpackage.dig.b(cmwVarC, false, (defpackage.aonj) objR8), new arg(bttVar2, f, 2));
            int i8 = bto.a;
            cavVar2 = cavVarB;
            defpackage.bvo.b(defpackage.cfd.J(cmwVarJ, new bru(bttVar2, 3)), crdVar, j, j2, f3, 0.0f, null, defpackage.cfo.j(1483196812, new bnd(aonnVar2, f, bttVar2, aonnVar, aomyVar2, aossVar, z, aonoVar), cavVarB), cavVar2, 64);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bne(f, cmwVar, bttVar, aomyVar, f2, z, crdVar, j, j2, f3, aonnVar, aonnVar2, aonoVar, i, i2);
        }
    }

    public static void g(defpackage.aonn aonnVar, defpackage.aomy aomyVar, defpackage.cmw cmwVar, defpackage.aonn aonnVar2, boolean z, brb brbVar, defpackage.ayy ayyVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-532959117);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aonnVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.C(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B(brbVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.B(ayyVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != cavVarB.B(null) ? 33554432 : 67108864;
        }
        if (cavVarB.H((38347923 & i2) != 38347922, i2 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            brj.d(aonnVar, aomyVar, cmwVar, aonnVar2, z, brbVar, ayyVar, cavVar2, i2 & 268435454);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bmp(aonnVar, aomyVar, cmwVar, aonnVar2, z, brbVar, ayyVar, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0121  */
    /* JADX WARN: Code duplicated, block: B:104:0x0128  */
    /* JADX WARN: Code duplicated, block: B:106:0x0130  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:114:0x0149  */
    /* JADX WARN: Code duplicated, block: B:117:0x0152  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:140:0x01be  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:143:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01da  */
    /* JADX WARN: Code duplicated, block: B:148:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:152:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:156:0x0208  */
    /* JADX WARN: Code duplicated, block: B:157:0x0212  */
    /* JADX WARN: Code duplicated, block: B:161:0x022d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0264  */
    /* JADX WARN: Code duplicated, block: B:169:0x0278  */
    /* JADX WARN: Code duplicated, block: B:170:0x027b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0289 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:174:0x028b  */
    /* JADX WARN: Code duplicated, block: B:177:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:180:0x0304  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
    public static void h(boolean z, defpackage.aomy aomyVar, defpackage.cmw cmwVar, long j, aon aonVar, drs drsVar, defpackage.crd crdVar, long j2, float f, defpackage.aono aonoVar, defpackage.cav cavVar, int i, int i2, int i3) {
        int i4;
        defpackage.aomy aomyVar2;
        defpackage.cmw cmwVar2;
        int i5;
        long j3;
        int i6;
        drs drsVar2;
        defpackage.crd crdVar2;
        int i7;
        boolean z2;
        int i8;
        int i9;
        boolean z3;
        aon aonVar2;
        float f2;
        long j4;
        defpackage.cmw cmwVar3;
        defpackage.crd crdVar3;
        long j5;
        drs drsVar3;
        defpackage.cdk cdkVarI;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        defpackage.cbt cbtVar;
        defpackage.cmw cmwVar4;
        long j6;
        aon aonVarE;
        drs drsVar4;
        defpackage.crd crdVarB;
        long jE;
        float f3;
        defpackage.cmw cmwVar5;
        aon aonVar3;
        defpackage.crd crdVar4;
        long j7;
        float f4;
        int i16;
        java.lang.Object objR;
        java.lang.Object obj;
        defpackage.akc akcVar;
        defpackage.dpf dpfVar;
        boolean z4;
        boolean zB;
        java.lang.Object objR2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1725609375);
        if (i24 == 0) {
            i4 = (true != cavVarB.C(z) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            aomyVar2 = aomyVar;
            i4 |= true != cavVarB.D(aomyVar2) ? 16 : 32;
        } else {
            aomyVar2 = aomyVar;
        }
        int i25 = i3 & 4;
        if (i25 == 0) {
            if ((i & 384) == 0) {
                cmwVar2 = cmwVar;
                i4 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                i4 |= 3072;
                j3 = j;
            } else {
                j3 = j;
                if ((i & 3072) == 0) {
                    if (true != cavVarB.A(j3)) {
                        i6 = 1024;
                    } else {
                        i6 = 2048;
                    }
                    i4 |= i6;
                }
            }
            if ((i & 24576) == 0) {
                i23 = 8192;
                if ((i3 & 16) == 0 && cavVarB.B(aonVar)) {
                    i23 = 16384;
                }
                i4 |= i23;
            }
            if ((i & 196608) == 0) {
                i22 = 65536;
                drsVar2 = drsVar;
                if ((i3 & 32) == 0 && cavVarB.B(drsVar2)) {
                    i22 = 131072;
                }
                i4 |= i22;
            } else {
                drsVar2 = drsVar;
            }
            if ((i & 1572864) == 0) {
                i21 = 524288;
                crdVar2 = crdVar;
                if ((i3 & 64) == 0 && cavVarB.B(crdVar2)) {
                    i21 = 1048576;
                }
                i4 |= i21;
            } else {
                crdVar2 = crdVar;
            }
            if ((i & 12582912) == 0) {
                i20 = 4194304;
                int i26 = i4;
                if ((i3 & 128) == 0 && cavVarB.A(j2)) {
                    i20 = 8388608;
                }
                i7 = i26 | i20;
            } else {
                i7 = i4;
            }
            if ((i & 100663296) == 0) {
                i19 = 33554432;
                if ((i3 & 256) == 0 && cavVarB.y(0.0f)) {
                    i19 = 67108864;
                }
                i7 |= i19;
            }
            if ((805306368 & i) == 0) {
                if ((i3 & 512) == 0 || !cavVarB.y(f)) {
                    i18 = 268435456;
                } else {
                    i18 = 536870912;
                }
                i7 |= i18;
            }
            if ((i3 & 1024) != 0) {
                i8 = i2 | 6;
                z2 = true;
            } else if ((i2 & 6) == 0) {
                z2 = true;
                if (true != cavVarB.B(null)) {
                    i9 = 2;
                } else {
                    i9 = 4;
                }
                i8 = i2 | i9;
            } else {
                z2 = true;
                i8 = i2;
            }
            if ((i2 & 48) == 0) {
                if (z2 != cavVarB.D(aonoVar)) {
                    i17 = 16;
                } else {
                    i17 = 32;
                }
                i8 |= i17;
            }
            if ((i7 & 306783379) == 306783378 || (i8 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cavVarB.H(z3, i7 & 1)) {
                i10 = i3 & 512;
                i11 = i3 & 256;
                i12 = i3 & 128;
                i13 = i3 & 64;
                i14 = i3 & 32;
                i15 = i3 & 16;
                cbtVar = (defpackage.cbt) cavVarB;
                cbtVar.Z(-127, null, 0, null);
                if ((i & 1) != 0 || cavVarB.E()) {
                    if (i25 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i5 != 0) {
                        j6 = 0;
                    } else {
                        j6 = j3;
                    }
                    if (i15 != 0) {
                        i7 &= -57345;
                        aonVarE = rl.e(cavVarB, 0);
                    } else {
                        aonVarE = aonVar;
                    }
                    if (i14 != 0) {
                        drs drsVar5 = bra.a;
                        i7 &= -458753;
                        drsVar4 = bra.a;
                    } else {
                        drsVar4 = drsVar2;
                    }
                    if (i13 != 0) {
                        drs drsVar6 = bra.a;
                        crdVarB = defpackage.btj.b(4, cavVarB);
                        i7 &= -3670017;
                    } else {
                        crdVarB = crdVar2;
                    }
                    if (i12 != 0) {
                        drs drsVar7 = bra.a;
                        jE = defpackage.bos.e(36, cavVarB);
                        i7 &= -29360129;
                    } else {
                        jE = j2;
                    }
                    if (i11 != 0) {
                        drs drsVar8 = bra.a;
                        i7 &= -234881025;
                    }
                    if (i10 != 0) {
                        drs drsVar9 = bra.a;
                        i7 &= -1879048193;
                        f3 = bra.b;
                    } else {
                        f3 = f;
                    }
                    cmwVar5 = cmwVar4;
                    drsVar2 = drsVar4;
                    aonVar3 = aonVarE;
                    crdVar4 = crdVarB;
                    j7 = jE;
                    f4 = f3;
                    i16 = i7;
                    j3 = j6;
                } else {
                    cavVarB.s();
                    if (i15 != 0) {
                        i7 &= -57345;
                    }
                    if (i14 != 0) {
                        i7 &= -458753;
                    }
                    if (i13 != 0) {
                        i7 &= -3670017;
                    }
                    if (i12 != 0) {
                        i7 &= -29360129;
                    }
                    if (i11 != 0) {
                        i7 &= -234881025;
                    }
                    if (i10 != 0) {
                        i7 &= -1879048193;
                    }
                    aonVar3 = aonVar;
                    j7 = j2;
                    f4 = f;
                    cmwVar5 = cmwVar2;
                    crdVar4 = crdVar2;
                    i16 = i7;
                }
                cavVarB.l();
                objR = cbtVar.R();
                obj = defpackage.cau.a;
                if (objR == obj) {
                    objR = new defpackage.akc(java.lang.Boolean.FALSE);
                    cbtVar.ab(objR);
                }
                akcVar = (defpackage.akc) objR;
                akcVar.f(java.lang.Boolean.valueOf(z));
                if (!((java.lang.Boolean) akcVar.a()).booleanValue() || ((java.lang.Boolean) akcVar.b()).booleanValue()) {
                    cavVarB.u(1165885407);
                    dpfVar = (defpackage.dpf) cavVarB.e(defpackage.dfo.e);
                    if ((i16 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zB = z4 | cavVarB.B(dpfVar);
                    objR2 = cbtVar.R();
                    if (zB || objR2 == obj) {
                        bqy bqyVar = bqy.a;
                        int i27 = brj.a;
                        objR2 = new byj(j3, dpfVar, bqyVar, dpfVar.dp(48.0f), new aem(20));
                        cbtVar.ab(objR2);
                    }
                    byj byjVar = (byj) objR2;
                    dra.b(byjVar, aomyVar2, drsVar2, defpackage.cfo.j(-917492520, new bmo(cmwVar5, akcVar, byjVar, aonVar3, crdVar4, j7, f4, aonoVar), cavVarB), cavVarB, (i16 & 112) | 3072 | ((i16 >> 9) & 896), 0);
                    cbtVar.W(false);
                } else {
                    cavVarB.u(1166904067);
                    cbtVar.W(false);
                }
                j4 = j3;
                cmwVar3 = cmwVar5;
                aonVar2 = aonVar3;
                crdVar3 = crdVar4;
                j5 = j7;
                f2 = f4;
            } else {
                cavVarB.s();
                aonVar2 = aonVar;
                f2 = f;
                j4 = j3;
                cmwVar3 = cmwVar2;
                crdVar3 = crdVar2;
                j5 = j2;
            }
            drsVar3 = drsVar2;
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acqd(z, aomyVar, cmwVar3, j4, aonVar2, drsVar3, crdVar3, j5, f2, aonoVar, i, i2, i3, 1);
            }
        }
        i4 |= 384;
        cmwVar2 = cmwVar;
        i5 = i3 & 8;
        if (i5 != 0) {
            i4 |= 3072;
            j3 = j;
        } else {
            j3 = j;
            if ((i & 3072) == 0) {
                if (true != cavVarB.A(j3)) {
                    i6 = 1024;
                } else {
                    i6 = 2048;
                }
                i4 |= i6;
            }
        }
        if ((i & 24576) == 0) {
            i23 = 8192;
            if ((i3 & 16) == 0) {
                i23 = 16384;
            }
            i4 |= i23;
        }
        if ((i & 196608) == 0) {
            i22 = 65536;
            drsVar2 = drsVar;
            if ((i3 & 32) == 0) {
                i22 = 131072;
            }
            i4 |= i22;
        } else {
            drsVar2 = drsVar;
        }
        if ((i & 1572864) == 0) {
            i21 = 524288;
            crdVar2 = crdVar;
            if ((i3 & 64) == 0) {
                i21 = 1048576;
            }
            i4 |= i21;
        } else {
            crdVar2 = crdVar;
        }
        if ((i & 12582912) == 0) {
            i20 = 4194304;
            int i28 = i4;
            if ((i3 & 128) == 0) {
                i20 = 8388608;
            }
            i7 = i28 | i20;
        } else {
            i7 = i4;
        }
        if ((i & 100663296) == 0) {
            i19 = 33554432;
            if ((i3 & 256) == 0) {
                i19 = 67108864;
            }
            i7 |= i19;
        }
        if ((805306368 & i) == 0) {
            if ((i3 & 512) == 0) {
                i18 = 268435456;
            } else {
                i18 = 268435456;
            }
            i7 |= i18;
        }
        if ((i3 & 1024) != 0) {
            i8 = i2 | 6;
            z2 = true;
        } else if ((i2 & 6) == 0) {
            z2 = true;
            if (true != cavVarB.B(null)) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            i8 = i2 | i9;
        } else {
            z2 = true;
            i8 = i2;
        }
        if ((i2 & 48) == 0) {
            if (z2 != cavVarB.D(aonoVar)) {
                i17 = 16;
            } else {
                i17 = 32;
            }
            i8 |= i17;
        }
        if ((i7 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (cavVarB.H(z3, i7 & 1)) {
            i10 = i3 & 512;
            i11 = i3 & 256;
            i12 = i3 & 128;
            i13 = i3 & 64;
            i14 = i3 & 32;
            i15 = i3 & 16;
            cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i25 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i5 != 0) {
                    j6 = 0;
                } else {
                    j6 = j3;
                }
                if (i15 != 0) {
                    i7 &= -57345;
                    aonVarE = rl.e(cavVarB, 0);
                } else {
                    aonVarE = aonVar;
                }
                if (i14 != 0) {
                    drs drsVar10 = bra.a;
                    i7 &= -458753;
                    drsVar4 = bra.a;
                } else {
                    drsVar4 = drsVar2;
                }
                if (i13 != 0) {
                    drs drsVar11 = bra.a;
                    crdVarB = defpackage.btj.b(4, cavVarB);
                    i7 &= -3670017;
                } else {
                    crdVarB = crdVar2;
                }
                if (i12 != 0) {
                    drs drsVar12 = bra.a;
                    jE = defpackage.bos.e(36, cavVarB);
                    i7 &= -29360129;
                } else {
                    jE = j2;
                }
                if (i11 != 0) {
                    drs drsVar13 = bra.a;
                    i7 &= -234881025;
                }
                if (i10 != 0) {
                    drs drsVar14 = bra.a;
                    i7 &= -1879048193;
                    f3 = bra.b;
                } else {
                    f3 = f;
                }
                cmwVar5 = cmwVar4;
                drsVar2 = drsVar4;
                aonVar3 = aonVarE;
                crdVar4 = crdVarB;
                j7 = jE;
                f4 = f3;
                i16 = i7;
                j3 = j6;
            } else {
                if (i25 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i5 != 0) {
                    j6 = 0;
                } else {
                    j6 = j3;
                }
                if (i15 != 0) {
                    i7 &= -57345;
                    aonVarE = rl.e(cavVarB, 0);
                } else {
                    aonVarE = aonVar;
                }
                if (i14 != 0) {
                    drs drsVar15 = bra.a;
                    i7 &= -458753;
                    drsVar4 = bra.a;
                } else {
                    drsVar4 = drsVar2;
                }
                if (i13 != 0) {
                    drs drsVar16 = bra.a;
                    crdVarB = defpackage.btj.b(4, cavVarB);
                    i7 &= -3670017;
                } else {
                    crdVarB = crdVar2;
                }
                if (i12 != 0) {
                    drs drsVar17 = bra.a;
                    jE = defpackage.bos.e(36, cavVarB);
                    i7 &= -29360129;
                } else {
                    jE = j2;
                }
                if (i11 != 0) {
                    drs drsVar18 = bra.a;
                    i7 &= -234881025;
                }
                if (i10 != 0) {
                    drs drsVar19 = bra.a;
                    i7 &= -1879048193;
                    f3 = bra.b;
                } else {
                    f3 = f;
                }
                cmwVar5 = cmwVar4;
                drsVar2 = drsVar4;
                aonVar3 = aonVarE;
                crdVar4 = crdVarB;
                j7 = jE;
                f4 = f3;
                i16 = i7;
                j3 = j6;
            }
            cavVarB.l();
            objR = cbtVar.R();
            obj = defpackage.cau.a;
            if (objR == obj) {
                objR = new defpackage.akc(java.lang.Boolean.FALSE);
                cbtVar.ab(objR);
            }
            akcVar = (defpackage.akc) objR;
            akcVar.f(java.lang.Boolean.valueOf(z));
            if (((java.lang.Boolean) akcVar.a()).booleanValue()) {
                cavVarB.u(1165885407);
                dpfVar = (defpackage.dpf) cavVarB.e(defpackage.dfo.e);
                if ((i16 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zB = z4 | cavVarB.B(dpfVar);
                objR2 = cbtVar.R();
                if (zB) {
                    bqy bqyVar2 = bqy.a;
                    int i29 = brj.a;
                    objR2 = new byj(j3, dpfVar, bqyVar2, dpfVar.dp(48.0f), new aem(20));
                    cbtVar.ab(objR2);
                } else {
                    bqy bqyVar3 = bqy.a;
                    int i210 = brj.a;
                    objR2 = new byj(j3, dpfVar, bqyVar3, dpfVar.dp(48.0f), new aem(20));
                    cbtVar.ab(objR2);
                }
                byj byjVar2 = (byj) objR2;
                dra.b(byjVar2, aomyVar2, drsVar2, defpackage.cfo.j(-917492520, new bmo(cmwVar5, akcVar, byjVar2, aonVar3, crdVar4, j7, f4, aonoVar), cavVarB), cavVarB, (i16 & 112) | 3072 | ((i16 >> 9) & 896), 0);
                cbtVar.W(false);
            } else {
                cavVarB.u(1165885407);
                dpfVar = (defpackage.dpf) cavVarB.e(defpackage.dfo.e);
                if ((i16 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zB = z4 | cavVarB.B(dpfVar);
                objR2 = cbtVar.R();
                if (zB) {
                    bqy bqyVar4 = bqy.a;
                    int i211 = brj.a;
                    objR2 = new byj(j3, dpfVar, bqyVar4, dpfVar.dp(48.0f), new aem(20));
                    cbtVar.ab(objR2);
                } else {
                    bqy bqyVar5 = bqy.a;
                    int i212 = brj.a;
                    objR2 = new byj(j3, dpfVar, bqyVar5, dpfVar.dp(48.0f), new aem(20));
                    cbtVar.ab(objR2);
                }
                byj byjVar3 = (byj) objR2;
                dra.b(byjVar3, aomyVar2, drsVar2, defpackage.cfo.j(-917492520, new bmo(cmwVar5, akcVar, byjVar3, aonVar3, crdVar4, j7, f4, aonoVar), cavVarB), cavVarB, (i16 & 112) | 3072 | ((i16 >> 9) & 896), 0);
                cbtVar.W(false);
            }
            j4 = j3;
            cmwVar3 = cmwVar5;
            aonVar2 = aonVar3;
            crdVar3 = crdVar4;
            j5 = j7;
            f2 = f4;
        } else {
            cavVarB.s();
            aonVar2 = aonVar;
            f2 = f;
            j4 = j3;
            cmwVar3 = cmwVar2;
            crdVar3 = crdVar2;
            j5 = j2;
        }
        drsVar3 = drsVar2;
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acqd(z, aomyVar, cmwVar3, j4, aonVar2, drsVar3, crdVar3, j5, f2, aonoVar, i, i2, i3, 1);
        }
    }

    public static void i(defpackage.aomy aomyVar, defpackage.aonn aonnVar, defpackage.cmw cmwVar, defpackage.aonn aonnVar2, defpackage.aonn aonnVar3, defpackage.aonn aonnVar4, defpackage.aonn aonnVar5, defpackage.crd crdVar, long j, long j2, long j3, long j4, float f, drh drhVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.aonn aonnVar6;
        defpackage.cmw cmwVar2;
        defpackage.aonn aonnVar7;
        defpackage.crd crdVar2;
        int i4;
        float f2;
        defpackage.cav cavVar2;
        int i5 = i & 6;
        defpackage.cav cavVarB = cavVar.b(94478519);
        if (i5 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            aonnVar6 = aonnVar;
            i3 |= true != cavVarB.D(aonnVar6) ? 16 : 32;
        } else {
            aonnVar6 = aonnVar;
        }
        if ((i & 384) == 0) {
            cmwVar2 = cmwVar;
            i3 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
        } else {
            cmwVar2 = cmwVar;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.D(aonnVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.D(aonnVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.D(aonnVar4) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            aonnVar7 = aonnVar5;
            i3 |= true != cavVarB.D(aonnVar7) ? 524288 : 1048576;
        } else {
            aonnVar7 = aonnVar5;
        }
        if ((12582912 & i) == 0) {
            crdVar2 = crdVar;
            i3 |= true != cavVarB.B(crdVar2) ? 4194304 : 8388608;
        } else {
            crdVar2 = crdVar;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cavVarB.A(j) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cavVarB.A(j2) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != cavVarB.A(j3) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.A(j4) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            f2 = f;
            i4 |= true != cavVarB.y(f2) ? 128 : 256;
        } else {
            f2 = f;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != cavVarB.B(drhVar) ? 1024 : 2048;
        }
        if (cavVarB.H(((306783379 & i3) == 306783378 && (i4 & 1171) == 1170) ? false : true, i3 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            bmm.a(aomyVar, aonnVar6, cmwVar2, aonnVar2, aonnVar3, aonnVar4, aonnVar7, crdVar2, j, j2, j3, j4, f2, drhVar, cavVar2, i3 & 2147483646, i4 & 8190);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bmn(aomyVar, aonnVar, cmwVar, aonnVar2, aonnVar3, aonnVar4, aonnVar5, crdVar, j, j2, j3, j4, f, drhVar, i, i2, 0);
        }
    }

    public static /* synthetic */ defpackage.aojh j(defpackage.diq diqVar) {
        defpackage.dfb.s(diqVar);
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh k(defpackage.diq diqVar) {
        diqVar.a(defpackage.din.A, new defpackage.dib(0));
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh l(btt bttVar, defpackage.aomy aomyVar) {
        if (!bttVar.m()) {
            aomyVar.a();
        }
        return defpackage.aojh.a;
    }

    public pf(byte[] bArr) {
    }
}
