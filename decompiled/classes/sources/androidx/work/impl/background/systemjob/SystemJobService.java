package androidx.work.impl.background.systemjob;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class SystemJobService extends android.app.job.JobService implements defpackage.gtf {
    private static final java.lang.String a = defpackage.gsh.b("SystemJobService");
    private defpackage.guq b;
    private final java.util.Map c = new java.util.HashMap();
    private final defpackage.gtw d = new defpackage.gtx();
    private defpackage.rsr e;

    private static defpackage.gxd b(android.app.job.JobParameters jobParameters) {
        try {
            android.os.PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new defpackage.gxd(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
        } catch (java.lang.NullPointerException unused) {
        }
        return null;
    }

    private static void c(java.lang.String str) {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            throw new java.lang.IllegalStateException(defpackage.a.bk(str, "Cannot invoke ", " on a background thread"));
        }
    }

    @Override // defpackage.gtf
    public final void a(defpackage.gxd gxdVar, boolean z) {
        c("onExecuted");
        android.app.job.JobParameters jobParameters = (android.app.job.JobParameters) this.c.remove(gxdVar);
        this.d.b(gxdVar);
        if (jobParameters != null) {
            defpackage.gsh.a().c(a, java.lang.String.valueOf(gxdVar.a).concat(" executed on JobScheduler"));
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            defpackage.guq guqVarH = defpackage.guq.h(getApplicationContext());
            this.b = guqVarH;
            defpackage.gtr gtrVar = guqVarH.g;
            this.e = new defpackage.rsr(gtrVar, guqVarH.k);
            gtrVar.c(this);
        } catch (java.lang.IllegalStateException e) {
            if (!android.app.Application.class.equals(getApplication().getClass())) {
                throw new java.lang.IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            defpackage.gsh.a();
            android.util.Log.w(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        defpackage.guq guqVar = this.b;
        if (guqVar != null) {
            guqVar.g.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(android.app.job.JobParameters jobParameters) {
        boolean z;
        c("onStartJob");
        if (this.b == null) {
            defpackage.gsh.a().c(a, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
        } else {
            defpackage.gxd gxdVarB = b(jobParameters);
            if (gxdVarB == null) {
                defpackage.gsh.a();
                android.util.Log.e(a, "WorkSpec id not found!");
            } else {
                defpackage.gtr gtrVar = this.b.g;
                synchronized (gtrVar.l) {
                    defpackage.gve gveVar = (defpackage.gve) gtrVar.f.get(gxdVarB.a);
                    z = gveVar != null && gveVar.a().equals(gxdVarB);
                }
                if (z) {
                    defpackage.gsh gshVarA = defpackage.gsh.a();
                    java.lang.String str = a;
                    java.util.Objects.toString(gxdVarB);
                    gshVarA.c(str, "Job is already running in foreground: ".concat(gxdVarB.toString()));
                    jobFinished(jobParameters, true);
                } else {
                    java.util.Map map = this.c;
                    if (!map.containsKey(gxdVarB)) {
                        defpackage.gsh gshVarA2 = defpackage.gsh.a();
                        java.lang.String str2 = a;
                        java.util.Objects.toString(gxdVarB);
                        gshVarA2.c(str2, "onStartJob for ".concat(gxdVarB.toString()));
                        map.put(gxdVarB, jobParameters);
                        defpackage.gus gusVar = new defpackage.gus((byte[]) null);
                        if (aa$.ExternalSyntheticApiModelOutline1.m(jobParameters) != null) {
                            java.util.Arrays.asList(aa$.ExternalSyntheticApiModelOutline1.m(jobParameters));
                        }
                        if (aa$.ExternalSyntheticApiModelOutline1.m(jobParameters) != null) {
                            java.util.Arrays.asList(aa$.ExternalSyntheticApiModelOutline1.m(jobParameters));
                        }
                        ft$.ExternalSyntheticApiModelOutline0.m(jobParameters);
                        this.e.ax(this.d.c(gxdVarB), gusVar);
                        return true;
                    }
                    defpackage.gsh gshVarA3 = defpackage.gsh.a();
                    java.lang.String str3 = a;
                    java.util.Objects.toString(gxdVarB);
                    gshVarA3.c(str3, "Job is already being executed by SystemJobService: ".concat(gxdVarB.toString()));
                }
            }
        }
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(android.app.job.JobParameters jobParameters) {
        boolean zContains;
        c("onStopJob");
        if (this.b == null) {
            defpackage.gsh.a().c(a, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        defpackage.gxd gxdVarB = b(jobParameters);
        if (gxdVarB == null) {
            defpackage.gsh.a();
            android.util.Log.e(a, "WorkSpec id not found!");
        } else {
            defpackage.gsh gshVarA = defpackage.gsh.a();
            java.lang.String str = a;
            java.util.Objects.toString(gxdVarB);
            gshVarA.c(str, "onStopJob for ".concat(gxdVarB.toString()));
            this.c.remove(gxdVarB);
            defpackage.ipc ipcVarB = this.d.b(gxdVarB);
            if (ipcVarB != null) {
                int i = -512;
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    int iM = ac$.ExternalSyntheticApiModelOutline0.m(jobParameters);
                    switch (iM) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            i = iM;
                            break;
                    }
                }
                this.e.ay(ipcVarB, i);
            }
            defpackage.gtr gtrVar = this.b.g;
            java.lang.String str2 = gxdVarB.a;
            synchronized (gtrVar.l) {
                zContains = gtrVar.i.contains(str2);
            }
            if (!zContains) {
                return true;
            }
        }
        return false;
    }
}
