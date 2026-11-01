package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface Path extends java.lang.Comparable<j$.nio.file.Path>, java.lang.Iterable<j$.nio.file.Path>, j$.nio.file.x0 {

    /* JADX INFO: renamed from: j$.nio.file.Path$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
    public final /* synthetic */ class CC {
        public static j$.nio.file.Path of(java.lang.String str, java.lang.String... strArr) {
            return j$.nio.file.k.a.f(str, strArr);
        }
    }

    j$.nio.file.r0 e(j$.nio.file.u0 u0Var, j$.nio.file.i0[] i0VarArr, j$.nio.file.l0... l0VarArr);

    boolean endsWith(java.lang.String str);

    boolean equals(java.lang.Object obj);

    j$.nio.file.r0 f(j$.nio.file.u0 u0Var, j$.nio.file.i0... i0VarArr);

    j$.nio.file.Path getFileName();

    j$.nio.file.i getFileSystem();

    j$.nio.file.Path getName(int i);

    int getNameCount();

    j$.nio.file.Path getParent();

    j$.nio.file.Path getRoot();

    j$.nio.file.Path i(j$.nio.file.Path path);

    boolean isAbsolute();

    java.util.Iterator iterator();

    j$.nio.file.Path j(j$.nio.file.LinkOption... linkOptionArr);

    /* JADX INFO: renamed from: m */
    int compareTo(j$.nio.file.Path path);

    boolean n(j$.nio.file.Path path);

    j$.nio.file.Path normalize();

    boolean o(j$.nio.file.Path path);

    j$.nio.file.Path q(j$.nio.file.Path path);

    j$.nio.file.Path resolve(java.lang.String str);

    j$.nio.file.Path resolveSibling(java.lang.String str);

    boolean startsWith(java.lang.String str);

    j$.nio.file.Path subpath(int i, int i2);

    j$.nio.file.Path toAbsolutePath();

    java.io.File toFile();

    java.lang.String toString();

    java.net.URI toUri();

    j$.nio.file.Path v(j$.nio.file.Path path);
}
