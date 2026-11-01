package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adku implements defpackage.adtk {
    private final java.io.File a;
    private final java.io.File b;
    private final defpackage.adqg c;

    public adku(java.io.File file, java.lang.String str, defpackage.adqg adqgVar) {
        this.c = adqgVar;
        this.a = file;
        this.b = new java.io.File(file, str);
    }

    @Override // defpackage.adtk
    public final long a() {
        return this.b.length();
    }

    @Override // defpackage.adtk
    public final void b(java.io.InputStream inputStream, long j, long j2) throws java.io.IOException {
        java.io.File file = this.a;
        if (!file.exists() && !file.mkdirs()) {
            throw new java.io.IOException("Error creating output directory");
        }
        java.io.File file2 = this.b;
        if (j > file2.length()) {
            throw new java.io.IOException("Given offsetBytes does not correspond with existing data: " + j + ", " + file2.length());
        }
        defpackage.apqb apqbVarAL = j > 0 ? defpackage.aoov.aL(new java.io.FileOutputStream(file2, true)) : defpackage.aoov.aL(new java.io.FileOutputStream(file2, false));
        defpackage.appx appxVar = new defpackage.appx(defpackage.aoov.aN(inputStream));
        defpackage.adqg adqgVar = this.c;
        defpackage.adkz adkzVar = (defpackage.adkz) adqgVar.a;
        java.lang.Object obj = adkzVar.a;
        com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) obj;
        defpackage.adhw adhwVarP = packManifest.p();
        com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameE = packManifest.e();
        long length = ((java.io.File) adkzVar.b).length();
        defpackage.adlb adlbVar = ((defpackage.adla) adkzVar.c).h;
        java.lang.Object obj2 = adqgVar.b;
        defpackage.adfq adkyVar = new adky(adhwVarP, (java.lang.String) obj2, versionedNameE, length, 1);
        defpackage.tvn tvnVar = adlbVar.d;
        tvnVar.P(adkyVar);
        try {
            defpackage.apoy apoyVar = new defpackage.apoy();
            long j3 = 0;
            while (!appxVar.B()) {
                java.lang.Object obj3 = obj2;
                appxVar.b(apoyVar, 8192L);
                long j4 = apoyVar.b;
                if (j4 > 0) {
                    apqbVarAL.fQ(apoyVar, j4);
                }
                j3 += j4;
                tvnVar.P(new adkx((com.google.android.libraries.micore.superpacks.common.PackManifest) obj, (java.lang.String) obj3, j + j3, j + j2));
                obj2 = obj3;
            }
            apqbVarAL.flush();
            file2.length();
            defpackage.aiof aiofVar = defpackage.adhn.a;
            file2.getAbsolutePath();
        } finally {
            try {
                apqbVarAL.close();
            } catch (java.io.IOException e) {
                ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.c()).k(e)).l("com/google/android/libraries/micore/superpacks/packs/DefaultResponseWriter", "writeResponse", 98, "DefaultResponseWriter.java")).v("Error closing download file");
            }
            try {
                appxVar.close();
            } catch (java.io.IOException e2) {
                ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.c()).k(e2)).l("com/google/android/libraries/micore/superpacks/packs/DefaultResponseWriter", "writeResponse", 103, "DefaultResponseWriter.java")).v("Error closing buffered source");
            }
        }
    }
}
