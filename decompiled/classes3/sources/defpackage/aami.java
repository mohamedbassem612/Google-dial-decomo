package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aami implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    private final android.content.Context a;
    private final com.google.android.gms.googlehelp.GoogleHelp b;
    private final long c;
    private final aaoo d;

    public aami(android.content.Context context, com.google.android.gms.googlehelp.GoogleHelp googleHelp, aaoo aaooVar, long j, int i) {
        this.$cid = i;
        this.a = context;
        this.b = googleHelp;
        this.d = aaooVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List listSingletonList;
        java.util.List listA;
        if (this.$cid == 0) {
            try {
                defpackage.aamc aamcVar = new defpackage.aamc();
                aamcVar.c();
                listSingletonList = this.d.b();
                if (listSingletonList == null) {
                    listSingletonList = new java.util.ArrayList(1);
                }
                try {
                    listSingletonList.add(android.util.Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", java.lang.String.valueOf(aamcVar.a())));
                } catch (java.lang.UnsupportedOperationException unused) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(listSingletonList);
                    arrayList.add(android.util.Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", java.lang.String.valueOf(aamcVar.a())));
                    listSingletonList = arrayList;
                }
            } catch (java.lang.Exception e) {
                android.util.Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
                listSingletonList = java.util.Collections.singletonList(android.util.Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
            }
            android.content.Context context = this.a;
            acxg acxgVar = defpackage.aamh.a;
            defpackage.aams aamsVar = new defpackage.aams(context);
            com.google.android.gms.googlehelp.GoogleHelp googleHelp = this.b;
            long j = this.c;
            aade aadeVar = ((aada) aamsVar).i;
            defpackage.aamk aamkVar = new defpackage.aamk((defpackage.aamr) defpackage.aams.a, aadeVar, aaoo.l(listSingletonList), j, googleHelp);
            aadeVar.b(aamkVar);
            aahm.b(aamkVar);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle(1);
        try {
            defpackage.aamc aamcVar2 = new defpackage.aamc();
            aamcVar2.c();
            listA = this.d.a();
            java.io.File cacheDir = this.a.getCacheDir();
            if (listA != null && !listA.isEmpty() && cacheDir != null) {
                java.util.Iterator it = listA.iterator();
                while (it.hasNext()) {
                    ((com.google.android.gms.feedback.FileTeleporter) it.next()).e = cacheDir;
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", java.lang.String.valueOf(aamcVar2.a()));
        } catch (java.lang.Exception e2) {
            android.util.Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e2);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            listA = null;
        }
        android.content.Context context2 = this.a;
        com.google.android.gms.feedback.FeedbackOptions feedbackOptionsA = com.google.android.gms.feedback.FeedbackOptions.a(listA);
        acxg acxgVar2 = defpackage.aamh.a;
        defpackage.aams aamsVar2 = new defpackage.aams(context2);
        com.google.android.gms.googlehelp.GoogleHelp googleHelp2 = this.b;
        long j2 = this.c;
        aade aadeVar2 = ((aada) aamsVar2).i;
        defpackage.aamm aammVar = new defpackage.aamm((defpackage.aamr) defpackage.aams.a, aadeVar2, feedbackOptionsA, bundle, j2, googleHelp2);
        aadeVar2.b(aammVar);
        aahm.b(aammVar);
    }
}
