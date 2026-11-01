package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jag implements aono {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ jag(java.lang.Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aomy, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.$cid;
        if (i == 0) {
            boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            cav cavVar = (cav) obj2;
            int iIntValue = ((java.lang.Integer) obj3).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != cavVar.C(zBooleanValue) ? 2 : 4;
            }
            if (!cavVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
                cavVar.s();
            } else if (zBooleanValue) {
                cavVar.u(1888502891);
                java.lang.Object objG = cavVar.g();
                if (objG == cau.a) {
                    objG = new jaf(2);
                    cavVar.w(objG);
                }
                defpackage.hhe.l(null, (aomy) objG, aehj.aL(defpackage.abja.dS, cavVar), dfa.f(2132019839, cavVar), cavVar, 48);
                cavVar.o();
            } else {
                java.lang.Object obj4 = this.b;
                cavVar.u(1888765151);
                boolean zD = cavVar.D(obj4);
                java.lang.Object objG2 = cavVar.g();
                if (zD || objG2 == cau.a) {
                    objG2 = new defpackage.jaj(obj4, 1);
                    cavVar.w(objG2);
                }
                defpackage.hhe.n(null, (aomy) objG2, this.a, cavVar, 0);
                cavVar.o();
            }
            return aojh.a;
        }
        if (i == 1) {
            cmw cmwVar = (cmw) obj;
            cav cavVar2 = (cav) obj2;
            ((java.lang.Integer) obj3).intValue();
            cavVar2.u(-196777734);
            final long j = ((bme) cavVar2.e(bmf.a)).a;
            boolean zA = cavVar2.A(j);
            final ?? r6 = this.b;
            boolean zB = zA | cavVar2.B((java.lang.Object) r6);
            final boolean z = this.a;
            boolean zC = zB | cavVar2.C(z);
            java.lang.Object objG3 = cavVar2.g();
            if (zC || objG3 == cau.a) {
                objG3 = new aonj() { // from class: bjw
                    public final java.lang.Object a(java.lang.Object obj5) {
                        defpackage.cnw cnwVar = (defpackage.cnw) obj5;
                        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cnwVar.n() >> 32)) / 2.0f;
                        float fCeil = (float) java.lang.Math.ceil(fIntBitsToFloat);
                        cpu cpuVarB = defpackage.akf.c;
                        cqf cqfVarB = defpackage.akf.a;
                        csh cshVar = defpackage.akf.b;
                        int i2 = ((int) fCeil) << 1;
                        if (cpuVarB == null || cqfVarB == null || i2 > cpuVarB.c() || i2 > cpuVarB.b()) {
                            cpuVarB = cqp.b(i2, i2, 1);
                            defpackage.akf.c = cpuVarB;
                            cqfVarB = cpr.b(cpuVarB);
                            defpackage.akf.a = cqfVarB;
                        }
                        cqf cqfVar = cqfVarB;
                        if (cshVar == null) {
                            cshVar = new csh();
                            defpackage.akf.b = cshVar;
                        }
                        csh cshVar2 = cshVar;
                        boolean z2 = z;
                        aomy aomyVar = r6;
                        long j2 = j;
                        dpq dpqVarO = cnwVar.o();
                        float fC = cpuVarB.c();
                        float fB = cpuVarB.b();
                        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fC);
                        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fB);
                        csf csfVar = cshVar2.a;
                        dpf dpfVar = csfVar.a;
                        dpq dpqVar = csfVar.b;
                        cqf cqfVar2 = csfVar.c;
                        long j3 = csfVar.d;
                        csfVar.a = cnwVar;
                        csfVar.b = dpqVarO;
                        csfVar.c = cqfVar;
                        csfVar.d = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L);
                        cqfVar.g();
                        den.J(cshVar2, -72057594037927936L, den.I(cshVar2), 0.0f, (cqh) null, 58);
                        den.J(cshVar2, -72057594037927936L, (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32), 0.0f, (cqh) null, 120);
                        den.R(cshVar2, -72057594037927936L, fIntBitsToFloat, (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (den) null, 120);
                        cqfVar.e();
                        csfVar.a = dpfVar;
                        csfVar.b = dpqVar;
                        csfVar.c = cqfVar2;
                        csfVar.d = j3;
                        return cnwVar.q(new defpackage.bjx(aomyVar, z2, cpuVarB, new cqa(j2, 5), 0));
                    }
                };
                cavVar2.w(objG3);
            }
            cmw cmwVarL = ru.l(cmwVar, (aonj) objG3);
            cavVar2.o();
            return cmwVarL;
        }
        defpackage.jac jacVar = (defpackage.jac) obj;
        cav cavVar3 = (cav) obj2;
        int iIntValue2 = ((java.lang.Integer) obj3).intValue();
        aooh.f(jacVar, "currentState");
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= true != cavVar3.z(jacVar.ordinal()) ? 2 : 4;
        }
        if (!cavVar3.H((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
            cavVar3.s();
        } else if (jacVar != defpackage.jac.a || this.a) {
            java.lang.Object obj5 = this.b;
            cavVar3.u(-975471107);
            boolean zD2 = cavVar3.D(obj5);
            java.lang.Object objG4 = cavVar3.g();
            if (zD2 || objG4 == cau.a) {
                objG4 = new defpackage.hll(obj5, 20);
                cavVar3.w(objG4);
            }
            defpackage.hhe.q(null, (aomy) objG4, cavVar3, 0);
            cavVar3.o();
        } else {
            cavVar3.u(-975718580);
            abrz.k(dfa.f(2132019832, cavVar3), den.aZ(cmw.c, 8.0f, 0.0f), 0L, 0L, (dnd) null, (dmq) null, 0L, new dot(3), 0L, 0, false, 0, 0, (aonj) null, den.an(cavVar3).g, cavVar3, 48, 0, 130044);
            cavVar3.o();
        }
        return aojh.a;
    }

    public /* synthetic */ jag(boolean z, aii aiiVar, int i) {
        this.$cid = i;
        this.a = z;
        this.b = aiiVar;
    }
}
