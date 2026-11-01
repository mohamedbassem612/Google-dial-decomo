package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class q0 implements java.nio.file.WatchKey {
    public final /* synthetic */ j$.nio.file.r0 a;

    public /* synthetic */ q0(j$.nio.file.r0 r0Var) {
        this.a = r0Var;
    }

    public static /* synthetic */ java.nio.file.WatchKey a(j$.nio.file.r0 r0Var) {
        if (r0Var == null) {
            return null;
        }
        return r0Var instanceof j$.nio.file.p0 ? ((j$.nio.file.p0) r0Var).a : new j$.nio.file.q0(r0Var);
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ void cancel() {
        ((j$.nio.file.p0) this.a).a();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.r0 r0Var = this.a;
        if (obj instanceof j$.nio.file.q0) {
            obj = ((j$.nio.file.q0) obj).a;
        }
        return r0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean isValid() {
        return ((j$.nio.file.p0) this.a).c();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ java.util.List pollEvents() {
        return j$.nio.file.a.n(((j$.nio.file.p0) this.a).d());
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean reset() {
        return ((j$.nio.file.p0) this.a).e();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ java.nio.file.Watchable watchable() {
        j$.nio.file.x0 x0VarF = ((j$.nio.file.p0) this.a).f();
        if (x0VarF == null) {
            return null;
        }
        if (x0VarF instanceof j$.nio.file.v0) {
            return ((j$.nio.file.v0) x0VarF).a;
        }
        return x0VarF instanceof j$.nio.file.Path ? j$.nio.file.x.h((j$.nio.file.Path) x0VarF) : new j$.nio.file.w0(x0VarF);
    }
}
