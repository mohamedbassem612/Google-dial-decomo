package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class x implements j$.nio.file.attribute.z {
    public final /* synthetic */ java.nio.file.attribute.FileOwnerAttributeView a;

    @Override // j$.nio.file.attribute.z
    public final /* synthetic */ void b(j$.nio.file.attribute.t0 t0Var) throws java.io.IOException {
        this.a.setOwner(j$.nio.file.attribute.s0.a(t0Var));
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.FileOwnerAttributeView fileOwnerAttributeView = this.a;
        if (obj instanceof j$.nio.file.attribute.x) {
            obj = ((j$.nio.file.attribute.x) obj).a;
        }
        return fileOwnerAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.z
    public final /* synthetic */ j$.nio.file.attribute.t0 getOwner() {
        return j$.nio.file.attribute.r0.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ java.lang.String name() {
        return this.a.name();
    }
}
