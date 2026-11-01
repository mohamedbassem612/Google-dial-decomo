package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class q3 implements j$.util.stream.q2 {
    public final int[] a;
    public int b;

    public q3(long j) {
        if (j >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            throw null;
        }
        this.a = new int[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.t2, j$.util.stream.u2
    public final j$.util.stream.t2 a(int i) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.t2
    public final java.lang.Object b() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        return length != i ? java.util.Arrays.copyOf(iArr, i) : iArr;
    }

    @Override // j$.util.stream.t2
    public final void c(int i, java.lang.Object obj) {
        int i2 = this.b;
        java.lang.System.arraycopy(this.a, 0, (int[]) obj, i, i2);
    }

    @Override // j$.util.stream.u2
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.t2
    public final void d(java.lang.Object obj) {
        java.util.function.IntConsumer intConsumer = (java.util.function.IntConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            intConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.util.stream.n4.r(this, consumer);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ j$.util.stream.u2 g(long j, long j2, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.u(this, j, j2);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ void h(java.lang.Object[] objArr, int i) {
        j$.util.stream.n4.o(this, (java.lang.Integer[]) objArr, i);
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
        int[] iArr = this.a;
        return java.lang.String.format("IntArrayNode[%d][%s]", java.lang.Integer.valueOf(iArr.length - this.b), java.util.Arrays.toString(iArr));
    }

    @Override // j$.util.stream.u2
    public final j$.util.stream.u2 a(int i) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.u2
    public final j$.util.Spliterator spliterator() {
        return j$.util.Spliterators.spliterator(this.a, 0, this.b, 1040);
    }

    public q3(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
    }
}
