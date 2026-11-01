package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pux {
    public final android.graphics.SurfaceTexture a;
    public final j$.util.Optional b;

    public pux(android.graphics.SurfaceTexture surfaceTexture, j$.util.Optional optional) {
        this.a = surfaceTexture;
        this.b = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pux) {
            defpackage.pux puxVar = (defpackage.pux) obj;
            if (this.a.equals(puxVar.a) && this.b.equals(puxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.b;
        return "VideoSurface{surfaceTexture=" + java.lang.String.valueOf(this.a) + ", dimensions=" + java.lang.String.valueOf(optional) + '}';
    }

    public pux() {
        throw null;
    }
}
