package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class zau implements java.util.function.BiFunction {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ zau(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.BiFunction.-CC.$default$andThen(this, function) : j$.util.function.BiFunction.-CC.$default$andThen(this, function);
        }
        return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aonn, java.lang.Object] */
    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return this.a.a(obj, obj2);
        }
        if (i == 1) {
            return this.a.a(obj, obj2);
        }
        byte[] bArr = (byte[]) obj2;
        java.lang.Object obj3 = this.a;
        return !java.util.Arrays.equals(bArr, (byte[]) obj3) ? obj3 : bArr;
    }
}
