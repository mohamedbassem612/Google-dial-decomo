package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface p0 extends j$.util.w0 {
    void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer);

    boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer);

    @Override // j$.util.w0, j$.util.Spliterator
    j$.util.p0 trySplit();
}
