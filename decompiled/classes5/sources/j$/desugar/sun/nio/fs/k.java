package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class k implements java.nio.file.DirectoryStream {
    public j$.desugar.sun.nio.fs.l a;

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
