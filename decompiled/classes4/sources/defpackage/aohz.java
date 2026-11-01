package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class aohz extends defpackage.anof {
    @Override // defpackage.anof
    public final defpackage.anok b(defpackage.anoc anocVar) {
        return g().b(anocVar);
    }

    @Override // defpackage.anof
    public final anrc c() {
        return g().c();
    }

    @Override // defpackage.anof
    public final java.util.concurrent.ScheduledExecutorService d() {
        return g().d();
    }

    @Override // defpackage.anof
    public final void e() {
        g().e();
    }

    @Override // defpackage.anof
    public void f(anmm anmmVar, defpackage.anol anolVar) {
        throw null;
    }

    protected abstract defpackage.anof g();

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("delegate", g());
        return ahymVarL.toString();
    }
}
