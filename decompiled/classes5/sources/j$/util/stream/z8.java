package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class z8 extends j$.util.stream.c9 implements j$.util.w0 {
    public abstract void d(java.lang.Object obj);

    public j$.util.stream.b8 e() {
        return new j$.util.stream.y7();
    }

    @Override // j$.util.w0
    public final void forEachRemaining(java.lang.Object obj) {
        j$.util.Objects.requireNonNull(obj);
        j$.util.stream.b8 b8VarE = null;
        while (true) {
            j$.util.stream.b9 b9VarC = c();
            if (b9VarC == j$.util.stream.b9.NO_MORE) {
                return;
            }
            j$.util.stream.b9 b9Var = j$.util.stream.b9.MAYBE_MORE;
            j$.util.Spliterator spliterator = this.a;
            if (b9VarC != b9Var) {
                ((j$.util.w0) spliterator).forEachRemaining(obj);
                return;
            }
            if (b8VarE == null) {
                b8VarE = e();
            } else {
                b8VarE.b = 0;
            }
            long j = 0;
            while (((j$.util.w0) spliterator).tryAdvance(b8VarE)) {
                j++;
                if (j >= 128) {
                    break;
                }
            }
            if (j == 0) {
                return;
            } else {
                b8VarE.a(obj, a(j));
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
        j$.util.Objects.requireNonNull(obj);
        while (c() != j$.util.stream.b9.NO_MORE && ((j$.util.w0) this.a).tryAdvance(this)) {
            if (a(1L) == 1) {
                d(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.stream.c9, j$.util.w0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.w0 trySplit() {
        return (j$.util.w0) trySplit();
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
