package j$.util.function;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class d implements java.util.function.DoubleUnaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.DoubleUnaryOperator b;
    public final /* synthetic */ java.util.function.DoubleUnaryOperator c;

    public /* synthetic */ d(java.util.function.DoubleUnaryOperator doubleUnaryOperator, java.util.function.DoubleUnaryOperator doubleUnaryOperator2, byte b) {
        this.a = b;
        this.b = doubleUnaryOperator;
        this.c = doubleUnaryOperator2;
    }

    public final /* synthetic */ java.util.function.DoubleUnaryOperator andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final double applyAsDouble(double d) {
        switch (this.a) {
            case 0:
                return this.b.applyAsDouble(this.c.applyAsDouble(d));
            default:
                return this.c.applyAsDouble(this.b.applyAsDouble(d));
        }
    }

    public final /* synthetic */ java.util.function.DoubleUnaryOperator compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator);
    }
}
