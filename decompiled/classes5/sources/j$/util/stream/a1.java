package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class a1 implements j$.util.stream.c1 {
    public final /* synthetic */ java.util.stream.Gatherer a;

    public /* synthetic */ a1(java.util.stream.Gatherer gatherer) {
        this.a = gatherer;
    }

    public static /* synthetic */ j$.util.stream.c1 c(java.util.stream.Gatherer gatherer) {
        if (gatherer == null) {
            return null;
        }
        return gatherer instanceof j$.util.stream.b1 ? ((j$.util.stream.b1) gatherer).a : new j$.util.stream.a1(gatherer);
    }

    public final /* synthetic */ j$.util.stream.c1 a(j$.util.stream.c1 c1Var) {
        return c(this.a.andThen(j$.util.stream.b1.a(c1Var)));
    }

    public final /* synthetic */ java.util.function.BinaryOperator b() {
        return this.a.combiner();
    }

    public final /* synthetic */ java.util.function.BiConsumer d() {
        return this.a.finisher();
    }

    public final /* synthetic */ java.util.function.Supplier e() {
        return this.a.initializer();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.stream.Gatherer gatherer = this.a;
        if (obj instanceof j$.util.stream.a1) {
            obj = ((j$.util.stream.a1) obj).a;
        }
        return gatherer.equals(obj);
    }

    public final /* synthetic */ j$.util.stream.z0 f() {
        java.util.stream.Gatherer.Integrator integrator = this.a.integrator();
        if (integrator == null) {
            return null;
        }
        return integrator instanceof j$.util.stream.y0 ? ((j$.util.stream.y0) integrator).a : new j$.util.stream.x0(integrator);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
