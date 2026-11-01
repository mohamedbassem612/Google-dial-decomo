package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface Comparator<T> {
    java.util.Comparator<T> reversed();

    java.util.Comparator<T> thenComparing(java.util.Comparator<? super T> comparator);

    <U extends java.lang.Comparable<? super U>> java.util.Comparator<T> thenComparing(java.util.function.Function<? super T, ? extends U> function);

    <U> java.util.Comparator<T> thenComparing(java.util.function.Function<? super T, ? extends U> function, java.util.Comparator<? super U> comparator);

    java.util.Comparator<T> thenComparingDouble(java.util.function.ToDoubleFunction<? super T> toDoubleFunction);

    java.util.Comparator<T> thenComparingInt(java.util.function.ToIntFunction<? super T> toIntFunction);

    java.util.Comparator<T> thenComparingLong(java.util.function.ToLongFunction<? super T> toLongFunction);

    /* JADX INFO: renamed from: j$.util.Comparator$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
    public final /* synthetic */ class CC {
        public static java.util.Comparator $default$thenComparing(java.util.Comparator comparator, java.util.Comparator comparator2) {
            j$.util.Objects.requireNonNull(comparator2);
            return new j$.util.c(comparator, comparator2, (byte) 0);
        }

        public static java.util.Comparator $default$thenComparingInt(java.util.Comparator comparator, java.util.function.ToIntFunction toIntFunction) {
            return j$.util.Comparator.EL.thenComparing(comparator, comparingInt(toIntFunction));
        }

        public static java.util.Comparator $default$thenComparingLong(java.util.Comparator comparator, java.util.function.ToLongFunction toLongFunction) {
            return j$.util.Comparator.EL.thenComparing(comparator, comparingLong(toLongFunction));
        }

        public static <T, U> java.util.Comparator<T> comparing(java.util.function.Function<? super T, ? extends U> function, java.util.Comparator<? super U> comparator) {
            j$.util.Objects.requireNonNull(function);
            j$.util.Objects.requireNonNull(comparator);
            return new j$.util.c(comparator, function, (byte) 1);
        }

        public static <T> java.util.Comparator<T> comparingDouble(java.util.function.ToDoubleFunction<? super T> toDoubleFunction) {
            j$.util.Objects.requireNonNull(toDoubleFunction);
            return new j$.util.b((byte) 1, toDoubleFunction);
        }

        public static <T> java.util.Comparator<T> comparingInt(java.util.function.ToIntFunction<? super T> toIntFunction) {
            j$.util.Objects.requireNonNull(toIntFunction);
            return new j$.util.b((byte) 0, toIntFunction);
        }

        public static <T> java.util.Comparator<T> comparingLong(java.util.function.ToLongFunction<? super T> toLongFunction) {
            j$.util.Objects.requireNonNull(toLongFunction);
            return new j$.util.b((byte) 3, toLongFunction);
        }

        public static <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> naturalOrder() {
            return j$.util.d.INSTANCE;
        }

        public static <T> java.util.Comparator<T> nullsLast(java.util.Comparator<? super T> comparator) {
            return new j$.util.e(false, comparator);
        }

        public static <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> reverseOrder() {
            return java.util.Collections.reverseOrder();
        }

        public static java.util.Comparator $default$thenComparing(java.util.Comparator comparator, java.util.function.Function function) {
            return j$.util.Comparator.EL.thenComparing(comparator, comparing(function));
        }

        public static <T, U extends java.lang.Comparable<? super U>> java.util.Comparator<T> comparing(java.util.function.Function<? super T, ? extends U> function) {
            j$.util.Objects.requireNonNull(function);
            return new j$.util.b((byte) 2, function);
        }
    }

    /* JADX INFO: renamed from: j$.util.Comparator$-EL, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
    public final /* synthetic */ class EL {
        public static java.util.Comparator reversed(java.util.Comparator comparator) {
            return comparator instanceof j$.util.Comparator ? ((j$.util.Comparator) comparator).reversed() : java.util.Collections.reverseOrder(comparator);
        }

        public static /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator, java.util.Comparator comparator2) {
            return comparator instanceof j$.util.Comparator ? ((j$.util.Comparator) comparator).thenComparing(comparator2) : j$.util.Comparator.CC.$default$thenComparing(comparator, comparator2);
        }

        public static /* synthetic */ java.util.Comparator thenComparingInt(java.util.Comparator comparator, java.util.function.ToIntFunction toIntFunction) {
            return comparator instanceof j$.util.Comparator ? ((j$.util.Comparator) comparator).thenComparingInt(toIntFunction) : j$.util.Comparator.CC.$default$thenComparingInt(comparator, toIntFunction);
        }

        public static /* synthetic */ java.util.Comparator thenComparingLong(java.util.Comparator comparator, java.util.function.ToLongFunction toLongFunction) {
            return comparator instanceof j$.util.Comparator ? ((j$.util.Comparator) comparator).thenComparingLong(toLongFunction) : j$.util.Comparator.CC.$default$thenComparingLong(comparator, toLongFunction);
        }

        public static /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator, java.util.function.Function function) {
            return comparator instanceof j$.util.Comparator ? ((j$.util.Comparator) comparator).thenComparing(function) : j$.util.Comparator.CC.$default$thenComparing(comparator, function);
        }
    }
}
