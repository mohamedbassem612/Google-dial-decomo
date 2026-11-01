package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class w0 implements java.nio.file.Watchable {
    public final /* synthetic */ j$.nio.file.x0 a;

    public /* synthetic */ w0(j$.nio.file.x0 x0Var) {
        this.a = x0Var;
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.x0 x0Var = this.a;
        if (obj instanceof j$.nio.file.w0) {
            obj = ((j$.nio.file.w0) obj).a;
        }
        return x0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ java.nio.file.WatchKey register(java.nio.file.WatchService watchService, java.nio.file.WatchEvent.Kind[] kindArr, java.nio.file.WatchEvent.Modifier[] modifierArr) {
        return j$.nio.file.q0.a(this.a.e(j$.nio.file.s0.e(watchService), j$.nio.file.f0.i(kindArr), j$.nio.file.f0.j(modifierArr)));
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ java.nio.file.WatchKey register(java.nio.file.WatchService watchService, java.nio.file.WatchEvent.Kind[] kindArr) {
        return j$.nio.file.q0.a(this.a.f(j$.nio.file.s0.e(watchService), j$.nio.file.f0.i(kindArr)));
    }
}
