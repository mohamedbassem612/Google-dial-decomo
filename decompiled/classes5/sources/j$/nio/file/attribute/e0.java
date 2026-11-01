package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class e0 implements j$.nio.file.attribute.g0 {
    public final /* synthetic */ java.nio.file.attribute.GroupPrincipal a;

    public /* synthetic */ e0(java.nio.file.attribute.GroupPrincipal groupPrincipal) {
        this.a = groupPrincipal;
    }

    public static /* synthetic */ j$.nio.file.attribute.g0 a(java.nio.file.attribute.GroupPrincipal groupPrincipal) {
        if (groupPrincipal == null) {
            return null;
        }
        return groupPrincipal instanceof j$.nio.file.attribute.f0 ? ((j$.nio.file.attribute.f0) groupPrincipal).a : new j$.nio.file.attribute.e0(groupPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.GroupPrincipal groupPrincipal = this.a;
        if (obj instanceof j$.nio.file.attribute.e0) {
            obj = ((j$.nio.file.attribute.e0) obj).a;
        }
        return groupPrincipal.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ java.lang.String getName() {
        return this.a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(javax.security.auth.Subject subject) {
        return this.a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ java.lang.String toString() {
        return this.a.toString();
    }
}
