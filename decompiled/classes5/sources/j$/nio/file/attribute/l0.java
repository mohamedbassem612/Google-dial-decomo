package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class l0 implements java.nio.file.attribute.PosixFileAttributes {
    public final /* synthetic */ j$.nio.file.attribute.m0 a;

    public /* synthetic */ l0(j$.nio.file.attribute.m0 m0Var) {
        this.a = m0Var;
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime creationTime() {
        return j$.nio.file.attribute.t.c(((j$.nio.file.attribute.k0) this.a).creationTime());
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.attribute.m0 m0Var = this.a;
        if (obj instanceof j$.nio.file.attribute.l0) {
            obj = ((j$.nio.file.attribute.l0) obj).a;
        }
        return m0Var.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.lang.Object fileKey() {
        return ((j$.nio.file.attribute.k0) this.a).fileKey();
    }

    @Override // java.nio.file.attribute.PosixFileAttributes
    public final /* synthetic */ java.nio.file.attribute.GroupPrincipal group() {
        return j$.nio.file.attribute.f0.a(((j$.nio.file.attribute.k0) this.a).a());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return ((j$.nio.file.attribute.k0) this.a).isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return ((j$.nio.file.attribute.k0) this.a).isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return ((j$.nio.file.attribute.k0) this.a).isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return ((j$.nio.file.attribute.k0) this.a).isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime lastAccessTime() {
        return j$.nio.file.attribute.t.c(((j$.nio.file.attribute.k0) this.a).lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime lastModifiedTime() {
        return j$.nio.file.attribute.t.c(((j$.nio.file.attribute.k0) this.a).lastModifiedTime());
    }

    @Override // java.nio.file.attribute.PosixFileAttributes
    public final /* synthetic */ java.nio.file.attribute.UserPrincipal owner() {
        return j$.nio.file.attribute.s0.a(((j$.nio.file.attribute.k0) this.a).b());
    }

    @Override // java.nio.file.attribute.PosixFileAttributes
    public final /* synthetic */ java.util.Set permissions() {
        return j$.nio.file.a.m(((j$.nio.file.attribute.k0) this.a).c());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return ((j$.nio.file.attribute.k0) this.a).size();
    }
}
