package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adtq {
    private static final java.lang.String[] a = {"", "-journal", "-shm", "-wal"};
    private final defpackage.aoss b;
    private final defpackage.aduu c;
    private final defpackage.aeey d;
    private final defpackage.aiof e;
    private final java.lang.Object f;

    public adtq(defpackage.aoss aossVar, defpackage.aduu aduuVar, defpackage.aeey aeeyVar) {
        if (aossVar == null) {
            defpackage.aooh.i("backgroundScope");
        }
        if (aduuVar == null) {
            defpackage.aooh.i("gnpConfig");
        }
        if (aeeyVar == null) {
            defpackage.aooh.i("clientStreamz");
        }
        this.b = aossVar;
        this.c = aduuVar;
        this.d = aeeyVar;
        this.e = new defpackage.aiof(defpackage.aipl.d("GnpSdk"));
        this.f = new java.lang.Object();
    }

    public static final java.lang.String d(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        java.lang.String absolutePath = new java.io.File(context.getNoBackupFilesDir(), "databases").getAbsolutePath();
        defpackage.aooh.e(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0194 */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x023b, code lost:
    
        if (r9 == false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(android.content.Context r28, java.lang.String r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adtq.a(android.content.Context, java.lang.String, boolean):java.lang.String");
    }

    public final void b(java.io.File file, boolean z) {
        java.lang.String path = file.getPath();
        defpackage.aooh.e(path, "getPath(...)");
        for (java.lang.String str : z ? a : new java.lang.String[]{""}) {
            c(new java.io.File(java.lang.String.valueOf(path).concat(java.lang.String.valueOf(str))));
            c(new java.io.File(path + str + ".tmp"));
        }
    }

    public final void c(java.io.File file) {
        try {
            if (!file.exists() || file.delete()) {
                return;
            }
            ((defpackage.aiob) this.e.d()).y("Failed to delete file: %s", file);
        } catch (java.lang.SecurityException e) {
            ((defpackage.aiob) ((defpackage.aiob) this.e.d()).k(e)).y("Security exception while deleting file: %s", file);
        }
    }
}
