package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class c0 implements j$.nio.file.PathMatcher {
    public final /* synthetic */ java.nio.file.PathMatcher a;

    public /* synthetic */ c0(java.nio.file.PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.PathMatcher pathMatcher = this.a;
        if (obj instanceof j$.nio.file.c0) {
            obj = ((j$.nio.file.c0) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(j$.nio.file.Path path) {
        return this.a.matches(j$.nio.file.x.h(path));
    }
}
