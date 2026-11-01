package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class f0 implements java.nio.file.attribute.GroupPrincipal {
    public final /* synthetic */ j$.nio.file.attribute.g0 a;

    public /* synthetic */ f0(j$.nio.file.attribute.g0 g0Var) {
        this.a = g0Var;
    }

    public static /* synthetic */ java.nio.file.attribute.GroupPrincipal a(j$.nio.file.attribute.g0 g0Var) {
        if (g0Var == null) {
            return null;
        }
        return g0Var instanceof j$.nio.file.attribute.e0 ? ((j$.nio.file.attribute.e0) g0Var).a : new j$.nio.file.attribute.f0(g0Var);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.attribute.g0 g0Var = this.a;
        if (obj instanceof j$.nio.file.attribute.f0) {
            obj = ((j$.nio.file.attribute.f0) obj).a;
        }
        return g0Var.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ java.lang.String getName() {
        return ((j$.nio.file.attribute.e0) this.a).getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(javax.security.auth.Subject subject) {
        return ((j$.nio.file.attribute.e0) this.a).implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ java.lang.String toString() {
        return ((j$.nio.file.attribute.e0) this.a).toString();
    }
}
