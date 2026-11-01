package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajsm implements defpackage.ajoc {
    public final java.lang.String a;
    public final java.security.Key b;
    private final java.lang.ThreadLocal c;
    private final int d;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public ajsm(java.lang.String str, java.security.Key key) throws java.security.GeneralSecurityException {
        int i;
        defpackage.ajsl ajslVar = new defpackage.ajsl(this);
        this.c = ajslVar;
        if (!ajsz.u(2)) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = str;
        this.b = key;
        if (key.getEncoded().length < 16) {
            throw new java.security.InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    i = 20;
                    this.d = i;
                    ajslVar.get();
                    return;
                }
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    i = 28;
                    this.d = i;
                    ajslVar.get();
                    return;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    i = 32;
                    this.d = i;
                    ajslVar.get();
                    return;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    i = 48;
                    this.d = i;
                    ajslVar.get();
                    return;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    i = 64;
                    this.d = i;
                    ajslVar.get();
                    return;
                }
                break;
        }
        throw new java.security.NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
    }

    @Override // defpackage.ajoc
    public final byte[] a(byte[] bArr, int i) throws java.security.InvalidAlgorithmParameterException {
        if (i > this.d) {
            throw new java.security.InvalidAlgorithmParameterException("tag size too big");
        }
        java.lang.ThreadLocal threadLocal = this.c;
        ((javax.crypto.Mac) threadLocal.get()).update(bArr);
        return java.util.Arrays.copyOf(((javax.crypto.Mac) threadLocal.get()).doFinal(), i);
    }
}
