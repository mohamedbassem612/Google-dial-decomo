package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.LongConsumer$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class LongConsumer$CC {
    public static java.util.function.LongConsumer $default$andThen(final java.util.function.LongConsumer longConsumer, final java.util.function.LongConsumer longConsumer2) {
        j$.util.Objects.requireNonNull(longConsumer2);
        return new java.util.function.LongConsumer() { // from class: j$.util.function.i
            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                longConsumer.accept(j);
                longConsumer2.accept(j);
            }

            public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer3) {
                return j$.util.function.LongConsumer$CC.$default$andThen(this, longConsumer3);
            }
        };
    }
}
