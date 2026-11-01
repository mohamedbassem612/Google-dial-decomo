package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.BiFunction$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class BiFunction$CC {
    public static java.util.function.BiFunction $default$andThen(java.util.function.BiFunction biFunction, java.util.function.Function function) {
        j$.util.Objects.requireNonNull(function);
        return new j$.nio.file.e0((java.lang.Object) biFunction, (java.lang.Object) function, (byte) 3);
    }
}
