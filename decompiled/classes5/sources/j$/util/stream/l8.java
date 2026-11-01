package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class l8 extends j$.util.stream.x7 implements j$.util.p0 {
    @Override // j$.util.w0
    public final void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(doubleConsumer)) {
            }
            return;
        }
        j$.util.Objects.requireNonNull(doubleConsumer);
        c();
        j$.util.Objects.requireNonNull(doubleConsumer);
        j$.util.stream.k8 k8Var = new j$.util.stream.k8(doubleConsumer, (byte) 0);
        this.b.O(this.d, k8Var);
        this.i = true;
    }

    @Override // j$.util.w0
    public final boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer) {
        j$.util.Objects.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            j$.util.stream.j7 j7Var = (j$.util.stream.j7) this.h;
            long j = this.g;
            int iW = j7Var.w(j);
            doubleConsumer.accept((j7Var.c == 0 && iW == 0) ? ((double[]) j7Var.e)[(int) j] : ((double[][]) j7Var.f)[iW][(int) (j - j7Var.d[iW])]);
        }
        return zA;
    }

    @Override // j$.util.stream.x7, j$.util.Spliterator
    public final j$.util.p0 trySplit() {
        return (j$.util.p0) super.trySplit();
    }

    @Override // j$.util.stream.x7, j$.util.Spliterator
    public final j$.util.w0 trySplit() {
        return (j$.util.p0) super.trySplit();
    }

    @Override // j$.util.stream.x7, j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        return (j$.util.p0) super.trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.com.android.tools.r8.a.e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return j$.com.android.tools.r8.a.s(this, consumer);
    }
}
