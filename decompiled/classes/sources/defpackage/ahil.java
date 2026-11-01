package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class ahil implements defpackage.agtk {
    final /* synthetic */ defpackage.ahim a;

    public ahil(defpackage.ahim ahimVar) {
        j$.util.Objects.requireNonNull(ahimVar);
        this.a = ahimVar;
    }

    @Override // defpackage.agtk
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.ahim.a.c()).k(th)).l("com/google/apps/tiktok/monitoring/feedback/HelpAndFeedbackStarter$2", "onFailure", '8', "HelpAndFeedbackStarter.java")).v("Unable to start HelpAndFeedback");
    }

    @Override // defpackage.agtk
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        d((android.content.Intent) obj2);
    }

    public final void d(android.content.Intent intent) {
        try {
            defpackage.ahim ahimVar = this.a;
            new afpl(ahimVar.b).N(intent);
        } catch (android.os.BadParcelableException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.ahim.a.c()).k(e)).l("com/google/apps/tiktok/monitoring/feedback/HelpAndFeedbackStarter$2", "onSuccess", '2', "HelpAndFeedbackStarter.java")).v("Unable to start HelpAndFeedback");
        }
    }

    @Override // defpackage.agtk
    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
