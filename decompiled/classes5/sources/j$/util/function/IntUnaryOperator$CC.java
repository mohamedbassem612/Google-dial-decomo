package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.IntUnaryOperator$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class IntUnaryOperator$CC {
    public static java.util.function.IntUnaryOperator $default$andThen(java.util.function.IntUnaryOperator intUnaryOperator, java.util.function.IntUnaryOperator intUnaryOperator2) {
        j$.util.Objects.requireNonNull(intUnaryOperator2);
        return new j$.util.function.h(intUnaryOperator, intUnaryOperator2, (byte) 0);
    }

    public static java.util.function.IntUnaryOperator $default$compose(java.util.function.IntUnaryOperator intUnaryOperator, java.util.function.IntUnaryOperator intUnaryOperator2) {
        j$.util.Objects.requireNonNull(intUnaryOperator2);
        return new j$.util.function.h(intUnaryOperator, intUnaryOperator2, (byte) 1);
    }
}
