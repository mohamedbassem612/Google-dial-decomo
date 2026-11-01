package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class t0 implements java.nio.file.WatchService {
    public final /* synthetic */ j$.nio.file.u0 a;

    public /* synthetic */ t0(j$.nio.file.u0 u0Var) {
        this.a = u0Var;
    }

    public static /* synthetic */ java.nio.file.WatchService e(j$.nio.file.u0 u0Var) {
        if (u0Var == null) {
            return null;
        }
        return u0Var instanceof j$.nio.file.s0 ? ((j$.nio.file.s0) u0Var).a : new j$.nio.file.t0(u0Var);
    }

    @Override // java.nio.file.WatchService, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ((j$.nio.file.s0) this.a).close();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.u0 u0Var = this.a;
        if (obj instanceof j$.nio.file.t0) {
            obj = ((j$.nio.file.t0) obj).a;
        }
        return u0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ java.nio.file.WatchKey poll() {
        return j$.nio.file.q0.a(((j$.nio.file.s0) this.a).f());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ java.nio.file.WatchKey take() {
        return j$.nio.file.q0.a(((j$.nio.file.s0) this.a).j());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ java.nio.file.WatchKey poll(long j, java.util.concurrent.TimeUnit timeUnit) {
        return j$.nio.file.q0.a(((j$.nio.file.s0) this.a).i(j, timeUnit));
    }
}
