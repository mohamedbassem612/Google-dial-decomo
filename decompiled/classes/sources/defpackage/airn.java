package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class airn extends defpackage.airm {
    public final java.nio.ByteBuffer a = java.nio.ByteBuffer.allocate(23).order(java.nio.ByteOrder.LITTLE_ENDIAN);

    protected airn() {
    }

    private final void m() {
        java.nio.ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            e(byteBuffer);
        }
        byteBuffer.compact();
    }

    private final void n(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBuffer2 = this.a;
        if (byteBuffer.remaining() <= byteBuffer2.remaining()) {
            byteBuffer2.put(byteBuffer);
            d();
            return;
        }
        int iPosition = 16 - byteBuffer2.position();
        for (int i = 0; i < iPosition; i++) {
            byteBuffer2.put(byteBuffer.get());
        }
        m();
        while (byteBuffer.remaining() >= 16) {
            e(byteBuffer);
        }
        byteBuffer2.put(byteBuffer);
    }

    protected abstract defpackage.airq b();

    @Override // defpackage.airm
    public final void c(char c) {
        this.a.putChar(c);
        d();
    }

    public final void d() {
        if (this.a.remaining() < 8) {
            m();
        }
    }

    protected abstract void e(java.nio.ByteBuffer byteBuffer);

    @Override // defpackage.airm, defpackage.airs
    public final void f(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteOrder byteOrderOrder = byteBuffer.order();
        try {
            byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            n(byteBuffer);
        } finally {
            byteBuffer.order(byteOrderOrder);
        }
    }

    @Override // defpackage.airm, defpackage.airs
    public final void g(byte[] bArr, int i) {
        n(java.nio.ByteBuffer.wrap(bArr, 0, i).order(java.nio.ByteOrder.LITTLE_ENDIAN));
    }

    protected void l(java.nio.ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.airs
    public final defpackage.airq o() {
        m();
        java.nio.ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            l(byteBuffer);
            byteBuffer.position(byteBuffer.limit());
        }
        return b();
    }
}
