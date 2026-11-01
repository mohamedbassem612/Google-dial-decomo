package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class v extends j$.util.stream.b0 {
    public final /* synthetic */ byte n;
    public final /* synthetic */ java.lang.Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(j$.util.stream.b0 b0Var, java.util.function.DoubleConsumer doubleConsumer) {
        super(b0Var, 0, (byte) 1);
        this.n = (byte) 2;
        this.o = doubleConsumer;
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        byte b = this.n;
        java.lang.Object obj = this.o;
        switch (b) {
            case 0:
                return new j$.util.stream.s(f6Var, (java.util.function.DoubleUnaryOperator) obj, (byte) 1);
            case 1:
                return new j$.util.stream.z(f6Var, (j$.util.stream.l0) obj);
            case 2:
                return new j$.util.stream.s(f6Var, (java.util.function.DoubleConsumer) obj, (byte) 2);
            case 3:
                return new j$.util.stream.q(f6Var, (java.util.function.ToDoubleFunction) obj, (byte) 6);
            default:
                return new j$.util.stream.u5(f6Var, (j$.util.stream.l0) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(j$.util.stream.a aVar, int i, java.lang.Object obj, byte b) {
        super(aVar, i, (byte) 1);
        this.n = b;
        this.o = obj;
    }
}
