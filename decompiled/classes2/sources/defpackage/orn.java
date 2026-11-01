package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class orn {
    public static final aimz a = aimz.i("com/android/dialer/http/impl/DigestAuthHeaderBuilder");

    public static java.lang.String a(java.lang.String str) {
        return "\"" + str + '\"';
    }

    public static java.security.MessageDigest b() {
        try {
            return java.security.MessageDigest.getInstance("MD5");
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.IllegalStateException("Couldn't find MD5 algorithm", e);
        }
    }
}
