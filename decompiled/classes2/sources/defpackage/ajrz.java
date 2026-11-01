package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajrz implements ajen {
    private final java.security.interfaces.ECPrivateKey a;
    private final java.lang.String b;
    private final byte[] c;
    private final defpackage.ajsc d;
    private final defpackage.ajkh e;
    private final byte[] f;
    private final ajyi g;

    private ajrz(java.security.interfaces.ECPrivateKey eCPrivateKey, byte[] bArr, java.lang.String str, defpackage.ajsc ajscVar, defpackage.ajkh ajkhVar, byte[] bArr2) {
        this.a = eCPrivateKey;
        this.g = new ajyi(eCPrivateKey);
        this.c = bArr;
        this.b = str;
        this.d = ajscVar;
        this.e = ajkhVar;
        this.f = bArr2;
    }

    public static ajen b(ajjk ajjkVar) {
        java.security.interfaces.ECPrivateKey eCPrivateKeyAq = agmc.aq((defpackage.ajsb) defpackage.ajsa.a.f(ajjkVar.ap().b), aftt.H((java.math.BigInteger) ajjkVar.c.a));
        byte[] bArrC = new byte[0];
        if (ajjkVar.ap().f != null) {
            bArrC = ajjkVar.ap().f.c();
        }
        return new defpackage.ajrz(eCPrivateKeyAq, bArrC, defpackage.ajsa.b(ajjkVar.ap().c), (defpackage.ajsc) defpackage.ajsa.b.f(ajjkVar.ap().d), defpackage.ajki.a(ajjkVar.ap()), ajjkVar.as().c());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.security.interfaces.ECPrivateKey] */
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int i;
        int length;
        int i2;
        byte[] bArr3 = this.f;
        if (!defpackage.ajnf.a(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        java.security.spec.EllipticCurve curve = this.a.getParams().getCurve();
        defpackage.ajsc ajscVar = this.d;
        int iAo = (agmc.ao(curve) + 7) / 8;
        int iOrdinal = ajscVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new java.security.GeneralSecurityException("unknown EC point format");
                }
                i = iAo << 1;
            }
            length = bArr3.length;
            i2 = i + length;
            if (bArr.length >= i2) {
                throw new java.security.GeneralSecurityException("ciphertext too short");
            }
            byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, length, i2);
            ajyi ajyiVar = this.g;
            java.lang.String str = this.b;
            byte[] bArr4 = this.c;
            defpackage.ajkh ajkhVar = this.e;
            int iA = ajkhVar.a();
            ?? r3 = ajyiVar.a;
            return ajkhVar.b(agmc.al(str, agmc.aw(new byte[][]{bArrCopyOfRange, agmc.au((java.security.interfaces.ECPrivateKey) r3, agmc.ar(r3.getParams(), ajscVar, bArrCopyOfRange))}), bArr4, bArr2, iA), bArr, i2);
        }
        iAo <<= 1;
        i = iAo + 1;
        length = bArr3.length;
        i2 = i + length;
        if (bArr.length >= i2) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange2 = java.util.Arrays.copyOfRange(bArr, length, i2);
        ajyi ajyiVar2 = this.g;
        java.lang.String str2 = this.b;
        byte[] bArr5 = this.c;
        defpackage.ajkh ajkhVar2 = this.e;
        int iA2 = ajkhVar2.a();
        ?? r4 = ajyiVar2.a;
        return ajkhVar2.b(agmc.al(str2, agmc.aw(new byte[][]{bArrCopyOfRange2, agmc.au((java.security.interfaces.ECPrivateKey) r4, agmc.ar(r4.getParams(), ajscVar, bArrCopyOfRange2))}), bArr5, bArr2, iA2), bArr, i2);
    }
}
