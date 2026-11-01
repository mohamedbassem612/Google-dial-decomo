package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class y0 implements java.util.stream.Gatherer.Integrator {
    public final /* synthetic */ j$.util.stream.z0 a;

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.stream.z0 z0Var = this.a;
        if (obj instanceof j$.util.stream.y0) {
            obj = ((j$.util.stream.y0) obj).a;
        }
        return z0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    public final /* synthetic */ boolean integrate(java.lang.Object obj, java.lang.Object obj2, java.util.stream.Gatherer.Downstream downstream) {
        j$.util.stream.w0 u0Var;
        j$.util.stream.z0 z0Var = this.a;
        if (downstream == null) {
            u0Var = null;
        } else {
            u0Var = downstream instanceof j$.util.stream.v0 ? ((j$.util.stream.v0) downstream).a : new j$.util.stream.u0(downstream);
        }
        return ((j$.util.stream.x0) z0Var).a(obj, obj2, u0Var);
    }
}
