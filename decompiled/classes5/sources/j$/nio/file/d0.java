package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class d0 implements java.nio.file.PathMatcher {
    public final /* synthetic */ j$.nio.file.PathMatcher a;

    public /* synthetic */ d0(j$.nio.file.PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.PathMatcher pathMatcher = this.a;
        if (obj instanceof j$.nio.file.d0) {
            obj = ((j$.nio.file.d0) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(java.nio.file.Path path) {
        return this.a.matches(j$.nio.file.w.h(path));
    }
}
