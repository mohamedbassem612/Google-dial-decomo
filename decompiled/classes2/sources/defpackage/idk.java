package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class idk extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    private static final aimz d = aimz.i("com/android/dialer/audiodecoder/DecodingInputStream");
    private static final long e;
    public final int a;
    public final int b;
    public final int c;
    private boolean f;
    private final android.media.MediaExtractor g;
    private final android.media.MediaCodec h;
    private boolean i;
    private boolean j;
    private int k;
    private j$.util.Optional l = j$.util.Optional.empty();
    private int m;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        e = 5000L;
    }

    public idk(byte[] bArr) throws java.io.IOException {
        android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
        this.g = mediaExtractor;
        mediaExtractor.setDataSource(new defpackage.idj(bArr));
        mediaExtractor.selectTrack(0);
        android.media.MediaFormat trackFormat = mediaExtractor.getTrackFormat(0);
        d.b().l("com/android/dialer/audiodecoder/DecodingInputStream", "<init>", 62, "DecodingInputStream.java").y("mediaFormat: %s", trackFormat);
        java.lang.String string = trackFormat.getString("mime");
        this.a = trackFormat.getInteger("sample-rate");
        this.b = trackFormat.getInteger("channel-count");
        this.c = trackFormat.containsKey("pcm-encoding") ? trackFormat.getInteger("pcm-encoding") : 2;
        android.media.MediaCodec mediaCodecCreateDecoderByType = android.media.MediaCodec.createDecoderByType(string);
        this.h = mediaCodecCreateDecoderByType;
        mediaCodecCreateDecoderByType.configure(trackFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
        mediaCodecCreateDecoderByType.start();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.release();
        android.media.MediaCodec mediaCodec = this.h;
        mediaCodec.stop();
        mediaCodec.release();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int iMin;
        boolean z;
        long sampleTime;
        int i4;
        boolean z2;
        if (this.j && this.i) {
            return -1;
        }
        int iMin2 = java.lang.Math.min(bArr.length - i, i2);
        int i5 = 0;
        int i6 = i;
        while (!this.j && iMin2 > 0) {
            if (!this.i) {
                android.media.MediaCodec mediaCodec = this.h;
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(e);
                if (iDequeueInputBuffer < 0) {
                    z = false;
                } else {
                    android.media.MediaExtractor mediaExtractor = this.g;
                    int sampleData = mediaExtractor.readSampleData(mediaCodec.getInputBuffer(iDequeueInputBuffer), 0);
                    if (sampleData < 0) {
                        sampleTime = 0;
                        i4 = 0;
                        z2 = true;
                    } else {
                        sampleTime = mediaExtractor.getSampleTime();
                        i4 = sampleData;
                        z2 = false;
                    }
                    boolean z3 = z2;
                    mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, i4, sampleTime, true != z2 ? 0 : 4);
                    if (z3) {
                        z = z3;
                    } else {
                        mediaExtractor.advance();
                        z = false;
                    }
                }
                this.i = z;
            }
            if (this.k != 0 || this.l.isPresent()) {
                i3 = this.k;
            } else {
                android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                android.media.MediaCodec mediaCodec2 = this.h;
                int iDequeueOutputBuffer = mediaCodec2.dequeueOutputBuffer(bufferInfo, e);
                this.m = iDequeueOutputBuffer;
                if (iDequeueOutputBuffer >= 0) {
                    this.l = j$.util.Optional.ofNullable(mediaCodec2.getOutputBuffer(iDequeueOutputBuffer));
                    i3 = bufferInfo.size;
                    if ((bufferInfo.flags & 4) != 0) {
                        this.f = true;
                    }
                } else {
                    iMin = 0;
                }
                iMin2 -= iMin;
                i6 += iMin;
                i5 += iMin;
            }
            iMin = java.lang.Math.min(i3, iMin2);
            if (this.l.isPresent()) {
                ((java.nio.ByteBuffer) this.l.orElseThrow()).get(bArr, i6, iMin);
                this.k = i3 - iMin;
            }
            if (this.k == 0) {
                this.h.releaseOutputBuffer(this.m, false);
                this.l = j$.util.Optional.empty();
                if (this.f) {
                    this.j = true;
                }
            }
            iMin2 -= iMin;
            i6 += iMin;
            i5 += iMin;
        }
        return i5;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    public idk(java.lang.String str) throws java.io.IOException {
        android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
        this.g = mediaExtractor;
        mediaExtractor.setDataSource(str);
        mediaExtractor.selectTrack(0);
        android.media.MediaFormat trackFormat = mediaExtractor.getTrackFormat(0);
        d.b().l("com/android/dialer/audiodecoder/DecodingInputStream", "<init>", 127, "DecodingInputStream.java").y("mediaFormat: %s", trackFormat);
        java.lang.String string = trackFormat.getString("mime");
        this.a = trackFormat.getInteger("sample-rate");
        this.b = trackFormat.getInteger("channel-count");
        this.c = trackFormat.containsKey("pcm-encoding") ? trackFormat.getInteger("pcm-encoding") : 2;
        android.media.MediaCodec mediaCodecCreateDecoderByType = android.media.MediaCodec.createDecoderByType(string);
        this.h = mediaCodecCreateDecoderByType;
        mediaCodecCreateDecoderByType.configure(trackFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
        mediaCodecCreateDecoderByType.start();
    }

    public idk(android.content.Context context, android.net.Uri uri) throws java.io.IOException {
        android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
        this.g = mediaExtractor;
        mediaExtractor.setDataSource(context, uri, (java.util.Map<java.lang.String, java.lang.String>) null);
        mediaExtractor.selectTrack(0);
        android.media.MediaFormat trackFormat = mediaExtractor.getTrackFormat(0);
        d.b().l("com/android/dialer/audiodecoder/DecodingInputStream", "<init>", 95, "DecodingInputStream.java").y("mediaFormat: %s", trackFormat);
        java.lang.String string = trackFormat.getString("mime");
        this.a = trackFormat.getInteger("sample-rate");
        this.b = trackFormat.getInteger("channel-count");
        this.c = trackFormat.containsKey("pcm-encoding") ? trackFormat.getInteger("pcm-encoding") : 2;
        android.media.MediaCodec mediaCodecCreateDecoderByType = android.media.MediaCodec.createDecoderByType(string);
        this.h = mediaCodecCreateDecoderByType;
        mediaCodecCreateDecoderByType.configure(trackFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
        mediaCodecCreateDecoderByType.start();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        int i = read(bArr);
        return i == 1 ? bArr[0] : i;
    }
}
