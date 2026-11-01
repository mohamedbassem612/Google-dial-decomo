package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class w extends j$.util.stream.y5 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(j$.util.stream.f6 f6Var, byte b) {
        super(f6Var);
        this.b = b;
    }

    @Override // j$.util.stream.c6, j$.util.stream.f6
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                java.util.function.DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d);
                throw null;
            case 1:
                java.util.function.DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d);
                throw null;
            default:
                java.util.function.DoublePredicate doublePredicate = null;
                doublePredicate.test(d);
                throw null;
        }
    }

    @Override // j$.util.stream.y5, j$.util.stream.f6
    public final void p(long j) {
        switch (this.b) {
            case 2:
                this.a.p(-1L);
                break;
            default:
                super.p(j);
                break;
        }
    }
}
