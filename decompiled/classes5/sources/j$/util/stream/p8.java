package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class p8 extends j$.util.stream.x7 implements j$.util.Spliterator.OfLong {
    @Override // j$.util.stream.x7
    public final void d() {
        j$.util.stream.n7 n7Var = new j$.util.stream.n7();
        this.h = n7Var;
        j$.util.Objects.requireNonNull(n7Var);
        this.e = this.b.P(new j$.util.stream.o8(n7Var, (byte) 1));
        this.f = new j$.desugar.sun.nio.fs.g((byte) 16, this);
    }

    @Override // j$.util.stream.x7
    public final j$.util.stream.x7 e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.p8(this.b, spliterator, this.a);
    }

    @Override // j$.util.w0
    public final void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(longConsumer)) {
            }
            return;
        }
        j$.util.Objects.requireNonNull(longConsumer);
        c();
        j$.util.Objects.requireNonNull(longConsumer);
        j$.util.stream.o8 o8Var = new j$.util.stream.o8(longConsumer, (byte) 0);
        this.b.O(this.d, o8Var);
        this.i = true;
    }

    @Override // j$.util.w0
    public final boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        j$.util.Objects.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            j$.util.stream.n7 n7Var = (j$.util.stream.n7) this.h;
            long j = this.g;
            int iW = n7Var.w(j);
            longConsumer.accept((n7Var.c == 0 && iW == 0) ? ((long[]) n7Var.e)[(int) j] : ((long[][]) n7Var.f)[iW][(int) (j - n7Var.d[iW])]);
        }
        return zA;
    }

    @Override // j$.util.stream.x7, j$.util.Spliterator
    public final j$.util.Spliterator.OfLong trySplit() {
        return (j$.util.Spliterator.OfLong) super.trySplit();
    }

    @Override // j$.util.stream.x7, j$.util.Spliterator
    public final j$.util.w0 trySplit() {
        return (j$.util.Spliterator.OfLong) super.trySplit();
    }

    @Override // j$.util.stream.x7, j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        return (j$.util.Spliterator.OfLong) super.trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.com.android.tools.r8.a.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.com.android.tools.r8.a.u(this, consumer);
    }
}
