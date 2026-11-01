package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class alke implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ alke(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return this.$cid != 0 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        if (this.$cid != 0) {
            return ((defpackage.qts) obj).h(this.a);
        }
        return java.lang.Boolean.valueOf(this.a >= ((java.lang.Integer) obj).intValue());
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return this.$cid != 0 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
