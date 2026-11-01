package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class z3 implements j$.util.stream.s2 {
    public final long[] a;
    public int b;

    public z3(long j) {
        if (j >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            throw null;
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.t2, j$.util.stream.u2
    public final j$.util.stream.t2 a(int i) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.t2
    public final java.lang.Object b() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length != i ? java.util.Arrays.copyOf(jArr, i) : jArr;
    }

    @Override // j$.util.stream.t2
    public final void c(int i, java.lang.Object obj) {
        int i2 = this.b;
        java.lang.System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    @Override // j$.util.stream.u2
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.t2
    public final void d(java.lang.Object obj) {
        java.util.function.LongConsumer longConsumer = (java.util.function.LongConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            longConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.util.stream.n4.s(this, consumer);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ j$.util.stream.u2 g(long j, long j2, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.v(this, j, j2);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ void h(java.lang.Object[] objArr, int i) {
        j$.util.stream.n4.p(this, (java.lang.Long[]) objArr, i);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ java.lang.Object[] k(java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.m(this, intFunction);
    }

    @Override // j$.util.stream.u2
    public final int l() {
        return 0;
    }

    @Override // j$.util.stream.t2, j$.util.stream.u2
    public final j$.util.w0 spliterator() {
        return j$.util.Spliterators.spliterator(this.a, 0, this.b, 1040);
    }

    public java.lang.String toString() {
        long[] jArr = this.a;
        return java.lang.String.format("LongArrayNode[%d][%s]", java.lang.Integer.valueOf(jArr.length - this.b), java.util.Arrays.toString(jArr));
    }

    @Override // j$.util.stream.u2
    public final j$.util.stream.u2 a(int i) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.u2
    public final j$.util.Spliterator spliterator() {
        return j$.util.Spliterators.spliterator(this.a, 0, this.b, 1040);
    }

    public z3(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }
}
