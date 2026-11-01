package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class m9 extends j$.util.stream.w5 implements j$.util.stream.y9 {
    public final /* synthetic */ byte n;
    public final /* synthetic */ java.util.function.Predicate o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9(j$.util.stream.x5 x5Var, int i, java.util.function.Predicate predicate, byte b) {
        super(x5Var, i, (byte) 0);
        this.n = b;
        this.o = predicate;
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.u2 H(j$.util.stream.a aVar, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        switch (this.n) {
            case 0:
                return (j$.util.stream.u2) new j$.util.stream.ba(this, aVar, spliterator, intFunction).invoke();
            default:
                return (j$.util.stream.u2) new j$.util.stream.aa(this, aVar, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final j$.util.Spliterator I(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        byte b = this.n;
        java.util.function.Predicate predicate = this.o;
        switch (b) {
            case 0:
                return j$.util.stream.v7.ORDERED.p(aVar.f) ? H(aVar, spliterator, new j$.util.stream.r0((byte) 28)).spliterator() : new j$.util.stream.ja(aVar.Q(spliterator), predicate, (byte) 1);
            default:
                return j$.util.stream.v7.ORDERED.p(aVar.f) ? H(aVar, spliterator, new j$.util.stream.r0((byte) 28)).spliterator() : new j$.util.stream.ja(aVar.Q(spliterator), predicate, (byte) 0);
        }
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        switch (this.n) {
            case 0:
                return new j$.util.stream.p(f6Var, this.o);
            default:
                return e(f6Var, false);
        }
    }

    @Override // j$.util.stream.y9
    public final j$.util.stream.z9 e(j$.util.stream.f6 f6Var, boolean z) {
        return new j$.util.stream.n9(f6Var, this.o, z);
    }
}
