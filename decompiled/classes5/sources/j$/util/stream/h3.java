package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class h3 implements j$.util.stream.o2 {
    public final double[] a;
    public int b;

    public h3(long j) {
        if (j >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            throw null;
        }
        this.a = new double[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.t2, j$.util.stream.u2
    public final j$.util.stream.t2 a(int i) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.t2
    public final java.lang.Object b() {
        double[] dArr = this.a;
        int length = dArr.length;
        int i = this.b;
        return length != i ? java.util.Arrays.copyOf(dArr, i) : dArr;
    }

    @Override // j$.util.stream.t2
    public final void c(int i, java.lang.Object obj) {
        int i2 = this.b;
        java.lang.System.arraycopy(this.a, 0, (double[]) obj, i, i2);
    }

    @Override // j$.util.stream.u2
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.t2
    public final void d(java.lang.Object obj) {
        java.util.function.DoubleConsumer doubleConsumer = (java.util.function.DoubleConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            doubleConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.util.stream.n4.q(this, consumer);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ j$.util.stream.u2 g(long j, long j2, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.t(this, j, j2);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ void h(java.lang.Object[] objArr, int i) {
        j$.util.stream.n4.n(this, (java.lang.Double[]) objArr, i);
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
        int i = this.b;
        double[] dArr = this.a;
        j$.util.Spliterators.a(((double[]) j$.util.Objects.requireNonNull(dArr)).length, 0, i);
        return new j$.util.f1(dArr, 0, i, 1040);
    }

    public java.lang.String toString() {
        double[] dArr = this.a;
        return java.lang.String.format("DoubleArrayNode[%d][%s]", java.lang.Integer.valueOf(dArr.length - this.b), java.util.Arrays.toString(dArr));
    }

    @Override // j$.util.stream.u2
    public final j$.util.stream.u2 a(int i) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.u2
    public final j$.util.Spliterator spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        j$.util.Spliterators.a(((double[]) j$.util.Objects.requireNonNull(dArr)).length, 0, i);
        return new j$.util.f1(dArr, 0, i, 1040);
    }

    public h3(double[] dArr) {
        this.a = dArr;
        this.b = dArr.length;
    }
}
