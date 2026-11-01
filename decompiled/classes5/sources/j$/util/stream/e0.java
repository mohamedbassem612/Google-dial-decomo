package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class e0 implements j$.util.stream.j9 {
    public final int a;
    public final java.lang.Object b;
    public final java.util.function.Predicate c;
    public final java.util.function.Supplier d;

    public e0(boolean z, j$.util.stream.w7 w7Var, java.lang.Object obj, java.util.function.Predicate predicate, java.util.function.Supplier supplier) {
        this.a = j$.util.stream.v7.u | (z ? 0 : j$.util.stream.v7.r);
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.j9
    public final java.lang.Object a(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        j$.util.stream.k9 k9Var = (j$.util.stream.k9) this.d.get();
        aVar.O(spliterator, k9Var);
        java.lang.Object obj = k9Var.get();
        return obj == null ? this.b : obj;
    }

    @Override // j$.util.stream.j9
    public final java.lang.Object b(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        return new j$.util.stream.k0(this, j$.util.stream.v7.ORDERED.p(aVar.f), aVar, spliterator).invoke();
    }

    @Override // j$.util.stream.j9
    public final int c() {
        return this.a;
    }
}
