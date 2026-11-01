package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface Stream<T> extends j$.util.stream.BaseStream<T, j$.util.stream.Stream<T>> {
    j$.util.stream.LongStream B(j$.util.stream.l0 l0Var);

    boolean allMatch(java.util.function.Predicate<? super T> predicate);

    boolean anyMatch(java.util.function.Predicate<? super T> predicate);

    <R, A> R collect(j$.util.stream.Collector<? super T, A, R> collector);

    <R> R collect(java.util.function.Supplier<R> supplier, java.util.function.BiConsumer<R, ? super T> biConsumer, java.util.function.BiConsumer<R, R> biConsumer2);

    long count();

    j$.util.stream.Stream<T> distinct();

    j$.util.stream.Stream dropWhile(java.util.function.Predicate predicate);

    j$.util.stream.Stream<T> filter(java.util.function.Predicate<? super T> predicate);

    j$.util.Optional<T> findAny();

    j$.util.Optional<T> findFirst();

    <R> j$.util.stream.Stream<R> flatMap(java.util.function.Function<? super T, ? extends j$.util.stream.Stream<? extends R>> function);

    void forEach(java.util.function.Consumer<? super T> consumer);

    void forEachOrdered(java.util.function.Consumer<? super T> consumer);

    j$.util.stream.Stream l(j$.util.stream.c1 c1Var);

    j$.util.stream.Stream<T> limit(long j);

    <R> j$.util.stream.Stream<R> map(java.util.function.Function<? super T, ? extends R> function);

    j$.util.stream.DoubleStream mapToDouble(java.util.function.ToDoubleFunction<? super T> toDoubleFunction);

    j$.util.stream.IntStream mapToInt(java.util.function.ToIntFunction<? super T> toIntFunction);

    j$.util.stream.LongStream mapToLong(java.util.function.ToLongFunction<? super T> toLongFunction);

    j$.util.Optional<T> max(java.util.Comparator<? super T> comparator);

    j$.util.Optional<T> min(java.util.Comparator<? super T> comparator);

    boolean noneMatch(java.util.function.Predicate<? super T> predicate);

    j$.util.stream.Stream peek(java.util.function.Consumer consumer);

    j$.util.Optional<T> reduce(java.util.function.BinaryOperator<T> binaryOperator);

    java.lang.Object reduce(java.lang.Object obj, java.util.function.BiFunction biFunction, java.util.function.BinaryOperator binaryOperator);

    java.lang.Object reduce(java.lang.Object obj, java.util.function.BinaryOperator binaryOperator);

    j$.util.stream.Stream<T> skip(long j);

    j$.util.stream.Stream<T> sorted();

    j$.util.stream.Stream<T> sorted(java.util.Comparator<? super T> comparator);

    j$.util.stream.Stream takeWhile(java.util.function.Predicate predicate);

    java.lang.Object[] toArray();

    <A> A[] toArray(java.util.function.IntFunction<A[]> intFunction);

    java.util.List toList();

    j$.util.stream.DoubleStream w(j$.util.stream.l0 l0Var);

    j$.util.stream.IntStream x(j$.util.stream.l0 l0Var);

    /* JADX INFO: renamed from: j$.util.stream.Stream$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
    public final /* synthetic */ class CC {
        public static <T> j$.util.stream.Stream<T> concat(j$.util.stream.Stream<? extends T> stream, j$.util.stream.Stream<? extends T> stream2) {
            j$.util.Objects.requireNonNull(stream);
            j$.util.Objects.requireNonNull(stream2);
            return j$.util.stream.StreamSupport.stream(new j$.util.stream.g9(stream.spliterator(), stream2.spliterator()), stream.isParallel() || stream2.isParallel()).onClose(new j$.util.stream.f9(stream, stream2, (byte) 1));
        }

        public static <T> j$.util.stream.Stream<T> empty() {
            return j$.util.stream.StreamSupport.stream(j$.util.Spliterators.a, false);
        }

        public static <T> j$.util.stream.Stream<T> of(T t) {
            return j$.util.stream.StreamSupport.stream(new j$.util.stream.i9(t), false);
        }

        public static <T> j$.util.stream.Stream<T> ofNullable(T t) {
            return t == null ? empty() : j$.util.stream.StreamSupport.stream(new j$.util.stream.i9(t), false);
        }

        public static <T> j$.util.stream.Stream<T> of(T... tArr) {
            return j$.util.DesugarArrays.stream(tArr);
        }
    }
}
