package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class w1 extends j$.util.stream.x1 {
    public final /* synthetic */ byte n;
    public final /* synthetic */ java.lang.Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(j$.util.stream.y1 y1Var, java.util.function.LongConsumer longConsumer) {
        super(y1Var, 0, (byte) 1);
        this.n = (byte) 1;
        this.o = longConsumer;
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        byte b = this.n;
        java.lang.Object obj = this.o;
        switch (b) {
            case 0:
                return new j$.util.stream.v1(f6Var, (j$.util.stream.l0) obj);
            case 1:
                return new j$.util.stream.t1(f6Var, (java.util.function.LongConsumer) obj, (byte) 1);
            case 2:
                return new j$.util.stream.q5(f6Var, (j$.util.stream.l0) obj);
            default:
                return new j$.util.stream.q(f6Var, (java.util.function.ToLongFunction) obj, (byte) 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(j$.util.stream.a aVar, int i, java.lang.Object obj, byte b) {
        super(aVar, i, (byte) 1);
        this.n = b;
        this.o = obj;
    }
}
