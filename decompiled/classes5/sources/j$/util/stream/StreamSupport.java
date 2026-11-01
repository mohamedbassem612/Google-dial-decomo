package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class StreamSupport {
    public static <T> j$.util.stream.Stream<T> stream(j$.util.Spliterator<T> spliterator, boolean z) {
        j$.util.Objects.requireNonNull(spliterator);
        return new j$.util.stream.v5(spliterator, j$.util.stream.v7.l(spliterator), z);
    }

    public static <T> j$.util.stream.Stream<T> stream(java.util.function.Supplier<? extends j$.util.Spliterator<T>> supplier, int i, boolean z) {
        j$.util.Objects.requireNonNull(supplier);
        return new j$.util.stream.v5(supplier, i & j$.util.stream.v7.f, z);
    }
}
