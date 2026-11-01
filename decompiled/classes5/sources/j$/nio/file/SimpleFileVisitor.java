package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class SimpleFileVisitor<T> implements j$.nio.file.FileVisitor<T> {
    @Override // j$.nio.file.FileVisitor
    public j$.nio.file.FileVisitResult postVisitDirectory(T t, java.io.IOException iOException) throws java.io.IOException {
        j$.util.Objects.requireNonNull(t);
        if (iOException == null) {
            return j$.nio.file.FileVisitResult.CONTINUE;
        }
        throw iOException;
    }

    @Override // j$.nio.file.FileVisitor
    public j$.nio.file.FileVisitResult preVisitDirectory(T t, j$.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        j$.util.Objects.requireNonNull(t);
        j$.util.Objects.requireNonNull(basicFileAttributes);
        return j$.nio.file.FileVisitResult.CONTINUE;
    }

    @Override // j$.nio.file.FileVisitor
    public j$.nio.file.FileVisitResult visitFile(T t, j$.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        j$.util.Objects.requireNonNull(t);
        j$.util.Objects.requireNonNull(basicFileAttributes);
        return j$.nio.file.FileVisitResult.CONTINUE;
    }

    @Override // j$.nio.file.FileVisitor
    public j$.nio.file.FileVisitResult visitFileFailed(T t, java.io.IOException iOException) throws java.io.IOException {
        j$.util.Objects.requireNonNull(t);
        throw iOException;
    }
}
