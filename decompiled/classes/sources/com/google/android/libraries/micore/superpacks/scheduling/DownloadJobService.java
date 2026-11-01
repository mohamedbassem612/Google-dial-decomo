package com.google.android.libraries.micore.superpacks.scheduling;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class DownloadJobService extends android.app.job.JobService {
    private defpackage.adml a;

    private static defpackage.adid c(android.app.job.JobParameters jobParameters) {
        defpackage.adic adicVar = new defpackage.adic();
        adicVar.b(false);
        adicVar.a = defpackage.agab.cf(jobParameters.getJobId());
        adicVar.b(false);
        return adicVar.a();
    }

    final defpackage.adml a() {
        defpackage.adml admlVar = this.a;
        if (admlVar != null) {
            return admlVar;
        }
        defpackage.adml admlVar2 = new defpackage.adml(b(), new defpackage.admn(this));
        this.a = admlVar2;
        return admlVar2;
    }

    public final defpackage.admm b() {
        android.content.Context applicationContext = getApplicationContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.ajcu ajcuVar = defpackage.adie.a;
        defpackage.adlk adlkVar = new defpackage.adlk();
        adlkVar.a = getApplicationContext();
        adlkVar.b = defpackage.adif.a;
        defpackage.appu appuVar = new defpackage.appu(null);
        appuVar.a = 3;
        appuVar.b = adlkVar.d;
        if (adlkVar.c == null) {
            long j = defpackage.adlo.a;
            defpackage.apjd apjdVar = new defpackage.apjd();
            defpackage.adln adlnVar = defpackage.adln.a;
            java.util.TimeZone timeZone = defpackage.apjx.a;
            apjdVar.x = new defpackage.apnt(adlnVar);
            apjdVar.a(defpackage.adlo.a, java.util.concurrent.TimeUnit.MILLISECONDS);
            apjdVar.b(defpackage.adlo.b, java.util.concurrent.TimeUnit.MILLISECONDS);
            long j2 = defpackage.adlo.c;
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            if (timeUnit == null) {
                defpackage.aooh.i("unit");
            }
            apjdVar.v = defpackage.apjx.l(j2, timeUnit);
            apjdVar.d = true;
            defpackage.adtj adtjVar = new defpackage.adtj(new defpackage.apje(apjdVar));
            android.content.Context context = adlkVar.a;
            context.getClass();
            java.util.concurrent.Executor executor = adlkVar.b;
            executor.getClass();
            adlkVar.c = new defpackage.adth(adtjVar, context, executor, appuVar);
        }
        java.lang.Object[] objArr = {new defpackage.aezs(adlkVar)};
        defpackage.ahvr.ay(objArr, 1);
        arrayList.addAll(new defpackage.aike(objArr, 1));
        if (ajcuVar == null) {
            throw new java.lang.IllegalStateException("Control executor must be set.");
        }
        if (arrayList.isEmpty()) {
            throw new java.lang.IllegalStateException("At least one download protocol must be added.");
        }
        defpackage.adlb adlbVar = new defpackage.adlb(ajcuVar, arrayList);
        adlbVar.d.R(new defpackage.admu(defpackage.adnd.d));
        defpackage.tvn tvnVar = new defpackage.tvn(defpackage.adjs.b(applicationContext));
        defpackage.admy admyVar = defpackage.admy.a;
        int i = defpackage.admw.a;
        defpackage.admv admvVar = new defpackage.admv();
        admvVar.b = applicationContext;
        admvVar.c = getClass();
        return new defpackage.admm(admvVar.a(), admyVar, ajcuVar, adlbVar, tvnVar);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final android.app.job.JobParameters jobParameters) {
        final defpackage.adml admlVarA = a();
        final defpackage.adid adidVarC = c(jobParameters);
        int jobId = jobParameters.getJobId() & 3;
        ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/scheduling/DownloadJob", "onStartJob", 45, "DownloadJob.java")).y("====> Starting job %s", adidVarC);
        defpackage.admm admmVar = admlVarA.a;
        final defpackage.adni adniVar = admmVar.a;
        final defpackage.tvn tvnVar = admmVar.e;
        defpackage.ajcu ajcuVar = admmVar.c;
        admlVarA.b = android.os.SystemClock.elapsedRealtime();
        defpackage.adhl adhlVar = defpackage.adhl.a;
        adhlVar.b();
        adidVarC.toString();
        adhlVar.b();
        adidVarC.toString();
        final boolean z = jobId == 0;
        final boolean z2 = z;
        defpackage.ajcq ajcqVarEU = ajcuVar.submit(new java.util.concurrent.Callable() { // from class: admi
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                defpackage.adnf adnfVar;
                defpackage.aiof aiofVar = defpackage.adhn.a;
                android.os.SystemClock.elapsedRealtime();
                if (z) {
                    java.lang.Object obj = jobParameters;
                    defpackage.adid adidVar = adidVarC;
                    defpackage.adml admlVar = admlVarA;
                    defpackage.gsb gsbVar = new defpackage.gsb(admlVar, adidVar, obj, 9);
                    defpackage.anrf anrfVar = new defpackage.anrf((byte[]) null);
                    defpackage.admm admmVar2 = admlVar.a;
                    anrfVar.c = admmVar2.a;
                    anrfVar.e = admmVar2.c;
                    anrfVar.f = admmVar2.e;
                    anrfVar.g = admmVar2.b;
                    anrfVar.d = adidVar;
                    anrfVar.a = gsbVar;
                    anrfVar.b = admmVar2.d;
                    defpackage.adnf adnfVar2 = new defpackage.adnf(anrfVar);
                    defpackage.adni adniVar2 = admlVar.c.a.b().a;
                    if (true != (adniVar2 instanceof defpackage.admw)) {
                        adniVar2 = null;
                    }
                    if (adniVar2 == null) {
                        throw new java.lang.IllegalStateException("Could not find the job task scheduler for this service");
                    }
                    android.app.job.JobParameters jobParameters2 = (android.app.job.JobParameters) obj;
                    int jobId2 = jobParameters2.getJobId();
                    if ((jobParameters2.getJobId() & 3) == 0) {
                        defpackage.admw.h.T(defpackage.agab.cf(jobId2));
                    }
                    adnfVar = adnfVar2;
                } else {
                    adnfVar = null;
                }
                defpackage.adnd.b(adniVar, tvnVar, adnfVar, java.lang.System.currentTimeMillis(), "job start");
                return null;
            }
        });
        defpackage.ajat ajatVar = new defpackage.ajat() { // from class: admj
            @Override // defpackage.ajat
            public final defpackage.ajcq a(java.lang.Object obj) {
                boolean z3 = z2;
                defpackage.adid adidVar = adidVarC;
                java.lang.Throwable th = (java.lang.Throwable) obj;
                if (z3) {
                    admlVarA.a(adidVar, jobParameters);
                }
                ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.c()).k(th)).l("com/google/android/libraries/micore/superpacks/scheduling/DownloadJob", "onStartJob", 109, "DownloadJob.java")).y("DownloadJob#onStartJob: failure for %s", adidVar);
                return defpackage.aiql.z(null);
            }
        };
        int i = defpackage.aizu.d;
        defpackage.aizs aizsVar = new defpackage.aizs(ajcqVarEU, java.lang.Throwable.class, ajatVar);
        ajcqVarEU.c(aizsVar, defpackage.aiql.t(ajcuVar, aizsVar));
        defpackage.abrz.B(aizsVar, new java.util.concurrent.Callable() { // from class: admk
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                if (!z2) {
                    java.lang.Object obj = jobParameters;
                    admlVarA.a(adidVarC, obj);
                }
                return defpackage.ajcm.a;
            }
        }, ajcuVar);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // android.app.job.JobService
    public final boolean onStopJob(android.app.job.JobParameters jobParameters) {
        defpackage.adml admlVarA = a();
        defpackage.adid adidVarC = c(jobParameters);
        ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/scheduling/DownloadJob", "onStopJob", 129, "DownloadJob.java")).H("<<<<< Stopping job %s, %d ms. elapsed since start", adidVarC, android.os.SystemClock.elapsedRealtime() - admlVarA.b);
        defpackage.adhl.a();
        adidVarC.toString();
        synchronized (defpackage.adnd.a) {
            defpackage.aogc aogcVar = defpackage.adnd.e;
            aogcVar.a.remove(adidVarC);
            java.util.Iterator it = aogcVar.ac(adidVarC).iterator();
            while (it.hasNext()) {
                ((defpackage.admg) it.next()).b(4, (defpackage.tvn) aogcVar.c);
            }
        }
        return false;
    }
}
