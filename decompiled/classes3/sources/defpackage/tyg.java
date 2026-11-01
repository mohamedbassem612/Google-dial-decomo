package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tyg implements defpackage.twi {
    public final defpackage.typ a;
    final /* synthetic */ defpackage.typ b;

    public tyg(defpackage.typ typVar, defpackage.typ typVar2) {
        this.b = typVar;
        this.a = typVar2;
    }

    @Override // defpackage.twi
    public final ajcq a(akzc akzcVar) {
        aooh.f(akzcVar, "input");
        defpackage.txm txmVar = new defpackage.txm(this, akzcVar, (aoln) null, 4, (byte[]) null);
        defpackage.typ typVar = this.b;
        return aosv.C(ahvr.ag(typVar.d, typVar.z, txmVar));
    }

    @Override // defpackage.twi
    public final ajcq b() {
        defpackage.typ typVar = this.b;
        ruc rucVar = typVar.h;
        j$.util.Optional optionalA = rucVar.a();
        aooh.e(optionalA, "startLocalTimer(...)");
        aeun aeunVar = (aeun) aooh.q(optionalA);
        j$.util.Optional optionalA2 = rucVar.a();
        aooh.e(optionalA2, "startLocalTimer(...)");
        aeun aeunVar2 = (aeun) aooh.q(optionalA2);
        ajcq ajcqVarC = aosv.C(ahvr.ag(typVar.d, typVar.z, new defpackage.txf(this, (aoln) null, 7, (byte[]) null)));
        if (aeunVar != null) {
            rucVar.p(aeunVar, ruc.bQ);
        }
        if (aeunVar2 != null) {
            rucVar.p(aeunVar2, ruc.bU);
        }
        return ajcqVarC;
    }

    @Override // defpackage.twi
    public final java.lang.Object c(akzc akzcVar, aoln aolnVar) {
        defpackage.txm txmVar = new defpackage.txm(this, akzcVar, (aoln) null, 3);
        defpackage.typ typVar = this.b;
        java.lang.Object objA = ahvr.ag(typVar.d, typVar.z, txmVar).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.twi
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.tye tyeVar;
        aeun aeunVar;
        aeun aeunVar2;
        if (aolnVar instanceof defpackage.tye) {
            tyeVar = (defpackage.tye) aolnVar;
            int i = tyeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tyeVar.c = i - Integer.MIN_VALUE;
            } else {
                tyeVar = new defpackage.tye(this, aolnVar);
            }
        } else {
            tyeVar = new defpackage.tye(this, aolnVar);
        }
        java.lang.Object obj = tyeVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tyeVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.typ typVar = this.b;
            ruc rucVar = typVar.h;
            j$.util.Optional optionalA = rucVar.a();
            aooh.e(optionalA, "startLocalTimer(...)");
            aeun aeunVar3 = (aeun) aooh.q(optionalA);
            j$.util.Optional optionalA2 = rucVar.a();
            aooh.e(optionalA2, "startLocalTimer(...)");
            aeun aeunVar4 = (aeun) aooh.q(optionalA2);
            aosy aosyVarAg = ahvr.ag(typVar.d, typVar.z, new defpackage.txf(this, (aoln) null, 6));
            tyeVar.d = aeunVar3;
            tyeVar.e = aeunVar4;
            tyeVar.c = 1;
            if (aosyVarAg.a(tyeVar) == aoluVar) {
                return aoluVar;
            }
            aeunVar = aeunVar4;
            aeunVar2 = aeunVar3;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aeunVar = tyeVar.e;
            aeunVar2 = tyeVar.d;
            aooc.af(obj);
        }
        if (aeunVar2 != null) {
            this.b.h.p(aeunVar2, ruc.bQ);
        }
        if (aeunVar != null) {
            this.b.h.p(aeunVar, ruc.bU);
        }
        return aojh.a;
    }

    @Override // defpackage.twi
    public final java.lang.Object e(defpackage.twh twhVar, aoln aolnVar) {
        defpackage.typ typVar = this.b;
        java.lang.Object objA = ahvr.ag(typVar.d, typVar.z, new defpackage.tyf(typVar, twhVar, (aoln) null, 0)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }
}
