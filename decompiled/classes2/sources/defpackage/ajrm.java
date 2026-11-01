package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ajrm implements defpackage.ajso {
    final /* synthetic */ defpackage.ajro a;
    private javax.crypto.spec.SecretKeySpec b;
    private javax.crypto.spec.SecretKeySpec c;
    private javax.crypto.Cipher d;
    private javax.crypto.Mac e;
    private byte[] f;

    public ajrm(defpackage.ajro ajroVar) {
        j$.util.Objects.requireNonNull(ajroVar);
        this.a = ajroVar;
    }

    @Override // defpackage.ajso
    public final synchronized void a(java.nio.ByteBuffer byteBuffer, int i, boolean z, java.nio.ByteBuffer byteBuffer2) {
        int iPosition = byteBuffer.position();
        byte[] bArrN = defpackage.ajro.n(this.f, i, z);
        int iRemaining = byteBuffer.remaining();
        int i2 = this.a.b;
        if (iRemaining < i2) {
            throw new java.security.GeneralSecurityException("Ciphertext too short");
        }
        int i3 = iPosition + (iRemaining - i2);
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.limit(i3);
        java.nio.ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
        byteBufferDuplicate2.position(i3);
        this.e.init(this.c);
        this.e.update(bArrN);
        this.e.update(byteBufferDuplicate);
        byte[] bArrCopyOf = java.util.Arrays.copyOf(this.e.doFinal(), i2);
        byte[] bArr = new byte[i2];
        byteBufferDuplicate2.get(bArr);
        if (!java.security.MessageDigest.isEqual(bArr, bArrCopyOf)) {
            throw new java.security.GeneralSecurityException("Tag mismatch");
        }
        byteBuffer.limit(i3);
        this.d.init(1, this.b, new javax.crypto.spec.IvParameterSpec(bArrN));
        this.d.doFinal(byteBuffer, byteBuffer2);
    }

    @Override // defpackage.ajso
    public final synchronized void b(java.nio.ByteBuffer byteBuffer, byte[] bArr) {
        int iRemaining = byteBuffer.remaining();
        defpackage.ajro ajroVar = this.a;
        if (iRemaining != ajroVar.e()) {
            throw new java.security.InvalidAlgorithmParameterException("Invalid header length");
        }
        if (byteBuffer.get() != ajroVar.e()) {
            throw new java.security.GeneralSecurityException("Invalid ciphertext");
        }
        this.f = new byte[7];
        byte[] bArr2 = new byte[ajroVar.a];
        byteBuffer.get(bArr2);
        byteBuffer.get(this.f);
        byte[] bArrM = ajroVar.m(bArr2, bArr);
        this.b = ajroVar.l(bArrM);
        this.c = ajroVar.k(bArrM);
        this.d = defpackage.ajro.i();
        this.e = ajroVar.j();
    }
}
