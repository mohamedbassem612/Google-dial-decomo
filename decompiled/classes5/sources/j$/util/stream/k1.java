package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class k1 implements java.util.function.Supplier, java.util.function.BinaryOperator, java.util.function.BiConsumer {
    public static final j$.util.stream.k1 DEFAULT;
    public static final /* synthetic */ j$.util.stream.k1[] a;

    static {
        j$.util.stream.k1 k1Var = new j$.util.stream.k1("DEFAULT", 0);
        DEFAULT = k1Var;
        a = new j$.util.stream.k1[]{k1Var};
    }

    public static j$.util.stream.k1 valueOf(java.lang.String str) {
        return (j$.util.stream.k1) java.lang.Enum.valueOf(j$.util.stream.k1.class, str);
    }

    public static j$.util.stream.k1[] values() {
        return (j$.util.stream.k1[]) a.clone();
    }

    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        return j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("This combiner cannot be used!");
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        return null;
    }

    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
        return j$.util.function.BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
    }
}
