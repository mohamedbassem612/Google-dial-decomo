package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class n8 extends j$.util.stream.x7 implements j$.util.Spliterator.OfInt {
    @Override // j$.util.stream.x7
    public final void d() {
        j$.util.stream.l7 l7Var = new j$.util.stream.l7();
        this.h = l7Var;
        j$.util.Objects.requireNonNull(l7Var);
        this.e = this.b.P(new j$.util.stream.m8(l7Var, (byte) 1));
        this.f = new j$.desugar.sun.nio.fs.g((byte) 15, this);
    }

    @Override // j$.util.stream.x7
    public final j$.util.stream.x7 e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.n8(this.b, spliterator, this.a);
    }

    @Override // j$.util.w0
    public final void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(intConsumer)) {
            }
            return;
        }
        j$.util.Objects.requireNonNull(intConsumer);
        c();
        j$.util.Objects.requireNonNull(intConsumer);
        j$.util.stream.m8 m8Var = new j$.util.stream.m8(intConsumer, (byte) 0);
        this.b.O(this.d, m8Var);
        this.i = true;
    }

    @Override // j$.util.w0
    public final boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        j$.util.Objects.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            j$.util.stream.l7 l7Var = (j$.util.stream.l7) this.h;
            long j = this.g;
            int iW = l7Var.w(j);
            intConsumer.accept((l7Var.c == 0 && iW == 0) ? ((int[]) l7Var.e)[(int) j] : ((int[][]) l7Var.f)[iW][(int) (j - l7Var.d[iW])]);
        }
        return zA;
    }

    @Override // j$.util.stream.x7, j$.util.Spliterator
    public final j$.util.Spliterator.OfInt trySplit() {
        return (j$.util.Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.x7, j$.util.Spliterator
    public final j$.util.w0 trySplit() {
        return (j$.util.Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.x7, j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        return (j$.util.Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.com.android.tools.r8.a.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.com.android.tools.r8.a.t(this, consumer);
    }
}
