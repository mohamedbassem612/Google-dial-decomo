package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hjg implements amzo {
    public final defpackage.him a;
    final amyz b;
    final amyz c;
    final amyz d;
    final amyz e;
    final amyz f;
    final amzg g;
    final amyz h;
    final amzg i;
    final amyz j;
    final amzg k;
    final amyz l;
    final amzg m;
    final amzg n;
    final amzg o;
    final amyz p;
    final amzg q;
    final amzg r;
    final amzg s;
    final amzg t;
    final amyz u;
    final amzg v;
    final amyz w;
    final amzg x;
    public final amzg y;
    private final defpackage.hjg z = this;

    public hjg(defpackage.him himVar, java.lang.String str, java.util.List list, alin alinVar, java.lang.Boolean bool) {
        this.a = himVar;
        amyz amyzVarC = amyu.c(himVar.r);
        this.b = amyzVarC;
        this.c = amyw.b(this);
        this.d = new defpackage.hjs(himVar, this, 1, 1);
        amyz amyzVarC2 = amyu.c(new defpackage.hjs(himVar, this, 0, 1));
        this.e = amyzVarC2;
        amyv amyvVarB = amyw.b(str);
        this.f = amyvVarB;
        amzg amzgVarC = amzs.c(amyvVarB);
        this.g = amzgVarC;
        amyv amyvVarB2 = amyw.b(bool);
        this.h = amyvVarB2;
        amzg amzgVarC2 = amzs.c(amyvVarB2);
        this.i = amzgVarC2;
        defpackage.hjs hjsVar = new defpackage.hjs(himVar, this, 2, 1);
        this.j = hjsVar;
        sva svaVar = new sva(amyzVarC, amyzVarC2, himVar.Py, amzgVarC, amzgVarC2, hjsVar);
        this.k = svaVar;
        defpackage.hjs hjsVar2 = new defpackage.hjs(himVar, this, 3, 1);
        this.l = hjsVar2;
        svd svdVar = new svd(amyzVarC, amyzVarC2, himVar.Py, svaVar, hjsVar2);
        this.m = svdVar;
        svc svcVar = new svc(amyzVarC, amyzVarC2, svdVar);
        this.n = svcVar;
        svb svbVar = new svb(amyzVarC, amyzVarC2, himVar.Py, himVar.cn);
        this.o = svbVar;
        amyw amywVar = alinVar == null ? amyw.a : new amyw(alinVar);
        this.p = amywVar;
        amzg amzgVarC3 = amzs.c(amywVar);
        this.q = amzgVarC3;
        svh svhVar = new svh(amyzVarC, amyzVarC2, himVar.Py, himVar.PF, amzgVarC, amzgVarC3, amzgVarC2, svcVar, svbVar, himVar.NF);
        this.r = svhVar;
        svg svgVar = new svg(amyzVarC, amyzVarC2, svhVar);
        this.s = svgVar;
        svf svfVar = new svf(amyzVarC, amyzVarC2, himVar.Py, svdVar, svcVar, svbVar, svgVar, amzgVarC2, himVar.a.eM, himVar.Tl);
        this.t = svfVar;
        amyv amyvVarB3 = amyw.b(list);
        this.u = amyvVarB3;
        amzg amzgVarC4 = amzs.c(amyvVarB3);
        this.v = amzgVarC4;
        defpackage.hjs hjsVar3 = new defpackage.hjs(himVar, this, 4, 1);
        this.w = hjsVar3;
        sve sveVar = new sve(amyzVarC, amyzVarC2, himVar.Py, svaVar, svfVar, amzgVarC4, amzgVarC2, svhVar, hjsVar3, himVar.Tl);
        this.x = sveVar;
        this.y = amzs.a(sveVar, this);
    }

    public final void a(boolean z) {
        amzs.d(this.x, z);
        amzs.d(this.v, z);
        amzs.d(this.t, z);
        amzs.d(this.s, z);
        amzs.d(this.r, z);
        amzs.d(this.q, z);
        amzs.d(this.o, z);
        amzs.d(this.n, z);
        amzs.d(this.m, z);
        amzs.d(this.k, z);
        amzs.d(this.i, z);
        amzs.d(this.g, z);
    }
}
