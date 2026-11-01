package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class ha extends j$.util.stream.ia {
    @Override // j$.util.stream.ka
    public final j$.util.Spliterator b(j$.util.Spliterator spliterator) {
        return new j$.util.stream.ha((j$.util.Spliterator.OfLong) spliterator, this);
    }

    @Override // j$.util.Spliterator.OfLong
    public final boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        if (!this.c || !a() || !((j$.util.Spliterator.OfLong) this.a).tryAdvance((java.util.function.LongConsumer) this)) {
            this.c = false;
            return false;
        }
        java.util.function.LongPredicate longPredicate = null;
        longPredicate.test(this.e);
        throw null;
    }

    @Override // j$.util.stream.ka, j$.util.Spliterator
    public final j$.util.Spliterator.OfLong trySplit() {
        if (this.b.get()) {
            return null;
        }
        return (j$.util.Spliterator.OfLong) super.trySplit();
    }

    @Override // j$.util.stream.ia, j$.util.w0
    public final /* bridge */ /* synthetic */ boolean tryAdvance(java.lang.Object obj) {
        tryAdvance((java.util.function.LongConsumer) obj);
        return false;
    }
}
