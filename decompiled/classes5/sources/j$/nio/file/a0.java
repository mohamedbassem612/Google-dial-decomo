package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class a0 implements java.lang.Iterable, j$.lang.a {
    public final java.lang.Iterable a;

    public a0(java.lang.Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable$EL.forEach(this.a, new j$.nio.file.y(consumer, (byte) 1));
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new j$.nio.file.b0(this.a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final j$.util.Spliterator spliterator() {
        return new j$.util.l1((java.util.Iterator) j$.util.Objects.requireNonNull(iterator()));
    }
}
