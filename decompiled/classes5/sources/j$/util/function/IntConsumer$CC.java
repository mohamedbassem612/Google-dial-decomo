package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.IntConsumer$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class IntConsumer$CC {
    public static java.util.function.IntConsumer $default$andThen(final java.util.function.IntConsumer intConsumer, final java.util.function.IntConsumer intConsumer2) {
        j$.util.Objects.requireNonNull(intConsumer2);
        return new java.util.function.IntConsumer() { // from class: j$.util.function.f
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                intConsumer.accept(i);
                intConsumer2.accept(i);
            }

            public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer3) {
                return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer3);
            }
        };
    }
}
