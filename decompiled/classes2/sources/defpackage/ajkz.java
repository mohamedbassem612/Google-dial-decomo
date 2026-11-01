package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajkz implements defpackage.ajkp {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;
    private final ajyi b;

    public ajkz(ajyi ajyiVar, int i) {
        java.lang.Object ajkyVar;
        this.$cid = i;
        this.b = ajyiVar;
        try {
            byte[] bArr = defpackage.ajkx.a;
            java.security.Provider providerA = defpackage.ajll.a();
            if (providerA == null) {
                throw new java.security.GeneralSecurityException("Conscrypt is not available.");
            }
            java.security.KeyFactory.getInstance("XDH", providerA);
            javax.crypto.KeyAgreement.getInstance("XDH", providerA);
            defpackage.ajkx ajkxVar = new defpackage.ajkx(providerA);
            java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("XDH", ajkxVar.c);
            keyPairGenerator.initialize(255);
            java.security.KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            byte[] encoded = keyPairGenerateKeyPair.getPrivate().getEncoded();
            if (encoded.length != 48) {
                throw new java.security.GeneralSecurityException("Invalid encoded private key length");
            }
            if (!defpackage.ajnf.a(defpackage.ajkx.a, encoded)) {
                throw new java.security.GeneralSecurityException("Invalid encoded private key prefix");
            }
            java.util.Arrays.copyOfRange(encoded, 16, 48);
            byte[] encoded2 = keyPairGenerateKeyPair.getPublic().getEncoded();
            if (encoded2.length != 44) {
                throw new java.security.GeneralSecurityException("Invalid encoded public key length");
            }
            if (!defpackage.ajnf.a(defpackage.ajkx.b, encoded2)) {
                throw new java.security.GeneralSecurityException("Invalid encoded public key prefix");
            }
            java.util.Arrays.copyOfRange(encoded2, 12, 44);
            ajkyVar = ajkxVar;
            this.a = ajkyVar;
        } catch (java.security.GeneralSecurityException unused) {
            ajkyVar = new defpackage.ajky();
        }
    }

    public static defpackage.ajkz c(defpackage.ajsb ajsbVar) throws java.security.GeneralSecurityException {
        int iOrdinal = ajsbVar.ordinal();
        if (iOrdinal == 0) {
            return new defpackage.ajkz(new ajyi("HmacSha256"), defpackage.ajsb.a, 1);
        }
        if (iOrdinal == 1) {
            return new defpackage.ajkz(new ajyi("HmacSha384"), defpackage.ajsb.b, 1);
        }
        if (iOrdinal == 2) {
            return new defpackage.ajkz(new ajyi("HmacSha512"), defpackage.ajsb.c, 1);
        }
        throw new java.security.GeneralSecurityException("invalid curve type: ".concat(ajsbVar.toString()));
    }

    @Override // defpackage.ajkp
    public final byte[] a() throws java.security.GeneralSecurityException {
        if (this.$cid == 0) {
            if (java.util.Arrays.equals(this.b.m(), defpackage.ajks.f)) {
                return defpackage.ajks.b;
            }
            throw new java.security.GeneralSecurityException("Could not determine HPKE KEM ID");
        }
        int iOrdinal = ((defpackage.ajsb) this.a).ordinal();
        if (iOrdinal == 0) {
            return defpackage.ajks.c;
        }
        if (iOrdinal == 1) {
            return defpackage.ajks.d;
        }
        if (iOrdinal == 2) {
            return defpackage.ajks.e;
        }
        throw new java.security.GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [ajkw, java.lang.Object] */
    @Override // defpackage.ajkp
    public final byte[] b(byte[] bArr, apjb apjbVar) {
        if (this.$cid == 0) {
            byte[] bArrA = this.a.a(((defpackage.ajst) apjbVar.b).c(), bArr);
            byte[] bArrAw = agmc.aw(new byte[][]{bArr, ((defpackage.ajst) apjbVar.a).c()});
            byte[] bArrD = defpackage.ajks.d(defpackage.ajks.b);
            ajyi ajyiVar = this.b;
            return ajyiVar.p(bArrA, bArrAw, bArrD, ajyiVar.l());
        }
        byte[] bArrC = ((defpackage.ajst) apjbVar.b).c();
        defpackage.ajsb ajsbVar = (defpackage.ajsb) this.a;
        byte[] bArrAu = agmc.au(agmc.aq(ajsbVar, bArrC), agmc.ar(agmc.as(ajsbVar), defpackage.ajsc.a, bArr));
        byte[] bArrAw2 = agmc.aw(new byte[][]{bArr, ((defpackage.ajst) apjbVar.a).c()});
        byte[] bArrD2 = defpackage.ajks.d(a());
        ajyi ajyiVar2 = this.b;
        return ajyiVar2.p(bArrAu, bArrAw2, bArrD2, ajyiVar2.l());
    }

    private ajkz(ajyi ajyiVar, defpackage.ajsb ajsbVar, int i) {
        this.$cid = i;
        this.b = ajyiVar;
        this.a = ajsbVar;
    }
}
