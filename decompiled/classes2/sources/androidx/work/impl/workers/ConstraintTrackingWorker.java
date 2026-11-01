package androidx.work.impl.workers;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ConstraintTrackingWorker extends androidx.work.CoroutineWorker {
    private final androidx.work.WorkerParameters d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        aooh.f(context, "appContext");
        aooh.f(workerParameters, "workerParameters");
        this.d = workerParameters;
    }

    public final java.lang.Object c(aoln aolnVar) {
        return aoov.aj(aooc.ac(h()), new dmu(this, (aoln) null, 9), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.Object k(aoln aolnVar) {
        defpackage.gyx gyxVar;
        int iE;
        if (aolnVar instanceof defpackage.gyx) {
            gyxVar = (defpackage.gyx) aolnVar;
            int i = gyxVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gyxVar.d = i - Integer.MIN_VALUE;
            } else {
                gyxVar = new defpackage.gyx(this, aolnVar);
            }
        } else {
            gyxVar = new defpackage.gyx(this, aolnVar);
        }
        defpackage.gyx gyxVar2 = gyxVar;
        java.lang.Object objAj = gyxVar2.b;
        aolu aoluVar = aolu.a;
        ?? r2 = gyxVar2.d;
        try {
            if (r2 == 0) {
                aooc.af(objAj);
                java.lang.String strC = f().c("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (strC == null || strC.length() == 0) {
                    java.lang.String str = defpackage.gzb.a;
                    gsh.a();
                    android.util.Log.e(str, "No worker to delegate to.");
                    return new defpackage.gsd();
                }
                guq guqVarH = guq.h(((gsg) this).a);
                gxm gxmVarD = guqVarH.e.D();
                java.lang.String string = g().toString();
                aooh.e(string, "toString(...)");
                gxl gxlVarC = gxmVarD.c(string);
                if (gxlVarC == null) {
                    return new defpackage.gsd();
                }
                ipc ipcVar = new ipc(guqVarH.l);
                ?? r3 = ipcVar.a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : r3) {
                    if (((gvw) obj).c(gxlVarC)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    java.lang.String str2 = gxlVarC.b;
                    gsh.a().c(gvs.a, "Work " + str2 + " constrained by " + ajsz.cr(arrayList, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, new defpackage.guv(2), 31));
                }
                if (!arrayList.isEmpty()) {
                    gsh.a().c(defpackage.gzb.a, a.bk(strC, "Constraints not met for delegate ", ". Requesting retry."));
                    return new defpackage.gse();
                }
                gsh.a().c(defpackage.gzb.a, "Constraints met for delegate ".concat(strC));
                try {
                    gta gtaVar = ((gsg) this).b.g;
                    android.content.Context context = ((gsg) this).a;
                    aooh.e(context, "getApplicationContext(...)");
                    gsg gsgVarB = gtaVar.b(context, strC, this.d);
                    ?? r0 = this.d.i.c;
                    aooh.e((java.lang.Object) r0, "getMainThreadExecutor(...)");
                    aosp aospVarAc = aooc.ac((java.util.concurrent.Executor) r0);
                    defpackage.blv blvVar = new defpackage.blv(this, gsgVarB, ipcVar, gxlVarC, (aoln) null, 4);
                    gyxVar2.a = gsgVarB;
                    gyxVar2.d = 1;
                    objAj = aoov.aj(aospVarAc, blvVar, gyxVar2);
                    r2 = gsgVarB;
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                } catch (java.lang.Throwable unused) {
                    gsh.a().c(defpackage.gzb.a, "No worker to delegate to.");
                    return new defpackage.gsd();
                }
            } else {
                if (r2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj2 = gyxVar2.a;
                aooc.af(objAj);
                r2 = obj2;
            }
            return (gus) objAj;
        } catch (java.util.concurrent.CancellationException e) {
            if (j() || (e instanceof defpackage.gyu)) {
                if (android.os.Build.VERSION.SDK_INT < 31) {
                    iE = -512;
                } else if (j()) {
                    iE = e();
                } else {
                    if (!(e instanceof defpackage.gyu)) {
                        throw new java.lang.IllegalStateException("Unreachable");
                    }
                    iE = ((defpackage.gyu) e).a;
                }
                ((gsg) r2).i(iE);
            }
            if (e instanceof defpackage.gyu) {
                return new defpackage.gse();
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(gsg gsgVar, ipc ipcVar, gxl gxlVar, aoln aolnVar) {
        defpackage.gyv gyvVar;
        if (aolnVar instanceof defpackage.gyv) {
            gyvVar = (defpackage.gyv) aolnVar;
            int i = gyvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gyvVar.c = i - Integer.MIN_VALUE;
            } else {
                gyvVar = new defpackage.gyv(this, aolnVar);
            }
        } else {
            gyvVar = new defpackage.gyv(this, aolnVar);
        }
        java.lang.Object objM = gyvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = gyvVar.c;
        if (i2 == 0) {
            aooc.af(objM);
            defpackage.gyw gywVar = new defpackage.gyw(gsgVar, ipcVar, gxlVar, null);
            gyvVar.c = 1;
            objM = aosv.m(gywVar, gyvVar);
            if (objM == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objM);
        }
        aooh.e(objM, "coroutineScope(...)");
        return objM;
    }
}
