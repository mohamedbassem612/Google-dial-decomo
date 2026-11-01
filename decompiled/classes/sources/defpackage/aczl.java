package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aczl implements defpackage.acyv {
    public final defpackage.acxa a;
    public final java.util.concurrent.Executor b;
    public final defpackage.afhf c;

    public aczl(defpackage.acxa acxaVar, defpackage.afhf afhfVar, java.util.concurrent.Executor executor) {
        this.a = acxaVar;
        this.c = afhfVar;
        this.b = executor;
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq a(acvu acvuVar) {
        int i = defpackage.adbe.a;
        acvu acvuVarAo = defpackage.afsq.ao(acvuVar, (defpackage.abrz.V() / 1000) + acvuVar.k);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(acvuVarAo);
        return m(arrayList);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq b() {
        return adcs.e(k()).g(new aczi(this, 3), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.ahyc acymVar = new acym(arrayList, 14);
        java.util.concurrent.Executor executor = this.b;
        return adcs.e(this.c.a(acymVar, executor)).f(new acym(arrayList, 15), executor);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.wym wymVar = new defpackage.wym(this, arrayList, 11, null);
        java.util.concurrent.Executor executor = this.b;
        return adcs.e(this.c.a(wymVar, executor)).f(new acym(arrayList, 11), executor);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq e() {
        return defpackage.ahvr.H(this.c.c(), new acyx(14), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq f() {
        return defpackage.ajcm.a;
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq g(acwb acwbVar) {
        return defpackage.ahvr.H(this.c.c(), new acym(defpackage.afsq.ak(acwbVar), 12), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq h(acwb acwbVar) {
        return defpackage.ahvr.H(this.c.c(), new acym(defpackage.afsq.ak(acwbVar), 9), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq i(acwb acwbVar) {
        defpackage.ahyc acymVar = new acym(defpackage.afsq.ak(acwbVar), 13);
        java.util.concurrent.Executor executor = this.b;
        return adcs.e(this.c.a(acymVar, executor)).f(new acyx(20), executor).b(java.io.IOException.class, new aczn(1), executor);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq j(java.util.List list) {
        defpackage.ahyc acymVar = new acym(list, 10);
        java.util.concurrent.Executor executor = this.b;
        return adcs.e(this.c.a(acymVar, executor)).f(new acyx(12), executor).b(java.io.IOException.class, new acyx(13), executor);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq k() {
        return this.c.a(new acyx(15), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq l(acwb acwbVar, acvu acvuVar) {
        defpackage.wym wymVar = new defpackage.wym(defpackage.afsq.ak(acwbVar), acvuVar, 12);
        java.util.concurrent.Executor executor = this.b;
        return adcs.e(this.c.a(wymVar, executor)).f(new acyx(17), executor).b(java.io.IOException.class, new acyx(18), executor);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq m(java.util.List list) {
        defpackage.ahyc acymVar = new acym(list, 8);
        java.util.concurrent.Executor executor = this.b;
        return adcs.e(this.c.a(acymVar, executor)).f(new acyx(16), executor).b(java.io.IOException.class, new acyx(19), executor);
    }
}
