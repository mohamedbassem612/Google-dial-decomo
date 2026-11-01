package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class z implements java.nio.file.DirectoryStream, j$.lang.a {
    public final java.nio.file.DirectoryStream a;

    public z(java.nio.file.DirectoryStream directoryStream) {
        this.a = directoryStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.a.close();
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable$EL.forEach(this.a, new j$.nio.file.y(consumer, (byte) 0));
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new j$.nio.file.b0(this.a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final j$.util.Spliterator spliterator() {
        return new j$.util.l1((java.util.Iterator) j$.util.Objects.requireNonNull(iterator()));
    }
}
