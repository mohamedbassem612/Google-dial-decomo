package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class v0 implements j$.nio.file.x0 {
    public final /* synthetic */ java.nio.file.Watchable a;

    public /* synthetic */ v0(java.nio.file.Watchable watchable) {
        this.a = watchable;
    }

    @Override // j$.nio.file.x0
    public final /* synthetic */ j$.nio.file.r0 e(j$.nio.file.u0 u0Var, j$.nio.file.i0[] i0VarArr, j$.nio.file.l0[] l0VarArr) {
        return j$.nio.file.p0.b(this.a.register(j$.nio.file.t0.e(u0Var), j$.nio.file.f0.l(i0VarArr), j$.nio.file.f0.m(l0VarArr)));
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.Watchable watchable = this.a;
        if (obj instanceof j$.nio.file.v0) {
            obj = ((j$.nio.file.v0) obj).a;
        }
        return watchable.equals(obj);
    }

    @Override // j$.nio.file.x0
    public final /* synthetic */ j$.nio.file.r0 f(j$.nio.file.u0 u0Var, j$.nio.file.i0[] i0VarArr) {
        return j$.nio.file.p0.b(this.a.register(j$.nio.file.t0.e(u0Var), j$.nio.file.f0.l(i0VarArr)));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
