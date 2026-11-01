package com.android.dialer.shortcuts;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class PeriodicJobService extends android.app.job.JobService {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/shortcuts/PeriodicJobService");
    private defpackage.ajcq b;

    @Override // android.app.job.JobService
    public final boolean onStartJob(android.app.job.JobParameters jobParameters) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/shortcuts/PeriodicJobService", "onStartJob", 47, "PeriodicJobService.java")).v("onStartJob");
        defpackage.zjv.i(defpackage.wsc.cj(getApplicationContext()).dQ(), defpackage.mgv.JOB_SERVICE_ON_START_JOB, defpackage.aify.p(defpackage.gus.au(jobParameters.getJobId())), null, 0, 28);
        tvi tviVarCm = defpackage.wsc.cj(getApplicationContext()).cm();
        ((defpackage.aimw) ((defpackage.aimw) tvi.a.b()).l("com/android/dialer/shortcuts/RefreshShortcutsTask", "refreshShortcuts", 41, "RefreshShortcutsTask.java")).v("refreshShortcuts");
        defpackage.tvd tvdVar = tviVarCm.b;
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(tvdVar.c.submit(defpackage.ahqx.i(new tvg(tvdVar, 1))));
        tct tctVar = new tct(tviVarCm, 9);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        defpackage.ahrv ahrvVarI = ahrvVarG.i(tctVar, ajbmVar);
        this.b = ahrvVarI;
        defpackage.ahvr.J(ahrvVarI, new kxp(this, jobParameters, 8), ajbmVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(android.app.job.JobParameters jobParameters) {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/shortcuts/PeriodicJobService", "onStopJob", 81, "PeriodicJobService.java")).v("onStopJob");
        if (this.b != null) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/shortcuts/PeriodicJobService", "onStopJob", 84, "PeriodicJobService.java")).v("cancelling");
            this.b.cancel(false);
        }
        return false;
    }
}
