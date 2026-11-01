package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class y implements java.util.function.Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.Consumer b;

    public /* synthetic */ y(java.util.function.Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.a) {
            case 0:
                this.b.accept(j$.nio.file.a.g(obj));
                break;
            case 1:
                this.b.accept(j$.nio.file.a.g(obj));
                break;
            default:
                this.b.accept(new j$.util.p((java.util.Map.Entry) obj));
                break;
        }
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }
}
