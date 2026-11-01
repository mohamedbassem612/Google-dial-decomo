package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoaz extends defpackage.anuq {
    final java.nio.ByteBuffer a;

    public aoaz(java.nio.ByteBuffer byteBuffer) {
        ahvr.cj(byteBuffer, "bytes");
        this.a = byteBuffer;
    }

    @Override // defpackage.anuq, defpackage.aoaw
    public final void b() {
        this.a.mark();
    }

    @Override // defpackage.anuq, defpackage.aoaw
    public final void c() {
        this.a.reset();
    }

    @Override // defpackage.anuq, defpackage.aoaw
    public final boolean d() {
        return true;
    }

    @Override // defpackage.aoaw
    public final int e() {
        a(1);
        return this.a.get() & 255;
    }

    @Override // defpackage.aoaw
    public final int f() {
        return this.a.remaining();
    }

    @Override // defpackage.aoaw
    public final /* bridge */ /* synthetic */ defpackage.aoaw g(int i) {
        a(i);
        java.nio.ByteBuffer byteBuffer = this.a;
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.limit(byteBuffer.position() + i);
        byteBuffer.position(byteBuffer.position() + i);
        return new defpackage.aoaz(byteBufferDuplicate);
    }

    @Override // defpackage.aoaw
    public final void i(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        a(i);
        java.nio.ByteBuffer byteBuffer = this.a;
        if (byteBuffer.hasArray()) {
            outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i);
            byteBuffer.position(byteBuffer.position() + i);
        } else {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            outputStream.write(bArr);
        }
    }

    @Override // defpackage.aoaw
    public final void j(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    @Override // defpackage.aoaw
    public final void k(int i) {
        a(i);
        java.nio.ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
    }
}
