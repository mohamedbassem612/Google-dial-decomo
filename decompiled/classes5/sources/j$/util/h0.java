package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class h0 implements java.util.function.LongConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.Consumer b;

    public /* synthetic */ h0(java.util.function.Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        byte b = this.a;
        java.util.function.Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept(java.lang.Long.valueOf(j));
                break;
            default:
                ((j$.util.stream.f6) consumer).accept(j);
                break;
        }
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.LongConsumer$CC.$default$andThen(this, longConsumer);
    }
}
