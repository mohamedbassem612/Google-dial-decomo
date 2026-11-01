package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class da extends j$.util.stream.fa {
    @Override // j$.util.stream.ka
    public final j$.util.Spliterator b(j$.util.Spliterator spliterator) {
        return new j$.util.stream.da((j$.util.Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        boolean zTryAdvance;
        boolean z = this.c;
        j$.util.Spliterator spliterator = this.a;
        if (!z) {
            return ((j$.util.Spliterator.OfInt) spliterator).tryAdvance(intConsumer);
        }
        boolean z2 = false;
        this.c = false;
        while (true) {
            zTryAdvance = ((j$.util.Spliterator.OfInt) spliterator).tryAdvance((java.util.function.IntConsumer) this);
            if (!zTryAdvance || !a() || !this.e.test(this.f)) {
                break;
            }
            z2 = true;
        }
        if (!zTryAdvance) {
            return zTryAdvance;
        }
        if (z2) {
            this.b.set(true);
        }
        intConsumer.accept(this.f);
        return zTryAdvance;
    }

    @Override // j$.util.stream.fa, j$.util.stream.ka, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfInt trySplit() {
        return (j$.util.Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.stream.fa, j$.util.stream.ka, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.w0 trySplit() {
        return (j$.util.w0) trySplit();
    }
}
