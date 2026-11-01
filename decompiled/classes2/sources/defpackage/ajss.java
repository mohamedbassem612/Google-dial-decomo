package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajss {
    static {
        java.util.regex.Pattern.compile(java.lang.String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);
        java.util.regex.Pattern.compile(java.lang.String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);
    }

    public static void a(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", java.lang.Integer.valueOf(i << 3)));
        }
    }

    public static java.lang.String b(java.lang.String str) {
        if (str.toLowerCase(java.util.Locale.US).startsWith("android-keystore://")) {
            return str.substring(19);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("key URI must start with %s", "android-keystore://"));
    }
}
