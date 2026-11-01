package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class b implements java.nio.file.attribute.AclFileAttributeView {
    public final /* synthetic */ j$.nio.file.attribute.c a;

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.attribute.c cVar = this.a;
        if (obj instanceof j$.nio.file.attribute.b) {
            obj = ((j$.nio.file.attribute.b) obj).a;
        }
        return cVar.equals(obj);
    }

    @Override // java.nio.file.attribute.AclFileAttributeView
    public final /* synthetic */ java.util.List getAcl() {
        return ((j$.nio.file.attribute.a) this.a).c();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ java.nio.file.attribute.UserPrincipal getOwner() {
        return j$.nio.file.attribute.s0.a(((j$.nio.file.attribute.a) this.a).getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AclFileAttributeView, java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ java.lang.String name() {
        return ((j$.nio.file.attribute.a) this.a).name();
    }

    @Override // java.nio.file.attribute.AclFileAttributeView
    public final /* synthetic */ void setAcl(java.util.List list) throws java.io.IOException {
        ((j$.nio.file.attribute.a) this.a).d(list);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(java.nio.file.attribute.UserPrincipal userPrincipal) throws java.io.IOException {
        ((j$.nio.file.attribute.a) this.a).b(j$.nio.file.attribute.r0.a(userPrincipal));
    }
}
