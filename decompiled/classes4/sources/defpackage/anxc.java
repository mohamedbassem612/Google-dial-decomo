package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
abstract class anxc implements defpackage.anvp {
    @Override // defpackage.anvp
    public final defpackage.anlw a() {
        throw null;
    }

    @Override // defpackage.anvp
    public final void b(defpackage.anxu anxuVar) {
        p().b(anxuVar);
    }

    @Override // defpackage.anvp
    public final void c(anqw anqwVar) {
        p().c(anqwVar);
    }

    @Override // defpackage.aodk
    public final void d() {
        p().d();
    }

    @Override // defpackage.anvp
    public final void e() {
        p().e();
    }

    @Override // defpackage.aodk
    public final void f() {
        p().f();
    }

    @Override // defpackage.aodk
    public final void g(int i) {
        p().g(i);
    }

    @Override // defpackage.aodk
    public final void h(anmj anmjVar) {
        p().h(anmjVar);
    }

    @Override // defpackage.anvp
    public final void i(anmw anmwVar) {
        p().i(anmwVar);
    }

    @Override // defpackage.anvp
    public final void j(anmy anmyVar) {
        p().j(anmyVar);
    }

    @Override // defpackage.anvp
    public final void k(int i) {
        p().k(i);
    }

    @Override // defpackage.anvp
    public final void l(int i) {
        p().l(i);
    }

    @Override // defpackage.anvp
    public void m(defpackage.anvr anvrVar) {
        throw null;
    }

    @Override // defpackage.aodk
    public final void n(java.io.InputStream inputStream) {
        p().n(inputStream);
    }

    @Override // defpackage.aodk
    public final boolean o() {
        return p().o();
    }

    protected abstract defpackage.anvp p();

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("delegate", p());
        return ahymVarL.toString();
    }
}
