package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajwq {
    public static final java.lang.String[] a = {"*", "FCM", "GCM", ""};
    public final android.content.SharedPreferences b;
    public final java.lang.String c;

    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    public ajwq(ajtc ajtcVar) {
        this.b = ajtcVar.a().getSharedPreferences("com.google.android.gms.appid", 0);
        java.lang.String str = ajtcVar.c().c;
        if (str == null) {
            str = ajtcVar.c().b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                java.lang.String[] strArrSplit = str.split(":");
                if (strArrSplit.length == 4) {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                } else {
                    str = null;
                }
            }
        }
        this.c = str;
    }

    public static java.lang.String a(java.security.PublicKey publicKey) {
        try {
            byte[] bArrDigest = java.security.MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) ((bArrDigest[0] & 15) + 112);
            return android.util.Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (java.security.NoSuchAlgorithmException unused) {
            android.util.Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final java.security.PublicKey b(java.lang.String str) {
        try {
            return java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(str, 8)));
        } catch (java.lang.IllegalArgumentException | java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException e) {
            android.util.Log.w("ContentValues", "Invalid key stored ".concat(e.toString()));
            return null;
        }
    }
}
