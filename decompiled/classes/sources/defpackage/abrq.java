package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class abrq implements java.util.function.IntUnaryOperator {
    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ java.util.function.IntUnaryOperator andThen(java.util.function.IntUnaryOperator intUnaryOperator) {
        return j$.util.function.IntUnaryOperator.-CC.$default$andThen(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        if (i > 0) {
            return i - 1;
        }
        return 0;
    }

    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ java.util.function.IntUnaryOperator compose(java.util.function.IntUnaryOperator intUnaryOperator) {
        return j$.util.function.IntUnaryOperator.-CC.$default$compose(this, intUnaryOperator);
    }
}
