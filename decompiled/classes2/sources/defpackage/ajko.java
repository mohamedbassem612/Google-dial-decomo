package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajko implements ajen {
    private static final byte[] a = new byte[0];
    private final defpackage.ajkp b;
    private final defpackage.ajkm c;
    private final int d;
    private final byte[] e;
    private final ajyi f;
    private final apjb g;

    private ajko(apjb apjbVar, defpackage.ajkp ajkpVar, ajyi ajyiVar, defpackage.ajkm ajkmVar, int i, defpackage.ajst ajstVar) {
        this.g = apjbVar;
        this.b = ajkpVar;
        this.f = ajyiVar;
        this.c = ajkmVar;
        this.d = i;
        this.e = ajstVar.c();
    }

    public static ajen b(ajjs ajjsVar) throws java.security.GeneralSecurityException {
        int i;
        ajjr ajjrVarAp = ajjsVar.ap();
        ajjp ajjpVar = ajjrVarAp.a;
        if (ajjpVar == ajjp.g) {
            byte[] bArr = defpackage.ajlb.a;
            if (!defpackage.ajld.b()) {
                throw new java.security.GeneralSecurityException("Can't use X-Wing, as we might be in FIPS mode, Conscrypt is not available, or platform does not support X-Wing.");
            }
            java.security.Provider providerA = defpackage.ajll.a();
            if (providerA == null) {
                throw new java.security.GeneralSecurityException("Can't use X-Wing as Conscrypt is not available");
            }
            ajjr ajjrVarAp2 = ajjsVar.ap();
            defpackage.ajlb ajlbVar = new defpackage.ajlb(java.security.KeyFactory.getInstance("XWING", providerA).generatePrivate(new defpackage.ajla(ajjsVar.b.k())), defpackage.ajki.b(ajjrVarAp2), defpackage.ajks.a(ajjrVarAp2.a), ajjsVar.as().c());
            ajeo ajeoVarA = defpackage.ajld.a(ajjsVar.a);
            byte[] bArr2 = defpackage.ajlb.b;
            byte[] bArr3 = defpackage.ajlb.c;
            defpackage.ajld ajldVar = (defpackage.ajld) ajeoVarA;
            android.crypto.hpke.Message messageM = deh$.ExternalSyntheticApiModelOutline0.m(deh$.ExternalSyntheticApiModelOutline0.m(ajldVar.c), ajldVar.b, bArr3, bArr2, defpackage.ajld.a);
            byte[] bArrM = deh$.ExternalSyntheticApiModelOutline0.m(messageM);
            if (bArrM.length != ajldVar.d) {
                throw new java.lang.IllegalStateException("Encapsulated key has wrong length");
            }
            if (java.util.Arrays.equals(ajlbVar.a(agmc.aw(new byte[][]{ajldVar.e, bArrM, deh$.ExternalSyntheticApiModelOutline0.m$1(messageM)}), bArr3), bArr2)) {
                return ajlbVar;
            }
            throw new java.security.GeneralSecurityException("Public key and private key do not match, cannot create HybridDecrypt instance");
        }
        defpackage.ajkp ajkpVarL = aftt.L(ajjpVar);
        ajjo ajjoVar = ajjrVarAp.b;
        ajjm ajjmVar = ajjrVarAp.c;
        ajyi ajyiVarR = aftt.R(ajjoVar);
        defpackage.ajkm ajkmVarK = aftt.K(ajjmVar);
        ajjp ajjpVar2 = ajjp.f;
        if (ajjpVar.equals(ajjpVar2)) {
            i = 32;
        } else if (ajjpVar.equals(ajjp.a)) {
            i = 65;
        } else if (ajjpVar.equals(ajjp.b)) {
            i = 97;
        } else {
            if (!ajjpVar.equals(ajjp.c)) {
                throw new java.security.GeneralSecurityException("Unrecognized or not NIST HPKE KEM identifier");
            }
            i = 133;
        }
        int i2 = i;
        ajjp ajjpVar3 = ajjsVar.ap().a;
        if (ajjpVar3.equals(ajjpVar2) || ajjpVar3.equals(ajjp.a) || ajjpVar3.equals(ajjp.b) || ajjpVar3.equals(ajjp.c)) {
            return new defpackage.ajko(new apjb(defpackage.ajst.b(ajjsVar.b.k()), ajjsVar.a.b, (byte[]) null), ajkpVarL, ajyiVarR, ajkmVarK, i2, ajjsVar.as());
        }
        throw new java.security.GeneralSecurityException("Unrecognized or not NIST HPKE KEM identifier");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.e;
        int length2 = bArr3.length;
        int i = this.d + length2;
        if (length < i) {
            throw new java.security.GeneralSecurityException("Ciphertext is too short.");
        }
        if (!defpackage.ajnf.a(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, length2, i);
        apjb apjbVar = this.g;
        defpackage.ajkp ajkpVar = this.b;
        ajyi ajyiVar = this.f;
        defpackage.ajkm ajkmVar = this.c;
        byte[] bArrB = ajkpVar.b(bArrCopyOfRange, apjbVar);
        byte[] bArrAw = agmc.aw(new byte[][]{defpackage.ajks.m, ajkpVar.a(), ajyiVar.m(), ajkmVar.b()});
        byte[] bArr4 = defpackage.ajks.l;
        byte[] bArr5 = defpackage.ajkn.a;
        byte[] bArrAw2 = agmc.aw(new byte[][]{defpackage.ajks.a, ajyiVar.o(bArr4, bArr5, "psk_id_hash", bArrAw), ajyiVar.o(bArr4, bArr2, "info_hash", bArrAw)});
        byte[] bArrO = ajyiVar.o(bArrB, bArr5, "secret", bArrAw);
        defpackage.ajkn ajknVar = new defpackage.ajkn(ajyiVar.n(bArrO, bArrAw2, "key", bArrAw, ajkmVar.a()), ajyiVar.n(bArrO, bArrAw2, "base_nonce", bArrAw, 12), java.math.BigInteger.ONE.shiftLeft(96).subtract(java.math.BigInteger.ONE), ajkmVar);
        return ajknVar.b.c(ajknVar.c, ajknVar.a(), bArr, i, a);
    }
}
