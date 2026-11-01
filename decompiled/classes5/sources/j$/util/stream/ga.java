package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class ga extends j$.util.stream.ia {
    @Override // j$.util.Spliterator.OfLong
    public final boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        boolean z = this.c;
        j$.util.Spliterator spliterator = this.a;
        if (!z) {
            return ((j$.util.Spliterator.OfLong) spliterator).tryAdvance(longConsumer);
        }
        this.c = false;
        boolean zTryAdvance = ((j$.util.Spliterator.OfLong) spliterator).tryAdvance((java.util.function.LongConsumer) this);
        if (!zTryAdvance) {
            return zTryAdvance;
        }
        boolean zA = a();
        long j = this.e;
        if (!zA) {
            longConsumer.accept(j);
            return zTryAdvance;
        }
        java.util.function.LongPredicate longPredicate = null;
        longPredicate.test(j);
        throw null;
    }

    @Override // j$.util.stream.ia, j$.util.stream.ka, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfLong trySplit() {
        return (j$.util.Spliterator.OfLong) trySplit();
    }

    @Override // j$.util.stream.ia, j$.util.stream.ka, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.w0 trySplit() {
        return (j$.util.w0) trySplit();
    }
}
