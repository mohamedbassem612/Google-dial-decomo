package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class aoib {
    public final java.lang.Object a;
    public final defpackage.anon b;
    public anmm c;
    public defpackage.anol d;
    final /* synthetic */ defpackage.aoid e;

    public aoib(defpackage.aoid aoidVar, java.lang.Object obj, anod anodVar) {
        j$.util.Objects.requireNonNull(aoidVar);
        this.e = aoidVar;
        this.d = new defpackage.anoe(defpackage.anoh.a);
        this.a = obj;
        this.b = anodVar.a(a());
        this.c = anmm.a;
    }

    protected defpackage.aoia a() {
        return new defpackage.aoia(this);
    }

    protected final void b() {
        this.b.d();
        this.c = anmm.e;
        defpackage.aoid.f.logp(java.util.logging.Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.a);
    }

    public final java.lang.String toString() {
        return "Address = " + java.lang.String.valueOf(this.a) + ", state = " + java.lang.String.valueOf(this.c) + ", picker type: " + java.lang.String.valueOf(this.d.getClass()) + ", lb: " + java.lang.String.valueOf(this.b);
    }
}
