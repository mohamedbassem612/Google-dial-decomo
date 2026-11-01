package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ecn {
    public static final void a(java.io.File file, java.io.File file2) throws java.io.IOException {
        defpackage.aooh.f(file, "srcFile");
        defpackage.aooh.f(file2, "dstFile");
        j$.nio.file.Path path = j$.io.FileRetargetClass.toPath(file);
        j$.nio.file.Path path2 = j$.io.FileRetargetClass.toPath(file2);
        try {
            j$.nio.file.Files.move(path, path2, new j$.nio.file.CopyOption[]{j$.nio.file.StandardCopyOption.ATOMIC_MOVE, j$.nio.file.StandardCopyOption.REPLACE_EXISTING});
        } catch (java.nio.file.AtomicMoveNotSupportedException e) {
            defpackage.aooh.c(path);
            defpackage.aooh.c(path2);
            b(path, path2, e);
        } catch (java.nio.file.FileAlreadyExistsException e2) {
            defpackage.aooh.c(path);
            defpackage.aooh.c(path2);
            b(path, path2, e2);
        }
    }

    private static final void b(j$.nio.file.Path path, j$.nio.file.Path path2, java.lang.Throwable th) throws java.io.IOException {
        try {
            j$.nio.file.Files.move(path, path2, new j$.nio.file.CopyOption[]{j$.nio.file.StandardCopyOption.REPLACE_EXISTING});
        } catch (java.io.IOException e) {
            aoil.b(e, th);
            throw e;
        }
    }
}
