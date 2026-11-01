package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class e implements j$.nio.file.attribute.g {
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributeView a;

    public /* synthetic */ e(java.nio.file.attribute.BasicFileAttributeView basicFileAttributeView) {
        this.a = basicFileAttributeView;
    }

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ void a(j$.nio.file.attribute.FileTime fileTime, j$.nio.file.attribute.FileTime fileTime2, j$.nio.file.attribute.FileTime fileTime3) throws java.io.IOException {
        this.a.setTimes(j$.nio.file.attribute.t.c(fileTime), j$.nio.file.attribute.t.c(fileTime2), j$.nio.file.attribute.t.c(fileTime3));
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof j$.nio.file.attribute.e) {
            obj = ((j$.nio.file.attribute.e) obj).a;
        }
        return basicFileAttributeView.equals(obj);
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
