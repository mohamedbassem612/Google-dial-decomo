package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aajo implements java.util.function.IntUnaryOperator {
    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ java.util.function.IntUnaryOperator andThen(java.util.function.IntUnaryOperator intUnaryOperator) {
        return j$.util.function.IntUnaryOperator.-CC.$default$andThen(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        return java.lang.Math.max(i - 1, 0);
    }

    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ java.util.function.IntUnaryOperator compose(java.util.function.IntUnaryOperator intUnaryOperator) {
        return j$.util.function.IntUnaryOperator.-CC.$default$compose(this, intUnaryOperator);
    }
}
