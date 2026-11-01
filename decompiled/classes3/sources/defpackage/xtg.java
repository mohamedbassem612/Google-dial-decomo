package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xtg {
    static final java.nio.charset.Charset a = java.nio.charset.Charset.forName("US-ASCII");

    static {
        java.nio.charset.Charset.forName("UTF-8");
    }

    static void a(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception unused) {
        }
    }

    static void b(java.io.File file) throws java.io.IOException {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new java.io.IOException("not a readable directory: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(file))));
        }
        for (java.io.File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                b(file2);
            }
            if (!file2.delete()) {
                throw new java.io.IOException("failed to delete file: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(file2))));
            }
        }
    }
}
