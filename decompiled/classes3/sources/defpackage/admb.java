package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class admb implements defpackage.admc {
    private final defpackage.admc a;

    public admb(defpackage.admc admcVar) {
        this.a = admcVar;
    }

    @Override // defpackage.admc
    public final void a(java.io.File file, java.io.InputStream inputStream, java.util.zip.ZipEntry zipEntry, adhh adhhVar) {
        if (zipEntry.isDirectory()) {
            return;
        }
        admd.e(inputStream, new java.io.File(file, admd.c(zipEntry)), this.a, adhhVar, ahyr.a);
    }
}
