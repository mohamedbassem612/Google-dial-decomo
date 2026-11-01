package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class x8 extends j$.util.stream.z8 implements j$.util.Spliterator.OfInt, java.util.function.IntConsumer {
    public int e;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.e = i;
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.c9
    public final j$.util.Spliterator b(j$.util.Spliterator spliterator) {
        return new j$.util.stream.x8((j$.util.Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.stream.z8
    public final void d(java.lang.Object obj) {
        ((java.util.function.IntConsumer) obj).accept(this.e);
    }

    @Override // j$.util.stream.z8
    public final j$.util.stream.b8 e() {
        return new j$.util.stream.z7();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.com.android.tools.r8.a.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.com.android.tools.r8.a.t(this, consumer);
    }

    @Override // j$.util.stream.z8, j$.util.stream.c9, j$.util.w0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfInt trySplit() {
        return (j$.util.Spliterator.OfInt) trySplit();
    }
}
