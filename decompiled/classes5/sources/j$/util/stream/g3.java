package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class g3 extends j$.util.stream.w2 {
    @Override // j$.util.stream.u2
    public final void forEach(java.util.function.Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.u2
    public final j$.util.stream.u2 g(long j, long j2, java.util.function.IntFunction intFunction) {
        if (j == 0 && j2 == this.c) {
            return this;
        }
        long jCount = this.a.count();
        if (j >= jCount) {
            return this.b.g(j - jCount, j2 - jCount, intFunction);
        }
        if (j2 <= jCount) {
            return this.a.g(j, j2, intFunction);
        }
        return j$.util.stream.n4.C(j$.util.stream.w7.REFERENCE, this.a.g(j, jCount, intFunction), this.b.g(0L, j2 - jCount, intFunction));
    }

    @Override // j$.util.stream.u2
    public final void h(java.lang.Object[] objArr, int i) {
        j$.util.Objects.requireNonNull(objArr);
        j$.util.stream.u2 u2Var = this.a;
        u2Var.h(objArr, i);
        this.b.h(objArr, i + ((int) u2Var.count()));
    }

    @Override // j$.util.stream.u2
    public final java.lang.Object[] k(java.util.function.IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            return null;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) intFunction.apply((int) j);
        h(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.u2
    public final j$.util.Spliterator spliterator() {
        return new j$.util.stream.x3(this);
    }

    public final java.lang.String toString() {
        long j = this.c;
        return j < 32 ? java.lang.String.format("ConcNode[%s.%s]", this.a, this.b) : java.lang.String.format("ConcNode[size=%d]", java.lang.Long.valueOf(j));
    }
}
