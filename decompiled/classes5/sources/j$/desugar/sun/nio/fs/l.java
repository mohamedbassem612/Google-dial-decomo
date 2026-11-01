package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class l implements java.util.Iterator {
    public final java.nio.file.DirectoryStream.Filter a;
    public final java.io.File[] b;
    public int c = 0;
    public final /* synthetic */ j$.desugar.sun.nio.fs.m d;

    public l(j$.desugar.sun.nio.fs.m mVar, j$.nio.file.Path path, java.nio.file.DirectoryStream.Filter filter) {
        this.d = mVar;
        java.io.File[] fileArrListFiles = path.toFile().listFiles();
        this.b = fileArrListFiles == null ? new java.io.File[0] : fileArrListFiles;
        this.a = filter;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j$.desugar.sun.nio.fs.o next() {
        j$.desugar.sun.nio.fs.o oVar;
        do {
            int i = this.c;
            java.io.File[] fileArr = this.b;
            if (i >= fileArr.length) {
                return null;
            }
            this.c = i + 1;
            oVar = new j$.desugar.sun.nio.fs.o(this.d.c, fileArr[i].getPath(), this.d.b, "/");
            try {
            } catch (java.io.IOException e) {
                throw new java.nio.file.DirectoryIteratorException(e);
            }
        } while (!this.a.mo0accept(oVar));
        return oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (next() == null) {
            return false;
        }
        this.c--;
        return true;
    }
}
