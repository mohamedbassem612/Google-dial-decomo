package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class y8 extends j$.util.stream.z8 implements j$.util.Spliterator.OfLong, java.util.function.LongConsumer {
    public long e;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.e = j;
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.util.function.LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.stream.c9
    public final j$.util.Spliterator b(j$.util.Spliterator spliterator) {
        return new j$.util.stream.y8((j$.util.Spliterator.OfLong) spliterator, this);
    }

    @Override // j$.util.stream.z8
    public final void d(java.lang.Object obj) {
        ((java.util.function.LongConsumer) obj).accept(this.e);
    }

    @Override // j$.util.stream.z8
    public final j$.util.stream.b8 e() {
        return new j$.util.stream.a8();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.com.android.tools.r8.a.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.com.android.tools.r8.a.u(this, consumer);
    }

    @Override // j$.util.stream.z8, j$.util.stream.c9, j$.util.w0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfLong trySplit() {
        return (j$.util.Spliterator.OfLong) trySplit();
    }
}
