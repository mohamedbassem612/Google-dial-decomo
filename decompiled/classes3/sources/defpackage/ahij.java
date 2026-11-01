package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahij implements ahip {
    public final /* synthetic */ android.app.Activity a;
    public final /* synthetic */ defpackage.abtr b;

    public /* synthetic */ ahij(defpackage.abtr abtrVar, android.app.Activity activity) {
        this.b = abtrVar;
        this.a = activity;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoin, java.lang.Object] */
    public final android.graphics.Bitmap a() {
        try {
            return defpackage.aawd.e(this.a.getWindow().getDecorView().getRootView());
        } catch (java.lang.Exception e) {
            android.util.Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }
}
