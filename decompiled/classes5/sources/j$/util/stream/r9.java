package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class r9 extends j$.util.stream.q1 implements j$.util.stream.y9 {
    public final /* synthetic */ java.util.function.IntPredicate n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(j$.util.stream.r1 r1Var, int i, java.util.function.IntPredicate intPredicate) {
        super(r1Var, i, (byte) 0);
        this.n = intPredicate;
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.u2 H(j$.util.stream.a aVar, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        return (j$.util.stream.u2) new j$.util.stream.aa(this, aVar, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.a
    public final j$.util.Spliterator I(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        return j$.util.stream.v7.ORDERED.p(aVar.f) ? H(aVar, spliterator, new j$.util.stream.z2((byte) 13)).spliterator() : new j$.util.stream.da((j$.util.Spliterator.OfInt) aVar.Q(spliterator), this.n);
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        return e(f6Var, false);
    }

    @Override // j$.util.stream.y9
    public final j$.util.stream.z9 e(j$.util.stream.f6 f6Var, boolean z) {
        return new j$.util.stream.q9(f6Var, this.n, z);
    }
}
