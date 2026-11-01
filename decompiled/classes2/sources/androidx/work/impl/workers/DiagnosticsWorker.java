package androidx.work.impl.workers;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class DiagnosticsWorker extends androidx.work.Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        aooh.f(context, "context");
        aooh.f(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final gus c() {
        guq guqVarH = guq.h(((gsg) this).a);
        androidx.work.impl.WorkDatabase workDatabase = guqVarH.e;
        aooh.e(workDatabase, "getWorkDatabase(...)");
        gxm gxmVarD = workDatabase.D();
        gxe gxeVarB = workDatabase.B();
        gxx gxxVarE = workDatabase.E();
        gwz gwzVarA = workDatabase.A();
        gus gusVar = guqVarH.d.p;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        java.util.List listF = gxmVarD.f(jCurrentTimeMillis - 86400000);
        java.util.List listG = gxmVarD.g();
        java.util.List listU = gxmVarD.u();
        if (!listF.isEmpty()) {
            gsh.a();
            java.lang.String str = defpackage.gzc.a;
            android.util.Log.i(str, "Recently completed work:\n\n");
            gsh.a();
            android.util.Log.i(str, defpackage.gzc.a(gxeVarB, gxxVarE, gwzVarA, listF));
        }
        if (!listG.isEmpty()) {
            gsh.a();
            java.lang.String str2 = defpackage.gzc.a;
            android.util.Log.i(str2, "Running work:\n\n");
            gsh.a();
            android.util.Log.i(str2, defpackage.gzc.a(gxeVarB, gxxVarE, gwzVarA, listG));
        }
        if (!listU.isEmpty()) {
            gsh.a();
            java.lang.String str3 = defpackage.gzc.a;
            android.util.Log.i(str3, "Enqueued work:\n\n");
            gsh.a();
            android.util.Log.i(str3, defpackage.gzc.a(gxeVarB, gxxVarE, gwzVarA, listU));
        }
        return new gsf();
    }
}
