package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class f implements java.nio.file.attribute.BasicFileAttributeView {
    public final /* synthetic */ j$.nio.file.attribute.g a;

    public /* synthetic */ f(j$.nio.file.attribute.g gVar) {
        this.a = gVar;
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.attribute.g gVar = this.a;
        if (obj instanceof j$.nio.file.attribute.f) {
            obj = ((j$.nio.file.attribute.f) obj).a;
        }
        return gVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ java.lang.String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes readAttributes() {
        return j$.nio.file.attribute.i.a(this.a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(java.nio.file.attribute.FileTime fileTime, java.nio.file.attribute.FileTime fileTime2, java.nio.file.attribute.FileTime fileTime3) {
        this.a.a(j$.nio.file.attribute.t.b(fileTime), j$.nio.file.attribute.t.b(fileTime2), j$.nio.file.attribute.t.b(fileTime3));
    }
}
