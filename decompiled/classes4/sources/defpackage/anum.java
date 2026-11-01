package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anum implements defpackage.aodu {
    public final java.nio.ByteBuffer a;

    public anum(java.nio.ByteBuffer byteBuffer) {
        ahvr.cj(byteBuffer, "buffer");
        this.a = byteBuffer;
    }

    @Override // defpackage.aodu
    public final int a() {
        return this.a.position();
    }

    @Override // defpackage.aodu
    public final int b() {
        return this.a.remaining();
    }

    @Override // defpackage.aodu
    public final void c(byte b) {
        this.a.put(b);
    }

    @Override // defpackage.aodu
    public final void d(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }
}
