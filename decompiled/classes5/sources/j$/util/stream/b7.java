package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class b7 extends j$.util.stream.w5 {
    public final boolean n;
    public final java.util.Comparator o;

    public b7(j$.util.stream.x5 x5Var, java.util.Comparator comparator) {
        super(x5Var, j$.util.stream.v7.q | j$.util.stream.v7.p, (byte) 0);
        this.n = false;
        this.o = (java.util.Comparator) j$.util.Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.u2 H(j$.util.stream.a aVar, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        if (j$.util.stream.v7.SORTED.p(aVar.f) && this.n) {
            return aVar.j(spliterator, false, intFunction);
        }
        java.lang.Object[] objArrK = aVar.j(spliterator, true, intFunction).k(intFunction);
        java.util.Arrays.sort(objArrK, this.o);
        return new j$.util.stream.x2(objArrK);
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        j$.util.Objects.requireNonNull(f6Var);
        if (j$.util.stream.v7.SORTED.p(i) && this.n) {
            return f6Var;
        }
        boolean zP = j$.util.stream.v7.SIZED.p(i);
        java.util.Comparator comparator = this.o;
        return zP ? new j$.util.stream.g7(f6Var, comparator) : new j$.util.stream.c7(f6Var, comparator);
    }

    public b7(j$.util.stream.x5 x5Var) {
        super(x5Var, j$.util.stream.v7.q | j$.util.stream.v7.o, (byte) 0);
        this.n = true;
        this.o = j$.util.Comparator.CC.naturalOrder();
    }
}
