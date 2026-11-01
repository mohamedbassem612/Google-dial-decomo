package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class txp implements defpackage.twi {
    final /* synthetic */ defpackage.txv a;
    private defpackage.txv b;

    public txp(defpackage.txv txvVar, defpackage.txv txvVar2) {
        this.a = txvVar;
        this.b = txvVar2;
    }

    @Override // defpackage.twi
    public final ajcq a(akzc akzcVar) {
        aooh.f(akzcVar, "input");
        defpackage.txm txmVar = new defpackage.txm(this, akzcVar, (aoln) null, 0);
        defpackage.txv txvVar = this.a;
        return aosv.C(ahvr.ag(txvVar.d, txvVar.q, txmVar));
    }

    @Override // defpackage.twi
    public final ajcq b() {
        defpackage.txv txvVar = this.a;
        ruc rucVar = txvVar.g;
        j$.util.Optional optionalA = rucVar.a();
        aooh.e(optionalA, "startLocalTimer(...)");
        aeun aeunVar = (aeun) aooh.q(optionalA);
        j$.util.Optional optionalA2 = rucVar.a();
        aooh.e(optionalA2, "startLocalTimer(...)");
        aeun aeunVar2 = (aeun) aooh.q(optionalA2);
        ajcq ajcqVarC = aosv.C(ahvr.ag(txvVar.d, txvVar.q, new defpackage.txf(this, (aoln) null, 3, (byte[]) null)));
        if (aeunVar != null) {
            rucVar.p(aeunVar, ruc.bS);
        }
        if (aeunVar2 != null) {
            rucVar.p(aeunVar2, ruc.bU);
        }
        return ajcqVarC;
    }

    @Override // defpackage.twi
    public final java.lang.Object c(akzc akzcVar, aoln aolnVar) {
        defpackage.txm txmVar = new defpackage.txm(this, akzcVar, (aoln) null, 1, (byte[]) null);
        defpackage.txv txvVar = this.a;
        java.lang.Object objA = ahvr.ag(txvVar.d, txvVar.q, txmVar).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.twi
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.txn txnVar;
        aeun aeunVar;
        aeun aeunVar2;
        if (aolnVar instanceof defpackage.txn) {
            txnVar = (defpackage.txn) aolnVar;
            int i = txnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                txnVar.c = i - Integer.MIN_VALUE;
            } else {
                txnVar = new defpackage.txn(this, aolnVar);
            }
        } else {
            txnVar = new defpackage.txn(this, aolnVar);
        }
        java.lang.Object obj = txnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = txnVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.txv txvVar = this.a;
            ruc rucVar = txvVar.g;
            j$.util.Optional optionalA = rucVar.a();
            aooh.e(optionalA, "startLocalTimer(...)");
            aeun aeunVar3 = (aeun) aooh.q(optionalA);
            j$.util.Optional optionalA2 = rucVar.a();
            aooh.e(optionalA2, "startLocalTimer(...)");
            aeun aeunVar4 = (aeun) aooh.q(optionalA2);
            aosy aosyVarAg = ahvr.ag(txvVar.d, txvVar.q, new defpackage.txf(this, (aoln) null, 2));
            txnVar.d = aeunVar3;
            txnVar.e = aeunVar4;
            txnVar.c = 1;
            if (aosyVarAg.a(txnVar) == aoluVar) {
                return aoluVar;
            }
            aeunVar = aeunVar4;
            aeunVar2 = aeunVar3;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aeunVar = txnVar.e;
            aeunVar2 = txnVar.d;
            aooc.af(obj);
        }
        if (aeunVar2 != null) {
            this.a.g.p(aeunVar2, ruc.bS);
        }
        if (aeunVar != null) {
            this.a.g.p(aeunVar, ruc.bU);
        }
        return aojh.a;
    }

    @Override // defpackage.twi
    public final java.lang.Object e(defpackage.twh twhVar, aoln aolnVar) {
        defpackage.txv txvVar = this.a;
        java.lang.Object objA = ahvr.ag(txvVar.d, txvVar.q, new roz(txvVar, twhVar, (aoln) null, 20)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final java.lang.Object f(akzc akzcVar, aoln aolnVar) {
        defpackage.txv txvVar = this.b;
        if (txvVar == null) {
            throw new java.lang.IllegalArgumentException("Controller already stopped, can't add data.");
        }
        java.lang.Object objAj = aoov.aj(txvVar.f, new defpackage.tyf(txvVar, akzcVar, (aoln) null, 1), aolnVar);
        aolu aoluVar = aolu.a;
        if (objAj != aoluVar) {
            objAj = aojh.a;
        }
        return objAj != aoluVar ? aojh.a : objAj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.txo txoVar;
        if (aolnVar instanceof defpackage.txo) {
            txoVar = (defpackage.txo) aolnVar;
            int i = txoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                txoVar.c = i - Integer.MIN_VALUE;
            } else {
                txoVar = new defpackage.txo(this, aolnVar);
            }
        } else {
            txoVar = new defpackage.txo(this, aolnVar);
        }
        java.lang.Object obj = txoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = txoVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.txv txvVar = this.b;
            if (txvVar != null) {
                txoVar.c = 1;
                if (txvVar.e(txoVar) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(obj);
        this.b = null;
        return aojh.a;
    }
}
