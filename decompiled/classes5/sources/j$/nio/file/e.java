package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class e extends j$.nio.file.f0 {
    public final /* synthetic */ java.nio.file.FileStore e;

    public e(java.nio.file.FileStore fileStore) {
        this.e = fileStore;
    }

    @Override // j$.nio.file.f0
    public final /* synthetic */ java.lang.Object a(java.lang.String str) {
        return this.e.getAttribute(str);
    }

    @Override // j$.nio.file.f0
    public final /* synthetic */ long b() {
        return this.e.getBlockSize();
    }

    @Override // j$.nio.file.f0
    public final /* synthetic */ j$.nio.file.attribute.c0 c(java.lang.Class cls) {
        java.nio.file.attribute.FileStoreAttributeView fileStoreAttributeView = this.e.getFileStoreAttributeView(cls);
        if (fileStoreAttributeView == null) {
            return null;
        }
        return fileStoreAttributeView instanceof j$.nio.file.attribute.b0 ? ((j$.nio.file.attribute.b0) fileStoreAttributeView).a : new j$.nio.file.attribute.a0(fileStoreAttributeView);
    }

    @Override // j$.nio.file.f0
    public final /* synthetic */ long d() {
        return this.e.getTotalSpace();
    }

    @Override // j$.nio.file.f0
    public final /* synthetic */ long e() {
        return this.e.getUnallocatedSpace();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.FileStore fileStore = this.e;
        if (obj instanceof j$.nio.file.e) {
            obj = ((j$.nio.file.e) obj).e;
        }
        return fileStore.equals(obj);
    }

    @Override // j$.nio.file.f0
    public final /* synthetic */ long f() {
        return this.e.getUsableSpace();
    }

    @Override // j$.nio.file.f0
    public final /* synthetic */ boolean g() {
        return this.e.isReadOnly();
    }

    public final /* synthetic */ int hashCode() {
        return this.e.hashCode();
    }

    @Override // j$.nio.file.f0
    public final /* synthetic */ java.lang.String n() {
        return this.e.name();
    }

    @Override // j$.nio.file.f0
    public final /* synthetic */ boolean o(java.lang.Class cls) {
        return this.e.supportsFileAttributeView(j$.nio.file.a.h(cls));
    }

    @Override // j$.nio.file.f0
    public final /* synthetic */ boolean p(java.lang.String str) {
        return this.e.supportsFileAttributeView(str);
    }

    @Override // j$.nio.file.f0
    public final /* synthetic */ java.lang.String q() {
        return this.e.type();
    }
}
