package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class h extends java.nio.file.FileSystem {
    public final /* synthetic */ j$.nio.file.i a;

    public /* synthetic */ h(j$.nio.file.i iVar) {
        this.a = iVar;
    }

    public static /* synthetic */ java.nio.file.FileSystem e(j$.nio.file.i iVar) {
        if (iVar == null) {
            return null;
        }
        return iVar instanceof j$.nio.file.g ? ((j$.nio.file.g) iVar).a : new j$.nio.file.h(iVar);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws java.io.IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.i iVar = this.a;
        if (obj instanceof j$.nio.file.h) {
            obj = ((j$.nio.file.h) obj).a;
        }
        return iVar.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.lang.Iterable getFileStores() {
        return this.a.e();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.Path getPath(java.lang.String str, java.lang.String[] strArr) {
        return j$.nio.file.x.h(this.a.f(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.PathMatcher getPathMatcher(java.lang.String str) {
        j$.nio.file.PathMatcher pathMatcherI = this.a.i(str);
        if (pathMatcherI == null) {
            return null;
        }
        return pathMatcherI instanceof j$.nio.file.c0 ? ((j$.nio.file.c0) pathMatcherI).a : new j$.nio.file.d0(pathMatcherI);
    }

    @Override // java.nio.file.FileSystem
    public final java.lang.Iterable getRootDirectories() {
        return new j$.nio.file.a0(this.a.j());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.lang.String getSeparator() {
        return this.a.m();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.attribute.UserPrincipalLookupService getUserPrincipalLookupService() {
        j$.com.android.tools.r8.a aVarN = this.a.n();
        int i = j$.nio.file.attribute.v0.b;
        if (aVarN == null) {
            return null;
        }
        return aVarN instanceof j$.nio.file.attribute.u0 ? ((j$.nio.file.attribute.u0) aVarN).a : new j$.nio.file.attribute.v0(aVarN);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.o();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.WatchService newWatchService() {
        return j$.nio.file.t0.e(this.a.q());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.spi.FileSystemProvider provider() {
        j$.nio.file.spi.c cVarV = this.a.v();
        int i = j$.nio.file.spi.b.b;
        if (cVarV == null) {
            return null;
        }
        return cVarV instanceof j$.nio.file.spi.a ? ((j$.nio.file.spi.a) cVarV).b : new j$.nio.file.spi.b(cVarV);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.util.Set supportedFileAttributeViews() {
        return this.a.E();
    }
}
