package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class k0 implements j$.nio.file.attribute.m0 {
    public final /* synthetic */ java.nio.file.attribute.PosixFileAttributes a;

    public /* synthetic */ k0(java.nio.file.attribute.PosixFileAttributes posixFileAttributes) {
        this.a = posixFileAttributes;
    }

    public final /* synthetic */ j$.nio.file.attribute.g0 a() {
        return j$.nio.file.attribute.e0.a(this.a.group());
    }

    public final /* synthetic */ j$.nio.file.attribute.t0 b() {
        return j$.nio.file.attribute.r0.a(this.a.owner());
    }

    public final /* synthetic */ java.util.Set c() {
        return j$.nio.file.a.m(this.a.permissions());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ j$.nio.file.attribute.FileTime creationTime() {
        return j$.nio.file.attribute.t.b(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.PosixFileAttributes posixFileAttributes = this.a;
        if (obj instanceof j$.nio.file.attribute.k0) {
            obj = ((j$.nio.file.attribute.k0) obj).a;
        }
        return posixFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.lang.Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ j$.nio.file.attribute.FileTime lastAccessTime() {
        return j$.nio.file.attribute.t.b(this.a.lastAccessTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ j$.nio.file.attribute.FileTime lastModifiedTime() {
        return j$.nio.file.attribute.t.b(this.a.lastModifiedTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
