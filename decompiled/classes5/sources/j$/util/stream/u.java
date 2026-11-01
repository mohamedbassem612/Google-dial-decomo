package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class u extends j$.util.stream.w5 {
    public final /* synthetic */ byte n;
    public final /* synthetic */ java.lang.Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(j$.util.stream.x5 x5Var, java.util.function.Consumer consumer) {
        super(x5Var, 0, (byte) 1);
        this.n = (byte) 3;
        this.o = consumer;
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        switch (this.n) {
            case 0:
                return new j$.util.stream.s(f6Var, (java.util.function.DoubleFunction) this.o, (byte) 0);
            case 1:
                return new j$.util.stream.l1(f6Var, (java.util.function.IntFunction) this.o, (byte) 0);
            case 2:
                return new j$.util.stream.t1(f6Var, (java.util.function.LongFunction) this.o, (byte) 0);
            case 3:
                return new j$.util.stream.q(f6Var, (java.util.function.Consumer) this.o, (byte) 1);
            default:
                return new j$.util.stream.q(f6Var, (java.util.function.Predicate) this.o, (byte) 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(j$.util.stream.a aVar, int i, java.lang.Object obj, byte b) {
        super(aVar, i, (byte) 1);
        this.n = b;
        this.o = obj;
    }
}
