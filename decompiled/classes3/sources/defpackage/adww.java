package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adww implements defpackage.advd {
    private static final aiof a = aiof.i("GnpSdk");
    private final defpackage.akxm b;

    public adww(defpackage.akxm akxmVar, aolr aolrVar) {
        aooh.f(aolrVar, "blockingContext");
        this.b = akxmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.advd
    public final java.lang.Object a(android.content.Intent intent, defpackage.aduc aducVar, long j, aoln aolnVar) {
        defpackage.adwv adwvVar;
        if (aolnVar instanceof defpackage.adwv) {
            adwvVar = (defpackage.adwv) aolnVar;
            int i = adwvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adwvVar.c = i - Integer.MIN_VALUE;
            } else {
                adwvVar = new defpackage.adwv(this, aolnVar);
            }
        } else {
            adwvVar = new defpackage.adwv(this, aolnVar);
        }
        java.lang.Object obj = adwvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = adwvVar.c;
        try {
            if (i2 == 0 || i2 == 1) {
                aooc.af(obj);
                defpackage.akxm akxmVar = this.b;
                akti aktiVar = akti.c;
                adwvVar.c = 2;
                if (akxmVar.f(aktiVar, adwvVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 2) {
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
