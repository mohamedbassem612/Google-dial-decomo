package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class p1 extends j$.util.stream.r1 {
    @Override // j$.util.stream.r1, j$.util.stream.IntStream
    public final void forEach(java.util.function.IntConsumer intConsumer) {
        if (this.a.l) {
            super.forEach(intConsumer);
        } else {
            j$.util.stream.r1.R(M()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.r1, j$.util.stream.IntStream
    public final void forEachOrdered(java.util.function.IntConsumer intConsumer) {
        if (this.a.l) {
            super.forEachOrdered(intConsumer);
        } else {
            j$.util.stream.r1.R(M()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.stream.IntStream parallel() {
        this.a.l = true;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.stream.IntStream sequential() {
        this.a.l = false;
        return this;
    }
}
