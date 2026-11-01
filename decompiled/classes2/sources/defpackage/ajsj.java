package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajsj implements defpackage.ajoc {
    private final /* synthetic */ int $cid;
    final java.lang.Object a;
    final java.lang.Object b;

    public ajsj(byte[] bArr, java.security.Provider provider, int i) throws java.security.GeneralSecurityException {
        this.$cid = i;
        if (!ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.b = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        this.a = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ajoc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ajoc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.security.Key] */
    @Override // defpackage.ajoc
    public final byte[] a(byte[] bArr, int i) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        if (this.$cid == 0) {
            return bArr.length <= 64 ? this.a.a(bArr, i) : this.b.a(bArr, i);
        }
        if (i > 16) {
            throw new java.security.InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        java.lang.Object obj = this.a;
        ?? r2 = this.b;
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance("AESCMAC", (java.security.Provider) obj);
        mac.init(r2);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i == bArrDoFinal.length ? bArrDoFinal : java.util.Arrays.copyOf(bArrDoFinal, i);
    }

    public ajsj(defpackage.ajoc ajocVar, defpackage.ajoc ajocVar2, int i) {
        this.$cid = i;
        this.a = ajocVar;
        this.b = ajocVar2;
    }
}
