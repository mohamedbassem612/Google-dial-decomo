package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahgh implements defpackage.ahzi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ahgh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v20, types: [aoin, java.lang.Object] */
    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj = this.a;
            return ((android.view.LayoutInflater) ((defpackage.ahgi) obj).getBaseContext().getSystemService("layout_inflater")).cloneInContext((android.content.Context) obj);
        }
        if (i != 1) {
            if (i == 2) {
                return defpackage.aaco.a((android.content.Context) this.a);
            }
            defpackage.ahyj ahyjVar = defpackage.akco.a;
            return (java.lang.Boolean) ((defpackage.ahyn) this.a.a()).d(java.lang.Boolean.FALSE);
        }
        defpackage.agsm agsmVar = (defpackage.agsm) this.a;
        defpackage.aoin aoinVar = (defpackage.aoin) agsmVar.e.get(agsmVar.a());
        if (aoinVar != null) {
            return (java.lang.Class) aoinVar.a();
        }
        ((defpackage.aimw) ((defpackage.aimw) defpackage.agsm.a.d()).l("com/google/apps/tiktok/concurrent/AndroidFutures", "getForegroundService", 345, "AndroidFutures.java")).v("Calling attachForegroundService from non-main-process opens the main process which might be unintentional. Instead load and call the generated_android_futures_services macro for this process.");
        return com.google.apps.tiktok.concurrent.InternalForegroundService.class;
    }
}
