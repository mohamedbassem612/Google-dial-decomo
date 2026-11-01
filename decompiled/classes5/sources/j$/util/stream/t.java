package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class t implements java.util.function.BinaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.BiConsumer b;

    public /* synthetic */ t(java.util.function.BiConsumer biConsumer, byte b) {
        this.a = b;
        this.b = biConsumer;
    }

    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return j$.util.function.BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.a;
        java.util.function.BiConsumer biConsumer = this.b;
        switch (b) {
            case 0:
                biConsumer.accept(obj, obj2);
                return obj;
            case 1:
                biConsumer.accept(obj, obj2);
                return obj;
            case 2:
                biConsumer.accept(obj, obj2);
                return obj;
            default:
                biConsumer.accept(obj, obj2);
                return obj;
        }
    }
}
