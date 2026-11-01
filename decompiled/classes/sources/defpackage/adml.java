package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adml {
    public final defpackage.admm a;
    public long b = 0;
    public final defpackage.admn c;

    public adml(defpackage.admm admmVar, defpackage.admn admnVar) {
        this.a = admmVar;
        this.c = admnVar;
    }

    public final void a(defpackage.adid adidVar, java.lang.Object obj) {
        ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/scheduling/DownloadJob", "finishJob", 161, "DownloadJob.java")).H("<==== Finishing job %s, %d ms. elapsed since start", adidVar, android.os.SystemClock.elapsedRealtime() - this.b);
        defpackage.adhl.a.b();
        adidVar.toString();
        this.c.a.jobFinished((android.app.job.JobParameters) obj, false);
    }
}
