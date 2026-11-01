package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class t8 extends j$.util.stream.v8 implements j$.util.w0 {
    public t8(j$.util.w0 w0Var, long j, long j2) {
        super(w0Var, j, j2, 0L, java.lang.Math.min(w0Var.estimateSize(), j2));
    }

    public java.lang.Object b() {
        return new j$.util.stream.n2((byte) 1);
    }

    @Override // j$.util.w0
    public final void forEachRemaining(java.lang.Object obj) {
        j$.util.Objects.requireNonNull(obj);
        long j = this.e;
        long j2 = this.a;
        if (j2 < j) {
            long j3 = this.d;
            if (j3 < j) {
                if (j3 >= j2 && ((j$.util.w0) this.c).estimateSize() + j3 <= this.b) {
                    ((j$.util.w0) this.c).forEachRemaining(obj);
                    this.d = this.e;
                    return;
                }
                while (j2 > this.d) {
                    ((j$.util.w0) this.c).tryAdvance(b());
                    this.d++;
                }
                while (this.d < this.e) {
                    ((j$.util.w0) this.c).tryAdvance(obj);
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

    @Override // j$.util.w0
    public final boolean tryAdvance(java.lang.Object obj) {
        long j;
        j$.util.Objects.requireNonNull(obj);
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
            ((j$.util.w0) this.c).tryAdvance(b());
            this.d++;
        }
        if (j >= this.e) {
            return false;
        }
        this.d = j + 1;
        return ((j$.util.w0) this.c).tryAdvance(obj);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        return tryAdvance((java.lang.Object) intConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        return tryAdvance((java.lang.Object) longConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer) {
        return tryAdvance((java.lang.Object) doubleConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        forEachRemaining((java.lang.Object) intConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        forEachRemaining((java.lang.Object) longConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        forEachRemaining((java.lang.Object) doubleConsumer);
    }
}
