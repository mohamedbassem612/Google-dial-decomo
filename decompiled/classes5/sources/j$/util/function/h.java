package j$.util.function;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class h implements java.util.function.IntUnaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.IntUnaryOperator b;
    public final /* synthetic */ java.util.function.IntUnaryOperator c;

    public /* synthetic */ h(java.util.function.IntUnaryOperator intUnaryOperator, java.util.function.IntUnaryOperator intUnaryOperator2, byte b) {
        this.a = b;
        this.b = intUnaryOperator;
        this.c = intUnaryOperator2;
    }

    public final /* synthetic */ java.util.function.IntUnaryOperator andThen(java.util.function.IntUnaryOperator intUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        switch (this.a) {
            case 0:
                return this.c.applyAsInt(this.b.applyAsInt(i));
            default:
                return this.b.applyAsInt(this.c.applyAsInt(i));
        }
    }

    public final /* synthetic */ java.util.function.IntUnaryOperator compose(java.util.function.IntUnaryOperator intUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
    }
}
