package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class u0 extends j$.com.android.tools.r8.a {
    public final /* synthetic */ java.nio.file.attribute.UserPrincipalLookupService a;

    public u0(java.nio.file.attribute.UserPrincipalLookupService userPrincipalLookupService) {
        this.a = userPrincipalLookupService;
    }

    @Override // j$.com.android.tools.r8.a
    public final /* synthetic */ j$.nio.file.attribute.t0 A(java.lang.String str) {
        return j$.nio.file.attribute.r0.a(this.a.lookupPrincipalByName(str));
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.UserPrincipalLookupService userPrincipalLookupService = this.a;
        if (obj instanceof j$.nio.file.attribute.u0) {
            obj = ((j$.nio.file.attribute.u0) obj).a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.com.android.tools.r8.a
    public final /* synthetic */ j$.nio.file.attribute.g0 z(java.lang.String str) {
        return j$.nio.file.attribute.e0.a(this.a.lookupPrincipalByGroupName(str));
    }
}
