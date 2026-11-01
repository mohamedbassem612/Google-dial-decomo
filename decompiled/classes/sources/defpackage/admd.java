package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class admd implements defpackage.adhi {
    public final defpackage.aogc a;

    public admd(defpackage.ajct ajctVar) {
        this.a = new defpackage.aogc(ajctVar, "ZipUnpacker");
    }

    public static java.lang.String c(java.util.zip.ZipEntry zipEntry) throws java.io.IOException {
        java.lang.String strB = afcd.b(zipEntry);
        if (android.text.TextUtils.isEmpty(strB)) {
            throw new java.io.IOException("Cannot unzip file containing entry with empty name");
        }
        return strB;
    }

    static void d(java.io.File file) throws java.io.IOException {
        if (!file.isDirectory() && !file.mkdirs()) {
            throw new java.io.IOException("Cannot create directory ".concat(java.lang.String.valueOf(file.getAbsolutePath())));
        }
    }

    public static void e(java.io.InputStream inputStream, java.io.File file, admc admcVar, defpackage.adhh adhhVar, defpackage.ahyp ahypVar) throws java.io.IOException {
        java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(inputStream);
        while (true) {
            try {
                adhhVar.a();
                java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return;
                } else if (ahypVar.a(nextEntry)) {
                    try {
                        admcVar.a(file, new adlz(zipInputStream), nextEntry, adhhVar);
                        zipInputStream.closeEntry();
                    } catch (java.lang.Throwable th) {
                        zipInputStream.closeEntry();
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                try {
                    zipInputStream.close();
                } catch (java.lang.Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static final boolean f(java.lang.String str) {
        return "zip".equals(str) || "zip_zip".equals(str);
    }

    @Override // defpackage.adhp
    public final java.lang.String a() {
        return "ZipUnpacker";
    }

    @Override // defpackage.adhi
    public final defpackage.ajcq b(defpackage.adhw adhwVar) {
        defpackage.aiof aiofVar = defpackage.adhn.a;
        return this.a.ag(adhwVar);
    }
}
