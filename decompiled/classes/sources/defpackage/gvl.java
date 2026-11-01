package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gvl implements defpackage.gtt, defpackage.gtg {
    public static final java.lang.String a = defpackage.gsh.b("SystemJobScheduler");
    public static final long b;
    public static final long c;
    public final defpackage.gvk d;
    public final androidx.work.impl.WorkDatabase e;
    public final defpackage.gsu f;
    public final java.util.Map g = new java.util.HashMap();
    private final android.content.Context h;
    private final android.app.job.JobScheduler i;
    private final defpackage.grk j;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        b = 3600000L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.HOURS;
        c = 7200000L;
    }

    public gvl(android.content.Context context, androidx.work.impl.WorkDatabase workDatabase, defpackage.grk grkVar, android.app.job.JobScheduler jobScheduler, defpackage.gvk gvkVar, defpackage.gsu gsuVar) {
        this.h = context;
        this.i = jobScheduler;
        this.d = gvkVar;
        this.e = workDatabase;
        this.j = grkVar;
        this.f = gsuVar;
    }

    public static defpackage.gxd e(android.app.job.JobInfo jobInfo) {
        android.os.PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new defpackage.gxd(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
            } catch (java.lang.NullPointerException unused) {
            }
        }
        return null;
    }

    public static java.util.List f(android.content.Context context, android.app.job.JobScheduler jobScheduler) {
        java.util.List<android.app.job.JobInfo> listB = defpackage.gvj.b(jobScheduler);
        if (listB == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(listB.size());
        android.content.ComponentName componentName = new android.content.ComponentName(context, (java.lang.Class<?>) androidx.work.impl.background.systemjob.SystemJobService.class);
        for (android.app.job.JobInfo jobInfo : listB) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void g(android.app.job.JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (java.lang.Throwable th) {
            defpackage.gsh.a();
            android.util.Log.e(a, java.lang.String.format(java.util.Locale.getDefault(), "Exception while trying to cancel job (%d)", java.lang.Integer.valueOf(i)), th);
        }
    }

    @Override // defpackage.gtg
    public final void a(defpackage.gxd gxdVar, boolean z) {
        java.util.Map map = this.g;
        if (!z) {
            java.lang.Runnable runnable = (java.lang.Runnable) map.remove(gxdVar);
            if (runnable != null) {
                this.f.a(runnable);
                return;
            }
            return;
        }
        if (map.containsKey(gxdVar)) {
            return;
        }
        gra graVar = new gra(this, gxdVar, 4, (char[]) null);
        map.put(gxdVar, graVar);
        graVar.run();
    }

    @Override // defpackage.gtt
    public final void b(java.lang.String str) {
        java.util.ArrayList arrayList;
        android.content.Context context = this.h;
        android.app.job.JobScheduler jobScheduler = this.i;
        java.util.List<android.app.job.JobInfo> listF = f(context, jobScheduler);
        if (listF == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(2);
            for (android.app.job.JobInfo jobInfo : listF) {
                defpackage.gxd gxdVarE = e(jobInfo);
                if (gxdVarE != null && str.equals(gxdVarE.a)) {
                    arrayList2.add(java.lang.Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Integer) it.next()).intValue();
            defpackage.gsh.a().c(a, defpackage.a.bu(iIntValue, str, "Cancelling work ID ", ", Job ID "));
            g(jobScheduler, iIntValue);
        }
        this.e.A().d(str);
    }

    @Override // defpackage.gtt
    public final void c(defpackage.gxl... gxlVarArr) {
        int iIntValue;
        androidx.work.impl.WorkDatabase workDatabase = this.e;
        defpackage.ipc ipcVar = new defpackage.ipc(workDatabase, (byte[]) null);
        for (defpackage.gxl gxlVar : gxlVarArr) {
            workDatabase.n();
            try {
                defpackage.gxm gxmVarD = workDatabase.D();
                java.lang.String str = gxlVar.b;
                defpackage.gxl gxlVarC = gxmVarD.c(str);
                if (gxlVarC == null) {
                    defpackage.gsh.a();
                    android.util.Log.w(a, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.q();
                } else if (gxlVarC.c != defpackage.gsw.a) {
                    defpackage.gsh.a();
                    android.util.Log.w(a, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.q();
                } else {
                    defpackage.gxd gxdVarU = defpackage.gus.u(gxlVar);
                    defpackage.gwy gwyVarA = workDatabase.A().a(gxdVarU);
                    if (gwyVarA != null) {
                        iIntValue = gwyVarA.c;
                    } else {
                        int i = this.j.k;
                        java.lang.Object objE = ((defpackage.gfy) ipcVar.a).e(new defpackage.guy(ipcVar, 2));
                        defpackage.aooh.e(objE, "runInTransaction(...)");
                        iIntValue = ((java.lang.Number) objE).intValue();
                    }
                    if (gwyVarA == null) {
                        workDatabase.A().c(new defpackage.gwy(gxdVarU.a, gxdVarU.b, iIntValue));
                    }
                    h(gxlVar, iIntValue);
                    workDatabase.q();
                }
                workDatabase.o();
            } catch (java.lang.Throwable th) {
                this.e.o();
                throw th;
            }
        }
    }

    @Override // defpackage.gtt
    public final boolean d() {
        return true;
    }

    public final void h(defpackage.gxl gxlVar, int i) throws java.io.IOException {
        i(gxlVar, i, this.d.a(gxlVar, i, java.lang.Math.max(gxlVar.a() - java.lang.System.currentTimeMillis(), 0L)));
    }

    public final void i(defpackage.gxl gxlVar, int i, android.app.job.JobInfo jobInfo) throws java.io.IOException {
        java.lang.String str;
        defpackage.gsh gshVarA = defpackage.gsh.a();
        java.lang.String str2 = a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Scheduling work ID ");
        java.lang.String str3 = gxlVar.b;
        sb.append(str3);
        sb.append(" (");
        sb.append(gxlVar.d);
        sb.append("), Job ID ");
        sb.append(i);
        gshVarA.c(str2, sb.toString());
        try {
            if (this.i.schedule(jobInfo) == 0) {
                defpackage.gsh.a();
                android.util.Log.w(str2, "Unable to schedule work ID " + str3);
                if (gxlVar.r && gxlVar.s == defpackage.gss.a) {
                    gxlVar.r = false;
                    defpackage.gsh.a().c(str2, java.lang.String.format("Scheduling a non-expedited job (work ID %s)", str3));
                    h(gxlVar, i);
                }
            }
        } catch (java.lang.IllegalStateException e) {
            android.content.Context context = this.h;
            androidx.work.impl.WorkDatabase workDatabase = this.e;
            defpackage.grk grkVar = this.j;
            int i2 = defpackage.gvj.a;
            if (context == null) {
                defpackage.aooh.i("context");
            }
            if (workDatabase == null) {
                defpackage.aooh.i("workDatabase");
            }
            if (grkVar == null) {
                defpackage.aooh.i("configuration");
            }
            int size = workDatabase.D().h().size();
            java.lang.String strCr = "<faulty JobScheduler failed to getPendingJobs>";
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                android.app.job.JobScheduler jobSchedulerA = defpackage.gvj.a(context);
                java.util.List listB = defpackage.gvj.b(jobSchedulerA);
                if (listB != null) {
                    java.util.List listF = f(context, jobSchedulerA);
                    int size2 = listF != null ? listB.size() - listF.size() : 0;
                    java.lang.String str4 = null;
                    if (size2 == 0) {
                        str = null;
                    } else {
                        str = size2 + " of which are not owned by WorkManager";
                    }
                    java.lang.Object systemService = context.getSystemService("jobscheduler");
                    if (systemService == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type android.app.job.JobScheduler");
                    }
                    java.util.List listF2 = f(context, (android.app.job.JobScheduler) systemService);
                    int size3 = listF2 != null ? listF2.size() : 0;
                    if (size3 != 0) {
                        str4 = size3 + " from WorkManager in the default namespace";
                    }
                    java.lang.String[] strArr = {listB.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str4};
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    defpackage.ajsz.di(strArr, arrayList);
                    strCr = defpackage.ajsz.cr(arrayList, ",\n", null, null, null, 62);
                }
            } else {
                java.util.List listF3 = f(context, defpackage.gvj.a(context));
                if (listF3 != null) {
                    strCr = listF3.size() + " jobs from WorkManager";
                }
            }
            int i3 = android.os.Build.VERSION.SDK_INT >= 31 ? 150 : 100;
            int i4 = grkVar.m;
            java.lang.String str5 = "JobScheduler " + i3 + " job limit exceeded.\nIn JobScheduler there are " + strCr + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.";
            defpackage.gsh.a();
            android.util.Log.e(a, str5);
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(str5, e);
            defpackage.dxw dxwVar = grkVar.g;
            throw illegalStateException;
        } catch (java.lang.Throwable th) {
            defpackage.gsh.a();
            java.lang.String str6 = a;
            java.util.Objects.toString(gxlVar);
            android.util.Log.e(str6, "Unable to schedule ".concat(java.lang.String.valueOf(gxlVar)), th);
        }
    }
}
