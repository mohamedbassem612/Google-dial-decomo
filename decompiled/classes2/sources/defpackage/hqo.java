package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hqo extends aomh implements aono {
    int a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ aozh c;
    final /* synthetic */ aozh d;
    final /* synthetic */ aozh e;
    final /* synthetic */ aozh f;
    final /* synthetic */ defpackage.hqp g;
    private /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqo(aoln aolnVar, aozh aozhVar, aozh aozhVar2, aozh aozhVar3, aozh aozhVar4, defpackage.hqp hqpVar) {
        super(3, aolnVar);
        this.c = aozhVar;
        this.d = aozhVar2;
        this.e = aozhVar3;
        this.f = aozhVar4;
        this.g = hqpVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.hqo hqoVar = new defpackage.hqo((aoln) obj3, this.c, this.d, this.e, this.f, this.g);
        hqoVar.h = (aoxi) obj;
        hqoVar.b = obj2;
        return hqoVar.b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        defpackage.hqg hqgVar;
        ?? r4;
        aozh aozhVar;
        aozh aozhVar2;
        aolu aoluVar = aolu.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                aooc.af(obj);
            } else {
                hqgVar = (defpackage.hqg) this.b;
                java.lang.Object obj3 = this.h;
                aooc.af(obj);
                r4 = obj3;
            }
            return aojh.a;
        }
        aooc.af(obj);
        obj2 = this.h;
        hqgVar = (defpackage.hqg) this.b;
        this.b = hqgVar;
        this.a = 1;
        if (ahre.a((aolr) null, this) == aoluVar) {
            r4 = obj2;
            return aoluVar;
        }
        r4 = obj2;
        boolean z = ahns.a;
        ahpe ahpeVarA = ahns.a();
        ahne ahneVar = ahpeVarA.e;
        if (ahneVar == null) {
            throw new java.lang.IllegalStateException("reactiveTraced should be used within TikTok provided CoroutineContext");
        }
        ahnd ahndVar = ahneVar.b;
        if (ahndVar == ahnd.b) {
            try {
                defpackage.hqh hqhVar = hqgVar.a;
                int iOrdinal = hqhVar.ordinal();
                if (iOrdinal == 1) {
                    aozhVar = this.c;
                } else if (iOrdinal == 2) {
                    aozhVar = this.d;
                } else if (iOrdinal == 3) {
                    aozhVar = this.e;
                } else {
                    if (iOrdinal != 4) {
                        throw new java.lang.IllegalStateException(a.bh(hqhVar, "Invalid tab: "));
                    }
                    aozhVar = this.f;
                }
            } catch (java.lang.Throwable th) {
                ahnn.b(th);
                throw th;
            }
        } else {
            if (ahndVar == ahnd.a) {
                throw new java.lang.IllegalStateException("Already has a manually propagated trace, resuming executor trace may change causality.");
            }
            ahpj ahpjVarB = ahns.b();
            if (ahpjVarB != null && ahpjVarB != ahoo.a && ahpjVarB != ahneVar.c) {
                throw new java.lang.IllegalStateException("Do not call reactiveTraced with the trace present: the reactive pattern should be used in long-lived coroutines to avoid trace leaks, and therefore having the trace present in the coroutine defeats the purpose. See go/tiktok/dev/concurrent/coroutines/tracing#flows");
            }
            ahob ahobVarM = ahpeVarA.d;
            if (ahobVarM == null) {
                ahobVarM = ahob.m(ahpeVarA);
            }
            ahnd ahndVar2 = ahnd.b;
            ahnd ahndVar3 = ahneVar.b;
            if (ahobVarM == ahoo.a) {
                ahndVar2 = ahnd.c;
            }
            ahneVar.b = ahndVar2;
            ahpj ahpjVarD = ahns.d(ahpeVarA, ahobVarM);
            try {
                defpackage.hqh hqhVar2 = hqgVar.a;
                int iOrdinal2 = hqhVar2.ordinal();
                if (iOrdinal2 == 1) {
                    aozhVar2 = this.c;
                } else if (iOrdinal2 == 2) {
                    aozhVar2 = this.d;
                } else if (iOrdinal2 == 3) {
                    aozhVar2 = this.e;
                } else {
                    if (iOrdinal2 != 4) {
                        throw new java.lang.IllegalStateException(a.bh(hqhVar2, "Invalid tab: "));
                    }
                    aozhVar2 = this.f;
                }
                ahns.d(ahns.a(), ahpjVarD);
                ahneVar.b = ahndVar3;
                aozhVar = aozhVar2;
            } catch (java.lang.Throwable th2) {
                try {
                    ahnn.b(th2);
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    ahns.d(ahns.a(), ahpjVarD);
                    ahneVar.b = ahndVar3;
                    throw th3;
                }
            }
        }
        aoxh aoxhVarA = aoyc.a(aozhVar, new defpackage.hqq(this.g, hqgVar, (aoln) null, 1));
        this.h = null;
        this.b = null;
        this.a = 2;
        if (aoov.aG((aoxi) r4, aoxhVarA, this) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }
}
