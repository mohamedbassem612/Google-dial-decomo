package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class s0 implements java.nio.file.attribute.UserPrincipal {
    public final /* synthetic */ j$.nio.file.attribute.t0 a;

    public /* synthetic */ s0(j$.nio.file.attribute.t0 t0Var) {
        this.a = t0Var;
    }

    public static /* synthetic */ java.nio.file.attribute.UserPrincipal a(j$.nio.file.attribute.t0 t0Var) {
        if (t0Var == null) {
            return null;
        }
        if (t0Var instanceof j$.nio.file.attribute.r0) {
            return ((j$.nio.file.attribute.r0) t0Var).a;
        }
        return t0Var instanceof j$.nio.file.attribute.g0 ? j$.nio.file.attribute.f0.a((j$.nio.file.attribute.g0) t0Var) : new j$.nio.file.attribute.s0(t0Var);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.attribute.t0 t0Var = this.a;
        if (obj instanceof j$.nio.file.attribute.s0) {
            obj = ((j$.nio.file.attribute.s0) obj).a;
        }
        return t0Var.equals(obj);
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
