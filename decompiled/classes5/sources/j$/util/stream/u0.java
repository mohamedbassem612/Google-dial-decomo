package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class u0 implements j$.util.stream.w0 {
    public final /* synthetic */ java.util.stream.Gatherer.Downstream a;

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.stream.Gatherer.Downstream downstream = this.a;
        if (obj instanceof j$.util.stream.u0) {
            obj = ((j$.util.stream.u0) obj).a;
        }
        return downstream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.w0
    public final /* synthetic */ boolean isRejecting() {
        return this.a.isRejecting();
    }

    @Override // j$.util.stream.w0
    public final /* synthetic */ boolean push(java.lang.Object obj) {
        return this.a.push(obj);
    }
}
