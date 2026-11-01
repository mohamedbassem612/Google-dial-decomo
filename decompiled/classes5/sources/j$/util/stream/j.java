package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class j implements java.util.function.BinaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.BinaryOperator b;

    public /* synthetic */ j(java.util.function.BinaryOperator binaryOperator, byte b) {
        this.a = b;
        this.b = binaryOperator;
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
        java.util.function.BinaryOperator binaryOperator = this.b;
        switch (b) {
            case 0:
                j$.util.stream.o oVar = (j$.util.stream.o) obj;
                j$.util.stream.o oVar2 = (j$.util.stream.o) obj2;
                java.util.Set set = j$.util.stream.Collectors.a;
                return new j$.util.stream.o(binaryOperator.apply(oVar.a, oVar2.a), binaryOperator.apply(oVar.b, oVar2.b));
            default:
                java.util.Map map = (java.util.Map) obj;
                java.util.Set set2 = j$.util.stream.Collectors.a;
                for (java.util.Map.Entry entry : ((java.util.Map) obj2).entrySet()) {
                    j$.util.Map.EL.a(map, entry.getKey(), entry.getValue(), binaryOperator);
                }
                return map;
        }
    }
}
