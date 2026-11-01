package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class a7 extends j$.util.stream.x1 {
    @Override // j$.util.stream.a
    public final j$.util.stream.u2 H(j$.util.stream.a aVar, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        if (j$.util.stream.v7.SORTED.p(aVar.f)) {
            return aVar.j(spliterator, false, intFunction);
        }
        long[] jArr = (long[]) ((j$.util.stream.s2) aVar.j(spliterator, true, intFunction)).b();
        java.util.Arrays.sort(jArr);
        return new j$.util.stream.z3(jArr);
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        j$.util.Objects.requireNonNull(f6Var);
        if (j$.util.stream.v7.SORTED.p(i)) {
            return f6Var;
        }
        return j$.util.stream.v7.SIZED.p(i) ? new j$.util.stream.f7(f6Var) : new j$.util.stream.x6(f6Var);
    }
}
