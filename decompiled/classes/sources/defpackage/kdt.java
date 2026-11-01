package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kdt implements defpackage.abwo {
    final /* synthetic */ defpackage.kdw a;

    public kdt(defpackage.kdw kdwVar) {
        this.a = kdwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(long j, defpackage.aoln aolnVar) {
        kds kdsVar;
        if (aolnVar instanceof kds) {
            kdsVar = (kds) aolnVar;
            int i = kdsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kdsVar.d = i - Integer.MIN_VALUE;
            } else {
                kdsVar = new kds(this, aolnVar);
            }
        } else {
            kdsVar = new kds(this, aolnVar);
        }
        java.lang.Object objG = kdsVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = kdsVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objG);
            defpackage.kdw kdwVar = this.a;
            java.util.Set setAF = defpackage.ajsz.aF(new java.lang.Long(j));
            kdsVar.a = j;
            kdsVar.d = 1;
            objG = kdwVar.g(setAF, kdsVar);
            if (objG == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = kdsVar.a;
            defpackage.aooc.af(objG);
        }
        return ((java.util.Map) objG).get(new java.lang.Long(j));
    }

    @Override // defpackage.abwo
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj, defpackage.aoln aolnVar) {
        return a(((java.lang.Number) obj).longValue(), aolnVar);
    }

    @Override // defpackage.abwo
    public final java.lang.Object c(java.util.Set set, defpackage.aoln aolnVar) {
        return this.a.g(set, aolnVar);
    }

    @Override // defpackage.abwo
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        return this.a.j(null, aolnVar);
    }

    @Override // defpackage.abwo
    public final java.lang.Object e(defpackage.ahbq ahbqVar, defpackage.aoln aolnVar) {
        defpackage.kdw kdwVar = this.a;
        java.lang.Object objAj = defpackage.aoov.aj(kdwVar.d, new kdr(kdwVar, ahbqVar, (defpackage.aoln) null, 0), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }
}
