package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ajrn implements defpackage.ajsp {
    final /* synthetic */ defpackage.ajro a;
    private final javax.crypto.spec.SecretKeySpec b;
    private final javax.crypto.spec.SecretKeySpec c;
    private final javax.crypto.Cipher d;
    private final javax.crypto.Mac e;
    private final byte[] f;
    private final java.nio.ByteBuffer g;
    private long h;

    public ajrn(defpackage.ajro ajroVar, byte[] bArr) {
        j$.util.Objects.requireNonNull(ajroVar);
        this.a = ajroVar;
        this.h = 0L;
        this.d = defpackage.ajro.i();
        this.e = ajroVar.j();
        this.h = 0L;
        byte[] bArrB = defpackage.ajna.b(ajroVar.a);
        byte[] bArrB2 = defpackage.ajna.b(7);
        this.f = bArrB2;
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(ajroVar.e());
        this.g = byteBufferAllocate;
        byteBufferAllocate.put((byte) ajroVar.e());
        byteBufferAllocate.put(bArrB);
        byteBufferAllocate.put(bArrB2);
        byteBufferAllocate.flip();
        byte[] bArrM = ajroVar.m(bArrB, bArr);
        this.b = ajroVar.l(bArrM);
        this.c = ajroVar.k(bArrM);
    }

    @Override // defpackage.ajsp
    public final java.nio.ByteBuffer a() {
        return this.g.asReadOnlyBuffer();
    }

    @Override // defpackage.ajsp
    public final synchronized void b(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3) {
        byte[] bArr = this.f;
        int iPosition = byteBuffer3.position();
        byte[] bArrN = defpackage.ajro.n(bArr, this.h, false);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArrN);
        javax.crypto.Cipher cipher = this.d;
        cipher.init(1, this.b, ivParameterSpec);
        this.h++;
        cipher.update(byteBuffer, byteBuffer3);
        cipher.doFinal(byteBuffer2, byteBuffer3);
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer3.duplicate();
        byteBufferDuplicate.flip();
        byteBufferDuplicate.position(iPosition);
        javax.crypto.Mac mac = this.e;
        mac.init(this.c);
        mac.update(bArrN);
        mac.update(byteBufferDuplicate);
        byteBuffer3.put(mac.doFinal(), 0, this.a.b);
    }

    @Override // defpackage.ajsp
    public final synchronized void c(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2) {
        byte[] bArr = this.f;
        int iPosition = byteBuffer2.position();
        byte[] bArrN = defpackage.ajro.n(bArr, this.h, true);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArrN);
        javax.crypto.Cipher cipher = this.d;
        cipher.init(1, this.b, ivParameterSpec);
        this.h++;
        cipher.doFinal(byteBuffer, byteBuffer2);
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
        byteBufferDuplicate.flip();
        byteBufferDuplicate.position(iPosition);
        javax.crypto.Mac mac = this.e;
        mac.init(this.c);
        mac.update(bArrN);
        mac.update(byteBufferDuplicate);
        byteBuffer2.put(mac.doFinal(), 0, this.a.b);
    }
}
