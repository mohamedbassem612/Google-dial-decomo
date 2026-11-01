package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface BaseStream<T, S extends j$.util.stream.BaseStream<T, S>> extends java.lang.AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    java.util.Iterator<T> iterator();

    S onClose(java.lang.Runnable runnable);

    j$.util.stream.BaseStream parallel();

    j$.util.stream.BaseStream sequential();

    j$.util.Spliterator<T> spliterator();

    j$.util.stream.BaseStream unordered();
}
