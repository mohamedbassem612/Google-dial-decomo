package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abde extends defpackage.abcq {
    public abde() {
        super(defpackage.zvl.FILE_DELETION, 10L);
    }

    private static void c(java.io.File file, java.io.FilenameFilter filenameFilter) {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (java.io.File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    c(file2, filenameFilter);
                } else if (filenameFilter.accept(file, file2.getName()) && !file2.delete()) {
                    android.util.Log.w("FILE_DELETION", "Unable to delete file: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(file2))));
                }
            }
        }
    }

    @Override // defpackage.abcq
    public final defpackage.abcv a(defpackage.abcv abcvVar, ahyn ahynVar) {
        if (!ahynVar.f() || ((defpackage.zvz) ahynVar.b()).c != 1) {
            throw new java.lang.IllegalArgumentException();
        }
        android.content.Context context = abcvVar.b;
        defpackage.zvz zvzVar = (defpackage.zvz) ahynVar.b();
        defpackage.zvq zvqVar = zvzVar.c == 1 ? (defpackage.zvq) zvzVar.d : defpackage.zvq.a;
        int iW = a.W(zvqVar.b);
        if (iW == 0) {
            iW = 1;
        }
        int i = iW - 2;
        if (i == 1) {
            alat alatVar = zvqVar.c;
            java.io.File fileM = aa$.ExternalSyntheticApiModelOutline1.m(context);
            if (fileM == null) {
                throw new java.lang.IllegalStateException("Context missing dataDir");
            }
            c(fileM, new defpackage.abdd(fileM, alatVar));
        } else if (i == 2) {
            alat alatVar2 = zvqVar.c;
            java.io.File fileM2 = aa$.ExternalSyntheticApiModelOutline1.m(aa$.ExternalSyntheticApiModelOutline1.m(context));
            if (fileM2 == null) {
                throw new java.lang.IllegalStateException("Context missing dataDir");
            }
            c(fileM2, new defpackage.abdd(fileM2, alatVar2));
        } else {
            if (i != 3) {
                throw new java.lang.UnsupportedOperationException("This storage type does not supported");
            }
            alat alatVar3 = zvqVar.c;
            java.io.File externalFilesDir = context.getExternalFilesDir(null);
            c(externalFilesDir, new defpackage.abdd(externalFilesDir, alatVar3));
        }
        return abcvVar;
    }

    @Override // defpackage.abcq
    public final java.lang.String b() {
        return "FILE_DELETION";
    }
}
