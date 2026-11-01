package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ipo {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/backup/impl/BackupImpl");
    public final android.content.Context b;
    public final defpackage.ecx c;
    public final android.content.pm.PackageManager d;
    public final defpackage.aoss e;
    public final defpackage.aolr f;
    public final defpackage.rlv g;
    public final defpackage.aazc h;
    public final defpackage.zzx i;
    public final defpackage.zzx j;
    private final defpackage.aonj k;

    public ipo(android.content.Context context, defpackage.ecx ecxVar, defpackage.zzx zzxVar, android.content.pm.PackageManager packageManager, defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.rlv rlvVar, defpackage.zzx zzxVar2, defpackage.aazc aazcVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (ecxVar == null) {
            defpackage.aooh.i("dataStore");
        }
        if (packageManager == null) {
            defpackage.aooh.i("packageManager");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("logging");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        this.b = context;
        this.c = ecxVar;
        this.i = zzxVar;
        this.d = packageManager;
        this.e = aossVar;
        this.f = aolrVar;
        this.g = rlvVar;
        this.j = zzxVar2;
        this.h = aazcVar;
        this.k = new defpackage.aiuo(new defpackage.ipi(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.iot iotVar, defpackage.aoln aolnVar) {
        ipk ipkVar;
        defpackage.aonj aonjVar;
        if (aolnVar instanceof ipk) {
            ipkVar = (ipk) aolnVar;
            int i = ipkVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ipkVar.d = i - Integer.MIN_VALUE;
            } else {
                ipkVar = new ipk(this, aolnVar);
            }
        } else {
            ipkVar = new ipk(this, aolnVar);
        }
        java.lang.Object objA = ipkVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ipkVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                iotVar = (defpackage.iot) ipkVar.a;
                defpackage.aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aonjVar = (defpackage.aonj) ipkVar.a;
                defpackage.aooc.af(objA);
            }
            return aonjVar.a(objA);
        }
        defpackage.aooc.af(objA);
        defpackage.aonj aonjVar2 = this.k;
        ipkVar.a = iotVar;
        ipkVar.d = 1;
        objA = aonjVar2.a(ipkVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        if (!((java.lang.Boolean) objA).booleanValue()) {
            return java.lang.Boolean.FALSE;
        }
        defpackage.aonj aonjVar3 = iotVar.a;
        defpackage.aoxh aoxhVarB = this.c.b();
        ipkVar.a = aonjVar3;
        ipkVar.d = 2;
        objA = defpackage.aoov.au(aoxhVarB, ipkVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        aonjVar = aonjVar3;
        return aonjVar.a(objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.iot iotVar, defpackage.aoln aolnVar) {
        ipm ipmVar;
        if (aolnVar instanceof ipm) {
            ipmVar = (ipm) aolnVar;
            int i = ipmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ipmVar.c = i - Integer.MIN_VALUE;
            } else {
                ipmVar = new ipm(this, aolnVar);
            }
        } else {
            ipmVar = new ipm(this, aolnVar);
        }
        java.lang.Object obj = ipmVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ipmVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.c;
            defpackage.bpj bpjVar = new defpackage.bpj(iotVar, (defpackage.aoln) null, 6);
            ipmVar.c = 1;
            if (ecxVar.a(bpjVar, ipmVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        this.g.o(defpackage.rmx.RESTORE_FEATURE_RESTORE_COMPLETED);
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [aonj] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final java.lang.Object c(defpackage.iot iotVar, defpackage.aoln aolnVar) {
        ipn ipnVar;
        ?? r4;
        if (aolnVar instanceof ipn) {
            ipnVar = (ipn) aolnVar;
            int i = ipnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ipnVar.d = i - Integer.MIN_VALUE;
            } else {
                ipnVar = new ipn(this, aolnVar);
            }
        } else {
            ipnVar = new ipn(this, aolnVar);
        }
        java.lang.Object objAu = ipnVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ipnVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objAu);
            this.g.o(defpackage.rmx.RESTORE_FEATURE_RESTORE_STARTED);
            defpackage.aonj aonjVar = iotVar.b;
            defpackage.aoxh aoxhVarB = this.c.b();
            ipnVar.a = aonjVar;
            ipnVar.d = 1;
            objAu = defpackage.aoov.au(aoxhVarB, ipnVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
            r4 = aonjVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj = ipnVar.a;
            defpackage.aooc.af(objAu);
            r4 = obj;
        }
        return r4.a(objAu);
    }
}
