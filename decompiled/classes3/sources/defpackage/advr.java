package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class advr implements defpackage.advd {
    private static final aiof a = aiof.i("GnpSdk");
    private final defpackage.akxm b;

    public advr(defpackage.akxm akxmVar, aolr aolrVar) {
        aooh.f(aolrVar, "blockingContext");
        this.b = akxmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.advd
    public final java.lang.Object a(android.content.Intent intent, defpackage.aduc aducVar, long j, aoln aolnVar) {
        defpackage.advq advqVar;
        if (aolnVar instanceof defpackage.advq) {
            advqVar = (defpackage.advq) aolnVar;
            int i = advqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                advqVar.c = i - Integer.MIN_VALUE;
            } else {
                advqVar = new defpackage.advq(this, aolnVar);
            }
        } else {
            advqVar = new defpackage.advq(this, aolnVar);
        }
        java.lang.Object obj = advqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = advqVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.akxm akxmVar = this.b;
                akti aktiVar = akti.f;
                advqVar.c = 1;
                if (akxmVar.f(aktiVar, advqVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
        } catch (java.lang.Exception e) {
            hgb.b(a.c(), "Failed scheduling registration", e);
        }
        return aojh.a;
    }
}
