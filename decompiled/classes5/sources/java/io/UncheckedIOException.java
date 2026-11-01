package java.io;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class UncheckedIOException extends java.lang.RuntimeException {
    public UncheckedIOException(java.lang.String str, java.io.IOException iOException) {
        super(str, (java.lang.Throwable) j$.util.Objects.requireNonNull(iOException));
    }

    @Override // java.lang.Throwable
    public java.io.IOException getCause() {
        return (java.io.IOException) super.getCause();
    }

    public UncheckedIOException(java.io.IOException iOException) {
        super((java.lang.Throwable) j$.util.Objects.requireNonNull(iOException));
    }
}
