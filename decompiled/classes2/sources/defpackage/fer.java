package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fer implements defpackage.fea {
    private final android.media.MediaCodec a;
    private final defpackage.hjx b;

    public fer(android.media.MediaCodec mediaCodec, defpackage.hjx hjxVar) {
        this.a = mediaCodec;
        this.b = hjxVar;
        if (android.os.Build.VERSION.SDK_INT < 35 || hjxVar == null) {
            return;
        }
        hjxVar.c(mediaCodec);
    }

    @Override // defpackage.fea
    public final int a() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.fea
    public final int b(android.media.MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.fea
    public final android.media.MediaFormat c() {
        return this.a.getOutputFormat();
    }

    @Override // defpackage.fea
    public final java.nio.ByteBuffer e(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.fea
    public final java.nio.ByteBuffer f(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.fea
    public final void g() {
        mp$.ExternalSyntheticApiModelOutline1.m(this.a);
    }

    @Override // defpackage.fea
    public final void h() {
        this.a.flush();
    }

    @Override // defpackage.fea
    public final void i() {
        defpackage.hjx hjxVar;
        try {
            if (android.os.Build.VERSION.SDK_INT < 33) {
                this.a.stop();
            }
        } finally {
            if (android.os.Build.VERSION.SDK_INT >= 35 && (hjxVar = this.b) != null) {
                hjxVar.d(this.a);
            }
            this.a.release();
        }
    }

    @Override // defpackage.fea
    public final void j(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.fea
    public final void k(android.view.Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.fea
    public final void l(android.os.Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.fea
    public final void m(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.fea
    public final void n(java.util.List list) {
        mp$.ExternalSyntheticApiModelOutline0.m(this.a, list);
    }

    @Override // defpackage.fea
    public final void o(java.util.List list) {
        mp$.ExternalSyntheticApiModelOutline0.m$1(this.a, list);
    }

    @Override // defpackage.fea
    public final /* synthetic */ void p(defpackage.eui euiVar) {
        euiVar.a();
    }

    @Override // defpackage.fea
    public final void q(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.fea
    public final void r(int i, defpackage.ewq ewqVar, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, ewqVar.i, j, i2);
    }

    @Override // defpackage.fea
    public final void s(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.fea
    public final /* synthetic */ boolean t(rai raiVar) {
        return false;
    }
}
