package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wbo {
    public java.lang.Integer a;
    public android.media.MediaRouter.RouteInfo b;

    public wbo(byte[] bArr) {
        this.a = null;
        this.b = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.wbo) {
            defpackage.wbo wboVar = (defpackage.wbo) obj;
            if (aooh.n(this.a, wboVar.a) && aooh.n(this.b, wboVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        android.media.MediaRouter.RouteInfo routeInfo = this.b;
        return (iHashCode * 31) + (routeInfo != null ? routeInfo.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "AudioConfig(streamVolume=" + this.a + ", audioRoute=" + this.b + ')';
    }

    public wbo() {
        this(null);
    }
}
