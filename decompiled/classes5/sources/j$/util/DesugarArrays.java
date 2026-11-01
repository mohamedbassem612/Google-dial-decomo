package j$.util;

/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class DesugarArrays {
    public static j$.util.stream.IntStream stream(int[] iArr) {
        j$.util.Spliterator.OfInt ofIntSpliterator = j$.util.Spliterators.spliterator(iArr, 0, iArr.length, 1040);
        return new j$.util.stream.p1(ofIntSpliterator, j$.util.stream.v7.l(ofIntSpliterator), false);
    }

    public static <T> j$.util.stream.Stream<T> stream(T[] tArr) {
        return j$.util.stream.StreamSupport.stream(j$.util.Spliterators.b(tArr, 0, tArr.length, 1040), false);
    }
}
