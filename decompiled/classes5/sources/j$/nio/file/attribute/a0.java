package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class a0 implements j$.nio.file.attribute.c0 {
    public final /* synthetic */ java.nio.file.attribute.FileStoreAttributeView a;

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.FileStoreAttributeView fileStoreAttributeView = this.a;
        if (obj instanceof j$.nio.file.attribute.a0) {
            obj = ((j$.nio.file.attribute.a0) obj).a;
        }
        return fileStoreAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ java.lang.String name() {
        return this.a.name();
    }
}
