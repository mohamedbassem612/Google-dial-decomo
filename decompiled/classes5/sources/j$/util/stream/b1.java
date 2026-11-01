package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class b1 implements java.util.stream.Gatherer {
    public final /* synthetic */ j$.util.stream.c1 a;

    public /* synthetic */ b1(j$.util.stream.c1 c1Var) {
        this.a = c1Var;
    }

    public static /* synthetic */ java.util.stream.Gatherer a(j$.util.stream.c1 c1Var) {
        if (c1Var == null) {
            return null;
        }
        return c1Var instanceof j$.util.stream.a1 ? ((j$.util.stream.a1) c1Var).a : new j$.util.stream.b1(c1Var);
    }

    public final /* synthetic */ java.util.stream.Gatherer andThen(java.util.stream.Gatherer gatherer) {
        return a(((j$.util.stream.a1) this.a).a(j$.util.stream.a1.c(gatherer)));
    }

    public final /* synthetic */ java.util.function.BinaryOperator combiner() {
        return ((j$.util.stream.a1) this.a).b();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.stream.c1 c1Var = this.a;
        if (obj instanceof j$.util.stream.b1) {
            obj = ((j$.util.stream.b1) obj).a;
        }
        return c1Var.equals(obj);
    }

    public final /* synthetic */ java.util.function.BiConsumer finisher() {
        return ((j$.util.stream.a1) this.a).d();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    public final /* synthetic */ java.util.function.Supplier initializer() {
        return ((j$.util.stream.a1) this.a).e();
    }

    public final /* synthetic */ java.util.stream.Gatherer.Integrator integrator() {
        j$.util.stream.z0 z0VarF = ((j$.util.stream.a1) this.a).f();
        if (z0VarF == null) {
            return null;
        }
        return z0VarF instanceof j$.util.stream.x0 ? ((j$.util.stream.x0) z0VarF).a : new j$.util.stream.y0(z0VarF);
    }
}
