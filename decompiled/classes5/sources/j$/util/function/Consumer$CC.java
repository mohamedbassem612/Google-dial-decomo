package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.Consumer$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class Consumer$CC {
    public static java.util.function.Consumer $default$andThen(java.util.function.Consumer consumer, java.util.function.Consumer consumer2) {
        j$.util.Objects.requireNonNull(consumer2);
        return new j$.nio.file.e0((java.lang.Object) consumer, (java.lang.Object) consumer2, (byte) 4);
    }
}
