package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adws implements defpackage.advd {
    public static final aiof a = aiof.i("GnpSdk");
    private final defpackage.akxm b;

    public adws(defpackage.akxm akxmVar, aolr aolrVar) {
        aooh.f(aolrVar, "blockingContext");
        this.b = akxmVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.advd
    public final java.lang.Object a(android.content.Intent intent, defpackage.aduc aducVar, long j, aoln aolnVar) {
        defpackage.adwq adwqVar;
        if (aolnVar instanceof defpackage.adwq) {
            adwqVar = (defpackage.adwq) aolnVar;
            int i = adwqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adwqVar.c = i - Integer.MIN_VALUE;
            } else {
                adwqVar = new defpackage.adwq(this, aolnVar);
            }
        } else {
            adwqVar = new defpackage.adwq(this, aolnVar);
        }
        java.lang.Object obj = adwqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = adwqVar.c;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    aooc.af(obj);
                    adwqVar.c = 3;
                    if (b(adwqVar) == aoluVar) {
                        return aoluVar;
                    }
                } else if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            aooc.af(obj);
        } else {
            aooc.af(obj);
            if (anfw.c()) {
                nut nutVar = new nut(this, (aoln) null, 13);
                adwqVar.c = 1;
                if (aosv.m(nutVar, adwqVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                adwqVar.c = 3;
                if (b(adwqVar) == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.adwr adwrVar;
        if (aolnVar instanceof defpackage.adwr) {
            adwrVar = (defpackage.adwr) aolnVar;
            int i = adwrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adwrVar.c = i - Integer.MIN_VALUE;
            } else {
                adwrVar = new defpackage.adwr(this, aolnVar);
            }
        } else {
            adwrVar = new defpackage.adwr(this, aolnVar);
        }
        java.lang.Object obj = adwrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = adwrVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.akxm akxmVar = this.b;
                akti aktiVar = akti.b;
                adwrVar.c = 1;
                if (akxmVar.f(aktiVar, adwrVar) == aoluVar) {
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
