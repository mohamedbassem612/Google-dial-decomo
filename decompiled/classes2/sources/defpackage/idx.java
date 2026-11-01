package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class idx implements defpackage.idz {
    private final java.io.BufferedOutputStream a;

    public idx(defpackage.idr idrVar, java.lang.String str) {
        ahvr.bM(defpackage.hgu.c(idrVar.c) == 1);
        this.a = new java.io.BufferedOutputStream(new java.io.FileOutputStream(str));
    }

    @Override // defpackage.idz
    public final void b(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) throws java.io.IOException {
        while (byteBuffer.hasRemaining()) {
            this.a.write(byteBuffer.get());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.idz
    public final /* synthetic */ void a(android.media.MediaFormat mediaFormat) {
    }
}
