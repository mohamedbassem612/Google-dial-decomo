package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class v0 extends java.nio.file.attribute.UserPrincipalLookupService {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ j$.com.android.tools.r8.a a;

    public /* synthetic */ v0(j$.com.android.tools.r8.a aVar) {
        this.a = aVar;
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.com.android.tools.r8.a aVar = this.a;
        if (obj instanceof j$.nio.file.attribute.v0) {
            obj = ((j$.nio.file.attribute.v0) obj).a;
        }
        return aVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ java.nio.file.attribute.GroupPrincipal lookupPrincipalByGroupName(java.lang.String str) {
        return j$.nio.file.attribute.f0.a(this.a.z(str));
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ java.nio.file.attribute.UserPrincipal lookupPrincipalByName(java.lang.String str) {
        return j$.nio.file.attribute.s0.a(this.a.A(str));
    }
}
