package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qtn implements android.view.TextureView.SurfaceTextureListener {
    private final defpackage.qtm a;

    public qtn(defpackage.qtm qtmVar) {
        this.a = qtmVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        defpackage.qtm qtmVar = this.a;
        if (qtmVar.e.getAndIncrement() == 0) {
            j$.util.Optional optionalH = qtmVar.g.h();
            if (true == optionalH.isPresent()) {
                ((defpackage.qtk) ((defpackage.apqr) optionalH.get()).a(defpackage.qtk.class)).B().b(mce.dq);
            }
        }
        qtmVar.d.incrementAndGet();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
