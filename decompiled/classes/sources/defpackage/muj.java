package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class muj implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/dobby/impl/feedback/upload/DobbyDonationsWorker");
    public final defpackage.nri b;
    public final defpackage.mnk c;
    public final defpackage.aoin d;
    public final defpackage.aoin e;
    public final defpackage.nnx f;
    public final defpackage.rlv g;
    private final defpackage.aoss h;
    private final defpackage.muf i;

    public muj(defpackage.aoss aossVar, defpackage.aazc aazcVar, defpackage.nri nriVar, defpackage.mnk mnkVar, defpackage.muf mufVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.nnx nnxVar, defpackage.rlv rlvVar) {
        defpackage.aooh.f(aossVar, "backgroundScope");
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(nriVar, "dobbyDatabase");
        defpackage.aooh.f(aoinVar, "callMetricsRetentionPeriodDaysProvider");
        defpackage.aooh.f(aoinVar2, "callMetricsWorkerPeriodicUploadMinsProvider");
        defpackage.aooh.f(rlvVar, "loggingBindings");
        this.h = aossVar;
        this.b = nriVar;
        this.c = mnkVar;
        this.i = mufVar;
        this.d = aoinVar;
        this.e = aoinVar2;
        this.f = nnxVar;
        this.g = rlvVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        return defpackage.aosv.F(this.h, 0, new muh(this, (defpackage.aoln) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(nsp nspVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        mug mugVar;
        if (aolnVar instanceof mug) {
            mugVar = (mug) aolnVar;
            int i = mugVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mugVar.c = i - Integer.MIN_VALUE;
            } else {
                mugVar = new mug(this, aolnVar);
            }
        } else {
            mugVar = new mug(this, aolnVar);
        }
        java.lang.Object objA = mugVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mugVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            defpackage.nri nriVar = this.b;
            defpackage.aify aifyVarBv = defpackage.ahvr.bv(defpackage.ajsz.aY(new java.lang.Long(nspVar.c)));
            mugVar.c = 1;
            objA = nriVar.a(aifyVarBv, mugVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objA);
        }
        if (((java.lang.Number) objA).intValue() <= 0) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b).l("com/android/dialer/dobby/impl/feedback/upload/DobbyDonationsWorker", "clearLogsAssociatedWithSession", 152, "DobbyDonationsWorker.kt")).v("could not delete logs");
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(nsp nspVar, defpackage.aoln aolnVar) {
        mui muiVar;
        if (aolnVar instanceof mui) {
            muiVar = (mui) aolnVar;
            int i = muiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                muiVar.c = i - Integer.MIN_VALUE;
            } else {
                muiVar = new mui(this, aolnVar);
            }
        } else {
            muiVar = new mui(this, aolnVar);
        }
        java.lang.Object objA = muiVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = muiVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            defpackage.muf mufVar = this.i;
            muiVar.c = 1;
            objA = mufVar.a(nspVar, muiVar);
            if (objA != aoluVar) {
            }
            java.lang.Object obj = aoluVar;
            return obj;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objA);
        java.lang.Object obj2 = aoluVar;
        java.lang.Boolean bool = (java.lang.Boolean) objA;
        boolean zBooleanValue = bool.booleanValue();
        obj2 = bool;
        if (!zBooleanValue) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b).l("com/android/dialer/dobby/impl/feedback/upload/DobbyDonationsWorker", "uploadCallDataToScotty", 138, "DobbyDonationsWorker.kt")).v("could not upload metrics");
            obj2 = bool;
        }
        java.lang.Object obj3 = aoluVar;
        return obj3;
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
