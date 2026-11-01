package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aama implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    private final android.content.Context a;
    private final long b;
    private final aaoo c;

    public aama(android.content.Context context, aaoo aaooVar, long j, int i) {
        this.$cid = i;
        this.a = context;
        this.c = aaooVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List listSingletonList;
        java.util.List listA;
        if (this.$cid == 0) {
            try {
                defpackage.aamc aamcVar = new defpackage.aamc();
                aamcVar.c();
                listSingletonList = this.c.b();
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
                android.util.Log.w("gF_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
                listSingletonList = java.util.Collections.singletonList(android.util.Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
            }
            android.content.Context context = this.a;
            acxg acxgVar = defpackage.aals.a;
            new defpackage.aawd(context).o(aaoo.l(listSingletonList), this.b);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle(1);
        try {
            defpackage.aamc aamcVar2 = new defpackage.aamc();
            aamcVar2.c();
            listA = this.c.a();
            java.io.File cacheDir = this.a.getCacheDir();
            if (listA != null && !listA.isEmpty() && cacheDir != null) {
                java.util.Iterator it = listA.iterator();
                while (it.hasNext()) {
                    ((com.google.android.gms.feedback.FileTeleporter) it.next()).e = cacheDir;
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", java.lang.String.valueOf(aamcVar2.a()));
        } catch (java.lang.Exception e2) {
            android.util.Log.w("gF_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e2);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            listA = null;
        }
        long j = this.b;
        android.content.Context context2 = this.a;
        com.google.android.gms.feedback.FeedbackOptions feedbackOptionsA = com.google.android.gms.feedback.FeedbackOptions.a(listA);
        acxg acxgVar2 = defpackage.aals.a;
        new defpackage.aawd(context2).n(feedbackOptionsA, bundle, j);
    }
}
