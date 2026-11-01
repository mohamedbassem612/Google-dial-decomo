package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class m5 extends j$.util.stream.o5 implements j$.util.stream.e6 {
    @Override // j$.util.stream.e6
    public final /* synthetic */ void C(java.lang.Long l) {
        j$.util.stream.n4.i(this, l);
    }

    @Override // j$.util.stream.o5, j$.util.stream.f6, j$.util.stream.e6, java.util.function.LongConsumer
    public final void accept(long j) {
        this.b++;
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.util.function.LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(java.lang.Object obj) {
        C((java.lang.Long) obj);
    }
}
