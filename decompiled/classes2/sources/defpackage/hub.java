package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hub implements defpackage.htw {
    public static final adde a;
    public final android.content.Context b;
    public final java.util.concurrent.Executor c;
    public final aolr d;
    public final xtq e;
    private final aonj f;

    static {
        akzx akzxVarM = akwo.b.m();
        akzxVarM.u();
        akzxVarM.b.d = 0;
        a = new adde(120559099, akzxVarM.p());
    }

    public hub(android.content.Context context, java.util.concurrent.Executor executor, aolr aolrVar, xtq xtqVar) {
        aooh.f(context, "context");
        aooh.f(executor, "lightweightExecutor");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(xtqVar, "policyEvaluator");
        this.b = context;
        this.c = executor;
        this.d = aolrVar;
        this.e = xtqVar;
        this.f = new aiuo(new defpackage.blq(this, (aoln) null, 7));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.htw
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.hua huaVar;
        if (aolnVar instanceof defpackage.hua) {
            huaVar = (defpackage.hua) aolnVar;
            int i = huaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                huaVar.c = i - Integer.MIN_VALUE;
            } else {
                huaVar = new defpackage.hua(this, aolnVar);
            }
        } else {
            huaVar = new defpackage.hua(this, aolnVar);
        }
        java.lang.Object objA = huaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = huaVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objA);
                aonj aonjVar = this.f;
                huaVar.c = 1;
                objA = aonjVar.a(huaVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            return (defpackage.qa) objA;
        } catch (java.lang.Throwable th) {
            return aooc.ae(th);
        }
    }
}
