package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class m1 extends j$.util.stream.q1 {
    public final /* synthetic */ byte n;
    public final /* synthetic */ java.lang.Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(j$.util.stream.r1 r1Var, java.util.function.IntConsumer intConsumer) {
        super(r1Var, 0, (byte) 1);
        this.n = (byte) 0;
        this.o = intConsumer;
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        byte b = this.n;
        java.lang.Object obj = this.o;
        switch (b) {
            case 0:
                return new j$.util.stream.l1(f6Var, (java.util.function.IntConsumer) obj, (byte) 1);
            case 1:
                return new j$.util.stream.l1(f6Var, (java.util.function.IntUnaryOperator) obj, (byte) 2);
            case 2:
                return new j$.util.stream.o1(f6Var, (j$.util.stream.l0) obj);
            case 3:
                return new j$.util.stream.l1(f6Var, (java.util.function.IntPredicate) obj, (byte) 3);
            case 4:
                return new j$.util.stream.q(f6Var, (java.util.function.ToIntFunction) obj, (byte) 4);
            default:
                return new j$.util.stream.t5(f6Var, (j$.util.stream.l0) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(j$.util.stream.a aVar, int i, java.lang.Object obj, byte b) {
        super(aVar, i, (byte) 1);
        this.n = b;
        this.o = obj;
    }
}
