package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface Spliterator<T> {

    /* JADX INFO: renamed from: j$.util.Spliterator$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
    public final /* synthetic */ class CC {
        public static void $default$forEachRemaining(j$.util.Spliterator spliterator, java.util.function.Consumer consumer) {
            while (spliterator.tryAdvance(consumer)) {
            }
        }

        public static java.util.Comparator $default$getComparator(j$.util.Spliterator spliterator) {
            throw new java.lang.IllegalStateException();
        }

        public static long $default$getExactSizeIfKnown(j$.util.Spliterator spliterator) {
            if ((spliterator.characteristics() & 64) == 0) {
                return -1L;
            }
            return spliterator.estimateSize();
        }

        public static boolean $default$hasCharacteristics(j$.util.Spliterator spliterator, int i) {
            return (spliterator.characteristics() & i) == i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
    public interface OfInt extends j$.util.w0 {
        void forEachRemaining(java.util.function.IntConsumer intConsumer);

        boolean tryAdvance(java.util.function.IntConsumer intConsumer);

        @Override // j$.util.w0, j$.util.Spliterator
        j$.util.Spliterator.OfInt trySplit();
    }

    /* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
    public interface OfLong extends j$.util.w0 {
        void forEachRemaining(java.util.function.LongConsumer longConsumer);

        boolean tryAdvance(java.util.function.LongConsumer longConsumer);

        @Override // j$.util.w0, j$.util.Spliterator
        j$.util.Spliterator.OfLong trySplit();
    }

    int characteristics();

    long estimateSize();

    void forEachRemaining(java.util.function.Consumer<? super T> consumer);

    java.util.Comparator<? super T> getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    boolean tryAdvance(java.util.function.Consumer<? super T> consumer);

    j$.util.Spliterator<T> trySplit();
}
