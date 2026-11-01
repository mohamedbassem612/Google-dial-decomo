package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class q implements java.nio.file.attribute.FileAttribute {
    public final /* synthetic */ j$.nio.file.attribute.FileAttribute a;

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.attribute.FileAttribute fileAttribute = this.a;
        if (obj instanceof j$.nio.file.attribute.q) {
            obj = ((j$.nio.file.attribute.q) obj).a;
        }
        return fileAttribute.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ java.lang.String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ java.lang.Object value() {
        return this.a.value();
    }
}
