package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aisq {
    public static final defpackage.aiql a = new defpackage.aiql(null);

    public static void a(java.io.File file, java.io.File file2) {
        defpackage.ahvr.bW(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        defpackage.aisp aispVar = new defpackage.aisp(file);
        defpackage.ahvr.ci(file2);
        defpackage.aihd aihdVarP = defpackage.aihd.p(new defpackage.aiso[0]);
        defpackage.aism aismVar = new defpackage.aism();
        try {
            java.io.FileInputStream fileInputStreamAp = aispVar.ap();
            aismVar.c(fileInputStreamAp);
            java.io.FileOutputStream fileOutputStreamI = defpackage.aiql.i(file2, aihdVarP);
            aismVar.c(fileOutputStreamI);
            defpackage.aisk.a(fileInputStreamAp, fileOutputStreamI);
            aismVar.close();
        } catch (java.lang.Throwable th) {
            try {
                throw aismVar.a(th);
            } catch (java.lang.Throwable th2) {
                aismVar.close();
                throw th2;
            }
        }
    }

    public static void b(java.io.File file) throws java.io.IOException {
        file.getClass();
        java.io.File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new java.io.IOException("Unable to create parent directories of ".concat(file.toString()));
            }
        }
    }
}
