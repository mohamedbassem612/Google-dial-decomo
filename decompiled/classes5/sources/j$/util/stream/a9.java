package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class a9 extends j$.util.stream.c9 implements j$.util.Spliterator, java.util.function.Consumer {
    public java.lang.Object e;

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        this.e = obj;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        j$.util.stream.c8 c8Var = null;
        while (true) {
            j$.util.stream.b9 b9VarC = c();
            if (b9VarC == j$.util.stream.b9.NO_MORE) {
                return;
            }
            j$.util.stream.b9 b9Var = j$.util.stream.b9.MAYBE_MORE;
            j$.util.Spliterator spliterator = this.a;
            if (b9VarC != b9Var) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            if (c8Var == null) {
                c8Var = new j$.util.stream.c8();
            } else {
                c8Var.a = 0;
            }
            long j = 0;
            while (spliterator.tryAdvance(c8Var)) {
                j++;
                if (j >= 128) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long jA = a(j);
            for (int i = 0; i < jA; i++) {
                consumer.accept(c8Var.b[i]);
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
        j$.util.Objects.requireNonNull(consumer);
        while (c() != j$.util.stream.b9.NO_MORE && this.a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.accept(this.e);
                this.e = null;
                return true;
            }
        }
        return false;
    }
}
