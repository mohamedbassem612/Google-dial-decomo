package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fdv extends android.media.MediaCodec.Callback {
    public final android.os.HandlerThread b;
    public android.os.Handler c;
    public android.media.MediaFormat f;
    public long g;
    public boolean h;
    public java.lang.IllegalStateException i;
    public rai l;
    private android.media.MediaFormat m;
    private android.media.MediaCodec.CodecException n;
    private android.media.MediaCodec.CryptoException o;
    public final java.lang.Object a = new java.lang.Object();
    public final defpackage.etv j = new defpackage.etv((char[]) null);
    public final defpackage.etv k = new defpackage.etv((char[]) null);
    public final java.util.ArrayDeque d = new java.util.ArrayDeque();
    public final java.util.ArrayDeque e = new java.util.ArrayDeque();

    public fdv(android.os.HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    private final void e(android.media.MediaFormat mediaFormat) {
        this.k.t(-2);
        this.e.add(mediaFormat);
    }

    public final void a() {
        java.util.ArrayDeque arrayDeque = this.e;
        if (!arrayDeque.isEmpty()) {
            this.m = (android.media.MediaFormat) arrayDeque.getLast();
        }
        this.j.u();
        this.k.u();
        this.d.clear();
        arrayDeque.clear();
    }

    public final void b() {
        java.lang.IllegalStateException illegalStateException = this.i;
        if (illegalStateException != null) {
            this.i = null;
            throw illegalStateException;
        }
        android.media.MediaCodec.CodecException codecException = this.n;
        if (codecException != null) {
            this.n = null;
            throw codecException;
        }
        android.media.MediaCodec.CryptoException cryptoException = this.o;
        if (cryptoException == null) {
            return;
        }
        this.o = null;
        throw cryptoException;
    }

    public final void c() {
        synchronized (this.a) {
            this.h = true;
            this.b.quit();
            a();
        }
    }

    public final boolean d() {
        return this.g > 0 || this.h;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.o = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.n = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(android.media.MediaCodec mediaCodec, int i) {
        rai raiVar;
        synchronized (this.a) {
            this.j.t(i);
            rai raiVar2 = this.l;
            if (raiVar2 != null && (raiVar = ((defpackage.fei) raiVar2.a).I) != null) {
                raiVar.v();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(android.media.MediaCodec mediaCodec, int i, android.media.MediaCodec.BufferInfo bufferInfo) {
        rai raiVar;
        synchronized (this.a) {
            android.media.MediaFormat mediaFormat = this.m;
            if (mediaFormat != null) {
                e(mediaFormat);
                this.m = null;
            }
            this.k.t(i);
            this.d.add(bufferInfo);
            rai raiVar2 = this.l;
            if (raiVar2 != null && (raiVar = ((defpackage.fei) raiVar2.a).I) != null) {
                raiVar.v();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        synchronized (this.a) {
            e(mediaFormat);
            this.m = null;
        }
    }
}
