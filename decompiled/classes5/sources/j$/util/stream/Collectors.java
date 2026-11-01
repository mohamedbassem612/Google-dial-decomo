package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class Collectors {
    public static final java.util.Set a;
    public static final java.util.Set b;
    public static final java.util.Set c;

    static {
        j$.util.stream.Collector.Characteristics characteristics = j$.util.stream.Collector.Characteristics.CONCURRENT;
        j$.util.stream.Collector.Characteristics characteristics2 = j$.util.stream.Collector.Characteristics.UNORDERED;
        j$.util.stream.Collector.Characteristics characteristics3 = j$.util.stream.Collector.Characteristics.IDENTITY_FINISH;
        j$.util.DesugarCollections.unmodifiableSet(java.util.EnumSet.of(characteristics, characteristics2, characteristics3));
        j$.util.DesugarCollections.unmodifiableSet(java.util.EnumSet.of(characteristics, characteristics2));
        a = j$.util.DesugarCollections.unmodifiableSet(java.util.EnumSet.of(characteristics3));
        b = j$.util.DesugarCollections.unmodifiableSet(java.util.EnumSet.of(characteristics2, characteristics3));
        c = java.util.Collections.EMPTY_SET;
        j$.util.DesugarCollections.unmodifiableSet(java.util.EnumSet.of(characteristics2));
    }

    public static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, A, R, RR> j$.util.stream.Collector<T, A, RR> collectingAndThen(j$.util.stream.Collector<T, A, R> collector, java.util.function.Function<R, RR> function) {
        java.util.Set<j$.util.stream.Collector.Characteristics> setCharacteristics = collector.characteristics();
        j$.util.stream.Collector.Characteristics characteristics = j$.util.stream.Collector.Characteristics.IDENTITY_FINISH;
        if (setCharacteristics.contains(characteristics)) {
            if (setCharacteristics.size() == 1) {
                setCharacteristics = c;
            } else {
                java.util.EnumSet enumSetCopyOf = java.util.EnumSet.copyOf((java.util.Collection) setCharacteristics);
                enumSetCopyOf.remove(characteristics);
                setCharacteristics = j$.util.DesugarCollections.unmodifiableSet(enumSetCopyOf);
            }
        }
        return new j$.util.stream.m(collector.supplier(), collector.accumulator(), collector.combiner(), collector.finisher().mo3andThen(function), setCharacteristics);
    }

    public static j$.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> joining(java.lang.CharSequence charSequence) {
        return new j$.util.stream.m(new j$.desugar.sun.nio.fs.g((byte) 9, charSequence), new j$.desugar.sun.nio.fs.n((byte) 28), new j$.desugar.sun.nio.fs.n((byte) 29), new j$.util.stream.l((byte) 0), c);
    }

    public static <T> j$.util.stream.Collector<T, ?, java.util.Map<java.lang.Boolean, java.util.List<T>>> partitioningBy(java.util.function.Predicate<? super T> predicate) {
        j$.util.stream.Collector list = toList();
        j$.nio.file.e0 e0Var = new j$.nio.file.e0((java.lang.Object) list.accumulator(), (java.lang.Object) predicate, (byte) 5);
        j$.util.stream.j jVar = new j$.util.stream.j(list.combiner(), (byte) 0);
        j$.util.stream.k kVar = new j$.util.stream.k(list);
        return list.characteristics().contains(j$.util.stream.Collector.Characteristics.IDENTITY_FINISH) ? new j$.util.stream.m(kVar, e0Var, jVar, a) : new j$.util.stream.m(kVar, e0Var, jVar, new j$.util.stream.k(list), c);
    }

    public static <T, C extends java.util.Collection<T>> j$.util.stream.Collector<T, ?, C> toCollection(java.util.function.Supplier<C> supplier) {
        return new j$.util.stream.m(supplier, new j$.desugar.sun.nio.fs.n((byte) 16), new j$.desugar.sun.nio.fs.n((byte) 17), a);
    }

    public static <T> j$.util.stream.Collector<T, ?, java.util.List<T>> toList() {
        return new j$.util.stream.m(new j$.desugar.sun.nio.fs.n((byte) 18), new j$.desugar.sun.nio.fs.n((byte) 19), new j$.desugar.sun.nio.fs.n((byte) 26), a);
    }

    public static <T, K, U, M extends java.util.Map<K, U>> j$.util.stream.Collector<T, ?, M> toMap(final java.util.function.Function<? super T, ? extends K> function, final java.util.function.Function<? super T, ? extends U> function2, final java.util.function.BinaryOperator<U> binaryOperator, java.util.function.Supplier<M> supplier) {
        return new j$.util.stream.m(supplier, new java.util.function.BiConsumer() { // from class: j$.util.stream.i
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                java.util.Set set = j$.util.stream.Collectors.a;
                j$.util.Map.EL.a((java.util.Map) obj, function.apply(obj2), function2.apply(obj2), binaryOperator);
            }

            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                return j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new j$.util.stream.j(binaryOperator, (byte) 1), a);
    }

    public static <T> j$.util.stream.Collector<T, ?, java.util.Set<T>> toSet() {
        return new j$.util.stream.m(new j$.desugar.sun.nio.fs.n((byte) 23), new j$.desugar.sun.nio.fs.n((byte) 24), new j$.util.stream.l((byte) 1), b);
    }

    public static j$.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> joining() {
        return new j$.util.stream.m(new j$.util.stream.l((byte) 2), new j$.util.stream.l((byte) 3), new j$.util.stream.l((byte) 4), new j$.util.stream.l((byte) 5), c);
    }
}
