package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class ja extends j$.util.stream.ka implements java.util.function.Consumer {
    public final java.util.function.Predicate e;
    public java.lang.Object f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(j$.util.Spliterator spliterator, j$.util.stream.ja jaVar, byte b) {
        super(spliterator, jaVar);
        this.g = b;
        this.e = jaVar.e;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        this.d = (this.d + 1) & 63;
        this.f = obj;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.ka
    public final j$.util.Spliterator b(j$.util.Spliterator spliterator) {
        switch (this.g) {
            case 0:
                return new j$.util.stream.ja(spliterator, this, (byte) 0);
            default:
                return new j$.util.stream.ja(spliterator, this, (byte) 1);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        byte b = this.g;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.b;
        java.util.function.Predicate predicate = this.e;
        j$.util.Spliterator spliterator = this.a;
        boolean z = false;
        switch (b) {
            case 0:
                if (!this.c) {
                    return spliterator.tryAdvance(consumer);
                }
                this.c = false;
                while (true) {
                    zTryAdvance = spliterator.tryAdvance(this);
                    if (zTryAdvance && a() && predicate.test(this.f)) {
                        z = true;
                    }
                }
                if (zTryAdvance) {
                    if (z) {
                        atomicBoolean.set(true);
                    }
                    consumer.accept(this.f);
                }
                return zTryAdvance;
            default:
                if (this.c && a() && spliterator.tryAdvance(this)) {
                    zTest = predicate.test(this.f);
                    if (zTest) {
                        consumer.accept(this.f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.c = false;
                if (!zTest) {
                    atomicBoolean.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.ka, j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        switch (this.g) {
            case 1:
                if (this.b.get()) {
                    return null;
                }
                return super.trySplit();
            default:
                return super.trySplit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(j$.util.Spliterator spliterator, java.util.function.Predicate predicate, byte b) {
        super(spliterator);
        this.g = b;
        this.e = predicate;
    }
}
