package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class admv {
    public android.app.job.JobScheduler a;
    public android.content.Context b;
    public java.lang.Class c = com.google.android.libraries.micore.superpacks.scheduling.DownloadJobService.class;
    public final int d = defpackage.admw.a;
    public final int e = defpackage.admw.b;

    public final defpackage.admw a() {
        if (this.a == null) {
            android.content.Context context = this.b;
            context.getClass();
            this.a = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
        }
        return new defpackage.admw(this);
    }
}
