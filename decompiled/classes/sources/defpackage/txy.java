package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class txy {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcAvailability");
    public final android.content.pm.PackageManager b;
    public final defpackage.aoin c;
    private final android.content.Context d;
    private final defpackage.aolr e;
    private final defpackage.afcg f;
    private final defpackage.aoin g;

    public txy(android.content.Context context, defpackage.aolr aolrVar, android.content.pm.PackageManager packageManager, defpackage.afcg afcgVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (packageManager == null) {
            defpackage.aooh.i("packageManager");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("minSsbgAppVersionCodeWithOnDeviceGrpc");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableAttributionSource");
        }
        this.d = context;
        this.e = aolrVar;
        this.b = packageManager;
        this.f = afcgVar;
        this.c = aoinVar;
        this.g = aoinVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        txx txxVar;
        long j;
        if (aolnVar instanceof txx) {
            txxVar = (txx) aolnVar;
            int i = txxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                txxVar.c = i - Integer.MIN_VALUE;
            } else {
                txxVar = new txx(this, aolnVar);
            }
        } else {
            txxVar = new txx(this, aolnVar);
        }
        java.lang.Object objC = txxVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = txxVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objC);
                defpackage.afcg afcgVarCa = defpackage.wsc.ca(this.f, this.d, this.g);
                defpackage.akzx akzxVarM = afdf.a.m();
                defpackage.aooh.f(akzxVarM, "builder");
                defpackage.alad aladVarR = akzxVarM.r();
                defpackage.aooh.e(aladVarR, "build(...)");
                txxVar.c = 1;
                objC = afcgVarCa.c((afdf) aladVarR, new defpackage.anph(), txxVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objC);
            }
            j = ((afdg) objC).b;
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).k(e2).l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcAvailability", "getAvailableSessionCount", 83, "SodaOnDeviceGrpcAvailability.kt")).v("Failed to query SODA service status");
            j = 0;
        }
        return new java.lang.Long(j);
    }

    public final java.lang.Object b(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.e, new tlv(this, (defpackage.aoln) null, 16), aolnVar);
    }
}
