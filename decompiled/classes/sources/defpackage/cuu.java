package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cuu extends defpackage.cmv implements defpackage.ddh, defpackage.cun {
    public defpackage.cun a;
    public defpackage.cuq b;
    private defpackage.cuu c;
    private final java.lang.Object d;

    public cuu(defpackage.cun cunVar, defpackage.cuq cuqVar) {
        this.a = cunVar;
        this.b = cuqVar == null ? new defpackage.cuq() : cuqVar;
        this.d = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    private final defpackage.cun i() {
        if (this.D) {
            return e();
        }
        return null;
    }

    @Override // defpackage.cun
    public final long a(long j, long j2, int i) {
        long jA = this.a.a(j, j2, i);
        defpackage.cun cunVarI = i();
        return defpackage.mni.bl(jA, cunVarI != null ? cunVarI.a(defpackage.mni.bl(j, jA), defpackage.mni.aM(j2, jA), i) : 0L);
    }

    @Override // defpackage.cun
    public final long b(long j, int i) {
        defpackage.cun cunVarI = i();
        long jB = cunVarI != null ? cunVarI.b(j, i) : 0L;
        return defpackage.mni.bl(jB, this.a.b(defpackage.mni.aM(j, jB), i));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.cun
    public final java.lang.Object c(long j, long j2, defpackage.aoln aolnVar) {
        cus cusVar;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (aolnVar instanceof cus) {
            cusVar = (cus) aolnVar;
            int i = cusVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cusVar.f = i - Integer.MIN_VALUE;
            } else {
                cusVar = new cus(this, aolnVar);
            }
        } else {
            cusVar = new cus(this, aolnVar);
        }
        cus cusVar2 = cusVar;
        java.lang.Object objC = cusVar2.d;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = cusVar2.f;
        if (i2 != 0) {
            if (i2 == 1) {
                j4 = cusVar2.b;
                j3 = cusVar2.a;
                defpackage.aooc.af(objC);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j7 = cusVar2.c;
                defpackage.aooc.af(objC);
            }
            j6 = ((dpu) objC).a;
            j5 = j7;
            return new dpu(defpackage.mni.bl(j5, j6));
        }
        defpackage.aooc.af(objC);
        defpackage.cun cunVar = this.a;
        cusVar2.a = j;
        cusVar2.b = j2;
        cusVar2.f = 1;
        objC = cunVar.c(j, j2, cusVar2);
        if (objC == aoluVar) {
            return aoluVar;
        }
        j3 = j;
        j4 = j2;
        j5 = ((dpu) objC).a;
        defpackage.cun cunVarI = this.D ? i() : this.c;
        if (cunVarI != null) {
            long j8 = j3;
            long jBl = defpackage.mni.bl(j8, j5);
            long j9 = j4;
            long jAM = defpackage.mni.aM(j9, j5);
            cusVar2.a = j8;
            cusVar2.b = j9;
            cusVar2.c = j5;
            cusVar2.f = 2;
            java.lang.Object objC2 = cunVarI.c(jBl, jAM, cusVar2);
            if (objC2 == aoluVar) {
                return aoluVar;
            }
            objC = objC2;
            j7 = j5;
            j6 = ((dpu) objC).a;
            j5 = j7;
        } else {
            j6 = 0;
        }
        return new dpu(defpackage.mni.bl(j5, j6));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.cun
    public final java.lang.Object d(long j, defpackage.aoln aolnVar) {
        cut cutVar;
        long j2;
        long j3;
        if (aolnVar instanceof cut) {
            cutVar = (cut) aolnVar;
            int i = cutVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cutVar.e = i - Integer.MIN_VALUE;
            } else {
                cutVar = new cut(this, aolnVar);
            }
        } else {
            cutVar = new cut(this, aolnVar);
        }
        java.lang.Object objD = cutVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = cutVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                j = cutVar.a;
                defpackage.aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = cutVar.b;
                defpackage.aooc.af(objD);
            }
            return new dpu(defpackage.mni.bl(j3, ((dpu) objD).a));
        }
        defpackage.aooc.af(objD);
        defpackage.cun cunVarI = i();
        if (cunVarI != null) {
            cutVar.a = j;
            cutVar.e = 1;
            objD = cunVarI.d(j, cutVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            j2 = 0;
        }
        defpackage.cun cunVar = this.a;
        long jAM = defpackage.mni.aM(j, j2);
        cutVar.a = j;
        cutVar.b = j2;
        cutVar.e = 2;
        objD = cunVar.d(jAM, cutVar);
        if (objD != aoluVar) {
            return aoluVar;
        }
        j3 = j2;
        return new dpu(defpackage.mni.bl(j3, ((dpu) objD).a));
        j2 = ((dpu) objD).a;
        defpackage.cun cunVar2 = this.a;
        long jAM2 = defpackage.mni.aM(j, j2);
        cutVar.a = j;
        cutVar.b = j2;
        cutVar.e = 2;
        objD = cunVar2.d(jAM2, cutVar);
        if (objD != aoluVar) {
            return aoluVar;
        }
        j3 = j2;
        return new dpu(defpackage.mni.bl(j3, ((dpu) objD).a));
    }

    @Override // defpackage.ddh
    public final java.lang.Object db() {
        return this.d;
    }

    @Override // defpackage.cmv
    public final void dc() {
        h();
    }

    public final defpackage.cuu e() {
        defpackage.dce dceVar;
        defpackage.ddh ddhVar = null;
        if (!this.D) {
            return null;
        }
        if (!this.t.D) {
            defpackage.cwh.d("visitAncestors called on an unattached node");
        }
        defpackage.cmv cmvVar = this.t.w;
        defpackage.dbk dbkVarA = defpackage.cfo.A(this);
        loop0: while (dbkVarA != null) {
            if ((dbkVarA.v.f.v & 262144) != 0) {
                while (cmvVar != null) {
                    if ((cmvVar.u & 262144) != 0) {
                        defpackage.cmv cmvVarX = cmvVar;
                        defpackage.cfc cfcVar = null;
                        while (cmvVarX != null) {
                            if (cmvVarX instanceof defpackage.ddh) {
                                defpackage.ddh ddhVar2 = (defpackage.ddh) cmvVarX;
                                if (defpackage.aooh.n(this.d, ddhVar2.db()) && defpackage.cfo.o(this, ddhVar2)) {
                                    ddhVar = ddhVar2;
                                    break loop0;
                                }
                            }
                            if ((cmvVarX.u & 262144) != 0 && (cmvVarX instanceof defpackage.dap)) {
                                int i = 0;
                                for (defpackage.cmv cmvVar2 = ((defpackage.dap) cmvVarX).F; cmvVar2 != null; cmvVar2 = cmvVar2.x) {
                                    if ((cmvVar2.u & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cmvVarX = cmvVar2;
                                        } else {
                                            if (cfcVar == null) {
                                                cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                            }
                                            if (cmvVarX != null) {
                                                cfcVar.n(cmvVarX);
                                            }
                                            cfcVar.n(cmvVar2);
                                            cmvVarX = null;
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            cmvVarX = defpackage.cfo.x(cfcVar);
                        }
                    }
                    cmvVar = cmvVar.w;
                }
            }
            dbkVarA = dbkVarA.k();
            cmvVar = (dbkVarA == null || (dceVar = dbkVarA.v) == null) ? null : dceVar.e;
        }
        return (defpackage.cuu) ddhVar;
    }

    public final defpackage.aoss f() {
        defpackage.cuu cuuVarE = e();
        defpackage.aoss aossVarF = cuuVarE != null ? cuuVarE.f() : null;
        return (aossVarF == null || !defpackage.aosv.r(aossVarF)) ? this.b.d : aossVarF;
    }

    public final void g() {
        defpackage.cuq cuqVar = this.b;
        if (cuqVar.a == this) {
            cuqVar.a = null;
            cuqVar.d = null;
            cuqVar.c = defpackage.cuv.a;
        }
    }

    public final void h() {
        defpackage.cuq cuqVar = this.b;
        cuqVar.a = this;
        cuqVar.b = null;
        this.c = null;
        cuqVar.c = new defpackage.bpa(this, 8);
        cuqVar.d = M();
    }

    @Override // defpackage.cmv
    public final void u() {
        defpackage.aomy aomyVar = defpackage.cuv.a;
        defpackage.aoot aootVar = new defpackage.aoot();
        defpackage.den.n(this, new defpackage.clc(aootVar, 9));
        defpackage.cuu cuuVar = (defpackage.cuu) ((defpackage.ddh) aootVar.a);
        this.c = cuuVar;
        this.b.b = cuuVar;
        g();
    }
}
