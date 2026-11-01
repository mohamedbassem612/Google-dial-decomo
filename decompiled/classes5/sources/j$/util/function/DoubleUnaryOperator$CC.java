package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.DoubleUnaryOperator$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class DoubleUnaryOperator$CC {
    public static java.util.function.DoubleUnaryOperator $default$andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator, java.util.function.DoubleUnaryOperator doubleUnaryOperator2) {
        j$.util.Objects.requireNonNull(doubleUnaryOperator2);
        return new j$.util.function.d(doubleUnaryOperator, doubleUnaryOperator2, (byte) 1);
    }

    public static java.util.function.DoubleUnaryOperator $default$compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator, java.util.function.DoubleUnaryOperator doubleUnaryOperator2) {
        j$.util.Objects.requireNonNull(doubleUnaryOperator2);
        return new j$.util.function.d(doubleUnaryOperator, doubleUnaryOperator2, (byte) 0);
    }
}
