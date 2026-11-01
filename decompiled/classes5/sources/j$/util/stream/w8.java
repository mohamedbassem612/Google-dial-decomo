package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class w8 extends j$.util.stream.z8 implements j$.util.p0, java.util.function.DoubleConsumer {
    public double e;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.e = d;
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.c9
    public final j$.util.Spliterator b(j$.util.Spliterator spliterator) {
        return new j$.util.stream.w8((j$.util.p0) spliterator, this);
    }

    @Override // j$.util.stream.z8
    public final void d(java.lang.Object obj) {
        ((java.util.function.DoubleConsumer) obj).accept(this.e);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.com.android.tools.r8.a.e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.com.android.tools.r8.a.s(this, consumer);
    }

    @Override // j$.util.stream.z8, j$.util.stream.c9, j$.util.w0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.p0 trySplit() {
        return (j$.util.p0) trySplit();
    }
}
