package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class z implements java.util.function.DoubleConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.Consumer b;

    public /* synthetic */ z(java.util.function.Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        byte b = this.a;
        java.util.function.Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept(java.lang.Double.valueOf(d));
                break;
            default:
                ((j$.util.stream.f6) consumer).accept(d);
                break;
        }
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }
}
