package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fyr {
    public final defpackage.ew a;
    public final aolr b;
    public int c;
    public final java.util.concurrent.atomic.AtomicReference d;
    public final gcf e;
    public final java.util.concurrent.atomic.AtomicInteger f;
    public final aoxh g;
    public final aoxh h;
    public final java.util.concurrent.atomic.AtomicReference i;
    public final java.util.concurrent.CopyOnWriteArrayList j;
    public final aonj k;
    public final aoir l;
    public final aozj m;
    public final xwr n;
    public final defpackage.kj o;
    private final aolr p;

    public fyr(defpackage.kj kjVar, defpackage.ew ewVar, aolr aolrVar, aolr aolrVar2) {
        aooh.f(aolrVar, "mainDispatcher");
        aooh.f(aolrVar2, "workerDispatcher");
        this.o = kjVar;
        this.a = ewVar;
        this.p = aolrVar;
        this.b = aolrVar2;
        this.m = aozk.a(java.lang.Boolean.FALSE);
        this.d = new java.util.concurrent.atomic.AtomicReference(null);
        defpackage.fyo fyoVar = new defpackage.fyo(this, aolrVar);
        this.e = fyoVar;
        this.f = new java.util.concurrent.atomic.AtomicInteger(0);
        aowy aowyVar = new aowy(new defpackage.apw(aoov.aD(new fzh(((gcf) fyoVar).h, 14), -1), (aoln) null, this, 10));
        aosp aospVar = aoth.a;
        this.g = aoov.aC(aowyVar, apcg.a);
        this.h = new aoyr(((gcf) fyoVar).i, (aoub) null);
        this.i = new java.util.concurrent.atomic.AtomicReference(null);
        this.j = new java.util.concurrent.CopyOnWriteArrayList();
        this.k = new defpackage.fxs(this, 4);
        this.l = aooc.ag(new defpackage.eli(5));
        this.n = new xwr(this, 1);
    }
}
