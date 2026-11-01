package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class airk extends airm {
    private java.nio.ByteBuffer a;

    public final java.nio.ByteBuffer a() {
        java.nio.ByteBuffer byteBuffer = this.a;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        this.a = byteBufferOrder;
        return byteBufferOrder;
    }

    protected void b(java.nio.ByteBuffer byteBuffer) {
        throw null;
    }

    public final void c(char c) {
        java.nio.ByteBuffer byteBufferA = a();
        byteBufferA.putChar(c);
        d(byteBufferA, 2);
    }

    public final void d(java.nio.ByteBuffer byteBuffer, int i) {
        try {
            e(byteBuffer.array(), i);
        } finally {
            byteBuffer.clear();
        }
    }

    protected void e(byte[] bArr, int i) {
        throw null;
    }

    public final void f(java.nio.ByteBuffer byteBuffer) {
        b(byteBuffer);
    }

    public final void g(byte[] bArr, int i) {
        ahvr.bX(0, i, bArr.length);
        e(bArr, i);
    }

    public final void h(byte[] bArr) {
        ahvr.ci(bArr);
        e(bArr, bArr.length);
    }
}
