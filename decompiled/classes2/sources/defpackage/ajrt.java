package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ajrt implements defpackage.ajso {
    final /* synthetic */ defpackage.ajrv a;
    private javax.crypto.spec.SecretKeySpec b;
    private javax.crypto.Cipher c;
    private byte[] d;

    public ajrt(defpackage.ajrv ajrvVar) {
        j$.util.Objects.requireNonNull(ajrvVar);
        this.a = ajrvVar;
    }

    @Override // defpackage.ajso
    public final synchronized void a(java.nio.ByteBuffer byteBuffer, int i, boolean z, java.nio.ByteBuffer byteBuffer2) {
        this.c.init(2, this.b, defpackage.ajrv.j(this.d, i, z));
        this.c.doFinal(byteBuffer, byteBuffer2);
    }

    @Override // defpackage.ajso
    public final synchronized void b(java.nio.ByteBuffer byteBuffer, byte[] bArr) {
        int iRemaining = byteBuffer.remaining();
        defpackage.ajrv ajrvVar = this.a;
        if (iRemaining != ajrvVar.e()) {
            throw new java.security.InvalidAlgorithmParameterException("Invalid header length");
        }
        if (byteBuffer.get() != ajrvVar.e()) {
            throw new java.security.GeneralSecurityException("Invalid ciphertext");
        }
        this.d = new byte[7];
        byte[] bArr2 = new byte[ajrvVar.a];
        byteBuffer.get(bArr2);
        byteBuffer.get(this.d);
        this.b = ajrvVar.k(bArr2, bArr);
        this.c = defpackage.ajrv.i();
    }
}
