package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class r implements j$.nio.file.attribute.FileAttribute {
    public final /* synthetic */ java.nio.file.attribute.FileAttribute a;

    public r(java.nio.file.attribute.FileAttribute fileAttribute) {
        this.a = fileAttribute;
    }

    @Override // j$.nio.file.attribute.FileAttribute
    public final java.lang.String name() {
        return "posix:permissions";
    }

    @Override // j$.nio.file.attribute.FileAttribute
    public final java.lang.Object value() {
        return j$.util.DesugarCollections.unmodifiableSet(j$.nio.file.a.m((java.util.Set) this.a.value()));
    }
}
