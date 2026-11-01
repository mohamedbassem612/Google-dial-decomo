package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class Predicate$CC {
    public static java.util.function.Predicate $default$and(java.util.function.Predicate predicate, java.util.function.Predicate predicate2) {
        j$.util.Objects.requireNonNull(predicate2);
        return new j$.util.function.j(predicate, predicate2, (byte) 0);
    }

    public static java.util.function.Predicate $default$negate(java.util.function.Predicate predicate) {
        return new j$.desugar.sun.nio.fs.g((byte) 6, predicate);
    }

    public static java.util.function.Predicate $default$or(java.util.function.Predicate predicate, java.util.function.Predicate predicate2) {
        j$.util.Objects.requireNonNull(predicate2);
        return new j$.util.function.j(predicate, predicate2, (byte) 1);
    }

    public static <T> java.util.function.Predicate<T> not(java.util.function.Predicate<? super T> predicate) {
        j$.util.Objects.requireNonNull(predicate);
        return predicate.mo2negate();
    }
}
