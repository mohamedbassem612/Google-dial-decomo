package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class ia extends j$.util.stream.ka implements java.util.function.LongConsumer, j$.util.Spliterator.OfLong {
    public long e;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.d = (this.d + 1) & 63;
        this.e = j;
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.util.function.LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.w0
    public final void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(java.lang.Object obj) {
        return tryAdvance((java.util.function.LongConsumer) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.com.android.tools.r8.a.u(this, consumer);
    }

    @Override // j$.util.stream.ka, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.com.android.tools.r8.a.g(this, consumer);
    }
}
