package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class h implements j$.nio.file.attribute.BasicFileAttributes {
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes a;

    public /* synthetic */ h(java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        this.a = basicFileAttributes;
    }

    public static /* synthetic */ j$.nio.file.attribute.BasicFileAttributes a(java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        j$.nio.file.attribute.BasicFileAttributes hVar;
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof j$.nio.file.attribute.i) {
            return ((j$.nio.file.attribute.i) basicFileAttributes).a;
        }
        if (basicFileAttributes instanceof java.nio.file.attribute.DosFileAttributes) {
            java.nio.file.attribute.DosFileAttributes dosFileAttributes = (java.nio.file.attribute.DosFileAttributes) basicFileAttributes;
            if (dosFileAttributes instanceof j$.nio.file.attribute.n) {
                return ((j$.nio.file.attribute.n) dosFileAttributes).a;
            }
            hVar = new j$.nio.file.attribute.m(dosFileAttributes);
        } else if (basicFileAttributes instanceof java.nio.file.attribute.PosixFileAttributes) {
            java.nio.file.attribute.PosixFileAttributes posixFileAttributes = (java.nio.file.attribute.PosixFileAttributes) basicFileAttributes;
            if (posixFileAttributes instanceof j$.nio.file.attribute.l0) {
                return ((j$.nio.file.attribute.l0) posixFileAttributes).a;
            }
            hVar = new j$.nio.file.attribute.k0(posixFileAttributes);
        } else {
            hVar = new j$.nio.file.attribute.h(basicFileAttributes);
        }
        return hVar;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ j$.nio.file.attribute.FileTime creationTime() {
        return j$.nio.file.attribute.t.b(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.BasicFileAttributes basicFileAttributes = this.a;
        if (obj instanceof j$.nio.file.attribute.h) {
            obj = ((j$.nio.file.attribute.h) obj).a;
        }
        return basicFileAttributes.equals(obj);
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
