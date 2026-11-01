package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahkj implements defpackage.ahek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ahkj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.ahek
    public final defpackage.ajcq a() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            defpackage.agsm.i(1292, ((defpackage.agov) obj).a(), "Failed account invalidation.", new java.lang.Object[0]);
            return defpackage.ajcm.a;
        }
        try {
            android.content.pm.PackageInfo packageInfo = ((android.content.Context) obj).getPackageManager().getPackageInfo(((android.content.Context) obj).getPackageName(), 0);
            if (packageInfo.applicationInfo.targetSdkVersion < 24) {
                try {
                    android.system.Os.chmod(packageInfo.applicationInfo.dataDir, 448);
                } catch (java.lang.Exception e) {
                    throw new java.io.IOException(e);
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.io.IOException unused) {
        }
        return defpackage.ajcm.a;
    }
}
