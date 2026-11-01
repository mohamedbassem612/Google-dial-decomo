package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class s0 implements j$.nio.file.u0 {
    public final /* synthetic */ java.nio.file.WatchService a;

    public /* synthetic */ s0(java.nio.file.WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ j$.nio.file.u0 e(java.nio.file.WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return watchService instanceof j$.nio.file.t0 ? ((j$.nio.file.t0) watchService).a : new j$.nio.file.s0(watchService);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.WatchService watchService = this.a;
        if (obj instanceof j$.nio.file.s0) {
            obj = ((j$.nio.file.s0) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ j$.nio.file.r0 f() {
        return j$.nio.file.p0.b(this.a.poll());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    public final /* synthetic */ j$.nio.file.r0 i(long j, java.util.concurrent.TimeUnit timeUnit) {
        return j$.nio.file.p0.b(this.a.poll(j, timeUnit));
    }

    public final /* synthetic */ j$.nio.file.r0 j() {
        return j$.nio.file.p0.b(this.a.take());
    }
}
