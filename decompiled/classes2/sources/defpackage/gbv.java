package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class gbv extends kh {
    public final defpackage.fyr a;
    private boolean e;

    public gbv(defpackage.kj kjVar, aolr aolrVar, aolr aolrVar2) {
        aooh.f(aolrVar, "mainDispatcher");
        aooh.f(aolrVar2, "workerDispatcher");
        defpackage.fyr fyrVar = new defpackage.fyr(kjVar, new defpackage.ep(this), aolrVar, aolrVar2);
        this.a = fyrVar;
        super.t(3);
        u(new defpackage.gbt(this));
        defpackage.gbu gbuVar = new defpackage.gbu(this);
        if (fyrVar.i.get() == null) {
            aonj aonjVar = fyrVar.k;
            aooh.f(aonjVar, "listener");
            fyrVar.i.set(aonjVar);
            gcf gcfVar = fyrVar.e;
            aooh.f(aonjVar, "listener");
            aogc aogcVar = gcfVar.l;
            aooh.f(aonjVar, "listener");
            ((gdx) aogcVar.a).a(aonjVar);
            fzd fzdVar = (fzd) ((aozj) aogcVar.c).c();
            if (fzdVar != null) {
                aonjVar.a(fzdVar);
            }
        }
        fyrVar.j.add(gbuVar);
        aoxh aoxhVar = fyrVar.g;
        aoxh aoxhVar2 = fyrVar.h;
    }

    public static final void x(defpackage.gbv gbvVar) {
        if (((kh) gbvVar).d != 3 || gbvVar.e) {
            return;
        }
        gbvVar.e = true;
        super.t(1);
    }

    public final int a() {
        defpackage.fyr fyrVar = this.a;
        gcr gcrVar = (gcr) fyrVar.d.get();
        return gcrVar != null ? gcrVar.e() : fyrVar.e.d.e();
    }

    public final long c(int i) {
        return -1L;
    }

    public final java.lang.Object w(int i) {
        defpackage.fyr fyrVar = this.a;
        gcr gcrVar = (gcr) fyrVar.d.get();
        return gcrVar != null ? defpackage.hgu.Y(gcrVar, i) : fyrVar.e.d.h(i);
    }
}
