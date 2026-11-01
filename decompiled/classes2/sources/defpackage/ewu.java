package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ewu extends defpackage.ewp {
    public defpackage.eqg b;
    public final defpackage.ewq c = new defpackage.ewq();
    public java.nio.ByteBuffer d;
    public boolean e;
    public long f;
    public java.nio.ByteBuffer g;
    private final int h;

    static {
        defpackage.equ.b("media3.decoder");
    }

    public ewu(int i) {
        this.h = i;
    }

    private final java.nio.ByteBuffer g(int i) {
        int i2 = this.h;
        if (i2 == 1) {
            return java.nio.ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return java.nio.ByteBuffer.allocateDirect(i);
        }
        java.nio.ByteBuffer byteBuffer = this.d;
        throw new defpackage.ewt(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public final void d(int i) {
        java.nio.ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = g(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.d = byteBuffer;
            return;
        }
        java.nio.ByteBuffer byteBufferG = g(i2);
        byteBufferG.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferG.put(byteBuffer);
        }
        this.d = byteBufferG;
    }

    @Override // defpackage.ewp
    public void dJ() {
        super.dJ();
        java.nio.ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        java.nio.ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    public final void e() {
        java.nio.ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        java.nio.ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final void f(int i) {
        java.nio.ByteBuffer byteBuffer = this.g;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.g = java.nio.ByteBuffer.allocate(i);
        } else {
            this.g.clear();
        }
    }
}
