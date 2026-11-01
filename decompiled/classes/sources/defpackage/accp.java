package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class accp implements defpackage.acck {
    public static final j$.time.Duration a;
    public final defpackage.amwu b;
    public final defpackage.amwu c;
    public final defpackage.aolr d;
    public final android.content.Context e;
    public final defpackage.adzf f;
    public final defpackage.adzf g;
    public final defpackage.adzf h;
    public final defpackage.adzf i;
    private final defpackage.amwu j;

    static {
        defpackage.aiof.i("GnpSdk");
        j$.time.Duration durationOfDays = j$.time.Duration.ofDays(1L);
        defpackage.aooh.e(durationOfDays, "ofDays(...)");
        a = durationOfDays;
    }

    public accp(defpackage.amwu amwuVar, defpackage.amwu amwuVar2, defpackage.amwu amwuVar3, defpackage.aolr aolrVar, android.content.Context context, java.util.Map map, defpackage.aazc aazcVar, defpackage.aduu aduuVar, defpackage.achv achvVar) {
        defpackage.aooh.f(amwuVar, "gnpJobSchedulingApi");
        defpackage.aooh.f(amwuVar2, "syncDataStore");
        defpackage.aooh.f(amwuVar3, "syncStateProvider");
        defpackage.aooh.f(aolrVar, "backgroundContext");
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(aduuVar, "gnpConfig");
        defpackage.aooh.f(achvVar, "promotionSync");
        this.b = amwuVar;
        this.c = amwuVar2;
        this.j = amwuVar3;
        this.d = aolrVar;
        this.e = context;
        defpackage.aoin aoinVar = (defpackage.aoin) map.get("GK_ONEOFF_SYNC");
        defpackage.adzf adzfVar = aoinVar != null ? (defpackage.adzf) aoinVar.a() : null;
        if (adzfVar == null) {
            throw new java.lang.IllegalArgumentException("One-off sync job was null");
        }
        this.f = adzfVar;
        defpackage.aoin aoinVar2 = (defpackage.aoin) map.get("GK_PERIODIC_SYNC");
        defpackage.adzf adzfVar2 = aoinVar2 != null ? (defpackage.adzf) aoinVar2.a() : null;
        if (adzfVar2 == null) {
            throw new java.lang.IllegalArgumentException("Periodic sync job was null");
        }
        this.g = adzfVar2;
        defpackage.aoin aoinVar3 = (defpackage.aoin) map.get("GK_STORAGE_CLEANUP");
        defpackage.adzf adzfVar3 = aoinVar3 != null ? (defpackage.adzf) aoinVar3.a() : null;
        if (adzfVar3 == null) {
            throw new java.lang.IllegalArgumentException("Storage cleanup job was null");
        }
        this.h = adzfVar3;
        defpackage.aoin aoinVar4 = (defpackage.aoin) map.get("GK_PERMISSIONS_STATE_LOGGING");
        this.i = aoinVar4 != null ? (defpackage.adzf) aoinVar4.a() : null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.accl acclVar, defpackage.aoln aolnVar) {
        accn accnVar;
        if (aolnVar instanceof accn) {
            accnVar = (accn) aolnVar;
            int i = accnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                accnVar.c = i - Integer.MIN_VALUE;
            } else {
                accnVar = new accn(this, aolnVar);
            }
        } else {
            accnVar = new accn(this, aolnVar);
        }
        accn accnVar2 = accnVar;
        java.lang.Object objS = accnVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = accnVar2.c;
        if (i2 == 0) {
            defpackage.aooc.af(objS);
            if (acclVar != defpackage.accl.b && defpackage.angy.a.eZ().g()) {
                defpackage.accl acclVar2 = defpackage.accl.c;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("ENFORCE_SYNC_KEY", acclVar == acclVar2);
                java.lang.Object objA = this.b.a();
                defpackage.aooh.e(objA, "get(...)");
                defpackage.adzf adzfVar = this.f;
                accnVar2.c = 1;
                objS = defpackage.aesg.s((defpackage.adzh) objA, adzfVar, null, bundle, null, accnVar2, 26);
                if (objS == aoluVar) {
                    return aoluVar;
                }
            }
            return defpackage.aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objS);
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v7, types: [adzh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [adzh] */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        acco accoVar;
        defpackage.adzh adzhVar;
        ?? r0;
        ?? r1;
        defpackage.adzf adzfVar;
        if (aolnVar instanceof acco) {
            accoVar = (acco) aolnVar;
            int i = accoVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                accoVar.d = i - Integer.MIN_VALUE;
            } else {
                accoVar = new acco(this, aolnVar);
            }
        } else {
            accoVar = new acco(this, aolnVar);
        }
        acco accoVar2 = accoVar;
        java.lang.Object objS = accoVar2.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = accoVar2.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj = accoVar2.a;
                defpackage.aooc.af(objS);
                r0 = obj;
            } else {
                if (i2 == 2) {
                    java.lang.Object obj2 = accoVar2.a;
                    defpackage.aooc.af(objS);
                    r1 = obj2;
                    adzfVar = this.i;
                    if (adzfVar != null) {
                        accoVar2.a = null;
                        accoVar2.d = 3;
                        objS = defpackage.aesg.s(r1, adzfVar, null, null, null, accoVar2, 30);
                        if (objS == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return defpackage.aojh.a;
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objS);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objS);
        java.lang.Object objA = this.b.a();
        defpackage.aooh.e(objA, "get(...)");
        adzhVar = (defpackage.adzh) objA;
        defpackage.adzf adzfVar2 = this.g;
        accoVar2.a = adzhVar;
        accoVar2.d = 1;
        objS = defpackage.aesg.s(adzhVar, adzfVar2, null, null, null, accoVar2, 30);
        if (objS == aoluVar) {
            r0 = adzhVar;
            return aoluVar;
        }
        r0 = adzhVar;
        defpackage.adzf adzfVar3 = this.h;
        accoVar2.a = r0;
        accoVar2.d = 2;
        objS = defpackage.aesg.s(r0, adzfVar3, null, null, null, accoVar2, 30);
        r1 = r0;
        if (objS == aoluVar) {
            return aoluVar;
        }
        adzfVar = this.i;
        if (adzfVar != null) {
            accoVar2.a = null;
            accoVar2.d = 3;
            objS = defpackage.aesg.s(r1, adzfVar, null, null, null, accoVar2, 30);
            if (objS == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        defpackage.accm accmVar;
        if (aolnVar instanceof defpackage.accm) {
            accmVar = (defpackage.accm) aolnVar;
            int i = accmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                accmVar.c = i - Integer.MIN_VALUE;
            } else {
                accmVar = new defpackage.accm(this, aolnVar);
            }
        } else {
            accmVar = new defpackage.accm(this, aolnVar);
        }
        java.lang.Object obj = accmVar.a;
        int i2 = accmVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            return defpackage.accl.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            defpackage.aooc.af(obj);
            return ((defpackage.adtz) obj).i() ? defpackage.accl.b : defpackage.accl.c;
        } finally {
            ((afpl) this.j.a()).x();
        }
    }
}
