package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zti {
    public final java.io.InputStream a;
    public final java.io.OutputStream b;

    public zti(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        aooh.f(inputStream, "inputStream");
        aooh.f(outputStream, "outputStream");
        this.a = inputStream;
        this.b = outputStream;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zti) {
            defpackage.zti ztiVar = (defpackage.zti) obj;
            if (aooh.n(this.a, ztiVar.a) && aooh.n(this.b, ztiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "DialerCrossSurfaceStream(inputStream=" + this.a + ", outputStream=" + this.b + ')';
    }
}
