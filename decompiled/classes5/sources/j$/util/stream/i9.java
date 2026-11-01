package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class i9 implements java.util.function.Consumer, j$.util.Spliterator {
    public int a = -2;
    public java.lang.Object b;
    public j$.util.stream.q7 c;

    public i9(java.lang.Object obj) {
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.a;
        if (i == 0) {
            this.b = obj;
            this.a = i + 1;
        } else {
            if (i <= 0) {
                throw new java.lang.IllegalStateException();
            }
            if (this.c == null) {
                j$.util.stream.q7 q7Var = new j$.util.stream.q7();
                this.c = q7Var;
                q7Var.accept(this.b);
                this.a++;
            }
            this.c.accept(obj);
        }
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17488;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return (-this.a) - 1;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        if (this.a == -2) {
            consumer.accept(this.b);
            this.a = -1;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return j$.util.Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        if (this.a != -2) {
            return false;
        }
        consumer.accept(this.b);
        this.a = -1;
        return true;
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        return null;
    }
}
