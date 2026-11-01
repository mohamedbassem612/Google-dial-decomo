package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aday implements afef {
    private final android.net.Uri a;

    public aday(android.net.Uri uri) {
        this.a = uri;
        j$.util.Objects.requireNonNull(this);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(ahbz ahbzVar) throws java.io.IOException {
        java.lang.Object obj = ahbzVar.a;
        try {
            affr affrVar = new affr();
            affrVar.b();
            java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(affrVar.c(ahbzVar));
            while (true) {
                try {
                    java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        zipInputStream.close();
                        return null;
                    }
                    android.net.Uri uriBuild = this.a.buildUpon().appendPath(defpackage.afcd.b(nextEntry)).build();
                    if (nextEntry.isDirectory()) {
                        ((aogc) obj).N(uriBuild);
                    } else {
                        java.io.OutputStream outputStream = (java.io.OutputStream) ((aogc) obj).M(uriBuild, new afft());
                        try {
                            aisk.a(zipInputStream, outputStream);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } catch (java.lang.Throwable th) {
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        zipInputStream.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
                ((aogc) obj).T(this.a);
                throw e;
            }
        } catch (java.io.IOException e) {
            ((aogc) obj).T(this.a);
            throw e;
        }
    }
}
