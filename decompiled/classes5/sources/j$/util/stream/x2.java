package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class x2 implements j$.util.stream.u2 {
    public final java.lang.Object[] a;
    public int b;

    public x2(long j, java.util.function.IntFunction intFunction) {
        if (j >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            throw null;
        }
        this.a = (java.lang.Object[]) intFunction.apply((int) j);
        this.b = 0;
    }

    @Override // j$.util.stream.u2
    public final j$.util.stream.u2 a(int i) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.u2
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.u2
    public final void forEach(java.util.function.Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            consumer.r(this.a[i]);
        }
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ j$.util.stream.u2 g(long j, long j2, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.u2
    public final void h(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.a, 0, objArr, i, this.b);
    }

    @Override // j$.util.stream.u2
    public final java.lang.Object[] k(java.util.function.IntFunction intFunction) {
        java.lang.Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // j$.util.stream.u2
    public final int l() {
        return 0;
    }

    @Override // j$.util.stream.u2
    public final j$.util.Spliterator spliterator() {
        return j$.util.Spliterators.b(this.a, 0, this.b, 1040);
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = this.a;
        return java.lang.String.format("ArrayNode[%d][%s]", java.lang.Integer.valueOf(objArr.length - this.b), java.util.Arrays.toString(objArr));
    }

    public x2(java.lang.Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }
}
