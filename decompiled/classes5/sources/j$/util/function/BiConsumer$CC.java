package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.BiConsumer$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class BiConsumer$CC {
    public static java.util.function.BiConsumer $default$andThen(java.util.function.BiConsumer biConsumer, java.util.function.BiConsumer biConsumer2) {
        j$.util.Objects.requireNonNull(biConsumer2);
        return new j$.nio.file.e0((java.lang.Object) biConsumer, (java.lang.Object) biConsumer2, (byte) 2);
    }
}
