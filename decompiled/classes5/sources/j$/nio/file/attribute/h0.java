package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class h0 implements j$.nio.file.attribute.j0 {
    public final /* synthetic */ java.nio.file.attribute.PosixFileAttributeView a;

    public /* synthetic */ h0(java.nio.file.attribute.PosixFileAttributeView posixFileAttributeView) {
        this.a = posixFileAttributeView;
    }

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ void a(j$.nio.file.attribute.FileTime fileTime, j$.nio.file.attribute.FileTime fileTime2, j$.nio.file.attribute.FileTime fileTime3) throws java.io.IOException {
        this.a.setTimes(j$.nio.file.attribute.t.c(fileTime), j$.nio.file.attribute.t.c(fileTime2), j$.nio.file.attribute.t.c(fileTime3));
    }

    @Override // j$.nio.file.attribute.z
    public final /* synthetic */ void b(j$.nio.file.attribute.t0 t0Var) throws java.io.IOException {
        this.a.setOwner(j$.nio.file.attribute.s0.a(t0Var));
    }

    public final /* synthetic */ j$.nio.file.attribute.m0 c() throws java.io.IOException {
        java.nio.file.attribute.PosixFileAttributes attributes = this.a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return attributes instanceof j$.nio.file.attribute.l0 ? ((j$.nio.file.attribute.l0) attributes).a : new j$.nio.file.attribute.k0(attributes);
    }

    public final /* synthetic */ void d(j$.nio.file.attribute.g0 g0Var) throws java.io.IOException {
        this.a.setGroup(j$.nio.file.attribute.f0.a(g0Var));
    }

    public final /* synthetic */ void e(java.util.Set set) throws java.io.IOException {
        this.a.setPermissions(j$.nio.file.a.m(set));
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.PosixFileAttributeView posixFileAttributeView = this.a;
        if (obj instanceof j$.nio.file.attribute.h0) {
            obj = ((j$.nio.file.attribute.h0) obj).a;
        }
        return posixFileAttributeView.equals(obj);
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

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ j$.nio.file.attribute.BasicFileAttributes readAttributes() {
        return j$.nio.file.attribute.h.a(this.a.readAttributes());
    }
}
