package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class agrj implements agtk {
    final /* synthetic */ defpackage.agro a;

    public agrj(defpackage.agro agroVar) {
        j$.util.Objects.requireNonNull(agroVar);
        this.a = agroVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        android.content.Intent intentPutExtra = new android.content.Intent().putExtra("account_error", (java.io.Serializable) new defpackage.agnl());
        xtq xtqVar = this.a.r;
        xtqVar.u(intentPutExtra);
        android.app.Activity activity = (android.app.Activity) xtqVar.a;
        activity.setResult(0, intentPutExtra);
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        android.content.Intent intentPutExtra = new android.content.Intent().putExtra("new_account_id", ((com.google.apps.tiktok.account.AccountId) obj).a());
        xtq xtqVar = this.a.r;
        xtqVar.u(intentPutExtra);
        android.app.Activity activity = (android.app.Activity) xtqVar.a;
        activity.setResult(-1, intentPutExtra);
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
