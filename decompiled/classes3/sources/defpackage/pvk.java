package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pvk {
    public static final aimz a = aimz.i("com/android/dialer/incall/core/video/impl/SingletonVideoSurfaceCache");
    final zof b = new nzx(this, 3);
    public final java.util.concurrent.atomic.AtomicReference c = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());

    final defpackage.pxj a() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.c;
        if (!((j$.util.Optional) atomicReference.get()).isPresent()) {
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.pxi pxiVar = new defpackage.pxi();
            android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(false);
            if (anty.Q(atomicReference, optionalEmpty, j$.util.Optional.of(new defpackage.pxj(pxiVar, surfaceTexture, new android.view.Surface(pxiVar), new android.view.Surface(surfaceTexture))))) {
                a.b().l("com/android/dialer/incall/core/video/impl/SingletonVideoSurfaceCache", "get", 33, "SingletonVideoSurfaceCache.java").v("SurfaceTextures each for the remote and local video initialized.");
            }
        }
        return (defpackage.pxj) ((j$.util.Optional) atomicReference.get()).orElseThrow();
    }
}
