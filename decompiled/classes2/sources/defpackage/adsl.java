package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class adsl extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    private static final int c;
    public final int a;
    public final int b;
    private boolean d;
    private final android.media.MediaExtractor e;
    private final android.media.MediaCodec f;
    private boolean g;
    private boolean h;
    private int i;
    private java.nio.ByteBuffer j;
    private int k;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        c = 5000;
    }

    public adsl(byte[] bArr) throws java.io.IOException {
        android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
        this.e = mediaExtractor;
        mediaExtractor.setDataSource((android.media.MediaDataSource) new adsk(bArr));
        mediaExtractor.selectTrack(0);
        android.media.MediaFormat trackFormat = mediaExtractor.getTrackFormat(0);
        java.lang.String string = trackFormat.getString("mime");
        this.a = trackFormat.getInteger("sample-rate");
        this.b = trackFormat.getInteger("channel-count");
        android.media.MediaCodec mediaCodecCreateDecoderByType = android.media.MediaCodec.createDecoderByType(string);
        this.f = mediaCodecCreateDecoderByType;
        mediaCodecCreateDecoderByType.configure(trackFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
        mediaCodecCreateDecoderByType.start();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        android.media.MediaExtractor mediaExtractor = this.e;
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
        android.media.MediaCodec mediaCodec = this.f;
        if (mediaCodec != null) {
            mediaCodec.stop();
            mediaCodec.release();
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2 A[SYNTHETIC] */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int iMin;
        java.nio.ByteBuffer byteBuffer;
        boolean z;
        long sampleTime;
        int i3;
        boolean z2;
        if (this.h && this.g) {
            return -1;
        }
        int iMin2 = java.lang.Math.min(bArr.length - i, i2);
        int i4 = 0;
        int i5 = i;
        while (!this.h && iMin2 > 0) {
            if (!this.g) {
                android.media.MediaCodec mediaCodec = this.f;
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(c);
                if (iDequeueInputBuffer < 0) {
                    z = false;
                } else {
                    android.media.MediaExtractor mediaExtractor = this.e;
                    int sampleData = mediaExtractor.readSampleData(mediaCodec.getInputBuffer(iDequeueInputBuffer), 0);
                    if (sampleData < 0) {
                        sampleTime = 0;
                        i3 = 0;
                        z2 = true;
                    } else {
                        sampleTime = mediaExtractor.getSampleTime();
                        i3 = sampleData;
                        z2 = false;
                    }
                    boolean z3 = z2;
                    mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, i3, sampleTime, true != z2 ? 0 : 4);
                    if (z3) {
                        z = z3;
                    } else {
                        mediaExtractor.advance();
                        z = false;
                    }
                }
                this.g = z;
            }
            int i6 = this.i;
            if (i6 != 0) {
                iMin = java.lang.Math.min(i6, iMin2);
                byteBuffer = this.j;
                if (byteBuffer != null) {
                    byteBuffer.get(bArr, i5, iMin);
                    this.i = i6 - iMin;
                }
                if (this.i == 0) {
                    this.f.releaseOutputBuffer(this.k, false);
                    this.j = null;
                    if (this.d) {
                        this.h = true;
                    }
                }
            } else {
                if (this.j == null) {
                    android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                    android.media.MediaCodec mediaCodec2 = this.f;
                    int iDequeueOutputBuffer = mediaCodec2.dequeueOutputBuffer(bufferInfo, c);
                    this.k = iDequeueOutputBuffer;
                    if (iDequeueOutputBuffer >= 0) {
                        this.j = mediaCodec2.getOutputBuffer(iDequeueOutputBuffer);
                        int i7 = bufferInfo.size;
                        if ((bufferInfo.flags & 4) != 0) {
                            this.d = true;
                        }
                        i6 = i7;
                    } else {
                        iMin = 0;
                    }
                } else {
                    i6 = 0;
                }
                iMin = java.lang.Math.min(i6, iMin2);
                byteBuffer = this.j;
                if (byteBuffer != null) {
                    byteBuffer.get(bArr, i5, iMin);
                    this.i = i6 - iMin;
                }
                if (this.i == 0) {
                    this.f.releaseOutputBuffer(this.k, false);
                    this.j = null;
                    if (this.d) {
                        this.h = true;
                    }
                }
            }
            iMin2 -= iMin;
            i5 += iMin;
            i4 += iMin;
        }
        return i4;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
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
