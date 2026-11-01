package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class u1 extends j$.util.stream.a6 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(j$.util.stream.f6 f6Var, byte b) {
        super(f6Var);
        this.b = b;
    }

    @Override // j$.util.stream.e6, java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept(j);
                return;
            case 1:
                java.util.function.LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j);
                throw null;
            case 2:
                java.util.function.LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                java.util.function.LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            default:
                java.util.function.LongPredicate longPredicate = null;
                longPredicate.test(j);
                throw null;
        }
    }

    @Override // j$.util.stream.a6, j$.util.stream.f6
    public final void p(long j) {
        switch (this.b) {
            case 4:
                this.a.p(-1L);
                break;
            default:
                super.p(j);
                break;
        }
    }
}
