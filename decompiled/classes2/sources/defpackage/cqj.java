package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class cqj implements java.util.function.DoubleUnaryOperator {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ aonj a;

    public /* synthetic */ cqj(aonj aonjVar, int i) {
        this.$cid = i;
        this.a = aonjVar;
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final /* synthetic */ java.util.function.DoubleUnaryOperator andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator) {
        return this.$cid != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator) : j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final double applyAsDouble(double d) {
        int i = this.$cid;
        aonj aonjVar = this.a;
        return i != 0 ? ((java.lang.Number) aonjVar.a(java.lang.Double.valueOf(d))).doubleValue() : ((java.lang.Number) aonjVar.a(java.lang.Double.valueOf(d))).doubleValue();
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final /* synthetic */ java.util.function.DoubleUnaryOperator compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator) {
        return this.$cid != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator) : j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator);
    }
}
