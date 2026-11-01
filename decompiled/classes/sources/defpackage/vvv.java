package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vvv implements defpackage.aoxi {
    final /* synthetic */ defpackage.vvz a;

    public vvv(defpackage.vvz vvzVar) {
        this.a = vvzVar;
    }

    @Override // defpackage.aoxi
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        return b(aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.vvu vvuVar;
        boolean zBooleanValue;
        java.lang.Object objM;
        if (aolnVar instanceof defpackage.vvu) {
            vvuVar = (defpackage.vvu) aolnVar;
            int i = vvuVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vvuVar.d = i - Integer.MIN_VALUE;
            } else {
                vvuVar = new defpackage.vvu(this, aolnVar);
            }
        } else {
            vvuVar = new defpackage.vvu(this, aolnVar);
        }
        java.lang.Object objAj = vvuVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = vvuVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objAj);
            } else if (i2 == 2) {
                zBooleanValue = vvuVar.a;
                defpackage.aooc.af(objAj);
                defpackage.vvz vvzVar = this.a;
                defpackage.vvt vvtVar = new defpackage.vvt(vvzVar, zBooleanValue, null);
                vvuVar.d = 3;
                objM = defpackage.aosv.m(new defpackage.pzf(vvzVar, vvtVar, (defpackage.aoln) null, 5), vvuVar);
                if (objM != aoluVar) {
                    objM = defpackage.aojh.a;
                }
                if (objM == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objAj);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objAj);
        defpackage.vvz vvzVar2 = this.a;
        vvuVar.d = 1;
        objAj = defpackage.aoov.aj(vvzVar2.f, new defpackage.vvy(vvzVar2, null), vvuVar);
        if (objAj == aoluVar) {
            return aoluVar;
        }
        zBooleanValue = ((java.lang.Boolean) objAj).booleanValue();
        defpackage.vvz vvzVar3 = this.a;
        vvuVar.a = zBooleanValue;
        vvuVar.d = 2;
        if (vvzVar3.b(zBooleanValue, vvuVar) == aoluVar) {
            return aoluVar;
        }
        defpackage.vvz vvzVar4 = this.a;
        defpackage.vvt vvtVar2 = new defpackage.vvt(vvzVar4, zBooleanValue, null);
        vvuVar.d = 3;
        objM = defpackage.aosv.m(new defpackage.pzf(vvzVar4, vvtVar2, (defpackage.aoln) null, 5), vvuVar);
        if (objM != aoluVar) {
            objM = defpackage.aojh.a;
        }
        if (objM == aoluVar) {
            return aoluVar;
        }
        return defpackage.aojh.a;
    }
}
