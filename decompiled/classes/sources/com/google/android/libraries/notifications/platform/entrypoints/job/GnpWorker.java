package com.google.android.libraries.notifications.platform.entrypoints.job;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class GnpWorker extends androidx.work.CoroutineWorker {
    private static final defpackage.aiof e = defpackage.aiof.i("GnpSdk");
    public advl d;
    private final androidx.work.WorkerParameters f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GnpWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        defpackage.aooh.f(context, "appContext");
        defpackage.aooh.f(workerParameters, "workerParams");
        this.f = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        defpackage.aoin aoinVar = (defpackage.aoin) adxj.a(this.a).ha().get(com.google.android.libraries.notifications.platform.entrypoints.job.GnpWorker.class);
        if (aoinVar == null) {
            ((defpackage.aiob) e.d()).v("Failed to inject dependencies.");
            return new gsd();
        }
        java.lang.Object objA = aoinVar.a();
        defpackage.aooh.d(objA, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.internal.inject.Injector<com.google.android.libraries.notifications.platform.entrypoints.job.GnpWorker>");
        ((adze) objA).a(this);
        advl advlVar = this.d;
        if (advlVar == null) {
            defpackage.aooh.j("gnpWorkerHandler");
            advlVar = null;
        }
        androidx.work.WorkerParameters workerParameters = this.f;
        defpackage.grp grpVar = workerParameters.b;
        defpackage.aooh.e(grpVar, "getInputData(...)");
        return advlVar.a(grpVar, workerParameters.d, aolnVar);
    }
}
