package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pqu implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;

    public /* synthetic */ pqu(long j, int i) {
        this.$cid = i;
        this.a = j;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return this.$cid != 0 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        if (this.$cid == 0) {
            return java.lang.Long.valueOf(((java.lang.Long) obj).longValue() - this.a);
        }
        return java.lang.Boolean.valueOf((boolean) (((this.a - ((java.lang.Long) obj).longValue()) > 1000L ? 1 : ((this.a - ((java.lang.Long) obj).longValue()) == 1000L ? 0 : -1)) >>> 31));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return this.$cid != 0 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
