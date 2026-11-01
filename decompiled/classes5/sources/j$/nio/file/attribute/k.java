package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class k implements java.nio.file.attribute.DosFileAttributeView {
    public final /* synthetic */ j$.nio.file.attribute.l a;

    public /* synthetic */ k(j$.nio.file.attribute.l lVar) {
        this.a = lVar;
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.attribute.l lVar = this.a;
        if (obj instanceof j$.nio.file.attribute.k) {
            obj = ((j$.nio.file.attribute.k) obj).a;
        }
        return lVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ java.lang.String name() {
        return ((j$.nio.file.attribute.j) this.a).name();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ java.nio.file.attribute.DosFileAttributes readAttributes() throws java.io.IOException {
        j$.nio.file.attribute.o oVarC = ((j$.nio.file.attribute.j) this.a).c();
        if (oVarC == null) {
            return null;
        }
        return oVarC instanceof j$.nio.file.attribute.m ? ((j$.nio.file.attribute.m) oVarC).a : new j$.nio.file.attribute.n(oVarC);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setArchive(boolean z) throws java.io.IOException {
        ((j$.nio.file.attribute.j) this.a).d(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setHidden(boolean z) throws java.io.IOException {
        ((j$.nio.file.attribute.j) this.a).e(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setReadOnly(boolean z) throws java.io.IOException {
        ((j$.nio.file.attribute.j) this.a).f(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setSystem(boolean z) throws java.io.IOException {
        ((j$.nio.file.attribute.j) this.a).g(z);
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(java.nio.file.attribute.FileTime fileTime, java.nio.file.attribute.FileTime fileTime2, java.nio.file.attribute.FileTime fileTime3) throws java.io.IOException {
        ((j$.nio.file.attribute.j) this.a).a(j$.nio.file.attribute.t.b(fileTime), j$.nio.file.attribute.t.b(fileTime2), j$.nio.file.attribute.t.b(fileTime3));
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes readAttributes() {
        return j$.nio.file.attribute.i.a(((j$.nio.file.attribute.j) this.a).readAttributes());
    }
}
