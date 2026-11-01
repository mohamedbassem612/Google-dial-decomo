package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class o7 implements j$.util.w0 {
    public int a;
    public final int b;
    public int c;
    public final int d;
    public java.lang.Object e;
    public final /* synthetic */ j$.util.stream.p7 f;

    public o7(j$.util.stream.p7 p7Var, int i, int i2, int i3, int i4) {
        this.f = p7Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        java.lang.Object[] objArr = p7Var.f;
        this.e = objArr == null ? p7Var.e : objArr[i];
    }

    public abstract void a(int i, java.lang.Object obj, java.lang.Object obj2);

    public j$.util.w0 b(java.lang.Object obj, int i, int i2) {
        double[] dArr = (double[]) obj;
        int i3 = i2 + i;
        j$.util.Spliterators.a(((double[]) j$.util.Objects.requireNonNull(dArr)).length, i, i3);
        return new j$.util.f1(dArr, i, i3, 1040);
    }

    public abstract j$.util.w0 c(int i, int i2, int i3, int i4);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i == i3) {
            return ((long) i2) - ((long) this.c);
        }
        long[] jArr = this.f.d;
        return ((jArr[i3] + ((long) i2)) - jArr[i]) - ((long) this.c);
    }

    @Override // j$.util.w0
    public final void forEachRemaining(java.lang.Object obj) {
        j$.util.stream.p7 p7Var;
        j$.util.Objects.requireNonNull(obj);
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                p7Var = this.f;
                if (i >= i3) {
                    break;
                }
                java.lang.Object obj2 = p7Var.f[i];
                p7Var.s(obj2, i4, p7Var.u(obj2), obj);
                i++;
                i4 = 0;
            }
            p7Var.s(this.a == i3 ? this.e : p7Var.f[i3], i4, i2, obj);
            this.a = i3;
            this.c = i2;
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
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        java.lang.Object obj2 = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        a(i3, obj2, obj);
        int i4 = this.c;
        java.lang.Object obj3 = this.e;
        j$.util.stream.p7 p7Var = this.f;
        if (i4 == p7Var.u(obj3)) {
            this.c = 0;
            int i5 = this.a + 1;
            this.a = i5;
            java.lang.Object[] objArr = p7Var.f;
            if (objArr != null && i5 <= i2) {
                this.e = objArr[i5];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final j$.util.w0 trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            j$.util.stream.p7 p7Var = this.f;
            j$.util.w0 w0VarC = c(i, i3, i4, p7Var.u(p7Var.f[i3]));
            this.a = i2;
            this.c = 0;
            this.e = p7Var.f[i2];
            return w0VarC;
        }
        if (i == i2) {
            int i5 = this.c;
            int i6 = (this.d - i5) / 2;
            if (i6 != 0) {
                j$.util.w0 w0VarB = b(this.e, i5, i6);
                this.c += i6;
                return w0VarB;
            }
        }
        return null;
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

    public final /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        return tryAdvance((java.lang.Object) intConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        return tryAdvance((java.lang.Object) longConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer) {
        return tryAdvance((java.lang.Object) doubleConsumer);
    }

    @Override // j$.util.w0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfInt trySplit() {
        return (j$.util.Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.w0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfLong trySplit() {
        return (j$.util.Spliterator.OfLong) trySplit();
    }

    @Override // j$.util.w0, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.p0 trySplit() {
        return (j$.util.p0) trySplit();
    }
}
