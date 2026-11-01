package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.Function$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class Function$CC {
    public static java.util.function.Function $default$andThen(java.util.function.Function function, java.util.function.Function function2) {
        j$.util.Objects.requireNonNull(function2);
        return new j$.util.function.e(function, function2, (byte) 0);
    }

    public static java.util.function.Function $default$compose(java.util.function.Function function, java.util.function.Function function2) {
        j$.util.Objects.requireNonNull(function2);
        return new j$.util.function.e(function, function2, (byte) 1);
    }

    public static <T> java.util.function.Function<T, T> identity() {
        return new j$.desugar.sun.nio.fs.n((byte) 12);
    }
}
