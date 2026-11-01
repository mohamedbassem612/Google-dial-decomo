package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajgw implements ajei {
    public static final /* synthetic */ int a = 0;
    private static final java.util.Set b;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        b = j$.util.DesugarCollections.unmodifiableSet(hashSet);
    }

    @java.lang.Deprecated
    public ajgw(defpackage.ajpz ajpzVar) throws java.security.GeneralSecurityException {
        if (!b.contains(ajpzVar.b)) {
            throw new java.lang.IllegalArgumentException("Unsupported DEK key type: " + ajpzVar.b + ". Only Tink AEAD key types are supported.");
        }
        java.lang.String str = ajpzVar.b;
        akzx akzxVarN = defpackage.ajpz.a.n(ajpzVar);
        akzxVarN.u();
        ((defpackage.ajpz) akzxVarN.b).d = a.S(5);
        defpackage.ajee.f(((defpackage.ajpz) akzxVarN.p()).i(), defpackage.ajft.a);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
