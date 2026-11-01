package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class z7 extends j$.util.stream.b8 implements java.util.function.IntConsumer {
    public final int[] c = new int[128];

    @Override // j$.util.stream.b8
    public final void a(java.lang.Object obj, long j) {
        java.util.function.IntConsumer intConsumer = (java.util.function.IntConsumer) obj;
        for (int i = 0; i < j; i++) {
            intConsumer.accept(this.c[i]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.b;
        this.b = i2 + 1;
        this.c[i2] = i;
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
