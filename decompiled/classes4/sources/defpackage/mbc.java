package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class mbc implements java.util.function.BiFunction {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ aonn a;

    public /* synthetic */ mbc(aonn aonnVar, int i) {
        this.$cid = i;
        this.a = aonnVar;
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.BiFunction.-CC.$default$andThen(this, function) : j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return this.a.a(obj, obj2);
        }
        aonn aonnVar = this.a;
        return i != 1 ? aonnVar.a(obj, obj2) : aonnVar.a(obj, obj2);
    }
}
