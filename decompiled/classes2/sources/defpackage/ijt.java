package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ijt {
    public final aolr a;
    public akzx b;
    public final ahda c;

    public ijt(aolr aolrVar) {
        aooh.f(aolrVar, "lightweightContext");
        this.a = aolrVar;
        this.c = new ahda((byte[]) null);
        akzx akzxVarM = amoi.a.m();
        aooh.e(akzxVarM, "newBuilder(...)");
        this.b = akzxVarM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.ijr ijrVar;
        if (aolnVar instanceof defpackage.ijr) {
            ijrVar = (defpackage.ijr) aolnVar;
            int i = ijrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ijrVar.c = i - Integer.MIN_VALUE;
            } else {
                ijrVar = new defpackage.ijr(this, aolnVar);
            }
        } else {
            ijrVar = new defpackage.ijr(this, aolnVar);
        }
        java.lang.Object objAj = ijrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ijrVar.c;
        if (i2 == 0) {
            aooc.af(objAj);
            aolr aolrVar = this.a;
            defpackage.dqx dqxVar = new defpackage.dqx(this, (aoln) null, 13);
            ijrVar.c = 1;
            objAj = aoov.aj(aolrVar, dqxVar, ijrVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAj);
        }
        aooh.e(objAj, "withContext(...)");
        return objAj;
    }
}
