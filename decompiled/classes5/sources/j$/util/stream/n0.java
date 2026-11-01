package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class n0 extends j$.util.stream.q0 implements j$.util.stream.d6 {
    public final java.util.function.IntConsumer b;

    public n0(java.util.function.IntConsumer intConsumer, boolean z) {
        super(z);
        this.b = intConsumer;
    }

    @Override // j$.util.stream.q0, j$.util.stream.f6
    public final void accept(int i) {
        this.b.accept(i);
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.d6
    public final /* synthetic */ void r(java.lang.Integer num) {
        j$.util.stream.n4.g(this, num);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(java.lang.Object obj) {
        r((java.lang.Integer) obj);
    }
}
