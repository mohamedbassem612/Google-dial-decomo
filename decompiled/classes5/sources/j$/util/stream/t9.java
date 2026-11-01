package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class t9 extends j$.util.stream.x1 {
    @Override // j$.util.stream.a
    public final j$.util.stream.u2 H(j$.util.stream.a aVar, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        return (j$.util.stream.u2) new j$.util.stream.ba(this, aVar, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.a
    public final j$.util.Spliterator I(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        return j$.util.stream.v7.ORDERED.p(aVar.f) ? H(aVar, spliterator, new j$.util.stream.z2((byte) 14)).spliterator() : new j$.util.stream.ha((j$.util.Spliterator.OfLong) aVar.Q(spliterator));
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        j$.util.stream.s9 s9Var = new j$.util.stream.s9(f6Var);
        s9Var.b = true;
        return s9Var;
    }
}
