package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class p0 implements java.nio.file.attribute.UserDefinedFileAttributeView {
    public final /* synthetic */ j$.nio.file.attribute.q0 a;

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ void delete(java.lang.String str) throws java.io.IOException {
        ((j$.nio.file.attribute.o0) this.a).c(str);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.attribute.q0 q0Var = this.a;
        if (obj instanceof j$.nio.file.attribute.p0) {
            obj = ((j$.nio.file.attribute.p0) obj).a;
        }
        return q0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ java.util.List list() {
        return ((j$.nio.file.attribute.o0) this.a).d();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ java.lang.String name() {
        return ((j$.nio.file.attribute.o0) this.a).name();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int read(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        return ((j$.nio.file.attribute.o0) this.a).e(str, byteBuffer);
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int size(java.lang.String str) {
        return ((j$.nio.file.attribute.o0) this.a).f(str);
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int write(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        return ((j$.nio.file.attribute.o0) this.a).g(str, byteBuffer);
    }
}
