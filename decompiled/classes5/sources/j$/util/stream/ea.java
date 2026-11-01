package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class ea extends j$.util.stream.fa {
    @Override // j$.util.stream.ka
    public final j$.util.Spliterator b(j$.util.Spliterator spliterator) {
        return new j$.util.stream.ea((j$.util.Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        boolean zTest;
        if (this.c && a() && ((j$.util.Spliterator.OfInt) this.a).tryAdvance((java.util.function.IntConsumer) this)) {
            zTest = this.e.test(this.f);
            if (zTest) {
                intConsumer.accept(this.f);
                return true;
            }
        } else {
            zTest = true;
        }
        this.c = false;
        if (!zTest) {
            this.b.set(true);
        }
        return false;
    }

    @Override // j$.util.stream.ka, j$.util.Spliterator
    public final j$.util.Spliterator.OfInt trySplit() {
        if (this.b.get()) {
            return null;
        }
        return (j$.util.Spliterator.OfInt) super.trySplit();
    }
}
