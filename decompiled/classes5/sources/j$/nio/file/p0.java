package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class p0 implements j$.nio.file.r0 {
    public final /* synthetic */ java.nio.file.WatchKey a;

    public /* synthetic */ p0(java.nio.file.WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ j$.nio.file.r0 b(java.nio.file.WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return watchKey instanceof j$.nio.file.q0 ? ((j$.nio.file.q0) watchKey).a : new j$.nio.file.p0(watchKey);
    }

    public final /* synthetic */ void a() {
        this.a.cancel();
    }

    public final /* synthetic */ boolean c() {
        return this.a.isValid();
    }

    public final /* synthetic */ java.util.List d() {
        return j$.nio.file.a.n(this.a.pollEvents());
    }

    public final /* synthetic */ boolean e() {
        return this.a.reset();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.WatchKey watchKey = this.a;
        if (obj instanceof j$.nio.file.p0) {
            obj = ((j$.nio.file.p0) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ j$.nio.file.x0 f() {
        java.nio.file.Watchable watchable = this.a.watchable();
        if (watchable == null) {
            return null;
        }
        if (watchable instanceof j$.nio.file.w0) {
            return ((j$.nio.file.w0) watchable).a;
        }
        return watchable instanceof java.nio.file.Path ? j$.nio.file.w.h((java.nio.file.Path) watchable) : new j$.nio.file.v0(watchable);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
