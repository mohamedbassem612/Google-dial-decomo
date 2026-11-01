package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface FileVisitor<T> {
    j$.nio.file.FileVisitResult postVisitDirectory(java.lang.Object obj, java.io.IOException iOException);

    j$.nio.file.FileVisitResult preVisitDirectory(java.lang.Object obj, j$.nio.file.attribute.BasicFileAttributes basicFileAttributes);

    j$.nio.file.FileVisitResult visitFile(java.lang.Object obj, j$.nio.file.attribute.BasicFileAttributes basicFileAttributes);

    j$.nio.file.FileVisitResult visitFileFailed(T t, java.io.IOException iOException);
}
