package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ajru implements defpackage.ajsp {
    private final javax.crypto.spec.SecretKeySpec a;
    private final javax.crypto.Cipher b;
    private final byte[] c;
    private final java.nio.ByteBuffer d;
    private long e;

    public ajru(defpackage.ajrv ajrvVar, byte[] bArr) {
        j$.util.Objects.requireNonNull(ajrvVar);
        this.e = 0L;
        this.b = defpackage.ajrv.i();
        this.e = 0L;
        byte[] bArrB = defpackage.ajna.b(ajrvVar.a);
        byte[] bArrB2 = defpackage.ajna.b(7);
        this.c = bArrB2;
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(ajrvVar.e());
        this.d = byteBufferAllocate;
        byteBufferAllocate.put((byte) ajrvVar.e());
        byteBufferAllocate.put(bArrB);
        byteBufferAllocate.put(bArrB2);
        byteBufferAllocate.flip();
        this.a = ajrvVar.k(bArrB, bArr);
    }

    @Override // defpackage.ajsp
    public final java.nio.ByteBuffer a() {
        return this.d.asReadOnlyBuffer();
    }

    @Override // defpackage.ajsp
    public final synchronized void b(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3) {
        javax.crypto.spec.GCMParameterSpec gCMParameterSpecJ = defpackage.ajrv.j(this.c, this.e, false);
        javax.crypto.Cipher cipher = this.b;
        cipher.init(1, this.a, gCMParameterSpecJ);
        this.e++;
        if (!byteBuffer2.hasRemaining()) {
            cipher.doFinal(byteBuffer, byteBuffer3);
        } else {
            cipher.update(byteBuffer, byteBuffer3);
            cipher.doFinal(byteBuffer2, byteBuffer3);
        }
    }

    @Override // defpackage.ajsp
    public final synchronized void c(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2) {
        javax.crypto.spec.GCMParameterSpec gCMParameterSpecJ = defpackage.ajrv.j(this.c, this.e, true);
        javax.crypto.Cipher cipher = this.b;
        cipher.init(1, this.a, gCMParameterSpecJ);
        this.e++;
        cipher.doFinal(byteBuffer, byteBuffer2);
    }
}
