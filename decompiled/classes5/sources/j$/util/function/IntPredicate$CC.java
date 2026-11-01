package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.IntPredicate$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class IntPredicate$CC {
    public static java.util.function.IntPredicate $default$and(java.util.function.IntPredicate intPredicate, java.util.function.IntPredicate intPredicate2) {
        j$.util.Objects.requireNonNull(intPredicate2);
        return new j$.util.function.g(intPredicate, intPredicate2, (byte) 1);
    }

    public static java.util.function.IntPredicate $default$negate(java.util.function.IntPredicate intPredicate) {
        return new j$.desugar.sun.nio.fs.g((byte) 5, intPredicate);
    }

    public static java.util.function.IntPredicate $default$or(java.util.function.IntPredicate intPredicate, java.util.function.IntPredicate intPredicate2) {
        j$.util.Objects.requireNonNull(intPredicate2);
        return new j$.util.function.g(intPredicate, intPredicate2, (byte) 0);
    }
}
