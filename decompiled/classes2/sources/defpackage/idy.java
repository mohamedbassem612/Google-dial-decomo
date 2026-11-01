package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class idy implements defpackage.idz {
    private final android.media.MediaMuxer a;
    private j$.util.OptionalInt b = j$.util.OptionalInt.empty();

    public idy(defpackage.idr idrVar, java.lang.String str) {
        int iC = defpackage.hgu.c(idrVar.c);
        if (iC == 0) {
            throw null;
        }
        if (iC - 1 != 1) {
            throw new java.lang.UnsupportedOperationException("unsupported format");
        }
        this.a = new android.media.MediaMuxer(str, 0);
    }

    @Override // defpackage.idz
    public final void a(android.media.MediaFormat mediaFormat) {
        android.media.MediaMuxer mediaMuxer = this.a;
        this.b = j$.util.OptionalInt.of(mediaMuxer.addTrack(mediaFormat));
        mediaMuxer.start();
    }

    @Override // defpackage.idz
    public final void b(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        ahvr.bZ(this.b.isPresent(), "init() hasn't been called");
        this.a.writeSampleData(this.b.getAsInt(), byteBuffer, bufferInfo);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        android.media.MediaMuxer mediaMuxer = this.a;
        mediaMuxer.stop();
        mediaMuxer.release();
    }
}
