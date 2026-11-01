package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class x0 implements j$.util.stream.z0 {
    public final /* synthetic */ java.util.stream.Gatherer.Integrator a;

    public final /* synthetic */ boolean a(java.lang.Object obj, java.lang.Object obj2, j$.util.stream.w0 w0Var) {
        java.util.stream.Gatherer.Downstream v0Var;
        java.util.stream.Gatherer.Integrator integrator = this.a;
        if (w0Var == null) {
            v0Var = null;
        } else {
            v0Var = w0Var instanceof j$.util.stream.u0 ? ((j$.util.stream.u0) w0Var).a : new j$.util.stream.v0(w0Var);
        }
        return integrator.integrate(obj, obj2, v0Var);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.stream.Gatherer.Integrator integrator = this.a;
        if (obj instanceof j$.util.stream.x0) {
            obj = ((j$.util.stream.x0) obj).a;
        }
        return integrator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
