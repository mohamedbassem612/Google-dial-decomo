package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class j implements j$.nio.file.attribute.l {
    public final /* synthetic */ java.nio.file.attribute.DosFileAttributeView a;

    public /* synthetic */ j(java.nio.file.attribute.DosFileAttributeView dosFileAttributeView) {
        this.a = dosFileAttributeView;
    }

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ void a(j$.nio.file.attribute.FileTime fileTime, j$.nio.file.attribute.FileTime fileTime2, j$.nio.file.attribute.FileTime fileTime3) throws java.io.IOException {
        this.a.setTimes(j$.nio.file.attribute.t.c(fileTime), j$.nio.file.attribute.t.c(fileTime2), j$.nio.file.attribute.t.c(fileTime3));
    }

    public final /* synthetic */ j$.nio.file.attribute.o c() throws java.io.IOException {
        java.nio.file.attribute.DosFileAttributes attributes = this.a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return attributes instanceof j$.nio.file.attribute.n ? ((j$.nio.file.attribute.n) attributes).a : new j$.nio.file.attribute.m(attributes);
    }

    public final /* synthetic */ void d(boolean z) throws java.io.IOException {
        this.a.setArchive(z);
    }

    public final /* synthetic */ void e(boolean z) throws java.io.IOException {
        this.a.setHidden(z);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.DosFileAttributeView dosFileAttributeView = this.a;
        if (obj instanceof j$.nio.file.attribute.j) {
            obj = ((j$.nio.file.attribute.j) obj).a;
        }
        return dosFileAttributeView.equals(obj);
    }

    public final /* synthetic */ void f(boolean z) throws java.io.IOException {
        this.a.setReadOnly(z);
    }

    public final /* synthetic */ void g(boolean z) throws java.io.IOException {
        this.a.setSystem(z);
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
