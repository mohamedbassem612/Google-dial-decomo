package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class b implements j$.nio.file.attribute.g {
    public static final java.util.HashSet b;
    public final j$.nio.file.Path a;

    static {
        java.lang.String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        java.nio.charset.Charset charset = j$.desugar.sun.nio.fs.q.a;
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i = 0; i < 9; i++) {
            hashSet.add(strArr[i]);
        }
        b = hashSet;
    }

    public b(j$.nio.file.Path path) {
        this.a = path;
    }

    @Override // j$.nio.file.attribute.g
    public final void a(j$.nio.file.attribute.FileTime fileTime, j$.nio.file.attribute.FileTime fileTime2, j$.nio.file.attribute.FileTime fileTime3) {
        long jConvert;
        if (fileTime == null && fileTime2 == null) {
            return;
        }
        j$.nio.file.Path path = this.a;
        path.getFileSystem().v().a(path, j$.nio.file.b.WRITE);
        java.io.File file = path.toFile();
        fileTime.getClass();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        j$.util.Objects.requireNonNull(timeUnit, "unit");
        java.util.concurrent.TimeUnit timeUnit2 = fileTime.a;
        if (timeUnit2 != null) {
            jConvert = timeUnit.convert(fileTime.b, timeUnit2);
        } else {
            jConvert = timeUnit.convert(fileTime.c.getEpochSecond(), java.util.concurrent.TimeUnit.SECONDS);
            if (jConvert != Long.MIN_VALUE && jConvert != Long.MAX_VALUE) {
                long nano = ((long) fileTime.c.getNano()) / 1000000;
                long j = jConvert + nano;
                if (((jConvert ^ j) & (nano ^ j)) < 0) {
                    jConvert = jConvert < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
                } else {
                    jConvert = j;
                }
            }
        }
        if (!file.setLastModified(jConvert)) {
            throw new java.io.IOException("File.setLastModified did not succeed on ".concat(java.lang.String.valueOf(path)));
        }
    }

    @Override // j$.nio.file.attribute.d
    public final java.lang.String name() {
        return "basic";
    }

    @Override // j$.nio.file.attribute.g
    public final j$.nio.file.attribute.BasicFileAttributes readAttributes() {
        boolean z;
        j$.nio.file.Path path = this.a;
        path.getFileSystem().v().a(path, new j$.nio.file.b[0]);
        java.io.File file = path.toFile();
        long jLastModified = file.lastModified();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        j$.util.Objects.requireNonNull(timeUnit, "unit");
        j$.nio.file.attribute.FileTime fileTime = new j$.nio.file.attribute.FileTime(jLastModified, timeUnit, null);
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        try {
            java.io.File file2 = file.getParent() == null ? file : new java.io.File(file.getParentFile().getCanonicalFile(), file.getName());
            z = !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (java.io.IOException unused) {
            z = false;
        }
        return new j$.desugar.sun.nio.fs.c(fileTime, fileTime, fileTime, zIsFile, zIsDirectory, z, (zIsFile || zIsDirectory || z) ? false : true, file.length(), java.lang.Integer.valueOf(file.hashCode()));
    }
}
