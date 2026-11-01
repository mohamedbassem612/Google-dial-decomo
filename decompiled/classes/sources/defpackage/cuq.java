package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cuq {
    public defpackage.cuu a;
    public defpackage.cuu b;
    public defpackage.aomy c = new defpackage.bpa(this, 7);
    public defpackage.aoss d;

    public final long a(long j, long j2, int i) {
        defpackage.cun cunVarC = c();
        if (cunVarC != null) {
            return cunVarC.a(j, j2, i);
        }
        return 0L;
    }

    public final long b(long j, int i) {
        defpackage.cun cunVarC = c();
        if (cunVarC != null) {
            return cunVarC.b(j, i);
        }
        return 0L;
    }

    public final defpackage.cun c() {
        defpackage.cuu cuuVar = this.a;
        if (cuuVar != null) {
            return cuuVar.e();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(long j, long j2, defpackage.aoln aolnVar) {
        cuo cuoVar;
        long j3;
        if (aolnVar instanceof cuo) {
            cuoVar = (cuo) aolnVar;
            int i = cuoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cuoVar.c = i - Integer.MIN_VALUE;
            } else {
                cuoVar = new cuo(this, aolnVar);
            }
        } else {
            cuoVar = new cuo(this, aolnVar);
        }
        cuo cuoVar2 = cuoVar;
        java.lang.Object objC = cuoVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = cuoVar2.c;
        if (i2 == 0) {
            defpackage.aooc.af(objC);
            j3 = 0;
            if (c() == null) {
                defpackage.cuu cuuVar = this.b;
                if (cuuVar != null) {
                    cuoVar2.c = 1;
                    objC = cuuVar.c(j, j2, cuoVar2);
                    if (objC == aoluVar) {
                        return aoluVar;
                    }
                    j3 = ((dpu) objC).a;
                }
            } else {
                defpackage.cun cunVarC = c();
                if (cunVarC != null) {
                    cuoVar2.c = 2;
                    objC = cunVarC.c(j, j2, cuoVar2);
                    if (objC == aoluVar) {
                        return aoluVar;
                    }
                    j3 = ((dpu) objC).a;
                }
            }
        } else if (i2 == 1) {
            defpackage.aooc.af(objC);
            j3 = ((dpu) objC).a;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objC);
            j3 = ((dpu) objC).a;
        }
        return new dpu(j3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(long j, defpackage.aoln aolnVar) {
        cup cupVar;
        long j2;
        if (aolnVar instanceof cup) {
            cupVar = (cup) aolnVar;
            int i = cupVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cupVar.c = i - Integer.MIN_VALUE;
            } else {
                cupVar = new cup(this, aolnVar);
            }
        } else {
            cupVar = new cup(this, aolnVar);
        }
        java.lang.Object objD = cupVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = cupVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.cun cunVarC = c();
            if (cunVarC != null) {
                cupVar.c = 1;
                objD = cunVarC.d(j, cupVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            } else {
                j2 = 0;
            }
            return new dpu(j2);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objD);
        j2 = ((dpu) objD).a;
        return new dpu(j2);
    }

    public final defpackage.aoss f() {
        defpackage.aoss aossVar = (defpackage.aoss) this.c.a();
        return aossVar == null ? defpackage.cuv.b : aossVar;
    }
}
