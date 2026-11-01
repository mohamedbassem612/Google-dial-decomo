package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class mgl implements java.util.function.Function {
    public final /* synthetic */ java.util.function.Function a;

    public /* synthetic */ mgl(java.util.function.Function function) {
        this.a = function;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        return new defpackage.kaw(defpackage.gus.av(((java.lang.Long) aa$.ExternalSyntheticApiModelOutline1.m(this.a, obj)).longValue()));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
