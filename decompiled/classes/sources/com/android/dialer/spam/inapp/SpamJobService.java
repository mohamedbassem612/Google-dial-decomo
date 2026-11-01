package com.android.dialer.spam.inapp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class SpamJobService extends android.app.job.JobService {
    public static final java.lang.Object a = new java.lang.Object();
    public static boolean b;
    private defpackage.ueo c;

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.c = defpackage.wsc.bR(getApplicationContext()).cz();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(android.app.job.JobParameters jobParameters) {
        long jLongValue;
        android.app.job.JobInfo jobInfoBuild;
        int jobId = jobParameters.getJobId();
        android.content.Context applicationContext = getApplicationContext();
        defpackage.zjv.i(defpackage.wsc.bR(applicationContext).dQ(), defpackage.mgv.JOB_SERVICE_ON_START_JOB, defpackage.aify.p(defpackage.gus.au(jobId)), null, 0, 28);
        defpackage.son sonVarBL = defpackage.wsc.bR(applicationContext).bL();
        if (!sonVarBL.b) {
            sonVarBL.a();
            sonVarBL.b();
        }
        boolean z = false;
        if (defpackage.ufa.e(jobId) && ((java.lang.Boolean) defpackage.wsc.bR(applicationContext).hA().a()).booleanValue()) {
            android.app.job.JobScheduler jobSchedulerA = defpackage.ufa.a(applicationContext);
            if (jobSchedulerA != null) {
                defpackage.ahvr.bM(defpackage.ufa.e(jobId));
                defpackage.ahvr.bM(defpackage.ufa.e(jobId));
                defpackage.uez uezVarG = defpackage.ttj.g(applicationContext);
                if (jobId == 50) {
                    jLongValue = ((java.lang.Long) uezVarG.ie().a()).longValue();
                } else {
                    if (jobId != 51) {
                        throw new java.lang.IllegalArgumentException("Invalid spam job type.");
                    }
                    jLongValue = ((java.lang.Long) uezVarG.id().a()).longValue();
                }
                android.app.job.JobInfo.Builder builder = new android.app.job.JobInfo.Builder(jobId, new android.content.ComponentName(applicationContext, (java.lang.Class<?>) com.android.dialer.spam.inapp.SpamJobService.class));
                android.app.job.JobInfo.Builder periodic = builder.setPersisted(true).setPeriodic(jLongValue);
                android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
                persistableBundle.putLong("spam_jobs_interval", jLongValue);
                periodic.setExtras(persistableBundle);
                builder.setRequiresDeviceIdle(true);
                if (jobId == 50) {
                    jobInfoBuild = builder.setRequiredNetworkType(2).build();
                } else {
                    if (jobId != 51) {
                        throw new java.lang.IllegalArgumentException("Invalid spam job type.");
                    }
                    jobInfoBuild = builder.setRequiredNetworkType(1).build();
                }
                java.util.Iterator<android.app.job.JobInfo> it = jobSchedulerA.getAllPendingJobs().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.ufa.a.b()).l("com/android/dialer/spam/inapp/SpamJobScheduler", "scheduleJob", 95, "SpamJobScheduler.java")).y("scheduling job with id: %s", defpackage.ufa.b(jobId));
                        defpackage.zjv.i(defpackage.ttj.g(applicationContext).dQ(), defpackage.mgv.JOB_SCHEDULER_SCHEDULE, defpackage.aify.p(defpackage.gus.au(jobId)), null, 0, 28);
                        jobSchedulerA.schedule(jobInfoBuild);
                        break;
                    }
                    android.app.job.JobInfo next = it.next();
                    if (jobInfoBuild.getId() == next.getId() && jobInfoBuild.getService().equals(next.getService()) && jobInfoBuild.getExtras().getLong("spam_jobs_interval") == next.getExtras().getLong("spam_jobs_interval")) {
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.ufa.a.b()).l("com/android/dialer/spam/inapp/SpamJobScheduler", "scheduleJob", 102, "SpamJobScheduler.java")).y("job with id %s is already scheduled", defpackage.ufa.b(jobId));
                        break;
                    }
                }
            }
            java.lang.Object obj = a;
            synchronized (obj) {
                if (!b) {
                    b = true;
                    if (java.lang.System.currentTimeMillis() - getSharedPreferences(getApplicationContext().getPackageName(), 0).getLong("spam_jobs_last_updated_blacklist", 1L) < jobParameters.getExtras().getLong("spam_jobs_interval")) {
                        synchronized (obj) {
                            b = false;
                        }
                    } else {
                        defpackage.ueo ueoVar = this.c;
                        ufb ufbVar = new ufb(this, jobParameters, 0);
                        if (defpackage.abyl.i(applicationContext)) {
                            defpackage.agsm.i(912, defpackage.ahvr.F(new uel(ueoVar, ufbVar), ueoVar.g), "Failed to sync spam list", new java.lang.Object[0]);
                        }
                        z = true;
                    }
                }
            }
        } else {
            defpackage.ufa.c(applicationContext, jobId);
        }
        return z;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(android.app.job.JobParameters jobParameters) {
        return true;
    }
}
