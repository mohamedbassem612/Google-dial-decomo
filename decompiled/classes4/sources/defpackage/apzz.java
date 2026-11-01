package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apzz {
    private static final java.lang.String b = "apzx";
    public static final java.security.MessageDigest a = a();

    private static java.security.MessageDigest a() {
        try {
            return java.security.MessageDigest.getInstance("MD5");
        } catch (java.security.NoSuchAlgorithmException e) {
            java.lang.String str = b;
            if (android.util.Log.isLoggable(str, 3)) {
                aodc.q(str, "Error while instantiating messageDigest", new java.lang.Object[]{e});
            }
            return null;
        }
    }
}
