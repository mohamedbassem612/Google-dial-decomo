package java.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class DirectoryIteratorException extends java.util.ConcurrentModificationException {
    public DirectoryIteratorException(java.io.IOException iOException) {
        super((java.lang.Throwable) j$.util.Objects.requireNonNull(iOException));
    }

    @Override // java.lang.Throwable
    public java.io.IOException getCause() {
        return (java.io.IOException) super.getCause();
    }
}
