package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface BasicFileAttributes {
    j$.nio.file.attribute.FileTime creationTime();

    java.lang.Object fileKey();

    boolean isDirectory();

    boolean isOther();

    boolean isRegularFile();

    boolean isSymbolicLink();

    j$.nio.file.attribute.FileTime lastAccessTime();

    j$.nio.file.attribute.FileTime lastModifiedTime();

    long size();
}
