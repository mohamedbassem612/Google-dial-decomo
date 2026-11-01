package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pxj {
    public final defpackage.pxi a;
    public final android.graphics.SurfaceTexture b;
    public final android.view.Surface c;
    public final android.view.Surface d;

    public pxj(defpackage.pxi pxiVar, android.graphics.SurfaceTexture surfaceTexture, android.view.Surface surface, android.view.Surface surface2) {
        this.a = pxiVar;
        this.b = surfaceTexture;
        this.c = surface;
        this.d = surface2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pxj) {
            defpackage.pxj pxjVar = (defpackage.pxj) obj;
            if (this.a.equals(pxjVar.a) && this.b.equals(pxjVar.b) && this.c.equals(pxjVar.c) && this.d.equals(pxjVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        android.view.Surface surface = this.d;
        android.view.Surface surface2 = this.c;
        android.graphics.SurfaceTexture surfaceTexture = this.b;
        return "VideoSurfaces{localSurfaceTexture=" + this.a.toString() + ", remoteSurfaceTexture=" + surfaceTexture.toString() + ", localSurface=" + surface2.toString() + ", remoteSurface=" + surface.toString() + '}';
    }

    public pxj() {
        throw null;
    }
}
