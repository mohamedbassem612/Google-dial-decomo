package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sri implements defpackage.abwo {
    final /* synthetic */ defpackage.srl a;

    public sri(defpackage.srl srlVar) {
        this.a = srlVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.abwo
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object b(java.lang.String str, defpackage.aoln aolnVar) {
        srh srhVar;
        if (aolnVar instanceof srh) {
            srhVar = (srh) aolnVar;
            int i = srhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                srhVar.c = i - Integer.MIN_VALUE;
            } else {
                srhVar = new srh(this, aolnVar);
            }
        } else {
            srhVar = new srh(this, aolnVar);
        }
        java.lang.Object objF = srhVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = srhVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objF);
            defpackage.srl srlVar = this.a;
            java.util.Set setAF = defpackage.ajsz.aF(str);
            srhVar.d = str;
            srhVar.c = 1;
            objF = srlVar.f(setAF, srhVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = srhVar.d;
            defpackage.aooc.af(objF);
        }
        return ((java.util.Map) objF).get(str);
    }

    @Override // defpackage.abwo
    public final java.lang.Object c(java.util.Set set, defpackage.aoln aolnVar) {
        return this.a.f(set, aolnVar);
    }

    @Override // defpackage.abwo
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        return this.a.i(null, null, aolnVar);
    }

    @Override // defpackage.abwo
    public final java.lang.Object e(defpackage.ahbq ahbqVar, defpackage.aoln aolnVar) {
        defpackage.srl srlVar = this.a;
        java.lang.Object objAj = defpackage.aoov.aj(srlVar.d, new defpackage.roz(srlVar, ahbqVar, (defpackage.aoln) null, 10), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }
}
