package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class i implements java.nio.file.attribute.BasicFileAttributes {
    public final /* synthetic */ j$.nio.file.attribute.BasicFileAttributes a;

    public /* synthetic */ i(j$.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        this.a = basicFileAttributes;
    }

    public static /* synthetic */ java.nio.file.attribute.BasicFileAttributes a(j$.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        java.nio.file.attribute.BasicFileAttributes iVar;
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof j$.nio.file.attribute.h) {
            return ((j$.nio.file.attribute.h) basicFileAttributes).a;
        }
        if (basicFileAttributes instanceof j$.nio.file.attribute.o) {
            j$.nio.file.attribute.o oVar = (j$.nio.file.attribute.o) basicFileAttributes;
            if (oVar instanceof j$.nio.file.attribute.m) {
                return ((j$.nio.file.attribute.m) oVar).a;
            }
            iVar = new j$.nio.file.attribute.n(oVar);
        } else if (basicFileAttributes instanceof j$.nio.file.attribute.m0) {
            j$.nio.file.attribute.m0 m0Var = (j$.nio.file.attribute.m0) basicFileAttributes;
            if (m0Var instanceof j$.nio.file.attribute.k0) {
                return ((j$.nio.file.attribute.k0) m0Var).a;
            }
            iVar = new j$.nio.file.attribute.l0(m0Var);
        } else {
            iVar = new j$.nio.file.attribute.i(basicFileAttributes);
        }
        return iVar;
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime creationTime() {
        return j$.nio.file.attribute.t.c(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.attribute.BasicFileAttributes basicFileAttributes = this.a;
        if (obj instanceof j$.nio.file.attribute.i) {
            obj = ((j$.nio.file.attribute.i) obj).a;
        }
        return basicFileAttributes.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.lang.Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime lastAccessTime() {
        return j$.nio.file.attribute.t.c(this.a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime lastModifiedTime() {
        return j$.nio.file.attribute.t.c(this.a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
