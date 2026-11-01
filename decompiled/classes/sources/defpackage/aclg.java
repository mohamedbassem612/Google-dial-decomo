package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aclg implements defpackage.zzb, defpackage.acle {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.aiof c = defpackage.aiof.i("GnpSdk");
    public final defpackage.achq a;
    private final defpackage.ajct d;
    private final java.lang.String e;
    private final defpackage.aduj f;
    private final defpackage.aoss g;
    private final defpackage.aolr h;

    public aclg(defpackage.acgt acgtVar, defpackage.ajct ajctVar, java.lang.String str, defpackage.aazc aazcVar, defpackage.aduj adujVar, defpackage.aoss aossVar, defpackage.aolr aolrVar) {
        defpackage.aooh.f(acgtVar, "experimentStore");
        defpackage.aooh.f(ajctVar, "executor");
        defpackage.aooh.f(str, "logSourceName");
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(aolrVar, "lightweightContext");
        this.d = ajctVar;
        this.e = str;
        this.f = adujVar;
        this.g = aossVar;
        this.h = aolrVar;
        this.a = new defpackage.achq(acgtVar, ajctVar, adujVar);
        defpackage.zzd.j(this);
        defpackage.aoov.an(aossVar, null, 0, new defpackage.unj(this, (defpackage.aoln) null, 19), 3);
    }

    @Override // defpackage.zzb
    public final void a(defpackage.zzc zzcVar) throws java.io.IOException {
        if (defpackage.angc.c() && !((defpackage.zzd) zzcVar.a).d() && defpackage.aooh.n(this.e, zzcVar.j)) {
            defpackage.aduj adujVar = this.f;
            defpackage.ahpm ahpmVarA = adujVar.a("GrowthKitRastaPlugin_apply");
            try {
                adujVar.e();
                java.lang.String str = zzcVar.i;
                try {
                    defpackage.ajcq ajcqVarD = this.a.d(str, j$.time.Instant.now().toEpochMilli());
                    if (ajcqVarD.isDone()) {
                        java.lang.Object objS = ((defpackage.ajac) ajcqVarD).s();
                        defpackage.aooh.e(objS, "get(...)");
                        java.lang.Iterable iterable = (java.lang.Iterable) objS;
                        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(iterable, 10));
                        java.util.Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(java.lang.Integer.valueOf(((achu) it.next()).a.c));
                        }
                        int[] iArrCm = defpackage.ajsz.cm(arrayList);
                        zzcVar.g(iArrCm);
                        defpackage.aooh.e(java.util.Arrays.toString(iArrCm), "toString(...)");
                    }
                } catch (java.lang.InterruptedException e) {
                    ((defpackage.aiob) ((defpackage.aiob) c.d()).k(e)).y("Could not retrieve experiments for account %s, continuing without adding experiments to log", str);
                } catch (java.util.concurrent.ExecutionException e2) {
                    ((defpackage.aiob) ((defpackage.aiob) c.d()).k(e2)).y("Could not retrieve experiments for account %s, continuing without adding experiments to log", str);
                }
                defpackage.ajsz.ak(ahpmVarA, null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.ajsz.ak(ahpmVarA, th);
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.acle
    public final java.lang.Object b(java.lang.String str, akhn akhnVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.h, new xhb(this, str, akhnVar, (defpackage.aoln) null, 15), aolnVar);
    }

    @Override // defpackage.acle
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.h, new acbt(this, (defpackage.aoln) null, 12), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        defpackage.aclf aclfVar;
        if (aolnVar instanceof defpackage.aclf) {
            aclfVar = (defpackage.aclf) aolnVar;
            int i = aclfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aclfVar.c = i - Integer.MIN_VALUE;
            } else {
                aclfVar = new defpackage.aclf(this, aolnVar);
            }
        } else {
            aclfVar = new defpackage.aclf(this, aolnVar);
        }
        java.lang.Object obj = aclfVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aclfVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                defpackage.ajcq ajcqVarE = this.a.e();
                aclfVar.c = 1;
                if (defpackage.aosv.D(ajcqVarE, aclfVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
            }
        } catch (java.lang.Exception e) {
            ((defpackage.aiob) ((defpackage.aiob) c.d()).k(e)).v("Failed to warm up RastaPlugin cache");
        }
        return defpackage.aojh.a;
    }
}
