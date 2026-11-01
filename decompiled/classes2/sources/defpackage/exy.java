package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class exy implements android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ defpackage.eyc a;

    public exy(defpackage.eyc eycVar) {
        j$.util.Objects.requireNonNull(eycVar);
        this.a = eycVar;
    }

    public final void a(defpackage.euf eufVar) {
        this.a.I(new defpackage.exl(2, eufVar, 1003, null, -1, null, 4, null, false));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        defpackage.eyc eycVar = this.a;
        eycVar.H(surface);
        eycVar.s = surface;
        eycVar.F(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        defpackage.eyc eycVar = this.a;
        eycVar.H(null);
        eycVar.F(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.F(i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.F(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.a.F(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    }
}
