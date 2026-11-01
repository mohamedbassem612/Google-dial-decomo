package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class o0 implements j$.nio.file.attribute.q0 {
    public final /* synthetic */ java.nio.file.attribute.UserDefinedFileAttributeView a;

    public final /* synthetic */ void c(java.lang.String str) throws java.io.IOException {
        this.a.delete(str);
    }

    public final /* synthetic */ java.util.List d() {
        return this.a.list();
    }

    public final /* synthetic */ int e(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        return this.a.read(str, byteBuffer);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.UserDefinedFileAttributeView userDefinedFileAttributeView = this.a;
        if (obj instanceof j$.nio.file.attribute.o0) {
            obj = ((j$.nio.file.attribute.o0) obj).a;
        }
        return userDefinedFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int f(java.lang.String str) {
        return this.a.size(str);
    }

    public final /* synthetic */ int g(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        return this.a.write(str, byteBuffer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ java.lang.String name() {
        return this.a.name();
    }
}
