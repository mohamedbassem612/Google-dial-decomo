package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class v9 extends j$.util.stream.x1 implements j$.util.stream.y9 {
    @Override // j$.util.stream.a
    public final j$.util.stream.u2 H(j$.util.stream.a aVar, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        return (j$.util.stream.u2) new j$.util.stream.aa(this, aVar, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.a
    public final j$.util.Spliterator I(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        return j$.util.stream.v7.ORDERED.p(aVar.f) ? H(aVar, spliterator, new j$.util.stream.z2((byte) 15)).spliterator() : new j$.util.stream.ga((j$.util.Spliterator.OfLong) aVar.Q(spliterator));
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        return new j$.util.stream.u9(f6Var);
    }

    @Override // j$.util.stream.y9
    public final j$.util.stream.z9 e(j$.util.stream.f6 f6Var, boolean z) {
        return new j$.util.stream.u9(f6Var);
    }
}
