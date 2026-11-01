package j$.util.concurrent.atomic;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class DesugarAtomicInteger {
    public static int updateAndGet(java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.function.IntUnaryOperator intUnaryOperator) {
        int i;
        int iApplyAsInt;
        do {
            i = atomicInteger.get();
            iApplyAsInt = intUnaryOperator.applyAsInt(i);
        } while (!atomicInteger.compareAndSet(i, iApplyAsInt));
        return iApplyAsInt;
    }
}
