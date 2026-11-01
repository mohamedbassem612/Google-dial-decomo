package j$.util.concurrent.atomic;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class DesugarAtomicLong {
    public static long getAndAccumulate(java.util.concurrent.atomic.AtomicLong atomicLong, long j, java.util.function.LongBinaryOperator longBinaryOperator) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, longBinaryOperator.applyAsLong(j2, j)));
        return j2;
    }
}
