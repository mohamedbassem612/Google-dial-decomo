package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class f extends java.nio.file.FileStore {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ j$.nio.file.f0 a;

    public /* synthetic */ f(j$.nio.file.f0 f0Var) {
        this.a = f0Var;
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.f0 f0Var = this.a;
        if (obj instanceof j$.nio.file.f) {
            obj = ((j$.nio.file.f) obj).a;
        }
        return f0Var.equals(obj);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ java.lang.Object getAttribute(java.lang.String str) {
        return this.a.a(str);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getBlockSize() {
        return this.a.b();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ java.nio.file.attribute.FileStoreAttributeView getFileStoreAttributeView(java.lang.Class cls) {
        j$.nio.file.attribute.c0 c0VarC = this.a.c(cls);
        if (c0VarC == null) {
            return null;
        }
        return c0VarC instanceof j$.nio.file.attribute.a0 ? ((j$.nio.file.attribute.a0) c0VarC).a : new j$.nio.file.attribute.b0(c0VarC);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getTotalSpace() {
        return this.a.d();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUnallocatedSpace() {
        return this.a.e();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUsableSpace() {
        return this.a.f();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.g();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ java.lang.String name() {
        return this.a.n();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(java.lang.Class cls) {
        return this.a.o(j$.nio.file.a.h(cls));
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ java.lang.String type() {
        return this.a.q();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(java.lang.String str) {
        return this.a.p(str);
    }
}
