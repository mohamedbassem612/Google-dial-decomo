package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class v0 implements java.util.stream.Gatherer.Downstream {
    public final /* synthetic */ j$.util.stream.w0 a;

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.stream.w0 w0Var = this.a;
        if (obj instanceof j$.util.stream.v0) {
            obj = ((j$.util.stream.v0) obj).a;
        }
        return w0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    public final /* synthetic */ boolean isRejecting() {
        return this.a.isRejecting();
    }

    public final /* synthetic */ boolean push(java.lang.Object obj) {
        return this.a.push(obj);
    }
}
