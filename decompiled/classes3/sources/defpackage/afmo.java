package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afmo {
    public static final aimz a = aimz.i("com/google/android/libraries/user/profile/common/glide/FifeHeaderProvider");
    public final java.util.Map b = new java.util.LinkedHashMap();
    public defpackage.abyz c;
    public final defpackage.afpl d;

    public afmo(defpackage.afpl afplVar) {
        this.d = afplVar;
    }

    public final defpackage.xzk a(android.accounts.Account account) {
        defpackage.xzi xziVar = new defpackage.xzi();
        java.util.Map map = this.b;
        java.lang.String strD = (java.lang.String) map.get(account);
        if (strD == null) {
            try {
                defpackage.afpl afplVar = this.d;
                java.lang.Object obj = afplVar.b;
                java.lang.Object obj2 = afplVar.a;
                java.lang.String[] strArr = zwq.b;
                strD = zwq.d((android.content.Context) obj2, account, (java.lang.String) obj, new android.os.Bundle());
                aooh.e(strD, "getToken(...)");
                map.put(account, strD);
            } catch (java.lang.Exception e) {
                a.d().k(e).l("com/google/android/libraries/user/profile/common/glide/FifeHeaderProvider", "getNewAccessToken", 68, "FifeHeaderProvider.kt").v("Failed to obtain access token");
                strD = "";
            }
        }
        xziVar.b("Authorization", "Bearer ".concat(java.lang.String.valueOf(strD)));
        return xziVar.a();
    }
}
