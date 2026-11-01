package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fes implements defpackage.feb {
    private final android.media.MediaCodec a;

    public fes(android.media.MediaCodec mediaCodec) {
        this.a = mediaCodec;
    }

    @Override // defpackage.feb
    public final void c(android.os.Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.feb
    public final void f(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.feb
    public final void g(int i, defpackage.ewq ewqVar, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, ewqVar.i, j, i2);
    }

    @Override // defpackage.feb
    public final void a() {
    }

    @Override // defpackage.feb
    public final void b() {
    }

    @Override // defpackage.feb
    public final void d() {
    }

    @Override // defpackage.feb
    public final void e() {
    }
}
