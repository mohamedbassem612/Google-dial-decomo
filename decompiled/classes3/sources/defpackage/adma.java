package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class adma implements defpackage.admc {
    @Override // defpackage.admc
    public final void a(java.io.File file, java.io.InputStream inputStream, java.util.zip.ZipEntry zipEntry, adhh adhhVar) throws java.io.IOException {
        java.io.File file2 = new java.io.File(file, admd.c(zipEntry));
        if (zipEntry.isDirectory()) {
            admd.d(file2);
            return;
        }
        java.io.File parentFile = file2.getParentFile();
        if (parentFile == null) {
            throw new java.io.IOException("Parent of entry is null");
        }
        admd.d(parentFile);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
        try {
            aisk.a(inputStream, fileOutputStream);
            fileOutputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                fileOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
