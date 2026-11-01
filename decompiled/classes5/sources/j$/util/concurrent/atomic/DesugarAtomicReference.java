package j$.util.concurrent.atomic;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class DesugarAtomicReference {
    public static <V> V getAndUpdate(java.util.concurrent.atomic.AtomicReference<V> atomicReference, java.util.function.UnaryOperator<V> unaryOperator) {
        V v;
        do {
            v = atomicReference.get();
        } while (!j$.com.android.tools.r8.a.H(atomicReference, v, unaryOperator.apply(v)));
        return v;
    }

    public static <V> V updateAndGet(java.util.concurrent.atomic.AtomicReference<V> atomicReference, java.util.function.UnaryOperator<V> unaryOperator) {
        V v;
        V v2;
        do {
            v = atomicReference.get();
            v2 = (V) unaryOperator.apply(v);
        } while (!j$.com.android.tools.r8.a.H(atomicReference, v, v2));
        return v2;
    }
}
