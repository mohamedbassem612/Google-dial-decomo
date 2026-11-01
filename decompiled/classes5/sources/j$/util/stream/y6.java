package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class y6 extends j$.util.stream.b0 implements j$.util.stream.y9 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6(j$.util.stream.a aVar, int i, byte b) {
        super(aVar, i, (byte) 0);
        this.n = b;
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.u2 H(j$.util.stream.a aVar, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        switch (this.n) {
            case 0:
                if (j$.util.stream.v7.SORTED.p(aVar.f)) {
                    return aVar.j(spliterator, false, intFunction);
                }
                double[] dArr = (double[]) ((j$.util.stream.o2) aVar.j(spliterator, true, intFunction)).b();
                java.util.Arrays.sort(dArr);
                return new j$.util.stream.h3(dArr);
            case 1:
                return (j$.util.stream.u2) new j$.util.stream.ba(this, aVar, spliterator, intFunction).invoke();
            default:
                return (j$.util.stream.u2) new j$.util.stream.aa(this, aVar, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final j$.util.Spliterator I(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        switch (this.n) {
            case 1:
                return j$.util.stream.v7.ORDERED.p(aVar.f) ? H(aVar, spliterator, new j$.util.stream.z2((byte) 16)).spliterator() : new j$.util.stream.ca((j$.util.p0) aVar.Q(spliterator), (byte) 1);
            case 2:
                return j$.util.stream.v7.ORDERED.p(aVar.f) ? H(aVar, spliterator, new j$.util.stream.z2((byte) 17)).spliterator() : new j$.util.stream.ca((j$.util.p0) aVar.Q(spliterator), (byte) 0);
            default:
                return super.I(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        switch (this.n) {
            case 0:
                j$.util.Objects.requireNonNull(f6Var);
                if (!j$.util.stream.v7.SORTED.p(i)) {
                    f6Var = j$.util.stream.v7.SIZED.p(i) ? new j$.util.stream.d7(f6Var) : new j$.util.stream.v6(f6Var);
                }
                return f6Var;
            case 1:
                j$.util.stream.w9 w9Var = new j$.util.stream.w9(f6Var);
                w9Var.b = true;
                return w9Var;
            default:
                return new j$.util.stream.x9(f6Var);
        }
    }

    @Override // j$.util.stream.y9
    public final j$.util.stream.z9 e(j$.util.stream.f6 f6Var, boolean z) {
        return new j$.util.stream.x9(f6Var);
    }
}
