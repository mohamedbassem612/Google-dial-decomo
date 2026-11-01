package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ufb implements defpackage.uen {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public ufb(com.android.dialer.spam.inapp.SpamJobService spamJobService, android.app.job.JobParameters jobParameters, int i) {
        this.$cid = i;
        this.a = jobParameters;
        j$.util.Objects.requireNonNull(spamJobService);
        this.b = spamJobService;
    }

    @Override // defpackage.uen
    public final void a(boolean z) {
        if (this.$cid == 0) {
            throw null;
        }
        int i = anzo.a;
        java.lang.Object obj = this.b;
        ((anzp) obj).c.a();
        if (obj.getClass() == null) {
            throw new java.lang.AssertionError();
        }
        java.lang.Object obj2 = this.a;
        anzg anzgVar = ((anxf) obj).a;
        anzgVar.I.a(1, "shutdownNow() called");
        anzgVar.n();
        anzd anzdVar = anzgVar.K;
        anzdVar.c.n.execute(new anwo(anzdVar, 18, (byte[]) null));
        anzgVar.n.execute(new anwo(anzgVar, 15, (char[]) null));
        if (z) {
            java.lang.Object obj3 = ((defpackage.ufb) obj2).b;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            com.android.dialer.spam.inapp.SpamJobService spamJobService = (com.android.dialer.spam.inapp.SpamJobService) obj3;
            android.content.SharedPreferences.Editor editorEdit = spamJobService.getSharedPreferences(spamJobService.getApplicationContext().getPackageName(), 0).edit();
            editorEdit.putLong("spam_jobs_last_updated_blacklist", jCurrentTimeMillis);
            editorEdit.apply();
            defpackage.uet.a();
        }
        synchronized (com.android.dialer.spam.inapp.SpamJobService.a) {
            com.android.dialer.spam.inapp.SpamJobService.b = false;
        }
        defpackage.ufb ufbVar = (defpackage.ufb) obj2;
        ((com.android.dialer.spam.inapp.SpamJobService) ufbVar.b).jobFinished((android.app.job.JobParameters) ufbVar.a, !z);
    }

    public /* synthetic */ ufb(anor anorVar, defpackage.uen uenVar, int i) {
        this.$cid = i;
        this.b = anorVar;
        this.a = uenVar;
    }
}
