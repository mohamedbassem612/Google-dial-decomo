package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class i0 implements java.nio.file.attribute.PosixFileAttributeView {
    public final /* synthetic */ j$.nio.file.attribute.j0 a;

    public /* synthetic */ i0(j$.nio.file.attribute.j0 j0Var) {
        this.a = j0Var;
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.attribute.j0 j0Var = this.a;
        if (obj instanceof j$.nio.file.attribute.i0) {
            obj = ((j$.nio.file.attribute.i0) obj).a;
        }
        return j0Var.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ java.nio.file.attribute.UserPrincipal getOwner() {
        return j$.nio.file.attribute.s0.a(((j$.nio.file.attribute.h0) this.a).getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView, java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ java.lang.String name() {
        return ((j$.nio.file.attribute.h0) this.a).name();
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ java.nio.file.attribute.PosixFileAttributes readAttributes() throws java.io.IOException {
        j$.nio.file.attribute.m0 m0VarC = ((j$.nio.file.attribute.h0) this.a).c();
        if (m0VarC == null) {
            return null;
        }
        return m0VarC instanceof j$.nio.file.attribute.k0 ? ((j$.nio.file.attribute.k0) m0VarC).a : new j$.nio.file.attribute.l0(m0VarC);
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView
    public final /* synthetic */ void setGroup(java.nio.file.attribute.GroupPrincipal groupPrincipal) throws java.io.IOException {
        ((j$.nio.file.attribute.h0) this.a).d(j$.nio.file.attribute.e0.a(groupPrincipal));
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(java.nio.file.attribute.UserPrincipal userPrincipal) throws java.io.IOException {
        ((j$.nio.file.attribute.h0) this.a).b(j$.nio.file.attribute.r0.a(userPrincipal));
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView
    public final /* synthetic */ void setPermissions(java.util.Set set) throws java.io.IOException {
        ((j$.nio.file.attribute.h0) this.a).e(j$.nio.file.a.m(set));
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(java.nio.file.attribute.FileTime fileTime, java.nio.file.attribute.FileTime fileTime2, java.nio.file.attribute.FileTime fileTime3) throws java.io.IOException {
        ((j$.nio.file.attribute.h0) this.a).a(j$.nio.file.attribute.t.b(fileTime), j$.nio.file.attribute.t.b(fileTime2), j$.nio.file.attribute.t.b(fileTime3));
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes readAttributes() {
        return j$.nio.file.attribute.i.a(((j$.nio.file.attribute.h0) this.a).readAttributes());
    }
}
