package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class u8 extends j$.util.stream.v8 implements j$.util.Spliterator {
    public u8(j$.util.Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2, 0L, java.lang.Math.min(spliterator.estimateSize(), j2));
    }

    @Override // j$.util.stream.v8
    public final j$.util.Spliterator a(j$.util.Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new j$.util.stream.u8(spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        long j = this.e;
        long j2 = this.a;
        if (j2 < j) {
            long j3 = this.d;
            if (j3 < j) {
                if (j3 >= j2 && this.c.estimateSize() + j3 <= this.b) {
                    this.c.forEachRemaining(consumer);
                    this.d = this.e;
                    return;
                }
                while (j2 > this.d) {
                    this.c.tryAdvance(new j$.util.stream.z2((byte) 11));
                    this.d++;
                }
                while (this.d < this.e) {
                    this.c.tryAdvance(consumer);
                    this.d++;
                }
            }
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
        long j;
        j$.util.Objects.requireNonNull(consumer);
        long j2 = this.e;
        long j3 = this.a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.d;
            if (j3 <= j) {
                break;
            }
            this.c.tryAdvance(new j$.util.stream.z2((byte) 10));
            this.d++;
        }
        if (j >= this.e) {
            return false;
        }
        this.d = j + 1;
        return this.c.tryAdvance(consumer);
    }
}
