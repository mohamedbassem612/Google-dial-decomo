package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class g extends j$.nio.file.i {
    public final /* synthetic */ java.nio.file.FileSystem a;

    public g(java.nio.file.FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ j$.nio.file.i F(java.nio.file.FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof j$.nio.file.h ? ((j$.nio.file.h) fileSystem).a : new j$.nio.file.g(fileSystem);
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ java.util.Set E() {
        return this.a.supportedFileAttributeViews();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws java.io.IOException {
        this.a.close();
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ java.lang.Iterable e() {
        return this.a.getFileStores();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.FileSystem fileSystem = this.a;
        if (obj instanceof j$.nio.file.g) {
            obj = ((j$.nio.file.g) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ j$.nio.file.Path f(java.lang.String str, java.lang.String[] strArr) {
        return j$.nio.file.w.h(this.a.getPath(str, strArr));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ j$.nio.file.PathMatcher i(java.lang.String str) {
        java.nio.file.PathMatcher pathMatcher = this.a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof j$.nio.file.d0 ? ((j$.nio.file.d0) pathMatcher).a : new j$.nio.file.c0(pathMatcher);
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // j$.nio.file.i
    public final java.lang.Iterable j() {
        return new j$.nio.file.a0(this.a.getRootDirectories());
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ java.lang.String m() {
        return this.a.getSeparator();
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ j$.com.android.tools.r8.a n() {
        java.nio.file.attribute.UserPrincipalLookupService userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return userPrincipalLookupService instanceof j$.nio.file.attribute.v0 ? ((j$.nio.file.attribute.v0) userPrincipalLookupService).a : new j$.nio.file.attribute.u0(userPrincipalLookupService);
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ boolean o() {
        return this.a.isReadOnly();
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ j$.nio.file.u0 q() {
        return j$.nio.file.s0.e(this.a.newWatchService());
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ j$.nio.file.spi.c v() {
        java.nio.file.spi.FileSystemProvider fileSystemProviderProvider = this.a.provider();
        int i = j$.nio.file.spi.a.c;
        if (fileSystemProviderProvider == null) {
            return null;
        }
        return fileSystemProviderProvider instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) fileSystemProviderProvider).a : new j$.nio.file.spi.a(fileSystemProviderProvider);
    }
}
