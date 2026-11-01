package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajki {
    public static final byte[] a = new byte[0];

    public static defpackage.ajkh a(ajjj ajjjVar) throws java.security.GeneralSecurityException {
        ajgm ajgmVar = ajjjVar.g;
        if (ajgmVar instanceof ajgm) {
            return new defpackage.ajkf(ajgmVar);
        }
        if (ajgmVar instanceof ajgc) {
            return new defpackage.ajkg((ajgc) ajgmVar, 1);
        }
        if (ajgmVar instanceof ajiw) {
            return new defpackage.ajkg((ajiw) ajgmVar, 0);
        }
        throw new java.security.GeneralSecurityException("Unsupported DEM parameters: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajgmVar))));
    }

    static /* synthetic */ java.lang.String b(ajjr ajjrVar) throws java.security.GeneralSecurityException {
        ajjp ajjpVar = ajjrVar.a;
        if (ajjpVar != ajjp.g) {
            throw new java.security.GeneralSecurityException("Currently unsupported KEM: ".concat(ajjpVar.toString()));
        }
        ajjo ajjoVar = ajjrVar.b;
        if (ajjoVar != ajjo.a) {
            throw new java.security.GeneralSecurityException("Currently unsupported KDF: ".concat(ajjoVar.toString()));
        }
        ajjm ajjmVar = ajjrVar.c;
        if (ajjmVar == ajjm.a) {
            return "XWING/HKDF_SHA256/AES_128_GCM";
        }
        if (ajjmVar == ajjm.b) {
            return "XWING/HKDF_SHA256/AES_256_GCM";
        }
        if (ajjmVar == ajjm.c) {
            return "XWING/HKDF_SHA256/CHACHA20POLY1305";
        }
        throw new java.security.GeneralSecurityException("Unknown AEAD ID: ".concat(ajjmVar.toString()));
    }
}
