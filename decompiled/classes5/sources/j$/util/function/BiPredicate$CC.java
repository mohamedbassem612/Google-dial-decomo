package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.BiPredicate$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class BiPredicate$CC {
    public static java.util.function.BiPredicate $default$and(java.util.function.BiPredicate biPredicate, java.util.function.BiPredicate biPredicate2) {
        j$.util.Objects.requireNonNull(biPredicate2);
        return new j$.util.function.a(biPredicate, biPredicate2, (byte) 1);
    }

    public static java.util.function.BiPredicate $default$negate(java.util.function.BiPredicate biPredicate) {
        return new j$.desugar.sun.nio.fs.g((byte) 4, biPredicate);
    }

    public static java.util.function.BiPredicate $default$or(java.util.function.BiPredicate biPredicate, java.util.function.BiPredicate biPredicate2) {
        j$.util.Objects.requireNonNull(biPredicate2);
        return new j$.util.function.a(biPredicate, biPredicate2, (byte) 0);
    }
}
