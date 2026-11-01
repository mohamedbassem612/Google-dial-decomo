package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adhk {
    public static final defpackage.adhk a = new defpackage.adhk();

    public static final java.util.List d(java.io.File file) {
        java.io.File[] fileArr;
        if (file.isDirectory()) {
            java.io.File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).l("com/google/android/libraries/micore/superpacks/base/FileUtil", "listFiles", 151, "FileUtil.java")).y("Failed to list files for directory %s", file);
            }
            fileArr = fileArrListFiles;
        } else {
            ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).l("com/google/android/libraries/micore/superpacks/base/FileUtil", "listFiles", 145, "FileUtil.java")).y("isDirectory returned false while listing files for %s", file);
            fileArr = null;
        }
        return (fileArr == null || fileArr.length == 0) ? java.util.Collections.EMPTY_LIST : java.util.Arrays.asList(fileArr);
    }

    public final long a(java.io.File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        java.util.Iterator it = d(file).iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += a((java.io.File) it.next());
        }
        return jA;
    }

    public final boolean b(java.lang.String str, java.io.File file, defpackage.adme admeVar) {
        return c(str, file, defpackage.adig.a, admeVar);
    }

    final boolean c(java.lang.String str, java.io.File file, defpackage.adig adigVar, defpackage.adme admeVar) {
        defpackage.ainm ainmVar;
        boolean zC = true;
        if (file.exists()) {
            android.os.SystemClock.elapsedRealtime();
            if (file.isDirectory()) {
                java.util.Iterator it = d(file).iterator();
                while (it.hasNext()) {
                    zC &= c(str, (java.io.File) it.next(), adigVar, admeVar);
                }
            }
            java.lang.String strF = defpackage.adik.f(str, defpackage.adik.d(file));
            try {
                if (admeVar == defpackage.adme.DELETE_FETCHED) {
                    defpackage.aiof aiofVar = defpackage.adhn.a;
                    ainmVar = defpackage.aiod.b;
                } else {
                    ainmVar = (defpackage.aiob) defpackage.adhn.a.b();
                }
                ((defpackage.aiob) ainmVar.l("com/google/android/libraries/micore/superpacks/base/FileUtil", "deleteFile", 103, "FileUtil.java")).I("Deleting file %s, reason: %s", strF, admeVar);
                if (!file.delete()) {
                    ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).l("com/google/android/libraries/micore/superpacks/base/FileUtil", "deleteFile", 105, "FileUtil.java")).y("Failed to delete %s", strF);
                    zC = false;
                }
            } catch (java.lang.SecurityException e) {
                ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).k(e)).l("com/google/android/libraries/micore/superpacks/base/FileUtil", "deleteFile", 112, "FileUtil.java")).y("Security exception thrown when attempting deletion of %s", strF);
            }
            defpackage.adhl.a();
            android.os.SystemClock.elapsedRealtime();
        }
        return zC;
    }
}
