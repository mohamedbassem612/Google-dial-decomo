package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class v5 extends j$.util.stream.x5 {
    @Override // j$.util.stream.a
    public final boolean J() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.stream.x5, j$.util.stream.Stream
    public final void forEach(java.util.function.Consumer consumer) {
        if (this.a.l) {
            super.forEach(consumer);
        } else {
            M().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.x5, j$.util.stream.Stream
    public final void forEachOrdered(java.util.function.Consumer consumer) {
        if (this.a.l) {
            super.forEachOrdered(consumer);
        } else {
            M().forEachRemaining(consumer);
        }
    }
}
