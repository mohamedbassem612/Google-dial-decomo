package j$.util.function;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class b implements java.util.function.BinaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.Comparator b;

    public /* synthetic */ b(java.util.Comparator comparator, byte b) {
        this.a = b;
        this.b = comparator;
    }

    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return j$.util.function.BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.a;
        java.util.Comparator comparator = this.b;
        switch (b) {
            case 0:
                if (comparator.compare(obj, obj2) >= 0) {
                    return obj;
                }
                break;
            default:
                if (comparator.compare(obj, obj2) <= 0) {
                    return obj;
                }
                break;
        }
        return obj2;
    }
}
