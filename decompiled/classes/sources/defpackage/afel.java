package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afel implements defpackage.affu {
    public final defpackage.afew a;

    public afel() {
        this(new defpackage.afew());
    }

    @Override // defpackage.affu
    public final long a(android.net.Uri uri) throws defpackage.afex {
        java.io.File fileAi = defpackage.agab.ai(uri);
        if (fileAi.isDirectory()) {
            return 0L;
        }
        return fileAi.length();
    }

    @Override // defpackage.affu
    public final defpackage.afew b() {
        return this.a;
    }

    @Override // defpackage.affu
    public final java.io.File c(android.net.Uri uri) {
        return defpackage.agab.ai(uri);
    }

    @Override // defpackage.affu
    public final java.io.InputStream d(android.net.Uri uri) throws defpackage.afex {
        java.io.File fileAi = defpackage.agab.ai(uri);
        return new defpackage.affb(new java.io.FileInputStream(fileAi), fileAi);
    }

    @Override // defpackage.affu
    public final java.io.OutputStream e(android.net.Uri uri) throws java.io.IOException {
        java.io.File fileAi = defpackage.agab.ai(uri);
        defpackage.aisq.b(fileAi);
        return new defpackage.affc(new java.io.FileOutputStream(fileAi, true), fileAi);
    }

    @Override // defpackage.affu
    public final java.io.OutputStream f(android.net.Uri uri) throws java.io.IOException {
        java.io.File fileAi = defpackage.agab.ai(uri);
        defpackage.aisq.b(fileAi);
        return new defpackage.affc(new java.io.FileOutputStream(fileAi), fileAi);
    }

    @Override // defpackage.affu
    public final java.lang.Iterable g(android.net.Uri uri) throws java.io.IOException {
        java.io.File fileAi = defpackage.agab.ai(uri);
        if (!fileAi.isDirectory()) {
            throw new java.io.FileNotFoundException(java.lang.String.format("%s is not a directory", uri));
        }
        java.io.File[] fileArrListFiles = fileAi.listFiles();
        if (fileArrListFiles == null) {
            throw new java.io.IOException(java.lang.String.format("Not a directory or I/O error (unexpected): %s", uri));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.io.File file : fileArrListFiles) {
            java.lang.String absolutePath = file.getAbsolutePath();
            if (file.isDirectory() && !absolutePath.endsWith("/")) {
                absolutePath = java.lang.String.valueOf(absolutePath).concat("/");
            }
            android.net.Uri.Builder builderPath = new android.net.Uri.Builder().scheme("file").authority("").path("/");
            defpackage.aift aiftVar = new defpackage.aift(4);
            builderPath.path(absolutePath);
            arrayList.add(defpackage.agab.aj(builderPath, aiftVar));
        }
        return arrayList;
    }

    @Override // defpackage.affu
    public final java.lang.String h() {
        return "file";
    }

    @Override // defpackage.affu
    public final void i(android.net.Uri uri) throws java.io.IOException {
        if (!defpackage.agab.ai(uri).mkdirs()) {
            throw new java.io.IOException(java.lang.String.format("%s could not be created", uri));
        }
    }

    @Override // defpackage.affu
    public final void j(android.net.Uri uri) throws java.io.IOException {
        java.io.File fileAi = defpackage.agab.ai(uri);
        if (!fileAi.isDirectory()) {
            throw new java.io.FileNotFoundException(java.lang.String.format("%s is not a directory", uri));
        }
        if (!fileAi.delete()) {
            throw new java.io.IOException(java.lang.String.format("%s could not be deleted", uri));
        }
    }

    @Override // defpackage.affu
    public final void k(android.net.Uri uri) throws java.io.IOException {
        java.io.File fileAi = defpackage.agab.ai(uri);
        if (fileAi.isDirectory()) {
            throw new java.io.FileNotFoundException(java.lang.String.format("%s is a directory", uri));
        }
        if (fileAi.delete()) {
            return;
        }
        if (!fileAi.exists()) {
            throw new java.io.FileNotFoundException(java.lang.String.format("%s does not exist", uri));
        }
        throw new java.io.IOException(java.lang.String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.affu
    public final void l(android.net.Uri uri, android.net.Uri uri2) throws java.io.IOException {
        java.io.File fileAi = defpackage.agab.ai(uri);
        java.io.File fileAi2 = defpackage.agab.ai(uri2);
        defpackage.aisq.b(fileAi2);
        if (!fileAi.renameTo(fileAi2)) {
            throw new java.io.IOException(java.lang.String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.affu
    public final boolean m(android.net.Uri uri) {
        return defpackage.agab.ai(uri).exists();
    }

    @Override // defpackage.affu
    public final boolean n(android.net.Uri uri) {
        return defpackage.agab.ai(uri).isDirectory();
    }

    public afel(defpackage.afew afewVar) {
        this.a = afewVar;
    }
}
