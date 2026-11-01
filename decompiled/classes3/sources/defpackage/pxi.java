package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pxi extends android.graphics.SurfaceTexture {
    public pxi() {
        super(false);
    }

    final void a(android.util.Size size) {
        super.setDefaultBufferSize(size.getWidth(), size.getHeight());
    }

    @Override // android.graphics.SurfaceTexture
    public final void setDefaultBufferSize(int i, int i2) {
    }
}
