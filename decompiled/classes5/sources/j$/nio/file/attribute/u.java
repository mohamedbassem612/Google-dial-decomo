package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class u implements j$.nio.file.attribute.w {
    public final /* synthetic */ java.nio.file.attribute.FileAttributeView a;

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.FileAttributeView fileAttributeView = this.a;
        if (obj instanceof j$.nio.file.attribute.u) {
            obj = ((j$.nio.file.attribute.u) obj).a;
        }
        return fileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ java.lang.String name() {
        return this.a.name();
    }
}
